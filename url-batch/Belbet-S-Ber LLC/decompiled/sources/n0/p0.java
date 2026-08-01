package n0;

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
import com.gdmhkmf.belbet.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f2816a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Field f2817b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f2818c = false;
    public static final int[] d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: e, reason: collision with root package name */
    public static final b0 f2819e = new b0();

    /* renamed from: f, reason: collision with root package name */
    public static final d0 f2820f = new d0();

    public static t0 a(View view) {
        if (f2816a == null) {
            f2816a = new WeakHashMap();
        }
        t0 t0Var = (t0) f2816a.get(view);
        if (t0Var != null) {
            return t0Var;
        }
        t0 t0Var2 = new t0(view);
        f2816a.put(view, t0Var2);
        return t0Var2;
    }

    public static void b(View view, v1 v1Var) {
        WindowInsets f5 = v1Var.f();
        if (f5 != null) {
            WindowInsets a5 = Build.VERSION.SDK_INT >= 30 ? m0.a(view, f5) : f0.a(view, f5);
            if (a5.equals(f5)) {
                return;
            }
            v1.g(view, a5);
        }
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = o0.d;
        o0 o0Var = (o0) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (o0Var == null) {
            o0Var = new o0();
            o0Var.f2812a = null;
            o0Var.f2813b = null;
            o0Var.f2814c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, o0Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = o0Var.f2812a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = o0.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (o0Var.f2812a == null) {
                            o0Var.f2812a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = o0.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                o0Var.f2812a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    o0Var.f2812a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a5 = o0Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a5 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (o0Var.f2813b == null) {
                    o0Var.f2813b = new SparseArray();
                }
                o0Var.f2813b.put(keyCode, new WeakReference(a5));
            }
        }
        return a5 != null;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return l0.a(view);
        }
        if (f2818c) {
            return null;
        }
        if (f2817b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2817b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2818c = true;
                return null;
            }
        }
        try {
            Object obj = f2817b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2818c = true;
            return null;
        }
    }

    public static CharSequence e(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = k0.a(view);
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

    public static String[] g(l.t tVar) {
        return Build.VERSION.SDK_INT >= 31 ? n0.a(tVar) : (String[]) tVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void h(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z4 = e(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z4) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z4 ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                if (z4) {
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
                    } catch (AbstractMethodError e4) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e4);
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
    public static f i(View view, f fVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + fVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return n0.b(view, fVar);
        }
        r0.h hVar = (r0.h) view.getTag(R.id.tag_on_receive_content_listener);
        q qVar = f2819e;
        if (hVar == null) {
            if (view instanceof q) {
                qVar = (q) view;
            }
            return qVar.a(fVar);
        }
        f a5 = r0.h.a(view, fVar);
        if (a5 == null) {
            return null;
        }
        if (view instanceof q) {
            qVar = (q) view;
        }
        return qVar.a(a5);
    }

    public static void j(View view, int i) {
        ArrayList f5 = f(view);
        for (int i4 = 0; i4 < f5.size(); i4++) {
            if (((o0.c) f5.get(i4)).a() == i) {
                f5.remove(i4);
                return;
            }
        }
    }

    public static void k(View view, o0.c cVar, o0.p pVar) {
        o0.c cVar2 = new o0.c(null, cVar.f2878b, null, pVar, cVar.f2879c);
        View.AccessibilityDelegate d5 = d(view);
        b bVar = d5 == null ? null : d5 instanceof a ? ((a) d5).f2748a : new b(d5);
        if (bVar == null) {
            bVar = new b();
        }
        m(view, bVar);
        j(view, cVar2.a());
        f(view).add(cVar2);
        h(view, 0);
    }

    public static void l(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            l0.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void m(View view, b bVar) {
        if (bVar == null && (d(view) instanceof a)) {
            bVar = new b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(bVar == null ? null : bVar.f2758b);
    }

    public static void n(View view, CharSequence charSequence) {
        new c0(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).d(view, charSequence);
        d0 d0Var = f2820f;
        if (charSequence == null) {
            d0Var.f2769f.remove(view);
            view.removeOnAttachStateChangeListener(d0Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(d0Var);
        } else {
            d0Var.f2769f.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(d0Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(d0Var);
            }
        }
    }

    public static void o(View view, b1.b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(new y0(bVar));
            return;
        }
        PathInterpolator pathInterpolator = x0.f2848e;
        View.OnApplyWindowInsetsListener w0Var = new w0(view, bVar);
        view.setTag(R.id.tag_window_insets_animation_callback, w0Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(w0Var);
        }
    }
}
