package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wz2 extends vz2 {
    public final /* synthetic */ int p;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.p) {
            case 0:
                int i = this.o;
                this.o = i + 2;
                Object[] objArr = this.m;
                return new ai1(0, objArr[i], objArr[i + 1]);
            case 1:
                int i2 = this.o;
                this.o = i2 + 2;
                return this.m[i2];
            default:
                int i3 = this.o;
                this.o = i3 + 2;
                return this.m[i3 + 1];
        }
    }
}
