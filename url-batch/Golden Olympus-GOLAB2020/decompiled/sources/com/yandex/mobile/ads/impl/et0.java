package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.C2103n2;
import com.yandex.mobile.ads.impl.ts;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class et0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final qs f25424a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2080m2 f25425b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2103n2 f25426c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final zs0 f25427d;

    public et0(@NotNull Context context, @NotNull um2 sdkEnvironmentModule, @NotNull qs instreamAd) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(instreamAd, "instreamAd");
        this.f25424a = instreamAd;
        this.f25425b = new C2080m2();
        this.f25426c = new C2103n2();
        this.f25427d = new zs0(context, sdkEnvironmentModule, instreamAd);
    }

    @NotNull
    public final ArrayList a(@Nullable String breakType) {
        C2103n2 c2103n2 = this.f25426c;
        List<ss> adBreaks = this.f25424a.a();
        c2103n2.getClass();
        Intrinsics.checkNotNullParameter(adBreaks, "adBreaks");
        ArrayList arrayList = new ArrayList(adBreaks);
        Collections.sort(arrayList, new C2103n2.a());
        ArrayList adBreaks2 = new ArrayList(arrayList);
        this.f25425b.getClass();
        Intrinsics.checkNotNullParameter(breakType, "breakType");
        Intrinsics.checkNotNullParameter(adBreaks2, "adBreaks");
        ArrayList arrayList2 = new ArrayList();
        int size = adBreaks2.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = adBreaks2.get(i5);
            i5++;
            ss ssVar = (ss) obj;
            if (Intrinsics.areEqual(ssVar.e(), breakType)) {
                if (ts.a.f32568d == ssVar.b().a()) {
                    arrayList2.add(ssVar);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        int size2 = arrayList2.size();
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            arrayList3.add(this.f25427d.a((ss) obj2));
        }
        return arrayList3;
    }
}
