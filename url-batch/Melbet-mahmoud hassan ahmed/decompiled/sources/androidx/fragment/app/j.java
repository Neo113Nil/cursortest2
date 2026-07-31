package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.lifecycle.e;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
final class j extends androidx.fragment.app.i implements LayoutInflater.Factory2 {
    static boolean M = false;
    static final Interpolator N = new DecelerateInterpolator(2.5f);
    static final Interpolator O = new DecelerateInterpolator(1.5f);
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    ArrayList<androidx.fragment.app.a> E;
    ArrayList<Boolean> F;
    ArrayList<Fragment> G;
    ArrayList<m> J;
    private androidx.fragment.app.l K;

    /* renamed from: h, reason: collision with root package name */
    ArrayList<k> f688h;

    /* renamed from: i, reason: collision with root package name */
    boolean f689i;

    /* renamed from: m, reason: collision with root package name */
    ArrayList<androidx.fragment.app.a> f693m;

    /* renamed from: n, reason: collision with root package name */
    ArrayList<Fragment> f694n;

    /* renamed from: o, reason: collision with root package name */
    private OnBackPressedDispatcher f695o;

    /* renamed from: q, reason: collision with root package name */
    ArrayList<androidx.fragment.app.a> f697q;

    /* renamed from: r, reason: collision with root package name */
    ArrayList<Integer> f698r;

    /* renamed from: s, reason: collision with root package name */
    ArrayList<i.b> f699s;

    /* renamed from: v, reason: collision with root package name */
    androidx.fragment.app.h f702v;

    /* renamed from: w, reason: collision with root package name */
    androidx.fragment.app.e f703w;

    /* renamed from: x, reason: collision with root package name */
    Fragment f704x;

    /* renamed from: y, reason: collision with root package name */
    Fragment f705y;

    /* renamed from: z, reason: collision with root package name */
    boolean f706z;

    /* renamed from: j, reason: collision with root package name */
    int f690j = 0;

    /* renamed from: k, reason: collision with root package name */
    final ArrayList<Fragment> f691k = new ArrayList<>();

    /* renamed from: l, reason: collision with root package name */
    final HashMap<String, Fragment> f692l = new HashMap<>();

    /* renamed from: p, reason: collision with root package name */
    private final androidx.activity.b f696p = new a(false);

    /* renamed from: t, reason: collision with root package name */
    private final CopyOnWriteArrayList<i> f700t = new CopyOnWriteArrayList<>();

    /* renamed from: u, reason: collision with root package name */
    int f701u = 0;
    Bundle H = null;
    SparseArray<Parcelable> I = null;
    Runnable L = new b();

    class a extends androidx.activity.b {
        a(boolean z6) {
            super(z6);
        }

        @Override // androidx.activity.b
        public void b() {
            j.this.A0();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.j0();
        }
    }

