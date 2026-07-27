package A1;

import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class J implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f483e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f484i;

    public /* synthetic */ J(Function0 function0, int i2, int i4) {
        this.f482d = i4;
        this.f483e = function0;
        this.f484i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        int i2 = this.f482d;
        C0216p c0216p = (C0216p) obj;
        ((Integer) obj2).intValue();
        switch (i2) {
            case 0:
                AbstractC0071n0.d(this.f483e, c0216p, C0192d.U(this.f484i | 1));
                break;
            case 1:
                u3.l.G(this.f483e, c0216p, C0192d.U(this.f484i | 1));
                break;
            case 2:
                M1.a.c(this.f483e, c0216p, C0192d.U(this.f484i | 1));
                break;
            case 3:
                M1.a.b(this.f483e, c0216p, C0192d.U(this.f484i | 1));
                break;
            case 4:
                M1.a.f(this.f483e, c0216p, C0192d.U(this.f484i | 1));
                break;
            default:
                R0.a(this.f483e, c0216p, C0192d.U(this.f484i | 1));
                break;
        }
        return Unit.f7487a;
    }
}
