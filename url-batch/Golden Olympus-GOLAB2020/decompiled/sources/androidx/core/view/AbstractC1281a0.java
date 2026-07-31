package androidx.core.view;

import B.w;
import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.core.view.C1280a;
import androidx.core.view.WindowInsetsCompat;
import com.ironsource.b9;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import w.AbstractC3482c;

/* renamed from: androidx.core.view.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1281a0 {

    /* renamed from: a, reason: collision with root package name */
    private static WeakHashMap f11918a = null;

    /* renamed from: b, reason: collision with root package name */
    private static Field f11919b = null;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f11920c = false;

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f11921d = {AbstractC3482c.f46517b, AbstractC3482c.f46518c, AbstractC3482c.f46529n, AbstractC3482c.f46540y, AbstractC3482c.f46498B, AbstractC3482c.f46499C, AbstractC3482c.f46500D, AbstractC3482c.f46501E, AbstractC3482c.f46502F, AbstractC3482c.f46503G, AbstractC3482c.f46519d, AbstractC3482c.f46520e, AbstractC3482c.f46521f, AbstractC3482c.f46522g, AbstractC3482c.f46523h, AbstractC3482c.f46524i, AbstractC3482c.f46525j, AbstractC3482c.f46526k, AbstractC3482c.f46527l, AbstractC3482c.f46528m, AbstractC3482c.f46530o, AbstractC3482c.f46531p, AbstractC3482c.f46532q, AbstractC3482c.f46533r, AbstractC3482c.f46534s, AbstractC3482c.f46535t, AbstractC3482c.f46536u, AbstractC3482c.f46537v, AbstractC3482c.f46538w, AbstractC3482c.f46539x, AbstractC3482c.f46541z, AbstractC3482c.f46497A};

    /* renamed from: e, reason: collision with root package name */
    private static final L f11922e = new L() { // from class: androidx.core.view.Z
        @Override // androidx.core.view.L
        public final C1286d onReceiveContent(C1286d c1286d) {
            return AbstractC1281a0.a(c1286d);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private static final e f11923f = new e();

    /* renamed from: androidx.core.view.a0$a */
    class a extends f {
        a(int i4, Class cls, int i5) {
            super(i4, cls, i5);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC1281a0.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.d(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC1281a0.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.j(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC1281a0.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* renamed from: androidx.core.view.a0$b */
    class b extends f {
        b(int i4, Class cls, int i5, int i6) {
            super(i4, cls, i5, i6);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC1281a0.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return l.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC1281a0.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            l.h(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC1281a0.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: androidx.core.view.a0$c */
    class c extends f {
        c(int i4, Class cls, int i5, int i6) {
            super(i4, cls, i5, i6);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC1281a0.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return n.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC1281a0.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            n.e(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC1281a0.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: androidx.core.view.a0$d */
    class d extends f {
        d(int i4, Class cls, int i5) {
            super(i4, cls, i5);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC1281a0.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC1281a0.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.g(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC1281a0.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* renamed from: androidx.core.view.a0$e */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        private final WeakHashMap f11924a = new WeakHashMap();

        e() {
        }

        private void b(Map.Entry entry) {
            View view = (View) entry.getKey();
            boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
            boolean z4 = view.isShown() && view.getWindowVisibility() == 0;
            if (booleanValue != z4) {
                AbstractC1281a0.X(view, z4 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z4));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        void a(View view) {
            this.f11924a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                c(view);
            }
        }

        void d(View view) {
            this.f11924a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator it = this.f11924a.entrySet().iterator();
                while (it.hasNext()) {
                    b((Map.Entry) it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.core.view.a0$f */
    static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        private final int f11925a;

        /* renamed from: b, reason: collision with root package name */
        private final Class f11926b;

        /* renamed from: c, reason: collision with root package name */
        private final int f11927c;

        /* renamed from: d, reason: collision with root package name */
        private final int f11928d;

        f(int i4, Class cls, int i5) {
            this(i4, cls, 0, i5);
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.f11927c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract Object c(View view);

        abstract void d(View view, Object obj);

        Object e(View view) {
            if (b()) {
                return c(view);
            }
            Object tag = view.getTag(this.f11925a);
            if (this.f11926b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        void f(View view, Object obj) {
            if (b()) {
                d(view, obj);
            } else if (g(e(view), obj)) {
                AbstractC1281a0.l(view);
                view.setTag(this.f11925a, obj);
                AbstractC1281a0.X(view, this.f11928d);
            }
        }

        abstract boolean g(Object obj, Object obj2);

        f(int i4, Class cls, int i5, int i6) {
            this.f11925a = i4;
            this.f11926b = cls;
            this.f11928d = i5;
            this.f11927c = i6;
        }
    }

    /* renamed from: androidx.core.view.a0$g */
    static class g {
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

    /* renamed from: androidx.core.view.a0$h */
    private static class h {

        /* renamed from: androidx.core.view.a0$h$a */
        class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            WindowInsetsCompat f11929a = null;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f11930b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ J f11931c;

            a(View view, J j4) {
                this.f11930b = view;
                this.f11931c = j4;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view);
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 30) {
                    h.a(windowInsets, this.f11930b);
                    if (windowInsetsCompat.equals(this.f11929a)) {
                        return this.f11931c.onApplyWindowInsets(view, windowInsetsCompat).toWindowInsets();
                    }
                }
                this.f11929a = windowInsetsCompat;
                WindowInsetsCompat onApplyWindowInsets = this.f11931c.onApplyWindowInsets(view, windowInsetsCompat);
                if (i4 >= 30) {
                    return onApplyWindowInsets.toWindowInsets();
                }
                AbstractC1281a0.l0(view);
                return onApplyWindowInsets.toWindowInsets();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(AbstractC3482c.f46515S);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static WindowInsetsCompat b(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
            WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
            if (windowInsets != null) {
                return WindowInsetsCompat.toWindowInsetsCompat(view.computeSystemWindowInsets(windowInsets, rect), view);
            }
            rect.setEmpty();
            return windowInsetsCompat;
        }

        static boolean c(View view, float f4, float f5, boolean z4) {
            return view.dispatchNestedFling(f4, f5, z4);
        }

        static boolean d(View view, float f4, float f5) {
            return view.dispatchNestedPreFling(f4, f5);
        }

        static boolean e(View view, int i4, int i5, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i4, i5, iArr, iArr2);
        }

        static boolean f(View view, int i4, int i5, int i6, int i7, int[] iArr) {
            return view.dispatchNestedScroll(i4, i5, i6, i7, iArr);
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

        public static WindowInsetsCompat j(View view) {
            return WindowInsetsCompat.Api21ReflectionHolder.getRootWindowInsets(view);
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

        static void s(View view, float f4) {
            view.setElevation(f4);
        }

        static void t(View view, boolean z4) {
            view.setNestedScrollingEnabled(z4);
        }

        static void u(View view, J j4) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(AbstractC3482c.f46508L, j4);
            }
            if (j4 == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(AbstractC3482c.f46515S));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, j4));
            }
        }

        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        static void w(View view, float f4) {
            view.setTranslationZ(f4);
        }

        static void x(View view, float f4) {
            view.setZ(f4);
        }

        static boolean y(View view, int i4) {
            return view.startNestedScroll(i4);
        }

        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* renamed from: androidx.core.view.a0$i */
    private static class i {
        public static WindowInsetsCompat a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(rootWindowInsets);
            windowInsetsCompat.setRootWindowInsets(windowInsetsCompat);
            windowInsetsCompat.copyRootViewBounds(view.getRootView());
            return windowInsetsCompat;
        }

        static int b(View view) {
            return view.getScrollIndicators();
        }

        static void c(View view, int i4) {
            view.setScrollIndicators(i4);
        }

        static void d(View view, int i4, int i5) {
            view.setScrollIndicators(i4, i5);
        }
    }

    /* renamed from: androidx.core.view.a0$j */
    static class j {
        static void a(View view) {
            view.cancelDragAndDrop();
        }

        static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        static void d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        static boolean e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i4) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i4);
        }

        static void f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* renamed from: androidx.core.view.a0$k */
    static class k {
        static void a(View view, Collection<View> collection, int i4) {
            view.addKeyboardNavigationClusters(collection, i4);
        }

        public static AutofillId b(View view) {
            return view.getAutofillId();
        }

        static int c(View view) {
            return view.getImportantForAutofill();
        }

        static int d(View view) {
            return view.getNextClusterForwardId();
        }

        static boolean e(View view) {
            return view.hasExplicitFocusable();
        }

        static boolean f(View view) {
            return view.isFocusedByDefault();
        }

        static boolean g(View view) {
            return view.isImportantForAutofill();
        }

        static boolean h(View view) {
            return view.isKeyboardNavigationCluster();
        }

        static View i(View view, View view2, int i4) {
            return view.keyboardNavigationClusterSearch(view2, i4);
        }

        static boolean j(View view) {
            return view.restoreDefaultFocus();
        }

        static void k(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        static void l(View view, boolean z4) {
            view.setFocusedByDefault(z4);
        }

        static void m(View view, int i4) {
            view.setImportantForAutofill(i4);
        }

        static void n(View view, boolean z4) {
            view.setKeyboardNavigationCluster(z4);
        }

        static void o(View view, int i4) {
            view.setNextClusterForwardId(i4);
        }

        static void p(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: androidx.core.view.a0$l */
    static class l {
        static void a(View view, final q qVar) {
            androidx.collection.g gVar = (androidx.collection.g) view.getTag(AbstractC3482c.f46514R);
            if (gVar == null) {
                gVar = new androidx.collection.g();
                view.setTag(AbstractC3482c.f46514R, gVar);
            }
            Objects.requireNonNull(qVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener(qVar) { // from class: androidx.core.view.b0
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    throw null;
                }
            };
            gVar.put(qVar, onUnhandledKeyEventListener);
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

        static void e(View view, q qVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            androidx.collection.g gVar = (androidx.collection.g) view.getTag(AbstractC3482c.f46514R);
            if (gVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) gVar.get(qVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static <T> T f(View view, int i4) {
            return (T) view.requireViewById(i4);
        }

        static void g(View view, boolean z4) {
            view.setAccessibilityHeading(z4);
        }

        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, C.a aVar) {
            view.setAutofillId(null);
        }

        static void j(View view, boolean z4) {
            view.setScreenReaderFocusable(z4);
        }
    }

    /* renamed from: androidx.core.view.a0$m */
    private static class m {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static ContentCaptureSession b(View view) {
            return view.getContentCaptureSession();
        }

        static List<Rect> c(View view) {
            return view.getSystemGestureExclusionRects();
        }

        static void d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i4, int i5) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i4, i5);
        }

        static void e(View view, D.a aVar) {
            view.setContentCaptureSession(null);
        }

        static void f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* renamed from: androidx.core.view.a0$n */
    private static class n {
        static int a(View view) {
            return view.getImportantForContentCapture();
        }

        static CharSequence b(View view) {
            return view.getStateDescription();
        }

        static boolean c(View view) {
            return view.isImportantForContentCapture();
        }

        static void d(View view, int i4) {
            view.setImportantForContentCapture(i4);
        }

        static void e(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* renamed from: androidx.core.view.a0$o */
    private static final class o {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static C1286d b(View view, C1286d c1286d) {
            ContentInfo f4 = c1286d.f();
            ContentInfo performReceiveContent = view.performReceiveContent(f4);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == f4 ? c1286d : C1286d.g(performReceiveContent);
        }

        public static void c(View view, String[] strArr, K k4) {
            if (k4 == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new p(k4));
            }
        }
    }

    /* renamed from: androidx.core.view.a0$p */
    private static final class p implements OnReceiveContentListener {

        /* renamed from: a, reason: collision with root package name */
        private final K f11932a;

        p(K k4) {
            this.f11932a = k4;
        }

        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            C1286d g4 = C1286d.g(contentInfo);
            C1286d a4 = this.f11932a.a(view, g4);
            if (a4 == null) {
                return null;
            }
            return a4 == g4 ? contentInfo : a4.f();
        }
    }

    /* renamed from: androidx.core.view.a0$q */
    public interface q {
    }

    /* renamed from: androidx.core.view.a0$r */
    static class r {

        /* renamed from: d, reason: collision with root package name */
        private static final ArrayList f11933d = new ArrayList();

        /* renamed from: a, reason: collision with root package name */
        private WeakHashMap f11934a = null;

        /* renamed from: b, reason: collision with root package name */
        private SparseArray f11935b = null;

        /* renamed from: c, reason: collision with root package name */
        private WeakReference f11936c = null;

        r() {
        }

        static r a(View view) {
            r rVar = (r) view.getTag(AbstractC3482c.f46513Q);
            if (rVar != null) {
                return rVar;
            }
            r rVar2 = new r();
            view.setTag(AbstractC3482c.f46513Q, rVar2);
            return rVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f11934a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c4 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c4 != null) {
                            return c4;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray d() {
            if (this.f11935b == null) {
                this.f11935b = new SparseArray();
            }
            return this.f11935b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            int size;
            ArrayList arrayList = (ArrayList) view.getTag(AbstractC3482c.f46514R);
            if (arrayList == null || arrayList.size() - 1 < 0) {
                return false;
            }
            android.support.v4.media.session.b.a(arrayList.get(size));
            throw null;
        }

        private void g() {
            WeakHashMap weakHashMap = this.f11934a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f11933d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f11934a == null) {
                        this.f11934a = new WeakHashMap();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = f11933d;
                        View view = (View) ((WeakReference) arrayList2.get(size)).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f11934a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f11934a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c4 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c4 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(c4));
                }
            }
            return c4 != null;
        }

        boolean f(KeyEvent keyEvent) {
            WeakReference weakReference;
            int indexOfKey;
            WeakReference weakReference2 = this.f11936c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f11936c = new WeakReference(keyEvent);
            SparseArray d4 = d();
            if (keyEvent.getAction() != 1 || (indexOfKey = d4.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = (WeakReference) d4.valueAt(indexOfKey);
                d4.removeAt(indexOfKey);
            }
            if (weakReference == null) {
                weakReference = (WeakReference) d4.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && view.isAttachedToWindow()) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    public static int A(View view) {
        return view.getImportantForAccessibility();
    }

    private static void A0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static int B(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.c(view);
        }
        return 0;
    }

    public static void B0(View view, int i4) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.m(view, i4);
        }
    }

    public static int C(View view) {
        return view.getLayoutDirection();
    }

    public static void C0(View view, int i4) {
        view.setLayoutDirection(i4);
    }

    public static int D(View view) {
        return view.getMinimumHeight();
    }

    public static void D0(View view, boolean z4) {
        h.t(view, z4);
    }

    public static int E(View view) {
        return view.getMinimumWidth();
    }

    public static void E0(View view, J j4) {
        h.u(view, j4);
    }

    public static String[] F(View view) {
        return Build.VERSION.SDK_INT >= 31 ? o.a(view) : (String[]) view.getTag(AbstractC3482c.f46510N);
    }

    public static void F0(View view, int i4, int i5, int i6, int i7) {
        view.setPaddingRelative(i4, i5, i6, i7);
    }

    public static int G(View view) {
        return view.getPaddingEnd();
    }

    public static void G0(View view, N n4) {
        j.d(view, (PointerIcon) (n4 != null ? n4.a() : null));
    }

    public static int H(View view) {
        return view.getPaddingStart();
    }

    public static void H0(View view, boolean z4) {
        n0().f(view, Boolean.valueOf(z4));
    }

    public static WindowInsetsCompat I(View view) {
        return i.a(view);
    }

    public static void I0(View view, int i4, int i5) {
        i.d(view, i4, i5);
    }

    public static CharSequence J(View view) {
        return (CharSequence) O0().e(view);
    }

    public static void J0(View view, CharSequence charSequence) {
        O0().f(view, charSequence);
    }

    public static String K(View view) {
        return h.k(view);
    }

    public static void K0(View view, String str) {
        h.v(view, str);
    }

    public static float L(View view) {
        return h.l(view);
    }

    public static void L0(View view, float f4) {
        h.w(view, f4);
    }

    public static int M(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static void M0(View view, float f4) {
        h.x(view, f4);
    }

    public static float N(View view) {
        return h.m(view);
    }

    public static boolean N0(View view, int i4) {
        return h.y(view, i4);
    }

    public static boolean O(View view) {
        return view.hasOnClickListeners();
    }

    private static f O0() {
        return new c(AbstractC3482c.f46512P, CharSequence.class, 64, 30);
    }

    public static boolean P(View view) {
        return view.hasOverlappingRendering();
    }

    public static void P0(View view) {
        h.z(view);
    }

    public static boolean Q(View view) {
        return view.hasTransientState();
    }

    public static boolean R(View view) {
        Boolean bool = (Boolean) b().e(view);
        return bool != null && bool.booleanValue();
    }

    public static boolean S(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean T(View view) {
        return view.isLaidOut();
    }

    public static boolean U(View view) {
        return h.p(view);
    }

    public static boolean V(View view) {
        return view.isPaddingRelative();
    }

    public static boolean W(View view) {
        Boolean bool = (Boolean) n0().e(view);
        return bool != null && bool.booleanValue();
    }

    static void X(View view, int i4) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z4 = q(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z4) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z4 ? 32 : com.ironsource.mediationsdk.metadata.a.f17688n);
                obtain.setContentChangeTypes(i4);
                if (z4) {
                    obtain.getText().add(q(view));
                    A0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i4 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i4);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(q(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i4);
                } catch (AbstractMethodError e4) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e4);
                }
            }
        }
    }

    public static void Y(View view, int i4) {
        view.offsetLeftAndRight(i4);
    }

    public static void Z(View view, int i4) {
        view.offsetTopAndBottom(i4);
    }

    public static /* synthetic */ C1286d a(C1286d c1286d) {
        return c1286d;
    }

    public static WindowInsetsCompat a0(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
        if (windowInsets != null) {
            WindowInsets b4 = g.b(view, windowInsets);
            if (!b4.equals(windowInsets)) {
                return WindowInsetsCompat.toWindowInsetsCompat(b4, view);
            }
        }
        return windowInsetsCompat;
    }

    private static f b() {
        return new d(AbstractC3482c.f46506J, Boolean.class, 28);
    }

    public static void b0(View view, B.w wVar) {
        view.onInitializeAccessibilityNodeInfo(wVar.M0());
    }

    public static int c(View view, CharSequence charSequence, B.z zVar) {
        int s4 = s(view, charSequence);
        if (s4 != -1) {
            d(view, new w.a(s4, charSequence, zVar));
        }
        return s4;
    }

    private static f c0() {
        return new b(AbstractC3482c.f46507K, CharSequence.class, 8, 28);
    }

    private static void d(View view, w.a aVar) {
        l(view);
        j0(aVar.b(), view);
        r(view).add(aVar);
        X(view, 0);
    }

    public static boolean d0(View view, int i4, Bundle bundle) {
        return view.performAccessibilityAction(i4, bundle);
    }

    public static C1301k0 e(View view) {
        if (f11918a == null) {
            f11918a = new WeakHashMap();
        }
        C1301k0 c1301k0 = (C1301k0) f11918a.get(view);
        if (c1301k0 != null) {
            return c1301k0;
        }
        C1301k0 c1301k02 = new C1301k0(view);
        f11918a.put(view, c1301k02);
        return c1301k02;
    }

    public static C1286d e0(View view, C1286d c1286d) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c1286d + ", view=" + view.getClass().getSimpleName() + b9.i.f15550d + view.getId() + b9.i.f15552e);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o.b(view, c1286d);
        }
        K k4 = (K) view.getTag(AbstractC3482c.f46509M);
        if (k4 == null) {
            return y(view).onReceiveContent(c1286d);
        }
        C1286d a4 = k4.a(view, c1286d);
        if (a4 == null) {
            return null;
        }
        return y(view).onReceiveContent(a4);
    }

    public static WindowInsetsCompat f(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
        return h.b(view, windowInsetsCompat, rect);
    }

    public static void f0(View view) {
        view.postInvalidateOnAnimation();
    }

    public static WindowInsetsCompat g(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
        if (windowInsets != null) {
            WindowInsets a4 = g.a(view, windowInsets);
            if (!a4.equals(windowInsets)) {
                return WindowInsetsCompat.toWindowInsetsCompat(a4, view);
            }
        }
        return windowInsetsCompat;
    }

    public static void g0(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static boolean h(View view, int i4, int i5, int i6, int i7, int[] iArr) {
        return h.f(view, i4, i5, i6, i7, iArr);
    }

    public static void h0(View view, Runnable runnable, long j4) {
        view.postOnAnimationDelayed(runnable, j4);
    }

    static boolean i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return r.a(view).b(view, keyEvent);
    }

    public static void i0(View view, int i4) {
        j0(i4, view);
        X(view, 0);
    }

    static boolean j(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return r.a(view).f(keyEvent);
    }

    private static void j0(int i4, View view) {
        List r4 = r(view);
        for (int i5 = 0; i5 < r4.size(); i5++) {
            if (((w.a) r4.get(i5)).b() == i4) {
                r4.remove(i5);
                return;
            }
        }
    }

    public static void k(View view) {
        l(view);
    }

    public static void k0(View view, w.a aVar, CharSequence charSequence, B.z zVar) {
        if (zVar == null && charSequence == null) {
            i0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, zVar));
        }
    }

    static void l(View view) {
        C1280a n4 = n(view);
        if (n4 == null) {
            n4 = new C1280a();
        }
        o0(view, n4);
    }

    public static void l0(View view) {
        g.c(view);
    }

    public static int m() {
        return View.generateViewId();
    }

    public static void m0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.d(view, context, iArr, attributeSet, typedArray, i4, i5);
        }
    }

    public static C1280a n(View view) {
        View.AccessibilityDelegate o4 = o(view);
        if (o4 == null) {
            return null;
        }
        return o4 instanceof C1280a.C0098a ? ((C1280a.C0098a) o4).f11917a : new C1280a(o4);
    }

    private static f n0() {
        return new a(AbstractC3482c.f46511O, Boolean.class, 28);
    }

    private static View.AccessibilityDelegate o(View view) {
        return Build.VERSION.SDK_INT >= 29 ? m.a(view) : p(view);
    }

    public static void o0(View view, C1280a c1280a) {
        if (c1280a == null && (o(view) instanceof C1280a.C0098a)) {
            c1280a = new C1280a();
        }
        A0(view);
        view.setAccessibilityDelegate(c1280a == null ? null : c1280a.getBridge());
    }

    private static View.AccessibilityDelegate p(View view) {
        if (f11920c) {
            return null;
        }
        if (f11919b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f11919b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f11920c = true;
                return null;
            }
        }
        try {
            Object obj = f11919b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f11920c = true;
            return null;
        }
    }

    public static void p0(View view, boolean z4) {
        b().f(view, Boolean.valueOf(z4));
    }

    public static CharSequence q(View view) {
        return (CharSequence) c0().e(view);
    }

    public static void q0(View view, int i4) {
        view.setAccessibilityLiveRegion(i4);
    }

    private static List r(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(AbstractC3482c.f46504H);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(AbstractC3482c.f46504H, arrayList2);
        return arrayList2;
    }

    public static void r0(View view, CharSequence charSequence) {
        c0().f(view, charSequence);
        if (charSequence != null) {
            f11923f.a(view);
        } else {
            f11923f.d(view);
        }
    }

    private static int s(View view, CharSequence charSequence) {
        List r4 = r(view);
        for (int i4 = 0; i4 < r4.size(); i4++) {
            if (TextUtils.equals(charSequence, ((w.a) r4.get(i4)).c())) {
                return ((w.a) r4.get(i4)).b();
            }
        }
        int i5 = -1;
        int i6 = 0;
        while (true) {
            int[] iArr = f11921d;
            if (i6 >= iArr.length || i5 != -1) {
                break;
            }
            int i7 = iArr[i6];
            boolean z4 = true;
            for (int i8 = 0; i8 < r4.size(); i8++) {
                z4 &= ((w.a) r4.get(i8)).b() != i7;
            }
            if (z4) {
                i5 = i7;
            }
            i6++;
        }
        return i5;
    }

    public static void s0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static ColorStateList t(View view) {
        return h.g(view);
    }

    public static void t0(View view, ColorStateList colorStateList) {
        h.q(view, colorStateList);
    }

    public static PorterDuff.Mode u(View view) {
        return h.h(view);
    }

    public static void u0(View view, PorterDuff.Mode mode) {
        h.r(view, mode);
    }

    public static Rect v(View view) {
        return view.getClipBounds();
    }

    public static void v0(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    public static Display w(View view) {
        return view.getDisplay();
    }

    public static void w0(View view, float f4) {
        h.s(view, f4);
    }

    public static float x(View view) {
        return h.i(view);
    }

    public static void x0(View view, boolean z4) {
        view.setFitsSystemWindows(z4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static L y(View view) {
        return view instanceof L ? (L) view : f11922e;
    }

    public static void y0(View view, boolean z4) {
        view.setHasTransientState(z4);
    }

    public static boolean z(View view) {
        return view.getFitsSystemWindows();
    }

    public static void z0(View view, int i4) {
        view.setImportantForAccessibility(i4);
    }
}
