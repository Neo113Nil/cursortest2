package t0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.s;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class e implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final KeyListener f3369a;

    /* renamed from: b, reason: collision with root package name */
    public final g2.f f3370b;

    public e(KeyListener keyListener) {
        g2.f fVar = new g2.f(25);
        this.f3369a = keyListener;
        this.f3370b = fVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i4) {
        this.f3369a.clearMetaKeyState(view, editable, i4);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f3369a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i4, KeyEvent keyEvent) {
        boolean z3;
        this.f3370b.getClass();
        if (i4 != 67 ? i4 != 112 ? false : s.c(editable, keyEvent, true) : s.c(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z3 = true;
        } else {
            z3 = false;
        }
        return z3 || this.f3369a.onKeyDown(view, editable, i4, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f3369a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i4, KeyEvent keyEvent) {
        return this.f3369a.onKeyUp(view, editable, i4, keyEvent);
    }
}
