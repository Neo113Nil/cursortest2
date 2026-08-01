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
import com.moontiko.really.admiralcasino.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class ic0 {
    public static WeakHashMap a = null;
    public static Field b = null;
    public static boolean c = false;
    public static final int[] d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final vb0 e = new vb0();
    public static final xb0 f = new xb0();

    public static wc0 a(View view) {
        if (a == null) {
            a = new WeakHashMap();
        }
        wc0 wc0Var = (wc0) a.get(view);
        if (wc0Var != null) {
            return wc0Var;
        }
        wc0 wc0Var2 = new wc0(view);
        a.put(view, wc0Var2);
        return wc0Var2;
    }

    public static void b(View view, ye0 ye0Var) {
        WindowInsets f2 = ye0Var.f();
        if (f2 != null) {
            WindowInsets a2 = Build.VERSION.SDK_INT >= 30 ? fc0.a(view, f2) : yb0.a(view, f2);
            if (a2.equals(f2)) {
                return;
            }
            ye0.g(view, a2);
        }
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = hc0.d;
        hc0 hc0Var = (hc0) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (hc0Var == null) {
            hc0Var = new hc0();
            hc0Var.a = null;
            hc0Var.b = null;
            hc0Var.c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, hc0Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = hc0Var.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = hc0.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (hc0Var.a == null) {
                            hc0Var.a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = hc0.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                hc0Var.a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    hc0Var.a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a2 = hc0Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (hc0Var.b == null) {
                    hc0Var.b = new SparseArray();
                }
                hc0Var.b.put(keyCode, new WeakReference(a2));
            }
        }
        return a2 != null;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return ec0.a(view);
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

    public static CharSequence e(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = dc0.a(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] g(t4 t4Var) {
        return Build.VERSION.SDK_INT >= 31 ? gc0.a(t4Var) : (String[]) t4Var.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void h(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = e(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                if (z) {
                    obtain.getText().add(e(view));
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
            obtain2.getText().add(e(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ie i(View view, ie ieVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + ieVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return gc0.b(view, ieVar);
        }
        x80 x80Var = (x80) view.getTag(R.id.tag_on_receive_content_listener);
        kz kzVar = e;
        if (x80Var == null) {
            if (view instanceof kz) {
                kzVar = (kz) view;
            }
            return kzVar.a(ieVar);
        }
        ie a2 = x80.a(view, ieVar);
        if (a2 == null) {
            return null;
        }
        if (view instanceof kz) {
            kzVar = (kz) view;
        }
        return kzVar.a(a2);
    }

    public static void j(View view, int i) {
        ArrayList f2 = f(view);
        for (int i2 = 0; i2 < f2.size(); i2++) {
            if (((e0) f2.get(i2)).a() == i) {
                f2.remove(i2);
                return;
            }
        }
    }

    public static void k(View view, e0 e0Var, t0 t0Var) {
        e0 e0Var2 = new e0(null, e0Var.b, null, t0Var, e0Var.c);
        View.AccessibilityDelegate d2 = d(view);
        y yVar = d2 == null ? null : d2 instanceof x ? ((x) d2).a : new y(d2);
        if (yVar == null) {
            yVar = new y();
        }
        m(view, yVar);
        j(view, e0Var2.a());
        f(view).add(e0Var2);
        h(view, 0);
    }

    public static void l(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            ec0.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void m(View view, y yVar) {
        if (yVar == null && (d(view) instanceof x)) {
            yVar = new y();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(yVar == null ? null : yVar.b);
    }

    public static void n(View view, CharSequence charSequence) {
        new wb0(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).d(view, charSequence);
        xb0 xb0Var = f;
        if (charSequence == null) {
            xb0Var.f.remove(view);
            view.removeOnAttachStateChangeListener(xb0Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(xb0Var);
        } else {
            xb0Var.f.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(xb0Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(xb0Var);
            }
        }
    }

    public static void o(View view, nf nfVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(new be0(nfVar));
            return;
        }
        PathInterpolator pathInterpolator = ae0.e;
        View.OnApplyWindowInsetsListener zd0Var = new zd0(view, nfVar);
        view.setTag(R.id.tag_window_insets_animation_callback, zd0Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(zd0Var);
        }
    }
}
