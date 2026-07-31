package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import com.yandex.mobile.ads.impl.bw;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class zd0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final kx f35560a;

    @kotlin.coroutines.jvm.internal.f(c = "com.yandex.mobile.ads.features.debugpanel.domain.GetAdUnitDataUseCase", f = "GetAdUnitDataUseCase.kt", l = {17}, m = "invoke")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        zd0 f35561b;

        /* renamed from: c, reason: collision with root package name */
        String f35562c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f35563d;

        /* renamed from: f, reason: collision with root package name */
        int f35565f;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35563d = obj;
            this.f35565f |= Integer.MIN_VALUE;
            return zd0.this.a(null, false, this);
        }
    }

    public zd0(@NotNull kx repo) {
        Intrinsics.checkNotNullParameter(repo, "repo");
        this.f35560a = repo;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull String str, boolean z4, @NotNull kotlin.coroutines.d dVar) {
        a aVar;
        int i4;
        zd0 zd0Var;
        String str2;
        Iterator<T> it;
        Object obj;
        wv wvVar;
        cw cwVar;
        Object obj2;
        Object obj3;
        String d4;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i5 = aVar.f35565f;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aVar.f35565f = i5 - Integer.MIN_VALUE;
                Object obj4 = aVar.f35563d;
                Object f4 = AbstractC1241b.f();
                i4 = aVar.f35565f;
                if (i4 != 0) {
                    ResultKt.a(obj4);
                    kx kxVar = this.f35560a;
                    aVar.f35561b = this;
                    aVar.f35562c = str;
                    aVar.f35565f = 1;
                    obj4 = kxVar.a(z4, aVar);
                    if (obj4 == f4) {
                        return f4;
                    }
                    zd0Var = this;
                    str2 = str;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = aVar.f35562c;
                    zd0Var = aVar.f35561b;
                    ResultKt.a(obj4);
                }
                qw qwVar = (qw) obj4;
                it = qwVar.a().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.areEqual(((wv) obj).a(), str2)) {
                        break;
                    }
                }
                wvVar = (wv) obj;
                if (wvVar != null) {
                    return null;
                }
                List<gw> a4 = qwVar.b().a();
                aw c4 = wvVar.c();
                zd0Var.getClass();
                if (c4 == null) {
                    cwVar = new cw(CollectionsKt.emptyList());
                } else {
                    List<xv> b4 = c4.b();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(b4, 10));
                    for (xv xvVar : b4) {
                        Iterator<T> it2 = a4.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it2.next();
                            if (Intrinsics.areEqual(((gw) obj3).e(), xvVar.e())) {
                                break;
                            }
                        }
                        gw gwVar = (gw) obj3;
                        String str3 = (gwVar == null || (d4 = gwVar.d()) == null) ? "" : d4;
                        List<nw> c5 = xvVar.c();
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(c5, 10));
                        for (nw nwVar : c5) {
                            arrayList2.add(new ex(nwVar.a(), nwVar.b()));
                        }
                        arrayList.add(new bw(str3, xvVar.e(), arrayList2, xvVar.b(), xvVar.d(), bw.a.C0182a.f23935a));
                    }
                    List<dw> c6 = c4.c();
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(c6, 10));
                    for (dw dwVar : c6) {
                        Iterator<T> it3 = a4.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it3.next();
                            if (Intrinsics.areEqual(((gw) obj2).e(), dwVar.e())) {
                                break;
                            }
                        }
                        gw gwVar2 = (gw) obj2;
                        String d5 = gwVar2 != null ? gwVar2.d() : null;
                        String str4 = d5 == null ? "" : d5;
                        List<cy> f5 = dwVar.f();
                        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(f5, 10));
                        for (cy cyVar : f5) {
                            arrayList4.add(new ex(cyVar.a(), cyVar.b()));
                        }
                        arrayList3.add(new bw(str4, dwVar.e(), arrayList4, null, dwVar.d(), new bw.a.b(dwVar.c(), dwVar.b())));
                    }
                    cwVar = new cw(CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList3));
                }
                return new zv(wvVar.d(), wvVar.b(), str2, cwVar);
            }
        }
        aVar = new a(dVar);
        Object obj42 = aVar.f35563d;
        Object f42 = AbstractC1241b.f();
        i4 = aVar.f35565f;
        if (i4 != 0) {
        }
        qw qwVar2 = (qw) obj42;
        it = qwVar2.a().iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        wvVar = (wv) obj;
        if (wvVar != null) {
        }
    }
}
