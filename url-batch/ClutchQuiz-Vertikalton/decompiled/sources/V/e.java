package V;

import K.C0012m;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class e implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final KeyListener f874a;

    /* renamed from: b, reason: collision with root package name */
    public final O0.e f875b;

    public e(KeyListener keyListener) {
        O0.e eVar = new O0.e(13);
        this.f874a = keyListener;
        this.f875b = eVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f874a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f874a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean z2;
        this.f875b.getClass();
        if (i != 67 ? i != 112 ? false : C0012m.c(editable, keyEvent, true) : C0012m.c(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z2 = true;
        } else {
            z2 = false;
        }
        return z2 || this.f874a.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f874a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f874a.onKeyUp(view, editable, i, keyEvent);
    }
}
