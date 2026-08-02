package com.startapp.sdk.internal;

import E1.AbstractC0033i;
import com.startapp.sdk.adsbase.AdsConstants$AdApiType;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.startappsdk.R;

/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3911a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f3912b;

    /* renamed from: d, reason: collision with root package name */
    public static final String f3914d;
    public static final Boolean f;

    /* renamed from: g, reason: collision with root package name */
    public static final Boolean f3916g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f3917h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f3918i;

    /* renamed from: j, reason: collision with root package name */
    public static final int f3919j;

    /* renamed from: k, reason: collision with root package name */
    public static final int f3920k;

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f3921l;

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f3922m;

    /* renamed from: c, reason: collision with root package name */
    public static final String f3913c = "trackdownload";

    /* renamed from: e, reason: collision with root package name */
    public static final String f3915e = "https://imp.startappservice.com/tracking/adImpression";

    static {
        String str = "get";
        f3911a = str.concat("ads");
        f3912b = str.concat("htmlad");
        f3914d = str.concat("adsmetadata");
        Boolean bool = Boolean.FALSE;
        f = bool;
        f3916g = bool;
        f3917h = R.id.io_start_fullscreen_main;
        f3918i = R.id.io_start_fullscreen_info;
        f3919j = R.id.io_start_list3d_close;
        f3920k = R.id.io_start_video_main;
        f3921l = new String[]{"back_", "back_dark", "browser_icon_dark", "forward_", "forward_dark", "x_dark"};
        f3922m = new String[]{"empty_star", "filled_star", "half_star"};
    }

    public static String a(AdsConstants$AdApiType adsConstants$AdApiType, AdPreferences.Placement placement) {
        String str;
        String a3;
        String str2;
        String str3;
        int ordinal = adsConstants$AdApiType.ordinal();
        if (ordinal == 0) {
            str = f3912b;
            a3 = MetaData.E().a(placement);
        } else {
            if (ordinal != 1) {
                str3 = null;
                str2 = null;
                return AbstractC0033i.s(str3, str2);
            }
            str = f3911a;
            a3 = MetaData.E().a(placement);
        }
        String str4 = a3;
        str2 = str;
        str3 = str4;
        return AbstractC0033i.s(str3, str2);
    }
}
