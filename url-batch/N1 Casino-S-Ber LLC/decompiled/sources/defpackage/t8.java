package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.derinko.gbini.n1casino.MainActivity;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final /* synthetic */ class t8 implements wv, xl, n50, r60 {
    public final /* synthetic */ int f;

    public /* synthetic */ t8(int i) {
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
        throw new p40("Fragment " + obj + obj2);
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

    public static /* synthetic */ void i(Object obj, Object obj2, Throwable th) {
        throw new lk("Unable to instantiate fragment " + obj + obj2, th);
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

    public static /* synthetic */ void n(String str, int i, Object obj, int i2) {
        throw new IllegalArgumentException((str + i + obj + i2).toString());
    }

    public static /* synthetic */ void o(String str, long j) {
        throw new IllegalArgumentException((str + j).toString());
    }

    public static /* synthetic */ void p(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void q(int i, Object obj, String str) {
        throw new IllegalArgumentException((str + i + obj).toString());
    }

    public static /* synthetic */ void r(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
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

    public static /* synthetic */ void x(Object obj, String str) {
        throw new FileNotFoundException(str + obj);
    }

    public static /* synthetic */ void y(String str) {
        throw new IOException(str);
    }

    @Override // defpackage.xl
    public Object a(Object obj) {
        Resources resources = (Resources) obj;
        resources.getClass();
        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
    }

    @Override // defpackage.r60
    public void b(p60 p60Var, s60 s60Var) {
        switch (this.f) {
            case 27:
                p60Var.e(s60Var);
                break;
            case 28:
                p60Var.d(s60Var);
                break;
            default:
                p60Var.f(s60Var);
                break;
        }
    }

    @Override // defpackage.wv
    public rb0 m(View view, rb0 rb0Var) {
        int i = MainActivity.L;
        view.getClass();
        to h = rb0Var.a.h(519);
        h.getClass();
        view.setPadding(h.a, h.b, h.c, h.d);
        return rb0Var;
    }
}
