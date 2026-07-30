package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import com.majelw.libystne.R;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class py implements xt0 {
    public final /* synthetic */ int m;

    public /* synthetic */ py(int i) {
        this.m = i;
    }

    @Override // defpackage.xt0
    public final Object a(Object obj, Object obj2, Object obj3) {
        int i = this.m;
        sl1 sl1Var = sl1.a;
        switch (i) {
            case 0:
                a00 a00Var = (a00) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ha1) obj).getClass();
                if (a00Var.P(intValue & 1, (intValue & 17) != 16)) {
                    yv2.b(uj2.f(R.string.atlas_empty, a00Var), a.k(b.c(sl1Var, 1.0f), 0.0f, 40.0f, 0.0f, 13), cw.i, 0L, null, 0L, new ut2(3), 0L, 0, false, 0, 0, null, a00Var, 432, 0, 130552);
                } else {
                    a00Var.S();
                }
                break;
            case 1:
                a00 a00Var2 = (a00) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((gc2) obj).getClass();
                if (a00Var2.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                    yv2.b(uj2.f(R.string.ob_get_started, a00Var2), null, cw.j, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, a00Var2, 384, 0, 131066);
                } else {
                    a00Var2.S();
                }
                break;
            case 2:
                a00 a00Var3 = (a00) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((ha1) obj).getClass();
                if (a00Var3.P(intValue3 & 1, (intValue3 & 17) != 16)) {
                    yv2.b(uj2.f(R.string.jewelry_empty, a00Var3), a.k(b.c(sl1Var, 1.0f), 0.0f, 40.0f, 0.0f, 13), cw.v, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, a00Var3, 432, 0, 131064);
                } else {
                    a00Var3.S();
                }
                break;
            case 3:
                a00 a00Var4 = (a00) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((gc2) obj).getClass();
                if (a00Var4.P(intValue4 & 1, (intValue4 & 17) != 16)) {
                    yv2.b(uj2.f(R.string.action_confirm_clear, a00Var4), null, cw.y, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, a00Var4, 384, 0, 131066);
                } else {
                    a00Var4.S();
                }
                break;
            default:
                a00 a00Var5 = (a00) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((gc2) obj).getClass();
                if (a00Var5.P(intValue5 & 1, (intValue5 & 17) != 16)) {
                    yv2.b(uj2.f(R.string.action_cancel, a00Var5), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, a00Var5, 0, 0, 131070);
                } else {
                    a00Var5.S();
                }
                break;
        }
        return Unit.a;
    }
}
