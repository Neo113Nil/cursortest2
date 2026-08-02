package defpackage;

import android.content.Context;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.google.android.apps.authenticator2.R;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ym {
    static CharSequence a(View view) {
        CharSequence accessibilityPaneTitle;
        accessibilityPaneTitle = view.getAccessibilityPaneTitle();
        return accessibilityPaneTitle;
    }

    static void b(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    static void c(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    static void d(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }

    static boolean e(View view) {
        boolean isAccessibilityHeading;
        isAccessibilityHeading = view.isAccessibilityHeading();
        return isAccessibilityHeading;
    }

    static boolean f(View view) {
        boolean isScreenReaderFocusable;
        isScreenReaderFocusable = view.isScreenReaderFocusable();
        return isScreenReaderFocusable;
    }

    public static agd i(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                Objects.toString(cls);
                throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()));
            }
            try {
                Object newInstance = declaredConstructor.newInstance(null);
                newInstance.getClass();
                return (agd) newInstance;
            } catch (IllegalAccessException e) {
                Objects.toString(cls);
                throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e);
            } catch (InstantiationException e2) {
                Objects.toString(cls);
                throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e2);
            }
        } catch (NoSuchMethodException e3) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e3);
        }
    }

    public static void j(View view, agl aglVar) {
        view.getClass();
        view.setTag(R.id.view_tree_view_model_store_owner, aglVar);
    }

    public static Interpolator r(Context context, int i) {
        Interpolator loadInterpolator = AnimationUtils.loadInterpolator(context, i);
        a.v(loadInterpolator, "Failed to parse interpolator, no start tag found");
        return loadInterpolator;
    }

    public boolean k(int i) {
        throw null;
    }

    public aqz l() {
        throw null;
    }

    public aqz m() {
        throw null;
    }

    public aqz n() {
        throw null;
    }

    public aqz o() {
        throw null;
    }

    public boolean p() {
        return false;
    }

    public boolean q(int[] iArr) {
        return false;
    }

    public void g(boolean z) {
    }

    public void h(boolean z) {
    }
}
