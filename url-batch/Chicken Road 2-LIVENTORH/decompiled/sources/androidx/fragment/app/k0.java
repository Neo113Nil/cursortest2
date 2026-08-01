package androidx.fragment.app;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher$addCallback$lifecycleObserver$1;
import com.oriondriftchasers.arordrft.R;
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

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
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
    public boolean f442b;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f444e;

    /* renamed from: g, reason: collision with root package name */
    public a.g0 f446g;

    /* renamed from: l, reason: collision with root package name */
    public final androidx.emoji2.text.q f450l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f451m;

    /* renamed from: n, reason: collision with root package name */
    public final a0 f452n;

    /* renamed from: o, reason: collision with root package name */
    public final a0 f453o;

    /* renamed from: p, reason: collision with root package name */
    public final a0 f454p;

    /* renamed from: q, reason: collision with root package name */
    public final a0 f455q;

    /* renamed from: r, reason: collision with root package name */
    public final d0 f456r;

    /* renamed from: s, reason: collision with root package name */
    public int f457s;

    /* renamed from: t, reason: collision with root package name */
    public w f458t;

    /* renamed from: u, reason: collision with root package name */
    public a.y f459u;

    /* renamed from: v, reason: collision with root package name */
    public u f460v;

    /* renamed from: w, reason: collision with root package name */
    public u f461w;

    /* renamed from: x, reason: collision with root package name */
    public final e0 f462x;

    /* renamed from: y, reason: collision with root package name */
    public final l2.f f463y;

    /* renamed from: z, reason: collision with root package name */
    public androidx.emoji2.text.q f464z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f441a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final a0.j f443c = new a0.j(3);

    /* renamed from: f, reason: collision with root package name */
    public final z f445f = new z(this);

    /* renamed from: h, reason: collision with root package name */
    public final c0 f447h = new c0(this);
    public final AtomicInteger i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map f448j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map f449k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.fragment.app.a0] */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.fragment.app.a0] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.fragment.app.a0] */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.fragment.app.a0] */
    public k0() {
        Collections.synchronizedMap(new HashMap());
        this.f450l = new androidx.emoji2.text.q(this);
        this.f451m = new CopyOnWriteArrayList();
        final int i = 0;
        this.f452n = new m0.a(this) { // from class: androidx.fragment.app.a0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f394b;

            {
                this.f394b = this;
            }

            @Override // m0.a
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        k0 k0Var = this.f394b;
                        if (k0Var.G()) {
                            k0Var.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        k0 k0Var2 = this.f394b;
                        if (k0Var2.G() && num.intValue() == 80) {
                            k0Var2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        c0.f fVar = (c0.f) obj;
                        k0 k0Var3 = this.f394b;
                        if (k0Var3.G()) {
                            boolean z3 = fVar.f755a;
                            k0Var3.m(false);
                            break;
                        }
                        break;
                    default:
                        c0.g gVar = (c0.g) obj;
                        k0 k0Var4 = this.f394b;
                        if (k0Var4.G()) {
                            boolean z4 = gVar.f756a;
                            k0Var4.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 1;
        this.f453o = new m0.a(this) { // from class: androidx.fragment.app.a0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f394b;

            {
                this.f394b = this;
            }

            @Override // m0.a
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        k0 k0Var = this.f394b;
                        if (k0Var.G()) {
                            k0Var.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        k0 k0Var2 = this.f394b;
                        if (k0Var2.G() && num.intValue() == 80) {
                            k0Var2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        c0.f fVar = (c0.f) obj;
                        k0 k0Var3 = this.f394b;
                        if (k0Var3.G()) {
                            boolean z3 = fVar.f755a;
                            k0Var3.m(false);
                            break;
                        }
                        break;
                    default:
                        c0.g gVar = (c0.g) obj;
                        k0 k0Var4 = this.f394b;
                        if (k0Var4.G()) {
                            boolean z4 = gVar.f756a;
                            k0Var4.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i5 = 2;
        this.f454p = new m0.a(this) { // from class: androidx.fragment.app.a0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f394b;

            {
                this.f394b = this;
            }

            @Override // m0.a
            public final void accept(Object obj) {
                switch (i5) {
                    case 0:
                        k0 k0Var = this.f394b;
                        if (k0Var.G()) {
                            k0Var.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        k0 k0Var2 = this.f394b;
                        if (k0Var2.G() && num.intValue() == 80) {
                            k0Var2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        c0.f fVar = (c0.f) obj;
                        k0 k0Var3 = this.f394b;
                        if (k0Var3.G()) {
                            boolean z3 = fVar.f755a;
                            k0Var3.m(false);
                            break;
                        }
                        break;
                    default:
                        c0.g gVar = (c0.g) obj;
                        k0 k0Var4 = this.f394b;
                        if (k0Var4.G()) {
                            boolean z4 = gVar.f756a;
                            k0Var4.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i6 = 3;
        this.f455q = new m0.a(this) { // from class: androidx.fragment.app.a0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f394b;

            {
                this.f394b = this;
            }

            @Override // m0.a
            public final void accept(Object obj) {
                switch (i6) {
                    case 0:
                        k0 k0Var = this.f394b;
                        if (k0Var.G()) {
                            k0Var.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        k0 k0Var2 = this.f394b;
                        if (k0Var2.G() && num.intValue() == 80) {
                            k0Var2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        c0.f fVar = (c0.f) obj;
                        k0 k0Var3 = this.f394b;
                        if (k0Var3.G()) {
                            boolean z3 = fVar.f755a;
                            k0Var3.m(false);
                            break;
                        }
                        break;
                    default:
                        c0.g gVar = (c0.g) obj;
                        k0 k0Var4 = this.f394b;
                        if (k0Var4.G()) {
                            boolean z4 = gVar.f756a;
                            k0Var4.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f456r = new d0(this);
        this.f457s = -1;
        this.f462x = new e0(this);
        this.f463y = new l2.f(6);
        this.C = new ArrayDeque();
        this.M = new g(2, this);
    }

    public static boolean E(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean F(u uVar) {
        uVar.getClass();
        ArrayList j4 = uVar.f553y.f443c.j();
        int size = j4.size();
        boolean z3 = false;
        int i = 0;
        while (i < size) {
            Object obj = j4.get(i);
            i++;
            u uVar2 = (u) obj;
            if (uVar2 != null) {
                z3 = F(uVar2);
            }
            if (z3) {
                return true;
            }
        }
        return false;
    }

    public static boolean H(u uVar) {
        if (uVar == null) {
            return true;
        }
        if (uVar.G) {
            return uVar.f551w == null || H(uVar.f554z);
        }
        return false;
    }

    public static boolean I(u uVar) {
        if (uVar == null) {
            return true;
        }
        k0 k0Var = uVar.f551w;
        return uVar.equals(k0Var.f461w) && I(k0Var.f460v);
    }

    public static void X(u uVar) {
        if (E(2)) {
            Log.v("FragmentManager", "show: " + uVar);
        }
        if (uVar.D) {
            uVar.D = false;
            uVar.N = !uVar.N;
        }
    }

    public final ViewGroup A(u uVar) {
        ViewGroup viewGroup = uVar.I;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (uVar.B <= 0 || !this.f459u.N()) {
            return null;
        }
        View M = this.f459u.M(uVar.B);
        if (M instanceof ViewGroup) {
            return (ViewGroup) M;
        }
        return null;
    }

    public final e0 B() {
        u uVar = this.f460v;
        return uVar != null ? uVar.f551w.B() : this.f462x;
    }

    public final l2.f C() {
        u uVar = this.f460v;
        return uVar != null ? uVar.f551w.C() : this.f463y;
    }

    public final void D(u uVar) {
        if (E(2)) {
            Log.v("FragmentManager", "hide: " + uVar);
        }
        if (uVar.D) {
            return;
        }
        uVar.D = true;
        uVar.N = true ^ uVar.N;
        W(uVar);
    }

    public final boolean G() {
        u uVar = this.f460v;
        if (uVar == null) {
            return true;
        }
        return uVar.f552x != null && uVar.f544p && uVar.j().G();
    }

    public final void J(int i, boolean z3) {
        w wVar;
        if (this.f458t == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z3 || i != this.f457s) {
            this.f457s = i;
            a0.j jVar = this.f443c;
            HashMap hashMap = (HashMap) jVar.f100f;
            ArrayList arrayList = (ArrayList) jVar.f102h;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                q0 q0Var = (q0) hashMap.get(((u) obj).f538j);
                if (q0Var != null) {
                    q0Var.k();
                }
            }
            for (q0 q0Var2 : hashMap.values()) {
                if (q0Var2 != null) {
                    q0Var2.k();
                    u uVar = q0Var2.f511c;
                    if (uVar.f545q && !uVar.n()) {
                        jVar.m(q0Var2);
                    }
                }
            }
            Y();
            if (this.D && (wVar = this.f458t) != null && this.f457s == 7) {
                wVar.f571r.invalidateOptionsMenu();
                this.D = false;
            }
        }
    }

    public final void K() {
        if (this.f458t == null) {
            return;
        }
        this.E = false;
        this.F = false;
        this.L.f481h = false;
        for (u uVar : this.f443c.k()) {
            if (uVar != null) {
                uVar.f553y.K();
            }
        }
    }

    public final boolean L() {
        return M(-1, 0);
    }

    public final boolean M(int i, int i4) {
        x(false);
        w(true);
        u uVar = this.f461w;
        if (uVar != null && i < 0 && uVar.g().L()) {
            return true;
        }
        boolean N = N(this.I, this.J, i, i4);
        if (N) {
            this.f442b = true;
            try {
                P(this.I, this.J);
            } finally {
                d();
            }
        }
        a0();
        if (this.H) {
            this.H = false;
            Y();
        }
        ((HashMap) this.f443c.f100f).values().removeAll(Collections.singleton(null));
        return N;
    }

    public final boolean N(ArrayList arrayList, ArrayList arrayList2, int i, int i4) {
        boolean z3 = (i4 & 1) != 0;
        ArrayList arrayList3 = this.d;
        int i5 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                i5 = z3 ? 0 : this.d.size() - 1;
            } else {
                int size = this.d.size() - 1;
                while (size >= 0) {
                    a aVar = (a) this.d.get(size);
                    if (i >= 0 && i == aVar.f392r) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    i5 = size;
                } else if (z3) {
                    i5 = size;
                    while (i5 > 0) {
                        a aVar2 = (a) this.d.get(i5 - 1);
                        if (i < 0 || i != aVar2.f392r) {
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

    public final void O(u uVar) {
        if (E(2)) {
            Log.v("FragmentManager", "remove: " + uVar + " nesting=" + uVar.f550v);
        }
        boolean n4 = uVar.n();
        if (uVar.E && n4) {
            return;
        }
        a0.j jVar = this.f443c;
        synchronized (((ArrayList) jVar.f102h)) {
            ((ArrayList) jVar.f102h).remove(uVar);
        }
        uVar.f544p = false;
        if (F(uVar)) {
            this.D = true;
        }
        uVar.f545q = true;
        W(uVar);
    }

    public final void P(ArrayList arrayList, ArrayList arrayList2) {
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
            if (!((a) arrayList.get(i)).f389o) {
                if (i4 != i) {
                    y(arrayList, arrayList2, i4, i);
                }
                i4 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i4 < size && ((Boolean) arrayList2.get(i4)).booleanValue() && !((a) arrayList.get(i4)).f389o) {
                        i4++;
                    }
                }
                y(arrayList, arrayList2, i, i4);
                i = i4 - 1;
            }
            i++;
        }
        if (i4 != size) {
            y(arrayList, arrayList2, i4, size);
        }
    }

    public final void Q(Parcelable parcelable) {
        androidx.emoji2.text.q qVar;
        int i;
        boolean z3;
        int i4;
        q0 q0Var;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f458t.f568o.getClassLoader());
                this.f449k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f458t.f568o.getClassLoader());
                arrayList.add((o0) bundle.getParcelable("state"));
            }
        }
        a0.j jVar = this.f443c;
        HashMap hashMap = (HashMap) jVar.f101g;
        HashMap hashMap2 = (HashMap) jVar.f100f;
        hashMap.clear();
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            o0 o0Var = (o0) obj;
            hashMap.put(o0Var.f486g, o0Var);
        }
        l0 l0Var = (l0) bundle3.getParcelable("state");
        if (l0Var == null) {
            return;
        }
        hashMap2.clear();
        ArrayList arrayList2 = l0Var.f469f;
        int size2 = arrayList2.size();
        int i6 = 0;
        while (true) {
            qVar = this.f450l;
            i = 2;
            if (i6 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i6);
            i6++;
            o0 o0Var2 = (o0) ((HashMap) jVar.f101g).remove((String) obj2);
            if (o0Var2 != null) {
                u uVar = (u) this.L.f477c.get(o0Var2.f486g);
                if (uVar != null) {
                    if (E(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + uVar);
                    }
                    q0Var = new q0(qVar, jVar, uVar, o0Var2);
                } else {
                    q0Var = new q0(this.f450l, this.f443c, this.f458t.f568o.getClassLoader(), B(), o0Var2);
                }
                u uVar2 = q0Var.f511c;
                uVar2.f551w = this;
                if (E(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + uVar2.f538j + "): " + uVar2);
                }
                q0Var.m(this.f458t.f568o.getClassLoader());
                jVar.l(q0Var);
                q0Var.f512e = this.f457s;
            }
        }
        m0 m0Var = this.L;
        m0Var.getClass();
        ArrayList arrayList3 = new ArrayList(m0Var.f477c.values());
        int size3 = arrayList3.size();
        int i7 = 0;
        while (true) {
            z3 = true;
            if (i7 >= size3) {
                break;
            }
            Object obj3 = arrayList3.get(i7);
            i7++;
            u uVar3 = (u) obj3;
            if (hashMap2.get(uVar3.f538j) == null) {
                if (E(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + uVar3 + " that was not found in the set of active Fragments " + l0Var.f469f);
                }
                this.L.e(uVar3);
                uVar3.f551w = this;
                q0 q0Var2 = new q0(qVar, jVar, uVar3);
                q0Var2.f512e = 1;
                q0Var2.k();
                uVar3.f545q = true;
                q0Var2.k();
            }
        }
        ArrayList arrayList4 = l0Var.f470g;
        ((ArrayList) jVar.f102h).clear();
        if (arrayList4 != null) {
            int size4 = arrayList4.size();
            int i8 = 0;
            while (i8 < size4) {
                Object obj4 = arrayList4.get(i8);
                i8++;
                String str3 = (String) obj4;
                u f2 = jVar.f(str3);
                if (f2 == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str3 + ")");
                }
                if (E(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + f2);
                }
                jVar.a(f2);
            }
        }
        if (l0Var.f471h != null) {
            this.d = new ArrayList(l0Var.f471h.length);
            int i9 = 0;
            while (true) {
                c[] cVarArr = l0Var.f471h;
                if (i9 >= cVarArr.length) {
                    break;
                }
                c cVar = cVarArr[i9];
                ArrayList arrayList5 = cVar.f399g;
                a aVar = new a(this);
                int[] iArr = cVar.f398f;
                int i10 = 0;
                int i11 = 0;
                while (i10 < iArr.length) {
                    r0 r0Var = new r0();
                    int i12 = i10 + 1;
                    int i13 = i;
                    r0Var.f514a = iArr[i10];
                    if (E(i13)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i11 + " base fragment #" + iArr[i12]);
                    }
                    r0Var.f520h = androidx.lifecycle.m.values()[cVar.f400h[i11]];
                    r0Var.i = androidx.lifecycle.m.values()[cVar.i[i11]];
                    int i14 = i10 + 2;
                    r0Var.f516c = iArr[i12] != 0 ? z3 : false;
                    int i15 = iArr[i14];
                    r0Var.d = i15;
                    int i16 = iArr[i10 + 3];
                    r0Var.f517e = i16;
                    int i17 = i10 + 5;
                    int i18 = iArr[i10 + 4];
                    r0Var.f518f = i18;
                    i10 += 6;
                    int[] iArr2 = iArr;
                    int i19 = iArr2[i17];
                    r0Var.f519g = i19;
                    aVar.f378b = i15;
                    aVar.f379c = i16;
                    aVar.d = i18;
                    aVar.f380e = i19;
                    aVar.b(r0Var);
                    i11++;
                    i = i13;
                    iArr = iArr2;
                    z3 = true;
                }
                int i20 = i;
                aVar.f381f = cVar.f401j;
                aVar.f383h = cVar.f402k;
                aVar.f382g = true;
                aVar.i = cVar.f404m;
                aVar.f384j = cVar.f405n;
                aVar.f385k = cVar.f406o;
                aVar.f386l = cVar.f407p;
                aVar.f387m = cVar.f408q;
                aVar.f388n = cVar.f409r;
                aVar.f389o = cVar.f410s;
                aVar.f392r = cVar.f403l;
                for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                    String str4 = (String) arrayList5.get(i21);
                    if (str4 != null) {
                        ((r0) aVar.f377a.get(i21)).f515b = jVar.f(str4);
                    }
                }
                aVar.c(1);
                if (E(i20)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i9 + " (index " + aVar.f392r + "): " + aVar);
                    PrintWriter printWriter = new PrintWriter(new t0());
                    aVar.g("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(aVar);
                i9++;
                i = i20;
                z3 = true;
            }
            i4 = 0;
        } else {
            i4 = 0;
            this.d = null;
        }
        this.i.set(l0Var.i);
        String str5 = l0Var.f472j;
        if (str5 != null) {
            u f4 = jVar.f(str5);
            this.f461w = f4;
            q(f4);
        }
        ArrayList arrayList6 = l0Var.f473k;
        if (arrayList6 != null) {
            while (i4 < arrayList6.size()) {
                this.f448j.put((String) arrayList6.get(i4), (d) l0Var.f474l.get(i4));
                i4++;
            }
        }
        this.C = new ArrayDeque(l0Var.f475m);
    }

    public final Bundle R() {
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
            if (lVar.f468e) {
                if (E(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                lVar.f468e = false;
                lVar.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((l) it2.next()).e();
        }
        x(true);
        this.E = true;
        this.L.f481h = true;
        a0.j jVar = this.f443c;
        jVar.getClass();
        HashMap hashMap = (HashMap) jVar.f100f;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it3 = hashMap.values().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            q0 q0Var = (q0) it3.next();
            if (q0Var != null) {
                u uVar = q0Var.f511c;
                o0 o0Var = new o0(uVar);
                if (uVar.f535f <= -1 || o0Var.f496r != null) {
                    o0Var.f496r = uVar.f536g;
                } else {
                    Bundle bundle2 = new Bundle();
                    uVar.w(bundle2);
                    uVar.U.c(bundle2);
                    bundle2.putParcelable("android:support:fragments", uVar.f553y.R());
                    q0Var.f509a.m(false);
                    Bundle bundle3 = bundle2.isEmpty() ? null : bundle2;
                    if (uVar.J != null) {
                        q0Var.o();
                    }
                    if (uVar.f537h != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putSparseParcelableArray("android:view_state", uVar.f537h);
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
                    o0Var.f496r = bundle3;
                    if (uVar.f541m != null) {
                        if (bundle3 == null) {
                            o0Var.f496r = new Bundle();
                        }
                        o0Var.f496r.putString("android:target_state", uVar.f541m);
                        int i4 = uVar.f542n;
                        if (i4 != 0) {
                            o0Var.f496r.putInt("android:target_req_state", i4);
                        }
                    }
                }
                arrayList2.add(uVar.f538j);
                if (E(2)) {
                    Log.v("FragmentManager", "Saved state of " + uVar + ": " + uVar.f536g);
                }
            }
        }
        a0.j jVar2 = this.f443c;
        jVar2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) jVar2.f101g).values());
        if (!arrayList3.isEmpty()) {
            a0.j jVar3 = this.f443c;
            synchronized (((ArrayList) jVar3.f102h)) {
                try {
                    if (((ArrayList) jVar3.f102h).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) jVar3.f102h).size());
                        ArrayList arrayList4 = (ArrayList) jVar3.f102h;
                        int size2 = arrayList4.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            Object obj = arrayList4.get(i5);
                            i5++;
                            u uVar2 = (u) obj;
                            arrayList.add(uVar2.f538j);
                            if (E(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + uVar2.f538j + "): " + uVar2);
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
                    if (E(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i6 + ": " + this.d.get(i6));
                    }
                }
            }
            l0 l0Var = new l0();
            l0Var.f472j = null;
            ArrayList arrayList6 = new ArrayList();
            l0Var.f473k = arrayList6;
            ArrayList arrayList7 = new ArrayList();
            l0Var.f474l = arrayList7;
            l0Var.f469f = arrayList2;
            l0Var.f470g = arrayList;
            l0Var.f471h = cVarArr;
            l0Var.i = this.i.get();
            u uVar3 = this.f461w;
            if (uVar3 != null) {
                l0Var.f472j = uVar3.f538j;
            }
            arrayList6.addAll(this.f448j.keySet());
            arrayList7.addAll(this.f448j.values());
            l0Var.f475m = new ArrayList(this.C);
            bundle.putParcelable("state", l0Var);
            for (String str : this.f449k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f449k.get(str));
            }
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj2 = arrayList3.get(i);
                i++;
                o0 o0Var2 = (o0) obj2;
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("state", o0Var2);
                bundle.putBundle("fragment_" + o0Var2.f486g, bundle4);
            }
        } else if (E(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final void S() {
        synchronized (this.f441a) {
            try {
                if (this.f441a.size() == 1) {
                    this.f458t.f569p.removeCallbacks(this.M);
                    this.f458t.f569p.post(this.M);
                    a0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void T(u uVar, boolean z3) {
        ViewGroup A = A(uVar);
        if (A == null || !(A instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) A).setDrawDisappearingViewsLast(!z3);
    }

    public final void U(u uVar, androidx.lifecycle.m mVar) {
        if (uVar.equals(this.f443c.f(uVar.f538j)) && (uVar.f552x == null || uVar.f551w == this)) {
            uVar.Q = mVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + uVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void V(u uVar) {
        if (uVar != null) {
            if (!uVar.equals(this.f443c.f(uVar.f538j)) || (uVar.f552x != null && uVar.f551w != this)) {
                throw new IllegalArgumentException("Fragment " + uVar + " is not an active fragment of FragmentManager " + this);
            }
        }
        u uVar2 = this.f461w;
        this.f461w = uVar;
        q(uVar2);
        q(this.f461w);
    }

    public final void W(u uVar) {
        ViewGroup A = A(uVar);
        if (A != null) {
            s sVar = uVar.M;
            if ((sVar == null ? 0 : sVar.f524e) + (sVar == null ? 0 : sVar.d) + (sVar == null ? 0 : sVar.f523c) + (sVar == null ? 0 : sVar.f522b) > 0) {
                if (A.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    A.setTag(R.id.visible_removing_fragment_view_tag, uVar);
                }
                u uVar2 = (u) A.getTag(R.id.visible_removing_fragment_view_tag);
                s sVar2 = uVar.M;
                boolean z3 = sVar2 != null ? sVar2.f521a : false;
                if (uVar2.M == null) {
                    return;
                }
                uVar2.f().f521a = z3;
            }
        }
    }

    public final void Y() {
        ArrayList i = this.f443c.i();
        int size = i.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = i.get(i4);
            i4++;
            q0 q0Var = (q0) obj;
            u uVar = q0Var.f511c;
            if (uVar.K) {
                if (this.f442b) {
                    this.H = true;
                } else {
                    uVar.K = false;
                    q0Var.k();
                }
            }
        }
    }

    public final void Z(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new t0());
        w wVar = this.f458t;
        if (wVar == null) {
            try {
                u("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e4) {
                Log.e("FragmentManager", "Failed dumping state", e4);
                throw illegalStateException;
            }
        }
        try {
            wVar.f571r.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e5) {
            Log.e("FragmentManager", "Failed dumping state", e5);
            throw illegalStateException;
        }
    }

    public final q0 a(u uVar) {
        String str = uVar.P;
        if (str != null) {
            y0.c.c(uVar, str);
        }
        if (E(2)) {
            Log.v("FragmentManager", "add: " + uVar);
        }
        q0 f2 = f(uVar);
        uVar.f551w = this;
        a0.j jVar = this.f443c;
        jVar.l(f2);
        if (!uVar.E) {
            jVar.a(uVar);
            uVar.f545q = false;
            if (uVar.J == null) {
                uVar.N = false;
            }
            if (F(uVar)) {
                this.D = true;
            }
        }
        return f2;
    }

    public final void a0() {
        synchronized (this.f441a) {
            try {
                if (!this.f441a.isEmpty()) {
                    this.f447h.a(true);
                    return;
                }
                c0 c0Var = this.f447h;
                ArrayList arrayList = this.d;
                c0Var.a((arrayList != null ? arrayList.size() : 0) > 0 && I(this.f460v));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(w wVar, a.y yVar, u uVar) {
        String str;
        if (this.f458t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f458t = wVar;
        this.f459u = yVar;
        this.f460v = uVar;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f451m;
        if (uVar != 0) {
            copyOnWriteArrayList.add(new f0(uVar));
        } else if (wVar != null) {
            copyOnWriteArrayList.add(wVar);
        }
        if (this.f460v != null) {
            a0();
        }
        if (wVar != null) {
            a.g0 i = wVar.f571r.i();
            this.f446g = i;
            w wVar2 = uVar != 0 ? uVar : wVar;
            i.getClass();
            c0 c0Var = this.f447h;
            f3.d.e(c0Var, "onBackPressedCallback");
            androidx.lifecycle.t e4 = wVar2.e();
            if (e4.f630c != androidx.lifecycle.m.f617f) {
                a.c0 c0Var2 = new a.c0(c0Var, new a.d0(c0Var, wVar2));
                c0Var.f411a.add(c0Var2);
                c0Var2.b(false);
                a0.j jVar = i.f25b;
                jVar.getClass();
                if (((LinkedHashSet) jVar.f102h).add(c0Var2)) {
                    c1.e eVar = (c1.e) jVar.f101g;
                    eVar.getClass();
                    if (c0Var2.f9c != null) {
                        throw new IllegalArgumentException(("Handler '" + c0Var2 + "' is already registered with a dispatcher").toString());
                    }
                    eVar.f768e.addFirst(c0Var2);
                    c0Var2.f9c = jVar;
                    eVar.b();
                }
                OnBackPressedDispatcher$addCallback$lifecycleObserver$1 onBackPressedDispatcher$addCallback$lifecycleObserver$1 = new OnBackPressedDispatcher$addCallback$lifecycleObserver$1(c0Var2, i, e4);
                e4.a(onBackPressedDispatcher$addCallback$lifecycleObserver$1);
                c0Var.f413c.add(onBackPressedDispatcher$addCallback$lifecycleObserver$1);
            }
        }
        if (uVar != 0) {
            m0 m0Var = uVar.f551w.L;
            HashMap hashMap = m0Var.d;
            m0 m0Var2 = (m0) hashMap.get(uVar.f538j);
            if (m0Var2 == null) {
                m0Var2 = new m0(m0Var.f479f);
                hashMap.put(uVar.f538j, m0Var2);
            }
            this.L = m0Var2;
        } else if (wVar != null) {
            androidx.emoji2.text.t tVar = new androidx.emoji2.text.t(wVar.f571r.d(), m0.i);
            String canonicalName = m0.class.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.L = (m0) tVar.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), m0.class);
        } else {
            this.L = new m0(false);
        }
        m0 m0Var3 = this.L;
        m0Var3.f481h = this.E || this.F;
        this.f443c.i = m0Var3;
        w wVar3 = this.f458t;
        if (wVar3 != null && uVar == 0) {
            g1.c b4 = wVar3.b();
            b4.e("android:support:fragments", new a.g(2, this));
            Bundle c4 = b4.c("android:support:fragments");
            if (c4 != null) {
                Q(c4);
            }
        }
        w wVar4 = this.f458t;
        if (wVar4 != null) {
            a.l lVar = wVar4.f571r.f50m;
            if (uVar != 0) {
                str = uVar.f538j + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.f464z = lVar.b(w0.f(str2, "StartActivityForResult"), new g0(2), new b0(this, 1));
            this.A = lVar.b(w0.f(str2, "StartIntentSenderForResult"), new g0(0), new b0(this, 2));
            this.B = lVar.b(w0.f(str2, "RequestPermissions"), new g0(1), new b0(this, 0));
        }
        w wVar5 = this.f458t;
        if (wVar5 != null) {
            wVar5.f571r.g(this.f452n);
        }
        w wVar6 = this.f458t;
        if (wVar6 != null) {
            g.j jVar2 = wVar6.f571r;
            jVar2.getClass();
            a0 a0Var = this.f453o;
            f3.d.e(a0Var, "listener");
            jVar2.f52o.add(a0Var);
        }
        w wVar7 = this.f458t;
        if (wVar7 != null) {
            g.j jVar3 = wVar7.f571r;
            jVar3.getClass();
            a0 a0Var2 = this.f454p;
            f3.d.e(a0Var2, "listener");
            jVar3.f54q.add(a0Var2);
        }
        w wVar8 = this.f458t;
        if (wVar8 != null) {
            g.j jVar4 = wVar8.f571r;
            jVar4.getClass();
            a0 a0Var3 = this.f455q;
            f3.d.e(a0Var3, "listener");
            jVar4.f55r.add(a0Var3);
        }
        w wVar9 = this.f458t;
        if (wVar9 == null || uVar != 0) {
            return;
        }
        g.j jVar5 = wVar9.f571r;
        jVar5.getClass();
        d0 d0Var = this.f456r;
        f3.d.e(d0Var, "provider");
        androidx.emoji2.text.t tVar2 = jVar5.f46h;
        ((CopyOnWriteArrayList) tVar2.f356c).add(d0Var);
        ((Runnable) tVar2.f355b).run();
    }

    public final void c(u uVar) {
        if (E(2)) {
            Log.v("FragmentManager", "attach: " + uVar);
        }
        if (uVar.E) {
            uVar.E = false;
            if (uVar.f544p) {
                return;
            }
            this.f443c.a(uVar);
            if (E(2)) {
                Log.v("FragmentManager", "add from attach: " + uVar);
            }
            if (F(uVar)) {
                this.D = true;
            }
        }
    }

    public final void d() {
        this.f442b = false;
        this.J.clear();
        this.I.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        ArrayList i = this.f443c.i();
        int size = i.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = i.get(i4);
            i4++;
            ViewGroup viewGroup = ((q0) obj).f511c.I;
            if (viewGroup != null) {
                hashSet.add(l.f(viewGroup, C()));
            }
        }
        return hashSet;
    }

    public final q0 f(u uVar) {
        String str = uVar.f538j;
        a0.j jVar = this.f443c;
        q0 q0Var = (q0) ((HashMap) jVar.f100f).get(str);
        if (q0Var != null) {
            return q0Var;
        }
        q0 q0Var2 = new q0(this.f450l, jVar, uVar);
        q0Var2.m(this.f458t.f568o.getClassLoader());
        q0Var2.f512e = this.f457s;
        return q0Var2;
    }

    public final void g(u uVar) {
        if (E(2)) {
            Log.v("FragmentManager", "detach: " + uVar);
        }
        if (uVar.E) {
            return;
        }
        uVar.E = true;
        if (uVar.f544p) {
            if (E(2)) {
                Log.v("FragmentManager", "remove from detach: " + uVar);
            }
            a0.j jVar = this.f443c;
            synchronized (((ArrayList) jVar.f102h)) {
                ((ArrayList) jVar.f102h).remove(uVar);
            }
            uVar.f544p = false;
            if (F(uVar)) {
                this.D = true;
            }
            W(uVar);
        }
    }

    public final void h(boolean z3) {
        if (z3 && this.f458t != null) {
            Z(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (u uVar : this.f443c.k()) {
            if (uVar != null) {
                uVar.H = true;
                if (z3) {
                    uVar.f553y.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.f457s >= 1) {
            for (u uVar : this.f443c.k()) {
                if (uVar != null) {
                    if (!uVar.D ? uVar.f553y.i() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.f457s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z3 = false;
        for (u uVar : this.f443c.k()) {
            if (uVar != null && H(uVar)) {
                if (!uVar.D ? uVar.f553y.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(uVar);
                    z3 = true;
                }
            }
        }
        if (this.f444e != null) {
            for (int i = 0; i < this.f444e.size(); i++) {
                u uVar2 = (u) this.f444e.get(i);
                if (arrayList == null || !arrayList.contains(uVar2)) {
                    uVar2.getClass();
                }
            }
        }
        this.f444e = arrayList;
        return z3;
    }

    public final void k() {
        boolean z3;
        boolean isTerminated;
        this.G = true;
        x(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((l) it.next()).e();
        }
        w wVar = this.f458t;
        a0.j jVar = this.f443c;
        if (wVar != null) {
            z3 = ((m0) jVar.i).f480g;
        } else {
            z3 = wVar.f568o != null ? !r1.isChangingConfigurations() : true;
        }
        int i = 0;
        if (z3) {
            Iterator it2 = this.f448j.values().iterator();
            while (it2.hasNext()) {
                ArrayList arrayList = ((d) it2.next()).f414f;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    String str = (String) obj;
                    m0 m0Var = (m0) jVar.i;
                    m0Var.getClass();
                    if (E(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    m0Var.d(str);
                }
            }
        }
        t(-1);
        w wVar2 = this.f458t;
        if (wVar2 != null) {
            g.j jVar2 = wVar2.f571r;
            jVar2.getClass();
            a0 a0Var = this.f453o;
            f3.d.e(a0Var, "listener");
            jVar2.f52o.remove(a0Var);
        }
        w wVar3 = this.f458t;
        if (wVar3 != null) {
            g.j jVar3 = wVar3.f571r;
            jVar3.getClass();
            a0 a0Var2 = this.f452n;
            f3.d.e(a0Var2, "listener");
            jVar3.f51n.remove(a0Var2);
        }
        w wVar4 = this.f458t;
        if (wVar4 != null) {
            g.j jVar4 = wVar4.f571r;
            jVar4.getClass();
            a0 a0Var3 = this.f454p;
            f3.d.e(a0Var3, "listener");
            jVar4.f54q.remove(a0Var3);
        }
        w wVar5 = this.f458t;
        if (wVar5 != null) {
            g.j jVar5 = wVar5.f571r;
            jVar5.getClass();
            a0 a0Var4 = this.f455q;
            f3.d.e(a0Var4, "listener");
            jVar5.f55r.remove(a0Var4);
        }
        w wVar6 = this.f458t;
        if (wVar6 != null) {
            g.j jVar6 = wVar6.f571r;
            jVar6.getClass();
            d0 d0Var = this.f456r;
            f3.d.e(d0Var, "provider");
            androidx.emoji2.text.t tVar = jVar6.f46h;
            ((CopyOnWriteArrayList) tVar.f356c).remove(d0Var);
            if (((HashMap) tVar.d).remove(d0Var) != null) {
                throw new ClassCastException();
            }
            ((Runnable) tVar.f355b).run();
        }
        this.f458t = null;
        this.f459u = null;
        this.f460v = null;
        if (this.f446g != null) {
            c0 c0Var = this.f447h;
            ArrayList arrayList2 = c0Var.f411a;
            CopyOnWriteArrayList copyOnWriteArrayList = c0Var.f413c;
            Iterator it3 = copyOnWriteArrayList.iterator();
            f3.d.d(it3, "iterator(...)");
            while (it3.hasNext()) {
                AutoCloseable autoCloseable = (AutoCloseable) it3.next();
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else if (autoCloseable instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) autoCloseable;
                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z4 = false;
                        while (!isTerminated) {
                            try {
                                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z4) {
                                    executorService.shutdownNow();
                                    z4 = true;
                                }
                            }
                        }
                        if (z4) {
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
            this.f446g = null;
        }
        androidx.emoji2.text.q qVar = this.f464z;
        if (qVar != null) {
            qVar.I();
            this.A.I();
            this.B.I();
        }
    }

    public final void l(boolean z3) {
        if (z3 && this.f458t != null) {
            Z(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (u uVar : this.f443c.k()) {
            if (uVar != null) {
                uVar.H = true;
                if (z3) {
                    uVar.f553y.l(true);
                }
            }
        }
    }

    public final void m(boolean z3) {
        if (z3 && this.f458t != null) {
            Z(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (u uVar : this.f443c.k()) {
            if (uVar != null && z3) {
                uVar.f553y.m(true);
            }
        }
    }

    public final void n() {
        ArrayList j4 = this.f443c.j();
        int size = j4.size();
        int i = 0;
        while (i < size) {
            Object obj = j4.get(i);
            i++;
            u uVar = (u) obj;
            if (uVar != null) {
                uVar.m();
                uVar.f553y.n();
            }
        }
    }

    public final boolean o() {
        if (this.f457s >= 1) {
            for (u uVar : this.f443c.k()) {
                if (uVar != null) {
                    if (!uVar.D ? uVar.f553y.o() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f457s < 1) {
            return;
        }
        for (u uVar : this.f443c.k()) {
            if (uVar != null && !uVar.D) {
                uVar.f553y.p();
            }
        }
    }

    public final void q(u uVar) {
        if (uVar != null) {
            if (uVar.equals(this.f443c.f(uVar.f538j))) {
                uVar.f551w.getClass();
                boolean I = I(uVar);
                Boolean bool = uVar.f543o;
                if (bool == null || bool.booleanValue() != I) {
                    uVar.f543o = Boolean.valueOf(I);
                    k0 k0Var = uVar.f553y;
                    k0Var.a0();
                    k0Var.q(k0Var.f461w);
                }
            }
        }
    }

    public final void r(boolean z3) {
        if (z3 && this.f458t != null) {
            Z(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (u uVar : this.f443c.k()) {
            if (uVar != null && z3) {
                uVar.f553y.r(true);
            }
        }
    }

    public final boolean s() {
        if (this.f457s < 1) {
            return false;
        }
        boolean z3 = false;
        for (u uVar : this.f443c.k()) {
            if (uVar != null && H(uVar)) {
                if (!uVar.D ? uVar.f553y.s() : false) {
                    z3 = true;
                }
            }
        }
        return z3;
    }

    public final void t(int i) {
        try {
            this.f442b = true;
            for (q0 q0Var : ((HashMap) this.f443c.f100f).values()) {
                if (q0Var != null) {
                    q0Var.f512e = i;
                }
            }
            J(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((l) it.next()).e();
            }
            this.f442b = false;
            x(true);
        } catch (Throwable th) {
            this.f442b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        u uVar = this.f460v;
        if (uVar != null) {
            sb.append(uVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f460v)));
            sb.append("}");
        } else {
            w wVar = this.f458t;
            if (wVar != null) {
                sb.append(wVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f458t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String f2 = w0.f(str, "    ");
        a0.j jVar = this.f443c;
        ArrayList arrayList = (ArrayList) jVar.f102h;
        String f4 = w0.f(str, "    ");
        HashMap hashMap = (HashMap) jVar.f100f;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (q0 q0Var : hashMap.values()) {
                printWriter.print(str);
                if (q0Var != null) {
                    u uVar = q0Var.f511c;
                    printWriter.println(uVar);
                    uVar.getClass();
                    printWriter.print(f4);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(uVar.A));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(uVar.B));
                    printWriter.print(" mTag=");
                    printWriter.println(uVar.C);
                    printWriter.print(f4);
                    printWriter.print("mState=");
                    printWriter.print(uVar.f535f);
                    printWriter.print(" mWho=");
                    printWriter.print(uVar.f538j);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(uVar.f550v);
                    printWriter.print(f4);
                    printWriter.print("mAdded=");
                    printWriter.print(uVar.f544p);
                    printWriter.print(" mRemoving=");
                    printWriter.print(uVar.f545q);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(uVar.f546r);
                    printWriter.print(" mInLayout=");
                    printWriter.println(uVar.f547s);
                    printWriter.print(f4);
                    printWriter.print("mHidden=");
                    printWriter.print(uVar.D);
                    printWriter.print(" mDetached=");
                    printWriter.print(uVar.E);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(uVar.G);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(f4);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(uVar.F);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(uVar.L);
                    if (uVar.f551w != null) {
                        printWriter.print(f4);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(uVar.f551w);
                    }
                    if (uVar.f552x != null) {
                        printWriter.print(f4);
                        printWriter.print("mHost=");
                        printWriter.println(uVar.f552x);
                    }
                    if (uVar.f554z != null) {
                        printWriter.print(f4);
                        printWriter.print("mParentFragment=");
                        printWriter.println(uVar.f554z);
                    }
                    if (uVar.f539k != null) {
                        printWriter.print(f4);
                        printWriter.print("mArguments=");
                        printWriter.println(uVar.f539k);
                    }
                    if (uVar.f536g != null) {
                        printWriter.print(f4);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(uVar.f536g);
                    }
                    if (uVar.f537h != null) {
                        printWriter.print(f4);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(uVar.f537h);
                    }
                    if (uVar.i != null) {
                        printWriter.print(f4);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(uVar.i);
                    }
                    Object obj = uVar.f540l;
                    if (obj == null) {
                        k0 k0Var = uVar.f551w;
                        obj = (k0Var == null || (str2 = uVar.f541m) == null) ? null : k0Var.f443c.f(str2);
                    }
                    if (obj != null) {
                        printWriter.print(f4);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(uVar.f542n);
                    }
                    printWriter.print(f4);
                    printWriter.print("mPopDirection=");
                    s sVar = uVar.M;
                    printWriter.println(sVar == null ? false : sVar.f521a);
                    s sVar2 = uVar.M;
                    if ((sVar2 == null ? 0 : sVar2.f522b) != 0) {
                        printWriter.print(f4);
                        printWriter.print("getEnterAnim=");
                        s sVar3 = uVar.M;
                        printWriter.println(sVar3 == null ? 0 : sVar3.f522b);
                    }
                    s sVar4 = uVar.M;
                    if ((sVar4 == null ? 0 : sVar4.f523c) != 0) {
                        printWriter.print(f4);
                        printWriter.print("getExitAnim=");
                        s sVar5 = uVar.M;
                        printWriter.println(sVar5 == null ? 0 : sVar5.f523c);
                    }
                    s sVar6 = uVar.M;
                    if ((sVar6 == null ? 0 : sVar6.d) != 0) {
                        printWriter.print(f4);
                        printWriter.print("getPopEnterAnim=");
                        s sVar7 = uVar.M;
                        printWriter.println(sVar7 == null ? 0 : sVar7.d);
                    }
                    s sVar8 = uVar.M;
                    if ((sVar8 == null ? 0 : sVar8.f524e) != 0) {
                        printWriter.print(f4);
                        printWriter.print("getPopExitAnim=");
                        s sVar9 = uVar.M;
                        printWriter.println(sVar9 == null ? 0 : sVar9.f524e);
                    }
                    if (uVar.I != null) {
                        printWriter.print(f4);
                        printWriter.print("mContainer=");
                        printWriter.println(uVar.I);
                    }
                    if (uVar.J != null) {
                        printWriter.print(f4);
                        printWriter.print("mView=");
                        printWriter.println(uVar.J);
                    }
                    if (uVar.h() != null) {
                        androidx.emoji2.text.t tVar = new androidx.emoji2.text.t(uVar.d(), b1.a.d);
                        String canonicalName = b1.a.class.getCanonicalName();
                        if (canonicalName == null) {
                            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                        }
                        q.k kVar = ((b1.a) tVar.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), b1.a.class)).f723c;
                        if (kVar.f3039h > 0) {
                            printWriter.print(f4);
                            printWriter.println("Loaders:");
                            if (kVar.f3039h > 0) {
                                if (kVar.f3038g[0] != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(f4);
                                printWriter.print("  #");
                                printWriter.print(kVar.f3037f[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(f4);
                    printWriter.println("Child " + uVar.f553y + ":");
                    uVar.f553y.u(w0.f(f4, "  "), fileDescriptor, printWriter, strArr);
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
        ArrayList arrayList2 = this.f444e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i4 = 0; i4 < size2; i4++) {
                u uVar3 = (u) this.f444e.get(i4);
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
                aVar.g(f2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.f441a) {
            try {
                int size4 = this.f441a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i6 = 0; i6 < size4; i6++) {
                        Object obj2 = (i0) this.f441a.get(i6);
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
        printWriter.println(this.f458t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f459u);
        if (this.f460v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f460v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f457s);
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

    public final void v(i0 i0Var, boolean z3) {
        if (!z3) {
            if (this.f458t == null) {
                if (!this.G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.E || this.F) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f441a) {
            try {
                if (this.f458t == null) {
                    if (!z3) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f441a.add(i0Var);
                    S();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(boolean z3) {
        if (this.f442b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f458t == null) {
            if (!this.G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f458t.f569p.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z3 && (this.E || this.F)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.I == null) {
            this.I = new ArrayList();
            this.J = new ArrayList();
        }
    }

    public final boolean x(boolean z3) {
        boolean z4;
        w(z3);
        boolean z5 = false;
        while (true) {
            ArrayList arrayList = this.I;
            ArrayList arrayList2 = this.J;
            synchronized (this.f441a) {
                if (this.f441a.isEmpty()) {
                    z4 = false;
                } else {
                    try {
                        int size = this.f441a.size();
                        z4 = false;
                        for (int i = 0; i < size; i++) {
                            z4 |= ((i0) this.f441a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z4) {
                break;
            }
            z5 = true;
            this.f442b = true;
            try {
                P(this.I, this.J);
            } finally {
                d();
            }
        }
        a0();
        if (this.H) {
            this.H = false;
            Y();
        }
        ((HashMap) this.f443c.f100f).values().removeAll(Collections.singleton(null));
        return z5;
    }

    public final void y(ArrayList arrayList, ArrayList arrayList2, int i, int i4) {
        ViewGroup viewGroup;
        boolean z3;
        int i5;
        boolean z4;
        boolean z5;
        int i6;
        int i7;
        boolean z6;
        boolean z7;
        int i8;
        a0.j jVar = this.f443c;
        boolean z8 = ((a) arrayList.get(i)).f389o;
        ArrayList arrayList3 = this.K;
        if (arrayList3 == null) {
            this.K = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.K.addAll(jVar.k());
        u uVar = this.f461w;
        int i9 = i;
        boolean z9 = false;
        while (true) {
            int i10 = 1;
            if (i9 >= i4) {
                boolean z10 = z8;
                this.K.clear();
                if (!z10 && this.f457s >= 1) {
                    for (int i11 = i; i11 < i4; i11++) {
                        ArrayList arrayList4 = ((a) arrayList.get(i11)).f377a;
                        int size = arrayList4.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList4.get(i12);
                            i12++;
                            u uVar2 = ((r0) obj).f515b;
                            if (uVar2 != null && uVar2.f551w != null) {
                                jVar.l(f(uVar2));
                            }
                        }
                    }
                }
                for (int i13 = i; i13 < i4; i13++) {
                    a aVar = (a) arrayList.get(i13);
                    if (((Boolean) arrayList2.get(i13)).booleanValue()) {
                        aVar.c(-1);
                        k0 k0Var = aVar.f390p;
                        ArrayList arrayList5 = aVar.f377a;
                        boolean z11 = true;
                        for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
                            r0 r0Var = (r0) arrayList5.get(size2);
                            u uVar3 = r0Var.f515b;
                            if (uVar3 != null) {
                                if (uVar3.M != null) {
                                    uVar3.f().f521a = z11;
                                }
                                int i14 = aVar.f381f;
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
                                    uVar3.f();
                                    uVar3.M.f525f = i15;
                                }
                                uVar3.f();
                                uVar3.M.getClass();
                            }
                            switch (r0Var.f514a) {
                                case 1:
                                    uVar3.E(r0Var.d, r0Var.f517e, r0Var.f518f, r0Var.f519g);
                                    z11 = true;
                                    k0Var.T(uVar3, true);
                                    k0Var.O(uVar3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + r0Var.f514a);
                                case 3:
                                    uVar3.E(r0Var.d, r0Var.f517e, r0Var.f518f, r0Var.f519g);
                                    k0Var.a(uVar3);
                                    z11 = true;
                                case 4:
                                    uVar3.E(r0Var.d, r0Var.f517e, r0Var.f518f, r0Var.f519g);
                                    k0Var.getClass();
                                    X(uVar3);
                                    z11 = true;
                                case 5:
                                    uVar3.E(r0Var.d, r0Var.f517e, r0Var.f518f, r0Var.f519g);
                                    k0Var.T(uVar3, true);
                                    k0Var.D(uVar3);
                                    z11 = true;
                                case 6:
                                    uVar3.E(r0Var.d, r0Var.f517e, r0Var.f518f, r0Var.f519g);
                                    k0Var.c(uVar3);
                                    z11 = true;
                                case 7:
                                    uVar3.E(r0Var.d, r0Var.f517e, r0Var.f518f, r0Var.f519g);
                                    k0Var.T(uVar3, true);
                                    k0Var.g(uVar3);
                                    z11 = true;
                                case 8:
                                    k0Var.V(null);
                                    z11 = true;
                                case 9:
                                    k0Var.V(uVar3);
                                    z11 = true;
                                case 10:
                                    k0Var.U(uVar3, r0Var.f520h);
                                    z11 = true;
                            }
                        }
                    } else {
                        aVar.c(1);
                        k0 k0Var2 = aVar.f390p;
                        ArrayList arrayList6 = aVar.f377a;
                        int size3 = arrayList6.size();
                        for (int i17 = 0; i17 < size3; i17++) {
                            r0 r0Var2 = (r0) arrayList6.get(i17);
                            u uVar4 = r0Var2.f515b;
                            if (uVar4 != null) {
                                if (uVar4.M != null) {
                                    uVar4.f().f521a = false;
                                }
                                int i18 = aVar.f381f;
                                if (uVar4.M != null || i18 != 0) {
                                    uVar4.f();
                                    uVar4.M.f525f = i18;
                                }
                                uVar4.f();
                                uVar4.M.getClass();
                            }
                            switch (r0Var2.f514a) {
                                case 1:
                                    uVar4.E(r0Var2.d, r0Var2.f517e, r0Var2.f518f, r0Var2.f519g);
                                    k0Var2.T(uVar4, false);
                                    k0Var2.a(uVar4);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + r0Var2.f514a);
                                case 3:
                                    uVar4.E(r0Var2.d, r0Var2.f517e, r0Var2.f518f, r0Var2.f519g);
                                    k0Var2.O(uVar4);
                                case 4:
                                    uVar4.E(r0Var2.d, r0Var2.f517e, r0Var2.f518f, r0Var2.f519g);
                                    k0Var2.D(uVar4);
                                case 5:
                                    uVar4.E(r0Var2.d, r0Var2.f517e, r0Var2.f518f, r0Var2.f519g);
                                    k0Var2.T(uVar4, false);
                                    X(uVar4);
                                case 6:
                                    uVar4.E(r0Var2.d, r0Var2.f517e, r0Var2.f518f, r0Var2.f519g);
                                    k0Var2.g(uVar4);
                                case 7:
                                    uVar4.E(r0Var2.d, r0Var2.f517e, r0Var2.f518f, r0Var2.f519g);
                                    k0Var2.T(uVar4, false);
                                    k0Var2.c(uVar4);
                                case 8:
                                    k0Var2.V(uVar4);
                                case 9:
                                    k0Var2.V(null);
                                case 10:
                                    k0Var2.U(uVar4, r0Var2.i);
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i4 - 1)).booleanValue();
                for (int i19 = i; i19 < i4; i19++) {
                    a aVar2 = (a) arrayList.get(i19);
                    if (booleanValue) {
                        for (int size4 = aVar2.f377a.size() - 1; size4 >= 0; size4--) {
                            u uVar5 = ((r0) aVar2.f377a.get(size4)).f515b;
                            if (uVar5 != null) {
                                f(uVar5).k();
                            }
                        }
                    } else {
                        ArrayList arrayList7 = aVar2.f377a;
                        int size5 = arrayList7.size();
                        int i20 = 0;
                        while (i20 < size5) {
                            Object obj2 = arrayList7.get(i20);
                            i20++;
                            u uVar6 = ((r0) obj2).f515b;
                            if (uVar6 != null) {
                                f(uVar6).k();
                            }
                        }
                    }
                }
                J(this.f457s, true);
                HashSet hashSet = new HashSet();
                for (int i21 = i; i21 < i4; i21++) {
                    ArrayList arrayList8 = ((a) arrayList.get(i21)).f377a;
                    int size6 = arrayList8.size();
                    int i22 = 0;
                    while (i22 < size6) {
                        Object obj3 = arrayList8.get(i22);
                        i22++;
                        u uVar7 = ((r0) obj3).f515b;
                        if (uVar7 != null && (viewGroup = uVar7.I) != null) {
                            hashSet.add(l.f(viewGroup, C()));
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    l lVar = (l) it.next();
                    lVar.d = booleanValue;
                    synchronized (lVar.f466b) {
                        try {
                            lVar.g();
                            lVar.f468e = false;
                            int size7 = lVar.f466b.size() - 1;
                            while (true) {
                                if (size7 >= 0) {
                                    v0 v0Var = (v0) lVar.f466b.get(size7);
                                    int c4 = w0.c(v0Var.f562c.J);
                                    if (v0Var.f560a != 2 || c4 == 2) {
                                        size7--;
                                    } else {
                                        s sVar = v0Var.f562c.M;
                                        lVar.f468e = false;
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
                    if (((Boolean) arrayList2.get(i23)).booleanValue() && aVar3.f392r >= 0) {
                        aVar3.f392r = -1;
                    }
                    aVar3.getClass();
                }
                return;
            }
            a aVar4 = (a) arrayList.get(i9);
            if (((Boolean) arrayList2.get(i9)).booleanValue()) {
                z3 = z8;
                i5 = i9;
                z4 = z9;
                int i24 = 1;
                ArrayList arrayList9 = this.K;
                ArrayList arrayList10 = aVar4.f377a;
                int size8 = arrayList10.size() - 1;
                while (size8 >= 0) {
                    r0 r0Var3 = (r0) arrayList10.get(size8);
                    int i25 = r0Var3.f514a;
                    if (i25 != i24) {
                        if (i25 != 3) {
                            switch (i25) {
                                case 8:
                                    uVar = null;
                                    break;
                                case 9:
                                    uVar = r0Var3.f515b;
                                    break;
                                case 10:
                                    r0Var3.i = r0Var3.f520h;
                                    break;
                            }
                            size8--;
                            i24 = 1;
                        }
                        arrayList9.add(r0Var3.f515b);
                        size8--;
                        i24 = 1;
                    }
                    arrayList9.remove(r0Var3.f515b);
                    size8--;
                    i24 = 1;
                }
            } else {
                ArrayList arrayList11 = this.K;
                ArrayList arrayList12 = aVar4.f377a;
                int i26 = 0;
                while (i26 < arrayList12.size()) {
                    r0 r0Var4 = (r0) arrayList12.get(i26);
                    int i27 = r0Var4.f514a;
                    if (i27 != i10) {
                        z5 = z8;
                        if (i27 != 2) {
                            if (i27 == 3 || i27 == 6) {
                                arrayList11.remove(r0Var4.f515b);
                                u uVar8 = r0Var4.f515b;
                                if (uVar8 == uVar) {
                                    arrayList12.add(i26, new r0(9, uVar8));
                                    i26++;
                                    i7 = i9;
                                    z6 = z9;
                                    i6 = 1;
                                    uVar = null;
                                }
                            } else if (i27 == 7) {
                                i6 = 1;
                            } else if (i27 == 8) {
                                arrayList12.add(i26, new r0(9, uVar, 0));
                                r0Var4.f516c = true;
                                i26++;
                                uVar = r0Var4.f515b;
                            }
                            i7 = i9;
                            z6 = z9;
                            i6 = 1;
                        } else {
                            u uVar9 = r0Var4.f515b;
                            int i28 = uVar9.B;
                            int size9 = arrayList11.size() - 1;
                            boolean z12 = false;
                            while (size9 >= 0) {
                                int i29 = size9;
                                u uVar10 = (u) arrayList11.get(size9);
                                int i30 = i9;
                                if (uVar10.B != i28) {
                                    z7 = z9;
                                } else if (uVar10 == uVar9) {
                                    z7 = z9;
                                    z12 = true;
                                } else {
                                    if (uVar10 == uVar) {
                                        z7 = z9;
                                        i8 = 0;
                                        arrayList12.add(i26, new r0(9, uVar10, 0));
                                        i26++;
                                        uVar = null;
                                    } else {
                                        z7 = z9;
                                        i8 = 0;
                                    }
                                    r0 r0Var5 = new r0(3, uVar10, i8);
                                    r0Var5.d = r0Var4.d;
                                    r0Var5.f518f = r0Var4.f518f;
                                    r0Var5.f517e = r0Var4.f517e;
                                    r0Var5.f519g = r0Var4.f519g;
                                    arrayList12.add(i26, r0Var5);
                                    arrayList11.remove(uVar10);
                                    i26++;
                                    uVar = uVar;
                                }
                                size9 = i29 - 1;
                                z9 = z7;
                                i9 = i30;
                            }
                            i7 = i9;
                            z6 = z9;
                            i6 = 1;
                            if (z12) {
                                arrayList12.remove(i26);
                                i26--;
                            } else {
                                r0Var4.f514a = 1;
                                r0Var4.f516c = true;
                                arrayList11.add(uVar9);
                            }
                        }
                        i26 += i6;
                        i10 = i6;
                        z8 = z5;
                        z9 = z6;
                        i9 = i7;
                    } else {
                        z5 = z8;
                        i6 = i10;
                    }
                    i7 = i9;
                    z6 = z9;
                    arrayList11.add(r0Var4.f515b);
                    i26 += i6;
                    i10 = i6;
                    z8 = z5;
                    z9 = z6;
                    i9 = i7;
                }
                z3 = z8;
                i5 = i9;
                z4 = z9;
            }
            z9 = z4 || aVar4.f382g;
            i9 = i5 + 1;
            z8 = z3;
        }
    }

    public final u z(int i) {
        a0.j jVar = this.f443c;
        ArrayList arrayList = (ArrayList) jVar.f102h;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u uVar = (u) arrayList.get(size);
            if (uVar != null && uVar.A == i) {
                return uVar;
            }
        }
        for (q0 q0Var : ((HashMap) jVar.f100f).values()) {
            if (q0Var != null) {
                u uVar2 = q0Var.f511c;
                if (uVar2.A == i) {
                    return uVar2;
                }
            }
        }
        return null;
    }
}
