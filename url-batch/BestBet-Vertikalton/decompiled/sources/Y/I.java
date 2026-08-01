package Y;

import G1.AbstractC0001b;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.EnumC0072m;
import com.fortunequest.neontrack.R;
import d0.C0092a;
import g.AbstractActivityC0128i;
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
import u0.C0365d;
import u0.C0372k;
import u0.C0385x;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: A, reason: collision with root package name */
    public C0365d f1290A;

    /* renamed from: B, reason: collision with root package name */
    public C0365d f1291B;

    /* renamed from: C, reason: collision with root package name */
    public ArrayDeque f1292C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1293D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1294E;
    public boolean F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f1295G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f1296H;

    /* renamed from: I, reason: collision with root package name */
    public ArrayList f1297I;

    /* renamed from: J, reason: collision with root package name */
    public ArrayList f1298J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList f1299K;

    /* renamed from: L, reason: collision with root package name */
    public L f1300L;

    /* renamed from: M, reason: collision with root package name */
    public final C0.i f1301M;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1303b;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f1305e;

    /* renamed from: g, reason: collision with root package name */
    public a.x f1307g;

    /* renamed from: l, reason: collision with root package name */
    public final C0385x f1310l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f1311m;

    /* renamed from: n, reason: collision with root package name */
    public final y f1312n;

    /* renamed from: o, reason: collision with root package name */
    public final y f1313o;

    /* renamed from: p, reason: collision with root package name */
    public final y f1314p;

    /* renamed from: q, reason: collision with root package name */
    public final y f1315q;

    /* renamed from: r, reason: collision with root package name */
    public final B f1316r;

    /* renamed from: s, reason: collision with root package name */
    public int f1317s;

    /* renamed from: t, reason: collision with root package name */
    public C0053u f1318t;

    /* renamed from: u, reason: collision with root package name */
    public H1.l f1319u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractComponentCallbacksC0050q f1320v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractComponentCallbacksC0050q f1321w;

    /* renamed from: x, reason: collision with root package name */
    public final C f1322x;

    /* renamed from: y, reason: collision with root package name */
    public final R0.e f1323y;

    /* renamed from: z, reason: collision with root package name */
    public C0365d f1324z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1302a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final T0.m f1304c = new T0.m(3);

    /* renamed from: f, reason: collision with root package name */
    public final x f1306f = new x(this);
    public final A h = new A(this);
    public final AtomicInteger i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map f1308j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map f1309k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [Y.y] */
    /* JADX WARN: Type inference failed for: r0v13, types: [Y.y] */
    /* JADX WARN: Type inference failed for: r0v14, types: [Y.y] */
    /* JADX WARN: Type inference failed for: r0v15, types: [Y.y] */
    public I() {
        Collections.synchronizedMap(new HashMap());
        this.f1310l = new C0385x(this);
        this.f1311m = new CopyOnWriteArrayList();
        final int i = 0;
        this.f1312n = new J.a(this) { // from class: Y.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1500b;

            {
                this.f1500b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        I i2 = this.f1500b;
                        if (i2.G()) {
                            i2.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i3 = this.f1500b;
                        if (i3.G() && num.intValue() == 80) {
                            i3.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i4 = this.f1500b;
                        if (i4.G()) {
                            i4.m(fVar.f4623a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1500b;
                        if (i5.G()) {
                            i5.r(gVar.f4624a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f1313o = new J.a(this) { // from class: Y.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1500b;

            {
                this.f1500b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i2) {
                    case 0:
                        I i22 = this.f1500b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i3 = this.f1500b;
                        if (i3.G() && num.intValue() == 80) {
                            i3.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i4 = this.f1500b;
                        if (i4.G()) {
                            i4.m(fVar.f4623a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1500b;
                        if (i5.G()) {
                            i5.r(gVar.f4624a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.f1314p = new J.a(this) { // from class: Y.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1500b;

            {
                this.f1500b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i3) {
                    case 0:
                        I i22 = this.f1500b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i32 = this.f1500b;
                        if (i32.G() && num.intValue() == 80) {
                            i32.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i4 = this.f1500b;
                        if (i4.G()) {
                            i4.m(fVar.f4623a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1500b;
                        if (i5.G()) {
                            i5.r(gVar.f4624a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.f1315q = new J.a(this) { // from class: Y.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1500b;

            {
                this.f1500b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i4) {
                    case 0:
                        I i22 = this.f1500b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i32 = this.f1500b;
                        if (i32.G() && num.intValue() == 80) {
                            i32.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i42 = this.f1500b;
                        if (i42.G()) {
                            i42.m(fVar.f4623a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1500b;
                        if (i5.G()) {
                            i5.r(gVar.f4624a, false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f1316r = new B(this);
        this.f1317s = -1;
        this.f1322x = new C(this);
        this.f1323y = new R0.e(14);
        this.f1292C = new ArrayDeque();
        this.f1301M = new C0.i(7, this);
    }

    public static boolean F(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        abstractComponentCallbacksC0050q.getClass();
        Iterator it = abstractComponentCallbacksC0050q.f1475t.f1304c.k().iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q2 = (AbstractComponentCallbacksC0050q) it.next();
            if (abstractComponentCallbacksC0050q2 != null) {
                z2 = F(abstractComponentCallbacksC0050q2);
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public static boolean H(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        if (abstractComponentCallbacksC0050q == null) {
            return true;
        }
        return abstractComponentCallbacksC0050q.f1443B && (abstractComponentCallbacksC0050q.f1473r == null || H(abstractComponentCallbacksC0050q.f1476u));
    }

    public static boolean I(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        if (abstractComponentCallbacksC0050q == null) {
            return true;
        }
        I i = abstractComponentCallbacksC0050q.f1473r;
        return abstractComponentCallbacksC0050q.equals(i.f1321w) && I(i.f1320v);
    }

    public static void X(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0050q);
        }
        if (abstractComponentCallbacksC0050q.f1480y) {
            abstractComponentCallbacksC0050q.f1480y = false;
            abstractComponentCallbacksC0050q.f1449I = !abstractComponentCallbacksC0050q.f1449I;
        }
    }

    public final AbstractComponentCallbacksC0050q A(int i) {
        T0.m mVar = this.f1304c;
        ArrayList arrayList = (ArrayList) mVar.f1073a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = (AbstractComponentCallbacksC0050q) arrayList.get(size);
            if (abstractComponentCallbacksC0050q != null && abstractComponentCallbacksC0050q.f1477v == i) {
                return abstractComponentCallbacksC0050q;
            }
        }
        for (O o2 : ((HashMap) mVar.f1074b).values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q2 = o2.f1349c;
                if (abstractComponentCallbacksC0050q2.f1477v == i) {
                    return abstractComponentCallbacksC0050q2;
                }
            }
        }
        return null;
    }

    public final ViewGroup B(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        ViewGroup viewGroup = abstractComponentCallbacksC0050q.f1445D;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0050q.f1478w > 0 && this.f1319u.W()) {
            View V2 = this.f1319u.V(abstractComponentCallbacksC0050q.f1478w);
            if (V2 instanceof ViewGroup) {
                return (ViewGroup) V2;
            }
        }
        return null;
    }

    public final C C() {
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1320v;
        return abstractComponentCallbacksC0050q != null ? abstractComponentCallbacksC0050q.f1473r.C() : this.f1322x;
    }

    public final R0.e D() {
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1320v;
        return abstractComponentCallbacksC0050q != null ? abstractComponentCallbacksC0050q.f1473r.D() : this.f1323y;
    }

    public final void E(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0050q);
        }
        if (abstractComponentCallbacksC0050q.f1480y) {
            return;
        }
        abstractComponentCallbacksC0050q.f1480y = true;
        abstractComponentCallbacksC0050q.f1449I = true ^ abstractComponentCallbacksC0050q.f1449I;
        W(abstractComponentCallbacksC0050q);
    }

    public final boolean G() {
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1320v;
        if (abstractComponentCallbacksC0050q == null) {
            return true;
        }
        return abstractComponentCallbacksC0050q.m() && this.f1320v.j().G();
    }

    public final void J(int i, boolean z2) {
        HashMap hashMap;
        C0053u c0053u;
        if (this.f1318t == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i != this.f1317s) {
            this.f1317s = i;
            T0.m mVar = this.f1304c;
            Iterator it = ((ArrayList) mVar.f1073a).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = (HashMap) mVar.f1074b;
                if (!hasNext) {
                    break;
                }
                O o2 = (O) hashMap.get(((AbstractComponentCallbacksC0050q) it.next()).f1462e);
                if (o2 != null) {
                    o2.k();
                }
            }
            for (O o3 : hashMap.values()) {
                if (o3 != null) {
                    o3.k();
                    AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = o3.f1349c;
                    if (abstractComponentCallbacksC0050q.f1467l && !abstractComponentCallbacksC0050q.o()) {
                        mVar.q(o3);
                    }
                }
            }
            Y();
            if (this.f1293D && (c0053u = this.f1318t) != null && this.f1317s == 7) {
                c0053u.f1491e.invalidateOptionsMenu();
                this.f1293D = false;
            }
        }
    }

    public final void K() {
        if (this.f1318t == null) {
            return;
        }
        this.f1294E = false;
        this.F = false;
        this.f1300L.f1336g = false;
        for (AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q : this.f1304c.l()) {
            if (abstractComponentCallbacksC0050q != null) {
                abstractComponentCallbacksC0050q.f1475t.K();
            }
        }
    }

    public final boolean L() {
        return M(-1, 0);
    }

    public final boolean M(int i, int i2) {
        y(false);
        x(true);
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1321w;
        if (abstractComponentCallbacksC0050q != null && i < 0 && abstractComponentCallbacksC0050q.g().L()) {
            return true;
        }
        boolean N2 = N(this.f1297I, this.f1298J, i, i2);
        if (N2) {
            this.f1303b = true;
            try {
                P(this.f1297I, this.f1298J);
            } finally {
                d();
            }
        }
        a0();
        u();
        ((HashMap) this.f1304c.f1074b).values().removeAll(Collections.singleton(null));
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
                    C0034a c0034a = (C0034a) this.d.get(size);
                    if (i >= 0 && i == c0034a.f1385r) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z2) {
                        while (size > 0) {
                            C0034a c0034a2 = (C0034a) this.d.get(size - 1);
                            if (i < 0 || i != c0034a2.f1385r) {
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
            arrayList.add((C0034a) this.d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void O(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0050q + " nesting=" + abstractComponentCallbacksC0050q.f1472q);
        }
        boolean o2 = abstractComponentCallbacksC0050q.o();
        if (abstractComponentCallbacksC0050q.f1481z && o2) {
            return;
        }
        T0.m mVar = this.f1304c;
        synchronized (((ArrayList) mVar.f1073a)) {
            ((ArrayList) mVar.f1073a).remove(abstractComponentCallbacksC0050q);
        }
        abstractComponentCallbacksC0050q.f1466k = false;
        if (F(abstractComponentCallbacksC0050q)) {
            this.f1293D = true;
        }
        abstractComponentCallbacksC0050q.f1467l = true;
        W(abstractComponentCallbacksC0050q);
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
            if (!((C0034a) arrayList.get(i)).f1382o) {
                if (i2 != i) {
                    z(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0034a) arrayList.get(i2)).f1382o) {
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
        C0385x c0385x;
        int i2;
        O o2;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f1318t.f1489b.getClassLoader());
                this.f1309k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f1318t.f1489b.getClassLoader());
                arrayList.add((N) bundle.getParcelable("state"));
            }
        }
        T0.m mVar = this.f1304c;
        HashMap hashMap = (HashMap) mVar.f1075c;
        hashMap.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            N n2 = (N) it.next();
            hashMap.put(n2.f1338b, n2);
        }
        J j2 = (J) bundle3.getParcelable("state");
        if (j2 == null) {
            return;
        }
        HashMap hashMap2 = (HashMap) mVar.f1074b;
        hashMap2.clear();
        Iterator it2 = j2.f1325a.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            i = 2;
            c0385x = this.f1310l;
            if (!hasNext) {
                break;
            }
            N n3 = (N) ((HashMap) mVar.f1075c).remove((String) it2.next());
            if (n3 != null) {
                AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = (AbstractComponentCallbacksC0050q) this.f1300L.f1332b.get(n3.f1338b);
                if (abstractComponentCallbacksC0050q != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0050q);
                    }
                    o2 = new O(c0385x, mVar, abstractComponentCallbacksC0050q, n3);
                } else {
                    o2 = new O(this.f1310l, this.f1304c, this.f1318t.f1489b.getClassLoader(), C(), n3);
                }
                AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q2 = o2.f1349c;
                abstractComponentCallbacksC0050q2.f1473r = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0050q2.f1462e + "): " + abstractComponentCallbacksC0050q2);
                }
                o2.m(this.f1318t.f1489b.getClassLoader());
                mVar.p(o2);
                o2.f1350e = this.f1317s;
            }
        }
        L l2 = this.f1300L;
        l2.getClass();
        Iterator it3 = new ArrayList(l2.f1332b.values()).iterator();
        while (it3.hasNext()) {
            AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q3 = (AbstractComponentCallbacksC0050q) it3.next();
            if (hashMap2.get(abstractComponentCallbacksC0050q3.f1462e) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0050q3 + " that was not found in the set of active Fragments " + j2.f1325a);
                }
                this.f1300L.e(abstractComponentCallbacksC0050q3);
                abstractComponentCallbacksC0050q3.f1473r = this;
                O o3 = new O(c0385x, mVar, abstractComponentCallbacksC0050q3);
                o3.f1350e = 1;
                o3.k();
                abstractComponentCallbacksC0050q3.f1467l = true;
                o3.k();
            }
        }
        ArrayList<String> arrayList2 = j2.f1326b;
        ((ArrayList) mVar.f1073a).clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                AbstractComponentCallbacksC0050q e2 = mVar.e(str3);
                if (e2 == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str3 + ")");
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + e2);
                }
                mVar.a(e2);
            }
        }
        if (j2.f1327c != null) {
            this.d = new ArrayList(j2.f1327c.length);
            int i3 = 0;
            while (true) {
                C0035b[] c0035bArr = j2.f1327c;
                if (i3 >= c0035bArr.length) {
                    break;
                }
                C0035b c0035b = c0035bArr[i3];
                c0035b.getClass();
                C0034a c0034a = new C0034a(this);
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    int[] iArr = c0035b.f1386a;
                    if (i4 >= iArr.length) {
                        break;
                    }
                    P p2 = new P();
                    int i6 = i4 + 1;
                    p2.f1351a = iArr[i4];
                    if (Log.isLoggable("FragmentManager", i)) {
                        Log.v("FragmentManager", "Instantiate " + c0034a + " op #" + i5 + " base fragment #" + iArr[i6]);
                    }
                    p2.h = EnumC0072m.values()[c0035b.f1388c[i5]];
                    p2.i = EnumC0072m.values()[c0035b.d[i5]];
                    int i7 = i4 + 2;
                    p2.f1353c = iArr[i6] != 0;
                    int i8 = iArr[i7];
                    p2.d = i8;
                    int i9 = iArr[i4 + 3];
                    p2.f1354e = i9;
                    int i10 = i4 + 5;
                    int i11 = iArr[i4 + 4];
                    p2.f1355f = i11;
                    i4 += 6;
                    int i12 = iArr[i10];
                    p2.f1356g = i12;
                    c0034a.f1372b = i8;
                    c0034a.f1373c = i9;
                    c0034a.d = i11;
                    c0034a.f1374e = i12;
                    c0034a.b(p2);
                    i5++;
                    i = 2;
                }
                c0034a.f1375f = c0035b.f1389e;
                c0034a.h = c0035b.f1390f;
                c0034a.f1376g = true;
                c0034a.i = c0035b.h;
                c0034a.f1377j = c0035b.i;
                c0034a.f1378k = c0035b.f1392j;
                c0034a.f1379l = c0035b.f1393k;
                c0034a.f1380m = c0035b.f1394l;
                c0034a.f1381n = c0035b.f1395m;
                c0034a.f1382o = c0035b.f1396n;
                c0034a.f1385r = c0035b.f1391g;
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = c0035b.f1387b;
                    if (i13 >= arrayList3.size()) {
                        break;
                    }
                    String str4 = (String) arrayList3.get(i13);
                    if (str4 != null) {
                        ((P) c0034a.f1371a.get(i13)).f1352b = mVar.e(str4);
                    }
                    i13++;
                }
                c0034a.c(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i3 + " (index " + c0034a.f1385r + "): " + c0034a);
                    PrintWriter printWriter = new PrintWriter(new S());
                    c0034a.d("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(c0034a);
                i3++;
                i = 2;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.d = null;
        }
        this.i.set(j2.d);
        String str5 = j2.f1328e;
        if (str5 != null) {
            AbstractComponentCallbacksC0050q e3 = mVar.e(str5);
            this.f1321w = e3;
            q(e3);
        }
        ArrayList arrayList4 = j2.f1329f;
        if (arrayList4 != null) {
            for (int i14 = i2; i14 < arrayList4.size(); i14++) {
                this.f1308j.put((String) arrayList4.get(i14), (C0036c) j2.f1330g.get(i14));
            }
        }
        this.f1292C = new ArrayDeque(j2.h);
    }

    public final Bundle R() {
        int i;
        ArrayList arrayList;
        C0035b[] c0035bArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0042i c0042i = (C0042i) it.next();
            if (c0042i.f1413e) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0042i.f1413e = false;
                c0042i.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((C0042i) it2.next()).e();
        }
        y(true);
        this.f1294E = true;
        this.f1300L.f1336g = true;
        T0.m mVar = this.f1304c;
        mVar.getClass();
        HashMap hashMap = (HashMap) mVar.f1074b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (O o2 : hashMap.values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = o2.f1349c;
                N n2 = new N(abstractComponentCallbacksC0050q);
                if (abstractComponentCallbacksC0050q.f1459a <= -1 || n2.f1346m != null) {
                    n2.f1346m = abstractComponentCallbacksC0050q.f1460b;
                } else {
                    Bundle bundle2 = new Bundle();
                    abstractComponentCallbacksC0050q.x(bundle2);
                    abstractComponentCallbacksC0050q.f1456P.c(bundle2);
                    bundle2.putParcelable("android:support:fragments", abstractComponentCallbacksC0050q.f1475t.R());
                    o2.f1347a.o(false);
                    if (bundle2.isEmpty()) {
                        bundle2 = null;
                    }
                    if (abstractComponentCallbacksC0050q.f1446E != null) {
                        o2.o();
                    }
                    if (abstractComponentCallbacksC0050q.f1461c != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putSparseParcelableArray("android:view_state", abstractComponentCallbacksC0050q.f1461c);
                    }
                    if (abstractComponentCallbacksC0050q.d != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBundle("android:view_registry_state", abstractComponentCallbacksC0050q.d);
                    }
                    if (!abstractComponentCallbacksC0050q.f1447G) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBoolean("android:user_visible_hint", abstractComponentCallbacksC0050q.f1447G);
                    }
                    n2.f1346m = bundle2;
                    if (abstractComponentCallbacksC0050q.h != null) {
                        if (bundle2 == null) {
                            n2.f1346m = new Bundle();
                        }
                        n2.f1346m.putString("android:target_state", abstractComponentCallbacksC0050q.h);
                        int i2 = abstractComponentCallbacksC0050q.i;
                        if (i2 != 0) {
                            n2.f1346m.putInt("android:target_req_state", i2);
                        }
                    }
                }
                AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q2 = o2.f1349c;
                arrayList2.add(abstractComponentCallbacksC0050q2.f1462e);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0050q2 + ": " + abstractComponentCallbacksC0050q2.f1460b);
                }
            }
        }
        T0.m mVar2 = this.f1304c;
        mVar2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) mVar2.f1075c).values());
        if (!arrayList3.isEmpty()) {
            T0.m mVar3 = this.f1304c;
            synchronized (((ArrayList) mVar3.f1073a)) {
                try {
                    if (((ArrayList) mVar3.f1073a).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) mVar3.f1073a).size());
                        Iterator it3 = ((ArrayList) mVar3.f1073a).iterator();
                        while (it3.hasNext()) {
                            AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q3 = (AbstractComponentCallbacksC0050q) it3.next();
                            arrayList.add(abstractComponentCallbacksC0050q3.f1462e);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0050q3.f1462e + "): " + abstractComponentCallbacksC0050q3);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList4 = this.d;
            if (arrayList4 == null || (size = arrayList4.size()) <= 0) {
                c0035bArr = null;
            } else {
                c0035bArr = new C0035b[size];
                for (i = 0; i < size; i++) {
                    c0035bArr[i] = new C0035b((C0034a) this.d.get(i));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.d.get(i));
                    }
                }
            }
            J j2 = new J();
            j2.f1328e = null;
            ArrayList arrayList5 = new ArrayList();
            j2.f1329f = arrayList5;
            ArrayList arrayList6 = new ArrayList();
            j2.f1330g = arrayList6;
            j2.f1325a = arrayList2;
            j2.f1326b = arrayList;
            j2.f1327c = c0035bArr;
            j2.d = this.i.get();
            AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q4 = this.f1321w;
            if (abstractComponentCallbacksC0050q4 != null) {
                j2.f1328e = abstractComponentCallbacksC0050q4.f1462e;
            }
            arrayList5.addAll(this.f1308j.keySet());
            arrayList6.addAll(this.f1308j.values());
            j2.h = new ArrayList(this.f1292C);
            bundle.putParcelable("state", j2);
            for (String str : this.f1309k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f1309k.get(str));
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                N n3 = (N) it4.next();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("state", n3);
                bundle.putBundle("fragment_" + n3.f1338b, bundle3);
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public final void S() {
        synchronized (this.f1302a) {
            try {
                if (this.f1302a.size() == 1) {
                    this.f1318t.f1490c.removeCallbacks(this.f1301M);
                    this.f1318t.f1490c.post(this.f1301M);
                    a0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void T(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q, boolean z2) {
        ViewGroup B2 = B(abstractComponentCallbacksC0050q);
        if (B2 == null || !(B2 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) B2).setDrawDisappearingViewsLast(!z2);
    }

    public final void U(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q, EnumC0072m enumC0072m) {
        if (abstractComponentCallbacksC0050q.equals(this.f1304c.e(abstractComponentCallbacksC0050q.f1462e)) && (abstractComponentCallbacksC0050q.f1474s == null || abstractComponentCallbacksC0050q.f1473r == this)) {
            abstractComponentCallbacksC0050q.f1452L = enumC0072m;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0050q + " is not an active fragment of FragmentManager " + this);
    }

    public final void V(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        if (abstractComponentCallbacksC0050q != null) {
            if (!abstractComponentCallbacksC0050q.equals(this.f1304c.e(abstractComponentCallbacksC0050q.f1462e)) || (abstractComponentCallbacksC0050q.f1474s != null && abstractComponentCallbacksC0050q.f1473r != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0050q + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q2 = this.f1321w;
        this.f1321w = abstractComponentCallbacksC0050q;
        q(abstractComponentCallbacksC0050q2);
        q(this.f1321w);
    }

    public final void W(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        ViewGroup B2 = B(abstractComponentCallbacksC0050q);
        if (B2 != null) {
            C0049p c0049p = abstractComponentCallbacksC0050q.f1448H;
            if ((c0049p == null ? 0 : c0049p.f1436e) + (c0049p == null ? 0 : c0049p.d) + (c0049p == null ? 0 : c0049p.f1435c) + (c0049p == null ? 0 : c0049p.f1434b) > 0) {
                if (B2.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    B2.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0050q);
                }
                AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q2 = (AbstractComponentCallbacksC0050q) B2.getTag(R.id.visible_removing_fragment_view_tag);
                C0049p c0049p2 = abstractComponentCallbacksC0050q.f1448H;
                boolean z2 = c0049p2 != null ? c0049p2.f1433a : false;
                if (abstractComponentCallbacksC0050q2.f1448H == null) {
                    return;
                }
                abstractComponentCallbacksC0050q2.f().f1433a = z2;
            }
        }
    }

    public final void Y() {
        Iterator it = this.f1304c.i().iterator();
        while (it.hasNext()) {
            O o2 = (O) it.next();
            AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = o2.f1349c;
            if (abstractComponentCallbacksC0050q.F) {
                if (this.f1303b) {
                    this.f1296H = true;
                } else {
                    abstractComponentCallbacksC0050q.F = false;
                    o2.k();
                }
            }
        }
    }

    public final void Z(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new S());
        C0053u c0053u = this.f1318t;
        if (c0053u == null) {
            try {
                v("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
                throw illegalStateException;
            }
        }
        try {
            c0053u.f1491e.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw illegalStateException;
        }
    }

    public final O a(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        String str = abstractComponentCallbacksC0050q.f1451K;
        if (str != null) {
            Z.d.c(abstractComponentCallbacksC0050q, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0050q);
        }
        O f2 = f(abstractComponentCallbacksC0050q);
        abstractComponentCallbacksC0050q.f1473r = this;
        T0.m mVar = this.f1304c;
        mVar.p(f2);
        if (!abstractComponentCallbacksC0050q.f1481z) {
            mVar.a(abstractComponentCallbacksC0050q);
            abstractComponentCallbacksC0050q.f1467l = false;
            if (abstractComponentCallbacksC0050q.f1446E == null) {
                abstractComponentCallbacksC0050q.f1449I = false;
            }
            if (F(abstractComponentCallbacksC0050q)) {
                this.f1293D = true;
            }
        }
        return f2;
    }

    public final void a0() {
        synchronized (this.f1302a) {
            try {
                if (!this.f1302a.isEmpty()) {
                    A a2 = this.h;
                    a2.f1279a = true;
                    a.w wVar = a2.f1281c;
                    if (wVar != null) {
                        wVar.c();
                    }
                    return;
                }
                A a3 = this.h;
                ArrayList arrayList = this.d;
                a3.f1279a = (arrayList != null ? arrayList.size() : 0) > 0 && I(this.f1320v);
                a.w wVar2 = a3.f1281c;
                if (wVar2 != null) {
                    wVar2.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(C0053u c0053u, H1.l lVar, AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        String str;
        if (this.f1318t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f1318t = c0053u;
        this.f1319u = lVar;
        this.f1320v = abstractComponentCallbacksC0050q;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1311m;
        if (abstractComponentCallbacksC0050q != 0) {
            copyOnWriteArrayList.add(new D(abstractComponentCallbacksC0050q));
        } else if (c0053u != null) {
            copyOnWriteArrayList.add(c0053u);
        }
        if (this.f1320v != null) {
            a0();
        }
        if (c0053u != null) {
            a.x i = c0053u.f1491e.i();
            this.f1307g = i;
            C0053u c0053u2 = abstractComponentCallbacksC0050q != 0 ? abstractComponentCallbacksC0050q : c0053u;
            i.getClass();
            A a2 = this.h;
            k1.e.e(a2, "onBackPressedCallback");
            androidx.lifecycle.v e2 = c0053u2.e();
            if (e2.d != EnumC0072m.f1884a) {
                a2.f1280b.add(new a.u(i, e2, a2));
                i.d();
                a2.f1281c = new a.w(0, i, a.x.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
            }
        }
        if (abstractComponentCallbacksC0050q != 0) {
            L l2 = abstractComponentCallbacksC0050q.f1473r.f1300L;
            HashMap hashMap = l2.f1333c;
            L l3 = (L) hashMap.get(abstractComponentCallbacksC0050q.f1462e);
            if (l3 == null) {
                l3 = new L(l2.f1334e);
                hashMap.put(abstractComponentCallbacksC0050q.f1462e, l3);
            }
            this.f1300L = l3;
        } else if (c0053u != null) {
            this.f1300L = (L) new A0.c(c0053u.f1491e.c(), L.h).r(L.class);
        } else {
            this.f1300L = new L(false);
        }
        L l4 = this.f1300L;
        l4.f1336g = this.f1294E || this.F;
        this.f1304c.d = l4;
        C0053u c0053u3 = this.f1318t;
        if (c0053u3 != null && abstractComponentCallbacksC0050q == 0) {
            j0.d b2 = c0053u3.b();
            b2.e("android:support:fragments", new r(2, this));
            Bundle c2 = b2.c("android:support:fragments");
            if (c2 != null) {
                Q(c2);
            }
        }
        C0053u c0053u4 = this.f1318t;
        if (c0053u4 != null) {
            AbstractActivityC0128i abstractActivityC0128i = c0053u4.f1491e;
            if (abstractComponentCallbacksC0050q != 0) {
                str = abstractComponentCallbacksC0050q.f1462e + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            String g2 = AbstractC0001b.g(str2, "StartActivityForResult");
            E e3 = new E(2);
            z zVar = new z(this, 1);
            a.j jVar = abstractActivityC0128i.h;
            this.f1324z = jVar.b(g2, e3, zVar);
            this.f1290A = jVar.b(AbstractC0001b.g(str2, "StartIntentSenderForResult"), new E(0), new z(this, 2));
            this.f1291B = jVar.b(AbstractC0001b.g(str2, "RequestPermissions"), new E(1), new z(this, 0));
        }
        C0053u c0053u5 = this.f1318t;
        if (c0053u5 != null) {
            c0053u5.f1491e.g(this.f1312n);
        }
        C0053u c0053u6 = this.f1318t;
        if (c0053u6 != null) {
            AbstractActivityC0128i abstractActivityC0128i2 = c0053u6.f1491e;
            y yVar = this.f1313o;
            abstractActivityC0128i2.getClass();
            k1.e.e(yVar, "listener");
            abstractActivityC0128i2.f1585j.add(yVar);
        }
        C0053u c0053u7 = this.f1318t;
        if (c0053u7 != null) {
            AbstractActivityC0128i abstractActivityC0128i3 = c0053u7.f1491e;
            y yVar2 = this.f1314p;
            abstractActivityC0128i3.getClass();
            k1.e.e(yVar2, "listener");
            abstractActivityC0128i3.f1587l.add(yVar2);
        }
        C0053u c0053u8 = this.f1318t;
        if (c0053u8 != null) {
            AbstractActivityC0128i abstractActivityC0128i4 = c0053u8.f1491e;
            y yVar3 = this.f1315q;
            abstractActivityC0128i4.getClass();
            k1.e.e(yVar3, "listener");
            abstractActivityC0128i4.f1588m.add(yVar3);
        }
        C0053u c0053u9 = this.f1318t;
        if (c0053u9 == null || abstractComponentCallbacksC0050q != 0) {
            return;
        }
        AbstractActivityC0128i abstractActivityC0128i5 = c0053u9.f1491e;
        B b3 = this.f1316r;
        abstractActivityC0128i5.getClass();
        k1.e.e(b3, "provider");
        C0372k c0372k = abstractActivityC0128i5.f1581c;
        ((CopyOnWriteArrayList) c0372k.f4191b).add(b3);
        ((Runnable) c0372k.f4190a).run();
    }

    public final void c(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0050q);
        }
        if (abstractComponentCallbacksC0050q.f1481z) {
            abstractComponentCallbacksC0050q.f1481z = false;
            if (abstractComponentCallbacksC0050q.f1466k) {
                return;
            }
            this.f1304c.a(abstractComponentCallbacksC0050q);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0050q);
            }
            if (F(abstractComponentCallbacksC0050q)) {
                this.f1293D = true;
            }
        }
    }

    public final void d() {
        this.f1303b = false;
        this.f1298J.clear();
        this.f1297I.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f1304c.i().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((O) it.next()).f1349c.f1445D;
            if (viewGroup != null) {
                hashSet.add(C0042i.f(viewGroup, D()));
            }
        }
        return hashSet;
    }

    public final O f(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        String str = abstractComponentCallbacksC0050q.f1462e;
        T0.m mVar = this.f1304c;
        O o2 = (O) ((HashMap) mVar.f1074b).get(str);
        if (o2 != null) {
            return o2;
        }
        O o3 = new O(this.f1310l, mVar, abstractComponentCallbacksC0050q);
        o3.m(this.f1318t.f1489b.getClassLoader());
        o3.f1350e = this.f1317s;
        return o3;
    }

    public final void g(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0050q);
        }
        if (abstractComponentCallbacksC0050q.f1481z) {
            return;
        }
        abstractComponentCallbacksC0050q.f1481z = true;
        if (abstractComponentCallbacksC0050q.f1466k) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0050q);
            }
            T0.m mVar = this.f1304c;
            synchronized (((ArrayList) mVar.f1073a)) {
                ((ArrayList) mVar.f1073a).remove(abstractComponentCallbacksC0050q);
            }
            abstractComponentCallbacksC0050q.f1466k = false;
            if (F(abstractComponentCallbacksC0050q)) {
                this.f1293D = true;
            }
            W(abstractComponentCallbacksC0050q);
        }
    }

    public final void h(boolean z2) {
        if (z2 && this.f1318t != null) {
            Z(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q : this.f1304c.l()) {
            if (abstractComponentCallbacksC0050q != null) {
                abstractComponentCallbacksC0050q.f1444C = true;
                if (z2) {
                    abstractComponentCallbacksC0050q.f1475t.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.f1317s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q : this.f1304c.l()) {
            if (abstractComponentCallbacksC0050q != null) {
                if (!abstractComponentCallbacksC0050q.f1480y ? abstractComponentCallbacksC0050q.f1475t.i() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.f1317s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q : this.f1304c.l()) {
            if (abstractComponentCallbacksC0050q != null && H(abstractComponentCallbacksC0050q)) {
                if (!abstractComponentCallbacksC0050q.f1480y ? abstractComponentCallbacksC0050q.f1475t.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0050q);
                    z2 = true;
                }
            }
        }
        if (this.f1305e != null) {
            for (int i = 0; i < this.f1305e.size(); i++) {
                AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q2 = (AbstractComponentCallbacksC0050q) this.f1305e.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0050q2)) {
                    abstractComponentCallbacksC0050q2.getClass();
                }
            }
        }
        this.f1305e = arrayList;
        return z2;
    }

    public final void k() {
        boolean z2 = true;
        this.f1295G = true;
        y(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0042i) it.next()).e();
        }
        C0053u c0053u = this.f1318t;
        T0.m mVar = this.f1304c;
        if (c0053u != null) {
            z2 = ((L) mVar.d).f1335f;
        } else {
            AbstractActivityC0128i abstractActivityC0128i = c0053u.f1489b;
            if (abstractActivityC0128i != null) {
                z2 = true ^ abstractActivityC0128i.isChangingConfigurations();
            }
        }
        if (z2) {
            Iterator it2 = this.f1308j.values().iterator();
            while (it2.hasNext()) {
                for (String str : ((C0036c) it2.next()).f1397a) {
                    L l2 = (L) mVar.d;
                    l2.getClass();
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    l2.d(str);
                }
            }
        }
        t(-1);
        C0053u c0053u2 = this.f1318t;
        if (c0053u2 != null) {
            AbstractActivityC0128i abstractActivityC0128i2 = c0053u2.f1491e;
            y yVar = this.f1313o;
            abstractActivityC0128i2.getClass();
            k1.e.e(yVar, "listener");
            abstractActivityC0128i2.f1585j.remove(yVar);
        }
        C0053u c0053u3 = this.f1318t;
        if (c0053u3 != null) {
            AbstractActivityC0128i abstractActivityC0128i3 = c0053u3.f1491e;
            y yVar2 = this.f1312n;
            abstractActivityC0128i3.getClass();
            k1.e.e(yVar2, "listener");
            abstractActivityC0128i3.i.remove(yVar2);
        }
        C0053u c0053u4 = this.f1318t;
        if (c0053u4 != null) {
            AbstractActivityC0128i abstractActivityC0128i4 = c0053u4.f1491e;
            y yVar3 = this.f1314p;
            abstractActivityC0128i4.getClass();
            k1.e.e(yVar3, "listener");
            abstractActivityC0128i4.f1587l.remove(yVar3);
        }
        C0053u c0053u5 = this.f1318t;
        if (c0053u5 != null) {
            AbstractActivityC0128i abstractActivityC0128i5 = c0053u5.f1491e;
            y yVar4 = this.f1315q;
            abstractActivityC0128i5.getClass();
            k1.e.e(yVar4, "listener");
            abstractActivityC0128i5.f1588m.remove(yVar4);
        }
        C0053u c0053u6 = this.f1318t;
        if (c0053u6 != null) {
            AbstractActivityC0128i abstractActivityC0128i6 = c0053u6.f1491e;
            B b2 = this.f1316r;
            abstractActivityC0128i6.getClass();
            k1.e.e(b2, "provider");
            C0372k c0372k = abstractActivityC0128i6.f1581c;
            ((CopyOnWriteArrayList) c0372k.f4191b).remove(b2);
            if (((HashMap) c0372k.f4192c).remove(b2) != null) {
                throw new ClassCastException();
            }
            ((Runnable) c0372k.f4190a).run();
        }
        this.f1318t = null;
        this.f1319u = null;
        this.f1320v = null;
        if (this.f1307g != null) {
            Iterator it3 = this.h.f1280b.iterator();
            while (it3.hasNext()) {
                ((a.c) it3.next()).cancel();
            }
            this.f1307g = null;
        }
        C0365d c0365d = this.f1324z;
        if (c0365d != null) {
            c0365d.i();
            this.f1290A.i();
            this.f1291B.i();
        }
    }

    public final void l(boolean z2) {
        if (z2 && this.f1318t != null) {
            Z(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q : this.f1304c.l()) {
            if (abstractComponentCallbacksC0050q != null) {
                abstractComponentCallbacksC0050q.f1444C = true;
                if (z2) {
                    abstractComponentCallbacksC0050q.f1475t.l(true);
                }
            }
        }
    }

    public final void m(boolean z2, boolean z3) {
        if (z3 && this.f1318t != null) {
            Z(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q : this.f1304c.l()) {
            if (abstractComponentCallbacksC0050q != null && z3) {
                abstractComponentCallbacksC0050q.f1475t.m(z2, true);
            }
        }
    }

    public final void n() {
        Iterator it = this.f1304c.k().iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = (AbstractComponentCallbacksC0050q) it.next();
            if (abstractComponentCallbacksC0050q != null) {
                abstractComponentCallbacksC0050q.n();
                abstractComponentCallbacksC0050q.f1475t.n();
            }
        }
    }

    public final boolean o() {
        if (this.f1317s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q : this.f1304c.l()) {
            if (abstractComponentCallbacksC0050q != null) {
                if (!abstractComponentCallbacksC0050q.f1480y ? abstractComponentCallbacksC0050q.f1475t.o() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f1317s < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q : this.f1304c.l()) {
            if (abstractComponentCallbacksC0050q != null && !abstractComponentCallbacksC0050q.f1480y) {
                abstractComponentCallbacksC0050q.f1475t.p();
            }
        }
    }

    public final void q(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        if (abstractComponentCallbacksC0050q != null) {
            if (abstractComponentCallbacksC0050q.equals(this.f1304c.e(abstractComponentCallbacksC0050q.f1462e))) {
                abstractComponentCallbacksC0050q.f1473r.getClass();
                boolean I2 = I(abstractComponentCallbacksC0050q);
                Boolean bool = abstractComponentCallbacksC0050q.f1465j;
                if (bool == null || bool.booleanValue() != I2) {
                    abstractComponentCallbacksC0050q.f1465j = Boolean.valueOf(I2);
                    I i = abstractComponentCallbacksC0050q.f1475t;
                    i.a0();
                    i.q(i.f1321w);
                }
            }
        }
    }

    public final void r(boolean z2, boolean z3) {
        if (z3 && this.f1318t != null) {
            Z(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q : this.f1304c.l()) {
            if (abstractComponentCallbacksC0050q != null && z3) {
                abstractComponentCallbacksC0050q.f1475t.r(z2, true);
            }
        }
    }

    public final boolean s() {
        if (this.f1317s < 1) {
            return false;
        }
        boolean z2 = false;
        for (AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q : this.f1304c.l()) {
            if (abstractComponentCallbacksC0050q != null && H(abstractComponentCallbacksC0050q)) {
                if (!abstractComponentCallbacksC0050q.f1480y ? abstractComponentCallbacksC0050q.f1475t.s() : false) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final void t(int i) {
        try {
            this.f1303b = true;
            for (O o2 : ((HashMap) this.f1304c.f1074b).values()) {
                if (o2 != null) {
                    o2.f1350e = i;
                }
            }
            J(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0042i) it.next()).e();
            }
            this.f1303b = false;
            y(true);
        } catch (Throwable th) {
            this.f1303b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1320v;
        if (abstractComponentCallbacksC0050q != null) {
            sb.append(abstractComponentCallbacksC0050q.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f1320v)));
            sb.append("}");
        } else {
            C0053u c0053u = this.f1318t;
            if (c0053u != null) {
                sb.append(c0053u.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f1318t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u() {
        if (this.f1296H) {
            this.f1296H = false;
            Y();
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String g2 = AbstractC0001b.g(str, "    ");
        T0.m mVar = this.f1304c;
        mVar.getClass();
        String str3 = str + "    ";
        HashMap hashMap = (HashMap) mVar.f1074b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (O o2 : hashMap.values()) {
                printWriter.print(str);
                if (o2 != null) {
                    AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = o2.f1349c;
                    printWriter.println(abstractComponentCallbacksC0050q);
                    abstractComponentCallbacksC0050q.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0050q.f1477v));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0050q.f1478w));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0050q.f1479x);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0050q.f1459a);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0050q.f1462e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0050q.f1472q);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0050q.f1466k);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0050q.f1467l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0050q.f1468m);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0050q.f1469n);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0050q.f1480y);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0050q.f1481z);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0050q.f1443B);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0050q.f1442A);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0050q.f1447G);
                    if (abstractComponentCallbacksC0050q.f1473r != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0050q.f1473r);
                    }
                    if (abstractComponentCallbacksC0050q.f1474s != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0050q.f1474s);
                    }
                    if (abstractComponentCallbacksC0050q.f1476u != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0050q.f1476u);
                    }
                    if (abstractComponentCallbacksC0050q.f1463f != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0050q.f1463f);
                    }
                    if (abstractComponentCallbacksC0050q.f1460b != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0050q.f1460b);
                    }
                    if (abstractComponentCallbacksC0050q.f1461c != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0050q.f1461c);
                    }
                    if (abstractComponentCallbacksC0050q.d != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0050q.d);
                    }
                    Object obj = abstractComponentCallbacksC0050q.f1464g;
                    if (obj == null) {
                        I i = abstractComponentCallbacksC0050q.f1473r;
                        obj = (i == null || (str2 = abstractComponentCallbacksC0050q.h) == null) ? null : i.f1304c.e(str2);
                    }
                    if (obj != null) {
                        printWriter.print(str3);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC0050q.i);
                    }
                    printWriter.print(str3);
                    printWriter.print("mPopDirection=");
                    C0049p c0049p = abstractComponentCallbacksC0050q.f1448H;
                    printWriter.println(c0049p == null ? false : c0049p.f1433a);
                    C0049p c0049p2 = abstractComponentCallbacksC0050q.f1448H;
                    if ((c0049p2 == null ? 0 : c0049p2.f1434b) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        C0049p c0049p3 = abstractComponentCallbacksC0050q.f1448H;
                        printWriter.println(c0049p3 == null ? 0 : c0049p3.f1434b);
                    }
                    C0049p c0049p4 = abstractComponentCallbacksC0050q.f1448H;
                    if ((c0049p4 == null ? 0 : c0049p4.f1435c) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        C0049p c0049p5 = abstractComponentCallbacksC0050q.f1448H;
                        printWriter.println(c0049p5 == null ? 0 : c0049p5.f1435c);
                    }
                    C0049p c0049p6 = abstractComponentCallbacksC0050q.f1448H;
                    if ((c0049p6 == null ? 0 : c0049p6.d) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        C0049p c0049p7 = abstractComponentCallbacksC0050q.f1448H;
                        printWriter.println(c0049p7 == null ? 0 : c0049p7.d);
                    }
                    C0049p c0049p8 = abstractComponentCallbacksC0050q.f1448H;
                    if ((c0049p8 == null ? 0 : c0049p8.f1436e) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        C0049p c0049p9 = abstractComponentCallbacksC0050q.f1448H;
                        printWriter.println(c0049p9 == null ? 0 : c0049p9.f1436e);
                    }
                    if (abstractComponentCallbacksC0050q.f1445D != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0050q.f1445D);
                    }
                    if (abstractComponentCallbacksC0050q.f1446E != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0050q.f1446E);
                    }
                    if (abstractComponentCallbacksC0050q.h() != null) {
                        o.l lVar = ((C0092a) new A0.c(abstractComponentCallbacksC0050q.c(), C0092a.f2470c).r(C0092a.class)).f2471b;
                        if (lVar.f3594c > 0) {
                            printWriter.print(str3);
                            printWriter.println("Loaders:");
                            if (lVar.f3594c > 0) {
                                if (lVar.f3593b[0] != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(str3);
                                printWriter.print("  #");
                                printWriter.print(lVar.f3592a[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + abstractComponentCallbacksC0050q.f1475t + ":");
                    abstractComponentCallbacksC0050q.f1475t.v(AbstractC0001b.g(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) mVar.f1073a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size3; i2++) {
                AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q2 = (AbstractComponentCallbacksC0050q) arrayList.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0050q2.toString());
            }
        }
        ArrayList arrayList2 = this.f1305e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q3 = (AbstractComponentCallbacksC0050q) this.f1305e.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0050q3.toString());
            }
        }
        ArrayList arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size; i4++) {
                C0034a c0034a = (C0034a) this.d.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(c0034a.toString());
                c0034a.d(g2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.f1302a) {
            try {
                int size4 = this.f1302a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i5 = 0; i5 < size4; i5++) {
                        Object obj2 = (G) this.f1302a.get(i5);
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
        printWriter.println(this.f1318t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1319u);
        if (this.f1320v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1320v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1317s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f1294E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f1295G);
        if (this.f1293D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f1293D);
        }
    }

    public final void w(G g2, boolean z2) {
        if (!z2) {
            if (this.f1318t == null) {
                if (!this.f1295G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f1294E || this.F) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1302a) {
            try {
                if (this.f1318t == null) {
                    if (!z2) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f1302a.add(g2);
                    S();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(boolean z2) {
        if (this.f1303b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f1318t == null) {
            if (!this.f1295G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f1318t.f1490c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2 && (this.f1294E || this.F)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f1297I == null) {
            this.f1297I = new ArrayList();
            this.f1298J = new ArrayList();
        }
    }

    public final boolean y(boolean z2) {
        boolean z3;
        x(z2);
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.f1297I;
            ArrayList arrayList2 = this.f1298J;
            synchronized (this.f1302a) {
                if (this.f1302a.isEmpty()) {
                    z3 = false;
                } else {
                    try {
                        int size = this.f1302a.size();
                        z3 = false;
                        for (int i = 0; i < size; i++) {
                            z3 |= ((G) this.f1302a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z3) {
                a0();
                u();
                ((HashMap) this.f1304c.f1074b).values().removeAll(Collections.singleton(null));
                return z4;
            }
            z4 = true;
            this.f1303b = true;
            try {
                P(this.f1297I, this.f1298J);
            } finally {
                d();
            }
        }
    }

    public final void z(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        T0.m mVar;
        T0.m mVar2;
        T0.m mVar3;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        boolean z2 = ((C0034a) arrayList3.get(i)).f1382o;
        ArrayList arrayList5 = this.f1299K;
        if (arrayList5 == null) {
            this.f1299K = new ArrayList();
        } else {
            arrayList5.clear();
        }
        ArrayList arrayList6 = this.f1299K;
        T0.m mVar4 = this.f1304c;
        arrayList6.addAll(mVar4.l());
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1321w;
        int i6 = i;
        boolean z3 = false;
        while (true) {
            int i7 = 1;
            if (i6 >= i2) {
                T0.m mVar5 = mVar4;
                this.f1299K.clear();
                if (!z2 && this.f1317s >= 1) {
                    for (int i8 = i; i8 < i2; i8++) {
                        Iterator it = ((C0034a) arrayList.get(i8)).f1371a.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q2 = ((P) it.next()).f1352b;
                            if (abstractComponentCallbacksC0050q2 == null || abstractComponentCallbacksC0050q2.f1473r == null) {
                                mVar = mVar5;
                            } else {
                                mVar = mVar5;
                                mVar.p(f(abstractComponentCallbacksC0050q2));
                            }
                            mVar5 = mVar;
                        }
                    }
                }
                for (int i9 = i; i9 < i2; i9++) {
                    C0034a c0034a = (C0034a) arrayList.get(i9);
                    if (((Boolean) arrayList2.get(i9)).booleanValue()) {
                        c0034a.c(-1);
                        ArrayList arrayList7 = c0034a.f1371a;
                        boolean z4 = true;
                        for (int size = arrayList7.size() - 1; size >= 0; size--) {
                            P p2 = (P) arrayList7.get(size);
                            AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q3 = p2.f1352b;
                            if (abstractComponentCallbacksC0050q3 != null) {
                                if (abstractComponentCallbacksC0050q3.f1448H != null) {
                                    abstractComponentCallbacksC0050q3.f().f1433a = z4;
                                }
                                int i10 = c0034a.f1375f;
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
                                if (abstractComponentCallbacksC0050q3.f1448H != null || i11 != 0) {
                                    abstractComponentCallbacksC0050q3.f();
                                    abstractComponentCallbacksC0050q3.f1448H.f1437f = i11;
                                }
                                abstractComponentCallbacksC0050q3.f();
                                abstractComponentCallbacksC0050q3.f1448H.getClass();
                            }
                            int i13 = p2.f1351a;
                            I i14 = c0034a.f1383p;
                            switch (i13) {
                                case 1:
                                    abstractComponentCallbacksC0050q3.E(p2.d, p2.f1354e, p2.f1355f, p2.f1356g);
                                    z4 = true;
                                    i14.T(abstractComponentCallbacksC0050q3, true);
                                    i14.O(abstractComponentCallbacksC0050q3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + p2.f1351a);
                                case 3:
                                    abstractComponentCallbacksC0050q3.E(p2.d, p2.f1354e, p2.f1355f, p2.f1356g);
                                    i14.a(abstractComponentCallbacksC0050q3);
                                    z4 = true;
                                case 4:
                                    abstractComponentCallbacksC0050q3.E(p2.d, p2.f1354e, p2.f1355f, p2.f1356g);
                                    i14.getClass();
                                    X(abstractComponentCallbacksC0050q3);
                                    z4 = true;
                                case 5:
                                    abstractComponentCallbacksC0050q3.E(p2.d, p2.f1354e, p2.f1355f, p2.f1356g);
                                    i14.T(abstractComponentCallbacksC0050q3, true);
                                    i14.E(abstractComponentCallbacksC0050q3);
                                    z4 = true;
                                case 6:
                                    abstractComponentCallbacksC0050q3.E(p2.d, p2.f1354e, p2.f1355f, p2.f1356g);
                                    i14.c(abstractComponentCallbacksC0050q3);
                                    z4 = true;
                                case 7:
                                    abstractComponentCallbacksC0050q3.E(p2.d, p2.f1354e, p2.f1355f, p2.f1356g);
                                    i14.T(abstractComponentCallbacksC0050q3, true);
                                    i14.g(abstractComponentCallbacksC0050q3);
                                    z4 = true;
                                case 8:
                                    i14.V(null);
                                    z4 = true;
                                case 9:
                                    i14.V(abstractComponentCallbacksC0050q3);
                                    z4 = true;
                                case 10:
                                    i14.U(abstractComponentCallbacksC0050q3, p2.h);
                                    z4 = true;
                            }
                        }
                    } else {
                        c0034a.c(1);
                        ArrayList arrayList8 = c0034a.f1371a;
                        int size2 = arrayList8.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            P p3 = (P) arrayList8.get(i15);
                            AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q4 = p3.f1352b;
                            if (abstractComponentCallbacksC0050q4 != null) {
                                if (abstractComponentCallbacksC0050q4.f1448H != null) {
                                    abstractComponentCallbacksC0050q4.f().f1433a = false;
                                }
                                int i16 = c0034a.f1375f;
                                if (abstractComponentCallbacksC0050q4.f1448H != null || i16 != 0) {
                                    abstractComponentCallbacksC0050q4.f();
                                    abstractComponentCallbacksC0050q4.f1448H.f1437f = i16;
                                }
                                abstractComponentCallbacksC0050q4.f();
                                abstractComponentCallbacksC0050q4.f1448H.getClass();
                            }
                            int i17 = p3.f1351a;
                            I i18 = c0034a.f1383p;
                            switch (i17) {
                                case 1:
                                    abstractComponentCallbacksC0050q4.E(p3.d, p3.f1354e, p3.f1355f, p3.f1356g);
                                    i18.T(abstractComponentCallbacksC0050q4, false);
                                    i18.a(abstractComponentCallbacksC0050q4);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + p3.f1351a);
                                case 3:
                                    abstractComponentCallbacksC0050q4.E(p3.d, p3.f1354e, p3.f1355f, p3.f1356g);
                                    i18.O(abstractComponentCallbacksC0050q4);
                                case 4:
                                    abstractComponentCallbacksC0050q4.E(p3.d, p3.f1354e, p3.f1355f, p3.f1356g);
                                    i18.E(abstractComponentCallbacksC0050q4);
                                case 5:
                                    abstractComponentCallbacksC0050q4.E(p3.d, p3.f1354e, p3.f1355f, p3.f1356g);
                                    i18.T(abstractComponentCallbacksC0050q4, false);
                                    X(abstractComponentCallbacksC0050q4);
                                case 6:
                                    abstractComponentCallbacksC0050q4.E(p3.d, p3.f1354e, p3.f1355f, p3.f1356g);
                                    i18.g(abstractComponentCallbacksC0050q4);
                                case 7:
                                    abstractComponentCallbacksC0050q4.E(p3.d, p3.f1354e, p3.f1355f, p3.f1356g);
                                    i18.T(abstractComponentCallbacksC0050q4, false);
                                    i18.c(abstractComponentCallbacksC0050q4);
                                case 8:
                                    i18.V(abstractComponentCallbacksC0050q4);
                                case 9:
                                    i18.V(null);
                                case 10:
                                    i18.U(abstractComponentCallbacksC0050q4, p3.i);
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i19 = i; i19 < i2; i19++) {
                    C0034a c0034a2 = (C0034a) arrayList.get(i19);
                    if (booleanValue) {
                        for (int size3 = c0034a2.f1371a.size() - 1; size3 >= 0; size3--) {
                            AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q5 = ((P) c0034a2.f1371a.get(size3)).f1352b;
                            if (abstractComponentCallbacksC0050q5 != null) {
                                f(abstractComponentCallbacksC0050q5).k();
                            }
                        }
                    } else {
                        Iterator it2 = c0034a2.f1371a.iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q6 = ((P) it2.next()).f1352b;
                            if (abstractComponentCallbacksC0050q6 != null) {
                                f(abstractComponentCallbacksC0050q6).k();
                            }
                        }
                    }
                }
                J(this.f1317s, true);
                HashSet hashSet = new HashSet();
                for (int i20 = i; i20 < i2; i20++) {
                    Iterator it3 = ((C0034a) arrayList.get(i20)).f1371a.iterator();
                    while (it3.hasNext()) {
                        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q7 = ((P) it3.next()).f1352b;
                        if (abstractComponentCallbacksC0050q7 != null && (viewGroup = abstractComponentCallbacksC0050q7.f1445D) != null) {
                            hashSet.add(C0042i.f(viewGroup, D()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    C0042i c0042i = (C0042i) it4.next();
                    c0042i.d = booleanValue;
                    synchronized (c0042i.f1411b) {
                        try {
                            c0042i.g();
                            c0042i.f1413e = false;
                            int size4 = c0042i.f1411b.size() - 1;
                            while (true) {
                                if (size4 >= 0) {
                                    U u2 = (U) c0042i.f1411b.get(size4);
                                    int c2 = AbstractC0001b.c(u2.f1367c.f1446E);
                                    if (u2.f1365a != 2 || c2 == 2) {
                                        size4--;
                                    } else {
                                        C0049p c0049p = u2.f1367c.f1448H;
                                        c0042i.f1413e = false;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    c0042i.c();
                }
                for (int i21 = i; i21 < i2; i21++) {
                    C0034a c0034a3 = (C0034a) arrayList.get(i21);
                    if (((Boolean) arrayList2.get(i21)).booleanValue() && c0034a3.f1385r >= 0) {
                        c0034a3.f1385r = -1;
                    }
                    c0034a3.getClass();
                }
                return;
            }
            C0034a c0034a4 = (C0034a) arrayList3.get(i6);
            if (((Boolean) arrayList4.get(i6)).booleanValue()) {
                mVar2 = mVar4;
                int i22 = 1;
                ArrayList arrayList9 = this.f1299K;
                ArrayList arrayList10 = c0034a4.f1371a;
                int size5 = arrayList10.size() - 1;
                while (size5 >= 0) {
                    P p4 = (P) arrayList10.get(size5);
                    int i23 = p4.f1351a;
                    if (i23 != i22) {
                        if (i23 != 3) {
                            switch (i23) {
                                case 8:
                                    abstractComponentCallbacksC0050q = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0050q = p4.f1352b;
                                    break;
                                case 10:
                                    p4.i = p4.h;
                                    break;
                            }
                            size5--;
                            i22 = 1;
                        }
                        arrayList9.add(p4.f1352b);
                        size5--;
                        i22 = 1;
                    }
                    arrayList9.remove(p4.f1352b);
                    size5--;
                    i22 = 1;
                }
            } else {
                ArrayList arrayList11 = this.f1299K;
                int i24 = 0;
                while (true) {
                    ArrayList arrayList12 = c0034a4.f1371a;
                    if (i24 < arrayList12.size()) {
                        P p5 = (P) arrayList12.get(i24);
                        int i25 = p5.f1351a;
                        if (i25 != i7) {
                            if (i25 != 2) {
                                if (i25 == 3 || i25 == 6) {
                                    arrayList11.remove(p5.f1352b);
                                    AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q8 = p5.f1352b;
                                    if (abstractComponentCallbacksC0050q8 == abstractComponentCallbacksC0050q) {
                                        arrayList12.add(i24, new P(9, abstractComponentCallbacksC0050q8));
                                        i24++;
                                        mVar3 = mVar4;
                                        i3 = 1;
                                        abstractComponentCallbacksC0050q = null;
                                    }
                                } else if (i25 == 7) {
                                    mVar3 = mVar4;
                                    i3 = 1;
                                } else if (i25 == 8) {
                                    arrayList12.add(i24, new P(9, abstractComponentCallbacksC0050q, 0));
                                    p5.f1353c = true;
                                    i24++;
                                    abstractComponentCallbacksC0050q = p5.f1352b;
                                }
                                mVar3 = mVar4;
                                i3 = 1;
                            } else {
                                AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q9 = p5.f1352b;
                                int i26 = abstractComponentCallbacksC0050q9.f1478w;
                                int size6 = arrayList11.size() - 1;
                                boolean z5 = false;
                                while (size6 >= 0) {
                                    T0.m mVar6 = mVar4;
                                    AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q10 = (AbstractComponentCallbacksC0050q) arrayList11.get(size6);
                                    if (abstractComponentCallbacksC0050q10.f1478w != i26) {
                                        i4 = i26;
                                    } else if (abstractComponentCallbacksC0050q10 == abstractComponentCallbacksC0050q9) {
                                        i4 = i26;
                                        z5 = true;
                                    } else {
                                        if (abstractComponentCallbacksC0050q10 == abstractComponentCallbacksC0050q) {
                                            i4 = i26;
                                            arrayList12.add(i24, new P(9, abstractComponentCallbacksC0050q10, 0));
                                            i24++;
                                            i5 = 0;
                                            abstractComponentCallbacksC0050q = null;
                                        } else {
                                            i4 = i26;
                                            i5 = 0;
                                        }
                                        P p6 = new P(3, abstractComponentCallbacksC0050q10, i5);
                                        p6.d = p5.d;
                                        p6.f1355f = p5.f1355f;
                                        p6.f1354e = p5.f1354e;
                                        p6.f1356g = p5.f1356g;
                                        arrayList12.add(i24, p6);
                                        arrayList11.remove(abstractComponentCallbacksC0050q10);
                                        i24++;
                                        abstractComponentCallbacksC0050q = abstractComponentCallbacksC0050q;
                                    }
                                    size6--;
                                    i26 = i4;
                                    mVar4 = mVar6;
                                }
                                mVar3 = mVar4;
                                i3 = 1;
                                if (z5) {
                                    arrayList12.remove(i24);
                                    i24--;
                                } else {
                                    p5.f1351a = 1;
                                    p5.f1353c = true;
                                    arrayList11.add(abstractComponentCallbacksC0050q9);
                                }
                            }
                            i24 += i3;
                            i7 = i3;
                            mVar4 = mVar3;
                        } else {
                            mVar3 = mVar4;
                            i3 = i7;
                        }
                        arrayList11.add(p5.f1352b);
                        i24 += i3;
                        i7 = i3;
                        mVar4 = mVar3;
                    } else {
                        mVar2 = mVar4;
                    }
                }
            }
            z3 = z3 || c0034a4.f1376g;
            i6++;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            mVar4 = mVar2;
        }
    }
}
