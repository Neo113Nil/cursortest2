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
    private static volatile CacheMetaData f6392a = new CacheMetaData();
    private static final long serialVersionUID = -5733696220222242321L;

    @TypeInfo(complex = true)
    private ACMConfig ACM = new ACMConfig();
    private float sendCacheSizeProb = 20.0f;
    private String cacheMetaDataUpdateVersion = "5.3.0";

    public static CacheMetaData b() {
        return f6392a;
    }

    public static boolean d() {
        ACMConfig aCMConfig = f6392a.ACM;
        return aCMConfig != null && aCMConfig.a(fh.f6918a.f7014q);
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
        WeakHashMap weakHashMap = si.f7575a;
        return Arrays.deepHashCode(objArr);
    }

    public static void a(Context context, CacheMetaData cacheMetaData) {
        cacheMetaData.cacheMetaDataUpdateVersion = "5.3.0";
        f6392a = cacheMetaData;
        e7.c(context, "StartappCacheMetadata", cacheMetaData);
    }

    public static void a(Context context) {
        CacheMetaData cacheMetaData = (CacheMetaData) e7.b(context, "StartappCacheMetadata");
        CacheMetaData cacheMetaData2 = new CacheMetaData();
        if (cacheMetaData != null) {
            boolean a3 = si.a((Serializable) cacheMetaData, (Serializable) cacheMetaData2);
            if ("5.3.0".equals(cacheMetaData.cacheMetaDataUpdateVersion) && a3) {
                d9 d9Var = new d9(e9.f6839e);
                d9Var.f6792d = "metadata_null";
                d9Var.a();
            }
            f6392a = cacheMetaData;
            return;
        }
        f6392a = cacheMetaData2;
    }
}
