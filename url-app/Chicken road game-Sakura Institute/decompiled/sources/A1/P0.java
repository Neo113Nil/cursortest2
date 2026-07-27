package A1;

import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import z1.AbstractC1370N;
import z1.C1374S;

/* loaded from: classes.dex */
public final /* synthetic */ class P0 implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f526e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f527i;

    public /* synthetic */ P0(int i2, int i4, Object obj) {
        this.f525d = i4;
        this.f527i = obj;
        this.f526e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        C0216p c0216p = (C0216p) obj;
        Integer num = (Integer) obj2;
        switch (this.f525d) {
            case 0:
                num.intValue();
                R0.d((C1374S) this.f527i, c0216p, C0192d.U(this.f526e | 1));
                break;
            default:
                num.getClass();
                AbstractC1370N.a((O.a) this.f527i, c0216p, C0192d.U(this.f526e | 1));
                break;
        }
        return Unit.f7487a;
    }
}
