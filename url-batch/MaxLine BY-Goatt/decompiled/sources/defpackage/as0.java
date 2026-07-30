package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.internal.ServerProtocol;
import com.google.firebase.encoders.json.BuildConfig;
import com.majelw.libystne.R;
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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class as0 {
    public h4 A;
    public h4 B;
    public ArrayDeque C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ArrayList K;
    public es0 L;
    public final r7 M;
    public boolean b;
    public ArrayList d;
    public ArrayList e;
    public ru1 g;
    public final t21 l;
    public final CopyOnWriteArrayList m;
    public final sr0 n;
    public final sr0 o;
    public final sr0 p;
    public final sr0 q;
    public final ur0 r;
    public int s;
    public pr0 t;
    public mr0 u;
    public fr0 v;
    public fr0 w;
    public final vr0 x;
    public final u30 y;
    public h4 z;
    public final ArrayList a = new ArrayList();
    public final js0 c = new js0(0);
    public final rr0 f = new rr0(this);
    public final tm h = new tm(1, this);
    public final AtomicInteger i = new AtomicInteger();
    public final Map j = Collections.synchronizedMap(new HashMap());
    public final Map k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [sr0] */
    /* JADX WARN: Type inference failed for: r0v13, types: [sr0] */
    /* JADX WARN: Type inference failed for: r0v14, types: [sr0] */
    /* JADX WARN: Type inference failed for: r0v15, types: [sr0] */
    public as0() {
        Collections.synchronizedMap(new HashMap());
        this.l = new t21(this);
        this.m = new CopyOnWriteArrayList();
        final int i = 0;
        this.n = new a20(this) { // from class: sr0
            public final /* synthetic */ as0 b;

            {
                this.b = this;
            }

            @Override // defpackage.a20
            public final void accept(Object obj) {
                int i2 = i;
                as0 as0Var = this.b;
                switch (i2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (as0Var.I()) {
                            as0Var.h(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (as0Var.I() && num.intValue() == 80) {
                            as0Var.l(false);
                            break;
                        }
                        break;
                    case 2:
                        vm1 vm1Var = (vm1) obj;
                        if (as0Var.I()) {
                            as0Var.m(vm1Var.a, false);
                            break;
                        }
                        break;
                    default:
                        j12 j12Var = (j12) obj;
                        if (as0Var.I()) {
                            as0Var.r(j12Var.a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.o = new a20(this) { // from class: sr0
            public final /* synthetic */ as0 b;

            {
                this.b = this;
            }

            @Override // defpackage.a20
            public final void accept(Object obj) {
                int i22 = i2;
                as0 as0Var = this.b;
                switch (i22) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (as0Var.I()) {
                            as0Var.h(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (as0Var.I() && num.intValue() == 80) {
                            as0Var.l(false);
                            break;
                        }
                        break;
                    case 2:
                        vm1 vm1Var = (vm1) obj;
                        if (as0Var.I()) {
                            as0Var.m(vm1Var.a, false);
                            break;
                        }
                        break;
                    default:
                        j12 j12Var = (j12) obj;
                        if (as0Var.I()) {
                            as0Var.r(j12Var.a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.p = new a20(this) { // from class: sr0
            public final /* synthetic */ as0 b;

            {
                this.b = this;
            }

            @Override // defpackage.a20
            public final void accept(Object obj) {
                int i22 = i3;
                as0 as0Var = this.b;
                switch (i22) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (as0Var.I()) {
                            as0Var.h(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (as0Var.I() && num.intValue() == 80) {
                            as0Var.l(false);
                            break;
                        }
                        break;
                    case 2:
                        vm1 vm1Var = (vm1) obj;
                        if (as0Var.I()) {
                            as0Var.m(vm1Var.a, false);
                            break;
                        }
                        break;
                    default:
                        j12 j12Var = (j12) obj;
                        if (as0Var.I()) {
                            as0Var.r(j12Var.a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.q = new a20(this) { // from class: sr0
            public final /* synthetic */ as0 b;

            {
                this.b = this;
            }

            @Override // defpackage.a20
            public final void accept(Object obj) {
                int i22 = i4;
                as0 as0Var = this.b;
                switch (i22) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (as0Var.I()) {
                            as0Var.h(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (as0Var.I() && num.intValue() == 80) {
                            as0Var.l(false);
                            break;
                        }
                        break;
                    case 2:
                        vm1 vm1Var = (vm1) obj;
                        if (as0Var.I()) {
                            as0Var.m(vm1Var.a, false);
                            break;
                        }
                        break;
                    default:
                        j12 j12Var = (j12) obj;
                        if (as0Var.I()) {
                            as0Var.r(j12Var.a, false);
                            break;
                        }
                        break;
                }
            }
        };
        this.r = new ur0(this);
        this.s = -1;
        this.x = new vr0(this);
        this.y = new u30(16);
        this.C = new ArrayDeque();
        this.M = new r7(7, this);
    }

    public static boolean G(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean H(fr0 fr0Var) {
        if (fr0Var.mHasMenu && fr0Var.mMenuVisible) {
            return true;
        }
        ArrayList t = fr0Var.mChildFragmentManager.c.t();
        int size = t.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            Object obj = t.get(i);
            i++;
            fr0 fr0Var2 = (fr0) obj;
            if (fr0Var2 != null) {
                z = H(fr0Var2);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(fr0 fr0Var) {
        if (fr0Var == null) {
            return true;
        }
        as0 as0Var = fr0Var.mFragmentManager;
        return fr0Var.equals(as0Var.w) && J(as0Var.v);
    }

    public static void Y(fr0 fr0Var) {
        if (G(2)) {
            Log.v("FragmentManager", "show: " + fr0Var);
        }
        if (fr0Var.mHidden) {
            fr0Var.mHidden = false;
            fr0Var.mHiddenChanged = !fr0Var.mHiddenChanged;
        }
    }

    public final fr0 A(int i) {
        js0 js0Var = this.c;
        ArrayList arrayList = (ArrayList) js0Var.m;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            fr0 fr0Var = (fr0) arrayList.get(size);
            if (fr0Var != null && fr0Var.mFragmentId == i) {
                return fr0Var;
            }
        }
        for (is0 is0Var : ((HashMap) js0Var.n).values()) {
            if (is0Var != null) {
                fr0 fr0Var2 = is0Var.c;
                if (fr0Var2.mFragmentId == i) {
                    return fr0Var2;
                }
            }
        }
        return null;
    }

    public final fr0 B(String str) {
        js0 js0Var = this.c;
        ArrayList arrayList = (ArrayList) js0Var.m;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            fr0 fr0Var = (fr0) arrayList.get(size);
            if (fr0Var != null && str.equals(fr0Var.mTag)) {
                return fr0Var;
            }
        }
        for (is0 is0Var : ((HashMap) js0Var.n).values()) {
            if (is0Var != null) {
                fr0 fr0Var2 = is0Var.c;
                if (str.equals(fr0Var2.mTag)) {
                    return fr0Var2;
                }
            }
        }
        return null;
    }

    public final ViewGroup C(fr0 fr0Var) {
        ViewGroup viewGroup = fr0Var.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fr0Var.mContainerId <= 0 || !this.u.c()) {
            return null;
        }
        View b = this.u.b(fr0Var.mContainerId);
        if (b instanceof ViewGroup) {
            return (ViewGroup) b;
        }
        return null;
    }

    public final vr0 D() {
        fr0 fr0Var = this.v;
        return fr0Var != null ? fr0Var.mFragmentManager.D() : this.x;
    }

    public final u30 E() {
        fr0 fr0Var = this.v;
        return fr0Var != null ? fr0Var.mFragmentManager.E() : this.y;
    }

    public final void F(fr0 fr0Var) {
        if (G(2)) {
            Log.v("FragmentManager", "hide: " + fr0Var);
        }
        if (fr0Var.mHidden) {
            return;
        }
        fr0Var.mHidden = true;
        fr0Var.mHiddenChanged = true ^ fr0Var.mHiddenChanged;
        X(fr0Var);
    }

    public final boolean I() {
        fr0 fr0Var = this.v;
        if (fr0Var == null) {
            return true;
        }
        return fr0Var.isAdded() && this.v.getParentFragmentManager().I();
    }

    public final void K(int i, boolean z) {
        pr0 pr0Var;
        if (this.t == null && i != -1) {
            lh.g("No activity");
            return;
        }
        if (z || i != this.s) {
            this.s = i;
            js0 js0Var = this.c;
            HashMap hashMap = (HashMap) js0Var.n;
            ArrayList arrayList = (ArrayList) js0Var.m;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                is0 is0Var = (is0) hashMap.get(((fr0) obj).mWho);
                if (is0Var != null) {
                    is0Var.j();
                }
            }
            for (is0 is0Var2 : hashMap.values()) {
                if (is0Var2 != null) {
                    is0Var2.j();
                    fr0 fr0Var = is0Var2.c;
                    if (fr0Var.mRemoving && !fr0Var.isInBackStack()) {
                        if (fr0Var.mBeingSaved && !((HashMap) js0Var.o).containsKey(fr0Var.mWho)) {
                            is0Var2.m();
                        }
                        js0Var.A(is0Var2);
                    }
                }
            }
            ArrayList s = js0Var.s();
            int size2 = s.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = s.get(i3);
                i3++;
                is0 is0Var3 = (is0) obj2;
                fr0 fr0Var2 = is0Var3.c;
                if (fr0Var2.mDeferStart) {
                    if (this.b) {
                        this.H = true;
                    } else {
                        fr0Var2.mDeferStart = false;
                        is0Var3.j();
                    }
                }
            }
            if (this.D && (pr0Var = this.t) != null && this.s == 7) {
                ((jr0) pr0Var).q.invalidateOptionsMenu();
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
        this.L.g = false;
        for (fr0 fr0Var : this.c.u()) {
            if (fr0Var != null) {
                fr0Var.noteStateNotSaved();
            }
        }
    }

    public final boolean M() {
        return N(-1, 0);
    }

    public final boolean N(int i, int i2) {
        x(false);
        w(true);
        fr0 fr0Var = this.w;
        if (fr0Var != null && i < 0 && fr0Var.getChildFragmentManager().M()) {
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
        js0 js0Var = this.c;
        if (z) {
            this.H = false;
            ArrayList s = js0Var.s();
            int size = s.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = s.get(i3);
                i3++;
                is0 is0Var = (is0) obj;
                fr0 fr0Var2 = is0Var.c;
                if (fr0Var2.mDeferStart) {
                    if (this.b) {
                        this.H = true;
                    } else {
                        fr0Var2.mDeferStart = false;
                        is0Var.j();
                    }
                }
            }
        }
        ((HashMap) js0Var.n).values().removeAll(Collections.singleton(null));
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
                    wm wmVar = (wm) this.d.get(size);
                    if (i >= 0 && i == wmVar.r) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    i3 = size;
                } else if (z) {
                    i3 = size;
                    while (i3 > 0) {
                        wm wmVar2 = (wm) this.d.get(i3 - 1);
                        if (i < 0 || i != wmVar2.r) {
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
            arrayList.add((wm) this.d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void P(fr0 fr0Var) {
        if (G(2)) {
            Log.v("FragmentManager", "remove: " + fr0Var + " nesting=" + fr0Var.mBackStackNesting);
        }
        boolean isInBackStack = fr0Var.isInBackStack();
        if (fr0Var.mDetached && isInBackStack) {
            return;
        }
        js0 js0Var = this.c;
        synchronized (((ArrayList) js0Var.m)) {
            ((ArrayList) js0Var.m).remove(fr0Var);
        }
        fr0Var.mAdded = false;
        if (H(fr0Var)) {
            this.D = true;
        }
        fr0Var.mRemoving = true;
        X(fr0Var);
    }

    public final void Q(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            lh.g("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((wm) arrayList.get(i)).o) {
                if (i2 != i) {
                    z(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((wm) arrayList.get(i2)).o) {
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
        t21 t21Var;
        int i;
        boolean z;
        int i2;
        is0 is0Var;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.t.n.getClassLoader());
                this.k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.t.n.getClassLoader());
                arrayList.add((hs0) bundle.getParcelable(ServerProtocol.DIALOG_PARAM_STATE));
            }
        }
        js0 js0Var = this.c;
        HashMap hashMap = (HashMap) js0Var.o;
        HashMap hashMap2 = (HashMap) js0Var.n;
        hashMap.clear();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            hs0 hs0Var = (hs0) obj;
            hashMap.put(hs0Var.n, hs0Var);
        }
        cs0 cs0Var = (cs0) bundle3.getParcelable(ServerProtocol.DIALOG_PARAM_STATE);
        if (cs0Var == null) {
            return;
        }
        hashMap2.clear();
        ArrayList arrayList2 = cs0Var.m;
        int size2 = arrayList2.size();
        int i4 = 0;
        while (true) {
            t21Var = this.l;
            i = 2;
            if (i4 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i4);
            i4++;
            hs0 hs0Var2 = (hs0) ((HashMap) js0Var.o).remove((String) obj2);
            if (hs0Var2 != null) {
                fr0 fr0Var = (fr0) this.L.b.get(hs0Var2.n);
                if (fr0Var != null) {
                    if (G(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fr0Var);
                    }
                    is0Var = new is0(t21Var, js0Var, fr0Var, hs0Var2);
                } else {
                    is0Var = new is0(this.l, this.c, this.t.n.getClassLoader(), D(), hs0Var2);
                }
                fr0 fr0Var2 = is0Var.c;
                fr0Var2.mFragmentManager = this;
                if (G(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fr0Var2.mWho + "): " + fr0Var2);
                }
                is0Var.k(this.t.n.getClassLoader());
                js0Var.z(is0Var);
                is0Var.e = this.s;
            }
        }
        es0 es0Var = this.L;
        es0Var.getClass();
        ArrayList arrayList3 = new ArrayList(es0Var.b.values());
        int size3 = arrayList3.size();
        int i5 = 0;
        while (true) {
            z = true;
            if (i5 >= size3) {
                break;
            }
            Object obj3 = arrayList3.get(i5);
            i5++;
            fr0 fr0Var3 = (fr0) obj3;
            if (hashMap2.get(fr0Var3.mWho) == null) {
                if (G(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fr0Var3 + " that was not found in the set of active Fragments " + cs0Var.m);
                }
                this.L.h(fr0Var3);
                fr0Var3.mFragmentManager = this;
                is0 is0Var2 = new is0(t21Var, js0Var, fr0Var3);
                is0Var2.e = 1;
                is0Var2.j();
                fr0Var3.mRemoving = true;
                is0Var2.j();
            }
        }
        ArrayList arrayList4 = cs0Var.n;
        ((ArrayList) js0Var.m).clear();
        if (arrayList4 != null) {
            int size4 = arrayList4.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList4.get(i6);
                i6++;
                String str3 = (String) obj4;
                fr0 i7 = js0Var.i(str3);
                if (i7 == null) {
                    lh.g(q40.m("No instantiated fragment for (", str3, ")"));
                    return;
                }
                if (G(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + i7);
                }
                js0Var.b(i7);
            }
        }
        if (cs0Var.o != null) {
            this.d = new ArrayList(cs0Var.o.length);
            int i8 = 0;
            while (true) {
                xm[] xmVarArr = cs0Var.o;
                if (i8 >= xmVarArr.length) {
                    break;
                }
                xm xmVar = xmVarArr[i8];
                ArrayList arrayList5 = xmVar.n;
                wm wmVar = new wm(this);
                int[] iArr = xmVar.m;
                int i9 = 0;
                int i10 = 0;
                while (i9 < iArr.length) {
                    os0 os0Var = new os0();
                    int i11 = i9 + 1;
                    int i12 = i;
                    os0Var.a = iArr[i9];
                    if (G(i12)) {
                        Log.v("FragmentManager", "Instantiate " + wmVar + " op #" + i10 + " base fragment #" + iArr[i11]);
                    }
                    os0Var.h = zc1.values()[xmVar.o[i10]];
                    os0Var.i = zc1.values()[xmVar.p[i10]];
                    int i13 = i9 + 2;
                    os0Var.c = iArr[i11] != 0 ? z : false;
                    int i14 = iArr[i13];
                    os0Var.d = i14;
                    int i15 = iArr[i9 + 3];
                    os0Var.e = i15;
                    int i16 = i9 + 5;
                    int i17 = iArr[i9 + 4];
                    os0Var.f = i17;
                    i9 += 6;
                    int[] iArr2 = iArr;
                    int i18 = iArr2[i16];
                    os0Var.g = i18;
                    wmVar.b = i14;
                    wmVar.c = i15;
                    wmVar.d = i17;
                    wmVar.e = i18;
                    wmVar.b(os0Var);
                    i10++;
                    i = i12;
                    iArr = iArr2;
                    z = true;
                }
                int i19 = i;
                wmVar.f = xmVar.q;
                wmVar.h = xmVar.r;
                wmVar.g = true;
                wmVar.i = xmVar.t;
                wmVar.j = xmVar.u;
                wmVar.k = xmVar.v;
                wmVar.l = xmVar.w;
                wmVar.m = xmVar.x;
                wmVar.n = xmVar.y;
                wmVar.o = xmVar.z;
                wmVar.r = xmVar.s;
                for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                    String str4 = (String) arrayList5.get(i20);
                    if (str4 != null) {
                        ((os0) wmVar.a.get(i20)).b = js0Var.i(str4);
                    }
                }
                wmVar.d(1);
                if (G(i19)) {
                    StringBuilder n = in1.n(i8, "restoreAllState: back stack #", " (index ");
                    n.append(wmVar.r);
                    n.append("): ");
                    n.append(wmVar);
                    Log.v("FragmentManager", n.toString());
                    PrintWriter printWriter = new PrintWriter(new gg1());
                    wmVar.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(wmVar);
                i8++;
                i = i19;
                z = true;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.d = null;
        }
        this.i.set(cs0Var.p);
        String str5 = cs0Var.q;
        if (str5 != null) {
            fr0 i21 = js0Var.i(str5);
            this.w = i21;
            q(i21);
        }
        ArrayList arrayList6 = cs0Var.r;
        if (arrayList6 != null) {
            while (i2 < arrayList6.size()) {
                this.j.put((String) arrayList6.get(i2), (ym) cs0Var.s.get(i2));
                i2++;
            }
        }
        this.C = new ArrayDeque(cs0Var.t);
    }

    public final Bundle S() {
        int i;
        ArrayList arrayList;
        xm[] xmVarArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            d90 d90Var = (d90) it.next();
            if (d90Var.e) {
                if (G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                d90Var.e = false;
                d90Var.d();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((d90) it2.next()).g();
        }
        x(true);
        this.E = true;
        this.L.g = true;
        js0 js0Var = this.c;
        js0Var.getClass();
        HashMap hashMap = (HashMap) js0Var.n;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (is0 is0Var : hashMap.values()) {
            if (is0Var != null) {
                fr0 fr0Var = is0Var.c;
                is0Var.m();
                arrayList2.add(fr0Var.mWho);
                if (G(2)) {
                    Log.v("FragmentManager", "Saved state of " + fr0Var + ": " + fr0Var.mSavedFragmentState);
                }
            }
        }
        js0 js0Var2 = this.c;
        js0Var2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) js0Var2.o).values());
        if (!arrayList3.isEmpty()) {
            js0 js0Var3 = this.c;
            synchronized (((ArrayList) js0Var3.m)) {
                try {
                    if (((ArrayList) js0Var3.m).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) js0Var3.m).size());
                        ArrayList arrayList4 = (ArrayList) js0Var3.m;
                        int size2 = arrayList4.size();
                        int i2 = 0;
                        while (i2 < size2) {
                            Object obj = arrayList4.get(i2);
                            i2++;
                            fr0 fr0Var2 = (fr0) obj;
                            arrayList.add(fr0Var2.mWho);
                            if (G(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + fr0Var2.mWho + "): " + fr0Var2);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList5 = this.d;
            if (arrayList5 == null || (size = arrayList5.size()) <= 0) {
                xmVarArr = null;
            } else {
                xmVarArr = new xm[size];
                for (int i3 = 0; i3 < size; i3++) {
                    xmVarArr[i3] = new xm((wm) this.d.get(i3));
                    if (G(2)) {
                        StringBuilder n = in1.n(i3, "saveAllState: adding back stack #", ": ");
                        n.append(this.d.get(i3));
                        Log.v("FragmentManager", n.toString());
                    }
                }
            }
            cs0 cs0Var = new cs0();
            cs0Var.q = null;
            ArrayList arrayList6 = new ArrayList();
            cs0Var.r = arrayList6;
            ArrayList arrayList7 = new ArrayList();
            cs0Var.s = arrayList7;
            cs0Var.m = arrayList2;
            cs0Var.n = arrayList;
            cs0Var.o = xmVarArr;
            cs0Var.p = this.i.get();
            fr0 fr0Var3 = this.w;
            if (fr0Var3 != null) {
                cs0Var.q = fr0Var3.mWho;
            }
            arrayList6.addAll(this.j.keySet());
            arrayList7.addAll(this.j.values());
            cs0Var.t = new ArrayList(this.C);
            bundle.putParcelable(ServerProtocol.DIALOG_PARAM_STATE, cs0Var);
            for (String str : this.k.keySet()) {
                bundle.putBundle(q40.l("result_", str), (Bundle) this.k.get(str));
            }
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj2 = arrayList3.get(i);
                i++;
                hs0 hs0Var = (hs0) obj2;
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(ServerProtocol.DIALOG_PARAM_STATE, hs0Var);
                bundle.putBundle("fragment_" + hs0Var.n, bundle2);
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
                    this.t.o.removeCallbacks(this.M);
                    this.t.o.post(this.M);
                    a0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void U(fr0 fr0Var, boolean z) {
        ViewGroup C = C(fr0Var);
        if (C == null || !(C instanceof nr0)) {
            return;
        }
        ((nr0) C).setDrawDisappearingViewsLast(!z);
    }

    public final void V(fr0 fr0Var, zc1 zc1Var) {
        if (fr0Var.equals(this.c.i(fr0Var.mWho)) && (fr0Var.mHost == null || fr0Var.mFragmentManager == this)) {
            fr0Var.mMaxState = zc1Var;
        } else {
            a.d("Fragment ", fr0Var, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final void W(fr0 fr0Var) {
        if (fr0Var != null) {
            if (!fr0Var.equals(this.c.i(fr0Var.mWho)) || (fr0Var.mHost != null && fr0Var.mFragmentManager != this)) {
                a.d("Fragment ", fr0Var, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        fr0 fr0Var2 = this.w;
        this.w = fr0Var;
        q(fr0Var2);
        q(this.w);
    }

    public final void X(fr0 fr0Var) {
        ViewGroup C = C(fr0Var);
        if (C != null) {
            if (fr0Var.getPopExitAnim() + fr0Var.getPopEnterAnim() + fr0Var.getExitAnim() + fr0Var.getEnterAnim() > 0) {
                if (C.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    C.setTag(R.id.visible_removing_fragment_view_tag, fr0Var);
                }
                ((fr0) C.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fr0Var.getPopDirection());
            }
        }
    }

    public final void Z(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new gg1());
        pr0 pr0Var = this.t;
        if (pr0Var == null) {
            try {
                u("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            ((jr0) pr0Var).q.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw illegalStateException;
        }
    }

    public final is0 a(fr0 fr0Var) {
        String str = fr0Var.mPreviousWho;
        if (str != null) {
            ms0.d(fr0Var, str);
        }
        if (G(2)) {
            Log.v("FragmentManager", "add: " + fr0Var);
        }
        is0 f = f(fr0Var);
        fr0Var.mFragmentManager = this;
        js0 js0Var = this.c;
        js0Var.z(f);
        if (!fr0Var.mDetached) {
            js0Var.b(fr0Var);
            fr0Var.mRemoving = false;
            if (fr0Var.mView == null) {
                fr0Var.mHiddenChanged = false;
            }
            if (H(fr0Var)) {
                this.D = true;
            }
        }
        return f;
    }

    public final void a0() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    this.h.e(true);
                    return;
                }
                tm tmVar = this.h;
                ArrayList arrayList = this.d;
                tmVar.e((arrayList != null ? arrayList.size() : 0) > 0 && J(this.v));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(pr0 pr0Var, mr0 mr0Var, fr0 fr0Var) {
        if (this.t != null) {
            lh.g("Already attached");
            return;
        }
        this.t = pr0Var;
        this.u = mr0Var;
        this.v = fr0Var;
        CopyOnWriteArrayList copyOnWriteArrayList = this.m;
        if (fr0Var != null) {
            copyOnWriteArrayList.add(new wr0(fr0Var));
        } else if (pr0Var instanceof fs0) {
            copyOnWriteArrayList.add((fs0) pr0Var);
        }
        if (this.v != null) {
            a0();
        }
        if (pr0Var instanceof su1) {
            su1 su1Var = (su1) pr0Var;
            ru1 onBackPressedDispatcher = su1Var.getOnBackPressedDispatcher();
            this.g = onBackPressedDispatcher;
            id1 id1Var = su1Var;
            if (fr0Var != null) {
                id1Var = fr0Var;
            }
            onBackPressedDispatcher.a(this.h, id1Var);
        }
        int i = 0;
        if (fr0Var != null) {
            es0 es0Var = fr0Var.mFragmentManager.L;
            HashMap hashMap = es0Var.c;
            es0 es0Var2 = (es0) hashMap.get(fr0Var.mWho);
            if (es0Var2 == null) {
                es0Var2 = new es0(es0Var.e);
                hashMap.put(fr0Var.mWho, es0Var2);
            }
            this.L = es0Var2;
        } else if (pr0Var instanceof u53) {
            t53 viewModelStore = ((u53) pr0Var).getViewModelStore();
            viewModelStore.getClass();
            h50 h50Var = h50.b;
            h50Var.getClass();
            js0 js0Var = new js0(viewModelStore, es0.h, h50Var);
            gu a = d82.a(es0.class);
            String b = a.b();
            if (b == null) {
                lh.e("Local and anonymous classes can not be ViewModels");
                return;
            }
            this.L = (es0) js0Var.x(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        } else {
            this.L = new es0(false);
        }
        es0 es0Var3 = this.L;
        int i2 = 1;
        es0Var3.g = this.E || this.F;
        this.c.p = es0Var3;
        Object obj = this.t;
        if ((obj instanceof zd2) && fr0Var == null) {
            wd2 savedStateRegistry = ((zd2) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new gc0(i2, this));
            Bundle a2 = savedStateRegistry.a("android:support:fragments");
            if (a2 != null) {
                R(a2);
            }
        }
        Object obj2 = this.t;
        if (obj2 instanceof m4) {
            i4 activityResultRegistry = ((m4) obj2).getActivityResultRegistry();
            String concat = "FragmentManager:".concat(fr0Var != null ? q40.p(new StringBuilder(), fr0Var.mWho, ":") : BuildConfig.FLAVOR);
            this.z = activityResultRegistry.c(concat.concat("StartActivityForResult"), new x3(3), new tr0(this, i2));
            int i3 = 2;
            this.A = activityResultRegistry.c(concat.concat("StartIntentSenderForResult"), new x3(4), new tr0(this, i3));
            this.B = activityResultRegistry.c(concat.concat("RequestPermissions"), new x3(i3), new tr0(this, i));
        }
        Object obj3 = this.t;
        if (obj3 instanceof vu1) {
            ((vu1) obj3).addOnConfigurationChangedListener(this.n);
        }
        Object obj4 = this.t;
        if (obj4 instanceof fv1) {
            ((fv1) obj4).addOnTrimMemoryListener(this.o);
        }
        Object obj5 = this.t;
        if (obj5 instanceof av1) {
            ((av1) obj5).addOnMultiWindowModeChangedListener(this.p);
        }
        Object obj6 = this.t;
        if (obj6 instanceof bv1) {
            ((bv1) obj6).addOnPictureInPictureModeChangedListener(this.q);
        }
        Object obj7 = this.t;
        if ((obj7 instanceof hk1) && fr0Var == null) {
            ((hk1) obj7).addMenuProvider(this.r);
        }
    }

    public final void c(fr0 fr0Var) {
        if (G(2)) {
            Log.v("FragmentManager", "attach: " + fr0Var);
        }
        if (fr0Var.mDetached) {
            fr0Var.mDetached = false;
            if (fr0Var.mAdded) {
                return;
            }
            this.c.b(fr0Var);
            if (G(2)) {
                Log.v("FragmentManager", "add from attach: " + fr0Var);
            }
            if (H(fr0Var)) {
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
        ArrayList s = this.c.s();
        int size = s.size();
        int i = 0;
        while (i < size) {
            Object obj = s.get(i);
            i++;
            ViewGroup viewGroup = ((is0) obj).c.mContainer;
            if (viewGroup != null) {
                hashSet.add(d90.h(viewGroup, E()));
            }
        }
        return hashSet;
    }

    public final is0 f(fr0 fr0Var) {
        String str = fr0Var.mWho;
        js0 js0Var = this.c;
        is0 is0Var = (is0) ((HashMap) js0Var.n).get(str);
        if (is0Var != null) {
            return is0Var;
        }
        is0 is0Var2 = new is0(this.l, js0Var, fr0Var);
        is0Var2.k(this.t.n.getClassLoader());
        is0Var2.e = this.s;
        return is0Var2;
    }

    public final void g(fr0 fr0Var) {
        if (G(2)) {
            Log.v("FragmentManager", "detach: " + fr0Var);
        }
        if (fr0Var.mDetached) {
            return;
        }
        fr0Var.mDetached = true;
        if (fr0Var.mAdded) {
            if (G(2)) {
                Log.v("FragmentManager", "remove from detach: " + fr0Var);
            }
            js0 js0Var = this.c;
            synchronized (((ArrayList) js0Var.m)) {
                ((ArrayList) js0Var.m).remove(fr0Var);
            }
            fr0Var.mAdded = false;
            if (H(fr0Var)) {
                this.D = true;
            }
            X(fr0Var);
        }
    }

    public final void h(boolean z, Configuration configuration) {
        if (z && (this.t instanceof vu1)) {
            Z(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (fr0 fr0Var : this.c.u()) {
            if (fr0Var != null) {
                fr0Var.performConfigurationChanged(configuration);
                if (z) {
                    fr0Var.mChildFragmentManager.h(true, configuration);
                }
            }
        }
    }

    public final boolean i(MenuItem menuItem) {
        if (this.s < 1) {
            return false;
        }
        for (fr0 fr0Var : this.c.u()) {
            if (fr0Var != null && fr0Var.performContextItemSelected(menuItem)) {
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
        for (fr0 fr0Var : this.c.u()) {
            if (fr0Var != null && fr0Var.isMenuVisible() && fr0Var.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fr0Var);
                z = true;
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                fr0 fr0Var2 = (fr0) this.e.get(i);
                if (arrayList == null || !arrayList.contains(fr0Var2)) {
                    fr0Var2.onDestroyOptionsMenu();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final void k() {
        boolean z = true;
        this.G = true;
        x(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((d90) it.next()).g();
        }
        pr0 pr0Var = this.t;
        boolean z2 = pr0Var instanceof u53;
        js0 js0Var = this.c;
        if (z2) {
            z = ((es0) js0Var.p).f;
        } else {
            kr0 kr0Var = pr0Var.n;
            if (kr0Var != null) {
                z = true ^ kr0Var.isChangingConfigurations();
            }
        }
        if (z) {
            Iterator it2 = this.j.values().iterator();
            while (it2.hasNext()) {
                ArrayList arrayList = ((ym) it2.next()).m;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    String str = (String) obj;
                    es0 es0Var = (es0) js0Var.p;
                    es0Var.getClass();
                    if (G(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    es0Var.g(str);
                }
            }
        }
        t(-1);
        Object obj2 = this.t;
        if (obj2 instanceof fv1) {
            ((fv1) obj2).removeOnTrimMemoryListener(this.o);
        }
        Object obj3 = this.t;
        if (obj3 instanceof vu1) {
            ((vu1) obj3).removeOnConfigurationChangedListener(this.n);
        }
        Object obj4 = this.t;
        if (obj4 instanceof av1) {
            ((av1) obj4).removeOnMultiWindowModeChangedListener(this.p);
        }
        Object obj5 = this.t;
        if (obj5 instanceof bv1) {
            ((bv1) obj5).removeOnPictureInPictureModeChangedListener(this.q);
        }
        Object obj6 = this.t;
        if (obj6 instanceof hk1) {
            ((hk1) obj6).removeMenuProvider(this.r);
        }
        this.t = null;
        this.u = null;
        this.v = null;
        if (this.g != null) {
            this.h.d();
            this.g = null;
        }
        h4 h4Var = this.z;
        if (h4Var != null) {
            h4Var.c();
            this.A.c();
            this.B.c();
        }
    }

    public final void l(boolean z) {
        if (z && (this.t instanceof fv1)) {
            Z(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (fr0 fr0Var : this.c.u()) {
            if (fr0Var != null) {
                fr0Var.performLowMemory();
                if (z) {
                    fr0Var.mChildFragmentManager.l(true);
                }
            }
        }
    }

    public final void m(boolean z, boolean z2) {
        if (z2 && (this.t instanceof av1)) {
            Z(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (fr0 fr0Var : this.c.u()) {
            if (fr0Var != null) {
                fr0Var.performMultiWindowModeChanged(z);
                if (z2) {
                    fr0Var.mChildFragmentManager.m(z, true);
                }
            }
        }
    }

    public final void n() {
        ArrayList t = this.c.t();
        int size = t.size();
        int i = 0;
        while (i < size) {
            Object obj = t.get(i);
            i++;
            fr0 fr0Var = (fr0) obj;
            if (fr0Var != null) {
                fr0Var.onHiddenChanged(fr0Var.isHidden());
                fr0Var.mChildFragmentManager.n();
            }
        }
    }

    public final boolean o(MenuItem menuItem) {
        if (this.s < 1) {
            return false;
        }
        for (fr0 fr0Var : this.c.u()) {
            if (fr0Var != null && fr0Var.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void p(Menu menu) {
        if (this.s < 1) {
            return;
        }
        for (fr0 fr0Var : this.c.u()) {
            if (fr0Var != null) {
                fr0Var.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void q(fr0 fr0Var) {
        if (fr0Var != null) {
            if (fr0Var.equals(this.c.i(fr0Var.mWho))) {
                fr0Var.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void r(boolean z, boolean z2) {
        if (z2 && (this.t instanceof bv1)) {
            Z(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (fr0 fr0Var : this.c.u()) {
            if (fr0Var != null) {
                fr0Var.performPictureInPictureModeChanged(z);
                if (z2) {
                    fr0Var.mChildFragmentManager.r(z, true);
                }
            }
        }
    }

    public final boolean s(Menu menu) {
        boolean z = false;
        if (this.s < 1) {
            return false;
        }
        for (fr0 fr0Var : this.c.u()) {
            if (fr0Var != null && fr0Var.isMenuVisible() && fr0Var.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final void t(int i) {
        try {
            this.b = true;
            for (is0 is0Var : ((HashMap) this.c.n).values()) {
                if (is0Var != null) {
                    is0Var.e = i;
                }
            }
            K(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((d90) it.next()).g();
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
        fr0 fr0Var = this.v;
        if (fr0Var != null) {
            sb.append(fr0Var.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.v)));
            sb.append("}");
        } else {
            pr0 pr0Var = this.t;
            if (pr0Var != null) {
                sb.append(pr0Var.getClass().getSimpleName());
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
        js0 js0Var = this.c;
        ArrayList arrayList = (ArrayList) js0Var.m;
        String str3 = str + "    ";
        HashMap hashMap = (HashMap) js0Var.n;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (is0 is0Var : hashMap.values()) {
                printWriter.print(str);
                if (is0Var != null) {
                    fr0 fr0Var = is0Var.c;
                    printWriter.println(fr0Var);
                    fr0Var.dump(str3, fileDescriptor, printWriter, strArr);
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
                fr0 fr0Var2 = (fr0) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fr0Var2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                fr0 fr0Var3 = (fr0) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fr0Var3.toString());
            }
        }
        ArrayList arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                wm wmVar = (wm) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(wmVar.toString());
                wmVar.f(str2, printWriter, true);
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
                        Object obj = (yr0) this.a.get(i4);
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

    public final void v(yr0 yr0Var, boolean z) {
        if (!z) {
            if (this.t == null) {
                if (this.G) {
                    lh.g("FragmentManager has been destroyed");
                    return;
                } else {
                    lh.g("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (this.E || this.F) {
                lh.g("Can not perform this action after onSaveInstanceState");
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
                    this.a.add(yr0Var);
                    T();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(boolean z) {
        if (this.b) {
            lh.g("FragmentManager is already executing transactions");
            return;
        }
        if (this.t == null) {
            if (this.G) {
                lh.g("FragmentManager has been destroyed");
                return;
            } else {
                lh.g("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.t.o.getLooper()) {
            lh.g("Must be called from main thread of fragment host");
            return;
        }
        if (!z && (this.E || this.F)) {
            lh.g("Can not perform this action after onSaveInstanceState");
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
                            z2 |= ((yr0) arrayList.get(i)).a(arrayList2, arrayList3);
                            i++;
                        }
                        arrayList.clear();
                        this.t.o.removeCallbacks(this.M);
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
            ArrayList s = this.c.s();
            int size2 = s.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj = s.get(i2);
                i2++;
                is0 is0Var = (is0) obj;
                fr0 fr0Var = is0Var.c;
                if (fr0Var.mDeferStart) {
                    if (this.b) {
                        this.H = true;
                    } else {
                        fr0Var.mDeferStart = false;
                        is0Var.j();
                    }
                }
            }
        }
        ((HashMap) this.c.n).values().removeAll(Collections.singleton(null));
        return z3;
    }

    public final void y(wm wmVar, boolean z) {
        if (z && (this.t == null || this.G)) {
            return;
        }
        w(z);
        wmVar.a(this.I, this.J);
        this.b = true;
        try {
            Q(this.I, this.J);
            d();
            a0();
            boolean z2 = this.H;
            js0 js0Var = this.c;
            if (z2) {
                this.H = false;
                ArrayList s = js0Var.s();
                int size = s.size();
                int i = 0;
                while (i < size) {
                    Object obj = s.get(i);
                    i++;
                    is0 is0Var = (is0) obj;
                    fr0 fr0Var = is0Var.c;
                    if (fr0Var.mDeferStart) {
                        if (this.b) {
                            this.H = true;
                        } else {
                            fr0Var.mDeferStart = false;
                            is0Var.j();
                        }
                    }
                }
            }
            ((HashMap) js0Var.n).values().removeAll(Collections.singleton(null));
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
        boolean z6 = ((wm) arrayList.get(i)).o;
        ArrayList arrayList3 = this.K;
        if (arrayList3 == null) {
            this.K = new ArrayList();
        } else {
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.K;
        js0 js0Var = this.c;
        arrayList4.addAll(js0Var.u());
        fr0 fr0Var = this.w;
        int i7 = i;
        boolean z7 = false;
        while (true) {
            int i8 = 1;
            if (i7 >= i2) {
                boolean z8 = z6;
                this.K.clear();
                if (!z8 && this.s >= 1) {
                    for (int i9 = i; i9 < i2; i9++) {
                        ArrayList arrayList5 = ((wm) arrayList.get(i9)).a;
                        int size = arrayList5.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList5.get(i10);
                            i10++;
                            fr0 fr0Var2 = ((os0) obj).b;
                            if (fr0Var2 != null && fr0Var2.mFragmentManager != null) {
                                js0Var.z(f(fr0Var2));
                            }
                        }
                    }
                }
                for (int i11 = i; i11 < i2; i11++) {
                    wm wmVar = (wm) arrayList.get(i11);
                    if (((Boolean) arrayList2.get(i11)).booleanValue()) {
                        wmVar.d(-1);
                        as0 as0Var = wmVar.p;
                        ArrayList arrayList6 = wmVar.a;
                        boolean z9 = true;
                        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
                            os0 os0Var = (os0) arrayList6.get(size2);
                            fr0 fr0Var3 = os0Var.b;
                            if (fr0Var3 != null) {
                                fr0Var3.mBeingSaved = false;
                                fr0Var3.setPopDirection(z9);
                                int i12 = wmVar.f;
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
                                fr0Var3.setNextTransition(i13);
                                fr0Var3.setSharedElementNames(wmVar.n, wmVar.m);
                            }
                            switch (os0Var.a) {
                                case 1:
                                    fr0Var3.setAnimations(os0Var.d, os0Var.e, os0Var.f, os0Var.g);
                                    z9 = true;
                                    as0Var.U(fr0Var3, true);
                                    as0Var.P(fr0Var3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + os0Var.a);
                                case 3:
                                    fr0Var3.setAnimations(os0Var.d, os0Var.e, os0Var.f, os0Var.g);
                                    as0Var.a(fr0Var3);
                                    z9 = true;
                                case 4:
                                    fr0Var3.setAnimations(os0Var.d, os0Var.e, os0Var.f, os0Var.g);
                                    as0Var.getClass();
                                    Y(fr0Var3);
                                    z9 = true;
                                case 5:
                                    fr0Var3.setAnimations(os0Var.d, os0Var.e, os0Var.f, os0Var.g);
                                    as0Var.U(fr0Var3, true);
                                    as0Var.F(fr0Var3);
                                    z9 = true;
                                case 6:
                                    fr0Var3.setAnimations(os0Var.d, os0Var.e, os0Var.f, os0Var.g);
                                    as0Var.c(fr0Var3);
                                    z9 = true;
                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                    fr0Var3.setAnimations(os0Var.d, os0Var.e, os0Var.f, os0Var.g);
                                    as0Var.U(fr0Var3, true);
                                    as0Var.g(fr0Var3);
                                    z9 = true;
                                case 8:
                                    as0Var.W(null);
                                    z9 = true;
                                case 9:
                                    as0Var.W(fr0Var3);
                                    z9 = true;
                                case 10:
                                    as0Var.V(fr0Var3, os0Var.h);
                                    z9 = true;
                            }
                        }
                    } else {
                        wmVar.d(1);
                        as0 as0Var2 = wmVar.p;
                        ArrayList arrayList7 = wmVar.a;
                        int size3 = arrayList7.size();
                        for (int i15 = 0; i15 < size3; i15++) {
                            os0 os0Var2 = (os0) arrayList7.get(i15);
                            fr0 fr0Var4 = os0Var2.b;
                            if (fr0Var4 != null) {
                                fr0Var4.mBeingSaved = false;
                                fr0Var4.setPopDirection(false);
                                fr0Var4.setNextTransition(wmVar.f);
                                fr0Var4.setSharedElementNames(wmVar.m, wmVar.n);
                            }
                            switch (os0Var2.a) {
                                case 1:
                                    fr0Var4.setAnimations(os0Var2.d, os0Var2.e, os0Var2.f, os0Var2.g);
                                    as0Var2.U(fr0Var4, false);
                                    as0Var2.a(fr0Var4);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + os0Var2.a);
                                case 3:
                                    fr0Var4.setAnimations(os0Var2.d, os0Var2.e, os0Var2.f, os0Var2.g);
                                    as0Var2.P(fr0Var4);
                                case 4:
                                    fr0Var4.setAnimations(os0Var2.d, os0Var2.e, os0Var2.f, os0Var2.g);
                                    as0Var2.F(fr0Var4);
                                case 5:
                                    fr0Var4.setAnimations(os0Var2.d, os0Var2.e, os0Var2.f, os0Var2.g);
                                    as0Var2.U(fr0Var4, false);
                                    Y(fr0Var4);
                                case 6:
                                    fr0Var4.setAnimations(os0Var2.d, os0Var2.e, os0Var2.f, os0Var2.g);
                                    as0Var2.g(fr0Var4);
                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                    fr0Var4.setAnimations(os0Var2.d, os0Var2.e, os0Var2.f, os0Var2.g);
                                    as0Var2.U(fr0Var4, false);
                                    as0Var2.c(fr0Var4);
                                case 8:
                                    as0Var2.W(fr0Var4);
                                case 9:
                                    as0Var2.W(null);
                                case 10:
                                    as0Var2.V(fr0Var4, os0Var2.i);
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i16 = i; i16 < i2; i16++) {
                    wm wmVar2 = (wm) arrayList.get(i16);
                    if (booleanValue) {
                        for (int size4 = wmVar2.a.size() - 1; size4 >= 0; size4--) {
                            fr0 fr0Var5 = ((os0) wmVar2.a.get(size4)).b;
                            if (fr0Var5 != null) {
                                f(fr0Var5).j();
                            }
                        }
                    } else {
                        ArrayList arrayList8 = wmVar2.a;
                        int size5 = arrayList8.size();
                        int i17 = 0;
                        while (i17 < size5) {
                            Object obj2 = arrayList8.get(i17);
                            i17++;
                            fr0 fr0Var6 = ((os0) obj2).b;
                            if (fr0Var6 != null) {
                                f(fr0Var6).j();
                            }
                        }
                    }
                }
                K(this.s, true);
                HashSet hashSet = new HashSet();
                for (int i18 = i; i18 < i2; i18++) {
                    ArrayList arrayList9 = ((wm) arrayList.get(i18)).a;
                    int size6 = arrayList9.size();
                    int i19 = 0;
                    while (i19 < size6) {
                        Object obj3 = arrayList9.get(i19);
                        i19++;
                        fr0 fr0Var7 = ((os0) obj3).b;
                        if (fr0Var7 != null && (viewGroup = fr0Var7.mContainer) != null) {
                            hashSet.add(d90.h(viewGroup, E()));
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    d90 d90Var = (d90) it.next();
                    d90Var.d = booleanValue;
                    d90Var.j();
                    d90Var.d();
                }
                for (int i20 = i; i20 < i2; i20++) {
                    wm wmVar3 = (wm) arrayList.get(i20);
                    if (((Boolean) arrayList2.get(i20)).booleanValue() && wmVar3.r >= 0) {
                        wmVar3.r = -1;
                    }
                    wmVar3.getClass();
                }
                return;
            }
            wm wmVar4 = (wm) arrayList.get(i7);
            boolean booleanValue2 = ((Boolean) arrayList2.get(i7)).booleanValue();
            ArrayList arrayList10 = this.K;
            if (booleanValue2) {
                z = z6;
                i3 = i7;
                z2 = z7;
                int i21 = 1;
                ArrayList arrayList11 = wmVar4.a;
                int size7 = arrayList11.size() - 1;
                while (size7 >= 0) {
                    os0 os0Var3 = (os0) arrayList11.get(size7);
                    int i22 = os0Var3.a;
                    if (i22 != i21) {
                        if (i22 != 3) {
                            switch (i22) {
                                case 8:
                                    fr0Var = null;
                                    break;
                                case 9:
                                    fr0Var = os0Var3.b;
                                    break;
                                case 10:
                                    os0Var3.i = os0Var3.h;
                                    break;
                            }
                            size7--;
                            i21 = 1;
                        }
                        arrayList10.add(os0Var3.b);
                        size7--;
                        i21 = 1;
                    }
                    arrayList10.remove(os0Var3.b);
                    size7--;
                    i21 = 1;
                }
            } else {
                ArrayList arrayList12 = wmVar4.a;
                int i23 = 0;
                while (i23 < arrayList12.size()) {
                    os0 os0Var4 = (os0) arrayList12.get(i23);
                    int i24 = os0Var4.a;
                    if (i24 != i8) {
                        z3 = z6;
                        if (i24 != 2) {
                            if (i24 == 3 || i24 == 6) {
                                arrayList10.remove(os0Var4.b);
                                fr0 fr0Var8 = os0Var4.b;
                                if (fr0Var8 == fr0Var) {
                                    arrayList12.add(i23, new os0(fr0Var8, 9));
                                    i23++;
                                    i5 = i7;
                                    z4 = z7;
                                    i4 = 1;
                                    fr0Var = null;
                                }
                            } else if (i24 == 7) {
                                i4 = 1;
                            } else if (i24 == 8) {
                                arrayList12.add(i23, new os0(9, fr0Var, 0));
                                os0Var4.c = true;
                                i23++;
                                fr0Var = os0Var4.b;
                            }
                            i5 = i7;
                            z4 = z7;
                            i4 = 1;
                        } else {
                            fr0 fr0Var9 = os0Var4.b;
                            int i25 = fr0Var9.mContainerId;
                            int size8 = arrayList10.size() - 1;
                            boolean z10 = false;
                            while (size8 >= 0) {
                                int i26 = size8;
                                fr0 fr0Var10 = (fr0) arrayList10.get(size8);
                                int i27 = i7;
                                if (fr0Var10.mContainerId != i25) {
                                    z5 = z7;
                                } else if (fr0Var10 == fr0Var9) {
                                    z5 = z7;
                                    z10 = true;
                                } else {
                                    if (fr0Var10 == fr0Var) {
                                        z5 = z7;
                                        i6 = 0;
                                        arrayList12.add(i23, new os0(9, fr0Var10, 0));
                                        i23++;
                                        fr0Var = null;
                                    } else {
                                        z5 = z7;
                                        i6 = 0;
                                    }
                                    os0 os0Var5 = new os0(3, fr0Var10, i6);
                                    os0Var5.d = os0Var4.d;
                                    os0Var5.f = os0Var4.f;
                                    os0Var5.e = os0Var4.e;
                                    os0Var5.g = os0Var4.g;
                                    arrayList12.add(i23, os0Var5);
                                    arrayList10.remove(fr0Var10);
                                    i23++;
                                    fr0Var = fr0Var;
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
                                os0Var4.a = 1;
                                os0Var4.c = true;
                                arrayList10.add(fr0Var9);
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
                    arrayList10.add(os0Var4.b);
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
            z7 = z2 || wmVar4.g;
            i7 = i3 + 1;
            z6 = z;
        }
    }
}
