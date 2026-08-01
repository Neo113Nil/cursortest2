package n9;

import b0.w;
import b0.w0;
import com.appsflyer.R;
import kotlin.Unit;
import n0.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements vd.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f7215e;

    public /* synthetic */ g(int i3, float f3) {
        this.f7214d = i3;
        this.f7215e = f3;
    }

    @Override // vd.n
    public final Object a(Object obj, Object obj2, Object obj3) {
        int i3 = this.f7214d;
        float f3 = this.f7215e;
        switch (i3) {
            case 0:
                w wVar = (w) obj;
                i0 i0Var = (i0) obj2;
                int intValue = ((Integer) obj3).intValue();
                wVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= i0Var.f(wVar) ? 4 : 2;
                }
                if (i0Var.O(intValue & 1, (intValue & 19) != 18)) {
                    float b10 = wVar.b() * (f3 - ((float) Math.floor(f3)));
                    p1.b B = k7.e.B(R.drawable.gbg2, i0Var, 0);
                    d1.l h10 = b0.i.h(b10 - wVar.b(), 0.0f, 2, w0.a(1.0f));
                    a2.g gVar = a2.h.f98d;
                    x.g.b(B, h10, null, gVar, 0.0f, i0Var, 24632);
                    x.g.b(k7.e.B(R.drawable.gbg2, i0Var, 0), b0.i.h(b10, 0.0f, 2, w0.a(1.0f)), null, gVar, 0.0f, i0Var, 24632);
                    x.g.b(k7.e.B(R.drawable.gbg2, i0Var, 0), b0.i.h(wVar.b() + b10, 0.0f, 2, w0.a(1.0f)), null, gVar, 0.0f, i0Var, 24632);
                } else {
                    i0Var.R();
                }
                break;
            default:
                w wVar2 = (w) obj;
                i0 i0Var2 = (i0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                wVar2.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= i0Var2.f(wVar2) ? 4 : 2;
                }
                if (i0Var2.O(intValue2 & 1, (intValue2 & 19) != 18)) {
                    x.g.b(k7.e.B(R.drawable.troryar, i0Var2, 0), b0.i.h(wVar2.b() * f3, 0.0f, 2, w0.a(1.0f)), null, a2.h.f98d, 0.0f, i0Var2, 24632);
                } else {
                    i0Var2.R();
                }
                break;
        }
        return Unit.f5554a;
    }
}