    class c implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f709a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f710b;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (c.this.f710b.l() != null) {
                    c.this.f710b.b1(null);
                    c cVar = c.this;
                    j jVar = j.this;
                    Fragment fragment = cVar.f710b;
                    jVar.Q0(fragment, fragment.G(), 0, 0, false);
                }
            }
        }

        c(ViewGroup viewGroup, Fragment fragment) {
            this.f709a = viewGroup;
            this.f710b = fragment;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f709a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f713a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f714b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f715c;

        d(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f713a = viewGroup;
            this.f714b = view;
            this.f715c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f713a.endViewTransition(this.f714b);
            Animator m7 = this.f715c.m();
            this.f715c.c1(null);
            if (m7 == null || this.f713a.indexOfChild(this.f714b) >= 0) {
                return;
            }
            j jVar = j.this;
            Fragment fragment = this.f715c;
            jVar.Q0(fragment, fragment.G(), 0, 0, false);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f717a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f718b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f719c;

        e(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f717a = viewGroup;
            this.f718b = view;
            this.f719c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f717a.endViewTransition(this.f718b);
            animator.removeListener(this);
            Fragment fragment = this.f719c;
            View view = fragment.L;
            if (view == null || !fragment.D) {
                return;
            }
            view.setVisibility(8);
        }
    }

    class f extends androidx.fragment.app.g {
        f() {
        }

        @Override // androidx.fragment.app.g
        public Fragment a(ClassLoader classLoader, String str) {
            androidx.fragment.app.h hVar = j.this.f702v;
            return hVar.b(hVar.g(), str, null);
        }
    }

    private static class g {

        /* renamed from: a, reason: collision with root package name */
        public final Animation f722a;

        /* renamed from: b, reason: collision with root package name */
        public final Animator f723b;

        g(Animator animator) {
            this.f722a = null;
            this.f723b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        g(Animation animation) {
            this.f722a = animation;
            this.f723b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    private static class h extends AnimationSet implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        private final ViewGroup f724f;

        /* renamed from: g, reason: collision with root package name */
        private final View f725g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f726h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f727i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f728j;

        h(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f728j = true;
            this.f724f = viewGroup;
            this.f725g = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j7, Transformation transformation) {
            this.f728j = true;
            if (this.f726h) {
                return !this.f727i;
            }
            if (!super.getTransformation(j7, transformation)) {
                this.f726h = true;
                androidx.core.view.f.a(this.f724f, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j7, Transformation transformation, float f7) {
            this.f728j = true;
            if (this.f726h) {
                return !this.f727i;
            }
            if (!super.getTransformation(j7, transformation, f7)) {
                this.f726h = true;
                androidx.core.view.f.a(this.f724f, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f726h || !this.f728j) {
                this.f724f.endViewTransition(this.f725g);
                this.f727i = true;
            } else {
                this.f728j = false;
                this.f724f.post(this);
            }
        }
    }

    private static final class i {

        /* renamed from: a, reason: collision with root package name */
        final i.a f729a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f730b;
    }

    /* renamed from: androidx.fragment.app.j$j, reason: collision with other inner class name */
    static class C0014j {

        /* renamed from: a, reason: collision with root package name */
        public static final int[] f731a = {R.attr.name, R.attr.id, R.attr.tag};
    }

    interface k {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    private class l implements k {

        /* renamed from: a, reason: collision with root package name */
        final String f732a;

        /* renamed from: b, reason: collision with root package name */
        final int f733b;

        /* renamed from: c, reason: collision with root package name */
        final int f734c;

        l(String str, int i7, int i8) {
            this.f732a = str;
            this.f733b = i7;
            this.f734c = i8;
        }

        @Override // androidx.fragment.app.j.k
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = j.this.f705y;
            if (fragment == null || this.f733b >= 0 || this.f732a != null || !fragment.n().f()) {
                return j.this.U0(arrayList, arrayList2, this.f732a, this.f733b, this.f734c);
            }
            return false;
        }
    }

    static class m implements Fragment.f {

        /* renamed from: a, reason: collision with root package name */
        final boolean f736a;

        /* renamed from: b, reason: collision with root package name */
        final androidx.fragment.app.a f737b;

        /* renamed from: c, reason: collision with root package name */
        private int f738c;

        m(androidx.fragment.app.a aVar, boolean z6) {
            this.f736a = z6;
            this.f737b = aVar;
        }

        @Override // androidx.fragment.app.Fragment.f
        public void a() {
            int i7 = this.f738c - 1;
            this.f738c = i7;
            if (i7 != 0) {
                return;
            }
            this.f737b.f639s.g1();
        }

        @Override // androidx.fragment.app.Fragment.f
        public void b() {
            this.f738c++;
        }

        public void c() {
            androidx.fragment.app.a aVar = this.f737b;
            aVar.f639s.t(aVar, this.f736a, false, false);
        }

        public void d() {
            boolean z6 = this.f738c > 0;
            j jVar = this.f737b.f639s;
            int size = jVar.f691k.size();
            for (int i7 = 0; i7 < size; i7++) {
                Fragment fragment = jVar.f691k.get(i7);
                fragment.h1(null);
                if (z6 && fragment.O()) {
                    fragment.j1();
                }
            }
            androidx.fragment.app.a aVar = this.f737b;
            aVar.f639s.t(aVar, this.f736a, !z6, true);
        }

        public boolean e() {
            return this.f738c == 0;
        }
    }

    j() {
    }

    private boolean D0(Fragment fragment) {
        return (fragment.H && fragment.I) || fragment.f614y.q();
    }

    static g J0(float f7, float f8) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f7, f8);
        alphaAnimation.setInterpolator(O);
        alphaAnimation.setDuration(220L);
        return new g(alphaAnimation);
    }

    static g L0(float f7, float f8, float f9, float f10) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f7, f8, f7, f8, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(N);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f9, f10);
        alphaAnimation.setInterpolator(O);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return new g(animationSet);
    }

    private void M0(h.b<Fragment> bVar) {
        int size = bVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            Fragment p7 = bVar.p(i7);
            if (!p7.f605p) {
                View Y0 = p7.Y0();
                p7.T = Y0.getAlpha();
                Y0.setAlpha(0.0f);
            }
        }
    }

    private boolean T0(String str, int i7, int i8) {
        j0();
        h0(true);
        Fragment fragment = this.f705y;
        if (fragment != null && i7 < 0 && str == null && fragment.n().f()) {
            return true;
        }
        boolean U0 = U0(this.E, this.F, str, i7, i8);
        if (U0) {
            this.f689i = true;
            try {
                Y0(this.E, this.F);
            } finally {
                s();
            }
        }
        o1();
        e0();
        p();
        return U0;
    }

    private void V(Fragment fragment) {
        if (fragment == null || this.f692l.get(fragment.f599j) != fragment) {
            return;
        }
        fragment.Q0();
    }

    private int V0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i7, int i8, h.b<Fragment> bVar) {
        int i9 = i8;
        for (int i10 = i8 - 1; i10 >= i7; i10--) {
            androidx.fragment.app.a aVar = arrayList.get(i10);
            boolean booleanValue = arrayList2.get(i10).booleanValue();
            if (aVar.s() && !aVar.q(arrayList, i10 + 1, i8)) {
                if (this.J == null) {
                    this.J = new ArrayList<>();
                }
                m mVar = new m(aVar, booleanValue);
                this.J.add(mVar);
                aVar.u(mVar);
                if (booleanValue) {
                    aVar.l();
                } else {
                    aVar.m(false);
                }
                i9--;
                if (i10 != i9) {
                    arrayList.remove(i10);
                    arrayList.add(i9, aVar);
                }
                h(bVar);
            }
        }
        return i9;
    }

    private void Y0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        m0(arrayList, arrayList2);
        int size = arrayList.size();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            if (!arrayList.get(i7).f781q) {
                if (i8 != i7) {
                    l0(arrayList, arrayList2, i8, i7);
                }
                i8 = i7 + 1;
                if (arrayList2.get(i7).booleanValue()) {
                    while (i8 < size && arrayList2.get(i8).booleanValue() && !arrayList.get(i8).f781q) {
                        i8++;
                    }
                }
                l0(arrayList, arrayList2, i7, i8);
                i7 = i8 - 1;
            }
            i7++;
        }
        if (i8 != size) {
            l0(arrayList, arrayList2, i8, size);
        }
    }

    private void c0(int i7) {
        try {
            this.f689i = true;
            O0(i7, false);
            this.f689i = false;
            j0();
        } catch (Throwable th) {
            this.f689i = false;
            throw th;
        }
    }

    public static int c1(int i7) {
        if (i7 == 4097) {
            return 8194;
        }
        if (i7 != 4099) {
            return i7 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    private void f0() {
        for (Fragment fragment : this.f692l.values()) {
            if (fragment != null) {
                if (fragment.l() != null) {
                    int G = fragment.G();
                    View l7 = fragment.l();
                    Animation animation = l7.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        l7.clearAnimation();
                    }
                    fragment.b1(null);
                    Q0(fragment, G, 0, 0, false);
                } else if (fragment.m() != null) {
                    fragment.m().end();
                }
            }
        }
    }

    private void h(h.b<Fragment> bVar) {
        int i7 = this.f701u;
        if (i7 < 1) {
            return;
        }
        int min = Math.min(i7, 3);
        int size = this.f691k.size();
        for (int i8 = 0; i8 < size; i8++) {
            Fragment fragment = this.f691k.get(i8);
            if (fragment.f595f < min) {
                Q0(fragment, min, fragment.w(), fragment.x(), false);
                if (fragment.L != null && !fragment.D && fragment.R) {
                    bVar.add(fragment);
                }
            }
        }
    }

    private void h0(boolean z6) {
        if (this.f689i) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f702v == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        }
        if (Looper.myLooper() != this.f702v.j().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z6) {
            r();
        }
        if (this.E == null) {
            this.E = new ArrayList<>();
            this.F = new ArrayList<>();
        }
        this.f689i = true;
        try {
            m0(null, null);
        } finally {
            this.f689i = false;
        }
    }

    private static void k0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i7, int i8) {
        while (i7 < i8) {
            androidx.fragment.app.a aVar = arrayList.get(i7);
            if (arrayList2.get(i7).booleanValue()) {
                aVar.h(-1);
                aVar.m(i7 == i8 + (-1));
            } else {
                aVar.h(1);
                aVar.l();
            }
            i7++;
        }
    }

    private void l0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i7, int i8) {
        int i9;
        int i10;
        int i11 = i7;
        boolean z6 = arrayList.get(i11).f781q;
        ArrayList<Fragment> arrayList3 = this.G;
        if (arrayList3 == null) {
            this.G = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.G.addAll(this.f691k);
        Fragment y02 = y0();
        boolean z7 = false;
        for (int i12 = i11; i12 < i8; i12++) {
            androidx.fragment.app.a aVar = arrayList.get(i12);
            y02 = !arrayList2.get(i12).booleanValue() ? aVar.n(this.G, y02) : aVar.v(this.G, y02);
            z7 = z7 || aVar.f772h;
        }
        this.G.clear();
        if (!z6) {
            o.B(this, arrayList, arrayList2, i7, i8, false);
        }
        k0(arrayList, arrayList2, i7, i8);
        if (z6) {
            h.b<Fragment> bVar = new h.b<>();
            h(bVar);
            int V0 = V0(arrayList, arrayList2, i7, i8, bVar);
            M0(bVar);
            i9 = V0;
        } else {
            i9 = i8;
        }
        if (i9 != i11 && z6) {
            o.B(this, arrayList, arrayList2, i7, i9, true);
            O0(this.f701u, true);
        }
        while (i11 < i8) {
            androidx.fragment.app.a aVar2 = arrayList.get(i11);
            if (arrayList2.get(i11).booleanValue() && (i10 = aVar2.f641u) >= 0) {
                s0(i10);
                aVar2.f641u = -1;
            }
            aVar2.t();
            i11++;
        }
        if (z7) {
            a1();
        }
    }

    private void m(Fragment fragment, g gVar, int i7) {
        View view = fragment.L;
        ViewGroup viewGroup = fragment.K;
        viewGroup.startViewTransition(view);
        fragment.i1(i7);
        if (gVar.f722a != null) {
            h hVar = new h(gVar.f722a, viewGroup, view);
            fragment.b1(fragment.L);
            hVar.setAnimationListener(new c(viewGroup, fragment));
            fragment.L.startAnimation(hVar);
            return;
        }
        Animator animator = gVar.f723b;
        fragment.c1(animator);
        animator.addListener(new d(viewGroup, view, fragment));
        animator.setTarget(fragment.L);
        animator.start();
    }

    private void m0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<m> arrayList3 = this.J;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i7 = 0;
        while (i7 < size) {
            m mVar = this.J.get(i7);
            if (arrayList == null || mVar.f736a || (indexOf2 = arrayList.indexOf(mVar.f737b)) == -1 || !arrayList2.get(indexOf2).booleanValue()) {
                if (mVar.e() || (arrayList != null && mVar.f737b.q(arrayList, 0, arrayList.size()))) {
                    this.J.remove(i7);
                    i7--;
                    size--;
                    if (arrayList == null || mVar.f736a || (indexOf = arrayList.indexOf(mVar.f737b)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                        mVar.d();
                    }
                }
                i7++;
            } else {
                this.J.remove(i7);
                i7--;
                size--;
            }
            mVar.c();
            i7++;
        }
    }

    private void m1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new q.c("FragmentManager"));
        androidx.fragment.app.h hVar = this.f702v;
        try {
            if (hVar != null) {
                hVar.l("  ", null, printWriter, new String[0]);
            } else {
                b("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception e7) {
            Log.e("FragmentManager", "Failed dumping state", e7);
            throw runtimeException;
        }
    }

    public static int n1(int i7, boolean z6) {
        if (i7 == 4097) {
            return z6 ? 1 : 2;
        }
        if (i7 == 4099) {
            return z6 ? 5 : 6;
        }
        if (i7 != 8194) {
            return -1;
        }
        return z6 ? 3 : 4;
    }

    private void o1() {
        ArrayList<k> arrayList = this.f688h;
        if (arrayList == null || arrayList.isEmpty()) {
            this.f696p.f(u0() > 0 && E0(this.f704x));
        } else {
            this.f696p.f(true);
        }
    }

    private void p() {
        this.f692l.values().removeAll(Collections.singleton(null));
    }

    private Fragment q0(Fragment fragment) {
        ViewGroup viewGroup = fragment.K;
        View view = fragment.L;
        if (viewGroup != null && view != null) {
            for (int indexOf = this.f691k.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = this.f691k.get(indexOf);
                if (fragment2.K == viewGroup && fragment2.L != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    private void r() {
        if (G0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void r0() {
        if (this.J != null) {
            while (!this.J.isEmpty()) {
                this.J.remove(0).d();
            }
        }
    }

    private void s() {
        this.f689i = false;
        this.F.clear();
        this.E.clear();
    }

    private boolean t0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this) {
            ArrayList<k> arrayList3 = this.f688h;
            if (arrayList3 != null && arrayList3.size() != 0) {
                int size = this.f688h.size();
                boolean z6 = false;
                for (int i7 = 0; i7 < size; i7++) {
                    z6 |= this.f688h.get(i7).a(arrayList, arrayList2);
                }
                this.f688h.clear();
                this.f702v.j().removeCallbacks(this.L);
                return z6;
            }
            return false;
        }
    }

    public boolean A(Menu menu, MenuInflater menuInflater) {
        if (this.f701u < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z6 = false;
        for (int i7 = 0; i7 < this.f691k.size(); i7++) {
            Fragment fragment = this.f691k.get(i7);
            if (fragment != null && fragment.D0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z6 = true;
            }
        }
        if (this.f694n != null) {
            for (int i8 = 0; i8 < this.f694n.size(); i8++) {
                Fragment fragment2 = this.f694n.get(i8);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.d0();
                }
            }
        }
        this.f694n = arrayList;
        return z6;
    }

    void A0() {
        j0();
        if (this.f696p.c()) {
            f();
        } else {
            this.f695o.c();
        }
    }

    public void B() {
        this.C = true;
        j0();
        c0(0);
        this.f702v = null;
        this.f703w = null;
        this.f704x = null;
        if (this.f695o != null) {
            this.f696p.d();
            this.f695o = null;
        }
    }

    public void B0(Fragment fragment) {
        if (M) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.D) {
            return;
        }
        fragment.D = true;
        fragment.S = true ^ fragment.S;
    }

    public void C() {
        c0(1);
    }

    public boolean C0() {
        return this.C;
    }

    public void D() {
        for (int i7 = 0; i7 < this.f691k.size(); i7++) {
            Fragment fragment = this.f691k.get(i7);
            if (fragment != null) {
                fragment.J0();
            }
        }
    }

    public void E(boolean z6) {
        for (int size = this.f691k.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f691k.get(size);
            if (fragment != null) {
                fragment.K0(z6);
            }
        }
    }

    boolean E0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        j jVar = fragment.f612w;
        return fragment == jVar.y0() && E0(jVar.f704x);
    }

    void F(Fragment fragment, Bundle bundle, boolean z6) {
        Fragment fragment2 = this.f704x;
        if (fragment2 != null) {
            androidx.fragment.app.i t6 = fragment2.t();
            if (t6 instanceof j) {
                ((j) t6).F(fragment, bundle, true);
            }
        }
        Iterator<i> it = this.f700t.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z6 || next.f730b) {
                i.a aVar = next.f729a;
                throw null;
            }
        }
    }

    boolean F0(int i7) {
        return this.f701u >= i7;
    }

    void G(Fragment fragment, Context context, boolean z6) {
        Fragment fragment2 = this.f704x;
        if (fragment2 != null) {
            androidx.fragment.app.i t6 = fragment2.t();
            if (t6 instanceof j) {
                ((j) t6).G(fragment, context, true);
            }
        }
        Iterator<i> it = this.f700t.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z6 || next.f730b) {
                i.a aVar = next.f729a;
                throw null;
            }
        }
    }

    public boolean G0() {
        return this.A || this.B;
    }

    void H(Fragment fragment, Bundle bundle, boolean z6) {
        Fragment fragment2 = this.f704x;
        if (fragment2 != null) {
            androidx.fragment.app.i t6 = fragment2.t();
            if (t6 instanceof j) {
                ((j) t6).H(fragment, bundle, true);
            }
        }
        Iterator<i> it = this.f700t.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z6 || next.f730b) {
                i.a aVar = next.f729a;
                throw null;
            }
        }
    }

    g H0(Fragment fragment, int i7, boolean z6, int i8) {
        int n12;
        int w6 = fragment.w();
        boolean z7 = false;
        fragment.f1(0);
        ViewGroup viewGroup = fragment.K;
        if (viewGroup != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        Animation Y = fragment.Y(i7, z6, w6);
        if (Y != null) {
            return new g(Y);
        }
        Animator Z = fragment.Z(i7, z6, w6);
        if (Z != null) {
            return new g(Z);
        }
        if (w6 != 0) {
            boolean equals = "anim".equals(this.f702v.g().getResources().getResourceTypeName(w6));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.f702v.g(), w6);
                    if (loadAnimation != null) {
                        return new g(loadAnimation);
                    }
                    z7 = true;
                } catch (Resources.NotFoundException e7) {
                    throw e7;
                } catch (RuntimeException unused) {
                }
            }
            if (!z7) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.f702v.g(), w6);
                    if (loadAnimator != null) {
                        return new g(loadAnimator);
                    }
                } catch (RuntimeException e8) {
                    if (equals) {
                        throw e8;
                    }
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f702v.g(), w6);
                    if (loadAnimation2 != null) {
                        return new g(loadAnimation2);
                    }
                }
            }
        }
        if (i7 == 0 || (n12 = n1(i7, z6)) < 0) {
            return null;
        }
        switch (n12) {
            case 1:
                return L0(1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return L0(1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return L0(0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return L0(1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return J0(0.0f, 1.0f);
            case 6:
                return J0(1.0f, 0.0f);
            default:
                if (i8 == 0 && this.f702v.p()) {
                    this.f702v.o();
                }
                return null;
        }
    }

    void I(Fragment fragment, boolean z6) {
        Fragment fragment2 = this.f704x;
        if (fragment2 != null) {
            androidx.fragment.app.i t6 = fragment2.t();
            if (t6 instanceof j) {
                ((j) t6).I(fragment, true);
            }
        }
        Iterator<i> it = this.f700t.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z6 || next.f730b) {
                i.a aVar = next.f729a;
                throw null;
            }
        }
    }

    void I0(Fragment fragment) {
        if (this.f692l.get(fragment.f599j) != null) {
            return;
        }
        this.f692l.put(fragment.f599j, fragment);
        if (fragment.G) {
            if (fragment.F) {
                k(fragment);
            } else {
                Z0(fragment);
            }
            fragment.G = false;
        }
        if (M) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    void J(Fragment fragment, boolean z6) {
        Fragment fragment2 = this.f704x;
        if (fragment2 != null) {
            androidx.fragment.app.i t6 = fragment2.t();
            if (t6 instanceof j) {
                ((j) t6).J(fragment, true);
            }
        }
        Iterator<i> it = this.f700t.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z6 || next.f730b) {
                i.a aVar = next.f729a;
                throw null;
            }
        }
    }

    void K(Fragment fragment, boolean z6) {
        Fragment fragment2 = this.f704x;
        if (fragment2 != null) {
            androidx.fragment.app.i t6 = fragment2.t();
            if (t6 instanceof j) {
                ((j) t6).K(fragment, true);
            }
        }
        Iterator<i> it = this.f700t.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z6 || next.f730b) {
                i.a aVar = next.f729a;
                throw null;
            }
        }
    }

    void K0(Fragment fragment) {
        if (this.f692l.get(fragment.f599j) == null) {
            return;
        }
        if (M) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
        for (Fragment fragment2 : this.f692l.values()) {
            if (fragment2 != null && fragment.f599j.equals(fragment2.f602m)) {
                fragment2.f601l = fragment;
                fragment2.f602m = null;
            }
        }
        this.f692l.put(fragment.f599j, null);
        Z0(fragment);
        String str = fragment.f602m;
        if (str != null) {
            fragment.f601l = this.f692l.get(str);
        }
        fragment.K();
    }

    void L(Fragment fragment, Context context, boolean z6) {
        Fragment fragment2 = this.f704x;
        if (fragment2 != null) {
            androidx.fragment.app.i t6 = fragment2.t();
            if (t6 instanceof j) {
                ((j) t6).L(fragment, context, true);
            }
        }
        Iterator<i> it = this.f700t.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z6 || next.f730b) {
                i.a aVar = next.f729a;
                throw null;
            }
        }
    }

    void M(Fragment fragment, Bundle bundle, boolean z6) {
        Fragment fragment2 = this.f704x;
        if (fragment2 != null) {
            androidx.fragment.app.i t6 = fragment2.t();
            if (t6 instanceof j) {
                ((j) t6).M(fragment, bundle, true);
            }
        }
        Iterator<i> it = this.f700t.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z6 || next.f730b) {
                i.a aVar = next.f729a;
                throw null;
            }
        }
    }

    void N(Fragment fragment, boolean z6) {
        Fragment fragment2 = this.f704x;
        if (fragment2 != null) {
            androidx.fragment.app.i t6 = fragment2.t();
            if (t6 instanceof j) {
                ((j) t6).N(fragment, true);
            }
        }
        Iterator<i> it = this.f700t.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z6 || next.f730b) {
                i.a aVar = next.f729a;
                throw null;
            }
        }
    }

    void N0(Fragment fragment) {
        if (fragment == null) {
            return;
        }
        if (!this.f692l.containsKey(fragment.f599j)) {
            if (M) {
                Log.v("FragmentManager", "Ignoring moving " + fragment + " to state " + this.f701u + "since it is not added to " + this);
                return;
            }
            return;
        }
        int i7 = this.f701u;
        if (fragment.f606q) {
            i7 = fragment.N() ? Math.min(i7, 1) : Math.min(i7, 0);
        }
        Q0(fragment, i7, fragment.x(), fragment.y(), false);
        if (fragment.L != null) {
            Fragment q02 = q0(fragment);
            if (q02 != null) {
                View view = q02.L;
                ViewGroup viewGroup = fragment.K;
                int indexOfChild = viewGroup.indexOfChild(view);
                int indexOfChild2 = viewGroup.indexOfChild(fragment.L);
                if (indexOfChild2 < indexOfChild) {
                    viewGroup.removeViewAt(indexOfChild2);
                    viewGroup.addView(fragment.L, indexOfChild);
                }
            }
            if (fragment.R && fragment.K != null) {
                float f7 = fragment.T;
                if (f7 > 0.0f) {
                    fragment.L.setAlpha(f7);
                }
                fragment.T = 0.0f;
                fragment.R = false;
                g H0 = H0(fragment, fragment.x(), true, fragment.y());
                if (H0 != null) {
                    Animation animation = H0.f722a;
                    if (animation != null) {
                        fragment.L.startAnimation(animation);
                    } else {
                        H0.f723b.setTarget(fragment.L);
                        H0.f723b.start();
                    }
                }
            }
        }
        if (fragment.S) {
            u(fragment);
        }
    }

    void O(Fragment fragment, Bundle bundle, boolean z6) {
        Fragment fragment2 = this.f704x;
        if (fragment2 != null) {
            androidx.fragment.app.i t6 = fragment2.t();
            if (t6 instanceof j) {
                ((j) t6).O(fragment, bundle, true);
            }
        }
        Iterator<i> it = this.f700t.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z6 || next.f730b) {
                i.a aVar = next.f729a;
                throw null;
            }
        }
    }

    void O0(int i7, boolean z6) {
        androidx.fragment.app.h hVar;
        if (this.f702v == null && i7 != 0) {
            throw new IllegalStateException("No activity");
        }
        if (z6 || i7 != this.f701u) {
            this.f701u = i7;
            int size = this.f691k.size();
            for (int i8 = 0; i8 < size; i8++) {
                N0(this.f691k.get(i8));
            }
            for (Fragment fragment : this.f692l.values()) {
                if (fragment != null && (fragment.f606q || fragment.E)) {
                    if (!fragment.R) {
                        N0(fragment);
                    }
                }
            }
            l1();
            if (this.f706z && (hVar = this.f702v) != null && this.f701u == 4) {
                hVar.r();
                this.f706z = false;
            }
        }
    }

    void P(Fragment fragment, boolean z6) {
        Fragment fragment2 = this.f704x;
        if (fragment2 != null) {
            androidx.fragment.app.i t6 = fragment2.t();
            if (t6 instanceof j) {
                ((j) t6).P(fragment, true);
            }
        }
        Iterator<i> it = this.f700t.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z6 || next.f730b) {
                i.a aVar = next.f729a;
                throw null;
            }
        }
    }

    void P0(Fragment fragment) {
        Q0(fragment, this.f701u, 0, 0, false);
    }

    void Q(Fragment fragment, boolean z6) {
        Fragment fragment2 = this.f704x;
        if (fragment2 != null) {
            androidx.fragment.app.i t6 = fragment2.t();
            if (t6 instanceof j) {
                ((j) t6).Q(fragment, true);
            }
        }
        Iterator<i> it = this.f700t.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z6 || next.f730b) {
                i.a aVar = next.f729a;
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0084, code lost:
    
        if (r0 != 3) goto L265;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void Q0(Fragment fragment, int i7, int i8, int i9, boolean z6) {
        int i10;
        Fragment fragment2;
        ViewGroup viewGroup;
        String str;
        String str2;
        ViewGroup viewGroup2;
        String str3;
        int i11;
        int i12 = 1;
        boolean isChangingConfigurations = true;
        if (!fragment.f605p || fragment.E) {
            i10 = i7;
            if (i10 > 1) {
                i10 = 1;
            }
        } else {
            i10 = i7;
        }
        if (fragment.f606q && i10 > (i11 = fragment.f595f)) {
            i10 = (i11 == 0 && fragment.N()) ? 1 : fragment.f595f;
        }
        if (fragment.N && fragment.f595f < 3 && i10 > 2) {
            i10 = 2;
        }
        e.c cVar = fragment.W;
        int min = cVar == e.c.CREATED ? Math.min(i10, 1) : Math.min(i10, cVar.ordinal());
        int i13 = fragment.f595f;
        if (i13 <= min) {
            if (fragment.f607r && !fragment.f608s) {
                return;
            }
            if (fragment.l() != null || fragment.m() != null) {
                fragment.b1(null);
                fragment.c1(null);
                Q0(fragment, fragment.G(), 0, 0, true);
            }
            int i14 = fragment.f595f;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                    }
                    if (min > 2) {
                        if (M) {
                            Log.v("FragmentManager", "moveto STARTED: " + fragment);
                        }
                        fragment.T0();
                        P(fragment, false);
                    }
                    if (min > 3) {
                        if (M) {
                            Log.v("FragmentManager", "moveto RESUMED: " + fragment);
                        }
                        fragment.R0();
                        N(fragment, false);
                        fragment.f596g = null;
                        fragment.f597h = null;
                    }
                }
            } else if (min > 0) {
                if (M) {
                    Log.v("FragmentManager", "moveto CREATED: " + fragment);
                }
                Bundle bundle = fragment.f596g;
                if (bundle != null) {
                    bundle.setClassLoader(this.f702v.g().getClassLoader());
                    fragment.f597h = fragment.f596g.getSparseParcelableArray("android:view_state");
                    Fragment w02 = w0(fragment.f596g, "android:target_state");
                    String str4 = w02 != null ? w02.f599j : null;
                    fragment.f602m = str4;
                    if (str4 != null) {
                        fragment.f603n = fragment.f596g.getInt("android:target_req_state", 0);
                    }
                    Boolean bool = fragment.f598i;
                    if (bool != null) {
                        fragment.O = bool.booleanValue();
                        fragment.f598i = null;
                    } else {
                        fragment.O = fragment.f596g.getBoolean("android:user_visible_hint", true);
                    }
                    if (!fragment.O) {
                        fragment.N = true;
                        if (min > 2) {
                            min = 2;
                        }
                    }
                }
                androidx.fragment.app.h hVar = this.f702v;
                fragment.f613x = hVar;
                Fragment fragment3 = this.f704x;
                fragment.f615z = fragment3;
                fragment.f612w = fragment3 != null ? fragment3.f614y : hVar.f685j;
                Fragment fragment4 = fragment.f601l;
                if (fragment4 != null) {
                    Fragment fragment5 = this.f692l.get(fragment4.f599j);
                    Fragment fragment6 = fragment.f601l;
                    if (fragment5 != fragment6) {
                        throw new IllegalStateException("Fragment " + fragment + " declared target fragment " + fragment.f601l + " that does not belong to this FragmentManager!");
                    }
                    if (fragment6.f595f < 1) {
                        str = "Fragment ";
                        str2 = " declared target fragment ";
                        Q0(fragment6, 1, 0, 0, true);
                    } else {
                        str = "Fragment ";
                        str2 = " declared target fragment ";
                    }
                    fragment.f602m = fragment.f601l.f599j;
                    fragment.f601l = null;
                } else {
                    str = "Fragment ";
                    str2 = " declared target fragment ";
                }
                String str5 = fragment.f602m;
                if (str5 != null) {
                    Fragment fragment7 = this.f692l.get(str5);
                    if (fragment7 == null) {
                        throw new IllegalStateException(str + fragment + str2 + fragment.f602m + " that does not belong to this FragmentManager!");
                    }
                    if (fragment7.f595f < 1) {
                        Q0(fragment7, 1, 0, 0, true);
                    }
                }
                L(fragment, this.f702v.g(), false);
                fragment.z0();
                Fragment fragment8 = fragment.f615z;
                if (fragment8 == null) {
                    this.f702v.k(fragment);
                } else {
                    fragment8.V(fragment);
                }
                G(fragment, this.f702v.g(), false);
                if (fragment.V) {
                    fragment.Z0(fragment.f596g);
                    fragment.f595f = 1;
                } else {
                    M(fragment, fragment.f596g, false);
                    fragment.C0(fragment.f596g);
                    H(fragment, fragment.f596g, false);
                }
            }
            if (min > 0) {
                i0(fragment);
            }
            if (min > 1) {
                if (M) {
                    Log.v("FragmentManager", "moveto ACTIVITY_CREATED: " + fragment);
                }
                if (!fragment.f607r) {
                    int i15 = fragment.B;
                    if (i15 != 0) {
                        if (i15 == -1) {
                            m1(new IllegalArgumentException("Cannot create fragment " + fragment + " for a container view with no id"));
                        }
                        viewGroup2 = (ViewGroup) this.f703w.d(fragment.B);
                        if (viewGroup2 == null && !fragment.f609t) {
                            try {
                                str3 = fragment.B().getResourceName(fragment.B);
                            } catch (Resources.NotFoundException unused) {
                                str3 = "unknown";
                            }
                            m1(new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.B) + " (" + str3 + ") for fragment " + fragment));
                        }
                    } else {
                        viewGroup2 = null;
                    }
                    fragment.K = viewGroup2;
                    fragment.E0(fragment.I0(fragment.f596g), viewGroup2, fragment.f596g);
                    View view = fragment.L;
                    if (view != null) {
                        fragment.M = view;
                        view.setSaveFromParentEnabled(false);
                        if (viewGroup2 != null) {
                            viewGroup2.addView(fragment.L);
                        }
                        if (fragment.D) {
                            fragment.L.setVisibility(8);
                        }
                        fragment.w0(fragment.L, fragment.f596g);
                        R(fragment, fragment.L, fragment.f596g, false);
                        fragment.R = fragment.L.getVisibility() == 0 && fragment.K != null;
                    } else {
                        fragment.M = null;
                    }
                }
                fragment.y0(fragment.f596g);
                F(fragment, fragment.f596g, false);
                if (fragment.L != null) {
                    fragment.a1(fragment.f596g);
                }
                fragment.f596g = null;
            }
            if (min > 2) {
            }
            if (min > 3) {
            }
        } else if (i13 > min) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        if (i13 == 4) {
                            if (min < 4) {
                                if (M) {
                                    Log.v("FragmentManager", "movefrom RESUMED: " + fragment);
                                }
                                fragment.N0();
                                K(fragment, false);
                            }
                        }
                    }
                    if (min < 3) {
                        if (M) {
                            Log.v("FragmentManager", "movefrom STARTED: " + fragment);
                        }
                        fragment.U0();
                        Q(fragment, false);
                    }
                }
                if (min < 2) {
                    if (M) {
                        Log.v("FragmentManager", "movefrom ACTIVITY_CREATED: " + fragment);
                    }
                    if (fragment.L != null && this.f702v.q(fragment) && fragment.f597h == null) {
                        f1(fragment);
                    }
                    fragment.G0();
                    S(fragment, false);
                    View view2 = fragment.L;
                    if (view2 != null && (viewGroup = fragment.K) != null) {
                        viewGroup.endViewTransition(view2);
                        fragment.L.clearAnimation();
                        if (fragment.z() == null || !fragment.z().f606q) {
                            g H0 = (this.f701u <= 0 || this.C || fragment.L.getVisibility() != 0 || fragment.T < 0.0f) ? null : H0(fragment, i8, false, i9);
                            fragment.T = 0.0f;
                            if (H0 != null) {
                                m(fragment, H0, min);
                            }
                            fragment.K.removeView(fragment.L);
                        }
                    }
                    fragment.K = null;
                    fragment.L = null;
                    fragment.Y = null;
                    fragment.Z.h(null);
                    fragment.M = null;
                    fragment.f608s = false;
                }
            }
            if (min < 1) {
                if (this.C) {
                    if (fragment.l() != null) {
                        View l7 = fragment.l();
                        fragment.b1(null);
                        l7.clearAnimation();
                    } else if (fragment.m() != null) {
                        Animator m7 = fragment.m();
                        fragment.c1(null);
                        m7.cancel();
                    }
                }
                if (fragment.l() != null || fragment.m() != null) {
                    fragment.i1(min);
                    if (fragment.f595f == i12) {
                        Log.w("FragmentManager", "moveToState: Fragment state for " + fragment + " not updated inline; expected state " + i12 + " found " + fragment.f595f);
                        fragment.f595f = i12;
                        return;
                    }
                    return;
                }
                if (M) {
                    Log.v("FragmentManager", "movefrom CREATED: " + fragment);
                }
                boolean z7 = fragment.f606q && !fragment.N();
                if (z7 || this.K.l(fragment)) {
                    androidx.fragment.app.h hVar2 = this.f702v;
                    if (hVar2 instanceof x) {
                        isChangingConfigurations = this.K.j();
                    } else if (hVar2.g() instanceof Activity) {
                        isChangingConfigurations = true ^ ((Activity) this.f702v.g()).isChangingConfigurations();
                    }
                    if (z7 || isChangingConfigurations) {
                        this.K.e(fragment);
                    }
                    fragment.F0();
                    I(fragment, false);
                } else {
                    fragment.f595f = 0;
                }
                fragment.H0();
                J(fragment, false);
                if (!z6) {
                    if (z7 || this.K.l(fragment)) {
                        K0(fragment);
                    } else {
                        fragment.f613x = null;
                        fragment.f615z = null;
                        fragment.f612w = null;
                        String str6 = fragment.f602m;
                        if (str6 != null && (fragment2 = this.f692l.get(str6)) != null && fragment2.C()) {
                            fragment.f601l = fragment2;
                        }
                    }
                }
            }
        }
        i12 = min;
        if (fragment.f595f == i12) {
        }
    }

    void R(Fragment fragment, View view, Bundle bundle, boolean z6) {
        Fragment fragment2 = this.f704x;
        if (fragment2 != null) {
            androidx.fragment.app.i t6 = fragment2.t();
            if (t6 instanceof j) {
                ((j) t6).R(fragment, view, bundle, true);
            }
        }
        Iterator<i> it = this.f700t.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z6 || next.f730b) {
                i.a aVar = next.f729a;
                throw null;
            }
        }
    }

    public void R0() {
        this.A = false;
        this.B = false;
        int size = this.f691k.size();
        for (int i7 = 0; i7 < size; i7++) {
            Fragment fragment = this.f691k.get(i7);
            if (fragment != null) {
                fragment.Q();
            }
        }
    }

    void S(Fragment fragment, boolean z6) {
        Fragment fragment2 = this.f704x;
        if (fragment2 != null) {
            androidx.fragment.app.i t6 = fragment2.t();
            if (t6 instanceof j) {
                ((j) t6).S(fragment, true);
            }
        }
        Iterator<i> it = this.f700t.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z6 || next.f730b) {
                i.a aVar = next.f729a;
                throw null;
            }
        }
    }

    public void S0(Fragment fragment) {
        if (fragment.N) {
            if (this.f689i) {
                this.D = true;
            } else {
                fragment.N = false;
                Q0(fragment, this.f701u, 0, 0, false);
            }
        }
    }

    public boolean T(MenuItem menuItem) {
        if (this.f701u < 1) {
            return false;
        }
        for (int i7 = 0; i7 < this.f691k.size(); i7++) {
            Fragment fragment = this.f691k.get(i7);
            if (fragment != null && fragment.L0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void U(Menu menu) {
        if (this.f701u < 1) {
            return;
        }
        for (int i7 = 0; i7 < this.f691k.size(); i7++) {
            Fragment fragment = this.f691k.get(i7);
            if (fragment != null) {
                fragment.M0(menu);
            }
        }
    }

    boolean U0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i7, int i8) {
        int i9;
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f693m;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i7 < 0 && (i8 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f693m.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i7 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.a aVar = this.f693m.get(size2);
                    if ((str != null && str.equals(aVar.o())) || (i7 >= 0 && i7 == aVar.f641u)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i8 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        androidx.fragment.app.a aVar2 = this.f693m.get(size2);
                        if (str == null || !str.equals(aVar2.o())) {
                            if (i7 < 0 || i7 != aVar2.f641u) {
                                break;
                            }
                        }
                    }
                }
                i9 = size2;
            } else {
                i9 = -1;
            }
            if (i9 == this.f693m.size() - 1) {
                return false;
            }
            for (int size3 = this.f693m.size() - 1; size3 > i9; size3--) {
                arrayList.add(this.f693m.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    public void W() {
        c0(3);
    }

    public void W0(Bundle bundle, String str, Fragment fragment) {
        if (fragment.f612w != this) {
            m1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.f599j);
    }

    public void X(boolean z6) {
        for (int size = this.f691k.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f691k.get(size);
            if (fragment != null) {
                fragment.O0(z6);
            }
        }
    }

    public void X0(Fragment fragment) {
        if (M) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f611v);
        }
        boolean z6 = !fragment.N();
        if (!fragment.E || z6) {
            synchronized (this.f691k) {
                this.f691k.remove(fragment);
            }
            if (D0(fragment)) {
                this.f706z = true;
            }
            fragment.f605p = false;
            fragment.f606q = true;
        }
    }

    public boolean Y(Menu menu) {
        if (this.f701u < 1) {
            return false;
        }
        boolean z6 = false;
        for (int i7 = 0; i7 < this.f691k.size(); i7++) {
            Fragment fragment = this.f691k.get(i7);
            if (fragment != null && fragment.P0(menu)) {
                z6 = true;
            }
        }
        return z6;
    }

    void Z() {
        o1();
        V(this.f705y);
    }

    void Z0(Fragment fragment) {
        if (G0()) {
            if (M) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.K.k(fragment) && M) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    @Override // androidx.fragment.app.i
    public n a() {
        return new androidx.fragment.app.a(this);
    }

    public void a0() {
        this.A = false;
        this.B = false;
        c0(4);
    }

    void a1() {
        if (this.f699s != null) {
            for (int i7 = 0; i7 < this.f699s.size(); i7++) {
                this.f699s.get(i7).a();
            }
        }
    }

    @Override // androidx.fragment.app.i
    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        String str2 = str + "    ";
        if (!this.f692l.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (Fragment fragment : this.f692l.values()) {
                printWriter.print(str);
                printWriter.println(fragment);
                if (fragment != null) {
                    fragment.d(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size5 = this.f691k.size();
        if (size5 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i7 = 0; i7 < size5; i7++) {
                Fragment fragment2 = this.f691k.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList = this.f694n;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i8 = 0; i8 < size4; i8++) {
                Fragment fragment3 = this.f694n.get(i8);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i8);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.f693m;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i9 = 0; i9 < size3; i9++) {
                androidx.fragment.app.a aVar = this.f693m.get(i9);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i9);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.j(str2, printWriter);
            }
        }
        synchronized (this) {
            ArrayList<androidx.fragment.app.a> arrayList3 = this.f697q;
            if (arrayList3 != null && (size2 = arrayList3.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i10 = 0; i10 < size2; i10++) {
                    Object obj = (androidx.fragment.app.a) this.f697q.get(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i10);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
            ArrayList<Integer> arrayList4 = this.f698r;
            if (arrayList4 != null && arrayList4.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f698r.toArray()));
            }
        }
        ArrayList<k> arrayList5 = this.f688h;
        if (arrayList5 != null && (size = arrayList5.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i11 = 0; i11 < size; i11++) {
                Object obj2 = (k) this.f688h.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(obj2);
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f702v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f703w);
        if (this.f704x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f704x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f701u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.A);
        printWriter.print(" mStopped=");
        printWriter.print(this.B);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.C);
        if (this.f706z) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f706z);
        }
    }

    public void b0() {
        this.A = false;
        this.B = false;
        c0(3);
    }

    void b1(Parcelable parcelable) {
        androidx.fragment.app.m mVar;
        if (parcelable == null) {
            return;
        }
        androidx.fragment.app.k kVar = (androidx.fragment.app.k) parcelable;
        if (kVar.f739f == null) {
            return;
        }
        for (Fragment fragment : this.K.h()) {
            if (M) {
                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
            }
            Iterator<androidx.fragment.app.m> it = kVar.f739f.iterator();
            while (true) {
                if (it.hasNext()) {
                    mVar = it.next();
                    if (mVar.f752g.equals(fragment.f599j)) {
                        break;
                    }
                } else {
                    mVar = null;
                    break;
                }
            }
            if (mVar == null) {
                if (M) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + kVar.f739f);
                }
                Q0(fragment, 1, 0, 0, false);
                fragment.f606q = true;
                Q0(fragment, 0, 0, 0, false);
            } else {
                mVar.f764s = fragment;
                fragment.f597h = null;
                fragment.f611v = 0;
                fragment.f608s = false;
                fragment.f605p = false;
                Fragment fragment2 = fragment.f601l;
                fragment.f602m = fragment2 != null ? fragment2.f599j : null;
                fragment.f601l = null;
                Bundle bundle = mVar.f763r;
                if (bundle != null) {
                    bundle.setClassLoader(this.f702v.g().getClassLoader());
                    fragment.f597h = mVar.f763r.getSparseParcelableArray("android:view_state");
                    fragment.f596g = mVar.f763r;
                }
            }
        }
        this.f692l.clear();
        Iterator<androidx.fragment.app.m> it2 = kVar.f739f.iterator();
        while (it2.hasNext()) {
            androidx.fragment.app.m next = it2.next();
            if (next != null) {
                Fragment a7 = next.a(this.f702v.g().getClassLoader(), c());
                a7.f612w = this;
                if (M) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + a7.f599j + "): " + a7);
                }
                this.f692l.put(a7.f599j, a7);
                next.f764s = null;
            }
        }
        this.f691k.clear();
        ArrayList<String> arrayList = kVar.f740g;
        if (arrayList != null) {
            Iterator<String> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                String next2 = it3.next();
                Fragment fragment3 = this.f692l.get(next2);
                if (fragment3 == null) {
                    m1(new IllegalStateException("No instantiated fragment for (" + next2 + ")"));
                }
                fragment3.f605p = true;
                if (M) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + next2 + "): " + fragment3);
                }
                if (this.f691k.contains(fragment3)) {
                    throw new IllegalStateException("Already added " + fragment3);
                }
                synchronized (this.f691k) {
                    this.f691k.add(fragment3);
                }
            }
        }
        if (kVar.f741h != null) {
            this.f693m = new ArrayList<>(kVar.f741h.length);
            int i7 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = kVar.f741h;
                if (i7 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.a a8 = bVarArr[i7].a(this);
                if (M) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i7 + " (index " + a8.f641u + "): " + a8);
                    PrintWriter printWriter = new PrintWriter(new q.c("FragmentManager"));
                    a8.k("  ", printWriter, false);
                    printWriter.close();
                }
                this.f693m.add(a8);
                int i8 = a8.f641u;
                if (i8 >= 0) {
                    h1(i8, a8);
                }
                i7++;
            }
        } else {
            this.f693m = null;
        }
        String str = kVar.f742i;
        if (str != null) {
            Fragment fragment4 = this.f692l.get(str);
            this.f705y = fragment4;
            V(fragment4);
        }
        this.f690j = kVar.f743j;
    }

    @Override // androidx.fragment.app.i
    public androidx.fragment.app.g c() {
        if (super.c() == androidx.fragment.app.i.f686g) {
            Fragment fragment = this.f704x;
            if (fragment != null) {
                return fragment.f612w.c();
            }
            g(new f());
        }
        return super.c();
    }

    @Override // androidx.fragment.app.i
    public List<Fragment> d() {
        List<Fragment> list;
        if (this.f691k.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f691k) {
            list = (List) this.f691k.clone();
        }
        return list;
    }

    public void d0() {
        this.B = true;
        c0(2);
    }

    Parcelable d1() {
        ArrayList<String> arrayList;
        int size;
        r0();
        f0();
        j0();
        this.A = true;
        androidx.fragment.app.b[] bVarArr = null;
        if (this.f692l.isEmpty()) {
            return null;
        }
        ArrayList<androidx.fragment.app.m> arrayList2 = new ArrayList<>(this.f692l.size());
        boolean z6 = false;
        for (Fragment fragment : this.f692l.values()) {
            if (fragment != null) {
                if (fragment.f612w != this) {
                    m1(new IllegalStateException("Failure saving state: active " + fragment + " was removed from the FragmentManager"));
                }
                androidx.fragment.app.m mVar = new androidx.fragment.app.m(fragment);
                arrayList2.add(mVar);
                if (fragment.f595f <= 0 || mVar.f763r != null) {
                    mVar.f763r = fragment.f596g;
                } else {
                    mVar.f763r = e1(fragment);
                    String str = fragment.f602m;
                    if (str != null) {
                        Fragment fragment2 = this.f692l.get(str);
                        if (fragment2 == null) {
                            m1(new IllegalStateException("Failure saving state: " + fragment + " has target not in fragment manager: " + fragment.f602m));
                        }
                        if (mVar.f763r == null) {
                            mVar.f763r = new Bundle();
                        }
                        W0(mVar.f763r, "android:target_state", fragment2);
                        int i7 = fragment.f603n;
                        if (i7 != 0) {
                            mVar.f763r.putInt("android:target_req_state", i7);
                        }
                    }
                }
                if (M) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + mVar.f763r);
                }
                z6 = true;
            }
        }
        if (!z6) {
            if (M) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size2 = this.f691k.size();
        if (size2 > 0) {
            arrayList = new ArrayList<>(size2);
            Iterator<Fragment> it = this.f691k.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.f599j);
                if (next.f612w != this) {
                    m1(new IllegalStateException("Failure saving state: active " + next + " was removed from the FragmentManager"));
                }
                if (M) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f599j + "): " + next);
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f693m;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            bVarArr = new androidx.fragment.app.b[size];
            for (int i8 = 0; i8 < size; i8++) {
                bVarArr[i8] = new androidx.fragment.app.b(this.f693m.get(i8));
                if (M) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i8 + ": " + this.f693m.get(i8));
                }
            }
        }
        androidx.fragment.app.k kVar = new androidx.fragment.app.k();
        kVar.f739f = arrayList2;
        kVar.f740g = arrayList;
        kVar.f741h = bVarArr;
        Fragment fragment3 = this.f705y;
        if (fragment3 != null) {
            kVar.f742i = fragment3.f599j;
        }
        kVar.f743j = this.f690j;
        return kVar;
    }

    @Override // androidx.fragment.app.i
    public void e(int i7, int i8) {
        if (i7 >= 0) {
            g0(new l(null, i7, i8), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i7);
    }

    void e0() {
        if (this.D) {
            this.D = false;
            l1();
        }
    }

    Bundle e1(Fragment fragment) {
        if (this.H == null) {
            this.H = new Bundle();
        }
        fragment.S0(this.H);
        O(fragment, this.H, false);
        Bundle bundle = null;
        if (!this.H.isEmpty()) {
            Bundle bundle2 = this.H;
            this.H = null;
            bundle = bundle2;
        }
        if (fragment.L != null) {
            f1(fragment);
        }
        if (fragment.f597h != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.f597h);
        }
        if (!fragment.O) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.O);
        }
        return bundle;
    }

    @Override // androidx.fragment.app.i
    public boolean f() {
        r();
        return T0(null, -1, 0);
    }

    void f1(Fragment fragment) {
        if (fragment.M == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = this.I;
        if (sparseArray == null) {
            this.I = new SparseArray<>();
        } else {
            sparseArray.clear();
        }
        fragment.M.saveHierarchyState(this.I);
        if (this.I.size() > 0) {
            fragment.f597h = this.I;
            this.I = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g0(k kVar, boolean z6) {
        if (!z6) {
            r();
        }
        synchronized (this) {
            if (!this.C && this.f702v != null) {
                if (this.f688h == null) {
                    this.f688h = new ArrayList<>();
                }
                this.f688h.add(kVar);
                g1();
                return;
            }
            throw new IllegalStateException("Activity has been destroyed");
        }
    }

    void g1() {
        synchronized (this) {
            ArrayList<m> arrayList = this.J;
            boolean z6 = false;
            boolean z7 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            ArrayList<k> arrayList2 = this.f688h;
            if (arrayList2 != null && arrayList2.size() == 1) {
                z6 = true;
            }
            if (z7 || z6) {
                this.f702v.j().removeCallbacks(this.L);
                this.f702v.j().post(this.L);
                o1();
            }
        }
    }

    public void h1(int i7, androidx.fragment.app.a aVar) {
        synchronized (this) {
            if (this.f697q == null) {
                this.f697q = new ArrayList<>();
            }
            int size = this.f697q.size();
            if (i7 < size) {
                if (M) {
                    Log.v("FragmentManager", "Setting back stack index " + i7 + " to " + aVar);
                }
                this.f697q.set(i7, aVar);
            } else {
                while (size < i7) {
                    this.f697q.add(null);
                    if (this.f698r == null) {
                        this.f698r = new ArrayList<>();
                    }
                    if (M) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.f698r.add(Integer.valueOf(size));
                    size++;
                }
                if (M) {
                    Log.v("FragmentManager", "Adding back stack index " + i7 + " with " + aVar);
                }
                this.f697q.add(aVar);
            }
        }
    }

    void i(androidx.fragment.app.a aVar) {
        if (this.f693m == null) {
            this.f693m = new ArrayList<>();
        }
        this.f693m.add(aVar);
    }

    void i0(Fragment fragment) {
        if (!fragment.f607r || fragment.f610u) {
            return;
        }
        fragment.E0(fragment.I0(fragment.f596g), null, fragment.f596g);
        View view = fragment.L;
        if (view == null) {
            fragment.M = null;
            return;
        }
        fragment.M = view;
        view.setSaveFromParentEnabled(false);
        if (fragment.D) {
            fragment.L.setVisibility(8);
        }
        fragment.w0(fragment.L, fragment.f596g);
        R(fragment, fragment.L, fragment.f596g, false);
    }

    public void i1(Fragment fragment, e.c cVar) {
        if (this.f692l.get(fragment.f599j) == fragment && (fragment.f613x == null || fragment.t() == this)) {
            fragment.W = cVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void j(Fragment fragment, boolean z6) {
        if (M) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        I0(fragment);
        if (fragment.E) {
            return;
        }
        if (this.f691k.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f691k) {
            this.f691k.add(fragment);
        }
        fragment.f605p = true;
        fragment.f606q = false;
        if (fragment.L == null) {
            fragment.S = false;
        }
        if (D0(fragment)) {
            this.f706z = true;
        }
        if (z6) {
            P0(fragment);
        }
    }

    public boolean j0() {
        h0(true);
        boolean z6 = false;
        while (t0(this.E, this.F)) {
            this.f689i = true;
            try {
                Y0(this.E, this.F);
                s();
                z6 = true;
            } catch (Throwable th) {
                s();
                throw th;
            }
        }
        o1();
        e0();
        p();
        return z6;
    }

    public void j1(Fragment fragment) {
        if (fragment == null || (this.f692l.get(fragment.f599j) == fragment && (fragment.f613x == null || fragment.t() == this))) {
            Fragment fragment2 = this.f705y;
            this.f705y = fragment;
            V(fragment2);
            V(this.f705y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    void k(Fragment fragment) {
        if (G0()) {
            if (M) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.K.d(fragment) && M) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    public void k1(Fragment fragment) {
        if (M) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.D) {
            fragment.D = false;
            fragment.S = !fragment.S;
        }
    }

    public int l(androidx.fragment.app.a aVar) {
        synchronized (this) {
            ArrayList<Integer> arrayList = this.f698r;
            if (arrayList != null && arrayList.size() > 0) {
                int intValue = this.f698r.remove(r0.size() - 1).intValue();
                if (M) {
                    Log.v("FragmentManager", "Adding back stack index " + intValue + " with " + aVar);
                }
                this.f697q.set(intValue, aVar);
                return intValue;
            }
            if (this.f697q == null) {
                this.f697q = new ArrayList<>();
            }
            int size = this.f697q.size();
            if (M) {
                Log.v("FragmentManager", "Setting back stack index " + size + " to " + aVar);
            }
            this.f697q.add(aVar);
            return size;
        }
    }

    void l1() {
        for (Fragment fragment : this.f692l.values()) {
            if (fragment != null) {
                S0(fragment);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void n(androidx.fragment.app.h hVar, androidx.fragment.app.e eVar, Fragment fragment) {
        if (this.f702v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f702v = hVar;
        this.f703w = eVar;
        this.f704x = fragment;
        if (fragment != null) {
            o1();
        }
        if (hVar instanceof androidx.activity.c) {
            androidx.activity.c cVar = (androidx.activity.c) hVar;
            OnBackPressedDispatcher h7 = cVar.h();
            this.f695o = h7;
            androidx.lifecycle.i iVar = cVar;
            if (fragment != null) {
                iVar = fragment;
            }
            h7.a(iVar, this.f696p);
        }
        this.K = fragment != null ? fragment.f612w.v0(fragment) : hVar instanceof x ? androidx.fragment.app.l.g(((x) hVar).c()) : new androidx.fragment.app.l(false);
    }

    public Fragment n0(int i7) {
        for (int size = this.f691k.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f691k.get(size);
            if (fragment != null && fragment.A == i7) {
                return fragment;
            }
        }
        for (Fragment fragment2 : this.f692l.values()) {
            if (fragment2 != null && fragment2.A == i7) {
                return fragment2;
            }
        }
        return null;
    }

    public void o(Fragment fragment) {
        if (M) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.E) {
            fragment.E = false;
            if (fragment.f605p) {
                return;
            }
            if (this.f691k.contains(fragment)) {
                throw new IllegalStateException("Fragment already added: " + fragment);
            }
            if (M) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            synchronized (this.f691k) {
                this.f691k.add(fragment);
            }
            fragment.f605p = true;
            if (D0(fragment)) {
                this.f706z = true;
            }
        }
    }

    public Fragment o0(String str) {
        if (str != null) {
            for (int size = this.f691k.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f691k.get(size);
                if (fragment != null && str.equals(fragment.C)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (Fragment fragment2 : this.f692l.values()) {
            if (fragment2 != null && str.equals(fragment2.C)) {
                return fragment2;
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0014j.f731a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (str2 == null || !androidx.fragment.app.g.b(context.getClassLoader(), str2)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
        }
        Fragment n02 = resourceId != -1 ? n0(resourceId) : null;
        if (n02 == null && string != null) {
            n02 = o0(string);
        }
        if (n02 == null && id != -1) {
            n02 = n0(id);
        }
        if (M) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + str2 + " existing=" + n02);
        }
        if (n02 == null) {
            n02 = c().a(context.getClassLoader(), str2);
            n02.f607r = true;
            n02.A = resourceId != 0 ? resourceId : id;
            n02.B = id;
            n02.C = string;
            n02.f608s = true;
            n02.f612w = this;
            androidx.fragment.app.h hVar = this.f702v;
            n02.f613x = hVar;
            n02.j0(hVar.g(), attributeSet, n02.f596g);
            j(n02, true);
        } else {
            if (n02.f608s) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + str2);
            }
            n02.f608s = true;
            androidx.fragment.app.h hVar2 = this.f702v;
            n02.f613x = hVar2;
            n02.j0(hVar2.g(), attributeSet, n02.f596g);
        }
        Fragment fragment = n02;
        if (this.f701u >= 1 || !fragment.f607r) {
            P0(fragment);
        } else {
            Q0(fragment, 1, 0, 0, false);
        }
        View view2 = fragment.L;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.L.getTag() == null) {
                fragment.L.setTag(string);
            }
            return fragment.L;
        }
        throw new IllegalStateException("Fragment " + str2 + " did not create a view.");
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public Fragment p0(String str) {
        Fragment f7;
        for (Fragment fragment : this.f692l.values()) {
            if (fragment != null && (f7 = fragment.f(str)) != null) {
                return f7;
            }
        }
        return null;
    }

    boolean q() {
        boolean z6 = false;
        for (Fragment fragment : this.f692l.values()) {
            if (fragment != null) {
                z6 = D0(fragment);
            }
            if (z6) {
                return true;
            }
        }
        return false;
    }

    public void s0(int i7) {
        synchronized (this) {
            this.f697q.set(i7, null);
            if (this.f698r == null) {
                this.f698r = new ArrayList<>();
            }
            if (M) {
                Log.v("FragmentManager", "Freeing back stack index " + i7);
            }
            this.f698r.add(Integer.valueOf(i7));
        }
    }

    void t(androidx.fragment.app.a aVar, boolean z6, boolean z7, boolean z8) {
        if (z6) {
            aVar.m(z8);
        } else {
            aVar.l();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z6));
        if (z7) {
            o.B(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z8) {
            O0(this.f701u, true);
        }
        for (Fragment fragment : this.f692l.values()) {
            if (fragment != null && fragment.L != null && fragment.R && aVar.p(fragment.B)) {
                float f7 = fragment.T;
                if (f7 > 0.0f) {
                    fragment.L.setAlpha(f7);
                }
                if (z8) {
                    fragment.T = 0.0f;
                } else {
                    fragment.T = -1.0f;
                    fragment.R = false;
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.f704x;
        if (obj == null) {
            obj = this.f702v;
        }
        q.b.a(obj, sb);
        sb.append("}}");
        return sb.toString();
    }

    void u(Fragment fragment) {
        Animator animator;
        if (fragment.L != null) {
            g H0 = H0(fragment, fragment.x(), !fragment.D, fragment.y());
            if (H0 == null || (animator = H0.f723b) == null) {
                if (H0 != null) {
                    fragment.L.startAnimation(H0.f722a);
                    H0.f722a.start();
                }
                fragment.L.setVisibility((!fragment.D || fragment.M()) ? 0 : 8);
                if (fragment.M()) {
                    fragment.e1(false);
                }
            } else {
                animator.setTarget(fragment.L);
                if (!fragment.D) {
                    fragment.L.setVisibility(0);
                } else if (fragment.M()) {
                    fragment.e1(false);
                } else {
                    ViewGroup viewGroup = fragment.K;
                    View view = fragment.L;
                    viewGroup.startViewTransition(view);
                    H0.f723b.addListener(new e(viewGroup, view, fragment));
                }
                H0.f723b.start();
            }
        }
        if (fragment.f605p && D0(fragment)) {
            this.f706z = true;
        }
        fragment.S = false;
        fragment.h0(fragment.D);
    }

    public int u0() {
        ArrayList<androidx.fragment.app.a> arrayList = this.f693m;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public void v(Fragment fragment) {
        if (M) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.E) {
            return;
        }
        fragment.E = true;
        if (fragment.f605p) {
            if (M) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            synchronized (this.f691k) {
                this.f691k.remove(fragment);
            }
            if (D0(fragment)) {
                this.f706z = true;
            }
            fragment.f605p = false;
        }
    }

    androidx.fragment.app.l v0(Fragment fragment) {
        return this.K.f(fragment);
    }

    public void w() {
        this.A = false;
        this.B = false;
        c0(2);
    }

    public Fragment w0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragment = this.f692l.get(string);
        if (fragment == null) {
            m1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return fragment;
    }

    public void x(Configuration configuration) {
        for (int i7 = 0; i7 < this.f691k.size(); i7++) {
            Fragment fragment = this.f691k.get(i7);
            if (fragment != null) {
                fragment.A0(configuration);
            }
        }
    }

    LayoutInflater.Factory2 x0() {
        return this;
    }

    public boolean y(MenuItem menuItem) {
        if (this.f701u < 1) {
            return false;
        }
        for (int i7 = 0; i7 < this.f691k.size(); i7++) {
            Fragment fragment = this.f691k.get(i7);
            if (fragment != null && fragment.B0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public Fragment y0() {
        return this.f705y;
    }

    public void z() {
        this.A = false;
        this.B = false;
        c0(1);
    }

    w z0(Fragment fragment) {
        return this.K.i(fragment);
    }
}
