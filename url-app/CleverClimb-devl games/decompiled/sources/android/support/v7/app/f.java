package android.support.v7.app;

import android.content.Context;
import android.support.v7.app.AppCompatDelegateImplV9;
import android.support.v7.app.h;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* compiled from: AppCompatDelegateImplN.java */
/* loaded from: classes.dex */
class f extends h {
    f(Context context, Window window, c cVar) {
        super(context, window, cVar);
    }

    @Override // android.support.v7.app.h, android.support.v7.app.g, android.support.v7.app.e
    Window.Callback a(Window.Callback callback) {
        return new a(callback);
    }

    /* compiled from: AppCompatDelegateImplN.java */
    class a extends h.a {
        a(Window.Callback callback) {
            super(callback);
        }

        @Override // android.support.v7.view.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            AppCompatDelegateImplV9.PanelFeatureState a2 = f.this.a(0, true);
            if (a2 != null && a2.j != null) {
                super.onProvideKeyboardShortcuts(list, a2.j, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i);
            }
        }
    }
}
