package com.yandex.mobile.ads.video.playback.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class VideoAdInfo {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f36128a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f36129b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f36130c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f36131d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f36132e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final String f36133f;

    public VideoAdInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.f36128a = str;
        this.f36129b = str2;
        this.f36130c = str3;
        this.f36131d = str4;
        this.f36132e = str5;
        this.f36133f = str6;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(VideoAdInfo.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.video.playback.model.VideoAdInfo");
        VideoAdInfo videoAdInfo = (VideoAdInfo) obj;
        return Intrinsics.areEqual(this.f36128a, videoAdInfo.f36128a) && Intrinsics.areEqual(this.f36129b, videoAdInfo.f36129b) && Intrinsics.areEqual(this.f36130c, videoAdInfo.f36130c) && Intrinsics.areEqual(this.f36131d, videoAdInfo.f36131d) && Intrinsics.areEqual(this.f36132e, videoAdInfo.f36132e) && Intrinsics.areEqual(this.f36133f, videoAdInfo.f36133f);
    }

    @Nullable
    public final String getAdId() {
        return this.f36128a;
    }

    @Nullable
    public final String getAdParameters() {
        return this.f36133f;
    }

    @Nullable
    public final String getAdvertiserInfo() {
        return this.f36132e;
    }

    @Nullable
    public final String getBannerId() {
        return this.f36130c;
    }

    @Nullable
    public final String getCreativeId() {
        return this.f36129b;
    }

    @Nullable
    public final String getData() {
        return this.f36131d;
    }

    public int hashCode() {
        String str = this.f36128a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f36129b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f36130c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f36131d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f36132e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f36133f;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f36128a;
        if (str == null) {
            str = "";
        }
        String str2 = this.f36129b;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.f36130c;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = this.f36131d;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = this.f36132e;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = this.f36133f;
        return "VideoAdInfo (adId: " + str + ", creativeId: " + str2 + ", bannerId: " + str3 + ", data: " + str4 + ", advertiserInfo: " + str5 + ", adParameters: " + (str6 != null ? str6 : "") + ")";
    }
}
