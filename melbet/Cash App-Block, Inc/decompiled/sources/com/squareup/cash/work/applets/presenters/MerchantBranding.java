package com.squareup.cash.work.applets.presenters;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class MerchantBranding {
    public final String artworkDarkUrl;
    public final String artworkLightUrl;
    public final String backgroundDarkHex;
    public final String backgroundLightHex;
    public final String foregroundDarkHex;
    public final String foregroundLightHex;
    public final String outlineDarkHex;
    public final String outlineLightHex;

    public MerchantBranding(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.foregroundLightHex = str;
        this.foregroundDarkHex = str2;
        this.backgroundLightHex = str3;
        this.backgroundDarkHex = str4;
        this.outlineLightHex = str5;
        this.outlineDarkHex = str6;
        this.artworkLightUrl = str7;
        this.artworkDarkUrl = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MerchantBranding)) {
            return false;
        }
        MerchantBranding merchantBranding = (MerchantBranding) obj;
        return Intrinsics.areEqual(this.foregroundLightHex, merchantBranding.foregroundLightHex) && Intrinsics.areEqual(this.foregroundDarkHex, merchantBranding.foregroundDarkHex) && Intrinsics.areEqual(this.backgroundLightHex, merchantBranding.backgroundLightHex) && Intrinsics.areEqual(this.backgroundDarkHex, merchantBranding.backgroundDarkHex) && Intrinsics.areEqual(this.outlineLightHex, merchantBranding.outlineLightHex) && Intrinsics.areEqual(this.outlineDarkHex, merchantBranding.outlineDarkHex) && Intrinsics.areEqual(this.artworkLightUrl, merchantBranding.artworkLightUrl) && Intrinsics.areEqual(this.artworkDarkUrl, merchantBranding.artworkDarkUrl);
    }

    public final int hashCode() {
        String str = this.foregroundLightHex;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.foregroundDarkHex;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.backgroundLightHex;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.backgroundDarkHex;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.outlineLightHex;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.outlineDarkHex;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.artworkLightUrl;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.artworkDarkUrl;
        return hashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MerchantBranding(foregroundLightHex=", this.foregroundLightHex, ", foregroundDarkHex=", this.foregroundDarkHex, ", backgroundLightHex=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.backgroundLightHex, ", backgroundDarkHex=", this.backgroundDarkHex, ", outlineLightHex=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.outlineLightHex, ", outlineDarkHex=", this.outlineDarkHex, ", artworkLightUrl=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.artworkLightUrl, ", artworkDarkUrl=", this.artworkDarkUrl, ")");
    }
}
