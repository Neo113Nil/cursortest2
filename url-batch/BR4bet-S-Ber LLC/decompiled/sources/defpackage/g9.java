package defpackage;

import android.view.View;
import com.moontiko.really.admiralcasino.MainActivity;
import java.io.IOException;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final /* synthetic */ class g9 implements zy, u80, y90 {
    public final /* synthetic */ int f;

    public /* synthetic */ g9(int i) {
        this.f = i;
    }

    public static /* synthetic */ void b() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void c(int i, Object obj, String str) {
        throw new IllegalArgumentException(str + i + obj);
    }

    public static /* synthetic */ void d(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void e(Object obj, Object obj2) {
        throw new q70("Fragment " + obj + obj2);
    }

    public static /* synthetic */ void f(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void g(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void h(Object obj, String str) {
        throw new IllegalArgumentException((str + obj + '\"').toString());
    }

    public static /* synthetic */ void i(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void j(String str, int i) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void k(String str, int i, Object obj, int i2) {
        throw new IllegalArgumentException((str + i + obj + i2).toString());
    }

    public static /* synthetic */ void m(String str, long j) {
        throw new IllegalArgumentException((str + j).toString());
    }

    public static /* synthetic */ void n(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void o(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void p(int i, Object obj, String str) {
        throw new IllegalArgumentException((str + i + obj).toString());
    }

    public static /* synthetic */ void q(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void r(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void s(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void t(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void u(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void v(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void w(String str) {
        throw new IOException(str);
    }

    @Override // defpackage.y90
    public void a(x90 x90Var, z90 z90Var) {
        switch (this.f) {
            case 25:
                x90Var.e(z90Var);
                break;
            case 26:
                x90Var.d(z90Var);
                break;
            case 27:
                x90Var.f(z90Var);
                break;
            default:
                x90Var.b();
                break;
        }
    }

    @Override // defpackage.zy
    public ye0 l(View view, ye0 ye0Var) {
        int i = MainActivity.L;
        view.getClass();
        er h = ye0Var.a.h(519);
        h.getClass();
        view.setPadding(h.a, h.b, h.c, h.d);
        return ye0Var;
    }
}
