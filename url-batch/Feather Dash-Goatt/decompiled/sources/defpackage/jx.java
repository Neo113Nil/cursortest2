package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class jx implements Function2 {
    public final /* synthetic */ int d = 2;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ jx(int i, boolean z, Function0 function0, Function0 function02, int i2) {
        this.h = i;
        this.e = z;
        this.i = function0;
        this.g = function02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        int i = this.d;
        int i2 = this.h;
        boolean z = this.e;
        Object obj3 = this.g;
        Object obj4 = this.i;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Integer) obj2).getClass();
                uq1.h((z8) obj3, (Function0) obj4, z, (hl) obj, gb0.P(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                uq1.o(z, (w8) obj4, (z8) obj3, (hl) obj, gb0.P(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int P = gb0.P(1);
                uq1.d(this.h, this.e, (Function0) obj4, (Function0) obj3, (hl) obj, P);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ jx(z8 z8Var, Function0 function0, boolean z, int i) {
        this.g = z8Var;
        this.i = function0;
        this.e = z;
        this.h = i;
    }

    public /* synthetic */ jx(boolean z, w8 w8Var, z8 z8Var, int i) {
        this.e = z;
        this.i = w8Var;
        this.g = z8Var;
        this.h = i;
    }
}
