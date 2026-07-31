package androidx.core.view;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.h;
import androidx.core.view.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    private static WeakHashMap<View, String> f533b;

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f532a = new AtomicInteger(1);

    /* renamed from: c, reason: collision with root package name */
    private static WeakHashMap<View, Object> f534c = null;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f535d = false;

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f536e = {i.c.f16852a, i.c.f16853b, i.c.f16864m, i.c.f16875x, i.c.A, i.c.B, i.c.C, i.c.D, i.c.E, i.c.F, i.c.f16854c, i.c.f16855d, i.c.f16856e, i.c.f16857f, i.c.f16858g, i.c.f16859h, i.c.f16860i, i.c.f16861j, i.c.f16862k, i.c.f16863l, i.c.f16865n, i.c.f16866o, i.c.f16867p, i.c.f16868q, i.c.f16869r, i.c.f16870s, i.c.f16871t, i.c.f16872u, i.c.f16873v, i.c.f16874w, i.c.f16876y, i.c.f16877z};

    /* renamed from: f, reason: collision with root package name */
    private static final androidx.core.view.e f537f = new androidx.core.view.e() { // from class: androidx.core.view.g
    };

    /* renamed from: g, reason: collision with root package name */
    private static final b f538g = new b();

    class a extends c<CharSequence> {
        a(int i7, Class cls, int i8, int i9) {
            super(i7, cls, i8, i9);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.h.c
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return i.b(view);
        }
    }

    static class b implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: f, reason: collision with root package name */
        private final WeakHashMap<View, Boolean> f539f = new WeakHashMap<>();

        b() {
        }

        private void a(View view, boolean z6) {
            boolean z7 = view.getVisibility() == 0;
            if (z6 != z7) {
                h.i(view, z7 ? 16 : 32);
                this.f539f.put(view, Boolean.valueOf(z7));
            }
        }

        private void b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f539f.entrySet()) {
                    a(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static abstract class c<T> {

        /* renamed from: a, reason: collision with root package name */
        private final int f540a;

        /* renamed from: b, reason: collision with root package name */
        private final Class<T> f541b;

        /* renamed from: c, reason: collision with root package name */
        private final int f542c;

        /* renamed from: d, reason: collision with root package name */
        private final int f543d;

        c(int i7, Class<T> cls, int i8, int i9) {
            this.f540a = i7;
            this.f541b = cls;
            this.f543d = i8;
            this.f542c = i9;
        }

        private boolean a() {
            return Build.VERSION.SDK_INT >= 19;
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.f542c;
        }

        abstract T c(View view);

        T d(View view) {
            if (b()) {
                return c(view);
            }
            if (!a()) {
                return null;
            }
            T t6 = (T) view.getTag(this.f540a);
            if (this.f541b.isInstance(t6)) {
                return t6;
            }
            return null;
        }
    }

    static class d {
        static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        static int c(View view) {
            return view.getImportantForAccessibility();
        }

        static int d(View view) {
            return view.getMinimumHeight();
        }

        static int e(View view) {
            return view.getMinimumWidth();
        }

        static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        static boolean i(View view) {
            return view.hasTransientState();
        }

        static boolean j(View view, int i7, Bundle bundle) {
            return view.performAccessibilityAction(i7, bundle);
        }

        static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        static void l(View view, int i7, int i8, int i9, int i10) {
            view.postInvalidateOnAnimation(i7, i8, i9, i10);
        }

        static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        static void n(View view, Runnable runnable, long j7) {
            view.postOnAnimationDelayed(runnable, j7);
        }

        static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        static void p(View view) {
            view.requestFitSystemWindows();
        }

        static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        static void r(View view, boolean z6) {
            view.setHasTransientState(z6);
        }

        static void s(View view, int i7) {
            view.setImportantForAccessibility(i7);
        }
    }

    static class e {
        static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        static boolean c(View view) {
            return view.isLaidOut();
        }

        static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        static void e(ViewParent viewParent, View view, View view2, int i7) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i7);
        }

        static void f(View view, int i7) {
            view.setAccessibilityLiveRegion(i7);
        }

        static void g(AccessibilityEvent accessibilityEvent, int i7) {
            accessibilityEvent.setContentChangeTypes(i7);
        }
    }

    static class f {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    private static class g {

        class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            androidx.core.view.k f544a = null;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f545b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.core.view.d f546c;

            a(View view, androidx.core.view.d dVar) {
                this.f545b = view;
                this.f546c = dVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                androidx.core.view.k n7 = androidx.core.view.k.n(windowInsets, view);
                int i7 = Build.VERSION.SDK_INT;
                if (i7 < 30) {
                    g.a(windowInsets, this.f545b);
                    if (n7.equals(this.f544a)) {
                        return this.f546c.a(view, n7).l();
                    }
                }
                this.f544a = n7;
                androidx.core.view.k a7 = this.f546c.a(view, n7);
                if (i7 >= 30) {
                    return a7.l();
                }
                h.k(view);
                return a7.l();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(i.c.T);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static androidx.core.view.k b(View view, androidx.core.view.k kVar, Rect rect) {
            WindowInsets l7 = kVar.l();
            if (l7 != null) {
                return androidx.core.view.k.n(view.computeSystemWindowInsets(l7, rect), view);
            }
            rect.setEmpty();
            return kVar;
        }

        static boolean c(View view, float f7, float f8, boolean z6) {
            return view.dispatchNestedFling(f7, f8, z6);
        }

        static boolean d(View view, float f7, float f8) {
            return view.dispatchNestedPreFling(f7, f8);
        }

        static boolean e(View view, int i7, int i8, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i7, i8, iArr, iArr2);
        }

        static boolean f(View view, int i7, int i8, int i9, int i10, int[] iArr) {
            return view.dispatchNestedScroll(i7, i8, i9, i10, iArr);
        }

        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        static float i(View view) {
            return view.getElevation();
        }

        public static androidx.core.view.k j(View view) {
            return k.a.a(view);
        }

        static String k(View view) {
            return view.getTransitionName();
        }

        static float l(View view) {
            return view.getTranslationZ();
        }

        static float m(View view) {
            return view.getZ();
        }

        static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void s(View view, float f7) {
            view.setElevation(f7);
        }

        static void t(View view, boolean z6) {
            view.setNestedScrollingEnabled(z6);
        }

        static void u(View view, androidx.core.view.d dVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(i.c.P, dVar);
            }
            if (dVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(i.c.T));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, dVar));
            }
        }

        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        static void w(View view, float f7) {
            view.setTranslationZ(f7);
        }

        static void x(View view, float f7) {
            view.setZ(f7);
        }

        static boolean y(View view, int i7) {
            return view.startNestedScroll(i7);
        }

        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* renamed from: androidx.core.view.h$h, reason: collision with other inner class name */
    private static class C0012h {
        public static androidx.core.view.k a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            androidx.core.view.k m7 = androidx.core.view.k.m(rootWindowInsets);
            m7.j(m7);
            m7.d(view.getRootView());
            return m7;
        }

        static int b(View view) {
            return view.getScrollIndicators();
        }

        static void c(View view, int i7) {
            view.setScrollIndicators(i7);
        }

        static void d(View view, int i7, int i8) {
            view.setScrollIndicators(i7, i8);
        }
    }

    static class i {
        static void a(View view, final j jVar) {
            int i7 = i.c.S;
            h.e eVar = (h.e) view.getTag(i7);
            if (eVar == null) {
                eVar = new h.e();
                view.setTag(i7, eVar);
            }
            Objects.requireNonNull(jVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.i
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return h.j.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            eVar.put(jVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        static void e(View view, j jVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            h.e eVar = (h.e) view.getTag(i.c.S);
            if (eVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) eVar.get(jVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static <T> T f(View view, int i7) {
            return (T) view.requireViewById(i7);
        }

        static void g(View view, boolean z6) {
            view.setAccessibilityHeading(z6);
        }

        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void i(View view, boolean z6) {
            view.setScreenReaderFocusable(z6);
        }
    }

    public interface j {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    static class k {

        /* renamed from: d, reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f547d = new ArrayList<>();

        /* renamed from: a, reason: collision with root package name */
        private WeakHashMap<View, Boolean> f548a = null;

        /* renamed from: b, reason: collision with root package name */
        private SparseArray<WeakReference<View>> f549b = null;

        /* renamed from: c, reason: collision with root package name */
        private WeakReference<KeyEvent> f550c = null;

        k() {
        }

        static k a(View view) {
            int i7 = i.c.R;
            k kVar = (k) view.getTag(i7);
            if (kVar != null) {
                return kVar;
            }
            k kVar2 = new k();
            view.setTag(i7, kVar2);
            return kVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f548a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c7 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c7 != null) {
                            return c7;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.f549b == null) {
                this.f549b = new SparseArray<>();
            }
            return this.f549b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(i.c.S);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((j) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f548a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f547d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f548a == null) {
                    this.f548a = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = f547d;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f548a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f548a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c7 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c7 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(c7));
                }
            }
            return c7 != null;
        }

        boolean f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f550c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f550c = new WeakReference<>(keyEvent);
            WeakReference<View> weakReference2 = null;
            SparseArray<WeakReference<View>> d7 = d();
            if (keyEvent.getAction() == 1 && (indexOfKey = d7.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = d7.valueAt(indexOfKey);
                d7.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = d7.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = weakReference2.get();
            if (view != null && h.h(view)) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    static boolean a(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return k.a(view).b(view, keyEvent);
    }

    static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return k.a(view).f(keyEvent);
    }

    public static int c(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return e.a(view);
        }
        return 0;
    }

    public static CharSequence d(View view) {
        return j().d(view);
    }

    public static int e(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return d.c(view);
        }
        return 0;
    }

    public static androidx.core.view.k f(View view) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 23) {
            return C0012h.a(view);
        }
        if (i7 >= 21) {
            return g.j(view);
        }
        return null;
    }

    public static String g(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return g.k(view);
        }
        WeakHashMap<View, String> weakHashMap = f533b;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    public static boolean h(View view) {
        return Build.VERSION.SDK_INT >= 19 ? e.b(view) : view.getWindowToken() != null;
    }

    static void i(View view, int i7) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z6 = d(view) != null && view.getVisibility() == 0;
            if (c(view) != 0 || z6) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z6 ? 32 : 2048);
                e.g(obtain, i7);
                if (z6) {
                    obtain.getText().add(d(view));
                    n(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i7 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                e.g(obtain2, i7);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(d(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    e.e(view.getParent(), view, view, i7);
                } catch (AbstractMethodError e7) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e7);
                }
            }
        }
    }

    private static c<CharSequence> j() {
        return new a(i.c.O, CharSequence.class, 8, 28);
    }

    public static void k(View view) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 20) {
            f.c(view);
        } else if (i7 >= 16) {
            d.p(view);
        }
    }

    public static void l(View view, int i7) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 19) {
            if (i8 < 16) {
                return;
            }
            if (i7 == 4) {
                i7 = 2;
            }
        }
        d.s(view, i7);
    }

    public static void m(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            g.v(view, str);
            return;
        }
        if (f533b == null) {
            f533b = new WeakHashMap<>();
        }
        f533b.put(view, str);
    }

    private static void n(View view) {
        if (e(view) == 0) {
            l(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (e((View) parent) == 4) {
                l(view, 2);
                return;
            }
        }
    }
}
