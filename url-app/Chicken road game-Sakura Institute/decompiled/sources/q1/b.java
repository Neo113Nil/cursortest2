package q1;

import G.C0216p;
import G.C0235z;
import G.W;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.M;
import androidx.lifecycle.Z;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final C0235z f9362a = new C0235z(W.f2779l, C1056a.f9361d);

    public static Z a(C0216p c0216p) {
        c0216p.T(-584162872);
        Z z4 = (Z) c0216p.k(f9362a);
        if (z4 == null) {
            c0216p.T(1382572291);
            z4 = M.g((View) c0216p.k(AndroidCompositionLocals_androidKt.f5217f));
            c0216p.q(false);
        }
        c0216p.q(false);
        return z4;
    }
}
