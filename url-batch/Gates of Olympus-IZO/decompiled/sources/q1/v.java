package q1;

/* loaded from: classes.dex */
public final class v extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6959e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t f6960f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(t tVar, int i3) {
        super(1);
        this.f6959e = i3;
        this.f6960f = tVar;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f6959e) {
            case 0:
                Z1.i.f((String) obj, "key");
                return Boolean.valueOf(!this.f6960f.c().contains(r2));
            default:
                Z1.i.f((String) obj, "key");
                return Boolean.valueOf(!this.f6960f.c().contains(r2));
        }
    }
}
