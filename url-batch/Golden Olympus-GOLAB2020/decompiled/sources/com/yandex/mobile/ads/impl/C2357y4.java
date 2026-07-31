package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.y4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2357y4 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2008j2 f34790a;

    public C2357y4(@NotNull ee2 videoDurationHolder, @NotNull C2008j2 adBreakTimingProvider) {
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        Intrinsics.checkNotNullParameter(adBreakTimingProvider, "adBreakTimingProvider");
        this.f34790a = adBreakTimingProvider;
    }

    @NotNull
    public final AdPlaybackState a(@NotNull qs instreamAd, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(instreamAd, "instreamAd");
        List<ss> a4 = instreamAd.a();
        if (a4.isEmpty() || obj == null) {
            AdPlaybackState adPlaybackState = AdPlaybackState.NONE;
            Intrinsics.checkNotNull(adPlaybackState);
            return adPlaybackState;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ss> it = a4.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            long a5 = this.f34790a.a(it.next().b());
            if (a5 == Long.MIN_VALUE) {
                z4 = true;
            } else if (a5 != -1) {
                arrayList.add(Long.valueOf(Util.msToUs(a5)));
            }
        }
        int size = z4 ? arrayList.size() + 1 : arrayList.size();
        long[] jArr = new long[size];
        if (z4) {
            jArr[size - 1] = Long.MIN_VALUE;
        }
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            jArr[i4] = ((Number) arrayList.get(i4)).longValue();
        }
        Arrays.sort(jArr, 0, arrayList.size());
        return new AdPlaybackState(obj, Arrays.copyOf(jArr, size));
    }
}
