package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class j60 implements Function2 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ z30 k;

    public /* synthetic */ j60(int i, jo joVar, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i2) {
        this.e = i;
        this.g = joVar;
        this.h = function0;
        this.i = function02;
        this.j = function03;
        this.k = function04;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        int i = this.d;
        z30 z30Var = this.k;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Integer) obj2).getClass();
                int P = gb0.P(1);
                la0.l(this.e, (jo) obj6, (Function0) obj5, (Function0) obj4, (Function0) obj3, (Function0) z30Var, (hl) obj, P);
                break;
            default:
                ((Integer) obj2).getClass();
                mk0.a((mi) obj6, (om0) obj5, (y91) obj4, (fk1) obj3, (hk) z30Var, (hl) obj, gb0.P(this.e | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ j60(mi miVar, om0 om0Var, y91 y91Var, fk1 fk1Var, hk hkVar, int i) {
        this.g = miVar;
        this.h = om0Var;
        this.i = y91Var;
        this.j = fk1Var;
        this.k = hkVar;
        this.e = i;
    }
}
