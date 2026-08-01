package l4;

import a1.k;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.a1;
import androidx.lifecycle.o0;
import n0.i0;
import n0.v;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final v f5860a = new v(new k(23));

    public static a1 a(i0 i0Var) {
        a1 a1Var = (a1) i0Var.j(f5860a);
        if (a1Var == null) {
            i0Var.W(1260197608);
            a1Var = o0.e((View) i0Var.j(AndroidCompositionLocals_androidKt.f469f));
        } else {
            i0Var.W(1260196492);
        }
        i0Var.p(false);
        return a1Var;
    }
}
