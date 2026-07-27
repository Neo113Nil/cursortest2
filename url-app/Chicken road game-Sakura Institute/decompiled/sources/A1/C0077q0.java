package A1;

import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import z1.AbstractC1359C;

/* renamed from: A1.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0077q0 implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f651d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f652e;

    public /* synthetic */ C0077q0(int i2, int i4) {
        this.f651d = i4;
        this.f652e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        int i2 = this.f651d;
        C0216p c0216p = (C0216p) obj;
        ((Integer) obj2).intValue();
        switch (i2) {
            case 0:
                u3.d.f(C0192d.U(this.f652e | 1), c0216p);
                break;
            case 1:
                N0.a(C0192d.U(this.f652e | 1), c0216p);
                break;
            case 2:
                R0.e(C0192d.U(this.f652e | 1), c0216p);
                break;
            case 3:
                R0.f(C0192d.U(this.f652e | 1), c0216p);
                break;
            case 4:
                AbstractC1359C.b(C0192d.U(this.f652e | 1), c0216p);
                break;
            default:
                AbstractC1359C.a(C0192d.U(this.f652e | 1), c0216p);
                break;
        }
        return Unit.f7487a;
    }
}
