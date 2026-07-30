package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class zo2 implements yo2 {
    public final al m = new al(0);

    public final boolean f(int i) {
        return (this.m.get() & i) != 0;
    }

    public final void g(int i) {
        al alVar;
        int i2;
        do {
            alVar = this.m;
            i2 = alVar.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!alVar.compareAndSet(i2, i2 | i));
    }
}
