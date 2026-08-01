package defpackage;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final /* synthetic */ class xb implements ml {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ xb(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.ml
    public final Object a() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                yf yfVar = new yf();
                ((yb) obj).c().a().b(yfVar);
                return yfVar;
            case 1:
                return new ew(new m1(5, (yb) obj));
            default:
                return new cw((ew) obj);
        }
    }
}
