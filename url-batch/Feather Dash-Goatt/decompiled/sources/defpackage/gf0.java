package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class gf0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ if0 e;

    public /* synthetic */ gf0(if0 if0Var, int i) {
        this.d = i;
        this.e = if0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        if0 if0Var = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                wf0 wf0Var = if0Var.t.b;
                return Float.valueOf((((xu0) wf0Var.e.b).h() * 500) + ((xu0) wf0Var.e.c).h());
            case 1:
                wf0 wf0Var2 = if0Var.t.b;
                int h = ((xu0) wf0Var2.e.b).h();
                int h2 = ((xu0) wf0Var2.e.c).h();
                return Float.valueOf(wf0Var2.d() ? (h * 500) + h2 + 100.0f : (h * 500) + h2);
            default:
                wf0 wf0Var3 = if0Var.t.b;
                int g = (int) (wf0Var3.g().o == et0.d ? wf0Var3.g().g() & 4294967295L : wf0Var3.g().g() >> 32);
                wf0 wf0Var4 = if0Var.t.b;
                return Float.valueOf(g - ((-wf0Var4.g().l) + wf0Var4.g().p));
        }
    }
}
