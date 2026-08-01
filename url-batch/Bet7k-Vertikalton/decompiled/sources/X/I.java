package X;

import K.C0012l;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.EnumC0069m;
import com.shotwins.games.R;
import g.AbstractActivityC0125i;
import h0.C0132d;
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

/* loaded from: classes.dex */
public final class I {

    /* renamed from: A, reason: collision with root package name */
    public B.j f799A;

    /* renamed from: B, reason: collision with root package name */
    public B.j f800B;

    /* renamed from: C, reason: collision with root package name */
    public ArrayDeque f801C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f802D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f803E;
    public boolean F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f804G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f805H;

    /* renamed from: I, reason: collision with root package name */
    public ArrayList f806I;

    /* renamed from: J, reason: collision with root package name */
    public ArrayList f807J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList f808K;

    /* renamed from: L, reason: collision with root package name */
    public L f809L;

    /* renamed from: M, reason: collision with root package name */
    public final K0.B f810M;

    /* renamed from: b, reason: collision with root package name */
    public boolean f812b;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f814e;

    /* renamed from: g, reason: collision with root package name */
    public a.x f816g;

    /* renamed from: l, reason: collision with root package name */
    public final B.j f819l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f820m;

    /* renamed from: n, reason: collision with root package name */
    public final y f821n;

    /* renamed from: o, reason: collision with root package name */
    public final y f822o;

    /* renamed from: p, reason: collision with root package name */
    public final y f823p;

    /* renamed from: q, reason: collision with root package name */
    public final y f824q;

    /* renamed from: r, reason: collision with root package name */
    public final B f825r;

    /* renamed from: s, reason: collision with root package name */
    public int f826s;

    /* renamed from: t, reason: collision with root package name */
    public C0051u f827t;

    /* renamed from: u, reason: collision with root package name */
    public q1.d f828u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractComponentCallbacksC0048q f829v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractComponentCallbacksC0048q f830w;

    /* renamed from: x, reason: collision with root package name */
    public final C f831x;

    /* renamed from: y, reason: collision with root package name */
    public final H0.e f832y;

    /* renamed from: z, reason: collision with root package name */
    public B.j f833z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f811a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final T.t f813c = new T.t(2);

