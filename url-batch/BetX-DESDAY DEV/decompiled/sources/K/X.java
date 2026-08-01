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
import com.luckyarcade.spinthrow.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.C0296x;

/* loaded from: classes.dex */
public abstract class X {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f419a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Field f420b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f421c = false;

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f422d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: e, reason: collision with root package name */
    public static final F f423e = new F();

    /* renamed from: f, reason: collision with root package name */
    public static final H f424f = new H();

    public static C0009e0 a(View view) {
        if (f419a == null) {
            f419a = new WeakHashMap();
        }
        C0009e0 c0009e0 = (C0009e0) f419a.get(view);
        if (c0009e0 != null) {
            return c0009e0;
        }
        C0009e0 c0009e02 = new C0009e0(view);
        f419a.put(view, c0009e02);
        return c0009e02;
    }

    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = W.f415d;
        W w2 = (W) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (w2 == null) {
            w2 = new W();
            w2.f416a = null;
            w2.f417b = null;
            w2.f418c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, w2);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = w2.f416a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = W.f415d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (w2.f416a == null) {
                            w2.f416a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = W.f415d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                w2.f416a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    w2.f416a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a2 = w2.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (w2.f417b == null) {
                    w2.f417b = new SparseArray();
                }
                w2.f417b.put(keyCode, new WeakReference(a2));
            }
        }
        return a2 != null;
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return Q.a(view);
        }
        if (f421c) {
            return null;
        }
        if (f420b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f420b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f421c = true;
                return null;
            }
        }
        try {
            Object obj = f420b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f421c = true;
            return null;
        }
    }

    public static CharSequence d(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = P.b(view);
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

    public static String[] f(C0296x c0296x) {
        return Build.VERSION.SDK_INT >= 31 ? T.a(c0296x) : (String[]) c0296x.getTag(R.id.tag_on_receive_content_mime_types);
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
            return T.b(view, c0010f);
        }
        InterfaceC0026w interfaceC0026w = (InterfaceC0026w) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC0027x interfaceC0027x = f423e;
        if (interfaceC0026w == null) {
            if (view instanceof InterfaceC0027x) {
                interfaceC0027x = (InterfaceC0027x) view;
            }
            return interfaceC0027x.a(c0010f);
        }
        C0010f a2 = ((Q.s) interfaceC0026w).a(view, c0010f);
        if (a2 == null) {
            return null;
        }
        if (view instanceof InterfaceC0027x) {
            interfaceC0027x = (InterfaceC0027x) view;
        }
        return interfaceC0027x.a(a2);
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
        L.e eVar2 = new L.e(null, eVar.f662b, null, sVar, eVar.f663c);
        View.AccessibilityDelegate c2 = c(view);
        C0002b c0002b = c2 == null ? null : c2 instanceof C0000a ? ((C0000a) c2).f425a : new C0002b(c2);
        if (c0002b == null) {
            c0002b = new C0002b();
        }
        l(view, c0002b);
        i(view, eVar2.a());
        e(view).add(eVar2);
        g(view, 0);
    }

    public static void k(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            Q.d(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void l(View view, C0002b c0002b) {
        if (c0002b == null && (c(view) instanceof C0000a)) {
            c0002b = new C0002b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0002b == null ? null : c0002b.f428b);
    }

    public static void m(View view, CharSequence charSequence) {
        new G(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).d(view, charSequence);
        H h = f424f;
        if (charSequence == null) {
            h.f406a.remove(view);
            view.removeOnAttachStateChangeListener(h);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(h);
        } else {
            h.f406a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(h);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(h);
            }
        }
    }
}
