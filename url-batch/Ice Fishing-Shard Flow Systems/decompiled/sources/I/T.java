package I;

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
import com.icefishing.icefish.ice.fishing.s294s.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import n.C0737u;

/* loaded from: classes.dex */
public abstract class T {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f1153a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Field f1154b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f1155c = false;

    /* renamed from: d, reason: collision with root package name */
    public static final E f1156d = new E();

    /* renamed from: e, reason: collision with root package name */
    public static final G f1157e = new G();

    public static Y a(View view) {
        if (f1153a == null) {
            f1153a = new WeakHashMap();
        }
        Y y7 = (Y) f1153a.get(view);
        if (y7 != null) {
            return y7;
        }
        Y y8 = new Y(view);
        f1153a.put(view, y8);
        return y8;
    }

    public static void b(View view, v0 v0Var) {
        WindowInsets b7 = v0Var.b();
        if (b7 != null) {
            WindowInsets a7 = Build.VERSION.SDK_INT >= 30 ? P.a(view, b7) : I.a(view, b7);
            if (a7.equals(b7)) {
                return;
            }
            v0.c(a7, view);
        }
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = S.f1149d;
        S s7 = (S) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (s7 == null) {
            s7 = new S();
            s7.f1150a = null;
            s7.f1151b = null;
            s7.f1152c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, s7);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = s7.f1150a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = S.f1149d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (s7.f1150a == null) {
                            s7.f1150a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = S.f1149d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                s7.f1150a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    s7.f1150a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a7 = s7.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a7 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (s7.f1151b == null) {
                    s7.f1151b = new SparseArray();
                }
                s7.f1151b.put(keyCode, new WeakReference(a7));
            }
        }
        return a7 != null;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return O.a(view);
        }
        if (f1155c) {
            return null;
        }
        if (f1154b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f1154b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f1155c = true;
                return null;
            }
        }
        try {
            Object obj = f1154b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f1155c = true;
            return null;
        }
    }

    public static String[] e(C0737u c0737u) {
        return Build.VERSION.SDK_INT >= 31 ? Q.a(c0737u) : (String[]) c0737u.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void f(View view, int i2) {
        Object tag;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i5 = Build.VERSION.SDK_INT;
            CharSequence charSequence = null;
            if (i5 >= 28) {
                tag = N.a(view);
            } else {
                tag = view.getTag(R.id.tag_accessibility_pane_title);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            boolean z7 = ((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z7) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z7 ? 32 : 2048);
                obtain.setContentChangeTypes(i2);
                if (z7) {
                    List<CharSequence> text = obtain.getText();
                    if (i5 >= 28) {
                        charSequence = N.a(view);
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
            if (i2 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                        return;
                    } catch (AbstractMethodError e7) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e7);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(i2);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            List<CharSequence> text2 = obtain2.getText();
            if (i5 >= 28) {
                charSequence = N.a(view);
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
    public static C0110f g(View view, C0110f c0110f) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0110f + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return Q.b(view, c0110f);
        }
        L.i iVar = (L.i) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC0125v interfaceC0125v = f1156d;
        if (iVar == null) {
            if (view instanceof InterfaceC0125v) {
                interfaceC0125v = (InterfaceC0125v) view;
            }
            return interfaceC0125v.a(c0110f);
        }
        C0110f a7 = L.i.a(view, c0110f);
        if (a7 == null) {
            return null;
        }
        if (view instanceof InterfaceC0125v) {
            interfaceC0125v = (InterfaceC0125v) view;
        }
        return interfaceC0125v.a(a7);
    }

    public static void h(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            O.b(view, context, iArr, attributeSet, typedArray, i2, 0);
        }
    }

    public static void i(View view, C0106b c0106b) {
        if (c0106b == null && (d(view) instanceof C0105a)) {
            c0106b = new C0106b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0106b == null ? null : c0106b.f1174b);
    }

    public static void j(View view, CharSequence charSequence) {
        new F(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).f(view, charSequence);
        G g7 = f1157e;
        if (charSequence == null) {
            g7.f1141d.remove(view);
            view.removeOnAttachStateChangeListener(g7);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(g7);
        } else {
            g7.f1141d.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(g7);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(g7);
            }
        }
    }
}
