package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ue2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ob2<?> f33073a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final hg2 f33074b;

    public ue2(@NotNull ob2<?> videoAdInfo, @NotNull hg2 videoViewProvider) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(videoViewProvider, "videoViewProvider");
        this.f33073a = videoAdInfo;
        this.f33074b = videoViewProvider;
    }

    @NotNull
    public final Map<String, Object> a() {
        jp1 jp1Var = new jp1(new LinkedHashMap(), 2);
        View view = this.f33074b.getView();
        Integer valueOf = view != null ? Integer.valueOf(view.getHeight()) : null;
        Integer valueOf2 = view != null ? Integer.valueOf(view.getWidth()) : null;
        mv0 c4 = this.f33073a.c();
        if (valueOf == null || valueOf.intValue() <= 0) {
            valueOf = null;
        }
        jp1Var.b(valueOf, "view_container_height");
        if (valueOf2 == null || valueOf2.intValue() <= 0) {
            valueOf2 = null;
        }
        jp1Var.b(valueOf2, "view_container_width");
        jp1Var.b(c4.d() > 0 ? Integer.valueOf(c4.d()) : null, "video_height");
        jp1Var.b(c4.h() > 0 ? Integer.valueOf(c4.h()) : null, "video_width");
        jp1Var.b(c4.c(), "video_codec");
        jp1Var.b(c4.e(), "video_mime_type");
        jp1Var.b(c4.g(), "video_vmaf");
        return MapsKt.mapOf(TuplesKt.to("video_playback_info", jp1Var.b()));
    }
}
