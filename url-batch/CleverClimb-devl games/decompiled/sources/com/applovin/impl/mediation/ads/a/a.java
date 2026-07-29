package com.applovin.impl.mediation.ads.a;

import com.applovin.impl.mediation.c;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.p;
import com.applovin.mediation.MaxAdListener;

/* loaded from: classes.dex */
public abstract class a {
    protected final String adUnitId;
    protected final p logger;
    protected final j sdk;
    protected final String tag;
    protected MaxAdListener adListener = null;
    protected final c.a loadRequestBuilder = new c.a();

    protected a(String str, String str2, j jVar) {
        this.adUnitId = str;
        this.sdk = jVar;
        this.tag = str2;
        this.logger = jVar.u();
    }

    public String getAdUnitId() {
        return this.adUnitId;
    }

    public void setExtraParameter(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        this.loadRequestBuilder.a(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        this.adListener = maxAdListener;
    }
}
