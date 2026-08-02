package androidx.fragment.app;

import E.AbstractC0005f;
import E.InterfaceC0007h;
import a0.C0144j;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.EnumC0230i;
import androidx.lifecycle.InterfaceC0235n;
import b.C0238A;
import b.InterfaceC0239B;
import com.rockchicken.pump.up.road.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.flutter.embedding.android.FlutterFragmentActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import m1.C1307e;
import t.C1416d;
import t.C1424l;
import t.InterfaceC1422j;
import t.InterfaceC1423k;
import u.InterfaceC1444a;
import u.InterfaceC1445b;
import x.AbstractC1514c;

/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: A, reason: collision with root package name */
    public final C0144j f4833A;

    /* renamed from: B, reason: collision with root package name */
    public d.g f4834B;

    /* renamed from: C, reason: collision with root package name */
    public d.g f4835C;

    /* renamed from: D, reason: collision with root package name */
    public d.g f4836D;

    /* renamed from: E, reason: collision with root package name */
    public ArrayDeque f4837E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f4838F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f4839G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f4840H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f4841I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f4842J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList f4843K;
    public ArrayList L;

    /* renamed from: M, reason: collision with root package name */
    public ArrayList f4844M;

    /* renamed from: N, reason: collision with root package name */
    public i0 f4845N;

    /* renamed from: O, reason: collision with root package name */
    public final RunnableC0212p f4846O;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4848b;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f4851e;

    /* renamed from: g, reason: collision with root package name */
    public C0238A f4853g;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f4859m;
    public final L n;
    public final CopyOnWriteArrayList o;

    /* renamed from: p, reason: collision with root package name */
    public final U f4860p;

    /* renamed from: q, reason: collision with root package name */
    public final U f4861q;

    /* renamed from: r, reason: collision with root package name */
    public final U f4862r;

    /* renamed from: s, reason: collision with root package name */
    public final U f4863s;

    /* renamed from: t, reason: collision with root package name */
    public final X f4864t;

    /* renamed from: u, reason: collision with root package name */
    public int f4865u;
    public Q v;

    /* renamed from: w, reason: collision with root package name */
    public N f4866w;

    /* renamed from: x, reason: collision with root package name */
    public F f4867x;

    /* renamed from: y, reason: collision with root package name */
    public F f4868y;
    public final Y z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4847a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final n0 f4849c = new n0();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f4850d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final T f4852f = new T(this);

    /* renamed from: h, reason: collision with root package name */
    public C0193a f4854h = null;

    /* renamed from: i, reason: collision with root package name */
    public final W f4855i = new W(this);

    /* renamed from: j, reason: collision with root package name */
    public final AtomicInteger f4856j = new AtomicInteger();

    /* renamed from: k, reason: collision with root package name */
    public final Map f4857k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l, reason: collision with root package name */
    public final Map f4858l = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.fragment.app.U] */
    /* JADX WARN: Type inference failed for: r0v16, types: [androidx.fragment.app.U] */
    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.fragment.app.U] */
    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.fragment.app.U] */
    public f0() {
        Collections.synchronizedMap(new HashMap());
        this.f4859m = new ArrayList();
        this.n = new L(this);
        this.o = new CopyOnWriteArrayList();
        final int i4 = 0;
        this.f4860p = new D.a(this) { // from class: androidx.fragment.app.U

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f4780b;

            {
                this.f4780b = this;
            }

            @Override // D.a, androidx.window.extensions.core.util.function.Consumer
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        f0 f0Var = this.f4780b;
                        if (f0Var.L()) {
                            f0Var.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        f0 f0Var2 = this.f4780b;
                        if (f0Var2.L() && num.intValue() == 80) {
                            f0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        C1416d c1416d = (C1416d) obj;
                        f0 f0Var3 = this.f4780b;
                        if (f0Var3.L()) {
                            f0Var3.n(c1416d.f15240a, false);
                            break;
                        }
                        break;
                    default:
                        C1424l c1424l = (C1424l) obj;
                        f0 f0Var4 = this.f4780b;
                        if (f0Var4.L()) {
                            f0Var4.s(c1424l.f15263a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i5 = 1;
        this.f4861q = new D.a(this) { // from class: androidx.fragment.app.U

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f4780b;

            {
                this.f4780b = this;
            }

            @Override // D.a, androidx.window.extensions.core.util.function.Consumer
            public final void accept(Object obj) {
                switch (i5) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        f0 f0Var = this.f4780b;
                        if (f0Var.L()) {
                            f0Var.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        f0 f0Var2 = this.f4780b;
                        if (f0Var2.L() && num.intValue() == 80) {
                            f0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        C1416d c1416d = (C1416d) obj;
                        f0 f0Var3 = this.f4780b;
                        if (f0Var3.L()) {
                            f0Var3.n(c1416d.f15240a, false);
                            break;
                        }
                        break;
                    default:
                        C1424l c1424l = (C1424l) obj;
                        f0 f0Var4 = this.f4780b;
                        if (f0Var4.L()) {
                            f0Var4.s(c1424l.f15263a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i6 = 2;
        this.f4862r = new D.a(this) { // from class: androidx.fragment.app.U

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f4780b;

            {
                this.f4780b = this;
            }

            @Override // D.a, androidx.window.extensions.core.util.function.Consumer
            public final void accept(Object obj) {
                switch (i6) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        f0 f0Var = this.f4780b;
                        if (f0Var.L()) {
                            f0Var.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        f0 f0Var2 = this.f4780b;
                        if (f0Var2.L() && num.intValue() == 80) {
                            f0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        C1416d c1416d = (C1416d) obj;
                        f0 f0Var3 = this.f4780b;
                        if (f0Var3.L()) {
                            f0Var3.n(c1416d.f15240a, false);
                            break;
                        }
                        break;
                    default:
                        C1424l c1424l = (C1424l) obj;
                        f0 f0Var4 = this.f4780b;
                        if (f0Var4.L()) {
                            f0Var4.s(c1424l.f15263a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i7 = 3;
        this.f4863s = new D.a(this) { // from class: androidx.fragment.app.U

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f4780b;

            {
                this.f4780b = this;
            }

            @Override // D.a, androidx.window.extensions.core.util.function.Consumer
            public final void accept(Object obj) {
                switch (i7) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        f0 f0Var = this.f4780b;
                        if (f0Var.L()) {
                            f0Var.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        f0 f0Var2 = this.f4780b;
                        if (f0Var2.L() && num.intValue() == 80) {
                            f0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        C1416d c1416d = (C1416d) obj;
                        f0 f0Var3 = this.f4780b;
                        if (f0Var3.L()) {
                            f0Var3.n(c1416d.f15240a, false);
                            break;
                        }
                        break;
                    default:
                        C1424l c1424l = (C1424l) obj;
                        f0 f0Var4 = this.f4780b;
                        if (f0Var4.L()) {
                            f0Var4.s(c1424l.f15263a, false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f4864t = new X(this);
        this.f4865u = -1;
        this.z = new Y(this);
        int i8 = 2;
        this.f4833A = new C0144j(i8, false);
        this.f4837E = new ArrayDeque();
        this.f4846O = new RunnableC0212p(i8, this);
    }

    public static HashSet E(C0193a c0193a) {
        HashSet hashSet = new HashSet();
        for (int i4 = 0; i4 < c0193a.f4788a.size(); i4++) {
            F f4 = ((o0) c0193a.f4788a.get(i4)).f4941b;
            if (f4 != null && c0193a.f4794g) {
                hashSet.add(f4);
            }
        }
        return hashSet;
    }

    public static boolean J(int i4) {
        return Log.isLoggable("FragmentManager", i4);
    }

    public static boolean K(F f4) {
        if (f4.mHasMenu && f4.mMenuVisible) {
            return true;
        }
        ArrayList e4 = f4.mChildFragmentManager.f4849c.e();
        int size = e4.size();
        boolean z = false;
        int i4 = 0;
        while (i4 < size) {
            Object obj = e4.get(i4);
            i4++;
            F f5 = (F) obj;
            if (f5 != null) {
                z = K(f5);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean M(F f4) {
        if (f4 == null) {
            return true;
        }
        f0 f0Var = f4.mFragmentManager;
        return f4.equals(f0Var.f4868y) && M(f0Var.f4867x);
    }

    public static void a0(F f4) {
        if (J(2)) {
            Log.v("FragmentManager", "show: " + f4);
        }
        if (f4.mHidden) {
            f4.mHidden = false;
            f4.mHiddenChanged = !f4.mHiddenChanged;
        }
    }

    public final void A(ArrayList arrayList, ArrayList arrayList2, int i4, int i5) {
        int i6;
        boolean z;
        int i7;
        boolean z4;
        int i8;
        int i9;
        boolean z5;
        int i10;
        int i11;
        int i12 = i4;
        boolean z6 = ((C0193a) arrayList.get(i12)).o;
        ArrayList arrayList3 = this.f4844M;
        if (arrayList3 == null) {
            this.f4844M = new ArrayList();
        } else {
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.f4844M;
        n0 n0Var = this.f4849c;
        arrayList4.addAll(n0Var.f());
        F f4 = this.f4868y;
        int i13 = i12;
        boolean z7 = false;
        while (true) {
            int i14 = 1;
            if (i13 >= i5) {
                boolean z8 = z6;
                boolean z9 = z7;
                this.f4844M.clear();
                if (!z8 && this.f4865u >= 1) {
                    for (int i15 = i12; i15 < i5; i15++) {
                        ArrayList arrayList5 = ((C0193a) arrayList.get(i15)).f4788a;
                        int size = arrayList5.size();
                        int i16 = 0;
                        while (i16 < size) {
                            Object obj = arrayList5.get(i16);
                            i16++;
                            F f5 = ((o0) obj).f4941b;
                            if (f5 != null && f5.mFragmentManager != null) {
                                n0Var.g(g(f5));
                            }
                        }
                    }
                }
                int i17 = i12;
                while (i17 < i5) {
                    C0193a c0193a = (C0193a) arrayList.get(i17);
                    if (((Boolean) arrayList2.get(i17)).booleanValue()) {
                        c0193a.c(-1);
                        f0 f0Var = c0193a.f4801p;
                        ArrayList arrayList6 = c0193a.f4788a;
                        boolean z10 = true;
                        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
                            o0 o0Var = (o0) arrayList6.get(size2);
                            F f6 = o0Var.f4941b;
                            if (f6 != null) {
                                f6.mBeingSaved = false;
                                f6.setPopDirection(z10);
                                int i18 = c0193a.f4793f;
                                int i19 = 8194;
                                int i20 = 4097;
                                if (i18 != 4097) {
                                    if (i18 != 8194) {
                                        i19 = 4100;
                                        if (i18 != 8197) {
                                            i20 = 4099;
                                            if (i18 != 4099) {
                                                i19 = i18 != 4100 ? 0 : 8197;
                                            }
                                        }
                                    }
                                    i19 = i20;
                                }
                                f6.setNextTransition(i19);
                                f6.setSharedElementNames(c0193a.n, c0193a.f4800m);
                            }
                            switch (o0Var.f4940a) {
                                case 1:
                                    f6.setAnimations(o0Var.f4943d, o0Var.f4944e, o0Var.f4945f, o0Var.f4946g);
                                    z10 = true;
                                    f0Var.W(f6, true);
                                    f0Var.R(f6);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + o0Var.f4940a);
                                case 3:
                                    f6.setAnimations(o0Var.f4943d, o0Var.f4944e, o0Var.f4945f, o0Var.f4946g);
                                    f0Var.a(f6);
                                    z10 = true;
                                case 4:
                                    f6.setAnimations(o0Var.f4943d, o0Var.f4944e, o0Var.f4945f, o0Var.f4946g);
                                    f0Var.getClass();
                                    a0(f6);
                                    z10 = true;
                                case 5:
                                    f6.setAnimations(o0Var.f4943d, o0Var.f4944e, o0Var.f4945f, o0Var.f4946g);
                                    f0Var.W(f6, true);
                                    f0Var.I(f6);
                                    z10 = true;
                                case 6:
                                    f6.setAnimations(o0Var.f4943d, o0Var.f4944e, o0Var.f4945f, o0Var.f4946g);
                                    f0Var.c(f6);
                                    z10 = true;
                                case 7:
                                    f6.setAnimations(o0Var.f4943d, o0Var.f4944e, o0Var.f4945f, o0Var.f4946g);
                                    f0Var.W(f6, true);
                                    f0Var.h(f6);
                                    z10 = true;
                                case 8:
                                    f0Var.Y(null);
                                    z10 = true;
                                case 9:
                                    f0Var.Y(f6);
                                    z10 = true;
                                case 10:
                                    f0Var.X(f6, o0Var.f4947h);
                                    z10 = true;
                            }
                        }
                    } else {
                        c0193a.c(1);
                        f0 f0Var2 = c0193a.f4801p;
                        ArrayList arrayList7 = c0193a.f4788a;
                        int size3 = arrayList7.size();
                        int i21 = 0;
                        while (i21 < size3) {
                            o0 o0Var2 = (o0) arrayList7.get(i21);
                            F f7 = o0Var2.f4941b;
                            if (f7 != null) {
                                f7.mBeingSaved = false;
                                f7.setPopDirection(false);
                                f7.setNextTransition(c0193a.f4793f);
                                f7.setSharedElementNames(c0193a.f4800m, c0193a.n);
                            }
                            switch (o0Var2.f4940a) {
                                case 1:
                                    i6 = i17;
                                    f7.setAnimations(o0Var2.f4943d, o0Var2.f4944e, o0Var2.f4945f, o0Var2.f4946g);
                                    f0Var2.W(f7, false);
                                    f0Var2.a(f7);
                                    i21++;
                                    i17 = i6;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + o0Var2.f4940a);
                                case 3:
                                    i6 = i17;
                                    f7.setAnimations(o0Var2.f4943d, o0Var2.f4944e, o0Var2.f4945f, o0Var2.f4946g);
                                    f0Var2.R(f7);
                                    i21++;
                                    i17 = i6;
                                case 4:
                                    i6 = i17;
                                    f7.setAnimations(o0Var2.f4943d, o0Var2.f4944e, o0Var2.f4945f, o0Var2.f4946g);
                                    f0Var2.I(f7);
                                    i21++;
                                    i17 = i6;
                                case 5:
                                    i6 = i17;
                                    f7.setAnimations(o0Var2.f4943d, o0Var2.f4944e, o0Var2.f4945f, o0Var2.f4946g);
                                    f0Var2.W(f7, false);
                                    a0(f7);
                                    i21++;
                                    i17 = i6;
                                case 6:
                                    i6 = i17;
                                    f7.setAnimations(o0Var2.f4943d, o0Var2.f4944e, o0Var2.f4945f, o0Var2.f4946g);
                                    f0Var2.h(f7);
                                    i21++;
                                    i17 = i6;
                                case 7:
                                    i6 = i17;
                                    f7.setAnimations(o0Var2.f4943d, o0Var2.f4944e, o0Var2.f4945f, o0Var2.f4946g);
                                    f0Var2.W(f7, false);
                                    f0Var2.c(f7);
                                    i21++;
                                    i17 = i6;
                                case 8:
                                    f0Var2.Y(f7);
                                    i6 = i17;
                                    i21++;
                                    i17 = i6;
                                case 9:
                                    f0Var2.Y(null);
                                    i6 = i17;
                                    i21++;
                                    i17 = i6;
                                case 10:
                                    f0Var2.X(f7, o0Var2.f4948i);
                                    i6 = i17;
                                    i21++;
                                    i17 = i6;
                            }
                        }
                    }
                    i17++;
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i5 - 1)).booleanValue();
                ArrayList arrayList8 = this.f4859m;
                if (z9 && !arrayList8.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    int size4 = arrayList.size();
                    int i22 = 0;
                    while (i22 < size4) {
                        Object obj2 = arrayList.get(i22);
                        i22++;
                        linkedHashSet.addAll(E((C0193a) obj2));
                    }
                    if (this.f4854h == null) {
                        int size5 = arrayList8.size();
                        int i23 = 0;
                        while (i23 < size5) {
                            Object obj3 = arrayList8.get(i23);
                            i23++;
                            if (obj3 != null) {
                                throw new ClassCastException();
                            }
                            Iterator it = linkedHashSet.iterator();
                            if (it.hasNext()) {
                                throw null;
                            }
                        }
                        int size6 = arrayList8.size();
                        int i24 = 0;
                        while (i24 < size6) {
                            Object obj4 = arrayList8.get(i24);
                            i24++;
                            if (obj4 != null) {
                                throw new ClassCastException();
                            }
                            Iterator it2 = linkedHashSet.iterator();
                            if (it2.hasNext()) {
                                throw null;
                            }
                        }
                    }
                }
                for (int i25 = i12; i25 < i5; i25++) {
                    C0193a c0193a2 = (C0193a) arrayList.get(i25);
                    if (booleanValue) {
                        for (int size7 = c0193a2.f4788a.size() - 1; size7 >= 0; size7--) {
                            F f8 = ((o0) c0193a2.f4788a.get(size7)).f4941b;
                            if (f8 != null) {
                                g(f8).k();
                            }
                        }
                    } else {
                        ArrayList arrayList9 = c0193a2.f4788a;
                        int size8 = arrayList9.size();
                        int i26 = 0;
                        while (i26 < size8) {
                            Object obj5 = arrayList9.get(i26);
                            i26++;
                            F f9 = ((o0) obj5).f4941b;
                            if (f9 != null) {
                                g(f9).k();
                            }
                        }
                    }
                }
                N(this.f4865u, true);
                Iterator it3 = f(arrayList, i12, i5).iterator();
                while (it3.hasNext()) {
                    C0211o c0211o = (C0211o) it3.next();
                    c0211o.f4938d = booleanValue;
                    c0211o.k();
                    c0211o.e();
                }
                while (i12 < i5) {
                    C0193a c0193a3 = (C0193a) arrayList.get(i12);
                    if (((Boolean) arrayList2.get(i12)).booleanValue() && c0193a3.f4803r >= 0) {
                        c0193a3.f4803r = -1;
                    }
                    c0193a3.getClass();
                    i12++;
                }
                if (z9 && arrayList8.size() > 0) {
                    throw AbstractC0005f.g(0, arrayList8);
                }
                return;
            }
            C0193a c0193a4 = (C0193a) arrayList.get(i13);
            if (((Boolean) arrayList2.get(i13)).booleanValue()) {
                z = z6;
                i7 = i13;
                z4 = z7;
                int i27 = 1;
                ArrayList arrayList10 = this.f4844M;
                ArrayList arrayList11 = c0193a4.f4788a;
                int size9 = arrayList11.size() - 1;
                while (size9 >= 0) {
                    o0 o0Var3 = (o0) arrayList11.get(size9);
                    int i28 = o0Var3.f4940a;
                    if (i28 != i27) {
                        if (i28 != 3) {
                            switch (i28) {
                                case 8:
                                    f4 = null;
                                    break;
                                case 9:
                                    f4 = o0Var3.f4941b;
                                    break;
                                case 10:
                                    o0Var3.f4948i = o0Var3.f4947h;
                                    break;
                            }
                            size9--;
                            i27 = 1;
                        }
                        arrayList10.add(o0Var3.f4941b);
                        size9--;
                        i27 = 1;
                    }
                    arrayList10.remove(o0Var3.f4941b);
                    size9--;
                    i27 = 1;
                }
            } else {
                ArrayList arrayList12 = this.f4844M;
                ArrayList arrayList13 = c0193a4.f4788a;
                int i29 = 0;
                while (i29 < arrayList13.size()) {
                    o0 o0Var4 = (o0) arrayList13.get(i29);
                    boolean z11 = z6;
                    int i30 = o0Var4.f4940a;
                    if (i30 != i14) {
                        i8 = i13;
                        if (i30 != 2) {
                            if (i30 == 3 || i30 == 6) {
                                arrayList12.remove(o0Var4.f4941b);
                                F f10 = o0Var4.f4941b;
                                if (f10 == f4) {
                                    arrayList13.add(i29, new o0(f10, 9));
                                    i29++;
                                    z5 = z7;
                                    f4 = null;
                                    i9 = 1;
                                }
                            } else if (i30 == 7) {
                                i9 = 1;
                            } else if (i30 == 8) {
                                arrayList13.add(i29, new o0(9, f4, 0));
                                o0Var4.f4942c = true;
                                i29++;
                                f4 = o0Var4.f4941b;
                            }
                            z5 = z7;
                            i9 = 1;
                        } else {
                            F f11 = o0Var4.f4941b;
                            int i31 = f11.mContainerId;
                            int size10 = arrayList12.size() - 1;
                            boolean z12 = false;
                            while (size10 >= 0) {
                                int i32 = size10;
                                F f12 = (F) arrayList12.get(size10);
                                boolean z13 = z7;
                                if (f12.mContainerId != i31) {
                                    i10 = i31;
                                } else if (f12 == f11) {
                                    i10 = i31;
                                    z12 = true;
                                } else {
                                    if (f12 == f4) {
                                        i10 = i31;
                                        i11 = 0;
                                        arrayList13.add(i29, new o0(9, f12, 0));
                                        i29++;
                                        f4 = null;
                                    } else {
                                        i10 = i31;
                                        i11 = 0;
                                    }
                                    o0 o0Var5 = new o0(3, f12, i11);
                                    o0Var5.f4943d = o0Var4.f4943d;
                                    o0Var5.f4945f = o0Var4.f4945f;
                                    o0Var5.f4944e = o0Var4.f4944e;
                                    o0Var5.f4946g = o0Var4.f4946g;
                                    arrayList13.add(i29, o0Var5);
                                    arrayList12.remove(f12);
                                    i29++;
                                    f4 = f4;
                                }
                                size10 = i32 - 1;
                                i31 = i10;
                                z7 = z13;
                            }
                            z5 = z7;
                            i9 = 1;
                            if (z12) {
                                arrayList13.remove(i29);
                                i29--;
                            } else {
                                o0Var4.f4940a = 1;
                                o0Var4.f4942c = true;
                                arrayList12.add(f11);
                            }
                        }
                        i29 += i9;
                        i14 = i9;
                        z6 = z11;
                        i13 = i8;
                        z7 = z5;
                    } else {
                        i8 = i13;
                        i9 = i14;
                    }
                    z5 = z7;
                    arrayList12.add(o0Var4.f4941b);
                    i29 += i9;
                    i14 = i9;
                    z6 = z11;
                    i13 = i8;
                    z7 = z5;
                }
                z = z6;
                i7 = i13;
                z4 = z7;
            }
            z7 = z4 || c0193a4.f4794g;
            i13 = i7 + 1;
            z6 = z;
        }
    }

    public final F B(int i4) {
        n0 n0Var = this.f4849c;
        ArrayList arrayList = n0Var.f4931a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            F f4 = (F) arrayList.get(size);
            if (f4 != null && f4.mFragmentId == i4) {
                return f4;
            }
        }
        for (m0 m0Var : n0Var.f4932b.values()) {
            if (m0Var != null) {
                F f5 = m0Var.f4925c;
                if (f5.mFragmentId == i4) {
                    return f5;
                }
            }
        }
        return null;
    }

    public final F C(String str) {
        n0 n0Var = this.f4849c;
        ArrayList arrayList = n0Var.f4931a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            F f4 = (F) arrayList.get(size);
            if (f4 != null && str.equals(f4.mTag)) {
                return f4;
            }
        }
        for (m0 m0Var : n0Var.f4932b.values()) {
            if (m0Var != null) {
                F f5 = m0Var.f4925c;
                if (str.equals(f5.mTag)) {
                    return f5;
                }
            }
        }
        return null;
    }

    public final void D() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            C0211o c0211o = (C0211o) it.next();
            if (c0211o.f4939e) {
                if (J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0211o.f4939e = false;
                c0211o.e();
            }
        }
    }

    public final ViewGroup F(F f4) {
        ViewGroup viewGroup = f4.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (f4.mContainerId <= 0 || !this.f4866w.c()) {
            return null;
        }
        View b4 = this.f4866w.b(f4.mContainerId);
        if (b4 instanceof ViewGroup) {
            return (ViewGroup) b4;
        }
        return null;
    }

    public final Y G() {
        F f4 = this.f4867x;
        return f4 != null ? f4.mFragmentManager.G() : this.z;
    }

    public final C0144j H() {
        F f4 = this.f4867x;
        return f4 != null ? f4.mFragmentManager.H() : this.f4833A;
    }

    public final void I(F f4) {
        if (J(2)) {
            Log.v("FragmentManager", "hide: " + f4);
        }
        if (f4.mHidden) {
            return;
        }
        f4.mHidden = true;
        f4.mHiddenChanged = true ^ f4.mHiddenChanged;
        Z(f4);
    }

    public final boolean L() {
        F f4 = this.f4867x;
        if (f4 == null) {
            return true;
        }
        return f4.isAdded() && this.f4867x.getParentFragmentManager().L();
    }

    public final void N(int i4, boolean z) {
        Q q4;
        if (this.v == null && i4 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i4 != this.f4865u) {
            this.f4865u = i4;
            n0 n0Var = this.f4849c;
            HashMap hashMap = n0Var.f4932b;
            ArrayList arrayList = n0Var.f4931a;
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                m0 m0Var = (m0) hashMap.get(((F) obj).mWho);
                if (m0Var != null) {
                    m0Var.k();
                }
            }
            for (m0 m0Var2 : hashMap.values()) {
                if (m0Var2 != null) {
                    m0Var2.k();
                    F f4 = m0Var2.f4925c;
                    if (f4.mRemoving && !f4.isInBackStack()) {
                        if (f4.mBeingSaved && !n0Var.f4933c.containsKey(f4.mWho)) {
                            n0Var.i(m0Var2.n(), f4.mWho);
                        }
                        n0Var.h(m0Var2);
                    }
                }
            }
            ArrayList d4 = n0Var.d();
            int size2 = d4.size();
            int i6 = 0;
            while (i6 < size2) {
                Object obj2 = d4.get(i6);
                i6++;
                m0 m0Var3 = (m0) obj2;
                F f5 = m0Var3.f4925c;
                if (f5.mDeferStart) {
                    if (this.f4848b) {
                        this.f4842J = true;
                    } else {
                        f5.mDeferStart = false;
                        m0Var3.k();
                    }
                }
            }
            if (this.f4838F && (q4 = this.v) != null && this.f4865u == 7) {
                ((J) q4).f4759e.invalidateMenu();
                this.f4838F = false;
            }
        }
    }

    public final void O() {
        if (this.v == null) {
            return;
        }
        this.f4839G = false;
        this.f4840H = false;
        this.f4845N.f4891i = false;
        for (F f4 : this.f4849c.f()) {
            if (f4 != null) {
                f4.noteStateNotSaved();
            }
        }
    }

    public final boolean P() {
        z(false);
        y(true);
        F f4 = this.f4868y;
        if (f4 != null && f4.getChildFragmentManager().P()) {
            return true;
        }
        boolean Q4 = Q(this.f4843K, this.L, -1, 0);
        if (Q4) {
            this.f4848b = true;
            try {
                S(this.f4843K, this.L);
            } finally {
                d();
            }
        }
        c0();
        boolean z = this.f4842J;
        n0 n0Var = this.f4849c;
        if (z) {
            this.f4842J = false;
            ArrayList d4 = n0Var.d();
            int size = d4.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = d4.get(i4);
                i4++;
                m0 m0Var = (m0) obj;
                F f5 = m0Var.f4925c;
                if (f5.mDeferStart) {
                    if (this.f4848b) {
                        this.f4842J = true;
                    } else {
                        f5.mDeferStart = false;
                        m0Var.k();
                    }
                }
            }
        }
        n0Var.f4932b.values().removeAll(Collections.singleton(null));
        return Q4;
    }

    public final boolean Q(ArrayList arrayList, ArrayList arrayList2, int i4, int i5) {
        boolean z = (i5 & 1) != 0;
        int i6 = -1;
        if (!this.f4850d.isEmpty()) {
            if (i4 < 0) {
                i6 = z ? 0 : this.f4850d.size() - 1;
            } else {
                int size = this.f4850d.size() - 1;
                while (size >= 0) {
                    C0193a c0193a = (C0193a) this.f4850d.get(size);
                    if (i4 >= 0 && i4 == c0193a.f4803r) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    i6 = size;
                } else if (z) {
                    i6 = size;
                    while (i6 > 0) {
                        C0193a c0193a2 = (C0193a) this.f4850d.get(i6 - 1);
                        if (i4 < 0 || i4 != c0193a2.f4803r) {
                            break;
                        }
                        i6--;
                    }
                } else if (size != this.f4850d.size() - 1) {
                    i6 = size + 1;
                }
            }
        }
        if (i6 < 0) {
            return false;
        }
        for (int size2 = this.f4850d.size() - 1; size2 >= i6; size2--) {
            arrayList.add((C0193a) this.f4850d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void R(F f4) {
        if (J(2)) {
            Log.v("FragmentManager", "remove: " + f4 + " nesting=" + f4.mBackStackNesting);
        }
        boolean isInBackStack = f4.isInBackStack();
        if (f4.mDetached && isInBackStack) {
            return;
        }
        n0 n0Var = this.f4849c;
        synchronized (n0Var.f4931a) {
            n0Var.f4931a.remove(f4);
        }
        f4.mAdded = false;
        if (K(f4)) {
            this.f4838F = true;
        }
        f4.mRemoving = true;
        Z(f4);
    }

    public final void S(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            if (!((C0193a) arrayList.get(i4)).o) {
                if (i5 != i4) {
                    A(arrayList, arrayList2, i5, i4);
                }
                i5 = i4 + 1;
                if (((Boolean) arrayList2.get(i4)).booleanValue()) {
                    while (i5 < size && ((Boolean) arrayList2.get(i5)).booleanValue() && !((C0193a) arrayList.get(i5)).o) {
                        i5++;
                    }
                }
                A(arrayList, arrayList2, i4, i5);
                i4 = i5 - 1;
            }
            i4++;
        }
        if (i5 != size) {
            A(arrayList, arrayList2, i5, size);
        }
    }

    public final void T(Bundle bundle) {
        L l4;
        int i4;
        int i5;
        Bundle bundle2;
        m0 m0Var;
        Bundle bundle3;
        Bundle bundle4;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle4 = bundle.getBundle(str)) != null) {
                bundle4.setClassLoader(this.v.f4773b.getClassLoader());
                this.f4858l.put(str.substring(7), bundle4);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle3 = bundle.getBundle(str2)) != null) {
                bundle3.setClassLoader(this.v.f4773b.getClassLoader());
                hashMap.put(str2.substring(9), bundle3);
            }
        }
        n0 n0Var = this.f4849c;
        HashMap hashMap2 = n0Var.f4933c;
        HashMap hashMap3 = n0Var.f4932b;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        h0 h0Var = (h0) bundle.getParcelable("state");
        if (h0Var == null) {
            return;
        }
        hashMap3.clear();
        ArrayList arrayList = h0Var.f4876a;
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            l4 = this.n;
            if (i6 >= size) {
                break;
            }
            Object obj = arrayList.get(i6);
            i6++;
            Bundle i7 = n0Var.i(null, (String) obj);
            if (i7 != null) {
                F f4 = (F) this.f4845N.f4886d.get(((k0) i7.getParcelable("state")).f4895b);
                if (f4 != null) {
                    if (J(2)) {
                        i5 = 2;
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + f4);
                    } else {
                        i5 = 2;
                    }
                    m0Var = new m0(l4, n0Var, f4, i7);
                    bundle2 = i7;
                } else {
                    i5 = 2;
                    bundle2 = i7;
                    m0Var = new m0(this.n, this.f4849c, this.v.f4773b.getClassLoader(), G(), i7);
                }
                F f5 = m0Var.f4925c;
                f5.mSavedFragmentState = bundle2;
                f5.mFragmentManager = this;
                if (J(i5)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + f5.mWho + "): " + f5);
                }
                m0Var.l(this.v.f4773b.getClassLoader());
                n0Var.g(m0Var);
                m0Var.f4927e = this.f4865u;
            }
        }
        i0 i0Var = this.f4845N;
        i0Var.getClass();
        ArrayList arrayList2 = new ArrayList(i0Var.f4886d.values());
        int size2 = arrayList2.size();
        int i8 = 0;
        while (i8 < size2) {
            Object obj2 = arrayList2.get(i8);
            i8++;
            F f6 = (F) obj2;
            if (hashMap3.get(f6.mWho) == null) {
                if (J(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + f6 + " that was not found in the set of active Fragments " + h0Var.f4876a);
                }
                this.f4845N.g(f6);
                f6.mFragmentManager = this;
                m0 m0Var2 = new m0(l4, n0Var, f6);
                m0Var2.f4927e = 1;
                m0Var2.k();
                f6.mRemoving = true;
                m0Var2.k();
            }
        }
        ArrayList arrayList3 = h0Var.f4877b;
        n0Var.f4931a.clear();
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i9 = 0;
            while (i9 < size3) {
                Object obj3 = arrayList3.get(i9);
                i9++;
                String str3 = (String) obj3;
                F b4 = n0Var.b(str3);
                if (b4 == null) {
                    throw new IllegalStateException(AbstractC1514c.a("No instantiated fragment for (", str3, ")"));
                }
                if (J(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + b4);
                }
                n0Var.a(b4);
            }
        }
        if (h0Var.f4878c != null) {
            this.f4850d = new ArrayList(h0Var.f4878c.length);
            int i10 = 0;
            while (true) {
                C0195b[] c0195bArr = h0Var.f4878c;
                if (i10 >= c0195bArr.length) {
                    break;
                }
                C0195b c0195b = c0195bArr[i10];
                ArrayList arrayList4 = c0195b.f4806b;
                C0193a c0193a = new C0193a(this);
                int[] iArr = c0195b.f4805a;
                int i11 = 0;
                int i12 = 0;
                while (i11 < iArr.length) {
                    o0 o0Var = new o0();
                    int i13 = i11 + 1;
                    o0Var.f4940a = iArr[i11];
                    if (J(2)) {
                        Log.v("FragmentManager", "Instantiate " + c0193a + " op #" + i12 + " base fragment #" + iArr[i13]);
                    }
                    o0Var.f4947h = EnumC0230i.values()[c0195b.f4807c[i12]];
                    o0Var.f4948i = EnumC0230i.values()[c0195b.f4808d[i12]];
                    int i14 = i11 + 2;
                    o0Var.f4942c = iArr[i13] != 0;
                    int i15 = iArr[i14];
                    o0Var.f4943d = i15;
                    int i16 = iArr[i11 + 3];
                    o0Var.f4944e = i16;
                    int i17 = i11 + 5;
                    int i18 = iArr[i11 + 4];
                    o0Var.f4945f = i18;
                    i11 += 6;
                    int[] iArr2 = iArr;
                    int i19 = iArr2[i17];
                    o0Var.f4946g = i19;
                    c0193a.f4789b = i15;
                    c0193a.f4790c = i16;
                    c0193a.f4791d = i18;
                    c0193a.f4792e = i19;
                    c0193a.b(o0Var);
                    i12++;
                    iArr = iArr2;
                }
                c0193a.f4793f = c0195b.f4809e;
                c0193a.f4795h = c0195b.f4810f;
                c0193a.f4794g = true;
                c0193a.f4796i = c0195b.f4812h;
                c0193a.f4797j = c0195b.f4813i;
                c0193a.f4798k = c0195b.f4814j;
                c0193a.f4799l = c0195b.f4815k;
                c0193a.f4800m = c0195b.f4816l;
                c0193a.n = c0195b.f4817m;
                c0193a.o = c0195b.n;
                c0193a.f4803r = c0195b.f4811g;
                for (int i20 = 0; i20 < arrayList4.size(); i20++) {
                    String str4 = (String) arrayList4.get(i20);
                    if (str4 != null) {
                        ((o0) c0193a.f4788a.get(i20)).f4941b = n0Var.b(str4);
                    }
                }
                c0193a.c(1);
                if (J(2)) {
                    StringBuilder r4 = AbstractC0005f.r(i10, "restoreAllState: back stack #", " (index ");
                    r4.append(c0193a.f4803r);
                    r4.append("): ");
                    r4.append(c0193a);
                    Log.v("FragmentManager", r4.toString());
                    PrintWriter printWriter = new PrintWriter(new y0());
                    c0193a.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f4850d.add(c0193a);
                i10++;
            }
            i4 = 0;
        } else {
            i4 = 0;
            this.f4850d = new ArrayList();
        }
        this.f4856j.set(h0Var.f4879d);
        String str5 = h0Var.f4880e;
        if (str5 != null) {
            F b5 = n0Var.b(str5);
            this.f4868y = b5;
            r(b5);
        }
        ArrayList arrayList5 = h0Var.f4881f;
        if (arrayList5 != null) {
            for (int i21 = i4; i21 < arrayList5.size(); i21++) {
                this.f4857k.put((String) arrayList5.get(i21), (C0197c) h0Var.f4882g.get(i21));
            }
        }
        this.f4837E = new ArrayDeque(h0Var.f4883h);
    }

    public final Bundle U() {
        int i4;
        ArrayList arrayList;
        C0195b[] c0195bArr;
        Bundle bundle = new Bundle();
        D();
        w();
        z(true);
        this.f4839G = true;
        this.f4845N.f4891i = true;
        n0 n0Var = this.f4849c;
        n0Var.getClass();
        HashMap hashMap = n0Var.f4932b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (m0 m0Var : hashMap.values()) {
            if (m0Var != null) {
                F f4 = m0Var.f4925c;
                n0Var.i(m0Var.n(), f4.mWho);
                arrayList2.add(f4.mWho);
                if (J(2)) {
                    Log.v("FragmentManager", "Saved state of " + f4 + ": " + f4.mSavedFragmentState);
                }
            }
        }
        HashMap hashMap2 = this.f4849c.f4933c;
        if (!hashMap2.isEmpty()) {
            n0 n0Var2 = this.f4849c;
            synchronized (n0Var2.f4931a) {
                try {
                    if (n0Var2.f4931a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(n0Var2.f4931a.size());
                        ArrayList arrayList3 = n0Var2.f4931a;
                        int size = arrayList3.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj = arrayList3.get(i5);
                            i5++;
                            F f5 = (F) obj;
                            arrayList.add(f5.mWho);
                            if (J(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + f5.mWho + "): " + f5);
                            }
                        }
                    }
                } finally {
                }
            }
            int size2 = this.f4850d.size();
            if (size2 > 0) {
                c0195bArr = new C0195b[size2];
                for (i4 = 0; i4 < size2; i4++) {
                    c0195bArr[i4] = new C0195b((C0193a) this.f4850d.get(i4));
                    if (J(2)) {
                        StringBuilder r4 = AbstractC0005f.r(i4, "saveAllState: adding back stack #", ": ");
                        r4.append(this.f4850d.get(i4));
                        Log.v("FragmentManager", r4.toString());
                    }
                }
            } else {
                c0195bArr = null;
            }
            h0 h0Var = new h0();
            h0Var.f4880e = null;
            ArrayList arrayList4 = new ArrayList();
            h0Var.f4881f = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            h0Var.f4882g = arrayList5;
            h0Var.f4876a = arrayList2;
            h0Var.f4877b = arrayList;
            h0Var.f4878c = c0195bArr;
            h0Var.f4879d = this.f4856j.get();
            F f6 = this.f4868y;
            if (f6 != null) {
                h0Var.f4880e = f6.mWho;
            }
            arrayList4.addAll(this.f4857k.keySet());
            arrayList5.addAll(this.f4857k.values());
            h0Var.f4883h = new ArrayList(this.f4837E);
            bundle.putParcelable("state", h0Var);
            for (String str : this.f4858l.keySet()) {
                bundle.putBundle(AbstractC0005f.n("result_", str), (Bundle) this.f4858l.get(str));
            }
            for (String str2 : hashMap2.keySet()) {
                bundle.putBundle(AbstractC0005f.n("fragment_", str2), (Bundle) hashMap2.get(str2));
            }
        } else if (J(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final void V() {
        synchronized (this.f4847a) {
            try {
                if (this.f4847a.size() == 1) {
                    this.v.f4774c.removeCallbacks(this.f4846O);
                    this.v.f4774c.post(this.f4846O);
                    c0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void W(F f4, boolean z) {
        ViewGroup F4 = F(f4);
        if (F4 == null || !(F4 instanceof O)) {
            return;
        }
        ((O) F4).setDrawDisappearingViewsLast(!z);
    }

    public final void X(F f4, EnumC0230i enumC0230i) {
        if (f4.equals(this.f4849c.b(f4.mWho)) && (f4.mHost == null || f4.mFragmentManager == this)) {
            f4.mMaxState = enumC0230i;
            return;
        }
        throw new IllegalArgumentException("Fragment " + f4 + " is not an active fragment of FragmentManager " + this);
    }

    public final void Y(F f4) {
        if (f4 != null) {
            if (!f4.equals(this.f4849c.b(f4.mWho)) || (f4.mHost != null && f4.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + f4 + " is not an active fragment of FragmentManager " + this);
            }
        }
        F f5 = this.f4868y;
        this.f4868y = f4;
        r(f5);
        r(this.f4868y);
    }

    public final void Z(F f4) {
        ViewGroup F4 = F(f4);
        if (F4 != null) {
            if (f4.getPopExitAnim() + f4.getPopEnterAnim() + f4.getExitAnim() + f4.getEnterAnim() > 0) {
                if (F4.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    F4.setTag(R.id.visible_removing_fragment_view_tag, f4);
                }
                ((F) F4.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(f4.getPopDirection());
            }
        }
    }

    public final m0 a(F f4) {
        String str = f4.mPreviousWho;
        if (str != null) {
            Q.d.c(f4, str);
        }
        if (J(2)) {
            Log.v("FragmentManager", "add: " + f4);
        }
        m0 g4 = g(f4);
        f4.mFragmentManager = this;
        n0 n0Var = this.f4849c;
        n0Var.g(g4);
        if (!f4.mDetached) {
            n0Var.a(f4);
            f4.mRemoving = false;
            if (f4.mView == null) {
                f4.mHiddenChanged = false;
            }
            if (K(f4)) {
                this.f4838F = true;
            }
        }
        return g4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Q q4, N n, F f4) {
        if (this.v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.v = q4;
        this.f4866w = n;
        this.f4867x = f4;
        CopyOnWriteArrayList copyOnWriteArrayList = this.o;
        if (f4 != null) {
            copyOnWriteArrayList.add(new Z(f4));
        } else if (q4 instanceof j0) {
            copyOnWriteArrayList.add((j0) q4);
        }
        if (this.f4867x != null) {
            c0();
        }
        if (q4 instanceof InterfaceC0239B) {
            InterfaceC0239B interfaceC0239B = (InterfaceC0239B) q4;
            C0238A onBackPressedDispatcher = interfaceC0239B.getOnBackPressedDispatcher();
            this.f4853g = onBackPressedDispatcher;
            InterfaceC0235n interfaceC0235n = interfaceC0239B;
            if (f4 != null) {
                interfaceC0235n = f4;
            }
            onBackPressedDispatcher.a(interfaceC0235n, this.f4855i);
        }
        if (f4 != null) {
            i0 i0Var = f4.mFragmentManager.f4845N;
            HashMap hashMap = i0Var.f4887e;
            i0 i0Var2 = (i0) hashMap.get(f4.mWho);
            if (i0Var2 == null) {
                i0Var2 = new i0(i0Var.f4889g);
                hashMap.put(f4.mWho, i0Var2);
            }
            this.f4845N = i0Var2;
        } else if (q4 instanceof androidx.lifecycle.P) {
            B1.j jVar = new B1.j(((androidx.lifecycle.P) q4).getViewModelStore(), i0.f4885j);
            String canonicalName = i0.class.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.f4845N = (i0) jVar.l(i0.class, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        } else {
            this.f4845N = new i0(false);
        }
        i0 i0Var3 = this.f4845N;
        i0Var3.f4891i = this.f4839G || this.f4840H;
        this.f4849c.f4934d = i0Var3;
        Object obj = this.v;
        if ((obj instanceof m1.g) && f4 == null) {
            C1307e savedStateRegistry = ((m1.g) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new G(1, this));
            Bundle a3 = savedStateRegistry.a("android:support:fragments");
            if (a3 != null) {
                T(a3);
            }
        }
        Object obj2 = this.v;
        if (obj2 instanceof d.i) {
            d.h activityResultRegistry = ((d.i) obj2).getActivityResultRegistry();
            String n4 = AbstractC0005f.n("FragmentManager:", f4 != null ? AbstractC0005f.q(new StringBuilder(), f4.mWho, StringUtils.PROCESS_POSTFIX_DELIMITER) : "");
            this.f4834B = activityResultRegistry.d(AbstractC0005f.z(n4, "StartActivityForResult"), new C0194a0(2), new V(this, 1));
            this.f4835C = activityResultRegistry.d(AbstractC0005f.z(n4, "StartIntentSenderForResult"), new C0194a0(0), new V(this, 2));
            this.f4836D = activityResultRegistry.d(AbstractC0005f.z(n4, "RequestPermissions"), new C0194a0(1), new V(this, 0));
        }
        Object obj3 = this.v;
        if (obj3 instanceof InterfaceC1444a) {
            ((InterfaceC1444a) obj3).addOnConfigurationChangedListener(this.f4860p);
        }
        Object obj4 = this.v;
        if (obj4 instanceof InterfaceC1445b) {
            ((InterfaceC1445b) obj4).addOnTrimMemoryListener(this.f4861q);
        }
        Object obj5 = this.v;
        if (obj5 instanceof InterfaceC1422j) {
            ((InterfaceC1422j) obj5).addOnMultiWindowModeChangedListener(this.f4862r);
        }
        Object obj6 = this.v;
        if (obj6 instanceof InterfaceC1423k) {
            ((InterfaceC1423k) obj6).addOnPictureInPictureModeChangedListener(this.f4863s);
        }
        Object obj7 = this.v;
        if ((obj7 instanceof InterfaceC0007h) && f4 == null) {
            ((InterfaceC0007h) obj7).addMenuProvider(this.f4864t);
        }
    }

    public final void b0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new y0());
        Q q4 = this.v;
        if (q4 == null) {
            try {
                v("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e4) {
                Log.e("FragmentManager", "Failed dumping state", e4);
                throw illegalStateException;
            }
        }
        try {
            ((J) q4).f4759e.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e5) {
            Log.e("FragmentManager", "Failed dumping state", e5);
            throw illegalStateException;
        }
    }

    public final void c(F f4) {
        if (J(2)) {
            Log.v("FragmentManager", "attach: " + f4);
        }
        if (f4.mDetached) {
            f4.mDetached = false;
            if (f4.mAdded) {
                return;
            }
            this.f4849c.a(f4);
            if (J(2)) {
                Log.v("FragmentManager", "add from attach: " + f4);
            }
            if (K(f4)) {
                this.f4838F = true;
            }
        }
    }

    public final void c0() {
        synchronized (this.f4847a) {
            try {
                if (!this.f4847a.isEmpty()) {
                    this.f4855i.setEnabled(true);
                    if (J(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z = this.f4850d.size() + (this.f4854h != null ? 1 : 0) > 0 && M(this.f4867x);
                if (J(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
                }
                this.f4855i.setEnabled(z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        this.f4848b = false;
        this.L.clear();
        this.f4843K.clear();
    }

    public final HashSet e() {
        C0211o c0211o;
        HashSet hashSet = new HashSet();
        ArrayList d4 = this.f4849c.d();
        int size = d4.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = d4.get(i4);
            i4++;
            ViewGroup viewGroup = ((m0) obj).f4925c.mContainer;
            if (viewGroup != null) {
                C0144j factory = H();
                kotlin.jvm.internal.i.e(factory, "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof C0211o) {
                    c0211o = (C0211o) tag;
                } else {
                    c0211o = new C0211o(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c0211o);
                }
                hashSet.add(c0211o);
            }
        }
        return hashSet;
    }

    public final HashSet f(ArrayList arrayList, int i4, int i5) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i4 < i5) {
            ArrayList arrayList2 = ((C0193a) arrayList.get(i4)).f4788a;
            int size = arrayList2.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList2.get(i6);
                i6++;
                F f4 = ((o0) obj).f4941b;
                if (f4 != null && (viewGroup = f4.mContainer) != null) {
                    hashSet.add(C0211o.j(viewGroup, this));
                }
            }
            i4++;
        }
        return hashSet;
    }

    public final m0 g(F f4) {
        String str = f4.mWho;
        n0 n0Var = this.f4849c;
        m0 m0Var = (m0) n0Var.f4932b.get(str);
        if (m0Var != null) {
            return m0Var;
        }
        m0 m0Var2 = new m0(this.n, n0Var, f4);
        m0Var2.l(this.v.f4773b.getClassLoader());
        m0Var2.f4927e = this.f4865u;
        return m0Var2;
    }

    public final void h(F f4) {
        if (J(2)) {
            Log.v("FragmentManager", "detach: " + f4);
        }
        if (f4.mDetached) {
            return;
        }
        f4.mDetached = true;
        if (f4.mAdded) {
            if (J(2)) {
                Log.v("FragmentManager", "remove from detach: " + f4);
            }
            n0 n0Var = this.f4849c;
            synchronized (n0Var.f4931a) {
                n0Var.f4931a.remove(f4);
            }
            f4.mAdded = false;
            if (K(f4)) {
                this.f4838F = true;
            }
            Z(f4);
        }
    }

    public final void i(boolean z, Configuration configuration) {
        if (z && (this.v instanceof InterfaceC1444a)) {
            b0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (F f4 : this.f4849c.f()) {
            if (f4 != null) {
                f4.performConfigurationChanged(configuration);
                if (z) {
                    f4.mChildFragmentManager.i(true, configuration);
                }
            }
        }
    }

    public final boolean j(MenuItem menuItem) {
        if (this.f4865u < 1) {
            return false;
        }
        for (F f4 : this.f4849c.f()) {
            if (f4 != null && f4.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean k(Menu menu, MenuInflater menuInflater) {
        if (this.f4865u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (F f4 : this.f4849c.f()) {
            if (f4 != null && f4.isMenuVisible() && f4.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(f4);
                z = true;
            }
        }
        if (this.f4851e != null) {
            for (int i4 = 0; i4 < this.f4851e.size(); i4++) {
                F f5 = (F) this.f4851e.get(i4);
                if (arrayList == null || !arrayList.contains(f5)) {
                    f5.onDestroyOptionsMenu();
                }
            }
        }
        this.f4851e = arrayList;
        return z;
    }

    public final void l() {
        boolean z = true;
        this.f4841I = true;
        z(true);
        w();
        Q q4 = this.v;
        boolean z4 = q4 instanceof androidx.lifecycle.P;
        n0 n0Var = this.f4849c;
        if (z4) {
            z = n0Var.f4934d.f4890h;
        } else {
            FlutterFragmentActivity flutterFragmentActivity = q4.f4773b;
            if (flutterFragmentActivity != null) {
                z = true ^ flutterFragmentActivity.isChangingConfigurations();
            }
        }
        if (z) {
            Iterator it = this.f4857k.values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = ((C0197c) it.next()).f4820a;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    n0Var.f4934d.e((String) obj, false);
                }
            }
        }
        u(-1);
        Object obj2 = this.v;
        if (obj2 instanceof InterfaceC1445b) {
            ((InterfaceC1445b) obj2).removeOnTrimMemoryListener(this.f4861q);
        }
        Object obj3 = this.v;
        if (obj3 instanceof InterfaceC1444a) {
            ((InterfaceC1444a) obj3).removeOnConfigurationChangedListener(this.f4860p);
        }
        Object obj4 = this.v;
        if (obj4 instanceof InterfaceC1422j) {
            ((InterfaceC1422j) obj4).removeOnMultiWindowModeChangedListener(this.f4862r);
        }
        Object obj5 = this.v;
        if (obj5 instanceof InterfaceC1423k) {
            ((InterfaceC1423k) obj5).removeOnPictureInPictureModeChangedListener(this.f4863s);
        }
        Object obj6 = this.v;
        if ((obj6 instanceof InterfaceC0007h) && this.f4867x == null) {
            ((InterfaceC0007h) obj6).removeMenuProvider(this.f4864t);
        }
        this.v = null;
        this.f4866w = null;
        this.f4867x = null;
        if (this.f4853g != null) {
            this.f4855i.remove();
            this.f4853g = null;
        }
        d.g gVar = this.f4834B;
        if (gVar != null) {
            gVar.b();
            this.f4835C.b();
            this.f4836D.b();
        }
    }

    public final void m(boolean z) {
        if (z && (this.v instanceof InterfaceC1445b)) {
            b0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (F f4 : this.f4849c.f()) {
            if (f4 != null) {
                f4.performLowMemory();
                if (z) {
                    f4.mChildFragmentManager.m(true);
                }
            }
        }
    }

    public final void n(boolean z, boolean z4) {
        if (z4 && (this.v instanceof InterfaceC1422j)) {
            b0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (F f4 : this.f4849c.f()) {
            if (f4 != null) {
                f4.performMultiWindowModeChanged(z);
                if (z4) {
                    f4.mChildFragmentManager.n(z, true);
                }
            }
        }
    }

    public final void o() {
        ArrayList e4 = this.f4849c.e();
        int size = e4.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = e4.get(i4);
            i4++;
            F f4 = (F) obj;
            if (f4 != null) {
                f4.onHiddenChanged(f4.isHidden());
                f4.mChildFragmentManager.o();
            }
        }
    }

    public final boolean p(MenuItem menuItem) {
        if (this.f4865u < 1) {
            return false;
        }
        for (F f4 : this.f4849c.f()) {
            if (f4 != null && f4.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void q(Menu menu) {
        if (this.f4865u < 1) {
            return;
        }
        for (F f4 : this.f4849c.f()) {
            if (f4 != null) {
                f4.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void r(F f4) {
        if (f4 != null) {
            if (f4.equals(this.f4849c.b(f4.mWho))) {
                f4.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void s(boolean z, boolean z4) {
        if (z4 && (this.v instanceof InterfaceC1423k)) {
            b0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (F f4 : this.f4849c.f()) {
            if (f4 != null) {
                f4.performPictureInPictureModeChanged(z);
                if (z4) {
                    f4.mChildFragmentManager.s(z, true);
                }
            }
        }
    }

    public final boolean t(Menu menu) {
        boolean z = false;
        if (this.f4865u < 1) {
            return false;
        }
        for (F f4 : this.f4849c.f()) {
            if (f4 != null && f4.isMenuVisible() && f4.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        F f4 = this.f4867x;
        if (f4 != null) {
            sb.append(f4.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f4867x)));
            sb.append("}");
        } else {
            Q q4 = this.v;
            if (q4 != null) {
                sb.append(q4.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.v)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(int i4) {
        try {
            this.f4848b = true;
            for (m0 m0Var : this.f4849c.f4932b.values()) {
                if (m0Var != null) {
                    m0Var.f4927e = i4;
                }
            }
            N(i4, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0211o) it.next()).i();
            }
            this.f4848b = false;
            z(true);
        } catch (Throwable th) {
            this.f4848b = false;
            throw th;
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String z = AbstractC0005f.z(str, "    ");
        n0 n0Var = this.f4849c;
        ArrayList arrayList = n0Var.f4931a;
        String z4 = AbstractC0005f.z(str, "    ");
        HashMap hashMap = n0Var.f4932b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (m0 m0Var : hashMap.values()) {
                printWriter.print(str);
                if (m0Var != null) {
                    F f4 = m0Var.f4925c;
                    printWriter.println(f4);
                    f4.dump(z4, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i4 = 0; i4 < size2; i4++) {
                F f5 = (F) arrayList.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(f5.toString());
            }
        }
        ArrayList arrayList2 = this.f4851e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i5 = 0; i5 < size; i5++) {
                F f6 = (F) this.f4851e.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(f6.toString());
            }
        }
        int size3 = this.f4850d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i6 = 0; i6 < size3; i6++) {
                C0193a c0193a = (C0193a) this.f4850d.get(i6);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(c0193a.toString());
                c0193a.f(z, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f4856j.get());
        synchronized (this.f4847a) {
            try {
                int size4 = this.f4847a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i7 = 0; i7 < size4; i7++) {
                        Object obj = (InterfaceC0198c0) this.f4847a.get(i7);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i7);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f4866w);
        if (this.f4867x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f4867x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f4865u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f4839G);
        printWriter.print(" mStopped=");
        printWriter.print(this.f4840H);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f4841I);
        if (this.f4838F) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f4838F);
        }
    }

    public final void w() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0211o) it.next()).i();
        }
    }

    public final void x(InterfaceC0198c0 interfaceC0198c0, boolean z) {
        if (!z) {
            if (this.v == null) {
                if (!this.f4841I) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f4839G || this.f4840H) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f4847a) {
            try {
                if (this.v == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f4847a.add(interfaceC0198c0);
                    V();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(boolean z) {
        if (this.f4848b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.v == null) {
            if (!this.f4841I) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.v.f4774c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z && (this.f4839G || this.f4840H)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f4843K == null) {
            this.f4843K = new ArrayList();
            this.L = new ArrayList();
        }
    }

    public final boolean z(boolean z) {
        boolean z4;
        y(z);
        boolean z5 = false;
        while (true) {
            ArrayList arrayList = this.f4843K;
            ArrayList arrayList2 = this.L;
            synchronized (this.f4847a) {
                if (this.f4847a.isEmpty()) {
                    z4 = false;
                } else {
                    try {
                        int size = this.f4847a.size();
                        z4 = false;
                        for (int i4 = 0; i4 < size; i4++) {
                            z4 |= ((InterfaceC0198c0) this.f4847a.get(i4)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z4) {
                break;
            }
            this.f4848b = true;
            try {
                S(this.f4843K, this.L);
                d();
                z5 = true;
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        c0();
        if (this.f4842J) {
            this.f4842J = false;
            ArrayList d4 = this.f4849c.d();
            int size2 = d4.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj = d4.get(i5);
                i5++;
                m0 m0Var = (m0) obj;
                F f4 = m0Var.f4925c;
                if (f4.mDeferStart) {
                    if (this.f4848b) {
                        this.f4842J = true;
                    } else {
                        f4.mDeferStart = false;
                        m0Var.k();
                    }
                }
            }
        }
        this.f4849c.f4932b.values().removeAll(Collections.singleton(null));
        return z5;
    }
}
