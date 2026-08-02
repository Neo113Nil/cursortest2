package A;

import android.view.View;
import com.neptunesoft.languesbacdz.R;
import java.util.Objects;
import n.C0276i;

/* renamed from: A.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0020v {
    public static void a(View view, y yVar) {
        C0276i c0276i = (C0276i) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c0276i == null) {
            c0276i = new C0276i();
            view.setTag(R.id.tag_unhandled_key_listeners, c0276i);
        }
        Objects.requireNonNull(yVar);
        View.OnUnhandledKeyEventListener viewOnUnhandledKeyEventListenerC0019u = new ViewOnUnhandledKeyEventListenerC0019u();
        c0276i.put(yVar, viewOnUnhandledKeyEventListenerC0019u);
        view.addOnUnhandledKeyEventListener(viewOnUnhandledKeyEventListenerC0019u);
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

    public static void e(View view, y yVar) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        C0276i c0276i = (C0276i) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c0276i == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c0276i.getOrDefault(yVar, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i2) {
        return (T) view.requireViewById(i2);
    }

    public static void g(View view, boolean z2) {
        view.setAccessibilityHeading(z2);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, C.a aVar) {
        view.setAutofillId(null);
    }

    public static void j(View view, boolean z2) {
        view.setScreenReaderFocusable(z2);
    }
}
