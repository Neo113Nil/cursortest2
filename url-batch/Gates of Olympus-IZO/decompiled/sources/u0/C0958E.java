package u0;

import I.C0113p;
import android.graphics.Matrix;
import android.view.View;
import h1.C0438i;

/* renamed from: u0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0958E extends Z1.j implements Y1.e {

    /* renamed from: f, reason: collision with root package name */
    public static final C0958E f8120f = new C0958E(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0958E f8121g = new C0958E(2, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final C0958E f8122h = new C0958E(2, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final C0958E f8123i = new C0958E(2, 3);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8124e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0958E(int i3, int i4) {
        super(i3);
        this.f8124e = i4;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f8124e) {
            case 0:
                z0.n nVar = (z0.n) obj2;
                z0.i iVar = ((z0.n) obj).f8991d;
                z0.t tVar = z0.q.f9023n;
                Object obj3 = iVar.f8982d.get(tVar);
                if (obj3 == null) {
                    obj3 = Float.valueOf(0.0f);
                }
                float floatValue = ((Number) obj3).floatValue();
                Object obj4 = nVar.f8991d.f8982d.get(tVar);
                if (obj4 == null) {
                    obj4 = Float.valueOf(0.0f);
                }
                break;
            case 1:
                C0113p c0113p = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p.x()) {
                    c0113p.L();
                }
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                ((InterfaceC0965c0) obj).I((Matrix) obj2);
                break;
            default:
                ((Matrix) obj2).set(((View) obj).getMatrix());
                break;
        }
        return L1.z.f2729a;
    }
}
