package androidx.fragment.app;

import a.C0038A;
import a.C0039B;
import a.InterfaceC0042c;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0082o;
import androidx.lifecycle.C0088v;
import androidx.lifecycle.EnumC0081n;
import b0.AbstractC0091a;
import c.AbstractC0103j;
import c.C0102i;
import com.luckyarcade.spinthrow.GameConfig;
import com.luckyarcade.spinthrow.R;
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
public abstract class K {

    /* renamed from: A, reason: collision with root package name */
    public C0102i f1212A;

    /* renamed from: B, reason: collision with root package name */
    public C0102i f1213B;

    /* renamed from: C, reason: collision with root package name */
    public ArrayDeque f1214C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1215D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1216E;
    public boolean F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f1217G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f1218H;

    /* renamed from: I, reason: collision with root package name */
    public ArrayList f1219I;

    /* renamed from: J, reason: collision with root package name */
    public ArrayList f1220J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList f1221K;

    /* renamed from: L, reason: collision with root package name */
    public O f1222L;

    /* renamed from: M, reason: collision with root package name */
    public final K0.B f1223M;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1225b;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f1227d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f1228e;

    /* renamed from: g, reason: collision with root package name */
    public C0039B f1230g;

    /* renamed from: l, reason: collision with root package name */
    public final B.j f1233l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f1234m;

    /* renamed from: n, reason: collision with root package name */
    public final A f1235n;

    /* renamed from: o, reason: collision with root package name */
    public final A f1236o;

    /* renamed from: p, reason: collision with root package name */
    public final A f1237p;

    /* renamed from: q, reason: collision with root package name */
    public final A f1238q;

    /* renamed from: r, reason: collision with root package name */
    public final D f1239r;

    /* renamed from: s, reason: collision with root package name */
    public int f1240s;

    /* renamed from: t, reason: collision with root package name */
    public C0063u f1241t;

    /* renamed from: u, reason: collision with root package name */
    public q1.l f1242u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractComponentCallbacksC0060q f1243v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractComponentCallbacksC0060q f1244w;

    /* renamed from: x, reason: collision with root package name */
    public final E f1245x;

    /* renamed from: y, reason: collision with root package name */
    public final H0.e f1246y;

    /* renamed from: z, reason: collision with root package name */
    public C0102i f1247z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1224a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final T.v f1226c = new T.v(2);

