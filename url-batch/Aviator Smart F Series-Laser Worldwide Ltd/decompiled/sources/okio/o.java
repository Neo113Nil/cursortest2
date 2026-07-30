package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes5.dex */
public final class o implements x0 {
    private final CRC32 crc;
    private final Inflater inflater;
    private final r inflaterSource;
    private byte section;
    private final s0 source;

    public o(x0 source) {
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        s0 s0Var = new s0(source);
        this.source = s0Var;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new r((e) s0Var, inflater);
        this.crc = new CRC32();
    }

    private final void checkEqual(String str, int i8, int i9) {
        if (i9 == i8) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i9), Integer.valueOf(i8)}, 3));
        kotlin.jvm.internal.s.checkNotNullExpressionValue(format, "java.lang.String.format(this, *args)");
        throw new IOException(format);
    }

    private final void consumeHeader() {
        this.source.require(10L);
        byte b8 = this.source.bufferField.getByte(3L);
        boolean z7 = ((b8 >> 1) & 1) == 1;
        if (z7) {
            updateCrc(this.source.bufferField, 0L, 10L);
        }
        checkEqual("ID1ID2", 8075, this.source.readShort());
        this.source.skip(8L);
        if (((b8 >> 2) & 1) == 1) {
            this.source.require(2L);
            if (z7) {
                updateCrc(this.source.bufferField, 0L, 2L);
            }
            long readShortLe = this.source.bufferField.readShortLe();
            this.source.require(readShortLe);
            if (z7) {
                updateCrc(this.source.bufferField, 0L, readShortLe);
            }
            this.source.skip(readShortLe);
        }
        if (((b8 >> 3) & 1) == 1) {
            long indexOf = this.source.indexOf((byte) 0);
            if (indexOf == -1) {
                throw new EOFException();
            }
            if (z7) {
                updateCrc(this.source.bufferField, 0L, indexOf + 1);
            }
            this.source.skip(indexOf + 1);
        }
        if (((b8 >> 4) & 1) == 1) {
            long indexOf2 = this.source.indexOf((byte) 0);
            if (indexOf2 == -1) {
                throw new EOFException();
            }
            if (z7) {
                updateCrc(this.source.bufferField, 0L, indexOf2 + 1);
            }
            this.source.skip(indexOf2 + 1);
        }
        if (z7) {
            checkEqual("FHCRC", this.source.readShortLe(), (short) this.crc.getValue());
            this.crc.reset();
        }
    }

    private final void consumeTrailer() {
        checkEqual("CRC", this.source.readIntLe(), (int) this.crc.getValue());
        checkEqual("ISIZE", this.source.readIntLe(), (int) this.inflater.getBytesWritten());
    }

    private final void updateCrc(c cVar, long j8, long j9) {
        t0 t0Var = cVar.head;
        kotlin.jvm.internal.s.checkNotNull(t0Var);
        while (true) {
            int i8 = t0Var.limit;
            int i9 = t0Var.pos;
            if (j8 < i8 - i9) {
                break;
            }
            j8 -= i8 - i9;
            t0Var = t0Var.next;
            kotlin.jvm.internal.s.checkNotNull(t0Var);
        }
        while (j9 > 0) {
            int min = (int) Math.min(t0Var.limit - r7, j9);
            this.crc.update(t0Var.data, (int) (t0Var.pos + j8), min);
            j9 -= min;
            t0Var = t0Var.next;
            kotlin.jvm.internal.s.checkNotNull(t0Var);
            j8 = 0;
        }
    }

    @Override // okio.x0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.inflaterSource.close();
    }

    @Override // okio.x0
    public long read(c sink, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
        if (!(j8 >= 0)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.s.stringPlus("byteCount < 0: ", Long.valueOf(j8)).toString());
        }
        if (j8 == 0) {
            return 0L;
        }
        if (this.section == 0) {
            consumeHeader();
            this.section = (byte) 1;
        }
        if (this.section == 1) {
            long size = sink.size();
            long read = this.inflaterSource.read(sink, j8);
            if (read != -1) {
                updateCrc(sink, size, read);
                return read;
            }
            this.section = (byte) 2;
        }
        if (this.section == 2) {
            consumeTrailer();
            this.section = (byte) 3;
            if (!this.source.exhausted()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // okio.x0
    public y0 timeout() {
        return this.source.timeout();
    }
}
