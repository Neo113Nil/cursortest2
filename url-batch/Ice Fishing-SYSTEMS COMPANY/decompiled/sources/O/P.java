package O;

import android.view.View;
import com.icefishing.icefishingliveapp.C5284R;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class P {
    public static void a(View view, V v6) {
        s.k kVar = (s.k) view.getTag(C5284R.id.tag_unhandled_key_listeners);
        if (kVar == null) {
            kVar = new s.k();
            view.setTag(C5284R.id.tag_unhandled_key_listeners, kVar);
        }
        Objects.requireNonNull(v6);
        View.OnUnhandledKeyEventListener o9 = new O();
        kVar.put(v6, o9);
        view.addOnUnhandledKeyEventListener(o9);
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

    public static void e(View view, V v6) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        s.k kVar = (s.k) view.getTag(C5284R.id.tag_unhandled_key_listeners);
        if (kVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) kVar.getOrDefault(v6, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i) {
        return (T) view.requireViewById(i);
    }

    public static void g(View view, boolean z8) {
        view.setAccessibilityHeading(z8);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, R.a aVar) {
        view.setAutofillId(null);
    }

    public static void j(View view, boolean z8) {
        view.setScreenReaderFocusable(z8);
    }
}
