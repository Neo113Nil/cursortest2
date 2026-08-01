package androidx.fragment.app;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c;
import com.trembin.nirefon.betfury.R;
import defpackage.a8;
import defpackage.aq;
import defpackage.b8;
import defpackage.bi;
import defpackage.bq;
import defpackage.c8;
import defpackage.cq;
import defpackage.d2;
import defpackage.dq;
import defpackage.dz;
import defpackage.eq;
import defpackage.fq;
import defpackage.gq;
import defpackage.gx;
import defpackage.i5;
import defpackage.iq;
import defpackage.j30;
import defpackage.kq;
import defpackage.mq;
import defpackage.nx;
import defpackage.pq;
import defpackage.qe0;
import defpackage.r7;
import defpackage.rd;
import defpackage.ri;
import defpackage.s6;
import defpackage.s9;
import defpackage.se0;
import defpackage.sl;
import defpackage.t40;
import defpackage.tq;
import defpackage.u3;
import defpackage.u40;
import defpackage.uf;
import defpackage.uq;
import defpackage.v7;
import defpackage.vp;
import defpackage.wd;
import defpackage.wi;
import defpackage.x1;
import defpackage.xp;
import defpackage.y40;
import defpackage.zi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class c {
    public d2 A;
    public d2 B;
    public ArrayDeque C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ArrayList K;
    public FragmentManagerViewModel L;
    public final v7 M;
    public boolean b;
    public ArrayList d;
    public ArrayList e;
    public y40 g;
    public final i5 l;
    public final CopyOnWriteArrayList m;
    public final bq n;
    public final bq o;
    public final bq p;
    public final bq q;
    public final eq r;
    public int s;
    public xp t;
    public bi u;
    public a v;
    public a w;
    public final fq x;
    public final sl y;
    public d2 z;
    public final ArrayList a = new ArrayList();
    public final f c = new f();
    public final aq f = new aq(this);
    public final dq h = new dq(this);
    public final AtomicInteger i = new AtomicInteger();
    public final Map j = Collections.synchronizedMap(new HashMap());
    public final Map k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [bq] */
    /* JADX WARN: Type inference failed for: r0v13, types: [bq] */
    /* JADX WARN: Type inference failed for: r0v14, types: [bq] */
    /* JADX WARN: Type inference failed for: r0v15, types: [bq] */
    public c() {
        Collections.synchronizedMap(new HashMap());
        this.l = new i5(this);
        this.m = new CopyOnWriteArrayList();
        final int i = 0;
        this.n = new uf(this) { // from class: bq
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.uf
            public final void accept(Object obj) {
                int i2 = i;
                c cVar = this.b;
                switch (i2) {
                    case 0:
                        if (cVar.I()) {
                            cVar.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (cVar.I() && num.intValue() == 80) {
                            cVar.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z20 z20Var = (z20) obj;
                        if (cVar.I()) {
                            boolean z = z20Var.a;
                            cVar.m(false);
                            break;
                        }
                        break;
                    default:
                        o50 o50Var = (o50) obj;
                        if (cVar.I()) {
                            boolean z2 = o50Var.a;
                            cVar.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.o = new uf(this) { // from class: bq
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.uf
            public final void accept(Object obj) {
                int i22 = i2;
                c cVar = this.b;
                switch (i22) {
                    case 0:
                        if (cVar.I()) {
                            cVar.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (cVar.I() && num.intValue() == 80) {
                            cVar.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z20 z20Var = (z20) obj;
                        if (cVar.I()) {
                            boolean z = z20Var.a;
                            cVar.m(false);
                            break;
                        }
                        break;
                    default:
                        o50 o50Var = (o50) obj;
                        if (cVar.I()) {
                            boolean z2 = o50Var.a;
                            cVar.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.p = new uf(this) { // from class: bq
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.uf
            public final void accept(Object obj) {
                int i22 = i3;
                c cVar = this.b;
                switch (i22) {
                    case 0:
                        if (cVar.I()) {
                            cVar.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (cVar.I() && num.intValue() == 80) {
                            cVar.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z20 z20Var = (z20) obj;
                        if (cVar.I()) {
                            boolean z = z20Var.a;
                            cVar.m(false);
                            break;
                        }
                        break;
                    default:
                        o50 o50Var = (o50) obj;
                        if (cVar.I()) {
                            boolean z2 = o50Var.a;
                            cVar.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.q = new uf(this) { // from class: bq
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.uf
            public final void accept(Object obj) {
                int i22 = i4;
                c cVar = this.b;
                switch (i22) {
                    case 0:
                        if (cVar.I()) {
                            cVar.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (cVar.I() && num.intValue() == 80) {
                            cVar.l(false);
                            break;
                        }
                        break;
                    case 2:
                        z20 z20Var = (z20) obj;
                        if (cVar.I()) {
                            boolean z = z20Var.a;
                            cVar.m(false);
                            break;
                        }
                        break;
                    default:
                        o50 o50Var = (o50) obj;
                        if (cVar.I()) {
                            boolean z2 = o50Var.a;
                            cVar.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        this.r = new eq(this);
        this.s = -1;
        this.x = new fq(this);
        this.y = new sl();
        this.C = new ArrayDeque();
        this.M = new v7(6, this);
    }

    public static boolean G(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean H(a aVar) {
        aVar.getClass();
        ArrayList e = aVar.y.c.e();
        int size = e.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            Object obj = e.get(i);
            i++;
            a aVar2 = (a) obj;
            if (aVar2 != null) {
                z = H(aVar2);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(a aVar) {
        if (aVar == null) {
            return true;
        }
        if (aVar.G) {
            return aVar.w == null || J(aVar.z);
        }
        return false;
    }

    public static boolean K(a aVar) {
        if (aVar == null) {
            return true;
        }
        c cVar = aVar.w;
        return aVar == cVar.w && K(cVar.v);
    }

    public static void Z(a aVar) {
        if (G(2)) {
            Log.v("FragmentManager", "show: " + aVar);
        }
        if (aVar.D) {
            aVar.D = false;
            aVar.N = !aVar.N;
        }
    }

    public final a A(int i) {
        f fVar = this.c;
        ArrayList arrayList = fVar.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            if (aVar != null && aVar.A == i) {
                return aVar;
            }
        }
        for (e eVar : fVar.b.values()) {
            if (eVar != null) {
                a aVar2 = eVar.c;
                if (aVar2.A == i) {
                    return aVar2;
                }
            }
        }
        return null;
    }

    public final a B(String str) {
        f fVar = this.c;
        ArrayList arrayList = fVar.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            if (aVar != null && str.equals(aVar.C)) {
                return aVar;
            }
        }
        for (e eVar : fVar.b.values()) {
            if (eVar != null) {
                a aVar2 = eVar.c;
                if (str.equals(aVar2.C)) {
                    return aVar2;
                }
            }
        }
        return null;
    }

    public final ViewGroup C(a aVar) {
        ViewGroup viewGroup = aVar.I;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (aVar.B <= 0 || !this.u.P()) {
            return null;
        }
        View M = this.u.M(aVar.B);
        if (M instanceof ViewGroup) {
            return (ViewGroup) M;
        }
        return null;
    }

    public final fq D() {
        a aVar = this.v;
        return aVar != null ? aVar.w.D() : this.x;
    }

    public final sl E() {
        a aVar = this.v;
        return aVar != null ? aVar.w.E() : this.y;
    }

    public final void F(a aVar) {
        if (G(2)) {
            Log.v("FragmentManager", "hide: " + aVar);
        }
        if (aVar.D) {
            return;
        }
        aVar.D = true;
        aVar.N = true ^ aVar.N;
        Y(aVar);
    }

    public final boolean I() {
        a aVar = this.v;
        if (aVar == null) {
            return true;
        }
        return aVar.x != null && aVar.p && aVar.j().I();
    }

    public final void L(int i, boolean z) {
        xp xpVar;
        if (this.t == null && i != -1) {
            s9.u("No activity");
            return;
        }
        if (z || i != this.s) {
            this.s = i;
            f fVar = this.c;
            HashMap hashMap = fVar.b;
            ArrayList arrayList = fVar.a;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                e eVar = (e) hashMap.get(((a) obj).j);
                if (eVar != null) {
                    eVar.k();
                }
            }
            for (e eVar2 : hashMap.values()) {
                if (eVar2 != null) {
                    eVar2.k();
                    a aVar = eVar2.c;
                    if (aVar.q && !aVar.o()) {
                        fVar.h(eVar2);
                    }
                }
            }
            a0();
            if (this.D && (xpVar = this.t) != null && this.s == 7) {
                xpVar.s.invalidateOptionsMenu();
                this.D = false;
            }
        }
    }

    public final void M() {
        if (this.t == null) {
            return;
        }
        this.E = false;
        this.F = false;
        this.L.setIsStateSaved(false);
        for (a aVar : this.c.f()) {
            if (aVar != null) {
                aVar.y.M();
            }
        }
    }

    public final boolean N() {
        return O(-1, 0);
    }

    public final boolean O(int i, int i2) {
        y(false);
        x(true);
        a aVar = this.w;
        if (aVar != null && i < 0 && aVar.g().N()) {
            return true;
        }
        boolean P = P(this.I, this.J, i, i2);
        if (P) {
            this.b = true;
            try {
                R(this.I, this.J);
            } finally {
                d();
            }
        }
        c0();
        u();
        this.c.b.values().removeAll(Collections.singleton(null));
        return P;
    }

    public final boolean P(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        ArrayList arrayList3 = this.d;
        int i3 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                i3 = z ? 0 : this.d.size() - 1;
            } else {
                int size = this.d.size() - 1;
                while (size >= 0) {
                    a8 a8Var = (a8) this.d.get(size);
                    if (i >= 0 && i == a8Var.r) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    i3 = size;
                } else if (z) {
                    i3 = size;
                    while (i3 > 0) {
                        a8 a8Var2 = (a8) this.d.get(i3 - 1);
                        if (i < 0 || i != a8Var2.r) {
                            break;
                        }
                        i3--;
                    }
                } else if (size != this.d.size() - 1) {
                    i3 = size + 1;
                }
            }
        }
        if (i3 < 0) {
            return false;
        }
        for (int size2 = this.d.size() - 1; size2 >= i3; size2--) {
            arrayList.add((a8) this.d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void Q(a aVar) {
        if (G(2)) {
            Log.v("FragmentManager", "remove: " + aVar + " nesting=" + aVar.v);
        }
        boolean o = aVar.o();
        if (aVar.E && o) {
            return;
        }
        f fVar = this.c;
        synchronized (fVar.a) {
            fVar.a.remove(aVar);
        }
        aVar.p = false;
        if (H(aVar)) {
            this.D = true;
        }
        aVar.q = true;
        Y(aVar);
    }

    public final void R(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            s9.u("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((a8) arrayList.get(i)).o) {
                if (i2 != i) {
                    z(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((a8) arrayList.get(i2)).o) {
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

    public final void S(Parcelable parcelable) {
        i5 i5Var;
        int i;
        boolean z;
        int i2;
        e eVar;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.t.p.getClassLoader());
                this.k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.t.p.getClassLoader());
                arrayList.add((pq) bundle.getParcelable("state"));
            }
        }
        f fVar = this.c;
        HashMap hashMap = fVar.c;
        HashMap hashMap2 = fVar.b;
        hashMap.clear();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            pq pqVar = (pq) obj;
            hashMap.put(pqVar.g, pqVar);
        }
        mq mqVar = (mq) bundle3.getParcelable("state");
        if (mqVar == null) {
            return;
        }
        hashMap2.clear();
        ArrayList arrayList2 = mqVar.f;
        int size2 = arrayList2.size();
        int i4 = 0;
        while (true) {
            i5Var = this.l;
            i = 2;
            if (i4 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i4);
            i4++;
            pq pqVar2 = (pq) fVar.c.remove((String) obj2);
            if (pqVar2 != null) {
                a findRetainedFragmentByWho = this.L.findRetainedFragmentByWho(pqVar2.g);
                if (findRetainedFragmentByWho != null) {
                    if (G(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + findRetainedFragmentByWho);
                    }
                    eVar = new e(i5Var, fVar, findRetainedFragmentByWho, pqVar2);
                } else {
                    eVar = new e(this.l, this.c, this.t.p.getClassLoader(), D(), pqVar2);
                }
                a aVar = eVar.c;
                aVar.w = this;
                if (G(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + aVar.j + "): " + aVar);
                }
                eVar.m(this.t.p.getClassLoader());
                fVar.g(eVar);
                eVar.e = this.s;
            }
        }
        Iterator<a> it = this.L.getRetainedFragments().iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            a next = it.next();
            if (hashMap2.get(next.j) == null) {
                if (G(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + next + " that was not found in the set of active Fragments " + mqVar.f);
                }
                this.L.removeRetainedFragment(next);
                next.w = this;
                e eVar2 = new e(i5Var, fVar, next);
                eVar2.e = 1;
                eVar2.k();
                next.q = true;
                eVar2.k();
            }
        }
        ArrayList arrayList3 = mqVar.g;
        fVar.a.clear();
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj3 = arrayList3.get(i5);
                i5++;
                String str3 = (String) obj3;
                a b = fVar.b(str3);
                if (b == null) {
                    s9.u(r7.c("No instantiated fragment for (", str3, ")"));
                    return;
                }
                if (G(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + b);
                }
                fVar.a(b);
            }
        }
        if (mqVar.h != null) {
            this.d = new ArrayList(mqVar.h.length);
            int i6 = 0;
            while (true) {
                b8[] b8VarArr = mqVar.h;
                if (i6 >= b8VarArr.length) {
                    break;
                }
                b8 b8Var = b8VarArr[i6];
                ArrayList arrayList4 = b8Var.g;
                a8 a8Var = new a8(this);
                int[] iArr = b8Var.f;
                int i7 = 0;
                int i8 = 0;
                while (i7 < iArr.length) {
                    uq uqVar = new uq();
                    int i9 = i7 + 1;
                    int i10 = i;
                    uqVar.a = iArr[i7];
                    if (G(i10)) {
                        Log.v("FragmentManager", "Instantiate " + a8Var + " op #" + i8 + " base fragment #" + iArr[i9]);
                    }
                    uqVar.h = gx.values()[b8Var.h[i8]];
                    uqVar.i = gx.values()[b8Var.i[i8]];
                    int i11 = i7 + 2;
                    uqVar.c = iArr[i9] != 0 ? z : false;
                    int i12 = iArr[i11];
                    uqVar.d = i12;
                    int i13 = iArr[i7 + 3];
                    uqVar.e = i13;
                    int i14 = i7 + 5;
                    int i15 = iArr[i7 + 4];
                    uqVar.f = i15;
                    i7 += 6;
                    int[] iArr2 = iArr;
                    int i16 = iArr2[i14];
                    uqVar.g = i16;
                    a8Var.b = i12;
                    a8Var.c = i13;
                    a8Var.d = i15;
                    a8Var.e = i16;
                    a8Var.b(uqVar);
                    i8++;
                    i = i10;
                    iArr = iArr2;
                    z = true;
                }
                int i17 = i;
                a8Var.f = b8Var.j;
                a8Var.h = b8Var.k;
                a8Var.g = true;
                a8Var.i = b8Var.m;
                a8Var.j = b8Var.n;
                a8Var.k = b8Var.o;
                a8Var.l = b8Var.p;
                a8Var.m = b8Var.q;
                a8Var.n = b8Var.r;
                a8Var.o = b8Var.s;
                a8Var.r = b8Var.l;
                for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                    String str4 = (String) arrayList4.get(i18);
                    if (str4 != null) {
                        ((uq) a8Var.a.get(i18)).b = fVar.b(str4);
                    }
                }
                z = true;
                a8Var.c(1);
                if (G(i17)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i6 + " (index " + a8Var.r + "): " + a8Var);
                    PrintWriter printWriter = new PrintWriter(new dz());
                    a8Var.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(a8Var);
                i6++;
                i = i17;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.d = null;
        }
        this.i.set(mqVar.i);
        String str5 = mqVar.j;
        if (str5 != null) {
            a b2 = fVar.b(str5);
            this.w = b2;
            q(b2);
        }
        ArrayList arrayList5 = mqVar.k;
        if (arrayList5 != null) {
            while (i2 < arrayList5.size()) {
                this.j.put((String) arrayList5.get(i2), (c8) mqVar.l.get(i2));
                i2++;
            }
        }
        this.C = new ArrayDeque(mqVar.m);
    }

    public final Bundle T() {
        int i;
        ArrayList arrayList;
        b8[] b8VarArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            zi ziVar = (zi) it.next();
            if (ziVar.e) {
                if (G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                ziVar.e = false;
                ziVar.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((zi) it2.next()).e();
        }
        y(true);
        this.E = true;
        this.L.setIsStateSaved(true);
        f fVar = this.c;
        fVar.getClass();
        HashMap hashMap = fVar.b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it3 = hashMap.values().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            e eVar = (e) it3.next();
            if (eVar != null) {
                a aVar = eVar.c;
                pq pqVar = new pq(aVar);
                if (aVar.f <= -1 || pqVar.r != null) {
                    pqVar.r = aVar.g;
                } else {
                    Bundle bundle2 = new Bundle();
                    aVar.x(bundle2);
                    aVar.U.M(bundle2);
                    bundle2.putParcelable("android:support:fragments", aVar.y.T());
                    eVar.a.q(false);
                    Bundle bundle3 = bundle2.isEmpty() ? null : bundle2;
                    if (aVar.J != null) {
                        eVar.o();
                    }
                    if (aVar.h != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putSparseParcelableArray("android:view_state", aVar.h);
                    }
                    if (aVar.i != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBundle("android:view_registry_state", aVar.i);
                    }
                    if (!aVar.L) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBoolean("android:user_visible_hint", aVar.L);
                    }
                    pqVar.r = bundle3;
                    if (aVar.m != null) {
                        if (bundle3 == null) {
                            pqVar.r = new Bundle();
                        }
                        pqVar.r.putString("android:target_state", aVar.m);
                        int i2 = aVar.n;
                        if (i2 != 0) {
                            pqVar.r.putInt("android:target_req_state", i2);
                        }
                    }
                }
                arrayList2.add(aVar.j);
                if (G(2)) {
                    Log.v("FragmentManager", "Saved state of " + aVar + ": " + aVar.g);
                }
            }
        }
        f fVar2 = this.c;
        fVar2.getClass();
        ArrayList arrayList3 = new ArrayList(fVar2.c.values());
        if (!arrayList3.isEmpty()) {
            f fVar3 = this.c;
            synchronized (fVar3.a) {
                try {
                    if (fVar3.a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(fVar3.a.size());
                        ArrayList arrayList4 = fVar3.a;
                        int size2 = arrayList4.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj = arrayList4.get(i3);
                            i3++;
                            a aVar2 = (a) obj;
                            arrayList.add(aVar2.j);
                            if (G(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + aVar2.j + "): " + aVar2);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList5 = this.d;
            if (arrayList5 == null || (size = arrayList5.size()) <= 0) {
                b8VarArr = null;
            } else {
                b8VarArr = new b8[size];
                for (int i4 = 0; i4 < size; i4++) {
                    b8VarArr[i4] = new b8((a8) this.d.get(i4));
                    if (G(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i4 + ": " + this.d.get(i4));
                    }
                }
            }
            mq mqVar = new mq();
            mqVar.j = null;
            ArrayList arrayList6 = new ArrayList();
            mqVar.k = arrayList6;
            ArrayList arrayList7 = new ArrayList();
            mqVar.l = arrayList7;
            mqVar.f = arrayList2;
            mqVar.g = arrayList;
            mqVar.h = b8VarArr;
            mqVar.i = this.i.get();
            a aVar3 = this.w;
            if (aVar3 != null) {
                mqVar.j = aVar3.j;
            }
            arrayList6.addAll(this.j.keySet());
            arrayList7.addAll(this.j.values());
            mqVar.m = new ArrayList(this.C);
            bundle.putParcelable("state", mqVar);
            for (String str : this.k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.k.get(str));
            }
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj2 = arrayList3.get(i);
                i++;
                pq pqVar2 = (pq) obj2;
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("state", pqVar2);
                bundle.putBundle("fragment_" + pqVar2.g, bundle4);
            }
        } else if (G(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final void U() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.t.q.removeCallbacks(this.M);
                    this.t.q.post(this.M);
                    c0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void V(a aVar, boolean z) {
        ViewGroup C = C(aVar);
        if (C == null || !(C instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) C).setDrawDisappearingViewsLast(!z);
    }

    public final void W(a aVar, gx gxVar) {
        if (aVar == this.c.b(aVar.j) && (aVar.x == null || aVar.w == this)) {
            aVar.Q = gxVar;
        } else {
            s9.o("Fragment ", aVar, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final void X(a aVar) {
        if (aVar != null) {
            if (aVar != this.c.b(aVar.j) || (aVar.x != null && aVar.w != this)) {
                s9.o("Fragment ", aVar, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        a aVar2 = this.w;
        this.w = aVar;
        q(aVar2);
        q(this.w);
    }

    public final void Y(a aVar) {
        ViewGroup C = C(aVar);
        if (C != null) {
            vp vpVar = aVar.M;
            if ((vpVar == null ? 0 : vpVar.e) + (vpVar == null ? 0 : vpVar.d) + (vpVar == null ? 0 : vpVar.c) + (vpVar == null ? 0 : vpVar.b) > 0) {
                if (C.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    C.setTag(R.id.visible_removing_fragment_view_tag, aVar);
                }
                a aVar2 = (a) C.getTag(R.id.visible_removing_fragment_view_tag);
                vp vpVar2 = aVar.M;
                boolean z = vpVar2 != null ? vpVar2.a : false;
                if (aVar2.M == null) {
                    return;
                }
                aVar2.f().a = z;
            }
        }
    }

    public final e a(a aVar) {
        String str = aVar.P;
        if (str != null) {
            tq.c(aVar, str);
        }
        if (G(2)) {
            Log.v("FragmentManager", "add: " + aVar);
        }
        e f = f(aVar);
        aVar.w = this;
        f fVar = this.c;
        fVar.g(f);
        if (!aVar.E) {
            fVar.a(aVar);
            aVar.q = false;
            if (aVar.J == null) {
                aVar.N = false;
            }
            if (H(aVar)) {
                this.D = true;
            }
        }
        return f;
    }

    public final void a0() {
        ArrayList d = this.c.d();
        int size = d.size();
        int i = 0;
        while (i < size) {
            Object obj = d.get(i);
            i++;
            e eVar = (e) obj;
            a aVar = eVar.c;
            if (aVar.K) {
                if (this.b) {
                    this.H = true;
                } else {
                    aVar.K = false;
                    eVar.k();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(xp xpVar, bi biVar, a aVar) {
        if (this.t != null) {
            s9.u("Already attached");
            return;
        }
        this.t = xpVar;
        this.u = biVar;
        this.v = aVar;
        CopyOnWriteArrayList copyOnWriteArrayList = this.m;
        if (aVar != 0) {
            copyOnWriteArrayList.add(new gq(aVar));
        } else if (xpVar != null) {
            copyOnWriteArrayList.add(xpVar);
        }
        if (this.v != null) {
            c0();
        }
        int i = 0;
        if (xpVar != null) {
            y40 h = xpVar.s.h();
            this.g = h;
            xp xpVar2 = aVar != 0 ? aVar : xpVar;
            h.getClass();
            dq dqVar = this.h;
            dqVar.getClass();
            final nx e = xpVar2.e();
            if (e.c != gx.DESTROYED) {
                t40 t40Var = new t40(dqVar, new u40(dqVar, xpVar2));
                ((ArrayList) dqVar.b).add(t40Var);
                t40Var.b(false);
                wi wiVar = h.a().c;
                wiVar.getClass();
                if (((LinkedHashSet) wiVar.h).add(t40Var)) {
                    j30 j30Var = (j30) wiVar.g;
                    j30Var.getClass();
                    if (t40Var.c != null) {
                        throw new IllegalArgumentException(("Handler '" + t40Var + "' is already registered with a dispatcher").toString());
                    }
                    j30Var.e.addFirst(t40Var);
                    t40Var.c = wiVar;
                    j30Var.b();
                }
                final ri riVar = new ri(t40Var, h, e);
                e.a(riVar);
                ((CopyOnWriteArrayList) dqVar.c).add(new AutoCloseable() { // from class: v40
                    @Override // java.lang.AutoCloseable
                    public final void close() {
                        nx.this.f(riVar);
                    }
                });
            }
        }
        if (aVar != 0) {
            this.L = aVar.w.L.getChildNonConfig(aVar);
        } else if (xpVar != null) {
            this.L = FragmentManagerViewModel.getInstance(xpVar.s.d());
        } else {
            this.L = new FragmentManagerViewModel(false);
        }
        int i2 = 1;
        this.L.setIsStateSaved(this.E || this.F);
        this.c.d = this.L;
        xp xpVar3 = this.t;
        int i3 = 2;
        if (xpVar3 != null && aVar == 0) {
            i5 a = xpVar3.a();
            a.N("android:support:fragments", new rd(i3, this));
            Bundle g = a.g("android:support:fragments");
            if (g != null) {
                S(g);
            }
        }
        xp xpVar4 = this.t;
        if (xpVar4 != null) {
            wd wdVar = xpVar4.s.n;
            String concat = "FragmentManager:".concat(aVar != 0 ? r7.d(new StringBuilder(), aVar.j, ":") : "");
            this.z = wdVar.c(concat.concat("StartActivityForResult"), new x1(i3), new cq(this, i2));
            this.A = wdVar.c(concat.concat("StartIntentSenderForResult"), new x1(3), new cq(this, i3));
            this.B = wdVar.c(concat.concat("RequestPermissions"), new x1(i), new cq(this, i));
        }
        xp xpVar5 = this.t;
        if (xpVar5 != null) {
            u3 u3Var = xpVar5.s;
            bq bqVar = this.n;
            bqVar.getClass();
            u3Var.o.add(bqVar);
        }
        xp xpVar6 = this.t;
        if (xpVar6 != null) {
            u3 u3Var2 = xpVar6.s;
            bq bqVar2 = this.o;
            bqVar2.getClass();
            u3Var2.p.add(bqVar2);
        }
        xp xpVar7 = this.t;
        if (xpVar7 != null) {
            u3 u3Var3 = xpVar7.s;
            bq bqVar3 = this.p;
            bqVar3.getClass();
            u3Var3.r.add(bqVar3);
        }
        xp xpVar8 = this.t;
        if (xpVar8 != null) {
            u3 u3Var4 = xpVar8.s;
            bq bqVar4 = this.q;
            bqVar4.getClass();
            u3Var4.s.add(bqVar4);
        }
        xp xpVar9 = this.t;
        if (xpVar9 == null || aVar != 0) {
            return;
        }
        u3 u3Var5 = xpVar9.s;
        eq eqVar = this.r;
        eqVar.getClass();
        s6 s6Var = u3Var5.h;
        ((CopyOnWriteArrayList) s6Var.d).add(eqVar);
        ((Runnable) s6Var.c).run();
    }

    public final void b0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new dz());
        xp xpVar = this.t;
        if (xpVar == null) {
            try {
                v("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            xpVar.s.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw illegalStateException;
        }
    }

    public final void c(a aVar) {
        if (G(2)) {
            Log.v("FragmentManager", "attach: " + aVar);
        }
        if (aVar.E) {
            aVar.E = false;
            if (aVar.p) {
                return;
            }
            this.c.a(aVar);
            if (G(2)) {
                Log.v("FragmentManager", "add from attach: " + aVar);
            }
            if (H(aVar)) {
                this.D = true;
            }
        }
    }

    public final void c0() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    this.h.a(true);
                    return;
                }
                dq dqVar = this.h;
                ArrayList arrayList = this.d;
                dqVar.a((arrayList != null ? arrayList.size() : 0) > 0 && K(this.v));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        this.b = false;
        this.J.clear();
        this.I.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        ArrayList d = this.c.d();
        int size = d.size();
        int i = 0;
        while (i < size) {
            Object obj = d.get(i);
            i++;
            ViewGroup viewGroup = ((e) obj).c.I;
            if (viewGroup != null) {
                hashSet.add(zi.f(viewGroup, E()));
            }
        }
        return hashSet;
    }

    public final e f(a aVar) {
        String str = aVar.j;
        f fVar = this.c;
        e eVar = (e) fVar.b.get(str);
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this.l, fVar, aVar);
        eVar2.m(this.t.p.getClassLoader());
        eVar2.e = this.s;
        return eVar2;
    }

    public final void g(a aVar) {
        if (G(2)) {
            Log.v("FragmentManager", "detach: " + aVar);
        }
        if (aVar.E) {
            return;
        }
        aVar.E = true;
        if (aVar.p) {
            if (G(2)) {
                Log.v("FragmentManager", "remove from detach: " + aVar);
            }
            f fVar = this.c;
            synchronized (fVar.a) {
                fVar.a.remove(aVar);
            }
            aVar.p = false;
            if (H(aVar)) {
                this.D = true;
            }
            Y(aVar);
        }
    }

    public final void h(boolean z) {
        if (z && this.t != null) {
            b0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (a aVar : this.c.f()) {
            if (aVar != null) {
                aVar.H = true;
                if (z) {
                    aVar.y.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.s >= 1) {
            for (a aVar : this.c.f()) {
                if (aVar != null) {
                    if (!aVar.D ? aVar.y.i() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (a aVar : this.c.f()) {
            if (aVar != null && J(aVar)) {
                if (!aVar.D ? aVar.y.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(aVar);
                    z = true;
                }
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                a aVar2 = (a) this.e.get(i);
                if (arrayList == null || !arrayList.contains(aVar2)) {
                    aVar2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final void k() {
        boolean z;
        boolean isTerminated;
        this.G = true;
        y(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((zi) it.next()).e();
        }
        xp xpVar = this.t;
        f fVar = this.c;
        if (xpVar != null) {
            z = fVar.d.isCleared();
        } else {
            z = xpVar.p != null ? !r1.isChangingConfigurations() : true;
        }
        int i = 0;
        if (z) {
            Iterator it2 = this.j.values().iterator();
            while (it2.hasNext()) {
                ArrayList arrayList = ((c8) it2.next()).f;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    fVar.d.clearNonConfigState((String) obj);
                }
            }
        }
        t(-1);
        xp xpVar2 = this.t;
        if (xpVar2 != null) {
            u3 u3Var = xpVar2.s;
            bq bqVar = this.o;
            bqVar.getClass();
            u3Var.p.remove(bqVar);
        }
        xp xpVar3 = this.t;
        if (xpVar3 != null) {
            u3 u3Var2 = xpVar3.s;
            bq bqVar2 = this.n;
            bqVar2.getClass();
            u3Var2.o.remove(bqVar2);
        }
        xp xpVar4 = this.t;
        if (xpVar4 != null) {
            u3 u3Var3 = xpVar4.s;
            bq bqVar3 = this.p;
            bqVar3.getClass();
            u3Var3.r.remove(bqVar3);
        }
        xp xpVar5 = this.t;
        if (xpVar5 != null) {
            u3 u3Var4 = xpVar5.s;
            bq bqVar4 = this.q;
            bqVar4.getClass();
            u3Var4.s.remove(bqVar4);
        }
        xp xpVar6 = this.t;
        if (xpVar6 != null) {
            u3 u3Var5 = xpVar6.s;
            eq eqVar = this.r;
            eqVar.getClass();
            s6 s6Var = u3Var5.h;
            ((CopyOnWriteArrayList) s6Var.d).remove(eqVar);
            if (((HashMap) s6Var.b).remove(eqVar) == null) {
                ((Runnable) s6Var.c).run();
            } else {
                s9.c();
            }
        }
        this.t = null;
        this.u = null;
        this.v = null;
        if (this.g != null) {
            dq dqVar = this.h;
            ArrayList arrayList2 = (ArrayList) dqVar.b;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) dqVar.c;
            Iterator it3 = copyOnWriteArrayList.iterator();
            it3.getClass();
            while (it3.hasNext()) {
                AutoCloseable autoCloseable = (AutoCloseable) it3.next();
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else if (autoCloseable instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) autoCloseable;
                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z2 = false;
                        while (!isTerminated) {
                            try {
                                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z2) {
                                    executorService.shutdownNow();
                                    z2 = true;
                                }
                            }
                        }
                        if (z2) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } else if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                } else if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                } else {
                    if (!(autoCloseable instanceof MediaDrm)) {
                        throw new IllegalArgumentException();
                    }
                    ((MediaDrm) autoCloseable).release();
                }
            }
            copyOnWriteArrayList.clear();
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                ((t40) obj2).a();
            }
            arrayList2.clear();
            this.g = null;
        }
        d2 d2Var = this.z;
        if (d2Var != null) {
            d2Var.w.e(d2Var.x);
            d2 d2Var2 = this.A;
            d2Var2.w.e(d2Var2.x);
            d2 d2Var3 = this.B;
            d2Var3.w.e(d2Var3.x);
        }
    }

    public final void l(boolean z) {
        if (z && this.t != null) {
            b0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (a aVar : this.c.f()) {
            if (aVar != null) {
                aVar.H = true;
                if (z) {
                    aVar.y.l(true);
                }
            }
        }
    }

    public final void m(boolean z) {
        if (z && this.t != null) {
            b0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (a aVar : this.c.f()) {
            if (aVar != null && z) {
                aVar.y.m(true);
            }
        }
    }

    public final void n() {
        ArrayList e = this.c.e();
        int size = e.size();
        int i = 0;
        while (i < size) {
            Object obj = e.get(i);
            i++;
            a aVar = (a) obj;
            if (aVar != null) {
                aVar.n();
                aVar.y.n();
            }
        }
    }

    public final boolean o() {
        if (this.s >= 1) {
            for (a aVar : this.c.f()) {
                if (aVar != null) {
                    if (!aVar.D ? aVar.y.o() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.s < 1) {
            return;
        }
        for (a aVar : this.c.f()) {
            if (aVar != null && !aVar.D) {
                aVar.y.p();
            }
        }
    }

    public final void q(a aVar) {
        if (aVar != null) {
            if (aVar != this.c.b(aVar.j)) {
                return;
            }
            aVar.w.getClass();
            boolean K = K(aVar);
            Boolean bool = aVar.o;
            if (bool == null || bool.booleanValue() != K) {
                aVar.o = Boolean.valueOf(K);
                kq kqVar = aVar.y;
                kqVar.c0();
                kqVar.q(kqVar.w);
            }
        }
    }

    public final void r(boolean z) {
        if (z && this.t != null) {
            b0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (a aVar : this.c.f()) {
            if (aVar != null && z) {
                aVar.y.r(true);
            }
        }
    }

    public final boolean s() {
        if (this.s < 1) {
            return false;
        }
        boolean z = false;
        for (a aVar : this.c.f()) {
            if (aVar != null && J(aVar)) {
                if (!aVar.D ? aVar.y.s() : false) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final void t(int i) {
        try {
            this.b = true;
            for (e eVar : this.c.b.values()) {
                if (eVar != null) {
                    eVar.e = i;
                }
            }
            L(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((zi) it.next()).e();
            }
            this.b = false;
            y(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        a aVar = this.v;
        if (aVar != null) {
            sb.append(aVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.v)));
            sb.append("}");
        } else {
            xp xpVar = this.t;
            if (xpVar != null) {
                sb.append(xpVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.t)));
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
            a0();
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String str3 = str + "    ";
        f fVar = this.c;
        ArrayList arrayList = fVar.a;
        String str4 = str + "    ";
        HashMap hashMap = fVar.b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (e eVar : hashMap.values()) {
                printWriter.print(str);
                if (eVar != null) {
                    a aVar = eVar.c;
                    printWriter.println(aVar);
                    aVar.getClass();
                    printWriter.print(str4);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(aVar.A));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(aVar.B));
                    printWriter.print(" mTag=");
                    printWriter.println(aVar.C);
                    printWriter.print(str4);
                    printWriter.print("mState=");
                    printWriter.print(aVar.f);
                    printWriter.print(" mWho=");
                    printWriter.print(aVar.j);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(aVar.v);
                    printWriter.print(str4);
                    printWriter.print("mAdded=");
                    printWriter.print(aVar.p);
                    printWriter.print(" mRemoving=");
                    printWriter.print(aVar.q);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(aVar.r);
                    printWriter.print(" mInLayout=");
                    printWriter.println(aVar.s);
                    printWriter.print(str4);
                    printWriter.print("mHidden=");
                    printWriter.print(aVar.D);
                    printWriter.print(" mDetached=");
                    printWriter.print(aVar.E);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(aVar.G);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str4);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(aVar.F);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(aVar.L);
                    if (aVar.w != null) {
                        printWriter.print(str4);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(aVar.w);
                    }
                    if (aVar.x != null) {
                        printWriter.print(str4);
                        printWriter.print("mHost=");
                        printWriter.println(aVar.x);
                    }
                    if (aVar.z != null) {
                        printWriter.print(str4);
                        printWriter.print("mParentFragment=");
                        printWriter.println(aVar.z);
                    }
                    if (aVar.k != null) {
                        printWriter.print(str4);
                        printWriter.print("mArguments=");
                        printWriter.println(aVar.k);
                    }
                    if (aVar.g != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(aVar.g);
                    }
                    if (aVar.h != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(aVar.h);
                    }
                    if (aVar.i != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(aVar.i);
                    }
                    Object obj = aVar.l;
                    if (obj == null) {
                        c cVar = aVar.w;
                        obj = (cVar == null || (str2 = aVar.m) == null) ? null : cVar.c.b(str2);
                    }
                    if (obj != null) {
                        printWriter.print(str4);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(aVar.n);
                    }
                    printWriter.print(str4);
                    printWriter.print("mPopDirection=");
                    vp vpVar = aVar.M;
                    printWriter.println(vpVar == null ? false : vpVar.a);
                    vp vpVar2 = aVar.M;
                    if ((vpVar2 == null ? 0 : vpVar2.b) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getEnterAnim=");
                        vp vpVar3 = aVar.M;
                        printWriter.println(vpVar3 == null ? 0 : vpVar3.b);
                    }
                    vp vpVar4 = aVar.M;
                    if ((vpVar4 == null ? 0 : vpVar4.c) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getExitAnim=");
                        vp vpVar5 = aVar.M;
                        printWriter.println(vpVar5 == null ? 0 : vpVar5.c);
                    }
                    vp vpVar6 = aVar.M;
                    if ((vpVar6 == null ? 0 : vpVar6.d) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getPopEnterAnim=");
                        vp vpVar7 = aVar.M;
                        printWriter.println(vpVar7 == null ? 0 : vpVar7.d);
                    }
                    vp vpVar8 = aVar.M;
                    if ((vpVar8 == null ? 0 : vpVar8.e) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getPopExitAnim=");
                        vp vpVar9 = aVar.M;
                        printWriter.println(vpVar9 == null ? 0 : vpVar9.e);
                    }
                    if (aVar.I != null) {
                        printWriter.print(str4);
                        printWriter.print("mContainer=");
                        printWriter.println(aVar.I);
                    }
                    if (aVar.J != null) {
                        printWriter.print(str4);
                        printWriter.print("mView=");
                        printWriter.println(aVar.J);
                    }
                    if (aVar.h() != null) {
                        new androidx.loader.app.b(aVar, aVar.d()).a(str4, fileDescriptor, printWriter, strArr);
                    }
                    printWriter.print(str4);
                    printWriter.println("Child " + aVar.y + ":");
                    aVar.y.v(str4.concat("  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                a aVar2 = (a) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(aVar2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                a aVar3 = (a) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(aVar3.toString());
            }
        }
        ArrayList arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                a8 a8Var = (a8) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(a8Var.toString());
                a8Var.f(str3, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj2 = (iq) this.a.get(i4);
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
        printWriter.println(this.t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.u);
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    public final void w(iq iqVar, boolean z) {
        if (!z) {
            if (this.t == null) {
                if (this.G) {
                    s9.u("FragmentManager has been destroyed");
                    return;
                } else {
                    s9.u("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (this.E || this.F) {
                s9.u("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.a) {
            try {
                if (this.t == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(iqVar);
                    U();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(boolean z) {
        if (this.b) {
            s9.u("FragmentManager is already executing transactions");
            return;
        }
        if (this.t == null) {
            if (this.G) {
                s9.u("FragmentManager has been destroyed");
                return;
            } else {
                s9.u("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.t.q.getLooper()) {
            s9.u("Must be called from main thread of fragment host");
            return;
        }
        if (!z && (this.E || this.F)) {
            s9.u("Can not perform this action after onSaveInstanceState");
        } else if (this.I == null) {
            this.I = new ArrayList();
            this.J = new ArrayList();
        }
    }

    public final boolean y(boolean z) {
        boolean z2;
        ArrayList arrayList;
        x(z);
        boolean z3 = false;
        while (true) {
            ArrayList arrayList2 = this.I;
            ArrayList arrayList3 = this.J;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    z2 = false;
                } else {
                    try {
                        int size = this.a.size();
                        int i = 0;
                        z2 = false;
                        while (true) {
                            arrayList = this.a;
                            if (i >= size) {
                                break;
                            }
                            z2 |= ((iq) arrayList.get(i)).a(arrayList2, arrayList3);
                            i++;
                        }
                        arrayList.clear();
                        this.t.q.removeCallbacks(this.M);
                    } finally {
                    }
                }
            }
            if (!z2) {
                c0();
                u();
                this.c.b.values().removeAll(Collections.singleton(null));
                return z3;
            }
            z3 = true;
            this.b = true;
            try {
                R(this.I, this.J);
            } finally {
                d();
            }
        }
    }

    public final void z(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        boolean z4;
        boolean z5;
        int i6;
        f fVar = this.c;
        boolean z6 = ((a8) arrayList.get(i)).o;
        ArrayList arrayList3 = this.K;
        if (arrayList3 == null) {
            this.K = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.K.addAll(fVar.f());
        a aVar = this.w;
        int i7 = i;
        boolean z7 = false;
        while (true) {
            int i8 = 1;
            if (i7 >= i2) {
                boolean z8 = z6;
                this.K.clear();
                if (!z8 && this.s >= 1) {
                    for (int i9 = i; i9 < i2; i9++) {
                        ArrayList arrayList4 = ((a8) arrayList.get(i9)).a;
                        int size = arrayList4.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList4.get(i10);
                            i10++;
                            a aVar2 = ((uq) obj).b;
                            if (aVar2 != null && aVar2.w != null) {
                                fVar.g(f(aVar2));
                            }
                        }
                    }
                }
                for (int i11 = i; i11 < i2; i11++) {
                    a8 a8Var = (a8) arrayList.get(i11);
                    if (((Boolean) arrayList2.get(i11)).booleanValue()) {
                        a8Var.c(-1);
                        c cVar = a8Var.p;
                        ArrayList arrayList5 = a8Var.a;
                        boolean z9 = true;
                        for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
                            uq uqVar = (uq) arrayList5.get(size2);
                            a aVar3 = uqVar.b;
                            if (aVar3 != null) {
                                if (aVar3.M != null) {
                                    aVar3.f().a = z9;
                                }
                                int i12 = a8Var.f;
                                int i13 = 8194;
                                int i14 = 4097;
                                if (i12 != 4097) {
                                    if (i12 != 8194) {
                                        i13 = 4100;
                                        i14 = 8197;
                                        if (i12 != 8197) {
                                            if (i12 == 4099) {
                                                i13 = 4099;
                                            } else if (i12 != 4100) {
                                                i13 = 0;
                                            }
                                        }
                                    }
                                    i13 = i14;
                                }
                                if (aVar3.M != null || i13 != 0) {
                                    aVar3.f();
                                    aVar3.M.f = i13;
                                }
                                aVar3.f();
                                aVar3.M.getClass();
                            }
                            switch (uqVar.a) {
                                case 1:
                                    aVar3.G(uqVar.d, uqVar.e, uqVar.f, uqVar.g);
                                    z9 = true;
                                    cVar.V(aVar3, true);
                                    cVar.Q(aVar3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + uqVar.a);
                                case 3:
                                    aVar3.G(uqVar.d, uqVar.e, uqVar.f, uqVar.g);
                                    cVar.a(aVar3);
                                    z9 = true;
                                case 4:
                                    aVar3.G(uqVar.d, uqVar.e, uqVar.f, uqVar.g);
                                    cVar.getClass();
                                    Z(aVar3);
                                    z9 = true;
                                case 5:
                                    aVar3.G(uqVar.d, uqVar.e, uqVar.f, uqVar.g);
                                    cVar.V(aVar3, true);
                                    cVar.F(aVar3);
                                    z9 = true;
                                case 6:
                                    aVar3.G(uqVar.d, uqVar.e, uqVar.f, uqVar.g);
                                    cVar.c(aVar3);
                                    z9 = true;
                                case 7:
                                    aVar3.G(uqVar.d, uqVar.e, uqVar.f, uqVar.g);
                                    cVar.V(aVar3, true);
                                    cVar.g(aVar3);
                                    z9 = true;
                                case 8:
                                    cVar.X(null);
                                    z9 = true;
                                case 9:
                                    cVar.X(aVar3);
                                    z9 = true;
                                case 10:
                                    cVar.W(aVar3, uqVar.h);
                                    z9 = true;
                            }
                        }
                    } else {
                        a8Var.c(1);
                        c cVar2 = a8Var.p;
                        ArrayList arrayList6 = a8Var.a;
                        int size3 = arrayList6.size();
                        for (int i15 = 0; i15 < size3; i15++) {
                            uq uqVar2 = (uq) arrayList6.get(i15);
                            a aVar4 = uqVar2.b;
                            if (aVar4 != null) {
                                if (aVar4.M != null) {
                                    aVar4.f().a = false;
                                }
                                int i16 = a8Var.f;
                                if (aVar4.M != null || i16 != 0) {
                                    aVar4.f();
                                    aVar4.M.f = i16;
                                }
                                aVar4.f();
                                aVar4.M.getClass();
                            }
                            switch (uqVar2.a) {
                                case 1:
                                    aVar4.G(uqVar2.d, uqVar2.e, uqVar2.f, uqVar2.g);
                                    cVar2.V(aVar4, false);
                                    cVar2.a(aVar4);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + uqVar2.a);
                                case 3:
                                    aVar4.G(uqVar2.d, uqVar2.e, uqVar2.f, uqVar2.g);
                                    cVar2.Q(aVar4);
                                    break;
                                case 4:
                                    aVar4.G(uqVar2.d, uqVar2.e, uqVar2.f, uqVar2.g);
                                    cVar2.F(aVar4);
                                    break;
                                case 5:
                                    aVar4.G(uqVar2.d, uqVar2.e, uqVar2.f, uqVar2.g);
                                    cVar2.V(aVar4, false);
                                    Z(aVar4);
                                    break;
                                case 6:
                                    aVar4.G(uqVar2.d, uqVar2.e, uqVar2.f, uqVar2.g);
                                    cVar2.g(aVar4);
                                    break;
                                case 7:
                                    aVar4.G(uqVar2.d, uqVar2.e, uqVar2.f, uqVar2.g);
                                    cVar2.V(aVar4, false);
                                    cVar2.c(aVar4);
                                    break;
                                case 8:
                                    cVar2.X(aVar4);
                                    break;
                                case 9:
                                    cVar2.X(null);
                                    break;
                                case 10:
                                    cVar2.W(aVar4, uqVar2.i);
                                    break;
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i17 = i; i17 < i2; i17++) {
                    a8 a8Var2 = (a8) arrayList.get(i17);
                    if (booleanValue) {
                        for (int size4 = a8Var2.a.size() - 1; size4 >= 0; size4--) {
                            a aVar5 = ((uq) a8Var2.a.get(size4)).b;
                            if (aVar5 != null) {
                                f(aVar5).k();
                            }
                        }
                    } else {
                        ArrayList arrayList7 = a8Var2.a;
                        int size5 = arrayList7.size();
                        int i18 = 0;
                        while (i18 < size5) {
                            Object obj2 = arrayList7.get(i18);
                            i18++;
                            a aVar6 = ((uq) obj2).b;
                            if (aVar6 != null) {
                                f(aVar6).k();
                            }
                        }
                    }
                }
                L(this.s, true);
                HashSet hashSet = new HashSet();
                for (int i19 = i; i19 < i2; i19++) {
                    ArrayList arrayList8 = ((a8) arrayList.get(i19)).a;
                    int size6 = arrayList8.size();
                    int i20 = 0;
                    while (i20 < size6) {
                        Object obj3 = arrayList8.get(i20);
                        i20++;
                        a aVar7 = ((uq) obj3).b;
                        if (aVar7 != null && (viewGroup = aVar7.I) != null) {
                            hashSet.add(zi.f(viewGroup, E()));
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    zi ziVar = (zi) it.next();
                    ziVar.d = booleanValue;
                    synchronized (ziVar.b) {
                        try {
                            ziVar.g();
                            ziVar.e = false;
                            int size7 = ziVar.b.size() - 1;
                            while (true) {
                                if (size7 >= 0) {
                                    qe0 qe0Var = (qe0) ziVar.b.get(size7);
                                    se0 from = se0.from(qe0Var.c.J);
                                    se0 se0Var = qe0Var.a;
                                    se0 se0Var2 = se0.VISIBLE;
                                    if (se0Var != se0Var2 || from == se0Var2) {
                                        size7--;
                                    } else {
                                        vp vpVar = qe0Var.c.M;
                                        ziVar.e = false;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    ziVar.c();
                }
                for (int i21 = i; i21 < i2; i21++) {
                    a8 a8Var3 = (a8) arrayList.get(i21);
                    if (((Boolean) arrayList2.get(i21)).booleanValue() && a8Var3.r >= 0) {
                        a8Var3.r = -1;
                    }
                    a8Var3.getClass();
                }
                return;
            }
            a8 a8Var4 = (a8) arrayList.get(i7);
            boolean booleanValue2 = ((Boolean) arrayList2.get(i7)).booleanValue();
            ArrayList arrayList9 = this.K;
            if (booleanValue2) {
                z = z6;
                i3 = i7;
                z2 = z7;
                int i22 = 1;
                ArrayList arrayList10 = a8Var4.a;
                int size8 = arrayList10.size() - 1;
                while (size8 >= 0) {
                    uq uqVar3 = (uq) arrayList10.get(size8);
                    int i23 = uqVar3.a;
                    if (i23 != i22) {
                        if (i23 != 3) {
                            switch (i23) {
                                case 8:
                                    aVar = null;
                                    break;
                                case 9:
                                    aVar = uqVar3.b;
                                    break;
                                case 10:
                                    uqVar3.i = uqVar3.h;
                                    break;
                            }
                            size8--;
                            i22 = 1;
                        }
                        arrayList9.add(uqVar3.b);
                        size8--;
                        i22 = 1;
                    }
                    arrayList9.remove(uqVar3.b);
                    size8--;
                    i22 = 1;
                }
            } else {
                ArrayList arrayList11 = a8Var4.a;
                int i24 = 0;
                while (i24 < arrayList11.size()) {
                    uq uqVar4 = (uq) arrayList11.get(i24);
                    int i25 = uqVar4.a;
                    if (i25 != i8) {
                        z3 = z6;
                        if (i25 != 2) {
                            if (i25 == 3 || i25 == 6) {
                                arrayList9.remove(uqVar4.b);
                                a aVar8 = uqVar4.b;
                                if (aVar8 == aVar) {
                                    arrayList11.add(i24, new uq(9, aVar8));
                                    i24++;
                                    i5 = i7;
                                    z4 = z7;
                                    i4 = 1;
                                    aVar = null;
                                }
                            } else if (i25 == 7) {
                                i4 = 1;
                            } else if (i25 == 8) {
                                arrayList11.add(i24, new uq(9, aVar, 0));
                                uqVar4.c = true;
                                i24++;
                                aVar = uqVar4.b;
                            }
                            i5 = i7;
                            z4 = z7;
                            i4 = 1;
                        } else {
                            a aVar9 = uqVar4.b;
                            int i26 = aVar9.B;
                            int size9 = arrayList9.size() - 1;
                            boolean z10 = false;
                            while (size9 >= 0) {
                                int i27 = size9;
                                a aVar10 = (a) arrayList9.get(size9);
                                int i28 = i7;
                                if (aVar10.B != i26) {
                                    z5 = z7;
                                } else if (aVar10 == aVar9) {
                                    z5 = z7;
                                    z10 = true;
                                } else {
                                    if (aVar10 == aVar) {
                                        z5 = z7;
                                        i6 = 0;
                                        arrayList11.add(i24, new uq(9, aVar10, 0));
                                        i24++;
                                        aVar = null;
                                    } else {
                                        z5 = z7;
                                        i6 = 0;
                                    }
                                    uq uqVar5 = new uq(3, aVar10, i6);
                                    uqVar5.d = uqVar4.d;
                                    uqVar5.f = uqVar4.f;
                                    uqVar5.e = uqVar4.e;
                                    uqVar5.g = uqVar4.g;
                                    arrayList11.add(i24, uqVar5);
                                    arrayList9.remove(aVar10);
                                    i24++;
                                    aVar = aVar;
                                }
                                size9 = i27 - 1;
                                z7 = z5;
                                i7 = i28;
                            }
                            i5 = i7;
                            z4 = z7;
                            i4 = 1;
                            if (z10) {
                                arrayList11.remove(i24);
                                i24--;
                            } else {
                                uqVar4.a = 1;
                                uqVar4.c = true;
                                arrayList9.add(aVar9);
                            }
                        }
                        i24 += i4;
                        i8 = i4;
                        z6 = z3;
                        z7 = z4;
                        i7 = i5;
                    } else {
                        z3 = z6;
                        i4 = i8;
                    }
                    i5 = i7;
                    z4 = z7;
                    arrayList9.add(uqVar4.b);
                    i24 += i4;
                    i8 = i4;
                    z6 = z3;
                    z7 = z4;
                    i7 = i5;
                }
                z = z6;
                i3 = i7;
                z2 = z7;
            }
            z7 = z2 || a8Var4.g;
            i7 = i3 + 1;
            z6 = z;
        }
    }
}
