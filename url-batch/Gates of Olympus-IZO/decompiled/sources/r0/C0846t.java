package r0;

import java.util.List;

/* renamed from: r0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0846t extends t0.B {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f7174a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y1.e f7175b;

    public C0846t(w wVar, Y1.e eVar) {
        this.f7174a = wVar;
        this.f7175b = eVar;
    }

    @Override // r0.InterfaceC0827A
    public final B f(t0.O o3, List list, long j3) {
        w wVar = this.f7174a;
        M0.j layoutDirection = o3.getLayoutDirection();
        r rVar = wVar.f7185k;
        rVar.f7165d = layoutDirection;
        rVar.f7166e = o3.a();
        rVar.f7167f = o3.p();
        boolean B = o3.B();
        Y1.e eVar = this.f7175b;
        if (B || wVar.f7178d.f7718f == null) {
            wVar.f7181g = 0;
            B b2 = (B) eVar.g(rVar, new M0.a(j3));
            return new C0845s(b2, wVar, wVar.f7181g, b2, 1);
        }
        wVar.f7182h = 0;
        B b3 = (B) eVar.g(wVar.f7186l, new M0.a(j3));
        return new C0845s(b3, wVar, wVar.f7182h, b3, 0);
    }
}
