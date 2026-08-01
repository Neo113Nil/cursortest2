package k0;

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
import com.gglhk.bofio.fortunetiger.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f2752a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Field f2753b = null;
    public static boolean c = false;

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f2754d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: e, reason: collision with root package name */
    public static final v f2755e = new v();

    /* renamed from: f, reason: collision with root package name */
    public static final x f2756f = new x();

    public static l0 a(View view) {
        if (f2752a == null) {
            f2752a = new WeakHashMap();
        }
        l0 l0Var = (l0) f2752a.get(view);
        if (l0Var != null) {
            return l0Var;
        }
        l0 l0Var2 = new l0(view);
        f2752a.put(view, l0Var2);
        return l0Var2;
    }

    public static void b(View view, m1 m1Var) {
        int i4 = Build.VERSION.SDK_INT;
        WindowInsets f4 = m1Var.f();
        if (f4 != null) {
            WindowInsets a4 = i4 >= 30 ? g0.a(view, f4) : z.a(view, f4);
            if (a4.equals(f4)) {
                return;
            }
            m1.g(view, a4);
        }
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = i0.f2743d;
        i0 i0Var = (i0) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (i0Var == null) {
            i0Var = new i0();
            i0Var.f2744a = null;
            i0Var.f2745b = null;
            i0Var.c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, i0Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = i0Var.f2744a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = i0.f2743d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (i0Var.f2744a == null) {
                            i0Var.f2744a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = i0.f2743d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                i0Var.f2744a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    i0Var.f2744a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a4 = i0Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a4 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (i0Var.f2745b == null) {
                    i0Var.f2745b = new SparseArray();
                }
                i0Var.f2745b.put(keyCode, new WeakReference(a4));
            }
        }
        return a4 != null;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return f0.a(view);
        }
        if (c) {
            return null;
        }
        if (f2753b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2753b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = f2753b.get(view);
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
            tag = e0.a(view);
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

    public static String[] g(k.u uVar) {
        return Build.VERSION.SDK_INT >= 31 ? h0.a(uVar) : (String[]) uVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void h(View view, int i4) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z3 = e(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z3) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z3 ? 32 : 2048);
                obtain.setContentChangeTypes(i4);
                if (z3) {
                    obtain.getText().add(e(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i4 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i4);
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
            obtain2.setContentChangeTypes(i4);
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
            return h0.b(view, fVar);
        }
        o0.i iVar = (o0.i) view.getTag(R.id.tag_on_receive_content_listener);
        n nVar = f2755e;
        if (iVar == null) {
            if (view instanceof n) {
                nVar = (n) view;
            }
            return nVar.a(fVar);
        }
        f a4 = o0.i.a(view, fVar);
        if (a4 == null) {
            return null;
        }
        if (view instanceof n) {
            nVar = (n) view;
        }
        return nVar.a(a4);
    }

    public static void j(View view, int i4) {
        ArrayList f4 = f(view);
        for (int i5 = 0; i5 < f4.size(); i5++) {
            if (((l0.d) f4.get(i5)).a() == i4) {
                f4.remove(i5);
                return;
            }
        }
    }

    public static void k(View view, l0.d dVar, l0.o oVar) {
        l0.d dVar2 = new l0.d(null, dVar.f2853b, null, oVar, dVar.c);
        View.AccessibilityDelegate d4 = d(view);
        b bVar = d4 == null ? null : d4 instanceof a ? ((a) d4).f2711a : new b(d4);
        if (bVar == null) {
            bVar = new b();
        }
        m(view, bVar);
        j(view, dVar2.a());
        f(view).add(dVar2);
        h(view, 0);
    }

    public static void l(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            f0.b(view, context, iArr, attributeSet, typedArray, i4, 0);
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
        new w(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).d(view, charSequence);
        x xVar = f2756f;
        if (charSequence == null) {
            xVar.f2789f.remove(view);
            view.removeOnAttachStateChangeListener(xVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(xVar);
        } else {
            xVar.f2789f.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(xVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(xVar);
            }
        }
    }

    public static void o(View view, o0 o0Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(new t0(o0Var));
            return;
        }
        PathInterpolator pathInterpolator = r0.f2773e;
        View.OnApplyWindowInsetsListener q0Var = new q0(view, o0Var);
        view.setTag(R.id.tag_window_insets_animation_callback, q0Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(q0Var);
        }
    }
}
