package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import com.majelw.libystne.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class e53 {
    public static WeakHashMap a = null;
    public static Field b = null;
    public static boolean c = false;
    public static final s43 d = new s43();
    public static final u43 e = new u43();

    public static w53 a(View view) {
        if (a == null) {
            a = new WeakHashMap();
        }
        w53 w53Var = (w53) a.get(view);
        if (w53Var != null) {
            return w53Var;
        }
        w53 w53Var2 = new w53(view);
        a.put(view, w53Var2);
        return w53Var2;
    }

    public static void b(View view, c83 c83Var) {
        WindowInsets b2 = c83Var.b();
        if (b2 != null) {
            WindowInsets a2 = Build.VERSION.SDK_INT >= 30 ? b53.a(view, b2) : v43.a(view, b2);
            if (a2.equals(b2)) {
                return;
            }
            c83.c(view, a2);
        }
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = d53.d;
        d53 d53Var = (d53) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (d53Var == null) {
            d53Var = new d53();
            d53Var.a = null;
            d53Var.b = null;
            d53Var.c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, d53Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = d53Var.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = d53.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (d53Var.a == null) {
                            d53Var.a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = d53.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                d53Var.a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    d53Var.a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a2 = d53Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (d53Var.b == null) {
                    d53Var.b = new SparseArray();
                }
                d53Var.b.put(keyCode, new WeakReference(a2));
            }
        }
        return a2 != null;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return a53.a(view);
        }
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static String[] e(vf vfVar) {
        return Build.VERSION.SDK_INT >= 31 ? c53.a(vfVar) : (String[]) vfVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void f(View view, int i) {
        Object tag;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i2 = Build.VERSION.SDK_INT;
            CharSequence charSequence = null;
            if (i2 >= 28) {
                tag = z43.a(view);
            } else {
                tag = view.getTag(R.id.tag_accessibility_pane_title);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            boolean z = ((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                if (z) {
                    List<CharSequence> text = obtain.getText();
                    if (i2 >= 28) {
                        charSequence = z43.a(view);
                    } else {
                        Object tag2 = view.getTag(R.id.tag_accessibility_pane_title);
                        if (CharSequence.class.isInstance(tag2)) {
                            charSequence = tag2;
                        }
                    }
                    text.add(charSequence);
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(i);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            List<CharSequence> text2 = obtain2.getText();
            if (i2 >= 28) {
                charSequence = z43.a(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_accessibility_pane_title);
                if (CharSequence.class.isInstance(tag3)) {
                    charSequence = tag3;
                }
            }
            text2.add(charSequence);
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static n20 g(View view, n20 n20Var) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + n20Var + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return c53.b(view, n20Var);
        }
        vw2 vw2Var = (vw2) view.getTag(R.id.tag_on_receive_content_listener);
        cv1 cv1Var = d;
        if (vw2Var == null) {
            if (view instanceof cv1) {
                cv1Var = (cv1) view;
            }
            return cv1Var.a(n20Var);
        }
        n20 a2 = vw2.a(view, n20Var);
        if (a2 == null) {
            return null;
        }
        if (view instanceof cv1) {
            cv1Var = (cv1) view;
        }
        return cv1Var.a(a2);
    }

    public static void h(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            a53.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void i(View view, u1 u1Var) {
        if (u1Var == null && (d(view) instanceof t1)) {
            u1Var = new u1();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(u1Var == null ? null : u1Var.b);
    }

    public static void j(View view, CharSequence charSequence) {
        new t43(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).f(view, charSequence);
        u43 u43Var = e;
        if (charSequence == null) {
            u43Var.m.remove(view);
            view.removeOnAttachStateChangeListener(u43Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(u43Var);
        } else {
            u43Var.m.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(u43Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(u43Var);
            }
        }
    }

    public static void k(View view, iv ivVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            g73.h(view, ivVar);
            return;
        }
        PathInterpolator pathInterpolator = d73.e;
        View.OnApplyWindowInsetsListener c73Var = ivVar != null ? new c73(view, ivVar) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, c73Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(c73Var);
        }
    }
}
