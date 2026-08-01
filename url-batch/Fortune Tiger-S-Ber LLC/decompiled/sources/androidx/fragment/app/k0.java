package androidx.fragment.app;

import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.gglhk.bofio.fortunetiger.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class k0 {
    public a2.s A;
    public a2.s B;
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
    public boolean f436b;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f437d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f438e;
    public androidx.activity.h0 g;

    /* renamed from: l, reason: collision with root package name */
    public final a2.s f443l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f444m;

    /* renamed from: n, reason: collision with root package name */
    public final a0 f445n;

    /* renamed from: o, reason: collision with root package name */
    public final a0 f446o;

    /* renamed from: p, reason: collision with root package name */
    public final a0 f447p;

    /* renamed from: q, reason: collision with root package name */
    public final a0 f448q;

    /* renamed from: r, reason: collision with root package name */
    public final d0 f449r;

    /* renamed from: s, reason: collision with root package name */
    public int f450s;

    /* renamed from: t, reason: collision with root package name */
    public w f451t;

    /* renamed from: u, reason: collision with root package name */
    public k3.m f452u;

    /* renamed from: v, reason: collision with root package name */
    public u f453v;

    /* renamed from: w, reason: collision with root package name */
    public u f454w;

    /* renamed from: x, reason: collision with root package name */
    public final e0 f455x;

    /* renamed from: y, reason: collision with root package name */
    public final g2.f f456y;

    /* renamed from: z, reason: collision with root package name */
    public a2.s f457z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f435a = new ArrayList();
    public final androidx.emoji2.text.w c = new androidx.emoji2.text.w(2);

    /* renamed from: f, reason: collision with root package name */
    public final z f439f = new z(this);
    public final c0 h = new c0(this);

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f440i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map f441j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map f442k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.fragment.app.a0] */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.fragment.app.a0] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.fragment.app.a0] */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.fragment.app.a0] */
    public k0() {
        Collections.synchronizedMap(new HashMap());
        this.f443l = new a2.s(this);
        this.f444m = new CopyOnWriteArrayList();
        final int i4 = 0;
        this.f445n = new j0.a(this) { // from class: androidx.fragment.app.a0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f394b;

            {
                this.f394b = this;
            }

            @Override // j0.a
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        k0 k0Var = this.f394b;
                        if (k0Var.I()) {
                            k0Var.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        k0 k0Var2 = this.f394b;
                        if (k0Var2.I() && num.intValue() == 80) {
                            k0Var2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.e eVar = (z.e) obj;
                        k0 k0Var3 = this.f394b;
                        if (k0Var3.I()) {
                            boolean z3 = eVar.f3632a;
                            k0Var3.m(false);
                            break;
                        }
                        break;
                    default:
                        z.f fVar = (z.f) obj;
                        k0 k0Var4 = this.f394b;
                        if (k0Var4.I()) {
                            boolean z4 = fVar.f3633a;
                            k0Var4.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i5 = 1;
        this.f446o = new j0.a(this) { // from class: androidx.fragment.app.a0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f394b;

            {
                this.f394b = this;
            }

            @Override // j0.a
            public final void accept(Object obj) {
                switch (i5) {
                    case 0:
                        k0 k0Var = this.f394b;
                        if (k0Var.I()) {
                            k0Var.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        k0 k0Var2 = this.f394b;
                        if (k0Var2.I() && num.intValue() == 80) {
                            k0Var2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.e eVar = (z.e) obj;
                        k0 k0Var3 = this.f394b;
                        if (k0Var3.I()) {
                            boolean z3 = eVar.f3632a;
                            k0Var3.m(false);
                            break;
                        }
                        break;
                    default:
                        z.f fVar = (z.f) obj;
                        k0 k0Var4 = this.f394b;
                        if (k0Var4.I()) {
                            boolean z4 = fVar.f3633a;
                            k0Var4.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i6 = 2;
        this.f447p = new j0.a(this) { // from class: androidx.fragment.app.a0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f394b;

            {
                this.f394b = this;
            }

            @Override // j0.a
            public final void accept(Object obj) {
                switch (i6) {
                    case 0:
                        k0 k0Var = this.f394b;
                        if (k0Var.I()) {
                            k0Var.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        k0 k0Var2 = this.f394b;
                        if (k0Var2.I() && num.intValue() == 80) {
                            k0Var2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.e eVar = (z.e) obj;
                        k0 k0Var3 = this.f394b;
                        if (k0Var3.I()) {
                            boolean z3 = eVar.f3632a;
                            k0Var3.m(false);
                            break;
                        }
                        break;
                    default:
                        z.f fVar = (z.f) obj;
                        k0 k0Var4 = this.f394b;
                        if (k0Var4.I()) {
                            boolean z4 = fVar.f3633a;
                            k0Var4.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i7 = 3;
        this.f448q = new j0.a(this) { // from class: androidx.fragment.app.a0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f394b;

            {
                this.f394b = this;
            }

            @Override // j0.a
            public final void accept(Object obj) {
                switch (i7) {
                    case 0:
                        k0 k0Var = this.f394b;
                        if (k0Var.I()) {
                            k0Var.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        k0 k0Var2 = this.f394b;
                        if (k0Var2.I() && num.intValue() == 80) {
                            k0Var2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.e eVar = (z.e) obj;
                        k0 k0Var3 = this.f394b;
                        if (k0Var3.I()) {
                            boolean z3 = eVar.f3632a;
                            k0Var3.m(false);
                            break;
                        }
                        break;
                    default:
                        z.f fVar = (z.f) obj;
                        k0 k0Var4 = this.f394b;
                        if (k0Var4.I()) {
                            boolean z4 = fVar.f3633a;
                            k0Var4.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f449r = new d0(this);
        this.f450s = -1;
        this.f455x = new e0(this);
        this.f456y = new g2.f(6);
        this.C = new ArrayDeque();
        this.M = new g(2, this);
    }

    public static boolean G(int i4) {
        return Log.isLoggable("FragmentManager", i4);
    }

    public static boolean H(u uVar) {
        uVar.getClass();
        ArrayList i4 = uVar.f537y.c.i();
        int size = i4.size();
        boolean z3 = false;
        int i5 = 0;
        while (i5 < size) {
            Object obj = i4.get(i5);
            i5++;
            u uVar2 = (u) obj;
            if (uVar2 != null) {
                z3 = H(uVar2);
            }
            if (z3) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(u uVar) {
        if (uVar == null) {
            return true;
        }
        if (uVar.G) {
            return uVar.f535w == null || J(uVar.f538z);
        }
        return false;
    }

    public static boolean K(u uVar) {
        if (uVar == null) {
            return true;
        }
        k0 k0Var = uVar.f535w;
        return uVar.equals(k0Var.f454w) && K(k0Var.f453v);
    }

    public static void Z(u uVar) {
        if (G(2)) {
            Log.v("FragmentManager", "show: " + uVar);
        }
        if (uVar.D) {
            uVar.D = false;
            uVar.N = !uVar.N;
        }
    }

    public final u A(int i4) {
        androidx.emoji2.text.w wVar = this.c;
        ArrayList arrayList = (ArrayList) wVar.f368f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u uVar = (u) arrayList.get(size);
            if (uVar != null && uVar.A == i4) {
                return uVar;
            }
        }
        for (q0 q0Var : ((HashMap) wVar.g).values()) {
            if (q0Var != null) {
                u uVar2 = q0Var.c;
                if (uVar2.A == i4) {
                    return uVar2;
                }
            }
        }
        return null;
    }

    public final u B(String str) {
        androidx.emoji2.text.w wVar = this.c;
        ArrayList arrayList = (ArrayList) wVar.f368f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u uVar = (u) arrayList.get(size);
            if (uVar != null && str.equals(uVar.C)) {
                return uVar;
            }
        }
        for (q0 q0Var : ((HashMap) wVar.g).values()) {
            if (q0Var != null) {
                u uVar2 = q0Var.c;
                if (str.equals(uVar2.C)) {
                    return uVar2;
                }
            }
        }
        return null;
    }

    public final ViewGroup C(u uVar) {
        ViewGroup viewGroup = uVar.I;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (uVar.B <= 0 || !this.f452u.L()) {
            return null;
        }
        View K = this.f452u.K(uVar.B);
        if (K instanceof ViewGroup) {
            return (ViewGroup) K;
        }
        return null;
    }

    public final e0 D() {
        u uVar = this.f453v;
        return uVar != null ? uVar.f535w.D() : this.f455x;
    }

    public final g2.f E() {
        u uVar = this.f453v;
        return uVar != null ? uVar.f535w.E() : this.f456y;
    }

    public final void F(u uVar) {
        if (G(2)) {
            Log.v("FragmentManager", "hide: " + uVar);
        }
        if (uVar.D) {
            return;
        }
        uVar.D = true;
        uVar.N = true ^ uVar.N;
        Y(uVar);
    }

    public final boolean I() {
        u uVar = this.f453v;
        if (uVar == null) {
            return true;
        }
        return uVar.f536x != null && uVar.f528p && uVar.j().I();
    }

    public final void L(int i4, boolean z3) {
        w wVar;
        if (this.f451t == null && i4 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z3 || i4 != this.f450s) {
            this.f450s = i4;
            androidx.emoji2.text.w wVar2 = this.c;
            HashMap hashMap = (HashMap) wVar2.g;
            ArrayList arrayList = (ArrayList) wVar2.f368f;
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                q0 q0Var = (q0) hashMap.get(((u) obj).f522j);
                if (q0Var != null) {
                    q0Var.k();
                }
            }
            for (q0 q0Var2 : hashMap.values()) {
                if (q0Var2 != null) {
                    q0Var2.k();
                    u uVar = q0Var2.c;
                    if (uVar.f529q && !uVar.o()) {
                        wVar2.m(q0Var2);
                    }
                }
            }
            a0();
            if (this.D && (wVar = this.f451t) != null && this.f450s == 7) {
                wVar.f551o.invalidateOptionsMenu();
                this.D = false;
            }
        }
    }

    public final void M() {
        if (this.f451t == null) {
            return;
        }
        this.E = false;
        this.F = false;
        this.L.h = false;
        for (u uVar : this.c.j()) {
            if (uVar != null) {
                uVar.f537y.M();
            }
        }
    }

    public final boolean N() {
        return O(-1, 0);
    }

    public final boolean O(int i4, int i5) {
        y(false);
        x(true);
        u uVar = this.f454w;
        if (uVar != null && i4 < 0 && uVar.g().N()) {
            return true;
        }
        boolean P = P(this.I, this.J, i4, i5);
        if (P) {
            this.f436b = true;
            try {
                R(this.I, this.J);
            } finally {
                d();
            }
        }
        c0();
        u();
        ((HashMap) this.c.g).values().removeAll(Collections.singleton(null));
        return P;
    }

    public final boolean P(ArrayList arrayList, ArrayList arrayList2, int i4, int i5) {
        boolean z3 = (i5 & 1) != 0;
        ArrayList arrayList3 = this.f437d;
        int i6 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i4 < 0) {
                i6 = z3 ? 0 : this.f437d.size() - 1;
            } else {
                int size = this.f437d.size() - 1;
                while (size >= 0) {
                    a aVar = (a) this.f437d.get(size);
                    if (i4 >= 0 && i4 == aVar.f392r) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    i6 = size;
                } else if (z3) {
                    i6 = size;
                    while (i6 > 0) {
                        a aVar2 = (a) this.f437d.get(i6 - 1);
                        if (i4 < 0 || i4 != aVar2.f392r) {
                            break;
                        }
                        i6--;
                    }
                } else if (size != this.f437d.size() - 1) {
                    i6 = size + 1;
                }
            }
        }
        if (i6 < 0) {
            return false;
        }
        for (int size2 = this.f437d.size() - 1; size2 >= i6; size2--) {
            arrayList.add((a) this.f437d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void Q(u uVar) {
        if (G(2)) {
            Log.v("FragmentManager", "remove: " + uVar + " nesting=" + uVar.f534v);
        }
        boolean o4 = uVar.o();
        if (uVar.E && o4) {
            return;
        }
        androidx.emoji2.text.w wVar = this.c;
        synchronized (((ArrayList) wVar.f368f)) {
            ((ArrayList) wVar.f368f).remove(uVar);
        }
        uVar.f528p = false;
        if (H(uVar)) {
            this.D = true;
        }
        uVar.f529q = true;
        Y(uVar);
    }

    public final void R(ArrayList arrayList, ArrayList arrayList2) {
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
            if (!((a) arrayList.get(i4)).f389o) {
                if (i5 != i4) {
                    z(arrayList, arrayList2, i5, i4);
                }
                i5 = i4 + 1;
                if (((Boolean) arrayList2.get(i4)).booleanValue()) {
                    while (i5 < size && ((Boolean) arrayList2.get(i5)).booleanValue() && !((a) arrayList.get(i5)).f389o) {
                        i5++;
                    }
                }
                z(arrayList, arrayList2, i4, i5);
                i4 = i5 - 1;
            }
            i4++;
        }
        if (i5 != size) {
            z(arrayList, arrayList2, i5, size);
        }
    }

    public final void S(Parcelable parcelable) {
        a2.s sVar;
        int i4;
        boolean z3;
        int i5;
        q0 q0Var;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f451t.f548l.getClassLoader());
                this.f442k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f451t.f548l.getClassLoader());
                arrayList.add((o0) bundle.getParcelable("state"));
            }
        }
        androidx.emoji2.text.w wVar = this.c;
        HashMap hashMap = (HashMap) wVar.h;
        HashMap hashMap2 = (HashMap) wVar.g;
        hashMap.clear();
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            o0 o0Var = (o0) obj;
            hashMap.put(o0Var.g, o0Var);
        }
        l0 l0Var = (l0) bundle3.getParcelable("state");
        if (l0Var == null) {
            return;
        }
        hashMap2.clear();
        ArrayList arrayList2 = l0Var.f462f;
        int size2 = arrayList2.size();
        int i7 = 0;
        while (true) {
            sVar = this.f443l;
            i4 = 2;
            if (i7 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i7);
            i7++;
            o0 o0Var2 = (o0) ((HashMap) wVar.h).remove((String) obj2);
            if (o0Var2 != null) {
                u uVar = (u) this.L.c.get(o0Var2.g);
                if (uVar != null) {
                    if (G(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + uVar);
                    }
                    q0Var = new q0(sVar, wVar, uVar, o0Var2);
                } else {
                    q0Var = new q0(this.f443l, this.c, this.f451t.f548l.getClassLoader(), D(), o0Var2);
                }
                u uVar2 = q0Var.c;
                uVar2.f535w = this;
                if (G(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + uVar2.f522j + "): " + uVar2);
                }
                q0Var.m(this.f451t.f548l.getClassLoader());
                wVar.l(q0Var);
                q0Var.f501e = this.f450s;
            }
        }
        m0 m0Var = this.L;
        m0Var.getClass();
        ArrayList arrayList3 = new ArrayList(m0Var.c.values());
        int size3 = arrayList3.size();
        int i8 = 0;
        while (true) {
            z3 = true;
            if (i8 >= size3) {
                break;
            }
            Object obj3 = arrayList3.get(i8);
            i8++;
            u uVar3 = (u) obj3;
            if (hashMap2.get(uVar3.f522j) == null) {
                if (G(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + uVar3 + " that was not found in the set of active Fragments " + l0Var.f462f);
                }
                this.L.e(uVar3);
                uVar3.f535w = this;
                q0 q0Var2 = new q0(sVar, wVar, uVar3);
                q0Var2.f501e = 1;
                q0Var2.k();
                uVar3.f529q = true;
                q0Var2.k();
            }
        }
        ArrayList arrayList4 = l0Var.g;
        ((ArrayList) wVar.f368f).clear();
        if (arrayList4 != null) {
            int size4 = arrayList4.size();
            int i9 = 0;
            while (i9 < size4) {
                Object obj4 = arrayList4.get(i9);
                i9++;
                String str3 = (String) obj4;
                u d4 = wVar.d(str3);
                if (d4 == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str3 + ")");
                }
                if (G(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + d4);
                }
                wVar.a(d4);
            }
        }
        if (l0Var.h != null) {
            this.f437d = new ArrayList(l0Var.h.length);
            int i10 = 0;
            while (true) {
                c[] cVarArr = l0Var.h;
                if (i10 >= cVarArr.length) {
                    break;
                }
                c cVar = cVarArr[i10];
                ArrayList arrayList5 = cVar.g;
                a aVar = new a(this);
                int[] iArr = cVar.f398f;
                int i11 = 0;
                int i12 = 0;
                while (i11 < iArr.length) {
                    r0 r0Var = new r0();
                    int i13 = i11 + 1;
                    int i14 = i4;
                    r0Var.f503a = iArr[i11];
                    if (G(i14)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i12 + " base fragment #" + iArr[i13]);
                    }
                    r0Var.h = androidx.lifecycle.m.values()[cVar.h[i12]];
                    r0Var.f508i = androidx.lifecycle.m.values()[cVar.f399i[i12]];
                    int i15 = i11 + 2;
                    r0Var.c = iArr[i13] != 0 ? z3 : false;
                    int i16 = iArr[i15];
                    r0Var.f505d = i16;
                    int i17 = iArr[i11 + 3];
                    r0Var.f506e = i17;
                    int i18 = i11 + 5;
                    int i19 = iArr[i11 + 4];
                    r0Var.f507f = i19;
                    i11 += 6;
                    int[] iArr2 = iArr;
                    int i20 = iArr2[i18];
                    r0Var.g = i20;
                    aVar.f379b = i16;
                    aVar.c = i17;
                    aVar.f380d = i19;
                    aVar.f381e = i20;
                    aVar.b(r0Var);
                    i12++;
                    i4 = i14;
                    iArr = iArr2;
                    z3 = true;
                }
                int i21 = i4;
                aVar.f382f = cVar.f400j;
                aVar.h = cVar.f401k;
                aVar.g = true;
                aVar.f383i = cVar.f403m;
                aVar.f384j = cVar.f404n;
                aVar.f385k = cVar.f405o;
                aVar.f386l = cVar.f406p;
                aVar.f387m = cVar.f407q;
                aVar.f388n = cVar.f408r;
                aVar.f389o = cVar.f409s;
                aVar.f392r = cVar.f402l;
                for (int i22 = 0; i22 < arrayList5.size(); i22++) {
                    String str4 = (String) arrayList5.get(i22);
                    if (str4 != null) {
                        ((r0) aVar.f378a.get(i22)).f504b = wVar.d(str4);
                    }
                }
                aVar.c(1);
                if (G(i21)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i10 + " (index " + aVar.f392r + "): " + aVar);
                    PrintWriter printWriter = new PrintWriter(new t0());
                    aVar.d("  ", printWriter, false);
                    printWriter.close();
                }
                this.f437d.add(aVar);
                i10++;
                i4 = i21;
                z3 = true;
            }
            i5 = 0;
        } else {
            i5 = 0;
            this.f437d = null;
        }
        this.f440i.set(l0Var.f463i);
        String str5 = l0Var.f464j;
        if (str5 != null) {
            u d5 = wVar.d(str5);
            this.f454w = d5;
            q(d5);
        }
        ArrayList arrayList6 = l0Var.f465k;
        if (arrayList6 != null) {
            while (i5 < arrayList6.size()) {
                this.f441j.put((String) arrayList6.get(i5), (d) l0Var.f466l.get(i5));
                i5++;
            }
        }
        this.C = new ArrayDeque(l0Var.f467m);
    }

    public final Bundle T() {
        int i4;
        ArrayList arrayList;
        c[] cVarArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            i4 = 0;
            if (!it.hasNext()) {
                break;
            }
            l lVar = (l) it.next();
            if (lVar.f461e) {
                if (G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                lVar.f461e = false;
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
        androidx.emoji2.text.w wVar = this.c;
        wVar.getClass();
        HashMap hashMap = (HashMap) wVar.g;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it3 = hashMap.values().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            q0 q0Var = (q0) it3.next();
            if (q0Var != null) {
                u uVar = q0Var.c;
                o0 o0Var = new o0(uVar);
                if (uVar.f520f <= -1 || o0Var.f486r != null) {
                    o0Var.f486r = uVar.g;
                } else {
                    Bundle bundle2 = new Bundle();
                    uVar.x(bundle2);
                    uVar.U.c(bundle2);
                    bundle2.putParcelable("android:support:fragments", uVar.f537y.T());
                    q0Var.f498a.o(false);
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
                    if (uVar.f521i != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBundle("android:view_registry_state", uVar.f521i);
                    }
                    if (!uVar.L) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBoolean("android:user_visible_hint", uVar.L);
                    }
                    o0Var.f486r = bundle3;
                    if (uVar.f525m != null) {
                        if (bundle3 == null) {
                            o0Var.f486r = new Bundle();
                        }
                        o0Var.f486r.putString("android:target_state", uVar.f525m);
                        int i5 = uVar.f526n;
                        if (i5 != 0) {
                            o0Var.f486r.putInt("android:target_req_state", i5);
                        }
                    }
                }
                arrayList2.add(uVar.f522j);
                if (G(2)) {
                    Log.v("FragmentManager", "Saved state of " + uVar + ": " + uVar.g);
                }
            }
        }
        androidx.emoji2.text.w wVar2 = this.c;
        wVar2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) wVar2.h).values());
        if (!arrayList3.isEmpty()) {
            androidx.emoji2.text.w wVar3 = this.c;
            synchronized (((ArrayList) wVar3.f368f)) {
                try {
                    if (((ArrayList) wVar3.f368f).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) wVar3.f368f).size());
                        ArrayList arrayList4 = (ArrayList) wVar3.f368f;
                        int size2 = arrayList4.size();
                        int i6 = 0;
                        while (i6 < size2) {
                            Object obj = arrayList4.get(i6);
                            i6++;
                            u uVar2 = (u) obj;
                            arrayList.add(uVar2.f522j);
                            if (G(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + uVar2.f522j + "): " + uVar2);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList5 = this.f437d;
            if (arrayList5 == null || (size = arrayList5.size()) <= 0) {
                cVarArr = null;
            } else {
                cVarArr = new c[size];
                for (int i7 = 0; i7 < size; i7++) {
                    cVarArr[i7] = new c((a) this.f437d.get(i7));
                    if (G(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i7 + ": " + this.f437d.get(i7));
                    }
                }
            }
            l0 l0Var = new l0();
            l0Var.f464j = null;
            ArrayList arrayList6 = new ArrayList();
            l0Var.f465k = arrayList6;
            ArrayList arrayList7 = new ArrayList();
            l0Var.f466l = arrayList7;
            l0Var.f462f = arrayList2;
            l0Var.g = arrayList;
            l0Var.h = cVarArr;
            l0Var.f463i = this.f440i.get();
            u uVar3 = this.f454w;
            if (uVar3 != null) {
                l0Var.f464j = uVar3.f522j;
            }
            arrayList6.addAll(this.f441j.keySet());
            arrayList7.addAll(this.f441j.values());
            l0Var.f467m = new ArrayList(this.C);
            bundle.putParcelable("state", l0Var);
            for (String str : this.f442k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f442k.get(str));
            }
            int size3 = arrayList3.size();
            while (i4 < size3) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                o0 o0Var2 = (o0) obj2;
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("state", o0Var2);
                bundle.putBundle("fragment_" + o0Var2.g, bundle4);
            }
        } else if (G(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final void U() {
        synchronized (this.f435a) {
            try {
                if (this.f435a.size() == 1) {
                    this.f451t.f549m.removeCallbacks(this.M);
                    this.f451t.f549m.post(this.M);
                    c0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void V(u uVar, boolean z3) {
        ViewGroup C = C(uVar);
        if (C == null || !(C instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) C).setDrawDisappearingViewsLast(!z3);
    }

    public final void W(u uVar, androidx.lifecycle.m mVar) {
        if (uVar.equals(this.c.d(uVar.f522j)) && (uVar.f536x == null || uVar.f535w == this)) {
            uVar.Q = mVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + uVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void X(u uVar) {
        if (uVar != null) {
            if (!uVar.equals(this.c.d(uVar.f522j)) || (uVar.f536x != null && uVar.f535w != this)) {
                throw new IllegalArgumentException("Fragment " + uVar + " is not an active fragment of FragmentManager " + this);
            }
        }
        u uVar2 = this.f454w;
        this.f454w = uVar;
        q(uVar2);
        q(this.f454w);
    }

    public final void Y(u uVar) {
        ViewGroup C = C(uVar);
        if (C != null) {
            s sVar = uVar.M;
            if ((sVar == null ? 0 : sVar.f512e) + (sVar == null ? 0 : sVar.f511d) + (sVar == null ? 0 : sVar.c) + (sVar == null ? 0 : sVar.f510b) > 0) {
                if (C.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    C.setTag(R.id.visible_removing_fragment_view_tag, uVar);
                }
                u uVar2 = (u) C.getTag(R.id.visible_removing_fragment_view_tag);
                s sVar2 = uVar.M;
                boolean z3 = sVar2 != null ? sVar2.f509a : false;
                if (uVar2.M == null) {
                    return;
                }
                uVar2.d().f509a = z3;
            }
        }
    }

    public final q0 a(u uVar) {
        String str = uVar.P;
        if (str != null) {
            v0.c.c(uVar, str);
        }
        if (G(2)) {
            Log.v("FragmentManager", "add: " + uVar);
        }
        q0 f4 = f(uVar);
        uVar.f535w = this;
        androidx.emoji2.text.w wVar = this.c;
        wVar.l(f4);
        if (!uVar.E) {
            wVar.a(uVar);
            uVar.f529q = false;
            if (uVar.J == null) {
                uVar.N = false;
            }
            if (H(uVar)) {
                this.D = true;
            }
        }
        return f4;
    }

    public final void a0() {
        ArrayList h = this.c.h();
        int size = h.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = h.get(i4);
            i4++;
            q0 q0Var = (q0) obj;
            u uVar = q0Var.c;
            if (uVar.K) {
                if (this.f436b) {
                    this.H = true;
                } else {
                    uVar.K = false;
                    q0Var.k();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(w wVar, k3.m mVar, u uVar) {
        String str;
        if (this.f451t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f451t = wVar;
        this.f452u = mVar;
        this.f453v = uVar;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f444m;
        if (uVar != 0) {
            copyOnWriteArrayList.add(new f0(uVar));
        } else if (wVar != null) {
            copyOnWriteArrayList.add(wVar);
        }
        if (this.f453v != null) {
            c0();
        }
        if (wVar != null) {
            androidx.activity.h0 i4 = wVar.f551o.i();
            this.g = i4;
            i4.a(uVar != 0 ? uVar : wVar, this.h);
        }
        if (uVar != 0) {
            m0 m0Var = uVar.f535w.L;
            HashMap hashMap = m0Var.f470d;
            m0 m0Var2 = (m0) hashMap.get(uVar.f522j);
            if (m0Var2 == null) {
                m0Var2 = new m0(m0Var.f472f);
                hashMap.put(uVar.f522j, m0Var2);
            }
            this.L = m0Var2;
        } else if (wVar != null) {
            androidx.emoji2.text.s sVar = new androidx.emoji2.text.s(wVar.f551o.e(), m0.f469i);
            String canonicalName = m0.class.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.L = (m0) sVar.e("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), m0.class);
        } else {
            this.L = new m0(false);
        }
        m0 m0Var3 = this.L;
        m0Var3.h = this.E || this.F;
        this.c.f369i = m0Var3;
        w wVar2 = this.f451t;
        if (wVar2 != null && uVar == 0) {
            c1.d a4 = wVar2.a();
            a4.e("android:support:fragments", new androidx.activity.f(2, this));
            Bundle c = a4.c("android:support:fragments");
            if (c != null) {
                S(c);
            }
        }
        w wVar3 = this.f451t;
        if (wVar3 != null) {
            androidx.activity.l lVar = wVar3.f551o.f131m;
            if (uVar != 0) {
                str = uVar.f522j + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.f457z = lVar.b(w0.f(str2, "StartActivityForResult"), new g0(2), new b0(this, 1));
            this.A = lVar.b(w0.f(str2, "StartIntentSenderForResult"), new g0(0), new b0(this, 2));
            this.B = lVar.b(w0.f(str2, "RequestPermissions"), new g0(1), new b0(this, 0));
        }
        w wVar4 = this.f451t;
        if (wVar4 != null) {
            wVar4.f551o.g(this.f445n);
        }
        w wVar5 = this.f451t;
        if (wVar5 != null) {
            f.i iVar = wVar5.f551o;
            iVar.getClass();
            a0 a0Var = this.f446o;
            u2.c.e(a0Var, "listener");
            iVar.f133o.add(a0Var);
        }
        w wVar6 = this.f451t;
        if (wVar6 != null) {
            f.i iVar2 = wVar6.f551o;
            iVar2.getClass();
            a0 a0Var2 = this.f447p;
            u2.c.e(a0Var2, "listener");
            iVar2.f135q.add(a0Var2);
        }
        w wVar7 = this.f451t;
        if (wVar7 != null) {
            f.i iVar3 = wVar7.f551o;
            iVar3.getClass();
            a0 a0Var3 = this.f448q;
            u2.c.e(a0Var3, "listener");
            iVar3.f136r.add(a0Var3);
        }
        w wVar8 = this.f451t;
        if (wVar8 == null || uVar != 0) {
            return;
        }
        f.i iVar4 = wVar8.f551o;
        iVar4.getClass();
        d0 d0Var = this.f449r;
        u2.c.e(d0Var, "provider");
        androidx.emoji2.text.s sVar2 = iVar4.h;
        ((CopyOnWriteArrayList) sVar2.c).add(d0Var);
        ((Runnable) sVar2.f357b).run();
    }

    public final void b0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new t0());
        w wVar = this.f451t;
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
            wVar.f551o.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e5) {
            Log.e("FragmentManager", "Failed dumping state", e5);
            throw illegalStateException;
        }
    }

    public final void c(u uVar) {
        if (G(2)) {
            Log.v("FragmentManager", "attach: " + uVar);
        }
        if (uVar.E) {
            uVar.E = false;
            if (uVar.f528p) {
                return;
            }
            this.c.a(uVar);
            if (G(2)) {
                Log.v("FragmentManager", "add from attach: " + uVar);
            }
            if (H(uVar)) {
                this.D = true;
            }
        }
    }

    public final void c0() {
        synchronized (this.f435a) {
            try {
                if (!this.f435a.isEmpty()) {
                    c0 c0Var = this.h;
                    c0Var.f410a = true;
                    androidx.activity.g0 g0Var = c0Var.c;
                    if (g0Var != null) {
                        g0Var.a();
                    }
                    return;
                }
                c0 c0Var2 = this.h;
                ArrayList arrayList = this.f437d;
                c0Var2.f410a = (arrayList != null ? arrayList.size() : 0) > 0 && K(this.f453v);
                androidx.activity.g0 g0Var2 = c0Var2.c;
                if (g0Var2 != null) {
                    g0Var2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        this.f436b = false;
        this.J.clear();
        this.I.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        ArrayList h = this.c.h();
        int size = h.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = h.get(i4);
            i4++;
            ViewGroup viewGroup = ((q0) obj).c.I;
            if (viewGroup != null) {
                hashSet.add(l.f(viewGroup, E()));
            }
        }
        return hashSet;
    }

    public final q0 f(u uVar) {
        String str = uVar.f522j;
        androidx.emoji2.text.w wVar = this.c;
        q0 q0Var = (q0) ((HashMap) wVar.g).get(str);
        if (q0Var != null) {
            return q0Var;
        }
        q0 q0Var2 = new q0(this.f443l, wVar, uVar);
        q0Var2.m(this.f451t.f548l.getClassLoader());
        q0Var2.f501e = this.f450s;
        return q0Var2;
    }

    public final void g(u uVar) {
        if (G(2)) {
            Log.v("FragmentManager", "detach: " + uVar);
        }
        if (uVar.E) {
            return;
        }
        uVar.E = true;
        if (uVar.f528p) {
            if (G(2)) {
                Log.v("FragmentManager", "remove from detach: " + uVar);
            }
            androidx.emoji2.text.w wVar = this.c;
            synchronized (((ArrayList) wVar.f368f)) {
                ((ArrayList) wVar.f368f).remove(uVar);
            }
            uVar.f528p = false;
            if (H(uVar)) {
                this.D = true;
            }
            Y(uVar);
        }
    }

    public final void h(boolean z3) {
        if (z3 && this.f451t != null) {
            b0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (u uVar : this.c.j()) {
            if (uVar != null) {
                uVar.H = true;
                if (z3) {
                    uVar.f537y.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.f450s >= 1) {
            for (u uVar : this.c.j()) {
                if (uVar != null) {
                    if (!uVar.D ? uVar.f537y.i() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.f450s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z3 = false;
        for (u uVar : this.c.j()) {
            if (uVar != null && J(uVar)) {
                if (!uVar.D ? uVar.f537y.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(uVar);
                    z3 = true;
                }
            }
        }
        if (this.f438e != null) {
            for (int i4 = 0; i4 < this.f438e.size(); i4++) {
                u uVar2 = (u) this.f438e.get(i4);
                if (arrayList == null || !arrayList.contains(uVar2)) {
                    uVar2.getClass();
                }
            }
        }
        this.f438e = arrayList;
        return z3;
    }

    public final void k() {
        boolean z3 = true;
        this.G = true;
        y(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((l) it.next()).e();
        }
        w wVar = this.f451t;
        androidx.emoji2.text.w wVar2 = this.c;
        if (wVar != null) {
            z3 = ((m0) wVar2.f369i).g;
        } else {
            f.i iVar = wVar.f548l;
            if (iVar != null) {
                z3 = true ^ iVar.isChangingConfigurations();
            }
        }
        if (z3) {
            Iterator it2 = this.f441j.values().iterator();
            while (it2.hasNext()) {
                ArrayList arrayList = ((d) it2.next()).f413f;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    String str = (String) obj;
                    m0 m0Var = (m0) wVar2.f369i;
                    m0Var.getClass();
                    if (G(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    m0Var.d(str);
                }
            }
        }
        t(-1);
        w wVar3 = this.f451t;
        if (wVar3 != null) {
            f.i iVar2 = wVar3.f551o;
            iVar2.getClass();
            a0 a0Var = this.f446o;
            u2.c.e(a0Var, "listener");
            iVar2.f133o.remove(a0Var);
        }
        w wVar4 = this.f451t;
        if (wVar4 != null) {
            f.i iVar3 = wVar4.f551o;
            iVar3.getClass();
            a0 a0Var2 = this.f445n;
            u2.c.e(a0Var2, "listener");
            iVar3.f132n.remove(a0Var2);
        }
        w wVar5 = this.f451t;
        if (wVar5 != null) {
            f.i iVar4 = wVar5.f551o;
            iVar4.getClass();
            a0 a0Var3 = this.f447p;
            u2.c.e(a0Var3, "listener");
            iVar4.f135q.remove(a0Var3);
        }
        w wVar6 = this.f451t;
        if (wVar6 != null) {
            f.i iVar5 = wVar6.f551o;
            iVar5.getClass();
            a0 a0Var4 = this.f448q;
            u2.c.e(a0Var4, "listener");
            iVar5.f136r.remove(a0Var4);
        }
        w wVar7 = this.f451t;
        if (wVar7 != null) {
            f.i iVar6 = wVar7.f551o;
            iVar6.getClass();
            d0 d0Var = this.f449r;
            u2.c.e(d0Var, "provider");
            androidx.emoji2.text.s sVar = iVar6.h;
            ((CopyOnWriteArrayList) sVar.c).remove(d0Var);
            if (((HashMap) sVar.f358d).remove(d0Var) != null) {
                throw new ClassCastException();
            }
            ((Runnable) sVar.f357b).run();
        }
        this.f451t = null;
        this.f452u = null;
        this.f453v = null;
        if (this.g != null) {
            Iterator it3 = this.h.f411b.iterator();
            while (it3.hasNext()) {
                ((androidx.activity.c) it3.next()).cancel();
            }
            this.g = null;
        }
        a2.s sVar2 = this.f457z;
        if (sVar2 != null) {
            sVar2.J();
            this.A.J();
            this.B.J();
        }
    }

    public final void l(boolean z3) {
        if (z3 && this.f451t != null) {
            b0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (u uVar : this.c.j()) {
            if (uVar != null) {
                uVar.H = true;
                if (z3) {
                    uVar.f537y.l(true);
                }
            }
        }
    }

    public final void m(boolean z3) {
        if (z3 && this.f451t != null) {
            b0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (u uVar : this.c.j()) {
            if (uVar != null && z3) {
                uVar.f537y.m(true);
            }
        }
    }

    public final void n() {
        ArrayList i4 = this.c.i();
        int size = i4.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = i4.get(i5);
            i5++;
            u uVar = (u) obj;
            if (uVar != null) {
                uVar.n();
                uVar.f537y.n();
            }
        }
    }

    public final boolean o() {
        if (this.f450s >= 1) {
            for (u uVar : this.c.j()) {
                if (uVar != null) {
                    if (!uVar.D ? uVar.f537y.o() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f450s < 1) {
            return;
        }
        for (u uVar : this.c.j()) {
            if (uVar != null && !uVar.D) {
                uVar.f537y.p();
            }
        }
    }

    public final void q(u uVar) {
        if (uVar != null) {
            if (uVar.equals(this.c.d(uVar.f522j))) {
                uVar.f535w.getClass();
                boolean K = K(uVar);
                Boolean bool = uVar.f527o;
                if (bool == null || bool.booleanValue() != K) {
                    uVar.f527o = Boolean.valueOf(K);
                    k0 k0Var = uVar.f537y;
                    k0Var.c0();
                    k0Var.q(k0Var.f454w);
                }
            }
        }
    }

    public final void r(boolean z3) {
        if (z3 && this.f451t != null) {
            b0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (u uVar : this.c.j()) {
            if (uVar != null && z3) {
                uVar.f537y.r(true);
            }
        }
    }

    public final boolean s() {
        if (this.f450s < 1) {
            return false;
        }
        boolean z3 = false;
        for (u uVar : this.c.j()) {
            if (uVar != null && J(uVar)) {
                if (!uVar.D ? uVar.f537y.s() : false) {
                    z3 = true;
                }
            }
        }
        return z3;
    }

    public final void t(int i4) {
        try {
            this.f436b = true;
            for (q0 q0Var : ((HashMap) this.c.g).values()) {
                if (q0Var != null) {
                    q0Var.f501e = i4;
                }
            }
            L(i4, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((l) it.next()).e();
            }
            this.f436b = false;
            y(true);
        } catch (Throwable th) {
            this.f436b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        u uVar = this.f453v;
        if (uVar != null) {
            sb.append(uVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f453v)));
            sb.append("}");
        } else {
            w wVar = this.f451t;
            if (wVar != null) {
                sb.append(wVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f451t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u() {
        if (this.H) {
            this.H = false;
            a0();
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String f4 = w0.f(str, "    ");
        androidx.emoji2.text.w wVar = this.c;
        ArrayList arrayList = (ArrayList) wVar.f368f;
        String f5 = w0.f(str, "    ");
        HashMap hashMap = (HashMap) wVar.g;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (q0 q0Var : hashMap.values()) {
                printWriter.print(str);
                if (q0Var != null) {
                    u uVar = q0Var.c;
                    printWriter.println(uVar);
                    uVar.getClass();
                    printWriter.print(f5);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(uVar.A));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(uVar.B));
                    printWriter.print(" mTag=");
                    printWriter.println(uVar.C);
                    printWriter.print(f5);
                    printWriter.print("mState=");
                    printWriter.print(uVar.f520f);
                    printWriter.print(" mWho=");
                    printWriter.print(uVar.f522j);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(uVar.f534v);
                    printWriter.print(f5);
                    printWriter.print("mAdded=");
                    printWriter.print(uVar.f528p);
                    printWriter.print(" mRemoving=");
                    printWriter.print(uVar.f529q);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(uVar.f530r);
                    printWriter.print(" mInLayout=");
                    printWriter.println(uVar.f531s);
                    printWriter.print(f5);
                    printWriter.print("mHidden=");
                    printWriter.print(uVar.D);
                    printWriter.print(" mDetached=");
                    printWriter.print(uVar.E);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(uVar.G);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(f5);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(uVar.F);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(uVar.L);
                    if (uVar.f535w != null) {
                        printWriter.print(f5);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(uVar.f535w);
                    }
                    if (uVar.f536x != null) {
                        printWriter.print(f5);
                        printWriter.print("mHost=");
                        printWriter.println(uVar.f536x);
                    }
                    if (uVar.f538z != null) {
                        printWriter.print(f5);
                        printWriter.print("mParentFragment=");
                        printWriter.println(uVar.f538z);
                    }
                    if (uVar.f523k != null) {
                        printWriter.print(f5);
                        printWriter.print("mArguments=");
                        printWriter.println(uVar.f523k);
                    }
                    if (uVar.g != null) {
                        printWriter.print(f5);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(uVar.g);
                    }
                    if (uVar.h != null) {
                        printWriter.print(f5);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(uVar.h);
                    }
                    if (uVar.f521i != null) {
                        printWriter.print(f5);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(uVar.f521i);
                    }
                    Object obj = uVar.f524l;
                    if (obj == null) {
                        k0 k0Var = uVar.f535w;
                        obj = (k0Var == null || (str2 = uVar.f525m) == null) ? null : k0Var.c.d(str2);
                    }
                    if (obj != null) {
                        printWriter.print(f5);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(uVar.f526n);
                    }
                    printWriter.print(f5);
                    printWriter.print("mPopDirection=");
                    s sVar = uVar.M;
                    printWriter.println(sVar == null ? false : sVar.f509a);
                    s sVar2 = uVar.M;
                    if ((sVar2 == null ? 0 : sVar2.f510b) != 0) {
                        printWriter.print(f5);
                        printWriter.print("getEnterAnim=");
                        s sVar3 = uVar.M;
                        printWriter.println(sVar3 == null ? 0 : sVar3.f510b);
                    }
                    s sVar4 = uVar.M;
                    if ((sVar4 == null ? 0 : sVar4.c) != 0) {
                        printWriter.print(f5);
                        printWriter.print("getExitAnim=");
                        s sVar5 = uVar.M;
                        printWriter.println(sVar5 == null ? 0 : sVar5.c);
                    }
                    s sVar6 = uVar.M;
                    if ((sVar6 == null ? 0 : sVar6.f511d) != 0) {
                        printWriter.print(f5);
                        printWriter.print("getPopEnterAnim=");
                        s sVar7 = uVar.M;
                        printWriter.println(sVar7 == null ? 0 : sVar7.f511d);
                    }
                    s sVar8 = uVar.M;
                    if ((sVar8 == null ? 0 : sVar8.f512e) != 0) {
                        printWriter.print(f5);
                        printWriter.print("getPopExitAnim=");
                        s sVar9 = uVar.M;
                        printWriter.println(sVar9 == null ? 0 : sVar9.f512e);
                    }
                    if (uVar.I != null) {
                        printWriter.print(f5);
                        printWriter.print("mContainer=");
                        printWriter.println(uVar.I);
                    }
                    if (uVar.J != null) {
                        printWriter.print(f5);
                        printWriter.print("mView=");
                        printWriter.println(uVar.J);
                    }
                    if (uVar.h() != null) {
                        androidx.emoji2.text.s sVar10 = new androidx.emoji2.text.s(uVar.e(), y0.a.f3611d);
                        String canonicalName = y0.a.class.getCanonicalName();
                        if (canonicalName == null) {
                            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                        }
                        n.k kVar = ((y0.a) sVar10.e("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), y0.a.class)).c;
                        if (kVar.h > 0) {
                            printWriter.print(f5);
                            printWriter.println("Loaders:");
                            if (kVar.h > 0) {
                                if (kVar.g[0] != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(f5);
                                printWriter.print("  #");
                                printWriter.print(kVar.f2936f[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(f5);
                    printWriter.println("Child " + uVar.f537y + ":");
                    uVar.f537y.v(w0.f(f5, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i4 = 0; i4 < size3; i4++) {
                u uVar2 = (u) arrayList.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(uVar2.toString());
            }
        }
        ArrayList arrayList2 = this.f438e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i5 = 0; i5 < size2; i5++) {
                u uVar3 = (u) this.f438e.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(uVar3.toString());
            }
        }
        ArrayList arrayList3 = this.f437d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i6 = 0; i6 < size; i6++) {
                a aVar = (a) this.f437d.get(i6);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.d(f4, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f440i.get());
        synchronized (this.f435a) {
            try {
                int size4 = this.f435a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i7 = 0; i7 < size4; i7++) {
                        Object obj2 = (i0) this.f435a.get(i7);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i7);
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
        printWriter.println(this.f451t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f452u);
        if (this.f453v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f453v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f450s);
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

    public final void w(i0 i0Var, boolean z3) {
        if (!z3) {
            if (this.f451t == null) {
                if (!this.G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.E || this.F) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f435a) {
            try {
                if (this.f451t == null) {
                    if (!z3) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f435a.add(i0Var);
                    U();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(boolean z3) {
        if (this.f436b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f451t == null) {
            if (!this.G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f451t.f549m.getLooper()) {
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

    public final boolean y(boolean z3) {
        boolean z4;
        x(z3);
        boolean z5 = false;
        while (true) {
            ArrayList arrayList = this.I;
            ArrayList arrayList2 = this.J;
            synchronized (this.f435a) {
                if (this.f435a.isEmpty()) {
                    z4 = false;
                } else {
                    try {
                        int size = this.f435a.size();
                        z4 = false;
                        for (int i4 = 0; i4 < size; i4++) {
                            z4 |= ((i0) this.f435a.get(i4)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z4) {
                c0();
                u();
                ((HashMap) this.c.g).values().removeAll(Collections.singleton(null));
                return z5;
            }
            z5 = true;
            this.f436b = true;
            try {
                R(this.I, this.J);
            } finally {
                d();
            }
        }
    }

    public final void z(ArrayList arrayList, ArrayList arrayList2, int i4, int i5) {
        ViewGroup viewGroup;
        boolean z3;
        int i6;
        boolean z4;
        boolean z5;
        int i7;
        int i8;
        boolean z6;
        boolean z7;
        int i9;
        androidx.emoji2.text.w wVar = this.c;
        boolean z8 = ((a) arrayList.get(i4)).f389o;
        ArrayList arrayList3 = this.K;
        if (arrayList3 == null) {
            this.K = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.K.addAll(wVar.j());
        u uVar = this.f454w;
        int i10 = i4;
        boolean z9 = false;
        while (true) {
            int i11 = 1;
            if (i10 >= i5) {
                boolean z10 = z8;
                this.K.clear();
                if (!z10 && this.f450s >= 1) {
                    for (int i12 = i4; i12 < i5; i12++) {
                        ArrayList arrayList4 = ((a) arrayList.get(i12)).f378a;
                        int size = arrayList4.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList4.get(i13);
                            i13++;
                            u uVar2 = ((r0) obj).f504b;
                            if (uVar2 != null && uVar2.f535w != null) {
                                wVar.l(f(uVar2));
                            }
                        }
                    }
                }
                for (int i14 = i4; i14 < i5; i14++) {
                    a aVar = (a) arrayList.get(i14);
                    if (((Boolean) arrayList2.get(i14)).booleanValue()) {
                        aVar.c(-1);
                        k0 k0Var = aVar.f390p;
                        ArrayList arrayList5 = aVar.f378a;
                        boolean z11 = true;
                        for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
                            r0 r0Var = (r0) arrayList5.get(size2);
                            u uVar3 = r0Var.f504b;
                            if (uVar3 != null) {
                                if (uVar3.M != null) {
                                    uVar3.d().f509a = z11;
                                }
                                int i15 = aVar.f382f;
                                int i16 = 8194;
                                int i17 = 4097;
                                if (i15 != 4097) {
                                    if (i15 != 8194) {
                                        i16 = 4100;
                                        i17 = 8197;
                                        if (i15 != 8197) {
                                            if (i15 == 4099) {
                                                i16 = 4099;
                                            } else if (i15 != 4100) {
                                                i16 = 0;
                                            }
                                        }
                                    }
                                    i16 = i17;
                                }
                                if (uVar3.M != null || i16 != 0) {
                                    uVar3.d();
                                    uVar3.M.f513f = i16;
                                }
                                uVar3.d();
                                uVar3.M.getClass();
                            }
                            switch (r0Var.f503a) {
                                case 1:
                                    uVar3.E(r0Var.f505d, r0Var.f506e, r0Var.f507f, r0Var.g);
                                    z11 = true;
                                    k0Var.V(uVar3, true);
                                    k0Var.Q(uVar3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + r0Var.f503a);
                                case 3:
                                    uVar3.E(r0Var.f505d, r0Var.f506e, r0Var.f507f, r0Var.g);
                                    k0Var.a(uVar3);
                                    z11 = true;
                                case 4:
                                    uVar3.E(r0Var.f505d, r0Var.f506e, r0Var.f507f, r0Var.g);
                                    k0Var.getClass();
                                    Z(uVar3);
                                    z11 = true;
                                case 5:
                                    uVar3.E(r0Var.f505d, r0Var.f506e, r0Var.f507f, r0Var.g);
                                    k0Var.V(uVar3, true);
                                    k0Var.F(uVar3);
                                    z11 = true;
                                case 6:
                                    uVar3.E(r0Var.f505d, r0Var.f506e, r0Var.f507f, r0Var.g);
                                    k0Var.c(uVar3);
                                    z11 = true;
                                case 7:
                                    uVar3.E(r0Var.f505d, r0Var.f506e, r0Var.f507f, r0Var.g);
                                    k0Var.V(uVar3, true);
                                    k0Var.g(uVar3);
                                    z11 = true;
                                case 8:
                                    k0Var.X(null);
                                    z11 = true;
                                case 9:
                                    k0Var.X(uVar3);
                                    z11 = true;
                                case 10:
                                    k0Var.W(uVar3, r0Var.h);
                                    z11 = true;
                            }
                        }
                    } else {
                        aVar.c(1);
                        k0 k0Var2 = aVar.f390p;
                        ArrayList arrayList6 = aVar.f378a;
                        int size3 = arrayList6.size();
                        for (int i18 = 0; i18 < size3; i18++) {
                            r0 r0Var2 = (r0) arrayList6.get(i18);
                            u uVar4 = r0Var2.f504b;
                            if (uVar4 != null) {
                                if (uVar4.M != null) {
                                    uVar4.d().f509a = false;
                                }
                                int i19 = aVar.f382f;
                                if (uVar4.M != null || i19 != 0) {
                                    uVar4.d();
                                    uVar4.M.f513f = i19;
                                }
                                uVar4.d();
                                uVar4.M.getClass();
                            }
                            switch (r0Var2.f503a) {
                                case 1:
                                    uVar4.E(r0Var2.f505d, r0Var2.f506e, r0Var2.f507f, r0Var2.g);
                                    k0Var2.V(uVar4, false);
                                    k0Var2.a(uVar4);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + r0Var2.f503a);
                                case 3:
                                    uVar4.E(r0Var2.f505d, r0Var2.f506e, r0Var2.f507f, r0Var2.g);
                                    k0Var2.Q(uVar4);
                                case 4:
                                    uVar4.E(r0Var2.f505d, r0Var2.f506e, r0Var2.f507f, r0Var2.g);
                                    k0Var2.F(uVar4);
                                case 5:
                                    uVar4.E(r0Var2.f505d, r0Var2.f506e, r0Var2.f507f, r0Var2.g);
                                    k0Var2.V(uVar4, false);
                                    Z(uVar4);
                                case 6:
                                    uVar4.E(r0Var2.f505d, r0Var2.f506e, r0Var2.f507f, r0Var2.g);
                                    k0Var2.g(uVar4);
                                case 7:
                                    uVar4.E(r0Var2.f505d, r0Var2.f506e, r0Var2.f507f, r0Var2.g);
                                    k0Var2.V(uVar4, false);
                                    k0Var2.c(uVar4);
                                case 8:
                                    k0Var2.X(uVar4);
                                case 9:
                                    k0Var2.X(null);
                                case 10:
                                    k0Var2.W(uVar4, r0Var2.f508i);
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i5 - 1)).booleanValue();
                for (int i20 = i4; i20 < i5; i20++) {
                    a aVar2 = (a) arrayList.get(i20);
                    if (booleanValue) {
                        for (int size4 = aVar2.f378a.size() - 1; size4 >= 0; size4--) {
                            u uVar5 = ((r0) aVar2.f378a.get(size4)).f504b;
                            if (uVar5 != null) {
                                f(uVar5).k();
                            }
                        }
                    } else {
                        ArrayList arrayList7 = aVar2.f378a;
                        int size5 = arrayList7.size();
                        int i21 = 0;
                        while (i21 < size5) {
                            Object obj2 = arrayList7.get(i21);
                            i21++;
                            u uVar6 = ((r0) obj2).f504b;
                            if (uVar6 != null) {
                                f(uVar6).k();
                            }
                        }
                    }
                }
                L(this.f450s, true);
                HashSet hashSet = new HashSet();
                for (int i22 = i4; i22 < i5; i22++) {
                    ArrayList arrayList8 = ((a) arrayList.get(i22)).f378a;
                    int size6 = arrayList8.size();
                    int i23 = 0;
                    while (i23 < size6) {
                        Object obj3 = arrayList8.get(i23);
                        i23++;
                        u uVar7 = ((r0) obj3).f504b;
                        if (uVar7 != null && (viewGroup = uVar7.I) != null) {
                            hashSet.add(l.f(viewGroup, E()));
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    l lVar = (l) it.next();
                    lVar.f460d = booleanValue;
                    synchronized (lVar.f459b) {
                        try {
                            lVar.g();
                            lVar.f461e = false;
                            int size7 = lVar.f459b.size() - 1;
                            while (true) {
                                if (size7 >= 0) {
                                    v0 v0Var = (v0) lVar.f459b.get(size7);
                                    int c = w0.c(v0Var.c.J);
                                    if (v0Var.f542a != 2 || c == 2) {
                                        size7--;
                                    } else {
                                        s sVar = v0Var.c.M;
                                        lVar.f461e = false;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    lVar.c();
                }
                for (int i24 = i4; i24 < i5; i24++) {
                    a aVar3 = (a) arrayList.get(i24);
                    if (((Boolean) arrayList2.get(i24)).booleanValue() && aVar3.f392r >= 0) {
                        aVar3.f392r = -1;
                    }
                    aVar3.getClass();
                }
                return;
            }
            a aVar4 = (a) arrayList.get(i10);
            if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                z3 = z8;
                i6 = i10;
                z4 = z9;
                int i25 = 1;
                ArrayList arrayList9 = this.K;
                ArrayList arrayList10 = aVar4.f378a;
                int size8 = arrayList10.size() - 1;
                while (size8 >= 0) {
                    r0 r0Var3 = (r0) arrayList10.get(size8);
                    int i26 = r0Var3.f503a;
                    if (i26 != i25) {
                        if (i26 != 3) {
                            switch (i26) {
                                case 8:
                                    uVar = null;
                                    break;
                                case 9:
                                    uVar = r0Var3.f504b;
                                    break;
                                case 10:
                                    r0Var3.f508i = r0Var3.h;
                                    break;
                            }
                            size8--;
                            i25 = 1;
                        }
                        arrayList9.add(r0Var3.f504b);
                        size8--;
                        i25 = 1;
                    }
                    arrayList9.remove(r0Var3.f504b);
                    size8--;
                    i25 = 1;
                }
            } else {
                ArrayList arrayList11 = this.K;
                ArrayList arrayList12 = aVar4.f378a;
                int i27 = 0;
                while (i27 < arrayList12.size()) {
                    r0 r0Var4 = (r0) arrayList12.get(i27);
                    int i28 = r0Var4.f503a;
                    if (i28 != i11) {
                        z5 = z8;
                        if (i28 != 2) {
                            if (i28 == 3 || i28 == 6) {
                                arrayList11.remove(r0Var4.f504b);
                                u uVar8 = r0Var4.f504b;
                                if (uVar8 == uVar) {
                                    arrayList12.add(i27, new r0(9, uVar8));
                                    i27++;
                                    i8 = i10;
                                    z6 = z9;
                                    i7 = 1;
                                    uVar = null;
                                }
                            } else if (i28 == 7) {
                                i7 = 1;
                            } else if (i28 == 8) {
                                arrayList12.add(i27, new r0(9, uVar, 0));
                                r0Var4.c = true;
                                i27++;
                                uVar = r0Var4.f504b;
                            }
                            i8 = i10;
                            z6 = z9;
                            i7 = 1;
                        } else {
                            u uVar9 = r0Var4.f504b;
                            int i29 = uVar9.B;
                            int size9 = arrayList11.size() - 1;
                            boolean z12 = false;
                            while (size9 >= 0) {
                                int i30 = size9;
                                u uVar10 = (u) arrayList11.get(size9);
                                int i31 = i10;
                                if (uVar10.B != i29) {
                                    z7 = z9;
                                } else if (uVar10 == uVar9) {
                                    z7 = z9;
                                    z12 = true;
                                } else {
                                    if (uVar10 == uVar) {
                                        z7 = z9;
                                        i9 = 0;
                                        arrayList12.add(i27, new r0(9, uVar10, 0));
                                        i27++;
                                        uVar = null;
                                    } else {
                                        z7 = z9;
                                        i9 = 0;
                                    }
                                    r0 r0Var5 = new r0(3, uVar10, i9);
                                    r0Var5.f505d = r0Var4.f505d;
                                    r0Var5.f507f = r0Var4.f507f;
                                    r0Var5.f506e = r0Var4.f506e;
                                    r0Var5.g = r0Var4.g;
                                    arrayList12.add(i27, r0Var5);
                                    arrayList11.remove(uVar10);
                                    i27++;
                                    uVar = uVar;
                                }
                                size9 = i30 - 1;
                                z9 = z7;
                                i10 = i31;
                            }
                            i8 = i10;
                            z6 = z9;
                            i7 = 1;
                            if (z12) {
                                arrayList12.remove(i27);
                                i27--;
                            } else {
                                r0Var4.f503a = 1;
                                r0Var4.c = true;
                                arrayList11.add(uVar9);
                            }
                        }
                        i27 += i7;
                        i11 = i7;
                        z8 = z5;
                        z9 = z6;
                        i10 = i8;
                    } else {
                        z5 = z8;
                        i7 = i11;
                    }
                    i8 = i10;
                    z6 = z9;
                    arrayList11.add(r0Var4.f504b);
                    i27 += i7;
                    i11 = i7;
                    z8 = z5;
                    z9 = z6;
                    i10 = i8;
                }
                z3 = z8;
                i6 = i10;
                z4 = z9;
            }
            z9 = z4 || aVar4.g;
            i10 = i6 + 1;
            z8 = z3;
        }
    }
}
