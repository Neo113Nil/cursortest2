package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.awerser.monnit.betplay.MainActivity;
import java.io.IOException;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final /* synthetic */ class o8 implements dw, gm, v50, x60 {
    public final /* synthetic */ int f;

    public /* synthetic */ o8(int i) {
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

    public static /* synthetic */ void f(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void g(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void h(Object obj, Object obj2, Throwable th) {
        throw new gk("Unable to instantiate fragment " + obj + obj2, th);
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new IllegalArgumentException((str + obj + '\"').toString());
    }

    public static /* synthetic */ void j(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void k(String str, int i) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void l(String str, int i, Object obj, int i2) {
        throw new IllegalArgumentException((str + i + obj + i2).toString());
    }

    public static /* synthetic */ void m(String str, long j) {
        throw new IllegalArgumentException((str + j).toString());
    }

    public static /* synthetic */ void n(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void o(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void p(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void q(int i, Object obj, String str) {
        throw new IllegalArgumentException((str + i + obj).toString());
    }

    public static /* synthetic */ void r(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void s(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void t(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void u(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void v(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void w(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void x(String str) {
        throw new IOException(str);
    }

    @Override // defpackage.gm
    public Object a(Object obj) {
        Resources resources = (Resources) obj;
        resources.getClass();
        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
    }

    @Override // defpackage.x60
    public void b(v60 v60Var, y60 y60Var) {
        switch (this.f) {
            case 27:
                v60Var.e(y60Var);
                break;
            case 28:
                v60Var.d(y60Var);
                break;
            default:
                v60Var.f(y60Var);
                break;
        }
    }

    @Override // defpackage.dw
    public ac0 onApplyWindowInsets(View view, ac0 ac0Var) {
        int i = MainActivity.L;
        view.getClass();
        ip h = ac0Var.a.h(519);
        h.getClass();
        view.setPadding(h.a, h.b, h.c, h.d);
        return ac0Var;
    }
}
