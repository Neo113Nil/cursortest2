package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ae0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final kx f23246a;

    @kotlin.coroutines.jvm.internal.f(c = "com.yandex.mobile.ads.features.debugpanel.domain.GetAdUnitsDataUseCase", f = "GetAdUnitsDataUseCase.kt", l = {12}, m = "invoke")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f23247b;

        /* renamed from: d, reason: collision with root package name */
        int f23249d;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f23247b = obj;
            this.f23249d |= Integer.MIN_VALUE;
            return ae0.this.a(false, this);
        }
    }

    public ae0(@NotNull kx repo) {
        Intrinsics.checkNotNullParameter(repo, "repo");
        this.f23246a = repo;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a A[LOOP:0: B:11:0x0054->B:13:0x005a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z4, @NotNull kotlin.coroutines.d dVar) {
        a aVar;
        int i4;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i5 = aVar.f23249d;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aVar.f23249d = i5 - Integer.MIN_VALUE;
                Object obj = aVar.f23247b;
                Object f4 = AbstractC1241b.f();
                i4 = aVar.f23249d;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    kx kxVar = this.f23246a;
                    aVar.f23249d = 1;
                    obj = kxVar.a(z4, aVar);
                    if (obj == f4) {
                        return f4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.a(obj);
                }
                List<wv> a4 = ((qw) obj).a();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(a4, 10));
                for (wv wvVar : a4) {
                    arrayList.add(new yv(wvVar.d(), wvVar.b(), wvVar.a()));
                }
                return new ew(arrayList);
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f23247b;
        Object f42 = AbstractC1241b.f();
        i4 = aVar.f23249d;
        if (i4 != 0) {
        }
        List<wv> a42 = ((qw) obj2).a();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(a42, 10));
        while (r5.hasNext()) {
        }
        return new ew(arrayList2);
    }
}
