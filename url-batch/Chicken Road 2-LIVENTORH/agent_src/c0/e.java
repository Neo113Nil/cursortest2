package c0;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import n0.i;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class e extends Activity implements r, i {

    /* renamed from: f, reason: collision with root package name */
    public final t f754f = new t(this);

    @Override // n0.i
    public final boolean c(KeyEvent keyEvent) {
        f3.d.e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        f3.d.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        f3.d.d(decorView, "getDecorView(...)");
        if (h.a.q(decorView, keyEvent)) {
            return true;
        }
        return h.a.r(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        f3.d.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        f3.d.d(decorView, "getDecorView(...)");
        if (h.a.q(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = e0.f604g;
        c0.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        f3.d.e(bundle, "outState");
        this.f754f.g();
        super.onSaveInstanceState(bundle);
    }
}
