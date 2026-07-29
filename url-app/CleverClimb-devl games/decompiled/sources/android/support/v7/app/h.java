package android.support.v7.app;

import android.app.UiModeManager;
import android.content.Context;
import android.support.v7.app.g;
import android.view.ActionMode;
import android.view.Window;

/* compiled from: AppCompatDelegateImplV23.java */
/* loaded from: classes.dex */
class h extends g {
    private final UiModeManager t;

    h(Context context, Window window, c cVar) {
        super(context, window, cVar);
        this.t = (UiModeManager) context.getSystemService("uimode");
    }

    @Override // android.support.v7.app.g, android.support.v7.app.e
    Window.Callback a(Window.Callback callback) {
        return new a(callback);
    }

    @Override // android.support.v7.app.g
    int d(int i) {
        if (i == 0 && this.t.getNightMode() == 0) {
            return -1;
        }
        return super.d(i);
    }

    /* compiled from: AppCompatDelegateImplV23.java */
    class a extends g.a {
        @Override // android.support.v7.app.g.a, android.support.v7.view.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        a(Window.Callback callback) {
            super(callback);
        }

        @Override // android.support.v7.view.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (h.this.p() && i == 0) {
                return a(callback);
            }
            return super.onWindowStartingActionMode(callback, i);
        }
    }
}
