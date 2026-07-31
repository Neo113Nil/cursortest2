package a1;

import android.view.View;
import com.gates.olympus.miruv.R;
import j.C0480F;
import java.util.Objects;

/* renamed from: a1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0175m {
    public static void a(View view, InterfaceC0177o interfaceC0177o) {
        C0480F c0480f = (C0480F) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c0480f == null) {
            c0480f = new C0480F();
            view.setTag(R.id.tag_unhandled_key_listeners, c0480f);
        }
        Objects.requireNonNull(interfaceC0177o);
        View.OnUnhandledKeyEventListener viewOnUnhandledKeyEventListenerC0174l = new ViewOnUnhandledKeyEventListenerC0174l();
        c0480f.put(interfaceC0177o, viewOnUnhandledKeyEventListenerC0174l);
        view.addOnUnhandledKeyEventListener(viewOnUnhandledKeyEventListenerC0174l);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, InterfaceC0177o interfaceC0177o) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        C0480F c0480f = (C0480F) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c0480f == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c0480f.get(interfaceC0177o)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i3) {
        return (T) view.requireViewById(i3);
    }

    public static void g(View view, boolean z3) {
        view.setAccessibilityHeading(z3);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, c1.a aVar) {
        view.setAutofillId(null);
    }

    public static void j(View view, boolean z3) {
        view.setScreenReaderFocusable(z3);
    }
}
