package e7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f2840f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f2841g;

    /* renamed from: h, reason: collision with root package name */
    public int f2842h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, j6.c cVar) {
        super(cVar);
        this.f2841g = eVar;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f2840f = obj;
        this.f2842h |= Integer.MIN_VALUE;
        Object B = e.B(this.f2841g, this);
        return B == i6.a.f4956f ? B : new l(B);
    }
}
