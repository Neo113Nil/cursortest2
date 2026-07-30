package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zn2 extends o31 {
    public int m;
    public final /* synthetic */ yn2 n;

    public zn2(yn2 yn2Var) {
        this.n = yn2Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.m < this.n.f();
    }

    @Override // defpackage.o31
    public final int nextInt() {
        int i = this.m;
        this.m = i + 1;
        return this.n.d(i);
    }
}
