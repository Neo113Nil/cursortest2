package q2;

import e2.InterfaceC0427f;

/* renamed from: q2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0820g implements InterfaceC0427f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7897d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7898e;

    public /* synthetic */ C0820g(int i3, Object obj) {
        this.f7897d = i3;
        this.f7898e = obj;
    }

    @Override // e2.InterfaceC0427f
    public final Object g(Object obj, Object obj2, Object obj3) {
        Throwable th = (Throwable) obj;
        switch (this.f7897d) {
            case 0:
                ((O1.t) this.f7898e).n(th);
                break;
            default:
                ((y2.g) this.f7898e).b();
                break;
        }
        return R1.y.f4171a;
    }
}
