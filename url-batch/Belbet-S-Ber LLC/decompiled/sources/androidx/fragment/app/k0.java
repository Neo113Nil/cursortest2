package androidx.fragment.app;

import a.c0;
import a.i0;
import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.l;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import com.gdmhkmf.belbet.R;
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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class k0 {
    public androidx.emoji2.text.q A;
    public androidx.emoji2.text.q B;
    public ArrayDeque C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ArrayList K;
    public m0 L;
    public final g M;

    /* renamed from: b, reason: collision with root package name */
    public boolean f555b;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f557e;

    /* renamed from: g, reason: collision with root package name */
    public a.j0 f559g;

    /* renamed from: l, reason: collision with root package name */
    public final androidx.emoji2.text.q f562l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f563m;

    /* renamed from: n, reason: collision with root package name */
    public final a0 f564n;

    /* renamed from: o, reason: collision with root package name */
    public final a0 f565o;

    /* renamed from: p, reason: collision with root package name */
    public final a0 f566p;

    /* renamed from: q, reason: collision with root package name */
    public final a0 f567q;

    /* renamed from: r, reason: collision with root package name */
    public final d0 f568r;

    /* renamed from: s, reason: collision with root package name */
    public int f569s;

    /* renamed from: t, reason: collision with root package name */
    public w f570t;

    /* renamed from: u, reason: collision with root package name */
    public b4.d f571u;

    /* renamed from: v, reason: collision with root package name */
    public u f572v;

    /* renamed from: w, reason: collision with root package name */
    public u f573w;

    /* renamed from: x, reason: collision with root package name */
    public final e0 f574x;

    /* renamed from: y, reason: collision with root package name */
    public final o2.f f575y;

    /* renamed from: z, reason: collision with root package name */
    public androidx.emoji2.text.q f576z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f554a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final a0.k f556c = new a0.k(3);

    /* renamed from: f, reason: collision with root package name */
    public final z f558f = new z(this);
    public final c0 h = new c0(this);
    public final AtomicInteger i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map f560j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map f561k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.fragment.app.a0] */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.fragment.app.a0] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.fragment.app.a0] */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.fragment.app.a0] */
    public k0() {
        Collections.synchronizedMap(new HashMap());
        this.f562l = new androidx.emoji2.text.q(this);
        this.f563m = new CopyOnWriteArrayList();
        final int i = 0;
        this.f564n = new m0.a(this) { // from class: androidx.fragment.app.a0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f509b;

            {
                this.f509b = this;
            }

            @Override // m0.a
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        k0 k0Var = this.f509b;
                        if (k0Var.J()) {
                            k0Var.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        k0 k0Var2 = this.f509b;
                        if (k0Var2.J() && num.intValue() == 80) {
                            k0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        c0.f fVar = (c0.f) obj;
                        k0 k0Var3 = this.f509b;
                        if (k0Var3.J()) {
                            boolean z4 = fVar.f872a;
                            k0Var3.n(false);
                            break;
                        }
                        break;
                    default:
                        c0.g gVar = (c0.g) obj;
                        k0 k0Var4 = this.f509b;
                        if (k0Var4.J()) {
                            boolean z5 = gVar.f873a;
                            k0Var4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 1;
        this.f565o = new m0.a(this) { // from class: androidx.fragment.app.a0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f509b;

            {
                this.f509b = this;
            }

            @Override // m0.a
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        k0 k0Var = this.f509b;
                        if (k0Var.J()) {
                            k0Var.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        k0 k0Var2 = this.f509b;
                        if (k0Var2.J() && num.intValue() == 80) {
                            k0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        c0.f fVar = (c0.f) obj;
                        k0 k0Var3 = this.f509b;
                        if (k0Var3.J()) {
                            boolean z4 = fVar.f872a;
                            k0Var3.n(false);
                            break;
                        }
                        break;
                    default:
                        c0.g gVar = (c0.g) obj;
                        k0 k0Var4 = this.f509b;
                        if (k0Var4.J()) {
                            boolean z5 = gVar.f873a;
                            k0Var4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i5 = 2;
        this.f566p = new m0.a(this) { // from class: androidx.fragment.app.a0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f509b;

            {
                this.f509b = this;
            }

            @Override // m0.a
            public final void accept(Object obj) {
                switch (i5) {
                    case 0:
                        k0 k0Var = this.f509b;
                        if (k0Var.J()) {
                            k0Var.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        k0 k0Var2 = this.f509b;
                        if (k0Var2.J() && num.intValue() == 80) {
                            k0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        c0.f fVar = (c0.f) obj;
                        k0 k0Var3 = this.f509b;
                        if (k0Var3.J()) {
                            boolean z4 = fVar.f872a;
                            k0Var3.n(false);
                            break;
                        }
                        break;
                    default:
                        c0.g gVar = (c0.g) obj;
                        k0 k0Var4 = this.f509b;
                        if (k0Var4.J()) {
                            boolean z5 = gVar.f873a;
                            k0Var4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i6 = 3;
        this.f567q = new m0.a(this) { // from class: androidx.fragment.app.a0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f509b;

            {
                this.f509b = this;
            }

            @Override // m0.a
            public final void accept(Object obj) {
                switch (i6) {
                    case 0:
                        k0 k0Var = this.f509b;
                        if (k0Var.J()) {
                            k0Var.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        k0 k0Var2 = this.f509b;
                        if (k0Var2.J() && num.intValue() == 80) {
                            k0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        c0.f fVar = (c0.f) obj;
                        k0 k0Var3 = this.f509b;
                        if (k0Var3.J()) {
                            boolean z4 = fVar.f872a;
                            k0Var3.n(false);
                            break;
                        }
                        break;
                    default:
                        c0.g gVar = (c0.g) obj;
                        k0 k0Var4 = this.f509b;
                        if (k0Var4.J()) {
                            boolean z5 = gVar.f873a;
                            k0Var4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f568r = new d0(this);
        this.f569s = -1;
        this.f574x = new e0(this);
        this.f575y = new o2.f(6);
        this.C = new ArrayDeque();
        this.M = new g(2, this);
    }

    public static boolean H(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean I(u uVar) {
        uVar.getClass();
        ArrayList l4 = uVar.f661y.f556c.l();
        int size = l4.size();
        boolean z4 = false;
        int i = 0;
        while (i < size) {
            Object obj = l4.get(i);
            i++;
            u uVar2 = (u) obj;
            if (uVar2 != null) {
                z4 = I(uVar2);
            }
            if (z4) {
                return true;
            }
        }
        return false;
    }

    public static boolean K(u uVar) {
        if (uVar == null) {
            return true;
        }
        if (uVar.G) {
            return uVar.f659w == null || K(uVar.f662z);
        }
        return false;
    }

    public static boolean L(u uVar) {
        if (uVar == null) {
            return true;
        }
        k0 k0Var = uVar.f659w;
        return uVar.equals(k0Var.f573w) && L(k0Var.f572v);
    }

    public static void a0(u uVar) {
        if (H(2)) {
            Log.v("FragmentManager", "show: " + uVar);
        }
        if (uVar.D) {
            uVar.D = false;
            uVar.N = !uVar.N;
        }
    }

    public final void A(ArrayList arrayList, ArrayList arrayList2, int i, int i4) {
        ViewGroup viewGroup;
        boolean z4;
        int i5;
        boolean z5;
        boolean z6;
        int i6;
        int i7;
        boolean z7;
        boolean z8;
        int i8;
        a0.k kVar = this.f556c;
        boolean z9 = ((a) arrayList.get(i)).f504o;
        ArrayList arrayList3 = this.K;
        if (arrayList3 == null) {
            this.K = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.K.addAll(kVar.m());
        u uVar = this.f573w;
        int i9 = i;
        boolean z10 = false;
        while (true) {
            int i10 = 1;
            if (i9 >= i4) {
                boolean z11 = z9;
                this.K.clear();
                if (!z11 && this.f569s >= 1) {
                    for (int i11 = i; i11 < i4; i11++) {
                        ArrayList arrayList4 = ((a) arrayList.get(i11)).f493a;
                        int size = arrayList4.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList4.get(i12);
                            i12++;
                            u uVar2 = ((r0) obj).f627b;
                            if (uVar2 != null && uVar2.f659w != null) {
                                kVar.o(f(uVar2));
                            }
                        }
                    }
                }
                for (int i13 = i; i13 < i4; i13++) {
                    a aVar = (a) arrayList.get(i13);
                    if (((Boolean) arrayList2.get(i13)).booleanValue()) {
                        aVar.c(-1);
                        k0 k0Var = aVar.f505p;
                        ArrayList arrayList5 = aVar.f493a;
                        boolean z12 = true;
                        for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
                            r0 r0Var = (r0) arrayList5.get(size2);
                            u uVar3 = r0Var.f627b;
                            if (uVar3 != null) {
                                if (uVar3.M != null) {
                                    uVar3.d().f632a = z12;
                                }
                                int i14 = aVar.f497f;
                                int i15 = 8194;
                                int i16 = 4097;
                                if (i14 != 4097) {
                                    if (i14 != 8194) {
                                        i15 = 4100;
                                        i16 = 8197;
                                        if (i14 != 8197) {
                                            if (i14 == 4099) {
                                                i15 = 4099;
                                            } else if (i14 != 4100) {
                                                i15 = 0;
                                            }
                                        }
                                    }
                                    i15 = i16;
                                }
                                if (uVar3.M != null || i15 != 0) {
                                    uVar3.d();
                                    uVar3.M.f636f = i15;
                                }
                                uVar3.d();
                                uVar3.M.getClass();
                            }
                            switch (r0Var.f626a) {
                                case 1:
                                    uVar3.E(r0Var.d, r0Var.f629e, r0Var.f630f, r0Var.f631g);
                                    z12 = true;
                                    k0Var.W(uVar3, true);
                                    k0Var.R(uVar3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + r0Var.f626a);
                                case 3:
                                    uVar3.E(r0Var.d, r0Var.f629e, r0Var.f630f, r0Var.f631g);
                                    k0Var.a(uVar3);
                                    z12 = true;
                                case 4:
                                    uVar3.E(r0Var.d, r0Var.f629e, r0Var.f630f, r0Var.f631g);
                                    k0Var.getClass();
                                    a0(uVar3);
                                    z12 = true;
                                case 5:
                                    uVar3.E(r0Var.d, r0Var.f629e, r0Var.f630f, r0Var.f631g);
                                    k0Var.W(uVar3, true);
                                    k0Var.G(uVar3);
                                    z12 = true;
                                case 6:
                                    uVar3.E(r0Var.d, r0Var.f629e, r0Var.f630f, r0Var.f631g);
                                    k0Var.c(uVar3);
                                    z12 = true;
                                case 7:
                                    uVar3.E(r0Var.d, r0Var.f629e, r0Var.f630f, r0Var.f631g);
                                    k0Var.W(uVar3, true);
                                    k0Var.g(uVar3);
                                    z12 = true;
                                case 8:
                                    k0Var.Y(null);
                                    z12 = true;
                                case 9:
                                    k0Var.Y(uVar3);
                                    z12 = true;
                                case 10:
                                    k0Var.X(uVar3, r0Var.h);
                                    z12 = true;
                            }
                        }
                    } else {
                        aVar.c(1);
                        k0 k0Var2 = aVar.f505p;
                        ArrayList arrayList6 = aVar.f493a;
                        int size3 = arrayList6.size();
                        for (int i17 = 0; i17 < size3; i17++) {
                            r0 r0Var2 = (r0) arrayList6.get(i17);
                            u uVar4 = r0Var2.f627b;
                            if (uVar4 != null) {
                                if (uVar4.M != null) {
                                    uVar4.d().f632a = false;
                                }
                                int i18 = aVar.f497f;
                                if (uVar4.M != null || i18 != 0) {
                                    uVar4.d();
                                    uVar4.M.f636f = i18;
                                }
                                uVar4.d();
                                uVar4.M.getClass();
                            }
                            switch (r0Var2.f626a) {
                                case 1:
                                    uVar4.E(r0Var2.d, r0Var2.f629e, r0Var2.f630f, r0Var2.f631g);
                                    k0Var2.W(uVar4, false);
                                    k0Var2.a(uVar4);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + r0Var2.f626a);
                                case 3:
                                    uVar4.E(r0Var2.d, r0Var2.f629e, r0Var2.f630f, r0Var2.f631g);
                                    k0Var2.R(uVar4);
                                case 4:
                                    uVar4.E(r0Var2.d, r0Var2.f629e, r0Var2.f630f, r0Var2.f631g);
                                    k0Var2.G(uVar4);
                                case 5:
                                    uVar4.E(r0Var2.d, r0Var2.f629e, r0Var2.f630f, r0Var2.f631g);
                                    k0Var2.W(uVar4, false);
                                    a0(uVar4);
                                case 6:
                                    uVar4.E(r0Var2.d, r0Var2.f629e, r0Var2.f630f, r0Var2.f631g);
                                    k0Var2.g(uVar4);
                                case 7:
                                    uVar4.E(r0Var2.d, r0Var2.f629e, r0Var2.f630f, r0Var2.f631g);
                                    k0Var2.W(uVar4, false);
                                    k0Var2.c(uVar4);
                                case 8:
                                    k0Var2.Y(uVar4);
                                case 9:
                                    k0Var2.Y(null);
                                case 10:
                                    k0Var2.X(uVar4, r0Var2.i);
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i4 - 1)).booleanValue();
                for (int i19 = i; i19 < i4; i19++) {
                    a aVar2 = (a) arrayList.get(i19);
                    if (booleanValue) {
                        for (int size4 = aVar2.f493a.size() - 1; size4 >= 0; size4--) {
                            u uVar5 = ((r0) aVar2.f493a.get(size4)).f627b;
                            if (uVar5 != null) {
                                f(uVar5).k();
                            }
                        }
                    } else {
                        ArrayList arrayList7 = aVar2.f493a;
                        int size5 = arrayList7.size();
                        int i20 = 0;
                        while (i20 < size5) {
                            Object obj2 = arrayList7.get(i20);
                            i20++;
                            u uVar6 = ((r0) obj2).f627b;
                            if (uVar6 != null) {
                                f(uVar6).k();
                            }
                        }
                    }
                }
                M(this.f569s, true);
                HashSet hashSet = new HashSet();
                for (int i21 = i; i21 < i4; i21++) {
                    ArrayList arrayList8 = ((a) arrayList.get(i21)).f493a;
                    int size6 = arrayList8.size();
                    int i22 = 0;
                    while (i22 < size6) {
                        Object obj3 = arrayList8.get(i22);
                        i22++;
                        u uVar7 = ((r0) obj3).f627b;
                        if (uVar7 != null && (viewGroup = uVar7.I) != null) {
                            hashSet.add(l.f(viewGroup, F()));
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    l lVar = (l) it.next();
                    lVar.d = booleanValue;
                    synchronized (lVar.f578b) {
                        try {
                            lVar.g();
                            lVar.f580e = false;
                            int size7 = lVar.f578b.size() - 1;
                            while (true) {
                                if (size7 >= 0) {
                                    v0 v0Var = (v0) lVar.f578b.get(size7);
                                    int c5 = a4.b.c(v0Var.f669c.J);
                                    if (v0Var.f667a != 2 || c5 == 2) {
                                        size7--;
                                    } else {
                                        s sVar = v0Var.f669c.M;
                                        lVar.f580e = false;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    lVar.c();
                }
                for (int i23 = i; i23 < i4; i23++) {
                    a aVar3 = (a) arrayList.get(i23);
                    if (((Boolean) arrayList2.get(i23)).booleanValue() && aVar3.f507r >= 0) {
                        aVar3.f507r = -1;
                    }
                    aVar3.getClass();
                }
                return;
            }
            a aVar4 = (a) arrayList.get(i9);
            if (((Boolean) arrayList2.get(i9)).booleanValue()) {
                z4 = z9;
                i5 = i9;
                z5 = z10;
                int i24 = 1;
                ArrayList arrayList9 = this.K;
                ArrayList arrayList10 = aVar4.f493a;
                int size8 = arrayList10.size() - 1;
                while (size8 >= 0) {
                    r0 r0Var3 = (r0) arrayList10.get(size8);
                    int i25 = r0Var3.f626a;
                    if (i25 != i24) {
                        if (i25 != 3) {
                            switch (i25) {
                                case 8:
                                    uVar = null;
                                    break;
                                case 9:
                                    uVar = r0Var3.f627b;
                                    break;
                                case 10:
                                    r0Var3.i = r0Var3.h;
                                    break;
                            }
                            size8--;
                            i24 = 1;
                        }
                        arrayList9.add(r0Var3.f627b);
                        size8--;
                        i24 = 1;
                    }
                    arrayList9.remove(r0Var3.f627b);
                    size8--;
                    i24 = 1;
                }
            } else {
                ArrayList arrayList11 = this.K;
                ArrayList arrayList12 = aVar4.f493a;
                int i26 = 0;
                while (i26 < arrayList12.size()) {
                    r0 r0Var4 = (r0) arrayList12.get(i26);
                    int i27 = r0Var4.f626a;
                    if (i27 != i10) {
                        z6 = z9;
                        if (i27 != 2) {
                            if (i27 == 3 || i27 == 6) {
                                arrayList11.remove(r0Var4.f627b);
                                u uVar8 = r0Var4.f627b;
                                if (uVar8 == uVar) {
                                    arrayList12.add(i26, new r0(9, uVar8));
                                    i26++;
                                    i7 = i9;
                                    z7 = z10;
                                    i6 = 1;
                                    uVar = null;
                                }
                            } else if (i27 == 7) {
                                i6 = 1;
                            } else if (i27 == 8) {
                                arrayList12.add(i26, new r0(9, uVar, 0));
                                r0Var4.f628c = true;
                                i26++;
                                uVar = r0Var4.f627b;
                            }
                            i7 = i9;
                            z7 = z10;
                            i6 = 1;
                        } else {
                            u uVar9 = r0Var4.f627b;
                            int i28 = uVar9.B;
                            int size9 = arrayList11.size() - 1;
                            boolean z13 = false;
                            while (size9 >= 0) {
                                int i29 = size9;
                                u uVar10 = (u) arrayList11.get(size9);
                                int i30 = i9;
                                if (uVar10.B != i28) {
                                    z8 = z10;
                                } else if (uVar10 == uVar9) {
                                    z8 = z10;
                                    z13 = true;
                                } else {
                                    if (uVar10 == uVar) {
                                        z8 = z10;
                                        i8 = 0;
                                        arrayList12.add(i26, new r0(9, uVar10, 0));
                                        i26++;
                                        uVar = null;
                                    } else {
                                        z8 = z10;
                                        i8 = 0;
                                    }
                                    r0 r0Var5 = new r0(3, uVar10, i8);
                                    r0Var5.d = r0Var4.d;
                                    r0Var5.f630f = r0Var4.f630f;
                                    r0Var5.f629e = r0Var4.f629e;
                                    r0Var5.f631g = r0Var4.f631g;
                                    arrayList12.add(i26, r0Var5);
                                    arrayList11.remove(uVar10);
                                    i26++;
                                    uVar = uVar;
                                }
                                size9 = i29 - 1;
                                z10 = z8;
                                i9 = i30;
                            }
                            i7 = i9;
                            z7 = z10;
                            i6 = 1;
                            if (z13) {
                                arrayList12.remove(i26);
                                i26--;
                            } else {
                                r0Var4.f626a = 1;
                                r0Var4.f628c = true;
                                arrayList11.add(uVar9);
                            }
                        }
                        i26 += i6;
                        i10 = i6;
                        z9 = z6;
                        z10 = z7;
                        i9 = i7;
                    } else {
                        z6 = z9;
                        i6 = i10;
                    }
                    i7 = i9;
                    z7 = z10;
                    arrayList11.add(r0Var4.f627b);
                    i26 += i6;
                    i10 = i6;
                    z9 = z6;
                    z10 = z7;
                    i9 = i7;
                }
                z4 = z9;
                i5 = i9;
                z5 = z10;
            }
            z10 = z5 || aVar4.f498g;
            i9 = i5 + 1;
            z9 = z4;
        }
    }

    public final u B(int i) {
        a0.k kVar = this.f556c;
        ArrayList arrayList = (ArrayList) kVar.h;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u uVar = (u) arrayList.get(size);
            if (uVar != null && uVar.A == i) {
                return uVar;
            }
        }
        for (q0 q0Var : ((HashMap) kVar.f97f).values()) {
            if (q0Var != null) {
                u uVar2 = q0Var.f623c;
                if (uVar2.A == i) {
                    return uVar2;
                }
            }
        }
        return null;
    }

    public final u C(String str) {
        a0.k kVar = this.f556c;
        ArrayList arrayList = (ArrayList) kVar.h;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u uVar = (u) arrayList.get(size);
            if (uVar != null && str.equals(uVar.C)) {
                return uVar;
            }
        }
        for (q0 q0Var : ((HashMap) kVar.f97f).values()) {
            if (q0Var != null) {
                u uVar2 = q0Var.f623c;
                if (str.equals(uVar2.C)) {
                    return uVar2;
                }
            }
        }
        return null;
    }

    public final ViewGroup D(u uVar) {
        ViewGroup viewGroup = uVar.I;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (uVar.B <= 0 || !this.f571u.J()) {
            return null;
        }
        View G = this.f571u.G(uVar.B);
        if (G instanceof ViewGroup) {
            return (ViewGroup) G;
        }
        return null;
    }

    public final e0 E() {
        u uVar = this.f572v;
        return uVar != null ? uVar.f659w.E() : this.f574x;
    }

    public final o2.f F() {
        u uVar = this.f572v;
        return uVar != null ? uVar.f659w.F() : this.f575y;
    }

    public final void G(u uVar) {
        if (H(2)) {
            Log.v("FragmentManager", "hide: " + uVar);
        }
        if (uVar.D) {
            return;
        }
        uVar.D = true;
        uVar.N = true ^ uVar.N;
        Z(uVar);
    }

    public final boolean J() {
        u uVar = this.f572v;
        if (uVar == null) {
            return true;
        }
        return uVar.f660x != null && uVar.f652p && uVar.j().J();
    }

    public final void M(int i, boolean z4) {
        w wVar;
        if (this.f570t == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z4 || i != this.f569s) {
            this.f569s = i;
            a0.k kVar = this.f556c;
            HashMap hashMap = (HashMap) kVar.f97f;
            ArrayList arrayList = (ArrayList) kVar.h;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                q0 q0Var = (q0) hashMap.get(((u) obj).f646j);
                if (q0Var != null) {
                    q0Var.k();
                }
            }
            for (q0 q0Var2 : hashMap.values()) {
                if (q0Var2 != null) {
                    q0Var2.k();
                    u uVar = q0Var2.f623c;
                    if (uVar.f653q && !uVar.o()) {
                        kVar.p(q0Var2);
                    }
                }
            }
            b0();
            if (this.D && (wVar = this.f570t) != null && this.f569s == 7) {
                wVar.f677s.invalidateOptionsMenu();
                this.D = false;
            }
        }
    }

    public final void N() {
        if (this.f570t == null) {
            return;
        }
        this.E = false;
        this.F = false;
        this.L.h = false;
        for (u uVar : this.f556c.m()) {
            if (uVar != null) {
                uVar.f661y.N();
            }
        }
    }

    public final boolean O() {
        return P(-1, 0);
    }

    public final boolean P(int i, int i4) {
        y(false);
        x(true);
        u uVar = this.f573w;
        if (uVar != null && i < 0 && uVar.g().O()) {
            return true;
        }
        boolean Q = Q(this.I, this.J, i, i4);
        if (Q) {
            this.f555b = true;
            try {
                S(this.I, this.J);
            } finally {
                d();
            }
        }
        d0();
        if (this.H) {
            this.H = false;
            b0();
        }
        ((HashMap) this.f556c.f97f).values().removeAll(Collections.singleton(null));
        return Q;
    }

    public final boolean Q(ArrayList arrayList, ArrayList arrayList2, int i, int i4) {
        boolean z4 = (i4 & 1) != 0;
        ArrayList arrayList3 = this.d;
        int i5 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                i5 = z4 ? 0 : this.d.size() - 1;
            } else {
                int size = this.d.size() - 1;
                while (size >= 0) {
                    a aVar = (a) this.d.get(size);
                    if (i >= 0 && i == aVar.f507r) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    i5 = size;
                } else if (z4) {
                    i5 = size;
                    while (i5 > 0) {
                        a aVar2 = (a) this.d.get(i5 - 1);
                        if (i < 0 || i != aVar2.f507r) {
                            break;
                        }
                        i5--;
                    }
                } else if (size != this.d.size() - 1) {
                    i5 = size + 1;
                }
            }
        }
        if (i5 < 0) {
            return false;
        }
        for (int size2 = this.d.size() - 1; size2 >= i5; size2--) {
            arrayList.add((a) this.d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void R(u uVar) {
        if (H(2)) {
            Log.v("FragmentManager", "remove: " + uVar + " nesting=" + uVar.f658v);
        }
        boolean o4 = uVar.o();
        if (uVar.E && o4) {
            return;
        }
        a0.k kVar = this.f556c;
        synchronized (((ArrayList) kVar.h)) {
            ((ArrayList) kVar.h).remove(uVar);
        }
        uVar.f652p = false;
        if (I(uVar)) {
            this.D = true;
        }
        uVar.f653q = true;
        Z(uVar);
    }

    public final void S(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i4 = 0;
        while (i < size) {
            if (!((a) arrayList.get(i)).f504o) {
                if (i4 != i) {
                    A(arrayList, arrayList2, i4, i);
                }
                i4 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i4 < size && ((Boolean) arrayList2.get(i4)).booleanValue() && !((a) arrayList.get(i4)).f504o) {
                        i4++;
                    }
                }
                A(arrayList, arrayList2, i, i4);
                i = i4 - 1;
            }
            i++;
        }
        if (i4 != size) {
            A(arrayList, arrayList2, i4, size);
        }
    }

    public final void T(Parcelable parcelable) {
        androidx.emoji2.text.q qVar;
        int i;
        boolean z4;
        int i4;
        q0 q0Var;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f570t.f674p.getClassLoader());
                this.f561k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f570t.f674p.getClassLoader());
                arrayList.add((o0) bundle.getParcelable("state"));
            }
        }
        a0.k kVar = this.f556c;
        HashMap hashMap = (HashMap) kVar.f98g;
        HashMap hashMap2 = (HashMap) kVar.f97f;
        hashMap.clear();
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            o0 o0Var = (o0) obj;
            hashMap.put(o0Var.f596g, o0Var);
        }
        l0 l0Var = (l0) bundle3.getParcelable("state");
        if (l0Var == null) {
            return;
        }
        hashMap2.clear();
        ArrayList arrayList2 = l0Var.f581f;
        int size2 = arrayList2.size();
        int i6 = 0;
        while (true) {
            qVar = this.f562l;
            i = 2;
            if (i6 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i6);
            i6++;
            o0 o0Var2 = (o0) ((HashMap) kVar.f98g).remove((String) obj2);
            if (o0Var2 != null) {
                u uVar = (u) this.L.f588c.get(o0Var2.f596g);
                if (uVar != null) {
                    if (H(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + uVar);
                    }
                    q0Var = new q0(qVar, kVar, uVar, o0Var2);
                } else {
                    q0Var = new q0(this.f562l, this.f556c, this.f570t.f674p.getClassLoader(), E(), o0Var2);
                }
                u uVar2 = q0Var.f623c;
                uVar2.f659w = this;
                if (H(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + uVar2.f646j + "): " + uVar2);
                }
                q0Var.m(this.f570t.f674p.getClassLoader());
                kVar.o(q0Var);
                q0Var.f624e = this.f569s;
            }
        }
        m0 m0Var = this.L;
        m0Var.getClass();
        ArrayList arrayList3 = new ArrayList(m0Var.f588c.values());
        int size3 = arrayList3.size();
        int i7 = 0;
        while (true) {
            z4 = true;
            if (i7 >= size3) {
                break;
            }
            Object obj3 = arrayList3.get(i7);
            i7++;
            u uVar3 = (u) obj3;
            if (hashMap2.get(uVar3.f646j) == null) {
                if (H(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + uVar3 + " that was not found in the set of active Fragments " + l0Var.f581f);
                }
                this.L.e(uVar3);
                uVar3.f659w = this;
                q0 q0Var2 = new q0(qVar, kVar, uVar3);
                q0Var2.f624e = 1;
                q0Var2.k();
                uVar3.f653q = true;
                q0Var2.k();
            }
        }
        ArrayList arrayList4 = l0Var.f582g;
        ((ArrayList) kVar.h).clear();
        if (arrayList4 != null) {
            int size4 = arrayList4.size();
            int i8 = 0;
            while (i8 < size4) {
                Object obj4 = arrayList4.get(i8);
                i8++;
                String str3 = (String) obj4;
                u g3 = kVar.g(str3);
                if (g3 == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str3 + ")");
                }
                if (H(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + g3);
                }
                kVar.a(g3);
            }
        }
        if (l0Var.h != null) {
            this.d = new ArrayList(l0Var.h.length);
            int i9 = 0;
            while (true) {
                c[] cVarArr = l0Var.h;
                if (i9 >= cVarArr.length) {
                    break;
                }
                c cVar = cVarArr[i9];
                ArrayList arrayList5 = cVar.f514g;
                a aVar = new a(this);
                int[] iArr = cVar.f513f;
                int i10 = 0;
                int i11 = 0;
                while (i10 < iArr.length) {
                    r0 r0Var = new r0();
                    int i12 = i10 + 1;
                    int i13 = i;
                    r0Var.f626a = iArr[i10];
                    if (H(i13)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i11 + " base fragment #" + iArr[i12]);
                    }
                    r0Var.h = androidx.lifecycle.m.values()[cVar.h[i11]];
                    r0Var.i = androidx.lifecycle.m.values()[cVar.i[i11]];
                    int i14 = i10 + 2;
                    r0Var.f628c = iArr[i12] != 0 ? z4 : false;
                    int i15 = iArr[i14];
                    r0Var.d = i15;
                    int i16 = iArr[i10 + 3];
                    r0Var.f629e = i16;
                    int i17 = i10 + 5;
                    int i18 = iArr[i10 + 4];
                    r0Var.f630f = i18;
                    i10 += 6;
                    int[] iArr2 = iArr;
                    int i19 = iArr2[i17];
                    r0Var.f631g = i19;
                    aVar.f494b = i15;
                    aVar.f495c = i16;
                    aVar.d = i18;
                    aVar.f496e = i19;
                    aVar.b(r0Var);
                    i11++;
                    i = i13;
                    iArr = iArr2;
                    z4 = true;
                }
                int i20 = i;
                aVar.f497f = cVar.f515j;
                aVar.h = cVar.f516k;
                aVar.f498g = true;
                aVar.i = cVar.f518m;
                aVar.f499j = cVar.f519n;
                aVar.f500k = cVar.f520o;
                aVar.f501l = cVar.f521p;
                aVar.f502m = cVar.f522q;
                aVar.f503n = cVar.f523r;
                aVar.f504o = cVar.f524s;
                aVar.f507r = cVar.f517l;
                for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                    String str4 = (String) arrayList5.get(i21);
                    if (str4 != null) {
                        ((r0) aVar.f493a.get(i21)).f627b = kVar.g(str4);
                    }
                }
                aVar.c(1);
                if (H(i20)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i9 + " (index " + aVar.f507r + "): " + aVar);
                    PrintWriter printWriter = new PrintWriter(new t0());
                    aVar.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(aVar);
                i9++;
                i = i20;
                z4 = true;
            }
            i4 = 0;
        } else {
            i4 = 0;
            this.d = null;
        }
        this.i.set(l0Var.i);
        String str5 = l0Var.f583j;
        if (str5 != null) {
            u g5 = kVar.g(str5);
            this.f573w = g5;
            r(g5);
        }
        ArrayList arrayList6 = l0Var.f584k;
        if (arrayList6 != null) {
            while (i4 < arrayList6.size()) {
                this.f560j.put((String) arrayList6.get(i4), (d) l0Var.f585l.get(i4));
                i4++;
            }
        }
        this.C = new ArrayDeque(l0Var.f586m);
    }

    public final Bundle U() {
        int i;
        ArrayList arrayList;
        c[] cVarArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            l lVar = (l) it.next();
            if (lVar.f580e) {
                if (H(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                lVar.f580e = false;
                lVar.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((l) it2.next()).e();
        }
        y(true);
        this.E = true;
        this.L.h = true;
        a0.k kVar = this.f556c;
        kVar.getClass();
        HashMap hashMap = (HashMap) kVar.f97f;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it3 = hashMap.values().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            q0 q0Var = (q0) it3.next();
            if (q0Var != null) {
                u uVar = q0Var.f623c;
                o0 o0Var = new o0(uVar);
                if (uVar.f644f <= -1 || o0Var.f605r != null) {
                    o0Var.f605r = uVar.f645g;
                } else {
                    Bundle bundle2 = new Bundle();
                    uVar.x(bundle2);
                    uVar.U.c(bundle2);
                    bundle2.putParcelable("android:support:fragments", uVar.f661y.U());
                    q0Var.f621a.o(false);
                    Bundle bundle3 = bundle2.isEmpty() ? null : bundle2;
                    if (uVar.J != null) {
                        q0Var.o();
                    }
                    if (uVar.h != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putSparseParcelableArray("android:view_state", uVar.h);
                    }
                    if (uVar.i != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBundle("android:view_registry_state", uVar.i);
                    }
                    if (!uVar.L) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBoolean("android:user_visible_hint", uVar.L);
                    }
                    o0Var.f605r = bundle3;
                    if (uVar.f649m != null) {
                        if (bundle3 == null) {
                            o0Var.f605r = new Bundle();
                        }
                        o0Var.f605r.putString("android:target_state", uVar.f649m);
                        int i4 = uVar.f650n;
                        if (i4 != 0) {
                            o0Var.f605r.putInt("android:target_req_state", i4);
                        }
                    }
                }
                arrayList2.add(uVar.f646j);
                if (H(2)) {
                    Log.v("FragmentManager", "Saved state of " + uVar + ": " + uVar.f645g);
                }
            }
        }
        a0.k kVar2 = this.f556c;
        kVar2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) kVar2.f98g).values());
        if (!arrayList3.isEmpty()) {
            a0.k kVar3 = this.f556c;
            synchronized (((ArrayList) kVar3.h)) {
                try {
                    if (((ArrayList) kVar3.h).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) kVar3.h).size());
                        ArrayList arrayList4 = (ArrayList) kVar3.h;
                        int size2 = arrayList4.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            Object obj = arrayList4.get(i5);
                            i5++;
                            u uVar2 = (u) obj;
                            arrayList.add(uVar2.f646j);
                            if (H(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + uVar2.f646j + "): " + uVar2);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList5 = this.d;
            if (arrayList5 == null || (size = arrayList5.size()) <= 0) {
                cVarArr = null;
            } else {
                cVarArr = new c[size];
                for (int i6 = 0; i6 < size; i6++) {
                    cVarArr[i6] = new c((a) this.d.get(i6));
                    if (H(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i6 + ": " + this.d.get(i6));
                    }
                }
            }
            l0 l0Var = new l0();
            l0Var.f583j = null;
            ArrayList arrayList6 = new ArrayList();
            l0Var.f584k = arrayList6;
            ArrayList arrayList7 = new ArrayList();
            l0Var.f585l = arrayList7;
            l0Var.f581f = arrayList2;
            l0Var.f582g = arrayList;
            l0Var.h = cVarArr;
            l0Var.i = this.i.get();
            u uVar3 = this.f573w;
            if (uVar3 != null) {
                l0Var.f583j = uVar3.f646j;
            }
            arrayList6.addAll(this.f560j.keySet());
            arrayList7.addAll(this.f560j.values());
            l0Var.f586m = new ArrayList(this.C);
            bundle.putParcelable("state", l0Var);
            for (String str : this.f561k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f561k.get(str));
            }
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj2 = arrayList3.get(i);
                i++;
                o0 o0Var2 = (o0) obj2;
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("state", o0Var2);
                bundle.putBundle("fragment_" + o0Var2.f596g, bundle4);
            }
        } else if (H(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final void V() {
        synchronized (this.f554a) {
            try {
                if (this.f554a.size() == 1) {
                    this.f570t.f675q.removeCallbacks(this.M);
                    this.f570t.f675q.post(this.M);
                    d0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void W(u uVar, boolean z4) {
        ViewGroup D = D(uVar);
        if (D == null || !(D instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) D).setDrawDisappearingViewsLast(!z4);
    }

    public final void X(u uVar, androidx.lifecycle.m mVar) {
        if (uVar.equals(this.f556c.g(uVar.f646j)) && (uVar.f660x == null || uVar.f659w == this)) {
            uVar.Q = mVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + uVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void Y(u uVar) {
        if (uVar != null) {
            if (!uVar.equals(this.f556c.g(uVar.f646j)) || (uVar.f660x != null && uVar.f659w != this)) {
                throw new IllegalArgumentException("Fragment " + uVar + " is not an active fragment of FragmentManager " + this);
            }
        }
        u uVar2 = this.f573w;
        this.f573w = uVar;
        r(uVar2);
        r(this.f573w);
    }

    public final void Z(u uVar) {
        ViewGroup D = D(uVar);
        if (D != null) {
            s sVar = uVar.M;
            if ((sVar == null ? 0 : sVar.f635e) + (sVar == null ? 0 : sVar.d) + (sVar == null ? 0 : sVar.f634c) + (sVar == null ? 0 : sVar.f633b) > 0) {
                if (D.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    D.setTag(R.id.visible_removing_fragment_view_tag, uVar);
                }
                u uVar2 = (u) D.getTag(R.id.visible_removing_fragment_view_tag);
                s sVar2 = uVar.M;
                boolean z4 = sVar2 != null ? sVar2.f632a : false;
                if (uVar2.M == null) {
                    return;
                }
                uVar2.d().f632a = z4;
            }
        }
    }

    public final q0 a(u uVar) {
        String str = uVar.P;
        if (str != null) {
            z0.c.c(uVar, str);
        }
        if (H(2)) {
            Log.v("FragmentManager", "add: " + uVar);
        }
        q0 f5 = f(uVar);
        uVar.f659w = this;
        a0.k kVar = this.f556c;
        kVar.o(f5);
        if (!uVar.E) {
            kVar.a(uVar);
            uVar.f653q = false;
            if (uVar.J == null) {
                uVar.N = false;
            }
            if (I(uVar)) {
                this.D = true;
            }
        }
        return f5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.activity.OnBackPressedDispatcher$addCallback$observer$1, androidx.lifecycle.q] */
    public final void b(w wVar, b4.d dVar, u uVar) {
        String str;
        if (this.f570t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f570t = wVar;
        this.f571u = dVar;
        this.f572v = uVar;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f563m;
        if (uVar != 0) {
            copyOnWriteArrayList.add(new f0(uVar));
        } else if (wVar != null) {
            copyOnWriteArrayList.add(wVar);
        }
        if (this.f572v != null) {
            d0();
        }
        if (wVar != null) {
            final a.j0 i = wVar.f677s.i();
            this.f559g = i;
            w wVar2 = uVar != 0 ? uVar : wVar;
            i.getClass();
            c0 c0Var = this.h;
            i3.d.e(c0Var, "onBackPressedCallback");
            final androidx.lifecycle.t f5 = wVar2.f();
            if (f5.f734c != androidx.lifecycle.m.f722f) {
                final a.c0 c0Var2 = new a.c0(c0Var, new a.d0(c0Var, wVar2));
                c0Var.f525a.add(c0Var2);
                c0Var2.b(false);
                a0.k kVar = ((a.h0) i.f34b.a()).f28c;
                kVar.getClass();
                if (((LinkedHashSet) kVar.h).add(c0Var2)) {
                    d1.e eVar = (d1.e) kVar.f98g;
                    eVar.getClass();
                    if (c0Var2.f8c != null) {
                        throw new IllegalArgumentException(("Handler '" + c0Var2 + "' is already registered with a dispatcher").toString());
                    }
                    eVar.f1290e.addFirst(c0Var2);
                    c0Var2.f8c = kVar;
                    eVar.b();
                }
                final ?? r4 = new androidx.lifecycle.p(i, f5) { // from class: androidx.activity.OnBackPressedDispatcher$addCallback$observer$1

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ t f252b;

                    {
                        this.f252b = f5;
                    }

                    @Override // androidx.lifecycle.p
                    public final void a(r rVar, l lVar) {
                        int i4 = i0.f30a[lVar.ordinal()];
                        c0 c0Var3 = c0.this;
                        if (i4 == 1) {
                            c0Var3.b(true);
                            return;
                        }
                        if (i4 == 2) {
                            c0Var3.b(false);
                        } else {
                            if (i4 != 3) {
                                return;
                            }
                            c0Var3.a();
                            this.f252b.f(this);
                        }
                    }
                };
                f5.a(r4);
                c0Var.f527c.add(new AutoCloseable() { // from class: a.f0
                    @Override // java.lang.AutoCloseable
                    public final void close() {
                        androidx.lifecycle.t.this.f(r4);
                    }
                });
            }
        }
        if (uVar != 0) {
            m0 m0Var = uVar.f659w.L;
            HashMap hashMap = m0Var.d;
            m0 m0Var2 = (m0) hashMap.get(uVar.f646j);
            if (m0Var2 == null) {
                m0Var2 = new m0(m0Var.f590f);
                hashMap.put(uVar.f646j, m0Var2);
            }
            this.L = m0Var2;
        } else if (wVar != null) {
            androidx.emoji2.text.t tVar = new androidx.emoji2.text.t(wVar.f677s.e(), m0.i);
            String canonicalName = m0.class.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.L = (m0) tVar.b("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), m0.class);
        } else {
            this.L = new m0(false);
        }
        m0 m0Var3 = this.L;
        m0Var3.h = this.E || this.F;
        this.f556c.i = m0Var3;
        w wVar3 = this.f570t;
        if (wVar3 != null && uVar == 0) {
            h1.c a5 = wVar3.a();
            a5.e("android:support:fragments", new a.g(2, this));
            Bundle c5 = a5.c("android:support:fragments");
            if (c5 != null) {
                T(c5);
            }
        }
        w wVar4 = this.f570t;
        if (wVar4 != null) {
            a.l lVar = wVar4.f677s.f52m;
            if (uVar != 0) {
                str = uVar.f646j + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.f576z = lVar.b(a4.b.g(str2, "StartActivityForResult"), new g0(2), new b0(this, 1));
            this.A = lVar.b(a4.b.g(str2, "StartIntentSenderForResult"), new g0(0), new b0(this, 2));
            this.B = lVar.b(a4.b.g(str2, "RequestPermissions"), new g0(1), new b0(this, 0));
        }
        w wVar5 = this.f570t;
        if (wVar5 != null) {
            wVar5.f677s.g(this.f564n);
        }
        w wVar6 = this.f570t;
        if (wVar6 != null) {
            g.i iVar = wVar6.f677s;
            iVar.getClass();
            a0 a0Var = this.f565o;
            i3.d.e(a0Var, "listener");
            iVar.f54o.add(a0Var);
        }
        w wVar7 = this.f570t;
        if (wVar7 != null) {
            g.i iVar2 = wVar7.f677s;
            iVar2.getClass();
            a0 a0Var2 = this.f566p;
            i3.d.e(a0Var2, "listener");
            iVar2.f56q.add(a0Var2);
        }
        w wVar8 = this.f570t;
        if (wVar8 != null) {
            g.i iVar3 = wVar8.f677s;
            iVar3.getClass();
            a0 a0Var3 = this.f567q;
            i3.d.e(a0Var3, "listener");
            iVar3.f57r.add(a0Var3);
        }
        w wVar9 = this.f570t;
        if (wVar9 == null || uVar != 0) {
            return;
        }
        g.i iVar4 = wVar9.f677s;
        iVar4.getClass();
        d0 d0Var = this.f568r;
        i3.d.e(d0Var, "provider");
        androidx.emoji2.text.t tVar2 = iVar4.h;
        ((CopyOnWriteArrayList) tVar2.f473b).add(d0Var);
        ((Runnable) tVar2.f472a).run();
    }

    public final void b0() {
        ArrayList k4 = this.f556c.k();
        int size = k4.size();
        int i = 0;
        while (i < size) {
            Object obj = k4.get(i);
            i++;
            q0 q0Var = (q0) obj;
            u uVar = q0Var.f623c;
            if (uVar.K) {
                if (this.f555b) {
                    this.H = true;
                } else {
                    uVar.K = false;
                    q0Var.k();
                }
            }
        }
    }

    public final void c(u uVar) {
        if (H(2)) {
            Log.v("FragmentManager", "attach: " + uVar);
        }
        if (uVar.E) {
            uVar.E = false;
            if (uVar.f652p) {
                return;
            }
            this.f556c.a(uVar);
            if (H(2)) {
                Log.v("FragmentManager", "add from attach: " + uVar);
            }
            if (I(uVar)) {
                this.D = true;
            }
        }
    }

    public final void c0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new t0());
        w wVar = this.f570t;
        if (wVar == null) {
            try {
                v("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e4) {
                Log.e("FragmentManager", "Failed dumping state", e4);
                throw illegalStateException;
            }
        }
        try {
            wVar.f677s.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e5) {
            Log.e("FragmentManager", "Failed dumping state", e5);
            throw illegalStateException;
        }
    }

    public final void d() {
        this.f555b = false;
        this.J.clear();
        this.I.clear();
    }

    public final void d0() {
        synchronized (this.f554a) {
            try {
                if (!this.f554a.isEmpty()) {
                    this.h.a(true);
                    return;
                }
                c0 c0Var = this.h;
                ArrayList arrayList = this.d;
                c0Var.a((arrayList != null ? arrayList.size() : 0) > 0 && L(this.f572v));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        ArrayList k4 = this.f556c.k();
        int size = k4.size();
        int i = 0;
        while (i < size) {
            Object obj = k4.get(i);
            i++;
            ViewGroup viewGroup = ((q0) obj).f623c.I;
            if (viewGroup != null) {
                hashSet.add(l.f(viewGroup, F()));
            }
        }
        return hashSet;
    }

    public final q0 f(u uVar) {
        String str = uVar.f646j;
        a0.k kVar = this.f556c;
        q0 q0Var = (q0) ((HashMap) kVar.f97f).get(str);
        if (q0Var != null) {
            return q0Var;
        }
        q0 q0Var2 = new q0(this.f562l, kVar, uVar);
        q0Var2.m(this.f570t.f674p.getClassLoader());
        q0Var2.f624e = this.f569s;
        return q0Var2;
    }

    public final void g(u uVar) {
        if (H(2)) {
            Log.v("FragmentManager", "detach: " + uVar);
        }
        if (uVar.E) {
            return;
        }
        uVar.E = true;
        if (uVar.f652p) {
            if (H(2)) {
                Log.v("FragmentManager", "remove from detach: " + uVar);
            }
            a0.k kVar = this.f556c;
            synchronized (((ArrayList) kVar.h)) {
                ((ArrayList) kVar.h).remove(uVar);
            }
            uVar.f652p = false;
            if (I(uVar)) {
                this.D = true;
            }
            Z(uVar);
        }
    }

    public final void h(boolean z4) {
        if (z4 && this.f570t != null) {
            c0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (u uVar : this.f556c.m()) {
            if (uVar != null) {
                uVar.H = true;
                if (z4) {
                    uVar.f661y.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.f569s >= 1) {
            for (u uVar : this.f556c.m()) {
                if (uVar != null) {
                    if (!uVar.D ? uVar.f661y.i() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void j() {
        this.E = false;
        this.F = false;
        this.L.h = false;
        u(1);
    }

    public final boolean k() {
        if (this.f569s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z4 = false;
        for (u uVar : this.f556c.m()) {
            if (uVar != null && K(uVar)) {
                if (!uVar.D ? uVar.f661y.k() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(uVar);
                    z4 = true;
                }
            }
        }
        if (this.f557e != null) {
            for (int i = 0; i < this.f557e.size(); i++) {
                u uVar2 = (u) this.f557e.get(i);
                if (arrayList == null || !arrayList.contains(uVar2)) {
                    uVar2.getClass();
                }
            }
        }
        this.f557e = arrayList;
        return z4;
    }

    public final void l() {
        boolean z4;
        boolean isTerminated;
        this.G = true;
        y(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((l) it.next()).e();
        }
        w wVar = this.f570t;
        a0.k kVar = this.f556c;
        if (wVar != null) {
            z4 = ((m0) kVar.i).f591g;
        } else {
            z4 = wVar.f674p != null ? !r1.isChangingConfigurations() : true;
        }
        int i = 0;
        if (z4) {
            Iterator it2 = this.f560j.values().iterator();
            while (it2.hasNext()) {
                ArrayList arrayList = ((d) it2.next()).f528f;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    String str = (String) obj;
                    m0 m0Var = (m0) kVar.i;
                    m0Var.getClass();
                    if (H(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    m0Var.d(str);
                }
            }
        }
        u(-1);
        w wVar2 = this.f570t;
        if (wVar2 != null) {
            g.i iVar = wVar2.f677s;
            iVar.getClass();
            a0 a0Var = this.f565o;
            i3.d.e(a0Var, "listener");
            iVar.f54o.remove(a0Var);
        }
        w wVar3 = this.f570t;
        if (wVar3 != null) {
            g.i iVar2 = wVar3.f677s;
            iVar2.getClass();
            a0 a0Var2 = this.f564n;
            i3.d.e(a0Var2, "listener");
            iVar2.f53n.remove(a0Var2);
        }
        w wVar4 = this.f570t;
        if (wVar4 != null) {
            g.i iVar3 = wVar4.f677s;
            iVar3.getClass();
            a0 a0Var3 = this.f566p;
            i3.d.e(a0Var3, "listener");
            iVar3.f56q.remove(a0Var3);
        }
        w wVar5 = this.f570t;
        if (wVar5 != null) {
            g.i iVar4 = wVar5.f677s;
            iVar4.getClass();
            a0 a0Var4 = this.f567q;
            i3.d.e(a0Var4, "listener");
            iVar4.f57r.remove(a0Var4);
        }
        w wVar6 = this.f570t;
        if (wVar6 != null) {
            g.i iVar5 = wVar6.f677s;
            iVar5.getClass();
            d0 d0Var = this.f568r;
            i3.d.e(d0Var, "provider");
            androidx.emoji2.text.t tVar = iVar5.h;
            ((CopyOnWriteArrayList) tVar.f473b).remove(d0Var);
            if (((HashMap) tVar.f474c).remove(d0Var) != null) {
                throw new ClassCastException();
            }
            ((Runnable) tVar.f472a).run();
        }
        this.f570t = null;
        this.f571u = null;
        this.f572v = null;
        if (this.f559g != null) {
            c0 c0Var = this.h;
            ArrayList arrayList2 = c0Var.f525a;
            CopyOnWriteArrayList copyOnWriteArrayList = c0Var.f527c;
            Iterator it3 = copyOnWriteArrayList.iterator();
            i3.d.d(it3, "iterator(...)");
            while (it3.hasNext()) {
                AutoCloseable autoCloseable = (AutoCloseable) it3.next();
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else if (autoCloseable instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) autoCloseable;
                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z5 = false;
                        while (!isTerminated) {
                            try {
                                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z5) {
                                    executorService.shutdownNow();
                                    z5 = true;
                                }
                            }
                        }
                        if (z5) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } else if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                } else if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                } else {
                    if (!(autoCloseable instanceof MediaDrm)) {
                        throw new IllegalArgumentException();
                    }
                    ((MediaDrm) autoCloseable).release();
                }
            }
            copyOnWriteArrayList.clear();
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                ((a.c0) obj2).a();
            }
            arrayList2.clear();
            this.f559g = null;
        }
        androidx.emoji2.text.q qVar = this.f576z;
        if (qVar != null) {
            qVar.K();
            this.A.K();
            this.B.K();
        }
    }

    public final void m(boolean z4) {
        if (z4 && this.f570t != null) {
            c0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (u uVar : this.f556c.m()) {
            if (uVar != null) {
                uVar.H = true;
                if (z4) {
                    uVar.f661y.m(true);
                }
            }
        }
    }

    public final void n(boolean z4) {
        if (z4 && this.f570t != null) {
            c0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (u uVar : this.f556c.m()) {
            if (uVar != null && z4) {
                uVar.f661y.n(true);
            }
        }
    }

    public final void o() {
        ArrayList l4 = this.f556c.l();
        int size = l4.size();
        int i = 0;
        while (i < size) {
            Object obj = l4.get(i);
            i++;
            u uVar = (u) obj;
            if (uVar != null) {
                uVar.n();
                uVar.f661y.o();
            }
        }
    }

    public final boolean p() {
        if (this.f569s >= 1) {
            for (u uVar : this.f556c.m()) {
                if (uVar != null) {
                    if (!uVar.D ? uVar.f661y.p() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void q() {
        if (this.f569s < 1) {
            return;
        }
        for (u uVar : this.f556c.m()) {
            if (uVar != null && !uVar.D) {
                uVar.f661y.q();
            }
        }
    }

    public final void r(u uVar) {
        if (uVar != null) {
            if (uVar.equals(this.f556c.g(uVar.f646j))) {
                uVar.f659w.getClass();
                boolean L = L(uVar);
                Boolean bool = uVar.f651o;
                if (bool == null || bool.booleanValue() != L) {
                    uVar.f651o = Boolean.valueOf(L);
                    k0 k0Var = uVar.f661y;
                    k0Var.d0();
                    k0Var.r(k0Var.f573w);
                }
            }
        }
    }

    public final void s(boolean z4) {
        if (z4 && this.f570t != null) {
            c0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (u uVar : this.f556c.m()) {
            if (uVar != null && z4) {
                uVar.f661y.s(true);
            }
        }
    }

    public final boolean t() {
        if (this.f569s < 1) {
            return false;
        }
        boolean z4 = false;
        for (u uVar : this.f556c.m()) {
            if (uVar != null && K(uVar)) {
                if (!uVar.D ? uVar.f661y.t() : false) {
                    z4 = true;
                }
            }
        }
        return z4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        u uVar = this.f572v;
        if (uVar != null) {
            sb.append(uVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f572v)));
            sb.append("}");
        } else {
            w wVar = this.f570t;
            if (wVar != null) {
                sb.append(wVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f570t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(int i) {
        try {
            this.f555b = true;
            for (q0 q0Var : ((HashMap) this.f556c.f97f).values()) {
                if (q0Var != null) {
                    q0Var.f624e = i;
                }
            }
            M(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((l) it.next()).e();
            }
            this.f555b = false;
            y(true);
        } catch (Throwable th) {
            this.f555b = false;
            throw th;
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String g3 = a4.b.g(str, "    ");
        a0.k kVar = this.f556c;
        ArrayList arrayList = (ArrayList) kVar.h;
        String g5 = a4.b.g(str, "    ");
        HashMap hashMap = (HashMap) kVar.f97f;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (q0 q0Var : hashMap.values()) {
                printWriter.print(str);
                if (q0Var != null) {
                    u uVar = q0Var.f623c;
                    printWriter.println(uVar);
                    uVar.getClass();
                    printWriter.print(g5);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(uVar.A));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(uVar.B));
                    printWriter.print(" mTag=");
                    printWriter.println(uVar.C);
                    printWriter.print(g5);
                    printWriter.print("mState=");
                    printWriter.print(uVar.f644f);
                    printWriter.print(" mWho=");
                    printWriter.print(uVar.f646j);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(uVar.f658v);
                    printWriter.print(g5);
                    printWriter.print("mAdded=");
                    printWriter.print(uVar.f652p);
                    printWriter.print(" mRemoving=");
                    printWriter.print(uVar.f653q);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(uVar.f654r);
                    printWriter.print(" mInLayout=");
                    printWriter.println(uVar.f655s);
                    printWriter.print(g5);
                    printWriter.print("mHidden=");
                    printWriter.print(uVar.D);
                    printWriter.print(" mDetached=");
                    printWriter.print(uVar.E);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(uVar.G);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(g5);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(uVar.F);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(uVar.L);
                    if (uVar.f659w != null) {
                        printWriter.print(g5);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(uVar.f659w);
                    }
                    if (uVar.f660x != null) {
                        printWriter.print(g5);
                        printWriter.print("mHost=");
                        printWriter.println(uVar.f660x);
                    }
                    if (uVar.f662z != null) {
                        printWriter.print(g5);
                        printWriter.print("mParentFragment=");
                        printWriter.println(uVar.f662z);
                    }
                    if (uVar.f647k != null) {
                        printWriter.print(g5);
                        printWriter.print("mArguments=");
                        printWriter.println(uVar.f647k);
                    }
                    if (uVar.f645g != null) {
                        printWriter.print(g5);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(uVar.f645g);
                    }
                    if (uVar.h != null) {
                        printWriter.print(g5);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(uVar.h);
                    }
                    if (uVar.i != null) {
                        printWriter.print(g5);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(uVar.i);
                    }
                    Object obj = uVar.f648l;
                    if (obj == null) {
                        k0 k0Var = uVar.f659w;
                        obj = (k0Var == null || (str2 = uVar.f649m) == null) ? null : k0Var.f556c.g(str2);
                    }
                    if (obj != null) {
                        printWriter.print(g5);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(uVar.f650n);
                    }
                    printWriter.print(g5);
                    printWriter.print("mPopDirection=");
                    s sVar = uVar.M;
                    printWriter.println(sVar == null ? false : sVar.f632a);
                    s sVar2 = uVar.M;
                    if ((sVar2 == null ? 0 : sVar2.f633b) != 0) {
                        printWriter.print(g5);
                        printWriter.print("getEnterAnim=");
                        s sVar3 = uVar.M;
                        printWriter.println(sVar3 == null ? 0 : sVar3.f633b);
                    }
                    s sVar4 = uVar.M;
                    if ((sVar4 == null ? 0 : sVar4.f634c) != 0) {
                        printWriter.print(g5);
                        printWriter.print("getExitAnim=");
                        s sVar5 = uVar.M;
                        printWriter.println(sVar5 == null ? 0 : sVar5.f634c);
                    }
                    s sVar6 = uVar.M;
                    if ((sVar6 == null ? 0 : sVar6.d) != 0) {
                        printWriter.print(g5);
                        printWriter.print("getPopEnterAnim=");
                        s sVar7 = uVar.M;
                        printWriter.println(sVar7 == null ? 0 : sVar7.d);
                    }
                    s sVar8 = uVar.M;
                    if ((sVar8 == null ? 0 : sVar8.f635e) != 0) {
                        printWriter.print(g5);
                        printWriter.print("getPopExitAnim=");
                        s sVar9 = uVar.M;
                        printWriter.println(sVar9 == null ? 0 : sVar9.f635e);
                    }
                    if (uVar.I != null) {
                        printWriter.print(g5);
                        printWriter.print("mContainer=");
                        printWriter.println(uVar.I);
                    }
                    if (uVar.J != null) {
                        printWriter.print(g5);
                        printWriter.print("mView=");
                        printWriter.println(uVar.J);
                    }
                    if (uVar.h() != null) {
                        androidx.emoji2.text.t tVar = new androidx.emoji2.text.t(uVar.e(), c1.a.d);
                        String canonicalName = c1.a.class.getCanonicalName();
                        if (canonicalName == null) {
                            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                        }
                        q.k kVar2 = ((c1.a) tVar.b("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), c1.a.class)).f874c;
                        if (kVar2.h > 0) {
                            printWriter.print(g5);
                            printWriter.println("Loaders:");
                            if (kVar2.h > 0) {
                                if (kVar2.f3117g[0] != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(g5);
                                printWriter.print("  #");
                                printWriter.print(kVar2.f3116f[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(g5);
                    printWriter.println("Child " + uVar.f661y + ":");
                    uVar.f661y.v(a4.b.g(g5, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                u uVar2 = (u) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(uVar2.toString());
            }
        }
        ArrayList arrayList2 = this.f557e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i4 = 0; i4 < size2; i4++) {
                u uVar3 = (u) this.f557e.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(uVar3.toString());
            }
        }
        ArrayList arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i5 = 0; i5 < size; i5++) {
                a aVar = (a) this.d.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.f(g3, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.f554a) {
            try {
                int size4 = this.f554a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i6 = 0; i6 < size4; i6++) {
                        Object obj2 = (i0) this.f554a.get(i6);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i6);
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
        printWriter.println(this.f570t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f571u);
        if (this.f572v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f572v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f569s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    public final void w(i0 i0Var, boolean z4) {
        if (!z4) {
            if (this.f570t == null) {
                if (!this.G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.E || this.F) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f554a) {
            try {
                if (this.f570t == null) {
                    if (!z4) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f554a.add(i0Var);
                    V();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(boolean z4) {
        if (this.f555b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f570t == null) {
            if (!this.G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f570t.f675q.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z4 && (this.E || this.F)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.I == null) {
            this.I = new ArrayList();
            this.J = new ArrayList();
        }
    }

    public final boolean y(boolean z4) {
        boolean z5;
        x(z4);
        boolean z6 = false;
        while (true) {
            ArrayList arrayList = this.I;
            ArrayList arrayList2 = this.J;
            synchronized (this.f554a) {
                if (this.f554a.isEmpty()) {
                    z5 = false;
                } else {
                    try {
                        int size = this.f554a.size();
                        z5 = false;
                        for (int i = 0; i < size; i++) {
                            z5 |= ((i0) this.f554a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z5) {
                break;
            }
            z6 = true;
            this.f555b = true;
            try {
                S(this.I, this.J);
            } finally {
                d();
            }
        }
        d0();
        if (this.H) {
            this.H = false;
            b0();
        }
        ((HashMap) this.f556c.f97f).values().removeAll(Collections.singleton(null));
        return z6;
    }

    public final void z(a aVar, boolean z4) {
        if (z4 && (this.f570t == null || this.G)) {
            return;
        }
        x(z4);
        aVar.a(this.I, this.J);
        this.f555b = true;
        try {
            S(this.I, this.J);
            d();
            d0();
            if (this.H) {
                this.H = false;
                b0();
            }
            ((HashMap) this.f556c.f97f).values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            d();
            throw th;
        }
    }
}
