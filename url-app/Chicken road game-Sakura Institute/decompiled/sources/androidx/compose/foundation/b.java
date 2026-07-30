package androidx.compose.foundation;

import g0.p;
import m.g0;
import p.j;
import q6.f;
import r6.l;
import s0.o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends l implements f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g0 f599g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f600h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f601i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y1.f f602j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q6.a f603k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g0 g0Var, boolean z8, String str, y1.f fVar, q6.a aVar) {
        super(3);
        this.f599g = g0Var;
        this.f600h = z8;
        this.f601i = str;
        this.f602j = fVar;
        this.f603k = aVar;
    }

    @Override // q6.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        p pVar = (p) obj2;
        ((Number) obj3).intValue();
        pVar.Q(-1525724089);
        Object G = pVar.G();
        if (G == g0.l.f3784a) {
            G = new j();
            pVar.a0(G);
        }
        j jVar = (j) G;
        o j8 = d.a(s0.l.f8103a, jVar, this.f599g).j(new ClickableElement(jVar, null, this.f600h, this.f601i, this.f602j, this.f603k));
        pVar.p(false);
        return j8;
    }
}
