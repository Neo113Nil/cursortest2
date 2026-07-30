package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class rj1 extends pj1 {
    public final z h;

    public rj1(z zVar) {
        this.h = zVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.g;
        this.g = i + 2;
        Object[] objArr = this.d;
        return new kn0(this.h, objArr[i], objArr[i + 1]);
    }
}
