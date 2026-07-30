package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class vp0 implements o82 {
    public final yj2 OPXfSBeufaJ8;
    public final InputStream rtx2ld2ELZv4;

    public vp0(InputStream inputStream, yj2 yj2Var) {
        this.rtx2ld2ELZv4 = inputStream;
        this.OPXfSBeufaJ8 = yj2Var;
    }

    @Override // defpackage.o82
    public final long RAsUl2FVSrh6(long j, yf yfVar) {
        try {
            this.OPXfSBeufaJ8.a92UlCVFR9N8();
            z12 kpCQ9veP6n3I = yfVar.kpCQ9veP6n3I(1);
            int read = this.rtx2ld2ELZv4.read(kpCQ9veP6n3I.PxuCJdSBwIXG, kpCQ9veP6n3I.TSizfFm2Yiuu, (int) Math.min(8192L, 8192 - kpCQ9veP6n3I.TSizfFm2Yiuu));
            if (read != -1) {
                kpCQ9veP6n3I.TSizfFm2Yiuu += read;
                long j2 = read;
                yfVar.OPXfSBeufaJ8 += j2;
                return j2;
            }
            if (kpCQ9veP6n3I.lS5Rgt96tfkO != kpCQ9veP6n3I.TSizfFm2Yiuu) {
                return -1L;
            }
            yfVar.rtx2ld2ELZv4 = kpCQ9veP6n3I.PxuCJdSBwIXG();
            d22.PxuCJdSBwIXG(kpCQ9veP6n3I);
            return -1L;
        } catch (AssertionError e) {
            if (jv2.PxuCJdSBwIXG(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // defpackage.o82
    public final yj2 TSizfFm2Yiuu() {
        return this.OPXfSBeufaJ8;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.rtx2ld2ELZv4.close();
    }

    public final String toString() {
        return "source(" + this.rtx2ld2ELZv4 + ')';
    }
}
