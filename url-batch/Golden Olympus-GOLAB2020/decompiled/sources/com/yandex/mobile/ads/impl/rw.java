package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.cz0;
import com.yandex.mobile.ads.impl.gw;
import com.yandex.mobile.ads.impl.kw;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class rw {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final dz0 f31456a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final lz0 f31457b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final lw f31458c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final iz0 f31459d;

    public rw(@NotNull dz0 networksValidator, @NotNull lz0 networksMapper, @NotNull lw alertsMapper, @NotNull iz0 mediationNetworksStatusMapper) {
        Intrinsics.checkNotNullParameter(networksValidator, "networksValidator");
        Intrinsics.checkNotNullParameter(networksMapper, "networksMapper");
        Intrinsics.checkNotNullParameter(alertsMapper, "alertsMapper");
        Intrinsics.checkNotNullParameter(mediationNetworksStatusMapper, "mediationNetworksStatusMapper");
        this.f31456a = networksValidator;
        this.f31457b = networksMapper;
        this.f31458c = alertsMapper;
        this.f31459d = mediationNetworksStatusMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0145 A[LOOP:2: B:39:0x013f->B:41:0x0145, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0108  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qw a(@NotNull cx localData, @Nullable gx gxVar) {
        List<fx> emptyList;
        List<wv> emptyList2;
        iw iwVar;
        List list;
        kw.a aVar;
        Object obj;
        gw.a bVar;
        Iterator<T> it;
        int i4 = 1;
        Intrinsics.checkNotNullParameter(localData, "localData");
        if (gxVar == null || (emptyList = gxVar.f()) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        mw a4 = localData.a();
        nx f4 = localData.f();
        vv vvVar = new vv(gxVar != null ? gxVar.g() : null, gxVar != null ? gxVar.e() : null, gxVar != null ? gxVar.d() : null);
        List<cz0> e4 = localData.e();
        ArrayList a5 = this.f31457b.a(emptyList);
        if (!a5.isEmpty()) {
            e4 = a5;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(e4, 10));
        for (cz0 network : e4) {
            Iterator<T> it2 = emptyList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (Intrinsics.areEqual(((fx) obj).f(), network.d())) {
                    break;
                }
            }
            fx fxVar = (fx) obj;
            this.f31456a.getClass();
            boolean a6 = dz0.a(network);
            this.f31459d.getClass();
            Intrinsics.checkNotNullParameter(network, "network");
            List<cz0.c> b4 = network.b();
            if (!(b4 instanceof Collection) || !b4.isEmpty()) {
                Iterator<T> it3 = b4.iterator();
                while (it3.hasNext()) {
                    if (!((cz0.c) it3.next()).c()) {
                        List<cz0.c> b5 = network.b();
                        if (!(b5 instanceof Collection) || !b5.isEmpty()) {
                            Iterator<T> it4 = b5.iterator();
                            while (it4.hasNext()) {
                                if (((cz0.c) it4.next()).c()) {
                                    ez0 ez0Var = ez0.f25524b;
                                    bVar = new gw.a.b();
                                    break;
                                }
                            }
                        }
                        bVar = gw.a.c.f26315a;
                        gw.a aVar2 = bVar;
                        String d4 = network.d();
                        String e5 = fxVar == null ? fxVar.e() : null;
                        cz0.c cVar = (cz0.c) CollectionsKt.firstOrNull((List) network.b());
                        String b6 = cVar == null ? cVar.b() : null;
                        String d5 = fxVar == null ? fxVar.d() : null;
                        String e6 = network.e();
                        List<cz0.c> b7 = network.b();
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(b7, 10));
                        it = b7.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((cz0.c) it.next()).a());
                        }
                        arrayList.add(new gw(d4, e5, a6, b6, d5, e6, aVar2, arrayList2));
                    }
                }
            }
            bVar = gw.a.C0190a.f26313a;
            gw.a aVar22 = bVar;
            String d42 = network.d();
            if (fxVar == null) {
            }
            cz0.c cVar2 = (cz0.c) CollectionsKt.firstOrNull((List) network.b());
            if (cVar2 == null) {
            }
            if (fxVar == null) {
            }
            String e62 = network.e();
            List<cz0.c> b72 = network.b();
            ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(b72, 10));
            it = b72.iterator();
            while (it.hasNext()) {
            }
            arrayList.add(new gw(d42, e5, a6, b6, d5, e62, aVar22, arrayList22));
        }
        iw iwVar2 = new iw(arrayList);
        pw b8 = localData.b();
        ww c4 = localData.c();
        if (gxVar == null || (emptyList2 = gxVar.b()) == null) {
            emptyList2 = CollectionsKt.emptyList();
        }
        lw lwVar = this.f31458c;
        List<jw> c5 = gxVar != null ? gxVar.c() : null;
        lwVar.getClass();
        if (c5 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : c5) {
                jw jwVar = (jw) obj2;
                if (jwVar.b() != null || jwVar.a() != null) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            int size = arrayList3.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj3 = arrayList3.get(i5);
                i5 += i4;
                jw jwVar2 = (jw) obj3;
                int i6 = i4;
                String b9 = jwVar2.b();
                String a7 = jwVar2.a();
                kw.a[] values = kw.a.values();
                iw iwVar3 = iwVar2;
                int length = values.length;
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        aVar = null;
                        break;
                    }
                    aVar = values[i7];
                    int i8 = i7;
                    int i9 = length;
                    if (Intrinsics.areEqual(jwVar2.c(), aVar.a())) {
                        break;
                    }
                    i7 = i8 + 1;
                    length = i9;
                }
                if (aVar == null) {
                    aVar = kw.a.f28339c;
                }
                arrayList4.add(new kw(b9, a7, aVar));
                i4 = i6;
                iwVar2 = iwVar3;
            }
            iwVar = iwVar2;
            list = arrayList4;
        } else {
            iwVar = iwVar2;
            list = CollectionsKt.emptyList();
        }
        return new qw(a4, f4, vvVar, iwVar, b8, c4, emptyList2, list);
    }
}
