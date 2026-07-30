package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class t31 extends o31 {
    public final int m;
    public final int n;
    public boolean o;
    public int p;

    public t31(int i, int i2, int i3) {
        this.m = i3;
        this.n = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.o = z;
        this.p = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.o;
    }

    @Override // defpackage.o31
    public final int nextInt() {
        int i = this.p;
        if (i != this.n) {
            this.p = this.m + i;
            return i;
        }
        if (this.o) {
            this.o = false;
            return i;
        }
        b71.f();
        return 0;
    }
}
