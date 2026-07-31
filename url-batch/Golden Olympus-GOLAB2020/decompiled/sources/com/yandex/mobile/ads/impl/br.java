package com.yandex.mobile.ads.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class br {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final io0 f23892a;

    public br(@NotNull io0 integratedMediationNetworkProvider) {
        Intrinsics.checkNotNullParameter(integratedMediationNetworkProvider, "integratedMediationNetworkProvider");
        this.f23892a = integratedMediationNetworkProvider;
    }

    @NotNull
    public final ArrayList a() {
        ArrayList a4 = this.f23892a.a();
        ArrayList arrayList = new ArrayList();
        int size = a4.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = a4.get(i5);
            i5++;
            if (!Intrinsics.areEqual(((cz0) obj).c(), StringUtils.UNDEFINED)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        int size2 = arrayList.size();
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            arrayList2.add(((cz0) obj2).c());
        }
        return arrayList2;
    }
}
