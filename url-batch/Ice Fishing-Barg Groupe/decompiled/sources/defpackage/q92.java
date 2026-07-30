package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class q92 implements p92 {
    public final bb rtx2ld2ELZv4 = new bb(0);

    public final void RAsUl2FVSrh6(int i) {
        bb bbVar;
        int i2;
        do {
            bbVar = this.rtx2ld2ELZv4;
            i2 = bbVar.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!bbVar.compareAndSet(i2, i2 | i));
    }

    public final boolean a92UlCVFR9N8(int i) {
        return (this.rtx2ld2ELZv4.get() & i) != 0;
    }
}
