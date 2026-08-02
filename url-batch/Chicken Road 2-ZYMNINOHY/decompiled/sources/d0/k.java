package d0;

import r0.AbstractC1391b;

/* loaded from: classes.dex */
public final class k extends AbstractC1391b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8167d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Object f8168e;

    public k(p0.b bVar, int i4) {
        super(i4, bVar.f14684k - 1);
        this.f8168e = bVar;
    }

    @Override // r0.n
    public final long c() {
        switch (this.f8167d) {
            case 0:
                a();
                return ((j) this.f8168e).e(this.f15118c);
            default:
                a();
                p0.b bVar = (p0.b) this.f8168e;
                return bVar.o[(int) this.f15118c];
        }
    }

    @Override // r0.n
    public final long e() {
        switch (this.f8167d) {
            case 0:
                a();
                return ((j) this.f8168e).d(this.f15118c);
            default:
                return ((p0.b) this.f8168e).b((int) this.f15118c) + c();
        }
    }

    public k(j jVar, long j4, long j5) {
        super(j4, j5);
        this.f8168e = jVar;
    }
}
