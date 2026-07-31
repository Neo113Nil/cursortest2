package androidx.viewpager2.widget;

import B.w;
import B.z;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.AbstractC1281a0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import n0.AbstractC3264a;

/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* renamed from: u, reason: collision with root package name */
    static boolean f13228u = true;

    /* renamed from: a, reason: collision with root package name */
    private final Rect f13229a;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f13230b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.viewpager2.widget.b f13231c;

    /* renamed from: d, reason: collision with root package name */
    int f13232d;

    /* renamed from: e, reason: collision with root package name */
    boolean f13233e;

    /* renamed from: f, reason: collision with root package name */
    private RecyclerView.j f13234f;

    /* renamed from: g, reason: collision with root package name */
    LinearLayoutManager f13235g;

    /* renamed from: h, reason: collision with root package name */
    private int f13236h;

    /* renamed from: i, reason: collision with root package name */
    private Parcelable f13237i;

    /* renamed from: j, reason: collision with root package name */
    RecyclerView f13238j;

    /* renamed from: k, reason: collision with root package name */
    private q f13239k;

    /* renamed from: l, reason: collision with root package name */
    androidx.viewpager2.widget.e f13240l;

    /* renamed from: m, reason: collision with root package name */
    private androidx.viewpager2.widget.b f13241m;

    /* renamed from: n, reason: collision with root package name */
    private androidx.viewpager2.widget.c f13242n;

    /* renamed from: o, reason: collision with root package name */
    private androidx.viewpager2.widget.d f13243o;

    /* renamed from: p, reason: collision with root package name */
    private RecyclerView.m f13244p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f13245q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f13246r;

    /* renamed from: s, reason: collision with root package name */
    private int f13247s;

    /* renamed from: t, reason: collision with root package name */
    e f13248t;

    class a extends g {
        a() {
            super(null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f13233e = true;
            viewPager2.f13240l.j();
        }
    }

    class b extends i {
        b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void onPageScrollStateChanged(int i4) {
            if (i4 == 0) {
                ViewPager2.this.q();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void onPageSelected(int i4) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f13232d != i4) {
                viewPager2.f13232d = i4;
                viewPager2.f13248t.r();
            }
        }
    }

    class c extends i {
        c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void onPageSelected(int i4) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f13238j.requestFocus(2);
            }
        }
    }

    class d implements RecyclerView.r {
        d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void a(View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void b(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) qVar).width != -1 || ((ViewGroup.MarginLayoutParams) qVar).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    private abstract class e {
        private e() {
        }

        boolean a() {
            return false;
        }

        boolean b(int i4) {
            return false;
        }

        boolean c(int i4, Bundle bundle) {
            return false;
        }

        boolean d() {
            return false;
        }

        void e(RecyclerView.h hVar) {
        }

        void f(RecyclerView.h hVar) {
        }

        String g() {
            throw new IllegalStateException("Not implemented.");
        }

        void h(androidx.viewpager2.widget.b bVar, RecyclerView recyclerView) {
        }

        void i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        boolean l(int i4) {
            throw new IllegalStateException("Not implemented.");
        }

        boolean m(int i4, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        void n() {
        }

        CharSequence o() {
            throw new IllegalStateException("Not implemented.");
        }

        void p(AccessibilityEvent accessibilityEvent) {
        }

        void q() {
        }

        void r() {
        }

        void s() {
        }

        void t() {
        }

        /* synthetic */ e(ViewPager2 viewPager2, a aVar) {
            this();
        }

        void j(w wVar) {
        }

        void k(View view, w wVar) {
        }
    }

    class f extends e {
        f() {
            super(ViewPager2.this, null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean b(int i4) {
            return (i4 == 8192 || i4 == 4096) && !ViewPager2.this.f();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean d() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void j(w wVar) {
            if (ViewPager2.this.f()) {
                return;
            }
            wVar.c0(w.a.f153r);
            wVar.c0(w.a.f152q);
            wVar.F0(false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean l(int i4) {
            if (b(i4)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public CharSequence o() {
            if (d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    private static abstract class g extends RecyclerView.j {
        private g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void b(int i4, int i5, Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void c(int i4, int i5) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void d(int i4, int i5, int i6) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void e(int i4, int i5) {
            a();
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    private class h extends LinearLayoutManager {
        h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void calculateExtraLayoutSpace(RecyclerView.A a4, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.calculateExtraLayoutSpace(a4, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void onInitializeAccessibilityNodeInfo(RecyclerView.w wVar, RecyclerView.A a4, w wVar2) {
            super.onInitializeAccessibilityNodeInfo(wVar, a4, wVar2);
            ViewPager2.this.f13248t.j(wVar2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.w wVar, RecyclerView.A a4, View view, w wVar2) {
            ViewPager2.this.f13248t.k(view, wVar2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public boolean performAccessibilityAction(RecyclerView.w wVar, RecyclerView.A a4, int i4, Bundle bundle) {
            return ViewPager2.this.f13248t.b(i4) ? ViewPager2.this.f13248t.l(i4) : super.performAccessibilityAction(wVar, a4, i4, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z4, boolean z5) {
            return false;
        }
    }

    public static abstract class i {
        public void onPageScrollStateChanged(int i4) {
        }

        public void onPageScrolled(int i4, float f4, int i5) {
        }

        public void onPageSelected(int i4) {
        }
    }

    class j extends e {

        /* renamed from: b, reason: collision with root package name */
        private final z f13259b;

        /* renamed from: c, reason: collision with root package name */
        private final z f13260c;

        /* renamed from: d, reason: collision with root package name */
        private RecyclerView.j f13261d;

        class a implements z {
            a() {
            }

            @Override // B.z
            public boolean perform(View view, z.a aVar) {
                j.this.x(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        class b implements z {
            b() {
            }

            @Override // B.z
            public boolean perform(View view, z.a aVar) {
                j.this.x(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        class c extends g {
            c() {
                super(null);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.j
            public void a() {
                j.this.y();
            }
        }

        j() {
            super(ViewPager2.this, null);
            this.f13259b = new a();
            this.f13260c = new b();
        }

        private void u(w wVar) {
            int i4;
            int i5;
            if (ViewPager2.this.getAdapter() != null) {
                i5 = 1;
                if (ViewPager2.this.getOrientation() == 1) {
                    i5 = ViewPager2.this.getAdapter().getItemCount();
                    i4 = 1;
                } else {
                    i4 = ViewPager2.this.getAdapter().getItemCount();
                }
            } else {
                i4 = 0;
                i5 = 0;
            }
            wVar.m0(w.e.a(i5, i4, false, 0));
        }

        private void v(View view, w wVar) {
            wVar.n0(w.f.a(ViewPager2.this.getOrientation() == 1 ? ViewPager2.this.f13235g.getPosition(view) : 0, 1, ViewPager2.this.getOrientation() == 0 ? ViewPager2.this.f13235g.getPosition(view) : 0, 1, false, false));
        }

        private void w(w wVar) {
            int itemCount;
            RecyclerView.h adapter = ViewPager2.this.getAdapter();
            if (adapter == null || (itemCount = adapter.getItemCount()) == 0 || !ViewPager2.this.f()) {
                return;
            }
            if (ViewPager2.this.f13232d > 0) {
                wVar.a(8192);
            }
            if (ViewPager2.this.f13232d < itemCount - 1) {
                wVar.a(Base64Utils.IO_BUFFER_SIZE);
            }
            wVar.F0(true);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean a() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean c(int i4, Bundle bundle) {
            return i4 == 8192 || i4 == 4096;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void e(RecyclerView.h hVar) {
            y();
            if (hVar != null) {
                hVar.registerAdapterDataObserver(this.f13261d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void f(RecyclerView.h hVar) {
            if (hVar != null) {
                hVar.unregisterAdapterDataObserver(this.f13261d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public String g() {
            if (a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void h(androidx.viewpager2.widget.b bVar, RecyclerView recyclerView) {
            recyclerView.setImportantForAccessibility(2);
            this.f13261d = new c();
            if (ViewPager2.this.getImportantForAccessibility() == 0) {
                ViewPager2.this.setImportantForAccessibility(1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
            w N02 = w.N0(accessibilityNodeInfo);
            u(N02);
            w(N02);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        void k(View view, w wVar) {
            v(view, wVar);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean m(int i4, Bundle bundle) {
            if (!c(i4, bundle)) {
                throw new IllegalStateException();
            }
            x(i4 == 8192 ? ViewPager2.this.getCurrentItem() - 1 : ViewPager2.this.getCurrentItem() + 1);
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void n() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void p(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(g());
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void q() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void r() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void s() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void t() {
            y();
        }

        void x(int i4) {
            if (ViewPager2.this.f()) {
                ViewPager2.this.m(i4, true);
            }
        }

        void y() {
            int itemCount;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i4 = R.id.accessibilityActionPageLeft;
            AbstractC1281a0.i0(viewPager2, R.id.accessibilityActionPageLeft);
            AbstractC1281a0.i0(viewPager2, R.id.accessibilityActionPageRight);
            AbstractC1281a0.i0(viewPager2, R.id.accessibilityActionPageUp);
            AbstractC1281a0.i0(viewPager2, R.id.accessibilityActionPageDown);
            if (ViewPager2.this.getAdapter() == null || (itemCount = ViewPager2.this.getAdapter().getItemCount()) == 0 || !ViewPager2.this.f()) {
                return;
            }
            if (ViewPager2.this.getOrientation() != 0) {
                if (ViewPager2.this.f13232d < itemCount - 1) {
                    AbstractC1281a0.k0(viewPager2, new w.a(R.id.accessibilityActionPageDown, null), null, this.f13259b);
                }
                if (ViewPager2.this.f13232d > 0) {
                    AbstractC1281a0.k0(viewPager2, new w.a(R.id.accessibilityActionPageUp, null), null, this.f13260c);
                    return;
                }
                return;
            }
            boolean e4 = ViewPager2.this.e();
            int i5 = e4 ? 16908360 : 16908361;
            if (e4) {
                i4 = 16908361;
            }
            if (ViewPager2.this.f13232d < itemCount - 1) {
                AbstractC1281a0.k0(viewPager2, new w.a(i5, null), null, this.f13259b);
            }
            if (ViewPager2.this.f13232d > 0) {
                AbstractC1281a0.k0(viewPager2, new w.a(i4, null), null, this.f13260c);
            }
        }
    }

    public interface k {
        void transformPage(View view, float f4);
    }

    private class l extends q {
        l() {
        }

        @Override // androidx.recyclerview.widget.q, androidx.recyclerview.widget.u
        public View findSnapView(RecyclerView.p pVar) {
            if (ViewPager2.this.d()) {
                return null;
            }
            return super.findSnapView(pVar);
        }
    }

    private class m extends RecyclerView {
        m(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            return ViewPager2.this.f13248t.d() ? ViewPager2.this.f13248t.o() : super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f13232d);
            accessibilityEvent.setToIndex(ViewPager2.this.f13232d);
            ViewPager2.this.f13248t.p(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.f() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.f() && super.onTouchEvent(motionEvent);
        }
    }

    private static class n implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final int f13268b;

        /* renamed from: c, reason: collision with root package name */
        private final RecyclerView f13269c;

        n(int i4, RecyclerView recyclerView) {
            this.f13268b = i4;
            this.f13269c = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f13269c.smoothScrollToPosition(this.f13268b);
        }
    }

    public ViewPager2(Context context) {
        super(context);
        this.f13229a = new Rect();
        this.f13230b = new Rect();
        this.f13231c = new androidx.viewpager2.widget.b(3);
        this.f13233e = false;
        this.f13234f = new a();
        this.f13236h = -1;
        this.f13244p = null;
        this.f13245q = false;
        this.f13246r = true;
        this.f13247s = -1;
        c(context, null);
    }

    private RecyclerView.r b() {
        return new d();
    }

    private void c(Context context, AttributeSet attributeSet) {
        this.f13248t = f13228u ? new j() : new f();
        m mVar = new m(context);
        this.f13238j = mVar;
        mVar.setId(View.generateViewId());
        this.f13238j.setDescendantFocusability(131072);
        h hVar = new h(context);
        this.f13235g = hVar;
        this.f13238j.setLayoutManager(hVar);
        this.f13238j.setScrollingTouchSlop(1);
        n(context, attributeSet);
        this.f13238j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f13238j.addOnChildAttachStateChangeListener(b());
        androidx.viewpager2.widget.e eVar = new androidx.viewpager2.widget.e(this);
        this.f13240l = eVar;
        this.f13242n = new androidx.viewpager2.widget.c(this, eVar, this.f13238j);
        l lVar = new l();
        this.f13239k = lVar;
        lVar.attachToRecyclerView(this.f13238j);
        this.f13238j.addOnScrollListener(this.f13240l);
        androidx.viewpager2.widget.b bVar = new androidx.viewpager2.widget.b(3);
        this.f13241m = bVar;
        this.f13240l.m(bVar);
        b bVar2 = new b();
        c cVar = new c();
        this.f13241m.a(bVar2);
        this.f13241m.a(cVar);
        this.f13248t.h(this.f13241m, this.f13238j);
        this.f13241m.a(this.f13231c);
        androidx.viewpager2.widget.d dVar = new androidx.viewpager2.widget.d(this.f13235g);
        this.f13243o = dVar;
        this.f13241m.a(dVar);
        RecyclerView recyclerView = this.f13238j;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    private void g(RecyclerView.h hVar) {
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.f13234f);
        }
    }

    private void k() {
        RecyclerView.h adapter;
        if (this.f13236h == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        if (this.f13237i != null) {
            this.f13237i = null;
        }
        int max = Math.max(0, Math.min(this.f13236h, adapter.getItemCount() - 1));
        this.f13232d = max;
        this.f13236h = -1;
        this.f13238j.scrollToPosition(max);
        this.f13248t.n();
    }

    private void n(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3264a.f41375a);
        AbstractC1281a0.m0(this, context, AbstractC3264a.f41375a, attributeSet, obtainStyledAttributes, 0, 0);
        try {
            setOrientation(obtainStyledAttributes.getInt(AbstractC3264a.f41376b, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void o(RecyclerView.h hVar) {
        if (hVar != null) {
            hVar.unregisterAdapterDataObserver(this.f13234f);
        }
    }

    public void a(RecyclerView.o oVar) {
        this.f13238j.addItemDecoration(oVar);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i4) {
        return this.f13238j.canScrollHorizontally(i4);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i4) {
        return this.f13238j.canScrollVertically(i4);
    }

    public boolean d() {
        return this.f13242n.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i4 = ((SavedState) parcelable).f13249b;
            sparseArray.put(this.f13238j.getId(), (Parcelable) sparseArray.get(i4));
            sparseArray.remove(i4);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        k();
    }

    boolean e() {
        return this.f13235g.getLayoutDirection() == 1;
    }

    public boolean f() {
        return this.f13246r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return this.f13248t.a() ? this.f13248t.g() : super.getAccessibilityClassName();
    }

    public RecyclerView.h getAdapter() {
        return this.f13238j.getAdapter();
    }

    public int getCurrentItem() {
        return this.f13232d;
    }

    public int getItemDecorationCount() {
        return this.f13238j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f13247s;
    }

    public int getOrientation() {
        return this.f13235g.getOrientation() == 1 ? 1 : 0;
    }

    int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f13238j;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f13240l.f();
    }

    public void h(i iVar) {
        this.f13231c.a(iVar);
    }

    public void i(int i4) {
        this.f13238j.removeItemDecorationAt(i4);
    }

    public void j() {
        if (this.f13243o.a() == null) {
            return;
        }
        double e4 = this.f13240l.e();
        int i4 = (int) e4;
        float f4 = (float) (e4 - i4);
        this.f13243o.onPageScrolled(i4, f4, Math.round(getPageSize() * f4));
    }

    public void l(int i4, boolean z4) {
        if (d()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        m(i4, z4);
    }

    void m(int i4, boolean z4) {
        RecyclerView.h adapter = getAdapter();
        if (adapter == null) {
            if (this.f13236h != -1) {
                this.f13236h = Math.max(i4, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int min = Math.min(Math.max(i4, 0), adapter.getItemCount() - 1);
        if (min == this.f13232d && this.f13240l.h()) {
            return;
        }
        int i5 = this.f13232d;
        if (min == i5 && z4) {
            return;
        }
        double d4 = i5;
        this.f13232d = min;
        this.f13248t.r();
        if (!this.f13240l.h()) {
            d4 = this.f13240l.e();
        }
        this.f13240l.k(min, z4);
        if (!z4) {
            this.f13238j.scrollToPosition(min);
            return;
        }
        double d5 = min;
        if (Math.abs(d5 - d4) <= 3.0d) {
            this.f13238j.smoothScrollToPosition(min);
            return;
        }
        this.f13238j.scrollToPosition(d5 > d4 ? min - 3 : min + 3);
        RecyclerView recyclerView = this.f13238j;
        recyclerView.post(new n(min, recyclerView));
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f13248t.i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int measuredWidth = this.f13238j.getMeasuredWidth();
        int measuredHeight = this.f13238j.getMeasuredHeight();
        this.f13229a.left = getPaddingLeft();
        this.f13229a.right = (i6 - i4) - getPaddingRight();
        this.f13229a.top = getPaddingTop();
        this.f13229a.bottom = (i7 - i5) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f13229a, this.f13230b);
        RecyclerView recyclerView = this.f13238j;
        Rect rect = this.f13230b;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f13233e) {
            q();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        measureChild(this.f13238j, i4, i5);
        int measuredWidth = this.f13238j.getMeasuredWidth();
        int measuredHeight = this.f13238j.getMeasuredHeight();
        int measuredState = this.f13238j.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i4, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i5, measuredState << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f13236h = savedState.f13250c;
        this.f13237i = savedState.f13251d;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f13249b = this.f13238j.getId();
        int i4 = this.f13236h;
        if (i4 == -1) {
            i4 = this.f13232d;
        }
        savedState.f13250c = i4;
        Parcelable parcelable = this.f13237i;
        if (parcelable != null) {
            savedState.f13251d = parcelable;
            return savedState;
        }
        this.f13238j.getAdapter();
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    public void p(i iVar) {
        this.f13231c.b(iVar);
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i4, Bundle bundle) {
        return this.f13248t.c(i4, bundle) ? this.f13248t.m(i4, bundle) : super.performAccessibilityAction(i4, bundle);
    }

    void q() {
        q qVar = this.f13239k;
        if (qVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View findSnapView = qVar.findSnapView(this.f13235g);
        if (findSnapView == null) {
            return;
        }
        int position = this.f13235g.getPosition(findSnapView);
        if (position != this.f13232d && getScrollState() == 0) {
            this.f13241m.onPageSelected(position);
        }
        this.f13233e = false;
    }

    public void setAdapter(RecyclerView.h hVar) {
        RecyclerView.h adapter = this.f13238j.getAdapter();
        this.f13248t.f(adapter);
        o(adapter);
        this.f13238j.setAdapter(hVar);
        this.f13232d = 0;
        k();
        this.f13248t.e(hVar);
        g(hVar);
    }

    public void setCurrentItem(int i4) {
        l(i4, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i4) {
        super.setLayoutDirection(i4);
        this.f13248t.q();
    }

    public void setOffscreenPageLimit(int i4) {
        if (i4 < 1 && i4 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f13247s = i4;
        this.f13238j.requestLayout();
    }

    public void setOrientation(int i4) {
        this.f13235g.setOrientation(i4);
        this.f13248t.s();
    }

    public void setPageTransformer(k kVar) {
        if (kVar != null) {
            if (!this.f13245q) {
                this.f13244p = this.f13238j.getItemAnimator();
                this.f13245q = true;
            }
            this.f13238j.setItemAnimator(null);
        } else if (this.f13245q) {
            this.f13238j.setItemAnimator(this.f13244p);
            this.f13244p = null;
            this.f13245q = false;
        }
        if (kVar == this.f13243o.a()) {
            return;
        }
        this.f13243o.b(kVar);
        j();
    }

    public void setUserInputEnabled(boolean z4) {
        this.f13246r = z4;
        this.f13248t.t();
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        int f13249b;

        /* renamed from: c, reason: collision with root package name */
        int f13250c;

        /* renamed from: d, reason: collision with root package name */
        Parcelable f13251d;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader);
        }

        private void a(Parcel parcel, ClassLoader classLoader) {
            this.f13249b = parcel.readInt();
            this.f13250c = parcel.readInt();
            this.f13251d = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f13249b);
            parcel.writeInt(this.f13250c);
            parcel.writeParcelable(this.f13251d, i4);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
