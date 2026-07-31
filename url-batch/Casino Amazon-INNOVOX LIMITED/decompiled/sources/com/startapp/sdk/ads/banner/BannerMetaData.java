package com.startapp.sdk.ads.banner;

import android.content.Context;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.n8;
import com.startapp.sdk.internal.o8;
import com.startapp.sdk.internal.z6;
import com.startapp.sdk.internal.zh;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class BannerMetaData implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f70a = new Object();
    private static volatile BannerMetaData b = new BannerMetaData();
    private static final long serialVersionUID = -6987543640616659467L;

    @TypeInfo(complex = true)
    private BannerOptions BannerOptions = new BannerOptions();
    private String bannerMetadataUpdateVersion = "5.3.2";

    public static BannerMetaData c() {
        return b;
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
            if (zh.a((Object) this.BannerOptions, (Object) bannerMetaData.BannerOptions) && zh.a((Object) this.bannerMetadataUpdateVersion, (Object) bannerMetaData.bannerMetadataUpdateVersion)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.BannerOptions, this.bannerMetadataUpdateVersion};
        WeakHashMap weakHashMap = zh.f528a;
        return Arrays.deepHashCode(objArr);
    }

    public static void a(Context context, BannerMetaData bannerMetaData) {
        synchronized (f70a) {
            bannerMetaData.bannerMetadataUpdateVersion = "5.3.2";
            b = bannerMetaData;
            z6.b(context, "StartappBannerMetadata", bannerMetaData);
        }
    }

    public static void a(Context context) {
        BannerMetaData bannerMetaData = (BannerMetaData) z6.b(context, "StartappBannerMetadata");
        BannerMetaData bannerMetaData2 = new BannerMetaData();
        if (bannerMetaData != null) {
            boolean a2 = zh.a((Serializable) bannerMetaData, (Serializable) bannerMetaData2);
            if ("5.3.2".equals(bannerMetaData.bannerMetadataUpdateVersion) && a2) {
                n8 n8Var = new n8(o8.e);
                n8Var.d = "metadata_null";
                n8Var.a();
            }
            b = bannerMetaData;
            return;
        }
        b = bannerMetaData2;
    }
}
