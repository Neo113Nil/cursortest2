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
import com.luckyreads.bookshelf.R;
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
    public B.j f794A;

    /* renamed from: B, reason: collision with root package name */
    public B.j f795B;

    /* renamed from: C, reason: collision with root package name */
    public ArrayDeque f796C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f797D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f798E;
    public boolean F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f799G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f800H;

    /* renamed from: I, reason: collision with root package name */
    public ArrayList f801I;

    /* renamed from: J, reason: collision with root package name */
    public ArrayList f802J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList f803K;

    /* renamed from: L, reason: collision with root package name */
    public L f804L;

    /* renamed from: M, reason: collision with root package name */
    public final K0.B f805M;

    /* renamed from: b, reason: collision with root package name */
    public boolean f807b;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f809e;

    /* renamed from: g, reason: collision with root package name */
    public a.x f811g;

    /* renamed from: l, reason: collision with root package name */
    public final B.j f814l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f815m;

    /* renamed from: n, reason: collision with root package name */
    public final y f816n;

    /* renamed from: o, reason: collision with root package name */
    public final y f817o;

    /* renamed from: p, reason: collision with root package name */
    public final y f818p;

    /* renamed from: q, reason: collision with root package name */
    public final y f819q;

    /* renamed from: r, reason: collision with root package name */
    public final B f820r;

    /* renamed from: s, reason: collision with root package name */
    public int f821s;

    /* renamed from: t, reason: collision with root package name */
    public C0051u f822t;

    /* renamed from: u, reason: collision with root package name */
    public q1.d f823u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractComponentCallbacksC0048q f824v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractComponentCallbacksC0048q f825w;

    /* renamed from: x, reason: collision with root package name */
    public final C f826x;

    /* renamed from: y, reason: collision with root package name */
    public final H0.e f827y;

    /* renamed from: z, reason: collision with root package name */
    public B.j f828z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f806a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final T.t f808c = new T.t(2);

    /* renamed from: f, reason: collision with root package name */
    public final x f810f = new x(this);
    public final A h = new A(this);
    public final AtomicInteger i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map f812j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map f813k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [X.y] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.y] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.y] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.y] */
    public I() {
        Collections.synchronizedMap(new HashMap());
        this.f814l = new B.j(this);
        this.f815m = new CopyOnWriteArrayList();
        final int i = 0;
        this.f816n = new J.a(this) { // from class: X.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1003b;

            {
                this.f1003b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        I i2 = this.f1003b;
                        if (i2.G()) {
                            i2.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i3 = this.f1003b;
                        if (i3.G() && num.intValue() == 80) {
                            i3.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i4 = this.f1003b;
                        if (i4.G()) {
                            i4.m(fVar.f4187a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1003b;
                        if (i5.G()) {
                            i5.r(gVar.f4188a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f817o = new J.a(this) { // from class: X.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1003b;

            {
                this.f1003b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i2) {
                    case 0:
                        I i22 = this.f1003b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i3 = this.f1003b;
                        if (i3.G() && num.intValue() == 80) {
                            i3.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i4 = this.f1003b;
                        if (i4.G()) {
                            i4.m(fVar.f4187a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1003b;
                        if (i5.G()) {
                            i5.r(gVar.f4188a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.f818p = new J.a(this) { // from class: X.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1003b;

            {
                this.f1003b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i3) {
                    case 0:
                        I i22 = this.f1003b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i32 = this.f1003b;
                        if (i32.G() && num.intValue() == 80) {
                            i32.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i4 = this.f1003b;
                        if (i4.G()) {
                            i4.m(fVar.f4187a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1003b;
                        if (i5.G()) {
                            i5.r(gVar.f4188a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.f819q = new J.a(this) { // from class: X.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1003b;

            {
                this.f1003b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i4) {
                    case 0:
                        I i22 = this.f1003b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i32 = this.f1003b;
                        if (i32.G() && num.intValue() == 80) {
                            i32.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i42 = this.f1003b;
                        if (i42.G()) {
                            i42.m(fVar.f4187a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1003b;
                        if (i5.G()) {
                            i5.r(gVar.f4188a, false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f820r = new B(this);
        this.f821s = -1;
        this.f826x = new C(this);
        this.f827y = new H0.e(12);
        this.f796C = new ArrayDeque();
        this.f805M = new K0.B(5, this);
    }

    public static boolean F(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        abstractComponentCallbacksC0048q.getClass();
        Iterator it = abstractComponentCallbacksC0048q.f979t.f808c.j().iterator();
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
        return abstractComponentCallbacksC0048q.f947B && (abstractComponentCallbacksC0048q.f977r == null || H(abstractComponentCallbacksC0048q.f980u));
    }

    public static boolean I(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (abstractComponentCallbacksC0048q == null) {
            return true;
        }
        I i = abstractComponentCallbacksC0048q.f977r;
        return abstractComponentCallbacksC0048q.equals(i.f825w) && I(i.f824v);
    }

    public static void X(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0048q);
        }
        if (abstractComponentCallbacksC0048q.f984y) {
            abstractComponentCallbacksC0048q.f984y = false;
            abstractComponentCallbacksC0048q.f953I = !abstractComponentCallbacksC0048q.f953I;
        }
    }

    public final AbstractComponentCallbacksC0048q A(int i) {
        T.t tVar = this.f808c;
        ArrayList arrayList = (ArrayList) tVar.f742a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = (AbstractComponentCallbacksC0048q) arrayList.get(size);
            if (abstractComponentCallbacksC0048q != null && abstractComponentCallbacksC0048q.f981v == i) {
                return abstractComponentCallbacksC0048q;
            }
        }
        for (O o2 : ((HashMap) tVar.f743b).values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = o2.f853c;
                if (abstractComponentCallbacksC0048q2.f981v == i) {
                    return abstractComponentCallbacksC0048q2;
                }
            }
        }
        return null;
    }

    public final ViewGroup B(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        ViewGroup viewGroup = abstractComponentCallbacksC0048q.f949D;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0048q.f982w > 0 && this.f823u.d0()) {
            View c02 = this.f823u.c0(abstractComponentCallbacksC0048q.f982w);
            if (c02 instanceof ViewGroup) {
                return (ViewGroup) c02;
            }
        }
        return null;
    }

    public final C C() {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f824v;
        return abstractComponentCallbacksC0048q != null ? abstractComponentCallbacksC0048q.f977r.C() : this.f826x;
    }

    public final H0.e D() {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f824v;
        return abstractComponentCallbacksC0048q != null ? abstractComponentCallbacksC0048q.f977r.D() : this.f827y;
    }

    public final void E(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0048q);
        }
        if (abstractComponentCallbacksC0048q.f984y) {
            return;
        }
        abstractComponentCallbacksC0048q.f984y = true;
        abstractComponentCallbacksC0048q.f953I = true ^ abstractComponentCallbacksC0048q.f953I;
        W(abstractComponentCallbacksC0048q);
    }

    public final boolean G() {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f824v;
        if (abstractComponentCallbacksC0048q == null) {
            return true;
        }
        return abstractComponentCallbacksC0048q.m() && this.f824v.j().G();
    }

    public final void J(int i, boolean z2) {
        HashMap hashMap;
        C0051u c0051u;
        if (this.f822t == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i != this.f821s) {
            this.f821s = i;
            T.t tVar = this.f808c;
            Iterator it = ((ArrayList) tVar.f742a).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = (HashMap) tVar.f743b;
                if (!hasNext) {
                    break;
                }
                O o2 = (O) hashMap.get(((AbstractComponentCallbacksC0048q) it.next()).f966e);
                if (o2 != null) {
                    o2.k();
                }
            }
            for (O o3 : hashMap.values()) {
                if (o3 != null) {
                    o3.k();
                    AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o3.f853c;
                    if (abstractComponentCallbacksC0048q.f971l && !abstractComponentCallbacksC0048q.o()) {
                        tVar.n(o3);
                    }
                }
            }
            Y();
            if (this.f797D && (c0051u = this.f822t) != null && this.f821s == 7) {
                c0051u.i.invalidateOptionsMenu();
                this.f797D = false;
            }
        }
    }

    public final void K() {
        if (this.f822t == null) {
            return;
        }
        this.f798E = false;
        this.F = false;
        this.f804L.f840g = false;
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f808c.k()) {
            if (abstractComponentCallbacksC0048q != null) {
                abstractComponentCallbacksC0048q.f979t.K();
            }
        }
    }

    public final boolean L() {
        return M(-1, 0);
    }

    public final boolean M(int i, int i2) {
        y(false);
        x(true);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f825w;
        if (abstractComponentCallbacksC0048q != null && i < 0 && abstractComponentCallbacksC0048q.g().L()) {
            return true;
        }
        boolean N2 = N(this.f801I, this.f802J, i, i2);
        if (N2) {
            this.f807b = true;
            try {
                P(this.f801I, this.f802J);
            } finally {
                d();
            }
        }
        a0();
        u();
        ((HashMap) this.f808c.f743b).values().removeAll(Collections.singleton(null));
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
                    if (i >= 0 && i == c0032a.f889r) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z2) {
                        while (size > 0) {
                            C0032a c0032a2 = (C0032a) this.d.get(size - 1);
                            if (i < 0 || i != c0032a2.f889r) {
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
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0048q + " nesting=" + abstractComponentCallbacksC0048q.f976q);
        }
        boolean o2 = abstractComponentCallbacksC0048q.o();
        if (abstractComponentCallbacksC0048q.f985z && o2) {
            return;
        }
        T.t tVar = this.f808c;
        synchronized (((ArrayList) tVar.f742a)) {
            ((ArrayList) tVar.f742a).remove(abstractComponentCallbacksC0048q);
        }
        abstractComponentCallbacksC0048q.f970k = false;
        if (F(abstractComponentCallbacksC0048q)) {
            this.f797D = true;
        }
        abstractComponentCallbacksC0048q.f971l = true;
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
            if (!((C0032a) arrayList.get(i)).f886o) {
                if (i2 != i) {
                    z(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0032a) arrayList.get(i2)).f886o) {
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
                bundle2.setClassLoader(this.f822t.f993f.getClassLoader());
                this.f813k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f822t.f993f.getClassLoader());
                arrayList.add((N) bundle.getParcelable("state"));
            }
        }
        T.t tVar = this.f808c;
        HashMap hashMap = (HashMap) tVar.f744c;
        hashMap.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            N n2 = (N) it.next();
            hashMap.put(n2.f842b, n2);
        }
        J j2 = (J) bundle3.getParcelable("state");
        if (j2 == null) {
            return;
        }
        HashMap hashMap2 = (HashMap) tVar.f743b;
        hashMap2.clear();
        Iterator it2 = j2.f829a.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            i = 2;
            jVar = this.f814l;
            if (!hasNext) {
                break;
            }
            N n3 = (N) ((HashMap) tVar.f744c).remove((String) it2.next());
            if (n3 != null) {
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = (AbstractComponentCallbacksC0048q) this.f804L.f836b.get(n3.f842b);
                if (abstractComponentCallbacksC0048q != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0048q);
                    }
                    o2 = new O(jVar, tVar, abstractComponentCallbacksC0048q, n3);
                } else {
                    o2 = new O(this.f814l, this.f808c, this.f822t.f993f.getClassLoader(), C(), n3);
                }
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = o2.f853c;
                abstractComponentCallbacksC0048q2.f977r = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0048q2.f966e + "): " + abstractComponentCallbacksC0048q2);
                }
                o2.m(this.f822t.f993f.getClassLoader());
                tVar.m(o2);
                o2.f854e = this.f821s;
            }
        }
        L l2 = this.f804L;
        l2.getClass();
        Iterator it3 = new ArrayList(l2.f836b.values()).iterator();
        while (it3.hasNext()) {
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q3 = (AbstractComponentCallbacksC0048q) it3.next();
            if (hashMap2.get(abstractComponentCallbacksC0048q3.f966e) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0048q3 + " that was not found in the set of active Fragments " + j2.f829a);
                }
                this.f804L.e(abstractComponentCallbacksC0048q3);
                abstractComponentCallbacksC0048q3.f977r = this;
                O o3 = new O(jVar, tVar, abstractComponentCallbacksC0048q3);
                o3.f854e = 1;
                o3.k();
                abstractComponentCallbacksC0048q3.f971l = true;
                o3.k();
            }
        }
        ArrayList<String> arrayList2 = j2.f830b;
        ((ArrayList) tVar.f742a).clear();
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
        if (j2.f831c != null) {
            this.d = new ArrayList(j2.f831c.length);
            int i3 = 0;
            while (true) {
                C0033b[] c0033bArr = j2.f831c;
                if (i3 >= c0033bArr.length) {
                    break;
                }
                C0033b c0033b = c0033bArr[i3];
                c0033b.getClass();
                C0032a c0032a = new C0032a(this);
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    int[] iArr = c0033b.f890a;
                    if (i4 >= iArr.length) {
                        break;
                    }
                    P p2 = new P();
                    int i6 = i4 + 1;
                    p2.f855a = iArr[i4];
                    if (Log.isLoggable("FragmentManager", i)) {
                        Log.v("FragmentManager", "Instantiate " + c0032a + " op #" + i5 + " base fragment #" + iArr[i6]);
                    }
                    p2.h = EnumC0069m.values()[c0033b.f892c[i5]];
                    p2.i = EnumC0069m.values()[c0033b.d[i5]];
                    int i7 = i4 + 2;
                    p2.f857c = iArr[i6] != 0;
                    int i8 = iArr[i7];
                    p2.d = i8;
                    int i9 = iArr[i4 + 3];
                    p2.f858e = i9;
                    int i10 = i4 + 5;
                    int i11 = iArr[i4 + 4];
                    p2.f859f = i11;
                    i4 += 6;
                    int i12 = iArr[i10];
                    p2.f860g = i12;
                    c0032a.f876b = i8;
                    c0032a.f877c = i9;
                    c0032a.d = i11;
                    c0032a.f878e = i12;
                    c0032a.b(p2);
                    i5++;
                    i = 2;
                }
                c0032a.f879f = c0033b.f893e;
                c0032a.h = c0033b.f894f;
                c0032a.f880g = true;
                c0032a.i = c0033b.h;
                c0032a.f881j = c0033b.i;
                c0032a.f882k = c0033b.f896j;
                c0032a.f883l = c0033b.f897k;
                c0032a.f884m = c0033b.f898l;
                c0032a.f885n = c0033b.f899m;
                c0032a.f886o = c0033b.f900n;
                c0032a.f889r = c0033b.f895g;
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = c0033b.f891b;
                    if (i13 >= arrayList3.size()) {
                        break;
                    }
                    String str4 = (String) arrayList3.get(i13);
                    if (str4 != null) {
                        ((P) c0032a.f875a.get(i13)).f856b = tVar.d(str4);
                    }
                    i13++;
                }
                c0032a.c(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i3 + " (index " + c0032a.f889r + "): " + c0032a);
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
        String str5 = j2.f832e;
        if (str5 != null) {
            AbstractComponentCallbacksC0048q d2 = tVar.d(str5);
            this.f825w = d2;
            q(d2);
        }
        ArrayList arrayList4 = j2.f833f;
        if (arrayList4 != null) {
            for (int i14 = i2; i14 < arrayList4.size(); i14++) {
                this.f812j.put((String) arrayList4.get(i14), (C0034c) j2.f834g.get(i14));
            }
        }
        this.f796C = new ArrayDeque(j2.h);
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
            if (c0040i.f917e) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0040i.f917e = false;
                c0040i.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((C0040i) it2.next()).e();
        }
        y(true);
        this.f798E = true;
        this.f804L.f840g = true;
        T.t tVar = this.f808c;
        tVar.getClass();
        HashMap hashMap = (HashMap) tVar.f743b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (O o2 : hashMap.values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f853c;
                N n2 = new N(abstractComponentCallbacksC0048q);
                if (abstractComponentCallbacksC0048q.f963a <= -1 || n2.f850m != null) {
                    n2.f850m = abstractComponentCallbacksC0048q.f964b;
                } else {
                    Bundle bundle2 = new Bundle();
                    abstractComponentCallbacksC0048q.x(bundle2);
                    abstractComponentCallbacksC0048q.f960P.c(bundle2);
                    bundle2.putParcelable("android:support:fragments", abstractComponentCallbacksC0048q.f979t.R());
                    o2.f851a.o(false);
                    if (bundle2.isEmpty()) {
                        bundle2 = null;
                    }
                    if (abstractComponentCallbacksC0048q.f950E != null) {
                        o2.o();
                    }
                    if (abstractComponentCallbacksC0048q.f965c != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putSparseParcelableArray("android:view_state", abstractComponentCallbacksC0048q.f965c);
                    }
                    if (abstractComponentCallbacksC0048q.d != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBundle("android:view_registry_state", abstractComponentCallbacksC0048q.d);
                    }
                    if (!abstractComponentCallbacksC0048q.f951G) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBoolean("android:user_visible_hint", abstractComponentCallbacksC0048q.f951G);
                    }
                    n2.f850m = bundle2;
                    if (abstractComponentCallbacksC0048q.h != null) {
                        if (bundle2 == null) {
                            n2.f850m = new Bundle();
                        }
                        n2.f850m.putString("android:target_state", abstractComponentCallbacksC0048q.h);
                        int i2 = abstractComponentCallbacksC0048q.i;
                        if (i2 != 0) {
                            n2.f850m.putInt("android:target_req_state", i2);
                        }
                    }
                }
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = o2.f853c;
                arrayList2.add(abstractComponentCallbacksC0048q2.f966e);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0048q2 + ": " + abstractComponentCallbacksC0048q2.f964b);
                }
            }
        }
        T.t tVar2 = this.f808c;
        tVar2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) tVar2.f744c).values());
        if (!arrayList3.isEmpty()) {
            T.t tVar3 = this.f808c;
            synchronized (((ArrayList) tVar3.f742a)) {
                try {
                    if (((ArrayList) tVar3.f742a).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) tVar3.f742a).size());
                        Iterator it3 = ((ArrayList) tVar3.f742a).iterator();
                        while (it3.hasNext()) {
                            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q3 = (AbstractComponentCallbacksC0048q) it3.next();
                            arrayList.add(abstractComponentCallbacksC0048q3.f966e);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0048q3.f966e + "): " + abstractComponentCallbacksC0048q3);
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
            j2.f832e = null;
            ArrayList arrayList5 = new ArrayList();
            j2.f833f = arrayList5;
            ArrayList arrayList6 = new ArrayList();
            j2.f834g = arrayList6;
            j2.f829a = arrayList2;
            j2.f830b = arrayList;
            j2.f831c = c0033bArr;
            j2.d = this.i.get();
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q4 = this.f825w;
            if (abstractComponentCallbacksC0048q4 != null) {
                j2.f832e = abstractComponentCallbacksC0048q4.f966e;
            }
            arrayList5.addAll(this.f812j.keySet());
            arrayList6.addAll(this.f812j.values());
            j2.h = new ArrayList(this.f796C);
            bundle.putParcelable("state", j2);
            for (String str : this.f813k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f813k.get(str));
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                N n3 = (N) it4.next();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("state", n3);
                bundle.putBundle("fragment_" + n3.f842b, bundle3);
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public final void S() {
        synchronized (this.f806a) {
            try {
                if (this.f806a.size() == 1) {
                    this.f822t.f994g.removeCallbacks(this.f805M);
                    this.f822t.f994g.post(this.f805M);
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
        if (abstractComponentCallbacksC0048q.equals(this.f808c.d(abstractComponentCallbacksC0048q.f966e)) && (abstractComponentCallbacksC0048q.f978s == null || abstractComponentCallbacksC0048q.f977r == this)) {
            abstractComponentCallbacksC0048q.f956L = enumC0069m;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0048q + " is not an active fragment of FragmentManager " + this);
    }

    public final void V(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (abstractComponentCallbacksC0048q != null) {
            if (!abstractComponentCallbacksC0048q.equals(this.f808c.d(abstractComponentCallbacksC0048q.f966e)) || (abstractComponentCallbacksC0048q.f978s != null && abstractComponentCallbacksC0048q.f977r != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0048q + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = this.f825w;
        this.f825w = abstractComponentCallbacksC0048q;
        q(abstractComponentCallbacksC0048q2);
        q(this.f825w);
    }

    public final void W(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        ViewGroup B2 = B(abstractComponentCallbacksC0048q);
        if (B2 != null) {
            C0047p c0047p = abstractComponentCallbacksC0048q.f952H;
            if ((c0047p == null ? 0 : c0047p.f940e) + (c0047p == null ? 0 : c0047p.d) + (c0047p == null ? 0 : c0047p.f939c) + (c0047p == null ? 0 : c0047p.f938b) > 0) {
                if (B2.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    B2.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0048q);
                }
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = (AbstractComponentCallbacksC0048q) B2.getTag(R.id.visible_removing_fragment_view_tag);
                C0047p c0047p2 = abstractComponentCallbacksC0048q.f952H;
                boolean z2 = c0047p2 != null ? c0047p2.f937a : false;
                if (abstractComponentCallbacksC0048q2.f952H == null) {
                    return;
                }
                abstractComponentCallbacksC0048q2.f().f937a = z2;
            }
        }
    }

    public final void Y() {
        Iterator it = this.f808c.h().iterator();
        while (it.hasNext()) {
            O o2 = (O) it.next();
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f853c;
            if (abstractComponentCallbacksC0048q.F) {
                if (this.f807b) {
                    this.f800H = true;
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
        C0051u c0051u = this.f822t;
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
        String str = abstractComponentCallbacksC0048q.f955K;
        if (str != null) {
            Y.d.c(abstractComponentCallbacksC0048q, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0048q);
        }
        O f2 = f(abstractComponentCallbacksC0048q);
        abstractComponentCallbacksC0048q.f977r = this;
        T.t tVar = this.f808c;
        tVar.m(f2);
        if (!abstractComponentCallbacksC0048q.f985z) {
            tVar.a(abstractComponentCallbacksC0048q);
            abstractComponentCallbacksC0048q.f971l = false;
            if (abstractComponentCallbacksC0048q.f950E == null) {
                abstractComponentCallbacksC0048q.f953I = false;
            }
            if (F(abstractComponentCallbacksC0048q)) {
                this.f797D = true;
            }
        }
        return f2;
    }

    public final void a0() {
        synchronized (this.f806a) {
            try {
                if (!this.f806a.isEmpty()) {
                    A a2 = this.h;
                    a2.f782a = true;
                    a.w wVar = a2.f784c;
                    if (wVar != null) {
                        wVar.a();
                    }
                    return;
                }
                A a3 = this.h;
                ArrayList arrayList = this.d;
                a3.f782a = (arrayList != null ? arrayList.size() : 0) > 0 && I(this.f824v);
                a.w wVar2 = a3.f784c;
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
        if (this.f822t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f822t = c0051u;
        this.f823u = dVar;
        this.f824v = abstractComponentCallbacksC0048q;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f815m;
        if (abstractComponentCallbacksC0048q != 0) {
            copyOnWriteArrayList.add(new D(abstractComponentCallbacksC0048q));
        } else if (c0051u != null) {
            copyOnWriteArrayList.add(c0051u);
        }
        if (this.f824v != null) {
            a0();
        }
        if (c0051u != null) {
            a.x i = c0051u.i.i();
            this.f811g = i;
            C0051u c0051u2 = abstractComponentCallbacksC0048q != 0 ? abstractComponentCallbacksC0048q : c0051u;
            i.getClass();
            A a2 = this.h;
            X0.e.e(a2, "onBackPressedCallback");
            androidx.lifecycle.t d = c0051u2.d();
            if (d.f1368c != EnumC0069m.f1358a) {
                a2.f783b.add(new a.u(i, d, a2));
                i.d();
                a2.f784c = new a.w(0, i);
            }
        }
        if (abstractComponentCallbacksC0048q != 0) {
            L l2 = abstractComponentCallbacksC0048q.f977r.f804L;
            HashMap hashMap = l2.f837c;
            L l3 = (L) hashMap.get(abstractComponentCallbacksC0048q.f966e);
            if (l3 == null) {
                l3 = new L(l2.f838e);
                hashMap.put(abstractComponentCallbacksC0048q.f966e, l3);
            }
            this.f804L = l3;
        } else if (c0051u != null) {
            this.f804L = (L) new B0.d(c0051u.i.c(), L.h).u(L.class);
        } else {
            this.f804L = new L(false);
        }
        L l4 = this.f804L;
        l4.f840g = this.f798E || this.F;
        this.f808c.d = l4;
        C0051u c0051u3 = this.f822t;
        if (c0051u3 != null && abstractComponentCallbacksC0048q == 0) {
            C0132d b2 = c0051u3.b();
            b2.e("android:support:fragments", new r(2, this));
            Bundle c2 = b2.c("android:support:fragments");
            if (c2 != null) {
                Q(c2);
            }
        }
        C0051u c0051u4 = this.f822t;
        if (c0051u4 != null) {
            AbstractActivityC0125i abstractActivityC0125i = c0051u4.i;
            if (abstractComponentCallbacksC0048q != 0) {
                str = abstractComponentCallbacksC0048q.f966e + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            String e2 = V.e(str2, "StartActivityForResult");
            E e3 = new E(2);
            z zVar = new z(this, 1);
            a.j jVar = abstractActivityC0125i.h;
            this.f828z = jVar.b(e2, e3, zVar);
            this.f794A = jVar.b(V.e(str2, "StartIntentSenderForResult"), new E(0), new z(this, 2));
            this.f795B = jVar.b(V.e(str2, "RequestPermissions"), new E(1), new z(this, 0));
        }
        C0051u c0051u5 = this.f822t;
        if (c0051u5 != null) {
            c0051u5.i.g(this.f816n);
        }
        C0051u c0051u6 = this.f822t;
        if (c0051u6 != null) {
            AbstractActivityC0125i abstractActivityC0125i2 = c0051u6.i;
            y yVar = this.f817o;
            abstractActivityC0125i2.getClass();
            X0.e.e(yVar, "listener");
            abstractActivityC0125i2.f1061j.add(yVar);
        }
        C0051u c0051u7 = this.f822t;
        if (c0051u7 != null) {
            AbstractActivityC0125i abstractActivityC0125i3 = c0051u7.i;
            y yVar2 = this.f818p;
            abstractActivityC0125i3.getClass();
            X0.e.e(yVar2, "listener");
            abstractActivityC0125i3.f1063l.add(yVar2);
        }
        C0051u c0051u8 = this.f822t;
        if (c0051u8 != null) {
            AbstractActivityC0125i abstractActivityC0125i4 = c0051u8.i;
            y yVar3 = this.f819q;
            abstractActivityC0125i4.getClass();
            X0.e.e(yVar3, "listener");
            abstractActivityC0125i4.f1064m.add(yVar3);
        }
        C0051u c0051u9 = this.f822t;
        if (c0051u9 == null || abstractComponentCallbacksC0048q != 0) {
            return;
        }
        AbstractActivityC0125i abstractActivityC0125i5 = c0051u9.i;
        B b3 = this.f820r;
        abstractActivityC0125i5.getClass();
        X0.e.e(b3, "provider");
        C0012l c0012l = abstractActivityC0125i5.f1057c;
        ((CopyOnWriteArrayList) c0012l.f432c).add(b3);
        ((Runnable) c0012l.f431b).run();
    }

    public final void c(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0048q);
        }
        if (abstractComponentCallbacksC0048q.f985z) {
            abstractComponentCallbacksC0048q.f985z = false;
            if (abstractComponentCallbacksC0048q.f970k) {
                return;
            }
            this.f808c.a(abstractComponentCallbacksC0048q);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0048q);
            }
            if (F(abstractComponentCallbacksC0048q)) {
                this.f797D = true;
            }
        }
    }

    public final void d() {
        this.f807b = false;
        this.f802J.clear();
        this.f801I.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f808c.h().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((O) it.next()).f853c.f949D;
            if (viewGroup != null) {
                hashSet.add(C0040i.f(viewGroup, D()));
            }
        }
        return hashSet;
    }

    public final O f(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        String str = abstractComponentCallbacksC0048q.f966e;
        T.t tVar = this.f808c;
        O o2 = (O) ((HashMap) tVar.f743b).get(str);
        if (o2 != null) {
            return o2;
        }
        O o3 = new O(this.f814l, tVar, abstractComponentCallbacksC0048q);
        o3.m(this.f822t.f993f.getClassLoader());
        o3.f854e = this.f821s;
        return o3;
    }

    public final void g(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0048q);
        }
        if (abstractComponentCallbacksC0048q.f985z) {
            return;
        }
        abstractComponentCallbacksC0048q.f985z = true;
        if (abstractComponentCallbacksC0048q.f970k) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0048q);
            }
            T.t tVar = this.f808c;
            synchronized (((ArrayList) tVar.f742a)) {
                ((ArrayList) tVar.f742a).remove(abstractComponentCallbacksC0048q);
            }
            abstractComponentCallbacksC0048q.f970k = false;
            if (F(abstractComponentCallbacksC0048q)) {
                this.f797D = true;
            }
            W(abstractComponentCallbacksC0048q);
        }
    }

    public final void h(boolean z2) {
        if (z2 && this.f822t != null) {
            Z(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f808c.k()) {
            if (abstractComponentCallbacksC0048q != null) {
                abstractComponentCallbacksC0048q.f948C = true;
                if (z2) {
                    abstractComponentCallbacksC0048q.f979t.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.f821s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f808c.k()) {
            if (abstractComponentCallbacksC0048q != null) {
                if (!abstractComponentCallbacksC0048q.f984y ? abstractComponentCallbacksC0048q.f979t.i() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.f821s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f808c.k()) {
            if (abstractComponentCallbacksC0048q != null && H(abstractComponentCallbacksC0048q)) {
                if (!abstractComponentCallbacksC0048q.f984y ? abstractComponentCallbacksC0048q.f979t.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0048q);
                    z2 = true;
                }
            }
        }
        if (this.f809e != null) {
            for (int i = 0; i < this.f809e.size(); i++) {
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = (AbstractComponentCallbacksC0048q) this.f809e.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0048q2)) {
                    abstractComponentCallbacksC0048q2.getClass();
                }
            }
        }
        this.f809e = arrayList;
        return z2;
    }

    public final void k() {
        boolean z2 = true;
        this.f799G = true;
        y(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0040i) it.next()).e();
        }
        C0051u c0051u = this.f822t;
        T.t tVar = this.f808c;
        if (c0051u != null) {
            z2 = ((L) tVar.d).f839f;
        } else {
            AbstractActivityC0125i abstractActivityC0125i = c0051u.f993f;
            if (abstractActivityC0125i != null) {
                z2 = true ^ abstractActivityC0125i.isChangingConfigurations();
            }
        }
        if (z2) {
            Iterator it2 = this.f812j.values().iterator();
            while (it2.hasNext()) {
                for (String str : ((C0034c) it2.next()).f901a) {
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
        C0051u c0051u2 = this.f822t;
        if (c0051u2 != null) {
            AbstractActivityC0125i abstractActivityC0125i2 = c0051u2.i;
            y yVar = this.f817o;
            abstractActivityC0125i2.getClass();
            X0.e.e(yVar, "listener");
            abstractActivityC0125i2.f1061j.remove(yVar);
        }
        C0051u c0051u3 = this.f822t;
        if (c0051u3 != null) {
            AbstractActivityC0125i abstractActivityC0125i3 = c0051u3.i;
            y yVar2 = this.f816n;
            abstractActivityC0125i3.getClass();
            X0.e.e(yVar2, "listener");
            abstractActivityC0125i3.i.remove(yVar2);
        }
        C0051u c0051u4 = this.f822t;
        if (c0051u4 != null) {
            AbstractActivityC0125i abstractActivityC0125i4 = c0051u4.i;
            y yVar3 = this.f818p;
            abstractActivityC0125i4.getClass();
            X0.e.e(yVar3, "listener");
            abstractActivityC0125i4.f1063l.remove(yVar3);
        }
        C0051u c0051u5 = this.f822t;
        if (c0051u5 != null) {
            AbstractActivityC0125i abstractActivityC0125i5 = c0051u5.i;
            y yVar4 = this.f819q;
            abstractActivityC0125i5.getClass();
            X0.e.e(yVar4, "listener");
            abstractActivityC0125i5.f1064m.remove(yVar4);
        }
        C0051u c0051u6 = this.f822t;
        if (c0051u6 != null) {
            AbstractActivityC0125i abstractActivityC0125i6 = c0051u6.i;
            B b2 = this.f820r;
            abstractActivityC0125i6.getClass();
            X0.e.e(b2, "provider");
            C0012l c0012l = abstractActivityC0125i6.f1057c;
            ((CopyOnWriteArrayList) c0012l.f432c).remove(b2);
            if (((HashMap) c0012l.d).remove(b2) != null) {
                throw new ClassCastException();
            }
            ((Runnable) c0012l.f431b).run();
        }
        this.f822t = null;
        this.f823u = null;
        this.f824v = null;
        if (this.f811g != null) {
            Iterator it3 = this.h.f783b.iterator();
            while (it3.hasNext()) {
                ((a.c) it3.next()).cancel();
            }
            this.f811g = null;
        }
        B.j jVar = this.f828z;
        if (jVar != null) {
            jVar.H();
            this.f794A.H();
            this.f795B.H();
        }
    }

    public final void l(boolean z2) {
        if (z2 && this.f822t != null) {
            Z(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f808c.k()) {
            if (abstractComponentCallbacksC0048q != null) {
                abstractComponentCallbacksC0048q.f948C = true;
                if (z2) {
                    abstractComponentCallbacksC0048q.f979t.l(true);
                }
            }
        }
    }

    public final void m(boolean z2, boolean z3) {
        if (z3 && this.f822t != null) {
            Z(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f808c.k()) {
            if (abstractComponentCallbacksC0048q != null && z3) {
                abstractComponentCallbacksC0048q.f979t.m(z2, true);
            }
        }
    }

    public final void n() {
        Iterator it = this.f808c.j().iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = (AbstractComponentCallbacksC0048q) it.next();
            if (abstractComponentCallbacksC0048q != null) {
                abstractComponentCallbacksC0048q.n();
                abstractComponentCallbacksC0048q.f979t.n();
            }
        }
    }

    public final boolean o() {
        if (this.f821s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f808c.k()) {
            if (abstractComponentCallbacksC0048q != null) {
                if (!abstractComponentCallbacksC0048q.f984y ? abstractComponentCallbacksC0048q.f979t.o() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f821s < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f808c.k()) {
            if (abstractComponentCallbacksC0048q != null && !abstractComponentCallbacksC0048q.f984y) {
                abstractComponentCallbacksC0048q.f979t.p();
            }
        }
    }

    public final void q(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (abstractComponentCallbacksC0048q != null) {
            if (abstractComponentCallbacksC0048q.equals(this.f808c.d(abstractComponentCallbacksC0048q.f966e))) {
                abstractComponentCallbacksC0048q.f977r.getClass();
                boolean I2 = I(abstractComponentCallbacksC0048q);
                Boolean bool = abstractComponentCallbacksC0048q.f969j;
                if (bool == null || bool.booleanValue() != I2) {
                    abstractComponentCallbacksC0048q.f969j = Boolean.valueOf(I2);
                    I i = abstractComponentCallbacksC0048q.f979t;
                    i.a0();
                    i.q(i.f825w);
                }
            }
        }
    }

    public final void r(boolean z2, boolean z3) {
        if (z3 && this.f822t != null) {
            Z(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f808c.k()) {
            if (abstractComponentCallbacksC0048q != null && z3) {
                abstractComponentCallbacksC0048q.f979t.r(z2, true);
            }
        }
    }

    public final boolean s() {
        if (this.f821s < 1) {
            return false;
        }
        boolean z2 = false;
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f808c.k()) {
            if (abstractComponentCallbacksC0048q != null && H(abstractComponentCallbacksC0048q)) {
                if (!abstractComponentCallbacksC0048q.f984y ? abstractComponentCallbacksC0048q.f979t.s() : false) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final void t(int i) {
        try {
            this.f807b = true;
            for (O o2 : ((HashMap) this.f808c.f743b).values()) {
                if (o2 != null) {
                    o2.f854e = i;
                }
            }
            J(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0040i) it.next()).e();
            }
            this.f807b = false;
            y(true);
        } catch (Throwable th) {
            this.f807b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f824v;
        if (abstractComponentCallbacksC0048q != null) {
            sb.append(abstractComponentCallbacksC0048q.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f824v)));
            sb.append("}");
        } else {
            C0051u c0051u = this.f822t;
            if (c0051u != null) {
                sb.append(c0051u.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f822t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u() {
        if (this.f800H) {
            this.f800H = false;
            Y();
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String e2 = V.e(str, "    ");
        T.t tVar = this.f808c;
        tVar.getClass();
        String str3 = str + "    ";
        HashMap hashMap = (HashMap) tVar.f743b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (O o2 : hashMap.values()) {
                printWriter.print(str);
                if (o2 != null) {
                    AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f853c;
                    printWriter.println(abstractComponentCallbacksC0048q);
                    abstractComponentCallbacksC0048q.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0048q.f981v));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0048q.f982w));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0048q.f983x);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0048q.f963a);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0048q.f966e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0048q.f976q);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0048q.f970k);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0048q.f971l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0048q.f972m);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0048q.f973n);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0048q.f984y);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0048q.f985z);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0048q.f947B);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0048q.f946A);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0048q.f951G);
                    if (abstractComponentCallbacksC0048q.f977r != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0048q.f977r);
                    }
                    if (abstractComponentCallbacksC0048q.f978s != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0048q.f978s);
                    }
                    if (abstractComponentCallbacksC0048q.f980u != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0048q.f980u);
                    }
                    if (abstractComponentCallbacksC0048q.f967f != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0048q.f967f);
                    }
                    if (abstractComponentCallbacksC0048q.f964b != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0048q.f964b);
                    }
                    if (abstractComponentCallbacksC0048q.f965c != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0048q.f965c);
                    }
                    if (abstractComponentCallbacksC0048q.d != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0048q.d);
                    }
                    Object obj = abstractComponentCallbacksC0048q.f968g;
                    if (obj == null) {
                        I i = abstractComponentCallbacksC0048q.f977r;
                        obj = (i == null || (str2 = abstractComponentCallbacksC0048q.h) == null) ? null : i.f808c.d(str2);
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
                    C0047p c0047p = abstractComponentCallbacksC0048q.f952H;
                    printWriter.println(c0047p == null ? false : c0047p.f937a);
                    C0047p c0047p2 = abstractComponentCallbacksC0048q.f952H;
                    if ((c0047p2 == null ? 0 : c0047p2.f938b) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        C0047p c0047p3 = abstractComponentCallbacksC0048q.f952H;
                        printWriter.println(c0047p3 == null ? 0 : c0047p3.f938b);
                    }
                    C0047p c0047p4 = abstractComponentCallbacksC0048q.f952H;
                    if ((c0047p4 == null ? 0 : c0047p4.f939c) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        C0047p c0047p5 = abstractComponentCallbacksC0048q.f952H;
                        printWriter.println(c0047p5 == null ? 0 : c0047p5.f939c);
                    }
                    C0047p c0047p6 = abstractComponentCallbacksC0048q.f952H;
                    if ((c0047p6 == null ? 0 : c0047p6.d) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        C0047p c0047p7 = abstractComponentCallbacksC0048q.f952H;
                        printWriter.println(c0047p7 == null ? 0 : c0047p7.d);
                    }
                    C0047p c0047p8 = abstractComponentCallbacksC0048q.f952H;
                    if ((c0047p8 == null ? 0 : c0047p8.f940e) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        C0047p c0047p9 = abstractComponentCallbacksC0048q.f952H;
                        printWriter.println(c0047p9 == null ? 0 : c0047p9.f940e);
                    }
                    if (abstractComponentCallbacksC0048q.f949D != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0048q.f949D);
                    }
                    if (abstractComponentCallbacksC0048q.f950E != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0048q.f950E);
                    }
                    if (abstractComponentCallbacksC0048q.h() != null) {
                        o.l lVar = ((c0.a) new B0.d(abstractComponentCallbacksC0048q.c(), c0.a.f1513c).u(c0.a.class)).f1514b;
                        if (lVar.f3332c > 0) {
                            printWriter.print(str3);
                            printWriter.println("Loaders:");
                            if (lVar.f3332c > 0) {
                                if (lVar.f3331b[0] != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(str3);
                                printWriter.print("  #");
                                printWriter.print(lVar.f3330a[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + abstractComponentCallbacksC0048q.f979t + ":");
                    abstractComponentCallbacksC0048q.f979t.v(V.e(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) tVar.f742a;
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
        ArrayList arrayList2 = this.f809e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q3 = (AbstractComponentCallbacksC0048q) this.f809e.get(i3);
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
        synchronized (this.f806a) {
            try {
                int size4 = this.f806a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i5 = 0; i5 < size4; i5++) {
                        Object obj2 = (G) this.f806a.get(i5);
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
        printWriter.println(this.f822t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f823u);
        if (this.f824v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f824v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f821s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f798E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f799G);
        if (this.f797D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f797D);
        }
    }

    public final void w(G g2, boolean z2) {
        if (!z2) {
            if (this.f822t == null) {
                if (!this.f799G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f798E || this.F) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f806a) {
            try {
                if (this.f822t == null) {
                    if (!z2) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f806a.add(g2);
                    S();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(boolean z2) {
        if (this.f807b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f822t == null) {
            if (!this.f799G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f822t.f994g.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2 && (this.f798E || this.F)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f801I == null) {
            this.f801I = new ArrayList();
            this.f802J = new ArrayList();
        }
    }

    public final boolean y(boolean z2) {
        boolean z3;
        x(z2);
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.f801I;
            ArrayList arrayList2 = this.f802J;
            synchronized (this.f806a) {
                if (this.f806a.isEmpty()) {
                    z3 = false;
                } else {
                    try {
                        int size = this.f806a.size();
                        z3 = false;
                        for (int i = 0; i < size; i++) {
                            z3 |= ((G) this.f806a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z3) {
                a0();
                u();
                ((HashMap) this.f808c.f743b).values().removeAll(Collections.singleton(null));
                return z4;
            }
            z4 = true;
            this.f807b = true;
            try {
                P(this.f801I, this.f802J);
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
        boolean z2 = ((C0032a) arrayList3.get(i)).f886o;
        ArrayList arrayList5 = this.f803K;
        if (arrayList5 == null) {
            this.f803K = new ArrayList();
        } else {
            arrayList5.clear();
        }
        ArrayList arrayList6 = this.f803K;
        T.t tVar4 = this.f808c;
        arrayList6.addAll(tVar4.k());
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f825w;
        int i6 = i;
        boolean z3 = false;
        while (true) {
            int i7 = 1;
            if (i6 >= i2) {
                T.t tVar5 = tVar4;
                this.f803K.clear();
                if (!z2 && this.f821s >= 1) {
                    for (int i8 = i; i8 < i2; i8++) {
                        Iterator it = ((C0032a) arrayList.get(i8)).f875a.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = ((P) it.next()).f856b;
                            if (abstractComponentCallbacksC0048q2 == null || abstractComponentCallbacksC0048q2.f977r == null) {
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
                        ArrayList arrayList7 = c0032a.f875a;
                        boolean z4 = true;
                        for (int size = arrayList7.size() - 1; size >= 0; size--) {
                            P p2 = (P) arrayList7.get(size);
                            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q3 = p2.f856b;
                            if (abstractComponentCallbacksC0048q3 != null) {
                                if (abstractComponentCallbacksC0048q3.f952H != null) {
                                    abstractComponentCallbacksC0048q3.f().f937a = z4;
                                }
                                int i10 = c0032a.f879f;
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
                                if (abstractComponentCallbacksC0048q3.f952H != null || i11 != 0) {
                                    abstractComponentCallbacksC0048q3.f();
                                    abstractComponentCallbacksC0048q3.f952H.f941f = i11;
                                }
                                abstractComponentCallbacksC0048q3.f();
                                abstractComponentCallbacksC0048q3.f952H.getClass();
                            }
                            int i13 = p2.f855a;
                            I i14 = c0032a.f887p;
                            switch (i13) {
                                case 1:
                                    abstractComponentCallbacksC0048q3.E(p2.d, p2.f858e, p2.f859f, p2.f860g);
                                    z4 = true;
                                    i14.T(abstractComponentCallbacksC0048q3, true);
                                    i14.O(abstractComponentCallbacksC0048q3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + p2.f855a);
                                case 3:
                                    abstractComponentCallbacksC0048q3.E(p2.d, p2.f858e, p2.f859f, p2.f860g);
                                    i14.a(abstractComponentCallbacksC0048q3);
                                    z4 = true;
                                case 4:
                                    abstractComponentCallbacksC0048q3.E(p2.d, p2.f858e, p2.f859f, p2.f860g);
                                    i14.getClass();
                                    X(abstractComponentCallbacksC0048q3);
                                    z4 = true;
                                case 5:
                                    abstractComponentCallbacksC0048q3.E(p2.d, p2.f858e, p2.f859f, p2.f860g);
                                    i14.T(abstractComponentCallbacksC0048q3, true);
                                    i14.E(abstractComponentCallbacksC0048q3);
                                    z4 = true;
                                case 6:
                                    abstractComponentCallbacksC0048q3.E(p2.d, p2.f858e, p2.f859f, p2.f860g);
                                    i14.c(abstractComponentCallbacksC0048q3);
                                    z4 = true;
                                case 7:
                                    abstractComponentCallbacksC0048q3.E(p2.d, p2.f858e, p2.f859f, p2.f860g);
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
                        ArrayList arrayList8 = c0032a.f875a;
                        int size2 = arrayList8.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            P p3 = (P) arrayList8.get(i15);
                            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q4 = p3.f856b;
                            if (abstractComponentCallbacksC0048q4 != null) {
                                if (abstractComponentCallbacksC0048q4.f952H != null) {
                                    abstractComponentCallbacksC0048q4.f().f937a = false;
                                }
                                int i16 = c0032a.f879f;
                                if (abstractComponentCallbacksC0048q4.f952H != null || i16 != 0) {
                                    abstractComponentCallbacksC0048q4.f();
                                    abstractComponentCallbacksC0048q4.f952H.f941f = i16;
                                }
                                abstractComponentCallbacksC0048q4.f();
                                abstractComponentCallbacksC0048q4.f952H.getClass();
                            }
                            int i17 = p3.f855a;
                            I i18 = c0032a.f887p;
                            switch (i17) {
                                case 1:
                                    abstractComponentCallbacksC0048q4.E(p3.d, p3.f858e, p3.f859f, p3.f860g);
                                    i18.T(abstractComponentCallbacksC0048q4, false);
                                    i18.a(abstractComponentCallbacksC0048q4);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + p3.f855a);
                                case 3:
                                    abstractComponentCallbacksC0048q4.E(p3.d, p3.f858e, p3.f859f, p3.f860g);
                                    i18.O(abstractComponentCallbacksC0048q4);
                                case 4:
                                    abstractComponentCallbacksC0048q4.E(p3.d, p3.f858e, p3.f859f, p3.f860g);
                                    i18.E(abstractComponentCallbacksC0048q4);
                                case 5:
                                    abstractComponentCallbacksC0048q4.E(p3.d, p3.f858e, p3.f859f, p3.f860g);
                                    i18.T(abstractComponentCallbacksC0048q4, false);
                                    X(abstractComponentCallbacksC0048q4);
                                case 6:
                                    abstractComponentCallbacksC0048q4.E(p3.d, p3.f858e, p3.f859f, p3.f860g);
                                    i18.g(abstractComponentCallbacksC0048q4);
                                case 7:
                                    abstractComponentCallbacksC0048q4.E(p3.d, p3.f858e, p3.f859f, p3.f860g);
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
                        for (int size3 = c0032a2.f875a.size() - 1; size3 >= 0; size3--) {
                            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q5 = ((P) c0032a2.f875a.get(size3)).f856b;
                            if (abstractComponentCallbacksC0048q5 != null) {
                                f(abstractComponentCallbacksC0048q5).k();
                            }
                        }
                    } else {
                        Iterator it2 = c0032a2.f875a.iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q6 = ((P) it2.next()).f856b;
                            if (abstractComponentCallbacksC0048q6 != null) {
                                f(abstractComponentCallbacksC0048q6).k();
                            }
                        }
                    }
                }
                J(this.f821s, true);
                HashSet hashSet = new HashSet();
                for (int i20 = i; i20 < i2; i20++) {
                    Iterator it3 = ((C0032a) arrayList.get(i20)).f875a.iterator();
                    while (it3.hasNext()) {
                        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q7 = ((P) it3.next()).f856b;
                        if (abstractComponentCallbacksC0048q7 != null && (viewGroup = abstractComponentCallbacksC0048q7.f949D) != null) {
                            hashSet.add(C0040i.f(viewGroup, D()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    C0040i c0040i = (C0040i) it4.next();
                    c0040i.d = booleanValue;
                    synchronized (c0040i.f915b) {
                        try {
                            c0040i.g();
                            c0040i.f917e = false;
                            int size4 = c0040i.f915b.size() - 1;
                            while (true) {
                                if (size4 >= 0) {
                                    U u2 = (U) c0040i.f915b.get(size4);
                                    int c2 = V.c(u2.f871c.f950E);
                                    if (u2.f869a != 2 || c2 == 2) {
                                        size4--;
                                    } else {
                                        C0047p c0047p = u2.f871c.f952H;
                                        c0040i.f917e = false;
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
                    if (((Boolean) arrayList2.get(i21)).booleanValue() && c0032a3.f889r >= 0) {
                        c0032a3.f889r = -1;
                    }
                    c0032a3.getClass();
                }
                return;
            }
            C0032a c0032a4 = (C0032a) arrayList3.get(i6);
            if (((Boolean) arrayList4.get(i6)).booleanValue()) {
                tVar2 = tVar4;
                int i22 = 1;
                ArrayList arrayList9 = this.f803K;
                ArrayList arrayList10 = c0032a4.f875a;
                int size5 = arrayList10.size() - 1;
                while (size5 >= 0) {
                    P p4 = (P) arrayList10.get(size5);
                    int i23 = p4.f855a;
                    if (i23 != i22) {
                        if (i23 != 3) {
                            switch (i23) {
                                case 8:
                                    abstractComponentCallbacksC0048q = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0048q = p4.f856b;
                                    break;
                                case 10:
                                    p4.i = p4.h;
                                    break;
                            }
                            size5--;
                            i22 = 1;
                        }
                        arrayList9.add(p4.f856b);
                        size5--;
                        i22 = 1;
                    }
                    arrayList9.remove(p4.f856b);
                    size5--;
                    i22 = 1;
                }
            } else {
                ArrayList arrayList11 = this.f803K;
                int i24 = 0;
                while (true) {
                    ArrayList arrayList12 = c0032a4.f875a;
                    if (i24 < arrayList12.size()) {
                        P p5 = (P) arrayList12.get(i24);
                        int i25 = p5.f855a;
                        if (i25 != i7) {
                            if (i25 != 2) {
                                if (i25 == 3 || i25 == 6) {
                                    arrayList11.remove(p5.f856b);
                                    AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q8 = p5.f856b;
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
                                    p5.f857c = true;
                                    i24++;
                                    abstractComponentCallbacksC0048q = p5.f856b;
                                }
                                tVar3 = tVar4;
                                i3 = 1;
                            } else {
                                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q9 = p5.f856b;
                                int i26 = abstractComponentCallbacksC0048q9.f982w;
                                int size6 = arrayList11.size() - 1;
                                boolean z5 = false;
                                while (size6 >= 0) {
                                    T.t tVar6 = tVar4;
                                    AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q10 = (AbstractComponentCallbacksC0048q) arrayList11.get(size6);
                                    if (abstractComponentCallbacksC0048q10.f982w != i26) {
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
                                        p6.f859f = p5.f859f;
                                        p6.f858e = p5.f858e;
                                        p6.f860g = p5.f860g;
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
                                    p5.f855a = 1;
                                    p5.f857c = true;
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
                        arrayList11.add(p5.f856b);
                        i24 += i3;
                        i7 = i3;
                        tVar4 = tVar3;
                    } else {
                        tVar2 = tVar4;
                    }
                }
            }
            z3 = z3 || c0032a4.f880g;
            i6++;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            tVar4 = tVar2;
        }
    }
}
