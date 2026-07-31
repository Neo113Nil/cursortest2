package androidx.compose.foundation;

import d2.g;
import m0.n;
import m0.s;
import p6.f;
import t.i0;
import v.j;
import y0.m;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i0 f480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f481e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f482f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p6.a f483g;

    public b(i0 i0Var, boolean z3, g gVar, p6.a aVar) {
        this.f480d = i0Var;
        this.f481e = z3;
        this.f482f = gVar;
        this.f483g = aVar;
    }

    @Override // p6.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        s sVar = (s) obj2;
        ((Number) obj3).intValue();
        sVar.V(-1525724089);
        Object K = sVar.K();
        if (K == n.f5019a) {
            K = new j();
            sVar.f0(K);
        }
        j jVar = (j) K;
        m d8 = c.a(y0.j.f8705a, jVar, this.f480d).d(new ClickableElement(jVar, null, false, this.f481e, this.f482f, this.f483g));
        sVar.p(false);
        return d8;
    }
}
