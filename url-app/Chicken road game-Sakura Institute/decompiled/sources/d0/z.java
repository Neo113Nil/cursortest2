package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class z extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public int f2545g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l.d f2546h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f2547i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f2548j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p.h f2549k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(l.d dVar, float f9, boolean z8, d3 d3Var, p.h hVar, h6.d dVar2) {
        super(2, dVar2);
        this.f2546h = dVar;
        this.f2547i = f9;
        this.f2548j = z8;
        this.f2549k = hVar;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        return new z(this.f2546h, this.f2547i, this.f2548j, null, this.f2549k, dVar);
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        return ((z) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (r8.e(r7, r0) == r4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        if (e0.b.a(r8, r3, r0, r7.f2549k, r7) == r4) goto L29;
     */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f2545g;
        if (i7 == 0) {
            d6.a.e(obj);
            l.d dVar = this.f2546h;
            float f9 = ((m2.e) dVar.f5429e.getValue()).f6312f;
            float f10 = this.f2547i;
            if (!m2.e.a(f9, f10)) {
                boolean z8 = this.f2548j;
                i6.a aVar = i6.a.f4956f;
                if (z8) {
                    float f11 = ((m2.e) dVar.f5429e.getValue()).f6312f;
                    p.h lVar = m2.e.a(f11, 0.0f) ? new p.l(0L) : m2.e.a(f11, 0.0f) ? new p.f() : m2.e.a(f11, 0.0f) ? new p.d() : null;
                    this.f2545g = 2;
                } else {
                    m2.e eVar = new m2.e(f10);
                    this.f2545g = 1;
                }
            }
        } else {
            if (i7 != 1 && i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d6.a.e(obj);
        }
        return d6.z.f2639a;
    }
}
