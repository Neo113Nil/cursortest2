package Y;

import K.C0014l;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.EnumC0072m;
import com.playbag.tripgear.R;
import d0.C0087a;
import g.AbstractActivityC0106i;
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
    public B.j f931A;

    /* renamed from: B, reason: collision with root package name */
    public B.j f932B;

    /* renamed from: C, reason: collision with root package name */
    public ArrayDeque f933C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f934D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f935E;
    public boolean F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f936G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f937H;

    /* renamed from: I, reason: collision with root package name */
    public ArrayList f938I;

    /* renamed from: J, reason: collision with root package name */
    public ArrayList f939J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList f940K;

    /* renamed from: L, reason: collision with root package name */
    public L f941L;

    /* renamed from: M, reason: collision with root package name */
    public final M0.B f942M;

    /* renamed from: b, reason: collision with root package name */
    public boolean f944b;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f946e;

    /* renamed from: g, reason: collision with root package name */
    public a.x f948g;

    /* renamed from: l, reason: collision with root package name */
    public final B.j f951l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f952m;

    /* renamed from: n, reason: collision with root package name */
    public final y f953n;

    /* renamed from: o, reason: collision with root package name */
    public final y f954o;

    /* renamed from: p, reason: collision with root package name */
    public final y f955p;

    /* renamed from: q, reason: collision with root package name */
    public final y f956q;

    /* renamed from: r, reason: collision with root package name */
    public final B f957r;

    /* renamed from: s, reason: collision with root package name */
    public int f958s;

    /* renamed from: t, reason: collision with root package name */
    public C0054u f959t;

    /* renamed from: u, reason: collision with root package name */
    public w1.l f960u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractComponentCallbacksC0051q f961v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractComponentCallbacksC0051q f962w;

    /* renamed from: x, reason: collision with root package name */
    public final C f963x;

    /* renamed from: y, reason: collision with root package name */
    public final J0.e f964y;

    /* renamed from: z, reason: collision with root package name */
    public B.j f965z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f943a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final U.u f945c = new U.u(2);

    /* renamed from: f, reason: collision with root package name */
    public final x f947f = new x(this);
    public final A h = new A(this);
    public final AtomicInteger i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map f949j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map f950k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [Y.y] */
    /* JADX WARN: Type inference failed for: r0v13, types: [Y.y] */
    /* JADX WARN: Type inference failed for: r0v14, types: [Y.y] */
    /* JADX WARN: Type inference failed for: r0v15, types: [Y.y] */
    public I() {
        Collections.synchronizedMap(new HashMap());
        this.f951l = new B.j(this);
        this.f952m = new CopyOnWriteArrayList();
        final int i = 0;
        this.f953n = new J.a(this) { // from class: Y.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1140b;

            {
                this.f1140b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        I i2 = this.f1140b;
                        if (i2.G()) {
                            i2.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i3 = this.f1140b;
                        if (i3.G() && num.intValue() == 80) {
                            i3.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i4 = this.f1140b;
                        if (i4.G()) {
                            i4.m(fVar.f4325a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1140b;
                        if (i5.G()) {
                            i5.r(gVar.f4326a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f954o = new J.a(this) { // from class: Y.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1140b;

            {
                this.f1140b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i2) {
                    case 0:
                        I i22 = this.f1140b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i3 = this.f1140b;
                        if (i3.G() && num.intValue() == 80) {
                            i3.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i4 = this.f1140b;
                        if (i4.G()) {
                            i4.m(fVar.f4325a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1140b;
                        if (i5.G()) {
                            i5.r(gVar.f4326a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.f955p = new J.a(this) { // from class: Y.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1140b;

            {
                this.f1140b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i3) {
                    case 0:
                        I i22 = this.f1140b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i32 = this.f1140b;
                        if (i32.G() && num.intValue() == 80) {
                            i32.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i4 = this.f1140b;
                        if (i4.G()) {
                            i4.m(fVar.f4325a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1140b;
                        if (i5.G()) {
                            i5.r(gVar.f4326a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.f956q = new J.a(this) { // from class: Y.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1140b;

            {
                this.f1140b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i4) {
                    case 0:
                        I i22 = this.f1140b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i32 = this.f1140b;
                        if (i32.G() && num.intValue() == 80) {
                            i32.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i42 = this.f1140b;
                        if (i42.G()) {
                            i42.m(fVar.f4325a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1140b;
                        if (i5.G()) {
                            i5.r(gVar.f4326a, false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f957r = new B(this);
        this.f958s = -1;
        this.f963x = new C(this);
        this.f964y = new J0.e(13);
        this.f933C = new ArrayDeque();
        this.f942M = new M0.B(5, this);
    }

    public static boolean F(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        abstractComponentCallbacksC0051q.getClass();
        Iterator it = abstractComponentCallbacksC0051q.f1116t.f945c.i().iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q2 = (AbstractComponentCallbacksC0051q) it.next();
            if (abstractComponentCallbacksC0051q2 != null) {
                z2 = F(abstractComponentCallbacksC0051q2);
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public static boolean H(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        if (abstractComponentCallbacksC0051q == null) {
            return true;
        }
        return abstractComponentCallbacksC0051q.f1084B && (abstractComponentCallbacksC0051q.f1114r == null || H(abstractComponentCallbacksC0051q.f1117u));
    }

    public static boolean I(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        if (abstractComponentCallbacksC0051q == null) {
            return true;
        }
        I i = abstractComponentCallbacksC0051q.f1114r;
        return abstractComponentCallbacksC0051q.equals(i.f962w) && I(i.f961v);
    }

    public static void X(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0051q);
        }
        if (abstractComponentCallbacksC0051q.f1121y) {
            abstractComponentCallbacksC0051q.f1121y = false;
            abstractComponentCallbacksC0051q.f1090I = !abstractComponentCallbacksC0051q.f1090I;
        }
    }

    public final AbstractComponentCallbacksC0051q A(int i) {
        U.u uVar = this.f945c;
        ArrayList arrayList = (ArrayList) uVar.f874a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = (AbstractComponentCallbacksC0051q) arrayList.get(size);
            if (abstractComponentCallbacksC0051q != null && abstractComponentCallbacksC0051q.f1118v == i) {
                return abstractComponentCallbacksC0051q;
            }
        }
        for (O o2 : ((HashMap) uVar.f875b).values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q2 = o2.f990c;
                if (abstractComponentCallbacksC0051q2.f1118v == i) {
                    return abstractComponentCallbacksC0051q2;
                }
            }
        }
        return null;
    }

    public final ViewGroup B(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        ViewGroup viewGroup = abstractComponentCallbacksC0051q.f1086D;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0051q.f1119w > 0 && this.f960u.J()) {
            View I2 = this.f960u.I(abstractComponentCallbacksC0051q.f1119w);
            if (I2 instanceof ViewGroup) {
                return (ViewGroup) I2;
            }
        }
        return null;
    }

    public final C C() {
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f961v;
        return abstractComponentCallbacksC0051q != null ? abstractComponentCallbacksC0051q.f1114r.C() : this.f963x;
    }

    public final J0.e D() {
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f961v;
        return abstractComponentCallbacksC0051q != null ? abstractComponentCallbacksC0051q.f1114r.D() : this.f964y;
    }

    public final void E(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0051q);
        }
        if (abstractComponentCallbacksC0051q.f1121y) {
            return;
        }
        abstractComponentCallbacksC0051q.f1121y = true;
        abstractComponentCallbacksC0051q.f1090I = true ^ abstractComponentCallbacksC0051q.f1090I;
        W(abstractComponentCallbacksC0051q);
    }

    public final boolean G() {
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f961v;
        if (abstractComponentCallbacksC0051q == null) {
            return true;
        }
        return abstractComponentCallbacksC0051q.m() && this.f961v.j().G();
    }

    public final void J(int i, boolean z2) {
        HashMap hashMap;
        C0054u c0054u;
        if (this.f959t == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i != this.f958s) {
            this.f958s = i;
            U.u uVar = this.f945c;
            Iterator it = ((ArrayList) uVar.f874a).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = (HashMap) uVar.f875b;
                if (!hasNext) {
                    break;
                }
                O o2 = (O) hashMap.get(((AbstractComponentCallbacksC0051q) it.next()).f1103e);
                if (o2 != null) {
                    o2.k();
                }
            }
            for (O o3 : hashMap.values()) {
                if (o3 != null) {
                    o3.k();
                    AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = o3.f990c;
                    if (abstractComponentCallbacksC0051q.f1108l && !abstractComponentCallbacksC0051q.o()) {
                        uVar.n(o3);
                    }
                }
            }
            Y();
            if (this.f934D && (c0054u = this.f959t) != null && this.f958s == 7) {
                c0054u.i.invalidateOptionsMenu();
                this.f934D = false;
            }
        }
    }

    public final void K() {
        if (this.f959t == null) {
            return;
        }
        this.f935E = false;
        this.F = false;
        this.f941L.f977g = false;
        for (AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q : this.f945c.j()) {
            if (abstractComponentCallbacksC0051q != null) {
                abstractComponentCallbacksC0051q.f1116t.K();
            }
        }
    }

    public final boolean L() {
        return M(-1, 0);
    }

    public final boolean M(int i, int i2) {
        y(false);
        x(true);
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f962w;
        if (abstractComponentCallbacksC0051q != null && i < 0 && abstractComponentCallbacksC0051q.g().L()) {
            return true;
        }
        boolean N2 = N(this.f938I, this.f939J, i, i2);
        if (N2) {
            this.f944b = true;
            try {
                P(this.f938I, this.f939J);
            } finally {
                d();
            }
        }
        a0();
        u();
        ((HashMap) this.f945c.f875b).values().removeAll(Collections.singleton(null));
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
                    C0035a c0035a = (C0035a) this.d.get(size);
                    if (i >= 0 && i == c0035a.f1026r) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z2) {
                        while (size > 0) {
                            C0035a c0035a2 = (C0035a) this.d.get(size - 1);
                            if (i < 0 || i != c0035a2.f1026r) {
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
            arrayList.add((C0035a) this.d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void O(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0051q + " nesting=" + abstractComponentCallbacksC0051q.f1113q);
        }
        boolean o2 = abstractComponentCallbacksC0051q.o();
        if (abstractComponentCallbacksC0051q.f1122z && o2) {
            return;
        }
        U.u uVar = this.f945c;
        synchronized (((ArrayList) uVar.f874a)) {
            ((ArrayList) uVar.f874a).remove(abstractComponentCallbacksC0051q);
        }
        abstractComponentCallbacksC0051q.f1107k = false;
        if (F(abstractComponentCallbacksC0051q)) {
            this.f934D = true;
        }
        abstractComponentCallbacksC0051q.f1108l = true;
        W(abstractComponentCallbacksC0051q);
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
            if (!((C0035a) arrayList.get(i)).f1023o) {
                if (i2 != i) {
                    z(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0035a) arrayList.get(i2)).f1023o) {
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
                bundle2.setClassLoader(this.f959t.f1130f.getClassLoader());
                this.f950k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f959t.f1130f.getClassLoader());
                arrayList.add((N) bundle.getParcelable("state"));
            }
        }
        U.u uVar = this.f945c;
        HashMap hashMap = (HashMap) uVar.f876c;
        hashMap.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            N n2 = (N) it.next();
            hashMap.put(n2.f979b, n2);
        }
        J j2 = (J) bundle3.getParcelable("state");
        if (j2 == null) {
            return;
        }
        HashMap hashMap2 = (HashMap) uVar.f875b;
        hashMap2.clear();
        Iterator it2 = j2.f966a.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            i = 2;
            jVar = this.f951l;
            if (!hasNext) {
                break;
            }
            N n3 = (N) ((HashMap) uVar.f876c).remove((String) it2.next());
            if (n3 != null) {
                AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = (AbstractComponentCallbacksC0051q) this.f941L.f973b.get(n3.f979b);
                if (abstractComponentCallbacksC0051q != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0051q);
                    }
                    o2 = new O(jVar, uVar, abstractComponentCallbacksC0051q, n3);
                } else {
                    o2 = new O(this.f951l, this.f945c, this.f959t.f1130f.getClassLoader(), C(), n3);
                }
                AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q2 = o2.f990c;
                abstractComponentCallbacksC0051q2.f1114r = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0051q2.f1103e + "): " + abstractComponentCallbacksC0051q2);
                }
                o2.m(this.f959t.f1130f.getClassLoader());
                uVar.m(o2);
                o2.f991e = this.f958s;
            }
        }
        L l2 = this.f941L;
        l2.getClass();
        Iterator it3 = new ArrayList(l2.f973b.values()).iterator();
        while (it3.hasNext()) {
            AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q3 = (AbstractComponentCallbacksC0051q) it3.next();
            if (hashMap2.get(abstractComponentCallbacksC0051q3.f1103e) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0051q3 + " that was not found in the set of active Fragments " + j2.f966a);
                }
                this.f941L.e(abstractComponentCallbacksC0051q3);
                abstractComponentCallbacksC0051q3.f1114r = this;
                O o3 = new O(jVar, uVar, abstractComponentCallbacksC0051q3);
                o3.f991e = 1;
                o3.k();
                abstractComponentCallbacksC0051q3.f1108l = true;
                o3.k();
            }
        }
        ArrayList<String> arrayList2 = j2.f967b;
        ((ArrayList) uVar.f874a).clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                AbstractComponentCallbacksC0051q d = uVar.d(str3);
                if (d == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str3 + ")");
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + d);
                }
                uVar.a(d);
            }
        }
        if (j2.f968c != null) {
            this.d = new ArrayList(j2.f968c.length);
            int i3 = 0;
            while (true) {
                C0036b[] c0036bArr = j2.f968c;
                if (i3 >= c0036bArr.length) {
                    break;
                }
                C0036b c0036b = c0036bArr[i3];
                c0036b.getClass();
                C0035a c0035a = new C0035a(this);
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    int[] iArr = c0036b.f1027a;
                    if (i4 >= iArr.length) {
                        break;
                    }
                    P p2 = new P();
                    int i6 = i4 + 1;
                    p2.f992a = iArr[i4];
                    if (Log.isLoggable("FragmentManager", i)) {
                        Log.v("FragmentManager", "Instantiate " + c0035a + " op #" + i5 + " base fragment #" + iArr[i6]);
                    }
                    p2.h = EnumC0072m.values()[c0036b.f1029c[i5]];
                    p2.i = EnumC0072m.values()[c0036b.d[i5]];
                    int i7 = i4 + 2;
                    p2.f994c = iArr[i6] != 0;
                    int i8 = iArr[i7];
                    p2.d = i8;
                    int i9 = iArr[i4 + 3];
                    p2.f995e = i9;
                    int i10 = i4 + 5;
                    int i11 = iArr[i4 + 4];
                    p2.f996f = i11;
                    i4 += 6;
                    int i12 = iArr[i10];
                    p2.f997g = i12;
                    c0035a.f1013b = i8;
                    c0035a.f1014c = i9;
                    c0035a.d = i11;
                    c0035a.f1015e = i12;
                    c0035a.b(p2);
                    i5++;
                    i = 2;
                }
                c0035a.f1016f = c0036b.f1030e;
                c0035a.h = c0036b.f1031f;
                c0035a.f1017g = true;
                c0035a.i = c0036b.h;
                c0035a.f1018j = c0036b.i;
                c0035a.f1019k = c0036b.f1033j;
                c0035a.f1020l = c0036b.f1034k;
                c0035a.f1021m = c0036b.f1035l;
                c0035a.f1022n = c0036b.f1036m;
                c0035a.f1023o = c0036b.f1037n;
                c0035a.f1026r = c0036b.f1032g;
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = c0036b.f1028b;
                    if (i13 >= arrayList3.size()) {
                        break;
                    }
                    String str4 = (String) arrayList3.get(i13);
                    if (str4 != null) {
                        ((P) c0035a.f1012a.get(i13)).f993b = uVar.d(str4);
                    }
                    i13++;
                }
                c0035a.c(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i3 + " (index " + c0035a.f1026r + "): " + c0035a);
                    PrintWriter printWriter = new PrintWriter(new S());
                    c0035a.d("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(c0035a);
                i3++;
                i = 2;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.d = null;
        }
        this.i.set(j2.d);
        String str5 = j2.f969e;
        if (str5 != null) {
            AbstractComponentCallbacksC0051q d2 = uVar.d(str5);
            this.f962w = d2;
            q(d2);
        }
        ArrayList arrayList4 = j2.f970f;
        if (arrayList4 != null) {
            for (int i14 = i2; i14 < arrayList4.size(); i14++) {
                this.f949j.put((String) arrayList4.get(i14), (C0037c) j2.f971g.get(i14));
            }
        }
        this.f933C = new ArrayDeque(j2.h);
    }

    public final Bundle R() {
        int i;
        ArrayList arrayList;
        C0036b[] c0036bArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0043i c0043i = (C0043i) it.next();
            if (c0043i.f1054e) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0043i.f1054e = false;
                c0043i.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((C0043i) it2.next()).e();
        }
        y(true);
        this.f935E = true;
        this.f941L.f977g = true;
        U.u uVar = this.f945c;
        uVar.getClass();
        HashMap hashMap = (HashMap) uVar.f875b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (O o2 : hashMap.values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = o2.f990c;
                N n2 = new N(abstractComponentCallbacksC0051q);
                if (abstractComponentCallbacksC0051q.f1100a <= -1 || n2.f987m != null) {
                    n2.f987m = abstractComponentCallbacksC0051q.f1101b;
                } else {
                    Bundle bundle2 = new Bundle();
                    abstractComponentCallbacksC0051q.x(bundle2);
                    abstractComponentCallbacksC0051q.f1097P.c(bundle2);
                    bundle2.putParcelable("android:support:fragments", abstractComponentCallbacksC0051q.f1116t.R());
                    o2.f988a.o(false);
                    if (bundle2.isEmpty()) {
                        bundle2 = null;
                    }
                    if (abstractComponentCallbacksC0051q.f1087E != null) {
                        o2.o();
                    }
                    if (abstractComponentCallbacksC0051q.f1102c != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putSparseParcelableArray("android:view_state", abstractComponentCallbacksC0051q.f1102c);
                    }
                    if (abstractComponentCallbacksC0051q.d != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBundle("android:view_registry_state", abstractComponentCallbacksC0051q.d);
                    }
                    if (!abstractComponentCallbacksC0051q.f1088G) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBoolean("android:user_visible_hint", abstractComponentCallbacksC0051q.f1088G);
                    }
                    n2.f987m = bundle2;
                    if (abstractComponentCallbacksC0051q.h != null) {
                        if (bundle2 == null) {
                            n2.f987m = new Bundle();
                        }
                        n2.f987m.putString("android:target_state", abstractComponentCallbacksC0051q.h);
                        int i2 = abstractComponentCallbacksC0051q.i;
                        if (i2 != 0) {
                            n2.f987m.putInt("android:target_req_state", i2);
                        }
                    }
                }
                AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q2 = o2.f990c;
                arrayList2.add(abstractComponentCallbacksC0051q2.f1103e);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0051q2 + ": " + abstractComponentCallbacksC0051q2.f1101b);
                }
            }
        }
        U.u uVar2 = this.f945c;
        uVar2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) uVar2.f876c).values());
        if (!arrayList3.isEmpty()) {
            U.u uVar3 = this.f945c;
            synchronized (((ArrayList) uVar3.f874a)) {
                try {
                    if (((ArrayList) uVar3.f874a).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) uVar3.f874a).size());
                        Iterator it3 = ((ArrayList) uVar3.f874a).iterator();
                        while (it3.hasNext()) {
                            AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q3 = (AbstractComponentCallbacksC0051q) it3.next();
                            arrayList.add(abstractComponentCallbacksC0051q3.f1103e);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0051q3.f1103e + "): " + abstractComponentCallbacksC0051q3);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList4 = this.d;
            if (arrayList4 == null || (size = arrayList4.size()) <= 0) {
                c0036bArr = null;
            } else {
                c0036bArr = new C0036b[size];
                for (i = 0; i < size; i++) {
                    c0036bArr[i] = new C0036b((C0035a) this.d.get(i));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.d.get(i));
                    }
                }
            }
            J j2 = new J();
            j2.f969e = null;
            ArrayList arrayList5 = new ArrayList();
            j2.f970f = arrayList5;
            ArrayList arrayList6 = new ArrayList();
            j2.f971g = arrayList6;
            j2.f966a = arrayList2;
            j2.f967b = arrayList;
            j2.f968c = c0036bArr;
            j2.d = this.i.get();
            AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q4 = this.f962w;
            if (abstractComponentCallbacksC0051q4 != null) {
                j2.f969e = abstractComponentCallbacksC0051q4.f1103e;
            }
            arrayList5.addAll(this.f949j.keySet());
            arrayList6.addAll(this.f949j.values());
            j2.h = new ArrayList(this.f933C);
            bundle.putParcelable("state", j2);
            for (String str : this.f950k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f950k.get(str));
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                N n3 = (N) it4.next();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("state", n3);
                bundle.putBundle("fragment_" + n3.f979b, bundle3);
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public final void S() {
        synchronized (this.f943a) {
            try {
                if (this.f943a.size() == 1) {
                    this.f959t.f1131g.removeCallbacks(this.f942M);
                    this.f959t.f1131g.post(this.f942M);
                    a0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void T(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q, boolean z2) {
        ViewGroup B2 = B(abstractComponentCallbacksC0051q);
        if (B2 == null || !(B2 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) B2).setDrawDisappearingViewsLast(!z2);
    }

    public final void U(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q, EnumC0072m enumC0072m) {
        if (abstractComponentCallbacksC0051q.equals(this.f945c.d(abstractComponentCallbacksC0051q.f1103e)) && (abstractComponentCallbacksC0051q.f1115s == null || abstractComponentCallbacksC0051q.f1114r == this)) {
            abstractComponentCallbacksC0051q.f1093L = enumC0072m;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0051q + " is not an active fragment of FragmentManager " + this);
    }

    public final void V(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        if (abstractComponentCallbacksC0051q != null) {
            if (!abstractComponentCallbacksC0051q.equals(this.f945c.d(abstractComponentCallbacksC0051q.f1103e)) || (abstractComponentCallbacksC0051q.f1115s != null && abstractComponentCallbacksC0051q.f1114r != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0051q + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q2 = this.f962w;
        this.f962w = abstractComponentCallbacksC0051q;
        q(abstractComponentCallbacksC0051q2);
        q(this.f962w);
    }

    public final void W(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        ViewGroup B2 = B(abstractComponentCallbacksC0051q);
        if (B2 != null) {
            C0050p c0050p = abstractComponentCallbacksC0051q.f1089H;
            if ((c0050p == null ? 0 : c0050p.f1077e) + (c0050p == null ? 0 : c0050p.d) + (c0050p == null ? 0 : c0050p.f1076c) + (c0050p == null ? 0 : c0050p.f1075b) > 0) {
                if (B2.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    B2.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0051q);
                }
                AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q2 = (AbstractComponentCallbacksC0051q) B2.getTag(R.id.visible_removing_fragment_view_tag);
                C0050p c0050p2 = abstractComponentCallbacksC0051q.f1089H;
                boolean z2 = c0050p2 != null ? c0050p2.f1074a : false;
                if (abstractComponentCallbacksC0051q2.f1089H == null) {
                    return;
                }
                abstractComponentCallbacksC0051q2.f().f1074a = z2;
            }
        }
    }

    public final void Y() {
        Iterator it = this.f945c.h().iterator();
        while (it.hasNext()) {
            O o2 = (O) it.next();
            AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = o2.f990c;
            if (abstractComponentCallbacksC0051q.F) {
                if (this.f944b) {
                    this.f937H = true;
                } else {
                    abstractComponentCallbacksC0051q.F = false;
                    o2.k();
                }
            }
        }
    }

    public final void Z(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new S());
        C0054u c0054u = this.f959t;
        if (c0054u == null) {
            try {
                v("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
                throw illegalStateException;
            }
        }
        try {
            c0054u.i.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw illegalStateException;
        }
    }

    public final O a(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        String str = abstractComponentCallbacksC0051q.f1092K;
        if (str != null) {
            Z.d.c(abstractComponentCallbacksC0051q, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0051q);
        }
        O f2 = f(abstractComponentCallbacksC0051q);
        abstractComponentCallbacksC0051q.f1114r = this;
        U.u uVar = this.f945c;
        uVar.m(f2);
        if (!abstractComponentCallbacksC0051q.f1122z) {
            uVar.a(abstractComponentCallbacksC0051q);
            abstractComponentCallbacksC0051q.f1108l = false;
            if (abstractComponentCallbacksC0051q.f1087E == null) {
                abstractComponentCallbacksC0051q.f1090I = false;
            }
            if (F(abstractComponentCallbacksC0051q)) {
                this.f934D = true;
            }
        }
        return f2;
    }

    public final void a0() {
        synchronized (this.f943a) {
            try {
                if (!this.f943a.isEmpty()) {
                    A a2 = this.h;
                    a2.f919a = true;
                    a.w wVar = a2.f921c;
                    if (wVar != null) {
                        wVar.b();
                    }
                    return;
                }
                A a3 = this.h;
                ArrayList arrayList = this.d;
                a3.f919a = (arrayList != null ? arrayList.size() : 0) > 0 && I(this.f961v);
                a.w wVar2 = a3.f921c;
                if (wVar2 != null) {
                    wVar2.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(C0054u c0054u, w1.l lVar, AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        String str;
        if (this.f959t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f959t = c0054u;
        this.f960u = lVar;
        this.f961v = abstractComponentCallbacksC0051q;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f952m;
        if (abstractComponentCallbacksC0051q != 0) {
            copyOnWriteArrayList.add(new D(abstractComponentCallbacksC0051q));
        } else if (c0054u != null) {
            copyOnWriteArrayList.add(c0054u);
        }
        if (this.f961v != null) {
            a0();
        }
        if (c0054u != null) {
            a.x i = c0054u.i.i();
            this.f948g = i;
            C0054u c0054u2 = abstractComponentCallbacksC0051q != 0 ? abstractComponentCallbacksC0051q : c0054u;
            i.getClass();
            A a2 = this.h;
            d1.d.e(a2, "onBackPressedCallback");
            androidx.lifecycle.t d = c0054u2.d();
            if (d.f1490c != EnumC0072m.f1480a) {
                a2.f920b.add(new a.u(i, d, a2));
                i.d();
                a2.f921c = new a.w(0, i);
            }
        }
        if (abstractComponentCallbacksC0051q != 0) {
            L l2 = abstractComponentCallbacksC0051q.f1114r.f941L;
            HashMap hashMap = l2.f974c;
            L l3 = (L) hashMap.get(abstractComponentCallbacksC0051q.f1103e);
            if (l3 == null) {
                l3 = new L(l2.f975e);
                hashMap.put(abstractComponentCallbacksC0051q.f1103e, l3);
            }
            this.f941L = l3;
        } else if (c0054u != null) {
            this.f941L = (L) new C.g(c0054u.i.c(), L.h).x(L.class);
        } else {
            this.f941L = new L(false);
        }
        L l4 = this.f941L;
        l4.f977g = this.f935E || this.F;
        this.f945c.d = l4;
        C0054u c0054u3 = this.f959t;
        if (c0054u3 != null && abstractComponentCallbacksC0051q == 0) {
            i0.d b2 = c0054u3.b();
            b2.e("android:support:fragments", new r(2, this));
            Bundle c2 = b2.c("android:support:fragments");
            if (c2 != null) {
                Q(c2);
            }
        }
        C0054u c0054u4 = this.f959t;
        if (c0054u4 != null) {
            AbstractActivityC0106i abstractActivityC0106i = c0054u4.i;
            if (abstractComponentCallbacksC0051q != 0) {
                str = abstractComponentCallbacksC0051q.f1103e + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            String f2 = V.f(str2, "StartActivityForResult");
            E e2 = new E(2);
            z zVar = new z(this, 1);
            a.j jVar = abstractActivityC0106i.h;
            this.f965z = jVar.b(f2, e2, zVar);
            this.f931A = jVar.b(V.f(str2, "StartIntentSenderForResult"), new E(0), new z(this, 2));
            this.f932B = jVar.b(V.f(str2, "RequestPermissions"), new E(1), new z(this, 0));
        }
        C0054u c0054u5 = this.f959t;
        if (c0054u5 != null) {
            c0054u5.i.g(this.f953n);
        }
        C0054u c0054u6 = this.f959t;
        if (c0054u6 != null) {
            AbstractActivityC0106i abstractActivityC0106i2 = c0054u6.i;
            y yVar = this.f954o;
            abstractActivityC0106i2.getClass();
            d1.d.e(yVar, "listener");
            abstractActivityC0106i2.f1181j.add(yVar);
        }
        C0054u c0054u7 = this.f959t;
        if (c0054u7 != null) {
            AbstractActivityC0106i abstractActivityC0106i3 = c0054u7.i;
            y yVar2 = this.f955p;
            abstractActivityC0106i3.getClass();
            d1.d.e(yVar2, "listener");
            abstractActivityC0106i3.f1183l.add(yVar2);
        }
        C0054u c0054u8 = this.f959t;
        if (c0054u8 != null) {
            AbstractActivityC0106i abstractActivityC0106i4 = c0054u8.i;
            y yVar3 = this.f956q;
            abstractActivityC0106i4.getClass();
            d1.d.e(yVar3, "listener");
            abstractActivityC0106i4.f1184m.add(yVar3);
        }
        C0054u c0054u9 = this.f959t;
        if (c0054u9 == null || abstractComponentCallbacksC0051q != 0) {
            return;
        }
        AbstractActivityC0106i abstractActivityC0106i5 = c0054u9.i;
        B b3 = this.f957r;
        abstractActivityC0106i5.getClass();
        d1.d.e(b3, "provider");
        C0014l c0014l = abstractActivityC0106i5.f1177c;
        ((CopyOnWriteArrayList) c0014l.f475b).add(b3);
        ((Runnable) c0014l.f474a).run();
    }

    public final void c(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0051q);
        }
        if (abstractComponentCallbacksC0051q.f1122z) {
            abstractComponentCallbacksC0051q.f1122z = false;
            if (abstractComponentCallbacksC0051q.f1107k) {
                return;
            }
            this.f945c.a(abstractComponentCallbacksC0051q);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0051q);
            }
            if (F(abstractComponentCallbacksC0051q)) {
                this.f934D = true;
            }
        }
    }

    public final void d() {
        this.f944b = false;
        this.f939J.clear();
        this.f938I.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f945c.h().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((O) it.next()).f990c.f1086D;
            if (viewGroup != null) {
                hashSet.add(C0043i.f(viewGroup, D()));
            }
        }
        return hashSet;
    }

    public final O f(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        String str = abstractComponentCallbacksC0051q.f1103e;
        U.u uVar = this.f945c;
        O o2 = (O) ((HashMap) uVar.f875b).get(str);
        if (o2 != null) {
            return o2;
        }
        O o3 = new O(this.f951l, uVar, abstractComponentCallbacksC0051q);
        o3.m(this.f959t.f1130f.getClassLoader());
        o3.f991e = this.f958s;
        return o3;
    }

    public final void g(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0051q);
        }
        if (abstractComponentCallbacksC0051q.f1122z) {
            return;
        }
        abstractComponentCallbacksC0051q.f1122z = true;
        if (abstractComponentCallbacksC0051q.f1107k) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0051q);
            }
            U.u uVar = this.f945c;
            synchronized (((ArrayList) uVar.f874a)) {
                ((ArrayList) uVar.f874a).remove(abstractComponentCallbacksC0051q);
            }
            abstractComponentCallbacksC0051q.f1107k = false;
            if (F(abstractComponentCallbacksC0051q)) {
                this.f934D = true;
            }
            W(abstractComponentCallbacksC0051q);
        }
    }

    public final void h(boolean z2) {
        if (z2 && this.f959t != null) {
            Z(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q : this.f945c.j()) {
            if (abstractComponentCallbacksC0051q != null) {
                abstractComponentCallbacksC0051q.f1085C = true;
                if (z2) {
                    abstractComponentCallbacksC0051q.f1116t.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.f958s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q : this.f945c.j()) {
            if (abstractComponentCallbacksC0051q != null) {
                if (!abstractComponentCallbacksC0051q.f1121y ? abstractComponentCallbacksC0051q.f1116t.i() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.f958s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q : this.f945c.j()) {
            if (abstractComponentCallbacksC0051q != null && H(abstractComponentCallbacksC0051q)) {
                if (!abstractComponentCallbacksC0051q.f1121y ? abstractComponentCallbacksC0051q.f1116t.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0051q);
                    z2 = true;
                }
            }
        }
        if (this.f946e != null) {
            for (int i = 0; i < this.f946e.size(); i++) {
                AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q2 = (AbstractComponentCallbacksC0051q) this.f946e.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0051q2)) {
                    abstractComponentCallbacksC0051q2.getClass();
                }
            }
        }
        this.f946e = arrayList;
        return z2;
    }

    public final void k() {
        boolean z2 = true;
        this.f936G = true;
        y(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0043i) it.next()).e();
        }
        C0054u c0054u = this.f959t;
        U.u uVar = this.f945c;
        if (c0054u != null) {
            z2 = ((L) uVar.d).f976f;
        } else {
            AbstractActivityC0106i abstractActivityC0106i = c0054u.f1130f;
            if (abstractActivityC0106i != null) {
                z2 = true ^ abstractActivityC0106i.isChangingConfigurations();
            }
        }
        if (z2) {
            Iterator it2 = this.f949j.values().iterator();
            while (it2.hasNext()) {
                for (String str : ((C0037c) it2.next()).f1038a) {
                    L l2 = (L) uVar.d;
                    l2.getClass();
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    l2.d(str);
                }
            }
        }
        t(-1);
        C0054u c0054u2 = this.f959t;
        if (c0054u2 != null) {
            AbstractActivityC0106i abstractActivityC0106i2 = c0054u2.i;
            y yVar = this.f954o;
            abstractActivityC0106i2.getClass();
            d1.d.e(yVar, "listener");
            abstractActivityC0106i2.f1181j.remove(yVar);
        }
        C0054u c0054u3 = this.f959t;
        if (c0054u3 != null) {
            AbstractActivityC0106i abstractActivityC0106i3 = c0054u3.i;
            y yVar2 = this.f953n;
            abstractActivityC0106i3.getClass();
            d1.d.e(yVar2, "listener");
            abstractActivityC0106i3.i.remove(yVar2);
        }
        C0054u c0054u4 = this.f959t;
        if (c0054u4 != null) {
            AbstractActivityC0106i abstractActivityC0106i4 = c0054u4.i;
            y yVar3 = this.f955p;
            abstractActivityC0106i4.getClass();
            d1.d.e(yVar3, "listener");
            abstractActivityC0106i4.f1183l.remove(yVar3);
        }
        C0054u c0054u5 = this.f959t;
        if (c0054u5 != null) {
            AbstractActivityC0106i abstractActivityC0106i5 = c0054u5.i;
            y yVar4 = this.f956q;
            abstractActivityC0106i5.getClass();
            d1.d.e(yVar4, "listener");
            abstractActivityC0106i5.f1184m.remove(yVar4);
        }
        C0054u c0054u6 = this.f959t;
        if (c0054u6 != null) {
            AbstractActivityC0106i abstractActivityC0106i6 = c0054u6.i;
            B b2 = this.f957r;
            abstractActivityC0106i6.getClass();
            d1.d.e(b2, "provider");
            C0014l c0014l = abstractActivityC0106i6.f1177c;
            ((CopyOnWriteArrayList) c0014l.f475b).remove(b2);
            if (((HashMap) c0014l.f476c).remove(b2) != null) {
                throw new ClassCastException();
            }
            ((Runnable) c0014l.f474a).run();
        }
        this.f959t = null;
        this.f960u = null;
        this.f961v = null;
        if (this.f948g != null) {
            Iterator it3 = this.h.f920b.iterator();
            while (it3.hasNext()) {
                ((a.c) it3.next()).cancel();
            }
            this.f948g = null;
        }
        B.j jVar = this.f965z;
        if (jVar != null) {
            jVar.K();
            this.f931A.K();
            this.f932B.K();
        }
    }

    public final void l(boolean z2) {
        if (z2 && this.f959t != null) {
            Z(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q : this.f945c.j()) {
            if (abstractComponentCallbacksC0051q != null) {
                abstractComponentCallbacksC0051q.f1085C = true;
                if (z2) {
                    abstractComponentCallbacksC0051q.f1116t.l(true);
                }
            }
        }
    }

    public final void m(boolean z2, boolean z3) {
        if (z3 && this.f959t != null) {
            Z(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q : this.f945c.j()) {
            if (abstractComponentCallbacksC0051q != null && z3) {
                abstractComponentCallbacksC0051q.f1116t.m(z2, true);
            }
        }
    }

    public final void n() {
        Iterator it = this.f945c.i().iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = (AbstractComponentCallbacksC0051q) it.next();
            if (abstractComponentCallbacksC0051q != null) {
                abstractComponentCallbacksC0051q.n();
                abstractComponentCallbacksC0051q.f1116t.n();
            }
        }
    }

    public final boolean o() {
        if (this.f958s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q : this.f945c.j()) {
            if (abstractComponentCallbacksC0051q != null) {
                if (!abstractComponentCallbacksC0051q.f1121y ? abstractComponentCallbacksC0051q.f1116t.o() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f958s < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q : this.f945c.j()) {
            if (abstractComponentCallbacksC0051q != null && !abstractComponentCallbacksC0051q.f1121y) {
                abstractComponentCallbacksC0051q.f1116t.p();
            }
        }
    }

    public final void q(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        if (abstractComponentCallbacksC0051q != null) {
            if (abstractComponentCallbacksC0051q.equals(this.f945c.d(abstractComponentCallbacksC0051q.f1103e))) {
                abstractComponentCallbacksC0051q.f1114r.getClass();
                boolean I2 = I(abstractComponentCallbacksC0051q);
                Boolean bool = abstractComponentCallbacksC0051q.f1106j;
                if (bool == null || bool.booleanValue() != I2) {
                    abstractComponentCallbacksC0051q.f1106j = Boolean.valueOf(I2);
                    I i = abstractComponentCallbacksC0051q.f1116t;
                    i.a0();
                    i.q(i.f962w);
                }
            }
        }
    }

    public final void r(boolean z2, boolean z3) {
        if (z3 && this.f959t != null) {
            Z(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q : this.f945c.j()) {
            if (abstractComponentCallbacksC0051q != null && z3) {
                abstractComponentCallbacksC0051q.f1116t.r(z2, true);
            }
        }
    }

    public final boolean s() {
        if (this.f958s < 1) {
            return false;
        }
        boolean z2 = false;
        for (AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q : this.f945c.j()) {
            if (abstractComponentCallbacksC0051q != null && H(abstractComponentCallbacksC0051q)) {
                if (!abstractComponentCallbacksC0051q.f1121y ? abstractComponentCallbacksC0051q.f1116t.s() : false) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final void t(int i) {
        try {
            this.f944b = true;
            for (O o2 : ((HashMap) this.f945c.f875b).values()) {
                if (o2 != null) {
                    o2.f991e = i;
                }
            }
            J(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0043i) it.next()).e();
            }
            this.f944b = false;
            y(true);
        } catch (Throwable th) {
            this.f944b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f961v;
        if (abstractComponentCallbacksC0051q != null) {
            sb.append(abstractComponentCallbacksC0051q.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f961v)));
            sb.append("}");
        } else {
            C0054u c0054u = this.f959t;
            if (c0054u != null) {
                sb.append(c0054u.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f959t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u() {
        if (this.f937H) {
            this.f937H = false;
            Y();
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String f2 = V.f(str, "    ");
        U.u uVar = this.f945c;
        uVar.getClass();
        String str3 = str + "    ";
        HashMap hashMap = (HashMap) uVar.f875b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (O o2 : hashMap.values()) {
                printWriter.print(str);
                if (o2 != null) {
                    AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = o2.f990c;
                    printWriter.println(abstractComponentCallbacksC0051q);
                    abstractComponentCallbacksC0051q.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0051q.f1118v));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0051q.f1119w));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0051q.f1120x);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0051q.f1100a);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0051q.f1103e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0051q.f1113q);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0051q.f1107k);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0051q.f1108l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0051q.f1109m);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0051q.f1110n);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0051q.f1121y);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0051q.f1122z);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0051q.f1084B);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0051q.f1083A);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0051q.f1088G);
                    if (abstractComponentCallbacksC0051q.f1114r != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0051q.f1114r);
                    }
                    if (abstractComponentCallbacksC0051q.f1115s != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0051q.f1115s);
                    }
                    if (abstractComponentCallbacksC0051q.f1117u != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0051q.f1117u);
                    }
                    if (abstractComponentCallbacksC0051q.f1104f != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0051q.f1104f);
                    }
                    if (abstractComponentCallbacksC0051q.f1101b != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0051q.f1101b);
                    }
                    if (abstractComponentCallbacksC0051q.f1102c != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0051q.f1102c);
                    }
                    if (abstractComponentCallbacksC0051q.d != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0051q.d);
                    }
                    Object obj = abstractComponentCallbacksC0051q.f1105g;
                    if (obj == null) {
                        I i = abstractComponentCallbacksC0051q.f1114r;
                        obj = (i == null || (str2 = abstractComponentCallbacksC0051q.h) == null) ? null : i.f945c.d(str2);
                    }
                    if (obj != null) {
                        printWriter.print(str3);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC0051q.i);
                    }
                    printWriter.print(str3);
                    printWriter.print("mPopDirection=");
                    C0050p c0050p = abstractComponentCallbacksC0051q.f1089H;
                    printWriter.println(c0050p == null ? false : c0050p.f1074a);
                    C0050p c0050p2 = abstractComponentCallbacksC0051q.f1089H;
                    if ((c0050p2 == null ? 0 : c0050p2.f1075b) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        C0050p c0050p3 = abstractComponentCallbacksC0051q.f1089H;
                        printWriter.println(c0050p3 == null ? 0 : c0050p3.f1075b);
                    }
                    C0050p c0050p4 = abstractComponentCallbacksC0051q.f1089H;
                    if ((c0050p4 == null ? 0 : c0050p4.f1076c) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        C0050p c0050p5 = abstractComponentCallbacksC0051q.f1089H;
                        printWriter.println(c0050p5 == null ? 0 : c0050p5.f1076c);
                    }
                    C0050p c0050p6 = abstractComponentCallbacksC0051q.f1089H;
                    if ((c0050p6 == null ? 0 : c0050p6.d) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        C0050p c0050p7 = abstractComponentCallbacksC0051q.f1089H;
                        printWriter.println(c0050p7 == null ? 0 : c0050p7.d);
                    }
                    C0050p c0050p8 = abstractComponentCallbacksC0051q.f1089H;
                    if ((c0050p8 == null ? 0 : c0050p8.f1077e) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        C0050p c0050p9 = abstractComponentCallbacksC0051q.f1089H;
                        printWriter.println(c0050p9 == null ? 0 : c0050p9.f1077e);
                    }
                    if (abstractComponentCallbacksC0051q.f1086D != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0051q.f1086D);
                    }
                    if (abstractComponentCallbacksC0051q.f1087E != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0051q.f1087E);
                    }
                    if (abstractComponentCallbacksC0051q.h() != null) {
                        o.l lVar = ((C0087a) new C.g(abstractComponentCallbacksC0051q.c(), C0087a.f2011c).x(C0087a.class)).f2012b;
                        if (lVar.f3249c > 0) {
                            printWriter.print(str3);
                            printWriter.println("Loaders:");
                            if (lVar.f3249c > 0) {
                                if (lVar.f3248b[0] != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(str3);
                                printWriter.print("  #");
                                printWriter.print(lVar.f3247a[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + abstractComponentCallbacksC0051q.f1116t + ":");
                    abstractComponentCallbacksC0051q.f1116t.v(V.f(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) uVar.f874a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size3; i2++) {
                AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q2 = (AbstractComponentCallbacksC0051q) arrayList.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0051q2.toString());
            }
        }
        ArrayList arrayList2 = this.f946e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q3 = (AbstractComponentCallbacksC0051q) this.f946e.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0051q3.toString());
            }
        }
        ArrayList arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size; i4++) {
                C0035a c0035a = (C0035a) this.d.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(c0035a.toString());
                c0035a.d(f2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.f943a) {
            try {
                int size4 = this.f943a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i5 = 0; i5 < size4; i5++) {
                        Object obj2 = (G) this.f943a.get(i5);
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
        printWriter.println(this.f959t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f960u);
        if (this.f961v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f961v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f958s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f935E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f936G);
        if (this.f934D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f934D);
        }
    }

    public final void w(G g2, boolean z2) {
        if (!z2) {
            if (this.f959t == null) {
                if (!this.f936G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f935E || this.F) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f943a) {
            try {
                if (this.f959t == null) {
                    if (!z2) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f943a.add(g2);
                    S();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(boolean z2) {
        if (this.f944b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f959t == null) {
            if (!this.f936G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f959t.f1131g.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2 && (this.f935E || this.F)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f938I == null) {
            this.f938I = new ArrayList();
            this.f939J = new ArrayList();
        }
    }

    public final boolean y(boolean z2) {
        boolean z3;
        x(z2);
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.f938I;
            ArrayList arrayList2 = this.f939J;
            synchronized (this.f943a) {
                if (this.f943a.isEmpty()) {
                    z3 = false;
                } else {
                    try {
                        int size = this.f943a.size();
                        z3 = false;
                        for (int i = 0; i < size; i++) {
                            z3 |= ((G) this.f943a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z3) {
                a0();
                u();
                ((HashMap) this.f945c.f875b).values().removeAll(Collections.singleton(null));
                return z4;
            }
            z4 = true;
            this.f944b = true;
            try {
                P(this.f938I, this.f939J);
            } finally {
                d();
            }
        }
    }

    public final void z(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        U.u uVar;
        U.u uVar2;
        U.u uVar3;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        boolean z2 = ((C0035a) arrayList3.get(i)).f1023o;
        ArrayList arrayList5 = this.f940K;
        if (arrayList5 == null) {
            this.f940K = new ArrayList();
        } else {
            arrayList5.clear();
        }
        ArrayList arrayList6 = this.f940K;
        U.u uVar4 = this.f945c;
        arrayList6.addAll(uVar4.j());
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f962w;
        int i6 = i;
        boolean z3 = false;
        while (true) {
            int i7 = 1;
            if (i6 >= i2) {
                U.u uVar5 = uVar4;
                this.f940K.clear();
                if (!z2 && this.f958s >= 1) {
                    for (int i8 = i; i8 < i2; i8++) {
                        Iterator it = ((C0035a) arrayList.get(i8)).f1012a.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q2 = ((P) it.next()).f993b;
                            if (abstractComponentCallbacksC0051q2 == null || abstractComponentCallbacksC0051q2.f1114r == null) {
                                uVar = uVar5;
                            } else {
                                uVar = uVar5;
                                uVar.m(f(abstractComponentCallbacksC0051q2));
                            }
                            uVar5 = uVar;
                        }
                    }
                }
                for (int i9 = i; i9 < i2; i9++) {
                    C0035a c0035a = (C0035a) arrayList.get(i9);
                    if (((Boolean) arrayList2.get(i9)).booleanValue()) {
                        c0035a.c(-1);
                        ArrayList arrayList7 = c0035a.f1012a;
                        boolean z4 = true;
                        for (int size = arrayList7.size() - 1; size >= 0; size--) {
                            P p2 = (P) arrayList7.get(size);
                            AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q3 = p2.f993b;
                            if (abstractComponentCallbacksC0051q3 != null) {
                                if (abstractComponentCallbacksC0051q3.f1089H != null) {
                                    abstractComponentCallbacksC0051q3.f().f1074a = z4;
                                }
                                int i10 = c0035a.f1016f;
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
                                if (abstractComponentCallbacksC0051q3.f1089H != null || i11 != 0) {
                                    abstractComponentCallbacksC0051q3.f();
                                    abstractComponentCallbacksC0051q3.f1089H.f1078f = i11;
                                }
                                abstractComponentCallbacksC0051q3.f();
                                abstractComponentCallbacksC0051q3.f1089H.getClass();
                            }
                            int i13 = p2.f992a;
                            I i14 = c0035a.f1024p;
                            switch (i13) {
                                case 1:
                                    abstractComponentCallbacksC0051q3.E(p2.d, p2.f995e, p2.f996f, p2.f997g);
                                    z4 = true;
                                    i14.T(abstractComponentCallbacksC0051q3, true);
                                    i14.O(abstractComponentCallbacksC0051q3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + p2.f992a);
                                case 3:
                                    abstractComponentCallbacksC0051q3.E(p2.d, p2.f995e, p2.f996f, p2.f997g);
                                    i14.a(abstractComponentCallbacksC0051q3);
                                    z4 = true;
                                case 4:
                                    abstractComponentCallbacksC0051q3.E(p2.d, p2.f995e, p2.f996f, p2.f997g);
                                    i14.getClass();
                                    X(abstractComponentCallbacksC0051q3);
                                    z4 = true;
                                case 5:
                                    abstractComponentCallbacksC0051q3.E(p2.d, p2.f995e, p2.f996f, p2.f997g);
                                    i14.T(abstractComponentCallbacksC0051q3, true);
                                    i14.E(abstractComponentCallbacksC0051q3);
                                    z4 = true;
                                case 6:
                                    abstractComponentCallbacksC0051q3.E(p2.d, p2.f995e, p2.f996f, p2.f997g);
                                    i14.c(abstractComponentCallbacksC0051q3);
                                    z4 = true;
                                case 7:
                                    abstractComponentCallbacksC0051q3.E(p2.d, p2.f995e, p2.f996f, p2.f997g);
                                    i14.T(abstractComponentCallbacksC0051q3, true);
                                    i14.g(abstractComponentCallbacksC0051q3);
                                    z4 = true;
                                case 8:
                                    i14.V(null);
                                    z4 = true;
                                case 9:
                                    i14.V(abstractComponentCallbacksC0051q3);
                                    z4 = true;
                                case 10:
                                    i14.U(abstractComponentCallbacksC0051q3, p2.h);
                                    z4 = true;
                            }
                        }
                    } else {
                        c0035a.c(1);
                        ArrayList arrayList8 = c0035a.f1012a;
                        int size2 = arrayList8.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            P p3 = (P) arrayList8.get(i15);
                            AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q4 = p3.f993b;
                            if (abstractComponentCallbacksC0051q4 != null) {
                                if (abstractComponentCallbacksC0051q4.f1089H != null) {
                                    abstractComponentCallbacksC0051q4.f().f1074a = false;
                                }
                                int i16 = c0035a.f1016f;
                                if (abstractComponentCallbacksC0051q4.f1089H != null || i16 != 0) {
                                    abstractComponentCallbacksC0051q4.f();
                                    abstractComponentCallbacksC0051q4.f1089H.f1078f = i16;
                                }
                                abstractComponentCallbacksC0051q4.f();
                                abstractComponentCallbacksC0051q4.f1089H.getClass();
                            }
                            int i17 = p3.f992a;
                            I i18 = c0035a.f1024p;
                            switch (i17) {
                                case 1:
                                    abstractComponentCallbacksC0051q4.E(p3.d, p3.f995e, p3.f996f, p3.f997g);
                                    i18.T(abstractComponentCallbacksC0051q4, false);
                                    i18.a(abstractComponentCallbacksC0051q4);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + p3.f992a);
                                case 3:
                                    abstractComponentCallbacksC0051q4.E(p3.d, p3.f995e, p3.f996f, p3.f997g);
                                    i18.O(abstractComponentCallbacksC0051q4);
                                case 4:
                                    abstractComponentCallbacksC0051q4.E(p3.d, p3.f995e, p3.f996f, p3.f997g);
                                    i18.E(abstractComponentCallbacksC0051q4);
                                case 5:
                                    abstractComponentCallbacksC0051q4.E(p3.d, p3.f995e, p3.f996f, p3.f997g);
                                    i18.T(abstractComponentCallbacksC0051q4, false);
                                    X(abstractComponentCallbacksC0051q4);
                                case 6:
                                    abstractComponentCallbacksC0051q4.E(p3.d, p3.f995e, p3.f996f, p3.f997g);
                                    i18.g(abstractComponentCallbacksC0051q4);
                                case 7:
                                    abstractComponentCallbacksC0051q4.E(p3.d, p3.f995e, p3.f996f, p3.f997g);
                                    i18.T(abstractComponentCallbacksC0051q4, false);
                                    i18.c(abstractComponentCallbacksC0051q4);
                                case 8:
                                    i18.V(abstractComponentCallbacksC0051q4);
                                case 9:
                                    i18.V(null);
                                case 10:
                                    i18.U(abstractComponentCallbacksC0051q4, p3.i);
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i19 = i; i19 < i2; i19++) {
                    C0035a c0035a2 = (C0035a) arrayList.get(i19);
                    if (booleanValue) {
                        for (int size3 = c0035a2.f1012a.size() - 1; size3 >= 0; size3--) {
                            AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q5 = ((P) c0035a2.f1012a.get(size3)).f993b;
                            if (abstractComponentCallbacksC0051q5 != null) {
                                f(abstractComponentCallbacksC0051q5).k();
                            }
                        }
                    } else {
                        Iterator it2 = c0035a2.f1012a.iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q6 = ((P) it2.next()).f993b;
                            if (abstractComponentCallbacksC0051q6 != null) {
                                f(abstractComponentCallbacksC0051q6).k();
                            }
                        }
                    }
                }
                J(this.f958s, true);
                HashSet hashSet = new HashSet();
                for (int i20 = i; i20 < i2; i20++) {
                    Iterator it3 = ((C0035a) arrayList.get(i20)).f1012a.iterator();
                    while (it3.hasNext()) {
                        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q7 = ((P) it3.next()).f993b;
                        if (abstractComponentCallbacksC0051q7 != null && (viewGroup = abstractComponentCallbacksC0051q7.f1086D) != null) {
                            hashSet.add(C0043i.f(viewGroup, D()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    C0043i c0043i = (C0043i) it4.next();
                    c0043i.d = booleanValue;
                    synchronized (c0043i.f1052b) {
                        try {
                            c0043i.g();
                            c0043i.f1054e = false;
                            int size4 = c0043i.f1052b.size() - 1;
                            while (true) {
                                if (size4 >= 0) {
                                    U u2 = (U) c0043i.f1052b.get(size4);
                                    int c2 = V.c(u2.f1008c.f1087E);
                                    if (u2.f1006a != 2 || c2 == 2) {
                                        size4--;
                                    } else {
                                        C0050p c0050p = u2.f1008c.f1089H;
                                        c0043i.f1054e = false;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    c0043i.c();
                }
                for (int i21 = i; i21 < i2; i21++) {
                    C0035a c0035a3 = (C0035a) arrayList.get(i21);
                    if (((Boolean) arrayList2.get(i21)).booleanValue() && c0035a3.f1026r >= 0) {
                        c0035a3.f1026r = -1;
                    }
                    c0035a3.getClass();
                }
                return;
            }
            C0035a c0035a4 = (C0035a) arrayList3.get(i6);
            if (((Boolean) arrayList4.get(i6)).booleanValue()) {
                uVar2 = uVar4;
                int i22 = 1;
                ArrayList arrayList9 = this.f940K;
                ArrayList arrayList10 = c0035a4.f1012a;
                int size5 = arrayList10.size() - 1;
                while (size5 >= 0) {
                    P p4 = (P) arrayList10.get(size5);
                    int i23 = p4.f992a;
                    if (i23 != i22) {
                        if (i23 != 3) {
                            switch (i23) {
                                case 8:
                                    abstractComponentCallbacksC0051q = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0051q = p4.f993b;
                                    break;
                                case 10:
                                    p4.i = p4.h;
                                    break;
                            }
                            size5--;
                            i22 = 1;
                        }
                        arrayList9.add(p4.f993b);
                        size5--;
                        i22 = 1;
                    }
                    arrayList9.remove(p4.f993b);
                    size5--;
                    i22 = 1;
                }
            } else {
                ArrayList arrayList11 = this.f940K;
                int i24 = 0;
                while (true) {
                    ArrayList arrayList12 = c0035a4.f1012a;
                    if (i24 < arrayList12.size()) {
                        P p5 = (P) arrayList12.get(i24);
                        int i25 = p5.f992a;
                        if (i25 != i7) {
                            if (i25 != 2) {
                                if (i25 == 3 || i25 == 6) {
                                    arrayList11.remove(p5.f993b);
                                    AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q8 = p5.f993b;
                                    if (abstractComponentCallbacksC0051q8 == abstractComponentCallbacksC0051q) {
                                        arrayList12.add(i24, new P(9, abstractComponentCallbacksC0051q8));
                                        i24++;
                                        uVar3 = uVar4;
                                        i3 = 1;
                                        abstractComponentCallbacksC0051q = null;
                                    }
                                } else if (i25 == 7) {
                                    uVar3 = uVar4;
                                    i3 = 1;
                                } else if (i25 == 8) {
                                    arrayList12.add(i24, new P(9, abstractComponentCallbacksC0051q, 0));
                                    p5.f994c = true;
                                    i24++;
                                    abstractComponentCallbacksC0051q = p5.f993b;
                                }
                                uVar3 = uVar4;
                                i3 = 1;
                            } else {
                                AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q9 = p5.f993b;
                                int i26 = abstractComponentCallbacksC0051q9.f1119w;
                                int size6 = arrayList11.size() - 1;
                                boolean z5 = false;
                                while (size6 >= 0) {
                                    U.u uVar6 = uVar4;
                                    AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q10 = (AbstractComponentCallbacksC0051q) arrayList11.get(size6);
                                    if (abstractComponentCallbacksC0051q10.f1119w != i26) {
                                        i4 = i26;
                                    } else if (abstractComponentCallbacksC0051q10 == abstractComponentCallbacksC0051q9) {
                                        i4 = i26;
                                        z5 = true;
                                    } else {
                                        if (abstractComponentCallbacksC0051q10 == abstractComponentCallbacksC0051q) {
                                            i4 = i26;
                                            arrayList12.add(i24, new P(9, abstractComponentCallbacksC0051q10, 0));
                                            i24++;
                                            i5 = 0;
                                            abstractComponentCallbacksC0051q = null;
                                        } else {
                                            i4 = i26;
                                            i5 = 0;
                                        }
                                        P p6 = new P(3, abstractComponentCallbacksC0051q10, i5);
                                        p6.d = p5.d;
                                        p6.f996f = p5.f996f;
                                        p6.f995e = p5.f995e;
                                        p6.f997g = p5.f997g;
                                        arrayList12.add(i24, p6);
                                        arrayList11.remove(abstractComponentCallbacksC0051q10);
                                        i24++;
                                        abstractComponentCallbacksC0051q = abstractComponentCallbacksC0051q;
                                    }
                                    size6--;
                                    i26 = i4;
                                    uVar4 = uVar6;
                                }
                                uVar3 = uVar4;
                                i3 = 1;
                                if (z5) {
                                    arrayList12.remove(i24);
                                    i24--;
                                } else {
                                    p5.f992a = 1;
                                    p5.f994c = true;
                                    arrayList11.add(abstractComponentCallbacksC0051q9);
                                }
                            }
                            i24 += i3;
                            i7 = i3;
                            uVar4 = uVar3;
                        } else {
                            uVar3 = uVar4;
                            i3 = i7;
                        }
                        arrayList11.add(p5.f993b);
                        i24 += i3;
                        i7 = i3;
                        uVar4 = uVar3;
                    } else {
                        uVar2 = uVar4;
                    }
                }
            }
            z3 = z3 || c0035a4.f1017g;
            i6++;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            uVar4 = uVar2;
        }
    }
}
