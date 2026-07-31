package u0;

import I.C0167p;
import android.graphics.Matrix;
import android.view.View;
import e2.InterfaceC0426e;

/* renamed from: u0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1087D extends f2.k implements InterfaceC0426e {

    /* renamed from: f, reason: collision with root package name */
    public static final C1087D f9133f = new C1087D(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C1087D f9134g = new C1087D(2, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final C1087D f9135h = new C1087D(2, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final C1087D f9136i = new C1087D(2, 3);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9137e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1087D(int i3, int i4) {
        super(i3);
        this.f9137e = i4;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        switch (this.f9137e) {
            case 0:
                A0.p pVar = (A0.p) obj2;
                A0.i iVar = ((A0.p) obj).f142d;
                A0.v vVar = A0.s.f179n;
                Object obj3 = iVar.f129d.get(vVar);
                if (obj3 == null) {
                    obj3 = Float.valueOf(0.0f);
                }
                float floatValue = ((Number) obj3).floatValue();
                Object obj4 = pVar.f142d.f129d.get(vVar);
                if (obj4 == null) {
                    obj4 = Float.valueOf(0.0f);
                }
                break;
            case 1:
                C0167p c0167p = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
                    c0167p.L();
                }
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                ((InterfaceC1105i0) obj).J((Matrix) obj2);
                break;
            default:
                ((Matrix) obj2).set(((View) obj).getMatrix());
                break;
        }
        return R1.y.f4171a;
    }
}
