package k2;

/* renamed from: k2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0535g implements Y1.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5359e;

    public /* synthetic */ C0535g(int i3, Object obj) {
        this.f5358d = i3;
        this.f5359e = obj;
    }

    @Override // Y1.f
    public final Object f(Object obj, Object obj2, Object obj3) {
        Throwable th = (Throwable) obj;
        switch (this.f5358d) {
            case 0:
                ((H1.o) this.f5359e).j(th);
                break;
            default:
                ((s2.g) this.f5359e).b();
                break;
        }
        return L1.z.f2729a;
    }
}
