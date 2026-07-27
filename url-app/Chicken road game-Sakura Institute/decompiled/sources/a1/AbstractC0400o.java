package a1;

import android.view.View;
import c1.AbstractC0536a;
import com.chicken.road.kedro.laqer.R;
import java.util.Objects;

/* renamed from: a1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0400o {
    public static void a(View view, InterfaceC0402q interfaceC0402q) {
        i.G g4 = (i.G) view.getTag(R.id.tag_unhandled_key_listeners);
        if (g4 == null) {
            g4 = new i.G(0);
            view.setTag(R.id.tag_unhandled_key_listeners, g4);
        }
        Objects.requireNonNull(interfaceC0402q);
        View.OnUnhandledKeyEventListener viewOnUnhandledKeyEventListenerC0399n = new ViewOnUnhandledKeyEventListenerC0399n();
        g4.put(interfaceC0402q, viewOnUnhandledKeyEventListenerC0399n);
        view.addOnUnhandledKeyEventListener(viewOnUnhandledKeyEventListenerC0399n);
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

    public static void e(View view, InterfaceC0402q interfaceC0402q) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        i.G g4 = (i.G) view.getTag(R.id.tag_unhandled_key_listeners);
        if (g4 == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) g4.get(interfaceC0402q)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i2) {
        return (T) view.requireViewById(i2);
    }

    public static void g(View view, boolean z4) {
        view.setAccessibilityHeading(z4);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, AbstractC0536a abstractC0536a) {
        view.setAutofillId(null);
    }

    public static void j(View view, boolean z4) {
        view.setScreenReaderFocusable(z4);
    }
}
