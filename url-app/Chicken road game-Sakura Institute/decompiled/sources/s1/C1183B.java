package s1;

import A.AbstractC0017m;
import B1.C0097d;
import D.C0144k;
import Z2.S;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.EnumC0475o;
import androidx.lifecycle.InterfaceC0481v;
import androidx.lifecycle.Y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import l.C0772a;
import n.AbstractC0864b;
import s.C1093I;
import y2.C1336k;
import z2.C1400D;
import z2.C1403G;
import z2.C1405I;
import z2.C1433q;
import z2.C1440x;
import z2.C1441y;
import z2.C1442z;

/* renamed from: s1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1183B {

    /* renamed from: A, reason: collision with root package name */
    public int f10433A;
    public final ArrayList B;

    /* renamed from: C, reason: collision with root package name */
    public final Z2.G f10434C;

    /* renamed from: D, reason: collision with root package name */
    public final Z2.A f10435D;

    /* renamed from: a, reason: collision with root package name */
    public final Context f10436a;

    /* renamed from: b, reason: collision with root package name */
    public final Activity f10437b;

    /* renamed from: c, reason: collision with root package name */
    public y f10438c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f10439d;

    /* renamed from: e, reason: collision with root package name */
    public Parcelable[] f10440e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10441f;

    /* renamed from: g, reason: collision with root package name */
    public final C1433q f10442g;

    /* renamed from: h, reason: collision with root package name */
    public final S f10443h;

    /* renamed from: i, reason: collision with root package name */
    public final S f10444i;

    /* renamed from: j, reason: collision with root package name */
    public final Z2.B f10445j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f10446k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f10447l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f10448m;

    /* renamed from: n, reason: collision with root package name */
    public final LinkedHashMap f10449n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC0481v f10450o;

    /* renamed from: p, reason: collision with root package name */
    public p f10451p;

    /* renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f10452q;

    /* renamed from: r, reason: collision with root package name */
    public EnumC0475o f10453r;

    /* renamed from: s, reason: collision with root package name */
    public final k f10454s;

    /* renamed from: t, reason: collision with root package name */
    public final B1.v f10455t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f10456u;

    /* renamed from: v, reason: collision with root package name */
    public final I f10457v;

    /* renamed from: w, reason: collision with root package name */
    public final LinkedHashMap f10458w;

    /* renamed from: x, reason: collision with root package name */
    public M2.p f10459x;

    /* renamed from: y, reason: collision with root package name */
    public m f10460y;

    /* renamed from: z, reason: collision with root package name */
    public final LinkedHashMap f10461z;

    public C1183B(Context context) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10436a = context;
        Iterator it = T2.n.f(context, C1186b.f10490i).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.f10437b = (Activity) obj;
        this.f10442g = new C1433q();
        C1405I c1405i = C1405I.f11931d;
        this.f10443h = Z2.H.c(c1405i);
        S c4 = Z2.H.c(c1405i);
        this.f10444i = c4;
        this.f10445j = new Z2.B(c4);
        this.f10446k = new LinkedHashMap();
        this.f10447l = new LinkedHashMap();
        this.f10448m = new LinkedHashMap();
        this.f10449n = new LinkedHashMap();
        this.f10452q = new CopyOnWriteArrayList();
        this.f10453r = EnumC0475o.f5481e;
        this.f10454s = new k(0, this);
        this.f10455t = new B1.v(3, this);
        this.f10456u = true;
        I i2 = new I();
        this.f10457v = i2;
        this.f10458w = new LinkedHashMap();
        this.f10461z = new LinkedHashMap();
        i2.a(new C1182A(i2));
        i2.a(new C1187c(this.f10436a));
        this.B = new ArrayList();
        C1336k.a(new C1093I(3, this));
        Z2.G b4 = Z2.H.b(1, 0, Y2.a.f4399e, 2);
        this.f10434C = b4;
        this.f10435D = new Z2.A(b4);
    }

    public static v e(v vVar, int i2, boolean z4) {
        y yVar;
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        if (vVar.f10575l == i2) {
            return vVar;
        }
        if (vVar instanceof y) {
            yVar = (y) vVar;
        } else {
            yVar = vVar.f10571e;
            Intrinsics.c(yVar);
        }
        return yVar.C(i2, yVar, z4);
    }

    public static void l(C1183B c1183b, String route, E e4, int i2) {
        Object obj = null;
        if ((i2 & 2) != 0) {
            e4 = null;
        }
        c1183b.getClass();
        Intrinsics.checkNotNullParameter(route, "route");
        int i4 = v.f10569n;
        Uri uri = Uri.parse(AbstractC0864b.o(route));
        Intrinsics.b(uri);
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(uri, "uri");
        C0097d request = new C0097d(uri, obj, obj, 23);
        Intrinsics.checkNotNullParameter(request, "request");
        if (c1183b.f10438c == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + request + ". Navigation graph has not been set for NavController " + c1183b + '.').toString());
        }
        y i5 = c1183b.i(c1183b.f10442g);
        u D3 = i5.D(request, true, true, i5);
        if (D3 == null) {
            throw new IllegalArgumentException("Navigation destination that matches request " + request + " cannot be found in the navigation graph " + c1183b.f10438c);
        }
        Bundle bundle = D3.f10565e;
        v vVar = D3.f10564d;
        Bundle h4 = vVar.h(bundle);
        if (h4 == null) {
            h4 = new Bundle();
        }
        Intent intent = new Intent();
        intent.setDataAndType(uri, null);
        intent.setAction(null);
        h4.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        c1183b.k(vVar, h4, e4);
    }

    public static /* synthetic */ void p(C1183B c1183b, C1193i c1193i) {
        c1183b.o(c1193i, false, new C1433q());
    }

    public final void a(v vVar, Bundle bundle, C1193i c1193i, List list) {
        Object obj;
        Object obj2;
        v vVar2 = c1193i.f10510e;
        boolean z4 = vVar2 instanceof InterfaceC1189e;
        C1433q c1433q = this.f10442g;
        if (!z4) {
            while (!c1433q.isEmpty() && (((C1193i) c1433q.last()).f10510e instanceof InterfaceC1189e) && n(((C1193i) c1433q.last()).f10510e.f10575l, true, false)) {
            }
        }
        C1433q c1433q2 = new C1433q();
        boolean z5 = vVar instanceof y;
        Context context = this.f10436a;
        Object obj3 = null;
        if (z5) {
            v vVar3 = vVar2;
            do {
                Intrinsics.c(vVar3);
                vVar3 = vVar3.f10571e;
                if (vVar3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = listIterator.previous();
                            if (Intrinsics.a(((C1193i) obj2).f10510e, vVar3)) {
                                break;
                            }
                        }
                    }
                    C1193i c1193i2 = (C1193i) obj2;
                    if (c1193i2 == null) {
                        c1193i2 = H1.f.k(context, vVar3, bundle, h(), this.f10451p);
                    }
                    c1433q2.addFirst(c1193i2);
                    if (!c1433q.isEmpty() && ((C1193i) c1433q.last()).f10510e == vVar3) {
                        p(this, (C1193i) c1433q.last());
                    }
                }
                if (vVar3 == null) {
                    break;
                }
            } while (vVar3 != vVar);
        }
        v vVar4 = c1433q2.isEmpty() ? vVar2 : ((C1193i) c1433q2.first()).f10510e;
        while (vVar4 != null && d(vVar4.f10575l) != vVar4) {
            vVar4 = vVar4.f10571e;
            if (vVar4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        obj = null;
                        break;
                    } else {
                        obj = listIterator2.previous();
                        if (Intrinsics.a(((C1193i) obj).f10510e, vVar4)) {
                            break;
                        }
                    }
                }
                C1193i c1193i3 = (C1193i) obj;
                if (c1193i3 == null) {
                    c1193i3 = H1.f.k(context, vVar4, vVar4.h(bundle2), h(), this.f10451p);
                }
                c1433q2.addFirst(c1193i3);
            }
        }
        if (!c1433q2.isEmpty()) {
            vVar2 = ((C1193i) c1433q2.first()).f10510e;
        }
        while (!c1433q.isEmpty() && (((C1193i) c1433q.last()).f10510e instanceof y)) {
            v vVar5 = ((C1193i) c1433q.last()).f10510e;
            Intrinsics.d(vVar5, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((y) vVar5).f10586o.b(vVar2.f10575l) != null) {
                break;
            } else {
                p(this, (C1193i) c1433q.last());
            }
        }
        C1193i c1193i4 = (C1193i) (c1433q.isEmpty() ? null : c1433q.f11957e[c1433q.f11956d]);
        if (c1193i4 == null) {
            c1193i4 = (C1193i) (c1433q2.isEmpty() ? null : c1433q2.f11957e[c1433q2.f11956d]);
        }
        if (!Intrinsics.a(c1193i4 != null ? c1193i4.f10510e : null, this.f10438c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object previous = listIterator3.previous();
                v vVar6 = ((C1193i) previous).f10510e;
                y yVar = this.f10438c;
                Intrinsics.c(yVar);
                if (Intrinsics.a(vVar6, yVar)) {
                    obj3 = previous;
                    break;
                }
            }
            C1193i c1193i5 = (C1193i) obj3;
            if (c1193i5 == null) {
                y yVar2 = this.f10438c;
                Intrinsics.c(yVar2);
                y yVar3 = this.f10438c;
                Intrinsics.c(yVar3);
                c1193i5 = H1.f.k(context, yVar2, yVar3.h(bundle), h(), this.f10451p);
            }
            c1433q2.addFirst(c1193i5);
        }
        Iterator it = c1433q2.iterator();
        while (it.hasNext()) {
            C1193i c1193i6 = (C1193i) it.next();
            Object obj4 = this.f10458w.get(this.f10457v.b(c1193i6.f10510e.f10570d));
            if (obj4 == null) {
                throw new IllegalStateException(AbstractC0017m.n(new StringBuilder("NavigatorBackStack for "), vVar.f10570d, " should already be created").toString());
            }
            ((l) obj4).a(c1193i6);
        }
        c1433q.addAll(c1433q2);
        c1433q.addLast(c1193i);
        Iterator it2 = C1403G.A(c1433q2, c1193i).iterator();
        while (it2.hasNext()) {
            C1193i c1193i7 = (C1193i) it2.next();
            y yVar4 = c1193i7.f10510e.f10571e;
            if (yVar4 != null) {
                j(c1193i7, f(yVar4.f10575l));
            }
        }
    }

    public final boolean b() {
        C1433q c1433q;
        while (true) {
            c1433q = this.f10442g;
            if (c1433q.isEmpty() || !(((C1193i) c1433q.last()).f10510e instanceof y)) {
                break;
            }
            p(this, (C1193i) c1433q.last());
        }
        C1193i c1193i = (C1193i) c1433q.C();
        ArrayList arrayList = this.B;
        if (c1193i != null) {
            arrayList.add(c1193i);
        }
        this.f10433A++;
        t();
        int i2 = this.f10433A - 1;
        this.f10433A = i2;
        if (i2 == 0) {
            ArrayList I3 = C1403G.I(arrayList);
            arrayList.clear();
            Iterator it = I3.iterator();
            while (it.hasNext()) {
                C1193i c1193i2 = (C1193i) it.next();
                Iterator it2 = this.f10452q.iterator();
                if (it2.hasNext()) {
                    if (it2.next() != null) {
                        throw new ClassCastException();
                    }
                    v vVar = c1193i2.f10510e;
                    c1193i2.g();
                    throw null;
                }
                this.f10434C.b(c1193i2);
            }
            ArrayList I4 = C1403G.I(c1433q);
            S s4 = this.f10443h;
            s4.getClass();
            s4.l(null, I4);
            ArrayList q2 = q();
            S s5 = this.f10444i;
            s5.getClass();
            s5.l(null, q2);
        }
        return c1193i != null;
    }

    public final boolean c(ArrayList arrayList, v vVar, boolean z4, boolean z5) {
        String str;
        M2.A a4 = new M2.A();
        C1433q c1433q = new C1433q();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            H h4 = (H) it.next();
            M2.A a5 = new M2.A();
            C1193i c1193i = (C1193i) this.f10442g.last();
            this.f10460y = new m(a5, a4, this, z5, c1433q);
            h4.e(c1193i, z5);
            this.f10460y = null;
            if (!a5.f3576d) {
                break;
            }
        }
        if (z5) {
            LinkedHashMap linkedHashMap = this.f10448m;
            if (!z4) {
                Sequence f4 = T2.n.f(vVar, C1186b.f10492k);
                n predicate = new n(this, 0);
                Intrinsics.checkNotNullParameter(f4, "<this>");
                Intrinsics.checkNotNullParameter(predicate, "predicate");
                T2.f fVar = new T2.f(new T2.s(f4, predicate, 0));
                while (fVar.hasNext()) {
                    Integer valueOf = Integer.valueOf(((v) fVar.next()).f10575l);
                    C1194j c1194j = (C1194j) (c1433q.isEmpty() ? null : c1433q.f11957e[c1433q.f11956d]);
                    linkedHashMap.put(valueOf, c1194j != null ? c1194j.f10521d : null);
                }
            }
            if (!c1433q.isEmpty()) {
                C1194j c1194j2 = (C1194j) c1433q.first();
                Sequence f5 = T2.n.f(d(c1194j2.f10522e), C1186b.f10493l);
                n predicate2 = new n(this, 1);
                Intrinsics.checkNotNullParameter(f5, "<this>");
                Intrinsics.checkNotNullParameter(predicate2, "predicate");
                T2.f fVar2 = new T2.f(new T2.s(f5, predicate2, 0));
                while (true) {
                    boolean hasNext = fVar2.hasNext();
                    str = c1194j2.f10521d;
                    if (!hasNext) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((v) fVar2.next()).f10575l), str);
                }
                if (linkedHashMap.values().contains(str)) {
                    this.f10449n.put(str, c1433q);
                }
            }
        }
        u();
        return a4.f3576d;
    }

    public final v d(int i2) {
        v vVar;
        y yVar = this.f10438c;
        if (yVar == null) {
            return null;
        }
        if (yVar.f10575l == i2) {
            return yVar;
        }
        C1193i c1193i = (C1193i) this.f10442g.C();
        if (c1193i == null || (vVar = c1193i.f10510e) == null) {
            vVar = this.f10438c;
            Intrinsics.c(vVar);
        }
        return e(vVar, i2, false);
    }

    public final C1193i f(int i2) {
        Object obj;
        C1433q c1433q = this.f10442g;
        ListIterator listIterator = c1433q.listIterator(c1433q.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((C1193i) obj).f10510e.f10575l == i2) {
                break;
            }
        }
        C1193i c1193i = (C1193i) obj;
        if (c1193i != null) {
            return c1193i;
        }
        StringBuilder o4 = AbstractC0017m.o(i2, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        C1193i c1193i2 = (C1193i) c1433q.C();
        o4.append(c1193i2 != null ? c1193i2.f10510e : null);
        throw new IllegalArgumentException(o4.toString().toString());
    }

    public final y g() {
        y yVar = this.f10438c;
        if (yVar == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        Intrinsics.d(yVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return yVar;
    }

    public final EnumC0475o h() {
        return this.f10450o == null ? EnumC0475o.f5482i : this.f10453r;
    }

    public final y i(C1433q c1433q) {
        v vVar;
        C1193i c1193i = (C1193i) c1433q.C();
        if (c1193i == null || (vVar = c1193i.f10510e) == null) {
            vVar = this.f10438c;
            Intrinsics.c(vVar);
        }
        if (vVar instanceof y) {
            return (y) vVar;
        }
        y yVar = vVar.f10571e;
        Intrinsics.c(yVar);
        return yVar;
    }

    public final void j(C1193i c1193i, C1193i c1193i2) {
        this.f10446k.put(c1193i, c1193i2);
        LinkedHashMap linkedHashMap = this.f10447l;
        if (linkedHashMap.get(c1193i2) == null) {
            linkedHashMap.put(c1193i2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(c1193i2);
        Intrinsics.c(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02b2, code lost:
    
        if (r11.hasPrevious() == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02c2, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(((s1.C1193i) r11.previous()).f10514l, r5.f10514l) == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02c4, code lost:
    
        r11 = r11.nextIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02cc, code lost:
    
        r10.set(r11, r5);
        r5 = r7.f10528b;
        r5.getClass();
        r5.l(null, r10);
        r5 = kotlin.Unit.f7487a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02da, code lost:
    
        r8.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02cb, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02c9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02de, code lost:
    
        r8.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02e1, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02e2, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01d8, code lost:
    
        if (r29.f10575l == r7.f10575l) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x00ea, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e1, code lost:
    
        r4 = (s1.C1193i) r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e5, code lost:
    
        if (r4 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e7, code lost:
    
        r4 = r4.f10510e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00eb, code lost:
    
        if (r4 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ed, code lost:
    
        android.util.Log.i("NavController", "Ignoring popBackStack to route " + r11 + " as it was not found on the current back stack");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0106, code lost:
    
        r4 = c(r14, r4, r13, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ca, code lost:
    
        if (r14.equals(r7) == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01da, code lost:
    
        r7 = new z2.C1433q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01e3, code lost:
    
        if (z2.C1441y.d(r5) < r12) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01e5, code lost:
    
        r13 = (s1.C1193i) z2.C1400D.n(r5);
        s(r13);
        r20 = r13.f10510e.h(r30);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, "entry");
        r14 = new s1.C1193i(r13.f10509d, r13.f10510e, r20, r13.f10512j, r13.f10513k, r13.f10514l, r13.f10515m);
        r14.f10512j = r13.f10512j;
        r14.h(r13.f10519q);
        r7.addFirst(r14);
        r12 = r12;
        r4 = r4;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0235, code lost:
    
        r26 = r4;
        r27 = r8;
        r4 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0241, code lost:
    
        if (r4.hasNext() == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0243, code lost:
    
        r8 = (s1.C1193i) r4.next();
        r10 = r8.f10510e.f10571e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x024d, code lost:
    
        if (r10 == null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x024f, code lost:
    
        j(r8, f(r10.f10575l));
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0258, code lost:
    
        r5.addLast(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x025c, code lost:
    
        r4 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0264, code lost:
    
        if (r4.hasNext() == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0266, code lost:
    
        r5 = (s1.C1193i) r4.next();
        r7 = r3.b(r5.f10510e.f10570d);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, "backStackEntry");
        r10 = r5.f10510e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x027b, code lost:
    
        if (r10 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x027e, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x027f, code lost:
    
        if (r10 != null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0282, code lost:
    
        m3.o.q(s1.C1186b.f10499r);
        r7.c(r10);
        r7 = r7.b();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, "backStackEntry");
        r8 = r7.f10527a;
        r8.lock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0296, code lost:
    
        r10 = z2.C1403G.I((java.util.Collection) ((Z2.S) r7.f10531e.f4611d).getValue());
        r11 = r10.listIterator(r10.size());
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x016a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00da A[LOOP:1: B:13:0x004a->B:22:0x00da, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e1 A[EDGE_INSN: B:23:0x00e1->B:24:0x00e1 BREAK  A[LOOP:1: B:13:0x004a->B:22:0x00da], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0321 A[LOOP:2: B:38:0x031b->B:40:0x0321, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(v vVar, Bundle bundle, E e4) {
        boolean z4;
        boolean z5;
        LinkedHashMap linkedHashMap;
        boolean z6;
        ListIterator listIterator;
        int i2;
        int i4;
        Iterator it;
        Object obj;
        ListIterator listIterator2;
        boolean z7;
        I i5 = this.f10457v;
        C1433q c1433q = this.f10442g;
        LinkedHashMap linkedHashMap2 = this.f10458w;
        Iterator it2 = linkedHashMap2.values().iterator();
        while (it2.hasNext()) {
            ((l) it2.next()).f10530d = true;
        }
        M2.A a4 = new M2.A();
        if (e4 != null) {
            String route = e4.f10477h;
            boolean z8 = e4.f10474e;
            boolean z9 = e4.f10473d;
            if (route == null) {
                int i6 = e4.f10472c;
                if (i6 != -1) {
                    z4 = n(i6, z9, z8);
                }
            } else if (!c1433q.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                ListIterator listIterator3 = c1433q.listIterator(c1433q.e());
                while (true) {
                    if (!listIterator3.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator3.previous();
                    C1193i c1193i = (C1193i) obj;
                    v vVar2 = c1193i.f10510e;
                    Bundle g4 = c1193i.g();
                    vVar2.getClass();
                    Intrinsics.checkNotNullParameter(route, "route");
                    if (Intrinsics.a(vVar2.f10576m, route)) {
                        listIterator2 = listIterator3;
                    } else {
                        u w4 = vVar2.w(route);
                        listIterator2 = listIterator3;
                        if (vVar2.equals(w4 != null ? w4.f10564d : null)) {
                            if (g4 != null) {
                                Bundle bundle2 = w4.f10565e;
                                if (bundle2 != null) {
                                    Set<String> keySet = bundle2.keySet();
                                    Intrinsics.checkNotNullExpressionValue(keySet, "matchingArgs.keySet()");
                                    Iterator it3 = keySet.iterator();
                                    while (it3.hasNext()) {
                                        String str = (String) it3.next();
                                        if (g4.containsKey(str)) {
                                            Iterator it4 = it3;
                                            if (w4.f10564d.f10574k.get(str) != null) {
                                                throw new ClassCastException();
                                            }
                                            it3 = it4;
                                        }
                                    }
                                }
                            } else {
                                w4.getClass();
                            }
                        }
                        z7 = false;
                        if (!z9 || !z7) {
                            arrayList.add(i5.b(c1193i.f10510e.f10570d));
                        }
                        if (!z7) {
                            break;
                        } else {
                            listIterator3 = listIterator2;
                        }
                    }
                    z7 = true;
                    if (!z9) {
                    }
                    arrayList.add(i5.b(c1193i.f10510e.f10570d));
                    if (!z7) {
                    }
                }
            }
            Bundle h4 = vVar.h(bundle);
            if (e4 == null && e4.f10471b && this.f10448m.containsKey(Integer.valueOf(vVar.f10575l))) {
                a4.f3576d = r(vVar.f10575l, h4, e4);
                z5 = z4;
                linkedHashMap = linkedHashMap2;
                z6 = false;
            } else {
                if (e4 != null && e4.f10470a) {
                    C1193i c1193i2 = (C1193i) c1433q.C();
                    listIterator = c1433q.listIterator(c1433q.e());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            i2 = -1;
                            i4 = -1;
                            break;
                        } else if (((C1193i) listIterator.previous()).f10510e == vVar) {
                            i4 = listIterator.nextIndex();
                            i2 = -1;
                            break;
                        }
                    }
                    if (i4 != i2) {
                        if (vVar instanceof y) {
                            int i7 = y.f10585s;
                            y yVar = (y) vVar;
                            Intrinsics.checkNotNullParameter(yVar, "<this>");
                            List k4 = T2.r.k(T2.r.i(T2.n.f(yVar, C1186b.f10498q), C1186b.f10496o));
                            if (c1433q.f11958i - i4 == k4.size()) {
                                List subList = c1433q.subList(i4, c1433q.f11958i);
                                ArrayList arrayList2 = new ArrayList(C1442z.h(subList, 10));
                                Iterator it5 = subList.iterator();
                                while (it5.hasNext()) {
                                    arrayList2.add(Integer.valueOf(((C1193i) it5.next()).f10510e.f10575l));
                                }
                            }
                        } else if (c1193i2 != null) {
                            v vVar3 = c1193i2.f10510e;
                            if (vVar3 != null) {
                            }
                        }
                        if (!z6) {
                            C1193i k5 = H1.f.k(this.f10436a, vVar, h4, h(), this.f10451p);
                            H b4 = i5.b(vVar.f10570d);
                            List a5 = C1440x.a(k5);
                            this.f10459x = new C0772a(a4, this, vVar, h4);
                            b4.d(a5, e4);
                            this.f10459x = null;
                        }
                    }
                }
                z5 = z4;
                linkedHashMap = linkedHashMap2;
                z6 = false;
                if (!z6) {
                }
            }
            u();
            it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                ((l) it.next()).f10530d = false;
            }
            if (!z5 || a4.f3576d || z6) {
                b();
            } else {
                t();
                return;
            }
        }
        z4 = false;
        Bundle h42 = vVar.h(bundle);
        if (e4 == null) {
        }
        if (e4 != null) {
            C1193i c1193i22 = (C1193i) c1433q.C();
            listIterator = c1433q.listIterator(c1433q.e());
            while (true) {
                if (listIterator.hasPrevious()) {
                }
            }
            if (i4 != i2) {
            }
        }
        z5 = z4;
        linkedHashMap = linkedHashMap2;
        z6 = false;
        if (!z6) {
        }
        u();
        it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
        }
        if (z5) {
        }
        b();
    }

    public final void m() {
        C1433q c1433q = this.f10442g;
        if (c1433q.isEmpty()) {
            return;
        }
        C1193i c1193i = (C1193i) c1433q.C();
        v vVar = c1193i != null ? c1193i.f10510e : null;
        Intrinsics.c(vVar);
        if (n(vVar.f10575l, true, false)) {
            b();
        }
    }

    public final boolean n(int i2, boolean z4, boolean z5) {
        v vVar;
        C1433q c1433q = this.f10442g;
        if (c1433q.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = C1403G.C(c1433q).iterator();
        while (true) {
            if (!it.hasNext()) {
                vVar = null;
                break;
            }
            vVar = ((C1193i) it.next()).f10510e;
            H b4 = this.f10457v.b(vVar.f10570d);
            if (z4 || vVar.f10575l != i2) {
                arrayList.add(b4);
            }
            if (vVar.f10575l == i2) {
                break;
            }
        }
        if (vVar != null) {
            return c(arrayList, vVar, z4, z5);
        }
        int i4 = v.f10569n;
        Log.i("NavController", "Ignoring popBackStack to destination " + AbstractC0864b.s(this.f10436a, i2) + " as it was not found on the current back stack");
        return false;
    }

    public final void o(C1193i c1193i, boolean z4, C1433q c1433q) {
        p pVar;
        Z2.B b4;
        Set set;
        C1433q c1433q2 = this.f10442g;
        C1193i c1193i2 = (C1193i) c1433q2.last();
        if (!Intrinsics.a(c1193i2, c1193i)) {
            throw new IllegalStateException(("Attempted to pop " + c1193i.f10510e + ", which is not the top of the back stack (" + c1193i2.f10510e + ')').toString());
        }
        C1400D.n(c1433q2);
        l lVar = (l) this.f10458w.get(this.f10457v.b(c1193i2.f10510e.f10570d));
        boolean z5 = true;
        if ((lVar == null || (b4 = lVar.f10532f) == null || (set = (Set) ((S) b4.f4611d).getValue()) == null || !set.contains(c1193i2)) && !this.f10447l.containsKey(c1193i2)) {
            z5 = false;
        }
        EnumC0475o enumC0475o = c1193i2.f10516n.f5496d;
        EnumC0475o enumC0475o2 = EnumC0475o.f5482i;
        if (enumC0475o.a(enumC0475o2)) {
            if (z4) {
                c1193i2.h(enumC0475o2);
                c1433q.addFirst(new C1194j(c1193i2));
            }
            if (z5) {
                c1193i2.h(enumC0475o2);
            } else {
                c1193i2.h(EnumC0475o.f5480d);
                s(c1193i2);
            }
        }
        if (z4 || z5 || (pVar = this.f10451p) == null) {
            return;
        }
        String backStackEntryId = c1193i2.f10514l;
        Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
        Y y4 = (Y) pVar.f10543b.remove(backStackEntryId);
        if (y4 != null) {
            y4.a();
        }
    }

    public final ArrayList q() {
        EnumC0475o enumC0475o;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f10458w.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            enumC0475o = EnumC0475o.f5483j;
            if (!hasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((S) ((l) it.next()).f10532f.f4611d).getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                C1193i c1193i = (C1193i) obj;
                if (!arrayList.contains(c1193i) && !c1193i.f10519q.a(enumC0475o)) {
                    arrayList2.add(obj);
                }
            }
            C1400D.j(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.f10442g.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            C1193i c1193i2 = (C1193i) next;
            if (!arrayList.contains(c1193i2) && c1193i2.f10519q.a(enumC0475o)) {
                arrayList3.add(next);
            }
        }
        C1400D.j(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (!(((C1193i) next2).f10510e instanceof y)) {
                arrayList4.add(next2);
            }
        }
        return arrayList4;
    }

    public final boolean r(int i2, Bundle bundle, E e4) {
        v g4;
        C1193i c1193i;
        v vVar;
        LinkedHashMap linkedHashMap = this.f10448m;
        if (!linkedHashMap.containsKey(Integer.valueOf(i2))) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i2));
        Collection values = linkedHashMap.values();
        C0144k predicate = new C0144k(str, 2);
        Intrinsics.checkNotNullParameter(values, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        C1400D.k(values, predicate, true);
        C1433q c1433q = (C1433q) M2.J.c(this.f10449n).remove(str);
        ArrayList arrayList = new ArrayList();
        C1193i c1193i2 = (C1193i) this.f10442g.C();
        if (c1193i2 == null || (g4 = c1193i2.f10510e) == null) {
            g4 = g();
        }
        if (c1433q != null) {
            Iterator it = c1433q.iterator();
            while (it.hasNext()) {
                C1194j c1194j = (C1194j) it.next();
                v e5 = e(g4, c1194j.f10522e, true);
                Context context = this.f10436a;
                if (e5 == null) {
                    int i4 = v.f10569n;
                    throw new IllegalStateException(("Restore State failed: destination " + AbstractC0864b.s(context, c1194j.f10522e) + " cannot be found from the current destination " + g4).toString());
                }
                arrayList.add(c1194j.a(context, e5, h(), this.f10451p));
                g4 = e5;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!(((C1193i) next).f10510e instanceof y)) {
                arrayList3.add(next);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (true) {
            String str2 = null;
            if (!it3.hasNext()) {
                break;
            }
            C1193i c1193i3 = (C1193i) it3.next();
            List list = (List) C1403G.y(arrayList2);
            if (list != null && (c1193i = (C1193i) C1403G.x(list)) != null && (vVar = c1193i.f10510e) != null) {
                str2 = vVar.f10570d;
            }
            if (Intrinsics.a(str2, c1193i3.f10510e.f10570d)) {
                list.add(c1193i3);
            } else {
                arrayList2.add(C1441y.f(c1193i3));
            }
        }
        M2.A a4 = new M2.A();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            List list2 = (List) it4.next();
            H b4 = this.f10457v.b(((C1193i) C1403G.q(list2)).f10510e.f10570d);
            this.f10459x = new P0.h(a4, arrayList, new M2.C(), this, bundle, 1);
            b4.d(list2, e4);
            this.f10459x = null;
        }
        return a4.f3576d;
    }

    public final void s(C1193i child) {
        Intrinsics.checkNotNullParameter(child, "child");
        C1193i c1193i = (C1193i) this.f10446k.remove(child);
        if (c1193i == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f10447l;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(c1193i);
        Integer valueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            l lVar = (l) this.f10458w.get(this.f10457v.b(c1193i.f10510e.f10570d));
            if (lVar != null) {
                lVar.b(c1193i);
            }
            linkedHashMap.remove(c1193i);
        }
    }

    public final void t() {
        AtomicInteger atomicInteger;
        Z2.B b4;
        Set set;
        ArrayList I3 = C1403G.I(this.f10442g);
        if (I3.isEmpty()) {
            return;
        }
        v vVar = ((C1193i) C1403G.x(I3)).f10510e;
        ArrayList arrayList = new ArrayList();
        if (vVar instanceof InterfaceC1189e) {
            Iterator it = C1403G.C(I3).iterator();
            while (it.hasNext()) {
                v vVar2 = ((C1193i) it.next()).f10510e;
                arrayList.add(vVar2);
                if (!(vVar2 instanceof InterfaceC1189e) && !(vVar2 instanceof y)) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        for (C1193i c1193i : C1403G.C(I3)) {
            EnumC0475o enumC0475o = c1193i.f10519q;
            v vVar3 = c1193i.f10510e;
            EnumC0475o enumC0475o2 = EnumC0475o.f5484k;
            EnumC0475o enumC0475o3 = EnumC0475o.f5483j;
            if (vVar != null && vVar3.f10575l == vVar.f10575l) {
                if (enumC0475o != enumC0475o2) {
                    l lVar = (l) this.f10458w.get(this.f10457v.b(vVar3.f10570d));
                    if (Intrinsics.a((lVar == null || (b4 = lVar.f10532f) == null || (set = (Set) ((S) b4.f4611d).getValue()) == null) ? null : Boolean.valueOf(set.contains(c1193i)), Boolean.TRUE) || ((atomicInteger = (AtomicInteger) this.f10447l.get(c1193i)) != null && atomicInteger.get() == 0)) {
                        hashMap.put(c1193i, enumC0475o3);
                    } else {
                        hashMap.put(c1193i, enumC0475o2);
                    }
                }
                v vVar4 = (v) C1403G.r(arrayList);
                if (vVar4 != null && vVar4.f10575l == vVar3.f10575l) {
                    C1400D.m(arrayList);
                }
                vVar = vVar.f10571e;
            } else if (arrayList.isEmpty() || vVar3.f10575l != ((v) C1403G.q(arrayList)).f10575l) {
                c1193i.h(EnumC0475o.f5482i);
            } else {
                v vVar5 = (v) C1400D.m(arrayList);
                if (enumC0475o == enumC0475o2) {
                    c1193i.h(enumC0475o3);
                } else if (enumC0475o != enumC0475o3) {
                    hashMap.put(c1193i, enumC0475o3);
                }
                y yVar = vVar5.f10571e;
                if (yVar != null && !arrayList.contains(yVar)) {
                    arrayList.add(yVar);
                }
            }
        }
        Iterator it2 = I3.iterator();
        while (it2.hasNext()) {
            C1193i c1193i2 = (C1193i) it2.next();
            EnumC0475o enumC0475o4 = (EnumC0475o) hashMap.get(c1193i2);
            if (enumC0475o4 != null) {
                c1193i2.h(enumC0475o4);
            } else {
                c1193i2.i();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [M2.m, kotlin.jvm.functions.Function0] */
    public final void u() {
        int i2;
        boolean z4 = false;
        if (this.f10456u) {
            C1433q c1433q = this.f10442g;
            if (c1433q == null || !c1433q.isEmpty()) {
                Iterator it = c1433q.iterator();
                i2 = 0;
                while (it.hasNext()) {
                    if (!(((C1193i) it.next()).f10510e instanceof y) && (i2 = i2 + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            } else {
                i2 = 0;
            }
            if (i2 > 1) {
                z4 = true;
            }
        }
        B1.v vVar = this.f10455t;
        vVar.f5586a = z4;
        ?? r02 = vVar.f5588c;
        if (r02 != 0) {
            r02.invoke();
        }
    }
}