    /* renamed from: f, reason: collision with root package name */
    public final z f1229f = new z(this);
    public final C h = new C(this);
    public final AtomicInteger i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map f1231j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map f1232k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.fragment.app.A] */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.fragment.app.A] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.fragment.app.A] */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.fragment.app.A] */
    public K() {
        Collections.synchronizedMap(new HashMap());
        this.f1233l = new B.j(this);
        this.f1234m = new CopyOnWriteArrayList();
        final int i = 0;
        this.f1235n = new J.a(this) { // from class: androidx.fragment.app.A

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ K f1192b;

            {
                this.f1192b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        K k2 = this.f1192b;
                        if (k2.G()) {
                            k2.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        K k3 = this.f1192b;
                        if (k3.G() && num.intValue() == 80) {
                            k3.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.k kVar = (z.k) obj;
                        K k4 = this.f1192b;
                        if (k4.G()) {
                            k4.m(kVar.f4634a, false);
                            break;
                        }
                        break;
                    default:
                        z.n nVar = (z.n) obj;
                        K k5 = this.f1192b;
                        if (k5.G()) {
                            k5.r(nVar.f4636a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f1236o = new J.a(this) { // from class: androidx.fragment.app.A

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ K f1192b;

            {
                this.f1192b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i2) {
                    case 0:
                        K k2 = this.f1192b;
                        if (k2.G()) {
                            k2.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        K k3 = this.f1192b;
                        if (k3.G() && num.intValue() == 80) {
                            k3.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.k kVar = (z.k) obj;
                        K k4 = this.f1192b;
                        if (k4.G()) {
                            k4.m(kVar.f4634a, false);
                            break;
                        }
                        break;
                    default:
                        z.n nVar = (z.n) obj;
                        K k5 = this.f1192b;
                        if (k5.G()) {
                            k5.r(nVar.f4636a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.f1237p = new J.a(this) { // from class: androidx.fragment.app.A

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ K f1192b;

            {
                this.f1192b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i3) {
                    case 0:
                        K k2 = this.f1192b;
                        if (k2.G()) {
                            k2.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        K k3 = this.f1192b;
                        if (k3.G() && num.intValue() == 80) {
                            k3.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.k kVar = (z.k) obj;
                        K k4 = this.f1192b;
                        if (k4.G()) {
                            k4.m(kVar.f4634a, false);
                            break;
                        }
                        break;
                    default:
                        z.n nVar = (z.n) obj;
                        K k5 = this.f1192b;
                        if (k5.G()) {
                            k5.r(nVar.f4636a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.f1238q = new J.a(this) { // from class: androidx.fragment.app.A

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ K f1192b;

            {
                this.f1192b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i4) {
                    case 0:
                        K k2 = this.f1192b;
                        if (k2.G()) {
                            k2.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        K k3 = this.f1192b;
                        if (k3.G() && num.intValue() == 80) {
                            k3.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.k kVar = (z.k) obj;
                        K k4 = this.f1192b;
                        if (k4.G()) {
                            k4.m(kVar.f4634a, false);
                            break;
                        }
                        break;
                    default:
                        z.n nVar = (z.n) obj;
                        K k5 = this.f1192b;
                        if (k5.G()) {
                            k5.r(nVar.f4636a, false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f1239r = new D(this);
        this.f1240s = -1;
        this.f1245x = new E(this);
        this.f1246y = new H0.e(12);
        this.f1214C = new ArrayDeque();
        this.f1223M = new K0.B(5, this);
    }

    public static boolean F(AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q) {
        abstractComponentCallbacksC0060q.getClass();
        Iterator it = abstractComponentCallbacksC0060q.f1412t.f1226c.n().iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q2 = (AbstractComponentCallbacksC0060q) it.next();
            if (abstractComponentCallbacksC0060q2 != null) {
                z2 = F(abstractComponentCallbacksC0060q2);
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public static boolean H(AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q) {
        if (abstractComponentCallbacksC0060q == null) {
            return true;
        }
        return abstractComponentCallbacksC0060q.f1379B && (abstractComponentCallbacksC0060q.f1410r == null || H(abstractComponentCallbacksC0060q.f1413u));
    }

    public static boolean I(AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q) {
        if (abstractComponentCallbacksC0060q == null) {
            return true;
        }
        K k2 = abstractComponentCallbacksC0060q.f1410r;
        return abstractComponentCallbacksC0060q.equals(k2.f1244w) && I(k2.f1243v);
    }

    public static void X(AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0060q);
        }
        if (abstractComponentCallbacksC0060q.f1417y) {
            abstractComponentCallbacksC0060q.f1417y = false;
            abstractComponentCallbacksC0060q.f1385I = !abstractComponentCallbacksC0060q.f1385I;
        }
    }

    public final AbstractComponentCallbacksC0060q A(int i) {
        T.v vVar = this.f1226c;
        ArrayList arrayList = (ArrayList) vVar.f824a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = (AbstractComponentCallbacksC0060q) arrayList.get(size);
            if (abstractComponentCallbacksC0060q != null && abstractComponentCallbacksC0060q.f1414v == i) {
                return abstractComponentCallbacksC0060q;
            }
        }
        for (S s2 : ((HashMap) vVar.f825b).values()) {
            if (s2 != null) {
                AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q2 = s2.f1275c;
                if (abstractComponentCallbacksC0060q2.f1414v == i) {
                    return abstractComponentCallbacksC0060q2;
                }
            }
        }
        return null;
    }

    public final ViewGroup B(AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q) {
        ViewGroup viewGroup = abstractComponentCallbacksC0060q.f1381D;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0060q.f1415w > 0 && this.f1242u.T()) {
            View Q2 = this.f1242u.Q(abstractComponentCallbacksC0060q.f1415w);
            if (Q2 instanceof ViewGroup) {
                return (ViewGroup) Q2;
            }
        }
        return null;
    }

    public final E C() {
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = this.f1243v;
        return abstractComponentCallbacksC0060q != null ? abstractComponentCallbacksC0060q.f1410r.C() : this.f1245x;
    }

    public final H0.e D() {
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = this.f1243v;
        return abstractComponentCallbacksC0060q != null ? abstractComponentCallbacksC0060q.f1410r.D() : this.f1246y;
    }

    public final void E(AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0060q);
        }
        if (abstractComponentCallbacksC0060q.f1417y) {
            return;
        }
        abstractComponentCallbacksC0060q.f1417y = true;
        abstractComponentCallbacksC0060q.f1385I = true ^ abstractComponentCallbacksC0060q.f1385I;
        W(abstractComponentCallbacksC0060q);
    }

    public final boolean G() {
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = this.f1243v;
        if (abstractComponentCallbacksC0060q == null) {
            return true;
        }
        return abstractComponentCallbacksC0060q.i() && this.f1243v.f().G();
    }

    public final void J(int i, boolean z2) {
        HashMap hashMap;
        C0063u c0063u;
        if (this.f1241t == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i != this.f1240s) {
            this.f1240s = i;
            T.v vVar = this.f1226c;
            Iterator it = ((ArrayList) vVar.f824a).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = (HashMap) vVar.f825b;
                if (!hasNext) {
                    break;
                }
                S s2 = (S) hashMap.get(((AbstractComponentCallbacksC0060q) it.next()).f1399e);
                if (s2 != null) {
                    s2.k();
                }
            }
            for (S s3 : hashMap.values()) {
                if (s3 != null) {
                    s3.k();
                    AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = s3.f1275c;
                    if (abstractComponentCallbacksC0060q.f1404l && !abstractComponentCallbacksC0060q.k()) {
                        vVar.r(s3);
                    }
                }
            }
            Y();
            if (this.f1215D && (c0063u = this.f1241t) != null && this.f1240s == 7) {
                c0063u.f1426k.invalidateOptionsMenu();
                this.f1215D = false;
            }
        }
    }

    public final void K() {
        if (this.f1241t == null) {
            return;
        }
        this.f1216E = false;
        this.F = false;
        this.f1222L.f1261g = false;
        for (AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q : this.f1226c.o()) {
            if (abstractComponentCallbacksC0060q != null) {
                abstractComponentCallbacksC0060q.f1412t.K();
            }
        }
    }

    public final boolean L() {
        return M(-1, 0);
    }

    public final boolean M(int i, int i2) {
        y(false);
        x(true);
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = this.f1244w;
        if (abstractComponentCallbacksC0060q != null && i < 0 && abstractComponentCallbacksC0060q.c().L()) {
            return true;
        }
        boolean N2 = N(this.f1219I, this.f1220J, i, i2);
        if (N2) {
            this.f1225b = true;
            try {
                P(this.f1219I, this.f1220J);
            } finally {
                d();
            }
        }
        a0();
        u();
        ((HashMap) this.f1226c.f825b).values().removeAll(Collections.singleton(null));
        return N2;
    }

    public final boolean N(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z2 = (i2 & 1) != 0;
        ArrayList arrayList3 = this.f1227d;
        int i3 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                i3 = z2 ? 0 : this.f1227d.size() - 1;
            } else {
                int size = this.f1227d.size() - 1;
                while (size >= 0) {
                    C0044a c0044a = (C0044a) this.f1227d.get(size);
                    if (i >= 0 && i == c0044a.f1316r) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z2) {
                        while (size > 0) {
                            C0044a c0044a2 = (C0044a) this.f1227d.get(size - 1);
                            if (i < 0 || i != c0044a2.f1316r) {
                                break;
                            }
                            size--;
                        }
                    } else if (size != this.f1227d.size() - 1) {
                        size++;
                    }
                }
                i3 = size;
            }
        }
        if (i3 < 0) {
            return false;
        }
        for (int size2 = this.f1227d.size() - 1; size2 >= i3; size2--) {
            arrayList.add((C0044a) this.f1227d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void O(AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0060q + " nesting=" + abstractComponentCallbacksC0060q.f1409q);
        }
        boolean k2 = abstractComponentCallbacksC0060q.k();
        if (abstractComponentCallbacksC0060q.f1418z && k2) {
            return;
        }
        T.v vVar = this.f1226c;
        synchronized (((ArrayList) vVar.f824a)) {
            ((ArrayList) vVar.f824a).remove(abstractComponentCallbacksC0060q);
        }
        abstractComponentCallbacksC0060q.f1403k = false;
        if (F(abstractComponentCallbacksC0060q)) {
            this.f1215D = true;
        }
        abstractComponentCallbacksC0060q.f1404l = true;
        W(abstractComponentCallbacksC0060q);
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
            if (!((C0044a) arrayList.get(i)).f1313o) {
                if (i2 != i) {
                    z(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0044a) arrayList.get(i2)).f1313o) {
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
        S s2;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f1241t.h.getClassLoader());
                this.f1232k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f1241t.h.getClassLoader());
                arrayList.add((Q) bundle.getParcelable("state"));
            }
        }
        T.v vVar = this.f1226c;
        HashMap hashMap = (HashMap) vVar.f826c;
        hashMap.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Q q2 = (Q) it.next();
            hashMap.put(q2.f1263b, q2);
        }
        M m2 = (M) bundle3.getParcelable("state");
        if (m2 == null) {
            return;
        }
        HashMap hashMap2 = (HashMap) vVar.f825b;
        hashMap2.clear();
        Iterator it2 = m2.f1248a.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            i = 2;
            jVar = this.f1233l;
            if (!hasNext) {
                break;
            }
            Q q3 = (Q) ((HashMap) vVar.f826c).remove((String) it2.next());
            if (q3 != null) {
                AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = (AbstractComponentCallbacksC0060q) this.f1222L.f1256b.get(q3.f1263b);
                if (abstractComponentCallbacksC0060q != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0060q);
                    }
                    s2 = new S(jVar, vVar, abstractComponentCallbacksC0060q, q3);
                } else {
                    s2 = new S(this.f1233l, this.f1226c, this.f1241t.h.getClassLoader(), C(), q3);
                }
                AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q2 = s2.f1275c;
                abstractComponentCallbacksC0060q2.f1410r = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0060q2.f1399e + "): " + abstractComponentCallbacksC0060q2);
                }
                s2.m(this.f1241t.h.getClassLoader());
                vVar.q(s2);
                s2.f1277e = this.f1240s;
            }
        }
        O o2 = this.f1222L;
        o2.getClass();
        Iterator it3 = new ArrayList(o2.f1256b.values()).iterator();
        while (it3.hasNext()) {
            AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q3 = (AbstractComponentCallbacksC0060q) it3.next();
            if (hashMap2.get(abstractComponentCallbacksC0060q3.f1399e) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0060q3 + " that was not found in the set of active Fragments " + m2.f1248a);
                }
                this.f1222L.e(abstractComponentCallbacksC0060q3);
                abstractComponentCallbacksC0060q3.f1410r = this;
                S s3 = new S(jVar, vVar, abstractComponentCallbacksC0060q3);
                s3.f1277e = 1;
                s3.k();
                abstractComponentCallbacksC0060q3.f1404l = true;
                s3.k();
            }
        }
        ArrayList<String> arrayList2 = m2.f1249b;
        ((ArrayList) vVar.f824a).clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                AbstractComponentCallbacksC0060q h = vVar.h(str3);
                if (h == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str3 + ")");
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + h);
                }
                vVar.c(h);
            }
        }
        if (m2.f1250c != null) {
            this.f1227d = new ArrayList(m2.f1250c.length);
            int i3 = 0;
            while (true) {
                C0045b[] c0045bArr = m2.f1250c;
                if (i3 >= c0045bArr.length) {
                    break;
                }
                C0045b c0045b = c0045bArr[i3];
                c0045b.getClass();
                C0044a c0044a = new C0044a(this);
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    int[] iArr = c0045b.f1317a;
                    if (i4 >= iArr.length) {
                        break;
                    }
                    T t2 = new T();
                    int i6 = i4 + 1;
                    t2.f1278a = iArr[i4];
                    if (Log.isLoggable("FragmentManager", i)) {
                        Log.v("FragmentManager", "Instantiate " + c0044a + " op #" + i5 + " base fragment #" + iArr[i6]);
                    }
                    t2.h = EnumC0081n.values()[c0045b.f1319c[i5]];
                    t2.i = EnumC0081n.values()[c0045b.f1320d[i5]];
                    int i7 = i4 + 2;
                    t2.f1280c = iArr[i6] != 0;
                    int i8 = iArr[i7];
                    t2.f1281d = i8;
                    int i9 = iArr[i4 + 3];
                    t2.f1282e = i9;
                    int i10 = i4 + 5;
                    int i11 = iArr[i4 + 4];
                    t2.f1283f = i11;
                    i4 += 6;
                    int i12 = iArr[i10];
                    t2.f1284g = i12;
                    c0044a.f1302b = i8;
                    c0044a.f1303c = i9;
                    c0044a.f1304d = i11;
                    c0044a.f1305e = i12;
                    c0044a.b(t2);
                    i5++;
                    i = 2;
                }
                c0044a.f1306f = c0045b.f1321e;
                c0044a.h = c0045b.f1322f;
                c0044a.f1307g = true;
                c0044a.i = c0045b.h;
                c0044a.f1308j = c0045b.i;
                c0044a.f1309k = c0045b.f1324j;
                c0044a.f1310l = c0045b.f1325k;
                c0044a.f1311m = c0045b.f1326l;
                c0044a.f1312n = c0045b.f1327m;
                c0044a.f1313o = c0045b.f1328n;
                c0044a.f1316r = c0045b.f1323g;
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = c0045b.f1318b;
                    if (i13 >= arrayList3.size()) {
                        break;
                    }
                    String str4 = (String) arrayList3.get(i13);
                    if (str4 != null) {
                        ((T) c0044a.f1301a.get(i13)).f1279b = vVar.h(str4);
                    }
                    i13++;
                }
                c0044a.c(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i3 + " (index " + c0044a.f1316r + "): " + c0044a);
                    PrintWriter printWriter = new PrintWriter(new V());
                    c0044a.d("  ", printWriter, false);
                    printWriter.close();
                }
                this.f1227d.add(c0044a);
                i3++;
                i = 2;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.f1227d = null;
        }
        this.i.set(m2.f1251d);
        String str5 = m2.f1252e;
        if (str5 != null) {
            AbstractComponentCallbacksC0060q h2 = vVar.h(str5);
            this.f1244w = h2;
            q(h2);
        }
        ArrayList arrayList4 = m2.f1253f;
        if (arrayList4 != null) {
            for (int i14 = i2; i14 < arrayList4.size(); i14++) {
                this.f1231j.put((String) arrayList4.get(i14), (C0046c) m2.f1254g.get(i14));
            }
        }
        this.f1214C = new ArrayDeque(m2.h);
    }

    public final Bundle R() {
        int i;
        ArrayList arrayList;
        C0045b[] c0045bArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0052i c0052i = (C0052i) it.next();
            if (c0052i.f1349e) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0052i.f1349e = false;
                c0052i.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((C0052i) it2.next()).e();
        }
        y(true);
        this.f1216E = true;
        this.f1222L.f1261g = true;
        T.v vVar = this.f1226c;
        vVar.getClass();
        HashMap hashMap = (HashMap) vVar.f825b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (S s2 : hashMap.values()) {
            if (s2 != null) {
                AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = s2.f1275c;
                Q q2 = new Q(abstractComponentCallbacksC0060q);
                if (abstractComponentCallbacksC0060q.f1395a <= -1 || q2.f1272m != null) {
                    q2.f1272m = abstractComponentCallbacksC0060q.f1396b;
                } else {
                    Bundle bundle2 = new Bundle();
                    abstractComponentCallbacksC0060q.t(bundle2);
                    abstractComponentCallbacksC0060q.f1392P.c(bundle2);
                    bundle2.putParcelable("android:support:fragments", abstractComponentCallbacksC0060q.f1412t.R());
                    s2.f1273a.s(false);
                    if (bundle2.isEmpty()) {
                        bundle2 = null;
                    }
                    if (abstractComponentCallbacksC0060q.f1382E != null) {
                        s2.o();
                    }
                    if (abstractComponentCallbacksC0060q.f1397c != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putSparseParcelableArray("android:view_state", abstractComponentCallbacksC0060q.f1397c);
                    }
                    if (abstractComponentCallbacksC0060q.f1398d != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBundle("android:view_registry_state", abstractComponentCallbacksC0060q.f1398d);
                    }
                    if (!abstractComponentCallbacksC0060q.f1383G) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBoolean("android:user_visible_hint", abstractComponentCallbacksC0060q.f1383G);
                    }
                    q2.f1272m = bundle2;
                    if (abstractComponentCallbacksC0060q.h != null) {
                        if (bundle2 == null) {
                            q2.f1272m = new Bundle();
                        }
                        q2.f1272m.putString("android:target_state", abstractComponentCallbacksC0060q.h);
                        int i2 = abstractComponentCallbacksC0060q.i;
                        if (i2 != 0) {
                            q2.f1272m.putInt("android:target_req_state", i2);
                        }
                    }
                }
                AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q2 = s2.f1275c;
                arrayList2.add(abstractComponentCallbacksC0060q2.f1399e);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0060q2 + ": " + abstractComponentCallbacksC0060q2.f1396b);
                }
            }
        }
        T.v vVar2 = this.f1226c;
        vVar2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) vVar2.f826c).values());
        if (!arrayList3.isEmpty()) {
            T.v vVar3 = this.f1226c;
            synchronized (((ArrayList) vVar3.f824a)) {
                try {
                    if (((ArrayList) vVar3.f824a).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) vVar3.f824a).size());
                        Iterator it3 = ((ArrayList) vVar3.f824a).iterator();
                        while (it3.hasNext()) {
                            AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q3 = (AbstractComponentCallbacksC0060q) it3.next();
                            arrayList.add(abstractComponentCallbacksC0060q3.f1399e);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0060q3.f1399e + "): " + abstractComponentCallbacksC0060q3);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList4 = this.f1227d;
            if (arrayList4 == null || (size = arrayList4.size()) <= 0) {
                c0045bArr = null;
            } else {
                c0045bArr = new C0045b[size];
                for (i = 0; i < size; i++) {
                    c0045bArr[i] = new C0045b((C0044a) this.f1227d.get(i));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.f1227d.get(i));
                    }
                }
            }
            M m2 = new M();
            m2.f1252e = null;
            ArrayList arrayList5 = new ArrayList();
            m2.f1253f = arrayList5;
            ArrayList arrayList6 = new ArrayList();
            m2.f1254g = arrayList6;
            m2.f1248a = arrayList2;
            m2.f1249b = arrayList;
            m2.f1250c = c0045bArr;
            m2.f1251d = this.i.get();
            AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q4 = this.f1244w;
            if (abstractComponentCallbacksC0060q4 != null) {
                m2.f1252e = abstractComponentCallbacksC0060q4.f1399e;
            }
            arrayList5.addAll(this.f1231j.keySet());
            arrayList6.addAll(this.f1231j.values());
            m2.h = new ArrayList(this.f1214C);
            bundle.putParcelable("state", m2);
            for (String str : this.f1232k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f1232k.get(str));
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Q q3 = (Q) it4.next();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("state", q3);
                bundle.putBundle("fragment_" + q3.f1263b, bundle3);
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public final void S() {
        synchronized (this.f1224a) {
            try {
                if (this.f1224a.size() == 1) {
                    this.f1241t.i.removeCallbacks(this.f1223M);
                    this.f1241t.i.post(this.f1223M);
                    a0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void T(AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q, boolean z2) {
        ViewGroup B2 = B(abstractComponentCallbacksC0060q);
        if (B2 == null || !(B2 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) B2).setDrawDisappearingViewsLast(!z2);
    }

    public final void U(AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q, EnumC0081n enumC0081n) {
        if (abstractComponentCallbacksC0060q.equals(this.f1226c.h(abstractComponentCallbacksC0060q.f1399e)) && (abstractComponentCallbacksC0060q.f1411s == null || abstractComponentCallbacksC0060q.f1410r == this)) {
            abstractComponentCallbacksC0060q.f1388L = enumC0081n;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0060q + " is not an active fragment of FragmentManager " + this);
    }

    public final void V(AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q) {
        if (abstractComponentCallbacksC0060q != null) {
            if (!abstractComponentCallbacksC0060q.equals(this.f1226c.h(abstractComponentCallbacksC0060q.f1399e)) || (abstractComponentCallbacksC0060q.f1411s != null && abstractComponentCallbacksC0060q.f1410r != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0060q + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q2 = this.f1244w;
        this.f1244w = abstractComponentCallbacksC0060q;
        q(abstractComponentCallbacksC0060q2);
        q(this.f1244w);
    }

    public final void W(AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q) {
        ViewGroup B2 = B(abstractComponentCallbacksC0060q);
        if (B2 != null) {
            C0059p c0059p = abstractComponentCallbacksC0060q.f1384H;
            if ((c0059p == null ? 0 : c0059p.f1372e) + (c0059p == null ? 0 : c0059p.f1371d) + (c0059p == null ? 0 : c0059p.f1370c) + (c0059p == null ? 0 : c0059p.f1369b) > 0) {
                if (B2.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    B2.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0060q);
                }
                AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q2 = (AbstractComponentCallbacksC0060q) B2.getTag(R.id.visible_removing_fragment_view_tag);
                C0059p c0059p2 = abstractComponentCallbacksC0060q.f1384H;
                boolean z2 = c0059p2 != null ? c0059p2.f1368a : false;
                if (abstractComponentCallbacksC0060q2.f1384H == null) {
                    return;
                }
                abstractComponentCallbacksC0060q2.b().f1368a = z2;
            }
        }
    }

    public final void Y() {
        Iterator it = this.f1226c.m().iterator();
        while (it.hasNext()) {
            S s2 = (S) it.next();
            AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = s2.f1275c;
            if (abstractComponentCallbacksC0060q.F) {
                if (this.f1225b) {
                    this.f1218H = true;
                } else {
                    abstractComponentCallbacksC0060q.F = false;
                    s2.k();
                }
            }
        }
    }

    public final void Z(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new V());
        C0063u c0063u = this.f1241t;
        if (c0063u == null) {
            try {
                v("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
                throw illegalStateException;
            }
        }
        try {
            c0063u.f1426k.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw illegalStateException;
        }
    }

    public final S a(AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q) {
        String str = abstractComponentCallbacksC0060q.f1387K;
        if (str != null) {
            X.d.c(abstractComponentCallbacksC0060q, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0060q);
        }
        S f2 = f(abstractComponentCallbacksC0060q);
        abstractComponentCallbacksC0060q.f1410r = this;
        T.v vVar = this.f1226c;
        vVar.q(f2);
        if (!abstractComponentCallbacksC0060q.f1418z) {
            vVar.c(abstractComponentCallbacksC0060q);
            abstractComponentCallbacksC0060q.f1404l = false;
            if (abstractComponentCallbacksC0060q.f1382E == null) {
                abstractComponentCallbacksC0060q.f1385I = false;
            }
            if (F(abstractComponentCallbacksC0060q)) {
                this.f1215D = true;
            }
        }
        return f2;
    }

    public final void a0() {
        synchronized (this.f1224a) {
            try {
                if (!this.f1224a.isEmpty()) {
                    C c2 = this.h;
                    c2.f1195a = true;
                    C0038A c0038a = c2.f1197c;
                    if (c0038a != null) {
                        c0038a.a();
                    }
                    return;
                }
                C c3 = this.h;
                ArrayList arrayList = this.f1227d;
                c3.f1195a = (arrayList != null ? arrayList.size() : 0) > 0 && I(this.f1243v);
                C0038A c0038a2 = c3.f1197c;
                if (c0038a2 != null) {
                    c0038a2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(C0063u c0063u, q1.l lVar, AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q) {
        String str;
        if (this.f1241t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f1241t = c0063u;
        this.f1242u = lVar;
        this.f1243v = abstractComponentCallbacksC0060q;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1234m;
        if (abstractComponentCallbacksC0060q != 0) {
            copyOnWriteArrayList.add(new F(abstractComponentCallbacksC0060q));
        } else if (c0063u != null) {
            copyOnWriteArrayList.add(c0063u);
        }
        if (this.f1243v != null) {
            a0();
        }
        if (c0063u != null) {
            C0039B onBackPressedDispatcher = c0063u.f1426k.getOnBackPressedDispatcher();
            this.f1230g = onBackPressedDispatcher;
            C0063u c0063u2 = abstractComponentCallbacksC0060q != 0 ? abstractComponentCallbacksC0060q : c0063u;
            onBackPressedDispatcher.getClass();
            C c2 = this.h;
            X0.f.e(c2, "onBackPressedCallback");
            AbstractC0082o lifecycle = c0063u2.getLifecycle();
            if (((C0088v) lifecycle).f1500c != EnumC0081n.f1489a) {
                c2.f1196b.add(new a.y(onBackPressedDispatcher, lifecycle, c2));
                onBackPressedDispatcher.d();
                c2.f1197c = new C0038A(0, onBackPressedDispatcher);
            }
        }
        if (abstractComponentCallbacksC0060q != 0) {
            O o2 = abstractComponentCallbacksC0060q.f1410r.f1222L;
            HashMap hashMap = o2.f1257c;
            O o3 = (O) hashMap.get(abstractComponentCallbacksC0060q.f1399e);
            if (o3 == null) {
                o3 = new O(o2.f1259e);
                hashMap.put(abstractComponentCallbacksC0060q.f1399e, o3);
            }
            this.f1222L = o3;
        } else if (c0063u != null) {
            this.f1222L = (O) new B0.d(c0063u.f1426k.getViewModelStore(), O.h).B(O.class);
        } else {
            this.f1222L = new O(false);
        }
        O o4 = this.f1222L;
        o4.f1261g = this.f1216E || this.F;
        this.f1226c.f827d = o4;
        C0063u c0063u3 = this.f1241t;
        if (c0063u3 != null && abstractComponentCallbacksC0060q == 0) {
            g0.d savedStateRegistry = c0063u3.f1426k.getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new r(1, (L) this));
            Bundle a2 = savedStateRegistry.a("android:support:fragments");
            if (a2 != null) {
                Q(a2);
            }
        }
        C0063u c0063u4 = this.f1241t;
        if (c0063u4 != null) {
            AbstractC0103j activityResultRegistry = c0063u4.f1426k.getActivityResultRegistry();
            if (abstractComponentCallbacksC0060q != 0) {
                str = abstractComponentCallbacksC0060q.f1399e + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            L l2 = (L) this;
            this.f1247z = activityResultRegistry.c(X0.e.e(str2, "StartActivityForResult"), new G(2), new B(l2, 1));
            this.f1212A = activityResultRegistry.c(X0.e.e(str2, "StartIntentSenderForResult"), new G(0), new B(l2, 2));
            this.f1213B = activityResultRegistry.c(X0.e.e(str2, "RequestPermissions"), new G(1), new B(l2, 0));
        }
        C0063u c0063u5 = this.f1241t;
        if (c0063u5 != null) {
            c0063u5.f1426k.addOnConfigurationChangedListener(this.f1235n);
        }
        C0063u c0063u6 = this.f1241t;
        if (c0063u6 != null) {
            c0063u6.f1426k.addOnTrimMemoryListener(this.f1236o);
        }
        C0063u c0063u7 = this.f1241t;
        if (c0063u7 != null) {
            c0063u7.f1426k.addOnMultiWindowModeChangedListener(this.f1237p);
        }
        C0063u c0063u8 = this.f1241t;
        if (c0063u8 != null) {
            c0063u8.f1426k.addOnPictureInPictureModeChangedListener(this.f1238q);
        }
        C0063u c0063u9 = this.f1241t;
        if (c0063u9 == null || abstractComponentCallbacksC0060q != 0) {
            return;
        }
        c0063u9.f1426k.addMenuProvider(this.f1239r);
    }

    public final void c(AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0060q);
        }
        if (abstractComponentCallbacksC0060q.f1418z) {
            abstractComponentCallbacksC0060q.f1418z = false;
            if (abstractComponentCallbacksC0060q.f1403k) {
                return;
            }
            this.f1226c.c(abstractComponentCallbacksC0060q);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0060q);
            }
            if (F(abstractComponentCallbacksC0060q)) {
                this.f1215D = true;
            }
        }
    }

    public final void d() {
        this.f1225b = false;
        this.f1220J.clear();
        this.f1219I.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f1226c.m().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((S) it.next()).f1275c.f1381D;
            if (viewGroup != null) {
                hashSet.add(C0052i.f(viewGroup, D()));
            }
        }
        return hashSet;
    }

    public final S f(AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q) {
        String str = abstractComponentCallbacksC0060q.f1399e;
        T.v vVar = this.f1226c;
        S s2 = (S) ((HashMap) vVar.f825b).get(str);
        if (s2 != null) {
            return s2;
        }
        S s3 = new S(this.f1233l, vVar, abstractComponentCallbacksC0060q);
        s3.m(this.f1241t.h.getClassLoader());
        s3.f1277e = this.f1240s;
        return s3;
    }

    public final void g(AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0060q);
        }
        if (abstractComponentCallbacksC0060q.f1418z) {
            return;
        }
        abstractComponentCallbacksC0060q.f1418z = true;
        if (abstractComponentCallbacksC0060q.f1403k) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0060q);
            }
            T.v vVar = this.f1226c;
            synchronized (((ArrayList) vVar.f824a)) {
                ((ArrayList) vVar.f824a).remove(abstractComponentCallbacksC0060q);
            }
            abstractComponentCallbacksC0060q.f1403k = false;
            if (F(abstractComponentCallbacksC0060q)) {
                this.f1215D = true;
            }
            W(abstractComponentCallbacksC0060q);
        }
    }

    public final void h(boolean z2) {
        if (z2 && this.f1241t != null) {
            Z(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q : this.f1226c.o()) {
            if (abstractComponentCallbacksC0060q != null) {
                abstractComponentCallbacksC0060q.f1380C = true;
                if (z2) {
                    abstractComponentCallbacksC0060q.f1412t.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.f1240s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q : this.f1226c.o()) {
            if (abstractComponentCallbacksC0060q != null) {
                if (!abstractComponentCallbacksC0060q.f1417y ? abstractComponentCallbacksC0060q.f1412t.i() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.f1240s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q : this.f1226c.o()) {
            if (abstractComponentCallbacksC0060q != null && H(abstractComponentCallbacksC0060q)) {
                if (!abstractComponentCallbacksC0060q.f1417y ? abstractComponentCallbacksC0060q.f1412t.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0060q);
                    z2 = true;
                }
            }
        }
        if (this.f1228e != null) {
            for (int i = 0; i < this.f1228e.size(); i++) {
                AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q2 = (AbstractComponentCallbacksC0060q) this.f1228e.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0060q2)) {
                    abstractComponentCallbacksC0060q2.getClass();
                }
            }
        }
        this.f1228e = arrayList;
        return z2;
    }

    public final void k() {
        boolean z2 = true;
        this.f1217G = true;
        y(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0052i) it.next()).e();
        }
        C0063u c0063u = this.f1241t;
        T.v vVar = this.f1226c;
        if (c0063u != null) {
            z2 = ((O) vVar.f827d).f1260f;
        } else {
            AbstractActivityC0064v abstractActivityC0064v = c0063u.h;
            if (abstractActivityC0064v != null) {
                z2 = true ^ abstractActivityC0064v.isChangingConfigurations();
            }
        }
        if (z2) {
            Iterator it2 = this.f1231j.values().iterator();
            while (it2.hasNext()) {
                for (String str : ((C0046c) it2.next()).f1329a) {
                    O o2 = (O) vVar.f827d;
                    o2.getClass();
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    o2.d(str);
                }
            }
        }
        t(-1);
        C0063u c0063u2 = this.f1241t;
        if (c0063u2 != null) {
            c0063u2.f1426k.removeOnTrimMemoryListener(this.f1236o);
        }
        C0063u c0063u3 = this.f1241t;
        if (c0063u3 != null) {
            c0063u3.f1426k.removeOnConfigurationChangedListener(this.f1235n);
        }
        C0063u c0063u4 = this.f1241t;
        if (c0063u4 != null) {
            c0063u4.f1426k.removeOnMultiWindowModeChangedListener(this.f1237p);
        }
        C0063u c0063u5 = this.f1241t;
        if (c0063u5 != null) {
            c0063u5.f1426k.removeOnPictureInPictureModeChangedListener(this.f1238q);
        }
        C0063u c0063u6 = this.f1241t;
        if (c0063u6 != null) {
            c0063u6.f1426k.removeMenuProvider(this.f1239r);
        }
        this.f1241t = null;
        this.f1242u = null;
        this.f1243v = null;
        if (this.f1230g != null) {
            Iterator it3 = this.h.f1196b.iterator();
            while (it3.hasNext()) {
                ((InterfaceC0042c) it3.next()).cancel();
            }
            this.f1230g = null;
        }
        C0102i c0102i = this.f1247z;
        if (c0102i != null) {
            c0102i.f1657a.e(c0102i.f1658b);
            C0102i c0102i2 = this.f1212A;
            c0102i2.f1657a.e(c0102i2.f1658b);
            C0102i c0102i3 = this.f1213B;
            c0102i3.f1657a.e(c0102i3.f1658b);
        }
    }

    public final void l(boolean z2) {
        if (z2 && this.f1241t != null) {
            Z(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q : this.f1226c.o()) {
            if (abstractComponentCallbacksC0060q != null) {
                abstractComponentCallbacksC0060q.f1380C = true;
                if (z2) {
                    abstractComponentCallbacksC0060q.f1412t.l(true);
                }
            }
        }
    }

    public final void m(boolean z2, boolean z3) {
        if (z3 && this.f1241t != null) {
            Z(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q : this.f1226c.o()) {
            if (abstractComponentCallbacksC0060q != null && z3) {
                abstractComponentCallbacksC0060q.f1412t.m(z2, true);
            }
        }
    }

    public final void n() {
        Iterator it = this.f1226c.n().iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = (AbstractComponentCallbacksC0060q) it.next();
            if (abstractComponentCallbacksC0060q != null) {
                abstractComponentCallbacksC0060q.j();
                abstractComponentCallbacksC0060q.f1412t.n();
            }
        }
    }

    public final boolean o() {
        if (this.f1240s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q : this.f1226c.o()) {
            if (abstractComponentCallbacksC0060q != null) {
                if (!abstractComponentCallbacksC0060q.f1417y ? abstractComponentCallbacksC0060q.f1412t.o() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f1240s < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q : this.f1226c.o()) {
            if (abstractComponentCallbacksC0060q != null && !abstractComponentCallbacksC0060q.f1417y) {
                abstractComponentCallbacksC0060q.f1412t.p();
            }
        }
    }

    public final void q(AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q) {
        if (abstractComponentCallbacksC0060q != null) {
            if (abstractComponentCallbacksC0060q.equals(this.f1226c.h(abstractComponentCallbacksC0060q.f1399e))) {
                abstractComponentCallbacksC0060q.f1410r.getClass();
                boolean I2 = I(abstractComponentCallbacksC0060q);
                Boolean bool = abstractComponentCallbacksC0060q.f1402j;
                if (bool == null || bool.booleanValue() != I2) {
                    abstractComponentCallbacksC0060q.f1402j = Boolean.valueOf(I2);
                    L l2 = abstractComponentCallbacksC0060q.f1412t;
                    l2.a0();
                    l2.q(l2.f1244w);
                }
            }
        }
    }

    public final void r(boolean z2, boolean z3) {
        if (z3 && this.f1241t != null) {
            Z(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q : this.f1226c.o()) {
            if (abstractComponentCallbacksC0060q != null && z3) {
                abstractComponentCallbacksC0060q.f1412t.r(z2, true);
            }
        }
    }

    public final boolean s() {
        if (this.f1240s < 1) {
            return false;
        }
        boolean z2 = false;
        for (AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q : this.f1226c.o()) {
            if (abstractComponentCallbacksC0060q != null && H(abstractComponentCallbacksC0060q)) {
                if (!abstractComponentCallbacksC0060q.f1417y ? abstractComponentCallbacksC0060q.f1412t.s() : false) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final void t(int i) {
        try {
            this.f1225b = true;
            for (S s2 : ((HashMap) this.f1226c.f825b).values()) {
                if (s2 != null) {
                    s2.f1277e = i;
                }
            }
            J(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0052i) it.next()).e();
            }
            this.f1225b = false;
            y(true);
        } catch (Throwable th) {
            this.f1225b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = this.f1243v;
        if (abstractComponentCallbacksC0060q != null) {
            sb.append(abstractComponentCallbacksC0060q.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f1243v)));
            sb.append("}");
        } else {
            C0063u c0063u = this.f1241t;
            if (c0063u != null) {
                sb.append(c0063u.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f1241t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u() {
        if (this.f1218H) {
            this.f1218H = false;
            Y();
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String e2 = X0.e.e(str, "    ");
        T.v vVar = this.f1226c;
        vVar.getClass();
        String str3 = str + "    ";
        HashMap hashMap = (HashMap) vVar.f825b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (S s2 : hashMap.values()) {
                printWriter.print(str);
                if (s2 != null) {
                    AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = s2.f1275c;
                    printWriter.println(abstractComponentCallbacksC0060q);
                    abstractComponentCallbacksC0060q.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0060q.f1414v));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0060q.f1415w));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0060q.f1416x);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0060q.f1395a);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0060q.f1399e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0060q.f1409q);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0060q.f1403k);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0060q.f1404l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0060q.f1405m);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0060q.f1406n);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0060q.f1417y);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0060q.f1418z);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0060q.f1379B);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0060q.f1378A);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0060q.f1383G);
                    if (abstractComponentCallbacksC0060q.f1410r != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0060q.f1410r);
                    }
                    if (abstractComponentCallbacksC0060q.f1411s != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0060q.f1411s);
                    }
                    if (abstractComponentCallbacksC0060q.f1413u != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0060q.f1413u);
                    }
                    if (abstractComponentCallbacksC0060q.f1400f != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0060q.f1400f);
                    }
                    if (abstractComponentCallbacksC0060q.f1396b != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0060q.f1396b);
                    }
                    if (abstractComponentCallbacksC0060q.f1397c != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0060q.f1397c);
                    }
                    if (abstractComponentCallbacksC0060q.f1398d != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0060q.f1398d);
                    }
                    Object obj = abstractComponentCallbacksC0060q.f1401g;
                    if (obj == null) {
                        K k2 = abstractComponentCallbacksC0060q.f1410r;
                        obj = (k2 == null || (str2 = abstractComponentCallbacksC0060q.h) == null) ? null : k2.f1226c.h(str2);
                    }
                    if (obj != null) {
                        printWriter.print(str3);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC0060q.i);
                    }
                    printWriter.print(str3);
                    printWriter.print("mPopDirection=");
                    C0059p c0059p = abstractComponentCallbacksC0060q.f1384H;
                    printWriter.println(c0059p == null ? false : c0059p.f1368a);
                    C0059p c0059p2 = abstractComponentCallbacksC0060q.f1384H;
                    if ((c0059p2 == null ? 0 : c0059p2.f1369b) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        C0059p c0059p3 = abstractComponentCallbacksC0060q.f1384H;
                        printWriter.println(c0059p3 == null ? 0 : c0059p3.f1369b);
                    }
                    C0059p c0059p4 = abstractComponentCallbacksC0060q.f1384H;
                    if ((c0059p4 == null ? 0 : c0059p4.f1370c) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        C0059p c0059p5 = abstractComponentCallbacksC0060q.f1384H;
                        printWriter.println(c0059p5 == null ? 0 : c0059p5.f1370c);
                    }
                    C0059p c0059p6 = abstractComponentCallbacksC0060q.f1384H;
                    if ((c0059p6 == null ? 0 : c0059p6.f1371d) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        C0059p c0059p7 = abstractComponentCallbacksC0060q.f1384H;
                        printWriter.println(c0059p7 == null ? 0 : c0059p7.f1371d);
                    }
                    C0059p c0059p8 = abstractComponentCallbacksC0060q.f1384H;
                    if ((c0059p8 == null ? 0 : c0059p8.f1372e) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        C0059p c0059p9 = abstractComponentCallbacksC0060q.f1384H;
                        printWriter.println(c0059p9 == null ? 0 : c0059p9.f1372e);
                    }
                    if (abstractComponentCallbacksC0060q.f1381D != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0060q.f1381D);
                    }
                    if (abstractComponentCallbacksC0060q.f1382E != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0060q.f1382E);
                    }
                    if (abstractComponentCallbacksC0060q.d() != null) {
                        AbstractC0091a.a(abstractComponentCallbacksC0060q).b(str3, printWriter);
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + abstractComponentCallbacksC0060q.f1412t + ":");
                    abstractComponentCallbacksC0060q.f1412t.v(X0.e.e(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) vVar.f824a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q2 = (AbstractComponentCallbacksC0060q) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0060q2.toString());
            }
        }
        ArrayList arrayList2 = this.f1228e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q3 = (AbstractComponentCallbacksC0060q) this.f1228e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0060q3.toString());
            }
        }
        ArrayList arrayList3 = this.f1227d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                C0044a c0044a = (C0044a) this.f1227d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(c0044a.toString());
                c0044a.d(e2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.f1224a) {
            try {
                int size4 = this.f1224a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj2 = (I) this.f1224a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
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
        printWriter.println(this.f1241t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1242u);
        if (this.f1243v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1243v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1240s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f1216E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f1217G);
        if (this.f1215D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f1215D);
        }
    }

    public final void w(I i, boolean z2) {
        if (!z2) {
            if (this.f1241t == null) {
                if (!this.f1217G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f1216E || this.F) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1224a) {
            try {
                if (this.f1241t == null) {
                    if (!z2) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f1224a.add(i);
                    S();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(boolean z2) {
        if (this.f1225b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f1241t == null) {
            if (!this.f1217G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f1241t.i.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2 && (this.f1216E || this.F)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f1219I == null) {
            this.f1219I = new ArrayList();
            this.f1220J = new ArrayList();
        }
    }

    public final boolean y(boolean z2) {
        boolean z3;
        x(z2);
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.f1219I;
            ArrayList arrayList2 = this.f1220J;
            synchronized (this.f1224a) {
                if (this.f1224a.isEmpty()) {
                    z3 = false;
                } else {
                    try {
                        int size = this.f1224a.size();
                        z3 = false;
                        for (int i = 0; i < size; i++) {
                            z3 |= ((I) this.f1224a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z3) {
                a0();
                u();
                ((HashMap) this.f1226c.f825b).values().removeAll(Collections.singleton(null));
                return z4;
            }
            z4 = true;
            this.f1225b = true;
            try {
                P(this.f1219I, this.f1220J);
            } finally {
                d();
            }
        }
    }

    public final void z(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        T.v vVar;
        T.v vVar2;
        T.v vVar3;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        boolean z2 = ((C0044a) arrayList3.get(i)).f1313o;
        ArrayList arrayList5 = this.f1221K;
        if (arrayList5 == null) {
            this.f1221K = new ArrayList();
        } else {
            arrayList5.clear();
        }
        ArrayList arrayList6 = this.f1221K;
        T.v vVar4 = this.f1226c;
        arrayList6.addAll(vVar4.o());
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = this.f1244w;
        int i6 = i;
        boolean z3 = false;
        while (true) {
            int i7 = 1;
            if (i6 >= i2) {
                T.v vVar5 = vVar4;
                this.f1221K.clear();
                if (!z2 && this.f1240s >= 1) {
                    for (int i8 = i; i8 < i2; i8++) {
                        Iterator it = ((C0044a) arrayList.get(i8)).f1301a.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q2 = ((T) it.next()).f1279b;
                            if (abstractComponentCallbacksC0060q2 == null || abstractComponentCallbacksC0060q2.f1410r == null) {
                                vVar = vVar5;
                            } else {
                                vVar = vVar5;
                                vVar.q(f(abstractComponentCallbacksC0060q2));
                            }
                            vVar5 = vVar;
                        }
                    }
                }
                for (int i9 = i; i9 < i2; i9++) {
                    C0044a c0044a = (C0044a) arrayList.get(i9);
                    if (((Boolean) arrayList2.get(i9)).booleanValue()) {
                        c0044a.c(-1);
                        ArrayList arrayList7 = c0044a.f1301a;
                        boolean z4 = true;
                        for (int size = arrayList7.size() - 1; size >= 0; size--) {
                            T t2 = (T) arrayList7.get(size);
                            AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q3 = t2.f1279b;
                            if (abstractComponentCallbacksC0060q3 != null) {
                                if (abstractComponentCallbacksC0060q3.f1384H != null) {
                                    abstractComponentCallbacksC0060q3.b().f1368a = z4;
                                }
                                int i10 = c0044a.f1306f;
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
                                if (abstractComponentCallbacksC0060q3.f1384H != null || i11 != 0) {
                                    abstractComponentCallbacksC0060q3.b();
                                    abstractComponentCallbacksC0060q3.f1384H.f1373f = i11;
                                }
                                abstractComponentCallbacksC0060q3.b();
                                abstractComponentCallbacksC0060q3.f1384H.getClass();
                            }
                            int i13 = t2.f1278a;
                            K k2 = c0044a.f1314p;
                            switch (i13) {
                                case 1:
                                    abstractComponentCallbacksC0060q3.A(t2.f1281d, t2.f1282e, t2.f1283f, t2.f1284g);
                                    z4 = true;
                                    k2.T(abstractComponentCallbacksC0060q3, true);
                                    k2.O(abstractComponentCallbacksC0060q3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + t2.f1278a);
                                case GameConfig.COMBO_EVERY /* 3 */:
                                    abstractComponentCallbacksC0060q3.A(t2.f1281d, t2.f1282e, t2.f1283f, t2.f1284g);
                                    k2.a(abstractComponentCallbacksC0060q3);
                                    z4 = true;
                                case 4:
                                    abstractComponentCallbacksC0060q3.A(t2.f1281d, t2.f1282e, t2.f1283f, t2.f1284g);
                                    k2.getClass();
                                    X(abstractComponentCallbacksC0060q3);
                                    z4 = true;
                                case 5:
                                    abstractComponentCallbacksC0060q3.A(t2.f1281d, t2.f1282e, t2.f1283f, t2.f1284g);
                                    k2.T(abstractComponentCallbacksC0060q3, true);
                                    k2.E(abstractComponentCallbacksC0060q3);
                                    z4 = true;
                                case 6:
                                    abstractComponentCallbacksC0060q3.A(t2.f1281d, t2.f1282e, t2.f1283f, t2.f1284g);
                                    k2.c(abstractComponentCallbacksC0060q3);
                                    z4 = true;
                                case 7:
                                    abstractComponentCallbacksC0060q3.A(t2.f1281d, t2.f1282e, t2.f1283f, t2.f1284g);
                                    k2.T(abstractComponentCallbacksC0060q3, true);
                                    k2.g(abstractComponentCallbacksC0060q3);
                                    z4 = true;
                                case 8:
                                    k2.V(null);
                                    z4 = true;
                                case 9:
                                    k2.V(abstractComponentCallbacksC0060q3);
                                    z4 = true;
                                case GameConfig.SCORE_PER_STICK /* 10 */:
                                    k2.U(abstractComponentCallbacksC0060q3, t2.h);
                                    z4 = true;
                            }
                        }
                    } else {
                        c0044a.c(1);
                        ArrayList arrayList8 = c0044a.f1301a;
                        int size2 = arrayList8.size();
                        for (int i14 = 0; i14 < size2; i14++) {
                            T t3 = (T) arrayList8.get(i14);
                            AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q4 = t3.f1279b;
                            if (abstractComponentCallbacksC0060q4 != null) {
                                if (abstractComponentCallbacksC0060q4.f1384H != null) {
                                    abstractComponentCallbacksC0060q4.b().f1368a = false;
                                }
                                int i15 = c0044a.f1306f;
                                if (abstractComponentCallbacksC0060q4.f1384H != null || i15 != 0) {
                                    abstractComponentCallbacksC0060q4.b();
                                    abstractComponentCallbacksC0060q4.f1384H.f1373f = i15;
                                }
                                abstractComponentCallbacksC0060q4.b();
                                abstractComponentCallbacksC0060q4.f1384H.getClass();
                            }
                            int i16 = t3.f1278a;
                            K k3 = c0044a.f1314p;
                            switch (i16) {
                                case 1:
                                    abstractComponentCallbacksC0060q4.A(t3.f1281d, t3.f1282e, t3.f1283f, t3.f1284g);
                                    k3.T(abstractComponentCallbacksC0060q4, false);
                                    k3.a(abstractComponentCallbacksC0060q4);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + t3.f1278a);
                                case GameConfig.COMBO_EVERY /* 3 */:
                                    abstractComponentCallbacksC0060q4.A(t3.f1281d, t3.f1282e, t3.f1283f, t3.f1284g);
                                    k3.O(abstractComponentCallbacksC0060q4);
                                case 4:
                                    abstractComponentCallbacksC0060q4.A(t3.f1281d, t3.f1282e, t3.f1283f, t3.f1284g);
                                    k3.E(abstractComponentCallbacksC0060q4);
                                case 5:
                                    abstractComponentCallbacksC0060q4.A(t3.f1281d, t3.f1282e, t3.f1283f, t3.f1284g);
                                    k3.T(abstractComponentCallbacksC0060q4, false);
                                    X(abstractComponentCallbacksC0060q4);
                                case 6:
                                    abstractComponentCallbacksC0060q4.A(t3.f1281d, t3.f1282e, t3.f1283f, t3.f1284g);
                                    k3.g(abstractComponentCallbacksC0060q4);
                                case 7:
                                    abstractComponentCallbacksC0060q4.A(t3.f1281d, t3.f1282e, t3.f1283f, t3.f1284g);
                                    k3.T(abstractComponentCallbacksC0060q4, false);
                                    k3.c(abstractComponentCallbacksC0060q4);
                                case 8:
                                    k3.V(abstractComponentCallbacksC0060q4);
                                case 9:
                                    k3.V(null);
                                case GameConfig.SCORE_PER_STICK /* 10 */:
                                    k3.U(abstractComponentCallbacksC0060q4, t3.i);
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i17 = i; i17 < i2; i17++) {
                    C0044a c0044a2 = (C0044a) arrayList.get(i17);
                    if (booleanValue) {
                        for (int size3 = c0044a2.f1301a.size() - 1; size3 >= 0; size3--) {
                            AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q5 = ((T) c0044a2.f1301a.get(size3)).f1279b;
                            if (abstractComponentCallbacksC0060q5 != null) {
                                f(abstractComponentCallbacksC0060q5).k();
                            }
                        }
                    } else {
                        Iterator it2 = c0044a2.f1301a.iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q6 = ((T) it2.next()).f1279b;
                            if (abstractComponentCallbacksC0060q6 != null) {
                                f(abstractComponentCallbacksC0060q6).k();
                            }
                        }
                    }
                }
                J(this.f1240s, true);
                HashSet hashSet = new HashSet();
                for (int i18 = i; i18 < i2; i18++) {
                    Iterator it3 = ((C0044a) arrayList.get(i18)).f1301a.iterator();
                    while (it3.hasNext()) {
                        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q7 = ((T) it3.next()).f1279b;
                        if (abstractComponentCallbacksC0060q7 != null && (viewGroup = abstractComponentCallbacksC0060q7.f1381D) != null) {
                            hashSet.add(C0052i.f(viewGroup, D()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    C0052i c0052i = (C0052i) it4.next();
                    c0052i.f1348d = booleanValue;
                    synchronized (c0052i.f1346b) {
                        try {
                            c0052i.g();
                            c0052i.f1349e = false;
                            int size4 = c0052i.f1346b.size() - 1;
                            while (true) {
                                if (size4 >= 0) {
                                    X x2 = (X) c0052i.f1346b.get(size4);
                                    int c2 = X0.e.c(x2.f1296c.f1382E);
                                    if (x2.f1294a != 2 || c2 == 2) {
                                        size4--;
                                    } else {
                                        C0059p c0059p = x2.f1296c.f1384H;
                                        c0052i.f1349e = false;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    c0052i.c();
                }
                for (int i19 = i; i19 < i2; i19++) {
                    C0044a c0044a3 = (C0044a) arrayList.get(i19);
                    if (((Boolean) arrayList2.get(i19)).booleanValue() && c0044a3.f1316r >= 0) {
                        c0044a3.f1316r = -1;
                    }
                    c0044a3.getClass();
                }
                return;
            }
            C0044a c0044a4 = (C0044a) arrayList3.get(i6);
            if (((Boolean) arrayList4.get(i6)).booleanValue()) {
                vVar2 = vVar4;
                int i20 = 1;
                ArrayList arrayList9 = this.f1221K;
                ArrayList arrayList10 = c0044a4.f1301a;
                int size5 = arrayList10.size() - 1;
                while (size5 >= 0) {
                    T t4 = (T) arrayList10.get(size5);
                    int i21 = t4.f1278a;
                    if (i21 != i20) {
                        if (i21 != 3) {
                            switch (i21) {
                                case 8:
                                    abstractComponentCallbacksC0060q = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0060q = t4.f1279b;
                                    break;
                                case GameConfig.SCORE_PER_STICK /* 10 */:
                                    t4.i = t4.h;
                                    break;
                            }
                            size5--;
                            i20 = 1;
                        }
                        arrayList9.add(t4.f1279b);
                        size5--;
                        i20 = 1;
                    }
                    arrayList9.remove(t4.f1279b);
                    size5--;
                    i20 = 1;
                }
            } else {
                ArrayList arrayList11 = this.f1221K;
                int i22 = 0;
                while (true) {
                    ArrayList arrayList12 = c0044a4.f1301a;
                    if (i22 < arrayList12.size()) {
                        T t5 = (T) arrayList12.get(i22);
                        int i23 = t5.f1278a;
                        if (i23 != i7) {
                            if (i23 != 2) {
                                if (i23 == 3 || i23 == 6) {
                                    arrayList11.remove(t5.f1279b);
                                    AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q8 = t5.f1279b;
                                    if (abstractComponentCallbacksC0060q8 == abstractComponentCallbacksC0060q) {
                                        arrayList12.add(i22, new T(9, abstractComponentCallbacksC0060q8));
                                        i22++;
                                        vVar3 = vVar4;
                                        i3 = 1;
                                        abstractComponentCallbacksC0060q = null;
                                    }
                                } else if (i23 == 7) {
                                    vVar3 = vVar4;
                                    i3 = 1;
                                } else if (i23 == 8) {
                                    arrayList12.add(i22, new T(9, abstractComponentCallbacksC0060q, 0));
                                    t5.f1280c = true;
                                    i22++;
                                    abstractComponentCallbacksC0060q = t5.f1279b;
                                }
                                vVar3 = vVar4;
                                i3 = 1;
                            } else {
                                AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q9 = t5.f1279b;
                                int i24 = abstractComponentCallbacksC0060q9.f1415w;
                                int size6 = arrayList11.size() - 1;
                                boolean z5 = false;
                                while (size6 >= 0) {
                                    T.v vVar6 = vVar4;
                                    AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q10 = (AbstractComponentCallbacksC0060q) arrayList11.get(size6);
                                    if (abstractComponentCallbacksC0060q10.f1415w != i24) {
                                        i4 = i24;
                                    } else if (abstractComponentCallbacksC0060q10 == abstractComponentCallbacksC0060q9) {
                                        i4 = i24;
                                        z5 = true;
                                    } else {
                                        if (abstractComponentCallbacksC0060q10 == abstractComponentCallbacksC0060q) {
                                            i4 = i24;
                                            arrayList12.add(i22, new T(9, abstractComponentCallbacksC0060q10, 0));
                                            i22++;
                                            i5 = 0;
                                            abstractComponentCallbacksC0060q = null;
                                        } else {
                                            i4 = i24;
                                            i5 = 0;
                                        }
                                        T t6 = new T(3, abstractComponentCallbacksC0060q10, i5);
                                        t6.f1281d = t5.f1281d;
                                        t6.f1283f = t5.f1283f;
                                        t6.f1282e = t5.f1282e;
                                        t6.f1284g = t5.f1284g;
                                        arrayList12.add(i22, t6);
                                        arrayList11.remove(abstractComponentCallbacksC0060q10);
                                        i22++;
                                        abstractComponentCallbacksC0060q = abstractComponentCallbacksC0060q;
                                    }
                                    size6--;
                                    i24 = i4;
                                    vVar4 = vVar6;
                                }
                                vVar3 = vVar4;
                                i3 = 1;
                                if (z5) {
                                    arrayList12.remove(i22);
                                    i22--;
                                } else {
                                    t5.f1278a = 1;
                                    t5.f1280c = true;
                                    arrayList11.add(abstractComponentCallbacksC0060q9);
                                }
                            }
                            i22 += i3;
                            i7 = i3;
                            vVar4 = vVar3;
                        } else {
                            vVar3 = vVar4;
                            i3 = i7;
                        }
                        arrayList11.add(t5.f1279b);
                        i22 += i3;
                        i7 = i3;
                        vVar4 = vVar3;
                    } else {
                        vVar2 = vVar4;
                    }
                }
            }
            z3 = z3 || c0044a4.f1307g;
            i6++;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            vVar4 = vVar2;
        }
    }
}
