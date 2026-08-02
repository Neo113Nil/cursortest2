package com.startapp.sdk.internal;

import E.AbstractC0005f;
import com.startapp.sdk.adsbase.AdsConstants$AdApiType;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.startappsdk.R;

/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7035a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f7036b;

    /* renamed from: d, reason: collision with root package name */
    public static final String f7038d;

    /* renamed from: f, reason: collision with root package name */
    public static final Boolean f7040f;

    /* renamed from: g, reason: collision with root package name */
    public static final Boolean f7041g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f7042h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f7043i;

    /* renamed from: j, reason: collision with root package name */
    public static final int f7044j;

    /* renamed from: k, reason: collision with root package name */
    public static final int f7045k;

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f7046l;

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f7047m;

    /* renamed from: c, reason: collision with root package name */
    public static final String f7037c = "trackdownload";

    /* renamed from: e, reason: collision with root package name */
    public static final String f7039e = "https://imp.startappservice.com/tracking/adImpression";

    static {
        String str = "get";
        f7035a = str.concat("ads");
        f7036b = str.concat("htmlad");
        f7038d = str.concat("adsmetadata");
        Boolean bool = Boolean.FALSE;
        f7040f = bool;
        f7041g = bool;
        f7042h = R.id.io_start_fullscreen_main;
        f7043i = R.id.io_start_fullscreen_info;
        f7044j = R.id.io_start_list3d_close;
        f7045k = R.id.io_start_video_main;
        f7046l = new String[]{"back_", "back_dark", "browser_icon_dark", "forward_", "forward_dark", "x_dark"};
        f7047m = new String[]{"empty_star", "filled_star", "half_star"};
    }

    public static String a(AdsConstants$AdApiType adsConstants$AdApiType, AdPreferences.Placement placement) {
        String str;
        String a3;
        String str2;
        String str3;
        int ordinal = adsConstants$AdApiType.ordinal();
        if (ordinal == 0) {
            str = f7036b;
            a3 = MetaData.E().a(placement);
        } else {
            if (ordinal != 1) {
                str3 = null;
                str2 = null;
                return AbstractC0005f.z(str3, str2);
            }
            str = f7035a;
            a3 = MetaData.E().a(placement);
        }
        String str4 = a3;
        str2 = str;
        str3 = str4;
        return AbstractC0005f.z(str3, str2);
    }
}
