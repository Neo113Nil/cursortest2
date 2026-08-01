package androidx.activity;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c0 extends u2.d implements t2.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f87f;
    public final /* synthetic */ h0 g;

    public /* synthetic */ c0(h0 h0Var, int i4) {
        this.f87f = i4;
        this.g = h0Var;
    }

    @Override // t2.a
    public final Object a() {
        switch (this.f87f) {
            case 0:
                this.g.c();
                break;
            case 1:
                this.g.b();
                break;
            default:
                this.g.c();
                break;
        }
        return m2.c.c;
    }
}
