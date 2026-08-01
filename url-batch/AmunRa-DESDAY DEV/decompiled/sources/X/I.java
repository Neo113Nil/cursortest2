package X;

import K.C0011l;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.EnumC0071m;
import c0.C0081a;
import com.visualfortune.eyerest.R;
import g.AbstractActivityC0131i;
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
    public B.j f842A;

    /* renamed from: B, reason: collision with root package name */
    public B.j f843B;

    /* renamed from: C, reason: collision with root package name */
    public ArrayDeque f844C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f845D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f846E;
    public boolean F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f847G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f848H;

    /* renamed from: I, reason: collision with root package name */
    public ArrayList f849I;

    /* renamed from: J, reason: collision with root package name */
    public ArrayList f850J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList f851K;

    /* renamed from: L, reason: collision with root package name */
    public L f852L;

    /* renamed from: M, reason: collision with root package name */
    public final L0.B f853M;

    /* renamed from: b, reason: collision with root package name */
    public boolean f855b;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f857e;

    /* renamed from: g, reason: collision with root package name */
    public a.x f859g;

    /* renamed from: l, reason: collision with root package name */
    public final B.j f862l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f863m;

    /* renamed from: n, reason: collision with root package name */
    public final y f864n;

    /* renamed from: o, reason: collision with root package name */
    public final y f865o;

    /* renamed from: p, reason: collision with root package name */
    public final y f866p;

    /* renamed from: q, reason: collision with root package name */
    public final y f867q;

    /* renamed from: r, reason: collision with root package name */
    public final B f868r;

    /* renamed from: s, reason: collision with root package name */
    public int f869s;

    /* renamed from: t, reason: collision with root package name */
    public C0051u f870t;

    /* renamed from: u, reason: collision with root package name */
    public s1.l f871u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractComponentCallbacksC0048q f872v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractComponentCallbacksC0048q f873w;

    /* renamed from: x, reason: collision with root package name */
    public final C f874x;

    /* renamed from: y, reason: collision with root package name */
    public final I0.e f875y;

    /* renamed from: z, reason: collision with root package name */
    public B.j f876z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f854a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final T.u f856c = new T.u(2);

    /* renamed from: f, reason: collision with root package name */
    public final x f858f = new x(this);
    public final A h = new A(this);
    public final AtomicInteger i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map f860j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map f861k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [X.y] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.y] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.y] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.y] */
    public I() {
        Collections.synchronizedMap(new HashMap());
        this.f862l = new B.j(this);
        this.f863m = new CopyOnWriteArrayList();
        final int i = 0;
        this.f864n = new J.a(this) { // from class: X.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1048b;

            {
                this.f1048b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        I i2 = this.f1048b;
                        if (i2.G()) {
                            i2.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i3 = this.f1048b;
                        if (i3.G() && num.intValue() == 80) {
                            i3.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i4 = this.f1048b;
                        if (i4.G()) {
                            i4.m(fVar.f4290a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1048b;
                        if (i5.G()) {
                            i5.r(gVar.f4291a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f865o = new J.a(this) { // from class: X.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1048b;

            {
                this.f1048b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i2) {
                    case 0:
                        I i22 = this.f1048b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i3 = this.f1048b;
                        if (i3.G() && num.intValue() == 80) {
                            i3.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i4 = this.f1048b;
                        if (i4.G()) {
                            i4.m(fVar.f4290a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1048b;
                        if (i5.G()) {
                            i5.r(gVar.f4291a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.f866p = new J.a(this) { // from class: X.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1048b;

            {
                this.f1048b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i3) {
                    case 0:
                        I i22 = this.f1048b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i32 = this.f1048b;
                        if (i32.G() && num.intValue() == 80) {
                            i32.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i4 = this.f1048b;
                        if (i4.G()) {
                            i4.m(fVar.f4290a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1048b;
                        if (i5.G()) {
                            i5.r(gVar.f4291a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.f867q = new J.a(this) { // from class: X.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f1048b;

            {
                this.f1048b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i4) {
                    case 0:
                        I i22 = this.f1048b;
                        if (i22.G()) {
                            i22.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i32 = this.f1048b;
                        if (i32.G() && num.intValue() == 80) {
                            i32.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z.f fVar = (z.f) obj;
                        I i42 = this.f1048b;
                        if (i42.G()) {
                            i42.m(fVar.f4290a, false);
                            break;
                        }
                        break;
                    default:
                        z.g gVar = (z.g) obj;
                        I i5 = this.f1048b;
                        if (i5.G()) {
                            i5.r(gVar.f4291a, false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f868r = new B(this);
        this.f869s = -1;
        this.f874x = new C(this);
        this.f875y = new I0.e(12);
        this.f844C = new ArrayDeque();
        this.f853M = new L0.B(5, this);
    }

    public static boolean F(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        abstractComponentCallbacksC0048q.getClass();
        Iterator it = abstractComponentCallbacksC0048q.f1024t.f856c.i().iterator();
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
        return abstractComponentCallbacksC0048q.f992B && (abstractComponentCallbacksC0048q.f1022r == null || H(abstractComponentCallbacksC0048q.f1025u));
    }

    public static boolean I(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (abstractComponentCallbacksC0048q == null) {
            return true;
        }
        I i = abstractComponentCallbacksC0048q.f1022r;
        return abstractComponentCallbacksC0048q.equals(i.f873w) && I(i.f872v);
    }

    public static void X(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0048q);
        }
        if (abstractComponentCallbacksC0048q.f1029y) {
            abstractComponentCallbacksC0048q.f1029y = false;
            abstractComponentCallbacksC0048q.f998I = !abstractComponentCallbacksC0048q.f998I;
        }
    }

    public final AbstractComponentCallbacksC0048q A(int i) {
        T.u uVar = this.f856c;
        ArrayList arrayList = (ArrayList) uVar.f791a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = (AbstractComponentCallbacksC0048q) arrayList.get(size);
            if (abstractComponentCallbacksC0048q != null && abstractComponentCallbacksC0048q.f1026v == i) {
                return abstractComponentCallbacksC0048q;
            }
        }
        for (O o2 : ((HashMap) uVar.f792b).values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = o2.f901c;
                if (abstractComponentCallbacksC0048q2.f1026v == i) {
                    return abstractComponentCallbacksC0048q2;
                }
            }
        }
        return null;
    }

    public final ViewGroup B(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        ViewGroup viewGroup = abstractComponentCallbacksC0048q.f994D;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0048q.f1027w > 0 && this.f871u.R()) {
            View O2 = this.f871u.O(abstractComponentCallbacksC0048q.f1027w);
            if (O2 instanceof ViewGroup) {
                return (ViewGroup) O2;
            }
        }
        return null;
    }

    public final C C() {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f872v;
        return abstractComponentCallbacksC0048q != null ? abstractComponentCallbacksC0048q.f1022r.C() : this.f874x;
    }

    public final I0.e D() {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f872v;
        return abstractComponentCallbacksC0048q != null ? abstractComponentCallbacksC0048q.f1022r.D() : this.f875y;
    }

    public final void E(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0048q);
        }
        if (abstractComponentCallbacksC0048q.f1029y) {
            return;
        }
        abstractComponentCallbacksC0048q.f1029y = true;
        abstractComponentCallbacksC0048q.f998I = true ^ abstractComponentCallbacksC0048q.f998I;
        W(abstractComponentCallbacksC0048q);
    }

    public final boolean G() {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f872v;
        if (abstractComponentCallbacksC0048q == null) {
            return true;
        }
        return abstractComponentCallbacksC0048q.m() && this.f872v.j().G();
    }

    public final void J(int i, boolean z2) {
        HashMap hashMap;
        C0051u c0051u;
        if (this.f870t == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i != this.f869s) {
            this.f869s = i;
            T.u uVar = this.f856c;
            Iterator it = ((ArrayList) uVar.f791a).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = (HashMap) uVar.f792b;
                if (!hasNext) {
                    break;
                }
                O o2 = (O) hashMap.get(((AbstractComponentCallbacksC0048q) it.next()).f1011e);
                if (o2 != null) {
                    o2.k();
                }
            }
            for (O o3 : hashMap.values()) {
                if (o3 != null) {
                    o3.k();
                    AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o3.f901c;
                    if (abstractComponentCallbacksC0048q.f1016l && !abstractComponentCallbacksC0048q.o()) {
                        uVar.n(o3);
                    }
                }
            }
            Y();
            if (this.f845D && (c0051u = this.f870t) != null && this.f869s == 7) {
                c0051u.f1039l.invalidateOptionsMenu();
                this.f845D = false;
            }
        }
    }

    public final void K() {
        if (this.f870t == null) {
            return;
        }
        this.f846E = false;
        this.F = false;
        this.f852L.f888g = false;
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f856c.j()) {
            if (abstractComponentCallbacksC0048q != null) {
                abstractComponentCallbacksC0048q.f1024t.K();
            }
        }
    }

    public final boolean L() {
        return M(-1, 0);
    }

    public final boolean M(int i, int i2) {
        y(false);
        x(true);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f873w;
        if (abstractComponentCallbacksC0048q != null && i < 0 && abstractComponentCallbacksC0048q.g().L()) {
            return true;
        }
        boolean N2 = N(this.f849I, this.f850J, i, i2);
        if (N2) {
            this.f855b = true;
            try {
                P(this.f849I, this.f850J);
            } finally {
                d();
            }
        }
        a0();
        u();
        ((HashMap) this.f856c.f792b).values().removeAll(Collections.singleton(null));
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
                    if (i >= 0 && i == c0032a.f937r) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z2) {
                        while (size > 0) {
                            C0032a c0032a2 = (C0032a) this.d.get(size - 1);
                            if (i < 0 || i != c0032a2.f937r) {
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
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0048q + " nesting=" + abstractComponentCallbacksC0048q.f1021q);
        }
        boolean o2 = abstractComponentCallbacksC0048q.o();
        if (abstractComponentCallbacksC0048q.f1030z && o2) {
            return;
        }
        T.u uVar = this.f856c;
        synchronized (((ArrayList) uVar.f791a)) {
            ((ArrayList) uVar.f791a).remove(abstractComponentCallbacksC0048q);
        }
        abstractComponentCallbacksC0048q.f1015k = false;
        if (F(abstractComponentCallbacksC0048q)) {
            this.f845D = true;
        }
        abstractComponentCallbacksC0048q.f1016l = true;
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
            if (!((C0032a) arrayList.get(i)).f934o) {
                if (i2 != i) {
                    z(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0032a) arrayList.get(i2)).f934o) {
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
                bundle2.setClassLoader(this.f870t.i.getClassLoader());
                this.f861k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f870t.i.getClassLoader());
                arrayList.add((N) bundle.getParcelable("state"));
            }
        }
        T.u uVar = this.f856c;
        HashMap hashMap = (HashMap) uVar.f793c;
        hashMap.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            N n2 = (N) it.next();
            hashMap.put(n2.f890b, n2);
        }
        J j2 = (J) bundle3.getParcelable("state");
        if (j2 == null) {
            return;
        }
        HashMap hashMap2 = (HashMap) uVar.f792b;
        hashMap2.clear();
        Iterator it2 = j2.f877a.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            i = 2;
            jVar = this.f862l;
            if (!hasNext) {
                break;
            }
            N n3 = (N) ((HashMap) uVar.f793c).remove((String) it2.next());
            if (n3 != null) {
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = (AbstractComponentCallbacksC0048q) this.f852L.f884b.get(n3.f890b);
                if (abstractComponentCallbacksC0048q != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0048q);
                    }
                    o2 = new O(jVar, uVar, abstractComponentCallbacksC0048q, n3);
                } else {
                    o2 = new O(this.f862l, this.f856c, this.f870t.i.getClassLoader(), C(), n3);
                }
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = o2.f901c;
                abstractComponentCallbacksC0048q2.f1022r = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0048q2.f1011e + "): " + abstractComponentCallbacksC0048q2);
                }
                o2.m(this.f870t.i.getClassLoader());
                uVar.m(o2);
                o2.f902e = this.f869s;
            }
        }
        L l2 = this.f852L;
        l2.getClass();
        Iterator it3 = new ArrayList(l2.f884b.values()).iterator();
        while (it3.hasNext()) {
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q3 = (AbstractComponentCallbacksC0048q) it3.next();
            if (hashMap2.get(abstractComponentCallbacksC0048q3.f1011e) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0048q3 + " that was not found in the set of active Fragments " + j2.f877a);
                }
                this.f852L.e(abstractComponentCallbacksC0048q3);
                abstractComponentCallbacksC0048q3.f1022r = this;
                O o3 = new O(jVar, uVar, abstractComponentCallbacksC0048q3);
                o3.f902e = 1;
                o3.k();
                abstractComponentCallbacksC0048q3.f1016l = true;
                o3.k();
            }
        }
        ArrayList<String> arrayList2 = j2.f878b;
        ((ArrayList) uVar.f791a).clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                AbstractComponentCallbacksC0048q d = uVar.d(str3);
                if (d == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str3 + ")");
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + d);
                }
                uVar.a(d);
            }
        }
        if (j2.f879c != null) {
            this.d = new ArrayList(j2.f879c.length);
            int i3 = 0;
            while (true) {
                C0033b[] c0033bArr = j2.f879c;
                if (i3 >= c0033bArr.length) {
                    break;
                }
                C0033b c0033b = c0033bArr[i3];
                c0033b.getClass();
                C0032a c0032a = new C0032a(this);
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    int[] iArr = c0033b.f938a;
                    if (i4 >= iArr.length) {
                        break;
                    }
                    P p2 = new P();
                    int i6 = i4 + 1;
                    p2.f903a = iArr[i4];
                    if (Log.isLoggable("FragmentManager", i)) {
                        Log.v("FragmentManager", "Instantiate " + c0032a + " op #" + i5 + " base fragment #" + iArr[i6]);
                    }
                    p2.h = EnumC0071m.values()[c0033b.f940c[i5]];
                    p2.i = EnumC0071m.values()[c0033b.d[i5]];
                    int i7 = i4 + 2;
                    p2.f905c = iArr[i6] != 0;
                    int i8 = iArr[i7];
                    p2.d = i8;
                    int i9 = iArr[i4 + 3];
                    p2.f906e = i9;
                    int i10 = i4 + 5;
                    int i11 = iArr[i4 + 4];
                    p2.f907f = i11;
                    i4 += 6;
                    int i12 = iArr[i10];
                    p2.f908g = i12;
                    c0032a.f924b = i8;
                    c0032a.f925c = i9;
                    c0032a.d = i11;
                    c0032a.f926e = i12;
                    c0032a.b(p2);
                    i5++;
                    i = 2;
                }
                c0032a.f927f = c0033b.f941e;
                c0032a.h = c0033b.f942f;
                c0032a.f928g = true;
                c0032a.i = c0033b.h;
                c0032a.f929j = c0033b.i;
                c0032a.f930k = c0033b.f944j;
                c0032a.f931l = c0033b.f945k;
                c0032a.f932m = c0033b.f946l;
                c0032a.f933n = c0033b.f947m;
                c0032a.f934o = c0033b.f948n;
                c0032a.f937r = c0033b.f943g;
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = c0033b.f939b;
                    if (i13 >= arrayList3.size()) {
                        break;
                    }
                    String str4 = (String) arrayList3.get(i13);
                    if (str4 != null) {
                        ((P) c0032a.f923a.get(i13)).f904b = uVar.d(str4);
                    }
                    i13++;
                }
                c0032a.c(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i3 + " (index " + c0032a.f937r + "): " + c0032a);
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
        String str5 = j2.f880e;
        if (str5 != null) {
            AbstractComponentCallbacksC0048q d2 = uVar.d(str5);
            this.f873w = d2;
            q(d2);
        }
        ArrayList arrayList4 = j2.f881f;
        if (arrayList4 != null) {
            for (int i14 = i2; i14 < arrayList4.size(); i14++) {
                this.f860j.put((String) arrayList4.get(i14), (C0034c) j2.f882g.get(i14));
            }
        }
        this.f844C = new ArrayDeque(j2.h);
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
            if (c0040i.f965e) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0040i.f965e = false;
                c0040i.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((C0040i) it2.next()).e();
        }
        y(true);
        this.f846E = true;
        this.f852L.f888g = true;
        T.u uVar = this.f856c;
        uVar.getClass();
        HashMap hashMap = (HashMap) uVar.f792b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (O o2 : hashMap.values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f901c;
                N n2 = new N(abstractComponentCallbacksC0048q);
                if (abstractComponentCallbacksC0048q.f1008a <= -1 || n2.f898m != null) {
                    n2.f898m = abstractComponentCallbacksC0048q.f1009b;
                } else {
                    Bundle bundle2 = new Bundle();
                    abstractComponentCallbacksC0048q.x(bundle2);
                    abstractComponentCallbacksC0048q.f1005P.c(bundle2);
                    bundle2.putParcelable("android:support:fragments", abstractComponentCallbacksC0048q.f1024t.R());
                    o2.f899a.o(false);
                    if (bundle2.isEmpty()) {
                        bundle2 = null;
                    }
                    if (abstractComponentCallbacksC0048q.f995E != null) {
                        o2.o();
                    }
                    if (abstractComponentCallbacksC0048q.f1010c != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putSparseParcelableArray("android:view_state", abstractComponentCallbacksC0048q.f1010c);
                    }
                    if (abstractComponentCallbacksC0048q.d != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBundle("android:view_registry_state", abstractComponentCallbacksC0048q.d);
                    }
                    if (!abstractComponentCallbacksC0048q.f996G) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBoolean("android:user_visible_hint", abstractComponentCallbacksC0048q.f996G);
                    }
                    n2.f898m = bundle2;
                    if (abstractComponentCallbacksC0048q.h != null) {
                        if (bundle2 == null) {
                            n2.f898m = new Bundle();
                        }
                        n2.f898m.putString("android:target_state", abstractComponentCallbacksC0048q.h);
                        int i2 = abstractComponentCallbacksC0048q.i;
                        if (i2 != 0) {
                            n2.f898m.putInt("android:target_req_state", i2);
                        }
                    }
                }
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = o2.f901c;
                arrayList2.add(abstractComponentCallbacksC0048q2.f1011e);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0048q2 + ": " + abstractComponentCallbacksC0048q2.f1009b);
                }
            }
        }
        T.u uVar2 = this.f856c;
        uVar2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) uVar2.f793c).values());
        if (!arrayList3.isEmpty()) {
            T.u uVar3 = this.f856c;
            synchronized (((ArrayList) uVar3.f791a)) {
                try {
                    if (((ArrayList) uVar3.f791a).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) uVar3.f791a).size());
                        Iterator it3 = ((ArrayList) uVar3.f791a).iterator();
                        while (it3.hasNext()) {
                            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q3 = (AbstractComponentCallbacksC0048q) it3.next();
                            arrayList.add(abstractComponentCallbacksC0048q3.f1011e);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0048q3.f1011e + "): " + abstractComponentCallbacksC0048q3);
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
            j2.f880e = null;
            ArrayList arrayList5 = new ArrayList();
            j2.f881f = arrayList5;
            ArrayList arrayList6 = new ArrayList();
            j2.f882g = arrayList6;
            j2.f877a = arrayList2;
            j2.f878b = arrayList;
            j2.f879c = c0033bArr;
            j2.d = this.i.get();
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q4 = this.f873w;
            if (abstractComponentCallbacksC0048q4 != null) {
                j2.f880e = abstractComponentCallbacksC0048q4.f1011e;
            }
            arrayList5.addAll(this.f860j.keySet());
            arrayList6.addAll(this.f860j.values());
            j2.h = new ArrayList(this.f844C);
            bundle.putParcelable("state", j2);
            for (String str : this.f861k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f861k.get(str));
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                N n3 = (N) it4.next();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("state", n3);
                bundle.putBundle("fragment_" + n3.f890b, bundle3);
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public final void S() {
        synchronized (this.f854a) {
            try {
                if (this.f854a.size() == 1) {
                    this.f870t.f1037j.removeCallbacks(this.f853M);
                    this.f870t.f1037j.post(this.f853M);
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

    public final void U(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q, EnumC0071m enumC0071m) {
        if (abstractComponentCallbacksC0048q.equals(this.f856c.d(abstractComponentCallbacksC0048q.f1011e)) && (abstractComponentCallbacksC0048q.f1023s == null || abstractComponentCallbacksC0048q.f1022r == this)) {
            abstractComponentCallbacksC0048q.f1001L = enumC0071m;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0048q + " is not an active fragment of FragmentManager " + this);
    }

    public final void V(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (abstractComponentCallbacksC0048q != null) {
            if (!abstractComponentCallbacksC0048q.equals(this.f856c.d(abstractComponentCallbacksC0048q.f1011e)) || (abstractComponentCallbacksC0048q.f1023s != null && abstractComponentCallbacksC0048q.f1022r != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0048q + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = this.f873w;
        this.f873w = abstractComponentCallbacksC0048q;
        q(abstractComponentCallbacksC0048q2);
        q(this.f873w);
    }

    public final void W(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        ViewGroup B2 = B(abstractComponentCallbacksC0048q);
        if (B2 != null) {
            C0047p c0047p = abstractComponentCallbacksC0048q.f997H;
            if ((c0047p == null ? 0 : c0047p.f985e) + (c0047p == null ? 0 : c0047p.d) + (c0047p == null ? 0 : c0047p.f984c) + (c0047p == null ? 0 : c0047p.f983b) > 0) {
                if (B2.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    B2.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0048q);
                }
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = (AbstractComponentCallbacksC0048q) B2.getTag(R.id.visible_removing_fragment_view_tag);
                C0047p c0047p2 = abstractComponentCallbacksC0048q.f997H;
                boolean z2 = c0047p2 != null ? c0047p2.f982a : false;
                if (abstractComponentCallbacksC0048q2.f997H == null) {
                    return;
                }
                abstractComponentCallbacksC0048q2.f().f982a = z2;
            }
        }
    }

    public final void Y() {
        Iterator it = this.f856c.h().iterator();
        while (it.hasNext()) {
            O o2 = (O) it.next();
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f901c;
            if (abstractComponentCallbacksC0048q.F) {
                if (this.f855b) {
                    this.f848H = true;
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
        C0051u c0051u = this.f870t;
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
            c0051u.f1039l.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw illegalStateException;
        }
    }

    public final O a(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        String str = abstractComponentCallbacksC0048q.f1000K;
        if (str != null) {
            Y.d.c(abstractComponentCallbacksC0048q, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0048q);
        }
        O f2 = f(abstractComponentCallbacksC0048q);
        abstractComponentCallbacksC0048q.f1022r = this;
        T.u uVar = this.f856c;
        uVar.m(f2);
        if (!abstractComponentCallbacksC0048q.f1030z) {
            uVar.a(abstractComponentCallbacksC0048q);
            abstractComponentCallbacksC0048q.f1016l = false;
            if (abstractComponentCallbacksC0048q.f995E == null) {
                abstractComponentCallbacksC0048q.f998I = false;
            }
            if (F(abstractComponentCallbacksC0048q)) {
                this.f845D = true;
            }
        }
        return f2;
    }

    public final void a0() {
        synchronized (this.f854a) {
            try {
                if (!this.f854a.isEmpty()) {
                    A a2 = this.h;
                    a2.f830a = true;
                    a.w wVar = a2.f832c;
                    if (wVar != null) {
                        wVar.a();
                    }
                    return;
                }
                A a3 = this.h;
                ArrayList arrayList = this.d;
                a3.f830a = (arrayList != null ? arrayList.size() : 0) > 0 && I(this.f872v);
                a.w wVar2 = a3.f832c;
                if (wVar2 != null) {
                    wVar2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(C0051u c0051u, s1.l lVar, AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        String str;
        if (this.f870t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f870t = c0051u;
        this.f871u = lVar;
        this.f872v = abstractComponentCallbacksC0048q;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f863m;
        if (abstractComponentCallbacksC0048q != 0) {
            copyOnWriteArrayList.add(new D(abstractComponentCallbacksC0048q));
        } else if (c0051u != null) {
            copyOnWriteArrayList.add(c0051u);
        }
        if (this.f872v != null) {
            a0();
        }
        if (c0051u != null) {
            a.x i = c0051u.f1039l.i();
            this.f859g = i;
            C0051u c0051u2 = abstractComponentCallbacksC0048q != 0 ? abstractComponentCallbacksC0048q : c0051u;
            i.getClass();
            A a2 = this.h;
            Z0.d.e(a2, "onBackPressedCallback");
            androidx.lifecycle.t d = c0051u2.d();
            if (d.f1406c != EnumC0071m.f1396a) {
                a2.f831b.add(new a.u(i, d, a2));
                i.d();
                a2.f832c = new a.w(0, i);
            }
        }
        if (abstractComponentCallbacksC0048q != 0) {
            L l2 = abstractComponentCallbacksC0048q.f1022r.f852L;
            HashMap hashMap = l2.f885c;
            L l3 = (L) hashMap.get(abstractComponentCallbacksC0048q.f1011e);
            if (l3 == null) {
                l3 = new L(l2.f886e);
                hashMap.put(abstractComponentCallbacksC0048q.f1011e, l3);
            }
            this.f852L = l3;
        } else if (c0051u != null) {
            this.f852L = (L) new C.g(c0051u.f1039l.c(), L.h).w(L.class);
        } else {
            this.f852L = new L(false);
        }
        L l4 = this.f852L;
        l4.f888g = this.f846E || this.F;
        this.f856c.d = l4;
        C0051u c0051u3 = this.f870t;
        if (c0051u3 != null && abstractComponentCallbacksC0048q == 0) {
            h0.d b2 = c0051u3.b();
            b2.e("android:support:fragments", new r(2, this));
            Bundle c2 = b2.c("android:support:fragments");
            if (c2 != null) {
                Q(c2);
            }
        }
        C0051u c0051u4 = this.f870t;
        if (c0051u4 != null) {
            AbstractActivityC0131i abstractActivityC0131i = c0051u4.f1039l;
            if (abstractComponentCallbacksC0048q != 0) {
                str = abstractComponentCallbacksC0048q.f1011e + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            String e2 = V.e(str2, "StartActivityForResult");
            E e3 = new E(2);
            z zVar = new z(this, 1);
            a.j jVar = abstractActivityC0131i.h;
            this.f876z = jVar.b(e2, e3, zVar);
            this.f842A = jVar.b(V.e(str2, "StartIntentSenderForResult"), new E(0), new z(this, 2));
            this.f843B = jVar.b(V.e(str2, "RequestPermissions"), new E(1), new z(this, 0));
        }
        C0051u c0051u5 = this.f870t;
        if (c0051u5 != null) {
            c0051u5.f1039l.g(this.f864n);
        }
        C0051u c0051u6 = this.f870t;
        if (c0051u6 != null) {
            AbstractActivityC0131i abstractActivityC0131i2 = c0051u6.f1039l;
            y yVar = this.f865o;
            abstractActivityC0131i2.getClass();
            Z0.d.e(yVar, "listener");
            abstractActivityC0131i2.f1099j.add(yVar);
        }
        C0051u c0051u7 = this.f870t;
        if (c0051u7 != null) {
            AbstractActivityC0131i abstractActivityC0131i3 = c0051u7.f1039l;
            y yVar2 = this.f866p;
            abstractActivityC0131i3.getClass();
            Z0.d.e(yVar2, "listener");
            abstractActivityC0131i3.f1101l.add(yVar2);
        }
        C0051u c0051u8 = this.f870t;
        if (c0051u8 != null) {
            AbstractActivityC0131i abstractActivityC0131i4 = c0051u8.f1039l;
            y yVar3 = this.f867q;
            abstractActivityC0131i4.getClass();
            Z0.d.e(yVar3, "listener");
            abstractActivityC0131i4.f1102m.add(yVar3);
        }
        C0051u c0051u9 = this.f870t;
        if (c0051u9 == null || abstractComponentCallbacksC0048q != 0) {
            return;
        }
        AbstractActivityC0131i abstractActivityC0131i5 = c0051u9.f1039l;
        B b3 = this.f868r;
        abstractActivityC0131i5.getClass();
        Z0.d.e(b3, "provider");
        C0011l c0011l = abstractActivityC0131i5.f1095c;
        ((CopyOnWriteArrayList) c0011l.f416c).add(b3);
        ((Runnable) c0011l.f415b).run();
    }

    public final void c(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0048q);
        }
        if (abstractComponentCallbacksC0048q.f1030z) {
            abstractComponentCallbacksC0048q.f1030z = false;
            if (abstractComponentCallbacksC0048q.f1015k) {
                return;
            }
            this.f856c.a(abstractComponentCallbacksC0048q);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0048q);
            }
            if (F(abstractComponentCallbacksC0048q)) {
                this.f845D = true;
            }
        }
    }

    public final void d() {
        this.f855b = false;
        this.f850J.clear();
        this.f849I.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f856c.h().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((O) it.next()).f901c.f994D;
            if (viewGroup != null) {
                hashSet.add(C0040i.f(viewGroup, D()));
            }
        }
        return hashSet;
    }

    public final O f(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        String str = abstractComponentCallbacksC0048q.f1011e;
        T.u uVar = this.f856c;
        O o2 = (O) ((HashMap) uVar.f792b).get(str);
        if (o2 != null) {
            return o2;
        }
        O o3 = new O(this.f862l, uVar, abstractComponentCallbacksC0048q);
        o3.m(this.f870t.i.getClassLoader());
        o3.f902e = this.f869s;
        return o3;
    }

    public final void g(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0048q);
        }
        if (abstractComponentCallbacksC0048q.f1030z) {
            return;
        }
        abstractComponentCallbacksC0048q.f1030z = true;
        if (abstractComponentCallbacksC0048q.f1015k) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0048q);
            }
            T.u uVar = this.f856c;
            synchronized (((ArrayList) uVar.f791a)) {
                ((ArrayList) uVar.f791a).remove(abstractComponentCallbacksC0048q);
            }
            abstractComponentCallbacksC0048q.f1015k = false;
            if (F(abstractComponentCallbacksC0048q)) {
                this.f845D = true;
            }
            W(abstractComponentCallbacksC0048q);
        }
    }

    public final void h(boolean z2) {
        if (z2 && this.f870t != null) {
            Z(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f856c.j()) {
            if (abstractComponentCallbacksC0048q != null) {
                abstractComponentCallbacksC0048q.f993C = true;
                if (z2) {
                    abstractComponentCallbacksC0048q.f1024t.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.f869s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f856c.j()) {
            if (abstractComponentCallbacksC0048q != null) {
                if (!abstractComponentCallbacksC0048q.f1029y ? abstractComponentCallbacksC0048q.f1024t.i() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.f869s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f856c.j()) {
            if (abstractComponentCallbacksC0048q != null && H(abstractComponentCallbacksC0048q)) {
                if (!abstractComponentCallbacksC0048q.f1029y ? abstractComponentCallbacksC0048q.f1024t.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0048q);
                    z2 = true;
                }
            }
        }
        if (this.f857e != null) {
            for (int i = 0; i < this.f857e.size(); i++) {
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = (AbstractComponentCallbacksC0048q) this.f857e.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0048q2)) {
                    abstractComponentCallbacksC0048q2.getClass();
                }
            }
        }
        this.f857e = arrayList;
        return z2;
    }

    public final void k() {
        boolean z2 = true;
        this.f847G = true;
        y(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0040i) it.next()).e();
        }
        C0051u c0051u = this.f870t;
        T.u uVar = this.f856c;
        if (c0051u != null) {
            z2 = ((L) uVar.d).f887f;
        } else {
            AbstractActivityC0131i abstractActivityC0131i = c0051u.i;
            if (abstractActivityC0131i != null) {
                z2 = true ^ abstractActivityC0131i.isChangingConfigurations();
            }
        }
        if (z2) {
            Iterator it2 = this.f860j.values().iterator();
            while (it2.hasNext()) {
                for (String str : ((C0034c) it2.next()).f949a) {
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
        C0051u c0051u2 = this.f870t;
        if (c0051u2 != null) {
            AbstractActivityC0131i abstractActivityC0131i2 = c0051u2.f1039l;
            y yVar = this.f865o;
            abstractActivityC0131i2.getClass();
            Z0.d.e(yVar, "listener");
            abstractActivityC0131i2.f1099j.remove(yVar);
        }
        C0051u c0051u3 = this.f870t;
        if (c0051u3 != null) {
            AbstractActivityC0131i abstractActivityC0131i3 = c0051u3.f1039l;
            y yVar2 = this.f864n;
            abstractActivityC0131i3.getClass();
            Z0.d.e(yVar2, "listener");
            abstractActivityC0131i3.i.remove(yVar2);
        }
        C0051u c0051u4 = this.f870t;
        if (c0051u4 != null) {
            AbstractActivityC0131i abstractActivityC0131i4 = c0051u4.f1039l;
            y yVar3 = this.f866p;
            abstractActivityC0131i4.getClass();
            Z0.d.e(yVar3, "listener");
            abstractActivityC0131i4.f1101l.remove(yVar3);
        }
        C0051u c0051u5 = this.f870t;
        if (c0051u5 != null) {
            AbstractActivityC0131i abstractActivityC0131i5 = c0051u5.f1039l;
            y yVar4 = this.f867q;
            abstractActivityC0131i5.getClass();
            Z0.d.e(yVar4, "listener");
            abstractActivityC0131i5.f1102m.remove(yVar4);
        }
        C0051u c0051u6 = this.f870t;
        if (c0051u6 != null) {
            AbstractActivityC0131i abstractActivityC0131i6 = c0051u6.f1039l;
            B b2 = this.f868r;
            abstractActivityC0131i6.getClass();
            Z0.d.e(b2, "provider");
            C0011l c0011l = abstractActivityC0131i6.f1095c;
            ((CopyOnWriteArrayList) c0011l.f416c).remove(b2);
            if (((HashMap) c0011l.d).remove(b2) != null) {
                throw new ClassCastException();
            }
            ((Runnable) c0011l.f415b).run();
        }
        this.f870t = null;
        this.f871u = null;
        this.f872v = null;
        if (this.f859g != null) {
            Iterator it3 = this.h.f831b.iterator();
            while (it3.hasNext()) {
                ((a.c) it3.next()).cancel();
            }
            this.f859g = null;
        }
        B.j jVar = this.f876z;
        if (jVar != null) {
            jVar.J();
            this.f842A.J();
            this.f843B.J();
        }
    }

    public final void l(boolean z2) {
        if (z2 && this.f870t != null) {
            Z(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f856c.j()) {
            if (abstractComponentCallbacksC0048q != null) {
                abstractComponentCallbacksC0048q.f993C = true;
                if (z2) {
                    abstractComponentCallbacksC0048q.f1024t.l(true);
                }
            }
        }
    }

    public final void m(boolean z2, boolean z3) {
        if (z3 && this.f870t != null) {
            Z(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f856c.j()) {
            if (abstractComponentCallbacksC0048q != null && z3) {
                abstractComponentCallbacksC0048q.f1024t.m(z2, true);
            }
        }
    }

    public final void n() {
        Iterator it = this.f856c.i().iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = (AbstractComponentCallbacksC0048q) it.next();
            if (abstractComponentCallbacksC0048q != null) {
                abstractComponentCallbacksC0048q.n();
                abstractComponentCallbacksC0048q.f1024t.n();
            }
        }
    }

    public final boolean o() {
        if (this.f869s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f856c.j()) {
            if (abstractComponentCallbacksC0048q != null) {
                if (!abstractComponentCallbacksC0048q.f1029y ? abstractComponentCallbacksC0048q.f1024t.o() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f869s < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f856c.j()) {
            if (abstractComponentCallbacksC0048q != null && !abstractComponentCallbacksC0048q.f1029y) {
                abstractComponentCallbacksC0048q.f1024t.p();
            }
        }
    }

    public final void q(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (abstractComponentCallbacksC0048q != null) {
            if (abstractComponentCallbacksC0048q.equals(this.f856c.d(abstractComponentCallbacksC0048q.f1011e))) {
                abstractComponentCallbacksC0048q.f1022r.getClass();
                boolean I2 = I(abstractComponentCallbacksC0048q);
                Boolean bool = abstractComponentCallbacksC0048q.f1014j;
                if (bool == null || bool.booleanValue() != I2) {
                    abstractComponentCallbacksC0048q.f1014j = Boolean.valueOf(I2);
                    I i = abstractComponentCallbacksC0048q.f1024t;
                    i.a0();
                    i.q(i.f873w);
                }
            }
        }
    }

    public final void r(boolean z2, boolean z3) {
        if (z3 && this.f870t != null) {
            Z(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f856c.j()) {
            if (abstractComponentCallbacksC0048q != null && z3) {
                abstractComponentCallbacksC0048q.f1024t.r(z2, true);
            }
        }
    }

    public final boolean s() {
        if (this.f869s < 1) {
            return false;
        }
        boolean z2 = false;
        for (AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q : this.f856c.j()) {
            if (abstractComponentCallbacksC0048q != null && H(abstractComponentCallbacksC0048q)) {
                if (!abstractComponentCallbacksC0048q.f1029y ? abstractComponentCallbacksC0048q.f1024t.s() : false) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final void t(int i) {
        try {
            this.f855b = true;
            for (O o2 : ((HashMap) this.f856c.f792b).values()) {
                if (o2 != null) {
                    o2.f902e = i;
                }
            }
            J(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0040i) it.next()).e();
            }
            this.f855b = false;
            y(true);
        } catch (Throwable th) {
            this.f855b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f872v;
        if (abstractComponentCallbacksC0048q != null) {
            sb.append(abstractComponentCallbacksC0048q.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f872v)));
            sb.append("}");
        } else {
            C0051u c0051u = this.f870t;
            if (c0051u != null) {
                sb.append(c0051u.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f870t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u() {
        if (this.f848H) {
            this.f848H = false;
            Y();
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String e2 = V.e(str, "    ");
        T.u uVar = this.f856c;
        uVar.getClass();
        String str3 = str + "    ";
        HashMap hashMap = (HashMap) uVar.f792b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (O o2 : hashMap.values()) {
                printWriter.print(str);
                if (o2 != null) {
                    AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f901c;
                    printWriter.println(abstractComponentCallbacksC0048q);
                    abstractComponentCallbacksC0048q.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0048q.f1026v));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0048q.f1027w));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0048q.f1028x);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0048q.f1008a);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0048q.f1011e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0048q.f1021q);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0048q.f1015k);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0048q.f1016l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0048q.f1017m);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0048q.f1018n);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0048q.f1029y);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0048q.f1030z);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0048q.f992B);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0048q.f991A);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0048q.f996G);
                    if (abstractComponentCallbacksC0048q.f1022r != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0048q.f1022r);
                    }
                    if (abstractComponentCallbacksC0048q.f1023s != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0048q.f1023s);
                    }
                    if (abstractComponentCallbacksC0048q.f1025u != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0048q.f1025u);
                    }
                    if (abstractComponentCallbacksC0048q.f1012f != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0048q.f1012f);
                    }
                    if (abstractComponentCallbacksC0048q.f1009b != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0048q.f1009b);
                    }
                    if (abstractComponentCallbacksC0048q.f1010c != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0048q.f1010c);
                    }
                    if (abstractComponentCallbacksC0048q.d != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0048q.d);
                    }
                    Object obj = abstractComponentCallbacksC0048q.f1013g;
                    if (obj == null) {
                        I i = abstractComponentCallbacksC0048q.f1022r;
                        obj = (i == null || (str2 = abstractComponentCallbacksC0048q.h) == null) ? null : i.f856c.d(str2);
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
                    C0047p c0047p = abstractComponentCallbacksC0048q.f997H;
                    printWriter.println(c0047p == null ? false : c0047p.f982a);
                    C0047p c0047p2 = abstractComponentCallbacksC0048q.f997H;
                    if ((c0047p2 == null ? 0 : c0047p2.f983b) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        C0047p c0047p3 = abstractComponentCallbacksC0048q.f997H;
                        printWriter.println(c0047p3 == null ? 0 : c0047p3.f983b);
                    }
                    C0047p c0047p4 = abstractComponentCallbacksC0048q.f997H;
                    if ((c0047p4 == null ? 0 : c0047p4.f984c) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        C0047p c0047p5 = abstractComponentCallbacksC0048q.f997H;
                        printWriter.println(c0047p5 == null ? 0 : c0047p5.f984c);
                    }
                    C0047p c0047p6 = abstractComponentCallbacksC0048q.f997H;
                    if ((c0047p6 == null ? 0 : c0047p6.d) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        C0047p c0047p7 = abstractComponentCallbacksC0048q.f997H;
                        printWriter.println(c0047p7 == null ? 0 : c0047p7.d);
                    }
                    C0047p c0047p8 = abstractComponentCallbacksC0048q.f997H;
                    if ((c0047p8 == null ? 0 : c0047p8.f985e) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        C0047p c0047p9 = abstractComponentCallbacksC0048q.f997H;
                        printWriter.println(c0047p9 == null ? 0 : c0047p9.f985e);
                    }
                    if (abstractComponentCallbacksC0048q.f994D != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0048q.f994D);
                    }
                    if (abstractComponentCallbacksC0048q.f995E != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0048q.f995E);
                    }
                    if (abstractComponentCallbacksC0048q.h() != null) {
                        o.l lVar = ((C0081a) new C.g(abstractComponentCallbacksC0048q.c(), C0081a.f1548c).w(C0081a.class)).f1549b;
                        if (lVar.f3336c > 0) {
                            printWriter.print(str3);
                            printWriter.println("Loaders:");
                            if (lVar.f3336c > 0) {
                                if (lVar.f3335b[0] != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(str3);
                                printWriter.print("  #");
                                printWriter.print(lVar.f3334a[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + abstractComponentCallbacksC0048q.f1024t + ":");
                    abstractComponentCallbacksC0048q.f1024t.v(V.e(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) uVar.f791a;
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
        ArrayList arrayList2 = this.f857e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q3 = (AbstractComponentCallbacksC0048q) this.f857e.get(i3);
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
        synchronized (this.f854a) {
            try {
                int size4 = this.f854a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i5 = 0; i5 < size4; i5++) {
                        Object obj2 = (G) this.f854a.get(i5);
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
        printWriter.println(this.f870t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f871u);
        if (this.f872v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f872v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f869s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f846E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f847G);
        if (this.f845D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f845D);
        }
    }

    public final void w(G g2, boolean z2) {
        if (!z2) {
            if (this.f870t == null) {
                if (!this.f847G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f846E || this.F) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f854a) {
            try {
                if (this.f870t == null) {
                    if (!z2) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f854a.add(g2);
                    S();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(boolean z2) {
        if (this.f855b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f870t == null) {
            if (!this.f847G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f870t.f1037j.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2 && (this.f846E || this.F)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f849I == null) {
            this.f849I = new ArrayList();
            this.f850J = new ArrayList();
        }
    }

    public final boolean y(boolean z2) {
        boolean z3;
        x(z2);
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.f849I;
            ArrayList arrayList2 = this.f850J;
            synchronized (this.f854a) {
                if (this.f854a.isEmpty()) {
                    z3 = false;
                } else {
                    try {
                        int size = this.f854a.size();
                        z3 = false;
                        for (int i = 0; i < size; i++) {
                            z3 |= ((G) this.f854a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z3) {
                a0();
                u();
                ((HashMap) this.f856c.f792b).values().removeAll(Collections.singleton(null));
                return z4;
            }
            z4 = true;
            this.f855b = true;
            try {
                P(this.f849I, this.f850J);
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
        boolean z2 = ((C0032a) arrayList3.get(i)).f934o;
        ArrayList arrayList5 = this.f851K;
        if (arrayList5 == null) {
            this.f851K = new ArrayList();
        } else {
            arrayList5.clear();
        }
        ArrayList arrayList6 = this.f851K;
        T.u uVar4 = this.f856c;
        arrayList6.addAll(uVar4.j());
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f873w;
        int i6 = i;
        boolean z3 = false;
        while (true) {
            int i7 = 1;
            if (i6 >= i2) {
                T.u uVar5 = uVar4;
                this.f851K.clear();
                if (!z2 && this.f869s >= 1) {
                    for (int i8 = i; i8 < i2; i8++) {
                        Iterator it = ((C0032a) arrayList.get(i8)).f923a.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = ((P) it.next()).f904b;
                            if (abstractComponentCallbacksC0048q2 == null || abstractComponentCallbacksC0048q2.f1022r == null) {
                                uVar = uVar5;
                            } else {
                                uVar = uVar5;
                                uVar.m(f(abstractComponentCallbacksC0048q2));
                            }
                            uVar5 = uVar;
                        }
                    }
                }
                for (int i9 = i; i9 < i2; i9++) {
                    C0032a c0032a = (C0032a) arrayList.get(i9);
                    if (((Boolean) arrayList2.get(i9)).booleanValue()) {
                        c0032a.c(-1);
                        ArrayList arrayList7 = c0032a.f923a;
                        boolean z4 = true;
                        for (int size = arrayList7.size() - 1; size >= 0; size--) {
                            P p2 = (P) arrayList7.get(size);
                            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q3 = p2.f904b;
                            if (abstractComponentCallbacksC0048q3 != null) {
                                if (abstractComponentCallbacksC0048q3.f997H != null) {
                                    abstractComponentCallbacksC0048q3.f().f982a = z4;
                                }
                                int i10 = c0032a.f927f;
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
                                if (abstractComponentCallbacksC0048q3.f997H != null || i11 != 0) {
                                    abstractComponentCallbacksC0048q3.f();
                                    abstractComponentCallbacksC0048q3.f997H.f986f = i11;
                                }
                                abstractComponentCallbacksC0048q3.f();
                                abstractComponentCallbacksC0048q3.f997H.getClass();
                            }
                            int i13 = p2.f903a;
                            I i14 = c0032a.f935p;
                            switch (i13) {
                                case 1:
                                    abstractComponentCallbacksC0048q3.E(p2.d, p2.f906e, p2.f907f, p2.f908g);
                                    z4 = true;
                                    i14.T(abstractComponentCallbacksC0048q3, true);
                                    i14.O(abstractComponentCallbacksC0048q3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + p2.f903a);
                                case 3:
                                    abstractComponentCallbacksC0048q3.E(p2.d, p2.f906e, p2.f907f, p2.f908g);
                                    i14.a(abstractComponentCallbacksC0048q3);
                                    z4 = true;
                                case 4:
                                    abstractComponentCallbacksC0048q3.E(p2.d, p2.f906e, p2.f907f, p2.f908g);
                                    i14.getClass();
                                    X(abstractComponentCallbacksC0048q3);
                                    z4 = true;
                                case 5:
                                    abstractComponentCallbacksC0048q3.E(p2.d, p2.f906e, p2.f907f, p2.f908g);
                                    i14.T(abstractComponentCallbacksC0048q3, true);
                                    i14.E(abstractComponentCallbacksC0048q3);
                                    z4 = true;
                                case 6:
                                    abstractComponentCallbacksC0048q3.E(p2.d, p2.f906e, p2.f907f, p2.f908g);
                                    i14.c(abstractComponentCallbacksC0048q3);
                                    z4 = true;
                                case 7:
                                    abstractComponentCallbacksC0048q3.E(p2.d, p2.f906e, p2.f907f, p2.f908g);
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
                        ArrayList arrayList8 = c0032a.f923a;
                        int size2 = arrayList8.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            P p3 = (P) arrayList8.get(i15);
                            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q4 = p3.f904b;
                            if (abstractComponentCallbacksC0048q4 != null) {
                                if (abstractComponentCallbacksC0048q4.f997H != null) {
                                    abstractComponentCallbacksC0048q4.f().f982a = false;
                                }
                                int i16 = c0032a.f927f;
                                if (abstractComponentCallbacksC0048q4.f997H != null || i16 != 0) {
                                    abstractComponentCallbacksC0048q4.f();
                                    abstractComponentCallbacksC0048q4.f997H.f986f = i16;
                                }
                                abstractComponentCallbacksC0048q4.f();
                                abstractComponentCallbacksC0048q4.f997H.getClass();
                            }
                            int i17 = p3.f903a;
                            I i18 = c0032a.f935p;
                            switch (i17) {
                                case 1:
                                    abstractComponentCallbacksC0048q4.E(p3.d, p3.f906e, p3.f907f, p3.f908g);
                                    i18.T(abstractComponentCallbacksC0048q4, false);
                                    i18.a(abstractComponentCallbacksC0048q4);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + p3.f903a);
                                case 3:
                                    abstractComponentCallbacksC0048q4.E(p3.d, p3.f906e, p3.f907f, p3.f908g);
                                    i18.O(abstractComponentCallbacksC0048q4);
                                case 4:
                                    abstractComponentCallbacksC0048q4.E(p3.d, p3.f906e, p3.f907f, p3.f908g);
                                    i18.E(abstractComponentCallbacksC0048q4);
                                case 5:
                                    abstractComponentCallbacksC0048q4.E(p3.d, p3.f906e, p3.f907f, p3.f908g);
                                    i18.T(abstractComponentCallbacksC0048q4, false);
                                    X(abstractComponentCallbacksC0048q4);
                                case 6:
                                    abstractComponentCallbacksC0048q4.E(p3.d, p3.f906e, p3.f907f, p3.f908g);
                                    i18.g(abstractComponentCallbacksC0048q4);
                                case 7:
                                    abstractComponentCallbacksC0048q4.E(p3.d, p3.f906e, p3.f907f, p3.f908g);
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
                        for (int size3 = c0032a2.f923a.size() - 1; size3 >= 0; size3--) {
                            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q5 = ((P) c0032a2.f923a.get(size3)).f904b;
                            if (abstractComponentCallbacksC0048q5 != null) {
                                f(abstractComponentCallbacksC0048q5).k();
                            }
                        }
                    } else {
                        Iterator it2 = c0032a2.f923a.iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q6 = ((P) it2.next()).f904b;
                            if (abstractComponentCallbacksC0048q6 != null) {
                                f(abstractComponentCallbacksC0048q6).k();
                            }
                        }
                    }
                }
                J(this.f869s, true);
                HashSet hashSet = new HashSet();
                for (int i20 = i; i20 < i2; i20++) {
                    Iterator it3 = ((C0032a) arrayList.get(i20)).f923a.iterator();
                    while (it3.hasNext()) {
                        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q7 = ((P) it3.next()).f904b;
                        if (abstractComponentCallbacksC0048q7 != null && (viewGroup = abstractComponentCallbacksC0048q7.f994D) != null) {
                            hashSet.add(C0040i.f(viewGroup, D()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    C0040i c0040i = (C0040i) it4.next();
                    c0040i.d = booleanValue;
                    synchronized (c0040i.f963b) {
                        try {
                            c0040i.g();
                            c0040i.f965e = false;
                            int size4 = c0040i.f963b.size() - 1;
                            while (true) {
                                if (size4 >= 0) {
                                    U u2 = (U) c0040i.f963b.get(size4);
                                    int c2 = V.c(u2.f919c.f995E);
                                    if (u2.f917a != 2 || c2 == 2) {
                                        size4--;
                                    } else {
                                        C0047p c0047p = u2.f919c.f997H;
                                        c0040i.f965e = false;
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
                    if (((Boolean) arrayList2.get(i21)).booleanValue() && c0032a3.f937r >= 0) {
                        c0032a3.f937r = -1;
                    }
                    c0032a3.getClass();
                }
                return;
            }
            C0032a c0032a4 = (C0032a) arrayList3.get(i6);
            if (((Boolean) arrayList4.get(i6)).booleanValue()) {
                uVar2 = uVar4;
                int i22 = 1;
                ArrayList arrayList9 = this.f851K;
                ArrayList arrayList10 = c0032a4.f923a;
                int size5 = arrayList10.size() - 1;
                while (size5 >= 0) {
                    P p4 = (P) arrayList10.get(size5);
                    int i23 = p4.f903a;
                    if (i23 != i22) {
                        if (i23 != 3) {
                            switch (i23) {
                                case 8:
                                    abstractComponentCallbacksC0048q = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0048q = p4.f904b;
                                    break;
                                case 10:
                                    p4.i = p4.h;
                                    break;
                            }
                            size5--;
                            i22 = 1;
                        }
                        arrayList9.add(p4.f904b);
                        size5--;
                        i22 = 1;
                    }
                    arrayList9.remove(p4.f904b);
                    size5--;
                    i22 = 1;
                }
            } else {
                ArrayList arrayList11 = this.f851K;
                int i24 = 0;
                while (true) {
                    ArrayList arrayList12 = c0032a4.f923a;
                    if (i24 < arrayList12.size()) {
                        P p5 = (P) arrayList12.get(i24);
                        int i25 = p5.f903a;
                        if (i25 != i7) {
                            if (i25 != 2) {
                                if (i25 == 3 || i25 == 6) {
                                    arrayList11.remove(p5.f904b);
                                    AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q8 = p5.f904b;
                                    if (abstractComponentCallbacksC0048q8 == abstractComponentCallbacksC0048q) {
                                        arrayList12.add(i24, new P(9, abstractComponentCallbacksC0048q8));
                                        i24++;
                                        uVar3 = uVar4;
                                        i3 = 1;
                                        abstractComponentCallbacksC0048q = null;
                                    }
                                } else if (i25 == 7) {
                                    uVar3 = uVar4;
                                    i3 = 1;
                                } else if (i25 == 8) {
                                    arrayList12.add(i24, new P(9, abstractComponentCallbacksC0048q, 0));
                                    p5.f905c = true;
                                    i24++;
                                    abstractComponentCallbacksC0048q = p5.f904b;
                                }
                                uVar3 = uVar4;
                                i3 = 1;
                            } else {
                                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q9 = p5.f904b;
                                int i26 = abstractComponentCallbacksC0048q9.f1027w;
                                int size6 = arrayList11.size() - 1;
                                boolean z5 = false;
                                while (size6 >= 0) {
                                    T.u uVar6 = uVar4;
                                    AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q10 = (AbstractComponentCallbacksC0048q) arrayList11.get(size6);
                                    if (abstractComponentCallbacksC0048q10.f1027w != i26) {
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
                                        p6.f907f = p5.f907f;
                                        p6.f906e = p5.f906e;
                                        p6.f908g = p5.f908g;
                                        arrayList12.add(i24, p6);
                                        arrayList11.remove(abstractComponentCallbacksC0048q10);
                                        i24++;
                                        abstractComponentCallbacksC0048q = abstractComponentCallbacksC0048q;
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
                                    p5.f903a = 1;
                                    p5.f905c = true;
                                    arrayList11.add(abstractComponentCallbacksC0048q9);
                                }
                            }
                            i24 += i3;
                            i7 = i3;
                            uVar4 = uVar3;
                        } else {
                            uVar3 = uVar4;
                            i3 = i7;
                        }
                        arrayList11.add(p5.f904b);
                        i24 += i3;
                        i7 = i3;
                        uVar4 = uVar3;
                    } else {
                        uVar2 = uVar4;
                    }
                }
            }
            z3 = z3 || c0032a4.f928g;
            i6++;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            uVar4 = uVar2;
        }
    }
}
