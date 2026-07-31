package io.flutter.plugins.webviewflutter;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import io.flutter.plugins.webviewflutter.k;

/* loaded from: classes.dex */
public class m2 implements p2 {

    /* renamed from: f, reason: collision with root package name */
    private final Handler f17735f;

    /* renamed from: g, reason: collision with root package name */
    final String f17736g;

    /* renamed from: h, reason: collision with root package name */
    private n2 f17737h;

    public m2(n2 n2Var, String str, Handler handler) {
        this.f17737h = n2Var;
        this.f17736g = str;
        this.f17735f = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Void r02) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(String str) {
        n2 n2Var = this.f17737h;
        if (n2Var != null) {
            n2Var.j(this, str, new k.j.a() { // from class: io.flutter.plugins.webviewflutter.j2
                @Override // io.flutter.plugins.webviewflutter.k.j.a
                public final void a(Object obj) {
                    m2.e((Void) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(Void r02) {
    }

    @Override // io.flutter.plugins.webviewflutter.p2
    public void a() {
        n2 n2Var = this.f17737h;
        if (n2Var != null) {
            n2Var.h(this, new k.j.a() { // from class: io.flutter.plugins.webviewflutter.k2
                @Override // io.flutter.plugins.webviewflutter.k.j.a
                public final void a(Object obj) {
                    m2.g((Void) obj);
                }
            });
        }
        this.f17737h = null;
    }

    @JavascriptInterface
    public void postMessage(final String str) {
        Runnable runnable = new Runnable() { // from class: io.flutter.plugins.webviewflutter.l2
            @Override // java.lang.Runnable
            public final void run() {
                m2.this.f(str);
            }
        };
        if (this.f17735f.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.f17735f.post(runnable);
        }
    }
}
