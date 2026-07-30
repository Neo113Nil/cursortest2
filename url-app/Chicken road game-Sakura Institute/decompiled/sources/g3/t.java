package g3;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public a0 f4194f;

    /* renamed from: g, reason: collision with root package name */
    public i0 f4195g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4196h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f4197i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a0 f4198j;

    /* renamed from: k, reason: collision with root package name */
    public int f4199k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(a0 a0Var, h6.d dVar) {
        super(dVar);
        this.f4198j = a0Var;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f4197i = obj;
        this.f4199k |= Integer.MIN_VALUE;
        return a0.b(this.f4198j, false, this);
    }
}
