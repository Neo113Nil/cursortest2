package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class m80 {

    /* renamed from: c, reason: collision with root package name */
    public static final m80 f28940c;

    /* renamed from: d, reason: collision with root package name */
    public static final m80 f28941d;

    /* renamed from: e, reason: collision with root package name */
    public static final m80 f28942e;

    /* renamed from: f, reason: collision with root package name */
    public static final m80 f28943f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ m80[] f28944g;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f28945b;

    static {
        m80 m80Var = new m80(0, "AD_POD_SKIP", "AdPodSkipFeatureToggle");
        m80 m80Var2 = new m80(1, "INTERSTITIAL_PRELOADING", "InterstitialPreloading");
        m80 m80Var3 = new m80(2, "REWARDED_PRELOADING", "RewardedPreloading");
        m80 m80Var4 = new m80(3, "FIRST_VIDEO_PRELOADING_STRATEGY", "FirstVideoPreloadingStrategyFeatureToggle");
        f28940c = m80Var4;
        m80 m80Var5 = new m80(4, "TESTING_NEW_ADAPTER", "TestingNewAdapterFeatureToggle");
        f28941d = m80Var5;
        m80 m80Var6 = new m80(5, "FALLBACK_FOR_VIDEO", "FallbackForVideoFeatureToggle");
        f28942e = m80Var6;
        m80 m80Var7 = new m80(6, "DONT_WAIT_FOR_WEB_VIEW_LOAD_FINISH_ON_PRELOADING", "DontWaitForWebViewLoadFinishOnPreloading");
        f28943f = m80Var7;
        m80[] m80VarArr = {m80Var, m80Var2, m80Var3, m80Var4, m80Var5, m80Var6, m80Var7};
        f28944g = m80VarArr;
        AbstractC1372b.a(m80VarArr);
    }

    private m80(int i4, String str, String str2) {
        this.f28945b = str2;
    }

    public static m80 valueOf(String str) {
        return (m80) Enum.valueOf(m80.class, str);
    }

    public static m80[] values() {
        return (m80[]) f28944g.clone();
    }

    @NotNull
    public final String a() {
        return this.f28945b;
    }
}
