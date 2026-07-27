package A1;

import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import n.AbstractC0864b;
import z1.C1377c;
import z1.C1391q;
import z1.C1393s;

/* renamed from: A1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0050d implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f579e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f580i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f581j;

    public /* synthetic */ C0050d(int i2, int i4, Object obj, Object obj2) {
        this.f578d = i4;
        this.f581j = obj;
        this.f579e = obj2;
        this.f580i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        C0216p c0216p = (C0216p) obj;
        Integer num = (Integer) obj2;
        switch (this.f578d) {
            case 0:
                num.intValue();
                j0.c.f((C1377c) this.f581j, (Function0) this.f579e, c0216p, C0192d.U(this.f580i | 1));
                break;
            case 1:
                num.intValue();
                AbstractC0071n0.c((C1393s) this.f581j, (Function0) this.f579e, c0216p, C0192d.U(this.f580i | 1));
                break;
            case 2:
                num.intValue();
                AbstractC0071n0.a((C1391q) this.f581j, (Function0) this.f579e, c0216p, C0192d.U(this.f580i | 1));
                break;
            case 3:
                num.getClass();
                M1.a.g((Function0) this.f579e, (Function1) this.f581j, c0216p, C0192d.U(this.f580i | 1));
                break;
            default:
                num.getClass();
                AbstractC0864b.j((String) this.f581j, (String) this.f579e, c0216p, C0192d.U(this.f580i | 1));
                break;
        }
        return Unit.f7487a;
    }

    public /* synthetic */ C0050d(Function0 function0, Function1 function1, int i2) {
        this.f578d = 3;
        this.f579e = function0;
        this.f581j = function1;
        this.f580i = i2;
    }
}
