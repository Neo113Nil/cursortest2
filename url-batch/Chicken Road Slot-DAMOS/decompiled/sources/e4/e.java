package e4;

import a1.n;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final KeyListener f3862a;

    public e(KeyListener keyListener) {
        this.f3862a = keyListener;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i3) {
        this.f3862a.clearMetaKeyState(view, editable, i3);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f3862a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i3, KeyEvent keyEvent) {
        boolean z10;
        if (i3 != 67 ? i3 != 112 ? false : n.o(editable, keyEvent, true) : n.o(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        return z10 || this.f3862a.onKeyDown(view, editable, i3, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f3862a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i3, KeyEvent keyEvent) {
        return this.f3862a.onKeyUp(view, editable, i3, keyEvent);
    }
}
