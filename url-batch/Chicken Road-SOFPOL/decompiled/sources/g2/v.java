package g2;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import m0.e1;
import t.u0;
import x.v0;
import y3.l0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements p6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3005d;

    public /* synthetic */ v(int i) {
        this.f3005d = i;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        g6.b bVar;
        Bundle bundle = null;
        switch (this.f3005d) {
            case 0:
                return ((k0) obj2).f2970a;
            case 1:
                return ((j0) obj2).f2969a;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                v0.b bVar2 = (v0.b) obj;
                r rVar = (r) obj2;
                q2.k kVar = new q2.k(rVar.f2993a);
                q2.m mVar = new q2.m(rVar.f2994b);
                Object a8 = z.a(new r2.n(rVar.f2995c), z.f3025q, bVar2);
                q2.q qVar = rVar.f2996d;
                q2.q qVar2 = q2.q.f6064c;
                Object a9 = z.a(qVar, z.f3020l, bVar2);
                Object a10 = z.a(rVar.f2997e, a0.f2900a, bVar2);
                q2.i iVar = rVar.f2998f;
                q2.i iVar2 = q2.i.f6049c;
                return s6.a.f(kVar, mVar, a8, a9, a10, z.a(iVar, z.f3029u, bVar2), z.a(new q2.e(rVar.f2999g), a0.f2901b, bVar2), new q2.d(rVar.f3000h), z.a(rVar.i, a0.f2902c, bVar2));
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                v0.b bVar3 = (v0.b) obj;
                b0 b0Var = (b0) obj2;
                f1.s sVar = new f1.s(b0Var.f2903a.b());
                y yVar = z.f3024p;
                Object a11 = z.a(sVar, yVar, bVar3);
                r2.n nVar = new r2.n(b0Var.f2904b);
                y yVar2 = z.f3025q;
                Object a12 = z.a(nVar, yVar2, bVar3);
                j2.k kVar2 = b0Var.f2905c;
                j2.k kVar3 = j2.k.f3994e;
                Object a13 = z.a(kVar2, z.f3021m, bVar3);
                j2.i iVar3 = b0Var.f2906d;
                j2.j jVar = b0Var.f2907e;
                String str = b0Var.f2909g;
                Object a14 = z.a(new r2.n(b0Var.f2910h), yVar2, bVar3);
                Object a15 = z.a(b0Var.i, z.f3022n, bVar3);
                Object a16 = z.a(b0Var.f2911j, z.f3019k, bVar3);
                m2.b bVar4 = b0Var.f2912k;
                m2.b bVar5 = m2.b.f5217f;
                Object a17 = z.a(bVar4, z.f3027s, bVar3);
                Object a18 = z.a(new f1.s(b0Var.f2913l), yVar, bVar3);
                Object a19 = z.a(b0Var.f2914m, z.f3018j, bVar3);
                f1.h0 h0Var = b0Var.f2915n;
                f1.h0 h0Var2 = f1.h0.f2663d;
                return s6.a.f(a11, a12, a13, iVar3, jVar, -1, str, a14, a15, a16, a17, a18, a19, z.a(h0Var, z.f3023o, bVar3));
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                v0.b bVar6 = (v0.b) obj;
                g0 g0Var = (g0) obj2;
                b0 b0Var2 = g0Var.f2954a;
                a0.a0 a0Var = z.f3017h;
                return s6.a.f(z.a(b0Var2, a0Var, bVar6), z.a(g0Var.f2955b, a0Var, bVar6), z.a(g0Var.f2956c, a0Var, bVar6), z.a(g0Var.f2957d, a0Var, bVar6));
            case 5:
                Boolean valueOf = Boolean.valueOf(((t) obj2).f3003a);
                a0.a0 a0Var2 = z.f3010a;
                return s6.a.f(valueOf, new h());
            case 6:
                return Integer.valueOf(((q2.e) obj2).f6043a);
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                q2.s sVar2 = (q2.s) obj2;
                q2.r rVar2 = new q2.r(sVar2.f6070a);
                a0.a0 a0Var3 = z.f3010a;
                return s6.a.f(rVar2, Boolean.valueOf(sVar2.f6071b));
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                String str2 = (String) obj;
                g6.f fVar = (g6.f) obj2;
                q6.i.e(str2, "acc");
                q6.i.e(fVar, "element");
                if (str2.length() == 0) {
                    return fVar.toString();
                }
                return str2 + ", " + fVar;
            case v0.f8304b /* 9 */:
                g6.h hVar = (g6.h) obj;
                g6.f fVar2 = (g6.f) obj2;
                q6.i.e(hVar, "acc");
                q6.i.e(fVar2, "element");
                g6.h v7 = hVar.v(fVar2.getKey());
                g6.i iVar4 = g6.i.f3046d;
                if (v7 == iVar4) {
                    return fVar2;
                }
                g6.d dVar = g6.d.f3045d;
                g6.e eVar = (g6.e) v7.l(dVar);
                if (eVar == null) {
                    bVar = new g6.b(fVar2, v7);
                } else {
                    g6.h v8 = v7.v(dVar);
                    if (v8 == iVar4) {
                        return new g6.b(eVar, fVar2);
                    }
                    bVar = new g6.b(eVar, new g6.b(fVar2, v8));
                }
                return bVar;
            case v0.f8306d /* 10 */:
                o4.t tVar = (o4.t) obj2;
                r4.g gVar = tVar.f5685b;
                LinkedHashMap linkedHashMap = gVar.f6595m;
                d6.k kVar4 = gVar.f6589f;
                LinkedHashMap linkedHashMap2 = gVar.f6594l;
                ArrayList arrayList = new ArrayList();
                Bundle j7 = h0.a.j((c6.f[]) Arrays.copyOf(new c6.f[0], 0));
                for (Map.Entry entry : d6.y.G(gVar.f6601s.f5706a).entrySet()) {
                    ((o4.y) entry.getValue()).getClass();
                }
                if (!arrayList.isEmpty()) {
                    bundle = h0.a.j((c6.f[]) Arrays.copyOf(new c6.f[0], 0));
                    r2.o.h0(j7, "android-support-nav:controller:navigatorState:names", arrayList);
                    r2.o.f0(bundle, "android-support-nav:controller:navigatorState", j7);
                }
                if (!kVar4.isEmpty()) {
                    if (bundle == null) {
                        bundle = h0.a.j((c6.f[]) Arrays.copyOf(new c6.f[0], 0));
                    }
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    Iterator<E> it = kVar4.iterator();
                    while (it.hasNext()) {
                        o4.d dVar2 = (o4.d) it.next();
                        q6.i.e(dVar2, "entry");
                        int i = dVar2.f5621e.f5671e.f4348a;
                        String str3 = dVar2.i;
                        r4.c cVar = dVar2.f5626k;
                        Bundle a20 = cVar.a();
                        Bundle j8 = h0.a.j((c6.f[]) Arrays.copyOf(new c6.f[0], 0));
                        cVar.f6570h.e(j8);
                        Bundle j9 = h0.a.j((c6.f[]) Arrays.copyOf(new c6.f[0], 0));
                        r2.o.g0(j9, "nav-entry-state:id", str3);
                        j9.putInt("nav-entry-state:destination-id", i);
                        if (a20 == null) {
                            a20 = h0.a.j((c6.f[]) Arrays.copyOf(new c6.f[0], 0));
                        }
                        r2.o.f0(j9, "nav-entry-state:args", a20);
                        r2.o.f0(j9, "nav-entry-state:saved-state", j8);
                        arrayList2.add(j9);
                    }
                    bundle.putParcelableArrayList("android-support-nav:controller:backStack", arrayList2);
                }
                if (!linkedHashMap2.isEmpty()) {
                    if (bundle == null) {
                        bundle = h0.a.j((c6.f[]) Arrays.copyOf(new c6.f[0], 0));
                    }
                    int[] iArr = new int[linkedHashMap2.size()];
                    ArrayList arrayList3 = new ArrayList();
                    int i8 = 0;
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        int intValue = ((Number) entry2.getKey()).intValue();
                        String str4 = (String) entry2.getValue();
                        int i9 = i8 + 1;
                        iArr[i8] = intValue;
                        if (str4 == null) {
                            str4 = "";
                        }
                        arrayList3.add(str4);
                        i8 = i9;
                    }
                    bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    r2.o.h0(bundle, "android-support-nav:controller:backStackIds", arrayList3);
                }
                if (!linkedHashMap.isEmpty()) {
                    if (bundle == null) {
                        bundle = h0.a.j((c6.f[]) Arrays.copyOf(new c6.f[0], 0));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        String str5 = (String) entry3.getKey();
                        d6.k kVar5 = (d6.k) entry3.getValue();
                        arrayList4.add(str5);
                        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
                        Iterator it2 = kVar5.iterator();
                        while (it2.hasNext()) {
                            f1.h hVar2 = ((o4.e) it2.next()).f5627a;
                            hVar2.getClass();
                            Bundle j10 = h0.a.j((c6.f[]) Arrays.copyOf(new c6.f[0], 0));
                            r2.o.g0(j10, "nav-entry-state:id", (String) hVar2.f2660b);
                            j10.putInt("nav-entry-state:destination-id", hVar2.f2659a);
                            Bundle bundle2 = (Bundle) hVar2.f2661c;
                            if (bundle2 == null) {
                                bundle2 = h0.a.j((c6.f[]) Arrays.copyOf(new c6.f[0], 0));
                            }
                            r2.o.f0(j10, "nav-entry-state:args", bundle2);
                            r2.o.f0(j10, "nav-entry-state:saved-state", (Bundle) hVar2.f2662d);
                            arrayList5.add(j10);
                        }
                        String str6 = "android-support-nav:controller:backStackStates:" + str5;
                        q6.i.e(str6, "key");
                        bundle.putParcelableArrayList(str6, arrayList5);
                    }
                    r2.o.h0(bundle, "android-support-nav:controller:backStackStates", arrayList4);
                }
                if (tVar.f5688e) {
                    if (bundle == null) {
                        bundle = h0.a.j((c6.f[]) Arrays.copyOf(new c6.f[0], 0));
                    }
                    bundle.putBoolean("android-support-nav:controller:deepLinkHandled", tVar.f5688e);
                }
                return bundle;
            case 11:
                return Integer.valueOf(((u0) obj2).f6867a.g());
            case 12:
                v0.d dVar3 = (v0.d) obj2;
                Map map = dVar3.f7435d;
                o.j0 j0Var = dVar3.f7436e;
                Object[] objArr = j0Var.f5483b;
                Object[] objArr2 = j0Var.f5484c;
                long[] jArr = j0Var.f5482a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j11 = jArr[i10];
                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j11) < 128) {
                                    int i13 = (i10 << 3) + i12;
                                    Object obj3 = objArr[i13];
                                    Map d8 = ((v0.e) objArr2[i13]).d();
                                    if (d8.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, d8);
                                    }
                                }
                                j11 >>= 8;
                            }
                            if (i11 != 8) {
                            }
                        }
                        if (i10 != length) {
                            i10++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 13:
                return obj2;
            case 14:
                return Integer.valueOf(Math.round((1 + (((r2.l) obj2) != r2.l.f6529d ? (-1.0f) * (-1) : -1.0f)) * (((Integer) obj).intValue() / 2.0f)));
            case v0.f8308f /* 15 */:
                l0 l0Var = (l0) obj;
                Throwable th = (Throwable) obj2;
                q6.i.e(l0Var, "msg");
                a7.m mVar2 = l0Var.f8906b;
                if (th == null) {
                    th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                mVar2.S(new a7.o(th, false));
                return c6.m.f1757a;
            default:
                z.p pVar = (z.p) obj2;
                return s6.a.y(Integer.valueOf(((e1) pVar.f9081e.f3283b).g()), Integer.valueOf(((e1) pVar.f9081e.f3284c).g()));
        }
    }
}
