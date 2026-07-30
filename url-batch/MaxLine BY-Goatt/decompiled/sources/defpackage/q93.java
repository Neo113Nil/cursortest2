package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class q93 extends o81 implements Function2 {
    public final /* synthetic */ int m = 0;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q93(p62 p62Var, c82 c82Var, c82 c82Var2, c82 c82Var3) {
        super(2);
        this.n = p62Var;
        this.o = c82Var;
        this.p = c82Var2;
        this.q = c82Var3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        Object obj3 = this.n;
        Object obj4 = this.q;
        Object obj5 = this.p;
        Object obj6 = this.o;
        switch (i) {
            case 0:
                int intValue = ((Number) obj).intValue();
                long longValue = ((Number) obj2).longValue();
                p62 p62Var = (p62) obj3;
                if (intValue == 1) {
                    c82 c82Var = (c82) obj6;
                    if (c82Var.m != null) {
                        dm0.j("bad zip: NTFS extra attribute tag 0x0001 repeated");
                        break;
                    } else if (longValue != 24) {
                        dm0.j("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                        break;
                    } else {
                        c82Var.m = Long.valueOf(p62Var.n());
                        ((c82) obj5).m = Long.valueOf(p62Var.n());
                        ((c82) obj4).m = Long.valueOf(p62Var.n());
                    }
                }
                break;
            case 1:
                int intValue2 = ((Number) obj).intValue();
                long longValue2 = ((Number) obj2).longValue();
                p62 p62Var2 = (p62) obj3;
                if (intValue2 == 21589) {
                    if (longValue2 < 1) {
                        dm0.j("bad zip: extended timestamp extra too short");
                        break;
                    } else {
                        byte readByte = p62Var2.readByte();
                        boolean z = (readByte & 1) == 1;
                        boolean z2 = (readByte & 2) == 2;
                        boolean z3 = (readByte & 4) == 4;
                        long j = z ? 5L : 1L;
                        if (z2) {
                            j += 4;
                        }
                        if (z3) {
                            j += 4;
                        }
                        if (longValue2 < j) {
                            dm0.j("bad zip: extended timestamp extra too short");
                            break;
                        } else {
                            if (z) {
                                ((c82) obj6).m = Integer.valueOf(p62Var2.m());
                            }
                            if (z2) {
                                ((c82) obj5).m = Integer.valueOf(p62Var2.m());
                            }
                            if (z3) {
                                ((c82) obj4).m = Integer.valueOf(p62Var2.m());
                            }
                        }
                    }
                }
                break;
            default:
                ((Number) obj2).intValue();
                tk3.n((Function0) obj6, (vl1) obj5, (xb1) obj4, (Function2) obj3, (a00) obj, s03.R(1));
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q93(c82 c82Var, p62 p62Var, c82 c82Var2, c82 c82Var3) {
        super(2);
        this.o = c82Var;
        this.n = p62Var;
        this.p = c82Var2;
        this.q = c82Var3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q93(Function0 function0, vl1 vl1Var, xb1 xb1Var, Function2 function2, int i) {
        super(2);
        this.o = function0;
        this.p = vl1Var;
        this.q = xb1Var;
        this.n = function2;
    }
}
