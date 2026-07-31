package com.startapp.sdk.adsbase.cache;

import com.startapp.sdk.adsbase.f;
import com.startapp.sdk.internal.x7;
import java.io.Serializable;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class DiskAdCacheManager$DiskCachedAd implements Serializable {
    private static final long serialVersionUID = -9194311006094821018L;
    private f ad;
    private String html;

    /* JADX WARN: Multi-variable type inference failed */
    public DiskAdCacheManager$DiskCachedAd(f fVar) {
        this.ad = fVar;
        if (fVar == 0 || !(fVar instanceof x7)) {
            return;
        }
        this.html = ((x7) fVar).b;
    }

    public final f a() {
        return this.ad;
    }

    public final String b() {
        return this.html;
    }
}
