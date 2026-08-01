package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import com.moontiko.really.admiralcasino.R;
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

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class en {
    public a5 A;
    public a5 B;
    public ArrayDeque C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ArrayList K;
    public hn L;
    public final j7 M;
    public boolean b;
    public ArrayList d;
    public ArrayList e;
    public hz g;
    public final a5 l;
    public final CopyOnWriteArrayList m;
    public final vm n;
    public final vm o;
    public final vm p;
    public final vm q;
    public final ym r;
    public int s;
    public rm t;
    public la0 u;
    public pm v;
    public pm w;
    public final zm x;
    public final ej y;
    public a5 z;
    public final ArrayList a = new ArrayList();
    public final rg c = new rg(3);
    public final um f = new um(this);
    public final xm h = new xm(this);
    public final AtomicInteger i = new AtomicInteger();
    public final Map j = Collections.synchronizedMap(new HashMap());
    public final Map k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [vm] */
    /* JADX WARN: Type inference failed for: r0v13, types: [vm] */
    /* JADX WARN: Type inference failed for: r0v14, types: [vm] */
    /* JADX WARN: Type inference failed for: r0v15, types: [vm] */
    public en() {
        Collections.synchronizedMap(new HashMap());
        this.l = new a5(this);
        this.m = new CopyOnWriteArrayList();
        final int i = 0;
        this.n = new de(this) { // from class: vm
            public final /* synthetic */ en b;

            {
                this.b = this;
            }

            @Override // defpackage.de
            public final void accept(Object obj) {
                int i2 = i;
                en enVar = this.b;
                switch (i2) {
                    case 0:
                        if (enVar.I()) {
                            enVar.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (enVar.I() && num.intValue() == 80) {
                            enVar.l(false);
                            break;
                        }
                        break;
                    case 2:
                        px pxVar = (px) obj;
                        if (enVar.I()) {
                            boolean z = pxVar.a;
                            enVar.m(false);
                            break;
                        }
                        break;
                    default:
                        xz xzVar = (xz) obj;
                        if (enVar.I()) {
                            boolean z2 = xzVar.a;
                            enVar.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.o = new de(this) { // from class: vm
            public final /* synthetic */ en b;

            {
                this.b = this;
            }

            @Override // defpackage.de
            public final void accept(Object obj) {
                int i22 = i2;
                en enVar = this.b;
                switch (i22) {
                    case 0:
                        if (enVar.I()) {
                            enVar.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (enVar.I() && num.intValue() == 80) {
                            enVar.l(false);
                            break;
                        }
                        break;
                    case 2:
                        px pxVar = (px) obj;
                        if (enVar.I()) {
                            boolean z = pxVar.a;
                            enVar.m(false);
                            break;
                        }
                        break;
                    default:
                        xz xzVar = (xz) obj;
                        if (enVar.I()) {
                            boolean z2 = xzVar.a;
                            enVar.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.p = new de(this) { // from class: vm
            public final /* synthetic */ en b;

            {
                this.b = this;
            }

            @Override // defpackage.de
            public final void accept(Object obj) {
                int i22 = i3;
                en enVar = this.b;
                switch (i22) {
                    case 0:
                        if (enVar.I()) {
                            enVar.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (enVar.I() && num.intValue() == 80) {
                            enVar.l(false);
                            break;
                        }
                        break;
                    case 2:
                        px pxVar = (px) obj;
                        if (enVar.I()) {
                            boolean z = pxVar.a;
                            enVar.m(false);
                            break;
                        }
                        break;
                    default:
                        xz xzVar = (xz) obj;
                        if (enVar.I()) {
                            boolean z2 = xzVar.a;
                            enVar.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.q = new de(this) { // from class: vm
            public final /* synthetic */ en b;

            {
                this.b = this;
            }

            @Override // defpackage.de
            public final void accept(Object obj) {
                int i22 = i4;
                en enVar = this.b;
                switch (i22) {
                    case 0:
                        if (enVar.I()) {
                            enVar.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (enVar.I() && num.intValue() == 80) {
                            enVar.l(false);
                            break;
                        }
                        break;
                    case 2:
                        px pxVar = (px) obj;
                        if (enVar.I()) {
                            boolean z = pxVar.a;
                            enVar.m(false);
                            break;
                        }
                        break;
                    default:
                        xz xzVar = (xz) obj;
                        if (enVar.I()) {
                            boolean z2 = xzVar.a;
                            enVar.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        this.r = new ym(this);
        this.s = -1;
        this.x = new zm(this);
        this.y = new ej(25);
        this.C = new ArrayDeque();
        this.M = new j7(6, this);
    }

    public static boolean G(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean H(pm pmVar) {
        pmVar.getClass();
        ArrayList m = pmVar.y.c.m();
        int size = m.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            Object obj = m.get(i);
            i++;
            pm pmVar2 = (pm) obj;
            if (pmVar2 != null) {
                z = H(pmVar2);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(pm pmVar) {
        if (pmVar == null) {
            return true;
        }
        if (pmVar.G) {
            return pmVar.w == null || J(pmVar.z);
        }
        return false;
    }

    public static boolean K(pm pmVar) {
        if (pmVar == null) {
            return true;
        }
        en enVar = pmVar.w;
        return pmVar == enVar.w && K(enVar.v);
    }

    public static void Z(pm pmVar) {
        if (G(2)) {
            Log.v("FragmentManager", "show: " + pmVar);
        }
        if (pmVar.D) {
            pmVar.D = false;
            pmVar.N = !pmVar.N;
        }
    }

    public final pm A(int i) {
        rg rgVar = this.c;
        ArrayList arrayList = (ArrayList) rgVar.f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            pm pmVar = (pm) arrayList.get(size);
            if (pmVar != null && pmVar.A == i) {
                return pmVar;
            }
        }
        for (ln lnVar : ((HashMap) rgVar.g).values()) {
            if (lnVar != null) {
                pm pmVar2 = lnVar.c;
                if (pmVar2.A == i) {
                    return pmVar2;
                }
            }
        }
        return null;
    }

    public final pm B(String str) {
        rg rgVar = this.c;
        ArrayList arrayList = (ArrayList) rgVar.f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            pm pmVar = (pm) arrayList.get(size);
            if (pmVar != null && str.equals(pmVar.C)) {
                return pmVar;
            }
        }
        for (ln lnVar : ((HashMap) rgVar.g).values()) {
            if (lnVar != null) {
                pm pmVar2 = lnVar.c;
                if (str.equals(pmVar2.C)) {
                    return pmVar2;
                }
            }
        }
        return null;
    }

    public final ViewGroup C(pm pmVar) {
        ViewGroup viewGroup = pmVar.I;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (pmVar.B <= 0 || !this.u.Q()) {
            return null;
        }
        View P = this.u.P(pmVar.B);
        if (P instanceof ViewGroup) {
            return (ViewGroup) P;
        }
        return null;
    }

    public final zm D() {
        pm pmVar = this.v;
        return pmVar != null ? pmVar.w.D() : this.x;
    }

    public final ej E() {
        pm pmVar = this.v;
        return pmVar != null ? pmVar.w.E() : this.y;
    }

    public final void F(pm pmVar) {
        if (G(2)) {
            Log.v("FragmentManager", "hide: " + pmVar);
        }
        if (pmVar.D) {
            return;
        }
        pmVar.D = true;
        pmVar.N = true ^ pmVar.N;
        Y(pmVar);
    }

    public final boolean I() {
        pm pmVar = this.v;
        if (pmVar == null) {
            return true;
        }
        return pmVar.x != null && pmVar.p && pmVar.j().I();
    }

    public final void L(int i, boolean z) {
        rm rmVar;
        if (this.t == null && i != -1) {
            g9.s("No activity");
            return;
        }
        if (z || i != this.s) {
            this.s = i;
            rg rgVar = this.c;
            HashMap hashMap = (HashMap) rgVar.g;
            ArrayList arrayList = (ArrayList) rgVar.f;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ln lnVar = (ln) hashMap.get(((pm) obj).j);
                if (lnVar != null) {
                    lnVar.k();
                }
            }
            for (ln lnVar2 : hashMap.values()) {
                if (lnVar2 != null) {
                    lnVar2.k();
                    pm pmVar = lnVar2.c;
                    if (pmVar.q && !pmVar.o()) {
                        rgVar.s(lnVar2);
                    }
                }
            }
            a0();
            if (this.D && (rmVar = this.t) != null && this.s == 7) {
                rmVar.v.invalidateOptionsMenu();
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
        this.L.g = false;
        for (pm pmVar : this.c.n()) {
            if (pmVar != null) {
                pmVar.y.M();
            }
        }
    }

    public final boolean N() {
        return O(-1, 0);
    }

    public final boolean O(int i, int i2) {
        y(false);
        x(true);
        pm pmVar = this.w;
        if (pmVar != null && i < 0 && pmVar.g().N()) {
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
        ((HashMap) this.c.g).values().removeAll(Collections.singleton(null));
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
                    o7 o7Var = (o7) this.d.get(size);
                    if (i >= 0 && i == o7Var.r) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    i3 = size;
                } else if (z) {
                    i3 = size;
                    while (i3 > 0) {
                        o7 o7Var2 = (o7) this.d.get(i3 - 1);
                        if (i < 0 || i != o7Var2.r) {
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
            arrayList.add((o7) this.d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void Q(pm pmVar) {
        if (G(2)) {
            Log.v("FragmentManager", "remove: " + pmVar + " nesting=" + pmVar.v);
        }
        boolean o = pmVar.o();
        if (pmVar.E && o) {
            return;
        }
        rg rgVar = this.c;
        synchronized (((ArrayList) rgVar.f)) {
            ((ArrayList) rgVar.f).remove(pmVar);
        }
        pmVar.p = false;
        if (H(pmVar)) {
            this.D = true;
        }
        pmVar.q = true;
        Y(pmVar);
    }

    public final void R(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            g9.s("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((o7) arrayList.get(i)).o) {
                if (i2 != i) {
                    z(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((o7) arrayList.get(i2)).o) {
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
        a5 a5Var;
        int i;
        boolean z;
        int i2;
        ln lnVar;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.t.s.getClassLoader());
                this.k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.t.s.getClassLoader());
                arrayList.add((kn) bundle.getParcelable("state"));
            }
        }
        rg rgVar = this.c;
        HashMap hashMap = (HashMap) rgVar.h;
        HashMap hashMap2 = (HashMap) rgVar.g;
        hashMap.clear();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            kn knVar = (kn) obj;
            hashMap.put(knVar.g, knVar);
        }
        fn fnVar = (fn) bundle3.getParcelable("state");
        if (fnVar == null) {
            return;
        }
        hashMap2.clear();
        ArrayList arrayList2 = fnVar.f;
        int size2 = arrayList2.size();
        int i4 = 0;
        while (true) {
            a5Var = this.l;
            i = 2;
            if (i4 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i4);
            i4++;
            kn knVar2 = (kn) ((HashMap) rgVar.h).remove((String) obj2);
            if (knVar2 != null) {
                pm pmVar = (pm) this.L.b.get(knVar2.g);
                if (pmVar != null) {
                    if (G(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + pmVar);
                    }
                    lnVar = new ln(a5Var, rgVar, pmVar, knVar2);
                } else {
                    lnVar = new ln(this.l, this.c, this.t.s.getClassLoader(), D(), knVar2);
                }
                pm pmVar2 = lnVar.c;
                pmVar2.w = this;
                if (G(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + pmVar2.j + "): " + pmVar2);
                }
                lnVar.m(this.t.s.getClassLoader());
                rgVar.r(lnVar);
                lnVar.e = this.s;
            }
        }
        hn hnVar = this.L;
        hnVar.getClass();
        ArrayList arrayList3 = new ArrayList(hnVar.b.values());
        int size3 = arrayList3.size();
        int i5 = 0;
        while (true) {
            z = true;
            if (i5 >= size3) {
                break;
            }
            Object obj3 = arrayList3.get(i5);
            i5++;
            pm pmVar3 = (pm) obj3;
            if (hashMap2.get(pmVar3.j) == null) {
                if (G(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + pmVar3 + " that was not found in the set of active Fragments " + fnVar.f);
                }
                this.L.f(pmVar3);
                pmVar3.w = this;
                ln lnVar2 = new ln(a5Var, rgVar, pmVar3);
                lnVar2.e = 1;
                lnVar2.k();
                pmVar3.q = true;
                lnVar2.k();
            }
        }
        ArrayList arrayList4 = fnVar.g;
        ((ArrayList) rgVar.f).clear();
        if (arrayList4 != null) {
            int size4 = arrayList4.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList4.get(i6);
                i6++;
                String str3 = (String) obj4;
                pm h = rgVar.h(str3);
                if (h == null) {
                    g9.s(f60.f("No instantiated fragment for (", str3, ")"));
                    return;
                }
                if (G(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + h);
                }
                rgVar.a(h);
            }
        }
        if (fnVar.h != null) {
            this.d = new ArrayList(fnVar.h.length);
            int i7 = 0;
            while (true) {
                p7[] p7VarArr = fnVar.h;
                if (i7 >= p7VarArr.length) {
                    break;
                }
                p7 p7Var = p7VarArr[i7];
                ArrayList arrayList5 = p7Var.g;
                o7 o7Var = new o7(this);
                int[] iArr = p7Var.f;
                int i8 = 0;
                int i9 = 0;
                while (i8 < iArr.length) {
                    on onVar = new on();
                    int i10 = i8 + 1;
                    int i11 = i;
                    onVar.a = iArr[i8];
                    if (G(i11)) {
                        Log.v("FragmentManager", "Instantiate " + o7Var + " op #" + i9 + " base fragment #" + iArr[i10]);
                    }
                    onVar.h = hs.values()[p7Var.h[i9]];
                    onVar.i = hs.values()[p7Var.i[i9]];
                    int i12 = i8 + 2;
                    onVar.c = iArr[i10] != 0 ? z : false;
                    int i13 = iArr[i12];
                    onVar.d = i13;
                    int i14 = iArr[i8 + 3];
                    onVar.e = i14;
                    int i15 = i8 + 5;
                    int i16 = iArr[i8 + 4];
                    onVar.f = i16;
                    i8 += 6;
                    int[] iArr2 = iArr;
                    int i17 = iArr2[i15];
                    onVar.g = i17;
                    o7Var.b = i13;
                    o7Var.c = i14;
                    o7Var.d = i16;
                    o7Var.e = i17;
                    o7Var.b(onVar);
                    i9++;
                    i = i11;
                    iArr = iArr2;
                    z = true;
                }
                int i18 = i;
                o7Var.f = p7Var.j;
                o7Var.h = p7Var.k;
                o7Var.g = true;
                o7Var.i = p7Var.m;
                o7Var.j = p7Var.n;
                o7Var.k = p7Var.o;
                o7Var.l = p7Var.p;
                o7Var.m = p7Var.q;
                o7Var.n = p7Var.r;
                o7Var.o = p7Var.s;
                o7Var.r = p7Var.l;
                for (int i19 = 0; i19 < arrayList5.size(); i19++) {
                    String str4 = (String) arrayList5.get(i19);
                    if (str4 != null) {
                        ((on) o7Var.a.get(i19)).b = rgVar.h(str4);
                    }
                }
                o7Var.c(1);
                if (G(i18)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i7 + " (index " + o7Var.r + "): " + o7Var);
                    PrintWriter printWriter = new PrintWriter(new du());
                    o7Var.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(o7Var);
                i7++;
                i = i18;
                z = true;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.d = null;
        }
        this.i.set(fnVar.i);
        String str5 = fnVar.j;
        if (str5 != null) {
            pm h2 = rgVar.h(str5);
            this.w = h2;
            q(h2);
        }
        ArrayList arrayList6 = fnVar.k;
        if (arrayList6 != null) {
            while (i2 < arrayList6.size()) {
                this.j.put((String) arrayList6.get(i2), (q7) fnVar.l.get(i2));
                i2++;
            }
        }
        this.C = new ArrayDeque(fnVar.m);
    }

    public final Bundle T() {
        int i;
        ArrayList arrayList;
        p7[] p7VarArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            ug ugVar = (ug) it.next();
            if (ugVar.e) {
                if (G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                ugVar.e = false;
                ugVar.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((ug) it2.next()).e();
        }
        y(true);
        this.E = true;
        this.L.g = true;
        rg rgVar = this.c;
        rgVar.getClass();
        HashMap hashMap = (HashMap) rgVar.g;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it3 = hashMap.values().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            ln lnVar = (ln) it3.next();
            if (lnVar != null) {
                pm pmVar = lnVar.c;
                kn knVar = new kn(pmVar);
                if (pmVar.f <= -1 || knVar.r != null) {
                    knVar.r = pmVar.g;
                } else {
                    Bundle bundle2 = new Bundle();
                    pmVar.x(bundle2);
                    pmVar.U.c(bundle2);
                    bundle2.putParcelable("android:support:fragments", pmVar.y.T());
                    lnVar.a.t(false);
                    Bundle bundle3 = bundle2.isEmpty() ? null : bundle2;
                    if (pmVar.J != null) {
                        lnVar.o();
                    }
                    if (pmVar.h != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putSparseParcelableArray("android:view_state", pmVar.h);
                    }
                    if (pmVar.i != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBundle("android:view_registry_state", pmVar.i);
                    }
                    if (!pmVar.L) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBoolean("android:user_visible_hint", pmVar.L);
                    }
                    knVar.r = bundle3;
                    if (pmVar.m != null) {
                        if (bundle3 == null) {
                            knVar.r = new Bundle();
                        }
                        knVar.r.putString("android:target_state", pmVar.m);
                        int i2 = pmVar.n;
                        if (i2 != 0) {
                            knVar.r.putInt("android:target_req_state", i2);
                        }
                    }
                }
                arrayList2.add(pmVar.j);
                if (G(2)) {
                    Log.v("FragmentManager", "Saved state of " + pmVar + ": " + pmVar.g);
                }
            }
        }
        rg rgVar2 = this.c;
        rgVar2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) rgVar2.h).values());
        if (!arrayList3.isEmpty()) {
            rg rgVar3 = this.c;
            synchronized (((ArrayList) rgVar3.f)) {
                try {
                    if (((ArrayList) rgVar3.f).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) rgVar3.f).size());
                        ArrayList arrayList4 = (ArrayList) rgVar3.f;
                        int size2 = arrayList4.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj = arrayList4.get(i3);
                            i3++;
                            pm pmVar2 = (pm) obj;
                            arrayList.add(pmVar2.j);
                            if (G(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + pmVar2.j + "): " + pmVar2);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList5 = this.d;
            if (arrayList5 == null || (size = arrayList5.size()) <= 0) {
                p7VarArr = null;
            } else {
                p7VarArr = new p7[size];
                for (int i4 = 0; i4 < size; i4++) {
                    p7VarArr[i4] = new p7((o7) this.d.get(i4));
                    if (G(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i4 + ": " + this.d.get(i4));
                    }
                }
            }
            fn fnVar = new fn();
            fnVar.j = null;
            ArrayList arrayList6 = new ArrayList();
            fnVar.k = arrayList6;
            ArrayList arrayList7 = new ArrayList();
            fnVar.l = arrayList7;
            fnVar.f = arrayList2;
            fnVar.g = arrayList;
            fnVar.h = p7VarArr;
            fnVar.i = this.i.get();
            pm pmVar3 = this.w;
            if (pmVar3 != null) {
                fnVar.j = pmVar3.j;
            }
            arrayList6.addAll(this.j.keySet());
            arrayList7.addAll(this.j.values());
            fnVar.m = new ArrayList(this.C);
            bundle.putParcelable("state", fnVar);
            for (String str : this.k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.k.get(str));
            }
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj2 = arrayList3.get(i);
                i++;
                kn knVar2 = (kn) obj2;
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("state", knVar2);
                bundle.putBundle("fragment_" + knVar2.g, bundle4);
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
                    this.t.t.removeCallbacks(this.M);
                    this.t.t.post(this.M);
                    c0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void V(pm pmVar, boolean z) {
        ViewGroup C = C(pmVar);
        if (C == null || !(C instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) C).setDrawDisappearingViewsLast(!z);
    }

    public final void W(pm pmVar, hs hsVar) {
        if (pmVar == this.c.h(pmVar.j) && (pmVar.x == null || pmVar.w == this)) {
            pmVar.Q = hsVar;
        } else {
            g9.n("Fragment ", pmVar, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final void X(pm pmVar) {
        if (pmVar != null) {
            if (pmVar != this.c.h(pmVar.j) || (pmVar.x != null && pmVar.w != this)) {
                g9.n("Fragment ", pmVar, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        pm pmVar2 = this.w;
        this.w = pmVar;
        q(pmVar2);
        q(this.w);
    }

    public final void Y(pm pmVar) {
        ViewGroup C = C(pmVar);
        if (C != null) {
            om omVar = pmVar.M;
            if ((omVar == null ? 0 : omVar.e) + (omVar == null ? 0 : omVar.d) + (omVar == null ? 0 : omVar.c) + (omVar == null ? 0 : omVar.b) > 0) {
                if (C.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    C.setTag(R.id.visible_removing_fragment_view_tag, pmVar);
                }
                pm pmVar2 = (pm) C.getTag(R.id.visible_removing_fragment_view_tag);
                om omVar2 = pmVar.M;
                boolean z = omVar2 != null ? omVar2.a : false;
                if (pmVar2.M == null) {
                    return;
                }
                pmVar2.f().a = z;
            }
        }
    }

    public final ln a(pm pmVar) {
        String str = pmVar.P;
        if (str != null) {
            nn.c(pmVar, str);
        }
        if (G(2)) {
            Log.v("FragmentManager", "add: " + pmVar);
        }
        ln f = f(pmVar);
        pmVar.w = this;
        rg rgVar = this.c;
        rgVar.r(f);
        if (!pmVar.E) {
            rgVar.a(pmVar);
            pmVar.q = false;
            if (pmVar.J == null) {
                pmVar.N = false;
            }
            if (H(pmVar)) {
                this.D = true;
            }
        }
        return f;
    }

    public final void a0() {
        ArrayList l = this.c.l();
        int size = l.size();
        int i = 0;
        while (i < size) {
            Object obj = l.get(i);
            i++;
            ln lnVar = (ln) obj;
            pm pmVar = lnVar.c;
            if (pmVar.K) {
                if (this.b) {
                    this.H = true;
                } else {
                    pmVar.K = false;
                    lnVar.k();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(rm rmVar, la0 la0Var, pm pmVar) {
        String str;
        if (this.t != null) {
            g9.s("Already attached");
            return;
        }
        this.t = rmVar;
        this.u = la0Var;
        this.v = pmVar;
        CopyOnWriteArrayList copyOnWriteArrayList = this.m;
        if (pmVar != 0) {
            copyOnWriteArrayList.add(new an(pmVar));
        } else if (rmVar != null) {
            copyOnWriteArrayList.add(rmVar);
        }
        if (this.v != null) {
            c0();
        }
        int i = 0;
        if (rmVar != null) {
            hz h = rmVar.v.h();
            this.g = h;
            rm rmVar2 = pmVar != 0 ? pmVar : rmVar;
            h.getClass();
            xm xmVar = this.h;
            xmVar.getClass();
            final os e = rmVar2.e();
            if (e.c != hs.f) {
                cz czVar = new cz(xmVar, new dz(xmVar, rmVar2));
                xmVar.a.add(czVar);
                czVar.b(false);
                rg rgVar = ((fz) h.b.a()).c;
                rgVar.getClass();
                if (((LinkedHashSet) rgVar.h).add(czVar)) {
                    wx wxVar = (wx) rgVar.g;
                    wxVar.getClass();
                    if (czVar.c != null) {
                        throw new IllegalArgumentException(("Handler '" + czVar + "' is already registered with a dispatcher").toString());
                    }
                    wxVar.e.addFirst(czVar);
                    czVar.c = rgVar;
                    wxVar.b();
                }
                final ng ngVar = new ng(czVar, h, e);
                e.a(ngVar);
                xmVar.c.add(new AutoCloseable() { // from class: ez
                    @Override // java.lang.AutoCloseable
                    public final void close() {
                        os.this.f(ngVar);
                    }
                });
            }
        }
        if (pmVar != 0) {
            hn hnVar = pmVar.w.L;
            HashMap hashMap = hnVar.c;
            hn hnVar2 = (hn) hashMap.get(pmVar.j);
            if (hnVar2 == null) {
                hnVar2 = new hn(hnVar.e);
                hashMap.put(pmVar.j, hnVar2);
            }
            this.L = hnVar2;
        } else if (rmVar != null) {
            this.L = (hn) new pw(rmVar.v.d(), hn.h, mf.b).d(hn.class);
        } else {
            this.L = new hn(false);
        }
        hn hnVar3 = this.L;
        int i2 = 1;
        hnVar3.g = this.E || this.F;
        this.c.i = hnVar3;
        rm rmVar3 = this.t;
        int i3 = 2;
        if (rmVar3 != null && pmVar == 0) {
            s3 a = rmVar3.a();
            a.e("android:support:fragments", new qc(i3, this));
            Bundle c = a.c("android:support:fragments");
            if (c != null) {
                S(c);
            }
        }
        rm rmVar4 = this.t;
        if (rmVar4 != null) {
            uc ucVar = rmVar4.v.m;
            if (pmVar != 0) {
                str = pmVar.j + ":";
            } else {
                str = "";
            }
            String concat = "FragmentManager:".concat(str);
            this.z = ucVar.b(concat.concat("StartActivityForResult"), new u1(i2), new wm(this, i2));
            this.A = ucVar.b(concat.concat("StartIntentSenderForResult"), new u1(i3), new wm(this, i3));
            this.B = ucVar.b(concat.concat("RequestPermissions"), new u1(i), new wm(this, i));
        }
        rm rmVar5 = this.t;
        if (rmVar5 != null) {
            m3 m3Var = rmVar5.v;
            vm vmVar = this.n;
            vmVar.getClass();
            m3Var.n.add(vmVar);
        }
        rm rmVar6 = this.t;
        if (rmVar6 != null) {
            m3 m3Var2 = rmVar6.v;
            vm vmVar2 = this.o;
            vmVar2.getClass();
            m3Var2.o.add(vmVar2);
        }
        rm rmVar7 = this.t;
        if (rmVar7 != null) {
            m3 m3Var3 = rmVar7.v;
            vm vmVar3 = this.p;
            vmVar3.getClass();
            m3Var3.q.add(vmVar3);
        }
        rm rmVar8 = this.t;
        if (rmVar8 != null) {
            m3 m3Var4 = rmVar8.v;
            vm vmVar4 = this.q;
            vmVar4.getClass();
            m3Var4.r.add(vmVar4);
        }
        rm rmVar9 = this.t;
        if (rmVar9 == null || pmVar != 0) {
            return;
        }
        m3 m3Var5 = rmVar9.v;
        ym ymVar = this.r;
        ymVar.getClass();
        k6 k6Var = m3Var5.h;
        ((CopyOnWriteArrayList) k6Var.i).add(ymVar);
        ((Runnable) k6Var.h).run();
    }

    public final void b0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new du());
        rm rmVar = this.t;
        if (rmVar == null) {
            try {
                v("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            rmVar.v.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw illegalStateException;
        }
    }

    public final void c(pm pmVar) {
        if (G(2)) {
            Log.v("FragmentManager", "attach: " + pmVar);
        }
        if (pmVar.E) {
            pmVar.E = false;
            if (pmVar.p) {
                return;
            }
            this.c.a(pmVar);
            if (G(2)) {
                Log.v("FragmentManager", "add from attach: " + pmVar);
            }
            if (H(pmVar)) {
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
                xm xmVar = this.h;
                ArrayList arrayList = this.d;
                xmVar.a((arrayList != null ? arrayList.size() : 0) > 0 && K(this.v));
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
        ArrayList l = this.c.l();
        int size = l.size();
        int i = 0;
        while (i < size) {
            Object obj = l.get(i);
            i++;
            ViewGroup viewGroup = ((ln) obj).c.I;
            if (viewGroup != null) {
                hashSet.add(ug.f(viewGroup, E()));
            }
        }
        return hashSet;
    }

    public final ln f(pm pmVar) {
        String str = pmVar.j;
        rg rgVar = this.c;
        ln lnVar = (ln) ((HashMap) rgVar.g).get(str);
        if (lnVar != null) {
            return lnVar;
        }
        ln lnVar2 = new ln(this.l, rgVar, pmVar);
        lnVar2.m(this.t.s.getClassLoader());
        lnVar2.e = this.s;
        return lnVar2;
    }

    public final void g(pm pmVar) {
        if (G(2)) {
            Log.v("FragmentManager", "detach: " + pmVar);
        }
        if (pmVar.E) {
            return;
        }
        pmVar.E = true;
        if (pmVar.p) {
            if (G(2)) {
                Log.v("FragmentManager", "remove from detach: " + pmVar);
            }
            rg rgVar = this.c;
            synchronized (((ArrayList) rgVar.f)) {
                ((ArrayList) rgVar.f).remove(pmVar);
            }
            pmVar.p = false;
            if (H(pmVar)) {
                this.D = true;
            }
            Y(pmVar);
        }
    }

    public final void h(boolean z) {
        if (z && this.t != null) {
            b0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (pm pmVar : this.c.n()) {
            if (pmVar != null) {
                pmVar.H = true;
                if (z) {
                    pmVar.y.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.s >= 1) {
            for (pm pmVar : this.c.n()) {
                if (pmVar != null) {
                    if (!pmVar.D ? pmVar.y.i() : false) {
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
        for (pm pmVar : this.c.n()) {
            if (pmVar != null && J(pmVar)) {
                if (!pmVar.D ? pmVar.y.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(pmVar);
                    z = true;
                }
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                pm pmVar2 = (pm) this.e.get(i);
                if (arrayList == null || !arrayList.contains(pmVar2)) {
                    pmVar2.getClass();
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
            ((ug) it.next()).e();
        }
        rm rmVar = this.t;
        rg rgVar = this.c;
        if (rmVar != null) {
            z = ((hn) rgVar.i).f;
        } else {
            z = rmVar.s != null ? !r1.isChangingConfigurations() : true;
        }
        int i = 0;
        if (z) {
            Iterator it2 = this.j.values().iterator();
            while (it2.hasNext()) {
                ArrayList arrayList = ((q7) it2.next()).f;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    String str = (String) obj;
                    hn hnVar = (hn) rgVar.i;
                    hnVar.getClass();
                    if (G(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    hnVar.e(str);
                }
            }
        }
        t(-1);
        rm rmVar2 = this.t;
        if (rmVar2 != null) {
            m3 m3Var = rmVar2.v;
            vm vmVar = this.o;
            vmVar.getClass();
            m3Var.o.remove(vmVar);
        }
        rm rmVar3 = this.t;
        if (rmVar3 != null) {
            m3 m3Var2 = rmVar3.v;
            vm vmVar2 = this.n;
            vmVar2.getClass();
            m3Var2.n.remove(vmVar2);
        }
        rm rmVar4 = this.t;
        if (rmVar4 != null) {
            m3 m3Var3 = rmVar4.v;
            vm vmVar3 = this.p;
            vmVar3.getClass();
            m3Var3.q.remove(vmVar3);
        }
        rm rmVar5 = this.t;
        if (rmVar5 != null) {
            m3 m3Var4 = rmVar5.v;
            vm vmVar4 = this.q;
            vmVar4.getClass();
            m3Var4.r.remove(vmVar4);
        }
        rm rmVar6 = this.t;
        if (rmVar6 != null) {
            m3 m3Var5 = rmVar6.v;
            ym ymVar = this.r;
            ymVar.getClass();
            k6 k6Var = m3Var5.h;
            ((CopyOnWriteArrayList) k6Var.i).remove(ymVar);
            if (((HashMap) k6Var.g).remove(ymVar) == null) {
                ((Runnable) k6Var.h).run();
            } else {
                g9.b();
            }
        }
        this.t = null;
        this.u = null;
        this.v = null;
        if (this.g != null) {
            xm xmVar = this.h;
            ArrayList arrayList2 = xmVar.a;
            CopyOnWriteArrayList copyOnWriteArrayList = xmVar.c;
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
                ((cz) obj2).a();
            }
            arrayList2.clear();
            this.g = null;
        }
        a5 a5Var = this.z;
        if (a5Var != null) {
            a5Var.U();
            this.A.U();
            this.B.U();
        }
    }

    public final void l(boolean z) {
        if (z && this.t != null) {
            b0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (pm pmVar : this.c.n()) {
            if (pmVar != null) {
                pmVar.H = true;
                if (z) {
                    pmVar.y.l(true);
                }
            }
        }
    }

    public final void m(boolean z) {
        if (z && this.t != null) {
            b0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (pm pmVar : this.c.n()) {
            if (pmVar != null && z) {
                pmVar.y.m(true);
            }
        }
    }

    public final void n() {
        ArrayList m = this.c.m();
        int size = m.size();
        int i = 0;
        while (i < size) {
            Object obj = m.get(i);
            i++;
            pm pmVar = (pm) obj;
            if (pmVar != null) {
                pmVar.n();
                pmVar.y.n();
            }
        }
    }

    public final boolean o() {
        if (this.s >= 1) {
            for (pm pmVar : this.c.n()) {
                if (pmVar != null) {
                    if (!pmVar.D ? pmVar.y.o() : false) {
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
        for (pm pmVar : this.c.n()) {
            if (pmVar != null && !pmVar.D) {
                pmVar.y.p();
            }
        }
    }

    public final void q(pm pmVar) {
        if (pmVar != null) {
            if (pmVar != this.c.h(pmVar.j)) {
                return;
            }
            pmVar.w.getClass();
            boolean K = K(pmVar);
            Boolean bool = pmVar.o;
            if (bool == null || bool.booleanValue() != K) {
                pmVar.o = Boolean.valueOf(K);
                en enVar = pmVar.y;
                enVar.c0();
                enVar.q(enVar.w);
            }
        }
    }

    public final void r(boolean z) {
        if (z && this.t != null) {
            b0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (pm pmVar : this.c.n()) {
            if (pmVar != null && z) {
                pmVar.y.r(true);
            }
        }
    }

    public final boolean s() {
        if (this.s < 1) {
            return false;
        }
        boolean z = false;
        for (pm pmVar : this.c.n()) {
            if (pmVar != null && J(pmVar)) {
                if (!pmVar.D ? pmVar.y.s() : false) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final void t(int i) {
        try {
            this.b = true;
            for (ln lnVar : ((HashMap) this.c.g).values()) {
                if (lnVar != null) {
                    lnVar.e = i;
                }
            }
            L(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((ug) it.next()).e();
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
        pm pmVar = this.v;
        if (pmVar != null) {
            sb.append(pmVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.v)));
            sb.append("}");
        } else {
            rm rmVar = this.t;
            if (rmVar != null) {
                sb.append(rmVar.getClass().getSimpleName());
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
        rg rgVar = this.c;
        ArrayList arrayList = (ArrayList) rgVar.f;
        String str4 = str + "    ";
        HashMap hashMap = (HashMap) rgVar.g;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (ln lnVar : hashMap.values()) {
                printWriter.print(str);
                if (lnVar != null) {
                    pm pmVar = lnVar.c;
                    printWriter.println(pmVar);
                    pmVar.getClass();
                    printWriter.print(str4);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(pmVar.A));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(pmVar.B));
                    printWriter.print(" mTag=");
                    printWriter.println(pmVar.C);
                    printWriter.print(str4);
                    printWriter.print("mState=");
                    printWriter.print(pmVar.f);
                    printWriter.print(" mWho=");
                    printWriter.print(pmVar.j);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(pmVar.v);
                    printWriter.print(str4);
                    printWriter.print("mAdded=");
                    printWriter.print(pmVar.p);
                    printWriter.print(" mRemoving=");
                    printWriter.print(pmVar.q);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(pmVar.r);
                    printWriter.print(" mInLayout=");
                    printWriter.println(pmVar.s);
                    printWriter.print(str4);
                    printWriter.print("mHidden=");
                    printWriter.print(pmVar.D);
                    printWriter.print(" mDetached=");
                    printWriter.print(pmVar.E);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(pmVar.G);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str4);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(pmVar.F);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(pmVar.L);
                    if (pmVar.w != null) {
                        printWriter.print(str4);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(pmVar.w);
                    }
                    if (pmVar.x != null) {
                        printWriter.print(str4);
                        printWriter.print("mHost=");
                        printWriter.println(pmVar.x);
                    }
                    if (pmVar.z != null) {
                        printWriter.print(str4);
                        printWriter.print("mParentFragment=");
                        printWriter.println(pmVar.z);
                    }
                    if (pmVar.k != null) {
                        printWriter.print(str4);
                        printWriter.print("mArguments=");
                        printWriter.println(pmVar.k);
                    }
                    if (pmVar.g != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(pmVar.g);
                    }
                    if (pmVar.h != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(pmVar.h);
                    }
                    if (pmVar.i != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(pmVar.i);
                    }
                    Object obj = pmVar.l;
                    if (obj == null) {
                        en enVar = pmVar.w;
                        obj = (enVar == null || (str2 = pmVar.m) == null) ? null : enVar.c.h(str2);
                    }
                    if (obj != null) {
                        printWriter.print(str4);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(pmVar.n);
                    }
                    printWriter.print(str4);
                    printWriter.print("mPopDirection=");
                    om omVar = pmVar.M;
                    printWriter.println(omVar == null ? false : omVar.a);
                    om omVar2 = pmVar.M;
                    if ((omVar2 == null ? 0 : omVar2.b) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getEnterAnim=");
                        om omVar3 = pmVar.M;
                        printWriter.println(omVar3 == null ? 0 : omVar3.b);
                    }
                    om omVar4 = pmVar.M;
                    if ((omVar4 == null ? 0 : omVar4.c) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getExitAnim=");
                        om omVar5 = pmVar.M;
                        printWriter.println(omVar5 == null ? 0 : omVar5.c);
                    }
                    om omVar6 = pmVar.M;
                    if ((omVar6 == null ? 0 : omVar6.d) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getPopEnterAnim=");
                        om omVar7 = pmVar.M;
                        printWriter.println(omVar7 == null ? 0 : omVar7.d);
                    }
                    om omVar8 = pmVar.M;
                    if ((omVar8 == null ? 0 : omVar8.e) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getPopExitAnim=");
                        om omVar9 = pmVar.M;
                        printWriter.println(omVar9 == null ? 0 : omVar9.e);
                    }
                    if (pmVar.I != null) {
                        printWriter.print(str4);
                        printWriter.print("mContainer=");
                        printWriter.println(pmVar.I);
                    }
                    if (pmVar.J != null) {
                        printWriter.print(str4);
                        printWriter.print("mView=");
                        printWriter.println(pmVar.J);
                    }
                    if (pmVar.h() != null) {
                        k60 k60Var = ((vt) new pw(pmVar.d(), vt.c).d(vt.class)).b;
                        if (k60Var.h > 0) {
                            printWriter.print(str4);
                            printWriter.println("Loaders:");
                            if (k60Var.h > 0) {
                                if (k60Var.g[0] != null) {
                                    g9.b();
                                    return;
                                }
                                printWriter.print(str4);
                                printWriter.print("  #");
                                printWriter.print(k60Var.f[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(str4);
                    printWriter.println("Child " + pmVar.y + ":");
                    pmVar.y.v(str4.concat("  "), fileDescriptor, printWriter, strArr);
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
                pm pmVar2 = (pm) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(pmVar2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                pm pmVar3 = (pm) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(pmVar3.toString());
            }
        }
        ArrayList arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                o7 o7Var = (o7) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(o7Var.toString());
                o7Var.f(str3, printWriter, true);
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
                        Object obj2 = (cn) this.a.get(i4);
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

    public final void w(cn cnVar, boolean z) {
        if (!z) {
            if (this.t == null) {
                if (this.G) {
                    g9.s("FragmentManager has been destroyed");
                    return;
                } else {
                    g9.s("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (this.E || this.F) {
                g9.s("Can not perform this action after onSaveInstanceState");
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
                    this.a.add(cnVar);
                    U();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(boolean z) {
        if (this.b) {
            g9.s("FragmentManager is already executing transactions");
            return;
        }
        if (this.t == null) {
            if (this.G) {
                g9.s("FragmentManager has been destroyed");
                return;
            } else {
                g9.s("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.t.t.getLooper()) {
            g9.s("Must be called from main thread of fragment host");
            return;
        }
        if (!z && (this.E || this.F)) {
            g9.s("Can not perform this action after onSaveInstanceState");
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
                            z2 |= ((cn) arrayList.get(i)).a(arrayList2, arrayList3);
                            i++;
                        }
                        arrayList.clear();
                        this.t.t.removeCallbacks(this.M);
                    } finally {
                    }
                }
            }
            if (!z2) {
                c0();
                u();
                ((HashMap) this.c.g).values().removeAll(Collections.singleton(null));
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
        int i6;
        int i7;
        rg rgVar = this.c;
        boolean z5 = ((o7) arrayList.get(i)).o;
        ArrayList arrayList3 = this.K;
        if (arrayList3 == null) {
            this.K = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.K.addAll(rgVar.n());
        pm pmVar = this.w;
        int i8 = i;
        boolean z6 = false;
        while (true) {
            int i9 = 1;
            if (i8 >= i2) {
                boolean z7 = z5;
                this.K.clear();
                if (!z7 && this.s >= 1) {
                    for (int i10 = i; i10 < i2; i10++) {
                        ArrayList arrayList4 = ((o7) arrayList.get(i10)).a;
                        int size = arrayList4.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList4.get(i11);
                            i11++;
                            pm pmVar2 = ((on) obj).b;
                            if (pmVar2 != null && pmVar2.w != null) {
                                rgVar.r(f(pmVar2));
                            }
                        }
                    }
                }
                for (int i12 = i; i12 < i2; i12++) {
                    o7 o7Var = (o7) arrayList.get(i12);
                    if (((Boolean) arrayList2.get(i12)).booleanValue()) {
                        o7Var.c(-1);
                        en enVar = o7Var.p;
                        ArrayList arrayList5 = o7Var.a;
                        boolean z8 = true;
                        for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
                            on onVar = (on) arrayList5.get(size2);
                            pm pmVar3 = onVar.b;
                            if (pmVar3 != null) {
                                if (pmVar3.M != null) {
                                    pmVar3.f().a = z8;
                                }
                                int i13 = o7Var.f;
                                int i14 = 8194;
                                int i15 = 4097;
                                if (i13 != 4097) {
                                    if (i13 != 8194) {
                                        i14 = 4100;
                                        i15 = 8197;
                                        if (i13 != 8197) {
                                            if (i13 == 4099) {
                                                i14 = 4099;
                                            } else if (i13 != 4100) {
                                                i14 = 0;
                                            }
                                        }
                                    }
                                    i14 = i15;
                                }
                                if (pmVar3.M != null || i14 != 0) {
                                    pmVar3.f();
                                    pmVar3.M.f = i14;
                                }
                                pmVar3.f();
                                pmVar3.M.getClass();
                            }
                            switch (onVar.a) {
                                case 1:
                                    pmVar3.G(onVar.d, onVar.e, onVar.f, onVar.g);
                                    z8 = true;
                                    enVar.V(pmVar3, true);
                                    enVar.Q(pmVar3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + onVar.a);
                                case 3:
                                    pmVar3.G(onVar.d, onVar.e, onVar.f, onVar.g);
                                    enVar.a(pmVar3);
                                    z8 = true;
                                case 4:
                                    pmVar3.G(onVar.d, onVar.e, onVar.f, onVar.g);
                                    enVar.getClass();
                                    Z(pmVar3);
                                    z8 = true;
                                case 5:
                                    pmVar3.G(onVar.d, onVar.e, onVar.f, onVar.g);
                                    enVar.V(pmVar3, true);
                                    enVar.F(pmVar3);
                                    z8 = true;
                                case 6:
                                    pmVar3.G(onVar.d, onVar.e, onVar.f, onVar.g);
                                    enVar.c(pmVar3);
                                    z8 = true;
                                case 7:
                                    pmVar3.G(onVar.d, onVar.e, onVar.f, onVar.g);
                                    enVar.V(pmVar3, true);
                                    enVar.g(pmVar3);
                                    z8 = true;
                                case 8:
                                    enVar.X(null);
                                    z8 = true;
                                case 9:
                                    enVar.X(pmVar3);
                                    z8 = true;
                                case 10:
                                    enVar.W(pmVar3, onVar.h);
                                    z8 = true;
                            }
                        }
                    } else {
                        o7Var.c(1);
                        en enVar2 = o7Var.p;
                        ArrayList arrayList6 = o7Var.a;
                        int size3 = arrayList6.size();
                        for (int i16 = 0; i16 < size3; i16++) {
                            on onVar2 = (on) arrayList6.get(i16);
                            pm pmVar4 = onVar2.b;
                            if (pmVar4 != null) {
                                if (pmVar4.M != null) {
                                    pmVar4.f().a = false;
                                }
                                int i17 = o7Var.f;
                                if (pmVar4.M != null || i17 != 0) {
                                    pmVar4.f();
                                    pmVar4.M.f = i17;
                                }
                                pmVar4.f();
                                pmVar4.M.getClass();
                            }
                            switch (onVar2.a) {
                                case 1:
                                    pmVar4.G(onVar2.d, onVar2.e, onVar2.f, onVar2.g);
                                    enVar2.V(pmVar4, false);
                                    enVar2.a(pmVar4);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + onVar2.a);
                                case 3:
                                    pmVar4.G(onVar2.d, onVar2.e, onVar2.f, onVar2.g);
                                    enVar2.Q(pmVar4);
                                    break;
                                case 4:
                                    pmVar4.G(onVar2.d, onVar2.e, onVar2.f, onVar2.g);
                                    enVar2.F(pmVar4);
                                    break;
                                case 5:
                                    pmVar4.G(onVar2.d, onVar2.e, onVar2.f, onVar2.g);
                                    enVar2.V(pmVar4, false);
                                    Z(pmVar4);
                                    break;
                                case 6:
                                    pmVar4.G(onVar2.d, onVar2.e, onVar2.f, onVar2.g);
                                    enVar2.g(pmVar4);
                                    break;
                                case 7:
                                    pmVar4.G(onVar2.d, onVar2.e, onVar2.f, onVar2.g);
                                    enVar2.V(pmVar4, false);
                                    enVar2.c(pmVar4);
                                    break;
                                case 8:
                                    enVar2.X(pmVar4);
                                    break;
                                case 9:
                                    enVar2.X(null);
                                    break;
                                case 10:
                                    enVar2.W(pmVar4, onVar2.i);
                                    break;
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i18 = i; i18 < i2; i18++) {
                    o7 o7Var2 = (o7) arrayList.get(i18);
                    if (booleanValue) {
                        for (int size4 = o7Var2.a.size() - 1; size4 >= 0; size4--) {
                            pm pmVar5 = ((on) o7Var2.a.get(size4)).b;
                            if (pmVar5 != null) {
                                f(pmVar5).k();
                            }
                        }
                    } else {
                        ArrayList arrayList7 = o7Var2.a;
                        int size5 = arrayList7.size();
                        int i19 = 0;
                        while (i19 < size5) {
                            Object obj2 = arrayList7.get(i19);
                            i19++;
                            pm pmVar6 = ((on) obj2).b;
                            if (pmVar6 != null) {
                                f(pmVar6).k();
                            }
                        }
                    }
                }
                L(this.s, true);
                HashSet hashSet = new HashSet();
                for (int i20 = i; i20 < i2; i20++) {
                    ArrayList arrayList8 = ((o7) arrayList.get(i20)).a;
                    int size6 = arrayList8.size();
                    int i21 = 0;
                    while (i21 < size6) {
                        Object obj3 = arrayList8.get(i21);
                        i21++;
                        pm pmVar7 = ((on) obj3).b;
                        if (pmVar7 != null && (viewGroup = pmVar7.I) != null) {
                            hashSet.add(ug.f(viewGroup, E()));
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ug ugVar = (ug) it.next();
                    ugVar.d = booleanValue;
                    synchronized (ugVar.b) {
                        try {
                            ugVar.g();
                            ugVar.e = false;
                            int size7 = ugVar.b.size() - 1;
                            while (true) {
                                if (size7 >= 0) {
                                    m60 m60Var = (m60) ugVar.b.get(size7);
                                    int c = f60.c(m60Var.c.J);
                                    if (m60Var.a != 2 || c == 2) {
                                        size7--;
                                    } else {
                                        om omVar = m60Var.c.M;
                                        ugVar.e = false;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    ugVar.c();
                }
                for (int i22 = i; i22 < i2; i22++) {
                    o7 o7Var3 = (o7) arrayList.get(i22);
                    if (((Boolean) arrayList2.get(i22)).booleanValue() && o7Var3.r >= 0) {
                        o7Var3.r = -1;
                    }
                    o7Var3.getClass();
                }
                return;
            }
            o7 o7Var4 = (o7) arrayList.get(i8);
            boolean booleanValue2 = ((Boolean) arrayList2.get(i8)).booleanValue();
            ArrayList arrayList9 = this.K;
            if (booleanValue2) {
                z = z5;
                i3 = i8;
                z2 = z6;
                int i23 = 1;
                ArrayList arrayList10 = o7Var4.a;
                int size8 = arrayList10.size() - 1;
                while (size8 >= 0) {
                    on onVar3 = (on) arrayList10.get(size8);
                    int i24 = onVar3.a;
                    if (i24 != i23) {
                        if (i24 != 3) {
                            switch (i24) {
                                case 8:
                                    pmVar = null;
                                    break;
                                case 9:
                                    pmVar = onVar3.b;
                                    break;
                                case 10:
                                    onVar3.i = onVar3.h;
                                    break;
                            }
                            size8--;
                            i23 = 1;
                        }
                        arrayList9.add(onVar3.b);
                        size8--;
                        i23 = 1;
                    }
                    arrayList9.remove(onVar3.b);
                    size8--;
                    i23 = 1;
                }
            } else {
                ArrayList arrayList11 = o7Var4.a;
                int i25 = 0;
                while (i25 < arrayList11.size()) {
                    on onVar4 = (on) arrayList11.get(i25);
                    int i26 = onVar4.a;
                    if (i26 != i9) {
                        if (i26 != 2) {
                            if (i26 == 3 || i26 == 6) {
                                z3 = z5;
                                arrayList9.remove(onVar4.b);
                                pm pmVar8 = onVar4.b;
                                if (pmVar8 == pmVar) {
                                    arrayList11.add(i25, new on(9, pmVar8));
                                    i25++;
                                    i5 = i8;
                                    z4 = z6;
                                    i4 = 1;
                                    pmVar = null;
                                }
                            } else if (i26 == 7) {
                                z3 = z5;
                                i4 = 1;
                            } else if (i26 != 8) {
                                z3 = z5;
                            } else {
                                z3 = z5;
                                arrayList11.add(i25, new on(9, pmVar, 0));
                                onVar4.c = true;
                                i25++;
                                pmVar = onVar4.b;
                            }
                            i5 = i8;
                            z4 = z6;
                            i4 = 1;
                        } else {
                            z3 = z5;
                            pm pmVar9 = onVar4.b;
                            int i27 = pmVar9.B;
                            int size9 = arrayList9.size() - 1;
                            boolean z9 = false;
                            while (size9 >= 0) {
                                int i28 = i8;
                                pm pmVar10 = (pm) arrayList9.get(size9);
                                boolean z10 = z6;
                                if (pmVar10.B != i27) {
                                    i6 = i27;
                                } else if (pmVar10 == pmVar9) {
                                    i6 = i27;
                                    z9 = true;
                                } else {
                                    if (pmVar10 == pmVar) {
                                        i6 = i27;
                                        i7 = 0;
                                        arrayList11.add(i25, new on(9, pmVar10, 0));
                                        i25++;
                                        pmVar = null;
                                    } else {
                                        i6 = i27;
                                        i7 = 0;
                                    }
                                    on onVar5 = new on(3, pmVar10, i7);
                                    onVar5.d = onVar4.d;
                                    onVar5.f = onVar4.f;
                                    onVar5.e = onVar4.e;
                                    onVar5.g = onVar4.g;
                                    arrayList11.add(i25, onVar5);
                                    arrayList9.remove(pmVar10);
                                    i25++;
                                    pmVar = pmVar;
                                }
                                size9--;
                                i27 = i6;
                                z6 = z10;
                                i8 = i28;
                            }
                            i5 = i8;
                            z4 = z6;
                            i4 = 1;
                            if (z9) {
                                arrayList11.remove(i25);
                                i25--;
                            } else {
                                onVar4.a = 1;
                                onVar4.c = true;
                                arrayList9.add(pmVar9);
                            }
                        }
                        i25 += i4;
                        i9 = i4;
                        z5 = z3;
                        z6 = z4;
                        i8 = i5;
                    } else {
                        z3 = z5;
                        i4 = i9;
                    }
                    i5 = i8;
                    z4 = z6;
                    arrayList9.add(onVar4.b);
                    i25 += i4;
                    i9 = i4;
                    z5 = z3;
                    z6 = z4;
                    i8 = i5;
                }
                z = z5;
                i3 = i8;
                z2 = z6;
            }
            z6 = z2 || o7Var4.g;
            i8 = i3 + 1;
            z5 = z;
        }
    }
}
