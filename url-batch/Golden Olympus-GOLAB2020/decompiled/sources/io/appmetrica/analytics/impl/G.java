package io.appmetrica.analytics.impl;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class G {
    public static /* synthetic */ String a(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? "null" : GrsBaseInfo.CountryCodeSource.UNKNOWN : "FORBIDDEN_BY_REMOTE_CONFIG" : "FORBIDDEN_BY_CLIENT_CONFIG" : "ALLOWED";
    }
}
