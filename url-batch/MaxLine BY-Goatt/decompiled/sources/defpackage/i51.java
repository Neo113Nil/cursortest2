package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class i51 extends g23 {
    public boolean m;
    public final /* synthetic */ Object n;

    public i51(Object obj) {
        this.n = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.m;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.m) {
            b71.f();
            return null;
        }
        this.m = true;
        return this.n;
    }
}
