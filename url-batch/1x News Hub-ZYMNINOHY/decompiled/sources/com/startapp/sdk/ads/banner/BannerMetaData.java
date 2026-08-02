package com.startapp.sdk.ads.banner;

import android.content.Context;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.e7;
import com.startapp.sdk.internal.e9;
import com.startapp.sdk.internal.si;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class BannerMetaData implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f2992a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile BannerMetaData f2993b = new BannerMetaData();
    private static final long serialVersionUID = -6987543640616659467L;

    @TypeInfo(complex = true)
    private BannerOptions BannerOptions = new BannerOptions();
    private String bannerMetadataUpdateVersion = "5.3.0";

    public static BannerMetaData c() {
        return f2993b;
    }

    public final BannerOptions a() {
        return this.BannerOptions;
    }

    public final BannerOptions b() {
        return new BannerOptions(this.BannerOptions);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BannerMetaData bannerMetaData = (BannerMetaData) obj;
            if (si.a((Object) this.BannerOptions, (Object) bannerMetaData.BannerOptions) && si.a((Object) this.bannerMetadataUpdateVersion, (Object) bannerMetaData.bannerMetadataUpdateVersion)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.BannerOptions, this.bannerMetadataUpdateVersion};
        WeakHashMap weakHashMap = si.f4438a;
        return Arrays.deepHashCode(objArr);
    }

    public static void a(Context context, BannerMetaData bannerMetaData) {
        synchronized (f2992a) {
            bannerMetaData.bannerMetadataUpdateVersion = "5.3.0";
            f2993b = bannerMetaData;
            e7.c(context, "StartappBannerMetadata", bannerMetaData);
        }
    }

    public static void a(Context context) {
        BannerMetaData bannerMetaData = (BannerMetaData) e7.b(context, "StartappBannerMetadata");
        BannerMetaData bannerMetaData2 = new BannerMetaData();
        if (bannerMetaData != null) {
            boolean a3 = si.a((Serializable) bannerMetaData, (Serializable) bannerMetaData2);
            if ("5.3.0".equals(bannerMetaData.bannerMetadataUpdateVersion) && a3) {
                d9 d9Var = new d9(e9.f3725e);
                d9Var.f3680d = "metadata_null";
                d9Var.a();
            }
            f2993b = bannerMetaData;
            return;
        }
        f2993b = bannerMetaData2;
    }
}
