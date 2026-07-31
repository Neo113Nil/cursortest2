package D;

import android.view.View;
import com.strategylink.Row.Five.R;
import java.util.Objects;
import q.C0591k;

/* renamed from: D.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0111y {
    public static void a(View view, B b7) {
        C0591k c0591k = (C0591k) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c0591k == null) {
            c0591k = new C0591k();
            view.setTag(R.id.tag_unhandled_key_listeners, c0591k);
        }
        Objects.requireNonNull(b7);
        View.OnUnhandledKeyEventListener viewOnUnhandledKeyEventListenerC0110x = new ViewOnUnhandledKeyEventListenerC0110x();
        c0591k.put(b7, viewOnUnhandledKeyEventListenerC0110x);
        view.addOnUnhandledKeyEventListener(viewOnUnhandledKeyEventListenerC0110x);
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

    public static void e(View view, B b7) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        C0591k c0591k = (C0591k) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c0591k == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c0591k.getOrDefault(b7, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i7) {
        return (T) view.requireViewById(i7);
    }

    public static void g(View view, boolean z5) {
        view.setAccessibilityHeading(z5);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, F.a aVar) {
        view.setAutofillId(null);
    }

    public static void j(View view, boolean z5) {
        view.setScreenReaderFocusable(z5);
    }
}
