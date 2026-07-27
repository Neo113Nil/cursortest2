package g2;

import f1.C0607a;
import java.util.HashMap;
import o2.C0924c;

/* loaded from: classes.dex */
public final class k extends o2.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y.t f6720h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ HashMap f6721i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0607a f6722j;

    public k(y.t tVar, HashMap hashMap, C0607a c0607a) {
        super(22);
        this.f6720h = tVar;
        this.f6721i = hashMap;
        this.f6722j = c0607a;
    }

    @Override // o2.e
    public final void W(C0924c c0924c, o2.s sVar) {
        o2.s T3 = M1.a.T(sVar, this.f6720h.p(c0924c), this.f6721i);
        if (T3 != sVar) {
            e eVar = new e(c0924c.f8920d);
            C0607a c0607a = this.f6722j;
            c0607a.f6561e = ((o2.s) c0607a.f6561e).d(eVar, T3);
        }
    }
}
