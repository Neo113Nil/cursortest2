package s0;

import G.C0216p;
import android.graphics.Matrix;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: s0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1117C extends M2.p implements Function2 {

    /* renamed from: e, reason: collision with root package name */
    public static final C1117C f9993e = new C1117C(2, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final C1117C f9994i = new C1117C(2, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final C1117C f9995j = new C1117C(2, 2);

    /* renamed from: k, reason: collision with root package name */
    public static final C1117C f9996k = new C1117C(2, 3);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9997d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1117C(int i2, int i4) {
        super(i2);
        this.f9997d = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f9997d) {
            case 0:
                y0.n nVar = (y0.n) obj2;
                y0.i iVar = ((y0.n) obj).f11587d;
                y0.t tVar = y0.q.f11625n;
                Object obj3 = iVar.f11576d.get(tVar);
                if (obj3 == null) {
                    obj3 = Float.valueOf(0.0f);
                }
                float floatValue = ((Number) obj3).floatValue();
                Object obj4 = nVar.f11587d.f11576d.get(tVar);
                if (obj4 == null) {
                    obj4 = Float.valueOf(0.0f);
                }
                break;
            case 1:
                C0216p c0216p = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
                    c0216p.N();
                }
                break;
            case 2:
                ((InterfaceC1148i0) obj).I((Matrix) obj2);
                break;
            default:
                ((Matrix) obj2).set(((View) obj).getMatrix());
                break;
        }
        return Unit.f7487a;
    }
}
