package com.yandex.mobile.ads.nativeads;

import b2.AbstractC1372b;
import b2.InterfaceC1371a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.b9;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata
/* loaded from: classes3.dex */
public final class NativeAdType {
    public static final NativeAdType APP_INSTALL;
    public static final NativeAdType CONTENT;
    public static final NativeAdType MEDIA;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ NativeAdType[] f35887c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC1371a f35888d;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f35889b;

    static {
        NativeAdType nativeAdType = new NativeAdType(0, "CONTENT", FirebaseAnalytics.Param.CONTENT);
        CONTENT = nativeAdType;
        NativeAdType nativeAdType2 = new NativeAdType(1, "APP_INSTALL", "app");
        APP_INSTALL = nativeAdType2;
        NativeAdType nativeAdType3 = new NativeAdType(2, "MEDIA", b9.h.f15446I0);
        MEDIA = nativeAdType3;
        NativeAdType[] nativeAdTypeArr = {nativeAdType, nativeAdType2, nativeAdType3};
        f35887c = nativeAdTypeArr;
        f35888d = AbstractC1372b.a(nativeAdTypeArr);
    }

    private NativeAdType(int i4, String str, String str2) {
        this.f35889b = str2;
    }

    @NotNull
    public static InterfaceC1371a getEntries() {
        return f35888d;
    }

    public static NativeAdType valueOf(String str) {
        return (NativeAdType) Enum.valueOf(NativeAdType.class, str);
    }

    public static NativeAdType[] values() {
        return (NativeAdType[]) f35887c.clone();
    }

    @NotNull
    public final String getValue() {
        return this.f35889b;
    }
}
