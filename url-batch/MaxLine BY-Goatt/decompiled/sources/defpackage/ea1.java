package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ea1 extends o81 implements Function2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ mb1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ea1(mb1 mb1Var, int i, int i2) {
        super(2);
        this.m = i2;
        this.o = mb1Var;
        this.n = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        int i2 = this.n;
        mb1 mb1Var = this.o;
        switch (i) {
            case 0:
                a00 a00Var = (a00) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var.B()) {
                    a00Var.S();
                } else {
                    g41 f = ((fa1) mb1Var).b.q.f(i2);
                    int i3 = i2 - f.a;
                    ((ba1) f.c).d.b(ha1.a, Integer.valueOf(i3), a00Var, 6);
                }
                break;
            default:
                a00 a00Var2 = (a00) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var2.B()) {
                    a00Var2.S();
                } else {
                    g41 f2 = ((iy1) mb1Var).b.w().f(i2);
                    int i4 = i2 - f2.a;
                    ((ey1) f2.c).b.b(ly1.a, Integer.valueOf(i4), a00Var2, 0);
                }
                break;
        }
        return Unit.a;
    }
}
