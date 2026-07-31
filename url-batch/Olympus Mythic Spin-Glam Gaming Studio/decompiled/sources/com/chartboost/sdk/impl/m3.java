package com.chartboost.sdk.impl;

import android.os.Build;
import com.chartboost.sdk.internal.Networking.NetworkHelper;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public abstract class m3 {
    public static final a a = new a(null);

    public static final SSLSocketFactory a() {
        return a.a();
    }

    public static final class a {
        public final SSLSocketFactory a() {
            SSLContext sSLContext = Build.VERSION.SDK_INT >= 29 ? SSLContext.getInstance("TLSv1.3") : SSLContext.getInstance("TLSv1.2");
            if (NetworkHelper.a()) {
                sSLContext.init(null, new X509TrustManager[]{pg.c()}, null);
            } else {
                sSLContext.init(null, null, null);
            }
            sSLContext.createSSLEngine();
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getSocketFactory(...)");
            return socketFactory;
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
