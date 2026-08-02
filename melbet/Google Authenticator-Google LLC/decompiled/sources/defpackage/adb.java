package defpackage;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adb implements KeyListener {
    private final KeyListener a;

    public adb(KeyListener keyListener) {
        this.a = keyListener;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.a.getInputType();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022 A[RETURN] */
    @Override // android.text.method.KeyListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean b;
        if (i != 67) {
            if (i == 112) {
                b = yg.b(editable, keyEvent, true);
            }
            return !this.a.onKeyDown(view, editable, i, keyEvent);
        }
        b = yg.b(editable, keyEvent, false);
        if (b) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        }
        if (!this.a.onKeyDown(view, editable, i, keyEvent)) {
        }
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.a.onKeyUp(view, editable, i, keyEvent);
    }
}
