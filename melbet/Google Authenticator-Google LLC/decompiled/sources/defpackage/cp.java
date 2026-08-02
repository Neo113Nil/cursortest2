package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cp extends Activity implements aer, xj {
    private final ael a;

    public cp() {
        new qy(0);
        this.a = new ael(this);
    }

    public ael L() {
        return this.a;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        getWindow().getDecorView().getClass();
        int i = yq.a;
        return yg.f(this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        getWindow().getDecorView().getClass();
        int i = yq.a;
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // defpackage.xj
    public final boolean g(KeyEvent keyEvent) {
        keyEvent.getClass();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = afp.b;
        afn.c(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        this.a.d(aek.c);
        super.onSaveInstanceState(bundle);
    }
}
