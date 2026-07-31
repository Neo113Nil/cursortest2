package u0;

/* renamed from: u0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0990p extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8380e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Z.a f8381f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0990p(Z.a aVar, int i3) {
        super(1);
        this.f8380e = i3;
        this.f8381f = aVar;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f8380e) {
            case 0:
                Boolean C = Z.c.C((Z.q) obj, this.f8381f.f3414a);
                return Boolean.valueOf(C != null ? C.booleanValue() : true);
            default:
                Boolean C3 = Z.c.C((Z.q) obj, this.f8381f.f3414a);
                return Boolean.valueOf(C3 != null ? C3.booleanValue() : true);
        }
    }
}
