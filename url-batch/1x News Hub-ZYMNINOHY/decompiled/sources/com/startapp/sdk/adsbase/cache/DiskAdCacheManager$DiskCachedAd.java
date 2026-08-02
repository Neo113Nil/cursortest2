package com.startapp.sdk.adsbase.cache;

import com.startapp.sdk.adsbase.f;
import com.startapp.sdk.internal.m8;
import java.io.Serializable;

/* loaded from: classes.dex */
public class DiskAdCacheManager$DiskCachedAd implements Serializable {
    private static final long serialVersionUID = -9194311006094821018L;
    private f ad;
    private String html;

    /* JADX WARN: Multi-variable type inference failed */
    public DiskAdCacheManager$DiskCachedAd(f fVar) {
        this.ad = fVar;
        if (fVar == 0 || !(fVar instanceof m8)) {
            return;
        }
        this.html = ((m8) fVar).f4130b;
    }

    public final f a() {
        return this.ad;
    }

    public final String b() {
        return this.html;
    }
}
