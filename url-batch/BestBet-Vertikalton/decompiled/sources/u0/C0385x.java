package u0;

import K.C0019o;
import K.D;
import K.Q;
import K.Z;
import U.A;
import Y.AbstractComponentCallbacksC0050q;
import Y.I;
import Y.U;
import android.animation.Animator;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.CancellationSignal;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import c1.AbstractC0091d;
import com.fortunequest.neontrack.MainActivity;
import com.fortunequest.neontrack.data.FortuneQuestDatabase_Impl;
import d1.AbstractC0095c;
import g.AbstractActivityC0128i;
import g.LayoutInflaterFactory2C0112A;
import g0.Y;
import g0.e0;
import g0.i0;
import j.AbstractC0164a;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import k.MenuC0173C;
import k.MenuC0189m;

/* renamed from: u0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0385x implements U.p, G.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4230a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4231b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4232c;

    public /* synthetic */ C0385x(Object obj, int i, Object obj2) {
        this.f4230a = i;
        this.f4231b = obj;
        this.f4232c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        if (r2 == null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A(D1.j jVar, z1.s sVar) {
        String str;
        z1.n nVar;
        Charset charset;
        String str2;
        int i = MainActivity.f2083E;
        ((MainActivity) this.f4231b).getClass();
        final String t2 = MainActivity.t(new byte[]{92, 74, -74, -18, 78, 87, -73, -85, 79, 64, -78});
        final String t3 = MainActivity.t(new byte[]{9, 86, -80, -28, 95, 80, -73, -89, 17, 7, -85, -18, 9});
        final String str3 = ((z1.l) sVar.f4759a.f483c).h;
        E1.h hVar = sVar.f4764g;
        if (hVar != null) {
            M1.h d = hVar.d();
            try {
                switch (hVar.f239a) {
                    case 0:
                        String str4 = (String) hVar.f241c;
                        if (str4 != null) {
                            Pattern pattern = z1.n.f4699c;
                            try {
                                nVar = AbstractC0091d.h(str4);
                                break;
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        nVar = null;
                        break;
                    default:
                        nVar = (z1.n) hVar.f241c;
                        break;
                }
                if (nVar != null) {
                    charset = r1.a.f3833a;
                    String[] strArr = nVar.f4701b;
                    int i2 = 0;
                    int k2 = AbstractC0091d.k(0, strArr.length - 1, 2);
                    if (k2 >= 0) {
                        while (!r1.l.y(strArr[i2], "charset")) {
                            if (i2 != k2) {
                                i2 += 2;
                            }
                        }
                        str2 = strArr[i2 + 1];
                        if (str2 != null) {
                            try {
                                charset = Charset.forName(str2);
                            } catch (IllegalArgumentException unused2) {
                            }
                        }
                    }
                    str2 = null;
                    if (str2 != null) {
                    }
                }
                charset = r1.a.f3833a;
                str = d.q(A1.c.q(d, charset));
                b1.g.d(d, null);
            } finally {
            }
        } else {
            str = "";
        }
        final String str5 = str;
        final String str6 = (String) this.f4232c;
        final MainActivity mainActivity = (MainActivity) this.f4231b;
        mainActivity.runOnUiThread(new Runnable() { // from class: t0.u
            @Override // java.lang.Runnable
            public final void run() {
                String str7 = str3;
                boolean E2 = r1.d.E(str7, t2);
                MainActivity mainActivity2 = mainActivity;
                if (E2) {
                    if (r1.d.E(str5, t3)) {
                        int i3 = MainActivity.f2083E;
                        mainActivity2.v();
                        return;
                    } else {
                        int i4 = MainActivity.f2083E;
                        mainActivity2.v();
                        return;
                    }
                }
                int i5 = MainActivity.f2083E;
                SharedPreferences sharedPreferences = (SharedPreferences) mainActivity2.f2086C.a();
                k1.e.d(sharedPreferences, "access$getPrefs(...)");
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString(str6, str7);
                edit.apply();
                mainActivity2.f2089z = str7;
                mainActivity2.w(str7);
            }
        });
    }

    public C0019o B(Y y2, int i) {
        i0 i0Var;
        C0019o c0019o;
        o.k kVar = (o.k) this.f4231b;
        int e2 = kVar.e(y2);
        if (e2 >= 0 && (i0Var = (i0) kVar.j(e2)) != null) {
            int i2 = i0Var.f2866a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                i0Var.f2866a = i3;
                if (i == 4) {
                    c0019o = i0Var.f2867b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0019o = i0Var.f2868c;
                }
                if ((i3 & 12) == 0) {
                    kVar.i(e2);
                    i0Var.f2866a = 0;
                    i0Var.f2867b = null;
                    i0Var.f2868c = null;
                    i0.d.c(i0Var);
                }
                return c0019o;
            }
        }
        return null;
    }

    public void C(Y y2) {
        i0 i0Var = (i0) ((o.k) this.f4231b).getOrDefault(y2, null);
        if (i0Var == null) {
            return;
        }
        i0Var.f2866a &= -2;
    }

    public void D(Y y2) {
        o.e eVar = (o.e) this.f4232c;
        int e2 = eVar.e() - 1;
        while (true) {
            if (e2 < 0) {
                break;
            }
            if (y2 == eVar.f(e2)) {
                Object[] objArr = eVar.f3571c;
                Object obj = objArr[e2];
                Object obj2 = o.e.f3568e;
                if (obj != obj2) {
                    objArr[e2] = obj2;
                    eVar.f3569a = true;
                }
            } else {
                e2--;
            }
        }
        i0 i0Var = (i0) ((o.k) this.f4231b).remove(y2);
        if (i0Var != null) {
            i0Var.f2866a = 0;
            i0Var.f2867b = null;
            i0Var.f2868c = null;
            i0.d.c(i0Var);
        }
    }

    @Override // U.p
    public Object a() {
        return (A) this.f4231b;
    }

    @Override // U.p
    public boolean b(CharSequence charSequence, int i, int i2, U.x xVar) {
        if ((xVar.f1124c & 4) > 0) {
            return true;
        }
        if (((A) this.f4231b) == null) {
            this.f4231b = new A(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((R0.e) this.f4232c).getClass();
        ((A) this.f4231b).setSpan(new U.y(xVar), i, i2, 33);
        return true;
    }

    public void c(Y y2, C0019o c0019o) {
        o.k kVar = (o.k) this.f4231b;
        i0 i0Var = (i0) kVar.getOrDefault(y2, null);
        if (i0Var == null) {
            i0Var = i0.a();
            kVar.put(y2, i0Var);
        }
        i0Var.f2868c = c0019o;
        i0Var.f2866a |= 8;
    }

    public void d() {
        int[] iArr = (int[]) this.f4231b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f4232c = null;
    }

    public void e(boolean z2) {
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = ((I) this.f4232c).f1320v;
        if (abstractComponentCallbacksC0050q != null) {
            abstractComponentCallbacksC0050q.j().f1310l.e(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f4231b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void f(boolean z2) {
        I i = (I) this.f4232c;
        AbstractActivityC0128i abstractActivityC0128i = i.f1318t.f1489b;
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = i.f1320v;
        if (abstractComponentCallbacksC0050q != null) {
            abstractComponentCallbacksC0050q.j().f1310l.f(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f4231b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void g(boolean z2) {
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = ((I) this.f4232c).f1320v;
        if (abstractComponentCallbacksC0050q != null) {
            abstractComponentCallbacksC0050q.j().f1310l.g(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f4231b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void h(boolean z2) {
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = ((I) this.f4232c).f1320v;
        if (abstractComponentCallbacksC0050q != null) {
            abstractComponentCallbacksC0050q.j().f1310l.h(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f4231b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void i(boolean z2) {
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = ((I) this.f4232c).f1320v;
        if (abstractComponentCallbacksC0050q != null) {
            abstractComponentCallbacksC0050q.j().f1310l.i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f4231b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    @Override // G.b
    public void j() {
        ((Animator) this.f4231b).end();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + ((U) this.f4232c) + " has been canceled.");
        }
    }

    public void k(boolean z2) {
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = ((I) this.f4232c).f1320v;
        if (abstractComponentCallbacksC0050q != null) {
            abstractComponentCallbacksC0050q.j().f1310l.k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f4231b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void l(boolean z2) {
        I i = (I) this.f4232c;
        AbstractActivityC0128i abstractActivityC0128i = i.f1318t.f1489b;
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = i.f1320v;
        if (abstractComponentCallbacksC0050q != null) {
            abstractComponentCallbacksC0050q.j().f1310l.l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f4231b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void m(boolean z2) {
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = ((I) this.f4232c).f1320v;
        if (abstractComponentCallbacksC0050q != null) {
            abstractComponentCallbacksC0050q.j().f1310l.m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f4231b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void n(boolean z2) {
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = ((I) this.f4232c).f1320v;
        if (abstractComponentCallbacksC0050q != null) {
            abstractComponentCallbacksC0050q.j().f1310l.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f4231b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void o(boolean z2) {
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = ((I) this.f4232c).f1320v;
        if (abstractComponentCallbacksC0050q != null) {
            abstractComponentCallbacksC0050q.j().f1310l.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f4231b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void p(boolean z2) {
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = ((I) this.f4232c).f1320v;
        if (abstractComponentCallbacksC0050q != null) {
            abstractComponentCallbacksC0050q.j().f1310l.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f4231b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void q(boolean z2) {
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = ((I) this.f4232c).f1320v;
        if (abstractComponentCallbacksC0050q != null) {
            abstractComponentCallbacksC0050q.j().f1310l.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f4231b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void r(boolean z2) {
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = ((I) this.f4232c).f1320v;
        if (abstractComponentCallbacksC0050q != null) {
            abstractComponentCallbacksC0050q.j().f1310l.r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f4231b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void s(boolean z2) {
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = ((I) this.f4232c).f1320v;
        if (abstractComponentCallbacksC0050q != null) {
            abstractComponentCallbacksC0050q.j().f1310l.s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f4231b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void t(int i) {
        int[] iArr = (int[]) this.f4231b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f4231b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f4231b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f4231b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public String toString() {
        switch (this.f4230a) {
            case 2:
                return "Bounds{lower=" + ((C.d) this.f4231b) + " upper=" + ((C.d) this.f4232c) + "}";
            default:
                return super.toString();
        }
    }

    public Object u(AbstractC0095c abstractC0095c) {
        h0.p a2 = h0.p.a("SELECT * FROM streak_state WHERE id = 1 LIMIT 1", 0);
        return h0.e.a((FortuneQuestDatabase_Impl) this.f4231b, new CancellationSignal(), new CallableC0363b(this, 3, a2), abstractC0095c);
    }

    public void v(int i, int i2) {
        int[] iArr = (int[]) this.f4231b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        t(i3);
        int[] iArr2 = (int[]) this.f4231b;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.f4231b, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.f4232c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e0 e0Var = (e0) ((ArrayList) this.f4232c).get(size);
            int i4 = e0Var.f2823a;
            if (i4 >= i) {
                e0Var.f2823a = i4 + i2;
            }
        }
    }

    public void w(int i, int i2) {
        int[] iArr = (int[]) this.f4231b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        t(i3);
        int[] iArr2 = (int[]) this.f4231b;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.f4231b;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f4232c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e0 e0Var = (e0) ((ArrayList) this.f4232c).get(size);
            int i4 = e0Var.f2823a;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.f4232c).remove(size);
                } else {
                    e0Var.f2823a = i4 - i2;
                }
            }
        }
    }

    public void x(AbstractC0164a abstractC0164a) {
        T0.m mVar = (T0.m) this.f4231b;
        ((ActionMode.Callback) mVar.f1073a).onDestroyActionMode(mVar.h(abstractC0164a));
        LayoutInflaterFactory2C0112A layoutInflaterFactory2C0112A = (LayoutInflaterFactory2C0112A) this.f4232c;
        if (layoutInflaterFactory2C0112A.f2588w != null) {
            layoutInflaterFactory2C0112A.f2577l.getDecorView().removeCallbacks(layoutInflaterFactory2C0112A.f2589x);
        }
        if (layoutInflaterFactory2C0112A.f2587v != null) {
            Z z2 = layoutInflaterFactory2C0112A.f2590y;
            if (z2 != null) {
                z2.b();
            }
            Z a2 = Q.a(layoutInflaterFactory2C0112A.f2587v);
            a2.a(RecyclerView.f1937A0);
            layoutInflaterFactory2C0112A.f2590y = a2;
            a2.d(new g.r(2, this));
        }
        layoutInflaterFactory2C0112A.f2586u = null;
        ViewGroup viewGroup = layoutInflaterFactory2C0112A.f2543B;
        WeakHashMap weakHashMap = Q.f578a;
        D.c(viewGroup);
        layoutInflaterFactory2C0112A.H();
    }

    public void y(D1.j jVar, IOException iOException) {
        MainActivity mainActivity = (MainActivity) this.f4231b;
        mainActivity.runOnUiThread(new E0.b(11, mainActivity));
    }

    public boolean z(AbstractC0164a abstractC0164a, MenuC0189m menuC0189m) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C0112A) this.f4232c).f2543B;
        WeakHashMap weakHashMap = Q.f578a;
        D.c(viewGroup);
        T0.m mVar = (T0.m) this.f4231b;
        j.e h = mVar.h(abstractC0164a);
        o.k kVar = (o.k) mVar.d;
        Menu menu = (Menu) kVar.getOrDefault(menuC0189m, null);
        if (menu == null) {
            menu = new MenuC0173C((Context) mVar.f1074b, menuC0189m);
            kVar.put(menuC0189m, menu);
        }
        return ((ActionMode.Callback) mVar.f1073a).onPrepareActionMode(h, menu);
    }

    public C0385x(FortuneQuestDatabase_Impl fortuneQuestDatabase_Impl) {
        this.f4230a = 0;
        this.f4231b = fortuneQuestDatabase_Impl;
        this.f4232c = new C0362a(fortuneQuestDatabase_Impl, 2);
    }

    public C0385x(int i) {
        this.f4230a = i;
        switch (i) {
            case 8:
                this.f4231b = new o.k();
                this.f4232c = new o.e();
                break;
        }
    }

    public C0385x(I i) {
        this.f4230a = 5;
        this.f4231b = new CopyOnWriteArrayList();
        this.f4232c = i;
    }

    public C0385x(LayoutInflaterFactory2C0112A layoutInflaterFactory2C0112A, T0.m mVar) {
        this.f4230a = 6;
        this.f4232c = layoutInflaterFactory2C0112A;
        this.f4231b = mVar;
    }
}
