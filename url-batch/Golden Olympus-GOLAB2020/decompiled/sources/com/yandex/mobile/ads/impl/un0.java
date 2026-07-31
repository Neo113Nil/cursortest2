package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class un0 implements hc2<on0> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ts f33186a;

    /* renamed from: b, reason: collision with root package name */
    private final long f33187b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final gz1 f33188c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final e10 f33189d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final nb2 f33190e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ml0 f33191f;

    public un0(@NotNull C2308w1 adBreak, @NotNull ts adBreakPosition, long j4, @NotNull gz1 skipInfoParser, @NotNull e10 disableSkipChecker, @NotNull nb2 videoAdIdProvider, @NotNull ml0 instreamAdInfoProvider) {
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        Intrinsics.checkNotNullParameter(adBreakPosition, "adBreakPosition");
        Intrinsics.checkNotNullParameter(skipInfoParser, "skipInfoParser");
        Intrinsics.checkNotNullParameter(disableSkipChecker, "disableSkipChecker");
        Intrinsics.checkNotNullParameter(videoAdIdProvider, "videoAdIdProvider");
        Intrinsics.checkNotNullParameter(instreamAdInfoProvider, "instreamAdInfoProvider");
        this.f33186a = adBreakPosition;
        this.f33187b = j4;
        this.f33188c = skipInfoParser;
        this.f33189d = disableSkipChecker;
        this.f33190e = videoAdIdProvider;
        this.f33191f = instreamAdInfoProvider;
    }

    @Override // com.yandex.mobile.ads.impl.hc2
    public final on0 a(bb2 videoAd, hu creative, mv0 vastMediaFile, oc2 adPodInfo, String str, String str2, JSONObject jSONObject) {
        Object obj;
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(creative, "creative");
        Intrinsics.checkNotNullParameter(vastMediaFile, "vastMediaFile");
        Intrinsics.checkNotNullParameter(adPodInfo, "adPodInfo");
        gz1 gz1Var = this.f33188c;
        if (this.f33189d.a()) {
            gz1Var = null;
        }
        dd2 a4 = gz1Var != null ? gz1Var.a(creative) : null;
        fn0 fn0Var = new fn0(this.f33186a, vastMediaFile.f(), vastMediaFile.h(), vastMediaFile.d(), vastMediaFile.e(), Integer.valueOf(vastMediaFile.b()), vastMediaFile.a());
        List<mv0> h4 = creative.h();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(h4, 10));
        for (mv0 mv0Var : h4) {
            arrayList.add(new fn0(this.f33186a, mv0Var.f(), mv0Var.h(), mv0Var.d(), mv0Var.e(), Integer.valueOf(mv0Var.b()), mv0Var.a()));
        }
        long e4 = creative.e();
        nb2 nb2Var = this.f33190e;
        long j4 = this.f33187b;
        nb2Var.getClass();
        String a5 = nb2.a(j4, adPodInfo, videoAd);
        this.f33191f.getClass();
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(creative, "creative");
        Iterator<T> it = videoAd.l().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((k70) obj).a(), "bannerId")) {
                break;
            }
        }
        k70 k70Var = (k70) obj;
        return new on0(a5, fn0Var, arrayList, adPodInfo, a4, new kl0(videoAd.g(), creative.g(), k70Var != null ? k70Var.b() : null, str, str2, creative.b()), jSONObject, e4, videoAd.l().a());
    }
}
