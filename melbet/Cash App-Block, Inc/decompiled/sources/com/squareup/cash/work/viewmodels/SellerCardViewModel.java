package com.squareup.cash.work.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SellerCardViewModel {
    public static final SellerCardViewModel FALLBACK;
    public final String artworkDarkUrl;
    public final String artworkLightUrl;
    public final String backgroundDarkHex;
    public final String backgroundLightHex;
    public final String foregroundDarkHex;
    public final String foregroundLightHex;
    public final String initials;
    public final String outlineDarkHex;
    public final String outlineLightHex;

    static {
        String str = null;
        FALLBACK = new SellerCardViewModel("?", str, str, 510);
    }

    public /* synthetic */ SellerCardViewModel(String str, String str2, String str3, int i) {
        this(str, (i & 2) != 0 ? null : "#FFFFFF", (i & 4) != 0 ? null : "#FFFFFF", (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellerCardViewModel)) {
            return false;
        }
        SellerCardViewModel sellerCardViewModel = (SellerCardViewModel) obj;
        return Intrinsics.areEqual(this.initials, sellerCardViewModel.initials) && Intrinsics.areEqual(this.foregroundLightHex, sellerCardViewModel.foregroundLightHex) && Intrinsics.areEqual(this.foregroundDarkHex, sellerCardViewModel.foregroundDarkHex) && Intrinsics.areEqual(this.backgroundLightHex, sellerCardViewModel.backgroundLightHex) && Intrinsics.areEqual(this.backgroundDarkHex, sellerCardViewModel.backgroundDarkHex) && Intrinsics.areEqual(this.outlineLightHex, sellerCardViewModel.outlineLightHex) && Intrinsics.areEqual(this.outlineDarkHex, sellerCardViewModel.outlineDarkHex) && Intrinsics.areEqual(this.artworkLightUrl, sellerCardViewModel.artworkLightUrl) && Intrinsics.areEqual(this.artworkDarkUrl, sellerCardViewModel.artworkDarkUrl);
    }

    public final int hashCode() {
        int hashCode = this.initials.hashCode() * 31;
        String str = this.foregroundLightHex;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.foregroundDarkHex;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.backgroundLightHex;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.backgroundDarkHex;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.outlineLightHex;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.outlineDarkHex;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.artworkLightUrl;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.artworkDarkUrl;
        return hashCode8 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SellerCardViewModel(initials=", this.initials, ", foregroundLightHex=", this.foregroundLightHex, ", foregroundDarkHex=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.foregroundDarkHex, ", backgroundLightHex=", this.backgroundLightHex, ", backgroundDarkHex=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.backgroundDarkHex, ", outlineLightHex=", this.outlineLightHex, ", outlineDarkHex=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.outlineDarkHex, ", artworkLightUrl=", this.artworkLightUrl, ", artworkDarkUrl=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.artworkDarkUrl, ")");
    }

    public SellerCardViewModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        str.getClass();
        this.initials = str;
        this.foregroundLightHex = str2;
        this.foregroundDarkHex = str3;
        this.backgroundLightHex = str4;
        this.backgroundDarkHex = str5;
        this.outlineLightHex = str6;
        this.outlineDarkHex = str7;
        this.artworkLightUrl = str8;
        this.artworkDarkUrl = str9;
    }
}
