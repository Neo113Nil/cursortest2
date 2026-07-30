package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g1 extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r6.v f5493g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f5494h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g f5495i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f5496j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q6.c f5497k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(r6.v vVar, float f9, g gVar, l lVar, q6.c cVar) {
        super(1);
        this.f5493g = vVar;
        this.f5494h = f9;
        this.f5495i = gVar;
        this.f5496j = lVar;
        this.f5497k = cVar;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        long longValue = ((Number) obj).longValue();
        Object obj2 = this.f5493g.f7968f;
        r6.k.c(obj2);
        e.h((j) obj2, longValue, this.f5494h, this.f5495i, this.f5496j, this.f5497k);
        return d6.z.f2639a;
    }
}
