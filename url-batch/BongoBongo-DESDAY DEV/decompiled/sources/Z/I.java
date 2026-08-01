package Z;

import L.C0014l;
import a.InterfaceC0058c;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.EnumC0079m;
import com.winfour.winrandom.R;
import e0.C0096a;
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
    public C.j f1001A;

    /* renamed from: B, reason: collision with root package name */
    public C.j f1002B;

    /* renamed from: C, reason: collision with root package name */
    public ArrayDeque f1003C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1004D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1005E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f1006F;
    public boolean G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f1007H;

    /* renamed from: I, reason: collision with root package name */
    public ArrayList f1008I;

    /* renamed from: J, reason: collision with root package name */
    public ArrayList f1009J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList f1010K;

    /* renamed from: L, reason: collision with root package name */
    public L f1011L;

    /* renamed from: M, reason: collision with root package name */
    public final N0.B f1012M;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1014b;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f1016e;

    /* renamed from: g, reason: collision with root package name */
    public a.x f1018g;

    /* renamed from: l, reason: collision with root package name */
    public final C.j f1022l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f1023m;

    /* renamed from: n, reason: collision with root package name */
    public final y f1024n;

    /* renamed from: o, reason: collision with root package name */
    public final y f1025o;

    /* renamed from: p, reason: collision with root package name */
    public final y f1026p;

    /* renamed from: q, reason: collision with root package name */
    public final y f1027q;

    /* renamed from: r, reason: collision with root package name */
    public final B f1028r;

    /* renamed from: s, reason: collision with root package name */
    public int f1029s;

    /* renamed from: t, reason: collision with root package name */
    public C0053u f1030t;

    /* renamed from: u, reason: collision with root package name */
    public A1.d f1031u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractComponentCallbacksC0050q f1032v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractComponentCallbacksC0050q f1033w;

    /* renamed from: x, reason: collision with root package name */
    public final C f1034x;

    /* renamed from: y, reason: collision with root package name */
    public final K0.e f1035y;

    /* renamed from: z, reason: collision with root package name */
    public C.j f1036z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1013a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final S0.g f1015c = new S0.g(3);

    /* renamed from: f, reason: collision with root package name */
    public final x f1017f = new x(this);

    /* renamed from: h, reason: collision with root package name */
    public final A f1019h = new A(this);
    public final AtomicInteger i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map f1020j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map f1021k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [Z.y] */
    /* JADX WARN: Type inference failed for: r0v13, types: [Z.y] */
    /* JADX WARN: Type inference failed for: r0v14, types: [Z.y] */
    /* JADX WARN: Type inference failed for: r0v15, types: [Z.y] */
    public I() {
        Collections.synchronizedMap(new HashMap());
        this.f1022l = new C.j(this);
        this.f1023m = new CopyOnWriteArrayList();
        final int i = 0;
        this.f1024n = new K.a(this) { // from class: Z.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1221b;

            {
                this.f1221b = this;
            }

            @Override // K.a
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        I i2 = this.f1221b;
                        if (i2.G()) {
                            i2.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i3 = this.f1221b;
                        if (i3.G() && num.intValue() == 80) {
                            i3.l(false);
                            break;
                        }
                        break;
                    case 2:
                        A.h hVar = (A.h) obj;
                        I i4 = this.f1221b;
                        if (i4.G()) {
                            i4.m(hVar.f17a, false);
                            break;
                        }
                        break;
                    default:
                        A.i iVar = (A.i) obj;
                        I i5 = this.f1221b;
                        if (i5.G()) {
                            i5.r(iVar.f18a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f1025o = new K.a(this) { // from class: Z.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1221b;

            {
                this.f1221b = this;
            }

            @Override // K.a
            public final void a(Object obj) {
                switch (i2) {
                    case 0:
                        I i22 = this.f1221b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i3 = this.f1221b;
                        if (i3.G() && num.intValue() == 80) {
                            i3.l(false);
                            break;
                        }
                        break;
                    case 2:
                        A.h hVar = (A.h) obj;
                        I i4 = this.f1221b;
                        if (i4.G()) {
                            i4.m(hVar.f17a, false);
                            break;
                        }
                        break;
                    default:
                        A.i iVar = (A.i) obj;
                        I i5 = this.f1221b;
                        if (i5.G()) {
                            i5.r(iVar.f18a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.f1026p = new K.a(this) { // from class: Z.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1221b;

            {
                this.f1221b = this;
            }

            @Override // K.a
            public final void a(Object obj) {
                switch (i3) {
                    case 0:
                        I i22 = this.f1221b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i32 = this.f1221b;
                        if (i32.G() && num.intValue() == 80) {
                            i32.l(false);
                            break;
                        }
                        break;
                    case 2:
                        A.h hVar = (A.h) obj;
                        I i4 = this.f1221b;
                        if (i4.G()) {
                            i4.m(hVar.f17a, false);
                            break;
                        }
                        break;
                    default:
                        A.i iVar = (A.i) obj;
                        I i5 = this.f1221b;
                        if (i5.G()) {
                            i5.r(iVar.f18a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.f1027q = new K.a(this) { // from class: Z.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1221b;

            {
                this.f1221b = this;
            }

            @Override // K.a
            public final void a(Object obj) {
                switch (i4) {
                    case 0:
                        I i22 = this.f1221b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i32 = this.f1221b;
                        if (i32.G() && num.intValue() == 80) {
                            i32.l(false);
                            break;
                        }
                        break;
                    case 2:
                        A.h hVar = (A.h) obj;
                        I i42 = this.f1221b;
                        if (i42.G()) {
                            i42.m(hVar.f17a, false);
                            break;
                        }
                        break;
                    default:
                        A.i iVar = (A.i) obj;
                        I i5 = this.f1221b;
                        if (i5.G()) {
                            i5.r(iVar.f18a, false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f1028r = new B(this);
        this.f1029s = -1;
        this.f1034x = new C(this);
        this.f1035y = new K0.e(15);
        this.f1003C = new ArrayDeque();
        this.f1012M = new N0.B(5, this);
    }

    public static boolean F(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        abstractComponentCallbacksC0050q.getClass();
        Iterator it = abstractComponentCallbacksC0050q.f1196t.f1015c.i().iterator();
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
        return abstractComponentCallbacksC0050q.f1163B && (abstractComponentCallbacksC0050q.f1194r == null || H(abstractComponentCallbacksC0050q.f1197u));
    }

    public static boolean I(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        if (abstractComponentCallbacksC0050q == null) {
            return true;
        }
        I i = abstractComponentCallbacksC0050q.f1194r;
        return abstractComponentCallbacksC0050q.equals(i.f1033w) && I(i.f1032v);
    }

    public static void X(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0050q);
        }
        if (abstractComponentCallbacksC0050q.f1201y) {
            abstractComponentCallbacksC0050q.f1201y = false;
            abstractComponentCallbacksC0050q.f1169I = !abstractComponentCallbacksC0050q.f1169I;
        }
    }

    public final AbstractComponentCallbacksC0050q A(int i) {
        S0.g gVar = this.f1015c;
        ArrayList arrayList = (ArrayList) gVar.f822a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = (AbstractComponentCallbacksC0050q) arrayList.get(size);
            if (abstractComponentCallbacksC0050q != null && abstractComponentCallbacksC0050q.f1198v == i) {
                return abstractComponentCallbacksC0050q;
            }
        }
        for (O o2 : ((HashMap) gVar.f823b).values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q2 = o2.f1064c;
                if (abstractComponentCallbacksC0050q2.f1198v == i) {
                    return abstractComponentCallbacksC0050q2;
                }
            }
        }
        return null;
    }

    public final ViewGroup B(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        ViewGroup viewGroup = abstractComponentCallbacksC0050q.f1165D;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0050q.f1199w > 0 && this.f1031u.Z()) {
            View Y2 = this.f1031u.Y(abstractComponentCallbacksC0050q.f1199w);
            if (Y2 instanceof ViewGroup) {
                return (ViewGroup) Y2;
            }
        }
        return null;
    }

    public final C C() {
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1032v;
        return abstractComponentCallbacksC0050q != null ? abstractComponentCallbacksC0050q.f1194r.C() : this.f1034x;
    }

    public final K0.e D() {
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1032v;
        return abstractComponentCallbacksC0050q != null ? abstractComponentCallbacksC0050q.f1194r.D() : this.f1035y;
    }

    public final void E(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0050q);
        }
        if (abstractComponentCallbacksC0050q.f1201y) {
            return;
        }
        abstractComponentCallbacksC0050q.f1201y = true;
        abstractComponentCallbacksC0050q.f1169I = true ^ abstractComponentCallbacksC0050q.f1169I;
        W(abstractComponentCallbacksC0050q);
    }

    public final boolean G() {
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1032v;
        if (abstractComponentCallbacksC0050q == null) {
            return true;
        }
        return abstractComponentCallbacksC0050q.m() && this.f1032v.j().G();
    }

    public final void J(int i, boolean z2) {
        HashMap hashMap;
        C0053u c0053u;
        if (this.f1030t == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i != this.f1029s) {
            this.f1029s = i;
            S0.g gVar = this.f1015c;
            Iterator it = ((ArrayList) gVar.f822a).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = (HashMap) gVar.f823b;
                if (!hasNext) {
                    break;
                }
                O o2 = (O) hashMap.get(((AbstractComponentCallbacksC0050q) it.next()).f1182e);
                if (o2 != null) {
                    o2.k();
                }
            }
            for (O o3 : hashMap.values()) {
                if (o3 != null) {
                    o3.k();
                    AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = o3.f1064c;
                    if (abstractComponentCallbacksC0050q.f1188l && !abstractComponentCallbacksC0050q.o()) {
                        gVar.n(o3);
                    }
                }
            }
            Y();
            if (this.f1004D && (c0053u = this.f1030t) != null && this.f1029s == 7) {
                c0053u.i.invalidateOptionsMenu();
                this.f1004D = false;
            }
        }
    }

    public final void K() {
        if (this.f1030t == null) {
            return;
        }
        this.f1005E = false;
        this.f1006F = false;
        this.f1011L.f1050g = false;
        for (AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q : this.f1015c.j()) {
            if (abstractComponentCallbacksC0050q != null) {
                abstractComponentCallbacksC0050q.f1196t.K();
            }
        }
    }

    public final boolean L() {
        return M(-1, 0);
    }

    public final boolean M(int i, int i2) {
        y(false);
        x(true);
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1033w;
        if (abstractComponentCallbacksC0050q != null && i < 0 && abstractComponentCallbacksC0050q.g().L()) {
            return true;
        }
        boolean N2 = N(this.f1008I, this.f1009J, i, i2);
        if (N2) {
            this.f1014b = true;
            try {
                P(this.f1008I, this.f1009J);
            } finally {
                d();
            }
        }
        a0();
        u();
        ((HashMap) this.f1015c.f823b).values().removeAll(Collections.singleton(null));
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
                    if (i >= 0 && i == c0034a.f1103r) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z2) {
                        while (size > 0) {
                            C0034a c0034a2 = (C0034a) this.d.get(size - 1);
                            if (i < 0 || i != c0034a2.f1103r) {
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
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0050q + " nesting=" + abstractComponentCallbacksC0050q.f1193q);
        }
        boolean o2 = abstractComponentCallbacksC0050q.o();
        if (abstractComponentCallbacksC0050q.f1202z && o2) {
            return;
        }
        S0.g gVar = this.f1015c;
        synchronized (((ArrayList) gVar.f822a)) {
            ((ArrayList) gVar.f822a).remove(abstractComponentCallbacksC0050q);
        }
        abstractComponentCallbacksC0050q.f1187k = false;
        if (F(abstractComponentCallbacksC0050q)) {
            this.f1004D = true;
        }
        abstractComponentCallbacksC0050q.f1188l = true;
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
            if (!((C0034a) arrayList.get(i)).f1100o) {
                if (i2 != i) {
                    z(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0034a) arrayList.get(i2)).f1100o) {
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
        C.j jVar;
        int i2;
        O o2;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f1030t.f1210f.getClassLoader());
                this.f1021k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f1030t.f1210f.getClassLoader());
                arrayList.add((N) bundle.getParcelable("state"));
            }
        }
        S0.g gVar = this.f1015c;
        HashMap hashMap = (HashMap) gVar.f824c;
        hashMap.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            N n2 = (N) it.next();
            hashMap.put(n2.f1052b, n2);
        }
        J j2 = (J) bundle3.getParcelable("state");
        if (j2 == null) {
            return;
        }
        HashMap hashMap2 = (HashMap) gVar.f823b;
        hashMap2.clear();
        Iterator it2 = j2.f1037a.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            i = 2;
            jVar = this.f1022l;
            if (!hasNext) {
                break;
            }
            N n3 = (N) ((HashMap) gVar.f824c).remove((String) it2.next());
            if (n3 != null) {
                AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = (AbstractComponentCallbacksC0050q) this.f1011L.f1046b.get(n3.f1052b);
                if (abstractComponentCallbacksC0050q != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0050q);
                    }
                    o2 = new O(jVar, gVar, abstractComponentCallbacksC0050q, n3);
                } else {
                    o2 = new O(this.f1022l, this.f1015c, this.f1030t.f1210f.getClassLoader(), C(), n3);
                }
                AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q2 = o2.f1064c;
                abstractComponentCallbacksC0050q2.f1194r = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0050q2.f1182e + "): " + abstractComponentCallbacksC0050q2);
                }
                o2.m(this.f1030t.f1210f.getClassLoader());
                gVar.l(o2);
                o2.f1065e = this.f1029s;
            }
        }
        L l2 = this.f1011L;
        l2.getClass();
        Iterator it3 = new ArrayList(l2.f1046b.values()).iterator();
        while (it3.hasNext()) {
            AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q3 = (AbstractComponentCallbacksC0050q) it3.next();
            if (hashMap2.get(abstractComponentCallbacksC0050q3.f1182e) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0050q3 + " that was not found in the set of active Fragments " + j2.f1037a);
                }
                this.f1011L.e(abstractComponentCallbacksC0050q3);
                abstractComponentCallbacksC0050q3.f1194r = this;
                O o3 = new O(jVar, gVar, abstractComponentCallbacksC0050q3);
                o3.f1065e = 1;
                o3.k();
                abstractComponentCallbacksC0050q3.f1188l = true;
                o3.k();
            }
        }
        ArrayList<String> arrayList2 = j2.f1038b;
        ((ArrayList) gVar.f822a).clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                AbstractComponentCallbacksC0050q d = gVar.d(str3);
                if (d == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str3 + ")");
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + d);
                }
                gVar.a(d);
            }
        }
        if (j2.f1039c != null) {
            this.d = new ArrayList(j2.f1039c.length);
            int i3 = 0;
            while (true) {
                C0035b[] c0035bArr = j2.f1039c;
                if (i3 >= c0035bArr.length) {
                    break;
                }
                C0035b c0035b = c0035bArr[i3];
                c0035b.getClass();
                C0034a c0034a = new C0034a(this);
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    int[] iArr = c0035b.f1104a;
                    if (i4 >= iArr.length) {
                        break;
                    }
                    P p2 = new P();
                    int i6 = i4 + 1;
                    p2.f1066a = iArr[i4];
                    if (Log.isLoggable("FragmentManager", i)) {
                        Log.v("FragmentManager", "Instantiate " + c0034a + " op #" + i5 + " base fragment #" + iArr[i6]);
                    }
                    p2.f1072h = EnumC0079m.values()[c0035b.f1106c[i5]];
                    p2.i = EnumC0079m.values()[c0035b.d[i5]];
                    int i7 = i4 + 2;
                    p2.f1068c = iArr[i6] != 0;
                    int i8 = iArr[i7];
                    p2.d = i8;
                    int i9 = iArr[i4 + 3];
                    p2.f1069e = i9;
                    int i10 = i4 + 5;
                    int i11 = iArr[i4 + 4];
                    p2.f1070f = i11;
                    i4 += 6;
                    int i12 = iArr[i10];
                    p2.f1071g = i12;
                    c0034a.f1089b = i8;
                    c0034a.f1090c = i9;
                    c0034a.d = i11;
                    c0034a.f1091e = i12;
                    c0034a.b(p2);
                    i5++;
                    i = 2;
                }
                c0034a.f1092f = c0035b.f1107e;
                c0034a.f1094h = c0035b.f1108f;
                c0034a.f1093g = true;
                c0034a.i = c0035b.f1110h;
                c0034a.f1095j = c0035b.i;
                c0034a.f1096k = c0035b.f1111j;
                c0034a.f1097l = c0035b.f1112k;
                c0034a.f1098m = c0035b.f1113l;
                c0034a.f1099n = c0035b.f1114m;
                c0034a.f1100o = c0035b.f1115n;
                c0034a.f1103r = c0035b.f1109g;
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = c0035b.f1105b;
                    if (i13 >= arrayList3.size()) {
                        break;
                    }
                    String str4 = (String) arrayList3.get(i13);
                    if (str4 != null) {
                        ((P) c0034a.f1088a.get(i13)).f1067b = gVar.d(str4);
                    }
                    i13++;
                }
                c0034a.c(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i3 + " (index " + c0034a.f1103r + "): " + c0034a);
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
        String str5 = j2.f1040e;
        if (str5 != null) {
            AbstractComponentCallbacksC0050q d2 = gVar.d(str5);
            this.f1033w = d2;
            q(d2);
        }
        ArrayList arrayList4 = j2.f1041f;
        if (arrayList4 != null) {
            for (int i14 = i2; i14 < arrayList4.size(); i14++) {
                this.f1020j.put((String) arrayList4.get(i14), (C0036c) j2.f1042g.get(i14));
            }
        }
        this.f1003C = new ArrayDeque(j2.f1043h);
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
            if (c0042i.f1132e) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0042i.f1132e = false;
                c0042i.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((C0042i) it2.next()).e();
        }
        y(true);
        this.f1005E = true;
        this.f1011L.f1050g = true;
        S0.g gVar = this.f1015c;
        gVar.getClass();
        HashMap hashMap = (HashMap) gVar.f823b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (O o2 : hashMap.values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = o2.f1064c;
                N n2 = new N(abstractComponentCallbacksC0050q);
                if (abstractComponentCallbacksC0050q.f1179a <= -1 || n2.f1061m != null) {
                    n2.f1061m = abstractComponentCallbacksC0050q.f1180b;
                } else {
                    Bundle bundle2 = new Bundle();
                    abstractComponentCallbacksC0050q.x(bundle2);
                    abstractComponentCallbacksC0050q.f1176P.c(bundle2);
                    bundle2.putParcelable("android:support:fragments", abstractComponentCallbacksC0050q.f1196t.R());
                    o2.f1062a.p(false);
                    if (bundle2.isEmpty()) {
                        bundle2 = null;
                    }
                    if (abstractComponentCallbacksC0050q.f1166E != null) {
                        o2.o();
                    }
                    if (abstractComponentCallbacksC0050q.f1181c != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putSparseParcelableArray("android:view_state", abstractComponentCallbacksC0050q.f1181c);
                    }
                    if (abstractComponentCallbacksC0050q.d != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBundle("android:view_registry_state", abstractComponentCallbacksC0050q.d);
                    }
                    if (!abstractComponentCallbacksC0050q.G) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBoolean("android:user_visible_hint", abstractComponentCallbacksC0050q.G);
                    }
                    n2.f1061m = bundle2;
                    if (abstractComponentCallbacksC0050q.f1185h != null) {
                        if (bundle2 == null) {
                            n2.f1061m = new Bundle();
                        }
                        n2.f1061m.putString("android:target_state", abstractComponentCallbacksC0050q.f1185h);
                        int i2 = abstractComponentCallbacksC0050q.i;
                        if (i2 != 0) {
                            n2.f1061m.putInt("android:target_req_state", i2);
                        }
                    }
                }
                AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q2 = o2.f1064c;
                arrayList2.add(abstractComponentCallbacksC0050q2.f1182e);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0050q2 + ": " + abstractComponentCallbacksC0050q2.f1180b);
                }
            }
        }
        S0.g gVar2 = this.f1015c;
        gVar2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) gVar2.f824c).values());
        if (!arrayList3.isEmpty()) {
            S0.g gVar3 = this.f1015c;
            synchronized (((ArrayList) gVar3.f822a)) {
                try {
                    if (((ArrayList) gVar3.f822a).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) gVar3.f822a).size());
                        Iterator it3 = ((ArrayList) gVar3.f822a).iterator();
                        while (it3.hasNext()) {
                            AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q3 = (AbstractComponentCallbacksC0050q) it3.next();
                            arrayList.add(abstractComponentCallbacksC0050q3.f1182e);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0050q3.f1182e + "): " + abstractComponentCallbacksC0050q3);
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
            j2.f1040e = null;
            ArrayList arrayList5 = new ArrayList();
            j2.f1041f = arrayList5;
            ArrayList arrayList6 = new ArrayList();
            j2.f1042g = arrayList6;
            j2.f1037a = arrayList2;
            j2.f1038b = arrayList;
            j2.f1039c = c0035bArr;
            j2.d = this.i.get();
            AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q4 = this.f1033w;
            if (abstractComponentCallbacksC0050q4 != null) {
                j2.f1040e = abstractComponentCallbacksC0050q4.f1182e;
            }
            arrayList5.addAll(this.f1020j.keySet());
            arrayList6.addAll(this.f1020j.values());
            j2.f1043h = new ArrayList(this.f1003C);
            bundle.putParcelable("state", j2);
            for (String str : this.f1021k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f1021k.get(str));
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                N n3 = (N) it4.next();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("state", n3);
                bundle.putBundle("fragment_" + n3.f1052b, bundle3);
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public final void S() {
        synchronized (this.f1013a) {
            try {
                if (this.f1013a.size() == 1) {
                    this.f1030t.f1211g.removeCallbacks(this.f1012M);
                    this.f1030t.f1211g.post(this.f1012M);
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

    public final void U(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q, EnumC0079m enumC0079m) {
        if (abstractComponentCallbacksC0050q.equals(this.f1015c.d(abstractComponentCallbacksC0050q.f1182e)) && (abstractComponentCallbacksC0050q.f1195s == null || abstractComponentCallbacksC0050q.f1194r == this)) {
            abstractComponentCallbacksC0050q.f1172L = enumC0079m;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0050q + " is not an active fragment of FragmentManager " + this);
    }

    public final void V(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        if (abstractComponentCallbacksC0050q != null) {
            if (!abstractComponentCallbacksC0050q.equals(this.f1015c.d(abstractComponentCallbacksC0050q.f1182e)) || (abstractComponentCallbacksC0050q.f1195s != null && abstractComponentCallbacksC0050q.f1194r != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0050q + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q2 = this.f1033w;
        this.f1033w = abstractComponentCallbacksC0050q;
        q(abstractComponentCallbacksC0050q2);
        q(this.f1033w);
    }

    public final void W(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        ViewGroup B2 = B(abstractComponentCallbacksC0050q);
        if (B2 != null) {
            C0049p c0049p = abstractComponentCallbacksC0050q.f1168H;
            if ((c0049p == null ? 0 : c0049p.f1155e) + (c0049p == null ? 0 : c0049p.d) + (c0049p == null ? 0 : c0049p.f1154c) + (c0049p == null ? 0 : c0049p.f1153b) > 0) {
                if (B2.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    B2.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0050q);
                }
                AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q2 = (AbstractComponentCallbacksC0050q) B2.getTag(R.id.visible_removing_fragment_view_tag);
                C0049p c0049p2 = abstractComponentCallbacksC0050q.f1168H;
                boolean z2 = c0049p2 != null ? c0049p2.f1152a : false;
                if (abstractComponentCallbacksC0050q2.f1168H == null) {
                    return;
                }
                abstractComponentCallbacksC0050q2.f().f1152a = z2;
            }
        }
    }

    public final void Y() {
        Iterator it = this.f1015c.h().iterator();
        while (it.hasNext()) {
            O o2 = (O) it.next();
            AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = o2.f1064c;
            if (abstractComponentCallbacksC0050q.f1167F) {
                if (this.f1014b) {
                    this.f1007H = true;
                } else {
                    abstractComponentCallbacksC0050q.f1167F = false;
                    o2.k();
                }
            }
        }
    }

    public final void Z(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new S());
        C0053u c0053u = this.f1030t;
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
            c0053u.i.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw illegalStateException;
        }
    }

    public final O a(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        String str = abstractComponentCallbacksC0050q.f1171K;
        if (str != null) {
            a0.d.c(abstractComponentCallbacksC0050q, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0050q);
        }
        O f2 = f(abstractComponentCallbacksC0050q);
        abstractComponentCallbacksC0050q.f1194r = this;
        S0.g gVar = this.f1015c;
        gVar.l(f2);
        if (!abstractComponentCallbacksC0050q.f1202z) {
            gVar.a(abstractComponentCallbacksC0050q);
            abstractComponentCallbacksC0050q.f1188l = false;
            if (abstractComponentCallbacksC0050q.f1166E == null) {
                abstractComponentCallbacksC0050q.f1169I = false;
            }
            if (F(abstractComponentCallbacksC0050q)) {
                this.f1004D = true;
            }
        }
        return f2;
    }

    public final void a0() {
        synchronized (this.f1013a) {
            try {
                if (!this.f1013a.isEmpty()) {
                    A a2 = this.f1019h;
                    a2.f989a = true;
                    a.w wVar = a2.f991c;
                    if (wVar != null) {
                        wVar.b();
                    }
                    return;
                }
                A a3 = this.f1019h;
                ArrayList arrayList = this.d;
                a3.f989a = (arrayList != null ? arrayList.size() : 0) > 0 && I(this.f1032v);
                a.w wVar2 = a3.f991c;
                if (wVar2 != null) {
                    wVar2.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(C0053u c0053u, A1.d dVar, AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        String str;
        if (this.f1030t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f1030t = c0053u;
        this.f1031u = dVar;
        this.f1032v = abstractComponentCallbacksC0050q;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1023m;
        if (abstractComponentCallbacksC0050q != 0) {
            copyOnWriteArrayList.add(new D(abstractComponentCallbacksC0050q));
        } else if (c0053u != null) {
            copyOnWriteArrayList.add(c0053u);
        }
        if (this.f1032v != null) {
            a0();
        }
        if (c0053u != null) {
            a.x i = c0053u.i.i();
            this.f1018g = i;
            C0053u c0053u2 = abstractComponentCallbacksC0050q != 0 ? abstractComponentCallbacksC0050q : c0053u;
            i.getClass();
            A a2 = this.f1019h;
            h1.d.e(a2, "onBackPressedCallback");
            androidx.lifecycle.t d = c0053u2.d();
            if (d.f1582c != EnumC0079m.f1572a) {
                a2.f990b.add(new a.u(i, d, a2));
                i.d();
                a2.f991c = new a.w(0, i);
            }
        }
        if (abstractComponentCallbacksC0050q != 0) {
            L l2 = abstractComponentCallbacksC0050q.f1194r.f1011L;
            HashMap hashMap = l2.f1047c;
            L l3 = (L) hashMap.get(abstractComponentCallbacksC0050q.f1182e);
            if (l3 == null) {
                l3 = new L(l2.f1048e);
                hashMap.put(abstractComponentCallbacksC0050q.f1182e, l3);
            }
            this.f1011L = l3;
        } else if (c0053u != null) {
            this.f1011L = (L) new D.g(c0053u.i.c(), L.f1045h).w(L.class);
        } else {
            this.f1011L = new L(false);
        }
        L l4 = this.f1011L;
        l4.f1050g = this.f1005E || this.f1006F;
        this.f1015c.d = l4;
        C0053u c0053u3 = this.f1030t;
        if (c0053u3 != null && abstractComponentCallbacksC0050q == 0) {
            j0.d b2 = c0053u3.b();
            b2.e("android:support:fragments", new r(2, this));
            Bundle c2 = b2.c("android:support:fragments");
            if (c2 != null) {
                Q(c2);
            }
        }
        C0053u c0053u4 = this.f1030t;
        if (c0053u4 != null) {
            AbstractActivityC0106i abstractActivityC0106i = c0053u4.i;
            if (abstractComponentCallbacksC0050q != 0) {
                str = abstractComponentCallbacksC0050q.f1182e + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            String f2 = V.f(str2, "StartActivityForResult");
            E e2 = new E(2);
            z zVar = new z(this, 1);
            a.j jVar = abstractActivityC0106i.f1256h;
            this.f1036z = jVar.b(f2, e2, zVar);
            this.f1001A = jVar.b(V.f(str2, "StartIntentSenderForResult"), new E(0), new z(this, 2));
            this.f1002B = jVar.b(V.f(str2, "RequestPermissions"), new E(1), new z(this, 0));
        }
        C0053u c0053u5 = this.f1030t;
        if (c0053u5 != null) {
            c0053u5.i.g(this.f1024n);
        }
        C0053u c0053u6 = this.f1030t;
        if (c0053u6 != null) {
            AbstractActivityC0106i abstractActivityC0106i2 = c0053u6.i;
            y yVar = this.f1025o;
            abstractActivityC0106i2.getClass();
            h1.d.e(yVar, "listener");
            abstractActivityC0106i2.f1257j.add(yVar);
        }
        C0053u c0053u7 = this.f1030t;
        if (c0053u7 != null) {
            AbstractActivityC0106i abstractActivityC0106i3 = c0053u7.i;
            y yVar2 = this.f1026p;
            abstractActivityC0106i3.getClass();
            h1.d.e(yVar2, "listener");
            abstractActivityC0106i3.f1259l.add(yVar2);
        }
        C0053u c0053u8 = this.f1030t;
        if (c0053u8 != null) {
            AbstractActivityC0106i abstractActivityC0106i4 = c0053u8.i;
            y yVar3 = this.f1027q;
            abstractActivityC0106i4.getClass();
            h1.d.e(yVar3, "listener");
            abstractActivityC0106i4.f1260m.add(yVar3);
        }
        C0053u c0053u9 = this.f1030t;
        if (c0053u9 == null || abstractComponentCallbacksC0050q != 0) {
            return;
        }
        AbstractActivityC0106i abstractActivityC0106i5 = c0053u9.i;
        B b3 = this.f1028r;
        abstractActivityC0106i5.getClass();
        h1.d.e(b3, "provider");
        C0014l c0014l = abstractActivityC0106i5.f1252c;
        ((CopyOnWriteArrayList) c0014l.f543b).add(b3);
        ((Runnable) c0014l.f542a).run();
    }

    public final void c(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0050q);
        }
        if (abstractComponentCallbacksC0050q.f1202z) {
            abstractComponentCallbacksC0050q.f1202z = false;
            if (abstractComponentCallbacksC0050q.f1187k) {
                return;
            }
            this.f1015c.a(abstractComponentCallbacksC0050q);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0050q);
            }
            if (F(abstractComponentCallbacksC0050q)) {
                this.f1004D = true;
            }
        }
    }

    public final void d() {
        this.f1014b = false;
        this.f1009J.clear();
        this.f1008I.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f1015c.h().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((O) it.next()).f1064c.f1165D;
            if (viewGroup != null) {
                hashSet.add(C0042i.f(viewGroup, D()));
            }
        }
        return hashSet;
    }

    public final O f(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        String str = abstractComponentCallbacksC0050q.f1182e;
        S0.g gVar = this.f1015c;
        O o2 = (O) ((HashMap) gVar.f823b).get(str);
        if (o2 != null) {
            return o2;
        }
        O o3 = new O(this.f1022l, gVar, abstractComponentCallbacksC0050q);
        o3.m(this.f1030t.f1210f.getClassLoader());
        o3.f1065e = this.f1029s;
        return o3;
    }

    public final void g(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0050q);
        }
        if (abstractComponentCallbacksC0050q.f1202z) {
            return;
        }
        abstractComponentCallbacksC0050q.f1202z = true;
        if (abstractComponentCallbacksC0050q.f1187k) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0050q);
            }
            S0.g gVar = this.f1015c;
            synchronized (((ArrayList) gVar.f822a)) {
                ((ArrayList) gVar.f822a).remove(abstractComponentCallbacksC0050q);
            }
            abstractComponentCallbacksC0050q.f1187k = false;
            if (F(abstractComponentCallbacksC0050q)) {
                this.f1004D = true;
            }
            W(abstractComponentCallbacksC0050q);
        }
    }

    public final void h(boolean z2) {
        if (z2 && this.f1030t != null) {
            Z(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q : this.f1015c.j()) {
            if (abstractComponentCallbacksC0050q != null) {
                abstractComponentCallbacksC0050q.f1164C = true;
                if (z2) {
                    abstractComponentCallbacksC0050q.f1196t.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.f1029s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q : this.f1015c.j()) {
            if (abstractComponentCallbacksC0050q != null) {
                if (!abstractComponentCallbacksC0050q.f1201y ? abstractComponentCallbacksC0050q.f1196t.i() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.f1029s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q : this.f1015c.j()) {
            if (abstractComponentCallbacksC0050q != null && H(abstractComponentCallbacksC0050q)) {
                if (!abstractComponentCallbacksC0050q.f1201y ? abstractComponentCallbacksC0050q.f1196t.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0050q);
                    z2 = true;
                }
            }
        }
        if (this.f1016e != null) {
            for (int i = 0; i < this.f1016e.size(); i++) {
                AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q2 = (AbstractComponentCallbacksC0050q) this.f1016e.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0050q2)) {
                    abstractComponentCallbacksC0050q2.getClass();
                }
            }
        }
        this.f1016e = arrayList;
        return z2;
    }

    public final void k() {
        boolean z2 = true;
        this.G = true;
        y(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0042i) it.next()).e();
        }
        C0053u c0053u = this.f1030t;
        S0.g gVar = this.f1015c;
        if (c0053u != null) {
            z2 = ((L) gVar.d).f1049f;
        } else {
            AbstractActivityC0106i abstractActivityC0106i = c0053u.f1210f;
            if (abstractActivityC0106i != null) {
                z2 = true ^ abstractActivityC0106i.isChangingConfigurations();
            }
        }
        if (z2) {
            Iterator it2 = this.f1020j.values().iterator();
            while (it2.hasNext()) {
                for (String str : ((C0036c) it2.next()).f1116a) {
                    L l2 = (L) gVar.d;
                    l2.getClass();
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    l2.d(str);
                }
            }
        }
        t(-1);
        C0053u c0053u2 = this.f1030t;
        if (c0053u2 != null) {
            AbstractActivityC0106i abstractActivityC0106i2 = c0053u2.i;
            y yVar = this.f1025o;
            abstractActivityC0106i2.getClass();
            h1.d.e(yVar, "listener");
            abstractActivityC0106i2.f1257j.remove(yVar);
        }
        C0053u c0053u3 = this.f1030t;
        if (c0053u3 != null) {
            AbstractActivityC0106i abstractActivityC0106i3 = c0053u3.i;
            y yVar2 = this.f1024n;
            abstractActivityC0106i3.getClass();
            h1.d.e(yVar2, "listener");
            abstractActivityC0106i3.i.remove(yVar2);
        }
        C0053u c0053u4 = this.f1030t;
        if (c0053u4 != null) {
            AbstractActivityC0106i abstractActivityC0106i4 = c0053u4.i;
            y yVar3 = this.f1026p;
            abstractActivityC0106i4.getClass();
            h1.d.e(yVar3, "listener");
            abstractActivityC0106i4.f1259l.remove(yVar3);
        }
        C0053u c0053u5 = this.f1030t;
        if (c0053u5 != null) {
            AbstractActivityC0106i abstractActivityC0106i5 = c0053u5.i;
            y yVar4 = this.f1027q;
            abstractActivityC0106i5.getClass();
            h1.d.e(yVar4, "listener");
            abstractActivityC0106i5.f1260m.remove(yVar4);
        }
        C0053u c0053u6 = this.f1030t;
        if (c0053u6 != null) {
            AbstractActivityC0106i abstractActivityC0106i6 = c0053u6.i;
            B b2 = this.f1028r;
            abstractActivityC0106i6.getClass();
            h1.d.e(b2, "provider");
            C0014l c0014l = abstractActivityC0106i6.f1252c;
            ((CopyOnWriteArrayList) c0014l.f543b).remove(b2);
            if (((HashMap) c0014l.f544c).remove(b2) != null) {
                throw new ClassCastException();
            }
            ((Runnable) c0014l.f542a).run();
        }
        this.f1030t = null;
        this.f1031u = null;
        this.f1032v = null;
        if (this.f1018g != null) {
            Iterator it3 = this.f1019h.f990b.iterator();
            while (it3.hasNext()) {
                ((InterfaceC0058c) it3.next()).cancel();
            }
            this.f1018g = null;
        }
        C.j jVar = this.f1036z;
        if (jVar != null) {
            jVar.I();
            this.f1001A.I();
            this.f1002B.I();
        }
    }

    public final void l(boolean z2) {
        if (z2 && this.f1030t != null) {
            Z(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q : this.f1015c.j()) {
            if (abstractComponentCallbacksC0050q != null) {
                abstractComponentCallbacksC0050q.f1164C = true;
                if (z2) {
                    abstractComponentCallbacksC0050q.f1196t.l(true);
                }
            }
        }
    }

    public final void m(boolean z2, boolean z3) {
        if (z3 && this.f1030t != null) {
            Z(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q : this.f1015c.j()) {
            if (abstractComponentCallbacksC0050q != null && z3) {
                abstractComponentCallbacksC0050q.f1196t.m(z2, true);
            }
        }
    }

    public final void n() {
        Iterator it = this.f1015c.i().iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = (AbstractComponentCallbacksC0050q) it.next();
            if (abstractComponentCallbacksC0050q != null) {
                abstractComponentCallbacksC0050q.n();
                abstractComponentCallbacksC0050q.f1196t.n();
            }
        }
    }

    public final boolean o() {
        if (this.f1029s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q : this.f1015c.j()) {
            if (abstractComponentCallbacksC0050q != null) {
                if (!abstractComponentCallbacksC0050q.f1201y ? abstractComponentCallbacksC0050q.f1196t.o() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f1029s < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q : this.f1015c.j()) {
            if (abstractComponentCallbacksC0050q != null && !abstractComponentCallbacksC0050q.f1201y) {
                abstractComponentCallbacksC0050q.f1196t.p();
            }
        }
    }

    public final void q(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        if (abstractComponentCallbacksC0050q != null) {
            if (abstractComponentCallbacksC0050q.equals(this.f1015c.d(abstractComponentCallbacksC0050q.f1182e))) {
                abstractComponentCallbacksC0050q.f1194r.getClass();
                boolean I2 = I(abstractComponentCallbacksC0050q);
                Boolean bool = abstractComponentCallbacksC0050q.f1186j;
                if (bool == null || bool.booleanValue() != I2) {
                    abstractComponentCallbacksC0050q.f1186j = Boolean.valueOf(I2);
                    I i = abstractComponentCallbacksC0050q.f1196t;
                    i.a0();
                    i.q(i.f1033w);
                }
            }
        }
    }

    public final void r(boolean z2, boolean z3) {
        if (z3 && this.f1030t != null) {
            Z(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q : this.f1015c.j()) {
            if (abstractComponentCallbacksC0050q != null && z3) {
                abstractComponentCallbacksC0050q.f1196t.r(z2, true);
            }
        }
    }

    public final boolean s() {
        if (this.f1029s < 1) {
            return false;
        }
        boolean z2 = false;
        for (AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q : this.f1015c.j()) {
            if (abstractComponentCallbacksC0050q != null && H(abstractComponentCallbacksC0050q)) {
                if (!abstractComponentCallbacksC0050q.f1201y ? abstractComponentCallbacksC0050q.f1196t.s() : false) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final void t(int i) {
        try {
            this.f1014b = true;
            for (O o2 : ((HashMap) this.f1015c.f823b).values()) {
                if (o2 != null) {
                    o2.f1065e = i;
                }
            }
            J(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0042i) it.next()).e();
            }
            this.f1014b = false;
            y(true);
        } catch (Throwable th) {
            this.f1014b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1032v;
        if (abstractComponentCallbacksC0050q != null) {
            sb.append(abstractComponentCallbacksC0050q.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f1032v)));
            sb.append("}");
        } else {
            C0053u c0053u = this.f1030t;
            if (c0053u != null) {
                sb.append(c0053u.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f1030t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u() {
        if (this.f1007H) {
            this.f1007H = false;
            Y();
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String f2 = V.f(str, "    ");
        S0.g gVar = this.f1015c;
        gVar.getClass();
        String str3 = str + "    ";
        HashMap hashMap = (HashMap) gVar.f823b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (O o2 : hashMap.values()) {
                printWriter.print(str);
                if (o2 != null) {
                    AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = o2.f1064c;
                    printWriter.println(abstractComponentCallbacksC0050q);
                    abstractComponentCallbacksC0050q.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0050q.f1198v));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0050q.f1199w));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0050q.f1200x);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0050q.f1179a);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0050q.f1182e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0050q.f1193q);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0050q.f1187k);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0050q.f1188l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0050q.f1189m);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0050q.f1190n);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0050q.f1201y);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0050q.f1202z);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0050q.f1163B);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0050q.f1162A);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0050q.G);
                    if (abstractComponentCallbacksC0050q.f1194r != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0050q.f1194r);
                    }
                    if (abstractComponentCallbacksC0050q.f1195s != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0050q.f1195s);
                    }
                    if (abstractComponentCallbacksC0050q.f1197u != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0050q.f1197u);
                    }
                    if (abstractComponentCallbacksC0050q.f1183f != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0050q.f1183f);
                    }
                    if (abstractComponentCallbacksC0050q.f1180b != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0050q.f1180b);
                    }
                    if (abstractComponentCallbacksC0050q.f1181c != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0050q.f1181c);
                    }
                    if (abstractComponentCallbacksC0050q.d != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0050q.d);
                    }
                    Object obj = abstractComponentCallbacksC0050q.f1184g;
                    if (obj == null) {
                        I i = abstractComponentCallbacksC0050q.f1194r;
                        obj = (i == null || (str2 = abstractComponentCallbacksC0050q.f1185h) == null) ? null : i.f1015c.d(str2);
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
                    C0049p c0049p = abstractComponentCallbacksC0050q.f1168H;
                    printWriter.println(c0049p == null ? false : c0049p.f1152a);
                    C0049p c0049p2 = abstractComponentCallbacksC0050q.f1168H;
                    if ((c0049p2 == null ? 0 : c0049p2.f1153b) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        C0049p c0049p3 = abstractComponentCallbacksC0050q.f1168H;
                        printWriter.println(c0049p3 == null ? 0 : c0049p3.f1153b);
                    }
                    C0049p c0049p4 = abstractComponentCallbacksC0050q.f1168H;
                    if ((c0049p4 == null ? 0 : c0049p4.f1154c) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        C0049p c0049p5 = abstractComponentCallbacksC0050q.f1168H;
                        printWriter.println(c0049p5 == null ? 0 : c0049p5.f1154c);
                    }
                    C0049p c0049p6 = abstractComponentCallbacksC0050q.f1168H;
                    if ((c0049p6 == null ? 0 : c0049p6.d) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        C0049p c0049p7 = abstractComponentCallbacksC0050q.f1168H;
                        printWriter.println(c0049p7 == null ? 0 : c0049p7.d);
                    }
                    C0049p c0049p8 = abstractComponentCallbacksC0050q.f1168H;
                    if ((c0049p8 == null ? 0 : c0049p8.f1155e) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        C0049p c0049p9 = abstractComponentCallbacksC0050q.f1168H;
                        printWriter.println(c0049p9 == null ? 0 : c0049p9.f1155e);
                    }
                    if (abstractComponentCallbacksC0050q.f1165D != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0050q.f1165D);
                    }
                    if (abstractComponentCallbacksC0050q.f1166E != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0050q.f1166E);
                    }
                    if (abstractComponentCallbacksC0050q.h() != null) {
                        p.l lVar = ((C0096a) new D.g(abstractComponentCallbacksC0050q.c(), C0096a.f2133c).w(C0096a.class)).f2134b;
                        if (lVar.f3476c > 0) {
                            printWriter.print(str3);
                            printWriter.println("Loaders:");
                            if (lVar.f3476c > 0) {
                                if (lVar.f3475b[0] != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(str3);
                                printWriter.print("  #");
                                printWriter.print(lVar.f3474a[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + abstractComponentCallbacksC0050q.f1196t + ":");
                    abstractComponentCallbacksC0050q.f1196t.v(V.f(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) gVar.f822a;
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
        ArrayList arrayList2 = this.f1016e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q3 = (AbstractComponentCallbacksC0050q) this.f1016e.get(i3);
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
                c0034a.d(f2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.f1013a) {
            try {
                int size4 = this.f1013a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i5 = 0; i5 < size4; i5++) {
                        Object obj2 = (G) this.f1013a.get(i5);
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
        printWriter.println(this.f1030t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1031u);
        if (this.f1032v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1032v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1029s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f1005E);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1006F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.f1004D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f1004D);
        }
    }

    public final void w(G g2, boolean z2) {
        if (!z2) {
            if (this.f1030t == null) {
                if (!this.G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f1005E || this.f1006F) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1013a) {
            try {
                if (this.f1030t == null) {
                    if (!z2) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f1013a.add(g2);
                    S();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(boolean z2) {
        if (this.f1014b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f1030t == null) {
            if (!this.G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f1030t.f1211g.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2 && (this.f1005E || this.f1006F)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f1008I == null) {
            this.f1008I = new ArrayList();
            this.f1009J = new ArrayList();
        }
    }

    public final boolean y(boolean z2) {
        boolean z3;
        x(z2);
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.f1008I;
            ArrayList arrayList2 = this.f1009J;
            synchronized (this.f1013a) {
                if (this.f1013a.isEmpty()) {
                    z3 = false;
                } else {
                    try {
                        int size = this.f1013a.size();
                        z3 = false;
                        for (int i = 0; i < size; i++) {
                            z3 |= ((G) this.f1013a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z3) {
                a0();
                u();
                ((HashMap) this.f1015c.f823b).values().removeAll(Collections.singleton(null));
                return z4;
            }
            z4 = true;
            this.f1014b = true;
            try {
                P(this.f1008I, this.f1009J);
            } finally {
                d();
            }
        }
    }

    public final void z(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        S0.g gVar;
        S0.g gVar2;
        S0.g gVar3;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        boolean z2 = ((C0034a) arrayList3.get(i)).f1100o;
        ArrayList arrayList5 = this.f1010K;
        if (arrayList5 == null) {
            this.f1010K = new ArrayList();
        } else {
            arrayList5.clear();
        }
        ArrayList arrayList6 = this.f1010K;
        S0.g gVar4 = this.f1015c;
        arrayList6.addAll(gVar4.j());
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1033w;
        int i6 = i;
        boolean z3 = false;
        while (true) {
            int i7 = 1;
            if (i6 >= i2) {
                S0.g gVar5 = gVar4;
                this.f1010K.clear();
                if (!z2 && this.f1029s >= 1) {
                    for (int i8 = i; i8 < i2; i8++) {
                        Iterator it = ((C0034a) arrayList.get(i8)).f1088a.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q2 = ((P) it.next()).f1067b;
                            if (abstractComponentCallbacksC0050q2 == null || abstractComponentCallbacksC0050q2.f1194r == null) {
                                gVar = gVar5;
                            } else {
                                gVar = gVar5;
                                gVar.l(f(abstractComponentCallbacksC0050q2));
                            }
                            gVar5 = gVar;
                        }
                    }
                }
                for (int i9 = i; i9 < i2; i9++) {
                    C0034a c0034a = (C0034a) arrayList.get(i9);
                    if (((Boolean) arrayList2.get(i9)).booleanValue()) {
                        c0034a.c(-1);
                        ArrayList arrayList7 = c0034a.f1088a;
                        boolean z4 = true;
                        for (int size = arrayList7.size() - 1; size >= 0; size--) {
                            P p2 = (P) arrayList7.get(size);
                            AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q3 = p2.f1067b;
                            if (abstractComponentCallbacksC0050q3 != null) {
                                if (abstractComponentCallbacksC0050q3.f1168H != null) {
                                    abstractComponentCallbacksC0050q3.f().f1152a = z4;
                                }
                                int i10 = c0034a.f1092f;
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
                                if (abstractComponentCallbacksC0050q3.f1168H != null || i11 != 0) {
                                    abstractComponentCallbacksC0050q3.f();
                                    abstractComponentCallbacksC0050q3.f1168H.f1156f = i11;
                                }
                                abstractComponentCallbacksC0050q3.f();
                                abstractComponentCallbacksC0050q3.f1168H.getClass();
                            }
                            int i13 = p2.f1066a;
                            I i14 = c0034a.f1101p;
                            switch (i13) {
                                case 1:
                                    abstractComponentCallbacksC0050q3.E(p2.d, p2.f1069e, p2.f1070f, p2.f1071g);
                                    z4 = true;
                                    i14.T(abstractComponentCallbacksC0050q3, true);
                                    i14.O(abstractComponentCallbacksC0050q3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + p2.f1066a);
                                case 3:
                                    abstractComponentCallbacksC0050q3.E(p2.d, p2.f1069e, p2.f1070f, p2.f1071g);
                                    i14.a(abstractComponentCallbacksC0050q3);
                                    z4 = true;
                                case 4:
                                    abstractComponentCallbacksC0050q3.E(p2.d, p2.f1069e, p2.f1070f, p2.f1071g);
                                    i14.getClass();
                                    X(abstractComponentCallbacksC0050q3);
                                    z4 = true;
                                case 5:
                                    abstractComponentCallbacksC0050q3.E(p2.d, p2.f1069e, p2.f1070f, p2.f1071g);
                                    i14.T(abstractComponentCallbacksC0050q3, true);
                                    i14.E(abstractComponentCallbacksC0050q3);
                                    z4 = true;
                                case 6:
                                    abstractComponentCallbacksC0050q3.E(p2.d, p2.f1069e, p2.f1070f, p2.f1071g);
                                    i14.c(abstractComponentCallbacksC0050q3);
                                    z4 = true;
                                case 7:
                                    abstractComponentCallbacksC0050q3.E(p2.d, p2.f1069e, p2.f1070f, p2.f1071g);
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
                                    i14.U(abstractComponentCallbacksC0050q3, p2.f1072h);
                                    z4 = true;
                            }
                        }
                    } else {
                        c0034a.c(1);
                        ArrayList arrayList8 = c0034a.f1088a;
                        int size2 = arrayList8.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            P p3 = (P) arrayList8.get(i15);
                            AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q4 = p3.f1067b;
                            if (abstractComponentCallbacksC0050q4 != null) {
                                if (abstractComponentCallbacksC0050q4.f1168H != null) {
                                    abstractComponentCallbacksC0050q4.f().f1152a = false;
                                }
                                int i16 = c0034a.f1092f;
                                if (abstractComponentCallbacksC0050q4.f1168H != null || i16 != 0) {
                                    abstractComponentCallbacksC0050q4.f();
                                    abstractComponentCallbacksC0050q4.f1168H.f1156f = i16;
                                }
                                abstractComponentCallbacksC0050q4.f();
                                abstractComponentCallbacksC0050q4.f1168H.getClass();
                            }
                            int i17 = p3.f1066a;
                            I i18 = c0034a.f1101p;
                            switch (i17) {
                                case 1:
                                    abstractComponentCallbacksC0050q4.E(p3.d, p3.f1069e, p3.f1070f, p3.f1071g);
                                    i18.T(abstractComponentCallbacksC0050q4, false);
                                    i18.a(abstractComponentCallbacksC0050q4);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + p3.f1066a);
                                case 3:
                                    abstractComponentCallbacksC0050q4.E(p3.d, p3.f1069e, p3.f1070f, p3.f1071g);
                                    i18.O(abstractComponentCallbacksC0050q4);
                                case 4:
                                    abstractComponentCallbacksC0050q4.E(p3.d, p3.f1069e, p3.f1070f, p3.f1071g);
                                    i18.E(abstractComponentCallbacksC0050q4);
                                case 5:
                                    abstractComponentCallbacksC0050q4.E(p3.d, p3.f1069e, p3.f1070f, p3.f1071g);
                                    i18.T(abstractComponentCallbacksC0050q4, false);
                                    X(abstractComponentCallbacksC0050q4);
                                case 6:
                                    abstractComponentCallbacksC0050q4.E(p3.d, p3.f1069e, p3.f1070f, p3.f1071g);
                                    i18.g(abstractComponentCallbacksC0050q4);
                                case 7:
                                    abstractComponentCallbacksC0050q4.E(p3.d, p3.f1069e, p3.f1070f, p3.f1071g);
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
                        for (int size3 = c0034a2.f1088a.size() - 1; size3 >= 0; size3--) {
                            AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q5 = ((P) c0034a2.f1088a.get(size3)).f1067b;
                            if (abstractComponentCallbacksC0050q5 != null) {
                                f(abstractComponentCallbacksC0050q5).k();
                            }
                        }
                    } else {
                        Iterator it2 = c0034a2.f1088a.iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q6 = ((P) it2.next()).f1067b;
                            if (abstractComponentCallbacksC0050q6 != null) {
                                f(abstractComponentCallbacksC0050q6).k();
                            }
                        }
                    }
                }
                J(this.f1029s, true);
                HashSet hashSet = new HashSet();
                for (int i20 = i; i20 < i2; i20++) {
                    Iterator it3 = ((C0034a) arrayList.get(i20)).f1088a.iterator();
                    while (it3.hasNext()) {
                        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q7 = ((P) it3.next()).f1067b;
                        if (abstractComponentCallbacksC0050q7 != null && (viewGroup = abstractComponentCallbacksC0050q7.f1165D) != null) {
                            hashSet.add(C0042i.f(viewGroup, D()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    C0042i c0042i = (C0042i) it4.next();
                    c0042i.d = booleanValue;
                    synchronized (c0042i.f1130b) {
                        try {
                            c0042i.g();
                            c0042i.f1132e = false;
                            int size4 = c0042i.f1130b.size() - 1;
                            while (true) {
                                if (size4 >= 0) {
                                    U u2 = (U) c0042i.f1130b.get(size4);
                                    int c2 = V.c(u2.f1083c.f1166E);
                                    if (u2.f1081a != 2 || c2 == 2) {
                                        size4--;
                                    } else {
                                        C0049p c0049p = u2.f1083c.f1168H;
                                        c0042i.f1132e = false;
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
                    if (((Boolean) arrayList2.get(i21)).booleanValue() && c0034a3.f1103r >= 0) {
                        c0034a3.f1103r = -1;
                    }
                    c0034a3.getClass();
                }
                return;
            }
            C0034a c0034a4 = (C0034a) arrayList3.get(i6);
            if (((Boolean) arrayList4.get(i6)).booleanValue()) {
                gVar2 = gVar4;
                int i22 = 1;
                ArrayList arrayList9 = this.f1010K;
                ArrayList arrayList10 = c0034a4.f1088a;
                int size5 = arrayList10.size() - 1;
                while (size5 >= 0) {
                    P p4 = (P) arrayList10.get(size5);
                    int i23 = p4.f1066a;
                    if (i23 != i22) {
                        if (i23 != 3) {
                            switch (i23) {
                                case 8:
                                    abstractComponentCallbacksC0050q = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0050q = p4.f1067b;
                                    break;
                                case 10:
                                    p4.i = p4.f1072h;
                                    break;
                            }
                            size5--;
                            i22 = 1;
                        }
                        arrayList9.add(p4.f1067b);
                        size5--;
                        i22 = 1;
                    }
                    arrayList9.remove(p4.f1067b);
                    size5--;
                    i22 = 1;
                }
            } else {
                ArrayList arrayList11 = this.f1010K;
                int i24 = 0;
                while (true) {
                    ArrayList arrayList12 = c0034a4.f1088a;
                    if (i24 < arrayList12.size()) {
                        P p5 = (P) arrayList12.get(i24);
                        int i25 = p5.f1066a;
                        if (i25 != i7) {
                            if (i25 != 2) {
                                if (i25 == 3 || i25 == 6) {
                                    arrayList11.remove(p5.f1067b);
                                    AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q8 = p5.f1067b;
                                    if (abstractComponentCallbacksC0050q8 == abstractComponentCallbacksC0050q) {
                                        arrayList12.add(i24, new P(9, abstractComponentCallbacksC0050q8));
                                        i24++;
                                        gVar3 = gVar4;
                                        i3 = 1;
                                        abstractComponentCallbacksC0050q = null;
                                    }
                                } else if (i25 == 7) {
                                    gVar3 = gVar4;
                                    i3 = 1;
                                } else if (i25 == 8) {
                                    arrayList12.add(i24, new P(9, abstractComponentCallbacksC0050q, 0));
                                    p5.f1068c = true;
                                    i24++;
                                    abstractComponentCallbacksC0050q = p5.f1067b;
                                }
                                gVar3 = gVar4;
                                i3 = 1;
                            } else {
                                AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q9 = p5.f1067b;
                                int i26 = abstractComponentCallbacksC0050q9.f1199w;
                                int size6 = arrayList11.size() - 1;
                                boolean z5 = false;
                                while (size6 >= 0) {
                                    S0.g gVar6 = gVar4;
                                    AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q10 = (AbstractComponentCallbacksC0050q) arrayList11.get(size6);
                                    if (abstractComponentCallbacksC0050q10.f1199w != i26) {
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
                                        p6.f1070f = p5.f1070f;
                                        p6.f1069e = p5.f1069e;
                                        p6.f1071g = p5.f1071g;
                                        arrayList12.add(i24, p6);
                                        arrayList11.remove(abstractComponentCallbacksC0050q10);
                                        i24++;
                                        abstractComponentCallbacksC0050q = abstractComponentCallbacksC0050q;
                                    }
                                    size6--;
                                    i26 = i4;
                                    gVar4 = gVar6;
                                }
                                gVar3 = gVar4;
                                i3 = 1;
                                if (z5) {
                                    arrayList12.remove(i24);
                                    i24--;
                                } else {
                                    p5.f1066a = 1;
                                    p5.f1068c = true;
                                    arrayList11.add(abstractComponentCallbacksC0050q9);
                                }
                            }
                            i24 += i3;
                            i7 = i3;
                            gVar4 = gVar3;
                        } else {
                            gVar3 = gVar4;
                            i3 = i7;
                        }
                        arrayList11.add(p5.f1067b);
                        i24 += i3;
                        i7 = i3;
                        gVar4 = gVar3;
                    } else {
                        gVar2 = gVar4;
                    }
                }
            }
            z3 = z3 || c0034a4.f1093g;
            i6++;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            gVar4 = gVar2;
        }
    }
}