    /* renamed from: f, reason: collision with root package name */
    public final x f815f = new x(this);
    public final A h = new A(this);
    public final AtomicInteger i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map f817j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map f818k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [X.y] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.y] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.y] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.y] */
    public I() {
        Collections.synchronizedMap(new HashMap());
        this.f819l = new B.j(this);
        this.f820m = new CopyOnWriteArrayList();
        final int i = 0;
        this.f821n = new J.a(this) { // from class: X.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1008b;

            {
                this.f1008b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        I i2 = this.f1008b;
                        if (i2.G()) {
                            i2.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i3 = this.f1008b;
                        if (i3.G() && num.intValue() == 80) {
                            i3.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i4 = this.f1008b;
                        if (i4.G()) {
                            i4.m(fVar.f4209a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1008b;
                        if (i5.G()) {
                            i5.r(gVar.f4210a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f822o = new J.a(this) { // from class: X.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1008b;

            {
                this.f1008b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i2) {
                    case 0:
                        I i22 = this.f1008b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i3 = this.f1008b;
                        if (i3.G() && num.intValue() == 80) {
                            i3.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i4 = this.f1008b;
                        if (i4.G()) {
                            i4.m(fVar.f4209a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1008b;
                        if (i5.G()) {
                            i5.r(gVar.f4210a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.f823p = new J.a(this) { // from class: X.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1008b;

            {
                this.f1008b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i3) {
                    case 0:
                        I i22 = this.f1008b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i32 = this.f1008b;
                        if (i32.G() && num.intValue() == 80) {
                            i32.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i4 = this.f1008b;
                        if (i4.G()) {
                            i4.m(fVar.f4209a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1008b;
                        if (i5.G()) {
                            i5.r(gVar.f4210a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.f824q = new J.a(this) { // from class: X.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1008b;

            {
                this.f1008b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i4) {
                    case 0:
                        I i22 = this.f1008b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i32 = this.f1008b;
                        if (i32.G() && num.intValue() == 80) {
                            i32.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i42 = this.f1008b;
                        if (i42.G()) {
                            i42.m(fVar.f4209a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1008b;
                        if (i5.G()) {
                            i5.r(gVar.f4210a, false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f825r = new B(this);
        this.f826s = -1;
        this.f831x = new C(this);
        this.f832y = new H0.e(12);
        this.f801C = new ArrayDeque();
        this.f810M = new K0.B(5, this);
    }

    public static boolean F(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        abstractComponentCallbacksC0048q.getClass();
        Iterator it = abstractComponentCallbacksC0048q.f984t.f813c.j().iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = (AbstractComponentCallbacksC0048q) it.next();
            if (abstractComponentCallbacksC0048q2 != null) {
                z2 = F(abstractComponentCallbacksC0048q2);
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public static boolean H(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (abstractComponentCallbacksC0048q == null) {
            return true;
        }
        return abstractComponentCallbacksC0048q.f952B && (abstractComponentCallbacksC0048q.f982r == null || H(abstractComponentCallbacksC0048q.f985u));
    }

    public static boolean I(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (abstractComponentCallbacksC0048q == null) {
            return true;
        }
        I i = abstractComponentCallbacksC0048q.f982r;
        return abstractComponentCallbacksC0048q.equals(i.f830w) && I(i.f829v);
    }

    public static void X(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0048q);
        }
        if (abstractComponentCallbacksC0048q.f989y) {
            abstractComponentCallbacksC0048q.f989y = false;
            abstractComponentCallbacksC0048q.f958I = !abstractComponentCallbacksC0048q.f958I;
        }
    }

    public final AbstractComponentCallbacksC0048q A(int i) {
        T.t tVar = this.f813c;
        ArrayList arrayList = (ArrayList) tVar.f747a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = (AbstractComponentCallbacksC0048q) arrayList.get(size);
            if (abstractComponentCallbacksC0048q != null && abstractComponentCallbacksC0048q.f986v == i) {
                return abstractComponentCallbacksC0048q;
            }
        }
        for (O o2 : ((HashMap) tVar.f748b).values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = o2.f858c;
                if (abstractComponentCallbacksC0048q2.f986v == i) {
                    return abstractComponentCallbacksC0048q2;
                }
            }
        }
        return null;
    }

    public final ViewGroup B(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        ViewGroup viewGroup = abstractComponentCallbacksC0048q.f954D;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0048q.f987w > 0 && this.f828u.e0()) {
            View d02 = this.f828u.d0(abstractComponentCallbacksC0048q.f987w);
            if (d02 instanceof ViewGroup) {
                return (ViewGroup) d02;
            }
        }
        return null;
    }

    public final C C() {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f829v;
        return abstractComponentCallbacksC0048q != null ? abstractComponentCallbacksC0048q.f982r.C() : this.f831x;
    }

    public final H0.e D() {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f829v;
        return abstractComponentCallbacksC0048q != null ? abstractComponentCallbacksC0048q.f982r.D() : this.f832y;
    }

    public final void E(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0048q);
        }
        if (abstractComponentCallbacksC0048q.f989y) {
            return;
        }
        abstractComponentCallbacksC0048q.f989y = true;
        abstractComponentCallbacksC0048q.f958I = true ^ abstractComponentCallbacksC0048q.f958I;
        W(abstractComponentCallbacksC0048q);
    }

    public final boolean G() {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f829v;
        if (abstractComponentCallbacksC0048q == null) {
            return true;
        }
        return abstractComponentCallbacksC0048q.m() && this.f829v.j().G();
    }

    public final void J(int i, boolean z2) {
        HashMap hashMap;
        C0051u c0051u;
        if (this.f827t == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i != this.f826s) {
            this.f826s = i;
            T.t tVar = this.f813c;
            Iterator it = ((ArrayList) tVar.f747a).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = (HashMap) tVar.f748b;
                if (!hasNext) {
                    break;
                }
                O o2 = (O) hashMap.get(((AbstractComponentCallbacksC0048q) it.next()).f971e);
                if (o2 != null) {
                    o2.k();
                }
            }
            for (O o3 : hashMap.values()) {
                if (o3 != null) {
                    o3.k();
                    AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o3.f858c;
                    if (abstractComponentCallbacksC0048q.f976l && !abstractComponentCallbacksC0048q.o()) {
                        tVar.n(o3);
                    }
                }
            }
            Y();
            if (this.f802D && (c0051u = this.f827t) != null && this.f826s == 7) {
                c0051u.i.invalidateOptionsMenu();
                this.f802D = false;
            }
        }
    }

    public final void K() {
        if (this.f827t == null) {
            return;
        }
        this.f803E = false;
        this.F = false;
        this.f809L.f845g = false;
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f813c.k()) {
            if (abstractComponentCallbacksC0048q != null) {
                abstractComponentCallbacksC0048q.f984t.K();
            }
        }
    }

    public final boolean L() {
        return M(-1, 0);
    }

    public final boolean M(int i, int i2) {
        y(false);
        x(true);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f830w;
        if (abstractComponentCallbacksC0048q != null && i < 0 && abstractComponentCallbacksC0048q.g().L()) {
            return true;
        }
        boolean N2 = N(this.f806I, this.f807J, i, i2);
        if (N2) {
            this.f812b = true;
            try {
                P(this.f806I, this.f807J);
            } finally {
                d();
            }
        }
        a0();
        u();
        ((HashMap) this.f813c.f748b).values().removeAll(Collections.singleton(null));
        return N2;
    }

    public final boolean N(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z2 = (i2 & 1) != 0;
        ArrayList arrayList3 = this.d;
        int i3 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                i3 = z2 ? 0 : this.d.size() - 1;
            } else {
                int size = this.d.size() - 1;
                while (size >= 0) {
                    C0032a c0032a = (C0032a) this.d.get(size);
                    if (i >= 0 && i == c0032a.f894r) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z2) {
                        while (size > 0) {
                            C0032a c0032a2 = (C0032a) this.d.get(size - 1);
                            if (i < 0 || i != c0032a2.f894r) {
                                break;
                            }
                            size--;
                        }
                    } else if (size != this.d.size() - 1) {
                        size++;
                    }
                }
                i3 = size;
            }
        }
        if (i3 < 0) {
            return false;
        }
        for (int size2 = this.d.size() - 1; size2 >= i3; size2--) {
            arrayList.add((C0032a) this.d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void O(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0048q + " nesting=" + abstractComponentCallbacksC0048q.f981q);
        }
        boolean o2 = abstractComponentCallbacksC0048q.o();
        if (abstractComponentCallbacksC0048q.f990z && o2) {
            return;
        }
        T.t tVar = this.f813c;
        synchronized (((ArrayList) tVar.f747a)) {
            ((ArrayList) tVar.f747a).remove(abstractComponentCallbacksC0048q);
        }
        abstractComponentCallbacksC0048q.f975k = false;
        if (F(abstractComponentCallbacksC0048q)) {
            this.f802D = true;
        }
        abstractComponentCallbacksC0048q.f976l = true;
        W(abstractComponentCallbacksC0048q);
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
        int i2 = 0;
        while (i < size) {
            if (!((C0032a) arrayList.get(i)).f891o) {
                if (i2 != i) {
                    z(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0032a) arrayList.get(i2)).f891o) {
                        i2++;
                    }
                }
                z(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            z(arrayList, arrayList2, i2, size);
        }
    }

    public final void Q(Parcelable parcelable) {
        int i;
        B.j jVar;
        int i2;
        O o2;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f827t.f998f.getClassLoader());
                this.f818k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f827t.f998f.getClassLoader());
                arrayList.add((N) bundle.getParcelable("state"));
            }
        }
        T.t tVar = this.f813c;
        HashMap hashMap = (HashMap) tVar.f749c;
        hashMap.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            N n2 = (N) it.next();
            hashMap.put(n2.f847b, n2);
        }
        J j2 = (J) bundle3.getParcelable("state");
        if (j2 == null) {
            return;
        }
        HashMap hashMap2 = (HashMap) tVar.f748b;
        hashMap2.clear();
        Iterator it2 = j2.f834a.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            i = 2;
            jVar = this.f819l;
            if (!hasNext) {
                break;
            }
            N n3 = (N) ((HashMap) tVar.f749c).remove((String) it2.next());
            if (n3 != null) {
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = (AbstractComponentCallbacksC0048q) this.f809L.f841b.get(n3.f847b);
                if (abstractComponentCallbacksC0048q != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0048q);
                    }
                    o2 = new O(jVar, tVar, abstractComponentCallbacksC0048q, n3);
                } else {
                    o2 = new O(this.f819l, this.f813c, this.f827t.f998f.getClassLoader(), C(), n3);
                }
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = o2.f858c;
                abstractComponentCallbacksC0048q2.f982r = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0048q2.f971e + "): " + abstractComponentCallbacksC0048q2);
                }
                o2.m(this.f827t.f998f.getClassLoader());
                tVar.m(o2);
                o2.f859e = this.f826s;
            }
        }
        L l2 = this.f809L;
        l2.getClass();
        Iterator it3 = new ArrayList(l2.f841b.values()).iterator();
        while (it3.hasNext()) {
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q3 = (AbstractComponentCallbacksC0048q) it3.next();
            if (hashMap2.get(abstractComponentCallbacksC0048q3.f971e) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0048q3 + " that was not found in the set of active Fragments " + j2.f834a);
                }
                this.f809L.e(abstractComponentCallbacksC0048q3);
                abstractComponentCallbacksC0048q3.f982r = this;
                O o3 = new O(jVar, tVar, abstractComponentCallbacksC0048q3);
                o3.f859e = 1;
                o3.k();
                abstractComponentCallbacksC0048q3.f976l = true;
                o3.k();
            }
        }
        ArrayList<String> arrayList2 = j2.f835b;
        ((ArrayList) tVar.f747a).clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                AbstractComponentCallbacksC0048q d = tVar.d(str3);
                if (d == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str3 + ")");
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + d);
                }
                tVar.a(d);
            }
        }
        if (j2.f836c != null) {
            this.d = new ArrayList(j2.f836c.length);
            int i3 = 0;
            while (true) {
                C0033b[] c0033bArr = j2.f836c;
                if (i3 >= c0033bArr.length) {
                    break;
                }
                C0033b c0033b = c0033bArr[i3];
                c0033b.getClass();
                C0032a c0032a = new C0032a(this);
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    int[] iArr = c0033b.f895a;
                    if (i4 >= iArr.length) {
                        break;
                    }
                    P p2 = new P();
                    int i6 = i4 + 1;
                    p2.f860a = iArr[i4];
                    if (Log.isLoggable("FragmentManager", i)) {
                        Log.v("FragmentManager", "Instantiate " + c0032a + " op #" + i5 + " base fragment #" + iArr[i6]);
                    }
                    p2.h = EnumC0069m.values()[c0033b.f897c[i5]];
                    p2.i = EnumC0069m.values()[c0033b.d[i5]];
                    int i7 = i4 + 2;
                    p2.f862c = iArr[i6] != 0;
                    int i8 = iArr[i7];
                    p2.d = i8;
                    int i9 = iArr[i4 + 3];
                    p2.f863e = i9;
                    int i10 = i4 + 5;
                    int i11 = iArr[i4 + 4];
                    p2.f864f = i11;
                    i4 += 6;
                    int i12 = iArr[i10];
                    p2.f865g = i12;
                    c0032a.f881b = i8;
                    c0032a.f882c = i9;
                    c0032a.d = i11;
                    c0032a.f883e = i12;
                    c0032a.b(p2);
                    i5++;
                    i = 2;
                }
                c0032a.f884f = c0033b.f898e;
                c0032a.h = c0033b.f899f;
                c0032a.f885g = true;
                c0032a.i = c0033b.h;
                c0032a.f886j = c0033b.i;
                c0032a.f887k = c0033b.f901j;
                c0032a.f888l = c0033b.f902k;
                c0032a.f889m = c0033b.f903l;
                c0032a.f890n = c0033b.f904m;
                c0032a.f891o = c0033b.f905n;
                c0032a.f894r = c0033b.f900g;
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = c0033b.f896b;
                    if (i13 >= arrayList3.size()) {
                        break;
                    }
                    String str4 = (String) arrayList3.get(i13);
                    if (str4 != null) {
                        ((P) c0032a.f880a.get(i13)).f861b = tVar.d(str4);
                    }
                    i13++;
                }
                c0032a.c(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i3 + " (index " + c0032a.f894r + "): " + c0032a);
                    PrintWriter printWriter = new PrintWriter(new S());
                    c0032a.d("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(c0032a);
                i3++;
                i = 2;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.d = null;
        }
        this.i.set(j2.d);
        String str5 = j2.f837e;
        if (str5 != null) {
            AbstractComponentCallbacksC0048q d2 = tVar.d(str5);
            this.f830w = d2;
            q(d2);
        }
        ArrayList arrayList4 = j2.f838f;
        if (arrayList4 != null) {
            for (int i14 = i2; i14 < arrayList4.size(); i14++) {
                this.f817j.put((String) arrayList4.get(i14), (C0034c) j2.f839g.get(i14));
            }
        }
        this.f801C = new ArrayDeque(j2.h);
    }

    public final Bundle R() {
        int i;
        ArrayList arrayList;
        C0033b[] c0033bArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0040i c0040i = (C0040i) it.next();
            if (c0040i.f922e) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0040i.f922e = false;
                c0040i.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((C0040i) it2.next()).e();
        }
        y(true);
        this.f803E = true;
        this.f809L.f845g = true;
        T.t tVar = this.f813c;
        tVar.getClass();
        HashMap hashMap = (HashMap) tVar.f748b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (O o2 : hashMap.values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f858c;
                N n2 = new N(abstractComponentCallbacksC0048q);
                if (abstractComponentCallbacksC0048q.f968a <= -1 || n2.f855m != null) {
                    n2.f855m = abstractComponentCallbacksC0048q.f969b;
                } else {
                    Bundle bundle2 = new Bundle();
                    abstractComponentCallbacksC0048q.x(bundle2);
                    abstractComponentCallbacksC0048q.f965P.c(bundle2);
                    bundle2.putParcelable("android:support:fragments", abstractComponentCallbacksC0048q.f984t.R());
                    o2.f856a.o(false);
                    if (bundle2.isEmpty()) {
                        bundle2 = null;
                    }
                    if (abstractComponentCallbacksC0048q.f955E != null) {
                        o2.o();
                    }
                    if (abstractComponentCallbacksC0048q.f970c != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putSparseParcelableArray("android:view_state", abstractComponentCallbacksC0048q.f970c);
                    }
                    if (abstractComponentCallbacksC0048q.d != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBundle("android:view_registry_state", abstractComponentCallbacksC0048q.d);
                    }
                    if (!abstractComponentCallbacksC0048q.f956G) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBoolean("android:user_visible_hint", abstractComponentCallbacksC0048q.f956G);
                    }
                    n2.f855m = bundle2;
                    if (abstractComponentCallbacksC0048q.h != null) {
                        if (bundle2 == null) {
                            n2.f855m = new Bundle();
                        }
                        n2.f855m.putString("android:target_state", abstractComponentCallbacksC0048q.h);
                        int i2 = abstractComponentCallbacksC0048q.i;
                        if (i2 != 0) {
                            n2.f855m.putInt("android:target_req_state", i2);
                        }
                    }
                }
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = o2.f858c;
                arrayList2.add(abstractComponentCallbacksC0048q2.f971e);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0048q2 + ": " + abstractComponentCallbacksC0048q2.f969b);
                }
            }
        }
        T.t tVar2 = this.f813c;
        tVar2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) tVar2.f749c).values());
        if (!arrayList3.isEmpty()) {
            T.t tVar3 = this.f813c;
            synchronized (((ArrayList) tVar3.f747a)) {
                try {
                    if (((ArrayList) tVar3.f747a).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) tVar3.f747a).size());
                        Iterator it3 = ((ArrayList) tVar3.f747a).iterator();
                        while (it3.hasNext()) {
                            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q3 = (AbstractComponentCallbacksC0048q) it3.next();
                            arrayList.add(abstractComponentCallbacksC0048q3.f971e);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0048q3.f971e + "): " + abstractComponentCallbacksC0048q3);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList4 = this.d;
            if (arrayList4 == null || (size = arrayList4.size()) <= 0) {
                c0033bArr = null;
            } else {
                c0033bArr = new C0033b[size];
                for (i = 0; i < size; i++) {
                    c0033bArr[i] = new C0033b((C0032a) this.d.get(i));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.d.get(i));
                    }
                }
            }
            J j2 = new J();
            j2.f837e = null;
            ArrayList arrayList5 = new ArrayList();
            j2.f838f = arrayList5;
            ArrayList arrayList6 = new ArrayList();
            j2.f839g = arrayList6;
            j2.f834a = arrayList2;
            j2.f835b = arrayList;
            j2.f836c = c0033bArr;
            j2.d = this.i.get();
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q4 = this.f830w;
            if (abstractComponentCallbacksC0048q4 != null) {
                j2.f837e = abstractComponentCallbacksC0048q4.f971e;
            }
            arrayList5.addAll(this.f817j.keySet());
            arrayList6.addAll(this.f817j.values());
            j2.h = new ArrayList(this.f801C);
            bundle.putParcelable("state", j2);
            for (String str : this.f818k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f818k.get(str));
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                N n3 = (N) it4.next();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("state", n3);
                bundle.putBundle("fragment_" + n3.f847b, bundle3);
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public final void S() {
        synchronized (this.f811a) {
            try {
                if (this.f811a.size() == 1) {
                    this.f827t.f999g.removeCallbacks(this.f810M);
                    this.f827t.f999g.post(this.f810M);
                    a0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void T(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q, boolean z2) {
        ViewGroup B2 = B(abstractComponentCallbacksC0048q);
        if (B2 == null || !(B2 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) B2).setDrawDisappearingViewsLast(!z2);
    }

    public final void U(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q, EnumC0069m enumC0069m) {
        if (abstractComponentCallbacksC0048q.equals(this.f813c.d(abstractComponentCallbacksC0048q.f971e)) && (abstractComponentCallbacksC0048q.f983s == null || abstractComponentCallbacksC0048q.f982r == this)) {
            abstractComponentCallbacksC0048q.f961L = enumC0069m;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0048q + " is not an active fragment of FragmentManager " + this);
    }

    public final void V(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (abstractComponentCallbacksC0048q != null) {
            if (!abstractComponentCallbacksC0048q.equals(this.f813c.d(abstractComponentCallbacksC0048q.f971e)) || (abstractComponentCallbacksC0048q.f983s != null && abstractComponentCallbacksC0048q.f982r != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0048q + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = this.f830w;
        this.f830w = abstractComponentCallbacksC0048q;
        q(abstractComponentCallbacksC0048q2);
        q(this.f830w);
    }

    public final void W(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        ViewGroup B2 = B(abstractComponentCallbacksC0048q);
        if (B2 != null) {
            C0047p c0047p = abstractComponentCallbacksC0048q.f957H;
            if ((c0047p == null ? 0 : c0047p.f945e) + (c0047p == null ? 0 : c0047p.d) + (c0047p == null ? 0 : c0047p.f944c) + (c0047p == null ? 0 : c0047p.f943b) > 0) {
                if (B2.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    B2.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0048q);
                }
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = (AbstractComponentCallbacksC0048q) B2.getTag(R.id.visible_removing_fragment_view_tag);
                C0047p c0047p2 = abstractComponentCallbacksC0048q.f957H;
                boolean z2 = c0047p2 != null ? c0047p2.f942a : false;
                if (abstractComponentCallbacksC0048q2.f957H == null) {
                    return;
                }
                abstractComponentCallbacksC0048q2.f().f942a = z2;
            }
        }
    }

    public final void Y() {
        Iterator it = this.f813c.h().iterator();
        while (it.hasNext()) {
            O o2 = (O) it.next();
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f858c;
            if (abstractComponentCallbacksC0048q.F) {
                if (this.f812b) {
                    this.f805H = true;
                } else {
                    abstractComponentCallbacksC0048q.F = false;
                    o2.k();
                }
            }
        }
    }

    public final void Z(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new S());
        C0051u c0051u = this.f827t;
        if (c0051u == null) {
            try {
                v("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
                throw illegalStateException;
            }
        }
        try {
            c0051u.i.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw illegalStateException;
        }
    }

    public final O a(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        String str = abstractComponentCallbacksC0048q.f960K;
        if (str != null) {
            Y.d.c(abstractComponentCallbacksC0048q, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0048q);
        }
        O f2 = f(abstractComponentCallbacksC0048q);
        abstractComponentCallbacksC0048q.f982r = this;
        T.t tVar = this.f813c;
        tVar.m(f2);
        if (!abstractComponentCallbacksC0048q.f990z) {
            tVar.a(abstractComponentCallbacksC0048q);
            abstractComponentCallbacksC0048q.f976l = false;
            if (abstractComponentCallbacksC0048q.f955E == null) {
                abstractComponentCallbacksC0048q.f958I = false;
            }
            if (F(abstractComponentCallbacksC0048q)) {
                this.f802D = true;
            }
        }
        return f2;
    }

    public final void a0() {
        synchronized (this.f811a) {
            try {
                if (!this.f811a.isEmpty()) {
                    A a2 = this.h;
                    a2.f787a = true;
                    a.w wVar = a2.f789c;
                    if (wVar != null) {
                        wVar.a();
                    }
                    return;
                }
                A a3 = this.h;
                ArrayList arrayList = this.d;
                a3.f787a = (arrayList != null ? arrayList.size() : 0) > 0 && I(this.f829v);
                a.w wVar2 = a3.f789c;
                if (wVar2 != null) {
                    wVar2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(C0051u c0051u, q1.d dVar, AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        String str;
        if (this.f827t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f827t = c0051u;
        this.f828u = dVar;
        this.f829v = abstractComponentCallbacksC0048q;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f820m;
        if (abstractComponentCallbacksC0048q != 0) {
            copyOnWriteArrayList.add(new D(abstractComponentCallbacksC0048q));
        } else if (c0051u != null) {
            copyOnWriteArrayList.add(c0051u);
        }
        if (this.f829v != null) {
            a0();
        }
        if (c0051u != null) {
            a.x i = c0051u.i.i();
            this.f816g = i;
            C0051u c0051u2 = abstractComponentCallbacksC0048q != 0 ? abstractComponentCallbacksC0048q : c0051u;
            i.getClass();
            A a2 = this.h;
            X0.d.e(a2, "onBackPressedCallback");
            androidx.lifecycle.t d = c0051u2.d();
            if (d.f1370c != EnumC0069m.f1360a) {
                a2.f788b.add(new a.u(i, d, a2));
                i.d();
                a2.f789c = new a.w(0, i);
            }
        }
        if (abstractComponentCallbacksC0048q != 0) {
            L l2 = abstractComponentCallbacksC0048q.f982r.f809L;
            HashMap hashMap = l2.f842c;
            L l3 = (L) hashMap.get(abstractComponentCallbacksC0048q.f971e);
            if (l3 == null) {
                l3 = new L(l2.f843e);
                hashMap.put(abstractComponentCallbacksC0048q.f971e, l3);
            }
            this.f809L = l3;
        } else if (c0051u != null) {
            this.f809L = (L) new B0.d(c0051u.i.c(), L.h).u(L.class);
        } else {
            this.f809L = new L(false);
        }
        L l4 = this.f809L;
        l4.f845g = this.f803E || this.F;
        this.f813c.d = l4;
        C0051u c0051u3 = this.f827t;
        if (c0051u3 != null && abstractComponentCallbacksC0048q == 0) {
            C0132d b2 = c0051u3.b();
            b2.e("android:support:fragments", new r(2, this));
            Bundle c2 = b2.c("android:support:fragments");
            if (c2 != null) {
                Q(c2);
            }
        }
        C0051u c0051u4 = this.f827t;
        if (c0051u4 != null) {
            AbstractActivityC0125i abstractActivityC0125i = c0051u4.i;
            if (abstractComponentCallbacksC0048q != 0) {
                str = abstractComponentCallbacksC0048q.f971e + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            String e2 = V.e(str2, "StartActivityForResult");
            E e3 = new E(2);
            z zVar = new z(this, 1);
            a.j jVar = abstractActivityC0125i.h;
            this.f833z = jVar.b(e2, e3, zVar);
            this.f799A = jVar.b(V.e(str2, "StartIntentSenderForResult"), new E(0), new z(this, 2));
            this.f800B = jVar.b(V.e(str2, "RequestPermissions"), new E(1), new z(this, 0));
        }
        C0051u c0051u5 = this.f827t;
        if (c0051u5 != null) {
            c0051u5.i.g(this.f821n);
        }
        C0051u c0051u6 = this.f827t;
        if (c0051u6 != null) {
            AbstractActivityC0125i abstractActivityC0125i2 = c0051u6.i;
            y yVar = this.f822o;
            abstractActivityC0125i2.getClass();
            X0.d.e(yVar, "listener");
            abstractActivityC0125i2.f1063j.add(yVar);
        }
        C0051u c0051u7 = this.f827t;
        if (c0051u7 != null) {
            AbstractActivityC0125i abstractActivityC0125i3 = c0051u7.i;
            y yVar2 = this.f823p;
            abstractActivityC0125i3.getClass();
            X0.d.e(yVar2, "listener");
            abstractActivityC0125i3.f1065l.add(yVar2);
        }
        C0051u c0051u8 = this.f827t;
        if (c0051u8 != null) {
            AbstractActivityC0125i abstractActivityC0125i4 = c0051u8.i;
            y yVar3 = this.f824q;
            abstractActivityC0125i4.getClass();
            X0.d.e(yVar3, "listener");
            abstractActivityC0125i4.f1066m.add(yVar3);
        }
        C0051u c0051u9 = this.f827t;
        if (c0051u9 == null || abstractComponentCallbacksC0048q != 0) {
            return;
        }
        AbstractActivityC0125i abstractActivityC0125i5 = c0051u9.i;
        B b3 = this.f825r;
        abstractActivityC0125i5.getClass();
        X0.d.e(b3, "provider");
        C0012l c0012l = abstractActivityC0125i5.f1059c;
        ((CopyOnWriteArrayList) c0012l.f432c).add(b3);
        ((Runnable) c0012l.f431b).run();
    }

    public final void c(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0048q);
        }
        if (abstractComponentCallbacksC0048q.f990z) {
            abstractComponentCallbacksC0048q.f990z = false;
            if (abstractComponentCallbacksC0048q.f975k) {
                return;
            }
            this.f813c.a(abstractComponentCallbacksC0048q);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0048q);
            }
            if (F(abstractComponentCallbacksC0048q)) {
                this.f802D = true;
            }
        }
    }

    public final void d() {
        this.f812b = false;
        this.f807J.clear();
        this.f806I.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f813c.h().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((O) it.next()).f858c.f954D;
            if (viewGroup != null) {
                hashSet.add(C0040i.f(viewGroup, D()));
            }
        }
        return hashSet;
    }

    public final O f(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        String str = abstractComponentCallbacksC0048q.f971e;
        T.t tVar = this.f813c;
        O o2 = (O) ((HashMap) tVar.f748b).get(str);
        if (o2 != null) {
            return o2;
        }
        O o3 = new O(this.f819l, tVar, abstractComponentCallbacksC0048q);
        o3.m(this.f827t.f998f.getClassLoader());
        o3.f859e = this.f826s;
        return o3;
    }

    public final void g(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0048q);
        }
        if (abstractComponentCallbacksC0048q.f990z) {
            return;
        }
        abstractComponentCallbacksC0048q.f990z = true;
        if (abstractComponentCallbacksC0048q.f975k) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0048q);
            }
            T.t tVar = this.f813c;
            synchronized (((ArrayList) tVar.f747a)) {
                ((ArrayList) tVar.f747a).remove(abstractComponentCallbacksC0048q);
            }
            abstractComponentCallbacksC0048q.f975k = false;
            if (F(abstractComponentCallbacksC0048q)) {
                this.f802D = true;
            }
            W(abstractComponentCallbacksC0048q);
        }
    }

    public final void h(boolean z2) {
        if (z2 && this.f827t != null) {
            Z(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f813c.k()) {
            if (abstractComponentCallbacksC0048q != null) {
                abstractComponentCallbacksC0048q.f953C = true;
                if (z2) {
                    abstractComponentCallbacksC0048q.f984t.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.f826s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f813c.k()) {
            if (abstractComponentCallbacksC0048q != null) {
                if (!abstractComponentCallbacksC0048q.f989y ? abstractComponentCallbacksC0048q.f984t.i() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.f826s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f813c.k()) {
            if (abstractComponentCallbacksC0048q != null && H(abstractComponentCallbacksC0048q)) {
                if (!abstractComponentCallbacksC0048q.f989y ? abstractComponentCallbacksC0048q.f984t.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0048q);
                    z2 = true;
                }
            }
        }
        if (this.f814e != null) {
            for (int i = 0; i < this.f814e.size(); i++) {
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = (AbstractComponentCallbacksC0048q) this.f814e.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0048q2)) {
                    abstractComponentCallbacksC0048q2.getClass();
                }
            }
        }
        this.f814e = arrayList;
        return z2;
    }

    public final void k() {
        boolean z2 = true;
        this.f804G = true;
        y(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0040i) it.next()).e();
        }
        C0051u c0051u = this.f827t;
        T.t tVar = this.f813c;
        if (c0051u != null) {
            z2 = ((L) tVar.d).f844f;
        } else {
            AbstractActivityC0125i abstractActivityC0125i = c0051u.f998f;
            if (abstractActivityC0125i != null) {
                z2 = true ^ abstractActivityC0125i.isChangingConfigurations();
            }
        }
        if (z2) {
            Iterator it2 = this.f817j.values().iterator();
            while (it2.hasNext()) {
                for (String str : ((C0034c) it2.next()).f906a) {
                    L l2 = (L) tVar.d;
                    l2.getClass();
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    l2.d(str);
                }
            }
        }
        t(-1);
        C0051u c0051u2 = this.f827t;
        if (c0051u2 != null) {
            AbstractActivityC0125i abstractActivityC0125i2 = c0051u2.i;
            y yVar = this.f822o;
            abstractActivityC0125i2.getClass();
            X0.d.e(yVar, "listener");
            abstractActivityC0125i2.f1063j.remove(yVar);
        }
        C0051u c0051u3 = this.f827t;
        if (c0051u3 != null) {
            AbstractActivityC0125i abstractActivityC0125i3 = c0051u3.i;
            y yVar2 = this.f821n;
            abstractActivityC0125i3.getClass();
            X0.d.e(yVar2, "listener");
            abstractActivityC0125i3.i.remove(yVar2);
        }
        C0051u c0051u4 = this.f827t;
        if (c0051u4 != null) {
            AbstractActivityC0125i abstractActivityC0125i4 = c0051u4.i;
            y yVar3 = this.f823p;
            abstractActivityC0125i4.getClass();
            X0.d.e(yVar3, "listener");
            abstractActivityC0125i4.f1065l.remove(yVar3);
        }
        C0051u c0051u5 = this.f827t;
        if (c0051u5 != null) {
            AbstractActivityC0125i abstractActivityC0125i5 = c0051u5.i;
            y yVar4 = this.f824q;
            abstractActivityC0125i5.getClass();
            X0.d.e(yVar4, "listener");
            abstractActivityC0125i5.f1066m.remove(yVar4);
        }
        C0051u c0051u6 = this.f827t;
        if (c0051u6 != null) {
            AbstractActivityC0125i abstractActivityC0125i6 = c0051u6.i;
            B b2 = this.f825r;
            abstractActivityC0125i6.getClass();
            X0.d.e(b2, "provider");
            C0012l c0012l = abstractActivityC0125i6.f1059c;
            ((CopyOnWriteArrayList) c0012l.f432c).remove(b2);
            if (((HashMap) c0012l.d).remove(b2) != null) {
                throw new ClassCastException();
            }
            ((Runnable) c0012l.f431b).run();
        }
        this.f827t = null;
        this.f828u = null;
        this.f829v = null;
        if (this.f816g != null) {
            Iterator it3 = this.h.f788b.iterator();
            while (it3.hasNext()) {
                ((a.c) it3.next()).cancel();
            }
            this.f816g = null;
        }
        B.j jVar = this.f833z;
        if (jVar != null) {
            jVar.H();
            this.f799A.H();
            this.f800B.H();
        }
    }

    public final void l(boolean z2) {
        if (z2 && this.f827t != null) {
            Z(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f813c.k()) {
            if (abstractComponentCallbacksC0048q != null) {
                abstractComponentCallbacksC0048q.f953C = true;
                if (z2) {
                    abstractComponentCallbacksC0048q.f984t.l(true);
                }
            }
        }
    }

    public final void m(boolean z2, boolean z3) {
        if (z3 && this.f827t != null) {
            Z(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f813c.k()) {
            if (abstractComponentCallbacksC0048q != null && z3) {
                abstractComponentCallbacksC0048q.f984t.m(z2, true);
            }
        }
    }

    public final void n() {
        Iterator it = this.f813c.j().iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = (AbstractComponentCallbacksC0048q) it.next();
            if (abstractComponentCallbacksC0048q != null) {
                abstractComponentCallbacksC0048q.n();
                abstractComponentCallbacksC0048q.f984t.n();
            }
        }
    }

    public final boolean o() {
        if (this.f826s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f813c.k()) {
            if (abstractComponentCallbacksC0048q != null) {
                if (!abstractComponentCallbacksC0048q.f989y ? abstractComponentCallbacksC0048q.f984t.o() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f826s < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f813c.k()) {
            if (abstractComponentCallbacksC0048q != null && !abstractComponentCallbacksC0048q.f989y) {
                abstractComponentCallbacksC0048q.f984t.p();
            }
        }
    }

    public final void q(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (abstractComponentCallbacksC0048q != null) {
            if (abstractComponentCallbacksC0048q.equals(this.f813c.d(abstractComponentCallbacksC0048q.f971e))) {
                abstractComponentCallbacksC0048q.f982r.getClass();
                boolean I2 = I(abstractComponentCallbacksC0048q);
                Boolean bool = abstractComponentCallbacksC0048q.f974j;
                if (bool == null || bool.booleanValue() != I2) {
                    abstractComponentCallbacksC0048q.f974j = Boolean.valueOf(I2);
                    I i = abstractComponentCallbacksC0048q.f984t;
                    i.a0();
                    i.q(i.f830w);
                }
            }
        }
    }

    public final void r(boolean z2, boolean z3) {
        if (z3 && this.f827t != null) {
            Z(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f813c.k()) {
            if (abstractComponentCallbacksC0048q != null && z3) {
                abstractComponentCallbacksC0048q.f984t.r(z2, true);
            }
        }
    }

    public final boolean s() {
        if (this.f826s < 1) {
            return false;
        }
        boolean z2 = false;
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f813c.k()) {
            if (abstractComponentCallbacksC0048q != null && H(abstractComponentCallbacksC0048q)) {
                if (!abstractComponentCallbacksC0048q.f989y ? abstractComponentCallbacksC0048q.f984t.s() : false) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final void t(int i) {
        try {
            this.f812b = true;
            for (O o2 : ((HashMap) this.f813c.f748b).values()) {
                if (o2 != null) {
                    o2.f859e = i;
                }
            }
            J(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0040i) it.next()).e();
            }
            this.f812b = false;
            y(true);
        } catch (Throwable th) {
            this.f812b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f829v;
        if (abstractComponentCallbacksC0048q != null) {
            sb.append(abstractComponentCallbacksC0048q.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f829v)));
            sb.append("}");
        } else {
            C0051u c0051u = this.f827t;
            if (c0051u != null) {
                sb.append(c0051u.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f827t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u() {
        if (this.f805H) {
            this.f805H = false;
            Y();
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String e2 = V.e(str, "    ");
        T.t tVar = this.f813c;
        tVar.getClass();
        String str3 = str + "    ";
        HashMap hashMap = (HashMap) tVar.f748b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (O o2 : hashMap.values()) {
                printWriter.print(str);
                if (o2 != null) {
                    AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f858c;
                    printWriter.println(abstractComponentCallbacksC0048q);
                    abstractComponentCallbacksC0048q.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0048q.f986v));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0048q.f987w));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0048q.f988x);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0048q.f968a);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0048q.f971e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0048q.f981q);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0048q.f975k);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0048q.f976l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0048q.f977m);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0048q.f978n);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0048q.f989y);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0048q.f990z);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0048q.f952B);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0048q.f951A);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0048q.f956G);
                    if (abstractComponentCallbacksC0048q.f982r != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0048q.f982r);
                    }
                    if (abstractComponentCallbacksC0048q.f983s != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0048q.f983s);
                    }
                    if (abstractComponentCallbacksC0048q.f985u != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0048q.f985u);
                    }
                    if (abstractComponentCallbacksC0048q.f972f != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0048q.f972f);
                    }
                    if (abstractComponentCallbacksC0048q.f969b != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0048q.f969b);
                    }
                    if (abstractComponentCallbacksC0048q.f970c != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0048q.f970c);
                    }
                    if (abstractComponentCallbacksC0048q.d != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0048q.d);
                    }
                    Object obj = abstractComponentCallbacksC0048q.f973g;
                    if (obj == null) {
                        I i = abstractComponentCallbacksC0048q.f982r;
                        obj = (i == null || (str2 = abstractComponentCallbacksC0048q.h) == null) ? null : i.f813c.d(str2);
                    }
                    if (obj != null) {
                        printWriter.print(str3);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC0048q.i);
                    }
                    printWriter.print(str3);
                    printWriter.print("mPopDirection=");
                    C0047p c0047p = abstractComponentCallbacksC0048q.f957H;
                    printWriter.println(c0047p == null ? false : c0047p.f942a);
                    C0047p c0047p2 = abstractComponentCallbacksC0048q.f957H;
                    if ((c0047p2 == null ? 0 : c0047p2.f943b) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        C0047p c0047p3 = abstractComponentCallbacksC0048q.f957H;
                        printWriter.println(c0047p3 == null ? 0 : c0047p3.f943b);
                    }
                    C0047p c0047p4 = abstractComponentCallbacksC0048q.f957H;
                    if ((c0047p4 == null ? 0 : c0047p4.f944c) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        C0047p c0047p5 = abstractComponentCallbacksC0048q.f957H;
                        printWriter.println(c0047p5 == null ? 0 : c0047p5.f944c);
                    }
                    C0047p c0047p6 = abstractComponentCallbacksC0048q.f957H;
                    if ((c0047p6 == null ? 0 : c0047p6.d) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        C0047p c0047p7 = abstractComponentCallbacksC0048q.f957H;
                        printWriter.println(c0047p7 == null ? 0 : c0047p7.d);
                    }
                    C0047p c0047p8 = abstractComponentCallbacksC0048q.f957H;
                    if ((c0047p8 == null ? 0 : c0047p8.f945e) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        C0047p c0047p9 = abstractComponentCallbacksC0048q.f957H;
                        printWriter.println(c0047p9 == null ? 0 : c0047p9.f945e);
                    }
                    if (abstractComponentCallbacksC0048q.f954D != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0048q.f954D);
                    }
                    if (abstractComponentCallbacksC0048q.f955E != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0048q.f955E);
                    }
                    if (abstractComponentCallbacksC0048q.h() != null) {
                        o.l lVar = ((c0.a) new B0.d(abstractComponentCallbacksC0048q.c(), c0.a.f1515c).u(c0.a.class)).f1516b;
                        if (lVar.f3353c > 0) {
                            printWriter.print(str3);
                            printWriter.println("Loaders:");
                            if (lVar.f3353c > 0) {
                                if (lVar.f3352b[0] != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(str3);
                                printWriter.print("  #");
                                printWriter.print(lVar.f3351a[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + abstractComponentCallbacksC0048q.f984t + ":");
                    abstractComponentCallbacksC0048q.f984t.v(V.e(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) tVar.f747a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size3; i2++) {
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = (AbstractComponentCallbacksC0048q) arrayList.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0048q2.toString());
            }
        }
        ArrayList arrayList2 = this.f814e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q3 = (AbstractComponentCallbacksC0048q) this.f814e.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0048q3.toString());
            }
        }
        ArrayList arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size; i4++) {
                C0032a c0032a = (C0032a) this.d.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(c0032a.toString());
                c0032a.d(e2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.f811a) {
            try {
                int size4 = this.f811a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i5 = 0; i5 < size4; i5++) {
                        Object obj2 = (G) this.f811a.get(i5);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i5);
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
        printWriter.println(this.f827t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f828u);
        if (this.f829v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f829v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f826s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f803E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f804G);
        if (this.f802D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f802D);
        }
    }

    public final void w(G g2, boolean z2) {
        if (!z2) {
            if (this.f827t == null) {
                if (!this.f804G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f803E || this.F) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f811a) {
            try {
                if (this.f827t == null) {
                    if (!z2) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f811a.add(g2);
                    S();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(boolean z2) {
        if (this.f812b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f827t == null) {
            if (!this.f804G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f827t.f999g.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2 && (this.f803E || this.F)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f806I == null) {
            this.f806I = new ArrayList();
            this.f807J = new ArrayList();
        }
    }

    public final boolean y(boolean z2) {
        boolean z3;
        x(z2);
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.f806I;
            ArrayList arrayList2 = this.f807J;
            synchronized (this.f811a) {
                if (this.f811a.isEmpty()) {
                    z3 = false;
                } else {
                    try {
                        int size = this.f811a.size();
                        z3 = false;
                        for (int i = 0; i < size; i++) {
                            z3 |= ((G) this.f811a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z3) {
                a0();
                u();
                ((HashMap) this.f813c.f748b).values().removeAll(Collections.singleton(null));
                return z4;
            }
            z4 = true;
            this.f812b = true;
            try {
                P(this.f806I, this.f807J);
            } finally {
                d();
            }
        }
    }

    public final void z(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        T.t tVar;
        T.t tVar2;
        T.t tVar3;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        boolean z2 = ((C0032a) arrayList3.get(i)).f891o;
        ArrayList arrayList5 = this.f808K;
        if (arrayList5 == null) {
            this.f808K = new ArrayList();
        } else {
            arrayList5.clear();
        }
        ArrayList arrayList6 = this.f808K;
        T.t tVar4 = this.f813c;
        arrayList6.addAll(tVar4.k());
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f830w;
        int i6 = i;
        boolean z3 = false;
        while (true) {
            int i7 = 1;
            if (i6 >= i2) {
                T.t tVar5 = tVar4;
                this.f808K.clear();
                if (!z2 && this.f826s >= 1) {
                    for (int i8 = i; i8 < i2; i8++) {
                        Iterator it = ((C0032a) arrayList.get(i8)).f880a.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = ((P) it.next()).f861b;
                            if (abstractComponentCallbacksC0048q2 == null || abstractComponentCallbacksC0048q2.f982r == null) {
                                tVar = tVar5;
                            } else {
                                tVar = tVar5;
                                tVar.m(f(abstractComponentCallbacksC0048q2));
                            }
                            tVar5 = tVar;
                        }
                    }
                }
                for (int i9 = i; i9 < i2; i9++) {
                    C0032a c0032a = (C0032a) arrayList.get(i9);
                    if (((Boolean) arrayList2.get(i9)).booleanValue()) {
                        c0032a.c(-1);
                        ArrayList arrayList7 = c0032a.f880a;
                        boolean z4 = true;
                        for (int size = arrayList7.size() - 1; size >= 0; size--) {
                            P p2 = (P) arrayList7.get(size);
                            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q3 = p2.f861b;
                            if (abstractComponentCallbacksC0048q3 != null) {
                                if (abstractComponentCallbacksC0048q3.f957H != null) {
                                    abstractComponentCallbacksC0048q3.f().f942a = z4;
                                }
                                int i10 = c0032a.f884f;
                                int i11 = 8194;
                                int i12 = 4097;
                                if (i10 != 4097) {
                                    if (i10 != 8194) {
                                        i11 = 4100;
                                        i12 = 8197;
                                        if (i10 != 8197) {
                                            if (i10 == 4099) {
                                                i11 = 4099;
                                            } else if (i10 != 4100) {
                                                i11 = 0;
                                            }
                                        }
                                    }
                                    i11 = i12;
                                }
                                if (abstractComponentCallbacksC0048q3.f957H != null || i11 != 0) {
                                    abstractComponentCallbacksC0048q3.f();
                                    abstractComponentCallbacksC0048q3.f957H.f946f = i11;
                                }
                                abstractComponentCallbacksC0048q3.f();
                                abstractComponentCallbacksC0048q3.f957H.getClass();
                            }
                            int i13 = p2.f860a;
                            I i14 = c0032a.f892p;
                            switch (i13) {
                                case 1:
                                    abstractComponentCallbacksC0048q3.E(p2.d, p2.f863e, p2.f864f, p2.f865g);
                                    z4 = true;
                                    i14.T(abstractComponentCallbacksC0048q3, true);
                                    i14.O(abstractComponentCallbacksC0048q3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + p2.f860a);
                                case 3:
                                    abstractComponentCallbacksC0048q3.E(p2.d, p2.f863e, p2.f864f, p2.f865g);
                                    i14.a(abstractComponentCallbacksC0048q3);
                                    z4 = true;
                                case 4:
                                    abstractComponentCallbacksC0048q3.E(p2.d, p2.f863e, p2.f864f, p2.f865g);
                                    i14.getClass();
                                    X(abstractComponentCallbacksC0048q3);
                                    z4 = true;
                                case 5:
                                    abstractComponentCallbacksC0048q3.E(p2.d, p2.f863e, p2.f864f, p2.f865g);
                                    i14.T(abstractComponentCallbacksC0048q3, true);
                                    i14.E(abstractComponentCallbacksC0048q3);
                                    z4 = true;
                                case 6:
                                    abstractComponentCallbacksC0048q3.E(p2.d, p2.f863e, p2.f864f, p2.f865g);
                                    i14.c(abstractComponentCallbacksC0048q3);
                                    z4 = true;
                                case 7:
                                    abstractComponentCallbacksC0048q3.E(p2.d, p2.f863e, p2.f864f, p2.f865g);
                                    i14.T(abstractComponentCallbacksC0048q3, true);
                                    i14.g(abstractComponentCallbacksC0048q3);
                                    z4 = true;
                                case 8:
                                    i14.V(null);
                                    z4 = true;
                                case 9:
                                    i14.V(abstractComponentCallbacksC0048q3);
                                    z4 = true;
                                case 10:
                                    i14.U(abstractComponentCallbacksC0048q3, p2.h);
                                    z4 = true;
                            }
                        }
                    } else {
                        c0032a.c(1);
                        ArrayList arrayList8 = c0032a.f880a;
                        int size2 = arrayList8.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            P p3 = (P) arrayList8.get(i15);
                            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q4 = p3.f861b;
                            if (abstractComponentCallbacksC0048q4 != null) {
                                if (abstractComponentCallbacksC0048q4.f957H != null) {
                                    abstractComponentCallbacksC0048q4.f().f942a = false;
                                }
                                int i16 = c0032a.f884f;
                                if (abstractComponentCallbacksC0048q4.f957H != null || i16 != 0) {
                                    abstractComponentCallbacksC0048q4.f();
                                    abstractComponentCallbacksC0048q4.f957H.f946f = i16;
                                }
                                abstractComponentCallbacksC0048q4.f();
                                abstractComponentCallbacksC0048q4.f957H.getClass();
                            }
                            int i17 = p3.f860a;
                            I i18 = c0032a.f892p;
                            switch (i17) {
                                case 1:
                                    abstractComponentCallbacksC0048q4.E(p3.d, p3.f863e, p3.f864f, p3.f865g);
                                    i18.T(abstractComponentCallbacksC0048q4, false);
                                    i18.a(abstractComponentCallbacksC0048q4);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + p3.f860a);
                                case 3:
                                    abstractComponentCallbacksC0048q4.E(p3.d, p3.f863e, p3.f864f, p3.f865g);
                                    i18.O(abstractComponentCallbacksC0048q4);
                                case 4:
                                    abstractComponentCallbacksC0048q4.E(p3.d, p3.f863e, p3.f864f, p3.f865g);
                                    i18.E(abstractComponentCallbacksC0048q4);
                                case 5:
                                    abstractComponentCallbacksC0048q4.E(p3.d, p3.f863e, p3.f864f, p3.f865g);
                                    i18.T(abstractComponentCallbacksC0048q4, false);
                                    X(abstractComponentCallbacksC0048q4);
                                case 6:
                                    abstractComponentCallbacksC0048q4.E(p3.d, p3.f863e, p3.f864f, p3.f865g);
                                    i18.g(abstractComponentCallbacksC0048q4);
                                case 7:
                                    abstractComponentCallbacksC0048q4.E(p3.d, p3.f863e, p3.f864f, p3.f865g);
                                    i18.T(abstractComponentCallbacksC0048q4, false);
                                    i18.c(abstractComponentCallbacksC0048q4);
                                case 8:
                                    i18.V(abstractComponentCallbacksC0048q4);
                                case 9:
                                    i18.V(null);
                                case 10:
                                    i18.U(abstractComponentCallbacksC0048q4, p3.i);
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i19 = i; i19 < i2; i19++) {
                    C0032a c0032a2 = (C0032a) arrayList.get(i19);
                    if (booleanValue) {
                        for (int size3 = c0032a2.f880a.size() - 1; size3 >= 0; size3--) {
                            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q5 = ((P) c0032a2.f880a.get(size3)).f861b;
                            if (abstractComponentCallbacksC0048q5 != null) {
                                f(abstractComponentCallbacksC0048q5).k();
                            }
                        }
                    } else {
                        Iterator it2 = c0032a2.f880a.iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q6 = ((P) it2.next()).f861b;
                            if (abstractComponentCallbacksC0048q6 != null) {
                                f(abstractComponentCallbacksC0048q6).k();
                            }
                        }
                    }
                }
                J(this.f826s, true);
                HashSet hashSet = new HashSet();
                for (int i20 = i; i20 < i2; i20++) {
                    Iterator it3 = ((C0032a) arrayList.get(i20)).f880a.iterator();
                    while (it3.hasNext()) {
                        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q7 = ((P) it3.next()).f861b;
                        if (abstractComponentCallbacksC0048q7 != null && (viewGroup = abstractComponentCallbacksC0048q7.f954D) != null) {
                            hashSet.add(C0040i.f(viewGroup, D()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    C0040i c0040i = (C0040i) it4.next();
                    c0040i.d = booleanValue;
                    synchronized (c0040i.f920b) {
                        try {
                            c0040i.g();
                            c0040i.f922e = false;
                            int size4 = c0040i.f920b.size() - 1;
                            while (true) {
                                if (size4 >= 0) {
                                    U u2 = (U) c0040i.f920b.get(size4);
                                    int c2 = V.c(u2.f876c.f955E);
                                    if (u2.f874a != 2 || c2 == 2) {
                                        size4--;
                                    } else {
                                        C0047p c0047p = u2.f876c.f957H;
                                        c0040i.f922e = false;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    c0040i.c();
                }
                for (int i21 = i; i21 < i2; i21++) {
                    C0032a c0032a3 = (C0032a) arrayList.get(i21);
                    if (((Boolean) arrayList2.get(i21)).booleanValue() && c0032a3.f894r >= 0) {
                        c0032a3.f894r = -1;
                    }
                    c0032a3.getClass();
                }
                return;
            }
            C0032a c0032a4 = (C0032a) arrayList3.get(i6);
            if (((Boolean) arrayList4.get(i6)).booleanValue()) {
                tVar2 = tVar4;
                int i22 = 1;
                ArrayList arrayList9 = this.f808K;
                ArrayList arrayList10 = c0032a4.f880a;
                int size5 = arrayList10.size() - 1;
                while (size5 >= 0) {
                    P p4 = (P) arrayList10.get(size5);
                    int i23 = p4.f860a;
                    if (i23 != i22) {
                        if (i23 != 3) {
                            switch (i23) {
                                case 8:
                                    abstractComponentCallbacksC0048q = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0048q = p4.f861b;
                                    break;
                                case 10:
                                    p4.i = p4.h;
                                    break;
                            }
                            size5--;
                            i22 = 1;
                        }
                        arrayList9.add(p4.f861b);
                        size5--;
                        i22 = 1;
                    }
                    arrayList9.remove(p4.f861b);
                    size5--;
                    i22 = 1;
                }
            } else {
                ArrayList arrayList11 = this.f808K;
                int i24 = 0;
                while (true) {
                    ArrayList arrayList12 = c0032a4.f880a;
                    if (i24 < arrayList12.size()) {
                        P p5 = (P) arrayList12.get(i24);
                        int i25 = p5.f860a;
                        if (i25 != i7) {
                            if (i25 != 2) {
                                if (i25 == 3 || i25 == 6) {
                                    arrayList11.remove(p5.f861b);
                                    AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q8 = p5.f861b;
                                    if (abstractComponentCallbacksC0048q8 == abstractComponentCallbacksC0048q) {
                                        arrayList12.add(i24, new P(9, abstractComponentCallbacksC0048q8));
                                        i24++;
                                        tVar3 = tVar4;
                                        i3 = 1;
                                        abstractComponentCallbacksC0048q = null;
                                    }
                                } else if (i25 == 7) {
                                    tVar3 = tVar4;
                                    i3 = 1;
                                } else if (i25 == 8) {
                                    arrayList12.add(i24, new P(9, abstractComponentCallbacksC0048q, 0));
                                    p5.f862c = true;
                                    i24++;
                                    abstractComponentCallbacksC0048q = p5.f861b;
                                }
                                tVar3 = tVar4;
                                i3 = 1;
                            } else {
                                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q9 = p5.f861b;
                                int i26 = abstractComponentCallbacksC0048q9.f987w;
                                int size6 = arrayList11.size() - 1;
                                boolean z5 = false;
                                while (size6 >= 0) {
                                    T.t tVar6 = tVar4;
                                    AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q10 = (AbstractComponentCallbacksC0048q) arrayList11.get(size6);
                                    if (abstractComponentCallbacksC0048q10.f987w != i26) {
                                        i4 = i26;
                                    } else if (abstractComponentCallbacksC0048q10 == abstractComponentCallbacksC0048q9) {
                                        i4 = i26;
                                        z5 = true;
                                    } else {
                                        if (abstractComponentCallbacksC0048q10 == abstractComponentCallbacksC0048q) {
                                            i4 = i26;
                                            arrayList12.add(i24, new P(9, abstractComponentCallbacksC0048q10, 0));
                                            i24++;
                                            i5 = 0;
                                            abstractComponentCallbacksC0048q = null;
                                        } else {
                                            i4 = i26;
                                            i5 = 0;
                                        }
                                        P p6 = new P(3, abstractComponentCallbacksC0048q10, i5);
                                        p6.d = p5.d;
                                        p6.f864f = p5.f864f;
                                        p6.f863e = p5.f863e;
                                        p6.f865g = p5.f865g;
                                        arrayList12.add(i24, p6);
                                        arrayList11.remove(abstractComponentCallbacksC0048q10);
                                        i24++;
                                        abstractComponentCallbacksC0048q = abstractComponentCallbacksC0048q;
                                    }
                                    size6--;
                                    i26 = i4;
                                    tVar4 = tVar6;
                                }
                                tVar3 = tVar4;
                                i3 = 1;
                                if (z5) {
                                    arrayList12.remove(i24);
                                    i24--;
                                } else {
                                    p5.f860a = 1;
                                    p5.f862c = true;
                                    arrayList11.add(abstractComponentCallbacksC0048q9);
                                }
                            }
                            i24 += i3;
                            i7 = i3;
                            tVar4 = tVar3;
                        } else {
                            tVar3 = tVar4;
                            i3 = i7;
                        }
                        arrayList11.add(p5.f861b);
                        i24 += i3;
                        i7 = i3;
                        tVar4 = tVar3;
                    } else {
                        tVar2 = tVar4;
                    }
                }
            }
            z3 = z3 || c0032a4.f885g;
            i6++;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            tVar4 = tVar2;
        }
    }
}
