package androidx.emoji2.text;

import androidx.annotation.AnyThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@AnyThread
@RequiresApi
@RestrictTo
/* loaded from: classes14.dex */
class MetadataListReader {

    private interface OpenTypeReader {
        long getPosition();

        int readTag();

        long readUnsignedInt();

        int readUnsignedShort();

        void skip(int i);
    }

    static long toUnsignedInt(int i) {
        return i & 4294967295L;
    }

    static int toUnsignedShort(short s) {
        return s & 65535;
    }

    static MetadataList read(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) findOffsetInfo(new ByteBufferReader(duplicate)).getStartOffset());
        return MetadataList.getRootAsMetadataList(duplicate);
    }

    private static OffsetInfo findOffsetInfo(OpenTypeReader openTypeReader) {
        long j;
        openTypeReader.skip(4);
        int readUnsignedShort = openTypeReader.readUnsignedShort();
        if (readUnsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        openTypeReader.skip(6);
        int i = 0;
        while (true) {
            if (i >= readUnsignedShort) {
                j = -1;
                break;
            }
            int readTag = openTypeReader.readTag();
            openTypeReader.skip(4);
            j = openTypeReader.readUnsignedInt();
            openTypeReader.skip(4);
            if (1835365473 == readTag) {
                break;
            }
            i++;
        }
        if (j != -1) {
            openTypeReader.skip((int) (j - openTypeReader.getPosition()));
            openTypeReader.skip(12);
            long readUnsignedInt = openTypeReader.readUnsignedInt();
            for (int i2 = 0; i2 < readUnsignedInt; i2++) {
                int readTag2 = openTypeReader.readTag();
                long readUnsignedInt2 = openTypeReader.readUnsignedInt();
                long readUnsignedInt3 = openTypeReader.readUnsignedInt();
                if (1164798569 == readTag2 || 1701669481 == readTag2) {
                    return new OffsetInfo(readUnsignedInt2 + j, readUnsignedInt3);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    private static class OffsetInfo {
        private final long mLength;
        private final long mStartOffset;

        OffsetInfo(long j, long j2) {
            this.mStartOffset = j;
            this.mLength = j2;
        }

        long getStartOffset() {
            return this.mStartOffset;
        }
    }

    private static class InputStreamOpenTypeReader implements OpenTypeReader {
        private final byte[] mByteArray;
        private final ByteBuffer mByteBuffer;
        private final InputStream mInputStream;
        private long mPosition;

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public int readUnsignedShort() {
            this.mByteBuffer.position(0);
            read(2);
            return MetadataListReader.toUnsignedShort(this.mByteBuffer.getShort());
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public long readUnsignedInt() {
            this.mByteBuffer.position(0);
            read(4);
            return MetadataListReader.toUnsignedInt(this.mByteBuffer.getInt());
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public int readTag() {
            this.mByteBuffer.position(0);
            read(4);
            return this.mByteBuffer.getInt();
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public void skip(int i) {
            while (i > 0) {
                int skip = (int) this.mInputStream.skip(i);
                if (skip < 1) {
                    throw new IOException("Skip didn't move at least 1 byte forward");
                }
                i -= skip;
                this.mPosition += skip;
            }
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public long getPosition() {
            return this.mPosition;
        }

        private void read(int i) {
            if (this.mInputStream.read(this.mByteArray, 0, i) != i) {
                throw new IOException("read failed");
            }
            this.mPosition += i;
        }
    }

    private static class ByteBufferReader implements OpenTypeReader {
        private final ByteBuffer mByteBuffer;

        ByteBufferReader(ByteBuffer byteBuffer) {
            this.mByteBuffer = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public int readUnsignedShort() {
            return MetadataListReader.toUnsignedShort(this.mByteBuffer.getShort());
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public long readUnsignedInt() {
            return MetadataListReader.toUnsignedInt(this.mByteBuffer.getInt());
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public int readTag() {
            return this.mByteBuffer.getInt();
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public void skip(int i) {
            ByteBuffer byteBuffer = this.mByteBuffer;
            byteBuffer.position(byteBuffer.position() + i);
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public long getPosition() {
            return this.mByteBuffer.position();
        }
    }
}
