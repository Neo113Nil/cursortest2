package j;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.b;
import androidx.lifecycle.e;
import androidx.lifecycle.s;

/* loaded from: classes.dex */
public class c extends Activity implements androidx.lifecycle.i, b.a {

    /* renamed from: f, reason: collision with root package name */
    private h.e<Class<Object>, Object> f17980f = new h.e<>();

    /* renamed from: g, reason: collision with root package name */
    private androidx.lifecycle.j f17981g = new androidx.lifecycle.j(this);

    @Override // androidx.core.view.b.a
    public boolean b(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !androidx.core.view.b.d(decorView, keyEvent)) {
            return androidx.core.view.b.e(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !androidx.core.view.b.d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        s.g(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        this.f17981g.j(e.c.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
