package K;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.fortunequest.neontrack.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.C0264v;

/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f578a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Field f579b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f580c = false;
    public static final int[] d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: e, reason: collision with root package name */
    public static final C0029z f581e = new C0029z();

    /* renamed from: f, reason: collision with root package name */
    public static final B f582f = new B();

    public static Z a(View view) {
        if (f578a == null) {
            f578a = new WeakHashMap();
        }
        Z z2 = (Z) f578a.get(view);
        if (z2 != null) {
            return z2;
        }
        Z z3 = new Z(view);
        f578a.put(view, z3);
        return z3;
    }

    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = P.d;
        P p2 = (P) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (p2 == null) {
            p2 = new P();
            p2.f575a = null;
            p2.f576b = null;
            p2.f577c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, p2);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = p2.f575a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = P.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (p2.f575a == null) {
                            p2.f575a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = P.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                p2.f575a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    p2.f575a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a2 = p2.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (p2.f576b == null) {
                    p2.f576b = new SparseArray();
                }
                p2.f576b.put(keyCode, new WeakReference(a2));
            }
        }
        return a2 != null;
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return K.a(view);
        }
        if (f580c) {
            return null;
        }
        if (f579b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f579b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f580c = true;
                return null;
            }
        }
        try {
            Object obj = f579b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f580c = true;
            return null;
        }
    }

    public static CharSequence d(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = J.b(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList e(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] f(C0264v c0264v) {
        return Build.VERSION.SDK_INT >= 31 ? M.a(c0264v) : (String[]) c0264v.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void g(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z2 = d(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z2) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z2 ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                if (z2) {
                    obtain.getText().add(d(view));
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
            obtain2.getText().add(d(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0010f h(View view, C0010f c0010f) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0010f + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return M.b(view, c0010f);
        }
        InterfaceC0021q interfaceC0021q = (InterfaceC0021q) view.getTag(R.id.tag_on_receive_content_listener);
        r rVar = f581e;
        if (interfaceC0021q == null) {
            if (view instanceof r) {
                rVar = (r) view;
            }
            return rVar.a(c0010f);
        }
        C0010f a2 = ((Q.r) interfaceC0021q).a(view, c0010f);
        if (a2 == null) {
            return null;
        }
        if (view instanceof r) {
            rVar = (r) view;
        }
        return rVar.a(a2);
    }

    public static void i(View view, int i) {
        ArrayList e2 = e(view);
        for (int i2 = 0; i2 < e2.size(); i2++) {
            if (((L.e) e2.get(i2)).a() == i) {
                e2.remove(i2);
                return;
            }
        }
    }

    public static void j(View view, L.e eVar, L.s sVar) {
        L.e eVar2 = new L.e(null, eVar.f694b, null, sVar, eVar.f695c);
        View.AccessibilityDelegate c2 = c(view);
        C0006b c0006b = c2 == null ? null : c2 instanceof C0005a ? ((C0005a) c2).f592a : new C0006b(c2);
        if (c0006b == null) {
            c0006b = new C0006b();
        }
        l(view, c0006b);
        i(view, eVar2.a());
        e(view).add(eVar2);
        g(view, 0);
    }

    public static void k(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            K.d(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void l(View view, C0006b c0006b) {
        if (c0006b == null && (c(view) instanceof C0005a)) {
            c0006b = new C0006b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0006b == null ? null : c0006b.f595b);
    }

    public static void m(View view, CharSequence charSequence) {
        new A(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).f(view, charSequence);
        B b2 = f582f;
        if (charSequence == null) {
            b2.f567a.remove(view);
            view.removeOnAttachStateChangeListener(b2);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(b2);
        } else {
            b2.f567a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(b2);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(b2);
            }
        }
    }
}
