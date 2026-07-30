package androidx.fragment.app;

import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0250p;
import androidx.lifecycle.C0258y;
import androidx.lifecycle.EnumC0249o;
import c0.AbstractC0285a;
import com.icefishing.icefish.ice.fishing.s294s.R;
import d.C0349A;
import f.AbstractC0391j;
import f.C0390i;
import i.AbstractActivityC0525l;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import k0.C0593d;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: A, reason: collision with root package name */
    public final c2.e f3598A;

    /* renamed from: B, reason: collision with root package name */
    public C0390i f3599B;

    /* renamed from: C, reason: collision with root package name */
    public C0390i f3600C;

    /* renamed from: D, reason: collision with root package name */
    public C0390i f3601D;

    /* renamed from: E, reason: collision with root package name */
    public ArrayDeque f3602E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f3603F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f3604G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f3605H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f3606I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f3607J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList f3608K;

    /* renamed from: L, reason: collision with root package name */
    public ArrayList f3609L;

    /* renamed from: M, reason: collision with root package name */
    public ArrayList f3610M;

    /* renamed from: N, reason: collision with root package name */
    public V f3611N;

    /* renamed from: O, reason: collision with root package name */
    public final F.b f3612O;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3613a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f3614b;

    /* renamed from: c, reason: collision with root package name */
    public final P0.i f3615c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f3616d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3617e;

    /* renamed from: f, reason: collision with root package name */
    public final D f3618f;

    /* renamed from: g, reason: collision with root package name */
    public C0349A f3619g;

    /* renamed from: h, reason: collision with root package name */
    public C0210a f3620h;

    /* renamed from: i, reason: collision with root package name */
    public final H f3621i;
    public final AtomicInteger j;

    /* renamed from: k, reason: collision with root package name */
    public final Map f3622k;

    /* renamed from: l, reason: collision with root package name */
    public final Map f3623l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f3624m;

    /* renamed from: n, reason: collision with root package name */
    public final P0.c f3625n;

    /* renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f3626o;

    /* renamed from: p, reason: collision with root package name */
    public final F f3627p;

    /* renamed from: q, reason: collision with root package name */
    public final F f3628q;

    /* renamed from: r, reason: collision with root package name */
    public final F f3629r;

    /* renamed from: s, reason: collision with root package name */
    public final F f3630s;

    /* renamed from: t, reason: collision with root package name */
    public final I f3631t;

    /* renamed from: u, reason: collision with root package name */
    public int f3632u;

    /* renamed from: v, reason: collision with root package name */
    public C0232x f3633v;

    /* renamed from: w, reason: collision with root package name */
    public A f3634w;

    /* renamed from: x, reason: collision with root package name */
    public ComponentCallbacksC0228t f3635x;

    /* renamed from: y, reason: collision with root package name */
    public ComponentCallbacksC0228t f3636y;

    /* renamed from: z, reason: collision with root package name */
    public final J f3637z;

    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.fragment.app.F] */
    /* JADX WARN: Type inference failed for: r0v16, types: [androidx.fragment.app.F] */
    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.fragment.app.F] */
    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.fragment.app.F] */
    public Q() {
        P0.i iVar = new P0.i();
        iVar.f2200a = new ArrayList();
        iVar.f2201b = new HashMap();
        iVar.f2202c = new HashMap();
        this.f3615c = iVar;
        this.f3616d = new ArrayList();
        this.f3618f = new D(this);
        this.f3620h = null;
        this.f3621i = new H(this);
        this.j = new AtomicInteger();
        this.f3622k = Collections.synchronizedMap(new HashMap());
        this.f3623l = Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        this.f3624m = new ArrayList();
        this.f3625n = new P0.c(this);
        this.f3626o = new CopyOnWriteArrayList();
        final int i2 = 0;
        this.f3627p = new H.a(this) { // from class: androidx.fragment.app.F

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Q f3581b;

            {
                this.f3581b = this;
            }

            @Override // H.a
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        Q q4 = this.f3581b;
                        if (q4.L()) {
                            q4.i(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        Q q7 = this.f3581b;
                        if (q7.L() && num.intValue() == 80) {
                            q7.m(false);
                            break;
                        }
                        break;
                    case 2:
                        y.g gVar = (y.g) obj;
                        Q q8 = this.f3581b;
                        if (q8.L()) {
                            boolean z7 = gVar.f8462a;
                            q8.n(false);
                            break;
                        }
                        break;
                    default:
                        y.u uVar = (y.u) obj;
                        Q q9 = this.f3581b;
                        if (q9.L()) {
                            boolean z8 = uVar.f8522a;
                            q9.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i5 = 1;
        this.f3628q = new H.a(this) { // from class: androidx.fragment.app.F

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Q f3581b;

            {
                this.f3581b = this;
            }

            @Override // H.a
            public final void accept(Object obj) {
                switch (i5) {
                    case 0:
                        Q q4 = this.f3581b;
                        if (q4.L()) {
                            q4.i(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        Q q7 = this.f3581b;
                        if (q7.L() && num.intValue() == 80) {
                            q7.m(false);
                            break;
                        }
                        break;
                    case 2:
                        y.g gVar = (y.g) obj;
                        Q q8 = this.f3581b;
                        if (q8.L()) {
                            boolean z7 = gVar.f8462a;
                            q8.n(false);
                            break;
                        }
                        break;
                    default:
                        y.u uVar = (y.u) obj;
                        Q q9 = this.f3581b;
                        if (q9.L()) {
                            boolean z8 = uVar.f8522a;
                            q9.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i7 = 2;
        this.f3629r = new H.a(this) { // from class: androidx.fragment.app.F

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Q f3581b;

            {
                this.f3581b = this;
            }

            @Override // H.a
            public final void accept(Object obj) {
                switch (i7) {
                    case 0:
                        Q q4 = this.f3581b;
                        if (q4.L()) {
                            q4.i(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        Q q7 = this.f3581b;
                        if (q7.L() && num.intValue() == 80) {
                            q7.m(false);
                            break;
                        }
                        break;
                    case 2:
                        y.g gVar = (y.g) obj;
                        Q q8 = this.f3581b;
                        if (q8.L()) {
                            boolean z7 = gVar.f8462a;
                            q8.n(false);
                            break;
                        }
                        break;
                    default:
                        y.u uVar = (y.u) obj;
                        Q q9 = this.f3581b;
                        if (q9.L()) {
                            boolean z8 = uVar.f8522a;
                            q9.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i8 = 3;
        this.f3630s = new H.a(this) { // from class: androidx.fragment.app.F

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Q f3581b;

            {
                this.f3581b = this;
            }

            @Override // H.a
            public final void accept(Object obj) {
                switch (i8) {
                    case 0:
                        Q q4 = this.f3581b;
                        if (q4.L()) {
                            q4.i(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        Q q7 = this.f3581b;
                        if (q7.L() && num.intValue() == 80) {
                            q7.m(false);
                            break;
                        }
                        break;
                    case 2:
                        y.g gVar = (y.g) obj;
                        Q q8 = this.f3581b;
                        if (q8.L()) {
                            boolean z7 = gVar.f8462a;
                            q8.n(false);
                            break;
                        }
                        break;
                    default:
                        y.u uVar = (y.u) obj;
                        Q q9 = this.f3581b;
                        if (q9.L()) {
                            boolean z8 = uVar.f8522a;
                            q9.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f3631t = new I(this);
        this.f3632u = -1;
        this.f3637z = new J(this);
        this.f3598A = new c2.e();
        this.f3602E = new ArrayDeque();
        this.f3612O = new F.b(10, this);
    }

    public static HashSet E(C0210a c0210a) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < c0210a.f3682a.size(); i2++) {
            ComponentCallbacksC0228t componentCallbacksC0228t = ((Z) c0210a.f3682a.get(i2)).f3674b;
            if (componentCallbacksC0228t != null && c0210a.f3688g) {
                hashSet.add(componentCallbacksC0228t);
            }
        }
        return hashSet;
    }

    public static boolean J(int i2) {
        return Log.isLoggable("FragmentManager", i2);
    }

    public static boolean K(ComponentCallbacksC0228t componentCallbacksC0228t) {
        componentCallbacksC0228t.getClass();
        ArrayList f7 = componentCallbacksC0228t.f3777C.f3615c.f();
        int size = f7.size();
        boolean z7 = false;
        int i2 = 0;
        while (i2 < size) {
            Object obj = f7.get(i2);
            i2++;
            ComponentCallbacksC0228t componentCallbacksC0228t2 = (ComponentCallbacksC0228t) obj;
            if (componentCallbacksC0228t2 != null) {
                z7 = K(componentCallbacksC0228t2);
            }
            if (z7) {
                return true;
            }
        }
        return false;
    }

    public static boolean M(ComponentCallbacksC0228t componentCallbacksC0228t) {
        if (componentCallbacksC0228t == null) {
            return true;
        }
        if (componentCallbacksC0228t.f3785K) {
            return componentCallbacksC0228t.f3775A == null || M(componentCallbacksC0228t.f3778D);
        }
        return false;
    }

    public static boolean N(ComponentCallbacksC0228t componentCallbacksC0228t) {
        if (componentCallbacksC0228t == null) {
            return true;
        }
        Q q4 = componentCallbacksC0228t.f3775A;
        return componentCallbacksC0228t.equals(q4.f3636y) && N(q4.f3635x);
    }

    public static void b0(ComponentCallbacksC0228t componentCallbacksC0228t) {
        if (J(2)) {
            Log.v("FragmentManager", "show: " + componentCallbacksC0228t);
        }
        if (componentCallbacksC0228t.f3782H) {
            componentCallbacksC0228t.f3782H = false;
            componentCallbacksC0228t.Q = !componentCallbacksC0228t.Q;
        }
    }

    public final boolean A(boolean z7) {
        boolean z8;
        z(z7);
        boolean z9 = false;
        while (true) {
            ArrayList arrayList = this.f3608K;
            ArrayList arrayList2 = this.f3609L;
            synchronized (this.f3613a) {
                if (this.f3613a.isEmpty()) {
                    z8 = false;
                } else {
                    try {
                        int size = this.f3613a.size();
                        z8 = false;
                        for (int i2 = 0; i2 < size; i2++) {
                            z8 |= ((N) this.f3613a.get(i2)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z8) {
                e0();
                v();
                ((HashMap) this.f3615c.f2201b).values().removeAll(Collections.singleton(null));
                return z9;
            }
            z9 = true;
            this.f3614b = true;
            try {
                T(this.f3608K, this.f3609L);
            } finally {
                d();
            }
        }
    }

    public final void B(ArrayList arrayList, ArrayList arrayList2, int i2, int i5) {
        String str;
        boolean z7;
        int i7;
        boolean z8;
        boolean z9;
        int i8;
        int i9;
        P0.i iVar = this.f3615c;
        ArrayList arrayList3 = this.f3624m;
        boolean z10 = ((C0210a) arrayList.get(i2)).f3695o;
        ArrayList arrayList4 = this.f3610M;
        if (arrayList4 == null) {
            this.f3610M = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.f3610M.addAll(iVar.g());
        ComponentCallbacksC0228t componentCallbacksC0228t = this.f3636y;
        int i10 = i2;
        boolean z11 = false;
        while (i10 < i5) {
            C0210a c0210a = (C0210a) arrayList.get(i10);
            if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                z7 = z10;
                i7 = i10;
                z8 = z11;
                int i11 = 1;
                ArrayList arrayList5 = this.f3610M;
                ArrayList arrayList6 = c0210a.f3682a;
                int size = arrayList6.size() - 1;
                while (size >= 0) {
                    Z z12 = (Z) arrayList6.get(size);
                    int i12 = z12.f3673a;
                    if (i12 != i11) {
                        if (i12 != 3) {
                            switch (i12) {
                                case S.j.BYTES_FIELD_NUMBER /* 8 */:
                                    componentCallbacksC0228t = null;
                                    break;
                                case 9:
                                    componentCallbacksC0228t = z12.f3674b;
                                    break;
                                case 10:
                                    z12.f3681i = z12.f3680h;
                                    break;
                            }
                            size--;
                            i11 = 1;
                        }
                        arrayList5.add(z12.f3674b);
                        size--;
                        i11 = 1;
                    }
                    arrayList5.remove(z12.f3674b);
                    size--;
                    i11 = 1;
                }
            } else {
                ArrayList arrayList7 = this.f3610M;
                ArrayList arrayList8 = c0210a.f3682a;
                int i13 = 0;
                while (i13 < arrayList8.size()) {
                    Z z13 = (Z) arrayList8.get(i13);
                    boolean z14 = z10;
                    int i14 = z13.f3673a;
                    int i15 = i10;
                    int i16 = 1;
                    if (i14 != 1) {
                        z9 = z11;
                        if (i14 != 2) {
                            if (i14 == 3 || i14 == 6) {
                                arrayList7.remove(z13.f3674b);
                                ComponentCallbacksC0228t componentCallbacksC0228t2 = z13.f3674b;
                                if (componentCallbacksC0228t2 == componentCallbacksC0228t) {
                                    arrayList8.add(i13, new Z(9, componentCallbacksC0228t2));
                                    i13++;
                                    componentCallbacksC0228t = null;
                                }
                            } else if (i14 == 7) {
                                i16 = 1;
                            } else if (i14 == 8) {
                                arrayList8.add(i13, new Z(9, componentCallbacksC0228t, 0));
                                z13.f3675c = true;
                                i13++;
                                componentCallbacksC0228t = z13.f3674b;
                            }
                            i16 = 1;
                        } else {
                            ComponentCallbacksC0228t componentCallbacksC0228t3 = z13.f3674b;
                            int i17 = componentCallbacksC0228t3.f3780F;
                            int size2 = arrayList7.size() - 1;
                            boolean z15 = false;
                            while (size2 >= 0) {
                                int i18 = size2;
                                ComponentCallbacksC0228t componentCallbacksC0228t4 = (ComponentCallbacksC0228t) arrayList7.get(size2);
                                if (componentCallbacksC0228t4.f3780F != i17) {
                                    i8 = i17;
                                } else if (componentCallbacksC0228t4 == componentCallbacksC0228t3) {
                                    i8 = i17;
                                    z15 = true;
                                } else {
                                    if (componentCallbacksC0228t4 == componentCallbacksC0228t) {
                                        i8 = i17;
                                        arrayList8.add(i13, new Z(9, componentCallbacksC0228t4, 0));
                                        i13++;
                                        i9 = 0;
                                        componentCallbacksC0228t = null;
                                    } else {
                                        i8 = i17;
                                        i9 = 0;
                                    }
                                    Z z16 = new Z(3, componentCallbacksC0228t4, i9);
                                    z16.f3676d = z13.f3676d;
                                    z16.f3678f = z13.f3678f;
                                    z16.f3677e = z13.f3677e;
                                    z16.f3679g = z13.f3679g;
                                    arrayList8.add(i13, z16);
                                    arrayList7.remove(componentCallbacksC0228t4);
                                    i13++;
                                    componentCallbacksC0228t = componentCallbacksC0228t;
                                }
                                size2 = i18 - 1;
                                i17 = i8;
                            }
                            i16 = 1;
                            if (z15) {
                                arrayList8.remove(i13);
                                i13--;
                            } else {
                                z13.f3673a = 1;
                                z13.f3675c = true;
                                arrayList7.add(componentCallbacksC0228t3);
                            }
                        }
                        i13 += i16;
                        z10 = z14;
                        i10 = i15;
                        z11 = z9;
                    } else {
                        z9 = z11;
                    }
                    arrayList7.add(z13.f3674b);
                    i13 += i16;
                    z10 = z14;
                    i10 = i15;
                    z11 = z9;
                }
                z7 = z10;
                i7 = i10;
                z8 = z11;
            }
            z11 = z8 || c0210a.f3688g;
            i10 = i7 + 1;
            z10 = z7;
        }
        boolean z17 = z10;
        boolean z18 = z11;
        this.f3610M.clear();
        if (!z17 && this.f3632u >= 1) {
            for (int i19 = i2; i19 < i5; i19++) {
                ArrayList arrayList9 = ((C0210a) arrayList.get(i19)).f3682a;
                int size3 = arrayList9.size();
                int i20 = 0;
                while (i20 < size3) {
                    Object obj = arrayList9.get(i20);
                    i20++;
                    ComponentCallbacksC0228t componentCallbacksC0228t5 = ((Z) obj).f3674b;
                    if (componentCallbacksC0228t5 != null && componentCallbacksC0228t5.f3775A != null) {
                        iVar.j(g(componentCallbacksC0228t5));
                    }
                }
            }
        }
        String str2 = "Unknown cmd: ";
        int i21 = i2;
        while (i21 < i5) {
            C0210a c0210a2 = (C0210a) arrayList.get(i21);
            if (((Boolean) arrayList2.get(i21)).booleanValue()) {
                c0210a2.c(-1);
                Q q4 = c0210a2.f3696p;
                ArrayList arrayList10 = c0210a2.f3682a;
                boolean z19 = true;
                for (int size4 = arrayList10.size() - 1; size4 >= 0; size4--) {
                    Z z20 = (Z) arrayList10.get(size4);
                    ComponentCallbacksC0228t componentCallbacksC0228t6 = z20.f3674b;
                    if (componentCallbacksC0228t6 != null) {
                        if (componentCallbacksC0228t6.f3790P != null) {
                            componentCallbacksC0228t6.b().f3765a = z19;
                        }
                        int i22 = c0210a2.f3687f;
                        int i23 = 8194;
                        int i24 = 4097;
                        if (i22 != 4097) {
                            if (i22 != 8194) {
                                i23 = 4100;
                                if (i22 != 8197) {
                                    i24 = 4099;
                                    if (i22 != 4099) {
                                        i23 = i22 != 4100 ? 0 : 8197;
                                    }
                                }
                            }
                            i23 = i24;
                        }
                        if (componentCallbacksC0228t6.f3790P != null || i23 != 0) {
                            componentCallbacksC0228t6.b();
                            componentCallbacksC0228t6.f3790P.f3770f = i23;
                        }
                        componentCallbacksC0228t6.b();
                        componentCallbacksC0228t6.f3790P.getClass();
                    }
                    switch (z20.f3673a) {
                        case 1:
                            componentCallbacksC0228t6.w(z20.f3676d, z20.f3677e, z20.f3678f, z20.f3679g);
                            z19 = true;
                            q4.X(componentCallbacksC0228t6, true);
                            q4.S(componentCallbacksC0228t6);
                        case 2:
                        default:
                            throw new IllegalArgumentException(str2 + z20.f3673a);
                        case 3:
                            componentCallbacksC0228t6.w(z20.f3676d, z20.f3677e, z20.f3678f, z20.f3679g);
                            q4.a(componentCallbacksC0228t6);
                            z19 = true;
                        case 4:
                            componentCallbacksC0228t6.w(z20.f3676d, z20.f3677e, z20.f3678f, z20.f3679g);
                            q4.getClass();
                            b0(componentCallbacksC0228t6);
                            z19 = true;
                        case 5:
                            componentCallbacksC0228t6.w(z20.f3676d, z20.f3677e, z20.f3678f, z20.f3679g);
                            q4.X(componentCallbacksC0228t6, true);
                            q4.I(componentCallbacksC0228t6);
                            z19 = true;
                        case 6:
                            componentCallbacksC0228t6.w(z20.f3676d, z20.f3677e, z20.f3678f, z20.f3679g);
                            q4.c(componentCallbacksC0228t6);
                            z19 = true;
                        case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            componentCallbacksC0228t6.w(z20.f3676d, z20.f3677e, z20.f3678f, z20.f3679g);
                            q4.X(componentCallbacksC0228t6, true);
                            q4.h(componentCallbacksC0228t6);
                            z19 = true;
                        case S.j.BYTES_FIELD_NUMBER /* 8 */:
                            q4.Z(null);
                            z19 = true;
                        case 9:
                            q4.Z(componentCallbacksC0228t6);
                            z19 = true;
                        case 10:
                            q4.Y(componentCallbacksC0228t6, z20.f3680h);
                            z19 = true;
                    }
                }
            } else {
                c0210a2.c(1);
                Q q7 = c0210a2.f3696p;
                ArrayList arrayList11 = c0210a2.f3682a;
                int size5 = arrayList11.size();
                int i25 = 0;
                while (i25 < size5) {
                    Z z21 = (Z) arrayList11.get(i25);
                    ComponentCallbacksC0228t componentCallbacksC0228t7 = z21.f3674b;
                    if (componentCallbacksC0228t7 != null) {
                        if (componentCallbacksC0228t7.f3790P != null) {
                            componentCallbacksC0228t7.b().f3765a = false;
                        }
                        int i26 = c0210a2.f3687f;
                        if (componentCallbacksC0228t7.f3790P != null || i26 != 0) {
                            componentCallbacksC0228t7.b();
                            componentCallbacksC0228t7.f3790P.f3770f = i26;
                        }
                        componentCallbacksC0228t7.b();
                        componentCallbacksC0228t7.f3790P.getClass();
                    }
                    switch (z21.f3673a) {
                        case 1:
                            str = str2;
                            componentCallbacksC0228t7.w(z21.f3676d, z21.f3677e, z21.f3678f, z21.f3679g);
                            q7.X(componentCallbacksC0228t7, false);
                            q7.a(componentCallbacksC0228t7);
                            i25++;
                            str2 = str;
                        case 2:
                        default:
                            throw new IllegalArgumentException(str2 + z21.f3673a);
                        case 3:
                            str = str2;
                            componentCallbacksC0228t7.w(z21.f3676d, z21.f3677e, z21.f3678f, z21.f3679g);
                            q7.S(componentCallbacksC0228t7);
                            i25++;
                            str2 = str;
                        case 4:
                            str = str2;
                            componentCallbacksC0228t7.w(z21.f3676d, z21.f3677e, z21.f3678f, z21.f3679g);
                            q7.I(componentCallbacksC0228t7);
                            i25++;
                            str2 = str;
                        case 5:
                            str = str2;
                            componentCallbacksC0228t7.w(z21.f3676d, z21.f3677e, z21.f3678f, z21.f3679g);
                            q7.X(componentCallbacksC0228t7, false);
                            b0(componentCallbacksC0228t7);
                            i25++;
                            str2 = str;
                        case 6:
                            str = str2;
                            componentCallbacksC0228t7.w(z21.f3676d, z21.f3677e, z21.f3678f, z21.f3679g);
                            q7.h(componentCallbacksC0228t7);
                            i25++;
                            str2 = str;
                        case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            str = str2;
                            componentCallbacksC0228t7.w(z21.f3676d, z21.f3677e, z21.f3678f, z21.f3679g);
                            q7.X(componentCallbacksC0228t7, false);
                            q7.c(componentCallbacksC0228t7);
                            i25++;
                            str2 = str;
                        case S.j.BYTES_FIELD_NUMBER /* 8 */:
                            q7.Z(componentCallbacksC0228t7);
                            str = str2;
                            i25++;
                            str2 = str;
                        case 9:
                            q7.Z(null);
                            str = str2;
                            i25++;
                            str2 = str;
                        case 10:
                            q7.Y(componentCallbacksC0228t7, z21.f3681i);
                            str = str2;
                            i25++;
                            str2 = str;
                    }
                }
            }
            i21++;
            str2 = str2;
        }
        boolean booleanValue = ((Boolean) arrayList2.get(i5 - 1)).booleanValue();
        if (z18 && !arrayList3.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size6 = arrayList.size();
            int i27 = 0;
            while (i27 < size6) {
                Object obj2 = arrayList.get(i27);
                i27++;
                linkedHashSet.addAll(E((C0210a) obj2));
            }
            if (this.f3620h == null) {
                int size7 = arrayList3.size();
                int i28 = 0;
                while (i28 < size7) {
                    Object obj3 = arrayList3.get(i28);
                    i28++;
                    if (obj3 != null) {
                        throw new ClassCastException();
                    }
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        throw null;
                    }
                }
                int size8 = arrayList3.size();
                int i29 = 0;
                while (i29 < size8) {
                    Object obj4 = arrayList3.get(i29);
                    i29++;
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
        for (int i30 = i2; i30 < i5; i30++) {
            C0210a c0210a3 = (C0210a) arrayList.get(i30);
            if (booleanValue) {
                for (int size9 = c0210a3.f3682a.size() - 1; size9 >= 0; size9--) {
                    ComponentCallbacksC0228t componentCallbacksC0228t8 = ((Z) c0210a3.f3682a.get(size9)).f3674b;
                    if (componentCallbacksC0228t8 != null) {
                        g(componentCallbacksC0228t8).j();
                    }
                }
            } else {
                ArrayList arrayList12 = c0210a3.f3682a;
                int size10 = arrayList12.size();
                int i31 = 0;
                while (i31 < size10) {
                    Object obj5 = arrayList12.get(i31);
                    i31++;
                    ComponentCallbacksC0228t componentCallbacksC0228t9 = ((Z) obj5).f3674b;
                    if (componentCallbacksC0228t9 != null) {
                        g(componentCallbacksC0228t9).j();
                    }
                }
            }
        }
        O(this.f3632u, true);
        int i32 = i2;
        Iterator it3 = f(arrayList, i32, i5).iterator();
        while (it3.hasNext()) {
            C0222m c0222m = (C0222m) it3.next();
            c0222m.f3744d = booleanValue;
            synchronized (c0222m.f3742b) {
                c0222m.g();
                ArrayList arrayList13 = c0222m.f3742b;
                ListIterator listIterator = arrayList13.listIterator(arrayList13.size());
                if (listIterator.hasPrevious()) {
                    ((d0) listIterator.previous()).getClass();
                    throw null;
                }
                c0222m.f3745e = false;
                Unit unit = Unit.f6114a;
            }
            c0222m.c();
        }
        while (i32 < i5) {
            C0210a c0210a4 = (C0210a) arrayList.get(i32);
            if (((Boolean) arrayList2.get(i32)).booleanValue() && c0210a4.f3698r >= 0) {
                c0210a4.f3698r = -1;
            }
            c0210a4.getClass();
            i32++;
        }
        if (z18 && arrayList3.size() > 0) {
            throw C4.p.f(arrayList3, 0);
        }
    }

    public final ComponentCallbacksC0228t C(int i2) {
        P0.i iVar = this.f3615c;
        ArrayList arrayList = (ArrayList) iVar.f2200a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ComponentCallbacksC0228t componentCallbacksC0228t = (ComponentCallbacksC0228t) arrayList.get(size);
            if (componentCallbacksC0228t != null && componentCallbacksC0228t.f3779E == i2) {
                return componentCallbacksC0228t;
            }
        }
        for (Y y7 : ((HashMap) iVar.f2201b).values()) {
            if (y7 != null) {
                ComponentCallbacksC0228t componentCallbacksC0228t2 = y7.f3670c;
                if (componentCallbacksC0228t2.f3779E == i2) {
                    return componentCallbacksC0228t2;
                }
            }
        }
        return null;
    }

    public final void D() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            C0222m c0222m = (C0222m) it.next();
            if (c0222m.f3745e) {
                if (J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0222m.f3745e = false;
                c0222m.c();
            }
        }
    }

    public final ViewGroup F(ComponentCallbacksC0228t componentCallbacksC0228t) {
        ViewGroup viewGroup = componentCallbacksC0228t.f3787M;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (componentCallbacksC0228t.f3780F <= 0 || !this.f3634w.c()) {
            return null;
        }
        View b7 = this.f3634w.b(componentCallbacksC0228t.f3780F);
        if (b7 instanceof ViewGroup) {
            return (ViewGroup) b7;
        }
        return null;
    }

    public final J G() {
        ComponentCallbacksC0228t componentCallbacksC0228t = this.f3635x;
        return componentCallbacksC0228t != null ? componentCallbacksC0228t.f3775A.G() : this.f3637z;
    }

    public final c2.e H() {
        ComponentCallbacksC0228t componentCallbacksC0228t = this.f3635x;
        return componentCallbacksC0228t != null ? componentCallbacksC0228t.f3775A.H() : this.f3598A;
    }

    public final void I(ComponentCallbacksC0228t componentCallbacksC0228t) {
        if (J(2)) {
            Log.v("FragmentManager", "hide: " + componentCallbacksC0228t);
        }
        if (componentCallbacksC0228t.f3782H) {
            return;
        }
        componentCallbacksC0228t.f3782H = true;
        componentCallbacksC0228t.Q = true ^ componentCallbacksC0228t.Q;
        a0(componentCallbacksC0228t);
    }

    public final boolean L() {
        ComponentCallbacksC0228t componentCallbacksC0228t = this.f3635x;
        if (componentCallbacksC0228t == null) {
            return true;
        }
        return componentCallbacksC0228t.h() && this.f3635x.e().L();
    }

    public final void O(int i2, boolean z7) {
        C0232x c0232x;
        if (this.f3633v == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z7 || i2 != this.f3632u) {
            this.f3632u = i2;
            P0.i iVar = this.f3615c;
            HashMap hashMap = (HashMap) iVar.f2201b;
            ArrayList arrayList = (ArrayList) iVar.f2200a;
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                Y y7 = (Y) hashMap.get(((ComponentCallbacksC0228t) obj).f3803m);
                if (y7 != null) {
                    y7.j();
                }
            }
            for (Y y8 : hashMap.values()) {
                if (y8 != null) {
                    y8.j();
                    ComponentCallbacksC0228t componentCallbacksC0228t = y8.f3670c;
                    if (componentCallbacksC0228t.f3810t && !componentCallbacksC0228t.j()) {
                        iVar.k(y8);
                    }
                }
            }
            c0();
            if (this.f3603F && (c0232x = this.f3633v) != null && this.f3632u == 7) {
                c0232x.f3826m.invalidateMenu();
                this.f3603F = false;
            }
        }
    }

    public final void P() {
        if (this.f3633v == null) {
            return;
        }
        this.f3604G = false;
        this.f3605H = false;
        this.f3611N.f3653f = false;
        for (ComponentCallbacksC0228t componentCallbacksC0228t : this.f3615c.g()) {
            if (componentCallbacksC0228t != null) {
                componentCallbacksC0228t.f3777C.P();
            }
        }
    }

    public final boolean Q() {
        A(false);
        z(true);
        ComponentCallbacksC0228t componentCallbacksC0228t = this.f3636y;
        if (componentCallbacksC0228t != null && componentCallbacksC0228t.c().Q()) {
            return true;
        }
        boolean R4 = R(this.f3608K, this.f3609L, -1, 0);
        if (R4) {
            this.f3614b = true;
            try {
                T(this.f3608K, this.f3609L);
            } finally {
                d();
            }
        }
        e0();
        v();
        ((HashMap) this.f3615c.f2201b).values().removeAll(Collections.singleton(null));
        return R4;
    }

    public final boolean R(ArrayList arrayList, ArrayList arrayList2, int i2, int i5) {
        boolean z7 = (i5 & 1) != 0;
        int i7 = -1;
        if (!this.f3616d.isEmpty()) {
            if (i2 < 0) {
                i7 = z7 ? 0 : this.f3616d.size() - 1;
            } else {
                int size = this.f3616d.size() - 1;
                while (size >= 0) {
                    C0210a c0210a = (C0210a) this.f3616d.get(size);
                    if (i2 >= 0 && i2 == c0210a.f3698r) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    i7 = size;
                } else if (z7) {
                    i7 = size;
                    while (i7 > 0) {
                        C0210a c0210a2 = (C0210a) this.f3616d.get(i7 - 1);
                        if (i2 < 0 || i2 != c0210a2.f3698r) {
                            break;
                        }
                        i7--;
                    }
                } else if (size != this.f3616d.size() - 1) {
                    i7 = size + 1;
                }
            }
        }
        if (i7 < 0) {
            return false;
        }
        for (int size2 = this.f3616d.size() - 1; size2 >= i7; size2--) {
            arrayList.add((C0210a) this.f3616d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void S(ComponentCallbacksC0228t componentCallbacksC0228t) {
        if (J(2)) {
            Log.v("FragmentManager", "remove: " + componentCallbacksC0228t + " nesting=" + componentCallbacksC0228t.f3816z);
        }
        boolean j = componentCallbacksC0228t.j();
        if (componentCallbacksC0228t.f3783I && j) {
            return;
        }
        P0.i iVar = this.f3615c;
        synchronized (((ArrayList) iVar.f2200a)) {
            ((ArrayList) iVar.f2200a).remove(componentCallbacksC0228t);
        }
        componentCallbacksC0228t.f3809s = false;
        if (K(componentCallbacksC0228t)) {
            this.f3603F = true;
        }
        componentCallbacksC0228t.f3810t = true;
        a0(componentCallbacksC0228t);
    }

    public final void T(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i2 = 0;
        int i5 = 0;
        while (i2 < size) {
            if (!((C0210a) arrayList.get(i2)).f3695o) {
                if (i5 != i2) {
                    B(arrayList, arrayList2, i5, i2);
                }
                i5 = i2 + 1;
                if (((Boolean) arrayList2.get(i2)).booleanValue()) {
                    while (i5 < size && ((Boolean) arrayList2.get(i5)).booleanValue() && !((C0210a) arrayList.get(i5)).f3695o) {
                        i5++;
                    }
                }
                B(arrayList, arrayList2, i2, i5);
                i2 = i5 - 1;
            }
            i2++;
        }
        if (i5 != size) {
            B(arrayList, arrayList2, i5, size);
        }
    }

    public final void U(Bundle bundle) {
        P0.c cVar;
        int i2;
        int i5;
        Bundle bundle2;
        Y y7;
        Bundle bundle3;
        Bundle bundle4;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle4 = bundle.getBundle(str)) != null) {
                bundle4.setClassLoader(this.f3633v.f3823e.getClassLoader());
                this.f3623l.put(str.substring(7), bundle4);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle3 = bundle.getBundle(str2)) != null) {
                bundle3.setClassLoader(this.f3633v.f3823e.getClassLoader());
                hashMap.put(str2.substring(9), bundle3);
            }
        }
        P0.i iVar = this.f3615c;
        HashMap hashMap2 = (HashMap) iVar.f2202c;
        HashMap hashMap3 = (HashMap) iVar.f2201b;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        T t6 = (T) bundle.getParcelable("state");
        if (t6 == null) {
            return;
        }
        hashMap3.clear();
        ArrayList arrayList = t6.f3638d;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            cVar = this.f3625n;
            if (i7 >= size) {
                break;
            }
            Object obj = arrayList.get(i7);
            i7++;
            Bundle n7 = iVar.n((String) obj, null);
            if (n7 != null) {
                ComponentCallbacksC0228t componentCallbacksC0228t = (ComponentCallbacksC0228t) this.f3611N.f3648a.get(((X) n7.getParcelable("state")).f3655e);
                if (componentCallbacksC0228t != null) {
                    if (J(2)) {
                        i5 = 2;
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + componentCallbacksC0228t);
                    } else {
                        i5 = 2;
                    }
                    y7 = new Y(cVar, iVar, componentCallbacksC0228t, n7);
                    bundle2 = n7;
                } else {
                    i5 = 2;
                    bundle2 = n7;
                    y7 = new Y(this.f3625n, this.f3615c, this.f3633v.f3823e.getClassLoader(), G(), n7);
                }
                ComponentCallbacksC0228t componentCallbacksC0228t2 = y7.f3670c;
                componentCallbacksC0228t2.f3800e = bundle2;
                componentCallbacksC0228t2.f3775A = this;
                if (J(i5)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + componentCallbacksC0228t2.f3803m + "): " + componentCallbacksC0228t2);
                }
                y7.l(this.f3633v.f3823e.getClassLoader());
                iVar.j(y7);
                y7.f3672e = this.f3632u;
            }
        }
        V v7 = this.f3611N;
        v7.getClass();
        ArrayList arrayList2 = new ArrayList(v7.f3648a.values());
        int size2 = arrayList2.size();
        int i8 = 0;
        while (i8 < size2) {
            Object obj2 = arrayList2.get(i8);
            i8++;
            ComponentCallbacksC0228t componentCallbacksC0228t3 = (ComponentCallbacksC0228t) obj2;
            if (hashMap3.get(componentCallbacksC0228t3.f3803m) == null) {
                if (J(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + componentCallbacksC0228t3 + " that was not found in the set of active Fragments " + t6.f3638d);
                }
                this.f3611N.e(componentCallbacksC0228t3);
                componentCallbacksC0228t3.f3775A = this;
                Y y8 = new Y(cVar, iVar, componentCallbacksC0228t3);
                y8.f3672e = 1;
                y8.j();
                componentCallbacksC0228t3.f3810t = true;
                y8.j();
            }
        }
        ArrayList arrayList3 = t6.f3639e;
        ((ArrayList) iVar.f2200a).clear();
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i9 = 0;
            while (i9 < size3) {
                Object obj3 = arrayList3.get(i9);
                i9++;
                String str3 = (String) obj3;
                ComponentCallbacksC0228t c7 = iVar.c(str3);
                if (c7 == null) {
                    throw new IllegalStateException(r4.f.d("No instantiated fragment for (", str3, ")"));
                }
                if (J(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + c7);
                }
                iVar.a(c7);
            }
        }
        if (t6.f3640i != null) {
            this.f3616d = new ArrayList(t6.f3640i.length);
            int i10 = 0;
            while (true) {
                C0211b[] c0211bArr = t6.f3640i;
                if (i10 >= c0211bArr.length) {
                    break;
                }
                C0211b c0211b = c0211bArr[i10];
                ArrayList arrayList4 = c0211b.f3700e;
                C0210a c0210a = new C0210a(this);
                int[] iArr = c0211b.f3699d;
                int i11 = 0;
                int i12 = 0;
                while (i11 < iArr.length) {
                    Z z7 = new Z();
                    int i13 = i11 + 1;
                    z7.f3673a = iArr[i11];
                    if (J(2)) {
                        Log.v("FragmentManager", "Instantiate " + c0210a + " op #" + i12 + " base fragment #" + iArr[i13]);
                    }
                    z7.f3680h = EnumC0249o.values()[c0211b.f3701i[i12]];
                    z7.f3681i = EnumC0249o.values()[c0211b.f3702l[i12]];
                    int i14 = i11 + 2;
                    z7.f3675c = iArr[i13] != 0;
                    int i15 = iArr[i14];
                    z7.f3676d = i15;
                    int i16 = iArr[i11 + 3];
                    z7.f3677e = i16;
                    int i17 = i11 + 5;
                    int i18 = iArr[i11 + 4];
                    z7.f3678f = i18;
                    i11 += 6;
                    int[] iArr2 = iArr;
                    int i19 = iArr2[i17];
                    z7.f3679g = i19;
                    c0210a.f3683b = i15;
                    c0210a.f3684c = i16;
                    c0210a.f3685d = i18;
                    c0210a.f3686e = i19;
                    c0210a.b(z7);
                    i12++;
                    iArr = iArr2;
                }
                c0210a.f3687f = c0211b.f3703m;
                c0210a.f3689h = c0211b.f3704n;
                c0210a.f3688g = true;
                c0210a.f3690i = c0211b.f3706p;
                c0210a.j = c0211b.f3707q;
                c0210a.f3691k = c0211b.f3708r;
                c0210a.f3692l = c0211b.f3709s;
                c0210a.f3693m = c0211b.f3710t;
                c0210a.f3694n = c0211b.f3711u;
                c0210a.f3695o = c0211b.f3712v;
                c0210a.f3698r = c0211b.f3705o;
                for (int i20 = 0; i20 < arrayList4.size(); i20++) {
                    String str4 = (String) arrayList4.get(i20);
                    if (str4 != null) {
                        ((Z) c0210a.f3682a.get(i20)).f3674b = iVar.c(str4);
                    }
                }
                c0210a.c(1);
                if (J(2)) {
                    StringBuilder k7 = C4.p.k(i10, "restoreAllState: back stack #", " (index ");
                    k7.append(c0210a.f3698r);
                    k7.append("): ");
                    k7.append(c0210a);
                    Log.v("FragmentManager", k7.toString());
                    PrintWriter printWriter = new PrintWriter(new b0());
                    c0210a.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f3616d.add(c0210a);
                i10++;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.f3616d = new ArrayList();
        }
        this.j.set(t6.f3641l);
        String str5 = t6.f3642m;
        if (str5 != null) {
            ComponentCallbacksC0228t c8 = iVar.c(str5);
            this.f3636y = c8;
            r(c8);
        }
        ArrayList arrayList5 = t6.f3643n;
        if (arrayList5 != null) {
            for (int i21 = i2; i21 < arrayList5.size(); i21++) {
                this.f3622k.put((String) arrayList5.get(i21), (C0212c) t6.f3644o.get(i21));
            }
        }
        this.f3602E = new ArrayDeque(t6.f3645p);
    }

    public final Bundle V() {
        int i2;
        ArrayList arrayList;
        C0211b[] c0211bArr;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        D();
        x();
        A(true);
        this.f3604G = true;
        this.f3611N.f3653f = true;
        P0.i iVar = this.f3615c;
        iVar.getClass();
        HashMap hashMap = (HashMap) iVar.f2201b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it = hashMap.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Y y7 = (Y) it.next();
            if (y7 != null) {
                ComponentCallbacksC0228t componentCallbacksC0228t = y7.f3670c;
                String str = componentCallbacksC0228t.f3803m;
                Bundle bundle3 = new Bundle();
                ComponentCallbacksC0228t componentCallbacksC0228t2 = y7.f3670c;
                if (componentCallbacksC0228t2.f3799d == -1 && (bundle = componentCallbacksC0228t2.f3800e) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new X(componentCallbacksC0228t2));
                if (componentCallbacksC0228t2.f3799d > -1) {
                    Bundle bundle4 = new Bundle();
                    componentCallbacksC0228t2.r(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    y7.f3668a.p(componentCallbacksC0228t2, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    componentCallbacksC0228t2.f3796W.c(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle V7 = componentCallbacksC0228t2.f3777C.V();
                    if (!V7.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", V7);
                    }
                    SparseArray<? extends Parcelable> sparseArray = componentCallbacksC0228t2.f3801i;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = componentCallbacksC0228t2.f3802l;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = componentCallbacksC0228t2.f3804n;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                iVar.n(str, bundle3);
                arrayList2.add(componentCallbacksC0228t.f3803m);
                if (J(2)) {
                    Log.v("FragmentManager", "Saved state of " + componentCallbacksC0228t + ": " + componentCallbacksC0228t.f3800e);
                }
            }
        }
        HashMap hashMap2 = (HashMap) this.f3615c.f2202c;
        if (!hashMap2.isEmpty()) {
            P0.i iVar2 = this.f3615c;
            synchronized (((ArrayList) iVar2.f2200a)) {
                try {
                    if (((ArrayList) iVar2.f2200a).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) iVar2.f2200a).size());
                        ArrayList arrayList3 = (ArrayList) iVar2.f2200a;
                        int size = arrayList3.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj = arrayList3.get(i5);
                            i5++;
                            ComponentCallbacksC0228t componentCallbacksC0228t3 = (ComponentCallbacksC0228t) obj;
                            arrayList.add(componentCallbacksC0228t3.f3803m);
                            if (J(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + componentCallbacksC0228t3.f3803m + "): " + componentCallbacksC0228t3);
                            }
                        }
                    }
                } finally {
                }
            }
            int size2 = this.f3616d.size();
            if (size2 > 0) {
                c0211bArr = new C0211b[size2];
                for (i2 = 0; i2 < size2; i2++) {
                    c0211bArr[i2] = new C0211b((C0210a) this.f3616d.get(i2));
                    if (J(2)) {
                        StringBuilder k7 = C4.p.k(i2, "saveAllState: adding back stack #", ": ");
                        k7.append(this.f3616d.get(i2));
                        Log.v("FragmentManager", k7.toString());
                    }
                }
            } else {
                c0211bArr = null;
            }
            T t6 = new T();
            t6.f3642m = null;
            ArrayList arrayList4 = new ArrayList();
            t6.f3643n = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            t6.f3644o = arrayList5;
            t6.f3638d = arrayList2;
            t6.f3639e = arrayList;
            t6.f3640i = c0211bArr;
            t6.f3641l = this.j.get();
            ComponentCallbacksC0228t componentCallbacksC0228t4 = this.f3636y;
            if (componentCallbacksC0228t4 != null) {
                t6.f3642m = componentCallbacksC0228t4.f3803m;
            }
            arrayList4.addAll(this.f3622k.keySet());
            arrayList5.addAll(this.f3622k.values());
            t6.f3645p = new ArrayList(this.f3602E);
            bundle2.putParcelable("state", t6);
            for (String str2 : this.f3623l.keySet()) {
                bundle2.putBundle(r4.f.i("result_", str2), (Bundle) this.f3623l.get(str2));
            }
            for (String str3 : hashMap2.keySet()) {
                bundle2.putBundle(r4.f.i("fragment_", str3), (Bundle) hashMap2.get(str3));
            }
        } else if (J(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle2;
        }
        return bundle2;
    }

    public final void W() {
        synchronized (this.f3613a) {
            try {
                if (this.f3613a.size() == 1) {
                    this.f3633v.f3824i.removeCallbacks(this.f3612O);
                    this.f3633v.f3824i.post(this.f3612O);
                    e0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void X(ComponentCallbacksC0228t componentCallbacksC0228t, boolean z7) {
        ViewGroup F4 = F(componentCallbacksC0228t);
        if (F4 == null || !(F4 instanceof B)) {
            return;
        }
        ((B) F4).setDrawDisappearingViewsLast(!z7);
    }

    public final void Y(ComponentCallbacksC0228t componentCallbacksC0228t, EnumC0249o enumC0249o) {
        if (componentCallbacksC0228t.equals(this.f3615c.c(componentCallbacksC0228t.f3803m)) && (componentCallbacksC0228t.f3776B == null || componentCallbacksC0228t.f3775A == this)) {
            componentCallbacksC0228t.f3793T = enumC0249o;
            return;
        }
        throw new IllegalArgumentException("Fragment " + componentCallbacksC0228t + " is not an active fragment of FragmentManager " + this);
    }

    public final void Z(ComponentCallbacksC0228t componentCallbacksC0228t) {
        if (componentCallbacksC0228t != null) {
            if (!componentCallbacksC0228t.equals(this.f3615c.c(componentCallbacksC0228t.f3803m)) || (componentCallbacksC0228t.f3776B != null && componentCallbacksC0228t.f3775A != this)) {
                throw new IllegalArgumentException("Fragment " + componentCallbacksC0228t + " is not an active fragment of FragmentManager " + this);
            }
        }
        ComponentCallbacksC0228t componentCallbacksC0228t2 = this.f3636y;
        this.f3636y = componentCallbacksC0228t;
        r(componentCallbacksC0228t2);
        r(this.f3636y);
    }

    public final Y a(ComponentCallbacksC0228t componentCallbacksC0228t) {
        String str = componentCallbacksC0228t.f3792S;
        if (str != null) {
            Z.d.d(componentCallbacksC0228t, str);
        }
        if (J(2)) {
            Log.v("FragmentManager", "add: " + componentCallbacksC0228t);
        }
        Y g7 = g(componentCallbacksC0228t);
        componentCallbacksC0228t.f3775A = this;
        P0.i iVar = this.f3615c;
        iVar.j(g7);
        if (!componentCallbacksC0228t.f3783I) {
            iVar.a(componentCallbacksC0228t);
            componentCallbacksC0228t.f3810t = false;
            componentCallbacksC0228t.Q = false;
            if (K(componentCallbacksC0228t)) {
                this.f3603F = true;
            }
        }
        return g7;
    }

    public final void a0(ComponentCallbacksC0228t componentCallbacksC0228t) {
        ViewGroup F4 = F(componentCallbacksC0228t);
        if (F4 != null) {
            C0227s c0227s = componentCallbacksC0228t.f3790P;
            if ((c0227s == null ? 0 : c0227s.f3769e) + (c0227s == null ? 0 : c0227s.f3768d) + (c0227s == null ? 0 : c0227s.f3767c) + (c0227s == null ? 0 : c0227s.f3766b) > 0) {
                if (F4.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    F4.setTag(R.id.visible_removing_fragment_view_tag, componentCallbacksC0228t);
                }
                ComponentCallbacksC0228t componentCallbacksC0228t2 = (ComponentCallbacksC0228t) F4.getTag(R.id.visible_removing_fragment_view_tag);
                C0227s c0227s2 = componentCallbacksC0228t.f3790P;
                boolean z7 = c0227s2 != null ? c0227s2.f3765a : false;
                if (componentCallbacksC0228t2.f3790P == null) {
                    return;
                }
                componentCallbacksC0228t2.b().f3765a = z7;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(C0232x c0232x, A a7, ComponentCallbacksC0228t componentCallbacksC0228t) {
        if (this.f3633v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f3633v = c0232x;
        this.f3634w = a7;
        this.f3635x = componentCallbacksC0228t;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3626o;
        if (componentCallbacksC0228t != 0) {
            copyOnWriteArrayList.add(new K(componentCallbacksC0228t));
        } else if (c0232x != null) {
            copyOnWriteArrayList.add(c0232x);
        }
        if (this.f3635x != null) {
            e0();
        }
        if (c0232x != null) {
            C0349A onBackPressedDispatcher = c0232x.f3826m.getOnBackPressedDispatcher();
            this.f3619g = onBackPressedDispatcher;
            C0232x owner = componentCallbacksC0228t != 0 ? componentCallbacksC0228t : c0232x;
            onBackPressedDispatcher.getClass();
            Intrinsics.checkNotNullParameter(owner, "owner");
            H onBackPressedCallback = this.f3621i;
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            AbstractC0250p lifecycle = owner.getLifecycle();
            if (((C0258y) lifecycle).f3922d != EnumC0249o.f3906d) {
                d.x cancellable = new d.x(onBackPressedDispatcher, lifecycle, onBackPressedCallback);
                onBackPressedCallback.getClass();
                Intrinsics.checkNotNullParameter(cancellable, "cancellable");
                onBackPressedCallback.f3585b.add(cancellable);
                onBackPressedDispatcher.d();
                onBackPressedCallback.f3586c = new d.z(0, onBackPressedDispatcher, C0349A.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0);
            }
        }
        if (componentCallbacksC0228t != 0) {
            V v7 = componentCallbacksC0228t.f3775A.f3611N;
            HashMap hashMap = v7.f3649b;
            V v8 = (V) hashMap.get(componentCallbacksC0228t.f3803m);
            if (v8 == null) {
                v8 = new V(v7.f3651d);
                hashMap.put(componentCallbacksC0228t.f3803m, v8);
            }
            this.f3611N = v8;
        } else if (c0232x != null) {
            this.f3611N = (V) new D0.j(c0232x.f3826m.getViewModelStore(), V.f3647g).G(V.class);
        } else {
            this.f3611N = new V(false);
        }
        V v9 = this.f3611N;
        v9.f3653f = this.f3604G || this.f3605H;
        this.f3615c.f2203d = v9;
        C0232x c0232x2 = this.f3633v;
        if (c0232x2 != null && componentCallbacksC0228t == 0) {
            C0593d savedStateRegistry = c0232x2.f3826m.getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new C0229u(1, (S) this));
            Bundle a8 = savedStateRegistry.a("android:support:fragments");
            if (a8 != null) {
                U(a8);
            }
        }
        C0232x c0232x3 = this.f3633v;
        if (c0232x3 != null) {
            AbstractC0391j activityResultRegistry = c0232x3.f3826m.getActivityResultRegistry();
            String i2 = r4.f.i("FragmentManager:", componentCallbacksC0228t != 0 ? r4.f.f(new StringBuilder(), componentCallbacksC0228t.f3803m, ":") : "");
            S s7 = (S) this;
            this.f3599B = activityResultRegistry.c(r4.f.c(i2, "StartActivityForResult"), new L(2), new l2.c(s7));
            this.f3600C = activityResultRegistry.c(r4.f.c(i2, "StartIntentSenderForResult"), new L(0), new G(s7, 1));
            this.f3601D = activityResultRegistry.c(r4.f.c(i2, "RequestPermissions"), new L(1), new G(s7, 0));
        }
        C0232x c0232x4 = this.f3633v;
        if (c0232x4 != null) {
            c0232x4.addOnConfigurationChangedListener(this.f3627p);
        }
        C0232x c0232x5 = this.f3633v;
        if (c0232x5 != null) {
            c0232x5.f3826m.addOnTrimMemoryListener(this.f3628q);
        }
        C0232x c0232x6 = this.f3633v;
        if (c0232x6 != null) {
            c0232x6.f3826m.addOnMultiWindowModeChangedListener(this.f3629r);
        }
        C0232x c0232x7 = this.f3633v;
        if (c0232x7 != null) {
            c0232x7.f3826m.addOnPictureInPictureModeChangedListener(this.f3630s);
        }
        C0232x c0232x8 = this.f3633v;
        if (c0232x8 == null || componentCallbacksC0228t != 0) {
            return;
        }
        c0232x8.f3826m.addMenuProvider(this.f3631t);
    }

    public final void c(ComponentCallbacksC0228t componentCallbacksC0228t) {
        if (J(2)) {
            Log.v("FragmentManager", "attach: " + componentCallbacksC0228t);
        }
        if (componentCallbacksC0228t.f3783I) {
            componentCallbacksC0228t.f3783I = false;
            if (componentCallbacksC0228t.f3809s) {
                return;
            }
            this.f3615c.a(componentCallbacksC0228t);
            if (J(2)) {
                Log.v("FragmentManager", "add from attach: " + componentCallbacksC0228t);
            }
            if (K(componentCallbacksC0228t)) {
                this.f3603F = true;
            }
        }
    }

    public final void c0() {
        ArrayList e7 = this.f3615c.e();
        int size = e7.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = e7.get(i2);
            i2++;
            Y y7 = (Y) obj;
            ComponentCallbacksC0228t componentCallbacksC0228t = y7.f3670c;
            if (componentCallbacksC0228t.f3788N) {
                if (this.f3614b) {
                    this.f3607J = true;
                } else {
                    componentCallbacksC0228t.f3788N = false;
                    y7.j();
                }
            }
        }
    }

    public final void d() {
        this.f3614b = false;
        this.f3609L.clear();
        this.f3608K.clear();
    }

    public final void d0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new b0());
        C0232x c0232x = this.f3633v;
        if (c0232x == null) {
            try {
                w("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e7) {
                Log.e("FragmentManager", "Failed dumping state", e7);
                throw illegalStateException;
            }
        }
        try {
            c0232x.f3826m.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e8) {
            Log.e("FragmentManager", "Failed dumping state", e8);
            throw illegalStateException;
        }
    }

    public final HashSet e() {
        C0222m c0222m;
        HashSet hashSet = new HashSet();
        ArrayList e7 = this.f3615c.e();
        int size = e7.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = e7.get(i2);
            i2++;
            ViewGroup container = ((Y) obj).f3670c.f3787M;
            if (container != null) {
                c2.e factory = H();
                Intrinsics.checkNotNullParameter(container, "container");
                Intrinsics.checkNotNullParameter(factory, "factory");
                Object tag = container.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof C0222m) {
                    c0222m = (C0222m) tag;
                } else {
                    factory.getClass();
                    Intrinsics.checkNotNullParameter(container, "container");
                    c0222m = new C0222m(container);
                    Intrinsics.checkNotNullExpressionValue(c0222m, "factory.createController(container)");
                    container.setTag(R.id.special_effects_controller_view_tag, c0222m);
                }
                hashSet.add(c0222m);
            }
        }
        return hashSet;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r2v6, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.n] */
    public final void e0() {
        synchronized (this.f3613a) {
            try {
                if (!this.f3613a.isEmpty()) {
                    H h7 = this.f3621i;
                    h7.f3584a = true;
                    ?? r22 = h7.f3586c;
                    if (r22 != 0) {
                        r22.invoke();
                    }
                    if (J(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z7 = this.f3616d.size() + (this.f3620h != null ? 1 : 0) > 0 && N(this.f3635x);
                if (J(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z7);
                }
                H h8 = this.f3621i;
                h8.f3584a = z7;
                ?? r0 = h8.f3586c;
                if (r0 != 0) {
                    r0.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet f(ArrayList arrayList, int i2, int i5) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i2 < i5) {
            ArrayList arrayList2 = ((C0210a) arrayList.get(i2)).f3682a;
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                ComponentCallbacksC0228t componentCallbacksC0228t = ((Z) obj).f3674b;
                if (componentCallbacksC0228t != null && (viewGroup = componentCallbacksC0228t.f3787M) != null) {
                    hashSet.add(C0222m.e(viewGroup, this));
                }
            }
            i2++;
        }
        return hashSet;
    }

    public final Y g(ComponentCallbacksC0228t componentCallbacksC0228t) {
        String str = componentCallbacksC0228t.f3803m;
        P0.i iVar = this.f3615c;
        Y y7 = (Y) ((HashMap) iVar.f2201b).get(str);
        if (y7 != null) {
            return y7;
        }
        Y y8 = new Y(this.f3625n, iVar, componentCallbacksC0228t);
        y8.l(this.f3633v.f3823e.getClassLoader());
        y8.f3672e = this.f3632u;
        return y8;
    }

    public final void h(ComponentCallbacksC0228t componentCallbacksC0228t) {
        if (J(2)) {
            Log.v("FragmentManager", "detach: " + componentCallbacksC0228t);
        }
        if (componentCallbacksC0228t.f3783I) {
            return;
        }
        componentCallbacksC0228t.f3783I = true;
        if (componentCallbacksC0228t.f3809s) {
            if (J(2)) {
                Log.v("FragmentManager", "remove from detach: " + componentCallbacksC0228t);
            }
            P0.i iVar = this.f3615c;
            synchronized (((ArrayList) iVar.f2200a)) {
                ((ArrayList) iVar.f2200a).remove(componentCallbacksC0228t);
            }
            componentCallbacksC0228t.f3809s = false;
            if (K(componentCallbacksC0228t)) {
                this.f3603F = true;
            }
            a0(componentCallbacksC0228t);
        }
    }

    public final void i(boolean z7) {
        if (z7 && this.f3633v != null) {
            d0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (ComponentCallbacksC0228t componentCallbacksC0228t : this.f3615c.g()) {
            if (componentCallbacksC0228t != null) {
                componentCallbacksC0228t.f3786L = true;
                if (z7) {
                    componentCallbacksC0228t.f3777C.i(true);
                }
            }
        }
    }

    public final boolean j() {
        if (this.f3632u >= 1) {
            for (ComponentCallbacksC0228t componentCallbacksC0228t : this.f3615c.g()) {
                if (componentCallbacksC0228t != null) {
                    if (!componentCallbacksC0228t.f3782H ? componentCallbacksC0228t.f3777C.j() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean k() {
        if (this.f3632u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z7 = false;
        for (ComponentCallbacksC0228t componentCallbacksC0228t : this.f3615c.g()) {
            if (componentCallbacksC0228t != null && M(componentCallbacksC0228t)) {
                if (!componentCallbacksC0228t.f3782H ? componentCallbacksC0228t.f3777C.k() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(componentCallbacksC0228t);
                    z7 = true;
                }
            }
        }
        if (this.f3617e != null) {
            for (int i2 = 0; i2 < this.f3617e.size(); i2++) {
                ComponentCallbacksC0228t componentCallbacksC0228t2 = (ComponentCallbacksC0228t) this.f3617e.get(i2);
                if (arrayList == null || !arrayList.contains(componentCallbacksC0228t2)) {
                    componentCallbacksC0228t2.getClass();
                }
            }
        }
        this.f3617e = arrayList;
        return z7;
    }

    public final void l() {
        boolean z7 = true;
        this.f3606I = true;
        A(true);
        x();
        C0232x c0232x = this.f3633v;
        P0.i iVar = this.f3615c;
        if (c0232x != null) {
            z7 = ((V) iVar.f2203d).f3652e;
        } else {
            AbstractActivityC0525l abstractActivityC0525l = c0232x.f3823e;
            if (abstractActivityC0525l != null) {
                z7 = true ^ abstractActivityC0525l.isChangingConfigurations();
            }
        }
        if (z7) {
            Iterator it = this.f3622k.values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = ((C0212c) it.next()).f3715d;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((V) iVar.f2203d).c((String) obj, false);
                }
            }
        }
        u(-1);
        C0232x c0232x2 = this.f3633v;
        if (c0232x2 != null) {
            c0232x2.f3826m.removeOnTrimMemoryListener(this.f3628q);
        }
        C0232x c0232x3 = this.f3633v;
        if (c0232x3 != null) {
            c0232x3.removeOnConfigurationChangedListener(this.f3627p);
        }
        C0232x c0232x4 = this.f3633v;
        if (c0232x4 != null) {
            c0232x4.f3826m.removeOnMultiWindowModeChangedListener(this.f3629r);
        }
        C0232x c0232x5 = this.f3633v;
        if (c0232x5 != null) {
            c0232x5.f3826m.removeOnPictureInPictureModeChangedListener(this.f3630s);
        }
        C0232x c0232x6 = this.f3633v;
        if (c0232x6 != null && this.f3635x == null) {
            c0232x6.f3826m.removeMenuProvider(this.f3631t);
        }
        this.f3633v = null;
        this.f3634w = null;
        this.f3635x = null;
        if (this.f3619g != null) {
            Iterator it2 = this.f3621i.f3585b.iterator();
            while (it2.hasNext()) {
                ((d.c) it2.next()).cancel();
            }
            this.f3619g = null;
        }
        C0390i c0390i = this.f3599B;
        if (c0390i != null) {
            c0390i.b();
            this.f3600C.b();
            this.f3601D.b();
        }
    }

    public final void m(boolean z7) {
        if (z7 && this.f3633v != null) {
            d0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (ComponentCallbacksC0228t componentCallbacksC0228t : this.f3615c.g()) {
            if (componentCallbacksC0228t != null) {
                componentCallbacksC0228t.f3786L = true;
                if (z7) {
                    componentCallbacksC0228t.f3777C.m(true);
                }
            }
        }
    }

    public final void n(boolean z7) {
        if (z7 && this.f3633v != null) {
            d0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (ComponentCallbacksC0228t componentCallbacksC0228t : this.f3615c.g()) {
            if (componentCallbacksC0228t != null && z7) {
                componentCallbacksC0228t.f3777C.n(true);
            }
        }
    }

    public final void o() {
        ArrayList f7 = this.f3615c.f();
        int size = f7.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = f7.get(i2);
            i2++;
            ComponentCallbacksC0228t componentCallbacksC0228t = (ComponentCallbacksC0228t) obj;
            if (componentCallbacksC0228t != null) {
                componentCallbacksC0228t.i();
                componentCallbacksC0228t.f3777C.o();
            }
        }
    }

    public final boolean p() {
        if (this.f3632u >= 1) {
            for (ComponentCallbacksC0228t componentCallbacksC0228t : this.f3615c.g()) {
                if (componentCallbacksC0228t != null) {
                    if (!componentCallbacksC0228t.f3782H ? componentCallbacksC0228t.f3777C.p() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void q() {
        if (this.f3632u < 1) {
            return;
        }
        for (ComponentCallbacksC0228t componentCallbacksC0228t : this.f3615c.g()) {
            if (componentCallbacksC0228t != null && !componentCallbacksC0228t.f3782H) {
                componentCallbacksC0228t.f3777C.q();
            }
        }
    }

    public final void r(ComponentCallbacksC0228t componentCallbacksC0228t) {
        if (componentCallbacksC0228t != null) {
            if (componentCallbacksC0228t.equals(this.f3615c.c(componentCallbacksC0228t.f3803m))) {
                componentCallbacksC0228t.f3775A.getClass();
                boolean N7 = N(componentCallbacksC0228t);
                Boolean bool = componentCallbacksC0228t.f3808r;
                if (bool == null || bool.booleanValue() != N7) {
                    componentCallbacksC0228t.f3808r = Boolean.valueOf(N7);
                    S s7 = componentCallbacksC0228t.f3777C;
                    s7.e0();
                    s7.r(s7.f3636y);
                }
            }
        }
    }

    public final void s(boolean z7) {
        if (z7 && this.f3633v != null) {
            d0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (ComponentCallbacksC0228t componentCallbacksC0228t : this.f3615c.g()) {
            if (componentCallbacksC0228t != null && z7) {
                componentCallbacksC0228t.f3777C.s(true);
            }
        }
    }

    public final boolean t() {
        if (this.f3632u < 1) {
            return false;
        }
        boolean z7 = false;
        for (ComponentCallbacksC0228t componentCallbacksC0228t : this.f3615c.g()) {
            if (componentCallbacksC0228t != null && M(componentCallbacksC0228t)) {
                if (!componentCallbacksC0228t.f3782H ? componentCallbacksC0228t.f3777C.t() : false) {
                    z7 = true;
                }
            }
        }
        return z7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        ComponentCallbacksC0228t componentCallbacksC0228t = this.f3635x;
        if (componentCallbacksC0228t != null) {
            sb.append(componentCallbacksC0228t.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f3635x)));
            sb.append("}");
        } else {
            C0232x c0232x = this.f3633v;
            if (c0232x != null) {
                sb.append(c0232x.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f3633v)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(int i2) {
        try {
            this.f3614b = true;
            for (Y y7 : ((HashMap) this.f3615c.f2201b).values()) {
                if (y7 != null) {
                    y7.f3672e = i2;
                }
            }
            O(i2, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0222m) it.next()).d();
            }
            this.f3614b = false;
            A(true);
        } catch (Throwable th) {
            this.f3614b = false;
            throw th;
        }
    }

    public final void v() {
        if (this.f3607J) {
            this.f3607J = false;
            c0();
        }
    }

    public final void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2;
        String c7 = r4.f.c(str, "    ");
        P0.i iVar = this.f3615c;
        ArrayList arrayList = (ArrayList) iVar.f2200a;
        String c8 = r4.f.c(str, "    ");
        HashMap hashMap = (HashMap) iVar.f2201b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (Y y7 : hashMap.values()) {
                printWriter.print(str);
                if (y7 != null) {
                    ComponentCallbacksC0228t componentCallbacksC0228t = y7.f3670c;
                    printWriter.println(componentCallbacksC0228t);
                    componentCallbacksC0228t.getClass();
                    printWriter.print(c8);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(componentCallbacksC0228t.f3779E));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(componentCallbacksC0228t.f3780F));
                    printWriter.print(" mTag=");
                    printWriter.println(componentCallbacksC0228t.f3781G);
                    printWriter.print(c8);
                    printWriter.print("mState=");
                    printWriter.print(componentCallbacksC0228t.f3799d);
                    printWriter.print(" mWho=");
                    printWriter.print(componentCallbacksC0228t.f3803m);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(componentCallbacksC0228t.f3816z);
                    printWriter.print(c8);
                    printWriter.print("mAdded=");
                    printWriter.print(componentCallbacksC0228t.f3809s);
                    printWriter.print(" mRemoving=");
                    printWriter.print(componentCallbacksC0228t.f3810t);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(componentCallbacksC0228t.f3812v);
                    printWriter.print(" mInLayout=");
                    printWriter.println(componentCallbacksC0228t.f3813w);
                    printWriter.print(c8);
                    printWriter.print("mHidden=");
                    printWriter.print(componentCallbacksC0228t.f3782H);
                    printWriter.print(" mDetached=");
                    printWriter.print(componentCallbacksC0228t.f3783I);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(componentCallbacksC0228t.f3785K);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(c8);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(componentCallbacksC0228t.f3784J);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(componentCallbacksC0228t.f3789O);
                    if (componentCallbacksC0228t.f3775A != null) {
                        printWriter.print(c8);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(componentCallbacksC0228t.f3775A);
                    }
                    if (componentCallbacksC0228t.f3776B != null) {
                        printWriter.print(c8);
                        printWriter.print("mHost=");
                        printWriter.println(componentCallbacksC0228t.f3776B);
                    }
                    if (componentCallbacksC0228t.f3778D != null) {
                        printWriter.print(c8);
                        printWriter.print("mParentFragment=");
                        printWriter.println(componentCallbacksC0228t.f3778D);
                    }
                    if (componentCallbacksC0228t.f3804n != null) {
                        printWriter.print(c8);
                        printWriter.print("mArguments=");
                        printWriter.println(componentCallbacksC0228t.f3804n);
                    }
                    if (componentCallbacksC0228t.f3800e != null) {
                        printWriter.print(c8);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(componentCallbacksC0228t.f3800e);
                    }
                    if (componentCallbacksC0228t.f3801i != null) {
                        printWriter.print(c8);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(componentCallbacksC0228t.f3801i);
                    }
                    if (componentCallbacksC0228t.f3802l != null) {
                        printWriter.print(c8);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(componentCallbacksC0228t.f3802l);
                    }
                    Object obj = componentCallbacksC0228t.f3805o;
                    if (obj == null) {
                        Q q4 = componentCallbacksC0228t.f3775A;
                        obj = (q4 == null || (str2 = componentCallbacksC0228t.f3806p) == null) ? null : q4.f3615c.c(str2);
                    }
                    if (obj != null) {
                        printWriter.print(c8);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(componentCallbacksC0228t.f3807q);
                    }
                    printWriter.print(c8);
                    printWriter.print("mPopDirection=");
                    C0227s c0227s = componentCallbacksC0228t.f3790P;
                    printWriter.println(c0227s == null ? false : c0227s.f3765a);
                    C0227s c0227s2 = componentCallbacksC0228t.f3790P;
                    if ((c0227s2 == null ? 0 : c0227s2.f3766b) != 0) {
                        printWriter.print(c8);
                        printWriter.print("getEnterAnim=");
                        C0227s c0227s3 = componentCallbacksC0228t.f3790P;
                        printWriter.println(c0227s3 == null ? 0 : c0227s3.f3766b);
                    }
                    C0227s c0227s4 = componentCallbacksC0228t.f3790P;
                    if ((c0227s4 == null ? 0 : c0227s4.f3767c) != 0) {
                        printWriter.print(c8);
                        printWriter.print("getExitAnim=");
                        C0227s c0227s5 = componentCallbacksC0228t.f3790P;
                        printWriter.println(c0227s5 == null ? 0 : c0227s5.f3767c);
                    }
                    C0227s c0227s6 = componentCallbacksC0228t.f3790P;
                    if ((c0227s6 == null ? 0 : c0227s6.f3768d) != 0) {
                        printWriter.print(c8);
                        printWriter.print("getPopEnterAnim=");
                        C0227s c0227s7 = componentCallbacksC0228t.f3790P;
                        printWriter.println(c0227s7 == null ? 0 : c0227s7.f3768d);
                    }
                    C0227s c0227s8 = componentCallbacksC0228t.f3790P;
                    if ((c0227s8 == null ? 0 : c0227s8.f3769e) != 0) {
                        printWriter.print(c8);
                        printWriter.print("getPopExitAnim=");
                        C0227s c0227s9 = componentCallbacksC0228t.f3790P;
                        printWriter.println(c0227s9 != null ? c0227s9.f3769e : 0);
                    }
                    if (componentCallbacksC0228t.f3787M != null) {
                        printWriter.print(c8);
                        printWriter.print("mContainer=");
                        printWriter.println(componentCallbacksC0228t.f3787M);
                    }
                    C0232x c0232x = componentCallbacksC0228t.f3776B;
                    if ((c0232x != null ? c0232x.f3823e : null) != null) {
                        AbstractC0285a.a(componentCallbacksC0228t).b(c8, printWriter);
                    }
                    printWriter.print(c8);
                    printWriter.println("Child " + componentCallbacksC0228t.f3777C + ":");
                    componentCallbacksC0228t.f3777C.w(r4.f.c(c8, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size2; i2++) {
                ComponentCallbacksC0228t componentCallbacksC0228t2 = (ComponentCallbacksC0228t) arrayList.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC0228t2.toString());
            }
        }
        ArrayList arrayList2 = this.f3617e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i5 = 0; i5 < size; i5++) {
                ComponentCallbacksC0228t componentCallbacksC0228t3 = (ComponentCallbacksC0228t) this.f3617e.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC0228t3.toString());
            }
        }
        int size3 = this.f3616d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i7 = 0; i7 < size3; i7++) {
                C0210a c0210a = (C0210a) this.f3616d.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(c0210a.toString());
                c0210a.f(c7, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.j.get());
        synchronized (this.f3613a) {
            try {
                int size4 = this.f3613a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i8 = 0; i8 < size4; i8++) {
                        Object obj2 = (N) this.f3613a.get(i8);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i8);
                        printWriter.print(": ");
                        printWriter.println(obj2);
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
        printWriter.println(this.f3633v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f3634w);
        if (this.f3635x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f3635x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f3632u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f3604G);
        printWriter.print(" mStopped=");
        printWriter.print(this.f3605H);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f3606I);
        if (this.f3603F) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f3603F);
        }
    }

    public final void x() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0222m) it.next()).d();
        }
    }

    public final void y(N n7, boolean z7) {
        if (!z7) {
            if (this.f3633v == null) {
                if (!this.f3606I) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f3604G || this.f3605H) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f3613a) {
            try {
                if (this.f3633v == null) {
                    if (!z7) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f3613a.add(n7);
                    W();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(boolean z7) {
        if (this.f3614b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f3633v == null) {
            if (!this.f3606I) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f3633v.f3824i.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z7 && (this.f3604G || this.f3605H)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f3608K == null) {
            this.f3608K = new ArrayList();
            this.f3609L = new ArrayList();
        }
    }
}
