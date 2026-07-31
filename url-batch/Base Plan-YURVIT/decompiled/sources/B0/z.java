package B0;

/* loaded from: classes.dex */
public final class z extends I0.b {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f145h;

    /* renamed from: i, reason: collision with root package name */
    public int f146i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0015p f147j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C0015p c0015p, I0.b bVar) {
        super(bVar);
        this.f147j = c0015p;
    }

    @Override // I0.b
    public final Object m(Object obj) {
        this.f145h = obj;
        this.f146i |= Integer.MIN_VALUE;
        return this.f147j.a(null, this);
    }
}
