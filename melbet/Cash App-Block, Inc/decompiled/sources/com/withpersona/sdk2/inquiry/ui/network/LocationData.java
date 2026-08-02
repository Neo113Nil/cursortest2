package com.withpersona.sdk2.inquiry.ui.network;

import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LocationData {
    public final String addressBusinessName;
    public final String addressCity;
    public final String addressCountryCode;
    public final String addressPostalCode;
    public final String addressStreet1;
    public final String addressStreet2;
    public final String addressSubdivision;
    public final String id;

    public /* synthetic */ LocationData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8);
    }

    public LocationData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        str.getClass();
        this.id = str;
        this.addressStreet1 = str2;
        this.addressStreet2 = str3;
        this.addressCity = str4;
        this.addressSubdivision = str5;
        this.addressPostalCode = str6;
        this.addressCountryCode = str7;
        this.addressBusinessName = str8;
    }
}
