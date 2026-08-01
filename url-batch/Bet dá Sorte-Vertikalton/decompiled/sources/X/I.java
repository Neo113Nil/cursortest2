package X;

import K.C0011l;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.EnumC0072m;
import com.glasspulse.glasspulse.R;
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

/* loaded from: classes.dex */
public final class I {

    /* renamed from: A, reason: collision with root package name */
    public B.j f885A;

    /* renamed from: B, reason: collision with root package name */
    public B.j f886B;

    /* renamed from: C, reason: collision with root package name */
    public ArrayDeque f887C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f888D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f889E;
    public boolean F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f890G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f891H;

    /* renamed from: I, reason: collision with root package name */
    public ArrayList f892I;

    /* renamed from: J, reason: collision with root package name */
    public ArrayList f893J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList f894K;

    /* renamed from: L, reason: collision with root package name */
    public L f895L;

    /* renamed from: M, reason: collision with root package name */
    public final P0.A f896M;

    /* renamed from: b, reason: collision with root package name */
    public boolean f898b;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f900e;

    /* renamed from: g, reason: collision with root package name */
    public a.x f902g;

    /* renamed from: l, reason: collision with root package name */
    public final B.j f905l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f906m;

    /* renamed from: n, reason: collision with root package name */
    public final y f907n;

    /* renamed from: o, reason: collision with root package name */
    public final y f908o;

    /* renamed from: p, reason: collision with root package name */
    public final y f909p;

    /* renamed from: q, reason: collision with root package name */
    public final y f910q;

    /* renamed from: r, reason: collision with root package name */
    public final B f911r;

    /* renamed from: s, reason: collision with root package name */
    public int f912s;

    /* renamed from: t, reason: collision with root package name */
    public C0050u f913t;

    /* renamed from: u, reason: collision with root package name */
    public u1.l f914u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractComponentCallbacksC0047q f915v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractComponentCallbacksC0047q f916w;

    /* renamed from: x, reason: collision with root package name */
    public final C f917x;

    /* renamed from: y, reason: collision with root package name */
    public final M0.e f918y;

    /* renamed from: z, reason: collision with root package name */
    public B.j f919z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f897a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final T.u f899c = new T.u(2);

