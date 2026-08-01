package androidx.fragment.app;

import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.n;
import com.awerser.monnit.betplay.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.a2;
import defpackage.cl;
import defpackage.cu;
import defpackage.dl;
import defpackage.gq;
import defpackage.gw;
import defpackage.h2;
import defpackage.h5;
import defpackage.hd;
import defpackage.hq;
import defpackage.hw;
import defpackage.i2;
import defpackage.iq;
import defpackage.iv;
import defpackage.j2;
import defpackage.kk;
import defpackage.kw;
import defpackage.lq;
import defpackage.lv;
import defpackage.lw;
import defpackage.mk;
import defpackage.mw;
import defpackage.n7;
import defpackage.nk;
import defpackage.nq;
import defpackage.nw;
import defpackage.o8;
import defpackage.ok;
import defpackage.pk;
import defpackage.qk;
import defpackage.qw;
import defpackage.r6;
import defpackage.r90;
import defpackage.rk;
import defpackage.rw;
import defpackage.s7;
import defpackage.sk;
import defpackage.tb;
import defpackage.tk;
import defpackage.tw;
import defpackage.ur;
import defpackage.v10;
import defpackage.vg;
import defpackage.vk;
import defpackage.x10;
import defpackage.yk;
import defpackage.zk;
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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class n {
    public h2 A;
    public h2 B;
    public ArrayDeque C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ArrayList K;
    public o L;
    public final n7 M;
    public boolean b;
    public ArrayList d;
    public ArrayList e;
    public lw g;
    public final h5 l;
    public final CopyOnWriteArrayList m;
    public final ok n;
    public final ok o;
    public final ok p;
    public final ok q;
    public final rk r;
    public int s;
    public nk t;
    public mk u;
    public Fragment v;
    public Fragment w;
    public final sk x;
    public final vg y;
    public h2 z;
    public final ArrayList a = new ArrayList();
    public final r c = new r();
    public final m f = new m(this);
    public final qk h = new qk(this);
    public final AtomicInteger i = new AtomicInteger();
    public final Map j = Collections.synchronizedMap(new HashMap());
    public final Map k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [ok] */
    /* JADX WARN: Type inference failed for: r0v13, types: [ok] */
    /* JADX WARN: Type inference failed for: r0v14, types: [ok] */
    /* JADX WARN: Type inference failed for: r0v15, types: [ok] */
    public n() {
        Collections.synchronizedMap(new HashMap());
        this.l = new h5(this);
        this.m = new CopyOnWriteArrayList();
        final int i = 0;
        this.n = new hd(this) { // from class: ok
            public final /* synthetic */ n b;

            {
                this.b = this;
            }

            @Override // defpackage.hd
            public final void accept(Object obj) {
                int i2 = i;
                n nVar = this.b;
                switch (i2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (nVar.I()) {
                            nVar.h(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (nVar.I() && num.intValue() == 80) {
                            nVar.l(false);
                            break;
                        }
                        break;
                    case 2:
                        dv dvVar = (dv) obj;
                        if (nVar.I()) {
                            nVar.m(dvVar.a, false);
                            break;
                        }
                        break;
                    default:
                        gx gxVar = (gx) obj;
                        if (nVar.I()) {
                            nVar.r(gxVar.a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.o = new hd(this) { // from class: ok
            public final /* synthetic */ n b;

            {
                this.b = this;
            }

            @Override // defpackage.hd
            public final void accept(Object obj) {
                int i22 = i2;
                n nVar = this.b;
                switch (i22) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (nVar.I()) {
                            nVar.h(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (nVar.I() && num.intValue() == 80) {
                            nVar.l(false);
                            break;
                        }
                        break;
                    case 2:
                        dv dvVar = (dv) obj;
                        if (nVar.I()) {
                            nVar.m(dvVar.a, false);
                            break;
                        }
                        break;
                    default:
                        gx gxVar = (gx) obj;
                        if (nVar.I()) {
                            nVar.r(gxVar.a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.p = new hd(this) { // from class: ok
            public final /* synthetic */ n b;

            {
                this.b = this;
            }

            @Override // defpackage.hd
            public final void accept(Object obj) {
                int i22 = i3;
                n nVar = this.b;
                switch (i22) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (nVar.I()) {
                            nVar.h(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (nVar.I() && num.intValue() == 80) {
                            nVar.l(false);
                            break;
                        }
                        break;
                    case 2:
                        dv dvVar = (dv) obj;
                        if (nVar.I()) {
                            nVar.m(dvVar.a, false);
                            break;
                        }
                        break;
                    default:
                        gx gxVar = (gx) obj;
                        if (nVar.I()) {
                            nVar.r(gxVar.a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.q = new hd(this) { // from class: ok
            public final /* synthetic */ n b;

            {
                this.b = this;
            }

            @Override // defpackage.hd
            public final void accept(Object obj) {
                int i22 = i4;
                n nVar = this.b;
                switch (i22) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (nVar.I()) {
                            nVar.h(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (nVar.I() && num.intValue() == 80) {
                            nVar.l(false);
                            break;
                        }
                        break;
                    case 2:
                        dv dvVar = (dv) obj;
                        if (nVar.I()) {
                            nVar.m(dvVar.a, false);
                            break;
                        }
                        break;
                    default:
                        gx gxVar = (gx) obj;
                        if (nVar.I()) {
                            nVar.r(gxVar.a, false);
                            break;
                        }
                        break;
                }
            }
        };
        this.r = new rk(this);
        this.s = -1;
        this.x = new sk(this);
        this.y = new vg(23);
        this.C = new ArrayDeque();
        this.M = new n7(7, this);
    }

    public static boolean G(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean H(Fragment fragment) {
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        ArrayList e = fragment.mChildFragmentManager.c.e();
        int size = e.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            Object obj = e.get(i);
            i++;
            Fragment fragment2 = (Fragment) obj;
            if (fragment2 != null) {
                z = H(fragment2);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        n nVar = fragment.mFragmentManager;
        return fragment.equals(nVar.w) && J(nVar.v);
    }

    public static void Y(Fragment fragment) {
        if (G(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public final Fragment A(int i) {
        r rVar = this.c;
        ArrayList arrayList = rVar.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) arrayList.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (q qVar : rVar.b.values()) {
            if (qVar != null) {
                Fragment fragment2 = qVar.c;
                if (fragment2.mFragmentId == i) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final Fragment B(String str) {
        r rVar = this.c;
        ArrayList arrayList = rVar.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) arrayList.get(size);
            if (fragment != null && str.equals(fragment.mTag)) {
                return fragment;
            }
        }
        for (q qVar : rVar.b.values()) {
            if (qVar != null) {
                Fragment fragment2 = qVar.c;
                if (str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final ViewGroup C(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId <= 0 || !this.u.n()) {
            return null;
        }
        View m = this.u.m(fragment.mContainerId);
        if (m instanceof ViewGroup) {
            return (ViewGroup) m;
        }
        return null;
    }

    public final sk D() {
        Fragment fragment = this.v;
        return fragment != null ? fragment.mFragmentManager.D() : this.x;
    }

    public final vg E() {
        Fragment fragment = this.v;
        return fragment != null ? fragment.mFragmentManager.E() : this.y;
    }

    public final void F(Fragment fragment) {
        if (G(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        X(fragment);
    }

    public final boolean I() {
        Fragment fragment = this.v;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.v.getParentFragmentManager().I();
    }

    public final void K(int i, boolean z) {
        nk nkVar;
        if (this.t == null && i != -1) {
            o8.t("No activity");
            return;
        }
        if (z || i != this.s) {
            this.s = i;
            r rVar = this.c;
            HashMap hashMap = rVar.b;
            ArrayList arrayList = rVar.a;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                q qVar = (q) hashMap.get(((Fragment) obj).mWho);
                if (qVar != null) {
                    qVar.j();
                }
            }
            for (q qVar2 : hashMap.values()) {
                if (qVar2 != null) {
                    qVar2.j();
                    Fragment fragment = qVar2.c;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        if (fragment.mBeingSaved && !rVar.c.containsKey(fragment.mWho)) {
                            qVar2.m();
                        }
                        rVar.h(qVar2);
                    }
                }
            }
            ArrayList d = rVar.d();
            int size2 = d.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = d.get(i3);
                i3++;
                q qVar3 = (q) obj2;
                Fragment fragment2 = qVar3.c;
                if (fragment2.mDeferStart) {
                    if (this.b) {
                        this.H = true;
                    } else {
                        fragment2.mDeferStart = false;
                        qVar3.j();
                    }
                }
            }
            if (this.D && (nkVar = this.t) != null && this.s == 7) {
                ((kk) nkVar).j.invalidateOptionsMenu();
                this.D = false;
            }
        }
    }

    public final void L() {
        if (this.t == null) {
            return;
        }
        this.E = false;
        this.F = false;
        this.L.i = false;
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final boolean M() {
        return N(-1, 0);
    }

    public final boolean N(int i, int i2) {
        x(false);
        w(true);
        Fragment fragment = this.w;
        if (fragment != null && i < 0 && fragment.getChildFragmentManager().M()) {
            return true;
        }
        boolean O = O(this.I, this.J, i, i2);
        if (O) {
            this.b = true;
            try {
                Q(this.I, this.J);
            } finally {
                d();
            }
        }
        a0();
        boolean z = this.H;
        r rVar = this.c;
        if (z) {
            this.H = false;
            ArrayList d = rVar.d();
            int size = d.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = d.get(i3);
                i3++;
                q qVar = (q) obj;
                Fragment fragment2 = qVar.c;
                if (fragment2.mDeferStart) {
                    if (this.b) {
                        this.H = true;
                    } else {
                        fragment2.mDeferStart = false;
                        qVar.j();
                    }
                }
            }
        }
        rVar.b.values().removeAll(Collections.singleton(null));
        return O;
    }

    public final boolean O(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        ArrayList arrayList3 = this.d;
        int i3 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                i3 = z ? 0 : this.d.size() - 1;
            } else {
                int size = this.d.size() - 1;
                while (size >= 0) {
                    a aVar = (a) this.d.get(size);
                    if (i >= 0 && i == aVar.r) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    i3 = size;
                } else if (z) {
                    i3 = size;
                    while (i3 > 0) {
                        a aVar2 = (a) this.d.get(i3 - 1);
                        if (i < 0 || i != aVar2.r) {
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
            arrayList.add((a) this.d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void P(Fragment fragment) {
        if (G(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean isInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && isInBackStack) {
            return;
        }
        r rVar = this.c;
        synchronized (rVar.a) {
            rVar.a.remove(fragment);
        }
        fragment.mAdded = false;
        if (H(fragment)) {
            this.D = true;
        }
        fragment.mRemoving = true;
        X(fragment);
    }

    public final void Q(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            o8.t("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((a) arrayList.get(i)).o) {
                if (i2 != i) {
                    z(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((a) arrayList.get(i2)).o) {
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

    public final void R(Parcelable parcelable) {
        h5 h5Var;
        int i;
        boolean z;
        int i2;
        q qVar;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.t.g.getClassLoader());
                this.k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.t.g.getClassLoader());
                arrayList.add((p) bundle.getParcelable("state"));
            }
        }
        r rVar = this.c;
        HashMap hashMap = rVar.c;
        HashMap hashMap2 = rVar.b;
        hashMap.clear();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            p pVar = (p) obj;
            hashMap.put(pVar.g, pVar);
        }
        yk ykVar = (yk) bundle3.getParcelable("state");
        if (ykVar == null) {
            return;
        }
        hashMap2.clear();
        ArrayList arrayList2 = ykVar.f;
        int size2 = arrayList2.size();
        int i4 = 0;
        while (true) {
            h5Var = this.l;
            i = 2;
            if (i4 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i4);
            i4++;
            p pVar2 = (p) rVar.c.remove((String) obj2);
            if (pVar2 != null) {
                Fragment fragment = (Fragment) this.L.d.get(pVar2.g);
                if (fragment != null) {
                    if (G(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                    }
                    qVar = new q(h5Var, rVar, fragment, pVar2);
                } else {
                    qVar = new q(this.l, this.c, this.t.g.getClassLoader(), D(), pVar2);
                }
                Fragment fragment2 = qVar.c;
                fragment2.mFragmentManager = this;
                if (G(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragment2.mWho + "): " + fragment2);
                }
                qVar.k(this.t.g.getClassLoader());
                rVar.g(qVar);
                qVar.e = this.s;
            }
        }
        o oVar = this.L;
        oVar.getClass();
        ArrayList arrayList3 = new ArrayList(oVar.d.values());
        int size3 = arrayList3.size();
        int i5 = 0;
        while (true) {
            z = true;
            if (i5 >= size3) {
                break;
            }
            Object obj3 = arrayList3.get(i5);
            i5++;
            Fragment fragment3 = (Fragment) obj3;
            if (hashMap2.get(fragment3.mWho) == null) {
                if (G(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + ykVar.f);
                }
                this.L.f(fragment3);
                fragment3.mFragmentManager = this;
                q qVar2 = new q(h5Var, rVar, fragment3);
                qVar2.e = 1;
                qVar2.j();
                fragment3.mRemoving = true;
                qVar2.j();
            }
        }
        ArrayList arrayList4 = ykVar.g;
        rVar.a.clear();
        if (arrayList4 != null) {
            int size4 = arrayList4.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList4.get(i6);
                i6++;
                String str3 = (String) obj4;
                Fragment b = rVar.b(str3);
                if (b == null) {
                    o8.r(str3, ")", "No instantiated fragment for (");
                    return;
                }
                if (G(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + b);
                }
                rVar.a(b);
            }
        }
        if (ykVar.h != null) {
            this.d = new ArrayList(ykVar.h.length);
            int i7 = 0;
            while (true) {
                b[] bVarArr = ykVar.h;
                if (i7 >= bVarArr.length) {
                    break;
                }
                b bVar = bVarArr[i7];
                ArrayList arrayList5 = bVar.g;
                a aVar = new a(this);
                int[] iArr = bVar.f;
                int i8 = 0;
                int i9 = 0;
                while (i8 < iArr.length) {
                    dl dlVar = new dl();
                    int i10 = i8 + 1;
                    int i11 = i;
                    dlVar.a = iArr[i8];
                    if (G(i11)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i9 + " base fragment #" + iArr[i10]);
                    }
                    dlVar.h = hq.values()[bVar.h[i9]];
                    dlVar.i = hq.values()[bVar.i[i9]];
                    int i12 = i8 + 2;
                    dlVar.c = iArr[i10] != 0 ? z : false;
                    int i13 = iArr[i12];
                    dlVar.d = i13;
                    int i14 = iArr[i8 + 3];
                    dlVar.e = i14;
                    int i15 = i8 + 5;
                    int i16 = iArr[i8 + 4];
                    dlVar.f = i16;
                    i8 += 6;
                    int[] iArr2 = iArr;
                    int i17 = iArr2[i15];
                    dlVar.g = i17;
                    aVar.b = i13;
                    aVar.c = i14;
                    aVar.d = i16;
                    aVar.e = i17;
                    aVar.b(dlVar);
                    i9++;
                    i = i11;
                    iArr = iArr2;
                    z = true;
                }
                int i18 = i;
                aVar.f = bVar.j;
                aVar.h = bVar.k;
                aVar.g = true;
                aVar.i = bVar.m;
                aVar.j = bVar.n;
                aVar.k = bVar.o;
                aVar.l = bVar.p;
                aVar.m = bVar.q;
                aVar.n = bVar.r;
                aVar.o = bVar.s;
                aVar.r = bVar.l;
                for (int i19 = 0; i19 < arrayList5.size(); i19++) {
                    String str4 = (String) arrayList5.get(i19);
                    if (str4 != null) {
                        ((dl) aVar.a.get(i19)).b = rVar.b(str4);
                    }
                }
                aVar.d(1);
                if (G(i18)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i7 + " (index " + aVar.r + "): " + aVar);
                    PrintWriter printWriter = new PrintWriter(new ur());
                    aVar.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(aVar);
                i7++;
                i = i18;
                z = true;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.d = null;
        }
        this.i.set(ykVar.i);
        String str5 = ykVar.j;
        if (str5 != null) {
            Fragment b2 = rVar.b(str5);
            this.w = b2;
            q(b2);
        }
        ArrayList arrayList6 = ykVar.k;
        if (arrayList6 != null) {
            while (i2 < arrayList6.size()) {
                this.j.put((String) arrayList6.get(i2), (s7) ykVar.l.get(i2));
                i2++;
            }
        }
        this.C = new ArrayDeque(ykVar.m);
    }

    public final Bundle S() {
        int i;
        ArrayList arrayList;
        b[] bVarArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            f fVar = (f) it.next();
            if (fVar.e) {
                if (G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                fVar.e = false;
                fVar.d();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((f) it2.next()).g();
        }
        x(true);
        this.E = true;
        this.L.i = true;
        r rVar = this.c;
        rVar.getClass();
        HashMap hashMap = rVar.b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (q qVar : hashMap.values()) {
            if (qVar != null) {
                Fragment fragment = qVar.c;
                qVar.m();
                arrayList2.add(fragment.mWho);
                if (G(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragment.mSavedFragmentState);
                }
            }
        }
        r rVar2 = this.c;
        rVar2.getClass();
        ArrayList arrayList3 = new ArrayList(rVar2.c.values());
        if (!arrayList3.isEmpty()) {
            r rVar3 = this.c;
            synchronized (rVar3.a) {
                try {
                    if (rVar3.a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(rVar3.a.size());
                        ArrayList arrayList4 = rVar3.a;
                        int size2 = arrayList4.size();
                        int i2 = 0;
                        while (i2 < size2) {
                            Object obj = arrayList4.get(i2);
                            i2++;
                            Fragment fragment2 = (Fragment) obj;
                            arrayList.add(fragment2.mWho);
                            if (G(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment2.mWho + "): " + fragment2);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList5 = this.d;
            if (arrayList5 == null || (size = arrayList5.size()) <= 0) {
                bVarArr = null;
            } else {
                bVarArr = new b[size];
                for (int i3 = 0; i3 < size; i3++) {
                    bVarArr[i3] = new b((a) this.d.get(i3));
                    if (G(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i3 + ": " + this.d.get(i3));
                    }
                }
            }
            yk ykVar = new yk();
            ykVar.j = null;
            ArrayList arrayList6 = new ArrayList();
            ykVar.k = arrayList6;
            ArrayList arrayList7 = new ArrayList();
            ykVar.l = arrayList7;
            ykVar.f = arrayList2;
            ykVar.g = arrayList;
            ykVar.h = bVarArr;
            ykVar.i = this.i.get();
            Fragment fragment3 = this.w;
            if (fragment3 != null) {
                ykVar.j = fragment3.mWho;
            }
            arrayList6.addAll(this.j.keySet());
            arrayList7.addAll(this.j.values());
            ykVar.m = new ArrayList(this.C);
            bundle.putParcelable("state", ykVar);
            for (String str : this.k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.k.get(str));
            }
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj2 = arrayList3.get(i);
                i++;
                p pVar = (p) obj2;
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", pVar);
                bundle.putBundle("fragment_" + pVar.g, bundle2);
            }
        } else if (G(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final void T() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.t.h.removeCallbacks(this.M);
                    this.t.h.post(this.M);
                    a0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void U(Fragment fragment, boolean z) {
        ViewGroup C = C(fragment);
        if (C == null || !(C instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) C).setDrawDisappearingViewsLast(!z);
    }

    public final void V(Fragment fragment, hq hqVar) {
        if (fragment.equals(this.c.b(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = hqVar;
        } else {
            o8.n("Fragment ", fragment, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final void W(Fragment fragment) {
        if (fragment != null) {
            if (!fragment.equals(this.c.b(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
                o8.n("Fragment ", fragment, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        Fragment fragment2 = this.w;
        this.w = fragment;
        q(fragment2);
        q(this.w);
    }

    public final void X(Fragment fragment) {
        ViewGroup C = C(fragment);
        if (C != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (C.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    C.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) C.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final void Z(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new ur());
        nk nkVar = this.t;
        if (nkVar == null) {
            try {
                u("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            ((kk) nkVar).j.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw illegalStateException;
        }
    }

    public final q a(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            cl.c(fragment, str);
        }
        if (G(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        q f = f(fragment);
        fragment.mFragmentManager = this;
        r rVar = this.c;
        rVar.g(f);
        if (!fragment.mDetached) {
            rVar.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (H(fragment)) {
                this.D = true;
            }
        }
        return f;
    }

    public final void a0() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    this.h.a(true);
                    return;
                }
                qk qkVar = this.h;
                ArrayList arrayList = this.d;
                qkVar.a((arrayList != null ? arrayList.size() : 0) > 0 && J(this.v));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.activity.OnBackPressedDispatcher$addCallback$observer$1, mq] */
    public final void b(nk nkVar, mk mkVar, Fragment fragment) {
        String str;
        if (this.t != null) {
            o8.t("Already attached");
            return;
        }
        this.t = nkVar;
        this.u = mkVar;
        this.v = fragment;
        CopyOnWriteArrayList copyOnWriteArrayList = this.m;
        if (fragment != null) {
            copyOnWriteArrayList.add(new tk(fragment));
        } else if (nkVar instanceof zk) {
            copyOnWriteArrayList.add((zk) nkVar);
        }
        if (this.v != null) {
            a0();
        }
        int i = 0;
        if (nkVar instanceof mw) {
            mw mwVar = (mw) nkVar;
            final lw onBackPressedDispatcher = mwVar.getOnBackPressedDispatcher();
            this.g = onBackPressedDispatcher;
            Fragment fragment2 = mwVar;
            if (fragment != null) {
                fragment2 = fragment;
            }
            onBackPressedDispatcher.getClass();
            qk qkVar = this.h;
            qkVar.getClass();
            final iq lifecycle = fragment2.getLifecycle();
            if (((androidx.lifecycle.a) lifecycle).c != hq.f) {
                final gw gwVar = new gw(qkVar, new hw(qkVar, fragment2));
                qkVar.a.add(gwVar);
                gwVar.b(false);
                iv ivVar = onBackPressedDispatcher.a().c;
                ivVar.getClass();
                if (ivVar.c.add(gwVar)) {
                    lv lvVar = ivVar.b;
                    lvVar.getClass();
                    if (gwVar.c != null) {
                        o8.u(gwVar, "' is already registered with a dispatcher", "Handler '");
                        return;
                    } else {
                        lvVar.e.addFirst(gwVar);
                        gwVar.c = ivVar;
                        lvVar.b();
                    }
                }
                final ?? r4 = new lq(onBackPressedDispatcher, lifecycle) { // from class: androidx.activity.OnBackPressedDispatcher$addCallback$observer$1
                    public final /* synthetic */ iq b;

                    {
                        this.b = lifecycle;
                    }

                    @Override // defpackage.lq
                    public final void b(nq nqVar, gq gqVar) {
                        int i2 = kw.a[gqVar.ordinal()];
                        gw gwVar2 = gw.this;
                        if (i2 == 1) {
                            gwVar2.b(true);
                            return;
                        }
                        if (i2 == 2) {
                            gwVar2.b(false);
                        } else {
                            if (i2 != 3) {
                                return;
                            }
                            gwVar2.a();
                            this.b.b(this);
                        }
                    }
                };
                lifecycle.a(r4);
                qkVar.c.add(new AutoCloseable() { // from class: iw
                    @Override // java.lang.AutoCloseable
                    public final void close() {
                        iq.this.b(r4);
                    }
                });
            }
        }
        if (fragment != null) {
            o oVar = fragment.mFragmentManager.L;
            HashMap hashMap = oVar.e;
            o oVar2 = (o) hashMap.get(fragment.mWho);
            if (oVar2 == null) {
                oVar2 = new o(oVar.g);
                hashMap.put(fragment.mWho, oVar2);
            }
            this.L = oVar2;
        } else if (nkVar instanceof r90) {
            r6 r6Var = new r6(((r90) nkVar).getViewModelStore(), o.j);
            String canonicalName = o.class.getCanonicalName();
            if (canonicalName == null) {
                o8.j("Local and anonymous classes can not be ViewModels");
                return;
            }
            this.L = (o) r6Var.g("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), o.class);
        } else {
            this.L = new o(false);
        }
        o oVar3 = this.L;
        int i2 = 1;
        oVar3.i = this.E || this.F;
        this.c.d = oVar3;
        Object obj = this.t;
        int i3 = 2;
        if ((obj instanceof x10) && fragment == null) {
            v10 savedStateRegistry = ((x10) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new tb(i3, this));
            Bundle a = savedStateRegistry.a("android:support:fragments");
            if (a != null) {
                R(a);
            }
        }
        Object obj2 = this.t;
        if (obj2 instanceof j2) {
            i2 i4 = ((j2) obj2).i();
            if (fragment != null) {
                str = fragment.mWho + ":";
            } else {
                str = "";
            }
            String concat = "FragmentManager:".concat(str);
            this.z = i4.c(concat.concat("StartActivityForResult"), new a2(i2), new pk(this, i2));
            this.A = i4.c(concat.concat("StartIntentSenderForResult"), new a2(i3), new pk(this, i3));
            this.B = i4.c(concat.concat("RequestPermissions"), new a2(i), new pk(this, i));
        }
        Object obj3 = this.t;
        if (obj3 instanceof nw) {
            ((nw) obj3).c(this.n);
        }
        Object obj4 = this.t;
        if (obj4 instanceof tw) {
            ((tw) obj4).h(this.o);
        }
        Object obj5 = this.t;
        if (obj5 instanceof qw) {
            ((qw) obj5).f(this.p);
        }
        Object obj6 = this.t;
        if (obj6 instanceof rw) {
            ((rw) obj6).e(this.q);
        }
        Object obj7 = this.t;
        if ((obj7 instanceof cu) && fragment == null) {
            ((cu) obj7).g(this.r);
        }
    }

    public final void c(Fragment fragment) {
        if (G(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.c.a(fragment);
            if (G(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (H(fragment)) {
                this.D = true;
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
            ViewGroup viewGroup = ((q) obj).c.mContainer;
            if (viewGroup != null) {
                hashSet.add(f.h(viewGroup, E()));
            }
        }
        return hashSet;
    }

    public final q f(Fragment fragment) {
        String str = fragment.mWho;
        r rVar = this.c;
        q qVar = (q) rVar.b.get(str);
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(this.l, rVar, fragment);
        qVar2.k(this.t.g.getClassLoader());
        qVar2.e = this.s;
        return qVar2;
    }

    public final void g(Fragment fragment) {
        if (G(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (G(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            r rVar = this.c;
            synchronized (rVar.a) {
                rVar.a.remove(fragment);
            }
            fragment.mAdded = false;
            if (H(fragment)) {
                this.D = true;
            }
            X(fragment);
        }
    }

    public final void h(boolean z, Configuration configuration) {
        if (z && (this.t instanceof nw)) {
            Z(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z) {
                    fragment.mChildFragmentManager.h(true, configuration);
                }
            }
        }
    }

    public final boolean i(MenuItem menuItem) {
        if (this.s < 1) {
            return false;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(Menu menu, MenuInflater menuInflater) {
        if (this.s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                Fragment fragment2 = (Fragment) this.e.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
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
        x(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((f) it.next()).g();
        }
        nk nkVar = this.t;
        boolean z2 = nkVar instanceof r90;
        r rVar = this.c;
        if (z2) {
            z = rVar.d.h;
        } else {
            z = nkVar.g != null ? !r1.isChangingConfigurations() : true;
        }
        int i = 0;
        if (z) {
            Iterator it2 = this.j.values().iterator();
            while (it2.hasNext()) {
                ArrayList arrayList = ((s7) it2.next()).f;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    String str = (String) obj;
                    o oVar = rVar.d;
                    oVar.getClass();
                    if (G(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    oVar.e(str);
                }
            }
        }
        t(-1);
        Object obj2 = this.t;
        if (obj2 instanceof tw) {
            ((tw) obj2).j(this.o);
        }
        Object obj3 = this.t;
        if (obj3 instanceof nw) {
            ((nw) obj3).d(this.n);
        }
        Object obj4 = this.t;
        if (obj4 instanceof qw) {
            ((qw) obj4).l(this.p);
        }
        Object obj5 = this.t;
        if (obj5 instanceof rw) {
            ((rw) obj5).k(this.q);
        }
        Object obj6 = this.t;
        if (obj6 instanceof cu) {
            ((cu) obj6).a(this.r);
        }
        this.t = null;
        this.u = null;
        this.v = null;
        if (this.g != null) {
            qk qkVar = this.h;
            ArrayList arrayList2 = qkVar.a;
            CopyOnWriteArrayList copyOnWriteArrayList = qkVar.c;
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
                        boolean z3 = false;
                        while (!isTerminated) {
                            try {
                                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z3) {
                                    executorService.shutdownNow();
                                    z3 = true;
                                }
                            }
                        }
                        if (z3) {
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
                Object obj7 = arrayList2.get(i);
                i++;
                ((gw) obj7).a();
            }
            arrayList2.clear();
            this.g = null;
        }
        h2 h2Var = this.z;
        if (h2Var != null) {
            h2Var.b();
            this.A.b();
            this.B.b();
        }
    }

    public final void l(boolean z) {
        if (z && (this.t instanceof tw)) {
            Z(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z) {
                    fragment.mChildFragmentManager.l(true);
                }
            }
        }
    }

    public final void m(boolean z, boolean z2) {
        if (z2 && (this.t instanceof qw)) {
            Z(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.m(z, true);
                }
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
            Fragment fragment = (Fragment) obj;
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.n();
            }
        }
    }

    public final boolean o(MenuItem menuItem) {
        if (this.s < 1) {
            return false;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void p(Menu menu) {
        if (this.s < 1) {
            return;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void q(Fragment fragment) {
        if (fragment != null) {
            if (fragment.equals(this.c.b(fragment.mWho))) {
                fragment.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void r(boolean z, boolean z2) {
        if (z2 && (this.t instanceof rw)) {
            Z(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.r(z, true);
                }
            }
        }
    }

    public final boolean s(Menu menu) {
        boolean z = false;
        if (this.s < 1) {
            return false;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final void t(int i) {
        try {
            this.b = true;
            for (q qVar : this.c.b.values()) {
                if (qVar != null) {
                    qVar.e = i;
                }
            }
            K(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((f) it.next()).g();
            }
            this.b = false;
            x(true);
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
        Fragment fragment = this.v;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.v)));
            sb.append("}");
        } else {
            nk nkVar = this.t;
            if (nkVar != null) {
                sb.append(nkVar.getClass().getSimpleName());
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

    public final void u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        r rVar = this.c;
        ArrayList arrayList = rVar.a;
        String str3 = str + "    ";
        HashMap hashMap = rVar.b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (q qVar : hashMap.values()) {
                printWriter.print(str);
                if (qVar != null) {
                    Fragment fragment = qVar.c;
                    printWriter.println(fragment);
                    fragment.dump(str3, fileDescriptor, printWriter, strArr);
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
                Fragment fragment2 = (Fragment) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                Fragment fragment3 = (Fragment) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                a aVar = (a) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.f(str2, printWriter, true);
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
                        Object obj = (vk) this.a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
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

    public final void v(vk vkVar, boolean z) {
        if (!z) {
            if (this.t == null) {
                if (this.G) {
                    o8.t("FragmentManager has been destroyed");
                    return;
                } else {
                    o8.t("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (this.E || this.F) {
                o8.t("Can not perform this action after onSaveInstanceState");
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
                    this.a.add(vkVar);
                    T();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(boolean z) {
        if (this.b) {
            o8.t("FragmentManager is already executing transactions");
            return;
        }
        if (this.t == null) {
            if (this.G) {
                o8.t("FragmentManager has been destroyed");
                return;
            } else {
                o8.t("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.t.h.getLooper()) {
            o8.t("Must be called from main thread of fragment host");
            return;
        }
        if (!z && (this.E || this.F)) {
            o8.t("Can not perform this action after onSaveInstanceState");
        } else if (this.I == null) {
            this.I = new ArrayList();
            this.J = new ArrayList();
        }
    }

    public final boolean x(boolean z) {
        boolean z2;
        ArrayList arrayList;
        w(z);
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
                            z2 |= ((vk) arrayList.get(i)).a(arrayList2, arrayList3);
                            i++;
                        }
                        arrayList.clear();
                        this.t.h.removeCallbacks(this.M);
                    } finally {
                    }
                }
            }
            if (!z2) {
                break;
            }
            this.b = true;
            try {
                Q(this.I, this.J);
                d();
                z3 = true;
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        a0();
        if (this.H) {
            this.H = false;
            ArrayList d = this.c.d();
            int size2 = d.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj = d.get(i2);
                i2++;
                q qVar = (q) obj;
                Fragment fragment = qVar.c;
                if (fragment.mDeferStart) {
                    if (this.b) {
                        this.H = true;
                    } else {
                        fragment.mDeferStart = false;
                        qVar.j();
                    }
                }
            }
        }
        this.c.b.values().removeAll(Collections.singleton(null));
        return z3;
    }

    public final void y(a aVar, boolean z) {
        if (z && (this.t == null || this.G)) {
            return;
        }
        w(z);
        aVar.a(this.I, this.J);
        this.b = true;
        try {
            Q(this.I, this.J);
            d();
            a0();
            boolean z2 = this.H;
            r rVar = this.c;
            if (z2) {
                this.H = false;
                ArrayList d = rVar.d();
                int size = d.size();
                int i = 0;
                while (i < size) {
                    Object obj = d.get(i);
                    i++;
                    q qVar = (q) obj;
                    Fragment fragment = qVar.c;
                    if (fragment.mDeferStart) {
                        if (this.b) {
                            this.H = true;
                        } else {
                            fragment.mDeferStart = false;
                            qVar.j();
                        }
                    }
                }
            }
            rVar.b.values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            d();
            throw th;
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
        boolean z6 = ((a) arrayList.get(i)).o;
        ArrayList arrayList3 = this.K;
        if (arrayList3 == null) {
            this.K = new ArrayList();
        } else {
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.K;
        r rVar = this.c;
        arrayList4.addAll(rVar.f());
        Fragment fragment = this.w;
        int i7 = i;
        boolean z7 = false;
        while (true) {
            int i8 = 1;
            if (i7 >= i2) {
                boolean z8 = z6;
                this.K.clear();
                if (!z8 && this.s >= 1) {
                    for (int i9 = i; i9 < i2; i9++) {
                        ArrayList arrayList5 = ((a) arrayList.get(i9)).a;
                        int size = arrayList5.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList5.get(i10);
                            i10++;
                            Fragment fragment2 = ((dl) obj).b;
                            if (fragment2 != null && fragment2.mFragmentManager != null) {
                                rVar.g(f(fragment2));
                            }
                        }
                    }
                }
                for (int i11 = i; i11 < i2; i11++) {
                    a aVar = (a) arrayList.get(i11);
                    if (((Boolean) arrayList2.get(i11)).booleanValue()) {
                        aVar.d(-1);
                        n nVar = aVar.p;
                        ArrayList arrayList6 = aVar.a;
                        boolean z9 = true;
                        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
                            dl dlVar = (dl) arrayList6.get(size2);
                            Fragment fragment3 = dlVar.b;
                            if (fragment3 != null) {
                                fragment3.mBeingSaved = false;
                                fragment3.setPopDirection(z9);
                                int i12 = aVar.f;
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
                                fragment3.setNextTransition(i13);
                                fragment3.setSharedElementNames(aVar.n, aVar.m);
                            }
                            switch (dlVar.a) {
                                case 1:
                                    fragment3.setAnimations(dlVar.d, dlVar.e, dlVar.f, dlVar.g);
                                    z9 = true;
                                    nVar.U(fragment3, true);
                                    nVar.P(fragment3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + dlVar.a);
                                case 3:
                                    fragment3.setAnimations(dlVar.d, dlVar.e, dlVar.f, dlVar.g);
                                    nVar.a(fragment3);
                                    z9 = true;
                                case 4:
                                    fragment3.setAnimations(dlVar.d, dlVar.e, dlVar.f, dlVar.g);
                                    nVar.getClass();
                                    Y(fragment3);
                                    z9 = true;
                                case BottomSheetBehavior.STATE_HIDDEN /* 5 */:
                                    fragment3.setAnimations(dlVar.d, dlVar.e, dlVar.f, dlVar.g);
                                    nVar.U(fragment3, true);
                                    nVar.F(fragment3);
                                    z9 = true;
                                case BottomSheetBehavior.STATE_HALF_EXPANDED /* 6 */:
                                    fragment3.setAnimations(dlVar.d, dlVar.e, dlVar.f, dlVar.g);
                                    nVar.c(fragment3);
                                    z9 = true;
                                case 7:
                                    fragment3.setAnimations(dlVar.d, dlVar.e, dlVar.f, dlVar.g);
                                    nVar.U(fragment3, true);
                                    nVar.g(fragment3);
                                    z9 = true;
                                case BottomSheetBehavior.SAVE_SKIP_COLLAPSED /* 8 */:
                                    nVar.W(null);
                                    z9 = true;
                                case 9:
                                    nVar.W(fragment3);
                                    z9 = true;
                                case 10:
                                    nVar.V(fragment3, dlVar.h);
                                    z9 = true;
                            }
                        }
                    } else {
                        aVar.d(1);
                        n nVar2 = aVar.p;
                        ArrayList arrayList7 = aVar.a;
                        int size3 = arrayList7.size();
                        for (int i15 = 0; i15 < size3; i15++) {
                            dl dlVar2 = (dl) arrayList7.get(i15);
                            Fragment fragment4 = dlVar2.b;
                            if (fragment4 != null) {
                                fragment4.mBeingSaved = false;
                                fragment4.setPopDirection(false);
                                fragment4.setNextTransition(aVar.f);
                                fragment4.setSharedElementNames(aVar.m, aVar.n);
                            }
                            switch (dlVar2.a) {
                                case 1:
                                    fragment4.setAnimations(dlVar2.d, dlVar2.e, dlVar2.f, dlVar2.g);
                                    nVar2.U(fragment4, false);
                                    nVar2.a(fragment4);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + dlVar2.a);
                                case 3:
                                    fragment4.setAnimations(dlVar2.d, dlVar2.e, dlVar2.f, dlVar2.g);
                                    nVar2.P(fragment4);
                                case 4:
                                    fragment4.setAnimations(dlVar2.d, dlVar2.e, dlVar2.f, dlVar2.g);
                                    nVar2.F(fragment4);
                                case BottomSheetBehavior.STATE_HIDDEN /* 5 */:
                                    fragment4.setAnimations(dlVar2.d, dlVar2.e, dlVar2.f, dlVar2.g);
                                    nVar2.U(fragment4, false);
                                    Y(fragment4);
                                case BottomSheetBehavior.STATE_HALF_EXPANDED /* 6 */:
                                    fragment4.setAnimations(dlVar2.d, dlVar2.e, dlVar2.f, dlVar2.g);
                                    nVar2.g(fragment4);
                                case 7:
                                    fragment4.setAnimations(dlVar2.d, dlVar2.e, dlVar2.f, dlVar2.g);
                                    nVar2.U(fragment4, false);
                                    nVar2.c(fragment4);
                                case BottomSheetBehavior.SAVE_SKIP_COLLAPSED /* 8 */:
                                    nVar2.W(fragment4);
                                case 9:
                                    nVar2.W(null);
                                case 10:
                                    nVar2.V(fragment4, dlVar2.i);
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i16 = i; i16 < i2; i16++) {
                    a aVar2 = (a) arrayList.get(i16);
                    if (booleanValue) {
                        for (int size4 = aVar2.a.size() - 1; size4 >= 0; size4--) {
                            Fragment fragment5 = ((dl) aVar2.a.get(size4)).b;
                            if (fragment5 != null) {
                                f(fragment5).j();
                            }
                        }
                    } else {
                        ArrayList arrayList8 = aVar2.a;
                        int size5 = arrayList8.size();
                        int i17 = 0;
                        while (i17 < size5) {
                            Object obj2 = arrayList8.get(i17);
                            i17++;
                            Fragment fragment6 = ((dl) obj2).b;
                            if (fragment6 != null) {
                                f(fragment6).j();
                            }
                        }
                    }
                }
                K(this.s, true);
                HashSet hashSet = new HashSet();
                for (int i18 = i; i18 < i2; i18++) {
                    ArrayList arrayList9 = ((a) arrayList.get(i18)).a;
                    int size6 = arrayList9.size();
                    int i19 = 0;
                    while (i19 < size6) {
                        Object obj3 = arrayList9.get(i19);
                        i19++;
                        Fragment fragment7 = ((dl) obj3).b;
                        if (fragment7 != null && (viewGroup = fragment7.mContainer) != null) {
                            hashSet.add(f.h(viewGroup, E()));
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    f fVar = (f) it.next();
                    fVar.d = booleanValue;
                    fVar.j();
                    fVar.d();
                }
                for (int i20 = i; i20 < i2; i20++) {
                    a aVar3 = (a) arrayList.get(i20);
                    if (((Boolean) arrayList2.get(i20)).booleanValue() && aVar3.r >= 0) {
                        aVar3.r = -1;
                    }
                    aVar3.getClass();
                }
                return;
            }
            a aVar4 = (a) arrayList.get(i7);
            boolean booleanValue2 = ((Boolean) arrayList2.get(i7)).booleanValue();
            ArrayList arrayList10 = this.K;
            if (booleanValue2) {
                z = z6;
                i3 = i7;
                z2 = z7;
                int i21 = 1;
                ArrayList arrayList11 = aVar4.a;
                int size7 = arrayList11.size() - 1;
                while (size7 >= 0) {
                    dl dlVar3 = (dl) arrayList11.get(size7);
                    int i22 = dlVar3.a;
                    if (i22 != i21) {
                        if (i22 != 3) {
                            switch (i22) {
                                case BottomSheetBehavior.SAVE_SKIP_COLLAPSED /* 8 */:
                                    fragment = null;
                                    break;
                                case 9:
                                    fragment = dlVar3.b;
                                    break;
                                case 10:
                                    dlVar3.i = dlVar3.h;
                                    break;
                            }
                            size7--;
                            i21 = 1;
                        }
                        arrayList10.add(dlVar3.b);
                        size7--;
                        i21 = 1;
                    }
                    arrayList10.remove(dlVar3.b);
                    size7--;
                    i21 = 1;
                }
            } else {
                ArrayList arrayList12 = aVar4.a;
                int i23 = 0;
                while (i23 < arrayList12.size()) {
                    dl dlVar4 = (dl) arrayList12.get(i23);
                    int i24 = dlVar4.a;
                    if (i24 != i8) {
                        z3 = z6;
                        if (i24 != 2) {
                            if (i24 == 3 || i24 == 6) {
                                arrayList10.remove(dlVar4.b);
                                Fragment fragment8 = dlVar4.b;
                                if (fragment8 == fragment) {
                                    arrayList12.add(i23, new dl(fragment8, 9));
                                    i23++;
                                    i5 = i7;
                                    z4 = z7;
                                    i4 = 1;
                                    fragment = null;
                                }
                            } else if (i24 == 7) {
                                i4 = 1;
                            } else if (i24 == 8) {
                                arrayList12.add(i23, new dl(9, fragment, 0));
                                dlVar4.c = true;
                                i23++;
                                fragment = dlVar4.b;
                            }
                            i5 = i7;
                            z4 = z7;
                            i4 = 1;
                        } else {
                            Fragment fragment9 = dlVar4.b;
                            int i25 = fragment9.mContainerId;
                            int size8 = arrayList10.size() - 1;
                            boolean z10 = false;
                            while (size8 >= 0) {
                                int i26 = size8;
                                Fragment fragment10 = (Fragment) arrayList10.get(size8);
                                int i27 = i7;
                                if (fragment10.mContainerId != i25) {
                                    z5 = z7;
                                } else if (fragment10 == fragment9) {
                                    z5 = z7;
                                    z10 = true;
                                } else {
                                    if (fragment10 == fragment) {
                                        z5 = z7;
                                        i6 = 0;
                                        arrayList12.add(i23, new dl(9, fragment10, 0));
                                        i23++;
                                        fragment = null;
                                    } else {
                                        z5 = z7;
                                        i6 = 0;
                                    }
                                    dl dlVar5 = new dl(3, fragment10, i6);
                                    dlVar5.d = dlVar4.d;
                                    dlVar5.f = dlVar4.f;
                                    dlVar5.e = dlVar4.e;
                                    dlVar5.g = dlVar4.g;
                                    arrayList12.add(i23, dlVar5);
                                    arrayList10.remove(fragment10);
                                    i23++;
                                    fragment = fragment;
                                }
                                size8 = i26 - 1;
                                z7 = z5;
                                i7 = i27;
                            }
                            i5 = i7;
                            z4 = z7;
                            i4 = 1;
                            if (z10) {
                                arrayList12.remove(i23);
                                i23--;
                            } else {
                                dlVar4.a = 1;
                                dlVar4.c = true;
                                arrayList10.add(fragment9);
                            }
                        }
                        i23 += i4;
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
                    arrayList10.add(dlVar4.b);
                    i23 += i4;
                    i8 = i4;
                    z6 = z3;
                    z7 = z4;
                    i7 = i5;
                }
                z = z6;
                i3 = i7;
                z2 = z7;
            }
            z7 = z2 || aVar4.g;
            i7 = i3 + 1;
            z6 = z;
        }
    }
}
