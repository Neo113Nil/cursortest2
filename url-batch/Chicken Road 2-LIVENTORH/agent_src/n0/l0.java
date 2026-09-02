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
import com.oriondriftchasers.arordrft.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f2757a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Field f2758b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f2759c = false;
    public static final int[] d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: e, reason: collision with root package name */
    public static final x f2760e = new x();

    /* renamed from: f, reason: collision with root package name */
    public static final z f2761f = new z();

    public static p0 a(View view) {
        if (f2757a == null) {
            f2757a = new WeakHashMap();
        }
        p0 p0Var = (p0) f2757a.get(view);
        if (p0Var != null) {
            return p0Var;
        }
        p0 p0Var2 = new p0(view);
        f2757a.put(view, p0Var2);
        return p0Var2;
    }

    public static void b(View view, q1 q1Var) {
        int i = Build.VERSION.SDK_INT;
        WindowInsets f2 = q1Var.f();
        if (f2 != null) {
            WindowInsets a2 = i >= 30 ? i0.a(view, f2) : b0.a(view, f2);
            if (a2.equals(f2)) {
                return;
            }
            q1.g(view, a2);
        }
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = k0.d;
        k0 k0Var = (k0) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (k0Var == null) {
            k0Var = new k0();
            k0Var.f2753a = null;
            k0Var.f2754b = null;
            k0Var.f2755c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, k0Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = k0Var.f2753a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = k0.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (k0Var.f2753a == null) {
                            k0Var.f2753a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = k0.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                k0Var.f2753a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    k0Var.f2753a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a2 = k0Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (k0Var.f2754b == null) {
                    k0Var.f2754b = new SparseArray();
                }
                k0Var.f2754b.put(keyCode, new WeakReference(a2));
            }
        }
        return a2 != null;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return h0.a(view);
        }
        if (f2759c) {
            return null;
        }
        if (f2758b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2758b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2759c = true;
                return null;
            }
        }
        try {
            Object obj = f2758b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2759c = true;
            return null;
        }
    }

    public static CharSequence e(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = g0.a(view);
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

    public static String[] g(l.w wVar) {
        return Build.VERSION.SDK_INT >= 31 ? j0.a(wVar) : (String[]) wVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void h(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z3 = e(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z3) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z3 ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                if (z3) {
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
            return j0.b(view, fVar);
        }
        r0.i iVar = (r0.i) view.getTag(R.id.tag_on_receive_content_listener);
        o oVar = f2760e;
        if (iVar == null) {
            if (view instanceof o) {
                oVar = (o) view;
            }
            return oVar.a(fVar);
        }
        f a2 = r0.i.a(view, fVar);
        if (a2 == null) {
            return null;
        }
        if (view instanceof o) {
            oVar = (o) view;
        }
        return oVar.a(a2);
    }

    public static void j(View view, int i) {
        ArrayList f2 = f(view);
        for (int i4 = 0; i4 < f2.size(); i4++) {
            if (((o0.c) f2.get(i4)).a() == i) {
                f2.remove(i4);
                return;
            }
        }
    }

    public static void k(View view, o0.c cVar, o0.o oVar) {
        o0.c cVar2 = new o0.c(null, cVar.f2858b, null, oVar, cVar.f2859c);
        View.AccessibilityDelegate d3 = d(view);
        b bVar = d3 == null ? null : d3 instanceof a ? ((a) d3).f2709a : new b(d3);
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
            h0.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void m(View view, b bVar) {
        if (bVar == null && (d(view) instanceof a)) {
            bVar = new b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(bVar == null ? null : bVar.f2715b);
    }

    public static void n(View view, CharSequence charSequence) {
        new y(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).d(view, charSequence);
        z zVar = f2761f;
        if (charSequence == null) {
            zVar.f2804f.remove(view);
            view.removeOnAttachStateChangeListener(zVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(zVar);
        } else {
            zVar.f2804f.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(zVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(zVar);
            }
        }
    }

    public static void o(View view, a1.b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(new v0(bVar));
            return;
        }
        PathInterpolator pathInterpolator = u0.f2784e;
        View.OnApplyWindowInsetsListener t0Var = new t0(view, bVar);
        view.setTag(R.id.tag_window_insets_animation_callback, t0Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(t0Var);
        }
    }
}
