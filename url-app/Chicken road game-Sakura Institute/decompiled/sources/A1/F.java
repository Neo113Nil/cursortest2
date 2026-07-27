package A1;

import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class F implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f455d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f456e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f457i;

    public /* synthetic */ F(int i2, int i4, Function1 function1) {
        this.f455d = i4;
        this.f456e = function1;
        this.f457i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        int i2 = this.f455d;
        C0216p c0216p = (C0216p) obj;
        ((Integer) obj2).intValue();
        switch (i2) {
            case 0:
                AbstractC0071n0.f(this.f456e, c0216p, C0192d.U(this.f457i | 1));
                break;
            default:
                u3.l.M(this.f456e, c0216p, C0192d.U(this.f457i | 1));
                break;
        }
        return Unit.f7487a;
    }
}
