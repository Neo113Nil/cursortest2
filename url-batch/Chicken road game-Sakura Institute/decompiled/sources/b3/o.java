package b3;

import android.view.View;
import com.android.installreferrer.R;
import java.util.Objects;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class o {
    public static void a(View view, q qVar) {
        i.g0 g0Var = (i.g0) view.getTag(R.id.tag_unhandled_key_listeners);
        if (g0Var == null) {
            g0Var = new i.g0(0);
            view.setTag(R.id.tag_unhandled_key_listeners, g0Var);
        }
        Objects.requireNonNull(qVar);
        View.OnUnhandledKeyEventListener nVar = new n();
        g0Var.put(qVar, nVar);
        view.addOnUnhandledKeyEventListener(nVar);
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

    public static void e(View view, q qVar) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        i.g0 g0Var = (i.g0) view.getTag(R.id.tag_unhandled_key_listeners);
        if (g0Var == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) g0Var.get(qVar)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i7) {
        return (T) view.requireViewById(i7);
    }

    public static void g(View view, boolean z8) {
        view.setAccessibilityHeading(z8);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, d3.a aVar) {
        view.setAutofillId(null);
    }

    public static void j(View view, boolean z8) {
        view.setScreenReaderFocusable(z8);
    }
}
