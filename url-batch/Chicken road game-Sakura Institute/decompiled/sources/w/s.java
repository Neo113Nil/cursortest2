package w;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s extends r6.l implements q6.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g2.q f9415g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f9416h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g2.w f9417i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a0.x0 f9418j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j0 f9419k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(g2.q qVar, boolean z8, g2.w wVar, a0.x0 x0Var, j0 j0Var) {
        super(3);
        this.f9415g = qVar;
        this.f9416h = z8;
        this.f9417i = wVar;
        this.f9418j = x0Var;
        this.f9419k = j0Var;
    }

    @Override // q6.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        g2.w wVar = this.f9417i;
        a2.g gVar = wVar.f4065a;
        g2.q qVar = this.f9415g;
        if (!booleanValue) {
            intValue = qVar.a(intValue);
        }
        if (!booleanValue) {
            intValue2 = qVar.a(intValue2);
        }
        boolean z8 = false;
        if (this.f9416h) {
            long j8 = wVar.f4066b;
            int i7 = a2.j0.f407c;
            if (intValue != ((int) (j8 >> 32)) || intValue2 != ((int) (j8 & 4294967295L))) {
                int min = Math.min(intValue, intValue2);
                a0 a0Var = a0.f9183f;
                a0.x0 x0Var = this.f9418j;
                if (min < 0 || Math.max(intValue, intValue2) > gVar.f373f.length()) {
                    x0Var.p(false);
                    x0Var.n(a0Var);
                } else {
                    if (booleanValue || intValue == intValue2) {
                        x0Var.p(false);
                        x0Var.n(a0Var);
                    } else {
                        x0Var.f(true);
                    }
                    this.f9419k.f9274t.f(new g2.w(gVar, r4.a.h(intValue, intValue2), (a2.j0) null));
                    z8 = true;
                }
            }
        }
        return Boolean.valueOf(z8);
    }
}
