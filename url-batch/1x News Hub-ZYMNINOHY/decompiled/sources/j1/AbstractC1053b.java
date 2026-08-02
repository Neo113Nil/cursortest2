package j1;

import android.view.View;
import f0.C0322a;
import i1.AbstractC0341a;
import l.t0;

/* renamed from: j1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1053b {
    public static i b(C0322a c0322a, t0 t0Var) {
        if (AbstractC0341a.f5086a.f5087a) {
            return new i(c0322a, t0Var);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public abstract void a(View view, e eVar);

    public abstract void c();

    public abstract void d(View view);

    public abstract void e();
}
