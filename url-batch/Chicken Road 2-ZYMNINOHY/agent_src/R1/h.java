package R1;

import T.L;
import T.M;
import W.InterfaceC0118k;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements T1.b, InterfaceC0118k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2346a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2347b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2348c;

    public /* synthetic */ h(m mVar, L1.j jVar, int i4) {
        this.f2347b = mVar;
        this.f2348c = jVar;
        this.f2346a = i4;
    }

    @Override // T1.b
    public Object c() {
        m mVar = (m) this.f2347b;
        mVar.f2365d.a((L1.j) this.f2348c, this.f2346a + 1, false);
        return null;
    }

    @Override // W.InterfaceC0118k
    public void invoke(Object obj) {
        M m4 = (M) this.f2347b;
        M m5 = (M) this.f2348c;
        L l4 = (L) obj;
        int i4 = this.f2346a;
        l4.onPositionDiscontinuity(i4);
        l4.onPositionDiscontinuity(m4, m5, i4);
    }

    public /* synthetic */ h(M m4, M m5, int i4) {
        this.f2346a = i4;
        this.f2347b = m4;
        this.f2348c = m5;
    }
}
