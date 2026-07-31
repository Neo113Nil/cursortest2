package q3;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import com.snovikpovik.vuevnxsj.R;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static Field f6120a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f6121b = false;

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f6122c = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: d, reason: collision with root package name */
    public static final y f6123d = new y();

    /* renamed from: e, reason: collision with root package name */
    public static final z f6124e = new z();

    public static void a(View view, l1 l1Var) {
        int i = Build.VERSION.SDK_INT;
        WindowInsets c8 = l1Var.c();
        if (c8 != null) {
            WindowInsets a8 = i >= 30 ? h0.a(view, c8) : a0.a(view, c8);
            if (a8.equals(c8)) {
                return;
            }
            l1.d(view, a8);
        }
    }

    public static View.AccessibilityDelegate b(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return g0.a(view);
        }
        if (f6121b) {
            return null;
        }
        if (f6120a == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f6120a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f6121b = true;
                return null;
            }
        }
        try {
            Object obj = f6120a.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f6121b = true;
            return null;
        }
    }

    public static CharSequence c(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = f0.a(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList d(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] e(l.u uVar) {
        return Build.VERSION.SDK_INT >= 31 ? i0.a(uVar) : (String[]) uVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void f(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z3 = c(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z3) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z3 ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                if (z3) {
                    obtain.getText().add(c(view));
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
                    } catch (AbstractMethodError e8) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e8);
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
            obtain2.getText().add(c(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static g g(View view, g gVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + gVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return i0.b(view, gVar);
        }
        u3.i iVar = (u3.i) view.getTag(R.id.tag_on_receive_content_listener);
        q qVar = f6123d;
        if (iVar == null) {
            if (view instanceof q) {
                qVar = (q) view;
            }
            return qVar.a(gVar);
        }
        g a8 = u3.i.a(view, gVar);
        if (a8 == null) {
            return null;
        }
        if (view instanceof q) {
            qVar = (q) view;
        }
        return qVar.a(a8);
    }

    public static void h(View view, int i) {
        ArrayList d8 = d(view);
        for (int i8 = 0; i8 < d8.size(); i8++) {
            if (((r3.d) d8.get(i8)).a() == i) {
                d8.remove(i8);
                return;
            }
        }
    }

    public static void i(View view, r3.d dVar, r3.p pVar) {
        r3.d dVar2 = new r3.d(null, dVar.f6553b, null, pVar, dVar.f6554c);
        View.AccessibilityDelegate b8 = b(view);
        b bVar = b8 == null ? null : b8 instanceof a ? ((a) b8).f6072a : new b(b8);
        if (bVar == null) {
            bVar = new b();
        }
        k(view, bVar);
        h(view, dVar2.a());
        d(view).add(dVar2);
        f(view, 0);
    }

    public static void j(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            g0.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void k(View view, b bVar) {
        if (bVar == null && (b(view) instanceof a)) {
            bVar = new b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(bVar == null ? null : bVar.f6077b);
    }

    public static void l(View view, CharSequence charSequence) {
        Object tag;
        androidx.datastore.preferences.protobuf.k kVar = new androidx.datastore.preferences.protobuf.k(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28);
        if (Build.VERSION.SDK_INT >= kVar.f712b) {
            f0.d(view, charSequence);
        } else {
            if (Build.VERSION.SDK_INT >= kVar.f712b) {
                tag = f0.a(view);
            } else {
                tag = view.getTag(kVar.f711a);
                if (!((Class) kVar.f714d).isInstance(tag)) {
                    tag = null;
                }
            }
            if (!TextUtils.equals((CharSequence) tag, charSequence)) {
                View.AccessibilityDelegate b8 = b(view);
                b bVar = b8 == null ? null : b8 instanceof a ? ((a) b8).f6072a : new b(b8);
                if (bVar == null) {
                    bVar = new b();
                }
                k(view, bVar);
                view.setTag(kVar.f711a, charSequence);
                f(view, kVar.f713c);
            }
        }
        z zVar = f6124e;
        if (charSequence == null) {
            zVar.f6174d.remove(view);
            view.removeOnAttachStateChangeListener(zVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(zVar);
        } else {
            zVar.f6174d.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(zVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(zVar);
            }
        }
    }

    public static void m(View view, androidx.datastore.preferences.protobuf.j jVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(jVar != null ? new r0(jVar) : null);
            return;
        }
        PathInterpolator pathInterpolator = q0.f6142e;
        View.OnApplyWindowInsetsListener p0Var = jVar != null ? new p0(view, jVar) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, p0Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(p0Var);
        }
    }
}
