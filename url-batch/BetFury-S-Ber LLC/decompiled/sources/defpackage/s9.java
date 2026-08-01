package defpackage;

import android.view.View;
import com.trembin.nirefon.betfury.MainActivity;
import com.trembin.nirefon.betfury.MainActivity2;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final /* synthetic */ class s9 implements q40, w1, th0, jj0 {
    public final /* synthetic */ int f;

    public /* synthetic */ s9(int i) {
        this.f = i;
    }

    public static /* synthetic */ void c() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void d(int i, Object obj, String str) {
        throw new IllegalArgumentException(str + i + obj);
    }

    public static /* synthetic */ void e(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void f(Object obj, Object obj2) {
        throw new zf0("Fragment " + obj + obj2);
    }

    public static /* synthetic */ void g(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void h(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void j(Object obj, String str) {
        throw new IllegalArgumentException((str + obj + '\"').toString());
    }

    public static /* synthetic */ void k(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void l(String str, int i) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void m(String str, int i, Object obj, int i2) {
        throw new IllegalArgumentException((str + i + obj + i2).toString());
    }

    public static /* synthetic */ void n(String str, long j) {
        throw new IllegalArgumentException((str + j).toString());
    }

    public static /* synthetic */ void o(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void p(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void q(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void r(int i, Object obj, String str) {
        throw new IllegalArgumentException((str + i + obj).toString());
    }

    public static /* synthetic */ void s(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void t(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void u(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void v(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void w(String str) {
        throw new IOException(str);
    }

    public static /* synthetic */ void x(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void y(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void z(Object obj, String str) {
        throw new FileNotFoundException(str + obj);
    }

    @Override // defpackage.w1
    public void a(Object obj) {
        ((Boolean) obj).booleanValue();
        int i = MainActivity2.I;
    }

    @Override // defpackage.jj0
    public void b(hj0 hj0Var, kj0 kj0Var) {
        switch (this.f) {
            case 28:
                hj0Var.e(kj0Var);
                break;
            default:
                hj0Var.d(kj0Var);
                break;
        }
    }

    @Override // defpackage.q40
    public dp0 i(View view, dp0 dp0Var) {
        int i = MainActivity.K;
        view.getClass();
        fv h = dp0Var.a.h(519);
        h.getClass();
        view.setPadding(h.a, h.b, h.c, h.d);
        return dp0Var;
    }
}
