package h1;

import android.view.KeyEvent;
import android.view.View;

/* renamed from: h1.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnKeyListenerC2459u implements View.OnKeyListener {
    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
        return i4 == 4 && keyEvent.getAction() == 1;
    }
}
