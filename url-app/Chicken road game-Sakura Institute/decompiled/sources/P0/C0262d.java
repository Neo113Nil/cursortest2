package P0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: P0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0262d extends M2.p implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public static final C0262d f3713e = new C0262d(1, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final C0262d f3714i = new C0262d(1, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final C0262d f3715j = new C0262d(1, 2);

    /* renamed from: k, reason: collision with root package name */
    public static final C0262d f3716k = new C0262d(1, 3);

    /* renamed from: l, reason: collision with root package name */
    public static final C0262d f3717l = new C0262d(1, 4);

    /* renamed from: m, reason: collision with root package name */
    public static final C0262d f3718m = new C0262d(1, 5);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3719d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0262d(int i2, int i4) {
        super(i2);
        this.f3719d = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3719d) {
            case 0:
                S2.e[] eVarArr = y0.s.f11639a;
                y0.t tVar = y0.q.f11629r;
                Unit unit = Unit.f7487a;
                ((y0.i) obj).s(tVar, unit);
                break;
            case 1:
                ((Number) obj).longValue();
                break;
            case 2:
                break;
            case 3:
                S2.e[] eVarArr2 = y0.s.f11639a;
                y0.t tVar2 = y0.q.f11628q;
                Unit unit2 = Unit.f7487a;
                ((y0.i) obj).s(tVar2, unit2);
                break;
            case 4:
                break;
            default:
                B b4 = (B) obj;
                if (b4.isAttachedToWindow()) {
                    b4.l();
                }
                break;
        }
        return Unit.f7487a;
    }
}
