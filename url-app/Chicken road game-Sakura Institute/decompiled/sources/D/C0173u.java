package D;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: D.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0173u extends M2.p implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public static final C0173u f2032e = new C0173u(1, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final C0173u f2033i = new C0173u(1, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final C0173u f2034j = new C0173u(1, 2);

    /* renamed from: k, reason: collision with root package name */
    public static final C0173u f2035k = new C0173u(1, 3);

    /* renamed from: l, reason: collision with root package name */
    public static final C0173u f2036l = new C0173u(1, 4);

    /* renamed from: m, reason: collision with root package name */
    public static final C0173u f2037m = new C0173u(1, 5);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2038d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0173u(int i2, int i4) {
        super(i2);
        this.f2038d = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f2038d) {
            case 0:
                y0.s.d((y0.i) obj, 0);
                break;
            case 1:
                y0.s.d((y0.i) obj, 1);
                break;
            case 2:
                y0.s.d((y0.i) obj, 0);
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                S2.e[] eVarArr = y0.s.f11639a;
                y0.t tVar = y0.q.f11623l;
                S2.e eVar = y0.s.f11639a[5];
                tVar.a((y0.i) obj, Boolean.TRUE);
                break;
        }
        return Unit.f7487a;
    }
}
