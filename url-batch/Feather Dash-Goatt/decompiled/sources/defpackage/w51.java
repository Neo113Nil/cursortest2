package defpackage;

import android.os.Bundle;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class w51 implements t51, e61 {
    public final /* synthetic */ u51 d;
    public xg0 e;
    public c51 g;

    public w51(u51 u51Var) {
        this.d = u51Var;
        Object d = u51Var.d("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = d instanceof Bundle ? (Bundle) d : null;
        if (bundle != null) {
            g(bundle);
        }
        u51Var.e("androidx.savedstate.SavedStateRegistry", new i6(7, this));
    }

    @Override // defpackage.e61
    public final c51 a() {
        return (c51) g(null).g;
    }

    @Override // defpackage.t51
    public final boolean b(Object obj) {
        return this.d.b(obj);
    }

    @Override // defpackage.t51
    public final Map c() {
        return this.d.c();
    }

    @Override // defpackage.t51
    public final Object d(String str) {
        return this.d.d(str);
    }

    @Override // defpackage.t51
    public final s51 e(String str, Function0 function0) {
        return this.d.e(str, function0);
    }

    @Override // defpackage.vg0
    public final xg0 f() {
        xg0 xg0Var = this.e;
        if (xg0Var != null) {
            return xg0Var;
        }
        xg0 xg0Var2 = new xg0(this, false);
        this.e = xg0Var2;
        return xg0Var2;
    }

    public final c51 g(Bundle bundle) {
        c51 c51Var = this.g;
        if (c51Var != null) {
            return c51Var;
        }
        c51 c51Var2 = new c51(new d61(this, new i6(8, this)), 2);
        this.g = c51Var2;
        c51Var2.h(bundle);
        return c51Var2;
    }
}
