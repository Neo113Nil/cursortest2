package androidx.compose.foundation.selection;

import androidx.compose.foundation.d;
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
    public final /* synthetic */ g0 f676g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z1.a f677h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f678i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y1.f f679j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q6.a f680k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g0 g0Var, q6.a aVar, y1.f fVar, z1.a aVar2, boolean z8) {
        super(3);
        this.f676g = g0Var;
        this.f677h = aVar2;
        this.f678i = z8;
        this.f679j = fVar;
        this.f680k = aVar;
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
        o j8 = d.a(s0.l.f8103a, jVar, this.f676g).j(new TriStateToggleableElement(this.f677h, jVar, null, this.f678i, this.f679j, this.f680k));
        pVar.p(false);
        return j8;
    }
}
