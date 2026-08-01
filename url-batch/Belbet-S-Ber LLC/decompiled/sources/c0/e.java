package c0;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import n0.l;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class e extends Activity implements r, l {

    /* renamed from: f, reason: collision with root package name */
    public final t f871f = new t(this);

    @Override // n0.l
    public final boolean b(KeyEvent keyEvent) {
        i3.d.e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        i3.d.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        i3.d.d(decorView, "getDecorView(...)");
        if (b4.d.s(decorView, keyEvent)) {
            return true;
        }
        return b4.d.t(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        i3.d.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        i3.d.d(decorView, "getDecorView(...)");
        if (b4.d.s(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = e0.f708g;
        c0.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        i3.d.e(bundle, "outState");
        this.f871f.g();
        super.onSaveInstanceState(bundle);
    }
}
