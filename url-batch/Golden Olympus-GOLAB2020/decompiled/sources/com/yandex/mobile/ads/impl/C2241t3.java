package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.t3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2241t3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2218s3 f32141a;

    public C2241t3(@NotNull Context context, @NotNull ss adBreak, @NotNull rl0 adPlayerController, @NotNull zi0 imageProvider, @NotNull km0 adViewsHolderManager, @NotNull ec2<on0> playbackEventsListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        Intrinsics.checkNotNullParameter(adPlayerController, "adPlayerController");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(adViewsHolderManager, "adViewsHolderManager");
        Intrinsics.checkNotNullParameter(playbackEventsListener, "playbackEventsListener");
        this.f32141a = new C2218s3(context, adBreak, C2331x1.a(adBreak.a().c()), imageProvider, adPlayerController, adViewsHolderManager, playbackEventsListener);
    }

    @NotNull
    public final ArrayList a(@NotNull List videoAdInfoList) {
        Intrinsics.checkNotNullParameter(videoAdInfoList, "videoAdInfoList");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(videoAdInfoList, 10));
        Iterator it = videoAdInfoList.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f32141a.a((ob2) it.next()));
        }
        return arrayList;
    }
}
