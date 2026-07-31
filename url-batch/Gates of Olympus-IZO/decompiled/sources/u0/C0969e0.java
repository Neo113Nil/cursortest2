package u0;

/* renamed from: u0.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0969e0 extends Z1.j implements Y1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f8322e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u1.e f8323f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f8324g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0969e0(boolean z3, u1.e eVar, String str) {
        super(0);
        this.f8322e = z3;
        this.f8323f = eVar;
        this.f8324g = str;
    }

    @Override // Y1.a
    public final Object b() {
        if (this.f8322e) {
            u1.e eVar = this.f8323f;
            eVar.getClass();
            String str = this.f8324g;
            Z1.i.f(str, "key");
            eVar.f8512a.c(str);
        }
        return L1.z.f2729a;
    }
}
