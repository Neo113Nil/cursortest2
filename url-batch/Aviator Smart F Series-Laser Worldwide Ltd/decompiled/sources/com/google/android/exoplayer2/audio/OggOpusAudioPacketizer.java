package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.baidu.mapapi.UIMsg;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public final class OggOpusAudioPacketizer {
    private static final int CHECKSUM_INDEX = 22;
    private static final int FIRST_AUDIO_SAMPLE_PAGE_SEQUENCE_NUMBER = 2;
    private static final int OGG_PACKET_HEADER_LENGTH = 28;
    private static final int SERIAL_NUMBER = 0;
    private static final byte[] OGG_DEFAULT_ID_HEADER_PAGE = {79, a4.a.f27d1, a4.a.f27d1, a4.a.P0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, a4.a.f76q1, a4.a.f70o1, 72, a4.a.f19b1, a4.a.X0, a4.a.f15a1, 1, 2, 56, 1, UnsignedBytes.MAX_POWER_OF_TWO, a4.a.f28d2, 0, 0, 0, 0, 0};
    private static final byte[] OGG_DEFAULT_COMMENT_HEADER_PAGE = {79, a4.a.f27d1, a4.a.f27d1, a4.a.P0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, a4.a.R0, a4.a.P0, 1, 16, 79, 112, a4.a.f76q1, a4.a.f70o1, a4.a.Q0, a4.a.X0, a4.a.f27d1, a4.a.f70o1, 0, 0, 0, 0, 0, 0, 0, 0};
    private ByteBuffer outputBuffer = AudioProcessor.EMPTY_BUFFER;
    private int granulePosition = 0;
    private int pageSequenceNumber = 2;

    private ByteBuffer packetizeInternal(ByteBuffer byteBuffer, @Nullable byte[] bArr) {
        int i8;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i9 = limit - position;
        int i10 = (i9 + 255) / 255;
        int i11 = i10 + 27 + i9;
        if (this.pageSequenceNumber == 2) {
            int length = bArr != null ? bArr.length + 28 : OGG_DEFAULT_ID_HEADER_PAGE.length;
            i11 += OGG_DEFAULT_COMMENT_HEADER_PAGE.length + length;
            i8 = length;
        } else {
            i8 = 0;
        }
        ByteBuffer replaceOutputBuffer = replaceOutputBuffer(i11);
        if (this.pageSequenceNumber == 2) {
            if (bArr != null) {
                writeOggIdHeaderPage(replaceOutputBuffer, bArr);
            } else {
                replaceOutputBuffer.put(OGG_DEFAULT_ID_HEADER_PAGE);
            }
            replaceOutputBuffer.put(OGG_DEFAULT_COMMENT_HEADER_PAGE);
        }
        int parsePacketAudioSampleCount = this.granulePosition + OpusUtil.parsePacketAudioSampleCount(byteBuffer);
        this.granulePosition = parsePacketAudioSampleCount;
        writeOggPacketHeader(replaceOutputBuffer, parsePacketAudioSampleCount, this.pageSequenceNumber, i10, false);
        for (int i12 = 0; i12 < i10; i12++) {
            if (i9 >= 255) {
                replaceOutputBuffer.put((byte) -1);
                i9 += UIMsg.m_AppUI.V_WM_ADDLISTUPDATE;
            } else {
                replaceOutputBuffer.put((byte) i9);
                i9 = 0;
            }
        }
        while (position < limit) {
            replaceOutputBuffer.put(byteBuffer.get(position));
            position++;
        }
        byteBuffer.position(byteBuffer.limit());
        replaceOutputBuffer.flip();
        if (this.pageSequenceNumber == 2) {
            byte[] array = replaceOutputBuffer.array();
            int arrayOffset = replaceOutputBuffer.arrayOffset() + i8;
            byte[] bArr2 = OGG_DEFAULT_COMMENT_HEADER_PAGE;
            replaceOutputBuffer.putInt(i8 + bArr2.length + 22, Util.crc32(array, arrayOffset + bArr2.length, replaceOutputBuffer.limit() - replaceOutputBuffer.position(), 0));
        } else {
            replaceOutputBuffer.putInt(22, Util.crc32(replaceOutputBuffer.array(), replaceOutputBuffer.arrayOffset(), replaceOutputBuffer.limit() - replaceOutputBuffer.position(), 0));
        }
        this.pageSequenceNumber++;
        return replaceOutputBuffer;
    }

    private ByteBuffer replaceOutputBuffer(int i8) {
        if (this.outputBuffer.capacity() < i8) {
            this.outputBuffer = ByteBuffer.allocate(i8).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.outputBuffer.clear();
        }
        return this.outputBuffer;
    }

    private void writeOggIdHeaderPage(ByteBuffer byteBuffer, byte[] bArr) {
        writeOggPacketHeader(byteBuffer, 0L, 0, 1, true);
        byteBuffer.put(UnsignedBytes.checkedCast(bArr.length));
        byteBuffer.put(bArr);
        byteBuffer.putInt(22, Util.crc32(byteBuffer.array(), byteBuffer.arrayOffset(), bArr.length + 28, 0));
        byteBuffer.position(bArr.length + 28);
    }

    private void writeOggPacketHeader(ByteBuffer byteBuffer, long j8, int i8, int i9, boolean z7) {
        byteBuffer.put((byte) 79);
        byteBuffer.put(a4.a.f27d1);
        byteBuffer.put(a4.a.f27d1);
        byteBuffer.put(a4.a.P0);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z7 ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j8);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i8);
        byteBuffer.putInt(0);
        byteBuffer.put(UnsignedBytes.checkedCast(i9));
    }

    public void packetize(DecoderInputBuffer decoderInputBuffer, List<byte[]> list) {
        Assertions.checkNotNull(decoderInputBuffer.data);
        if (decoderInputBuffer.data.limit() - decoderInputBuffer.data.position() == 0) {
            return;
        }
        this.outputBuffer = packetizeInternal(decoderInputBuffer.data, (this.pageSequenceNumber == 2 && (list.size() == 1 || list.size() == 3)) ? list.get(0) : null);
        decoderInputBuffer.clear();
        decoderInputBuffer.ensureSpaceForWrite(this.outputBuffer.remaining());
        decoderInputBuffer.data.put(this.outputBuffer);
        decoderInputBuffer.flip();
    }

    public void reset() {
        this.outputBuffer = AudioProcessor.EMPTY_BUFFER;
        this.granulePosition = 0;
        this.pageSequenceNumber = 2;
    }
}
