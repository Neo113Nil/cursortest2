package W;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import u0.C0372k;

/* loaded from: classes.dex */
public final class e implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final KeyListener f1255a;

    /* renamed from: b, reason: collision with root package name */
    public final R0.e f1256b;

    public e(KeyListener keyListener) {
        R0.e eVar = new R0.e(13);
        this.f1255a = keyListener;
        this.f1256b = eVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f1255a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f1255a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean z2;
        this.f1256b.getClass();
        if (i != 67 ? i != 112 ? false : C0372k.a(editable, keyEvent, true) : C0372k.a(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z2 = true;
        } else {
            z2 = false;
        }
        return z2 || this.f1255a.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f1255a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f1255a.onKeyUp(view, editable, i, keyEvent);
    }
}
