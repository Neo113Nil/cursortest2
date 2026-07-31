package io.flutter.plugins.webviewflutter;

import android.os.Handler;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* loaded from: classes.dex */
final class q2 extends View {

    /* renamed from: f, reason: collision with root package name */
    final Handler f17763f;

    /* renamed from: g, reason: collision with root package name */
    final IBinder f17764g;

    /* renamed from: h, reason: collision with root package name */
    final View f17765h;

    /* renamed from: i, reason: collision with root package name */
    final View f17766i;

    /* renamed from: j, reason: collision with root package name */
    final View f17767j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f17768k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f17769l;

    /* renamed from: m, reason: collision with root package name */
    private InputConnection f17770m;

    q2(View view, View view2, Handler handler) {
        super(view.getContext());
        this.f17768k = true;
        this.f17769l = false;
        this.f17763f = handler;
        this.f17765h = view;
        this.f17767j = view2;
        this.f17764g = view.getWindowToken();
        this.f17766i = view.getRootView();
        setFocusable(true);
        setFocusableInTouchMode(true);
        setVisibility(0);
    }

    void a(boolean z6) {
        this.f17769l = z6;
    }

    @Override // android.view.View
    public boolean checkInputConnectionProxy(View view) {
        return true;
    }

    @Override // android.view.View
    public Handler getHandler() {
        return this.f17763f;
    }

    @Override // android.view.View
    public View getRootView() {
        return this.f17766i;
    }

    @Override // android.view.View
    public IBinder getWindowToken() {
        return this.f17764g;
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return true;
    }

    @Override // android.view.View
    public boolean isFocused() {
        return true;
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        return true;
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        this.f17768k = false;
        InputConnection onCreateInputConnection = this.f17769l ? this.f17770m : this.f17767j.onCreateInputConnection(editorInfo);
        this.f17768k = true;
        this.f17770m = onCreateInputConnection;
        return onCreateInputConnection;
    }
}
