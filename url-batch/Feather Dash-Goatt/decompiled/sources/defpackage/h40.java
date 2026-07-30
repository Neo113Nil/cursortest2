package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class h40 implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ h40(e40 e40Var, Function0 function0, Function0 function02, int i) {
        this.d = 0;
        this.h = e40Var;
        this.e = function0;
        this.g = function02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        int i = this.d;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Integer) obj2).getClass();
                p4.e((e40) obj3, (Function0) obj5, (Function0) obj4, (hl) obj, gb0.P(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                uq1.m((Function0) obj5, (Function0) obj4, (Function0) obj3, (hl) obj, gb0.P(1));
                break;
            case 2:
                w11 w11Var = (w11) obj3;
                d81 d81Var = (d81) obj5;
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long h = d81Var.h(d81Var.d(floatValue - w11Var.d));
                d81 d81Var2 = ((b81) obj4).a;
                w11Var.d += d81Var.d(d81Var.g(d81Var2.c(d81Var2.k, h, 1)));
                break;
            default:
                ((Integer) obj2).getClass();
                op.j((Function0) obj5, (Function0) obj4, (am0) obj3, (hl) obj, gb0.P(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ h40(w11 w11Var, d81 d81Var, b81 b81Var) {
        this.d = 2;
        this.h = w11Var;
        this.e = d81Var;
        this.g = b81Var;
    }

    public /* synthetic */ h40(Function0 function0, Function0 function02, Object obj, int i, int i2) {
        this.d = i2;
        this.e = function0;
        this.g = function02;
        this.h = obj;
    }
}
