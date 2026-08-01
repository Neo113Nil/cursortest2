package n9;

import ge.a0;
import ge.x;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import n0.i0;
import v.h0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7227d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7228e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f7229i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f7230r;

    public /* synthetic */ l(x xVar, h0 h0Var, n4.h hVar) {
        this.f7227d = 2;
        this.f7228e = xVar;
        this.f7229i = h0Var;
        this.f7230r = hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7227d) {
            case 0:
                ((Integer) obj2).getClass();
                i7.a.c((Function0) this.f7228e, (Function1) this.f7229i, (c) this.f7230r, (i0) obj, n0.h.z(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                a.a.d((n4.h) this.f7228e, (a1.j) this.f7229i, (x0.d) this.f7230r, (i0) obj, n0.h.z(385));
                break;
            case 2:
                x xVar = (x) this.f7228e;
                h0 h0Var = (h0) this.f7229i;
                n4.h hVar = (n4.h) this.f7230r;
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                a0.s(xVar, null, new i0.h(floatValue, h0Var, hVar, (ld.a) null), 3);
                break;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                ((Integer) obj2).getClass();
                c6.f.c((Function0) this.f7228e, (Function0) this.f7229i, (Function0) this.f7230r, (i0) obj, n0.h.z(1));
                break;
            default:
                ((Integer) obj2).getClass();
                t9.b.a((Function0) this.f7228e, (Function0) this.f7229i, (t9.c) this.f7230r, (i0) obj, n0.h.z(1));
                break;
        }
        return Unit.f5554a;
    }

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, int i3, int i10) {
        this.f7227d = i10;
        this.f7228e = obj;
        this.f7229i = obj2;
        this.f7230r = obj3;
    }
}