    /* renamed from: f, reason: collision with root package name */
    public final x f901f = new x(this);
    public final A h = new A(this);
    public final AtomicInteger i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map f903j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map f904k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [X.y] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.y] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.y] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.y] */
    public I() {
        Collections.synchronizedMap(new HashMap());
        this.f905l = new B.j(this);
        this.f906m = new CopyOnWriteArrayList();
        final int i = 0;
        this.f907n = new J.a(this) { // from class: X.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1094b;

            {
                this.f1094b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        I i2 = this.f1094b;
                        if (i2.G()) {
                            i2.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i3 = this.f1094b;
                        if (i3.G() && num.intValue() == 80) {
                            i3.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i4 = this.f1094b;
                        if (i4.G()) {
                            i4.m(fVar.f4245a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1094b;
                        if (i5.G()) {
                            i5.r(gVar.f4246a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f908o = new J.a(this) { // from class: X.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1094b;

            {
                this.f1094b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i2) {
                    case 0:
                        I i22 = this.f1094b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i3 = this.f1094b;
                        if (i3.G() && num.intValue() == 80) {
                            i3.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i4 = this.f1094b;
                        if (i4.G()) {
                            i4.m(fVar.f4245a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1094b;
                        if (i5.G()) {
                            i5.r(gVar.f4246a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.f909p = new J.a(this) { // from class: X.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1094b;

            {
                this.f1094b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i3) {
                    case 0:
                        I i22 = this.f1094b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i32 = this.f1094b;
                        if (i32.G() && num.intValue() == 80) {
                            i32.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i4 = this.f1094b;
                        if (i4.G()) {
                            i4.m(fVar.f4245a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1094b;
                        if (i5.G()) {
                            i5.r(gVar.f4246a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.f910q = new J.a(this) { // from class: X.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1094b;

            {
                this.f1094b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i4) {
                    case 0:
                        I i22 = this.f1094b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i32 = this.f1094b;
                        if (i32.G() && num.intValue() == 80) {
                            i32.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i42 = this.f1094b;
                        if (i42.G()) {
                            i42.m(fVar.f4245a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1094b;
                        if (i5.G()) {
                            i5.r(gVar.f4246a, false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f911r = new B(this);
        this.f912s = -1;
        this.f917x = new C(this);
        this.f918y = new M0.e(12);
        this.f887C = new ArrayDeque();
        this.f896M = new P0.A(5, this);
    }

    public static boolean F(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        abstractComponentCallbacksC0047q.getClass();
        Iterator it = abstractComponentCallbacksC0047q.f1070t.f899c.i().iterator();
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
        return abstractComponentCallbacksC0047q.f1038B && (abstractComponentCallbacksC0047q.f1068r == null || H(abstractComponentCallbacksC0047q.f1071u));
    }

    public static boolean I(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        if (abstractComponentCallbacksC0047q == null) {
            return true;
        }
        I i = abstractComponentCallbacksC0047q.f1068r;
        return abstractComponentCallbacksC0047q.equals(i.f916w) && I(i.f915v);
    }

    public static void X(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0047q);
        }
        if (abstractComponentCallbacksC0047q.f1075y) {
            abstractComponentCallbacksC0047q.f1075y = false;
            abstractComponentCallbacksC0047q.f1044I = !abstractComponentCallbacksC0047q.f1044I;
        }
    }

    public final AbstractComponentCallbacksC0047q A(int i) {
        T.u uVar = this.f899c;
        ArrayList arrayList = (ArrayList) uVar.f816a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = (AbstractComponentCallbacksC0047q) arrayList.get(size);
            if (abstractComponentCallbacksC0047q != null && abstractComponentCallbacksC0047q.f1072v == i) {
                return abstractComponentCallbacksC0047q;
            }
        }
        for (O o2 : ((HashMap) uVar.f817b).values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q2 = o2.f944c;
                if (abstractComponentCallbacksC0047q2.f1072v == i) {
                    return abstractComponentCallbacksC0047q2;
                }
            }
        }
        return null;
    }

    public final ViewGroup B(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        ViewGroup viewGroup = abstractComponentCallbacksC0047q.f1040D;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0047q.f1073w > 0 && this.f914u.Y()) {
            View V2 = this.f914u.V(abstractComponentCallbacksC0047q.f1073w);
            if (V2 instanceof ViewGroup) {
                return (ViewGroup) V2;
            }
        }
        return null;
    }

    public final C C() {
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f915v;
        return abstractComponentCallbacksC0047q != null ? abstractComponentCallbacksC0047q.f1068r.C() : this.f917x;
    }

    public final M0.e D() {
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f915v;
        return abstractComponentCallbacksC0047q != null ? abstractComponentCallbacksC0047q.f1068r.D() : this.f918y;
    }

    public final void E(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0047q);
        }
        if (abstractComponentCallbacksC0047q.f1075y) {
            return;
        }
        abstractComponentCallbacksC0047q.f1075y = true;
        abstractComponentCallbacksC0047q.f1044I = true ^ abstractComponentCallbacksC0047q.f1044I;
        W(abstractComponentCallbacksC0047q);
    }

    public final boolean G() {
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f915v;
        if (abstractComponentCallbacksC0047q == null) {
            return true;
        }
        return abstractComponentCallbacksC0047q.m() && this.f915v.j().G();
    }

    public final void J(int i, boolean z2) {
        HashMap hashMap;
        C0050u c0050u;
        if (this.f913t == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i != this.f912s) {
            this.f912s = i;
            T.u uVar = this.f899c;
            Iterator it = ((ArrayList) uVar.f816a).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = (HashMap) uVar.f817b;
                if (!hasNext) {
                    break;
                }
                O o2 = (O) hashMap.get(((AbstractComponentCallbacksC0047q) it.next()).f1057e);
                if (o2 != null) {
                    o2.k();
                }
            }
            for (O o3 : hashMap.values()) {
                if (o3 != null) {
                    o3.k();
                    AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = o3.f944c;
                    if (abstractComponentCallbacksC0047q.f1062l && !abstractComponentCallbacksC0047q.o()) {
                        uVar.n(o3);
                    }
                }
            }
            Y();
            if (this.f888D && (c0050u = this.f913t) != null && this.f912s == 7) {
                c0050u.i.invalidateOptionsMenu();
                this.f888D = false;
            }
        }
    }

    public final void K() {
        if (this.f913t == null) {
            return;
        }
        this.f889E = false;
        this.F = false;
        this.f895L.f931g = false;
        for (AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q : this.f899c.j()) {
            if (abstractComponentCallbacksC0047q != null) {
                abstractComponentCallbacksC0047q.f1070t.K();
            }
        }
    }

    public final boolean L() {
        return M(-1, 0);
    }

    public final boolean M(int i, int i2) {
        y(false);
        x(true);
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f916w;
        if (abstractComponentCallbacksC0047q != null && i < 0 && abstractComponentCallbacksC0047q.g().L()) {
            return true;
        }
        boolean N2 = N(this.f892I, this.f893J, i, i2);
        if (N2) {
            this.f898b = true;
            try {
                P(this.f892I, this.f893J);
            } finally {
                d();
            }
        }
        a0();
        u();
        ((HashMap) this.f899c.f817b).values().removeAll(Collections.singleton(null));
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
                    if (i >= 0 && i == c0031a.f980r) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z2) {
                        while (size > 0) {
                            C0031a c0031a2 = (C0031a) this.d.get(size - 1);
                            if (i < 0 || i != c0031a2.f980r) {
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
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0047q + " nesting=" + abstractComponentCallbacksC0047q.f1067q);
        }
        boolean o2 = abstractComponentCallbacksC0047q.o();
        if (abstractComponentCallbacksC0047q.f1076z && o2) {
            return;
        }
        T.u uVar = this.f899c;
        synchronized (((ArrayList) uVar.f816a)) {
            ((ArrayList) uVar.f816a).remove(abstractComponentCallbacksC0047q);
        }
        abstractComponentCallbacksC0047q.f1061k = false;
        if (F(abstractComponentCallbacksC0047q)) {
            this.f888D = true;
        }
        abstractComponentCallbacksC0047q.f1062l = true;
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
            if (!((C0031a) arrayList.get(i)).f977o) {
                if (i2 != i) {
                    z(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0031a) arrayList.get(i2)).f977o) {
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
                bundle2.setClassLoader(this.f913t.f1084f.getClassLoader());
                this.f904k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f913t.f1084f.getClassLoader());
                arrayList.add((N) bundle.getParcelable("state"));
            }
        }
        T.u uVar = this.f899c;
        HashMap hashMap = (HashMap) uVar.f818c;
        hashMap.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            N n2 = (N) it.next();
            hashMap.put(n2.f933b, n2);
        }
        J j2 = (J) bundle3.getParcelable("state");
        if (j2 == null) {
            return;
        }
        HashMap hashMap2 = (HashMap) uVar.f817b;
        hashMap2.clear();
        Iterator it2 = j2.f920a.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            i = 2;
            jVar = this.f905l;
            if (!hasNext) {
                break;
            }
            N n3 = (N) ((HashMap) uVar.f818c).remove((String) it2.next());
            if (n3 != null) {
                AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = (AbstractComponentCallbacksC0047q) this.f895L.f927b.get(n3.f933b);
                if (abstractComponentCallbacksC0047q != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0047q);
                    }
                    o2 = new O(jVar, uVar, abstractComponentCallbacksC0047q, n3);
                } else {
                    o2 = new O(this.f905l, this.f899c, this.f913t.f1084f.getClassLoader(), C(), n3);
                }
                AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q2 = o2.f944c;
                abstractComponentCallbacksC0047q2.f1068r = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0047q2.f1057e + "): " + abstractComponentCallbacksC0047q2);
                }
                o2.m(this.f913t.f1084f.getClassLoader());
                uVar.l(o2);
                o2.f945e = this.f912s;
            }
        }
        L l2 = this.f895L;
        l2.getClass();
        Iterator it3 = new ArrayList(l2.f927b.values()).iterator();
        while (it3.hasNext()) {
            AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q3 = (AbstractComponentCallbacksC0047q) it3.next();
            if (hashMap2.get(abstractComponentCallbacksC0047q3.f1057e) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0047q3 + " that was not found in the set of active Fragments " + j2.f920a);
                }
                this.f895L.e(abstractComponentCallbacksC0047q3);
                abstractComponentCallbacksC0047q3.f1068r = this;
                O o3 = new O(jVar, uVar, abstractComponentCallbacksC0047q3);
                o3.f945e = 1;
                o3.k();
                abstractComponentCallbacksC0047q3.f1062l = true;
                o3.k();
            }
        }
        ArrayList<String> arrayList2 = j2.f921b;
        ((ArrayList) uVar.f816a).clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                AbstractComponentCallbacksC0047q d = uVar.d(str3);
                if (d == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str3 + ")");
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + d);
                }
                uVar.a(d);
            }
        }
        if (j2.f922c != null) {
            this.d = new ArrayList(j2.f922c.length);
            int i3 = 0;
            while (true) {
                C0032b[] c0032bArr = j2.f922c;
                if (i3 >= c0032bArr.length) {
                    break;
                }
                C0032b c0032b = c0032bArr[i3];
                c0032b.getClass();
                C0031a c0031a = new C0031a(this);
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    int[] iArr = c0032b.f981a;
                    if (i4 >= iArr.length) {
                        break;
                    }
                    P p2 = new P();
                    int i6 = i4 + 1;
                    p2.f946a = iArr[i4];
                    if (Log.isLoggable("FragmentManager", i)) {
                        Log.v("FragmentManager", "Instantiate " + c0031a + " op #" + i5 + " base fragment #" + iArr[i6]);
                    }
                    p2.h = EnumC0072m.values()[c0032b.f983c[i5]];
                    p2.i = EnumC0072m.values()[c0032b.d[i5]];
                    int i7 = i4 + 2;
                    p2.f948c = iArr[i6] != 0;
                    int i8 = iArr[i7];
                    p2.d = i8;
                    int i9 = iArr[i4 + 3];
                    p2.f949e = i9;
                    int i10 = i4 + 5;
                    int i11 = iArr[i4 + 4];
                    p2.f950f = i11;
                    i4 += 6;
                    int i12 = iArr[i10];
                    p2.f951g = i12;
                    c0031a.f967b = i8;
                    c0031a.f968c = i9;
                    c0031a.d = i11;
                    c0031a.f969e = i12;
                    c0031a.b(p2);
                    i5++;
                    i = 2;
                }
                c0031a.f970f = c0032b.f984e;
                c0031a.h = c0032b.f985f;
                c0031a.f971g = true;
                c0031a.i = c0032b.h;
                c0031a.f972j = c0032b.i;
                c0031a.f973k = c0032b.f987j;
                c0031a.f974l = c0032b.f988k;
                c0031a.f975m = c0032b.f989l;
                c0031a.f976n = c0032b.f990m;
                c0031a.f977o = c0032b.f991n;
                c0031a.f980r = c0032b.f986g;
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = c0032b.f982b;
                    if (i13 >= arrayList3.size()) {
                        break;
                    }
                    String str4 = (String) arrayList3.get(i13);
                    if (str4 != null) {
                        ((P) c0031a.f966a.get(i13)).f947b = uVar.d(str4);
                    }
                    i13++;
                }
                c0031a.c(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i3 + " (index " + c0031a.f980r + "): " + c0031a);
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
        String str5 = j2.f923e;
        if (str5 != null) {
            AbstractComponentCallbacksC0047q d2 = uVar.d(str5);
            this.f916w = d2;
            q(d2);
        }
        ArrayList arrayList4 = j2.f924f;
        if (arrayList4 != null) {
            for (int i14 = i2; i14 < arrayList4.size(); i14++) {
                this.f903j.put((String) arrayList4.get(i14), (C0033c) j2.f925g.get(i14));
            }
        }
        this.f887C = new ArrayDeque(j2.h);
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
            if (c0039i.f1008e) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0039i.f1008e = false;
                c0039i.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((C0039i) it2.next()).e();
        }
        y(true);
        this.f889E = true;
        this.f895L.f931g = true;
        T.u uVar = this.f899c;
        uVar.getClass();
        HashMap hashMap = (HashMap) uVar.f817b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (O o2 : hashMap.values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = o2.f944c;
                N n2 = new N(abstractComponentCallbacksC0047q);
                if (abstractComponentCallbacksC0047q.f1054a <= -1 || n2.f941m != null) {
                    n2.f941m = abstractComponentCallbacksC0047q.f1055b;
                } else {
                    Bundle bundle2 = new Bundle();
                    abstractComponentCallbacksC0047q.x(bundle2);
                    abstractComponentCallbacksC0047q.f1051P.c(bundle2);
                    bundle2.putParcelable("android:support:fragments", abstractComponentCallbacksC0047q.f1070t.R());
                    o2.f942a.n(false);
                    if (bundle2.isEmpty()) {
                        bundle2 = null;
                    }
                    if (abstractComponentCallbacksC0047q.f1041E != null) {
                        o2.o();
                    }
                    if (abstractComponentCallbacksC0047q.f1056c != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putSparseParcelableArray("android:view_state", abstractComponentCallbacksC0047q.f1056c);
                    }
                    if (abstractComponentCallbacksC0047q.d != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBundle("android:view_registry_state", abstractComponentCallbacksC0047q.d);
                    }
                    if (!abstractComponentCallbacksC0047q.f1042G) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBoolean("android:user_visible_hint", abstractComponentCallbacksC0047q.f1042G);
                    }
                    n2.f941m = bundle2;
                    if (abstractComponentCallbacksC0047q.h != null) {
                        if (bundle2 == null) {
                            n2.f941m = new Bundle();
                        }
                        n2.f941m.putString("android:target_state", abstractComponentCallbacksC0047q.h);
                        int i2 = abstractComponentCallbacksC0047q.i;
                        if (i2 != 0) {
                            n2.f941m.putInt("android:target_req_state", i2);
                        }
                    }
                }
                AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q2 = o2.f944c;
                arrayList2.add(abstractComponentCallbacksC0047q2.f1057e);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0047q2 + ": " + abstractComponentCallbacksC0047q2.f1055b);
                }
            }
        }
        T.u uVar2 = this.f899c;
        uVar2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) uVar2.f818c).values());
        if (!arrayList3.isEmpty()) {
            T.u uVar3 = this.f899c;
            synchronized (((ArrayList) uVar3.f816a)) {
                try {
                    if (((ArrayList) uVar3.f816a).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) uVar3.f816a).size());
                        Iterator it3 = ((ArrayList) uVar3.f816a).iterator();
                        while (it3.hasNext()) {
                            AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q3 = (AbstractComponentCallbacksC0047q) it3.next();
                            arrayList.add(abstractComponentCallbacksC0047q3.f1057e);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0047q3.f1057e + "): " + abstractComponentCallbacksC0047q3);
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
            j2.f923e = null;
            ArrayList arrayList5 = new ArrayList();
            j2.f924f = arrayList5;
            ArrayList arrayList6 = new ArrayList();
            j2.f925g = arrayList6;
            j2.f920a = arrayList2;
            j2.f921b = arrayList;
            j2.f922c = c0032bArr;
            j2.d = this.i.get();
            AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q4 = this.f916w;
            if (abstractComponentCallbacksC0047q4 != null) {
                j2.f923e = abstractComponentCallbacksC0047q4.f1057e;
            }
            arrayList5.addAll(this.f903j.keySet());
            arrayList6.addAll(this.f903j.values());
            j2.h = new ArrayList(this.f887C);
            bundle.putParcelable("state", j2);
            for (String str : this.f904k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f904k.get(str));
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                N n3 = (N) it4.next();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("state", n3);
                bundle.putBundle("fragment_" + n3.f933b, bundle3);
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public final void S() {
        synchronized (this.f897a) {
            try {
                if (this.f897a.size() == 1) {
                    this.f913t.f1085g.removeCallbacks(this.f896M);
                    this.f913t.f1085g.post(this.f896M);
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

    public final void U(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q, EnumC0072m enumC0072m) {
        if (abstractComponentCallbacksC0047q.equals(this.f899c.d(abstractComponentCallbacksC0047q.f1057e)) && (abstractComponentCallbacksC0047q.f1069s == null || abstractComponentCallbacksC0047q.f1068r == this)) {
            abstractComponentCallbacksC0047q.f1047L = enumC0072m;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0047q + " is not an active fragment of FragmentManager " + this);
    }

    public final void V(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        if (abstractComponentCallbacksC0047q != null) {
            if (!abstractComponentCallbacksC0047q.equals(this.f899c.d(abstractComponentCallbacksC0047q.f1057e)) || (abstractComponentCallbacksC0047q.f1069s != null && abstractComponentCallbacksC0047q.f1068r != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0047q + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q2 = this.f916w;
        this.f916w = abstractComponentCallbacksC0047q;
        q(abstractComponentCallbacksC0047q2);
        q(this.f916w);
    }

    public final void W(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        ViewGroup B2 = B(abstractComponentCallbacksC0047q);
        if (B2 != null) {
            C0046p c0046p = abstractComponentCallbacksC0047q.f1043H;
            if ((c0046p == null ? 0 : c0046p.f1031e) + (c0046p == null ? 0 : c0046p.d) + (c0046p == null ? 0 : c0046p.f1030c) + (c0046p == null ? 0 : c0046p.f1029b) > 0) {
                if (B2.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    B2.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0047q);
                }
                AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q2 = (AbstractComponentCallbacksC0047q) B2.getTag(R.id.visible_removing_fragment_view_tag);
                C0046p c0046p2 = abstractComponentCallbacksC0047q.f1043H;
                boolean z2 = c0046p2 != null ? c0046p2.f1028a : false;
                if (abstractComponentCallbacksC0047q2.f1043H == null) {
                    return;
                }
                abstractComponentCallbacksC0047q2.f().f1028a = z2;
            }
        }
    }

    public final void Y() {
        Iterator it = this.f899c.h().iterator();
        while (it.hasNext()) {
            O o2 = (O) it.next();
            AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = o2.f944c;
            if (abstractComponentCallbacksC0047q.F) {
                if (this.f898b) {
                    this.f891H = true;
                } else {
                    abstractComponentCallbacksC0047q.F = false;
                    o2.k();
                }
            }
        }
    }

    public final void Z(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new S());
        C0050u c0050u = this.f913t;
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
            c0050u.i.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw illegalStateException;
        }
    }

    public final O a(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        String str = abstractComponentCallbacksC0047q.f1046K;
        if (str != null) {
            Y.d.c(abstractComponentCallbacksC0047q, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0047q);
        }
        O f2 = f(abstractComponentCallbacksC0047q);
        abstractComponentCallbacksC0047q.f1068r = this;
        T.u uVar = this.f899c;
        uVar.l(f2);
        if (!abstractComponentCallbacksC0047q.f1076z) {
            uVar.a(abstractComponentCallbacksC0047q);
            abstractComponentCallbacksC0047q.f1062l = false;
            if (abstractComponentCallbacksC0047q.f1041E == null) {
                abstractComponentCallbacksC0047q.f1044I = false;
            }
            if (F(abstractComponentCallbacksC0047q)) {
                this.f888D = true;
            }
        }
        return f2;
    }

    public final void a0() {
        synchronized (this.f897a) {
            try {
                if (!this.f897a.isEmpty()) {
                    A a2 = this.h;
                    a2.f873a = true;
                    a.w wVar = a2.f875c;
                    if (wVar != null) {
                        wVar.a();
                    }
                    return;
                }
                A a3 = this.h;
                ArrayList arrayList = this.d;
                a3.f873a = (arrayList != null ? arrayList.size() : 0) > 0 && I(this.f915v);
                a.w wVar2 = a3.f875c;
                if (wVar2 != null) {
                    wVar2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(C0050u c0050u, u1.l lVar, AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        String str;
        if (this.f913t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f913t = c0050u;
        this.f914u = lVar;
        this.f915v = abstractComponentCallbacksC0047q;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f906m;
        if (abstractComponentCallbacksC0047q != 0) {
            copyOnWriteArrayList.add(new D(abstractComponentCallbacksC0047q));
        } else if (c0050u != null) {
            copyOnWriteArrayList.add(c0050u);
        }
        if (this.f915v != null) {
            a0();
        }
        if (c0050u != null) {
            a.x i = c0050u.i.i();
            this.f902g = i;
            C0050u c0050u2 = abstractComponentCallbacksC0047q != 0 ? abstractComponentCallbacksC0047q : c0050u;
            i.getClass();
            A a2 = this.h;
            b1.d.e(a2, "onBackPressedCallback");
            androidx.lifecycle.t d = c0050u2.d();
            if (d.f1448c != EnumC0072m.f1438a) {
                a2.f874b.add(new a.u(i, d, a2));
                i.d();
                a2.f875c = new a.w(0, i);
            }
        }
        if (abstractComponentCallbacksC0047q != 0) {
            L l2 = abstractComponentCallbacksC0047q.f1068r.f895L;
            HashMap hashMap = l2.f928c;
            L l3 = (L) hashMap.get(abstractComponentCallbacksC0047q.f1057e);
            if (l3 == null) {
                l3 = new L(l2.f929e);
                hashMap.put(abstractComponentCallbacksC0047q.f1057e, l3);
            }
            this.f895L = l3;
        } else if (c0050u != null) {
            this.f895L = (L) new C.h(c0050u.i.c(), L.h).z(L.class);
        } else {
            this.f895L = new L(false);
        }
        L l4 = this.f895L;
        l4.f931g = this.f889E || this.F;
        this.f899c.d = l4;
        C0050u c0050u3 = this.f913t;
        if (c0050u3 != null && abstractComponentCallbacksC0047q == 0) {
            h0.d b2 = c0050u3.b();
            b2.e("android:support:fragments", new r(2, this));
            Bundle c2 = b2.c("android:support:fragments");
            if (c2 != null) {
                Q(c2);
            }
        }
        C0050u c0050u4 = this.f913t;
        if (c0050u4 != null) {
            AbstractActivityC0128i abstractActivityC0128i = c0050u4.i;
            if (abstractComponentCallbacksC0047q != 0) {
                str = abstractComponentCallbacksC0047q.f1057e + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            String e2 = V.e(str2, "StartActivityForResult");
            E e3 = new E(2);
            z zVar = new z(this, 1);
            a.j jVar = abstractActivityC0128i.h;
            this.f919z = jVar.b(e2, e3, zVar);
            this.f885A = jVar.b(V.e(str2, "StartIntentSenderForResult"), new E(0), new z(this, 2));
            this.f886B = jVar.b(V.e(str2, "RequestPermissions"), new E(1), new z(this, 0));
        }
        C0050u c0050u5 = this.f913t;
        if (c0050u5 != null) {
            c0050u5.i.g(this.f907n);
        }
        C0050u c0050u6 = this.f913t;
        if (c0050u6 != null) {
            AbstractActivityC0128i abstractActivityC0128i2 = c0050u6.i;
            y yVar = this.f908o;
            abstractActivityC0128i2.getClass();
            b1.d.e(yVar, "listener");
            abstractActivityC0128i2.f1138j.add(yVar);
        }
        C0050u c0050u7 = this.f913t;
        if (c0050u7 != null) {
            AbstractActivityC0128i abstractActivityC0128i3 = c0050u7.i;
            y yVar2 = this.f909p;
            abstractActivityC0128i3.getClass();
            b1.d.e(yVar2, "listener");
            abstractActivityC0128i3.f1140l.add(yVar2);
        }
        C0050u c0050u8 = this.f913t;
        if (c0050u8 != null) {
            AbstractActivityC0128i abstractActivityC0128i4 = c0050u8.i;
            y yVar3 = this.f910q;
            abstractActivityC0128i4.getClass();
            b1.d.e(yVar3, "listener");
            abstractActivityC0128i4.f1141m.add(yVar3);
        }
        C0050u c0050u9 = this.f913t;
        if (c0050u9 == null || abstractComponentCallbacksC0047q != 0) {
            return;
        }
        AbstractActivityC0128i abstractActivityC0128i5 = c0050u9.i;
        B b3 = this.f911r;
        abstractActivityC0128i5.getClass();
        b1.d.e(b3, "provider");
        C0011l c0011l = abstractActivityC0128i5.f1134c;
        ((CopyOnWriteArrayList) c0011l.f405c).add(b3);
        ((Runnable) c0011l.f404b).run();
    }

    public final void c(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0047q);
        }
        if (abstractComponentCallbacksC0047q.f1076z) {
            abstractComponentCallbacksC0047q.f1076z = false;
            if (abstractComponentCallbacksC0047q.f1061k) {
                return;
            }
            this.f899c.a(abstractComponentCallbacksC0047q);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0047q);
            }
            if (F(abstractComponentCallbacksC0047q)) {
                this.f888D = true;
            }
        }
    }

    public final void d() {
        this.f898b = false;
        this.f893J.clear();
        this.f892I.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f899c.h().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((O) it.next()).f944c.f1040D;
            if (viewGroup != null) {
                hashSet.add(C0039i.f(viewGroup, D()));
            }
        }
        return hashSet;
    }

    public final O f(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        String str = abstractComponentCallbacksC0047q.f1057e;
        T.u uVar = this.f899c;
        O o2 = (O) ((HashMap) uVar.f817b).get(str);
        if (o2 != null) {
            return o2;
        }
        O o3 = new O(this.f905l, uVar, abstractComponentCallbacksC0047q);
        o3.m(this.f913t.f1084f.getClassLoader());
        o3.f945e = this.f912s;
        return o3;
    }

    public final void g(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0047q);
        }
        if (abstractComponentCallbacksC0047q.f1076z) {
            return;
        }
        abstractComponentCallbacksC0047q.f1076z = true;
        if (abstractComponentCallbacksC0047q.f1061k) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0047q);
            }
            T.u uVar = this.f899c;
            synchronized (((ArrayList) uVar.f816a)) {
                ((ArrayList) uVar.f816a).remove(abstractComponentCallbacksC0047q);
            }
            abstractComponentCallbacksC0047q.f1061k = false;
            if (F(abstractComponentCallbacksC0047q)) {
                this.f888D = true;
            }
            W(abstractComponentCallbacksC0047q);
        }
    }

    public final void h(boolean z2) {
        if (z2 && this.f913t != null) {
            Z(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q : this.f899c.j()) {
            if (abstractComponentCallbacksC0047q != null) {
                abstractComponentCallbacksC0047q.f1039C = true;
                if (z2) {
                    abstractComponentCallbacksC0047q.f1070t.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.f912s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q : this.f899c.j()) {
            if (abstractComponentCallbacksC0047q != null) {
                if (!abstractComponentCallbacksC0047q.f1075y ? abstractComponentCallbacksC0047q.f1070t.i() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.f912s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q : this.f899c.j()) {
            if (abstractComponentCallbacksC0047q != null && H(abstractComponentCallbacksC0047q)) {
                if (!abstractComponentCallbacksC0047q.f1075y ? abstractComponentCallbacksC0047q.f1070t.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0047q);
                    z2 = true;
                }
            }
        }
        if (this.f900e != null) {
            for (int i = 0; i < this.f900e.size(); i++) {
                AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q2 = (AbstractComponentCallbacksC0047q) this.f900e.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0047q2)) {
                    abstractComponentCallbacksC0047q2.getClass();
                }
            }
        }
        this.f900e = arrayList;
        return z2;
    }

    public final void k() {
        boolean z2 = true;
        this.f890G = true;
        y(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0039i) it.next()).e();
        }
        C0050u c0050u = this.f913t;
        T.u uVar = this.f899c;
        if (c0050u != null) {
            z2 = ((L) uVar.d).f930f;
        } else {
            AbstractActivityC0128i abstractActivityC0128i = c0050u.f1084f;
            if (abstractActivityC0128i != null) {
                z2 = true ^ abstractActivityC0128i.isChangingConfigurations();
            }
        }
        if (z2) {
            Iterator it2 = this.f903j.values().iterator();
            while (it2.hasNext()) {
                for (String str : ((C0033c) it2.next()).f992a) {
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
        C0050u c0050u2 = this.f913t;
        if (c0050u2 != null) {
            AbstractActivityC0128i abstractActivityC0128i2 = c0050u2.i;
            y yVar = this.f908o;
            abstractActivityC0128i2.getClass();
            b1.d.e(yVar, "listener");
            abstractActivityC0128i2.f1138j.remove(yVar);
        }
        C0050u c0050u3 = this.f913t;
        if (c0050u3 != null) {
            AbstractActivityC0128i abstractActivityC0128i3 = c0050u3.i;
            y yVar2 = this.f907n;
            abstractActivityC0128i3.getClass();
            b1.d.e(yVar2, "listener");
            abstractActivityC0128i3.i.remove(yVar2);
        }
        C0050u c0050u4 = this.f913t;
        if (c0050u4 != null) {
            AbstractActivityC0128i abstractActivityC0128i4 = c0050u4.i;
            y yVar3 = this.f909p;
            abstractActivityC0128i4.getClass();
            b1.d.e(yVar3, "listener");
            abstractActivityC0128i4.f1140l.remove(yVar3);
        }
        C0050u c0050u5 = this.f913t;
        if (c0050u5 != null) {
            AbstractActivityC0128i abstractActivityC0128i5 = c0050u5.i;
            y yVar4 = this.f910q;
            abstractActivityC0128i5.getClass();
            b1.d.e(yVar4, "listener");
            abstractActivityC0128i5.f1141m.remove(yVar4);
        }
        C0050u c0050u6 = this.f913t;
        if (c0050u6 != null) {
            AbstractActivityC0128i abstractActivityC0128i6 = c0050u6.i;
            B b2 = this.f911r;
            abstractActivityC0128i6.getClass();
            b1.d.e(b2, "provider");
            C0011l c0011l = abstractActivityC0128i6.f1134c;
            ((CopyOnWriteArrayList) c0011l.f405c).remove(b2);
            if (((HashMap) c0011l.d).remove(b2) != null) {
                throw new ClassCastException();
            }
            ((Runnable) c0011l.f404b).run();
        }
        this.f913t = null;
        this.f914u = null;
        this.f915v = null;
        if (this.f902g != null) {
            Iterator it3 = this.h.f874b.iterator();
            while (it3.hasNext()) {
                ((a.c) it3.next()).cancel();
            }
            this.f902g = null;
        }
        B.j jVar = this.f919z;
        if (jVar != null) {
            jVar.J();
            this.f885A.J();
            this.f886B.J();
        }
    }

    public final void l(boolean z2) {
        if (z2 && this.f913t != null) {
            Z(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q : this.f899c.j()) {
            if (abstractComponentCallbacksC0047q != null) {
                abstractComponentCallbacksC0047q.f1039C = true;
                if (z2) {
                    abstractComponentCallbacksC0047q.f1070t.l(true);
                }
            }
        }
    }

    public final void m(boolean z2, boolean z3) {
        if (z3 && this.f913t != null) {
            Z(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q : this.f899c.j()) {
            if (abstractComponentCallbacksC0047q != null && z3) {
                abstractComponentCallbacksC0047q.f1070t.m(z2, true);
            }
        }
    }

    public final void n() {
        Iterator it = this.f899c.i().iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = (AbstractComponentCallbacksC0047q) it.next();
            if (abstractComponentCallbacksC0047q != null) {
                abstractComponentCallbacksC0047q.n();
                abstractComponentCallbacksC0047q.f1070t.n();
            }
        }
    }

    public final boolean o() {
        if (this.f912s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q : this.f899c.j()) {
            if (abstractComponentCallbacksC0047q != null) {
                if (!abstractComponentCallbacksC0047q.f1075y ? abstractComponentCallbacksC0047q.f1070t.o() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f912s < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q : this.f899c.j()) {
            if (abstractComponentCallbacksC0047q != null && !abstractComponentCallbacksC0047q.f1075y) {
                abstractComponentCallbacksC0047q.f1070t.p();
            }
        }
    }

    public final void q(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        if (abstractComponentCallbacksC0047q != null) {
            if (abstractComponentCallbacksC0047q.equals(this.f899c.d(abstractComponentCallbacksC0047q.f1057e))) {
                abstractComponentCallbacksC0047q.f1068r.getClass();
                boolean I2 = I(abstractComponentCallbacksC0047q);
                Boolean bool = abstractComponentCallbacksC0047q.f1060j;
                if (bool == null || bool.booleanValue() != I2) {
                    abstractComponentCallbacksC0047q.f1060j = Boolean.valueOf(I2);
                    I i = abstractComponentCallbacksC0047q.f1070t;
                    i.a0();
                    i.q(i.f916w);
                }
            }
        }
    }

    public final void r(boolean z2, boolean z3) {
        if (z3 && this.f913t != null) {
            Z(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q : this.f899c.j()) {
            if (abstractComponentCallbacksC0047q != null && z3) {
                abstractComponentCallbacksC0047q.f1070t.r(z2, true);
            }
        }
    }

    public final boolean s() {
        if (this.f912s < 1) {
            return false;
        }
        boolean z2 = false;
        for (AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q : this.f899c.j()) {
            if (abstractComponentCallbacksC0047q != null && H(abstractComponentCallbacksC0047q)) {
                if (!abstractComponentCallbacksC0047q.f1075y ? abstractComponentCallbacksC0047q.f1070t.s() : false) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final void t(int i) {
        try {
            this.f898b = true;
            for (O o2 : ((HashMap) this.f899c.f817b).values()) {
                if (o2 != null) {
                    o2.f945e = i;
                }
            }
            J(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0039i) it.next()).e();
            }
            this.f898b = false;
            y(true);
        } catch (Throwable th) {
            this.f898b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f915v;
        if (abstractComponentCallbacksC0047q != null) {
            sb.append(abstractComponentCallbacksC0047q.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f915v)));
            sb.append("}");
        } else {
            C0050u c0050u = this.f913t;
            if (c0050u != null) {
                sb.append(c0050u.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f913t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u() {
        if (this.f891H) {
            this.f891H = false;
            Y();
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String e2 = V.e(str, "    ");
        T.u uVar = this.f899c;
        uVar.getClass();
        String str3 = str + "    ";
        HashMap hashMap = (HashMap) uVar.f817b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (O o2 : hashMap.values()) {
                printWriter.print(str);
                if (o2 != null) {
                    AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = o2.f944c;
                    printWriter.println(abstractComponentCallbacksC0047q);
                    abstractComponentCallbacksC0047q.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0047q.f1072v));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0047q.f1073w));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0047q.f1074x);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0047q.f1054a);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0047q.f1057e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0047q.f1067q);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0047q.f1061k);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0047q.f1062l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0047q.f1063m);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0047q.f1064n);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0047q.f1075y);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0047q.f1076z);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0047q.f1038B);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0047q.f1037A);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0047q.f1042G);
                    if (abstractComponentCallbacksC0047q.f1068r != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0047q.f1068r);
                    }
                    if (abstractComponentCallbacksC0047q.f1069s != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0047q.f1069s);
                    }
                    if (abstractComponentCallbacksC0047q.f1071u != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0047q.f1071u);
                    }
                    if (abstractComponentCallbacksC0047q.f1058f != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0047q.f1058f);
                    }
                    if (abstractComponentCallbacksC0047q.f1055b != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0047q.f1055b);
                    }
                    if (abstractComponentCallbacksC0047q.f1056c != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0047q.f1056c);
                    }
                    if (abstractComponentCallbacksC0047q.d != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0047q.d);
                    }
                    Object obj = abstractComponentCallbacksC0047q.f1059g;
                    if (obj == null) {
                        I i = abstractComponentCallbacksC0047q.f1068r;
                        obj = (i == null || (str2 = abstractComponentCallbacksC0047q.h) == null) ? null : i.f899c.d(str2);
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
                    C0046p c0046p = abstractComponentCallbacksC0047q.f1043H;
                    printWriter.println(c0046p == null ? false : c0046p.f1028a);
                    C0046p c0046p2 = abstractComponentCallbacksC0047q.f1043H;
                    if ((c0046p2 == null ? 0 : c0046p2.f1029b) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        C0046p c0046p3 = abstractComponentCallbacksC0047q.f1043H;
                        printWriter.println(c0046p3 == null ? 0 : c0046p3.f1029b);
                    }
                    C0046p c0046p4 = abstractComponentCallbacksC0047q.f1043H;
                    if ((c0046p4 == null ? 0 : c0046p4.f1030c) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        C0046p c0046p5 = abstractComponentCallbacksC0047q.f1043H;
                        printWriter.println(c0046p5 == null ? 0 : c0046p5.f1030c);
                    }
                    C0046p c0046p6 = abstractComponentCallbacksC0047q.f1043H;
                    if ((c0046p6 == null ? 0 : c0046p6.d) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        C0046p c0046p7 = abstractComponentCallbacksC0047q.f1043H;
                        printWriter.println(c0046p7 == null ? 0 : c0046p7.d);
                    }
                    C0046p c0046p8 = abstractComponentCallbacksC0047q.f1043H;
                    if ((c0046p8 == null ? 0 : c0046p8.f1031e) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        C0046p c0046p9 = abstractComponentCallbacksC0047q.f1043H;
                        printWriter.println(c0046p9 == null ? 0 : c0046p9.f1031e);
                    }
                    if (abstractComponentCallbacksC0047q.f1040D != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0047q.f1040D);
                    }
                    if (abstractComponentCallbacksC0047q.f1041E != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0047q.f1041E);
                    }
                    if (abstractComponentCallbacksC0047q.h() != null) {
                        o.l lVar = ((c0.a) new C.h(abstractComponentCallbacksC0047q.c(), c0.a.f1594c).z(c0.a.class)).f1595b;
                        if (lVar.f3364c > 0) {
                            printWriter.print(str3);
                            printWriter.println("Loaders:");
                            if (lVar.f3364c > 0) {
                                if (lVar.f3363b[0] != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(str3);
                                printWriter.print("  #");
                                printWriter.print(lVar.f3362a[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + abstractComponentCallbacksC0047q.f1070t + ":");
                    abstractComponentCallbacksC0047q.f1070t.v(V.e(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) uVar.f816a;
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
        ArrayList arrayList2 = this.f900e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q3 = (AbstractComponentCallbacksC0047q) this.f900e.get(i3);
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
                c0031a.d(e2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.f897a) {
            try {
                int size4 = this.f897a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i5 = 0; i5 < size4; i5++) {
                        Object obj2 = (G) this.f897a.get(i5);
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
        printWriter.println(this.f913t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f914u);
        if (this.f915v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f915v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f912s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f889E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f890G);
        if (this.f888D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f888D);
        }
    }

    public final void w(G g2, boolean z2) {
        if (!z2) {
            if (this.f913t == null) {
                if (!this.f890G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f889E || this.F) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f897a) {
            try {
                if (this.f913t == null) {
                    if (!z2) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f897a.add(g2);
                    S();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(boolean z2) {
        if (this.f898b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f913t == null) {
            if (!this.f890G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f913t.f1085g.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2 && (this.f889E || this.F)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f892I == null) {
            this.f892I = new ArrayList();
            this.f893J = new ArrayList();
        }
    }

    public final boolean y(boolean z2) {
        boolean z3;
        x(z2);
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.f892I;
            ArrayList arrayList2 = this.f893J;
            synchronized (this.f897a) {
                if (this.f897a.isEmpty()) {
                    z3 = false;
                } else {
                    try {
                        int size = this.f897a.size();
                        z3 = false;
                        for (int i = 0; i < size; i++) {
                            z3 |= ((G) this.f897a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z3) {
                a0();
                u();
                ((HashMap) this.f899c.f817b).values().removeAll(Collections.singleton(null));
                return z4;
            }
            z4 = true;
            this.f898b = true;
            try {
                P(this.f892I, this.f893J);
            } finally {
                d();
            }
        }
    }

    public final void z(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        T.u uVar;
        T.u uVar2;
        T.u uVar3;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        boolean z2 = ((C0031a) arrayList3.get(i)).f977o;
        ArrayList arrayList5 = this.f894K;
        if (arrayList5 == null) {
            this.f894K = new ArrayList();
        } else {
            arrayList5.clear();
        }
        ArrayList arrayList6 = this.f894K;
        T.u uVar4 = this.f899c;
        arrayList6.addAll(uVar4.j());
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f916w;
        int i6 = i;
        boolean z3 = false;
        while (true) {
            int i7 = 1;
            if (i6 >= i2) {
                T.u uVar5 = uVar4;
                this.f894K.clear();
                if (!z2 && this.f912s >= 1) {
                    for (int i8 = i; i8 < i2; i8++) {
                        Iterator it = ((C0031a) arrayList.get(i8)).f966a.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q2 = ((P) it.next()).f947b;
                            if (abstractComponentCallbacksC0047q2 == null || abstractComponentCallbacksC0047q2.f1068r == null) {
                                uVar = uVar5;
                            } else {
                                uVar = uVar5;
                                uVar.l(f(abstractComponentCallbacksC0047q2));
                            }
                            uVar5 = uVar;
                        }
                    }
                }
                for (int i9 = i; i9 < i2; i9++) {
                    C0031a c0031a = (C0031a) arrayList.get(i9);
                    if (((Boolean) arrayList2.get(i9)).booleanValue()) {
                        c0031a.c(-1);
                        ArrayList arrayList7 = c0031a.f966a;
                        boolean z4 = true;
                        for (int size = arrayList7.size() - 1; size >= 0; size--) {
                            P p2 = (P) arrayList7.get(size);
                            AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q3 = p2.f947b;
                            if (abstractComponentCallbacksC0047q3 != null) {
                                if (abstractComponentCallbacksC0047q3.f1043H != null) {
                                    abstractComponentCallbacksC0047q3.f().f1028a = z4;
                                }
                                int i10 = c0031a.f970f;
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
                                if (abstractComponentCallbacksC0047q3.f1043H != null || i11 != 0) {
                                    abstractComponentCallbacksC0047q3.f();
                                    abstractComponentCallbacksC0047q3.f1043H.f1032f = i11;
                                }
                                abstractComponentCallbacksC0047q3.f();
                                abstractComponentCallbacksC0047q3.f1043H.getClass();
                            }
                            int i13 = p2.f946a;
                            I i14 = c0031a.f978p;
                            switch (i13) {
                                case 1:
                                    abstractComponentCallbacksC0047q3.E(p2.d, p2.f949e, p2.f950f, p2.f951g);
                                    z4 = true;
                                    i14.T(abstractComponentCallbacksC0047q3, true);
                                    i14.O(abstractComponentCallbacksC0047q3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + p2.f946a);
                                case 3:
                                    abstractComponentCallbacksC0047q3.E(p2.d, p2.f949e, p2.f950f, p2.f951g);
                                    i14.a(abstractComponentCallbacksC0047q3);
                                    z4 = true;
                                case 4:
                                    abstractComponentCallbacksC0047q3.E(p2.d, p2.f949e, p2.f950f, p2.f951g);
                                    i14.getClass();
                                    X(abstractComponentCallbacksC0047q3);
                                    z4 = true;
                                case 5:
                                    abstractComponentCallbacksC0047q3.E(p2.d, p2.f949e, p2.f950f, p2.f951g);
                                    i14.T(abstractComponentCallbacksC0047q3, true);
                                    i14.E(abstractComponentCallbacksC0047q3);
                                    z4 = true;
                                case 6:
                                    abstractComponentCallbacksC0047q3.E(p2.d, p2.f949e, p2.f950f, p2.f951g);
                                    i14.c(abstractComponentCallbacksC0047q3);
                                    z4 = true;
                                case 7:
                                    abstractComponentCallbacksC0047q3.E(p2.d, p2.f949e, p2.f950f, p2.f951g);
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
                        ArrayList arrayList8 = c0031a.f966a;
                        int size2 = arrayList8.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            P p3 = (P) arrayList8.get(i15);
                            AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q4 = p3.f947b;
                            if (abstractComponentCallbacksC0047q4 != null) {
                                if (abstractComponentCallbacksC0047q4.f1043H != null) {
                                    abstractComponentCallbacksC0047q4.f().f1028a = false;
                                }
                                int i16 = c0031a.f970f;
                                if (abstractComponentCallbacksC0047q4.f1043H != null || i16 != 0) {
                                    abstractComponentCallbacksC0047q4.f();
                                    abstractComponentCallbacksC0047q4.f1043H.f1032f = i16;
                                }
                                abstractComponentCallbacksC0047q4.f();
                                abstractComponentCallbacksC0047q4.f1043H.getClass();
                            }
                            int i17 = p3.f946a;
                            I i18 = c0031a.f978p;
                            switch (i17) {
                                case 1:
                                    abstractComponentCallbacksC0047q4.E(p3.d, p3.f949e, p3.f950f, p3.f951g);
                                    i18.T(abstractComponentCallbacksC0047q4, false);
                                    i18.a(abstractComponentCallbacksC0047q4);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + p3.f946a);
                                case 3:
                                    abstractComponentCallbacksC0047q4.E(p3.d, p3.f949e, p3.f950f, p3.f951g);
                                    i18.O(abstractComponentCallbacksC0047q4);
                                case 4:
                                    abstractComponentCallbacksC0047q4.E(p3.d, p3.f949e, p3.f950f, p3.f951g);
                                    i18.E(abstractComponentCallbacksC0047q4);
                                case 5:
                                    abstractComponentCallbacksC0047q4.E(p3.d, p3.f949e, p3.f950f, p3.f951g);
                                    i18.T(abstractComponentCallbacksC0047q4, false);
                                    X(abstractComponentCallbacksC0047q4);
                                case 6:
                                    abstractComponentCallbacksC0047q4.E(p3.d, p3.f949e, p3.f950f, p3.f951g);
                                    i18.g(abstractComponentCallbacksC0047q4);
                                case 7:
                                    abstractComponentCallbacksC0047q4.E(p3.d, p3.f949e, p3.f950f, p3.f951g);
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
                        for (int size3 = c0031a2.f966a.size() - 1; size3 >= 0; size3--) {
                            AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q5 = ((P) c0031a2.f966a.get(size3)).f947b;
                            if (abstractComponentCallbacksC0047q5 != null) {
                                f(abstractComponentCallbacksC0047q5).k();
                            }
                        }
                    } else {
                        Iterator it2 = c0031a2.f966a.iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q6 = ((P) it2.next()).f947b;
                            if (abstractComponentCallbacksC0047q6 != null) {
                                f(abstractComponentCallbacksC0047q6).k();
                            }
                        }
                    }
                }
                J(this.f912s, true);
                HashSet hashSet = new HashSet();
                for (int i20 = i; i20 < i2; i20++) {
                    Iterator it3 = ((C0031a) arrayList.get(i20)).f966a.iterator();
                    while (it3.hasNext()) {
                        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q7 = ((P) it3.next()).f947b;
                        if (abstractComponentCallbacksC0047q7 != null && (viewGroup = abstractComponentCallbacksC0047q7.f1040D) != null) {
                            hashSet.add(C0039i.f(viewGroup, D()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    C0039i c0039i = (C0039i) it4.next();
                    c0039i.d = booleanValue;
                    synchronized (c0039i.f1006b) {
                        try {
                            c0039i.g();
                            c0039i.f1008e = false;
                            int size4 = c0039i.f1006b.size() - 1;
                            while (true) {
                                if (size4 >= 0) {
                                    U u2 = (U) c0039i.f1006b.get(size4);
                                    int c2 = V.c(u2.f962c.f1041E);
                                    if (u2.f960a != 2 || c2 == 2) {
                                        size4--;
                                    } else {
                                        C0046p c0046p = u2.f962c.f1043H;
                                        c0039i.f1008e = false;
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
                    if (((Boolean) arrayList2.get(i21)).booleanValue() && c0031a3.f980r >= 0) {
                        c0031a3.f980r = -1;
                    }
                    c0031a3.getClass();
                }
                return;
            }
            C0031a c0031a4 = (C0031a) arrayList3.get(i6);
            if (((Boolean) arrayList4.get(i6)).booleanValue()) {
                uVar2 = uVar4;
                int i22 = 1;
                ArrayList arrayList9 = this.f894K;
                ArrayList arrayList10 = c0031a4.f966a;
                int size5 = arrayList10.size() - 1;
                while (size5 >= 0) {
                    P p4 = (P) arrayList10.get(size5);
                    int i23 = p4.f946a;
                    if (i23 != i22) {
                        if (i23 != 3) {
                            switch (i23) {
                                case 8:
                                    abstractComponentCallbacksC0047q = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0047q = p4.f947b;
                                    break;
                                case 10:
                                    p4.i = p4.h;
                                    break;
                            }
                            size5--;
                            i22 = 1;
                        }
                        arrayList9.add(p4.f947b);
                        size5--;
                        i22 = 1;
                    }
                    arrayList9.remove(p4.f947b);
                    size5--;
                    i22 = 1;
                }
            } else {
                ArrayList arrayList11 = this.f894K;
                int i24 = 0;
                while (true) {
                    ArrayList arrayList12 = c0031a4.f966a;
                    if (i24 < arrayList12.size()) {
                        P p5 = (P) arrayList12.get(i24);
                        int i25 = p5.f946a;
                        if (i25 != i7) {
                            if (i25 != 2) {
                                if (i25 == 3 || i25 == 6) {
                                    arrayList11.remove(p5.f947b);
                                    AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q8 = p5.f947b;
                                    if (abstractComponentCallbacksC0047q8 == abstractComponentCallbacksC0047q) {
                                        arrayList12.add(i24, new P(9, abstractComponentCallbacksC0047q8));
                                        i24++;
                                        uVar3 = uVar4;
                                        i3 = 1;
                                        abstractComponentCallbacksC0047q = null;
                                    }
                                } else if (i25 == 7) {
                                    uVar3 = uVar4;
                                    i3 = 1;
                                } else if (i25 == 8) {
                                    arrayList12.add(i24, new P(9, abstractComponentCallbacksC0047q, 0));
                                    p5.f948c = true;
                                    i24++;
                                    abstractComponentCallbacksC0047q = p5.f947b;
                                }
                                uVar3 = uVar4;
                                i3 = 1;
                            } else {
                                AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q9 = p5.f947b;
                                int i26 = abstractComponentCallbacksC0047q9.f1073w;
                                int size6 = arrayList11.size() - 1;
                                boolean z5 = false;
                                while (size6 >= 0) {
                                    T.u uVar6 = uVar4;
                                    AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q10 = (AbstractComponentCallbacksC0047q) arrayList11.get(size6);
                                    if (abstractComponentCallbacksC0047q10.f1073w != i26) {
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
                                        p6.f950f = p5.f950f;
                                        p6.f949e = p5.f949e;
                                        p6.f951g = p5.f951g;
                                        arrayList12.add(i24, p6);
                                        arrayList11.remove(abstractComponentCallbacksC0047q10);
                                        i24++;
                                        abstractComponentCallbacksC0047q = abstractComponentCallbacksC0047q;
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
                                    p5.f946a = 1;
                                    p5.f948c = true;
                                    arrayList11.add(abstractComponentCallbacksC0047q9);
                                }
                            }
                            i24 += i3;
                            i7 = i3;
                            uVar4 = uVar3;
                        } else {
                            uVar3 = uVar4;
                            i3 = i7;
                        }
                        arrayList11.add(p5.f947b);
                        i24 += i3;
                        i7 = i3;
                        uVar4 = uVar3;
                    } else {
                        uVar2 = uVar4;
                    }
                }
            }
            z3 = z3 || c0031a4.f971g;
            i6++;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            uVar4 = uVar2;
        }
    }
}
