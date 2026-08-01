package Y;

import K.C0014l;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.EnumC0073m;
import com.winworm.neongrid.R;
import d0.C0087a;
import g.AbstractActivityC0108i;
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
    public B.j f958A;

    /* renamed from: B, reason: collision with root package name */
    public B.j f959B;

    /* renamed from: C, reason: collision with root package name */
    public ArrayDeque f960C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f961D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f962E;
    public boolean F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f963G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f964H;

    /* renamed from: I, reason: collision with root package name */
    public ArrayList f965I;

    /* renamed from: J, reason: collision with root package name */
    public ArrayList f966J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList f967K;

    /* renamed from: L, reason: collision with root package name */
    public L f968L;

    /* renamed from: M, reason: collision with root package name */
    public final M0.B f969M;

    /* renamed from: b, reason: collision with root package name */
    public boolean f971b;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f973e;

    /* renamed from: g, reason: collision with root package name */
    public a.x f975g;

    /* renamed from: l, reason: collision with root package name */
    public final B.j f978l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f979m;

    /* renamed from: n, reason: collision with root package name */
    public final y f980n;

    /* renamed from: o, reason: collision with root package name */
    public final y f981o;

    /* renamed from: p, reason: collision with root package name */
    public final y f982p;

    /* renamed from: q, reason: collision with root package name */
    public final y f983q;

    /* renamed from: r, reason: collision with root package name */
    public final B f984r;

    /* renamed from: s, reason: collision with root package name */
    public int f985s;

    /* renamed from: t, reason: collision with root package name */
    public C0054u f986t;

    /* renamed from: u, reason: collision with root package name */
    public z1.d f987u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractComponentCallbacksC0051q f988v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractComponentCallbacksC0051q f989w;

    /* renamed from: x, reason: collision with root package name */
    public final C f990x;

    /* renamed from: y, reason: collision with root package name */
    public final J0.e f991y;

    /* renamed from: z, reason: collision with root package name */
    public B.j f992z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f970a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final U.u f972c = new U.u(2);

    /* renamed from: f, reason: collision with root package name */
    public final x f974f = new x(this);
    public final A h = new A(this);
    public final AtomicInteger i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map f976j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map f977k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [Y.y] */
    /* JADX WARN: Type inference failed for: r0v13, types: [Y.y] */
    /* JADX WARN: Type inference failed for: r0v14, types: [Y.y] */
    /* JADX WARN: Type inference failed for: r0v15, types: [Y.y] */
    public I() {
        Collections.synchronizedMap(new HashMap());
        this.f978l = new B.j(this);
        this.f979m = new CopyOnWriteArrayList();
        final int i = 0;
        this.f980n = new J.a(this) { // from class: Y.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1168b;

            {
                this.f1168b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        I i2 = this.f1168b;
                        if (i2.G()) {
                            i2.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i3 = this.f1168b;
                        if (i3.G() && num.intValue() == 80) {
                            i3.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i4 = this.f1168b;
                        if (i4.G()) {
                            i4.m(fVar.f4344a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1168b;
                        if (i5.G()) {
                            i5.r(gVar.f4345a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f981o = new J.a(this) { // from class: Y.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1168b;

            {
                this.f1168b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i2) {
                    case 0:
                        I i22 = this.f1168b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i3 = this.f1168b;
                        if (i3.G() && num.intValue() == 80) {
                            i3.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i4 = this.f1168b;
                        if (i4.G()) {
                            i4.m(fVar.f4344a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1168b;
                        if (i5.G()) {
                            i5.r(gVar.f4345a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.f982p = new J.a(this) { // from class: Y.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1168b;

            {
                this.f1168b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i3) {
                    case 0:
                        I i22 = this.f1168b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i32 = this.f1168b;
                        if (i32.G() && num.intValue() == 80) {
                            i32.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i4 = this.f1168b;
                        if (i4.G()) {
                            i4.m(fVar.f4344a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1168b;
                        if (i5.G()) {
                            i5.r(gVar.f4345a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.f983q = new J.a(this) { // from class: Y.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1168b;

            {
                this.f1168b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i4) {
                    case 0:
                        I i22 = this.f1168b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i32 = this.f1168b;
                        if (i32.G() && num.intValue() == 80) {
                            i32.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i42 = this.f1168b;
                        if (i42.G()) {
                            i42.m(fVar.f4344a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1168b;
                        if (i5.G()) {
                            i5.r(gVar.f4345a, false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f984r = new B(this);
        this.f985s = -1;
        this.f990x = new C(this);
        this.f991y = new J0.e(14);
        this.f960C = new ArrayDeque();
        this.f969M = new M0.B(5, this);
    }

    public static boolean F(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        abstractComponentCallbacksC0051q.getClass();
        Iterator it = abstractComponentCallbacksC0051q.f1143t.f972c.i().iterator();
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
        return abstractComponentCallbacksC0051q.f1111B && (abstractComponentCallbacksC0051q.f1141r == null || H(abstractComponentCallbacksC0051q.f1144u));
    }

    public static boolean I(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        if (abstractComponentCallbacksC0051q == null) {
            return true;
        }
        I i = abstractComponentCallbacksC0051q.f1141r;
        return abstractComponentCallbacksC0051q.equals(i.f989w) && I(i.f988v);
    }

    public static void X(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0051q);
        }
        if (abstractComponentCallbacksC0051q.f1148y) {
            abstractComponentCallbacksC0051q.f1148y = false;
            abstractComponentCallbacksC0051q.f1117I = !abstractComponentCallbacksC0051q.f1117I;
        }
    }

    public final AbstractComponentCallbacksC0051q A(int i) {
        U.u uVar = this.f972c;
        ArrayList arrayList = (ArrayList) uVar.f883a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = (AbstractComponentCallbacksC0051q) arrayList.get(size);
            if (abstractComponentCallbacksC0051q != null && abstractComponentCallbacksC0051q.f1145v == i) {
                return abstractComponentCallbacksC0051q;
            }
        }
        for (O o2 : ((HashMap) uVar.f884b).values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q2 = o2.f1017c;
                if (abstractComponentCallbacksC0051q2.f1145v == i) {
                    return abstractComponentCallbacksC0051q2;
                }
            }
        }
        return null;
    }

    public final ViewGroup B(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        ViewGroup viewGroup = abstractComponentCallbacksC0051q.f1113D;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0051q.f1146w > 0 && this.f987u.e0()) {
            View b02 = this.f987u.b0(abstractComponentCallbacksC0051q.f1146w);
            if (b02 instanceof ViewGroup) {
                return (ViewGroup) b02;
            }
        }
        return null;
    }

    public final C C() {
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f988v;
        return abstractComponentCallbacksC0051q != null ? abstractComponentCallbacksC0051q.f1141r.C() : this.f990x;
    }

    public final J0.e D() {
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f988v;
        return abstractComponentCallbacksC0051q != null ? abstractComponentCallbacksC0051q.f1141r.D() : this.f991y;
    }

    public final void E(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0051q);
        }
        if (abstractComponentCallbacksC0051q.f1148y) {
            return;
        }
        abstractComponentCallbacksC0051q.f1148y = true;
        abstractComponentCallbacksC0051q.f1117I = true ^ abstractComponentCallbacksC0051q.f1117I;
        W(abstractComponentCallbacksC0051q);
    }

    public final boolean G() {
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f988v;
        if (abstractComponentCallbacksC0051q == null) {
            return true;
        }
        return abstractComponentCallbacksC0051q.m() && this.f988v.j().G();
    }

    public final void J(int i, boolean z2) {
        HashMap hashMap;
        C0054u c0054u;
        if (this.f986t == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i != this.f985s) {
            this.f985s = i;
            U.u uVar = this.f972c;
            Iterator it = ((ArrayList) uVar.f883a).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = (HashMap) uVar.f884b;
                if (!hasNext) {
                    break;
                }
                O o2 = (O) hashMap.get(((AbstractComponentCallbacksC0051q) it.next()).f1130e);
                if (o2 != null) {
                    o2.k();
                }
            }
            for (O o3 : hashMap.values()) {
                if (o3 != null) {
                    o3.k();
                    AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = o3.f1017c;
                    if (abstractComponentCallbacksC0051q.f1135l && !abstractComponentCallbacksC0051q.o()) {
                        uVar.n(o3);
                    }
                }
            }
            Y();
            if (this.f961D && (c0054u = this.f986t) != null && this.f985s == 7) {
                c0054u.f1159e.invalidateOptionsMenu();
                this.f961D = false;
            }
        }
    }

    public final void K() {
        if (this.f986t == null) {
            return;
        }
        this.f962E = false;
        this.F = false;
        this.f968L.f1004g = false;
        for (AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q : this.f972c.j()) {
            if (abstractComponentCallbacksC0051q != null) {
                abstractComponentCallbacksC0051q.f1143t.K();
            }
        }
    }

    public final boolean L() {
        return M(-1, 0);
    }

    public final boolean M(int i, int i2) {
        y(false);
        x(true);
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f989w;
        if (abstractComponentCallbacksC0051q != null && i < 0 && abstractComponentCallbacksC0051q.g().L()) {
            return true;
        }
        boolean N2 = N(this.f965I, this.f966J, i, i2);
        if (N2) {
            this.f971b = true;
            try {
                P(this.f965I, this.f966J);
            } finally {
                d();
            }
        }
        a0();
        u();
        ((HashMap) this.f972c.f884b).values().removeAll(Collections.singleton(null));
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
                    if (i >= 0 && i == c0035a.f1053r) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z2) {
                        while (size > 0) {
                            C0035a c0035a2 = (C0035a) this.d.get(size - 1);
                            if (i < 0 || i != c0035a2.f1053r) {
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
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0051q + " nesting=" + abstractComponentCallbacksC0051q.f1140q);
        }
        boolean o2 = abstractComponentCallbacksC0051q.o();
        if (abstractComponentCallbacksC0051q.f1149z && o2) {
            return;
        }
        U.u uVar = this.f972c;
        synchronized (((ArrayList) uVar.f883a)) {
            ((ArrayList) uVar.f883a).remove(abstractComponentCallbacksC0051q);
        }
        abstractComponentCallbacksC0051q.f1134k = false;
        if (F(abstractComponentCallbacksC0051q)) {
            this.f961D = true;
        }
        abstractComponentCallbacksC0051q.f1135l = true;
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
            if (!((C0035a) arrayList.get(i)).f1050o) {
                if (i2 != i) {
                    z(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0035a) arrayList.get(i2)).f1050o) {
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
                bundle2.setClassLoader(this.f986t.f1157b.getClassLoader());
                this.f977k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f986t.f1157b.getClassLoader());
                arrayList.add((N) bundle.getParcelable("state"));
            }
        }
        U.u uVar = this.f972c;
        HashMap hashMap = (HashMap) uVar.f885c;
        hashMap.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            N n2 = (N) it.next();
            hashMap.put(n2.f1006b, n2);
        }
        J j2 = (J) bundle3.getParcelable("state");
        if (j2 == null) {
            return;
        }
        HashMap hashMap2 = (HashMap) uVar.f884b;
        hashMap2.clear();
        Iterator it2 = j2.f993a.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            i = 2;
            jVar = this.f978l;
            if (!hasNext) {
                break;
            }
            N n3 = (N) ((HashMap) uVar.f885c).remove((String) it2.next());
            if (n3 != null) {
                AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = (AbstractComponentCallbacksC0051q) this.f968L.f1000b.get(n3.f1006b);
                if (abstractComponentCallbacksC0051q != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0051q);
                    }
                    o2 = new O(jVar, uVar, abstractComponentCallbacksC0051q, n3);
                } else {
                    o2 = new O(this.f978l, this.f972c, this.f986t.f1157b.getClassLoader(), C(), n3);
                }
                AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q2 = o2.f1017c;
                abstractComponentCallbacksC0051q2.f1141r = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0051q2.f1130e + "): " + abstractComponentCallbacksC0051q2);
                }
                o2.m(this.f986t.f1157b.getClassLoader());
                uVar.m(o2);
                o2.f1018e = this.f985s;
            }
        }
        L l2 = this.f968L;
        l2.getClass();
        Iterator it3 = new ArrayList(l2.f1000b.values()).iterator();
        while (it3.hasNext()) {
            AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q3 = (AbstractComponentCallbacksC0051q) it3.next();
            if (hashMap2.get(abstractComponentCallbacksC0051q3.f1130e) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0051q3 + " that was not found in the set of active Fragments " + j2.f993a);
                }
                this.f968L.e(abstractComponentCallbacksC0051q3);
                abstractComponentCallbacksC0051q3.f1141r = this;
                O o3 = new O(jVar, uVar, abstractComponentCallbacksC0051q3);
                o3.f1018e = 1;
                o3.k();
                abstractComponentCallbacksC0051q3.f1135l = true;
                o3.k();
            }
        }
        ArrayList<String> arrayList2 = j2.f994b;
        ((ArrayList) uVar.f883a).clear();
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
        if (j2.f995c != null) {
            this.d = new ArrayList(j2.f995c.length);
            int i3 = 0;
            while (true) {
                C0036b[] c0036bArr = j2.f995c;
                if (i3 >= c0036bArr.length) {
                    break;
                }
                C0036b c0036b = c0036bArr[i3];
                c0036b.getClass();
                C0035a c0035a = new C0035a(this);
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    int[] iArr = c0036b.f1054a;
                    if (i4 >= iArr.length) {
                        break;
                    }
                    P p2 = new P();
                    int i6 = i4 + 1;
                    p2.f1019a = iArr[i4];
                    if (Log.isLoggable("FragmentManager", i)) {
                        Log.v("FragmentManager", "Instantiate " + c0035a + " op #" + i5 + " base fragment #" + iArr[i6]);
                    }
                    p2.h = EnumC0073m.values()[c0036b.f1056c[i5]];
                    p2.i = EnumC0073m.values()[c0036b.d[i5]];
                    int i7 = i4 + 2;
                    p2.f1021c = iArr[i6] != 0;
                    int i8 = iArr[i7];
                    p2.d = i8;
                    int i9 = iArr[i4 + 3];
                    p2.f1022e = i9;
                    int i10 = i4 + 5;
                    int i11 = iArr[i4 + 4];
                    p2.f1023f = i11;
                    i4 += 6;
                    int i12 = iArr[i10];
                    p2.f1024g = i12;
                    c0035a.f1040b = i8;
                    c0035a.f1041c = i9;
                    c0035a.d = i11;
                    c0035a.f1042e = i12;
                    c0035a.b(p2);
                    i5++;
                    i = 2;
                }
                c0035a.f1043f = c0036b.f1057e;
                c0035a.h = c0036b.f1058f;
                c0035a.f1044g = true;
                c0035a.i = c0036b.h;
                c0035a.f1045j = c0036b.i;
                c0035a.f1046k = c0036b.f1060j;
                c0035a.f1047l = c0036b.f1061k;
                c0035a.f1048m = c0036b.f1062l;
                c0035a.f1049n = c0036b.f1063m;
                c0035a.f1050o = c0036b.f1064n;
                c0035a.f1053r = c0036b.f1059g;
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = c0036b.f1055b;
                    if (i13 >= arrayList3.size()) {
                        break;
                    }
                    String str4 = (String) arrayList3.get(i13);
                    if (str4 != null) {
                        ((P) c0035a.f1039a.get(i13)).f1020b = uVar.d(str4);
                    }
                    i13++;
                }
                c0035a.c(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i3 + " (index " + c0035a.f1053r + "): " + c0035a);
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
        String str5 = j2.f996e;
        if (str5 != null) {
            AbstractComponentCallbacksC0051q d2 = uVar.d(str5);
            this.f989w = d2;
            q(d2);
        }
        ArrayList arrayList4 = j2.f997f;
        if (arrayList4 != null) {
            for (int i14 = i2; i14 < arrayList4.size(); i14++) {
                this.f976j.put((String) arrayList4.get(i14), (C0037c) j2.f998g.get(i14));
            }
        }
        this.f960C = new ArrayDeque(j2.h);
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
            if (c0043i.f1081e) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0043i.f1081e = false;
                c0043i.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((C0043i) it2.next()).e();
        }
        y(true);
        this.f962E = true;
        this.f968L.f1004g = true;
        U.u uVar = this.f972c;
        uVar.getClass();
        HashMap hashMap = (HashMap) uVar.f884b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (O o2 : hashMap.values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = o2.f1017c;
                N n2 = new N(abstractComponentCallbacksC0051q);
                if (abstractComponentCallbacksC0051q.f1127a <= -1 || n2.f1014m != null) {
                    n2.f1014m = abstractComponentCallbacksC0051q.f1128b;
                } else {
                    Bundle bundle2 = new Bundle();
                    abstractComponentCallbacksC0051q.x(bundle2);
                    abstractComponentCallbacksC0051q.f1124P.c(bundle2);
                    bundle2.putParcelable("android:support:fragments", abstractComponentCallbacksC0051q.f1143t.R());
                    o2.f1015a.o(false);
                    if (bundle2.isEmpty()) {
                        bundle2 = null;
                    }
                    if (abstractComponentCallbacksC0051q.f1114E != null) {
                        o2.o();
                    }
                    if (abstractComponentCallbacksC0051q.f1129c != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putSparseParcelableArray("android:view_state", abstractComponentCallbacksC0051q.f1129c);
                    }
                    if (abstractComponentCallbacksC0051q.d != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBundle("android:view_registry_state", abstractComponentCallbacksC0051q.d);
                    }
                    if (!abstractComponentCallbacksC0051q.f1115G) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBoolean("android:user_visible_hint", abstractComponentCallbacksC0051q.f1115G);
                    }
                    n2.f1014m = bundle2;
                    if (abstractComponentCallbacksC0051q.h != null) {
                        if (bundle2 == null) {
                            n2.f1014m = new Bundle();
                        }
                        n2.f1014m.putString("android:target_state", abstractComponentCallbacksC0051q.h);
                        int i2 = abstractComponentCallbacksC0051q.i;
                        if (i2 != 0) {
                            n2.f1014m.putInt("android:target_req_state", i2);
                        }
                    }
                }
                AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q2 = o2.f1017c;
                arrayList2.add(abstractComponentCallbacksC0051q2.f1130e);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0051q2 + ": " + abstractComponentCallbacksC0051q2.f1128b);
                }
            }
        }
        U.u uVar2 = this.f972c;
        uVar2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) uVar2.f885c).values());
        if (!arrayList3.isEmpty()) {
            U.u uVar3 = this.f972c;
            synchronized (((ArrayList) uVar3.f883a)) {
                try {
                    if (((ArrayList) uVar3.f883a).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) uVar3.f883a).size());
                        Iterator it3 = ((ArrayList) uVar3.f883a).iterator();
                        while (it3.hasNext()) {
                            AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q3 = (AbstractComponentCallbacksC0051q) it3.next();
                            arrayList.add(abstractComponentCallbacksC0051q3.f1130e);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0051q3.f1130e + "): " + abstractComponentCallbacksC0051q3);
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
            j2.f996e = null;
            ArrayList arrayList5 = new ArrayList();
            j2.f997f = arrayList5;
            ArrayList arrayList6 = new ArrayList();
            j2.f998g = arrayList6;
            j2.f993a = arrayList2;
            j2.f994b = arrayList;
            j2.f995c = c0036bArr;
            j2.d = this.i.get();
            AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q4 = this.f989w;
            if (abstractComponentCallbacksC0051q4 != null) {
                j2.f996e = abstractComponentCallbacksC0051q4.f1130e;
            }
            arrayList5.addAll(this.f976j.keySet());
            arrayList6.addAll(this.f976j.values());
            j2.h = new ArrayList(this.f960C);
            bundle.putParcelable("state", j2);
            for (String str : this.f977k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f977k.get(str));
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                N n3 = (N) it4.next();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("state", n3);
                bundle.putBundle("fragment_" + n3.f1006b, bundle3);
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public final void S() {
        synchronized (this.f970a) {
            try {
                if (this.f970a.size() == 1) {
                    this.f986t.f1158c.removeCallbacks(this.f969M);
                    this.f986t.f1158c.post(this.f969M);
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

    public final void U(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q, EnumC0073m enumC0073m) {
        if (abstractComponentCallbacksC0051q.equals(this.f972c.d(abstractComponentCallbacksC0051q.f1130e)) && (abstractComponentCallbacksC0051q.f1142s == null || abstractComponentCallbacksC0051q.f1141r == this)) {
            abstractComponentCallbacksC0051q.f1120L = enumC0073m;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0051q + " is not an active fragment of FragmentManager " + this);
    }

    public final void V(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        if (abstractComponentCallbacksC0051q != null) {
            if (!abstractComponentCallbacksC0051q.equals(this.f972c.d(abstractComponentCallbacksC0051q.f1130e)) || (abstractComponentCallbacksC0051q.f1142s != null && abstractComponentCallbacksC0051q.f1141r != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0051q + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q2 = this.f989w;
        this.f989w = abstractComponentCallbacksC0051q;
        q(abstractComponentCallbacksC0051q2);
        q(this.f989w);
    }

    public final void W(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        ViewGroup B2 = B(abstractComponentCallbacksC0051q);
        if (B2 != null) {
            C0050p c0050p = abstractComponentCallbacksC0051q.f1116H;
            if ((c0050p == null ? 0 : c0050p.f1104e) + (c0050p == null ? 0 : c0050p.d) + (c0050p == null ? 0 : c0050p.f1103c) + (c0050p == null ? 0 : c0050p.f1102b) > 0) {
                if (B2.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    B2.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0051q);
                }
                AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q2 = (AbstractComponentCallbacksC0051q) B2.getTag(R.id.visible_removing_fragment_view_tag);
                C0050p c0050p2 = abstractComponentCallbacksC0051q.f1116H;
                boolean z2 = c0050p2 != null ? c0050p2.f1101a : false;
                if (abstractComponentCallbacksC0051q2.f1116H == null) {
                    return;
                }
                abstractComponentCallbacksC0051q2.f().f1101a = z2;
            }
        }
    }

    public final void Y() {
        Iterator it = this.f972c.h().iterator();
        while (it.hasNext()) {
            O o2 = (O) it.next();
            AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = o2.f1017c;
            if (abstractComponentCallbacksC0051q.F) {
                if (this.f971b) {
                    this.f964H = true;
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
        C0054u c0054u = this.f986t;
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
            c0054u.f1159e.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw illegalStateException;
        }
    }

    public final O a(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        String str = abstractComponentCallbacksC0051q.f1119K;
        if (str != null) {
            Z.d.c(abstractComponentCallbacksC0051q, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0051q);
        }
        O f2 = f(abstractComponentCallbacksC0051q);
        abstractComponentCallbacksC0051q.f1141r = this;
        U.u uVar = this.f972c;
        uVar.m(f2);
        if (!abstractComponentCallbacksC0051q.f1149z) {
            uVar.a(abstractComponentCallbacksC0051q);
            abstractComponentCallbacksC0051q.f1135l = false;
            if (abstractComponentCallbacksC0051q.f1114E == null) {
                abstractComponentCallbacksC0051q.f1117I = false;
            }
            if (F(abstractComponentCallbacksC0051q)) {
                this.f961D = true;
            }
        }
        return f2;
    }

    public final void a0() {
        synchronized (this.f970a) {
            try {
                if (!this.f970a.isEmpty()) {
                    A a2 = this.h;
                    a2.f946a = true;
                    a.w wVar = a2.f948c;
                    if (wVar != null) {
                        wVar.b();
                    }
                    return;
                }
                A a3 = this.h;
                ArrayList arrayList = this.d;
                a3.f946a = (arrayList != null ? arrayList.size() : 0) > 0 && I(this.f988v);
                a.w wVar2 = a3.f948c;
                if (wVar2 != null) {
                    wVar2.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(C0054u c0054u, z1.d dVar, AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        String str;
        if (this.f986t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f986t = c0054u;
        this.f987u = dVar;
        this.f988v = abstractComponentCallbacksC0051q;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f979m;
        if (abstractComponentCallbacksC0051q != 0) {
            copyOnWriteArrayList.add(new D(abstractComponentCallbacksC0051q));
        } else if (c0054u != null) {
            copyOnWriteArrayList.add(c0054u);
        }
        if (this.f988v != null) {
            a0();
        }
        if (c0054u != null) {
            a.x i = c0054u.f1159e.i();
            this.f975g = i;
            C0054u c0054u2 = abstractComponentCallbacksC0051q != 0 ? abstractComponentCallbacksC0051q : c0054u;
            i.getClass();
            A a2 = this.h;
            g1.d.e(a2, "onBackPressedCallback");
            androidx.lifecycle.t e2 = c0054u2.e();
            if (e2.f1521c != EnumC0073m.f1511a) {
                a2.f947b.add(new a.u(i, e2, a2));
                i.d();
                a2.f948c = new a.w(0, i);
            }
        }
        if (abstractComponentCallbacksC0051q != 0) {
            L l2 = abstractComponentCallbacksC0051q.f1141r.f968L;
            HashMap hashMap = l2.f1001c;
            L l3 = (L) hashMap.get(abstractComponentCallbacksC0051q.f1130e);
            if (l3 == null) {
                l3 = new L(l2.f1002e);
                hashMap.put(abstractComponentCallbacksC0051q.f1130e, l3);
            }
            this.f968L = l3;
        } else if (c0054u != null) {
            this.f968L = (L) new C.g(c0054u.f1159e.c(), L.h).z(L.class);
        } else {
            this.f968L = new L(false);
        }
        L l4 = this.f968L;
        l4.f1004g = this.f962E || this.F;
        this.f972c.d = l4;
        C0054u c0054u3 = this.f986t;
        if (c0054u3 != null && abstractComponentCallbacksC0051q == 0) {
            i0.d b2 = c0054u3.b();
            b2.e("android:support:fragments", new r(2, this));
            Bundle c2 = b2.c("android:support:fragments");
            if (c2 != null) {
                Q(c2);
            }
        }
        C0054u c0054u4 = this.f986t;
        if (c0054u4 != null) {
            AbstractActivityC0108i abstractActivityC0108i = c0054u4.f1159e;
            if (abstractComponentCallbacksC0051q != 0) {
                str = abstractComponentCallbacksC0051q.f1130e + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            String f2 = V.f(str2, "StartActivityForResult");
            E e3 = new E(2);
            z zVar = new z(this, 1);
            a.j jVar = abstractActivityC0108i.h;
            this.f992z = jVar.b(f2, e3, zVar);
            this.f958A = jVar.b(V.f(str2, "StartIntentSenderForResult"), new E(0), new z(this, 2));
            this.f959B = jVar.b(V.f(str2, "RequestPermissions"), new E(1), new z(this, 0));
        }
        C0054u c0054u5 = this.f986t;
        if (c0054u5 != null) {
            c0054u5.f1159e.g(this.f980n);
        }
        C0054u c0054u6 = this.f986t;
        if (c0054u6 != null) {
            AbstractActivityC0108i abstractActivityC0108i2 = c0054u6.f1159e;
            y yVar = this.f981o;
            abstractActivityC0108i2.getClass();
            g1.d.e(yVar, "listener");
            abstractActivityC0108i2.f1211j.add(yVar);
        }
        C0054u c0054u7 = this.f986t;
        if (c0054u7 != null) {
            AbstractActivityC0108i abstractActivityC0108i3 = c0054u7.f1159e;
            y yVar2 = this.f982p;
            abstractActivityC0108i3.getClass();
            g1.d.e(yVar2, "listener");
            abstractActivityC0108i3.f1213l.add(yVar2);
        }
        C0054u c0054u8 = this.f986t;
        if (c0054u8 != null) {
            AbstractActivityC0108i abstractActivityC0108i4 = c0054u8.f1159e;
            y yVar3 = this.f983q;
            abstractActivityC0108i4.getClass();
            g1.d.e(yVar3, "listener");
            abstractActivityC0108i4.f1214m.add(yVar3);
        }
        C0054u c0054u9 = this.f986t;
        if (c0054u9 == null || abstractComponentCallbacksC0051q != 0) {
            return;
        }
        AbstractActivityC0108i abstractActivityC0108i5 = c0054u9.f1159e;
        B b3 = this.f984r;
        abstractActivityC0108i5.getClass();
        g1.d.e(b3, "provider");
        C0014l c0014l = abstractActivityC0108i5.f1207c;
        ((CopyOnWriteArrayList) c0014l.f492b).add(b3);
        ((Runnable) c0014l.f491a).run();
    }

    public final void c(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0051q);
        }
        if (abstractComponentCallbacksC0051q.f1149z) {
            abstractComponentCallbacksC0051q.f1149z = false;
            if (abstractComponentCallbacksC0051q.f1134k) {
                return;
            }
            this.f972c.a(abstractComponentCallbacksC0051q);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0051q);
            }
            if (F(abstractComponentCallbacksC0051q)) {
                this.f961D = true;
            }
        }
    }

    public final void d() {
        this.f971b = false;
        this.f966J.clear();
        this.f965I.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f972c.h().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((O) it.next()).f1017c.f1113D;
            if (viewGroup != null) {
                hashSet.add(C0043i.f(viewGroup, D()));
            }
        }
        return hashSet;
    }

    public final O f(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        String str = abstractComponentCallbacksC0051q.f1130e;
        U.u uVar = this.f972c;
        O o2 = (O) ((HashMap) uVar.f884b).get(str);
        if (o2 != null) {
            return o2;
        }
        O o3 = new O(this.f978l, uVar, abstractComponentCallbacksC0051q);
        o3.m(this.f986t.f1157b.getClassLoader());
        o3.f1018e = this.f985s;
        return o3;
    }

    public final void g(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0051q);
        }
        if (abstractComponentCallbacksC0051q.f1149z) {
            return;
        }
        abstractComponentCallbacksC0051q.f1149z = true;
        if (abstractComponentCallbacksC0051q.f1134k) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0051q);
            }
            U.u uVar = this.f972c;
            synchronized (((ArrayList) uVar.f883a)) {
                ((ArrayList) uVar.f883a).remove(abstractComponentCallbacksC0051q);
            }
            abstractComponentCallbacksC0051q.f1134k = false;
            if (F(abstractComponentCallbacksC0051q)) {
                this.f961D = true;
            }
            W(abstractComponentCallbacksC0051q);
        }
    }

    public final void h(boolean z2) {
        if (z2 && this.f986t != null) {
            Z(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q : this.f972c.j()) {
            if (abstractComponentCallbacksC0051q != null) {
                abstractComponentCallbacksC0051q.f1112C = true;
                if (z2) {
                    abstractComponentCallbacksC0051q.f1143t.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.f985s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q : this.f972c.j()) {
            if (abstractComponentCallbacksC0051q != null) {
                if (!abstractComponentCallbacksC0051q.f1148y ? abstractComponentCallbacksC0051q.f1143t.i() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.f985s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q : this.f972c.j()) {
            if (abstractComponentCallbacksC0051q != null && H(abstractComponentCallbacksC0051q)) {
                if (!abstractComponentCallbacksC0051q.f1148y ? abstractComponentCallbacksC0051q.f1143t.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0051q);
                    z2 = true;
                }
            }
        }
        if (this.f973e != null) {
            for (int i = 0; i < this.f973e.size(); i++) {
                AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q2 = (AbstractComponentCallbacksC0051q) this.f973e.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0051q2)) {
                    abstractComponentCallbacksC0051q2.getClass();
                }
            }
        }
        this.f973e = arrayList;
        return z2;
    }

    public final void k() {
        boolean z2 = true;
        this.f963G = true;
        y(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0043i) it.next()).e();
        }
        C0054u c0054u = this.f986t;
        U.u uVar = this.f972c;
        if (c0054u != null) {
            z2 = ((L) uVar.d).f1003f;
        } else {
            AbstractActivityC0108i abstractActivityC0108i = c0054u.f1157b;
            if (abstractActivityC0108i != null) {
                z2 = true ^ abstractActivityC0108i.isChangingConfigurations();
            }
        }
        if (z2) {
            Iterator it2 = this.f976j.values().iterator();
            while (it2.hasNext()) {
                for (String str : ((C0037c) it2.next()).f1065a) {
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
        C0054u c0054u2 = this.f986t;
        if (c0054u2 != null) {
            AbstractActivityC0108i abstractActivityC0108i2 = c0054u2.f1159e;
            y yVar = this.f981o;
            abstractActivityC0108i2.getClass();
            g1.d.e(yVar, "listener");
            abstractActivityC0108i2.f1211j.remove(yVar);
        }
        C0054u c0054u3 = this.f986t;
        if (c0054u3 != null) {
            AbstractActivityC0108i abstractActivityC0108i3 = c0054u3.f1159e;
            y yVar2 = this.f980n;
            abstractActivityC0108i3.getClass();
            g1.d.e(yVar2, "listener");
            abstractActivityC0108i3.i.remove(yVar2);
        }
        C0054u c0054u4 = this.f986t;
        if (c0054u4 != null) {
            AbstractActivityC0108i abstractActivityC0108i4 = c0054u4.f1159e;
            y yVar3 = this.f982p;
            abstractActivityC0108i4.getClass();
            g1.d.e(yVar3, "listener");
            abstractActivityC0108i4.f1213l.remove(yVar3);
        }
        C0054u c0054u5 = this.f986t;
        if (c0054u5 != null) {
            AbstractActivityC0108i abstractActivityC0108i5 = c0054u5.f1159e;
            y yVar4 = this.f983q;
            abstractActivityC0108i5.getClass();
            g1.d.e(yVar4, "listener");
            abstractActivityC0108i5.f1214m.remove(yVar4);
        }
        C0054u c0054u6 = this.f986t;
        if (c0054u6 != null) {
            AbstractActivityC0108i abstractActivityC0108i6 = c0054u6.f1159e;
            B b2 = this.f984r;
            abstractActivityC0108i6.getClass();
            g1.d.e(b2, "provider");
            C0014l c0014l = abstractActivityC0108i6.f1207c;
            ((CopyOnWriteArrayList) c0014l.f492b).remove(b2);
            if (((HashMap) c0014l.f493c).remove(b2) != null) {
                throw new ClassCastException();
            }
            ((Runnable) c0014l.f491a).run();
        }
        this.f986t = null;
        this.f987u = null;
        this.f988v = null;
        if (this.f975g != null) {
            Iterator it3 = this.h.f947b.iterator();
            while (it3.hasNext()) {
                ((a.c) it3.next()).cancel();
            }
            this.f975g = null;
        }
        B.j jVar = this.f992z;
        if (jVar != null) {
            jVar.K();
            this.f958A.K();
            this.f959B.K();
        }
    }

    public final void l(boolean z2) {
        if (z2 && this.f986t != null) {
            Z(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q : this.f972c.j()) {
            if (abstractComponentCallbacksC0051q != null) {
                abstractComponentCallbacksC0051q.f1112C = true;
                if (z2) {
                    abstractComponentCallbacksC0051q.f1143t.l(true);
                }
            }
        }
    }

    public final void m(boolean z2, boolean z3) {
        if (z3 && this.f986t != null) {
            Z(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q : this.f972c.j()) {
            if (abstractComponentCallbacksC0051q != null && z3) {
                abstractComponentCallbacksC0051q.f1143t.m(z2, true);
            }
        }
    }

    public final void n() {
        Iterator it = this.f972c.i().iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = (AbstractComponentCallbacksC0051q) it.next();
            if (abstractComponentCallbacksC0051q != null) {
                abstractComponentCallbacksC0051q.n();
                abstractComponentCallbacksC0051q.f1143t.n();
            }
        }
    }

    public final boolean o() {
        if (this.f985s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q : this.f972c.j()) {
            if (abstractComponentCallbacksC0051q != null) {
                if (!abstractComponentCallbacksC0051q.f1148y ? abstractComponentCallbacksC0051q.f1143t.o() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f985s < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q : this.f972c.j()) {
            if (abstractComponentCallbacksC0051q != null && !abstractComponentCallbacksC0051q.f1148y) {
                abstractComponentCallbacksC0051q.f1143t.p();
            }
        }
    }

    public final void q(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        if (abstractComponentCallbacksC0051q != null) {
            if (abstractComponentCallbacksC0051q.equals(this.f972c.d(abstractComponentCallbacksC0051q.f1130e))) {
                abstractComponentCallbacksC0051q.f1141r.getClass();
                boolean I2 = I(abstractComponentCallbacksC0051q);
                Boolean bool = abstractComponentCallbacksC0051q.f1133j;
                if (bool == null || bool.booleanValue() != I2) {
                    abstractComponentCallbacksC0051q.f1133j = Boolean.valueOf(I2);
                    I i = abstractComponentCallbacksC0051q.f1143t;
                    i.a0();
                    i.q(i.f989w);
                }
            }
        }
    }

    public final void r(boolean z2, boolean z3) {
        if (z3 && this.f986t != null) {
            Z(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q : this.f972c.j()) {
            if (abstractComponentCallbacksC0051q != null && z3) {
                abstractComponentCallbacksC0051q.f1143t.r(z2, true);
            }
        }
    }

    public final boolean s() {
        if (this.f985s < 1) {
            return false;
        }
        boolean z2 = false;
        for (AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q : this.f972c.j()) {
            if (abstractComponentCallbacksC0051q != null && H(abstractComponentCallbacksC0051q)) {
                if (!abstractComponentCallbacksC0051q.f1148y ? abstractComponentCallbacksC0051q.f1143t.s() : false) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final void t(int i) {
        try {
            this.f971b = true;
            for (O o2 : ((HashMap) this.f972c.f884b).values()) {
                if (o2 != null) {
                    o2.f1018e = i;
                }
            }
            J(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0043i) it.next()).e();
            }
            this.f971b = false;
            y(true);
        } catch (Throwable th) {
            this.f971b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f988v;
        if (abstractComponentCallbacksC0051q != null) {
            sb.append(abstractComponentCallbacksC0051q.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f988v)));
            sb.append("}");
        } else {
            C0054u c0054u = this.f986t;
            if (c0054u != null) {
                sb.append(c0054u.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f986t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u() {
        if (this.f964H) {
            this.f964H = false;
            Y();
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String f2 = V.f(str, "    ");
        U.u uVar = this.f972c;
        uVar.getClass();
        String str3 = str + "    ";
        HashMap hashMap = (HashMap) uVar.f884b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (O o2 : hashMap.values()) {
                printWriter.print(str);
                if (o2 != null) {
                    AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = o2.f1017c;
                    printWriter.println(abstractComponentCallbacksC0051q);
                    abstractComponentCallbacksC0051q.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0051q.f1145v));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0051q.f1146w));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0051q.f1147x);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0051q.f1127a);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0051q.f1130e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0051q.f1140q);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0051q.f1134k);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0051q.f1135l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0051q.f1136m);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0051q.f1137n);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0051q.f1148y);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0051q.f1149z);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0051q.f1111B);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0051q.f1110A);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0051q.f1115G);
                    if (abstractComponentCallbacksC0051q.f1141r != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0051q.f1141r);
                    }
                    if (abstractComponentCallbacksC0051q.f1142s != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0051q.f1142s);
                    }
                    if (abstractComponentCallbacksC0051q.f1144u != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0051q.f1144u);
                    }
                    if (abstractComponentCallbacksC0051q.f1131f != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0051q.f1131f);
                    }
                    if (abstractComponentCallbacksC0051q.f1128b != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0051q.f1128b);
                    }
                    if (abstractComponentCallbacksC0051q.f1129c != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0051q.f1129c);
                    }
                    if (abstractComponentCallbacksC0051q.d != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0051q.d);
                    }
                    Object obj = abstractComponentCallbacksC0051q.f1132g;
                    if (obj == null) {
                        I i = abstractComponentCallbacksC0051q.f1141r;
                        obj = (i == null || (str2 = abstractComponentCallbacksC0051q.h) == null) ? null : i.f972c.d(str2);
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
                    C0050p c0050p = abstractComponentCallbacksC0051q.f1116H;
                    printWriter.println(c0050p == null ? false : c0050p.f1101a);
                    C0050p c0050p2 = abstractComponentCallbacksC0051q.f1116H;
                    if ((c0050p2 == null ? 0 : c0050p2.f1102b) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        C0050p c0050p3 = abstractComponentCallbacksC0051q.f1116H;
                        printWriter.println(c0050p3 == null ? 0 : c0050p3.f1102b);
                    }
                    C0050p c0050p4 = abstractComponentCallbacksC0051q.f1116H;
                    if ((c0050p4 == null ? 0 : c0050p4.f1103c) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        C0050p c0050p5 = abstractComponentCallbacksC0051q.f1116H;
                        printWriter.println(c0050p5 == null ? 0 : c0050p5.f1103c);
                    }
                    C0050p c0050p6 = abstractComponentCallbacksC0051q.f1116H;
                    if ((c0050p6 == null ? 0 : c0050p6.d) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        C0050p c0050p7 = abstractComponentCallbacksC0051q.f1116H;
                        printWriter.println(c0050p7 == null ? 0 : c0050p7.d);
                    }
                    C0050p c0050p8 = abstractComponentCallbacksC0051q.f1116H;
                    if ((c0050p8 == null ? 0 : c0050p8.f1104e) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        C0050p c0050p9 = abstractComponentCallbacksC0051q.f1116H;
                        printWriter.println(c0050p9 == null ? 0 : c0050p9.f1104e);
                    }
                    if (abstractComponentCallbacksC0051q.f1113D != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0051q.f1113D);
                    }
                    if (abstractComponentCallbacksC0051q.f1114E != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0051q.f1114E);
                    }
                    if (abstractComponentCallbacksC0051q.h() != null) {
                        o.l lVar = ((C0087a) new C.g(abstractComponentCallbacksC0051q.c(), C0087a.f2062c).z(C0087a.class)).f2063b;
                        if (lVar.f3295c > 0) {
                            printWriter.print(str3);
                            printWriter.println("Loaders:");
                            if (lVar.f3295c > 0) {
                                if (lVar.f3294b[0] != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(str3);
                                printWriter.print("  #");
                                printWriter.print(lVar.f3293a[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + abstractComponentCallbacksC0051q.f1143t + ":");
                    abstractComponentCallbacksC0051q.f1143t.v(V.f(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) uVar.f883a;
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
        ArrayList arrayList2 = this.f973e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q3 = (AbstractComponentCallbacksC0051q) this.f973e.get(i3);
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
        synchronized (this.f970a) {
            try {
                int size4 = this.f970a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i5 = 0; i5 < size4; i5++) {
                        Object obj2 = (G) this.f970a.get(i5);
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
        printWriter.println(this.f986t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f987u);
        if (this.f988v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f988v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f985s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f962E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f963G);
        if (this.f961D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f961D);
        }
    }

    public final void w(G g2, boolean z2) {
        if (!z2) {
            if (this.f986t == null) {
                if (!this.f963G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f962E || this.F) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f970a) {
            try {
                if (this.f986t == null) {
                    if (!z2) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f970a.add(g2);
                    S();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(boolean z2) {
        if (this.f971b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f986t == null) {
            if (!this.f963G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f986t.f1158c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2 && (this.f962E || this.F)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f965I == null) {
            this.f965I = new ArrayList();
            this.f966J = new ArrayList();
        }
    }

    public final boolean y(boolean z2) {
        boolean z3;
        x(z2);
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.f965I;
            ArrayList arrayList2 = this.f966J;
            synchronized (this.f970a) {
                if (this.f970a.isEmpty()) {
                    z3 = false;
                } else {
                    try {
                        int size = this.f970a.size();
                        z3 = false;
                        for (int i = 0; i < size; i++) {
                            z3 |= ((G) this.f970a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z3) {
                a0();
                u();
                ((HashMap) this.f972c.f884b).values().removeAll(Collections.singleton(null));
                return z4;
            }
            z4 = true;
            this.f971b = true;
            try {
                P(this.f965I, this.f966J);
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
        boolean z2 = ((C0035a) arrayList3.get(i)).f1050o;
        ArrayList arrayList5 = this.f967K;
        if (arrayList5 == null) {
            this.f967K = new ArrayList();
        } else {
            arrayList5.clear();
        }
        ArrayList arrayList6 = this.f967K;
        U.u uVar4 = this.f972c;
        arrayList6.addAll(uVar4.j());
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f989w;
        int i6 = i;
        boolean z3 = false;
        while (true) {
            int i7 = 1;
            if (i6 >= i2) {
                U.u uVar5 = uVar4;
                this.f967K.clear();
                if (!z2 && this.f985s >= 1) {
                    for (int i8 = i; i8 < i2; i8++) {
                        Iterator it = ((C0035a) arrayList.get(i8)).f1039a.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q2 = ((P) it.next()).f1020b;
                            if (abstractComponentCallbacksC0051q2 == null || abstractComponentCallbacksC0051q2.f1141r == null) {
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
                        ArrayList arrayList7 = c0035a.f1039a;
                        boolean z4 = true;
                        for (int size = arrayList7.size() - 1; size >= 0; size--) {
                            P p2 = (P) arrayList7.get(size);
                            AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q3 = p2.f1020b;
                            if (abstractComponentCallbacksC0051q3 != null) {
                                if (abstractComponentCallbacksC0051q3.f1116H != null) {
                                    abstractComponentCallbacksC0051q3.f().f1101a = z4;
                                }
                                int i10 = c0035a.f1043f;
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
                                if (abstractComponentCallbacksC0051q3.f1116H != null || i11 != 0) {
                                    abstractComponentCallbacksC0051q3.f();
                                    abstractComponentCallbacksC0051q3.f1116H.f1105f = i11;
                                }
                                abstractComponentCallbacksC0051q3.f();
                                abstractComponentCallbacksC0051q3.f1116H.getClass();
                            }
                            int i13 = p2.f1019a;
                            I i14 = c0035a.f1051p;
                            switch (i13) {
                                case 1:
                                    abstractComponentCallbacksC0051q3.E(p2.d, p2.f1022e, p2.f1023f, p2.f1024g);
                                    z4 = true;
                                    i14.T(abstractComponentCallbacksC0051q3, true);
                                    i14.O(abstractComponentCallbacksC0051q3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + p2.f1019a);
                                case 3:
                                    abstractComponentCallbacksC0051q3.E(p2.d, p2.f1022e, p2.f1023f, p2.f1024g);
                                    i14.a(abstractComponentCallbacksC0051q3);
                                    z4 = true;
                                case 4:
                                    abstractComponentCallbacksC0051q3.E(p2.d, p2.f1022e, p2.f1023f, p2.f1024g);
                                    i14.getClass();
                                    X(abstractComponentCallbacksC0051q3);
                                    z4 = true;
                                case 5:
                                    abstractComponentCallbacksC0051q3.E(p2.d, p2.f1022e, p2.f1023f, p2.f1024g);
                                    i14.T(abstractComponentCallbacksC0051q3, true);
                                    i14.E(abstractComponentCallbacksC0051q3);
                                    z4 = true;
                                case 6:
                                    abstractComponentCallbacksC0051q3.E(p2.d, p2.f1022e, p2.f1023f, p2.f1024g);
                                    i14.c(abstractComponentCallbacksC0051q3);
                                    z4 = true;
                                case 7:
                                    abstractComponentCallbacksC0051q3.E(p2.d, p2.f1022e, p2.f1023f, p2.f1024g);
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
                        ArrayList arrayList8 = c0035a.f1039a;
                        int size2 = arrayList8.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            P p3 = (P) arrayList8.get(i15);
                            AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q4 = p3.f1020b;
                            if (abstractComponentCallbacksC0051q4 != null) {
                                if (abstractComponentCallbacksC0051q4.f1116H != null) {
                                    abstractComponentCallbacksC0051q4.f().f1101a = false;
                                }
                                int i16 = c0035a.f1043f;
                                if (abstractComponentCallbacksC0051q4.f1116H != null || i16 != 0) {
                                    abstractComponentCallbacksC0051q4.f();
                                    abstractComponentCallbacksC0051q4.f1116H.f1105f = i16;
                                }
                                abstractComponentCallbacksC0051q4.f();
                                abstractComponentCallbacksC0051q4.f1116H.getClass();
                            }
                            int i17 = p3.f1019a;
                            I i18 = c0035a.f1051p;
                            switch (i17) {
                                case 1:
                                    abstractComponentCallbacksC0051q4.E(p3.d, p3.f1022e, p3.f1023f, p3.f1024g);
                                    i18.T(abstractComponentCallbacksC0051q4, false);
                                    i18.a(abstractComponentCallbacksC0051q4);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + p3.f1019a);
                                case 3:
                                    abstractComponentCallbacksC0051q4.E(p3.d, p3.f1022e, p3.f1023f, p3.f1024g);
                                    i18.O(abstractComponentCallbacksC0051q4);
                                case 4:
                                    abstractComponentCallbacksC0051q4.E(p3.d, p3.f1022e, p3.f1023f, p3.f1024g);
                                    i18.E(abstractComponentCallbacksC0051q4);
                                case 5:
                                    abstractComponentCallbacksC0051q4.E(p3.d, p3.f1022e, p3.f1023f, p3.f1024g);
                                    i18.T(abstractComponentCallbacksC0051q4, false);
                                    X(abstractComponentCallbacksC0051q4);
                                case 6:
                                    abstractComponentCallbacksC0051q4.E(p3.d, p3.f1022e, p3.f1023f, p3.f1024g);
                                    i18.g(abstractComponentCallbacksC0051q4);
                                case 7:
                                    abstractComponentCallbacksC0051q4.E(p3.d, p3.f1022e, p3.f1023f, p3.f1024g);
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
                        for (int size3 = c0035a2.f1039a.size() - 1; size3 >= 0; size3--) {
                            AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q5 = ((P) c0035a2.f1039a.get(size3)).f1020b;
                            if (abstractComponentCallbacksC0051q5 != null) {
                                f(abstractComponentCallbacksC0051q5).k();
                            }
                        }
                    } else {
                        Iterator it2 = c0035a2.f1039a.iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q6 = ((P) it2.next()).f1020b;
                            if (abstractComponentCallbacksC0051q6 != null) {
                                f(abstractComponentCallbacksC0051q6).k();
                            }
                        }
                    }
                }
                J(this.f985s, true);
                HashSet hashSet = new HashSet();
                for (int i20 = i; i20 < i2; i20++) {
                    Iterator it3 = ((C0035a) arrayList.get(i20)).f1039a.iterator();
                    while (it3.hasNext()) {
                        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q7 = ((P) it3.next()).f1020b;
                        if (abstractComponentCallbacksC0051q7 != null && (viewGroup = abstractComponentCallbacksC0051q7.f1113D) != null) {
                            hashSet.add(C0043i.f(viewGroup, D()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    C0043i c0043i = (C0043i) it4.next();
                    c0043i.d = booleanValue;
                    synchronized (c0043i.f1079b) {
                        try {
                            c0043i.g();
                            c0043i.f1081e = false;
                            int size4 = c0043i.f1079b.size() - 1;
                            while (true) {
                                if (size4 >= 0) {
                                    U u2 = (U) c0043i.f1079b.get(size4);
                                    int c2 = V.c(u2.f1035c.f1114E);
                                    if (u2.f1033a != 2 || c2 == 2) {
                                        size4--;
                                    } else {
                                        C0050p c0050p = u2.f1035c.f1116H;
                                        c0043i.f1081e = false;
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
                    if (((Boolean) arrayList2.get(i21)).booleanValue() && c0035a3.f1053r >= 0) {
                        c0035a3.f1053r = -1;
                    }
                    c0035a3.getClass();
                }
                return;
            }
            C0035a c0035a4 = (C0035a) arrayList3.get(i6);
            if (((Boolean) arrayList4.get(i6)).booleanValue()) {
                uVar2 = uVar4;
                int i22 = 1;
                ArrayList arrayList9 = this.f967K;
                ArrayList arrayList10 = c0035a4.f1039a;
                int size5 = arrayList10.size() - 1;
                while (size5 >= 0) {
                    P p4 = (P) arrayList10.get(size5);
                    int i23 = p4.f1019a;
                    if (i23 != i22) {
                        if (i23 != 3) {
                            switch (i23) {
                                case 8:
                                    abstractComponentCallbacksC0051q = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0051q = p4.f1020b;
                                    break;
                                case 10:
                                    p4.i = p4.h;
                                    break;
                            }
                            size5--;
                            i22 = 1;
                        }
                        arrayList9.add(p4.f1020b);
                        size5--;
                        i22 = 1;
                    }
                    arrayList9.remove(p4.f1020b);
                    size5--;
                    i22 = 1;
                }
            } else {
                ArrayList arrayList11 = this.f967K;
                int i24 = 0;
                while (true) {
                    ArrayList arrayList12 = c0035a4.f1039a;
                    if (i24 < arrayList12.size()) {
                        P p5 = (P) arrayList12.get(i24);
                        int i25 = p5.f1019a;
                        if (i25 != i7) {
                            if (i25 != 2) {
                                if (i25 == 3 || i25 == 6) {
                                    arrayList11.remove(p5.f1020b);
                                    AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q8 = p5.f1020b;
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
                                    p5.f1021c = true;
                                    i24++;
                                    abstractComponentCallbacksC0051q = p5.f1020b;
                                }
                                uVar3 = uVar4;
                                i3 = 1;
                            } else {
                                AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q9 = p5.f1020b;
                                int i26 = abstractComponentCallbacksC0051q9.f1146w;
                                int size6 = arrayList11.size() - 1;
                                boolean z5 = false;
                                while (size6 >= 0) {
                                    U.u uVar6 = uVar4;
                                    AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q10 = (AbstractComponentCallbacksC0051q) arrayList11.get(size6);
                                    if (abstractComponentCallbacksC0051q10.f1146w != i26) {
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
                                        p6.f1023f = p5.f1023f;
                                        p6.f1022e = p5.f1022e;
                                        p6.f1024g = p5.f1024g;
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
                                    p5.f1019a = 1;
                                    p5.f1021c = true;
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
                        arrayList11.add(p5.f1020b);
                        i24 += i3;
                        i7 = i3;
                        uVar4 = uVar3;
                    } else {
                        uVar2 = uVar4;
                    }
                }
            }
            z3 = z3 || c0035a4.f1044g;
            i6++;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            uVar4 = uVar2;
        }
    }
}
