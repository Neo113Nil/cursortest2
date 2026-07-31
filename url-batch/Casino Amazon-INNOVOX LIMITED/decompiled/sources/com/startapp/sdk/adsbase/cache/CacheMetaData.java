package com.startapp.sdk.adsbase.cache;

import android.content.Context;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.n8;
import com.startapp.sdk.internal.o8;
import com.startapp.sdk.internal.pg;
import com.startapp.sdk.internal.z6;
import com.startapp.sdk.internal.zh;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class CacheMetaData implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static volatile CacheMetaData f133a = new CacheMetaData();
    private static final long serialVersionUID = -5733696220222242321L;

    @TypeInfo(complex = true)
    private ACMConfig ACM = new ACMConfig();
    private float sendCacheSizeProb = 20.0f;
    private String cacheMetaDataUpdateVersion = "5.3.2";

    public static CacheMetaData b() {
        return f133a;
    }

    public static boolean d() {
        ACMConfig aCMConfig = f133a.ACM;
        return aCMConfig != null && aCMConfig.a(pg.f382a.q);
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
            if (Float.compare(cacheMetaData.sendCacheSizeProb, this.sendCacheSizeProb) == 0 && zh.a((Object) this.ACM, (Object) cacheMetaData.ACM) && zh.a((Object) this.cacheMetaDataUpdateVersion, (Object) cacheMetaData.cacheMetaDataUpdateVersion)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.ACM, Float.valueOf(this.sendCacheSizeProb), this.cacheMetaDataUpdateVersion};
        WeakHashMap weakHashMap = zh.f528a;
        return Arrays.deepHashCode(objArr);
    }

    public static void a(Context context, CacheMetaData cacheMetaData) {
        cacheMetaData.cacheMetaDataUpdateVersion = "5.3.2";
        f133a = cacheMetaData;
        z6.b(context, "StartappCacheMetadata", cacheMetaData);
    }

    public static void a(Context context) {
        CacheMetaData cacheMetaData = (CacheMetaData) z6.b(context, "StartappCacheMetadata");
        CacheMetaData cacheMetaData2 = new CacheMetaData();
        if (cacheMetaData != null) {
            boolean a2 = zh.a((Serializable) cacheMetaData, (Serializable) cacheMetaData2);
            if ("5.3.2".equals(cacheMetaData.cacheMetaDataUpdateVersion) && a2) {
                n8 n8Var = new n8(o8.e);
                n8Var.d = "metadata_null";
                n8Var.a();
            }
            f133a = cacheMetaData;
            return;
        }
        f133a = cacheMetaData2;
    }
}
