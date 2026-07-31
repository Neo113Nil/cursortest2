package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
class o {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f791a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b, reason: collision with root package name */
    private static final q f792b;

    /* renamed from: c, reason: collision with root package name */
    private static final q f793c;

    static class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f794f;

        a(ArrayList arrayList) {
            this.f794f = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            o.A(this.f794f, 4);
        }
    }

    static class b implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f795f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ q f796g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ View f797h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Fragment f798i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ArrayList f799j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ArrayList f800k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ArrayList f801l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Object f802m;

        b(Object obj, q qVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f795f = obj;
            this.f796g = qVar;
            this.f797h = view;
            this.f798i = fragment;
            this.f799j = arrayList;
            this.f800k = arrayList2;
            this.f801l = arrayList3;
            this.f802m = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f795f;
            if (obj != null) {
                this.f796g.p(obj, this.f797h);
                this.f800k.addAll(o.k(this.f796g, this.f795f, this.f798i, this.f799j, this.f797h));
            }
            if (this.f801l != null) {
                if (this.f802m != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f797h);
                    this.f796g.q(this.f802m, this.f801l, arrayList);
                }
                this.f801l.clear();
                this.f801l.add(this.f797h);
            }
        }
    }

    static class c implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Fragment f803f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Fragment f804g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f805h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ h.a f806i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ View f807j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ q f808k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Rect f809l;

        c(Fragment fragment, Fragment fragment2, boolean z6, h.a aVar, View view, q qVar, Rect rect) {
            this.f803f = fragment;
            this.f804g = fragment2;
            this.f805h = z6;
            this.f806i = aVar;
            this.f807j = view;
            this.f808k = qVar;
            this.f809l = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            o.f(this.f803f, this.f804g, this.f805h, this.f806i, false);
            View view = this.f807j;
            if (view != null) {
                this.f808k.k(view, this.f809l);
            }
        }
    }

    static class d implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ q f810f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ h.a f811g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Object f812h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ e f813i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ArrayList f814j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ View f815k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Fragment f816l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Fragment f817m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f818n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ ArrayList f819o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Object f820p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Rect f821q;

        d(q qVar, h.a aVar, Object obj, e eVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z6, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f810f = qVar;
            this.f811g = aVar;
            this.f812h = obj;
            this.f813i = eVar;
            this.f814j = arrayList;
            this.f815k = view;
            this.f816l = fragment;
            this.f817m = fragment2;
            this.f818n = z6;
            this.f819o = arrayList2;
            this.f820p = obj2;
            this.f821q = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.a<String, View> h7 = o.h(this.f810f, this.f811g, this.f812h, this.f813i);
            if (h7 != null) {
                this.f814j.addAll(h7.values());
                this.f814j.add(this.f815k);
            }
            o.f(this.f816l, this.f817m, this.f818n, h7, false);
            Object obj = this.f812h;
            if (obj != null) {
                this.f810f.z(obj, this.f819o, this.f814j);
                View s7 = o.s(h7, this.f813i, this.f820p, this.f818n);
                if (s7 != null) {
                    this.f810f.k(s7, this.f821q);
                }
            }
        }
    }

    static class e {

        /* renamed from: a, reason: collision with root package name */
        public Fragment f822a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f823b;

        /* renamed from: c, reason: collision with root package name */
        public androidx.fragment.app.a f824c;

        /* renamed from: d, reason: collision with root package name */
        public Fragment f825d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f826e;

        /* renamed from: f, reason: collision with root package name */
        public androidx.fragment.app.a f827f;

        e() {
        }
    }

    static {
        f792b = Build.VERSION.SDK_INT >= 21 ? new p() : null;
        f793c = w();
    }

    static void A(ArrayList<View> arrayList, int i7) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i7);
        }
    }

    static void B(j jVar, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i7, int i8, boolean z6) {
        if (jVar.f701u < 1) {
            return;
        }
        SparseArray sparseArray = new SparseArray();
        for (int i9 = i7; i9 < i8; i9++) {
            androidx.fragment.app.a aVar = arrayList.get(i9);
            if (arrayList2.get(i9).booleanValue()) {
                e(aVar, sparseArray, z6);
            } else {
                c(aVar, sparseArray, z6);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(jVar.f702v.g());
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = sparseArray.keyAt(i10);
                h.a<String, String> d7 = d(keyAt, arrayList, arrayList2, i7, i8);
                e eVar = (e) sparseArray.valueAt(i10);
                if (z6) {
                    o(jVar, keyAt, eVar, view, d7);
                } else {
                    n(jVar, keyAt, eVar, view, d7);
                }
            }
        }
    }

    private static void a(ArrayList<View> arrayList, h.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View m7 = aVar.m(size);
            if (collection.contains(androidx.core.view.h.g(m7))) {
                arrayList.add(m7);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0041, code lost:
    
        if (r10.f605p != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0092, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0076, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0090, code lost:
    
        if (r10.D == false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(androidx.fragment.app.a aVar, n.a aVar2, SparseArray<e> sparseArray, boolean z6, boolean z7) {
        int i7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        e eVar;
        j jVar;
        Fragment fragment = aVar2.f784b;
        if (fragment == null || (i7 = fragment.B) == 0) {
            return;
        }
        int i8 = z6 ? f791a[aVar2.f783a] : aVar2.f783a;
        boolean z12 = false;
        if (i8 != 1) {
            if (i8 != 3) {
                if (i8 == 4) {
                    boolean z13 = !z7 ? false : false;
                    z10 = z13;
                    z9 = false;
                    z11 = true;
                    e eVar2 = sparseArray.get(i7);
                    if (z12) {
                    }
                    eVar = eVar2;
                    if (!z7) {
                    }
                    if (z10) {
                    }
                    if (z7) {
                    }
                } else if (i8 != 5) {
                    if (i8 != 6) {
                        if (i8 != 7) {
                            z9 = false;
                            z11 = false;
                            z10 = false;
                            e eVar22 = sparseArray.get(i7);
                            if (z12) {
                                eVar22 = p(eVar22, sparseArray, i7);
                                eVar22.f822a = fragment;
                                eVar22.f823b = z6;
                                eVar22.f824c = aVar;
                            }
                            eVar = eVar22;
                            if (!z7 && z9) {
                                if (eVar != null && eVar.f825d == fragment) {
                                    eVar.f825d = null;
                                }
                                jVar = aVar.f639s;
                                if (fragment.f595f < 1 && jVar.f701u >= 1 && !aVar.f781q) {
                                    jVar.I0(fragment);
                                    jVar.Q0(fragment, 1, 0, 0, false);
                                }
                            }
                            if (z10 && (eVar == null || eVar.f825d == null)) {
                                eVar = p(eVar, sparseArray, i7);
                                eVar.f825d = fragment;
                                eVar.f826e = z6;
                                eVar.f827f = aVar;
                            }
                            if (z7 || !z11 || eVar == null || eVar.f822a != fragment) {
                                return;
                            }
                            eVar.f822a = null;
                            return;
                        }
                    }
                } else {
                    if (z7) {
                        if (fragment.S) {
                            if (!fragment.D) {
                            }
                        }
                        z8 = false;
                        z12 = z8;
                        z9 = true;
                        z11 = false;
                        z10 = false;
                        e eVar222 = sparseArray.get(i7);
                        if (z12) {
                        }
                        eVar = eVar222;
                        if (!z7) {
                            if (eVar != null) {
                                eVar.f825d = null;
                            }
                            jVar = aVar.f639s;
                            if (fragment.f595f < 1) {
                                jVar.I0(fragment);
                                jVar.Q0(fragment, 1, 0, 0, false);
                            }
                        }
                        if (z10) {
                            eVar = p(eVar, sparseArray, i7);
                            eVar.f825d = fragment;
                            eVar.f826e = z6;
                            eVar.f827f = aVar;
                        }
                        if (z7) {
                            return;
                        } else {
                            return;
                        }
                    }
                    z8 = fragment.D;
                    z12 = z8;
                    z9 = true;
                    z11 = false;
                    z10 = false;
                    e eVar2222 = sparseArray.get(i7);
                    if (z12) {
                    }
                    eVar = eVar2222;
                    if (!z7) {
                    }
                    if (z10) {
                    }
                    if (z7) {
                    }
                }
            }
            boolean z14 = fragment.f605p;
            if (!z7) {
            }
            z10 = z13;
            z9 = false;
            z11 = true;
            e eVar22222 = sparseArray.get(i7);
            if (z12) {
            }
            eVar = eVar22222;
            if (!z7) {
            }
            if (z10) {
            }
            if (z7) {
            }
        }
        if (z7) {
            z8 = fragment.R;
            z12 = z8;
            z9 = true;
            z11 = false;
            z10 = false;
            e eVar222222 = sparseArray.get(i7);
            if (z12) {
            }
            eVar = eVar222222;
            if (!z7) {
            }
            if (z10) {
            }
            if (z7) {
            }
        } else {
            if (!fragment.f605p) {
            }
            z8 = false;
            z12 = z8;
            z9 = true;
            z11 = false;
            z10 = false;
            e eVar2222222 = sparseArray.get(i7);
            if (z12) {
            }
            eVar = eVar2222222;
            if (!z7) {
            }
            if (z10) {
            }
            if (z7) {
            }
        }
    }

    public static void c(androidx.fragment.app.a aVar, SparseArray<e> sparseArray, boolean z6) {
        int size = aVar.f765a.size();
        for (int i7 = 0; i7 < size; i7++) {
            b(aVar, aVar.f765a.get(i7), sparseArray, false, z6);
        }
    }

    private static h.a<String, String> d(int i7, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i8, int i9) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        h.a<String, String> aVar = new h.a<>();
        for (int i10 = i9 - 1; i10 >= i8; i10--) {
            androidx.fragment.app.a aVar2 = arrayList.get(i10);
            if (aVar2.p(i7)) {
                boolean booleanValue = arrayList2.get(i10).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f779o;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.f779o;
                        arrayList4 = aVar2.f780p;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.f779o;
                        arrayList3 = aVar2.f780p;
                        arrayList4 = arrayList6;
                    }
                    for (int i11 = 0; i11 < size; i11++) {
                        String str = arrayList4.get(i11);
                        String str2 = arrayList3.get(i11);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public static void e(androidx.fragment.app.a aVar, SparseArray<e> sparseArray, boolean z6) {
        if (aVar.f639s.f703w.e()) {
            for (int size = aVar.f765a.size() - 1; size >= 0; size--) {
                b(aVar, aVar.f765a.get(size), sparseArray, true, z6);
            }
        }
    }

    static void f(Fragment fragment, Fragment fragment2, boolean z6, h.a<String, View> aVar, boolean z7) {
        if (z6) {
            fragment2.q();
        } else {
            fragment.q();
        }
    }

    private static boolean g(q qVar, List<Object> list) {
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (!qVar.e(list.get(i7))) {
                return false;
            }
        }
        return true;
    }

    static h.a<String, View> h(q qVar, h.a<String, String> aVar, Object obj, e eVar) {
        ArrayList<String> arrayList;
        Fragment fragment = eVar.f822a;
        View I = fragment.I();
        if (aVar.isEmpty() || obj == null || I == null) {
            aVar.clear();
            return null;
        }
        h.a<String, View> aVar2 = new h.a<>();
        qVar.j(aVar2, I);
        androidx.fragment.app.a aVar3 = eVar.f824c;
        if (eVar.f823b) {
            fragment.s();
            arrayList = aVar3.f779o;
        } else {
            fragment.q();
            arrayList = aVar3.f780p;
        }
        if (arrayList != null) {
            aVar2.o(arrayList);
            aVar2.o(aVar.values());
        }
        x(aVar, aVar2);
        return aVar2;
    }

    private static h.a<String, View> i(q qVar, h.a<String, String> aVar, Object obj, e eVar) {
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = eVar.f825d;
        h.a<String, View> aVar2 = new h.a<>();
        qVar.j(aVar2, fragment.Y0());
        androidx.fragment.app.a aVar3 = eVar.f827f;
        if (eVar.f826e) {
            fragment.q();
            arrayList = aVar3.f780p;
        } else {
            fragment.s();
            arrayList = aVar3.f779o;
        }
        aVar2.o(arrayList);
        aVar.o(aVar2.keySet());
        return aVar2;
    }

    private static q j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object r7 = fragment.r();
            if (r7 != null) {
                arrayList.add(r7);
            }
            Object D = fragment.D();
            if (D != null) {
                arrayList.add(D);
            }
            Object F = fragment.F();
            if (F != null) {
                arrayList.add(F);
            }
        }
        if (fragment2 != null) {
            Object p7 = fragment2.p();
            if (p7 != null) {
                arrayList.add(p7);
            }
            Object A = fragment2.A();
            if (A != null) {
                arrayList.add(A);
            }
            Object E = fragment2.E();
            if (E != null) {
                arrayList.add(E);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        q qVar = f792b;
        if (qVar != null && g(qVar, arrayList)) {
            return qVar;
        }
        q qVar2 = f793c;
        if (qVar2 != null && g(qVar2, arrayList)) {
            return qVar2;
        }
        if (qVar == null && qVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    static ArrayList<View> k(q qVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View I = fragment.I();
        if (I != null) {
            qVar.f(arrayList2, I);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        qVar.b(obj, arrayList2);
        return arrayList2;
    }

    private static Object l(q qVar, ViewGroup viewGroup, View view, h.a<String, String> aVar, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object t6;
        h.a<String, String> aVar2;
        Object obj3;
        Rect rect;
        Fragment fragment = eVar.f822a;
        Fragment fragment2 = eVar.f825d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z6 = eVar.f823b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            t6 = null;
        } else {
            t6 = t(qVar, fragment, fragment2, z6);
            aVar2 = aVar;
        }
        h.a<String, View> i7 = i(qVar, aVar2, t6, eVar);
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(i7.values());
            obj3 = t6;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z6, i7, true);
        if (obj3 != null) {
            rect = new Rect();
            qVar.y(obj3, view, arrayList);
            z(qVar, obj3, obj2, i7, eVar.f826e, eVar.f827f);
            if (obj != null) {
                qVar.u(obj, rect);
            }
        } else {
            rect = null;
        }
        androidx.core.view.f.a(viewGroup, new d(qVar, aVar, obj3, eVar, arrayList2, view, fragment, fragment2, z6, arrayList, obj, rect));
        return obj3;
    }

    private static Object m(q qVar, ViewGroup viewGroup, View view, h.a<String, String> aVar, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = eVar.f822a;
        Fragment fragment2 = eVar.f825d;
        if (fragment != null) {
            fragment.Y0().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z6 = eVar.f823b;
        Object t6 = aVar.isEmpty() ? null : t(qVar, fragment, fragment2, z6);
        h.a<String, View> i7 = i(qVar, aVar, t6, eVar);
        h.a<String, View> h7 = h(qVar, aVar, t6, eVar);
        if (aVar.isEmpty()) {
            if (i7 != null) {
                i7.clear();
            }
            if (h7 != null) {
                h7.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, i7, aVar.keySet());
            a(arrayList2, h7, aVar.values());
            obj3 = t6;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z6, i7, true);
        if (obj3 != null) {
            arrayList2.add(view);
            qVar.y(obj3, view, arrayList);
            z(qVar, obj3, obj2, i7, eVar.f826e, eVar.f827f);
            Rect rect2 = new Rect();
            View s7 = s(h7, eVar, obj, z6);
            if (s7 != null) {
                qVar.u(obj, rect2);
            }
            rect = rect2;
            view2 = s7;
        } else {
            view2 = null;
            rect = null;
        }
        androidx.core.view.f.a(viewGroup, new c(fragment, fragment2, z6, h7, view2, qVar, rect));
        return obj3;
    }

    private static void n(j jVar, int i7, e eVar, View view, h.a<String, String> aVar) {
        Fragment fragment;
        Fragment fragment2;
        q j7;
        Object obj;
        ViewGroup viewGroup = jVar.f703w.e() ? (ViewGroup) jVar.f703w.d(i7) : null;
        if (viewGroup == null || (j7 = j((fragment2 = eVar.f825d), (fragment = eVar.f822a))) == null) {
            return;
        }
        boolean z6 = eVar.f823b;
        boolean z7 = eVar.f826e;
        Object q7 = q(j7, fragment, z6);
        Object r7 = r(j7, fragment2, z7);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object l7 = l(j7, viewGroup, view, aVar, eVar, arrayList, arrayList2, q7, r7);
        if (q7 == null && l7 == null) {
            obj = r7;
            if (obj == null) {
                return;
            }
        } else {
            obj = r7;
        }
        ArrayList<View> k7 = k(j7, obj, fragment2, arrayList, view);
        Object obj2 = (k7 == null || k7.isEmpty()) ? null : obj;
        j7.a(q7, view);
        Object u6 = u(j7, q7, obj2, l7, fragment, eVar.f823b);
        if (u6 != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            j7.t(u6, q7, arrayList3, obj2, k7, l7, arrayList2);
            y(j7, viewGroup, fragment, view, arrayList2, q7, arrayList3, obj2, k7);
            j7.w(viewGroup, arrayList2, aVar);
            j7.c(viewGroup, u6);
            j7.s(viewGroup, arrayList2, aVar);
        }
    }

    private static void o(j jVar, int i7, e eVar, View view, h.a<String, String> aVar) {
        Fragment fragment;
        Fragment fragment2;
        q j7;
        Object obj;
        ViewGroup viewGroup = jVar.f703w.e() ? (ViewGroup) jVar.f703w.d(i7) : null;
        if (viewGroup == null || (j7 = j((fragment2 = eVar.f825d), (fragment = eVar.f822a))) == null) {
            return;
        }
        boolean z6 = eVar.f823b;
        boolean z7 = eVar.f826e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object q7 = q(j7, fragment, z6);
        Object r7 = r(j7, fragment2, z7);
        Object m7 = m(j7, viewGroup, view, aVar, eVar, arrayList2, arrayList, q7, r7);
        if (q7 == null && m7 == null) {
            obj = r7;
            if (obj == null) {
                return;
            }
        } else {
            obj = r7;
        }
        ArrayList<View> k7 = k(j7, obj, fragment2, arrayList2, view);
        ArrayList<View> k8 = k(j7, q7, fragment, arrayList, view);
        A(k8, 4);
        Object u6 = u(j7, q7, obj, m7, fragment, z6);
        if (u6 != null) {
            v(j7, obj, fragment2, k7);
            ArrayList<String> o7 = j7.o(arrayList);
            j7.t(u6, q7, k8, obj, k7, m7, arrayList);
            j7.c(viewGroup, u6);
            j7.x(viewGroup, arrayList2, arrayList, o7, aVar);
            A(k8, 0);
            j7.z(m7, arrayList2, arrayList);
        }
    }

    private static e p(e eVar, SparseArray<e> sparseArray, int i7) {
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        sparseArray.put(i7, eVar2);
        return eVar2;
    }

    private static Object q(q qVar, Fragment fragment, boolean z6) {
        if (fragment == null) {
            return null;
        }
        return qVar.g(z6 ? fragment.A() : fragment.p());
    }

    private static Object r(q qVar, Fragment fragment, boolean z6) {
        if (fragment == null) {
            return null;
        }
        return qVar.g(z6 ? fragment.D() : fragment.r());
    }

    static View s(h.a<String, View> aVar, e eVar, Object obj, boolean z6) {
        ArrayList<String> arrayList;
        androidx.fragment.app.a aVar2 = eVar.f824c;
        if (obj == null || aVar == null || (arrayList = aVar2.f779o) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z6 ? aVar2.f779o : aVar2.f780p).get(0));
    }

    private static Object t(q qVar, Fragment fragment, Fragment fragment2, boolean z6) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return qVar.A(qVar.g(z6 ? fragment2.F() : fragment.E()));
    }

    private static Object u(q qVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z6) {
        return (obj == null || obj2 == null || fragment == null) ? true : z6 ? fragment.k() : fragment.j() ? qVar.n(obj2, obj, obj3) : qVar.m(obj2, obj, obj3);
    }

    private static void v(q qVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.f605p && fragment.D && fragment.S) {
            fragment.e1(true);
            qVar.r(obj, fragment.I(), arrayList);
            androidx.core.view.f.a(fragment.K, new a(arrayList));
        }
    }

    private static q w() {
        try {
            return (q) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void x(h.a<String, String> aVar, h.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.m(size))) {
                aVar.k(size);
            }
        }
    }

    private static void y(q qVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        androidx.core.view.f.a(viewGroup, new b(obj, qVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    private static void z(q qVar, Object obj, Object obj2, h.a<String, View> aVar, boolean z6, androidx.fragment.app.a aVar2) {
        ArrayList<String> arrayList = aVar2.f779o;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = aVar.get((z6 ? aVar2.f780p : aVar2.f779o).get(0));
        qVar.v(obj, view);
        if (obj2 != null) {
            qVar.v(obj2, view);
        }
    }
}
