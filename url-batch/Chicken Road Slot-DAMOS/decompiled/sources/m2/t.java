package m2;

import android.os.Bundle;
import android.os.Parcelable;
import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.k0;
import kotlin.collections.p0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import x3.m0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6514d;

    public /* synthetic */ t(int i3) {
        this.f6514d = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        g gVar;
        Object a9;
        Bundle bundle = null;
        final int i3 = 1;
        switch (this.f6514d) {
            case 0:
                return Integer.valueOf(((w2.d) obj2).f10027a);
            case 1:
                return Integer.valueOf(((p2.o) obj2).f7639a);
            case 2:
                return Integer.valueOf(((p2.p) obj2).f7640a);
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                x2.n nVar = (x2.n) obj2;
                return nVar != null ? x2.n.a(nVar.f10336a, x2.n.f10335c) : false ? Boolean.FALSE : kotlin.collections.y.d(Float.valueOf(x2.n.c(nVar.f10336a)), y.a(new x2.o(x2.n.b(nVar.f10336a)), y.f6540w, (a1.c) obj));
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                i iVar = (i) obj2;
                return kotlin.collections.y.d(iVar.f6484a, y.a(iVar.f6485b, y.f6527i, (a1.c) obj));
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                long j = ((x2.o) obj2).f10337a;
                if (x2.o.a(j, 8589934592L)) {
                    return 0;
                }
                if (x2.o.a(j, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                j1.b bVar = (j1.b) obj2;
                return bVar != null ? j1.b.a(bVar.f4914a, 9205357640488583168L) : false ? Boolean.FALSE : kotlin.collections.y.d(Float.valueOf(Float.intBitsToFloat((int) (bVar.f4914a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (bVar.f4914a & 4294967295L))));
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                a1.c cVar = (a1.c) obj;
                c cVar2 = (c) obj2;
                Object obj3 = cVar2.f6439a;
                if (obj3 instanceof p) {
                    gVar = g.f6468d;
                } else if (obj3 instanceof a0) {
                    gVar = g.f6469e;
                } else if (obj3 instanceof j0) {
                    gVar = g.f6470i;
                } else if (obj3 instanceof i0) {
                    gVar = g.f6471r;
                } else if (obj3 instanceof j) {
                    gVar = g.f6472s;
                } else if (obj3 instanceof i) {
                    gVar = g.f6473t;
                } else {
                    if (!(obj3 instanceof c0)) {
                        a2.r.a();
                        return null;
                    }
                    gVar = g.f6474u;
                }
                switch (gVar.ordinal()) {
                    case 0:
                        obj3.getClass();
                        a9 = y.a((p) obj3, y.g, cVar);
                        break;
                    case 1:
                        obj3.getClass();
                        a9 = y.a((a0) obj3, y.f6526h, cVar);
                        break;
                    case 2:
                        obj3.getClass();
                        a9 = y.a((j0) obj3, y.f6522c, cVar);
                        break;
                    case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                        obj3.getClass();
                        a9 = y.a((i0) obj3, y.f6523d, cVar);
                        break;
                    case a4.j.LONG_FIELD_NUMBER /* 4 */:
                        obj3.getClass();
                        a9 = y.a((j) obj3, y.f6524e, cVar);
                        break;
                    case a4.j.STRING_FIELD_NUMBER /* 5 */:
                        obj3.getClass();
                        a9 = y.a((i) obj3, y.f6525f, cVar);
                        break;
                    case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj3.getClass();
                        a9 = ((c0) obj3).f6443a;
                        break;
                    default:
                        a2.r.p();
                        return null;
                }
                return kotlin.collections.y.d(gVar, a9, Integer.valueOf(cVar2.f6440b), Integer.valueOf(cVar2.f6441c), cVar2.f6442d);
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                a1.c cVar3 = (a1.c) obj;
                List list = ((s2.b) obj2).f8410d;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(y.a((s2.a) list.get(i10), y.f6543z, cVar3));
                }
                return arrayList;
            case 9:
                return ((s2.a) obj2).f8408a.toLanguageTag();
            case 10:
                a1.c cVar4 = (a1.c) obj;
                w2.i iVar2 = (w2.i) obj2;
                return kotlin.collections.y.d(y.a(new w2.f(iVar2.f10037a), y.B, cVar4), y.a(new w2.h(iVar2.f10038b), y.C, cVar4), y.a(new w2.g(iVar2.f10039c), y.D, cVar4));
            case RequestError.STOP_TRACKING /* 11 */:
                return Float.valueOf(((w2.f) obj2).f10033a);
            case 12:
                return Integer.valueOf(((w2.h) obj2).f10035a);
            case 13:
                return Integer.valueOf(((w2.g) obj2).f10034a);
            case 14:
                return ((j0) obj2).f6489a;
            case 15:
                a1.c cVar5 = (a1.c) obj;
                p pVar = (p) obj2;
                Object a10 = y.a(new w2.k(pVar.f6501a), y.f6534q, cVar5);
                Object a11 = y.a(new w2.m(pVar.f6502b), y.f6535r, cVar5);
                Object a12 = y.a(new x2.n(pVar.f6503c), y.f6539v, cVar5);
                w2.q qVar = pVar.f6504d;
                w2.q qVar2 = w2.q.f10052c;
                Object a13 = y.a(qVar, y.f6529l, cVar5);
                Object a14 = y.a(pVar.f6505e, z.f6544a, cVar5);
                w2.i iVar3 = pVar.f6506f;
                w2.i iVar4 = w2.i.f10036d;
                return kotlin.collections.y.d(a10, a11, a12, a13, a14, y.a(iVar3, y.A, cVar5), y.a(new w2.e(pVar.g), z.f6546c, cVar5), y.a(new w2.d(pVar.f6507h), y.f6536s, cVar5), y.a(pVar.f6508i, z.f6547d, cVar5));
            case 16:
                return ((i0) obj2).f6486a;
            case 17:
                a1.c cVar6 = (a1.c) obj;
                a0 a0Var = (a0) obj2;
                k1.p pVar2 = new k1.p(a0Var.f6422a.b());
                x xVar = y.f6533p;
                Object a15 = y.a(pVar2, xVar, cVar6);
                x2.n nVar2 = new x2.n(a0Var.f6423b);
                x xVar2 = y.f6539v;
                Object a16 = y.a(nVar2, xVar2, cVar6);
                p2.s sVar = a0Var.f6424c;
                p2.s sVar2 = p2.s.f7642e;
                Object a17 = y.a(sVar, y.f6530m, cVar6);
                Object a18 = y.a(a0Var.f6425d, y.f6537t, cVar6);
                Object a19 = y.a(a0Var.f6426e, y.f6538u, cVar6);
                String str = a0Var.g;
                Object a20 = y.a(new x2.n(a0Var.f6428h), xVar2, cVar6);
                Object a21 = y.a(a0Var.f6429i, y.f6531n, cVar6);
                Object a22 = y.a(a0Var.j, y.f6528k, cVar6);
                s2.b bVar2 = a0Var.f6430k;
                s2.b bVar3 = s2.b.f8409i;
                Object a23 = y.a(bVar2, y.f6542y, cVar6);
                Object a24 = y.a(new k1.p(a0Var.f6431l), xVar, cVar6);
                Object a25 = y.a(a0Var.f6432m, y.j, cVar6);
                k1.e0 e0Var = a0Var.f6433n;
                k1.e0 e0Var2 = k1.e0.f5315d;
                return kotlin.collections.y.d(a15, a16, a17, a18, a19, -1, str, a20, a21, a22, a23, a24, a25, y.a(e0Var, y.f6532o, cVar6));
            case 18:
                a1.c cVar7 = (a1.c) obj;
                f0 f0Var = (f0) obj2;
                a0 a0Var2 = f0Var.f6464a;
                c6.c cVar8 = y.f6526h;
                return kotlin.collections.y.d(y.a(a0Var2, cVar8, cVar7), y.a(f0Var.f6465b, cVar8, cVar7), y.a(f0Var.f6466c, cVar8, cVar7), y.a(f0Var.f6467d, cVar8, cVar7));
            case 19:
                r rVar = (r) obj2;
                Boolean valueOf = Boolean.valueOf(rVar.f6511a);
                c6.c cVar9 = y.f6520a;
                return kotlin.collections.y.d(valueOf, y.a(new h(rVar.f6512b), z.f6545b, (a1.c) obj));
            case 20:
                return Integer.valueOf(((h) obj2).f6479a);
            case 21:
                return Integer.valueOf(((w2.e) obj2).f10029a);
            case 22:
                w2.s sVar3 = (w2.s) obj2;
                return kotlin.collections.y.d(y.a(new w2.r(sVar3.f10058a), z.f6548e, (a1.c) obj), Boolean.valueOf(sVar3.f10059b));
            case 23:
                return Integer.valueOf(((w2.r) obj2).f10055a);
            case 24:
                n0.i0 i0Var = (n0.i0) obj;
                int intValue = ((Integer) obj2).intValue();
                if (!i0Var.O(intValue & 1, (intValue & 3) != 2)) {
                    i0Var.R();
                }
                return Unit.f5554a;
            case 25:
                n0.i0 i0Var2 = (n0.i0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (!i0Var2.O(intValue2 & 1, (intValue2 & 3) != 2)) {
                    i0Var2.R();
                }
                return Unit.f5554a;
            case 26:
                n4.x xVar3 = (n4.x) obj2;
                q4.h hVar = xVar3.f7130b;
                LinkedHashMap linkedHashMap = hVar.f8004m;
                kotlin.collections.s sVar4 = hVar.f7999f;
                LinkedHashMap linkedHashMap2 = hVar.f8003l;
                ArrayList arrayList2 = new ArrayList();
                k0.f5575d.getClass();
                Bundle h10 = z4.w.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
                for (Map.Entry entry : p0.h(hVar.f8010s.f7074a).entrySet()) {
                    ((n4.h0) entry.getValue()).getClass();
                }
                if (!arrayList2.isEmpty()) {
                    k0.f5575d.getClass();
                    bundle = z4.w.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    cf.c.D(h10, "android-support-nav:controller:navigatorState:names", arrayList2);
                    bundle.putBundle("android-support-nav:controller:navigatorState", h10);
                }
                if (!sVar4.isEmpty()) {
                    if (bundle == null) {
                        k0.f5575d.getClass();
                        bundle = z4.w.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    }
                    ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                    Iterator<E> it = sVar4.iterator();
                    while (it.hasNext()) {
                        n4.h hVar2 = (n4.h) it.next();
                        hVar2.getClass();
                        int i11 = hVar2.f7063e.f7115e.f1694a;
                        String str2 = hVar2.f7067t;
                        q4.c cVar10 = hVar2.f7069v;
                        Bundle a26 = cVar10.a();
                        k0.f5575d.getClass();
                        Bundle h11 = z4.w.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        cVar10.f7976h.h(h11);
                        Bundle h12 = z4.w.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        str2.getClass();
                        h12.putString("nav-entry-state:id", str2);
                        h12.putInt("nav-entry-state:destination-id", i11);
                        if (a26 == null) {
                            a26 = z4.w.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        }
                        h12.putBundle("nav-entry-state:args", a26);
                        h12.putBundle("nav-entry-state:saved-state", h11);
                        arrayList3.add(h12);
                    }
                    bundle.putParcelableArrayList("android-support-nav:controller:backStack", arrayList3);
                }
                if (!linkedHashMap2.isEmpty()) {
                    if (bundle == null) {
                        k0.f5575d.getClass();
                        bundle = z4.w.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    }
                    int[] iArr = new int[linkedHashMap2.size()];
                    ArrayList arrayList4 = new ArrayList();
                    int i12 = 0;
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        int intValue3 = ((Number) entry2.getKey()).intValue();
                        String str3 = (String) entry2.getValue();
                        int i13 = i12 + 1;
                        iArr[i12] = intValue3;
                        if (str3 == null) {
                            str3 = "";
                        }
                        arrayList4.add(str3);
                        i12 = i13;
                    }
                    bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    cf.c.D(bundle, "android-support-nav:controller:backStackIds", arrayList4);
                }
                if (!linkedHashMap.isEmpty()) {
                    if (bundle == null) {
                        k0.f5575d.getClass();
                        bundle = z4.w.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        String str4 = (String) entry3.getKey();
                        kotlin.collections.s sVar5 = (kotlin.collections.s) entry3.getValue();
                        arrayList5.add(str4);
                        ArrayList<? extends Parcelable> arrayList6 = new ArrayList<>();
                        Iterator it2 = sVar5.iterator();
                        while (it2.hasNext()) {
                            y6.l lVar = ((n4.i) it2.next()).f7072a;
                            lVar.getClass();
                            k0.f5575d.getClass();
                            Bundle h13 = z4.w.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
                            String str5 = (String) lVar.f10660e;
                            str5.getClass();
                            h13.putString("nav-entry-state:id", str5);
                            h13.putInt("nav-entry-state:destination-id", lVar.f10659d);
                            Bundle bundle2 = (Bundle) lVar.f10661i;
                            if (bundle2 == null) {
                                bundle2 = z4.w.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
                            }
                            h13.putBundle("nav-entry-state:args", bundle2);
                            Bundle bundle3 = (Bundle) lVar.f10662r;
                            bundle3.getClass();
                            h13.putBundle("nav-entry-state:saved-state", bundle3);
                            arrayList6.add(h13);
                        }
                        bundle.putParcelableArrayList("android-support-nav:controller:backStackStates:" + str4, arrayList6);
                    }
                    cf.c.D(bundle, "android-support-nav:controller:backStackStates", arrayList5);
                }
                if (xVar3.f7133e) {
                    if (bundle == null) {
                        k0.f5575d.getClass();
                        bundle = z4.w.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    }
                    bundle.putBoolean("android-support-nav:controller:deepLinkHandled", xVar3.f7133e);
                }
                return bundle;
            case 27:
                ce.b bVar4 = (ce.b) obj;
                final List list2 = (List) obj2;
                bVar4.getClass();
                list2.getClass();
                ArrayList J = cf.c.J(ue.a.f9716a, list2, true);
                J.getClass();
                final int i14 = false ? 1 : 0;
                return cf.c.B(bVar4, J, new Function0() { // from class: pe.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i14) {
                        }
                        return ((te.k0) list2.get(0)).f9395a.b();
                    }
                });
            case 28:
                ce.b bVar5 = (ce.b) obj;
                final List list3 = (List) obj2;
                bVar5.getClass();
                list3.getClass();
                ArrayList J2 = cf.c.J(ue.a.f9716a, list3, true);
                J2.getClass();
                pe.a B = cf.c.B(bVar5, J2, new Function0() { // from class: pe.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i3) {
                        }
                        return ((te.k0) list3.get(0)).f9395a.b();
                    }
                });
                if (B != null) {
                    return g8.b.C(B);
                }
                return null;
            default:
                m0 m0Var = (m0) obj;
                Throwable th = (Throwable) obj2;
                m0Var.getClass();
                ge.n nVar3 = m0Var.f10409b;
                if (th == null) {
                    th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                nVar3.S(new ge.q(th, false));
                return Unit.f5554a;
        }
    }
}
