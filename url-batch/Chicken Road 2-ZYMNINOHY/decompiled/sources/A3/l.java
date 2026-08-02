package A3;

/* loaded from: classes.dex */
public final class l extends h3.c {

    /* renamed from: a, reason: collision with root package name */
    public m f103a;

    /* renamed from: b, reason: collision with root package name */
    public Object f104b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f105c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f106d;

    /* renamed from: e, reason: collision with root package name */
    public int f107e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, h3.c cVar) {
        super(cVar);
        this.f106d = mVar;
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        this.f105c = obj;
        this.f107e |= Integer.MIN_VALUE;
        return this.f106d.emit(null, this);
    }
}
