package u0;

/* loaded from: classes.dex */
public final class r extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8404e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(int i3) {
        super(1);
        this.f8404e = i3;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        Boolean C = Z.c.C((Z.q) obj, this.f8404e);
        return Boolean.valueOf(C != null ? C.booleanValue() : false);
    }
}
