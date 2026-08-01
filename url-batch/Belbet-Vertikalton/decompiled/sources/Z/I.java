package Z;

import G1.AbstractC0001b;
import a0.AbstractC0062d;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.EnumC0078m;
import b.InterfaceC0090c;
import com.winpower.neonfit.R;
import e0.C0114a;
import h.AbstractActivityC0132i;
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
    public B1.c f1433A;

    /* renamed from: B, reason: collision with root package name */
    public B1.c f1434B;

    /* renamed from: C, reason: collision with root package name */
    public ArrayDeque f1435C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1436D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1437E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f1438F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f1439G;
    public boolean H;

    /* renamed from: I, reason: collision with root package name */
    public ArrayList f1440I;

    /* renamed from: J, reason: collision with root package name */
    public ArrayList f1441J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList f1442K;

    /* renamed from: L, reason: collision with root package name */
    public L f1443L;

    /* renamed from: M, reason: collision with root package name */
    public final C1.e f1444M;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1446b;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f1448d;
    public ArrayList e;

    /* renamed from: g, reason: collision with root package name */
    public b.w f1450g;

    /* renamed from: l, reason: collision with root package name */
    public final B1.c f1453l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f1454m;

    /* renamed from: n, reason: collision with root package name */
    public final y f1455n;

    /* renamed from: o, reason: collision with root package name */
    public final y f1456o;

    /* renamed from: p, reason: collision with root package name */
    public final y f1457p;

    /* renamed from: q, reason: collision with root package name */
    public final y f1458q;

    /* renamed from: r, reason: collision with root package name */
    public final B f1459r;

    /* renamed from: s, reason: collision with root package name */
    public int f1460s;

    /* renamed from: t, reason: collision with root package name */
    public C0056u f1461t;

    /* renamed from: u, reason: collision with root package name */
    public H1.d f1462u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractComponentCallbacksC0053q f1463v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractComponentCallbacksC0053q f1464w;

    /* renamed from: x, reason: collision with root package name */
    public final C f1465x;

    /* renamed from: y, reason: collision with root package name */
    public final N0.e f1466y;

    /* renamed from: z, reason: collision with root package name */
    public B1.c f1467z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1445a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final V.v f1447c = new V.v(2);

    /* renamed from: f, reason: collision with root package name */
    public final x f1449f = new x(this);

    /* renamed from: h, reason: collision with root package name */
    public final A f1451h = new A(this);
    public final AtomicInteger i = new AtomicInteger();
    public final Map j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map f1452k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [Z.y] */
    /* JADX WARN: Type inference failed for: r0v13, types: [Z.y] */
    /* JADX WARN: Type inference failed for: r0v14, types: [Z.y] */
    /* JADX WARN: Type inference failed for: r0v15, types: [Z.y] */
    public I() {
        Collections.synchronizedMap(new HashMap());
        this.f1453l = new B1.c(this);
        this.f1454m = new CopyOnWriteArrayList();
        final int i = 0;
        this.f1455n = new L.a(this) { // from class: Z.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1649b;

            {
                this.f1649b = this;
            }

            @Override // L.a
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        I i2 = this.f1649b;
                        if (i2.G()) {
                            i2.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i3 = this.f1649b;
                        if (i3.G() && num.intValue() == 80) {
                            i3.l(false);
                            break;
                        }
                        break;
                    case 2:
                        B.g gVar = (B.g) obj;
                        I i4 = this.f1649b;
                        if (i4.G()) {
                            i4.m(gVar.f40a, false);
                            break;
                        }
                        break;
                    default:
                        B.h hVar = (B.h) obj;
                        I i5 = this.f1649b;
                        if (i5.G()) {
                            i5.r(hVar.f41a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f1456o = new L.a(this) { // from class: Z.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1649b;

            {
                this.f1649b = this;
            }

            @Override // L.a
            public final void a(Object obj) {
                switch (i2) {
                    case 0:
                        I i22 = this.f1649b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i3 = this.f1649b;
                        if (i3.G() && num.intValue() == 80) {
                            i3.l(false);
                            break;
                        }
                        break;
                    case 2:
                        B.g gVar = (B.g) obj;
                        I i4 = this.f1649b;
                        if (i4.G()) {
                            i4.m(gVar.f40a, false);
                            break;
                        }
                        break;
                    default:
                        B.h hVar = (B.h) obj;
                        I i5 = this.f1649b;
                        if (i5.G()) {
                            i5.r(hVar.f41a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.f1457p = new L.a(this) { // from class: Z.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1649b;

            {
                this.f1649b = this;
            }

            @Override // L.a
            public final void a(Object obj) {
                switch (i3) {
                    case 0:
                        I i22 = this.f1649b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i32 = this.f1649b;
                        if (i32.G() && num.intValue() == 80) {
                            i32.l(false);
                            break;
                        }
                        break;
                    case 2:
                        B.g gVar = (B.g) obj;
                        I i4 = this.f1649b;
                        if (i4.G()) {
                            i4.m(gVar.f40a, false);
                            break;
                        }
                        break;
                    default:
                        B.h hVar = (B.h) obj;
                        I i5 = this.f1649b;
                        if (i5.G()) {
                            i5.r(hVar.f41a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.f1458q = new L.a(this) { // from class: Z.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1649b;

            {
                this.f1649b = this;
            }

            @Override // L.a
            public final void a(Object obj) {
                switch (i4) {
                    case 0:
                        I i22 = this.f1649b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i32 = this.f1649b;
                        if (i32.G() && num.intValue() == 80) {
                            i32.l(false);
                            break;
                        }
                        break;
                    case 2:
                        B.g gVar = (B.g) obj;
                        I i42 = this.f1649b;
                        if (i42.G()) {
                            i42.m(gVar.f40a, false);
                            break;
                        }
                        break;
                    default:
                        B.h hVar = (B.h) obj;
                        I i5 = this.f1649b;
                        if (i5.G()) {
                            i5.r(hVar.f41a, false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f1459r = new B(this);
        this.f1460s = -1;
        this.f1465x = new C(this);
        this.f1466y = new N0.e(16);
        this.f1435C = new ArrayDeque();
        this.f1444M = new C1.e(6, this);
    }

    public static boolean F(AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q) {
        abstractComponentCallbacksC0053q.getClass();
        Iterator it = abstractComponentCallbacksC0053q.f1624t.f1447c.i().iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q2 = (AbstractComponentCallbacksC0053q) it.next();
            if (abstractComponentCallbacksC0053q2 != null) {
                z2 = F(abstractComponentCallbacksC0053q2);
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public static boolean H(AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q) {
        if (abstractComponentCallbacksC0053q == null) {
            return true;
        }
        return abstractComponentCallbacksC0053q.f1592B && (abstractComponentCallbacksC0053q.f1622r == null || H(abstractComponentCallbacksC0053q.f1625u));
    }

    public static boolean I(AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q) {
        if (abstractComponentCallbacksC0053q == null) {
            return true;
        }
        I i = abstractComponentCallbacksC0053q.f1622r;
        return abstractComponentCallbacksC0053q.equals(i.f1464w) && I(i.f1463v);
    }

    public static void X(AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0053q);
        }
        if (abstractComponentCallbacksC0053q.f1629y) {
            abstractComponentCallbacksC0053q.f1629y = false;
            abstractComponentCallbacksC0053q.f1598I = !abstractComponentCallbacksC0053q.f1598I;
        }
    }

    public final AbstractComponentCallbacksC0053q A(int i) {
        V.v vVar = this.f1447c;
        ArrayList arrayList = (ArrayList) vVar.f1305a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = (AbstractComponentCallbacksC0053q) arrayList.get(size);
            if (abstractComponentCallbacksC0053q != null && abstractComponentCallbacksC0053q.f1626v == i) {
                return abstractComponentCallbacksC0053q;
            }
        }
        for (O o2 : ((HashMap) vVar.f1306b).values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q2 = o2.f1494c;
                if (abstractComponentCallbacksC0053q2.f1626v == i) {
                    return abstractComponentCallbacksC0053q2;
                }
            }
        }
        return null;
    }

    public final ViewGroup B(AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q) {
        ViewGroup viewGroup = abstractComponentCallbacksC0053q.f1594D;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0053q.f1627w > 0 && this.f1462u.T()) {
            View S2 = this.f1462u.S(abstractComponentCallbacksC0053q.f1627w);
            if (S2 instanceof ViewGroup) {
                return (ViewGroup) S2;
            }
        }
        return null;
    }

    public final C C() {
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = this.f1463v;
        return abstractComponentCallbacksC0053q != null ? abstractComponentCallbacksC0053q.f1622r.C() : this.f1465x;
    }

    public final N0.e D() {
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = this.f1463v;
        return abstractComponentCallbacksC0053q != null ? abstractComponentCallbacksC0053q.f1622r.D() : this.f1466y;
    }

    public final void E(AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0053q);
        }
        if (abstractComponentCallbacksC0053q.f1629y) {
            return;
        }
        abstractComponentCallbacksC0053q.f1629y = true;
        abstractComponentCallbacksC0053q.f1598I = true ^ abstractComponentCallbacksC0053q.f1598I;
        W(abstractComponentCallbacksC0053q);
    }

    public final boolean G() {
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = this.f1463v;
        if (abstractComponentCallbacksC0053q == null) {
            return true;
        }
        return abstractComponentCallbacksC0053q.m() && this.f1463v.j().G();
    }

    public final void J(int i, boolean z2) {
        HashMap hashMap;
        C0056u c0056u;
        if (this.f1461t == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i != this.f1460s) {
            this.f1460s = i;
            V.v vVar = this.f1447c;
            Iterator it = ((ArrayList) vVar.f1305a).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = (HashMap) vVar.f1306b;
                if (!hasNext) {
                    break;
                }
                O o2 = (O) hashMap.get(((AbstractComponentCallbacksC0053q) it.next()).e);
                if (o2 != null) {
                    o2.k();
                }
            }
            for (O o3 : hashMap.values()) {
                if (o3 != null) {
                    o3.k();
                    AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = o3.f1494c;
                    if (abstractComponentCallbacksC0053q.f1616l && !abstractComponentCallbacksC0053q.o()) {
                        vVar.n(o3);
                    }
                }
            }
            Y();
            if (this.f1436D && (c0056u = this.f1461t) != null && this.f1460s == 7) {
                c0056u.f1640f.invalidateOptionsMenu();
                this.f1436D = false;
            }
        }
    }

    public final void K() {
        if (this.f1461t == null) {
            return;
        }
        this.f1437E = false;
        this.f1438F = false;
        this.f1443L.f1481g = false;
        for (AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q : this.f1447c.j()) {
            if (abstractComponentCallbacksC0053q != null) {
                abstractComponentCallbacksC0053q.f1624t.K();
            }
        }
    }

    public final boolean L() {
        return M(-1, 0);
    }

    public final boolean M(int i, int i2) {
        y(false);
        x(true);
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = this.f1464w;
        if (abstractComponentCallbacksC0053q != null && i < 0 && abstractComponentCallbacksC0053q.g().L()) {
            return true;
        }
        boolean N2 = N(this.f1440I, this.f1441J, i, i2);
        if (N2) {
            this.f1446b = true;
            try {
                P(this.f1440I, this.f1441J);
            } finally {
                d();
            }
        }
        a0();
        u();
        ((HashMap) this.f1447c.f1306b).values().removeAll(Collections.singleton(null));
        return N2;
    }

    public final boolean N(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z2 = (i2 & 1) != 0;
        ArrayList arrayList3 = this.f1448d;
        int i3 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                i3 = z2 ? 0 : this.f1448d.size() - 1;
            } else {
                int size = this.f1448d.size() - 1;
                while (size >= 0) {
                    C0037a c0037a = (C0037a) this.f1448d.get(size);
                    if (i >= 0 && i == c0037a.f1533r) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z2) {
                        while (size > 0) {
                            C0037a c0037a2 = (C0037a) this.f1448d.get(size - 1);
                            if (i < 0 || i != c0037a2.f1533r) {
                                break;
                            }
                            size--;
                        }
                    } else if (size != this.f1448d.size() - 1) {
                        size++;
                    }
                }
                i3 = size;
            }
        }
        if (i3 < 0) {
            return false;
        }
        for (int size2 = this.f1448d.size() - 1; size2 >= i3; size2--) {
            arrayList.add((C0037a) this.f1448d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void O(AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0053q + " nesting=" + abstractComponentCallbacksC0053q.f1621q);
        }
        boolean o2 = abstractComponentCallbacksC0053q.o();
        if (abstractComponentCallbacksC0053q.f1630z && o2) {
            return;
        }
        V.v vVar = this.f1447c;
        synchronized (((ArrayList) vVar.f1305a)) {
            ((ArrayList) vVar.f1305a).remove(abstractComponentCallbacksC0053q);
        }
        abstractComponentCallbacksC0053q.f1615k = false;
        if (F(abstractComponentCallbacksC0053q)) {
            this.f1436D = true;
        }
        abstractComponentCallbacksC0053q.f1616l = true;
        W(abstractComponentCallbacksC0053q);
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
            if (!((C0037a) arrayList.get(i)).f1530o) {
                if (i2 != i) {
                    z(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0037a) arrayList.get(i2)).f1530o) {
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
        B1.c cVar;
        int i2;
        O o2;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f1461t.f1638c.getClassLoader());
                this.f1452k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f1461t.f1638c.getClassLoader());
                arrayList.add((N) bundle.getParcelable("state"));
            }
        }
        V.v vVar = this.f1447c;
        HashMap hashMap = (HashMap) vVar.f1307c;
        hashMap.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            N n2 = (N) it.next();
            hashMap.put(n2.f1483b, n2);
        }
        J j = (J) bundle3.getParcelable("state");
        if (j == null) {
            return;
        }
        HashMap hashMap2 = (HashMap) vVar.f1306b;
        hashMap2.clear();
        Iterator it2 = j.f1468a.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            i = 2;
            cVar = this.f1453l;
            if (!hasNext) {
                break;
            }
            N n3 = (N) ((HashMap) vVar.f1307c).remove((String) it2.next());
            if (n3 != null) {
                AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = (AbstractComponentCallbacksC0053q) this.f1443L.f1477b.get(n3.f1483b);
                if (abstractComponentCallbacksC0053q != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0053q);
                    }
                    o2 = new O(cVar, vVar, abstractComponentCallbacksC0053q, n3);
                } else {
                    o2 = new O(this.f1453l, this.f1447c, this.f1461t.f1638c.getClassLoader(), C(), n3);
                }
                AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q2 = o2.f1494c;
                abstractComponentCallbacksC0053q2.f1622r = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0053q2.e + "): " + abstractComponentCallbacksC0053q2);
                }
                o2.m(this.f1461t.f1638c.getClassLoader());
                vVar.m(o2);
                o2.e = this.f1460s;
            }
        }
        L l2 = this.f1443L;
        l2.getClass();
        Iterator it3 = new ArrayList(l2.f1477b.values()).iterator();
        while (it3.hasNext()) {
            AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q3 = (AbstractComponentCallbacksC0053q) it3.next();
            if (hashMap2.get(abstractComponentCallbacksC0053q3.e) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0053q3 + " that was not found in the set of active Fragments " + j.f1468a);
                }
                this.f1443L.e(abstractComponentCallbacksC0053q3);
                abstractComponentCallbacksC0053q3.f1622r = this;
                O o3 = new O(cVar, vVar, abstractComponentCallbacksC0053q3);
                o3.e = 1;
                o3.k();
                abstractComponentCallbacksC0053q3.f1616l = true;
                o3.k();
            }
        }
        ArrayList<String> arrayList2 = j.f1469b;
        ((ArrayList) vVar.f1305a).clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                AbstractComponentCallbacksC0053q d2 = vVar.d(str3);
                if (d2 == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str3 + ")");
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + d2);
                }
                vVar.a(d2);
            }
        }
        if (j.f1470c != null) {
            this.f1448d = new ArrayList(j.f1470c.length);
            int i3 = 0;
            while (true) {
                C0038b[] c0038bArr = j.f1470c;
                if (i3 >= c0038bArr.length) {
                    break;
                }
                C0038b c0038b = c0038bArr[i3];
                c0038b.getClass();
                C0037a c0037a = new C0037a(this);
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    int[] iArr = c0038b.f1534a;
                    if (i4 >= iArr.length) {
                        break;
                    }
                    P p2 = new P();
                    int i6 = i4 + 1;
                    p2.f1496a = iArr[i4];
                    if (Log.isLoggable("FragmentManager", i)) {
                        Log.v("FragmentManager", "Instantiate " + c0037a + " op #" + i5 + " base fragment #" + iArr[i6]);
                    }
                    p2.f1502h = EnumC0078m.values()[c0038b.f1536c[i5]];
                    p2.i = EnumC0078m.values()[c0038b.f1537d[i5]];
                    int i7 = i4 + 2;
                    p2.f1498c = iArr[i6] != 0;
                    int i8 = iArr[i7];
                    p2.f1499d = i8;
                    int i9 = iArr[i4 + 3];
                    p2.e = i9;
                    int i10 = i4 + 5;
                    int i11 = iArr[i4 + 4];
                    p2.f1500f = i11;
                    i4 += 6;
                    int i12 = iArr[i10];
                    p2.f1501g = i12;
                    c0037a.f1520b = i8;
                    c0037a.f1521c = i9;
                    c0037a.f1522d = i11;
                    c0037a.e = i12;
                    c0037a.b(p2);
                    i5++;
                    i = 2;
                }
                c0037a.f1523f = c0038b.e;
                c0037a.f1525h = c0038b.f1538f;
                c0037a.f1524g = true;
                c0037a.i = c0038b.f1540h;
                c0037a.j = c0038b.i;
                c0037a.f1526k = c0038b.j;
                c0037a.f1527l = c0038b.f1541k;
                c0037a.f1528m = c0038b.f1542l;
                c0037a.f1529n = c0038b.f1543m;
                c0037a.f1530o = c0038b.f1544n;
                c0037a.f1533r = c0038b.f1539g;
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = c0038b.f1535b;
                    if (i13 >= arrayList3.size()) {
                        break;
                    }
                    String str4 = (String) arrayList3.get(i13);
                    if (str4 != null) {
                        ((P) c0037a.f1519a.get(i13)).f1497b = vVar.d(str4);
                    }
                    i13++;
                }
                c0037a.c(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i3 + " (index " + c0037a.f1533r + "): " + c0037a);
                    PrintWriter printWriter = new PrintWriter(new S());
                    c0037a.d("  ", printWriter, false);
                    printWriter.close();
                }
                this.f1448d.add(c0037a);
                i3++;
                i = 2;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.f1448d = null;
        }
        this.i.set(j.f1471d);
        String str5 = j.e;
        if (str5 != null) {
            AbstractComponentCallbacksC0053q d3 = vVar.d(str5);
            this.f1464w = d3;
            q(d3);
        }
        ArrayList arrayList4 = j.f1472f;
        if (arrayList4 != null) {
            for (int i14 = i2; i14 < arrayList4.size(); i14++) {
                this.j.put((String) arrayList4.get(i14), (C0039c) j.f1473g.get(i14));
            }
        }
        this.f1435C = new ArrayDeque(j.f1474h);
    }

    public final Bundle R() {
        int i;
        ArrayList arrayList;
        C0038b[] c0038bArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0045i c0045i = (C0045i) it.next();
            if (c0045i.e) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0045i.e = false;
                c0045i.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((C0045i) it2.next()).e();
        }
        y(true);
        this.f1437E = true;
        this.f1443L.f1481g = true;
        V.v vVar = this.f1447c;
        vVar.getClass();
        HashMap hashMap = (HashMap) vVar.f1306b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it3 = hashMap.values().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            O o2 = (O) it3.next();
            if (o2 != null) {
                AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = o2.f1494c;
                N n2 = new N(abstractComponentCallbacksC0053q);
                if (abstractComponentCallbacksC0053q.f1608a <= -1 || n2.f1491m != null) {
                    n2.f1491m = abstractComponentCallbacksC0053q.f1609b;
                } else {
                    Bundle bundle2 = new Bundle();
                    abstractComponentCallbacksC0053q.x(bundle2);
                    abstractComponentCallbacksC0053q.f1605P.c(bundle2);
                    bundle2.putParcelable("android:support:fragments", abstractComponentCallbacksC0053q.f1624t.R());
                    o2.f1492a.p(false);
                    Bundle bundle3 = bundle2.isEmpty() ? null : bundle2;
                    if (abstractComponentCallbacksC0053q.f1595E != null) {
                        o2.o();
                    }
                    if (abstractComponentCallbacksC0053q.f1610c != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putSparseParcelableArray("android:view_state", abstractComponentCallbacksC0053q.f1610c);
                    }
                    if (abstractComponentCallbacksC0053q.f1611d != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBundle("android:view_registry_state", abstractComponentCallbacksC0053q.f1611d);
                    }
                    if (!abstractComponentCallbacksC0053q.f1597G) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBoolean("android:user_visible_hint", abstractComponentCallbacksC0053q.f1597G);
                    }
                    n2.f1491m = bundle3;
                    if (abstractComponentCallbacksC0053q.f1614h != null) {
                        if (bundle3 == null) {
                            n2.f1491m = new Bundle();
                        }
                        n2.f1491m.putString("android:target_state", abstractComponentCallbacksC0053q.f1614h);
                        int i2 = abstractComponentCallbacksC0053q.i;
                        if (i2 != 0) {
                            n2.f1491m.putInt("android:target_req_state", i2);
                        }
                    }
                }
                AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q2 = o2.f1494c;
                arrayList2.add(abstractComponentCallbacksC0053q2.e);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0053q2 + ": " + abstractComponentCallbacksC0053q2.f1609b);
                }
            }
        }
        V.v vVar2 = this.f1447c;
        vVar2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) vVar2.f1307c).values());
        if (!arrayList3.isEmpty()) {
            V.v vVar3 = this.f1447c;
            synchronized (((ArrayList) vVar3.f1305a)) {
                try {
                    if (((ArrayList) vVar3.f1305a).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) vVar3.f1305a).size());
                        Iterator it4 = ((ArrayList) vVar3.f1305a).iterator();
                        while (it4.hasNext()) {
                            AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q3 = (AbstractComponentCallbacksC0053q) it4.next();
                            arrayList.add(abstractComponentCallbacksC0053q3.e);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0053q3.e + "): " + abstractComponentCallbacksC0053q3);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList4 = this.f1448d;
            if (arrayList4 == null || (size = arrayList4.size()) <= 0) {
                c0038bArr = null;
            } else {
                c0038bArr = new C0038b[size];
                for (i = 0; i < size; i++) {
                    c0038bArr[i] = new C0038b((C0037a) this.f1448d.get(i));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.f1448d.get(i));
                    }
                }
            }
            J j = new J();
            j.e = null;
            ArrayList arrayList5 = new ArrayList();
            j.f1472f = arrayList5;
            ArrayList arrayList6 = new ArrayList();
            j.f1473g = arrayList6;
            j.f1468a = arrayList2;
            j.f1469b = arrayList;
            j.f1470c = c0038bArr;
            j.f1471d = this.i.get();
            AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q4 = this.f1464w;
            if (abstractComponentCallbacksC0053q4 != null) {
                j.e = abstractComponentCallbacksC0053q4.e;
            }
            arrayList5.addAll(this.j.keySet());
            arrayList6.addAll(this.j.values());
            j.f1474h = new ArrayList(this.f1435C);
            bundle.putParcelable("state", j);
            for (String str : this.f1452k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f1452k.get(str));
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                N n3 = (N) it5.next();
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("state", n3);
                bundle.putBundle("fragment_" + n3.f1483b, bundle4);
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public final void S() {
        synchronized (this.f1445a) {
            try {
                if (this.f1445a.size() == 1) {
                    this.f1461t.f1639d.removeCallbacks(this.f1444M);
                    this.f1461t.f1639d.post(this.f1444M);
                    a0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void T(AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q, boolean z2) {
        ViewGroup B2 = B(abstractComponentCallbacksC0053q);
        if (B2 == null || !(B2 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) B2).setDrawDisappearingViewsLast(!z2);
    }

    public final void U(AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q, EnumC0078m enumC0078m) {
        if (abstractComponentCallbacksC0053q.equals(this.f1447c.d(abstractComponentCallbacksC0053q.e)) && (abstractComponentCallbacksC0053q.f1623s == null || abstractComponentCallbacksC0053q.f1622r == this)) {
            abstractComponentCallbacksC0053q.f1601L = enumC0078m;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0053q + " is not an active fragment of FragmentManager " + this);
    }

    public final void V(AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q) {
        if (abstractComponentCallbacksC0053q != null) {
            if (!abstractComponentCallbacksC0053q.equals(this.f1447c.d(abstractComponentCallbacksC0053q.e)) || (abstractComponentCallbacksC0053q.f1623s != null && abstractComponentCallbacksC0053q.f1622r != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0053q + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q2 = this.f1464w;
        this.f1464w = abstractComponentCallbacksC0053q;
        q(abstractComponentCallbacksC0053q2);
        q(this.f1464w);
    }

    public final void W(AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q) {
        ViewGroup B2 = B(abstractComponentCallbacksC0053q);
        if (B2 != null) {
            C0052p c0052p = abstractComponentCallbacksC0053q.H;
            if ((c0052p == null ? 0 : c0052p.e) + (c0052p == null ? 0 : c0052p.f1585d) + (c0052p == null ? 0 : c0052p.f1584c) + (c0052p == null ? 0 : c0052p.f1583b) > 0) {
                if (B2.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    B2.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0053q);
                }
                AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q2 = (AbstractComponentCallbacksC0053q) B2.getTag(R.id.visible_removing_fragment_view_tag);
                C0052p c0052p2 = abstractComponentCallbacksC0053q.H;
                boolean z2 = c0052p2 != null ? c0052p2.f1582a : false;
                if (abstractComponentCallbacksC0053q2.H == null) {
                    return;
                }
                abstractComponentCallbacksC0053q2.f().f1582a = z2;
            }
        }
    }

    public final void Y() {
        Iterator it = this.f1447c.h().iterator();
        while (it.hasNext()) {
            O o2 = (O) it.next();
            AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = o2.f1494c;
            if (abstractComponentCallbacksC0053q.f1596F) {
                if (this.f1446b) {
                    this.H = true;
                } else {
                    abstractComponentCallbacksC0053q.f1596F = false;
                    o2.k();
                }
            }
        }
    }

    public final void Z(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new S());
        C0056u c0056u = this.f1461t;
        if (c0056u == null) {
            try {
                v("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            c0056u.f1640f.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw illegalStateException;
        }
    }

    public final O a(AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q) {
        String str = abstractComponentCallbacksC0053q.f1600K;
        if (str != null) {
            AbstractC0062d.c(abstractComponentCallbacksC0053q, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0053q);
        }
        O f2 = f(abstractComponentCallbacksC0053q);
        abstractComponentCallbacksC0053q.f1622r = this;
        V.v vVar = this.f1447c;
        vVar.m(f2);
        if (!abstractComponentCallbacksC0053q.f1630z) {
            vVar.a(abstractComponentCallbacksC0053q);
            abstractComponentCallbacksC0053q.f1616l = false;
            if (abstractComponentCallbacksC0053q.f1595E == null) {
                abstractComponentCallbacksC0053q.f1598I = false;
            }
            if (F(abstractComponentCallbacksC0053q)) {
                this.f1436D = true;
            }
        }
        return f2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [i1.a, j1.g] */
    /* JADX WARN: Type inference failed for: r1v10, types: [i1.a, j1.g] */
    public final void a0() {
        synchronized (this.f1445a) {
            try {
                if (!this.f1445a.isEmpty()) {
                    A a2 = this.f1451h;
                    a2.f1420a = true;
                    ?? r12 = a2.f1422c;
                    if (r12 != 0) {
                        r12.c();
                    }
                    return;
                }
                A a3 = this.f1451h;
                ArrayList arrayList = this.f1448d;
                a3.f1420a = (arrayList != null ? arrayList.size() : 0) > 0 && I(this.f1463v);
                ?? r02 = a3.f1422c;
                if (r02 != 0) {
                    r02.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(C0056u c0056u, H1.d dVar, AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q) {
        if (this.f1461t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f1461t = c0056u;
        this.f1462u = dVar;
        this.f1463v = abstractComponentCallbacksC0053q;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1454m;
        if (abstractComponentCallbacksC0053q != 0) {
            copyOnWriteArrayList.add(new D(abstractComponentCallbacksC0053q));
        } else if (c0056u != null) {
            copyOnWriteArrayList.add(c0056u);
        }
        if (this.f1463v != null) {
            a0();
        }
        if (c0056u != null) {
            b.w i = c0056u.f1640f.i();
            this.f1450g = i;
            C0056u c0056u2 = abstractComponentCallbacksC0053q != 0 ? abstractComponentCallbacksC0053q : c0056u;
            i.getClass();
            A a2 = this.f1451h;
            j1.h.e(a2, "onBackPressedCallback");
            androidx.lifecycle.v e = c0056u2.e();
            if (e.f1949d != EnumC0078m.f1934a) {
                a2.f1421b.add(new b.t(i, e, a2));
                i.d();
                a2.f1422c = new b.v(0, i, b.w.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0);
            }
        }
        if (abstractComponentCallbacksC0053q != 0) {
            L l2 = abstractComponentCallbacksC0053q.f1622r.f1443L;
            HashMap hashMap = l2.f1478c;
            L l3 = (L) hashMap.get(abstractComponentCallbacksC0053q.e);
            if (l3 == null) {
                l3 = new L(l2.e);
                hashMap.put(abstractComponentCallbacksC0053q.e, l3);
            }
            this.f1443L = l3;
        } else if (c0056u != null) {
            this.f1443L = (L) new C1.d(c0056u.f1640f.c(), L.f1476h).s(L.class);
        } else {
            this.f1443L = new L(false);
        }
        L l4 = this.f1443L;
        l4.f1481g = this.f1437E || this.f1438F;
        this.f1447c.f1308d = l4;
        C0056u c0056u3 = this.f1461t;
        if (c0056u3 != null && abstractComponentCallbacksC0053q == 0) {
            j0.d b2 = c0056u3.b();
            b2.e("android:support:fragments", new r(2, this));
            Bundle c2 = b2.c("android:support:fragments");
            if (c2 != null) {
                Q(c2);
            }
        }
        C0056u c0056u4 = this.f1461t;
        if (c0056u4 != null) {
            AbstractActivityC0132i abstractActivityC0132i = c0056u4.f1640f;
            String str = "FragmentManager:" + (abstractComponentCallbacksC0053q != 0 ? AbstractC0001b.g(new StringBuilder(), abstractComponentCallbacksC0053q.e, ":") : "");
            String f2 = AbstractC0001b.f(str, "StartActivityForResult");
            E e2 = new E(2);
            z zVar = new z(this, 1);
            b.j jVar = abstractActivityC0132i.f2183h;
            this.f1467z = jVar.b(f2, e2, zVar);
            this.f1433A = jVar.b(AbstractC0001b.f(str, "StartIntentSenderForResult"), new E(0), new z(this, 2));
            this.f1434B = jVar.b(AbstractC0001b.f(str, "RequestPermissions"), new E(1), new z(this, 0));
        }
        C0056u c0056u5 = this.f1461t;
        if (c0056u5 != null) {
            c0056u5.f1640f.g(this.f1455n);
        }
        C0056u c0056u6 = this.f1461t;
        if (c0056u6 != null) {
            AbstractActivityC0132i abstractActivityC0132i2 = c0056u6.f1640f;
            y yVar = this.f1456o;
            abstractActivityC0132i2.getClass();
            j1.h.e(yVar, "listener");
            abstractActivityC0132i2.j.add(yVar);
        }
        C0056u c0056u7 = this.f1461t;
        if (c0056u7 != null) {
            AbstractActivityC0132i abstractActivityC0132i3 = c0056u7.f1640f;
            y yVar2 = this.f1457p;
            abstractActivityC0132i3.getClass();
            j1.h.e(yVar2, "listener");
            abstractActivityC0132i3.f2185l.add(yVar2);
        }
        C0056u c0056u8 = this.f1461t;
        if (c0056u8 != null) {
            AbstractActivityC0132i abstractActivityC0132i4 = c0056u8.f1640f;
            y yVar3 = this.f1458q;
            abstractActivityC0132i4.getClass();
            j1.h.e(yVar3, "listener");
            abstractActivityC0132i4.f2186m.add(yVar3);
        }
        C0056u c0056u9 = this.f1461t;
        if (c0056u9 == null || abstractComponentCallbacksC0053q != 0) {
            return;
        }
        AbstractActivityC0132i abstractActivityC0132i5 = c0056u9.f1640f;
        B b3 = this.f1459r;
        abstractActivityC0132i5.getClass();
        j1.h.e(b3, "provider");
        I0.h hVar = abstractActivityC0132i5.f2179c;
        ((CopyOnWriteArrayList) hVar.f592c).add(b3);
        ((Runnable) hVar.f591b).run();
    }

    public final void c(AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0053q);
        }
        if (abstractComponentCallbacksC0053q.f1630z) {
            abstractComponentCallbacksC0053q.f1630z = false;
            if (abstractComponentCallbacksC0053q.f1615k) {
                return;
            }
            this.f1447c.a(abstractComponentCallbacksC0053q);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0053q);
            }
            if (F(abstractComponentCallbacksC0053q)) {
                this.f1436D = true;
            }
        }
    }

    public final void d() {
        this.f1446b = false;
        this.f1441J.clear();
        this.f1440I.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f1447c.h().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((O) it.next()).f1494c.f1594D;
            if (viewGroup != null) {
                hashSet.add(C0045i.f(viewGroup, D()));
            }
        }
        return hashSet;
    }

    public final O f(AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q) {
        String str = abstractComponentCallbacksC0053q.e;
        V.v vVar = this.f1447c;
        O o2 = (O) ((HashMap) vVar.f1306b).get(str);
        if (o2 != null) {
            return o2;
        }
        O o3 = new O(this.f1453l, vVar, abstractComponentCallbacksC0053q);
        o3.m(this.f1461t.f1638c.getClassLoader());
        o3.e = this.f1460s;
        return o3;
    }

    public final void g(AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0053q);
        }
        if (abstractComponentCallbacksC0053q.f1630z) {
            return;
        }
        abstractComponentCallbacksC0053q.f1630z = true;
        if (abstractComponentCallbacksC0053q.f1615k) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0053q);
            }
            V.v vVar = this.f1447c;
            synchronized (((ArrayList) vVar.f1305a)) {
                ((ArrayList) vVar.f1305a).remove(abstractComponentCallbacksC0053q);
            }
            abstractComponentCallbacksC0053q.f1615k = false;
            if (F(abstractComponentCallbacksC0053q)) {
                this.f1436D = true;
            }
            W(abstractComponentCallbacksC0053q);
        }
    }

    public final void h(boolean z2) {
        if (z2 && this.f1461t != null) {
            Z(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q : this.f1447c.j()) {
            if (abstractComponentCallbacksC0053q != null) {
                abstractComponentCallbacksC0053q.f1593C = true;
                if (z2) {
                    abstractComponentCallbacksC0053q.f1624t.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.f1460s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q : this.f1447c.j()) {
            if (abstractComponentCallbacksC0053q != null) {
                if (!abstractComponentCallbacksC0053q.f1629y ? abstractComponentCallbacksC0053q.f1624t.i() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.f1460s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q : this.f1447c.j()) {
            if (abstractComponentCallbacksC0053q != null && H(abstractComponentCallbacksC0053q)) {
                if (!abstractComponentCallbacksC0053q.f1629y ? abstractComponentCallbacksC0053q.f1624t.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0053q);
                    z2 = true;
                }
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q2 = (AbstractComponentCallbacksC0053q) this.e.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0053q2)) {
                    abstractComponentCallbacksC0053q2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z2;
    }

    public final void k() {
        boolean z2 = true;
        this.f1439G = true;
        y(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0045i) it.next()).e();
        }
        C0056u c0056u = this.f1461t;
        V.v vVar = this.f1447c;
        if (c0056u != null) {
            z2 = ((L) vVar.f1308d).f1480f;
        } else {
            AbstractActivityC0132i abstractActivityC0132i = c0056u.f1638c;
            if (abstractActivityC0132i != null) {
                z2 = true ^ abstractActivityC0132i.isChangingConfigurations();
            }
        }
        if (z2) {
            Iterator it2 = this.j.values().iterator();
            while (it2.hasNext()) {
                for (String str : ((C0039c) it2.next()).f1545a) {
                    L l2 = (L) vVar.f1308d;
                    l2.getClass();
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    l2.d(str);
                }
            }
        }
        t(-1);
        C0056u c0056u2 = this.f1461t;
        if (c0056u2 != null) {
            AbstractActivityC0132i abstractActivityC0132i2 = c0056u2.f1640f;
            y yVar = this.f1456o;
            abstractActivityC0132i2.getClass();
            j1.h.e(yVar, "listener");
            abstractActivityC0132i2.j.remove(yVar);
        }
        C0056u c0056u3 = this.f1461t;
        if (c0056u3 != null) {
            AbstractActivityC0132i abstractActivityC0132i3 = c0056u3.f1640f;
            y yVar2 = this.f1455n;
            abstractActivityC0132i3.getClass();
            j1.h.e(yVar2, "listener");
            abstractActivityC0132i3.i.remove(yVar2);
        }
        C0056u c0056u4 = this.f1461t;
        if (c0056u4 != null) {
            AbstractActivityC0132i abstractActivityC0132i4 = c0056u4.f1640f;
            y yVar3 = this.f1457p;
            abstractActivityC0132i4.getClass();
            j1.h.e(yVar3, "listener");
            abstractActivityC0132i4.f2185l.remove(yVar3);
        }
        C0056u c0056u5 = this.f1461t;
        if (c0056u5 != null) {
            AbstractActivityC0132i abstractActivityC0132i5 = c0056u5.f1640f;
            y yVar4 = this.f1458q;
            abstractActivityC0132i5.getClass();
            j1.h.e(yVar4, "listener");
            abstractActivityC0132i5.f2186m.remove(yVar4);
        }
        C0056u c0056u6 = this.f1461t;
        if (c0056u6 != null) {
            AbstractActivityC0132i abstractActivityC0132i6 = c0056u6.f1640f;
            B b2 = this.f1459r;
            abstractActivityC0132i6.getClass();
            j1.h.e(b2, "provider");
            I0.h hVar = abstractActivityC0132i6.f2179c;
            ((CopyOnWriteArrayList) hVar.f592c).remove(b2);
            if (((HashMap) hVar.f593d).remove(b2) != null) {
                throw new ClassCastException();
            }
            ((Runnable) hVar.f591b).run();
        }
        this.f1461t = null;
        this.f1462u = null;
        this.f1463v = null;
        if (this.f1450g != null) {
            Iterator it3 = this.f1451h.f1421b.iterator();
            while (it3.hasNext()) {
                ((InterfaceC0090c) it3.next()).cancel();
            }
            this.f1450g = null;
        }
        B1.c cVar = this.f1467z;
        if (cVar != null) {
            cVar.L();
            this.f1433A.L();
            this.f1434B.L();
        }
    }

    public final void l(boolean z2) {
        if (z2 && this.f1461t != null) {
            Z(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q : this.f1447c.j()) {
            if (abstractComponentCallbacksC0053q != null) {
                abstractComponentCallbacksC0053q.f1593C = true;
                if (z2) {
                    abstractComponentCallbacksC0053q.f1624t.l(true);
                }
            }
        }
    }

    public final void m(boolean z2, boolean z3) {
        if (z3 && this.f1461t != null) {
            Z(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q : this.f1447c.j()) {
            if (abstractComponentCallbacksC0053q != null && z3) {
                abstractComponentCallbacksC0053q.f1624t.m(z2, true);
            }
        }
    }

    public final void n() {
        Iterator it = this.f1447c.i().iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = (AbstractComponentCallbacksC0053q) it.next();
            if (abstractComponentCallbacksC0053q != null) {
                abstractComponentCallbacksC0053q.n();
                abstractComponentCallbacksC0053q.f1624t.n();
            }
        }
    }

    public final boolean o() {
        if (this.f1460s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q : this.f1447c.j()) {
            if (abstractComponentCallbacksC0053q != null) {
                if (!abstractComponentCallbacksC0053q.f1629y ? abstractComponentCallbacksC0053q.f1624t.o() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f1460s < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q : this.f1447c.j()) {
            if (abstractComponentCallbacksC0053q != null && !abstractComponentCallbacksC0053q.f1629y) {
                abstractComponentCallbacksC0053q.f1624t.p();
            }
        }
    }

    public final void q(AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q) {
        if (abstractComponentCallbacksC0053q != null) {
            if (abstractComponentCallbacksC0053q.equals(this.f1447c.d(abstractComponentCallbacksC0053q.e))) {
                abstractComponentCallbacksC0053q.f1622r.getClass();
                boolean I2 = I(abstractComponentCallbacksC0053q);
                Boolean bool = abstractComponentCallbacksC0053q.j;
                if (bool == null || bool.booleanValue() != I2) {
                    abstractComponentCallbacksC0053q.j = Boolean.valueOf(I2);
                    I i = abstractComponentCallbacksC0053q.f1624t;
                    i.a0();
                    i.q(i.f1464w);
                }
            }
        }
    }

    public final void r(boolean z2, boolean z3) {
        if (z3 && this.f1461t != null) {
            Z(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q : this.f1447c.j()) {
            if (abstractComponentCallbacksC0053q != null && z3) {
                abstractComponentCallbacksC0053q.f1624t.r(z2, true);
            }
        }
    }

    public final boolean s() {
        if (this.f1460s < 1) {
            return false;
        }
        boolean z2 = false;
        for (AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q : this.f1447c.j()) {
            if (abstractComponentCallbacksC0053q != null && H(abstractComponentCallbacksC0053q)) {
                if (!abstractComponentCallbacksC0053q.f1629y ? abstractComponentCallbacksC0053q.f1624t.s() : false) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final void t(int i) {
        try {
            this.f1446b = true;
            for (O o2 : ((HashMap) this.f1447c.f1306b).values()) {
                if (o2 != null) {
                    o2.e = i;
                }
            }
            J(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0045i) it.next()).e();
            }
            this.f1446b = false;
            y(true);
        } catch (Throwable th) {
            this.f1446b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = this.f1463v;
        if (abstractComponentCallbacksC0053q != null) {
            sb.append(abstractComponentCallbacksC0053q.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f1463v)));
            sb.append("}");
        } else {
            C0056u c0056u = this.f1461t;
            if (c0056u != null) {
                sb.append(c0056u.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f1461t)));
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
            Y();
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String f2 = AbstractC0001b.f(str, "    ");
        V.v vVar = this.f1447c;
        vVar.getClass();
        String str3 = str + "    ";
        HashMap hashMap = (HashMap) vVar.f1306b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (O o2 : hashMap.values()) {
                printWriter.print(str);
                if (o2 != null) {
                    AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = o2.f1494c;
                    printWriter.println(abstractComponentCallbacksC0053q);
                    abstractComponentCallbacksC0053q.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0053q.f1626v));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0053q.f1627w));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0053q.f1628x);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0053q.f1608a);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0053q.e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0053q.f1621q);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0053q.f1615k);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0053q.f1616l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0053q.f1617m);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0053q.f1618n);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0053q.f1629y);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0053q.f1630z);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0053q.f1592B);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0053q.f1591A);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0053q.f1597G);
                    if (abstractComponentCallbacksC0053q.f1622r != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0053q.f1622r);
                    }
                    if (abstractComponentCallbacksC0053q.f1623s != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0053q.f1623s);
                    }
                    if (abstractComponentCallbacksC0053q.f1625u != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0053q.f1625u);
                    }
                    if (abstractComponentCallbacksC0053q.f1612f != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0053q.f1612f);
                    }
                    if (abstractComponentCallbacksC0053q.f1609b != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0053q.f1609b);
                    }
                    if (abstractComponentCallbacksC0053q.f1610c != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0053q.f1610c);
                    }
                    if (abstractComponentCallbacksC0053q.f1611d != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0053q.f1611d);
                    }
                    Object obj = abstractComponentCallbacksC0053q.f1613g;
                    if (obj == null) {
                        I i = abstractComponentCallbacksC0053q.f1622r;
                        obj = (i == null || (str2 = abstractComponentCallbacksC0053q.f1614h) == null) ? null : i.f1447c.d(str2);
                    }
                    if (obj != null) {
                        printWriter.print(str3);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC0053q.i);
                    }
                    printWriter.print(str3);
                    printWriter.print("mPopDirection=");
                    C0052p c0052p = abstractComponentCallbacksC0053q.H;
                    printWriter.println(c0052p == null ? false : c0052p.f1582a);
                    C0052p c0052p2 = abstractComponentCallbacksC0053q.H;
                    if ((c0052p2 == null ? 0 : c0052p2.f1583b) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        C0052p c0052p3 = abstractComponentCallbacksC0053q.H;
                        printWriter.println(c0052p3 == null ? 0 : c0052p3.f1583b);
                    }
                    C0052p c0052p4 = abstractComponentCallbacksC0053q.H;
                    if ((c0052p4 == null ? 0 : c0052p4.f1584c) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        C0052p c0052p5 = abstractComponentCallbacksC0053q.H;
                        printWriter.println(c0052p5 == null ? 0 : c0052p5.f1584c);
                    }
                    C0052p c0052p6 = abstractComponentCallbacksC0053q.H;
                    if ((c0052p6 == null ? 0 : c0052p6.f1585d) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        C0052p c0052p7 = abstractComponentCallbacksC0053q.H;
                        printWriter.println(c0052p7 == null ? 0 : c0052p7.f1585d);
                    }
                    C0052p c0052p8 = abstractComponentCallbacksC0053q.H;
                    if ((c0052p8 == null ? 0 : c0052p8.e) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        C0052p c0052p9 = abstractComponentCallbacksC0053q.H;
                        printWriter.println(c0052p9 == null ? 0 : c0052p9.e);
                    }
                    if (abstractComponentCallbacksC0053q.f1594D != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0053q.f1594D);
                    }
                    if (abstractComponentCallbacksC0053q.f1595E != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0053q.f1595E);
                    }
                    if (abstractComponentCallbacksC0053q.h() != null) {
                        q.l lVar = ((C0114a) new C1.d(abstractComponentCallbacksC0053q.c(), C0114a.f2652c).s(C0114a.class)).f2653b;
                        if (lVar.f3929c > 0) {
                            printWriter.print(str3);
                            printWriter.println("Loaders:");
                            if (lVar.f3929c > 0) {
                                if (lVar.f3928b[0] != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(str3);
                                printWriter.print("  #");
                                printWriter.print(lVar.f3927a[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + abstractComponentCallbacksC0053q.f1624t + ":");
                    abstractComponentCallbacksC0053q.f1624t.v(AbstractC0001b.f(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) vVar.f1305a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size3; i2++) {
                AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q2 = (AbstractComponentCallbacksC0053q) arrayList.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0053q2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q3 = (AbstractComponentCallbacksC0053q) this.e.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0053q3.toString());
            }
        }
        ArrayList arrayList3 = this.f1448d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size; i4++) {
                C0037a c0037a = (C0037a) this.f1448d.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(c0037a.toString());
                c0037a.d(f2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.f1445a) {
            try {
                int size4 = this.f1445a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i5 = 0; i5 < size4; i5++) {
                        Object obj2 = (G) this.f1445a.get(i5);
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
        printWriter.println(this.f1461t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1462u);
        if (this.f1463v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1463v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1460s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f1437E);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1438F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f1439G);
        if (this.f1436D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f1436D);
        }
    }

    public final void w(G g2, boolean z2) {
        if (!z2) {
            if (this.f1461t == null) {
                if (!this.f1439G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f1437E || this.f1438F) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1445a) {
            try {
                if (this.f1461t == null) {
                    if (!z2) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f1445a.add(g2);
                    S();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(boolean z2) {
        if (this.f1446b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f1461t == null) {
            if (!this.f1439G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f1461t.f1639d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2 && (this.f1437E || this.f1438F)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f1440I == null) {
            this.f1440I = new ArrayList();
            this.f1441J = new ArrayList();
        }
    }

    public final boolean y(boolean z2) {
        boolean z3;
        x(z2);
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.f1440I;
            ArrayList arrayList2 = this.f1441J;
            synchronized (this.f1445a) {
                if (this.f1445a.isEmpty()) {
                    z3 = false;
                } else {
                    try {
                        int size = this.f1445a.size();
                        z3 = false;
                        for (int i = 0; i < size; i++) {
                            z3 |= ((G) this.f1445a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z3) {
                a0();
                u();
                ((HashMap) this.f1447c.f1306b).values().removeAll(Collections.singleton(null));
                return z4;
            }
            z4 = true;
            this.f1446b = true;
            try {
                P(this.f1440I, this.f1441J);
            } finally {
                d();
            }
        }
    }

    public final void z(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        V.v vVar;
        V.v vVar2;
        V.v vVar3;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        boolean z2 = ((C0037a) arrayList3.get(i)).f1530o;
        ArrayList arrayList5 = this.f1442K;
        if (arrayList5 == null) {
            this.f1442K = new ArrayList();
        } else {
            arrayList5.clear();
        }
        ArrayList arrayList6 = this.f1442K;
        V.v vVar4 = this.f1447c;
        arrayList6.addAll(vVar4.j());
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = this.f1464w;
        int i6 = i;
        boolean z3 = false;
        while (true) {
            int i7 = 1;
            if (i6 >= i2) {
                V.v vVar5 = vVar4;
                this.f1442K.clear();
                if (!z2 && this.f1460s >= 1) {
                    for (int i8 = i; i8 < i2; i8++) {
                        Iterator it = ((C0037a) arrayList.get(i8)).f1519a.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q2 = ((P) it.next()).f1497b;
                            if (abstractComponentCallbacksC0053q2 == null || abstractComponentCallbacksC0053q2.f1622r == null) {
                                vVar = vVar5;
                            } else {
                                vVar = vVar5;
                                vVar.m(f(abstractComponentCallbacksC0053q2));
                            }
                            vVar5 = vVar;
                        }
                    }
                }
                for (int i9 = i; i9 < i2; i9++) {
                    C0037a c0037a = (C0037a) arrayList.get(i9);
                    if (((Boolean) arrayList2.get(i9)).booleanValue()) {
                        c0037a.c(-1);
                        ArrayList arrayList7 = c0037a.f1519a;
                        boolean z4 = true;
                        for (int size = arrayList7.size() - 1; size >= 0; size--) {
                            P p2 = (P) arrayList7.get(size);
                            AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q3 = p2.f1497b;
                            if (abstractComponentCallbacksC0053q3 != null) {
                                if (abstractComponentCallbacksC0053q3.H != null) {
                                    abstractComponentCallbacksC0053q3.f().f1582a = z4;
                                }
                                int i10 = c0037a.f1523f;
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
                                if (abstractComponentCallbacksC0053q3.H != null || i11 != 0) {
                                    abstractComponentCallbacksC0053q3.f();
                                    abstractComponentCallbacksC0053q3.H.f1586f = i11;
                                }
                                abstractComponentCallbacksC0053q3.f();
                                abstractComponentCallbacksC0053q3.H.getClass();
                            }
                            int i13 = p2.f1496a;
                            I i14 = c0037a.f1531p;
                            switch (i13) {
                                case 1:
                                    abstractComponentCallbacksC0053q3.E(p2.f1499d, p2.e, p2.f1500f, p2.f1501g);
                                    z4 = true;
                                    i14.T(abstractComponentCallbacksC0053q3, true);
                                    i14.O(abstractComponentCallbacksC0053q3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + p2.f1496a);
                                case 3:
                                    abstractComponentCallbacksC0053q3.E(p2.f1499d, p2.e, p2.f1500f, p2.f1501g);
                                    i14.a(abstractComponentCallbacksC0053q3);
                                    z4 = true;
                                case 4:
                                    abstractComponentCallbacksC0053q3.E(p2.f1499d, p2.e, p2.f1500f, p2.f1501g);
                                    i14.getClass();
                                    X(abstractComponentCallbacksC0053q3);
                                    z4 = true;
                                case 5:
                                    abstractComponentCallbacksC0053q3.E(p2.f1499d, p2.e, p2.f1500f, p2.f1501g);
                                    i14.T(abstractComponentCallbacksC0053q3, true);
                                    i14.E(abstractComponentCallbacksC0053q3);
                                    z4 = true;
                                case 6:
                                    abstractComponentCallbacksC0053q3.E(p2.f1499d, p2.e, p2.f1500f, p2.f1501g);
                                    i14.c(abstractComponentCallbacksC0053q3);
                                    z4 = true;
                                case 7:
                                    abstractComponentCallbacksC0053q3.E(p2.f1499d, p2.e, p2.f1500f, p2.f1501g);
                                    i14.T(abstractComponentCallbacksC0053q3, true);
                                    i14.g(abstractComponentCallbacksC0053q3);
                                    z4 = true;
                                case 8:
                                    i14.V(null);
                                    z4 = true;
                                case 9:
                                    i14.V(abstractComponentCallbacksC0053q3);
                                    z4 = true;
                                case 10:
                                    i14.U(abstractComponentCallbacksC0053q3, p2.f1502h);
                                    z4 = true;
                            }
                        }
                    } else {
                        c0037a.c(1);
                        ArrayList arrayList8 = c0037a.f1519a;
                        int size2 = arrayList8.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            P p3 = (P) arrayList8.get(i15);
                            AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q4 = p3.f1497b;
                            if (abstractComponentCallbacksC0053q4 != null) {
                                if (abstractComponentCallbacksC0053q4.H != null) {
                                    abstractComponentCallbacksC0053q4.f().f1582a = false;
                                }
                                int i16 = c0037a.f1523f;
                                if (abstractComponentCallbacksC0053q4.H != null || i16 != 0) {
                                    abstractComponentCallbacksC0053q4.f();
                                    abstractComponentCallbacksC0053q4.H.f1586f = i16;
                                }
                                abstractComponentCallbacksC0053q4.f();
                                abstractComponentCallbacksC0053q4.H.getClass();
                            }
                            int i17 = p3.f1496a;
                            I i18 = c0037a.f1531p;
                            switch (i17) {
                                case 1:
                                    abstractComponentCallbacksC0053q4.E(p3.f1499d, p3.e, p3.f1500f, p3.f1501g);
                                    i18.T(abstractComponentCallbacksC0053q4, false);
                                    i18.a(abstractComponentCallbacksC0053q4);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + p3.f1496a);
                                case 3:
                                    abstractComponentCallbacksC0053q4.E(p3.f1499d, p3.e, p3.f1500f, p3.f1501g);
                                    i18.O(abstractComponentCallbacksC0053q4);
                                case 4:
                                    abstractComponentCallbacksC0053q4.E(p3.f1499d, p3.e, p3.f1500f, p3.f1501g);
                                    i18.E(abstractComponentCallbacksC0053q4);
                                case 5:
                                    abstractComponentCallbacksC0053q4.E(p3.f1499d, p3.e, p3.f1500f, p3.f1501g);
                                    i18.T(abstractComponentCallbacksC0053q4, false);
                                    X(abstractComponentCallbacksC0053q4);
                                case 6:
                                    abstractComponentCallbacksC0053q4.E(p3.f1499d, p3.e, p3.f1500f, p3.f1501g);
                                    i18.g(abstractComponentCallbacksC0053q4);
                                case 7:
                                    abstractComponentCallbacksC0053q4.E(p3.f1499d, p3.e, p3.f1500f, p3.f1501g);
                                    i18.T(abstractComponentCallbacksC0053q4, false);
                                    i18.c(abstractComponentCallbacksC0053q4);
                                case 8:
                                    i18.V(abstractComponentCallbacksC0053q4);
                                case 9:
                                    i18.V(null);
                                case 10:
                                    i18.U(abstractComponentCallbacksC0053q4, p3.i);
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i19 = i; i19 < i2; i19++) {
                    C0037a c0037a2 = (C0037a) arrayList.get(i19);
                    if (booleanValue) {
                        for (int size3 = c0037a2.f1519a.size() - 1; size3 >= 0; size3--) {
                            AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q5 = ((P) c0037a2.f1519a.get(size3)).f1497b;
                            if (abstractComponentCallbacksC0053q5 != null) {
                                f(abstractComponentCallbacksC0053q5).k();
                            }
                        }
                    } else {
                        Iterator it2 = c0037a2.f1519a.iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q6 = ((P) it2.next()).f1497b;
                            if (abstractComponentCallbacksC0053q6 != null) {
                                f(abstractComponentCallbacksC0053q6).k();
                            }
                        }
                    }
                }
                J(this.f1460s, true);
                HashSet hashSet = new HashSet();
                for (int i20 = i; i20 < i2; i20++) {
                    Iterator it3 = ((C0037a) arrayList.get(i20)).f1519a.iterator();
                    while (it3.hasNext()) {
                        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q7 = ((P) it3.next()).f1497b;
                        if (abstractComponentCallbacksC0053q7 != null && (viewGroup = abstractComponentCallbacksC0053q7.f1594D) != null) {
                            hashSet.add(C0045i.f(viewGroup, D()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    C0045i c0045i = (C0045i) it4.next();
                    c0045i.f1562d = booleanValue;
                    synchronized (c0045i.f1560b) {
                        try {
                            c0045i.g();
                            c0045i.e = false;
                            int size4 = c0045i.f1560b.size() - 1;
                            while (true) {
                                if (size4 >= 0) {
                                    U u2 = (U) c0045i.f1560b.get(size4);
                                    int c2 = AbstractC0001b.c(u2.f1514c.f1595E);
                                    if (u2.f1512a != 2 || c2 == 2) {
                                        size4--;
                                    } else {
                                        C0052p c0052p = u2.f1514c.H;
                                        c0045i.e = false;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    c0045i.c();
                }
                for (int i21 = i; i21 < i2; i21++) {
                    C0037a c0037a3 = (C0037a) arrayList.get(i21);
                    if (((Boolean) arrayList2.get(i21)).booleanValue() && c0037a3.f1533r >= 0) {
                        c0037a3.f1533r = -1;
                    }
                    c0037a3.getClass();
                }
                return;
            }
            C0037a c0037a4 = (C0037a) arrayList3.get(i6);
            if (((Boolean) arrayList4.get(i6)).booleanValue()) {
                vVar2 = vVar4;
                int i22 = 1;
                ArrayList arrayList9 = this.f1442K;
                ArrayList arrayList10 = c0037a4.f1519a;
                int size5 = arrayList10.size() - 1;
                while (size5 >= 0) {
                    P p4 = (P) arrayList10.get(size5);
                    int i23 = p4.f1496a;
                    if (i23 != i22) {
                        if (i23 != 3) {
                            switch (i23) {
                                case 8:
                                    abstractComponentCallbacksC0053q = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0053q = p4.f1497b;
                                    break;
                                case 10:
                                    p4.i = p4.f1502h;
                                    break;
                            }
                            size5--;
                            i22 = 1;
                        }
                        arrayList9.add(p4.f1497b);
                        size5--;
                        i22 = 1;
                    }
                    arrayList9.remove(p4.f1497b);
                    size5--;
                    i22 = 1;
                }
            } else {
                ArrayList arrayList11 = this.f1442K;
                int i24 = 0;
                while (true) {
                    ArrayList arrayList12 = c0037a4.f1519a;
                    if (i24 < arrayList12.size()) {
                        P p5 = (P) arrayList12.get(i24);
                        int i25 = p5.f1496a;
                        if (i25 != i7) {
                            if (i25 != 2) {
                                if (i25 == 3 || i25 == 6) {
                                    arrayList11.remove(p5.f1497b);
                                    AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q8 = p5.f1497b;
                                    if (abstractComponentCallbacksC0053q8 == abstractComponentCallbacksC0053q) {
                                        arrayList12.add(i24, new P(9, abstractComponentCallbacksC0053q8));
                                        i24++;
                                        vVar3 = vVar4;
                                        i3 = 1;
                                        abstractComponentCallbacksC0053q = null;
                                    }
                                } else if (i25 == 7) {
                                    vVar3 = vVar4;
                                    i3 = 1;
                                } else if (i25 == 8) {
                                    arrayList12.add(i24, new P(9, abstractComponentCallbacksC0053q, 0));
                                    p5.f1498c = true;
                                    i24++;
                                    abstractComponentCallbacksC0053q = p5.f1497b;
                                }
                                vVar3 = vVar4;
                                i3 = 1;
                            } else {
                                AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q9 = p5.f1497b;
                                int i26 = abstractComponentCallbacksC0053q9.f1627w;
                                int size6 = arrayList11.size() - 1;
                                boolean z5 = false;
                                while (size6 >= 0) {
                                    V.v vVar6 = vVar4;
                                    AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q10 = (AbstractComponentCallbacksC0053q) arrayList11.get(size6);
                                    if (abstractComponentCallbacksC0053q10.f1627w != i26) {
                                        i4 = i26;
                                    } else if (abstractComponentCallbacksC0053q10 == abstractComponentCallbacksC0053q9) {
                                        i4 = i26;
                                        z5 = true;
                                    } else {
                                        if (abstractComponentCallbacksC0053q10 == abstractComponentCallbacksC0053q) {
                                            i4 = i26;
                                            arrayList12.add(i24, new P(9, abstractComponentCallbacksC0053q10, 0));
                                            i24++;
                                            i5 = 0;
                                            abstractComponentCallbacksC0053q = null;
                                        } else {
                                            i4 = i26;
                                            i5 = 0;
                                        }
                                        P p6 = new P(3, abstractComponentCallbacksC0053q10, i5);
                                        p6.f1499d = p5.f1499d;
                                        p6.f1500f = p5.f1500f;
                                        p6.e = p5.e;
                                        p6.f1501g = p5.f1501g;
                                        arrayList12.add(i24, p6);
                                        arrayList11.remove(abstractComponentCallbacksC0053q10);
                                        i24++;
                                        abstractComponentCallbacksC0053q = abstractComponentCallbacksC0053q;
                                    }
                                    size6--;
                                    i26 = i4;
                                    vVar4 = vVar6;
                                }
                                vVar3 = vVar4;
                                i3 = 1;
                                if (z5) {
                                    arrayList12.remove(i24);
                                    i24--;
                                } else {
                                    p5.f1496a = 1;
                                    p5.f1498c = true;
                                    arrayList11.add(abstractComponentCallbacksC0053q9);
                                }
                            }
                            i24 += i3;
                            i7 = i3;
                            vVar4 = vVar3;
                        } else {
                            vVar3 = vVar4;
                            i3 = i7;
                        }
                        arrayList11.add(p5.f1497b);
                        i24 += i3;
                        i7 = i3;
                        vVar4 = vVar3;
                    } else {
                        vVar2 = vVar4;
                    }
                }
            }
            z3 = z3 || c0037a4.f1524g;
            i6++;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            vVar4 = vVar2;
        }
    }
}
