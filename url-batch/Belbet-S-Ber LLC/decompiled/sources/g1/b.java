package g1;

import android.view.View;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: b, reason: collision with root package name */
    public static ExecutorService f1613b;

    /* renamed from: a, reason: collision with root package name */
    public static final Object f1612a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final a0.j f1614c = new a0.j(1);

    public static int a(m1 m1Var, androidx.emoji2.text.g gVar, View view, View view2, a1 a1Var, boolean z4) {
        if (a1Var.v() == 0 || m1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z4) {
            return Math.abs(a1.G(view) - a1.G(view2)) + 1;
        }
        return Math.min(gVar.l(), gVar.b(view2) - gVar.e(view));
    }

    public static int b(m1 m1Var, androidx.emoji2.text.g gVar, View view, View view2, a1 a1Var, boolean z4, boolean z5) {
        if (a1Var.v() == 0 || m1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z5 ? Math.max(0, (m1Var.b() - Math.max(a1.G(view), a1.G(view2))) - 1) : Math.max(0, Math.min(a1.G(view), a1.G(view2)));
        if (z4) {
            return Math.round((max * (Math.abs(gVar.b(view2) - gVar.e(view)) / (Math.abs(a1.G(view) - a1.G(view2)) + 1))) + (gVar.k() - gVar.e(view)));
        }
        return max;
    }

    public static int c(m1 m1Var, androidx.emoji2.text.g gVar, View view, View view2, a1 a1Var, boolean z4) {
        if (a1Var.v() == 0 || m1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z4) {
            return m1Var.b();
        }
        return (int) (((gVar.b(view2) - gVar.e(view)) / (Math.abs(a1.G(view) - a1.G(view2)) + 1)) * m1Var.b());
    }
}
