package okio;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.text.StringsKt;
import kotlin.time.DurationKt;
import org.bouncycastle.crypto.hpke.HPKE;

/* loaded from: classes3.dex */
public final class GzipSource implements Source {
    public final CRC32 crc;
    public final Inflater inflater;
    public final InflaterSource inflaterSource;
    public byte section;
    public final RealBufferedSource source;

    public GzipSource(BufferedSource bufferedSource) {
        bufferedSource.getClass();
        RealBufferedSource realBufferedSource = new RealBufferedSource(bufferedSource);
        this.source = realBufferedSource;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new InflaterSource(realBufferedSource, inflater);
        this.crc = new CRC32();
    }

    public static void checkEqual(int i, int i2, String str) {
        if (i2 == i) {
            return;
        }
        StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(str, ": actual 0x");
        m108m.append(StringsKt.padStart(8, DurationKt.toHexString(i2)));
        m108m.append(" != expected 0x");
        m108m.append(StringsKt.padStart(8, DurationKt.toHexString(i)));
        throw new IOException(m108m.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.inflaterSource.close();
    }

    @Override // okio.Source
    public final long read(Buffer buffer, long j) {
        GzipSource gzipSource = this;
        buffer.getClass();
        if (j < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m(j, "byteCount < 0: "));
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        byte b = gzipSource.section;
        CRC32 crc32 = gzipSource.crc;
        RealBufferedSource realBufferedSource = gzipSource.source;
        if (b == 0) {
            realBufferedSource.require(10L);
            Buffer buffer2 = realBufferedSource.bufferField;
            byte b2 = buffer2.getByte(3L);
            boolean z = ((b2 >> 1) & 1) == 1;
            if (z) {
                gzipSource.updateCrc(buffer2, 0L, 10L);
            }
            checkEqual(8075, realBufferedSource.readShort(), "ID1ID2");
            realBufferedSource.skip(8L);
            if (((b2 >> 2) & 1) == 1) {
                realBufferedSource.require(2L);
                if (z) {
                    updateCrc(buffer2, 0L, 2L);
                }
                long readShortLe = buffer2.readShortLe() & HPKE.aead_EXPORT_ONLY;
                realBufferedSource.require(readShortLe);
                if (z) {
                    updateCrc(buffer2, 0L, readShortLe);
                }
                realBufferedSource.skip(readShortLe);
            }
            if (((b2 >> 3) & 1) == 1) {
                long indexOf = realBufferedSource.indexOf((byte) 0, 0L, Long.MAX_VALUE);
                if (indexOf == -1) {
                    Path$$ExternalSyntheticBUOutline0.m$1();
                    return 0L;
                }
                if (z) {
                    updateCrc(buffer2, 0L, indexOf + 1);
                }
                realBufferedSource.skip(indexOf + 1);
            }
            if (((b2 >> 4) & 1) == 1) {
                long indexOf2 = realBufferedSource.indexOf((byte) 0, 0L, Long.MAX_VALUE);
                if (indexOf2 == -1) {
                    Path$$ExternalSyntheticBUOutline0.m$1();
                    return 0L;
                }
                if (z) {
                    gzipSource = this;
                    gzipSource.updateCrc(buffer2, 0L, indexOf2 + 1);
                } else {
                    gzipSource = this;
                }
                realBufferedSource.skip(indexOf2 + 1);
            } else {
                gzipSource = this;
            }
            if (z) {
                checkEqual(realBufferedSource.readShortLe(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            gzipSource.section = (byte) 1;
        }
        if (gzipSource.section == 1) {
            long j2 = buffer.size;
            long read = gzipSource.inflaterSource.read(buffer, j);
            if (read != -1) {
                gzipSource.updateCrc(buffer, j2, read);
                return read;
            }
            gzipSource.section = (byte) 2;
        }
        if (gzipSource.section == 2) {
            checkEqual(realBufferedSource.readIntLe(), (int) crc32.getValue(), "CRC");
            checkEqual(realBufferedSource.readIntLe(), (int) gzipSource.inflater.getBytesWritten(), "ISIZE");
            gzipSource.section = (byte) 3;
            if (!realBufferedSource.exhausted()) {
                a$$ExternalSyntheticBUOutline0.m$4("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    @Override // okio.Source
    public final Timeout timeout() {
        return this.source.source.timeout();
    }

    public final void updateCrc(Buffer buffer, long j, long j2) {
        Segment segment = buffer.head;
        segment.getClass();
        while (true) {
            int i = segment.limit;
            int i2 = segment.pos;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            segment = segment.next;
            segment.getClass();
        }
        while (j2 > 0) {
            int min = (int) Math.min(segment.limit - r6, j2);
            this.crc.update(segment.data, (int) (segment.pos + j), min);
            j2 -= min;
            segment = segment.next;
            segment.getClass();
            j = 0;
        }
    }
}
