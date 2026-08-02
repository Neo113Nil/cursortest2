package com.startapp.sdk.adsbase.cache;

import android.content.Context;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.e7;
import com.startapp.sdk.internal.e9;
import com.startapp.sdk.internal.fh;
import com.startapp.sdk.internal.si;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class CacheMetaData implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static volatile CacheMetaData f3302a = new CacheMetaData();
    private static final long serialVersionUID = -5733696220222242321L;

    @TypeInfo(complex = true)
    private ACMConfig ACM = new ACMConfig();
    private float sendCacheSizeProb = 20.0f;
    private String cacheMetaDataUpdateVersion = "5.3.0";

    public static CacheMetaData b() {
        return f3302a;
    }

    public static boolean d() {
        ACMConfig aCMConfig = f3302a.ACM;
        return aCMConfig != null && aCMConfig.a(fh.f3800a.f3892q);
    }

    public final ACMConfig a() {
        return this.ACM;
    }

    public final float c() {
        return this.sendCacheSizeProb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            CacheMetaData cacheMetaData = (CacheMetaData) obj;
            if (Float.compare(cacheMetaData.sendCacheSizeProb, this.sendCacheSizeProb) == 0 && si.a((Object) this.ACM, (Object) cacheMetaData.ACM) && si.a((Object) this.cacheMetaDataUpdateVersion, (Object) cacheMetaData.cacheMetaDataUpdateVersion)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.ACM, Float.valueOf(this.sendCacheSizeProb), this.cacheMetaDataUpdateVersion};
        WeakHashMap weakHashMap = si.f4438a;
        return Arrays.deepHashCode(objArr);
    }

    public static void a(Context context, CacheMetaData cacheMetaData) {
        cacheMetaData.cacheMetaDataUpdateVersion = "5.3.0";
        f3302a = cacheMetaData;
        e7.c(context, "StartappCacheMetadata", cacheMetaData);
    }

    public static void a(Context context) {
        CacheMetaData cacheMetaData = (CacheMetaData) e7.b(context, "StartappCacheMetadata");
        CacheMetaData cacheMetaData2 = new CacheMetaData();
        if (cacheMetaData != null) {
            boolean a3 = si.a((Serializable) cacheMetaData, (Serializable) cacheMetaData2);
            if ("5.3.0".equals(cacheMetaData.cacheMetaDataUpdateVersion) && a3) {
                d9 d9Var = new d9(e9.f3725e);
                d9Var.f3680d = "metadata_null";
                d9Var.a();
            }
            f3302a = cacheMetaData;
            return;
        }
        f3302a = cacheMetaData2;
    }
}
