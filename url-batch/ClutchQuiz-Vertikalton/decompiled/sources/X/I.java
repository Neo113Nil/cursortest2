package X;

import K.C0012m;
import a.InterfaceC0056c;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.EnumC0072m;
import c0.C0086a;
import com.clutchquizarena.app.R;
import g.AbstractActivityC0136i;
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
    public B.j f937A;

    /* renamed from: B, reason: collision with root package name */
    public B.j f938B;

    /* renamed from: C, reason: collision with root package name */
    public ArrayDeque f939C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f940D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f941E;
    public boolean F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f942G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f943H;

    /* renamed from: I, reason: collision with root package name */
    public ArrayList f944I;

    /* renamed from: J, reason: collision with root package name */
    public ArrayList f945J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList f946K;

    /* renamed from: L, reason: collision with root package name */
    public L f947L;

    /* renamed from: M, reason: collision with root package name */
    public final Q.b f948M;

    /* renamed from: b, reason: collision with root package name */
    public boolean f950b;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f952e;

    /* renamed from: g, reason: collision with root package name */
    public a.x f954g;

    /* renamed from: l, reason: collision with root package name */
    public final B.j f957l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f958m;

    /* renamed from: n, reason: collision with root package name */
    public final y f959n;

    /* renamed from: o, reason: collision with root package name */
    public final y f960o;

    /* renamed from: p, reason: collision with root package name */
    public final y f961p;

    /* renamed from: q, reason: collision with root package name */
    public final y f962q;

    /* renamed from: r, reason: collision with root package name */
    public final B f963r;

    /* renamed from: s, reason: collision with root package name */
    public int f964s;

    /* renamed from: t, reason: collision with root package name */
    public C0051u f965t;

    /* renamed from: u, reason: collision with root package name */
    public T.d f966u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractComponentCallbacksC0048q f967v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractComponentCallbacksC0048q f968w;

    /* renamed from: x, reason: collision with root package name */
    public final C f969x;

    /* renamed from: y, reason: collision with root package name */
    public final O0.e f970y;

    /* renamed from: z, reason: collision with root package name */
    public B.j f971z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f949a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final T.w f951c = new T.w(2);

    /* renamed from: f, reason: collision with root package name */
    public final x f953f = new x(this);
    public final A h = new A(this);
    public final AtomicInteger i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map f955j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map f956k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [X.y] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.y] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.y] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.y] */
    public I() {
        Collections.synchronizedMap(new HashMap());
        this.f957l = new B.j(this);
        this.f958m = new CopyOnWriteArrayList();
        final int i = 0;
        this.f959n = new J.a(this) { // from class: X.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1147b;

            {
                this.f1147b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        I i2 = this.f1147b;
                        if (i2.G()) {
                            i2.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i3 = this.f1147b;
                        if (i3.G() && num.intValue() == 80) {
                            i3.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i4 = this.f1147b;
                        if (i4.G()) {
                            i4.m(fVar.f4031a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1147b;
                        if (i5.G()) {
                            i5.r(gVar.f4032a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f960o = new J.a(this) { // from class: X.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1147b;

            {
                this.f1147b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i2) {
                    case 0:
                        I i22 = this.f1147b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i3 = this.f1147b;
                        if (i3.G() && num.intValue() == 80) {
                            i3.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i4 = this.f1147b;
                        if (i4.G()) {
                            i4.m(fVar.f4031a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1147b;
                        if (i5.G()) {
                            i5.r(gVar.f4032a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.f961p = new J.a(this) { // from class: X.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1147b;

            {
                this.f1147b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i3) {
                    case 0:
                        I i22 = this.f1147b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i32 = this.f1147b;
                        if (i32.G() && num.intValue() == 80) {
                            i32.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i4 = this.f1147b;
                        if (i4.G()) {
                            i4.m(fVar.f4031a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1147b;
                        if (i5.G()) {
                            i5.r(gVar.f4032a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.f962q = new J.a(this) { // from class: X.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1147b;

            {
                this.f1147b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i4) {
                    case 0:
                        I i22 = this.f1147b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i32 = this.f1147b;
                        if (i32.G() && num.intValue() == 80) {
                            i32.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i42 = this.f1147b;
                        if (i42.G()) {
                            i42.m(fVar.f4031a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1147b;
                        if (i5.G()) {
                            i5.r(gVar.f4032a, false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f963r = new B(this);
        this.f964s = -1;
        this.f969x = new C(this);
        this.f970y = new O0.e(15);
        this.f939C = new ArrayDeque();
        this.f948M = new Q.b(5, this);
    }

    public static boolean F(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        abstractComponentCallbacksC0048q.getClass();
        Iterator it = abstractComponentCallbacksC0048q.f1122t.f951c.g().iterator();
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
        return abstractComponentCallbacksC0048q.f1090B && (abstractComponentCallbacksC0048q.f1120r == null || H(abstractComponentCallbacksC0048q.f1123u));
    }

    public static boolean I(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (abstractComponentCallbacksC0048q == null) {
            return true;
        }
        I i = abstractComponentCallbacksC0048q.f1120r;
        return abstractComponentCallbacksC0048q.equals(i.f968w) && I(i.f967v);
    }

    public static void X(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0048q);
        }
        if (abstractComponentCallbacksC0048q.f1127y) {
            abstractComponentCallbacksC0048q.f1127y = false;
            abstractComponentCallbacksC0048q.f1096I = !abstractComponentCallbacksC0048q.f1096I;
        }
    }

    public final AbstractComponentCallbacksC0048q A(int i) {
        T.w wVar = this.f951c;
        ArrayList arrayList = (ArrayList) wVar.f845a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = (AbstractComponentCallbacksC0048q) arrayList.get(size);
            if (abstractComponentCallbacksC0048q != null && abstractComponentCallbacksC0048q.f1124v == i) {
                return abstractComponentCallbacksC0048q;
            }
        }
        for (O o2 : ((HashMap) wVar.f846b).values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = o2.f996c;
                if (abstractComponentCallbacksC0048q2.f1124v == i) {
                    return abstractComponentCallbacksC0048q2;
                }
            }
        }
        return null;
    }

    public final ViewGroup B(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        ViewGroup viewGroup = abstractComponentCallbacksC0048q.f1092D;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0048q.f1125w > 0 && this.f966u.D()) {
            View C2 = this.f966u.C(abstractComponentCallbacksC0048q.f1125w);
            if (C2 instanceof ViewGroup) {
                return (ViewGroup) C2;
            }
        }
        return null;
    }

    public final C C() {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f967v;
        return abstractComponentCallbacksC0048q != null ? abstractComponentCallbacksC0048q.f1120r.C() : this.f969x;
    }

    public final O0.e D() {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f967v;
        return abstractComponentCallbacksC0048q != null ? abstractComponentCallbacksC0048q.f1120r.D() : this.f970y;
    }

    public final void E(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0048q);
        }
        if (abstractComponentCallbacksC0048q.f1127y) {
            return;
        }
        abstractComponentCallbacksC0048q.f1127y = true;
        abstractComponentCallbacksC0048q.f1096I = true ^ abstractComponentCallbacksC0048q.f1096I;
        W(abstractComponentCallbacksC0048q);
    }

    public final boolean G() {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f967v;
        if (abstractComponentCallbacksC0048q == null) {
            return true;
        }
        return abstractComponentCallbacksC0048q.m() && this.f967v.j().G();
    }

    public final void J(int i, boolean z2) {
        HashMap hashMap;
        C0051u c0051u;
        if (this.f965t == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i != this.f964s) {
            this.f964s = i;
            T.w wVar = this.f951c;
            Iterator it = ((ArrayList) wVar.f845a).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = (HashMap) wVar.f846b;
                if (!hasNext) {
                    break;
                }
                O o2 = (O) hashMap.get(((AbstractComponentCallbacksC0048q) it.next()).f1109e);
                if (o2 != null) {
                    o2.k();
                }
            }
            for (O o3 : hashMap.values()) {
                if (o3 != null) {
                    o3.k();
                    AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o3.f996c;
                    if (abstractComponentCallbacksC0048q.f1114l && !abstractComponentCallbacksC0048q.o()) {
                        wVar.j(o3);
                    }
                }
            }
            Y();
            if (this.f940D && (c0051u = this.f965t) != null && this.f964s == 7) {
                c0051u.f1138e.invalidateOptionsMenu();
                this.f940D = false;
            }
        }
    }

    public final void K() {
        if (this.f965t == null) {
            return;
        }
        this.f941E = false;
        this.F = false;
        this.f947L.f983g = false;
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f951c.h()) {
            if (abstractComponentCallbacksC0048q != null) {
                abstractComponentCallbacksC0048q.f1122t.K();
            }
        }
    }

    public final boolean L() {
        return M(-1, 0);
    }

    public final boolean M(int i, int i2) {
        y(false);
        x(true);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f968w;
        if (abstractComponentCallbacksC0048q != null && i < 0 && abstractComponentCallbacksC0048q.g().L()) {
            return true;
        }
        boolean N2 = N(this.f944I, this.f945J, i, i2);
        if (N2) {
            this.f950b = true;
            try {
                P(this.f944I, this.f945J);
            } finally {
                d();
            }
        }
        a0();
        u();
        ((HashMap) this.f951c.f846b).values().removeAll(Collections.singleton(null));
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
                    if (i >= 0 && i == c0032a.f1032r) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z2) {
                        while (size > 0) {
                            C0032a c0032a2 = (C0032a) this.d.get(size - 1);
                            if (i < 0 || i != c0032a2.f1032r) {
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
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0048q + " nesting=" + abstractComponentCallbacksC0048q.f1119q);
        }
        boolean o2 = abstractComponentCallbacksC0048q.o();
        if (abstractComponentCallbacksC0048q.f1128z && o2) {
            return;
        }
        T.w wVar = this.f951c;
        synchronized (((ArrayList) wVar.f845a)) {
            ((ArrayList) wVar.f845a).remove(abstractComponentCallbacksC0048q);
        }
        abstractComponentCallbacksC0048q.f1113k = false;
        if (F(abstractComponentCallbacksC0048q)) {
            this.f940D = true;
        }
        abstractComponentCallbacksC0048q.f1114l = true;
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
            if (!((C0032a) arrayList.get(i)).f1029o) {
                if (i2 != i) {
                    z(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0032a) arrayList.get(i2)).f1029o) {
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
                bundle2.setClassLoader(this.f965t.f1136b.getClassLoader());
                this.f956k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f965t.f1136b.getClassLoader());
                arrayList.add((N) bundle.getParcelable("state"));
            }
        }
        T.w wVar = this.f951c;
        HashMap hashMap = (HashMap) wVar.f847c;
        hashMap.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            N n2 = (N) it.next();
            hashMap.put(n2.f985b, n2);
        }
        J j2 = (J) bundle3.getParcelable("state");
        if (j2 == null) {
            return;
        }
        HashMap hashMap2 = (HashMap) wVar.f846b;
        hashMap2.clear();
        Iterator it2 = j2.f972a.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            i = 2;
            jVar = this.f957l;
            if (!hasNext) {
                break;
            }
            N n3 = (N) ((HashMap) wVar.f847c).remove((String) it2.next());
            if (n3 != null) {
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = (AbstractComponentCallbacksC0048q) this.f947L.f979b.get(n3.f985b);
                if (abstractComponentCallbacksC0048q != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0048q);
                    }
                    o2 = new O(jVar, wVar, abstractComponentCallbacksC0048q, n3);
                } else {
                    o2 = new O(this.f957l, this.f951c, this.f965t.f1136b.getClassLoader(), C(), n3);
                }
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = o2.f996c;
                abstractComponentCallbacksC0048q2.f1120r = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0048q2.f1109e + "): " + abstractComponentCallbacksC0048q2);
                }
                o2.m(this.f965t.f1136b.getClassLoader());
                wVar.i(o2);
                o2.f997e = this.f964s;
            }
        }
        L l2 = this.f947L;
        l2.getClass();
        Iterator it3 = new ArrayList(l2.f979b.values()).iterator();
        while (it3.hasNext()) {
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q3 = (AbstractComponentCallbacksC0048q) it3.next();
            if (hashMap2.get(abstractComponentCallbacksC0048q3.f1109e) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0048q3 + " that was not found in the set of active Fragments " + j2.f972a);
                }
                this.f947L.e(abstractComponentCallbacksC0048q3);
                abstractComponentCallbacksC0048q3.f1120r = this;
                O o3 = new O(jVar, wVar, abstractComponentCallbacksC0048q3);
                o3.f997e = 1;
                o3.k();
                abstractComponentCallbacksC0048q3.f1114l = true;
                o3.k();
            }
        }
        ArrayList<String> arrayList2 = j2.f973b;
        ((ArrayList) wVar.f845a).clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                AbstractComponentCallbacksC0048q c2 = wVar.c(str3);
                if (c2 == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str3 + ")");
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + c2);
                }
                wVar.a(c2);
            }
        }
        if (j2.f974c != null) {
            this.d = new ArrayList(j2.f974c.length);
            int i3 = 0;
            while (true) {
                C0033b[] c0033bArr = j2.f974c;
                if (i3 >= c0033bArr.length) {
                    break;
                }
                C0033b c0033b = c0033bArr[i3];
                c0033b.getClass();
                C0032a c0032a = new C0032a(this);
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    int[] iArr = c0033b.f1033a;
                    if (i4 >= iArr.length) {
                        break;
                    }
                    P p2 = new P();
                    int i6 = i4 + 1;
                    p2.f998a = iArr[i4];
                    if (Log.isLoggable("FragmentManager", i)) {
                        Log.v("FragmentManager", "Instantiate " + c0032a + " op #" + i5 + " base fragment #" + iArr[i6]);
                    }
                    p2.h = EnumC0072m.values()[c0033b.f1035c[i5]];
                    p2.i = EnumC0072m.values()[c0033b.d[i5]];
                    int i7 = i4 + 2;
                    p2.f1000c = iArr[i6] != 0;
                    int i8 = iArr[i7];
                    p2.d = i8;
                    int i9 = iArr[i4 + 3];
                    p2.f1001e = i9;
                    int i10 = i4 + 5;
                    int i11 = iArr[i4 + 4];
                    p2.f1002f = i11;
                    i4 += 6;
                    int i12 = iArr[i10];
                    p2.f1003g = i12;
                    c0032a.f1019b = i8;
                    c0032a.f1020c = i9;
                    c0032a.d = i11;
                    c0032a.f1021e = i12;
                    c0032a.b(p2);
                    i5++;
                    i = 2;
                }
                c0032a.f1022f = c0033b.f1036e;
                c0032a.h = c0033b.f1037f;
                c0032a.f1023g = true;
                c0032a.i = c0033b.h;
                c0032a.f1024j = c0033b.i;
                c0032a.f1025k = c0033b.f1039j;
                c0032a.f1026l = c0033b.f1040k;
                c0032a.f1027m = c0033b.f1041l;
                c0032a.f1028n = c0033b.f1042m;
                c0032a.f1029o = c0033b.f1043n;
                c0032a.f1032r = c0033b.f1038g;
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = c0033b.f1034b;
                    if (i13 >= arrayList3.size()) {
                        break;
                    }
                    String str4 = (String) arrayList3.get(i13);
                    if (str4 != null) {
                        ((P) c0032a.f1018a.get(i13)).f999b = wVar.c(str4);
                    }
                    i13++;
                }
                c0032a.c(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i3 + " (index " + c0032a.f1032r + "): " + c0032a);
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
        String str5 = j2.f975e;
        if (str5 != null) {
            AbstractComponentCallbacksC0048q c3 = wVar.c(str5);
            this.f968w = c3;
            q(c3);
        }
        ArrayList arrayList4 = j2.f976f;
        if (arrayList4 != null) {
            for (int i14 = i2; i14 < arrayList4.size(); i14++) {
                this.f955j.put((String) arrayList4.get(i14), (C0034c) j2.f977g.get(i14));
            }
        }
        this.f939C = new ArrayDeque(j2.h);
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
            if (c0040i.f1060e) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0040i.f1060e = false;
                c0040i.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((C0040i) it2.next()).e();
        }
        y(true);
        this.f941E = true;
        this.f947L.f983g = true;
        T.w wVar = this.f951c;
        wVar.getClass();
        HashMap hashMap = (HashMap) wVar.f846b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it3 = hashMap.values().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            O o2 = (O) it3.next();
            if (o2 != null) {
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f996c;
                N n2 = new N(abstractComponentCallbacksC0048q);
                if (abstractComponentCallbacksC0048q.f1106a <= -1 || n2.f993m != null) {
                    n2.f993m = abstractComponentCallbacksC0048q.f1107b;
                } else {
                    Bundle bundle2 = new Bundle();
                    abstractComponentCallbacksC0048q.x(bundle2);
                    abstractComponentCallbacksC0048q.f1103P.c(bundle2);
                    bundle2.putParcelable("android:support:fragments", abstractComponentCallbacksC0048q.f1122t.R());
                    o2.f994a.q(false);
                    Bundle bundle3 = bundle2.isEmpty() ? null : bundle2;
                    if (abstractComponentCallbacksC0048q.f1093E != null) {
                        o2.o();
                    }
                    if (abstractComponentCallbacksC0048q.f1108c != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putSparseParcelableArray("android:view_state", abstractComponentCallbacksC0048q.f1108c);
                    }
                    if (abstractComponentCallbacksC0048q.d != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBundle("android:view_registry_state", abstractComponentCallbacksC0048q.d);
                    }
                    if (!abstractComponentCallbacksC0048q.f1094G) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBoolean("android:user_visible_hint", abstractComponentCallbacksC0048q.f1094G);
                    }
                    n2.f993m = bundle3;
                    if (abstractComponentCallbacksC0048q.h != null) {
                        if (bundle3 == null) {
                            n2.f993m = new Bundle();
                        }
                        n2.f993m.putString("android:target_state", abstractComponentCallbacksC0048q.h);
                        int i2 = abstractComponentCallbacksC0048q.i;
                        if (i2 != 0) {
                            n2.f993m.putInt("android:target_req_state", i2);
                        }
                    }
                }
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = o2.f996c;
                arrayList2.add(abstractComponentCallbacksC0048q2.f1109e);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0048q2 + ": " + abstractComponentCallbacksC0048q2.f1107b);
                }
            }
        }
        T.w wVar2 = this.f951c;
        wVar2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) wVar2.f847c).values());
        if (!arrayList3.isEmpty()) {
            T.w wVar3 = this.f951c;
            synchronized (((ArrayList) wVar3.f845a)) {
                try {
                    if (((ArrayList) wVar3.f845a).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) wVar3.f845a).size());
                        Iterator it4 = ((ArrayList) wVar3.f845a).iterator();
                        while (it4.hasNext()) {
                            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q3 = (AbstractComponentCallbacksC0048q) it4.next();
                            arrayList.add(abstractComponentCallbacksC0048q3.f1109e);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0048q3.f1109e + "): " + abstractComponentCallbacksC0048q3);
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
            j2.f975e = null;
            ArrayList arrayList5 = new ArrayList();
            j2.f976f = arrayList5;
            ArrayList arrayList6 = new ArrayList();
            j2.f977g = arrayList6;
            j2.f972a = arrayList2;
            j2.f973b = arrayList;
            j2.f974c = c0033bArr;
            j2.d = this.i.get();
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q4 = this.f968w;
            if (abstractComponentCallbacksC0048q4 != null) {
                j2.f975e = abstractComponentCallbacksC0048q4.f1109e;
            }
            arrayList5.addAll(this.f955j.keySet());
            arrayList6.addAll(this.f955j.values());
            j2.h = new ArrayList(this.f939C);
            bundle.putParcelable("state", j2);
            for (String str : this.f956k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f956k.get(str));
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                N n3 = (N) it5.next();
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("state", n3);
                bundle.putBundle("fragment_" + n3.f985b, bundle4);
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public final void S() {
        synchronized (this.f949a) {
            try {
                if (this.f949a.size() == 1) {
                    this.f965t.f1137c.removeCallbacks(this.f948M);
                    this.f965t.f1137c.post(this.f948M);
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

    public final void U(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q, EnumC0072m enumC0072m) {
        if (abstractComponentCallbacksC0048q.equals(this.f951c.c(abstractComponentCallbacksC0048q.f1109e)) && (abstractComponentCallbacksC0048q.f1121s == null || abstractComponentCallbacksC0048q.f1120r == this)) {
            abstractComponentCallbacksC0048q.f1099L = enumC0072m;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0048q + " is not an active fragment of FragmentManager " + this);
    }

    public final void V(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (abstractComponentCallbacksC0048q != null) {
            if (!abstractComponentCallbacksC0048q.equals(this.f951c.c(abstractComponentCallbacksC0048q.f1109e)) || (abstractComponentCallbacksC0048q.f1121s != null && abstractComponentCallbacksC0048q.f1120r != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0048q + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = this.f968w;
        this.f968w = abstractComponentCallbacksC0048q;
        q(abstractComponentCallbacksC0048q2);
        q(this.f968w);
    }

    public final void W(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        ViewGroup B2 = B(abstractComponentCallbacksC0048q);
        if (B2 != null) {
            C0047p c0047p = abstractComponentCallbacksC0048q.f1095H;
            if ((c0047p == null ? 0 : c0047p.f1083e) + (c0047p == null ? 0 : c0047p.d) + (c0047p == null ? 0 : c0047p.f1082c) + (c0047p == null ? 0 : c0047p.f1081b) > 0) {
                if (B2.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    B2.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0048q);
                }
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = (AbstractComponentCallbacksC0048q) B2.getTag(R.id.visible_removing_fragment_view_tag);
                C0047p c0047p2 = abstractComponentCallbacksC0048q.f1095H;
                boolean z2 = c0047p2 != null ? c0047p2.f1080a : false;
                if (abstractComponentCallbacksC0048q2.f1095H == null) {
                    return;
                }
                abstractComponentCallbacksC0048q2.f().f1080a = z2;
            }
        }
    }

    public final void Y() {
        Iterator it = this.f951c.f().iterator();
        while (it.hasNext()) {
            O o2 = (O) it.next();
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f996c;
            if (abstractComponentCallbacksC0048q.F) {
                if (this.f950b) {
                    this.f943H = true;
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
        C0051u c0051u = this.f965t;
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
            c0051u.f1138e.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw illegalStateException;
        }
    }

    public final O a(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        String str = abstractComponentCallbacksC0048q.f1098K;
        if (str != null) {
            Y.d.c(abstractComponentCallbacksC0048q, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0048q);
        }
        O f2 = f(abstractComponentCallbacksC0048q);
        abstractComponentCallbacksC0048q.f1120r = this;
        T.w wVar = this.f951c;
        wVar.i(f2);
        if (!abstractComponentCallbacksC0048q.f1128z) {
            wVar.a(abstractComponentCallbacksC0048q);
            abstractComponentCallbacksC0048q.f1114l = false;
            if (abstractComponentCallbacksC0048q.f1093E == null) {
                abstractComponentCallbacksC0048q.f1096I = false;
            }
            if (F(abstractComponentCallbacksC0048q)) {
                this.f940D = true;
            }
        }
        return f2;
    }

    public final void a0() {
        synchronized (this.f949a) {
            try {
                if (!this.f949a.isEmpty()) {
                    A a2 = this.h;
                    a2.f924a = true;
                    a.w wVar = a2.f926c;
                    if (wVar != null) {
                        wVar.c();
                    }
                    return;
                }
                A a3 = this.h;
                ArrayList arrayList = this.d;
                a3.f924a = (arrayList != null ? arrayList.size() : 0) > 0 && I(this.f967v);
                a.w wVar2 = a3.f926c;
                if (wVar2 != null) {
                    wVar2.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(C0051u c0051u, T.d dVar, AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        String str;
        if (this.f965t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f965t = c0051u;
        this.f966u = dVar;
        this.f967v = abstractComponentCallbacksC0048q;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f958m;
        if (abstractComponentCallbacksC0048q != 0) {
            copyOnWriteArrayList.add(new D(abstractComponentCallbacksC0048q));
        } else if (c0051u != null) {
            copyOnWriteArrayList.add(c0051u);
        }
        if (this.f967v != null) {
            a0();
        }
        if (c0051u != null) {
            a.x i = c0051u.f1138e.i();
            this.f954g = i;
            i.a(abstractComponentCallbacksC0048q != 0 ? abstractComponentCallbacksC0048q : c0051u, this.h);
        }
        if (abstractComponentCallbacksC0048q != 0) {
            L l2 = abstractComponentCallbacksC0048q.f1120r.f947L;
            HashMap hashMap = l2.f980c;
            L l3 = (L) hashMap.get(abstractComponentCallbacksC0048q.f1109e);
            if (l3 == null) {
                l3 = new L(l2.f981e);
                hashMap.put(abstractComponentCallbacksC0048q.f1109e, l3);
            }
            this.f947L = l3;
        } else if (c0051u != null) {
            this.f947L = (L) new A0.h(c0051u.f1138e.c(), L.h).x(L.class);
        } else {
            this.f947L = new L(false);
        }
        L l4 = this.f947L;
        l4.f983g = this.f941E || this.F;
        this.f951c.d = l4;
        C0051u c0051u2 = this.f965t;
        if (c0051u2 != null && abstractComponentCallbacksC0048q == 0) {
            h0.d b2 = c0051u2.b();
            b2.e("android:support:fragments", new r(2, this));
            Bundle c2 = b2.c("android:support:fragments");
            if (c2 != null) {
                Q(c2);
            }
        }
        C0051u c0051u3 = this.f965t;
        if (c0051u3 != null) {
            AbstractActivityC0136i abstractActivityC0136i = c0051u3.f1138e;
            if (abstractComponentCallbacksC0048q != 0) {
                str = abstractComponentCallbacksC0048q.f1109e + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            String e2 = V.e(str2, "StartActivityForResult");
            E e3 = new E(2);
            z zVar = new z(this, 1);
            a.j jVar = abstractActivityC0136i.h;
            this.f971z = jVar.b(e2, e3, zVar);
            this.f937A = jVar.b(V.e(str2, "StartIntentSenderForResult"), new E(0), new z(this, 2));
            this.f938B = jVar.b(V.e(str2, "RequestPermissions"), new E(1), new z(this, 0));
        }
        C0051u c0051u4 = this.f965t;
        if (c0051u4 != null) {
            c0051u4.f1138e.g(this.f959n);
        }
        C0051u c0051u5 = this.f965t;
        if (c0051u5 != null) {
            AbstractActivityC0136i abstractActivityC0136i2 = c0051u5.f1138e;
            y yVar = this.f960o;
            abstractActivityC0136i2.getClass();
            g1.f.e(yVar, "listener");
            abstractActivityC0136i2.f1205j.add(yVar);
        }
        C0051u c0051u6 = this.f965t;
        if (c0051u6 != null) {
            AbstractActivityC0136i abstractActivityC0136i3 = c0051u6.f1138e;
            y yVar2 = this.f961p;
            abstractActivityC0136i3.getClass();
            g1.f.e(yVar2, "listener");
            abstractActivityC0136i3.f1207l.add(yVar2);
        }
        C0051u c0051u7 = this.f965t;
        if (c0051u7 != null) {
            AbstractActivityC0136i abstractActivityC0136i4 = c0051u7.f1138e;
            y yVar3 = this.f962q;
            abstractActivityC0136i4.getClass();
            g1.f.e(yVar3, "listener");
            abstractActivityC0136i4.f1208m.add(yVar3);
        }
        C0051u c0051u8 = this.f965t;
        if (c0051u8 == null || abstractComponentCallbacksC0048q != 0) {
            return;
        }
        AbstractActivityC0136i abstractActivityC0136i5 = c0051u8.f1138e;
        B b3 = this.f963r;
        abstractActivityC0136i5.getClass();
        g1.f.e(b3, "provider");
        C0012m c0012m = abstractActivityC0136i5.f1201c;
        ((CopyOnWriteArrayList) c0012m.f423c).add(b3);
        ((Runnable) c0012m.f422b).run();
    }

    public final void c(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0048q);
        }
        if (abstractComponentCallbacksC0048q.f1128z) {
            abstractComponentCallbacksC0048q.f1128z = false;
            if (abstractComponentCallbacksC0048q.f1113k) {
                return;
            }
            this.f951c.a(abstractComponentCallbacksC0048q);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0048q);
            }
            if (F(abstractComponentCallbacksC0048q)) {
                this.f940D = true;
            }
        }
    }

    public final void d() {
        this.f950b = false;
        this.f945J.clear();
        this.f944I.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f951c.f().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((O) it.next()).f996c.f1092D;
            if (viewGroup != null) {
                hashSet.add(C0040i.f(viewGroup, D()));
            }
        }
        return hashSet;
    }

    public final O f(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        String str = abstractComponentCallbacksC0048q.f1109e;
        T.w wVar = this.f951c;
        O o2 = (O) ((HashMap) wVar.f846b).get(str);
        if (o2 != null) {
            return o2;
        }
        O o3 = new O(this.f957l, wVar, abstractComponentCallbacksC0048q);
        o3.m(this.f965t.f1136b.getClassLoader());
        o3.f997e = this.f964s;
        return o3;
    }

    public final void g(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0048q);
        }
        if (abstractComponentCallbacksC0048q.f1128z) {
            return;
        }
        abstractComponentCallbacksC0048q.f1128z = true;
        if (abstractComponentCallbacksC0048q.f1113k) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0048q);
            }
            T.w wVar = this.f951c;
            synchronized (((ArrayList) wVar.f845a)) {
                ((ArrayList) wVar.f845a).remove(abstractComponentCallbacksC0048q);
            }
            abstractComponentCallbacksC0048q.f1113k = false;
            if (F(abstractComponentCallbacksC0048q)) {
                this.f940D = true;
            }
            W(abstractComponentCallbacksC0048q);
        }
    }

    public final void h(boolean z2) {
        if (z2 && this.f965t != null) {
            Z(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f951c.h()) {
            if (abstractComponentCallbacksC0048q != null) {
                abstractComponentCallbacksC0048q.f1091C = true;
                if (z2) {
                    abstractComponentCallbacksC0048q.f1122t.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.f964s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f951c.h()) {
            if (abstractComponentCallbacksC0048q != null) {
                if (!abstractComponentCallbacksC0048q.f1127y ? abstractComponentCallbacksC0048q.f1122t.i() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.f964s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f951c.h()) {
            if (abstractComponentCallbacksC0048q != null && H(abstractComponentCallbacksC0048q)) {
                if (!abstractComponentCallbacksC0048q.f1127y ? abstractComponentCallbacksC0048q.f1122t.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0048q);
                    z2 = true;
                }
            }
        }
        if (this.f952e != null) {
            for (int i = 0; i < this.f952e.size(); i++) {
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = (AbstractComponentCallbacksC0048q) this.f952e.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0048q2)) {
                    abstractComponentCallbacksC0048q2.getClass();
                }
            }
        }
        this.f952e = arrayList;
        return z2;
    }

    public final void k() {
        boolean z2 = true;
        this.f942G = true;
        y(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0040i) it.next()).e();
        }
        C0051u c0051u = this.f965t;
        T.w wVar = this.f951c;
        if (c0051u != null) {
            z2 = ((L) wVar.d).f982f;
        } else {
            AbstractActivityC0136i abstractActivityC0136i = c0051u.f1136b;
            if (abstractActivityC0136i != null) {
                z2 = true ^ abstractActivityC0136i.isChangingConfigurations();
            }
        }
        if (z2) {
            Iterator it2 = this.f955j.values().iterator();
            while (it2.hasNext()) {
                for (String str : ((C0034c) it2.next()).f1044a) {
                    L l2 = (L) wVar.d;
                    l2.getClass();
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    l2.d(str);
                }
            }
        }
        t(-1);
        C0051u c0051u2 = this.f965t;
        if (c0051u2 != null) {
            AbstractActivityC0136i abstractActivityC0136i2 = c0051u2.f1138e;
            y yVar = this.f960o;
            abstractActivityC0136i2.getClass();
            g1.f.e(yVar, "listener");
            abstractActivityC0136i2.f1205j.remove(yVar);
        }
        C0051u c0051u3 = this.f965t;
        if (c0051u3 != null) {
            AbstractActivityC0136i abstractActivityC0136i3 = c0051u3.f1138e;
            y yVar2 = this.f959n;
            abstractActivityC0136i3.getClass();
            g1.f.e(yVar2, "listener");
            abstractActivityC0136i3.i.remove(yVar2);
        }
        C0051u c0051u4 = this.f965t;
        if (c0051u4 != null) {
            AbstractActivityC0136i abstractActivityC0136i4 = c0051u4.f1138e;
            y yVar3 = this.f961p;
            abstractActivityC0136i4.getClass();
            g1.f.e(yVar3, "listener");
            abstractActivityC0136i4.f1207l.remove(yVar3);
        }
        C0051u c0051u5 = this.f965t;
        if (c0051u5 != null) {
            AbstractActivityC0136i abstractActivityC0136i5 = c0051u5.f1138e;
            y yVar4 = this.f962q;
            abstractActivityC0136i5.getClass();
            g1.f.e(yVar4, "listener");
            abstractActivityC0136i5.f1208m.remove(yVar4);
        }
        C0051u c0051u6 = this.f965t;
        if (c0051u6 != null) {
            AbstractActivityC0136i abstractActivityC0136i6 = c0051u6.f1138e;
            B b2 = this.f963r;
            abstractActivityC0136i6.getClass();
            g1.f.e(b2, "provider");
            C0012m c0012m = abstractActivityC0136i6.f1201c;
            ((CopyOnWriteArrayList) c0012m.f423c).remove(b2);
            if (((HashMap) c0012m.d).remove(b2) != null) {
                throw new ClassCastException();
            }
            ((Runnable) c0012m.f422b).run();
        }
        this.f965t = null;
        this.f966u = null;
        this.f967v = null;
        if (this.f954g != null) {
            Iterator it3 = this.h.f925b.iterator();
            while (it3.hasNext()) {
                ((InterfaceC0056c) it3.next()).cancel();
            }
            this.f954g = null;
        }
        B.j jVar = this.f971z;
        if (jVar != null) {
            jVar.J();
            this.f937A.J();
            this.f938B.J();
        }
    }

    public final void l(boolean z2) {
        if (z2 && this.f965t != null) {
            Z(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f951c.h()) {
            if (abstractComponentCallbacksC0048q != null) {
                abstractComponentCallbacksC0048q.f1091C = true;
                if (z2) {
                    abstractComponentCallbacksC0048q.f1122t.l(true);
                }
            }
        }
    }

    public final void m(boolean z2, boolean z3) {
        if (z3 && this.f965t != null) {
            Z(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f951c.h()) {
            if (abstractComponentCallbacksC0048q != null && z3) {
                abstractComponentCallbacksC0048q.f1122t.m(z2, true);
            }
        }
    }

    public final void n() {
        Iterator it = this.f951c.g().iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = (AbstractComponentCallbacksC0048q) it.next();
            if (abstractComponentCallbacksC0048q != null) {
                abstractComponentCallbacksC0048q.n();
                abstractComponentCallbacksC0048q.f1122t.n();
            }
        }
    }

    public final boolean o() {
        if (this.f964s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f951c.h()) {
            if (abstractComponentCallbacksC0048q != null) {
                if (!abstractComponentCallbacksC0048q.f1127y ? abstractComponentCallbacksC0048q.f1122t.o() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f964s < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f951c.h()) {
            if (abstractComponentCallbacksC0048q != null && !abstractComponentCallbacksC0048q.f1127y) {
                abstractComponentCallbacksC0048q.f1122t.p();
            }
        }
    }

    public final void q(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (abstractComponentCallbacksC0048q != null) {
            if (abstractComponentCallbacksC0048q.equals(this.f951c.c(abstractComponentCallbacksC0048q.f1109e))) {
                abstractComponentCallbacksC0048q.f1120r.getClass();
                boolean I2 = I(abstractComponentCallbacksC0048q);
                Boolean bool = abstractComponentCallbacksC0048q.f1112j;
                if (bool == null || bool.booleanValue() != I2) {
                    abstractComponentCallbacksC0048q.f1112j = Boolean.valueOf(I2);
                    I i = abstractComponentCallbacksC0048q.f1122t;
                    i.a0();
                    i.q(i.f968w);
                }
            }
        }
    }

    public final void r(boolean z2, boolean z3) {
        if (z3 && this.f965t != null) {
            Z(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f951c.h()) {
            if (abstractComponentCallbacksC0048q != null && z3) {
                abstractComponentCallbacksC0048q.f1122t.r(z2, true);
            }
        }
    }

    public final boolean s() {
        if (this.f964s < 1) {
            return false;
        }
        boolean z2 = false;
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f951c.h()) {
            if (abstractComponentCallbacksC0048q != null && H(abstractComponentCallbacksC0048q)) {
                if (!abstractComponentCallbacksC0048q.f1127y ? abstractComponentCallbacksC0048q.f1122t.s() : false) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final void t(int i) {
        try {
            this.f950b = true;
            for (O o2 : ((HashMap) this.f951c.f846b).values()) {
                if (o2 != null) {
                    o2.f997e = i;
                }
            }
            J(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0040i) it.next()).e();
            }
            this.f950b = false;
            y(true);
        } catch (Throwable th) {
            this.f950b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f967v;
        if (abstractComponentCallbacksC0048q != null) {
            sb.append(abstractComponentCallbacksC0048q.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f967v)));
            sb.append("}");
        } else {
            C0051u c0051u = this.f965t;
            if (c0051u != null) {
                sb.append(c0051u.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f965t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u() {
        if (this.f943H) {
            this.f943H = false;
            Y();
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String e2 = V.e(str, "    ");
        T.w wVar = this.f951c;
        wVar.getClass();
        String str3 = str + "    ";
        HashMap hashMap = (HashMap) wVar.f846b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (O o2 : hashMap.values()) {
                printWriter.print(str);
                if (o2 != null) {
                    AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f996c;
                    printWriter.println(abstractComponentCallbacksC0048q);
                    abstractComponentCallbacksC0048q.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0048q.f1124v));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0048q.f1125w));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0048q.f1126x);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0048q.f1106a);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0048q.f1109e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0048q.f1119q);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0048q.f1113k);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0048q.f1114l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0048q.f1115m);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0048q.f1116n);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0048q.f1127y);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0048q.f1128z);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0048q.f1090B);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0048q.f1089A);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0048q.f1094G);
                    if (abstractComponentCallbacksC0048q.f1120r != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0048q.f1120r);
                    }
                    if (abstractComponentCallbacksC0048q.f1121s != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0048q.f1121s);
                    }
                    if (abstractComponentCallbacksC0048q.f1123u != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0048q.f1123u);
                    }
                    if (abstractComponentCallbacksC0048q.f1110f != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0048q.f1110f);
                    }
                    if (abstractComponentCallbacksC0048q.f1107b != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0048q.f1107b);
                    }
                    if (abstractComponentCallbacksC0048q.f1108c != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0048q.f1108c);
                    }
                    if (abstractComponentCallbacksC0048q.d != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0048q.d);
                    }
                    Object obj = abstractComponentCallbacksC0048q.f1111g;
                    if (obj == null) {
                        I i = abstractComponentCallbacksC0048q.f1120r;
                        obj = (i == null || (str2 = abstractComponentCallbacksC0048q.h) == null) ? null : i.f951c.c(str2);
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
                    C0047p c0047p = abstractComponentCallbacksC0048q.f1095H;
                    printWriter.println(c0047p == null ? false : c0047p.f1080a);
                    C0047p c0047p2 = abstractComponentCallbacksC0048q.f1095H;
                    if ((c0047p2 == null ? 0 : c0047p2.f1081b) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        C0047p c0047p3 = abstractComponentCallbacksC0048q.f1095H;
                        printWriter.println(c0047p3 == null ? 0 : c0047p3.f1081b);
                    }
                    C0047p c0047p4 = abstractComponentCallbacksC0048q.f1095H;
                    if ((c0047p4 == null ? 0 : c0047p4.f1082c) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        C0047p c0047p5 = abstractComponentCallbacksC0048q.f1095H;
                        printWriter.println(c0047p5 == null ? 0 : c0047p5.f1082c);
                    }
                    C0047p c0047p6 = abstractComponentCallbacksC0048q.f1095H;
                    if ((c0047p6 == null ? 0 : c0047p6.d) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        C0047p c0047p7 = abstractComponentCallbacksC0048q.f1095H;
                        printWriter.println(c0047p7 == null ? 0 : c0047p7.d);
                    }
                    C0047p c0047p8 = abstractComponentCallbacksC0048q.f1095H;
                    if ((c0047p8 == null ? 0 : c0047p8.f1083e) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        C0047p c0047p9 = abstractComponentCallbacksC0048q.f1095H;
                        printWriter.println(c0047p9 == null ? 0 : c0047p9.f1083e);
                    }
                    if (abstractComponentCallbacksC0048q.f1092D != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0048q.f1092D);
                    }
                    if (abstractComponentCallbacksC0048q.f1093E != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0048q.f1093E);
                    }
                    if (abstractComponentCallbacksC0048q.h() != null) {
                        o.l lVar = ((C0086a) new A0.h(abstractComponentCallbacksC0048q.c(), C0086a.f1708c).x(C0086a.class)).f1709b;
                        if (lVar.f3240c > 0) {
                            printWriter.print(str3);
                            printWriter.println("Loaders:");
                            if (lVar.f3240c > 0) {
                                if (lVar.f3239b[0] != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(str3);
                                printWriter.print("  #");
                                printWriter.print(lVar.f3238a[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + abstractComponentCallbacksC0048q.f1122t + ":");
                    abstractComponentCallbacksC0048q.f1122t.v(V.e(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) wVar.f845a;
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
        ArrayList arrayList2 = this.f952e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q3 = (AbstractComponentCallbacksC0048q) this.f952e.get(i3);
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
        synchronized (this.f949a) {
            try {
                int size4 = this.f949a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i5 = 0; i5 < size4; i5++) {
                        Object obj2 = (G) this.f949a.get(i5);
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
        printWriter.println(this.f965t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f966u);
        if (this.f967v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f967v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f964s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f941E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f942G);
        if (this.f940D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f940D);
        }
    }

    public final void w(G g2, boolean z2) {
        if (!z2) {
            if (this.f965t == null) {
                if (!this.f942G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f941E || this.F) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f949a) {
            try {
                if (this.f965t == null) {
                    if (!z2) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f949a.add(g2);
                    S();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(boolean z2) {
        if (this.f950b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f965t == null) {
            if (!this.f942G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f965t.f1137c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2 && (this.f941E || this.F)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f944I == null) {
            this.f944I = new ArrayList();
            this.f945J = new ArrayList();
        }
    }

    public final boolean y(boolean z2) {
        boolean z3;
        x(z2);
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.f944I;
            ArrayList arrayList2 = this.f945J;
            synchronized (this.f949a) {
                if (this.f949a.isEmpty()) {
                    z3 = false;
                } else {
                    try {
                        int size = this.f949a.size();
                        z3 = false;
                        for (int i = 0; i < size; i++) {
                            z3 |= ((G) this.f949a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z3) {
                a0();
                u();
                ((HashMap) this.f951c.f846b).values().removeAll(Collections.singleton(null));
                return z4;
            }
            z4 = true;
            this.f950b = true;
            try {
                P(this.f944I, this.f945J);
            } finally {
                d();
            }
        }
    }

    public final void z(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        T.w wVar;
        T.w wVar2;
        T.w wVar3;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        boolean z2 = ((C0032a) arrayList3.get(i)).f1029o;
        ArrayList arrayList5 = this.f946K;
        if (arrayList5 == null) {
            this.f946K = new ArrayList();
        } else {
            arrayList5.clear();
        }
        ArrayList arrayList6 = this.f946K;
        T.w wVar4 = this.f951c;
        arrayList6.addAll(wVar4.h());
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f968w;
        int i6 = i;
        boolean z3 = false;
        while (true) {
            int i7 = 1;
            if (i6 >= i2) {
                T.w wVar5 = wVar4;
                this.f946K.clear();
                if (!z2 && this.f964s >= 1) {
                    for (int i8 = i; i8 < i2; i8++) {
                        Iterator it = ((C0032a) arrayList.get(i8)).f1018a.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = ((P) it.next()).f999b;
                            if (abstractComponentCallbacksC0048q2 == null || abstractComponentCallbacksC0048q2.f1120r == null) {
                                wVar = wVar5;
                            } else {
                                wVar = wVar5;
                                wVar.i(f(abstractComponentCallbacksC0048q2));
                            }
                            wVar5 = wVar;
                        }
                    }
                }
                for (int i9 = i; i9 < i2; i9++) {
                    C0032a c0032a = (C0032a) arrayList.get(i9);
                    if (((Boolean) arrayList2.get(i9)).booleanValue()) {
                        c0032a.c(-1);
                        ArrayList arrayList7 = c0032a.f1018a;
                        boolean z4 = true;
                        for (int size = arrayList7.size() - 1; size >= 0; size--) {
                            P p2 = (P) arrayList7.get(size);
                            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q3 = p2.f999b;
                            if (abstractComponentCallbacksC0048q3 != null) {
                                if (abstractComponentCallbacksC0048q3.f1095H != null) {
                                    abstractComponentCallbacksC0048q3.f().f1080a = z4;
                                }
                                int i10 = c0032a.f1022f;
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
                                if (abstractComponentCallbacksC0048q3.f1095H != null || i11 != 0) {
                                    abstractComponentCallbacksC0048q3.f();
                                    abstractComponentCallbacksC0048q3.f1095H.f1084f = i11;
                                }
                                abstractComponentCallbacksC0048q3.f();
                                abstractComponentCallbacksC0048q3.f1095H.getClass();
                            }
                            int i13 = p2.f998a;
                            I i14 = c0032a.f1030p;
                            switch (i13) {
                                case 1:
                                    abstractComponentCallbacksC0048q3.E(p2.d, p2.f1001e, p2.f1002f, p2.f1003g);
                                    z4 = true;
                                    i14.T(abstractComponentCallbacksC0048q3, true);
                                    i14.O(abstractComponentCallbacksC0048q3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + p2.f998a);
                                case 3:
                                    abstractComponentCallbacksC0048q3.E(p2.d, p2.f1001e, p2.f1002f, p2.f1003g);
                                    i14.a(abstractComponentCallbacksC0048q3);
                                    z4 = true;
                                case 4:
                                    abstractComponentCallbacksC0048q3.E(p2.d, p2.f1001e, p2.f1002f, p2.f1003g);
                                    i14.getClass();
                                    X(abstractComponentCallbacksC0048q3);
                                    z4 = true;
                                case 5:
                                    abstractComponentCallbacksC0048q3.E(p2.d, p2.f1001e, p2.f1002f, p2.f1003g);
                                    i14.T(abstractComponentCallbacksC0048q3, true);
                                    i14.E(abstractComponentCallbacksC0048q3);
                                    z4 = true;
                                case 6:
                                    abstractComponentCallbacksC0048q3.E(p2.d, p2.f1001e, p2.f1002f, p2.f1003g);
                                    i14.c(abstractComponentCallbacksC0048q3);
                                    z4 = true;
                                case 7:
                                    abstractComponentCallbacksC0048q3.E(p2.d, p2.f1001e, p2.f1002f, p2.f1003g);
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
                        ArrayList arrayList8 = c0032a.f1018a;
                        int size2 = arrayList8.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            P p3 = (P) arrayList8.get(i15);
                            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q4 = p3.f999b;
                            if (abstractComponentCallbacksC0048q4 != null) {
                                if (abstractComponentCallbacksC0048q4.f1095H != null) {
                                    abstractComponentCallbacksC0048q4.f().f1080a = false;
                                }
                                int i16 = c0032a.f1022f;
                                if (abstractComponentCallbacksC0048q4.f1095H != null || i16 != 0) {
                                    abstractComponentCallbacksC0048q4.f();
                                    abstractComponentCallbacksC0048q4.f1095H.f1084f = i16;
                                }
                                abstractComponentCallbacksC0048q4.f();
                                abstractComponentCallbacksC0048q4.f1095H.getClass();
                            }
                            int i17 = p3.f998a;
                            I i18 = c0032a.f1030p;
                            switch (i17) {
                                case 1:
                                    abstractComponentCallbacksC0048q4.E(p3.d, p3.f1001e, p3.f1002f, p3.f1003g);
                                    i18.T(abstractComponentCallbacksC0048q4, false);
                                    i18.a(abstractComponentCallbacksC0048q4);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + p3.f998a);
                                case 3:
                                    abstractComponentCallbacksC0048q4.E(p3.d, p3.f1001e, p3.f1002f, p3.f1003g);
                                    i18.O(abstractComponentCallbacksC0048q4);
                                case 4:
                                    abstractComponentCallbacksC0048q4.E(p3.d, p3.f1001e, p3.f1002f, p3.f1003g);
                                    i18.E(abstractComponentCallbacksC0048q4);
                                case 5:
                                    abstractComponentCallbacksC0048q4.E(p3.d, p3.f1001e, p3.f1002f, p3.f1003g);
                                    i18.T(abstractComponentCallbacksC0048q4, false);
                                    X(abstractComponentCallbacksC0048q4);
                                case 6:
                                    abstractComponentCallbacksC0048q4.E(p3.d, p3.f1001e, p3.f1002f, p3.f1003g);
                                    i18.g(abstractComponentCallbacksC0048q4);
                                case 7:
                                    abstractComponentCallbacksC0048q4.E(p3.d, p3.f1001e, p3.f1002f, p3.f1003g);
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
                        for (int size3 = c0032a2.f1018a.size() - 1; size3 >= 0; size3--) {
                            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q5 = ((P) c0032a2.f1018a.get(size3)).f999b;
                            if (abstractComponentCallbacksC0048q5 != null) {
                                f(abstractComponentCallbacksC0048q5).k();
                            }
                        }
                    } else {
                        Iterator it2 = c0032a2.f1018a.iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q6 = ((P) it2.next()).f999b;
                            if (abstractComponentCallbacksC0048q6 != null) {
                                f(abstractComponentCallbacksC0048q6).k();
                            }
                        }
                    }
                }
                J(this.f964s, true);
                HashSet hashSet = new HashSet();
                for (int i20 = i; i20 < i2; i20++) {
                    Iterator it3 = ((C0032a) arrayList.get(i20)).f1018a.iterator();
                    while (it3.hasNext()) {
                        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q7 = ((P) it3.next()).f999b;
                        if (abstractComponentCallbacksC0048q7 != null && (viewGroup = abstractComponentCallbacksC0048q7.f1092D) != null) {
                            hashSet.add(C0040i.f(viewGroup, D()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    C0040i c0040i = (C0040i) it4.next();
                    c0040i.d = booleanValue;
                    synchronized (c0040i.f1058b) {
                        try {
                            c0040i.g();
                            c0040i.f1060e = false;
                            int size4 = c0040i.f1058b.size() - 1;
                            while (true) {
                                if (size4 >= 0) {
                                    U u2 = (U) c0040i.f1058b.get(size4);
                                    int c2 = V.c(u2.f1014c.f1093E);
                                    if (u2.f1012a != 2 || c2 == 2) {
                                        size4--;
                                    } else {
                                        C0047p c0047p = u2.f1014c.f1095H;
                                        c0040i.f1060e = false;
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
                    if (((Boolean) arrayList2.get(i21)).booleanValue() && c0032a3.f1032r >= 0) {
                        c0032a3.f1032r = -1;
                    }
                    c0032a3.getClass();
                }
                return;
            }
            C0032a c0032a4 = (C0032a) arrayList3.get(i6);
            if (((Boolean) arrayList4.get(i6)).booleanValue()) {
                wVar2 = wVar4;
                int i22 = 1;
                ArrayList arrayList9 = this.f946K;
                ArrayList arrayList10 = c0032a4.f1018a;
                int size5 = arrayList10.size() - 1;
                while (size5 >= 0) {
                    P p4 = (P) arrayList10.get(size5);
                    int i23 = p4.f998a;
                    if (i23 != i22) {
                        if (i23 != 3) {
                            switch (i23) {
                                case 8:
                                    abstractComponentCallbacksC0048q = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0048q = p4.f999b;
                                    break;
                                case 10:
                                    p4.i = p4.h;
                                    break;
                            }
                            size5--;
                            i22 = 1;
                        }
                        arrayList9.add(p4.f999b);
                        size5--;
                        i22 = 1;
                    }
                    arrayList9.remove(p4.f999b);
                    size5--;
                    i22 = 1;
                }
            } else {
                ArrayList arrayList11 = this.f946K;
                int i24 = 0;
                while (true) {
                    ArrayList arrayList12 = c0032a4.f1018a;
                    if (i24 < arrayList12.size()) {
                        P p5 = (P) arrayList12.get(i24);
                        int i25 = p5.f998a;
                        if (i25 != i7) {
                            if (i25 != 2) {
                                if (i25 == 3 || i25 == 6) {
                                    arrayList11.remove(p5.f999b);
                                    AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q8 = p5.f999b;
                                    if (abstractComponentCallbacksC0048q8 == abstractComponentCallbacksC0048q) {
                                        arrayList12.add(i24, new P(9, abstractComponentCallbacksC0048q8));
                                        i24++;
                                        wVar3 = wVar4;
                                        i3 = 1;
                                        abstractComponentCallbacksC0048q = null;
                                    }
                                } else if (i25 == 7) {
                                    wVar3 = wVar4;
                                    i3 = 1;
                                } else if (i25 == 8) {
                                    arrayList12.add(i24, new P(9, abstractComponentCallbacksC0048q, 0));
                                    p5.f1000c = true;
                                    i24++;
                                    abstractComponentCallbacksC0048q = p5.f999b;
                                }
                                wVar3 = wVar4;
                                i3 = 1;
                            } else {
                                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q9 = p5.f999b;
                                int i26 = abstractComponentCallbacksC0048q9.f1125w;
                                int size6 = arrayList11.size() - 1;
                                boolean z5 = false;
                                while (size6 >= 0) {
                                    T.w wVar6 = wVar4;
                                    AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q10 = (AbstractComponentCallbacksC0048q) arrayList11.get(size6);
                                    if (abstractComponentCallbacksC0048q10.f1125w != i26) {
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
                                        p6.f1002f = p5.f1002f;
                                        p6.f1001e = p5.f1001e;
                                        p6.f1003g = p5.f1003g;
                                        arrayList12.add(i24, p6);
                                        arrayList11.remove(abstractComponentCallbacksC0048q10);
                                        i24++;
                                        abstractComponentCallbacksC0048q = abstractComponentCallbacksC0048q;
                                    }
                                    size6--;
                                    i26 = i4;
                                    wVar4 = wVar6;
                                }
                                wVar3 = wVar4;
                                i3 = 1;
                                if (z5) {
                                    arrayList12.remove(i24);
                                    i24--;
                                } else {
                                    p5.f998a = 1;
                                    p5.f1000c = true;
                                    arrayList11.add(abstractComponentCallbacksC0048q9);
                                }
                            }
                            i24 += i3;
                            i7 = i3;
                            wVar4 = wVar3;
                        } else {
                            wVar3 = wVar4;
                            i3 = i7;
                        }
                        arrayList11.add(p5.f999b);
                        i24 += i3;
                        i7 = i3;
                        wVar4 = wVar3;
                    } else {
                        wVar2 = wVar4;
                    }
                }
            }
            z3 = z3 || c0032a4.f1023g;
            i6++;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            wVar4 = wVar2;
        }
    }
}
