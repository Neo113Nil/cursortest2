package defpackage;

import java.io.Closeable;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class qv1 implements Closeable {
    public static final pv1 Companion = new pv1();
    public static final ov1 rtx2ld2ELZv4;

    static {
        ah ahVar = ah.dgRBjINgWbAK;
        ahVar.getClass();
        yf yfVar = new yf();
        yfVar.nLZGh9p8gVSu(ahVar);
        rtx2ld2ELZv4 = new ov1(ahVar.rtx2ld2ELZv4.length, yfVar);
    }

    public abstract ig OPXfSBeufaJ8();

    public abstract q51 a92UlCVFR9N8();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        kv2.PxuCJdSBwIXG(OPXfSBeufaJ8());
    }

    public abstract long lS5Rgt96tfkO();
}
