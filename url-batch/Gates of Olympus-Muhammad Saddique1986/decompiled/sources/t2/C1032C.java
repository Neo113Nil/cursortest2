package t2;

import q2.C0821h;

/* renamed from: t2.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1032C implements q2.G {

    /* renamed from: d, reason: collision with root package name */
    public final C1034E f8957d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8958e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f8959f;

    /* renamed from: g, reason: collision with root package name */
    public final C0821h f8960g;

    public C1032C(C1034E c1034e, long j3, Object obj, C0821h c0821h) {
        this.f8957d = c1034e;
        this.f8958e = j3;
        this.f8959f = obj;
        this.f8960g = c0821h;
    }

    @Override // q2.G
    public final void a() {
        C1034E c1034e = this.f8957d;
        synchronized (c1034e) {
            if (this.f8958e < c1034e.q()) {
                return;
            }
            Object[] objArr = c1034e.f8971k;
            f2.j.c(objArr);
            long j3 = this.f8958e;
            if (objArr[((int) j3) & (objArr.length - 1)] != this) {
                return;
            }
            AbstractC1035F.e(objArr, j3, AbstractC1035F.f8976a);
            c1034e.l();
        }
    }
}
