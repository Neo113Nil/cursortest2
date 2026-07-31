package c1;

import android.view.View;
import com.gatesof.olympus.martu.marku.R;
import e1.AbstractC0421a;
import j.C0524F;
import java.util.Objects;

/* renamed from: c1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0391o {
    public static void a(View view, InterfaceC0393q interfaceC0393q) {
        C0524F c0524f = (C0524F) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c0524f == null) {
            c0524f = new C0524F();
            view.setTag(R.id.tag_unhandled_key_listeners, c0524f);
        }
        Objects.requireNonNull(interfaceC0393q);
        View.OnUnhandledKeyEventListener viewOnUnhandledKeyEventListenerC0390n = new ViewOnUnhandledKeyEventListenerC0390n();
        c0524f.put(interfaceC0393q, viewOnUnhandledKeyEventListenerC0390n);
        view.addOnUnhandledKeyEventListener(viewOnUnhandledKeyEventListenerC0390n);
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

    public static void e(View view, InterfaceC0393q interfaceC0393q) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        C0524F c0524f = (C0524F) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c0524f == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c0524f.get(interfaceC0393q)) == null) {
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

    public static void i(View view, AbstractC0421a abstractC0421a) {
        view.setAutofillId(null);
    }

    public static void j(View view, boolean z3) {
        view.setScreenReaderFocusable(z3);
    }
}
