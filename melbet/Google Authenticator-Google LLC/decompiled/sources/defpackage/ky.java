package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ky {
    public int A;
    public int B;
    public int C;
    public int D;
    public final afr E;
    public final afr F;
    private final mm a;
    private final mm b;
    ja r;
    public RecyclerView s;
    public ll t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public final boolean x;
    public int y;
    public boolean z;

    public ky() {
        kw kwVar = new kw(this, 1);
        this.a = kwVar;
        kw kwVar2 = new kw(this, 0);
        this.b = kwVar2;
        this.E = new afr(kwVar);
        this.F = new afr(kwVar2);
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = true;
    }

    public static kx aD(Context context, AttributeSet attributeSet, int i, int i2) {
        kx kxVar = new kx();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ep.a, i, i2);
        kxVar.a = obtainStyledAttributes.getInt(0, 1);
        kxVar.b = obtainStyledAttributes.getInt(11, 1);
        kxVar.c = obtainStyledAttributes.getBoolean(10, false);
        kxVar.d = obtainStyledAttributes.getBoolean(12, false);
        obtainStyledAttributes.recycle();
        return kxVar;
    }

    public static int as(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r4 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int au(int i, int i2, int i3, int i4, boolean z) {
        int max = Math.max(0, i - i3);
        if (z) {
            if (i4 < 0) {
                if (i4 == -1) {
                    if (i2 != Integer.MIN_VALUE) {
                        if (i2 != 0) {
                        }
                    }
                    i4 = max;
                }
                i2 = 0;
                i4 = 0;
            }
            i2 = 1073741824;
        } else {
            if (i4 < 0) {
                if (i4 != -1) {
                    if (i4 == -2) {
                        if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                            i4 = max;
                            i2 = Integer.MIN_VALUE;
                        } else {
                            i4 = max;
                            i2 = 0;
                        }
                    }
                    i2 = 0;
                    i4 = 0;
                }
                i4 = max;
            }
            i2 = 1073741824;
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    public static boolean bc(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static final int bh(View view) {
        return ((kz) view.getLayoutParams()).d.bottom;
    }

    public static final int bi(View view) {
        Rect rect = ((kz) view.getLayoutParams()).d;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static final int bj(View view) {
        Rect rect = ((kz) view.getLayoutParams()).d;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static final int bk(View view) {
        return ((kz) view.getLayoutParams()).d.left;
    }

    public static final int bl(View view) {
        return ((kz) view.getLayoutParams()).a();
    }

    public static final int bm(View view) {
        return ((kz) view.getLayoutParams()).d.right;
    }

    public static final int bn(View view) {
        return ((kz) view.getLayoutParams()).d.top;
    }

    public static final void bq(View view, int i, int i2, int i3, int i4) {
        kz kzVar = (kz) view.getLayoutParams();
        Rect rect = kzVar.d;
        view.layout(i + rect.left + kzVar.leftMargin, i2 + rect.top + kzVar.topMargin, (i3 - rect.right) - kzVar.rightMargin, (i4 - rect.bottom) - kzVar.bottomMargin);
    }

    public static final int bv(View view) {
        return view.getBottom() + bh(view);
    }

    public static final int bw(View view) {
        return view.getLeft() - bk(view);
    }

    public static final int bx(View view) {
        return view.getRight() + bm(view);
    }

    public static final int by(View view) {
        return view.getTop() - bn(view);
    }

    public int C(lm lmVar) {
        throw null;
    }

    public int D(lm lmVar) {
        throw null;
    }

    public int E(lm lmVar) {
        throw null;
    }

    public int F(lm lmVar) {
        throw null;
    }

    public int G(lm lmVar) {
        throw null;
    }

    public int H(lm lmVar) {
        throw null;
    }

    public Parcelable N() {
        throw null;
    }

    public View R(int i) {
        int at = at();
        for (int i2 = 0; i2 < at; i2++) {
            View aF = aF(i2);
            lp h = RecyclerView.h(aF);
            if (h != null && h.b() == i && !h.z() && (this.s.M.g || !h.u())) {
                return aF;
            }
        }
        return null;
    }

    public void T(String str) {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            recyclerView.t(str);
        }
    }

    public void W(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.s;
        le leVar = recyclerView.e;
        lm lmVar = recyclerView.M;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.s.canScrollVertically(-1) && !this.s.canScrollHorizontally(-1) && !this.s.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        kr krVar = this.s.l;
        if (krVar != null) {
            accessibilityEvent.setItemCount(krVar.a());
        }
    }

    public void Y(Parcelable parcelable) {
        throw null;
    }

    public int a(le leVar, lm lmVar) {
        kr krVar;
        RecyclerView recyclerView = this.s;
        if (recyclerView == null || (krVar = recyclerView.l) == null || !ad()) {
            return 1;
        }
        return krVar.a();
    }

    public final int aA() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int aB() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int aC() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public final View aE(View view) {
        View j;
        RecyclerView recyclerView = this.s;
        if (recyclerView == null || (j = recyclerView.j(view)) == null || this.r.k(j)) {
            return null;
        }
        return j;
    }

    public final View aF(int i) {
        ja jaVar = this.r;
        if (jaVar != null) {
            return jaVar.e(i);
        }
        return null;
    }

    public final View aG() {
        View focusedChild;
        RecyclerView recyclerView = this.s;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.r.k(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public final void aH(View view, int i, boolean z) {
        lp h = RecyclerView.h(view);
        if (z || h.u()) {
            this.s.V.e(h);
        } else {
            this.s.V.h(h);
        }
        kz kzVar = (kz) view.getLayoutParams();
        if (h.A() || h.v()) {
            if (h.v()) {
                h.o();
            } else {
                h.h();
            }
            this.r.h(view, i, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.s;
            ja jaVar = this.r;
            if (parent == recyclerView) {
                int d = jaVar.d(view);
                if (i == -1) {
                    i = this.r.a();
                }
                if (d == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.s.indexOfChild(view) + this.s.k());
                }
                if (d != i) {
                    ky kyVar = this.s.m;
                    View aF = kyVar.aF(d);
                    if (aF == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + d + kyVar.s.toString());
                    }
                    kyVar.aK(d);
                    kz kzVar2 = (kz) aF.getLayoutParams();
                    lp h2 = RecyclerView.h(aF);
                    if (h2.u()) {
                        kyVar.s.V.e(h2);
                    } else {
                        kyVar.s.V.h(h2);
                    }
                    kyVar.r.h(aF, i, kzVar2, h2.u());
                }
            } else {
                jaVar.g(view, i, false);
                kzVar.e = true;
                ll llVar = this.t;
                if (llVar != null && llVar.f && ll.i(view) == llVar.b) {
                    llVar.g = view;
                }
            }
        }
        if (kzVar.f) {
            h.a.invalidate();
            kzVar.f = false;
        }
    }

    public final void aI(View view, Rect rect) {
        RecyclerView recyclerView = this.s;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.e(view));
        }
    }

    public final void aJ(le leVar) {
        int at = at();
        while (true) {
            at--;
            if (at < 0) {
                return;
            }
            View aF = aF(at);
            lp h = RecyclerView.h(aF);
            if (!h.z()) {
                if (!h.s() || h.u() || this.s.l.c) {
                    aK(at);
                    leVar.k(aF);
                    this.s.V.h(h);
                } else {
                    aT(at);
                    leVar.j(h);
                }
            }
        }
    }

    public final void aK(int i) {
        aF(i);
        this.r.i(i);
    }

    public void aL(int i) {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            int a = recyclerView.h.a();
            for (int i2 = 0; i2 < a; i2++) {
                recyclerView.h.e(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void aM(int i) {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            int a = recyclerView.h.a();
            for (int i2 = 0; i2 < a; i2++) {
                recyclerView.h.e(i2).offsetTopAndBottom(i);
            }
        }
    }

    public final void aN(View view, aah aahVar) {
        lp h = RecyclerView.h(view);
        if (h == null || h.u() || this.r.k(h.a)) {
            return;
        }
        RecyclerView recyclerView = this.s;
        o(recyclerView.e, recyclerView.M, view, aahVar);
    }

    public final void aP(le leVar) {
        int at = at();
        while (true) {
            at--;
            if (at < 0) {
                return;
            }
            if (!RecyclerView.h(aF(at)).z()) {
                aS(at, leVar);
            }
        }
    }

    public final void aQ(le leVar) {
        ArrayList arrayList = leVar.a;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((lp) arrayList.get(i)).a;
            lp h = RecyclerView.h(view);
            if (!h.z()) {
                h.m(false);
                if (h.w()) {
                    this.s.removeDetachedView(view, false);
                }
                kv kvVar = this.s.C;
                if (kvVar != null) {
                    kvVar.d(h);
                }
                h.m(true);
                leVar.f(view);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = leVar.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.s.invalidate();
        }
    }

    public final void aR(View view, le leVar) {
        ja jaVar = this.r;
        int i = jaVar.c;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            jaVar.c = 1;
            jaVar.d = view;
            kee keeVar = jaVar.e;
            int C = keeVar.C(view);
            if (C >= 0) {
                if (jaVar.a.g(C)) {
                    jaVar.l(view);
                }
                keeVar.F(C);
            }
            jaVar.c = 0;
            jaVar.d = null;
            leVar.i(view);
        } catch (Throwable th) {
            jaVar.c = 0;
            jaVar.d = null;
            throw th;
        }
    }

    public final void aS(int i, le leVar) {
        View aF = aF(i);
        aT(i);
        leVar.i(aF);
    }

    public final void aT(int i) {
        if (aF(i) != null) {
            ja jaVar = this.r;
            int i2 = jaVar.c;
            if (i2 == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i2 == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                int b = jaVar.b(i);
                kee keeVar = jaVar.e;
                View D = keeVar.D(b);
                if (D == null) {
                    return;
                }
                jaVar.c = 1;
                jaVar.d = D;
                if (jaVar.a.g(b)) {
                    jaVar.l(D);
                }
                keeVar.F(b);
            } finally {
                jaVar.c = 0;
                jaVar.d = null;
            }
        }
    }

    public final void aU() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void aV() {
        this.u = true;
    }

    public final void aW(RecyclerView recyclerView) {
        aX(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void aX(int i, int i2) {
        this.C = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.A = mode;
        if (mode == 0 && !RecyclerView.a) {
            this.C = 0;
        }
        this.D = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.B = mode2;
        if (mode2 != 0 || RecyclerView.a) {
            return;
        }
        this.D = 0;
    }

    public final void aY(int i, int i2) {
        this.s.setMeasuredDimension(i, i2);
    }

    public final void aZ(int i, int i2) {
        int at = at();
        if (at == 0) {
            this.s.y(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MIN_VALUE;
        for (int i7 = 0; i7 < at; i7++) {
            View aF = aF(i7);
            Rect rect = this.s.j;
            RecyclerView.I(aF, rect);
            if (rect.left < i4) {
                i4 = rect.left;
            }
            if (rect.right > i3) {
                i3 = rect.right;
            }
            if (rect.top < i5) {
                i5 = rect.top;
            }
            if (rect.bottom > i6) {
                i6 = rect.bottom;
            }
        }
        this.s.j.set(i4, i5, i3, i6);
        r(this.s.j, i, i2);
    }

    public void aa(int i) {
        throw null;
    }

    public boolean ad() {
        throw null;
    }

    public boolean ae() {
        throw null;
    }

    public boolean af() {
        throw null;
    }

    public boolean ah() {
        throw null;
    }

    public boolean aj() {
        return false;
    }

    public void ak(int i, int i2, lm lmVar, jv jvVar) {
        throw null;
    }

    public void aq(RecyclerView recyclerView, int i) {
        throw null;
    }

    public final int at() {
        ja jaVar = this.r;
        if (jaVar != null) {
            return jaVar.a();
        }
        return 0;
    }

    public final int av() {
        RecyclerView recyclerView = this.s;
        kr krVar = recyclerView != null ? recyclerView.l : null;
        if (krVar != null) {
            return krVar.a();
        }
        return 0;
    }

    public final int aw() {
        return this.s.getLayoutDirection();
    }

    public final int ax() {
        RecyclerView recyclerView = this.s;
        int i = yq.a;
        return recyclerView.getMinimumHeight();
    }

    public final int ay() {
        RecyclerView recyclerView = this.s;
        int i = yq.a;
        return recyclerView.getMinimumWidth();
    }

    public final int az() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public int b(le leVar, lm lmVar) {
        kr krVar;
        RecyclerView recyclerView = this.s;
        if (recyclerView == null || (krVar = recyclerView.l) == null || !ae()) {
            return 1;
        }
        return krVar.a();
    }

    public final void ba(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.s = null;
            this.r = null;
            this.C = 0;
            this.D = 0;
        } else {
            this.s = recyclerView;
            this.r = recyclerView.h;
            this.C = recyclerView.getWidth();
            this.D = recyclerView.getHeight();
        }
        this.A = 1073741824;
        this.B = 1073741824;
    }

    public final void bb(ll llVar) {
        ll llVar2 = this.t;
        if (llVar2 != null && llVar != llVar2 && llVar2.f) {
            llVar2.f();
        }
        this.t = llVar;
        RecyclerView recyclerView = this.s;
        recyclerView.J.d();
        if (llVar.h) {
            Log.w("RecyclerView", "An instance of " + llVar.getClass().getSimpleName() + " was started more than once. Each instance of" + llVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        llVar.c = recyclerView;
        llVar.d = this;
        int i = llVar.b;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        RecyclerView recyclerView2 = llVar.c;
        recyclerView2.M.a = i;
        llVar.f = true;
        llVar.e = true;
        llVar.g = recyclerView2.m.R(llVar.b);
        llVar.c.J.b();
        llVar.h = true;
    }

    public final boolean bd() {
        ll llVar = this.t;
        return llVar != null && llVar.f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a8, code lost:
    
        if ((r8.bottom - r2) > r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean be(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int aA = aA();
        int aC = aC();
        int aB = this.C - aB();
        int az = this.D - az();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i = left - aA;
        int i2 = top - aC;
        int i3 = height - az;
        int min = Math.min(0, i);
        int i4 = width - aB;
        int min2 = Math.min(0, i2);
        int max = Math.max(0, i4);
        int max2 = Math.max(0, i3);
        if (aw() == 1) {
            min = max != 0 ? max : Math.max(min, i4);
        } else if (min == 0) {
            min = Math.min(i, max);
        }
        if (min2 == 0) {
            min2 = Math.min(i2, max2);
        }
        int i5 = new int[]{min, min2}[0];
        if (z2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int aA2 = aA();
                int aC2 = aC();
                int aB2 = this.C - aB();
                int az2 = this.D - az();
                Rect rect2 = this.s.j;
                RecyclerView.I(focusedChild, rect2);
                if (rect2.left - i5 < aB2) {
                    if (rect2.right - i5 > aA2) {
                        if (rect2.top - min2 < az2) {
                        }
                    }
                }
            }
            return false;
        }
        if (i5 == 0) {
            if (min2 != 0) {
                i5 = 0;
            }
            return false;
        }
        if (z) {
            recyclerView.scrollBy(i5, min2);
        } else {
            recyclerView.ap(i5, min2, false);
        }
        return true;
    }

    public final boolean bf(View view, int i, int i2, kz kzVar) {
        return (!view.isLayoutRequested() && this.w && bc(view.getWidth(), i, kzVar.width) && bc(view.getHeight(), i2, kzVar.height)) ? false : true;
    }

    public final void bg() {
        this.v = true;
    }

    public final void bo(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((kz) view.getLayoutParams()).d;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.s != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.s.k;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final boolean bp(View view) {
        return (this.E.l(view) && this.F.l(view)) ? false : true;
    }

    public final void bs(int i, int i2) {
        this.s.y(i, i2);
    }

    public final void bt(Runnable runnable) {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(runnable);
        }
    }

    public final void bu(RecyclerView recyclerView) {
        this.v = false;
        ap(recyclerView);
    }

    public final boolean bz(int i, Bundle bundle) {
        int aC;
        int aA;
        float f;
        if (this.s == null) {
            return false;
        }
        int i2 = this.D;
        int i3 = this.C;
        Rect rect = new Rect();
        if (this.s.getMatrix().isIdentity() && this.s.getGlobalVisibleRect(rect)) {
            i2 = rect.height();
            i3 = rect.width();
        }
        if (i == 4096) {
            aC = this.s.canScrollVertically(1) ? (i2 - aC()) - az() : 0;
            if (this.s.canScrollHorizontally(1)) {
                aA = (i3 - aA()) - aB();
            }
            aA = 0;
        } else if (i != 8192) {
            aC = 0;
            aA = 0;
        } else {
            aC = this.s.canScrollVertically(-1) ? -((i2 - aC()) - az()) : 0;
            if (this.s.canScrollHorizontally(-1)) {
                aA = -((i3 - aA()) - aB());
            }
            aA = 0;
        }
        if (aC == 0) {
            if (aA == 0) {
                return false;
            }
            aC = 0;
        }
        if (bundle != null) {
            f = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
            if (f < 0.0f) {
                return false;
            }
        } else {
            f = 1.0f;
        }
        if (Float.compare(f, Float.POSITIVE_INFINITY) != 0) {
            if (Float.compare(1.0f, f) != 0 && Float.compare(0.0f, f) != 0) {
                aC = (int) (aC * f);
                aA = (int) (aA * f);
            }
            this.s.ap(aA, aC, true);
            return true;
        }
        RecyclerView recyclerView = this.s;
        if (recyclerView.l == null) {
            return false;
        }
        if (i == 4096) {
            recyclerView.aa(r12.a() - 1);
        } else if (i == 8192) {
            recyclerView.aa(0);
        }
        return true;
    }

    public int d(int i, le leVar, lm lmVar) {
        throw null;
    }

    public int e(int i, le leVar, lm lmVar) {
        throw null;
    }

    public abstract kz f();

    public kz g(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof kz ? new kz((kz) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new kz((ViewGroup.MarginLayoutParams) layoutParams) : new kz(layoutParams);
    }

    public kz h(Context context, AttributeSet attributeSet) {
        return new kz(context, attributeSet);
    }

    public View j(int i, le leVar, lm lmVar) {
        throw null;
    }

    public View k(View view, int i, le leVar, lm lmVar) {
        throw null;
    }

    public void n(le leVar, lm lmVar, aah aahVar) {
        if (this.s.canScrollVertically(-1) || this.s.canScrollHorizontally(-1)) {
            aahVar.g(8192);
            aahVar.J();
            aahVar.I();
        }
        if (this.s.canScrollVertically(1) || this.s.canScrollHorizontally(1)) {
            aahVar.g(4096);
            aahVar.J();
            aahVar.I();
        }
        aahVar.q(brn.ab(b(leVar, lmVar), a(leVar, lmVar), 0));
    }

    public void o(le leVar, lm lmVar, View view, aah aahVar) {
        aahVar.r(brn.aa(ae() ? bl(view) : 0, 1, ad() ? bl(view) : 0, 1, false, false));
    }

    public void p(le leVar, lm lmVar) {
        throw null;
    }

    public void r(Rect rect, int i, int i2) {
        aY(as(i, rect.width() + aA() + aB(), ay()), as(i2, rect.height() + aC() + az(), ax()));
    }

    public boolean t(kz kzVar) {
        return kzVar != null;
    }

    public boolean u(int i, Bundle bundle) {
        RecyclerView recyclerView = this.s;
        le leVar = recyclerView.e;
        lm lmVar = recyclerView.M;
        return bz(i, bundle);
    }

    public boolean v() {
        throw null;
    }

    public void br() {
    }

    public void y() {
    }

    public void aO(int i) {
    }

    public void ap(RecyclerView recyclerView) {
    }

    public void q(lm lmVar) {
    }

    public void A(int i, int i2) {
    }

    public void B(int i, int i2) {
    }

    public void al(int i, jv jvVar) {
    }

    public void x(int i, int i2) {
    }

    public void z(int i, int i2) {
    }
}
