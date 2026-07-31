package com.chartboost.sdk.impl;

import com.chartboost.sdk.privacy.model.DataUseConsent;

/* loaded from: classes6.dex */
public class y8 {
    public final gf a;

    public y8(gf gfVar) {
        this.a = gfVar;
    }

    public DataUseConsent a(String str) {
        return (DataUseConsent) this.a.a().get(str);
    }
}
