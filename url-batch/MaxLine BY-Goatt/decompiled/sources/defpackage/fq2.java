package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fq2 extends o81 implements Function2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ gq2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fq2(gq2 gq2Var, int i) {
        super(2);
        this.m = i;
        this.n = gq2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        gq2 gq2Var = this.n;
        switch (i) {
            case 0:
                gq2Var.a().n = (d00) obj2;
                break;
            case 1:
                v91 a = gq2Var.a();
                ((i91) obj).d0(new s91(a, (Function2) obj2, a.B));
                break;
            default:
                i91 i91Var = (i91) obj;
                jq2 jq2Var = gq2Var.a;
                v91 v91Var = i91Var.R;
                if (v91Var == null) {
                    v91Var = new v91(i91Var, jq2Var);
                    i91Var.R = v91Var;
                }
                gq2Var.b = v91Var;
                gq2Var.a().d();
                v91 a2 = gq2Var.a();
                if (a2.o != jq2Var) {
                    a2.o = jq2Var;
                    a2.e(false);
                    i91.W(a2.m, false, 7);
                }
                break;
        }
        return Unit.a;
    }
}
