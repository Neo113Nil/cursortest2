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
import androidx.fragment.app.a;
import com.derinko.gbini.n1casino.R;
import defpackage.aq;
import defpackage.dw;
import defpackage.up;
import defpackage.zv;
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

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class bl {
    public q4 A;
    public q4 B;
    public ArrayDeque C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ArrayList K;
    public dl L;
    public final z6 M;
    public boolean b;
    public ArrayList d;
    public ArrayList e;
    public ew g;
    public final q4 l;
    public final CopyOnWriteArrayList m;
    public final sk n;
    public final sk o;
    public final sk p;
    public final sk q;
    public final vk r;
    public int s;
    public ok t;
    public jw u;
    public mk v;
    public mk w;
    public final wk x;
    public final dh y;
    public q4 z;
    public final ArrayList a = new ArrayList();
    public final we c = new we(3);
    public final rk f = new rk(this);
    public final uk h = new uk(this);
    public final AtomicInteger i = new AtomicInteger();
    public final Map j = Collections.synchronizedMap(new HashMap());
    public final Map k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [sk] */
    /* JADX WARN: Type inference failed for: r0v13, types: [sk] */
    /* JADX WARN: Type inference failed for: r0v14, types: [sk] */
    /* JADX WARN: Type inference failed for: r0v15, types: [sk] */
    public bl() {
        Collections.synchronizedMap(new HashMap());
        this.l = new q4(this);
        this.m = new CopyOnWriteArrayList();
        final int i = 0;
        this.n = new dd(this) { // from class: sk
            public final /* synthetic */ bl b;

            {
                this.b = this;
            }

            @Override // defpackage.dd
            public final void accept(Object obj) {
                int i2 = i;
                bl blVar = this.b;
                switch (i2) {
                    case 0:
                        if (blVar.I()) {
                            blVar.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (blVar.I() && num.intValue() == 80) {
                            blVar.l(false);
                            break;
                        }
                        break;
                    case 2:
                        ou ouVar = (ou) obj;
                        if (blVar.I()) {
                            boolean z = ouVar.a;
                            blVar.m(false);
                            break;
                        }
                        break;
                    default:
                        tw twVar = (tw) obj;
                        if (blVar.I()) {
                            boolean z2 = twVar.a;
                            blVar.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.o = new dd(this) { // from class: sk
            public final /* synthetic */ bl b;

            {
                this.b = this;
            }

            @Override // defpackage.dd
            public final void accept(Object obj) {
                int i22 = i2;
                bl blVar = this.b;
                switch (i22) {
                    case 0:
                        if (blVar.I()) {
                            blVar.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (blVar.I() && num.intValue() == 80) {
                            blVar.l(false);
                            break;
                        }
                        break;
                    case 2:
                        ou ouVar = (ou) obj;
                        if (blVar.I()) {
                            boolean z = ouVar.a;
                            blVar.m(false);
                            break;
                        }
                        break;
                    default:
                        tw twVar = (tw) obj;
                        if (blVar.I()) {
                            boolean z2 = twVar.a;
                            blVar.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.p = new dd(this) { // from class: sk
            public final /* synthetic */ bl b;

            {
                this.b = this;
            }

            @Override // defpackage.dd
            public final void accept(Object obj) {
                int i22 = i3;
                bl blVar = this.b;
                switch (i22) {
                    case 0:
                        if (blVar.I()) {
                            blVar.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (blVar.I() && num.intValue() == 80) {
                            blVar.l(false);
                            break;
                        }
                        break;
                    case 2:
                        ou ouVar = (ou) obj;
                        if (blVar.I()) {
                            boolean z = ouVar.a;
                            blVar.m(false);
                            break;
                        }
                        break;
                    default:
                        tw twVar = (tw) obj;
                        if (blVar.I()) {
                            boolean z2 = twVar.a;
                            blVar.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.q = new dd(this) { // from class: sk
            public final /* synthetic */ bl b;

            {
                this.b = this;
            }

            @Override // defpackage.dd
            public final void accept(Object obj) {
                int i22 = i4;
                bl blVar = this.b;
                switch (i22) {
                    case 0:
                        if (blVar.I()) {
                            blVar.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (blVar.I() && num.intValue() == 80) {
                            blVar.l(false);
                            break;
                        }
                        break;
                    case 2:
                        ou ouVar = (ou) obj;
                        if (blVar.I()) {
                            boolean z = ouVar.a;
                            blVar.m(false);
                            break;
                        }
                        break;
                    default:
                        tw twVar = (tw) obj;
                        if (blVar.I()) {
                            boolean z2 = twVar.a;
                            blVar.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        this.r = new vk(this);
        this.s = -1;
        this.x = new wk(this);
        this.y = new dh(22);
        this.C = new ArrayDeque();
        this.M = new z6(6, this);
    }

    public static boolean G(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean H(mk mkVar) {
        mkVar.getClass();
        ArrayList m = mkVar.y.c.m();
        int size = m.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            Object obj = m.get(i);
            i++;
            mk mkVar2 = (mk) obj;
            if (mkVar2 != null) {
                z = H(mkVar2);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(mk mkVar) {
        if (mkVar == null) {
            return true;
        }
        if (mkVar.G) {
            return mkVar.w == null || J(mkVar.z);
        }
        return false;
    }

    public static boolean K(mk mkVar) {
        if (mkVar == null) {
            return true;
        }
        bl blVar = mkVar.w;
        return mkVar == blVar.w && K(blVar.v);
    }

    public static void Z(mk mkVar) {
        if (G(2)) {
            Log.v("FragmentManager", "show: " + mkVar);
        }
        if (mkVar.D) {
            mkVar.D = false;
            mkVar.N = !mkVar.N;
        }
    }

    public final mk A(int i) {
        we weVar = this.c;
        ArrayList arrayList = (ArrayList) weVar.f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            mk mkVar = (mk) arrayList.get(size);
            if (mkVar != null && mkVar.A == i) {
                return mkVar;
            }
        }
        for (a aVar : ((HashMap) weVar.g).values()) {
            if (aVar != null) {
                mk mkVar2 = aVar.c;
                if (mkVar2.A == i) {
                    return mkVar2;
                }
            }
        }
        return null;
    }

    public final mk B(String str) {
        we weVar = this.c;
        ArrayList arrayList = (ArrayList) weVar.f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            mk mkVar = (mk) arrayList.get(size);
            if (mkVar != null && str.equals(mkVar.C)) {
                return mkVar;
            }
        }
        for (a aVar : ((HashMap) weVar.g).values()) {
            if (aVar != null) {
                mk mkVar2 = aVar.c;
                if (str.equals(mkVar2.C)) {
                    return mkVar2;
                }
            }
        }
        return null;
    }

    public final ViewGroup C(mk mkVar) {
        ViewGroup viewGroup = mkVar.I;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (mkVar.B <= 0 || !this.u.O()) {
            return null;
        }
        View L = this.u.L(mkVar.B);
        if (L instanceof ViewGroup) {
            return (ViewGroup) L;
        }
        return null;
    }

    public final wk D() {
        mk mkVar = this.v;
        return mkVar != null ? mkVar.w.D() : this.x;
    }

    public final dh E() {
        mk mkVar = this.v;
        return mkVar != null ? mkVar.w.E() : this.y;
    }

    public final void F(mk mkVar) {
        if (G(2)) {
            Log.v("FragmentManager", "hide: " + mkVar);
        }
        if (mkVar.D) {
            return;
        }
        mkVar.D = true;
        mkVar.N = true ^ mkVar.N;
        Y(mkVar);
    }

    public final boolean I() {
        mk mkVar = this.v;
        if (mkVar == null) {
            return true;
        }
        return mkVar.x != null && mkVar.p && mkVar.j().I();
    }

    public final void L(int i, boolean z) {
        ok okVar;
        if (this.t == null && i != -1) {
            t8.t("No activity");
            return;
        }
        if (z || i != this.s) {
            this.s = i;
            we weVar = this.c;
            HashMap hashMap = (HashMap) weVar.g;
            ArrayList arrayList = (ArrayList) weVar.f;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                a aVar = (a) hashMap.get(((mk) obj).j);
                if (aVar != null) {
                    aVar.k();
                }
            }
            for (a aVar2 : hashMap.values()) {
                if (aVar2 != null) {
                    aVar2.k();
                    mk mkVar = aVar2.c;
                    if (mkVar.q && !mkVar.p()) {
                        weVar.s(aVar2);
                    }
                }
            }
            a0();
            if (this.D && (okVar = this.t) != null && this.s == 7) {
                okVar.s.invalidateOptionsMenu();
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
        this.L.h = false;
        for (mk mkVar : this.c.n()) {
            if (mkVar != null) {
                mkVar.y.M();
            }
        }
    }

    public final boolean N() {
        return O(-1, 0);
    }

    public final boolean O(int i, int i2) {
        y(false);
        x(true);
        mk mkVar = this.w;
        if (mkVar != null && i < 0 && mkVar.g().N()) {
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
                    e7 e7Var = (e7) this.d.get(size);
                    if (i >= 0 && i == e7Var.r) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    i3 = size;
                } else if (z) {
                    i3 = size;
                    while (i3 > 0) {
                        e7 e7Var2 = (e7) this.d.get(i3 - 1);
                        if (i < 0 || i != e7Var2.r) {
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
            arrayList.add((e7) this.d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void Q(mk mkVar) {
        if (G(2)) {
            Log.v("FragmentManager", "remove: " + mkVar + " nesting=" + mkVar.v);
        }
        boolean p = mkVar.p();
        if (mkVar.E && p) {
            return;
        }
        we weVar = this.c;
        synchronized (((ArrayList) weVar.f)) {
            ((ArrayList) weVar.f).remove(mkVar);
        }
        mkVar.p = false;
        if (H(mkVar)) {
            this.D = true;
        }
        mkVar.q = true;
        Y(mkVar);
    }

    public final void R(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            t8.t("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((e7) arrayList.get(i)).o) {
                if (i2 != i) {
                    z(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((e7) arrayList.get(i2)).o) {
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
        q4 q4Var;
        int i;
        boolean z;
        int i2;
        a aVar;
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
                arrayList.add((gl) bundle.getParcelable("state"));
            }
        }
        we weVar = this.c;
        HashMap hashMap = (HashMap) weVar.h;
        HashMap hashMap2 = (HashMap) weVar.g;
        hashMap.clear();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            gl glVar = (gl) obj;
            hashMap.put(glVar.g, glVar);
        }
        cl clVar = (cl) bundle3.getParcelable("state");
        if (clVar == null) {
            return;
        }
        hashMap2.clear();
        ArrayList arrayList2 = clVar.f;
        int size2 = arrayList2.size();
        int i4 = 0;
        while (true) {
            q4Var = this.l;
            i = 2;
            if (i4 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i4);
            i4++;
            gl glVar2 = (gl) ((HashMap) weVar.h).remove((String) obj2);
            if (glVar2 != null) {
                mk mkVar = (mk) this.L.c.get(glVar2.g);
                if (mkVar != null) {
                    if (G(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + mkVar);
                    }
                    aVar = new a(q4Var, weVar, mkVar, glVar2);
                } else {
                    aVar = new a(this.l, this.c, this.t.p.getClassLoader(), D(), glVar2);
                }
                mk mkVar2 = aVar.c;
                mkVar2.w = this;
                if (G(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + mkVar2.j + "): " + mkVar2);
                }
                aVar.m(this.t.p.getClassLoader());
                weVar.r(aVar);
                aVar.e = this.s;
            }
        }
        dl dlVar = this.L;
        dlVar.getClass();
        ArrayList arrayList3 = new ArrayList(dlVar.c.values());
        int size3 = arrayList3.size();
        int i5 = 0;
        while (true) {
            z = true;
            if (i5 >= size3) {
                break;
            }
            Object obj3 = arrayList3.get(i5);
            i5++;
            mk mkVar3 = (mk) obj3;
            if (hashMap2.get(mkVar3.j) == null) {
                if (G(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + mkVar3 + " that was not found in the set of active Fragments " + clVar.f);
                }
                this.L.e(mkVar3);
                mkVar3.w = this;
                a aVar2 = new a(q4Var, weVar, mkVar3);
                aVar2.e = 1;
                aVar2.k();
                mkVar3.q = true;
                aVar2.k();
            }
        }
        ArrayList arrayList4 = clVar.g;
        ((ArrayList) weVar.f).clear();
        if (arrayList4 != null) {
            int size4 = arrayList4.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList4.get(i6);
                i6++;
                String str3 = (String) obj4;
                mk h = weVar.h(str3);
                if (h == null) {
                    t8.h(str3, ")", "No instantiated fragment for (");
                    return;
                }
                if (G(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + h);
                }
                weVar.a(h);
            }
        }
        if (clVar.h != null) {
            this.d = new ArrayList(clVar.h.length);
            int i7 = 0;
            while (true) {
                f7[] f7VarArr = clVar.h;
                if (i7 >= f7VarArr.length) {
                    break;
                }
                f7 f7Var = f7VarArr[i7];
                ArrayList arrayList5 = f7Var.g;
                e7 e7Var = new e7(this);
                int[] iArr = f7Var.f;
                int i8 = 0;
                int i9 = 0;
                while (i8 < iArr.length) {
                    jl jlVar = new jl();
                    int i10 = i8 + 1;
                    int i11 = i;
                    jlVar.a = iArr[i8];
                    if (G(i11)) {
                        Log.v("FragmentManager", "Instantiate " + e7Var + " op #" + i9 + " base fragment #" + iArr[i10]);
                    }
                    jlVar.h = vp.values()[f7Var.h[i9]];
                    jlVar.i = vp.values()[f7Var.i[i9]];
                    int i12 = i8 + 2;
                    jlVar.c = iArr[i10] != 0 ? z : false;
                    int i13 = iArr[i12];
                    jlVar.d = i13;
                    int i14 = iArr[i8 + 3];
                    jlVar.e = i14;
                    int i15 = i8 + 5;
                    int i16 = iArr[i8 + 4];
                    jlVar.f = i16;
                    i8 += 6;
                    int[] iArr2 = iArr;
                    int i17 = iArr2[i15];
                    jlVar.g = i17;
                    e7Var.b = i13;
                    e7Var.c = i14;
                    e7Var.d = i16;
                    e7Var.e = i17;
                    e7Var.b(jlVar);
                    i9++;
                    i = i11;
                    iArr = iArr2;
                    z = true;
                }
                int i18 = i;
                e7Var.f = f7Var.j;
                e7Var.h = f7Var.k;
                e7Var.g = true;
                e7Var.i = f7Var.m;
                e7Var.j = f7Var.n;
                e7Var.k = f7Var.o;
                e7Var.l = f7Var.p;
                e7Var.m = f7Var.q;
                e7Var.n = f7Var.r;
                e7Var.o = f7Var.s;
                e7Var.r = f7Var.l;
                for (int i19 = 0; i19 < arrayList5.size(); i19++) {
                    String str4 = (String) arrayList5.get(i19);
                    if (str4 != null) {
                        ((jl) e7Var.a.get(i19)).b = weVar.h(str4);
                    }
                }
                e7Var.c(1);
                if (G(i18)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i7 + " (index " + e7Var.r + "): " + e7Var);
                    PrintWriter printWriter = new PrintWriter(new gr());
                    e7Var.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(e7Var);
                i7++;
                i = i18;
                z = true;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.d = null;
        }
        this.i.set(clVar.i);
        String str5 = clVar.j;
        if (str5 != null) {
            mk h2 = weVar.h(str5);
            this.w = h2;
            q(h2);
        }
        ArrayList arrayList6 = clVar.k;
        if (arrayList6 != null) {
            while (i2 < arrayList6.size()) {
                this.j.put((String) arrayList6.get(i2), (g7) clVar.l.get(i2));
                i2++;
            }
        }
        this.C = new ArrayDeque(clVar.m);
    }

    public final Bundle T() {
        int i;
        ArrayList arrayList;
        f7[] f7VarArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            ze zeVar = (ze) it.next();
            if (zeVar.e) {
                if (G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                zeVar.e = false;
                zeVar.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((ze) it2.next()).e();
        }
        y(true);
        this.E = true;
        this.L.h = true;
        we weVar = this.c;
        weVar.getClass();
        HashMap hashMap = (HashMap) weVar.g;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it3 = hashMap.values().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            a aVar = (a) it3.next();
            if (aVar != null) {
                mk mkVar = aVar.c;
                gl glVar = new gl(mkVar);
                if (mkVar.f <= -1 || glVar.r != null) {
                    glVar.r = mkVar.g;
                } else {
                    Bundle bundle2 = new Bundle();
                    mkVar.y(bundle2);
                    mkVar.U.c(bundle2);
                    bundle2.putParcelable("android:support:fragments", mkVar.y.T());
                    aVar.a.o(false);
                    Bundle bundle3 = bundle2.isEmpty() ? null : bundle2;
                    if (mkVar.J != null) {
                        aVar.o();
                    }
                    if (mkVar.h != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putSparseParcelableArray("android:view_state", mkVar.h);
                    }
                    if (mkVar.i != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBundle("android:view_registry_state", mkVar.i);
                    }
                    if (!mkVar.L) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBoolean("android:user_visible_hint", mkVar.L);
                    }
                    glVar.r = bundle3;
                    if (mkVar.m != null) {
                        if (bundle3 == null) {
                            glVar.r = new Bundle();
                        }
                        glVar.r.putString("android:target_state", mkVar.m);
                        int i2 = mkVar.n;
                        if (i2 != 0) {
                            glVar.r.putInt("android:target_req_state", i2);
                        }
                    }
                }
                arrayList2.add(mkVar.j);
                if (G(2)) {
                    Log.v("FragmentManager", "Saved state of " + mkVar + ": " + mkVar.g);
                }
            }
        }
        we weVar2 = this.c;
        weVar2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) weVar2.h).values());
        if (!arrayList3.isEmpty()) {
            we weVar3 = this.c;
            synchronized (((ArrayList) weVar3.f)) {
                try {
                    if (((ArrayList) weVar3.f).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) weVar3.f).size());
                        ArrayList arrayList4 = (ArrayList) weVar3.f;
                        int size2 = arrayList4.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj = arrayList4.get(i3);
                            i3++;
                            mk mkVar2 = (mk) obj;
                            arrayList.add(mkVar2.j);
                            if (G(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + mkVar2.j + "): " + mkVar2);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList5 = this.d;
            if (arrayList5 == null || (size = arrayList5.size()) <= 0) {
                f7VarArr = null;
            } else {
                f7VarArr = new f7[size];
                for (int i4 = 0; i4 < size; i4++) {
                    f7VarArr[i4] = new f7((e7) this.d.get(i4));
                    if (G(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i4 + ": " + this.d.get(i4));
                    }
                }
            }
            cl clVar = new cl();
            clVar.j = null;
            ArrayList arrayList6 = new ArrayList();
            clVar.k = arrayList6;
            ArrayList arrayList7 = new ArrayList();
            clVar.l = arrayList7;
            clVar.f = arrayList2;
            clVar.g = arrayList;
            clVar.h = f7VarArr;
            clVar.i = this.i.get();
            mk mkVar3 = this.w;
            if (mkVar3 != null) {
                clVar.j = mkVar3.j;
            }
            arrayList6.addAll(this.j.keySet());
            arrayList7.addAll(this.j.values());
            clVar.m = new ArrayList(this.C);
            bundle.putParcelable("state", clVar);
            for (String str : this.k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.k.get(str));
            }
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj2 = arrayList3.get(i);
                i++;
                gl glVar2 = (gl) obj2;
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("state", glVar2);
                bundle.putBundle("fragment_" + glVar2.g, bundle4);
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

    public final void V(mk mkVar, boolean z) {
        ViewGroup C = C(mkVar);
        if (C == null || !(C instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) C).setDrawDisappearingViewsLast(!z);
    }

    public final void W(mk mkVar, vp vpVar) {
        if (mkVar == this.c.h(mkVar.j) && (mkVar.x == null || mkVar.w == this)) {
            mkVar.Q = vpVar;
        } else {
            t8.p("Fragment ", mkVar, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final void X(mk mkVar) {
        if (mkVar != null) {
            if (mkVar != this.c.h(mkVar.j) || (mkVar.x != null && mkVar.w != this)) {
                t8.p("Fragment ", mkVar, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        mk mkVar2 = this.w;
        this.w = mkVar;
        q(mkVar2);
        q(this.w);
    }

    public final void Y(mk mkVar) {
        ViewGroup C = C(mkVar);
        if (C != null) {
            kk kkVar = mkVar.M;
            if ((kkVar == null ? 0 : kkVar.e) + (kkVar == null ? 0 : kkVar.d) + (kkVar == null ? 0 : kkVar.c) + (kkVar == null ? 0 : kkVar.b) > 0) {
                if (C.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    C.setTag(R.id.visible_removing_fragment_view_tag, mkVar);
                }
                mk mkVar2 = (mk) C.getTag(R.id.visible_removing_fragment_view_tag);
                kk kkVar2 = mkVar.M;
                boolean z = kkVar2 != null ? kkVar2.a : false;
                if (mkVar2.M == null) {
                    return;
                }
                mkVar2.f().a = z;
            }
        }
    }

    public final a a(mk mkVar) {
        String str = mkVar.P;
        if (str != null) {
            il.c(mkVar, str);
        }
        if (G(2)) {
            Log.v("FragmentManager", "add: " + mkVar);
        }
        a f = f(mkVar);
        mkVar.w = this;
        we weVar = this.c;
        weVar.r(f);
        if (!mkVar.E) {
            weVar.a(mkVar);
            mkVar.q = false;
            if (mkVar.J == null) {
                mkVar.N = false;
            }
            if (H(mkVar)) {
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
            a aVar = (a) obj;
            mk mkVar = aVar.c;
            if (mkVar.K) {
                if (this.b) {
                    this.H = true;
                } else {
                    mkVar.K = false;
                    aVar.k();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.activity.OnBackPressedDispatcher$addCallback$observer$1, zp] */
    public final void b(ok okVar, jw jwVar, mk mkVar) {
        String str;
        if (this.t != null) {
            t8.t("Already attached");
            return;
        }
        this.t = okVar;
        this.u = jwVar;
        this.v = mkVar;
        CopyOnWriteArrayList copyOnWriteArrayList = this.m;
        if (mkVar != 0) {
            copyOnWriteArrayList.add(new xk(mkVar));
        } else if (okVar != null) {
            copyOnWriteArrayList.add(okVar);
        }
        if (this.v != null) {
            c0();
        }
        int i = 0;
        if (okVar != null) {
            final ew h = okVar.s.h();
            this.g = h;
            ok okVar2 = mkVar != 0 ? mkVar : okVar;
            h.getClass();
            uk ukVar = this.h;
            ukVar.getClass();
            final androidx.lifecycle.a e = okVar2.e();
            if (e.c != vp.f) {
                final zv zvVar = new zv(ukVar, new aw(ukVar, okVar2));
                ukVar.a.add(zvVar);
                zvVar.b(false);
                we weVar = ((cw) h.b.a()).c;
                weVar.getClass();
                if (((LinkedHashSet) weVar.h).add(zvVar)) {
                    uu uuVar = (uu) weVar.g;
                    uuVar.getClass();
                    if (zvVar.c != null) {
                        t8.u(zvVar, "' is already registered with a dispatcher", "Handler '");
                        return;
                    } else {
                        uuVar.e.addFirst(zvVar);
                        zvVar.c = weVar;
                        uuVar.b();
                    }
                }
                final ?? r4 = new yp(h, e) { // from class: androidx.activity.OnBackPressedDispatcher$addCallback$observer$1
                    public final /* synthetic */ androidx.lifecycle.a b;

                    {
                        this.b = e;
                    }

                    @Override // defpackage.yp
                    public final void b(aq aqVar, up upVar) {
                        int i2 = dw.a[upVar.ordinal()];
                        zv zvVar2 = zv.this;
                        if (i2 == 1) {
                            zvVar2.b(true);
                            return;
                        }
                        if (i2 == 2) {
                            zvVar2.b(false);
                        } else {
                            if (i2 != 3) {
                                return;
                            }
                            zvVar2.a();
                            this.b.f(this);
                        }
                    }
                };
                e.a(r4);
                ukVar.c.add(new AutoCloseable() { // from class: bw
                    @Override // java.lang.AutoCloseable
                    public final void close() {
                        androidx.lifecycle.a.this.f(r4);
                    }
                });
            }
        }
        if (mkVar != 0) {
            dl dlVar = mkVar.w.L;
            HashMap hashMap = dlVar.d;
            dl dlVar2 = (dl) hashMap.get(mkVar.j);
            if (dlVar2 == null) {
                dlVar2 = new dl(dlVar.f);
                hashMap.put(mkVar.j, dlVar2);
            }
            this.L = dlVar2;
        } else if (okVar != null) {
            a6 a6Var = new a6(okVar.s.d(), dl.i, ud.b);
            String canonicalName = dl.class.getCanonicalName();
            if (canonicalName == null) {
                t8.k("Local and anonymous classes can not be ViewModels");
                return;
            }
            this.L = (dl) a6Var.g("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), dl.class);
        } else {
            this.L = new dl(false);
        }
        dl dlVar3 = this.L;
        int i2 = 1;
        dlVar3.h = this.E || this.F;
        this.c.i = dlVar3;
        ok okVar3 = this.t;
        int i3 = 2;
        if (okVar3 != null && mkVar == 0) {
            i3 a = okVar3.a();
            a.e("android:support:fragments", new qb(i3, this));
            Bundle c = a.c("android:support:fragments");
            if (c != null) {
                S(c);
            }
        }
        ok okVar4 = this.t;
        if (okVar4 != null) {
            ub ubVar = okVar4.s.m;
            if (mkVar != 0) {
                str = mkVar.j + ":";
            } else {
                str = "";
            }
            String concat = "FragmentManager:".concat(str);
            this.z = ubVar.b(concat.concat("StartActivityForResult"), new t1(i2), new tk(this, i2));
            this.A = ubVar.b(concat.concat("StartIntentSenderForResult"), new t1(i3), new tk(this, i3));
            this.B = ubVar.b(concat.concat("RequestPermissions"), new t1(i), new tk(this, i));
        }
        ok okVar5 = this.t;
        if (okVar5 != null) {
            c3 c3Var = okVar5.s;
            sk skVar = this.n;
            skVar.getClass();
            c3Var.n.add(skVar);
        }
        ok okVar6 = this.t;
        if (okVar6 != null) {
            c3 c3Var2 = okVar6.s;
            sk skVar2 = this.o;
            skVar2.getClass();
            c3Var2.o.add(skVar2);
        }
        ok okVar7 = this.t;
        if (okVar7 != null) {
            c3 c3Var3 = okVar7.s;
            sk skVar3 = this.p;
            skVar3.getClass();
            c3Var3.q.add(skVar3);
        }
        ok okVar8 = this.t;
        if (okVar8 != null) {
            c3 c3Var4 = okVar8.s;
            sk skVar4 = this.q;
            skVar4.getClass();
            c3Var4.r.add(skVar4);
        }
        ok okVar9 = this.t;
        if (okVar9 == null || mkVar != 0) {
            return;
        }
        c3 c3Var5 = okVar9.s;
        vk vkVar = this.r;
        vkVar.getClass();
        a6 a6Var2 = c3Var5.h;
        ((CopyOnWriteArrayList) a6Var2.d).add(vkVar);
        ((Runnable) a6Var2.c).run();
    }

    public final void b0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new gr());
        ok okVar = this.t;
        if (okVar == null) {
            try {
                v("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            okVar.s.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw illegalStateException;
        }
    }

    public final void c(mk mkVar) {
        if (G(2)) {
            Log.v("FragmentManager", "attach: " + mkVar);
        }
        if (mkVar.E) {
            mkVar.E = false;
            if (mkVar.p) {
                return;
            }
            this.c.a(mkVar);
            if (G(2)) {
                Log.v("FragmentManager", "add from attach: " + mkVar);
            }
            if (H(mkVar)) {
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
                uk ukVar = this.h;
                ArrayList arrayList = this.d;
                ukVar.a((arrayList != null ? arrayList.size() : 0) > 0 && K(this.v));
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
            ViewGroup viewGroup = ((a) obj).c.I;
            if (viewGroup != null) {
                hashSet.add(ze.f(viewGroup, E()));
            }
        }
        return hashSet;
    }

    public final a f(mk mkVar) {
        String str = mkVar.j;
        we weVar = this.c;
        a aVar = (a) ((HashMap) weVar.g).get(str);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this.l, weVar, mkVar);
        aVar2.m(this.t.p.getClassLoader());
        aVar2.e = this.s;
        return aVar2;
    }

    public final void g(mk mkVar) {
        if (G(2)) {
            Log.v("FragmentManager", "detach: " + mkVar);
        }
        if (mkVar.E) {
            return;
        }
        mkVar.E = true;
        if (mkVar.p) {
            if (G(2)) {
                Log.v("FragmentManager", "remove from detach: " + mkVar);
            }
            we weVar = this.c;
            synchronized (((ArrayList) weVar.f)) {
                ((ArrayList) weVar.f).remove(mkVar);
            }
            mkVar.p = false;
            if (H(mkVar)) {
                this.D = true;
            }
            Y(mkVar);
        }
    }

    public final void h(boolean z) {
        if (z && this.t != null) {
            b0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (mk mkVar : this.c.n()) {
            if (mkVar != null) {
                mkVar.H = true;
                if (z) {
                    mkVar.y.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.s >= 1) {
            for (mk mkVar : this.c.n()) {
                if (mkVar != null) {
                    if (!mkVar.D ? mkVar.y.i() : false) {
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
        for (mk mkVar : this.c.n()) {
            if (mkVar != null && J(mkVar)) {
                if (!mkVar.D ? mkVar.y.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(mkVar);
                    z = true;
                }
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                mk mkVar2 = (mk) this.e.get(i);
                if (arrayList == null || !arrayList.contains(mkVar2)) {
                    mkVar2.getClass();
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
            ((ze) it.next()).e();
        }
        ok okVar = this.t;
        we weVar = this.c;
        if (okVar != null) {
            z = ((dl) weVar.i).g;
        } else {
            z = okVar.p != null ? !r1.isChangingConfigurations() : true;
        }
        int i = 0;
        if (z) {
            Iterator it2 = this.j.values().iterator();
            while (it2.hasNext()) {
                ArrayList arrayList = ((g7) it2.next()).f;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    String str = (String) obj;
                    dl dlVar = (dl) weVar.i;
                    dlVar.getClass();
                    if (G(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    dlVar.d(str);
                }
            }
        }
        t(-1);
        ok okVar2 = this.t;
        if (okVar2 != null) {
            c3 c3Var = okVar2.s;
            sk skVar = this.o;
            skVar.getClass();
            c3Var.o.remove(skVar);
        }
        ok okVar3 = this.t;
        if (okVar3 != null) {
            c3 c3Var2 = okVar3.s;
            sk skVar2 = this.n;
            skVar2.getClass();
            c3Var2.n.remove(skVar2);
        }
        ok okVar4 = this.t;
        if (okVar4 != null) {
            c3 c3Var3 = okVar4.s;
            sk skVar3 = this.p;
            skVar3.getClass();
            c3Var3.q.remove(skVar3);
        }
        ok okVar5 = this.t;
        if (okVar5 != null) {
            c3 c3Var4 = okVar5.s;
            sk skVar4 = this.q;
            skVar4.getClass();
            c3Var4.r.remove(skVar4);
        }
        ok okVar6 = this.t;
        if (okVar6 != null) {
            c3 c3Var5 = okVar6.s;
            vk vkVar = this.r;
            vkVar.getClass();
            a6 a6Var = c3Var5.h;
            ((CopyOnWriteArrayList) a6Var.d).remove(vkVar);
            if (((HashMap) a6Var.b).remove(vkVar) == null) {
                ((Runnable) a6Var.c).run();
            } else {
                t8.c();
            }
        }
        this.t = null;
        this.u = null;
        this.v = null;
        if (this.g != null) {
            uk ukVar = this.h;
            ArrayList arrayList2 = ukVar.a;
            CopyOnWriteArrayList copyOnWriteArrayList = ukVar.c;
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
                ((zv) obj2).a();
            }
            arrayList2.clear();
            this.g = null;
        }
        q4 q4Var = this.z;
        if (q4Var != null) {
            q4Var.U();
            this.A.U();
            this.B.U();
        }
    }

    public final void l(boolean z) {
        if (z && this.t != null) {
            b0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (mk mkVar : this.c.n()) {
            if (mkVar != null) {
                mkVar.H = true;
                if (z) {
                    mkVar.y.l(true);
                }
            }
        }
    }

    public final void m(boolean z) {
        if (z && this.t != null) {
            b0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (mk mkVar : this.c.n()) {
            if (mkVar != null && z) {
                mkVar.y.m(true);
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
            mk mkVar = (mk) obj;
            if (mkVar != null) {
                mkVar.o();
                mkVar.y.n();
            }
        }
    }

    public final boolean o() {
        if (this.s >= 1) {
            for (mk mkVar : this.c.n()) {
                if (mkVar != null) {
                    if (!mkVar.D ? mkVar.y.o() : false) {
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
        for (mk mkVar : this.c.n()) {
            if (mkVar != null && !mkVar.D) {
                mkVar.y.p();
            }
        }
    }

    public final void q(mk mkVar) {
        if (mkVar != null) {
            if (mkVar != this.c.h(mkVar.j)) {
                return;
            }
            mkVar.w.getClass();
            boolean K = K(mkVar);
            Boolean bool = mkVar.o;
            if (bool == null || bool.booleanValue() != K) {
                mkVar.o = Boolean.valueOf(K);
                bl blVar = mkVar.y;
                blVar.c0();
                blVar.q(blVar.w);
            }
        }
    }

    public final void r(boolean z) {
        if (z && this.t != null) {
            b0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (mk mkVar : this.c.n()) {
            if (mkVar != null && z) {
                mkVar.y.r(true);
            }
        }
    }

    public final boolean s() {
        if (this.s < 1) {
            return false;
        }
        boolean z = false;
        for (mk mkVar : this.c.n()) {
            if (mkVar != null && J(mkVar)) {
                if (!mkVar.D ? mkVar.y.s() : false) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final void t(int i) {
        try {
            this.b = true;
            for (a aVar : ((HashMap) this.c.g).values()) {
                if (aVar != null) {
                    aVar.e = i;
                }
            }
            L(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((ze) it.next()).e();
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
        mk mkVar = this.v;
        if (mkVar != null) {
            sb.append(mkVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.v)));
            sb.append("}");
        } else {
            ok okVar = this.t;
            if (okVar != null) {
                sb.append(okVar.getClass().getSimpleName());
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
        we weVar = this.c;
        ArrayList arrayList = (ArrayList) weVar.f;
        String str4 = str + "    ";
        HashMap hashMap = (HashMap) weVar.g;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (a aVar : hashMap.values()) {
                printWriter.print(str);
                if (aVar != null) {
                    mk mkVar = aVar.c;
                    printWriter.println(mkVar);
                    mkVar.getClass();
                    printWriter.print(str4);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(mkVar.A));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(mkVar.B));
                    printWriter.print(" mTag=");
                    printWriter.println(mkVar.C);
                    printWriter.print(str4);
                    printWriter.print("mState=");
                    printWriter.print(mkVar.f);
                    printWriter.print(" mWho=");
                    printWriter.print(mkVar.j);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(mkVar.v);
                    printWriter.print(str4);
                    printWriter.print("mAdded=");
                    printWriter.print(mkVar.p);
                    printWriter.print(" mRemoving=");
                    printWriter.print(mkVar.q);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(mkVar.r);
                    printWriter.print(" mInLayout=");
                    printWriter.println(mkVar.s);
                    printWriter.print(str4);
                    printWriter.print("mHidden=");
                    printWriter.print(mkVar.D);
                    printWriter.print(" mDetached=");
                    printWriter.print(mkVar.E);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(mkVar.G);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str4);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(mkVar.F);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(mkVar.L);
                    if (mkVar.w != null) {
                        printWriter.print(str4);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(mkVar.w);
                    }
                    if (mkVar.x != null) {
                        printWriter.print(str4);
                        printWriter.print("mHost=");
                        printWriter.println(mkVar.x);
                    }
                    if (mkVar.z != null) {
                        printWriter.print(str4);
                        printWriter.print("mParentFragment=");
                        printWriter.println(mkVar.z);
                    }
                    if (mkVar.k != null) {
                        printWriter.print(str4);
                        printWriter.print("mArguments=");
                        printWriter.println(mkVar.k);
                    }
                    if (mkVar.g != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(mkVar.g);
                    }
                    if (mkVar.h != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(mkVar.h);
                    }
                    if (mkVar.i != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(mkVar.i);
                    }
                    Object obj = mkVar.l;
                    if (obj == null) {
                        bl blVar = mkVar.w;
                        obj = (blVar == null || (str2 = mkVar.m) == null) ? null : blVar.c.h(str2);
                    }
                    if (obj != null) {
                        printWriter.print(str4);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(mkVar.n);
                    }
                    printWriter.print(str4);
                    printWriter.print("mPopDirection=");
                    kk kkVar = mkVar.M;
                    printWriter.println(kkVar == null ? false : kkVar.a);
                    kk kkVar2 = mkVar.M;
                    if ((kkVar2 == null ? 0 : kkVar2.b) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getEnterAnim=");
                        kk kkVar3 = mkVar.M;
                        printWriter.println(kkVar3 == null ? 0 : kkVar3.b);
                    }
                    kk kkVar4 = mkVar.M;
                    if ((kkVar4 == null ? 0 : kkVar4.c) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getExitAnim=");
                        kk kkVar5 = mkVar.M;
                        printWriter.println(kkVar5 == null ? 0 : kkVar5.c);
                    }
                    kk kkVar6 = mkVar.M;
                    if ((kkVar6 == null ? 0 : kkVar6.d) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getPopEnterAnim=");
                        kk kkVar7 = mkVar.M;
                        printWriter.println(kkVar7 == null ? 0 : kkVar7.d);
                    }
                    kk kkVar8 = mkVar.M;
                    if ((kkVar8 == null ? 0 : kkVar8.e) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getPopExitAnim=");
                        kk kkVar9 = mkVar.M;
                        printWriter.println(kkVar9 == null ? 0 : kkVar9.e);
                    }
                    if (mkVar.I != null) {
                        printWriter.print(str4);
                        printWriter.print("mContainer=");
                        printWriter.println(mkVar.I);
                    }
                    if (mkVar.J != null) {
                        printWriter.print(str4);
                        printWriter.print("mView=");
                        printWriter.println(mkVar.J);
                    }
                    if (mkVar.h() != null) {
                        a6 a6Var = new a6(mkVar.d(), dr.d);
                        String canonicalName = dr.class.getCanonicalName();
                        if (canonicalName == null) {
                            t8.k("Local and anonymous classes can not be ViewModels");
                            return;
                        }
                        i30 i30Var = ((dr) a6Var.g("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), dr.class)).c;
                        if (i30Var.h > 0) {
                            printWriter.print(str4);
                            printWriter.println("Loaders:");
                            if (i30Var.h > 0) {
                                if (i30Var.g[0] != null) {
                                    t8.c();
                                    return;
                                }
                                printWriter.print(str4);
                                printWriter.print("  #");
                                printWriter.print(i30Var.f[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(str4);
                    printWriter.println("Child " + mkVar.y + ":");
                    mkVar.y.v(str4.concat("  "), fileDescriptor, printWriter, strArr);
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
                mk mkVar2 = (mk) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(mkVar2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                mk mkVar3 = (mk) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(mkVar3.toString());
            }
        }
        ArrayList arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                e7 e7Var = (e7) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(e7Var.toString());
                e7Var.f(str3, printWriter, true);
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
                        Object obj2 = (zk) this.a.get(i4);
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

    public final void w(zk zkVar, boolean z) {
        if (!z) {
            if (this.t == null) {
                if (this.G) {
                    t8.t("FragmentManager has been destroyed");
                    return;
                } else {
                    t8.t("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (this.E || this.F) {
                t8.t("Can not perform this action after onSaveInstanceState");
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
                    this.a.add(zkVar);
                    U();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(boolean z) {
        if (this.b) {
            t8.t("FragmentManager is already executing transactions");
            return;
        }
        if (this.t == null) {
            if (this.G) {
                t8.t("FragmentManager has been destroyed");
                return;
            } else {
                t8.t("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.t.q.getLooper()) {
            t8.t("Must be called from main thread of fragment host");
            return;
        }
        if (!z && (this.E || this.F)) {
            t8.t("Can not perform this action after onSaveInstanceState");
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
                            z2 |= ((zk) arrayList.get(i)).a(arrayList2, arrayList3);
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
        we weVar = this.c;
        boolean z5 = ((e7) arrayList.get(i)).o;
        ArrayList arrayList3 = this.K;
        if (arrayList3 == null) {
            this.K = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.K.addAll(weVar.n());
        mk mkVar = this.w;
        int i8 = i;
        boolean z6 = false;
        while (true) {
            int i9 = 1;
            if (i8 >= i2) {
                boolean z7 = z5;
                this.K.clear();
                if (!z7 && this.s >= 1) {
                    for (int i10 = i; i10 < i2; i10++) {
                        ArrayList arrayList4 = ((e7) arrayList.get(i10)).a;
                        int size = arrayList4.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList4.get(i11);
                            i11++;
                            mk mkVar2 = ((jl) obj).b;
                            if (mkVar2 != null && mkVar2.w != null) {
                                weVar.r(f(mkVar2));
                            }
                        }
                    }
                }
                for (int i12 = i; i12 < i2; i12++) {
                    e7 e7Var = (e7) arrayList.get(i12);
                    if (((Boolean) arrayList2.get(i12)).booleanValue()) {
                        e7Var.c(-1);
                        bl blVar = e7Var.p;
                        ArrayList arrayList5 = e7Var.a;
                        boolean z8 = true;
                        for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
                            jl jlVar = (jl) arrayList5.get(size2);
                            mk mkVar3 = jlVar.b;
                            if (mkVar3 != null) {
                                if (mkVar3.M != null) {
                                    mkVar3.f().a = z8;
                                }
                                int i13 = e7Var.f;
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
                                if (mkVar3.M != null || i14 != 0) {
                                    mkVar3.f();
                                    mkVar3.M.f = i14;
                                }
                                mkVar3.f();
                                mkVar3.M.getClass();
                            }
                            switch (jlVar.a) {
                                case 1:
                                    mkVar3.G(jlVar.d, jlVar.e, jlVar.f, jlVar.g);
                                    z8 = true;
                                    blVar.V(mkVar3, true);
                                    blVar.Q(mkVar3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + jlVar.a);
                                case 3:
                                    mkVar3.G(jlVar.d, jlVar.e, jlVar.f, jlVar.g);
                                    blVar.a(mkVar3);
                                    z8 = true;
                                case 4:
                                    mkVar3.G(jlVar.d, jlVar.e, jlVar.f, jlVar.g);
                                    blVar.getClass();
                                    Z(mkVar3);
                                    z8 = true;
                                case 5:
                                    mkVar3.G(jlVar.d, jlVar.e, jlVar.f, jlVar.g);
                                    blVar.V(mkVar3, true);
                                    blVar.F(mkVar3);
                                    z8 = true;
                                case 6:
                                    mkVar3.G(jlVar.d, jlVar.e, jlVar.f, jlVar.g);
                                    blVar.c(mkVar3);
                                    z8 = true;
                                case 7:
                                    mkVar3.G(jlVar.d, jlVar.e, jlVar.f, jlVar.g);
                                    blVar.V(mkVar3, true);
                                    blVar.g(mkVar3);
                                    z8 = true;
                                case 8:
                                    blVar.X(null);
                                    z8 = true;
                                case 9:
                                    blVar.X(mkVar3);
                                    z8 = true;
                                case 10:
                                    blVar.W(mkVar3, jlVar.h);
                                    z8 = true;
                            }
                        }
                    } else {
                        e7Var.c(1);
                        bl blVar2 = e7Var.p;
                        ArrayList arrayList6 = e7Var.a;
                        int size3 = arrayList6.size();
                        for (int i16 = 0; i16 < size3; i16++) {
                            jl jlVar2 = (jl) arrayList6.get(i16);
                            mk mkVar4 = jlVar2.b;
                            if (mkVar4 != null) {
                                if (mkVar4.M != null) {
                                    mkVar4.f().a = false;
                                }
                                int i17 = e7Var.f;
                                if (mkVar4.M != null || i17 != 0) {
                                    mkVar4.f();
                                    mkVar4.M.f = i17;
                                }
                                mkVar4.f();
                                mkVar4.M.getClass();
                            }
                            switch (jlVar2.a) {
                                case 1:
                                    mkVar4.G(jlVar2.d, jlVar2.e, jlVar2.f, jlVar2.g);
                                    blVar2.V(mkVar4, false);
                                    blVar2.a(mkVar4);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + jlVar2.a);
                                case 3:
                                    mkVar4.G(jlVar2.d, jlVar2.e, jlVar2.f, jlVar2.g);
                                    blVar2.Q(mkVar4);
                                    break;
                                case 4:
                                    mkVar4.G(jlVar2.d, jlVar2.e, jlVar2.f, jlVar2.g);
                                    blVar2.F(mkVar4);
                                    break;
                                case 5:
                                    mkVar4.G(jlVar2.d, jlVar2.e, jlVar2.f, jlVar2.g);
                                    blVar2.V(mkVar4, false);
                                    Z(mkVar4);
                                    break;
                                case 6:
                                    mkVar4.G(jlVar2.d, jlVar2.e, jlVar2.f, jlVar2.g);
                                    blVar2.g(mkVar4);
                                    break;
                                case 7:
                                    mkVar4.G(jlVar2.d, jlVar2.e, jlVar2.f, jlVar2.g);
                                    blVar2.V(mkVar4, false);
                                    blVar2.c(mkVar4);
                                    break;
                                case 8:
                                    blVar2.X(mkVar4);
                                    break;
                                case 9:
                                    blVar2.X(null);
                                    break;
                                case 10:
                                    blVar2.W(mkVar4, jlVar2.i);
                                    break;
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i18 = i; i18 < i2; i18++) {
                    e7 e7Var2 = (e7) arrayList.get(i18);
                    if (booleanValue) {
                        for (int size4 = e7Var2.a.size() - 1; size4 >= 0; size4--) {
                            mk mkVar5 = ((jl) e7Var2.a.get(size4)).b;
                            if (mkVar5 != null) {
                                f(mkVar5).k();
                            }
                        }
                    } else {
                        ArrayList arrayList7 = e7Var2.a;
                        int size5 = arrayList7.size();
                        int i19 = 0;
                        while (i19 < size5) {
                            Object obj2 = arrayList7.get(i19);
                            i19++;
                            mk mkVar6 = ((jl) obj2).b;
                            if (mkVar6 != null) {
                                f(mkVar6).k();
                            }
                        }
                    }
                }
                L(this.s, true);
                HashSet hashSet = new HashSet();
                for (int i20 = i; i20 < i2; i20++) {
                    ArrayList arrayList8 = ((e7) arrayList.get(i20)).a;
                    int size6 = arrayList8.size();
                    int i21 = 0;
                    while (i21 < size6) {
                        Object obj3 = arrayList8.get(i21);
                        i21++;
                        mk mkVar7 = ((jl) obj3).b;
                        if (mkVar7 != null && (viewGroup = mkVar7.I) != null) {
                            hashSet.add(ze.f(viewGroup, E()));
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ze zeVar = (ze) it.next();
                    zeVar.d = booleanValue;
                    synchronized (zeVar.b) {
                        try {
                            zeVar.g();
                            zeVar.e = false;
                            int size7 = zeVar.b.size() - 1;
                            while (true) {
                                if (size7 >= 0) {
                                    k30 k30Var = (k30) zeVar.b.get(size7);
                                    int c = d30.c(k30Var.c.J);
                                    if (k30Var.a != 2 || c == 2) {
                                        size7--;
                                    } else {
                                        kk kkVar = k30Var.c.M;
                                        zeVar.e = false;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    zeVar.c();
                }
                for (int i22 = i; i22 < i2; i22++) {
                    e7 e7Var3 = (e7) arrayList.get(i22);
                    if (((Boolean) arrayList2.get(i22)).booleanValue() && e7Var3.r >= 0) {
                        e7Var3.r = -1;
                    }
                    e7Var3.getClass();
                }
                return;
            }
            e7 e7Var4 = (e7) arrayList.get(i8);
            boolean booleanValue2 = ((Boolean) arrayList2.get(i8)).booleanValue();
            ArrayList arrayList9 = this.K;
            if (booleanValue2) {
                z = z5;
                i3 = i8;
                z2 = z6;
                int i23 = 1;
                ArrayList arrayList10 = e7Var4.a;
                int size8 = arrayList10.size() - 1;
                while (size8 >= 0) {
                    jl jlVar3 = (jl) arrayList10.get(size8);
                    int i24 = jlVar3.a;
                    if (i24 != i23) {
                        if (i24 != 3) {
                            switch (i24) {
                                case 8:
                                    mkVar = null;
                                    break;
                                case 9:
                                    mkVar = jlVar3.b;
                                    break;
                                case 10:
                                    jlVar3.i = jlVar3.h;
                                    break;
                            }
                            size8--;
                            i23 = 1;
                        }
                        arrayList9.add(jlVar3.b);
                        size8--;
                        i23 = 1;
                    }
                    arrayList9.remove(jlVar3.b);
                    size8--;
                    i23 = 1;
                }
            } else {
                ArrayList arrayList11 = e7Var4.a;
                int i25 = 0;
                while (i25 < arrayList11.size()) {
                    jl jlVar4 = (jl) arrayList11.get(i25);
                    int i26 = jlVar4.a;
                    if (i26 != i9) {
                        if (i26 != 2) {
                            if (i26 == 3 || i26 == 6) {
                                z3 = z5;
                                arrayList9.remove(jlVar4.b);
                                mk mkVar8 = jlVar4.b;
                                if (mkVar8 == mkVar) {
                                    arrayList11.add(i25, new jl(9, mkVar8));
                                    i25++;
                                    i5 = i8;
                                    z4 = z6;
                                    i4 = 1;
                                    mkVar = null;
                                }
                            } else if (i26 == 7) {
                                z3 = z5;
                                i4 = 1;
                            } else if (i26 != 8) {
                                z3 = z5;
                            } else {
                                z3 = z5;
                                arrayList11.add(i25, new jl(9, mkVar, 0));
                                jlVar4.c = true;
                                i25++;
                                mkVar = jlVar4.b;
                            }
                            i5 = i8;
                            z4 = z6;
                            i4 = 1;
                        } else {
                            z3 = z5;
                            mk mkVar9 = jlVar4.b;
                            int i27 = mkVar9.B;
                            int size9 = arrayList9.size() - 1;
                            boolean z9 = false;
                            while (size9 >= 0) {
                                int i28 = i8;
                                mk mkVar10 = (mk) arrayList9.get(size9);
                                boolean z10 = z6;
                                if (mkVar10.B != i27) {
                                    i6 = i27;
                                } else if (mkVar10 == mkVar9) {
                                    i6 = i27;
                                    z9 = true;
                                } else {
                                    if (mkVar10 == mkVar) {
                                        i6 = i27;
                                        i7 = 0;
                                        arrayList11.add(i25, new jl(9, mkVar10, 0));
                                        i25++;
                                        mkVar = null;
                                    } else {
                                        i6 = i27;
                                        i7 = 0;
                                    }
                                    jl jlVar5 = new jl(3, mkVar10, i7);
                                    jlVar5.d = jlVar4.d;
                                    jlVar5.f = jlVar4.f;
                                    jlVar5.e = jlVar4.e;
                                    jlVar5.g = jlVar4.g;
                                    arrayList11.add(i25, jlVar5);
                                    arrayList9.remove(mkVar10);
                                    i25++;
                                    mkVar = mkVar;
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
                                jlVar4.a = 1;
                                jlVar4.c = true;
                                arrayList9.add(mkVar9);
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
                    arrayList9.add(jlVar4.b);
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
            z6 = z2 || e7Var4.g;
            i8 = i3 + 1;
            z5 = z;
        }
    }
}
