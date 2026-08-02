package F2;

import android.view.View;
import k.q0;

/* loaded from: classes.dex */
public abstract class b {
    public static i b(l2.e eVar, q0 q0Var) {
        if (E2.a.f674a.f675a) {
            return new i(eVar, q0Var);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public abstract void a(View view, e eVar);

    public abstract void c();

    public abstract void d(View view);

    public abstract void e();
}
