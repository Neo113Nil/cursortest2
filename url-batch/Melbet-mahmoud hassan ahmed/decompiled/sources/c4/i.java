package c4;

/* loaded from: classes.dex */
final class i implements v {

    /* renamed from: a, reason: collision with root package name */
    private d0 f1990a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ h f1991b;

    private i(h hVar) {
        this.f1991b = hVar;
    }

    /* synthetic */ i(h hVar, g gVar) {
        this(hVar);
    }

    @Override // c4.v
    public final /* synthetic */ v a(d0 d0Var) {
        this.f1990a = (d0) w1.a(d0Var);
        return this;
    }

    @Override // c4.v
    public final s zza() {
        w1.c(this.f1990a, d0.class);
        return new l(this.f1991b, this.f1990a, null);
    }
}
