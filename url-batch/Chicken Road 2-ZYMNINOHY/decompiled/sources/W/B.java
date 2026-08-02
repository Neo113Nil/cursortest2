package W;

import T.Q;
import a0.C0130F;
import a0.SurfaceHolderCallbackC0125A;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final C0130F f3242a;

    /* renamed from: b, reason: collision with root package name */
    public final w f3243b;

    /* renamed from: c, reason: collision with root package name */
    public final SurfaceHolderCallbackC0125A f3244c;

    /* renamed from: d, reason: collision with root package name */
    public final D f3245d;

    /* renamed from: e, reason: collision with root package name */
    public final Q f3246e = new Q();

    /* renamed from: f, reason: collision with root package name */
    public final F f3247f;

    /* renamed from: g, reason: collision with root package name */
    public final x f3248g;

    /* renamed from: h, reason: collision with root package name */
    public final y f3249h;

    /* renamed from: i, reason: collision with root package name */
    public final z f3250i;

    /* renamed from: j, reason: collision with root package name */
    public final A f3251j;

    public B(C0130F c0130f, SurfaceHolderCallbackC0125A surfaceHolderCallbackC0125A, D d4, int i4, int i5, int i6, int i7) {
        this.f3242a = c0130f;
        this.f3244c = surfaceHolderCallbackC0125A;
        this.f3245d = d4;
        this.f3247f = d4.a(c0130f.f3898u, new C0116i(1, this));
        this.f3248g = new x(this, i4);
        this.f3249h = new y(this, i5);
        this.f3250i = new z(this, i6);
        this.f3251j = new A(this, i7);
        w wVar = new w(this);
        this.f3243b = wVar;
        c0130f.n.a(wVar);
    }
}
