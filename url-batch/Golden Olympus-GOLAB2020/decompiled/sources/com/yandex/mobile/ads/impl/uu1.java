package com.yandex.mobile.ads.impl;

import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class uu1 extends nz {

    /* renamed from: s, reason: collision with root package name */
    @Nullable
    private final SSLSocketFactory f33358s;

    public uu1(@Nullable String str, @Nullable ah0 ah0Var, @Nullable SSLSocketFactory sSLSocketFactory) {
        super(str, JosStatusCodes.RTN_CODE_COMMON_ERROR, JosStatusCodes.RTN_CODE_COMMON_ERROR, ah0Var);
        this.f33358s = sSLSocketFactory;
    }

    @Override // com.yandex.mobile.ads.impl.nz
    @NotNull
    public final HttpURLConnection a(@NotNull URL url) {
        Intrinsics.checkNotNullParameter(url, "url");
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        SSLSocketFactory sSLSocketFactory = this.f33358s;
        if (sSLSocketFactory != null && (httpURLConnection instanceof HttpsURLConnection)) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        Intrinsics.checkNotNull(httpURLConnection);
        return httpURLConnection;
    }
}
