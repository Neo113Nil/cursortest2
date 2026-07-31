package io.flutter.plugins.webviewflutter;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.ListPopupWindow;

/* loaded from: classes.dex */
class g2 extends WebView {

    /* renamed from: f, reason: collision with root package name */
    private View f17655f;

    /* renamed from: g, reason: collision with root package name */
    private q2 f17656g;

    /* renamed from: h, reason: collision with root package name */
    private View f17657h;

    class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f17658f;

        a(View view) {
            this.f17658f = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g2.this.f17657h == null) {
                Log.e("InputAwareWebView", "Can't set the input connection target because there is no containerView to use as a handler.");
                return;
            }
            InputMethodManager inputMethodManager = (InputMethodManager) g2.this.getContext().getSystemService("input_method");
            this.f17658f.onWindowFocusChanged(true);
            inputMethodManager.isActive(g2.this.f17657h);
        }
    }

    g2(Context context, View view) {
        super(context);
        this.f17657h = view;
    }

    private boolean c() {
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (stackTraceElement.getClassName().equals(ListPopupWindow.class.getCanonicalName()) && stackTraceElement.getMethodName().equals("show")) {
                return true;
            }
        }
        return false;
    }

    private void j() {
        if (this.f17656g == null) {
            return;
        }
        View view = this.f17657h;
        if (view == null) {
            Log.e("InputAwareWebView", "Can't reset the input connection to the container view because there is none.");
        } else {
            setInputConnectionTarget(view);
        }
    }

    @Override // android.view.View
    public boolean checkInputConnectionProxy(View view) {
        View view2 = this.f17655f;
        this.f17655f = view;
        if (view2 == view) {
            return super.checkInputConnectionProxy(view);
        }
        View view3 = this.f17657h;
        if (view3 == null) {
            Log.e("InputAwareWebView", "Can't create a proxy view because there's no container view. Text input may not work.");
        } else {
            q2 q2Var = new q2(view3, view, view.getHandler());
            this.f17656g = q2Var;
            setInputConnectionTarget(q2Var);
        }
        return super.checkInputConnectionProxy(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        super.clearFocus();
        j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        j();
    }

    void i() {
        q2 q2Var = this.f17656g;
        if (q2Var == null) {
            return;
        }
        q2Var.a(true);
    }

    void k() {
        q2 q2Var = this.f17656g;
        if (q2Var == null) {
            return;
        }
        q2Var.a(false);
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onFocusChanged(boolean z6, int i7, Rect rect) {
        if (Build.VERSION.SDK_INT >= 28 || !c() || z6) {
            super.onFocusChanged(z6, i7, rect);
        }
    }

    void setContainerView(View view) {
        this.f17657h = view;
        if (this.f17656g == null) {
            return;
        }
        Log.w("InputAwareWebView", "The containerView has changed while the proxyAdapterView exists.");
        if (view != null) {
            setInputConnectionTarget(this.f17656g);
        }
    }

    void setInputConnectionTarget(View view) {
        if (this.f17657h == null) {
            Log.e("InputAwareWebView", "Can't set the input connection target because there is no containerView to use as a handler.");
        } else {
            view.requestFocus();
            this.f17657h.post(new a(view));
        }
    }
}
