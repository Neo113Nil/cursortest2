package Z;

import a0.AbstractC0056d;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.EnumC0070m;
import com.winfour.neondrop.R;
import e0.C0083a;
import g.AbstractActivityC0110i;
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
    public D.j f1020A;

    /* renamed from: B, reason: collision with root package name */
    public D.j f1021B;

    /* renamed from: C, reason: collision with root package name */
    public ArrayDeque f1022C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1023D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1024E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f1025F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f1026G;
    public boolean H;

    /* renamed from: I, reason: collision with root package name */
    public ArrayList f1027I;

    /* renamed from: J, reason: collision with root package name */
    public ArrayList f1028J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList f1029K;

    /* renamed from: L, reason: collision with root package name */
    public L f1030L;

    /* renamed from: M, reason: collision with root package name */
    public final O0.B f1031M;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1033b;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f1035e;

    /* renamed from: g, reason: collision with root package name */
    public a.x f1037g;

    /* renamed from: l, reason: collision with root package name */
    public final D.j f1040l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f1041m;

    /* renamed from: n, reason: collision with root package name */
    public final y f1042n;

    /* renamed from: o, reason: collision with root package name */
    public final y f1043o;

    /* renamed from: p, reason: collision with root package name */
    public final y f1044p;

    /* renamed from: q, reason: collision with root package name */
    public final y f1045q;

    /* renamed from: r, reason: collision with root package name */
    public final B f1046r;

    /* renamed from: s, reason: collision with root package name */
    public int f1047s;

    /* renamed from: t, reason: collision with root package name */
    public C0050u f1048t;

    /* renamed from: u, reason: collision with root package name */
    public z1.l f1049u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractComponentCallbacksC0047q f1050v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractComponentCallbacksC0047q f1051w;

    /* renamed from: x, reason: collision with root package name */
    public final C f1052x;

    /* renamed from: y, reason: collision with root package name */
    public final L0.e f1053y;

    /* renamed from: z, reason: collision with root package name */
    public D.j f1054z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1032a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final T0.g f1034c = new T0.g(3);

    /* renamed from: f, reason: collision with root package name */
    public final x f1036f = new x(this);
    public final A h = new A(this);
    public final AtomicInteger i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map f1038j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map f1039k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [Z.y] */
    /* JADX WARN: Type inference failed for: r0v13, types: [Z.y] */
    /* JADX WARN: Type inference failed for: r0v14, types: [Z.y] */
    /* JADX WARN: Type inference failed for: r0v15, types: [Z.y] */
    public I() {
        Collections.synchronizedMap(new HashMap());
        this.f1040l = new D.j(this);
        this.f1041m = new CopyOnWriteArrayList();
        final int i = 0;
        this.f1042n = new L.a(this) { // from class: Z.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1230b;

            {
                this.f1230b = this;
            }

            @Override // L.a
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        I i2 = this.f1230b;
                        if (i2.G()) {
                            i2.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i3 = this.f1230b;
                        if (i3.G() && num.intValue() == 80) {
                            i3.l(false);
                            break;
                        }
                        break;
                    case 2:
                        B.h hVar = (B.h) obj;
                        I i4 = this.f1230b;
                        if (i4.G()) {
                            i4.m(hVar.f102a, false);
                            break;
                        }
                        break;
                    default:
                        B.i iVar = (B.i) obj;
                        I i5 = this.f1230b;
                        if (i5.G()) {
                            i5.r(iVar.f103a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f1043o = new L.a(this) { // from class: Z.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1230b;

            {
                this.f1230b = this;
            }

            @Override // L.a
            public final void a(Object obj) {
                switch (i2) {
                    case 0:
                        I i22 = this.f1230b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i3 = this.f1230b;
                        if (i3.G() && num.intValue() == 80) {
                            i3.l(false);
                            break;
                        }
                        break;
                    case 2:
                        B.h hVar = (B.h) obj;
                        I i4 = this.f1230b;
                        if (i4.G()) {
                            i4.m(hVar.f102a, false);
                            break;
                        }
                        break;
                    default:
                        B.i iVar = (B.i) obj;
                        I i5 = this.f1230b;
                        if (i5.G()) {
                            i5.r(iVar.f103a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.f1044p = new L.a(this) { // from class: Z.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1230b;

            {
                this.f1230b = this;
            }

            @Override // L.a
            public final void a(Object obj) {
                switch (i3) {
                    case 0:
                        I i22 = this.f1230b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i32 = this.f1230b;
                        if (i32.G() && num.intValue() == 80) {
                            i32.l(false);
                            break;
                        }
                        break;
                    case 2:
                        B.h hVar = (B.h) obj;
                        I i4 = this.f1230b;
                        if (i4.G()) {
                            i4.m(hVar.f102a, false);
                            break;
                        }
                        break;
                    default:
                        B.i iVar = (B.i) obj;
                        I i5 = this.f1230b;
                        if (i5.G()) {
                            i5.r(iVar.f103a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.f1045q = new L.a(this) { // from class: Z.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1230b;

            {
                this.f1230b = this;
            }

            @Override // L.a
            public final void a(Object obj) {
                switch (i4) {
                    case 0:
                        I i22 = this.f1230b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i32 = this.f1230b;
                        if (i32.G() && num.intValue() == 80) {
                            i32.l(false);
                            break;
                        }
                        break;
                    case 2:
                        B.h hVar = (B.h) obj;
                        I i42 = this.f1230b;
                        if (i42.G()) {
                            i42.m(hVar.f102a, false);
                            break;
                        }
                        break;
                    default:
                        B.i iVar = (B.i) obj;
                        I i5 = this.f1230b;
                        if (i5.G()) {
                            i5.r(iVar.f103a, false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f1046r = new B(this);
        this.f1047s = -1;
        this.f1052x = new C(this);
        this.f1053y = new L0.e(14);
        this.f1022C = new ArrayDeque();
        this.f1031M = new O0.B(5, this);
    }

    public static boolean F(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        abstractComponentCallbacksC0047q.getClass();
        Iterator it = abstractComponentCallbacksC0047q.f1205t.f1034c.i().iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q2 = (AbstractComponentCallbacksC0047q) it.next();
            if (abstractComponentCallbacksC0047q2 != null) {
                z2 = F(abstractComponentCallbacksC0047q2);
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public static boolean H(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        if (abstractComponentCallbacksC0047q == null) {
            return true;
        }
        return abstractComponentCallbacksC0047q.f1173B && (abstractComponentCallbacksC0047q.f1203r == null || H(abstractComponentCallbacksC0047q.f1206u));
    }

    public static boolean I(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        if (abstractComponentCallbacksC0047q == null) {
            return true;
        }
        I i = abstractComponentCallbacksC0047q.f1203r;
        return abstractComponentCallbacksC0047q.equals(i.f1051w) && I(i.f1050v);
    }

    public static void X(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0047q);
        }
        if (abstractComponentCallbacksC0047q.f1210y) {
            abstractComponentCallbacksC0047q.f1210y = false;
            abstractComponentCallbacksC0047q.f1179I = !abstractComponentCallbacksC0047q.f1179I;
        }
    }

    public final AbstractComponentCallbacksC0047q A(int i) {
        T0.g gVar = this.f1034c;
        ArrayList arrayList = (ArrayList) gVar.f824a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = (AbstractComponentCallbacksC0047q) arrayList.get(size);
            if (abstractComponentCallbacksC0047q != null && abstractComponentCallbacksC0047q.f1207v == i) {
                return abstractComponentCallbacksC0047q;
            }
        }
        for (O o2 : ((HashMap) gVar.f825b).values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q2 = o2.f1079c;
                if (abstractComponentCallbacksC0047q2.f1207v == i) {
                    return abstractComponentCallbacksC0047q2;
                }
            }
        }
        return null;
    }

    public final ViewGroup B(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        ViewGroup viewGroup = abstractComponentCallbacksC0047q.f1175D;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0047q.f1208w > 0 && this.f1049u.f0()) {
            View c02 = this.f1049u.c0(abstractComponentCallbacksC0047q.f1208w);
            if (c02 instanceof ViewGroup) {
                return (ViewGroup) c02;
            }
        }
        return null;
    }

    public final C C() {
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f1050v;
        return abstractComponentCallbacksC0047q != null ? abstractComponentCallbacksC0047q.f1203r.C() : this.f1052x;
    }

    public final L0.e D() {
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f1050v;
        return abstractComponentCallbacksC0047q != null ? abstractComponentCallbacksC0047q.f1203r.D() : this.f1053y;
    }

    public final void E(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0047q);
        }
        if (abstractComponentCallbacksC0047q.f1210y) {
            return;
        }
        abstractComponentCallbacksC0047q.f1210y = true;
        abstractComponentCallbacksC0047q.f1179I = true ^ abstractComponentCallbacksC0047q.f1179I;
        W(abstractComponentCallbacksC0047q);
    }

    public final boolean G() {
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f1050v;
        if (abstractComponentCallbacksC0047q == null) {
            return true;
        }
        return abstractComponentCallbacksC0047q.m() && this.f1050v.j().G();
    }

    public final void J(int i, boolean z2) {
        HashMap hashMap;
        C0050u c0050u;
        if (this.f1048t == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i != this.f1047s) {
            this.f1047s = i;
            T0.g gVar = this.f1034c;
            Iterator it = ((ArrayList) gVar.f824a).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = (HashMap) gVar.f825b;
                if (!hasNext) {
                    break;
                }
                O o2 = (O) hashMap.get(((AbstractComponentCallbacksC0047q) it.next()).f1192e);
                if (o2 != null) {
                    o2.k();
                }
            }
            for (O o3 : hashMap.values()) {
                if (o3 != null) {
                    o3.k();
                    AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = o3.f1079c;
                    if (abstractComponentCallbacksC0047q.f1197l && !abstractComponentCallbacksC0047q.o()) {
                        gVar.n(o3);
                    }
                }
            }
            Y();
            if (this.f1023D && (c0050u = this.f1048t) != null && this.f1047s == 7) {
                c0050u.f1221e.invalidateOptionsMenu();
                this.f1023D = false;
            }
        }
    }

    public final void K() {
        if (this.f1048t == null) {
            return;
        }
        this.f1024E = false;
        this.f1025F = false;
        this.f1030L.f1066g = false;
        for (AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q : this.f1034c.j()) {
            if (abstractComponentCallbacksC0047q != null) {
                abstractComponentCallbacksC0047q.f1205t.K();
            }
        }
    }

    public final boolean L() {
        return M(-1, 0);
    }

    public final boolean M(int i, int i2) {
        y(false);
        x(true);
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f1051w;
        if (abstractComponentCallbacksC0047q != null && i < 0 && abstractComponentCallbacksC0047q.g().L()) {
            return true;
        }
        boolean N2 = N(this.f1027I, this.f1028J, i, i2);
        if (N2) {
            this.f1033b = true;
            try {
                P(this.f1027I, this.f1028J);
            } finally {
                d();
            }
        }
        a0();
        u();
        ((HashMap) this.f1034c.f825b).values().removeAll(Collections.singleton(null));
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
                    C0031a c0031a = (C0031a) this.d.get(size);
                    if (i >= 0 && i == c0031a.f1115r) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z2) {
                        while (size > 0) {
                            C0031a c0031a2 = (C0031a) this.d.get(size - 1);
                            if (i < 0 || i != c0031a2.f1115r) {
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
            arrayList.add((C0031a) this.d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void O(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0047q + " nesting=" + abstractComponentCallbacksC0047q.f1202q);
        }
        boolean o2 = abstractComponentCallbacksC0047q.o();
        if (abstractComponentCallbacksC0047q.f1211z && o2) {
            return;
        }
        T0.g gVar = this.f1034c;
        synchronized (((ArrayList) gVar.f824a)) {
            ((ArrayList) gVar.f824a).remove(abstractComponentCallbacksC0047q);
        }
        abstractComponentCallbacksC0047q.f1196k = false;
        if (F(abstractComponentCallbacksC0047q)) {
            this.f1023D = true;
        }
        abstractComponentCallbacksC0047q.f1197l = true;
        W(abstractComponentCallbacksC0047q);
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
            if (!((C0031a) arrayList.get(i)).f1112o) {
                if (i2 != i) {
                    z(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0031a) arrayList.get(i2)).f1112o) {
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
        D.j jVar;
        int i2;
        O o2;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f1048t.f1219b.getClassLoader());
                this.f1039k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f1048t.f1219b.getClassLoader());
                arrayList.add((N) bundle.getParcelable("state"));
            }
        }
        T0.g gVar = this.f1034c;
        HashMap hashMap = (HashMap) gVar.f826c;
        hashMap.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            N n2 = (N) it.next();
            hashMap.put(n2.f1068b, n2);
        }
        J j2 = (J) bundle3.getParcelable("state");
        if (j2 == null) {
            return;
        }
        HashMap hashMap2 = (HashMap) gVar.f825b;
        hashMap2.clear();
        Iterator it2 = j2.f1055a.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            i = 2;
            jVar = this.f1040l;
            if (!hasNext) {
                break;
            }
            N n3 = (N) ((HashMap) gVar.f826c).remove((String) it2.next());
            if (n3 != null) {
                AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = (AbstractComponentCallbacksC0047q) this.f1030L.f1062b.get(n3.f1068b);
                if (abstractComponentCallbacksC0047q != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0047q);
                    }
                    o2 = new O(jVar, gVar, abstractComponentCallbacksC0047q, n3);
                } else {
                    o2 = new O(this.f1040l, this.f1034c, this.f1048t.f1219b.getClassLoader(), C(), n3);
                }
                AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q2 = o2.f1079c;
                abstractComponentCallbacksC0047q2.f1203r = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0047q2.f1192e + "): " + abstractComponentCallbacksC0047q2);
                }
                o2.m(this.f1048t.f1219b.getClassLoader());
                gVar.m(o2);
                o2.f1080e = this.f1047s;
            }
        }
        L l2 = this.f1030L;
        l2.getClass();
        Iterator it3 = new ArrayList(l2.f1062b.values()).iterator();
        while (it3.hasNext()) {
            AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q3 = (AbstractComponentCallbacksC0047q) it3.next();
            if (hashMap2.get(abstractComponentCallbacksC0047q3.f1192e) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0047q3 + " that was not found in the set of active Fragments " + j2.f1055a);
                }
                this.f1030L.e(abstractComponentCallbacksC0047q3);
                abstractComponentCallbacksC0047q3.f1203r = this;
                O o3 = new O(jVar, gVar, abstractComponentCallbacksC0047q3);
                o3.f1080e = 1;
                o3.k();
                abstractComponentCallbacksC0047q3.f1197l = true;
                o3.k();
            }
        }
        ArrayList<String> arrayList2 = j2.f1056b;
        ((ArrayList) gVar.f824a).clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                AbstractComponentCallbacksC0047q d = gVar.d(str3);
                if (d == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str3 + ")");
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + d);
                }
                gVar.a(d);
            }
        }
        if (j2.f1057c != null) {
            this.d = new ArrayList(j2.f1057c.length);
            int i3 = 0;
            while (true) {
                C0032b[] c0032bArr = j2.f1057c;
                if (i3 >= c0032bArr.length) {
                    break;
                }
                C0032b c0032b = c0032bArr[i3];
                c0032b.getClass();
                C0031a c0031a = new C0031a(this);
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    int[] iArr = c0032b.f1116a;
                    if (i4 >= iArr.length) {
                        break;
                    }
                    P p2 = new P();
                    int i6 = i4 + 1;
                    p2.f1081a = iArr[i4];
                    if (Log.isLoggable("FragmentManager", i)) {
                        Log.v("FragmentManager", "Instantiate " + c0031a + " op #" + i5 + " base fragment #" + iArr[i6]);
                    }
                    p2.h = EnumC0070m.values()[c0032b.f1118c[i5]];
                    p2.i = EnumC0070m.values()[c0032b.d[i5]];
                    int i7 = i4 + 2;
                    p2.f1083c = iArr[i6] != 0;
                    int i8 = iArr[i7];
                    p2.d = i8;
                    int i9 = iArr[i4 + 3];
                    p2.f1084e = i9;
                    int i10 = i4 + 5;
                    int i11 = iArr[i4 + 4];
                    p2.f1085f = i11;
                    i4 += 6;
                    int i12 = iArr[i10];
                    p2.f1086g = i12;
                    c0031a.f1102b = i8;
                    c0031a.f1103c = i9;
                    c0031a.d = i11;
                    c0031a.f1104e = i12;
                    c0031a.b(p2);
                    i5++;
                    i = 2;
                }
                c0031a.f1105f = c0032b.f1119e;
                c0031a.h = c0032b.f1120f;
                c0031a.f1106g = true;
                c0031a.i = c0032b.h;
                c0031a.f1107j = c0032b.i;
                c0031a.f1108k = c0032b.f1122j;
                c0031a.f1109l = c0032b.f1123k;
                c0031a.f1110m = c0032b.f1124l;
                c0031a.f1111n = c0032b.f1125m;
                c0031a.f1112o = c0032b.f1126n;
                c0031a.f1115r = c0032b.f1121g;
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = c0032b.f1117b;
                    if (i13 >= arrayList3.size()) {
                        break;
                    }
                    String str4 = (String) arrayList3.get(i13);
                    if (str4 != null) {
                        ((P) c0031a.f1101a.get(i13)).f1082b = gVar.d(str4);
                    }
                    i13++;
                }
                c0031a.c(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i3 + " (index " + c0031a.f1115r + "): " + c0031a);
                    PrintWriter printWriter = new PrintWriter(new S());
                    c0031a.d("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(c0031a);
                i3++;
                i = 2;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.d = null;
        }
        this.i.set(j2.d);
        String str5 = j2.f1058e;
        if (str5 != null) {
            AbstractComponentCallbacksC0047q d2 = gVar.d(str5);
            this.f1051w = d2;
            q(d2);
        }
        ArrayList arrayList4 = j2.f1059f;
        if (arrayList4 != null) {
            for (int i14 = i2; i14 < arrayList4.size(); i14++) {
                this.f1038j.put((String) arrayList4.get(i14), (C0033c) j2.f1060g.get(i14));
            }
        }
        this.f1022C = new ArrayDeque(j2.h);
    }

    public final Bundle R() {
        int i;
        ArrayList arrayList;
        C0032b[] c0032bArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0039i c0039i = (C0039i) it.next();
            if (c0039i.f1143e) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0039i.f1143e = false;
                c0039i.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((C0039i) it2.next()).e();
        }
        y(true);
        this.f1024E = true;
        this.f1030L.f1066g = true;
        T0.g gVar = this.f1034c;
        gVar.getClass();
        HashMap hashMap = (HashMap) gVar.f825b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (O o2 : hashMap.values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = o2.f1079c;
                N n2 = new N(abstractComponentCallbacksC0047q);
                if (abstractComponentCallbacksC0047q.f1189a <= -1 || n2.f1076m != null) {
                    n2.f1076m = abstractComponentCallbacksC0047q.f1190b;
                } else {
                    Bundle bundle2 = new Bundle();
                    abstractComponentCallbacksC0047q.x(bundle2);
                    abstractComponentCallbacksC0047q.f1186P.c(bundle2);
                    bundle2.putParcelable("android:support:fragments", abstractComponentCallbacksC0047q.f1205t.R());
                    o2.f1077a.o(false);
                    if (bundle2.isEmpty()) {
                        bundle2 = null;
                    }
                    if (abstractComponentCallbacksC0047q.f1176E != null) {
                        o2.o();
                    }
                    if (abstractComponentCallbacksC0047q.f1191c != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putSparseParcelableArray("android:view_state", abstractComponentCallbacksC0047q.f1191c);
                    }
                    if (abstractComponentCallbacksC0047q.d != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBundle("android:view_registry_state", abstractComponentCallbacksC0047q.d);
                    }
                    if (!abstractComponentCallbacksC0047q.f1178G) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBoolean("android:user_visible_hint", abstractComponentCallbacksC0047q.f1178G);
                    }
                    n2.f1076m = bundle2;
                    if (abstractComponentCallbacksC0047q.h != null) {
                        if (bundle2 == null) {
                            n2.f1076m = new Bundle();
                        }
                        n2.f1076m.putString("android:target_state", abstractComponentCallbacksC0047q.h);
                        int i2 = abstractComponentCallbacksC0047q.i;
                        if (i2 != 0) {
                            n2.f1076m.putInt("android:target_req_state", i2);
                        }
                    }
                }
                AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q2 = o2.f1079c;
                arrayList2.add(abstractComponentCallbacksC0047q2.f1192e);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0047q2 + ": " + abstractComponentCallbacksC0047q2.f1190b);
                }
            }
        }
        T0.g gVar2 = this.f1034c;
        gVar2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) gVar2.f826c).values());
        if (!arrayList3.isEmpty()) {
            T0.g gVar3 = this.f1034c;
            synchronized (((ArrayList) gVar3.f824a)) {
                try {
                    if (((ArrayList) gVar3.f824a).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) gVar3.f824a).size());
                        Iterator it3 = ((ArrayList) gVar3.f824a).iterator();
                        while (it3.hasNext()) {
                            AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q3 = (AbstractComponentCallbacksC0047q) it3.next();
                            arrayList.add(abstractComponentCallbacksC0047q3.f1192e);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0047q3.f1192e + "): " + abstractComponentCallbacksC0047q3);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList4 = this.d;
            if (arrayList4 == null || (size = arrayList4.size()) <= 0) {
                c0032bArr = null;
            } else {
                c0032bArr = new C0032b[size];
                for (i = 0; i < size; i++) {
                    c0032bArr[i] = new C0032b((C0031a) this.d.get(i));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.d.get(i));
                    }
                }
            }
            J j2 = new J();
            j2.f1058e = null;
            ArrayList arrayList5 = new ArrayList();
            j2.f1059f = arrayList5;
            ArrayList arrayList6 = new ArrayList();
            j2.f1060g = arrayList6;
            j2.f1055a = arrayList2;
            j2.f1056b = arrayList;
            j2.f1057c = c0032bArr;
            j2.d = this.i.get();
            AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q4 = this.f1051w;
            if (abstractComponentCallbacksC0047q4 != null) {
                j2.f1058e = abstractComponentCallbacksC0047q4.f1192e;
            }
            arrayList5.addAll(this.f1038j.keySet());
            arrayList6.addAll(this.f1038j.values());
            j2.h = new ArrayList(this.f1022C);
            bundle.putParcelable("state", j2);
            for (String str : this.f1039k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f1039k.get(str));
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                N n3 = (N) it4.next();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("state", n3);
                bundle.putBundle("fragment_" + n3.f1068b, bundle3);
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public final void S() {
        synchronized (this.f1032a) {
            try {
                if (this.f1032a.size() == 1) {
                    this.f1048t.f1220c.removeCallbacks(this.f1031M);
                    this.f1048t.f1220c.post(this.f1031M);
                    a0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void T(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q, boolean z2) {
        ViewGroup B2 = B(abstractComponentCallbacksC0047q);
        if (B2 == null || !(B2 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) B2).setDrawDisappearingViewsLast(!z2);
    }

    public final void U(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q, EnumC0070m enumC0070m) {
        if (abstractComponentCallbacksC0047q.equals(this.f1034c.d(abstractComponentCallbacksC0047q.f1192e)) && (abstractComponentCallbacksC0047q.f1204s == null || abstractComponentCallbacksC0047q.f1203r == this)) {
            abstractComponentCallbacksC0047q.f1182L = enumC0070m;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0047q + " is not an active fragment of FragmentManager " + this);
    }

    public final void V(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        if (abstractComponentCallbacksC0047q != null) {
            if (!abstractComponentCallbacksC0047q.equals(this.f1034c.d(abstractComponentCallbacksC0047q.f1192e)) || (abstractComponentCallbacksC0047q.f1204s != null && abstractComponentCallbacksC0047q.f1203r != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0047q + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q2 = this.f1051w;
        this.f1051w = abstractComponentCallbacksC0047q;
        q(abstractComponentCallbacksC0047q2);
        q(this.f1051w);
    }

    public final void W(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        ViewGroup B2 = B(abstractComponentCallbacksC0047q);
        if (B2 != null) {
            C0046p c0046p = abstractComponentCallbacksC0047q.H;
            if ((c0046p == null ? 0 : c0046p.f1166e) + (c0046p == null ? 0 : c0046p.d) + (c0046p == null ? 0 : c0046p.f1165c) + (c0046p == null ? 0 : c0046p.f1164b) > 0) {
                if (B2.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    B2.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0047q);
                }
                AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q2 = (AbstractComponentCallbacksC0047q) B2.getTag(R.id.visible_removing_fragment_view_tag);
                C0046p c0046p2 = abstractComponentCallbacksC0047q.H;
                boolean z2 = c0046p2 != null ? c0046p2.f1163a : false;
                if (abstractComponentCallbacksC0047q2.H == null) {
                    return;
                }
                abstractComponentCallbacksC0047q2.e().f1163a = z2;
            }
        }
    }

    public final void Y() {
        Iterator it = this.f1034c.h().iterator();
        while (it.hasNext()) {
            O o2 = (O) it.next();
            AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = o2.f1079c;
            if (abstractComponentCallbacksC0047q.f1177F) {
                if (this.f1033b) {
                    this.H = true;
                } else {
                    abstractComponentCallbacksC0047q.f1177F = false;
                    o2.k();
                }
            }
        }
    }

    public final void Z(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new S());
        C0050u c0050u = this.f1048t;
        if (c0050u == null) {
            try {
                v("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
                throw illegalStateException;
            }
        }
        try {
            c0050u.f1221e.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw illegalStateException;
        }
    }

    public final O a(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        String str = abstractComponentCallbacksC0047q.f1181K;
        if (str != null) {
            AbstractC0056d.c(abstractComponentCallbacksC0047q, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0047q);
        }
        O f2 = f(abstractComponentCallbacksC0047q);
        abstractComponentCallbacksC0047q.f1203r = this;
        T0.g gVar = this.f1034c;
        gVar.m(f2);
        if (!abstractComponentCallbacksC0047q.f1211z) {
            gVar.a(abstractComponentCallbacksC0047q);
            abstractComponentCallbacksC0047q.f1197l = false;
            if (abstractComponentCallbacksC0047q.f1176E == null) {
                abstractComponentCallbacksC0047q.f1179I = false;
            }
            if (F(abstractComponentCallbacksC0047q)) {
                this.f1023D = true;
            }
        }
        return f2;
    }

    public final void a0() {
        synchronized (this.f1032a) {
            try {
                if (!this.f1032a.isEmpty()) {
                    A a2 = this.h;
                    a2.f1008a = true;
                    a.w wVar = a2.f1010c;
                    if (wVar != null) {
                        wVar.a();
                    }
                    return;
                }
                A a3 = this.h;
                ArrayList arrayList = this.d;
                a3.f1008a = (arrayList != null ? arrayList.size() : 0) > 0 && I(this.f1050v);
                a.w wVar2 = a3.f1010c;
                if (wVar2 != null) {
                    wVar2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(C0050u c0050u, z1.l lVar, AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        String str;
        if (this.f1048t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f1048t = c0050u;
        this.f1049u = lVar;
        this.f1050v = abstractComponentCallbacksC0047q;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1041m;
        if (abstractComponentCallbacksC0047q != 0) {
            copyOnWriteArrayList.add(new D(abstractComponentCallbacksC0047q));
        } else if (c0050u != null) {
            copyOnWriteArrayList.add(c0050u);
        }
        if (this.f1050v != null) {
            a0();
        }
        if (c0050u != null) {
            a.x k2 = c0050u.f1221e.k();
            this.f1037g = k2;
            C0050u c0050u2 = abstractComponentCallbacksC0047q != 0 ? abstractComponentCallbacksC0047q : c0050u;
            k2.getClass();
            A a2 = this.h;
            g1.d.e(a2, "onBackPressedCallback");
            androidx.lifecycle.t f2 = c0050u2.f();
            if (f2.f1578c != EnumC0070m.f1568a) {
                a2.f1009b.add(new a.u(k2, f2, a2));
                k2.d();
                a2.f1010c = new a.w(0, k2);
            }
        }
        if (abstractComponentCallbacksC0047q != 0) {
            L l2 = abstractComponentCallbacksC0047q.f1203r.f1030L;
            HashMap hashMap = l2.f1063c;
            L l3 = (L) hashMap.get(abstractComponentCallbacksC0047q.f1192e);
            if (l3 == null) {
                l3 = new L(l2.f1064e);
                hashMap.put(abstractComponentCallbacksC0047q.f1192e, l3);
            }
            this.f1030L = l3;
        } else if (c0050u != null) {
            this.f1030L = (L) new E.g(c0050u.f1221e.d(), L.h).w(L.class);
        } else {
            this.f1030L = new L(false);
        }
        L l4 = this.f1030L;
        l4.f1066g = this.f1024E || this.f1025F;
        this.f1034c.d = l4;
        C0050u c0050u3 = this.f1048t;
        if (c0050u3 != null && abstractComponentCallbacksC0047q == 0) {
            j0.d c2 = c0050u3.c();
            c2.e("android:support:fragments", new r(2, this));
            Bundle c3 = c2.c("android:support:fragments");
            if (c3 != null) {
                Q(c3);
            }
        }
        C0050u c0050u4 = this.f1048t;
        if (c0050u4 != null) {
            AbstractActivityC0110i abstractActivityC0110i = c0050u4.f1221e;
            if (abstractComponentCallbacksC0047q != 0) {
                str = abstractComponentCallbacksC0047q.f1192e + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            String f3 = X0.a.f(str2, "StartActivityForResult");
            E e2 = new E(2);
            z zVar = new z(this, 1);
            a.j jVar = abstractActivityC0110i.h;
            this.f1054z = jVar.b(f3, e2, zVar);
            this.f1020A = jVar.b(X0.a.f(str2, "StartIntentSenderForResult"), new E(0), new z(this, 2));
            this.f1021B = jVar.b(X0.a.f(str2, "RequestPermissions"), new E(1), new z(this, 0));
        }
        C0050u c0050u5 = this.f1048t;
        if (c0050u5 != null) {
            c0050u5.f1221e.i(this.f1042n);
        }
        C0050u c0050u6 = this.f1048t;
        if (c0050u6 != null) {
            AbstractActivityC0110i abstractActivityC0110i2 = c0050u6.f1221e;
            y yVar = this.f1043o;
            abstractActivityC0110i2.getClass();
            g1.d.e(yVar, "listener");
            abstractActivityC0110i2.f1266j.add(yVar);
        }
        C0050u c0050u7 = this.f1048t;
        if (c0050u7 != null) {
            AbstractActivityC0110i abstractActivityC0110i3 = c0050u7.f1221e;
            y yVar2 = this.f1044p;
            abstractActivityC0110i3.getClass();
            g1.d.e(yVar2, "listener");
            abstractActivityC0110i3.f1268l.add(yVar2);
        }
        C0050u c0050u8 = this.f1048t;
        if (c0050u8 != null) {
            AbstractActivityC0110i abstractActivityC0110i4 = c0050u8.f1221e;
            y yVar3 = this.f1045q;
            abstractActivityC0110i4.getClass();
            g1.d.e(yVar3, "listener");
            abstractActivityC0110i4.f1269m.add(yVar3);
        }
        C0050u c0050u9 = this.f1048t;
        if (c0050u9 == null || abstractComponentCallbacksC0047q != 0) {
            return;
        }
        AbstractActivityC0110i abstractActivityC0110i5 = c0050u9.f1221e;
        B b2 = this.f1046r;
        abstractActivityC0110i5.getClass();
        g1.d.e(b2, "provider");
        A1.j jVar2 = abstractActivityC0110i5.f1262c;
        ((CopyOnWriteArrayList) jVar2.f81c).add(b2);
        ((Runnable) jVar2.f80b).run();
    }

    public final void c(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0047q);
        }
        if (abstractComponentCallbacksC0047q.f1211z) {
            abstractComponentCallbacksC0047q.f1211z = false;
            if (abstractComponentCallbacksC0047q.f1196k) {
                return;
            }
            this.f1034c.a(abstractComponentCallbacksC0047q);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0047q);
            }
            if (F(abstractComponentCallbacksC0047q)) {
                this.f1023D = true;
            }
        }
    }

    public final void d() {
        this.f1033b = false;
        this.f1028J.clear();
        this.f1027I.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f1034c.h().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((O) it.next()).f1079c.f1175D;
            if (viewGroup != null) {
                hashSet.add(C0039i.f(viewGroup, D()));
            }
        }
        return hashSet;
    }

    public final O f(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        String str = abstractComponentCallbacksC0047q.f1192e;
        T0.g gVar = this.f1034c;
        O o2 = (O) ((HashMap) gVar.f825b).get(str);
        if (o2 != null) {
            return o2;
        }
        O o3 = new O(this.f1040l, gVar, abstractComponentCallbacksC0047q);
        o3.m(this.f1048t.f1219b.getClassLoader());
        o3.f1080e = this.f1047s;
        return o3;
    }

    public final void g(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0047q);
        }
        if (abstractComponentCallbacksC0047q.f1211z) {
            return;
        }
        abstractComponentCallbacksC0047q.f1211z = true;
        if (abstractComponentCallbacksC0047q.f1196k) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0047q);
            }
            T0.g gVar = this.f1034c;
            synchronized (((ArrayList) gVar.f824a)) {
                ((ArrayList) gVar.f824a).remove(abstractComponentCallbacksC0047q);
            }
            abstractComponentCallbacksC0047q.f1196k = false;
            if (F(abstractComponentCallbacksC0047q)) {
                this.f1023D = true;
            }
            W(abstractComponentCallbacksC0047q);
        }
    }

    public final void h(boolean z2) {
        if (z2 && this.f1048t != null) {
            Z(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q : this.f1034c.j()) {
            if (abstractComponentCallbacksC0047q != null) {
                abstractComponentCallbacksC0047q.f1174C = true;
                if (z2) {
                    abstractComponentCallbacksC0047q.f1205t.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.f1047s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q : this.f1034c.j()) {
            if (abstractComponentCallbacksC0047q != null) {
                if (!abstractComponentCallbacksC0047q.f1210y ? abstractComponentCallbacksC0047q.f1205t.i() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.f1047s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q : this.f1034c.j()) {
            if (abstractComponentCallbacksC0047q != null && H(abstractComponentCallbacksC0047q)) {
                if (!abstractComponentCallbacksC0047q.f1210y ? abstractComponentCallbacksC0047q.f1205t.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0047q);
                    z2 = true;
                }
            }
        }
        if (this.f1035e != null) {
            for (int i = 0; i < this.f1035e.size(); i++) {
                AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q2 = (AbstractComponentCallbacksC0047q) this.f1035e.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0047q2)) {
                    abstractComponentCallbacksC0047q2.getClass();
                }
            }
        }
        this.f1035e = arrayList;
        return z2;
    }

    public final void k() {
        boolean z2 = true;
        this.f1026G = true;
        y(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0039i) it.next()).e();
        }
        C0050u c0050u = this.f1048t;
        T0.g gVar = this.f1034c;
        if (c0050u != null) {
            z2 = ((L) gVar.d).f1065f;
        } else {
            AbstractActivityC0110i abstractActivityC0110i = c0050u.f1219b;
            if (abstractActivityC0110i != null) {
                z2 = true ^ abstractActivityC0110i.isChangingConfigurations();
            }
        }
        if (z2) {
            Iterator it2 = this.f1038j.values().iterator();
            while (it2.hasNext()) {
                for (String str : ((C0033c) it2.next()).f1127a) {
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
        C0050u c0050u2 = this.f1048t;
        if (c0050u2 != null) {
            AbstractActivityC0110i abstractActivityC0110i2 = c0050u2.f1221e;
            y yVar = this.f1043o;
            abstractActivityC0110i2.getClass();
            g1.d.e(yVar, "listener");
            abstractActivityC0110i2.f1266j.remove(yVar);
        }
        C0050u c0050u3 = this.f1048t;
        if (c0050u3 != null) {
            AbstractActivityC0110i abstractActivityC0110i3 = c0050u3.f1221e;
            y yVar2 = this.f1042n;
            abstractActivityC0110i3.getClass();
            g1.d.e(yVar2, "listener");
            abstractActivityC0110i3.i.remove(yVar2);
        }
        C0050u c0050u4 = this.f1048t;
        if (c0050u4 != null) {
            AbstractActivityC0110i abstractActivityC0110i4 = c0050u4.f1221e;
            y yVar3 = this.f1044p;
            abstractActivityC0110i4.getClass();
            g1.d.e(yVar3, "listener");
            abstractActivityC0110i4.f1268l.remove(yVar3);
        }
        C0050u c0050u5 = this.f1048t;
        if (c0050u5 != null) {
            AbstractActivityC0110i abstractActivityC0110i5 = c0050u5.f1221e;
            y yVar4 = this.f1045q;
            abstractActivityC0110i5.getClass();
            g1.d.e(yVar4, "listener");
            abstractActivityC0110i5.f1269m.remove(yVar4);
        }
        C0050u c0050u6 = this.f1048t;
        if (c0050u6 != null) {
            AbstractActivityC0110i abstractActivityC0110i6 = c0050u6.f1221e;
            B b2 = this.f1046r;
            abstractActivityC0110i6.getClass();
            g1.d.e(b2, "provider");
            A1.j jVar = abstractActivityC0110i6.f1262c;
            ((CopyOnWriteArrayList) jVar.f81c).remove(b2);
            if (((HashMap) jVar.d).remove(b2) != null) {
                throw new ClassCastException();
            }
            ((Runnable) jVar.f80b).run();
        }
        this.f1048t = null;
        this.f1049u = null;
        this.f1050v = null;
        if (this.f1037g != null) {
            Iterator it3 = this.h.f1009b.iterator();
            while (it3.hasNext()) {
                ((a.c) it3.next()).cancel();
            }
            this.f1037g = null;
        }
        D.j jVar2 = this.f1054z;
        if (jVar2 != null) {
            jVar2.J();
            this.f1020A.J();
            this.f1021B.J();
        }
    }

    public final void l(boolean z2) {
        if (z2 && this.f1048t != null) {
            Z(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q : this.f1034c.j()) {
            if (abstractComponentCallbacksC0047q != null) {
                abstractComponentCallbacksC0047q.f1174C = true;
                if (z2) {
                    abstractComponentCallbacksC0047q.f1205t.l(true);
                }
            }
        }
    }

    public final void m(boolean z2, boolean z3) {
        if (z3 && this.f1048t != null) {
            Z(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q : this.f1034c.j()) {
            if (abstractComponentCallbacksC0047q != null && z3) {
                abstractComponentCallbacksC0047q.f1205t.m(z2, true);
            }
        }
    }

    public final void n() {
        Iterator it = this.f1034c.i().iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = (AbstractComponentCallbacksC0047q) it.next();
            if (abstractComponentCallbacksC0047q != null) {
                abstractComponentCallbacksC0047q.n();
                abstractComponentCallbacksC0047q.f1205t.n();
            }
        }
    }

    public final boolean o() {
        if (this.f1047s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q : this.f1034c.j()) {
            if (abstractComponentCallbacksC0047q != null) {
                if (!abstractComponentCallbacksC0047q.f1210y ? abstractComponentCallbacksC0047q.f1205t.o() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f1047s < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q : this.f1034c.j()) {
            if (abstractComponentCallbacksC0047q != null && !abstractComponentCallbacksC0047q.f1210y) {
                abstractComponentCallbacksC0047q.f1205t.p();
            }
        }
    }

    public final void q(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        if (abstractComponentCallbacksC0047q != null) {
            if (abstractComponentCallbacksC0047q.equals(this.f1034c.d(abstractComponentCallbacksC0047q.f1192e))) {
                abstractComponentCallbacksC0047q.f1203r.getClass();
                boolean I2 = I(abstractComponentCallbacksC0047q);
                Boolean bool = abstractComponentCallbacksC0047q.f1195j;
                if (bool == null || bool.booleanValue() != I2) {
                    abstractComponentCallbacksC0047q.f1195j = Boolean.valueOf(I2);
                    I i = abstractComponentCallbacksC0047q.f1205t;
                    i.a0();
                    i.q(i.f1051w);
                }
            }
        }
    }

    public final void r(boolean z2, boolean z3) {
        if (z3 && this.f1048t != null) {
            Z(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q : this.f1034c.j()) {
            if (abstractComponentCallbacksC0047q != null && z3) {
                abstractComponentCallbacksC0047q.f1205t.r(z2, true);
            }
        }
    }

    public final boolean s() {
        if (this.f1047s < 1) {
            return false;
        }
        boolean z2 = false;
        for (AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q : this.f1034c.j()) {
            if (abstractComponentCallbacksC0047q != null && H(abstractComponentCallbacksC0047q)) {
                if (!abstractComponentCallbacksC0047q.f1210y ? abstractComponentCallbacksC0047q.f1205t.s() : false) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final void t(int i) {
        try {
            this.f1033b = true;
            for (O o2 : ((HashMap) this.f1034c.f825b).values()) {
                if (o2 != null) {
                    o2.f1080e = i;
                }
            }
            J(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0039i) it.next()).e();
            }
            this.f1033b = false;
            y(true);
        } catch (Throwable th) {
            this.f1033b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f1050v;
        if (abstractComponentCallbacksC0047q != null) {
            sb.append(abstractComponentCallbacksC0047q.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f1050v)));
            sb.append("}");
        } else {
            C0050u c0050u = this.f1048t;
            if (c0050u != null) {
                sb.append(c0050u.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f1048t)));
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
        String f2 = X0.a.f(str, "    ");
        T0.g gVar = this.f1034c;
        gVar.getClass();
        String str3 = str + "    ";
        HashMap hashMap = (HashMap) gVar.f825b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (O o2 : hashMap.values()) {
                printWriter.print(str);
                if (o2 != null) {
                    AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = o2.f1079c;
                    printWriter.println(abstractComponentCallbacksC0047q);
                    abstractComponentCallbacksC0047q.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0047q.f1207v));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0047q.f1208w));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0047q.f1209x);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0047q.f1189a);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0047q.f1192e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0047q.f1202q);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0047q.f1196k);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0047q.f1197l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0047q.f1198m);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0047q.f1199n);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0047q.f1210y);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0047q.f1211z);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0047q.f1173B);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0047q.f1172A);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0047q.f1178G);
                    if (abstractComponentCallbacksC0047q.f1203r != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0047q.f1203r);
                    }
                    if (abstractComponentCallbacksC0047q.f1204s != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0047q.f1204s);
                    }
                    if (abstractComponentCallbacksC0047q.f1206u != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0047q.f1206u);
                    }
                    if (abstractComponentCallbacksC0047q.f1193f != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0047q.f1193f);
                    }
                    if (abstractComponentCallbacksC0047q.f1190b != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0047q.f1190b);
                    }
                    if (abstractComponentCallbacksC0047q.f1191c != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0047q.f1191c);
                    }
                    if (abstractComponentCallbacksC0047q.d != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0047q.d);
                    }
                    Object obj = abstractComponentCallbacksC0047q.f1194g;
                    if (obj == null) {
                        I i = abstractComponentCallbacksC0047q.f1203r;
                        obj = (i == null || (str2 = abstractComponentCallbacksC0047q.h) == null) ? null : i.f1034c.d(str2);
                    }
                    if (obj != null) {
                        printWriter.print(str3);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC0047q.i);
                    }
                    printWriter.print(str3);
                    printWriter.print("mPopDirection=");
                    C0046p c0046p = abstractComponentCallbacksC0047q.H;
                    printWriter.println(c0046p == null ? false : c0046p.f1163a);
                    C0046p c0046p2 = abstractComponentCallbacksC0047q.H;
                    if ((c0046p2 == null ? 0 : c0046p2.f1164b) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        C0046p c0046p3 = abstractComponentCallbacksC0047q.H;
                        printWriter.println(c0046p3 == null ? 0 : c0046p3.f1164b);
                    }
                    C0046p c0046p4 = abstractComponentCallbacksC0047q.H;
                    if ((c0046p4 == null ? 0 : c0046p4.f1165c) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        C0046p c0046p5 = abstractComponentCallbacksC0047q.H;
                        printWriter.println(c0046p5 == null ? 0 : c0046p5.f1165c);
                    }
                    C0046p c0046p6 = abstractComponentCallbacksC0047q.H;
                    if ((c0046p6 == null ? 0 : c0046p6.d) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        C0046p c0046p7 = abstractComponentCallbacksC0047q.H;
                        printWriter.println(c0046p7 == null ? 0 : c0046p7.d);
                    }
                    C0046p c0046p8 = abstractComponentCallbacksC0047q.H;
                    if ((c0046p8 == null ? 0 : c0046p8.f1166e) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        C0046p c0046p9 = abstractComponentCallbacksC0047q.H;
                        printWriter.println(c0046p9 == null ? 0 : c0046p9.f1166e);
                    }
                    if (abstractComponentCallbacksC0047q.f1175D != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0047q.f1175D);
                    }
                    if (abstractComponentCallbacksC0047q.f1176E != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0047q.f1176E);
                    }
                    if (abstractComponentCallbacksC0047q.h() != null) {
                        q.l lVar = ((C0083a) new E.g(abstractComponentCallbacksC0047q.d(), C0083a.f2125c).w(C0083a.class)).f2126b;
                        if (lVar.f3375c > 0) {
                            printWriter.print(str3);
                            printWriter.println("Loaders:");
                            if (lVar.f3375c > 0) {
                                if (lVar.f3374b[0] != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(str3);
                                printWriter.print("  #");
                                printWriter.print(lVar.f3373a[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + abstractComponentCallbacksC0047q.f1205t + ":");
                    abstractComponentCallbacksC0047q.f1205t.v(X0.a.f(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) gVar.f824a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size3; i2++) {
                AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q2 = (AbstractComponentCallbacksC0047q) arrayList.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0047q2.toString());
            }
        }
        ArrayList arrayList2 = this.f1035e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q3 = (AbstractComponentCallbacksC0047q) this.f1035e.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0047q3.toString());
            }
        }
        ArrayList arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size; i4++) {
                C0031a c0031a = (C0031a) this.d.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(c0031a.toString());
                c0031a.d(f2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.f1032a) {
            try {
                int size4 = this.f1032a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i5 = 0; i5 < size4; i5++) {
                        Object obj2 = (G) this.f1032a.get(i5);
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
        printWriter.println(this.f1048t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1049u);
        if (this.f1050v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1050v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1047s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f1024E);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1025F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f1026G);
        if (this.f1023D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f1023D);
        }
    }

    public final void w(G g2, boolean z2) {
        if (!z2) {
            if (this.f1048t == null) {
                if (!this.f1026G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f1024E || this.f1025F) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1032a) {
            try {
                if (this.f1048t == null) {
                    if (!z2) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f1032a.add(g2);
                    S();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(boolean z2) {
        if (this.f1033b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f1048t == null) {
            if (!this.f1026G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f1048t.f1220c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2 && (this.f1024E || this.f1025F)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f1027I == null) {
            this.f1027I = new ArrayList();
            this.f1028J = new ArrayList();
        }
    }

    public final boolean y(boolean z2) {
        boolean z3;
        x(z2);
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.f1027I;
            ArrayList arrayList2 = this.f1028J;
            synchronized (this.f1032a) {
                if (this.f1032a.isEmpty()) {
                    z3 = false;
                } else {
                    try {
                        int size = this.f1032a.size();
                        z3 = false;
                        for (int i = 0; i < size; i++) {
                            z3 |= ((G) this.f1032a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z3) {
                a0();
                u();
                ((HashMap) this.f1034c.f825b).values().removeAll(Collections.singleton(null));
                return z4;
            }
            z4 = true;
            this.f1033b = true;
            try {
                P(this.f1027I, this.f1028J);
            } finally {
                d();
            }
        }
    }

    public final void z(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        T0.g gVar;
        T0.g gVar2;
        T0.g gVar3;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        boolean z2 = ((C0031a) arrayList3.get(i)).f1112o;
        ArrayList arrayList5 = this.f1029K;
        if (arrayList5 == null) {
            this.f1029K = new ArrayList();
        } else {
            arrayList5.clear();
        }
        ArrayList arrayList6 = this.f1029K;
        T0.g gVar4 = this.f1034c;
        arrayList6.addAll(gVar4.j());
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f1051w;
        int i6 = i;
        boolean z3 = false;
        while (true) {
            int i7 = 1;
            if (i6 >= i2) {
                T0.g gVar5 = gVar4;
                this.f1029K.clear();
                if (!z2 && this.f1047s >= 1) {
                    for (int i8 = i; i8 < i2; i8++) {
                        Iterator it = ((C0031a) arrayList.get(i8)).f1101a.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q2 = ((P) it.next()).f1082b;
                            if (abstractComponentCallbacksC0047q2 == null || abstractComponentCallbacksC0047q2.f1203r == null) {
                                gVar = gVar5;
                            } else {
                                gVar = gVar5;
                                gVar.m(f(abstractComponentCallbacksC0047q2));
                            }
                            gVar5 = gVar;
                        }
                    }
                }
                for (int i9 = i; i9 < i2; i9++) {
                    C0031a c0031a = (C0031a) arrayList.get(i9);
                    if (((Boolean) arrayList2.get(i9)).booleanValue()) {
                        c0031a.c(-1);
                        ArrayList arrayList7 = c0031a.f1101a;
                        boolean z4 = true;
                        for (int size = arrayList7.size() - 1; size >= 0; size--) {
                            P p2 = (P) arrayList7.get(size);
                            AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q3 = p2.f1082b;
                            if (abstractComponentCallbacksC0047q3 != null) {
                                if (abstractComponentCallbacksC0047q3.H != null) {
                                    abstractComponentCallbacksC0047q3.e().f1163a = z4;
                                }
                                int i10 = c0031a.f1105f;
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
                                if (abstractComponentCallbacksC0047q3.H != null || i11 != 0) {
                                    abstractComponentCallbacksC0047q3.e();
                                    abstractComponentCallbacksC0047q3.H.f1167f = i11;
                                }
                                abstractComponentCallbacksC0047q3.e();
                                abstractComponentCallbacksC0047q3.H.getClass();
                            }
                            int i13 = p2.f1081a;
                            I i14 = c0031a.f1113p;
                            switch (i13) {
                                case 1:
                                    abstractComponentCallbacksC0047q3.E(p2.d, p2.f1084e, p2.f1085f, p2.f1086g);
                                    z4 = true;
                                    i14.T(abstractComponentCallbacksC0047q3, true);
                                    i14.O(abstractComponentCallbacksC0047q3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + p2.f1081a);
                                case 3:
                                    abstractComponentCallbacksC0047q3.E(p2.d, p2.f1084e, p2.f1085f, p2.f1086g);
                                    i14.a(abstractComponentCallbacksC0047q3);
                                    z4 = true;
                                case 4:
                                    abstractComponentCallbacksC0047q3.E(p2.d, p2.f1084e, p2.f1085f, p2.f1086g);
                                    i14.getClass();
                                    X(abstractComponentCallbacksC0047q3);
                                    z4 = true;
                                case 5:
                                    abstractComponentCallbacksC0047q3.E(p2.d, p2.f1084e, p2.f1085f, p2.f1086g);
                                    i14.T(abstractComponentCallbacksC0047q3, true);
                                    i14.E(abstractComponentCallbacksC0047q3);
                                    z4 = true;
                                case 6:
                                    abstractComponentCallbacksC0047q3.E(p2.d, p2.f1084e, p2.f1085f, p2.f1086g);
                                    i14.c(abstractComponentCallbacksC0047q3);
                                    z4 = true;
                                case 7:
                                    abstractComponentCallbacksC0047q3.E(p2.d, p2.f1084e, p2.f1085f, p2.f1086g);
                                    i14.T(abstractComponentCallbacksC0047q3, true);
                                    i14.g(abstractComponentCallbacksC0047q3);
                                    z4 = true;
                                case 8:
                                    i14.V(null);
                                    z4 = true;
                                case 9:
                                    i14.V(abstractComponentCallbacksC0047q3);
                                    z4 = true;
                                case 10:
                                    i14.U(abstractComponentCallbacksC0047q3, p2.h);
                                    z4 = true;
                            }
                        }
                    } else {
                        c0031a.c(1);
                        ArrayList arrayList8 = c0031a.f1101a;
                        int size2 = arrayList8.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            P p3 = (P) arrayList8.get(i15);
                            AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q4 = p3.f1082b;
                            if (abstractComponentCallbacksC0047q4 != null) {
                                if (abstractComponentCallbacksC0047q4.H != null) {
                                    abstractComponentCallbacksC0047q4.e().f1163a = false;
                                }
                                int i16 = c0031a.f1105f;
                                if (abstractComponentCallbacksC0047q4.H != null || i16 != 0) {
                                    abstractComponentCallbacksC0047q4.e();
                                    abstractComponentCallbacksC0047q4.H.f1167f = i16;
                                }
                                abstractComponentCallbacksC0047q4.e();
                                abstractComponentCallbacksC0047q4.H.getClass();
                            }
                            int i17 = p3.f1081a;
                            I i18 = c0031a.f1113p;
                            switch (i17) {
                                case 1:
                                    abstractComponentCallbacksC0047q4.E(p3.d, p3.f1084e, p3.f1085f, p3.f1086g);
                                    i18.T(abstractComponentCallbacksC0047q4, false);
                                    i18.a(abstractComponentCallbacksC0047q4);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + p3.f1081a);
                                case 3:
                                    abstractComponentCallbacksC0047q4.E(p3.d, p3.f1084e, p3.f1085f, p3.f1086g);
                                    i18.O(abstractComponentCallbacksC0047q4);
                                case 4:
                                    abstractComponentCallbacksC0047q4.E(p3.d, p3.f1084e, p3.f1085f, p3.f1086g);
                                    i18.E(abstractComponentCallbacksC0047q4);
                                case 5:
                                    abstractComponentCallbacksC0047q4.E(p3.d, p3.f1084e, p3.f1085f, p3.f1086g);
                                    i18.T(abstractComponentCallbacksC0047q4, false);
                                    X(abstractComponentCallbacksC0047q4);
                                case 6:
                                    abstractComponentCallbacksC0047q4.E(p3.d, p3.f1084e, p3.f1085f, p3.f1086g);
                                    i18.g(abstractComponentCallbacksC0047q4);
                                case 7:
                                    abstractComponentCallbacksC0047q4.E(p3.d, p3.f1084e, p3.f1085f, p3.f1086g);
                                    i18.T(abstractComponentCallbacksC0047q4, false);
                                    i18.c(abstractComponentCallbacksC0047q4);
                                case 8:
                                    i18.V(abstractComponentCallbacksC0047q4);
                                case 9:
                                    i18.V(null);
                                case 10:
                                    i18.U(abstractComponentCallbacksC0047q4, p3.i);
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i19 = i; i19 < i2; i19++) {
                    C0031a c0031a2 = (C0031a) arrayList.get(i19);
                    if (booleanValue) {
                        for (int size3 = c0031a2.f1101a.size() - 1; size3 >= 0; size3--) {
                            AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q5 = ((P) c0031a2.f1101a.get(size3)).f1082b;
                            if (abstractComponentCallbacksC0047q5 != null) {
                                f(abstractComponentCallbacksC0047q5).k();
                            }
                        }
                    } else {
                        Iterator it2 = c0031a2.f1101a.iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q6 = ((P) it2.next()).f1082b;
                            if (abstractComponentCallbacksC0047q6 != null) {
                                f(abstractComponentCallbacksC0047q6).k();
                            }
                        }
                    }
                }
                J(this.f1047s, true);
                HashSet hashSet = new HashSet();
                for (int i20 = i; i20 < i2; i20++) {
                    Iterator it3 = ((C0031a) arrayList.get(i20)).f1101a.iterator();
                    while (it3.hasNext()) {
                        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q7 = ((P) it3.next()).f1082b;
                        if (abstractComponentCallbacksC0047q7 != null && (viewGroup = abstractComponentCallbacksC0047q7.f1175D) != null) {
                            hashSet.add(C0039i.f(viewGroup, D()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    C0039i c0039i = (C0039i) it4.next();
                    c0039i.d = booleanValue;
                    synchronized (c0039i.f1141b) {
                        try {
                            c0039i.g();
                            c0039i.f1143e = false;
                            int size4 = c0039i.f1141b.size() - 1;
                            while (true) {
                                if (size4 >= 0) {
                                    U u2 = (U) c0039i.f1141b.get(size4);
                                    int c2 = X0.a.c(u2.f1097c.f1176E);
                                    if (u2.f1095a != 2 || c2 == 2) {
                                        size4--;
                                    } else {
                                        C0046p c0046p = u2.f1097c.H;
                                        c0039i.f1143e = false;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    c0039i.c();
                }
                for (int i21 = i; i21 < i2; i21++) {
                    C0031a c0031a3 = (C0031a) arrayList.get(i21);
                    if (((Boolean) arrayList2.get(i21)).booleanValue() && c0031a3.f1115r >= 0) {
                        c0031a3.f1115r = -1;
                    }
                    c0031a3.getClass();
                }
                return;
            }
            C0031a c0031a4 = (C0031a) arrayList3.get(i6);
            if (((Boolean) arrayList4.get(i6)).booleanValue()) {
                gVar2 = gVar4;
                int i22 = 1;
                ArrayList arrayList9 = this.f1029K;
                ArrayList arrayList10 = c0031a4.f1101a;
                int size5 = arrayList10.size() - 1;
                while (size5 >= 0) {
                    P p4 = (P) arrayList10.get(size5);
                    int i23 = p4.f1081a;
                    if (i23 != i22) {
                        if (i23 != 3) {
                            switch (i23) {
                                case 8:
                                    abstractComponentCallbacksC0047q = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0047q = p4.f1082b;
                                    break;
                                case 10:
                                    p4.i = p4.h;
                                    break;
                            }
                            size5--;
                            i22 = 1;
                        }
                        arrayList9.add(p4.f1082b);
                        size5--;
                        i22 = 1;
                    }
                    arrayList9.remove(p4.f1082b);
                    size5--;
                    i22 = 1;
                }
            } else {
                ArrayList arrayList11 = this.f1029K;
                int i24 = 0;
                while (true) {
                    ArrayList arrayList12 = c0031a4.f1101a;
                    if (i24 < arrayList12.size()) {
                        P p5 = (P) arrayList12.get(i24);
                        int i25 = p5.f1081a;
                        if (i25 != i7) {
                            if (i25 != 2) {
                                if (i25 == 3 || i25 == 6) {
                                    arrayList11.remove(p5.f1082b);
                                    AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q8 = p5.f1082b;
                                    if (abstractComponentCallbacksC0047q8 == abstractComponentCallbacksC0047q) {
                                        arrayList12.add(i24, new P(9, abstractComponentCallbacksC0047q8));
                                        i24++;
                                        gVar3 = gVar4;
                                        i3 = 1;
                                        abstractComponentCallbacksC0047q = null;
                                    }
                                } else if (i25 == 7) {
                                    gVar3 = gVar4;
                                    i3 = 1;
                                } else if (i25 == 8) {
                                    arrayList12.add(i24, new P(9, abstractComponentCallbacksC0047q, 0));
                                    p5.f1083c = true;
                                    i24++;
                                    abstractComponentCallbacksC0047q = p5.f1082b;
                                }
                                gVar3 = gVar4;
                                i3 = 1;
                            } else {
                                AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q9 = p5.f1082b;
                                int i26 = abstractComponentCallbacksC0047q9.f1208w;
                                int size6 = arrayList11.size() - 1;
                                boolean z5 = false;
                                while (size6 >= 0) {
                                    T0.g gVar6 = gVar4;
                                    AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q10 = (AbstractComponentCallbacksC0047q) arrayList11.get(size6);
                                    if (abstractComponentCallbacksC0047q10.f1208w != i26) {
                                        i4 = i26;
                                    } else if (abstractComponentCallbacksC0047q10 == abstractComponentCallbacksC0047q9) {
                                        i4 = i26;
                                        z5 = true;
                                    } else {
                                        if (abstractComponentCallbacksC0047q10 == abstractComponentCallbacksC0047q) {
                                            i4 = i26;
                                            arrayList12.add(i24, new P(9, abstractComponentCallbacksC0047q10, 0));
                                            i24++;
                                            i5 = 0;
                                            abstractComponentCallbacksC0047q = null;
                                        } else {
                                            i4 = i26;
                                            i5 = 0;
                                        }
                                        P p6 = new P(3, abstractComponentCallbacksC0047q10, i5);
                                        p6.d = p5.d;
                                        p6.f1085f = p5.f1085f;
                                        p6.f1084e = p5.f1084e;
                                        p6.f1086g = p5.f1086g;
                                        arrayList12.add(i24, p6);
                                        arrayList11.remove(abstractComponentCallbacksC0047q10);
                                        i24++;
                                        abstractComponentCallbacksC0047q = abstractComponentCallbacksC0047q;
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
                                    p5.f1081a = 1;
                                    p5.f1083c = true;
                                    arrayList11.add(abstractComponentCallbacksC0047q9);
                                }
                            }
                            i24 += i3;
                            i7 = i3;
                            gVar4 = gVar3;
                        } else {
                            gVar3 = gVar4;
                            i3 = i7;
                        }
                        arrayList11.add(p5.f1082b);
                        i24 += i3;
                        i7 = i3;
                        gVar4 = gVar3;
                    } else {
                        gVar2 = gVar4;
                    }
                }
            }
            z3 = z3 || c0031a4.f1106g;
            i6++;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            gVar4 = gVar2;
        }
    }
}
