package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.authenticator2.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yq {
    public static final /* synthetic */ int a = 0;
    private static WeakHashMap b = null;
    private static Field c = null;
    private static boolean d = false;
    private static final int[] e = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    private static final ye f = new ye();

    public static int a(View view, CharSequence charSequence, aas aasVar) {
        int i;
        List t = t(view);
        int i2 = 0;
        while (true) {
            if (i2 >= t.size()) {
                int i3 = -1;
                for (int i4 = 0; i4 < 32 && i3 == -1; i4++) {
                    i3 = e[i4];
                    boolean z = true;
                    for (int i5 = 0; i5 < t.size(); i5++) {
                        z &= ((aag) t.get(i5)).a() != i3;
                    }
                    if (true != z) {
                        i3 = -1;
                    }
                }
                i = i3;
            } else {
                if (TextUtils.equals(charSequence, ((aag) t.get(i2)).b())) {
                    i = ((aag) t.get(i2)).a();
                    break;
                }
                i2++;
            }
        }
        if (i != -1) {
            u(view, new aag(null, i, charSequence, aasVar, null));
        }
        return i;
    }

    public static View.AccessibilityDelegate b(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return yn.a(view);
        }
        if (d) {
            return null;
        }
        if (c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                d = true;
                return null;
            }
        }
        Object obj = c.get(view);
        if (obj instanceof View.AccessibilityDelegate) {
            return (View.AccessibilityDelegate) obj;
        }
        return null;
    }

    public static wv c(View view) {
        View.AccessibilityDelegate b2 = b(view);
        if (b2 == null) {
            return null;
        }
        return b2 instanceof wu ? ((wu) b2).a : new wv(b2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static xc d(View view, xc xcVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            return yp.a(view, xcVar);
        }
        if (((abf) view.getTag(R.id.tag_on_receive_content_listener)) == null) {
            return view.b(xcVar);
        }
        xc d2 = abf.d(view, xcVar);
        if (d2 == null) {
            return null;
        }
        return view.b(d2);
    }

    public static zz e(View view, zz zzVar) {
        WindowInsets e2 = zzVar.e();
        if (e2 != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(e2);
            if (!onApplyWindowInsets.equals(e2)) {
                return zz.q(onApplyWindowInsets, view);
            }
        }
        return zzVar;
    }

    public static CharSequence f(View view) {
        return (CharSequence) new yb(CharSequence.class).d(view);
    }

    public static void g(ViewGroup viewGroup, View view) {
        viewGroup.getOverlay().add(view);
        View view2 = (View) view.getParent();
        view2.getClass();
        view2.setTag(R.id.view_tree_disjoint_parent, viewGroup);
    }

    static void h(View view) {
        wv c2 = c(view);
        if (c2 == null) {
            c2 = new wv();
        }
        l(view, c2);
    }

    static void i(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = false;
            if (f(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            }
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                int i2 = true != z ? 2048 : 32;
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(i2);
                obtain.setContentChangeTypes(i);
                if (z) {
                    obtain.getText().add(f(view));
                    w(view);
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
                        Log.e("ViewCompat", String.valueOf(view.getParent().getClass().getSimpleName()).concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(32);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(f(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    public static void j(View view, int i) {
        v(i, view);
        i(view, 0);
    }

    public static void k(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            yn.b(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    public static void l(View view, wv wvVar) {
        if (wvVar == null && (b(view) instanceof wu)) {
            wvVar = new wv();
        }
        w(view);
        view.setAccessibilityDelegate(wvVar == null ? null : wvVar.c);
    }

    public static void m(View view, boolean z) {
        new yd(Boolean.class).e(view, Boolean.valueOf(z));
    }

    public static void n(View view, CharSequence charSequence) {
        new yb(CharSequence.class).e(view, charSequence);
        if (charSequence == null) {
            ye yeVar = f;
            yeVar.a.remove(view);
            view.removeOnAttachStateChangeListener(yeVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(yeVar);
            return;
        }
        ye yeVar2 = f;
        WeakHashMap weakHashMap = yeVar2.a;
        boolean z = false;
        if (view.isShown() && view.getWindowVisibility() == 0) {
            z = true;
        }
        weakHashMap.put(view, Boolean.valueOf(z));
        view.addOnAttachStateChangeListener(yeVar2);
        if (view.isAttachedToWindow()) {
            yeVar2.a(view);
        }
    }

    public static void o(View view, CharSequence charSequence) {
        new yc(CharSequence.class).e(view, charSequence);
    }

    public static String[] p(View view) {
        return Build.VERSION.SDK_INT >= 31 ? yp.b(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void q(View view, zz zzVar) {
        WindowInsets e2 = zzVar.e();
        if (e2 != null) {
            WindowInsets a2 = Build.VERSION.SDK_INT >= 30 ? yo.a(view, e2) : yg.a(view, e2);
            if (a2.equals(e2)) {
                return;
            }
            zz.q(a2, view);
        }
    }

    public static void r(View view, aag aagVar, aas aasVar) {
        if (aasVar == null) {
            j(view, aagVar.a());
        } else {
            u(view, new aag(null, aagVar.l, null, aasVar, aagVar.m));
        }
    }

    @Deprecated
    public static brn s(View view) {
        WeakHashMap weakHashMap = b;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            b = weakHashMap;
        }
        brn brnVar = (brn) weakHashMap.get(view);
        if (brnVar != null) {
            return brnVar;
        }
        brn brnVar2 = new brn(view);
        b.put(view, brnVar2);
        return brnVar2;
    }

    private static List t(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    private static void u(View view, aag aagVar) {
        h(view);
        v(aagVar.a(), view);
        t(view).add(aagVar);
        i(view, 0);
    }

    private static void v(int i, View view) {
        List t = t(view);
        for (int i2 = 0; i2 < t.size(); i2++) {
            if (((aag) t.get(i2)).a() == i) {
                t.remove(i2);
                return;
            }
        }
    }

    private static void w(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }
}
