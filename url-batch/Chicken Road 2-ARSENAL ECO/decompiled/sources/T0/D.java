package T0;

import U0.InterfaceC0211b;
import java.util.Set;

/* loaded from: classes.dex */
public final class D implements InterfaceC0211b {

    /* renamed from: a, reason: collision with root package name */
    public final S0.a f2236a;

    /* renamed from: b, reason: collision with root package name */
    public final C0166a f2237b;

    /* renamed from: c, reason: collision with root package name */
    public U0.f f2238c = null;

    /* renamed from: d, reason: collision with root package name */
    public Set f2239d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2240e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0169d f2241f;

    public D(C0169d c0169d, S0.a aVar, C0166a c0166a) {
        this.f2241f = c0169d;
        this.f2236a = aVar;
        this.f2237b = c0166a;
    }

    @Override // U0.InterfaceC0211b
    public final void a(R0.a aVar) {
        this.f2241f.f2293m.post(new A.a(this, aVar, 7, false));
    }

    public final void b(R0.a aVar) {
        B b7 = (B) this.f2241f.f2290j.get(this.f2237b);
        if (b7 != null) {
            U0.t.b(b7.f2233o.f2293m);
            S0.a aVar2 = b7.f2223e;
            String name = aVar2.getClass().getName();
            String valueOf = String.valueOf(aVar);
            StringBuilder sb = new StringBuilder(name.length() + 25 + valueOf.length());
            sb.append("onSignInFailed for ");
            sb.append(name);
            sb.append(" with ");
            sb.append(valueOf);
            aVar2.d(sb.toString());
            b7.l(aVar, null);
        }
    }
}
