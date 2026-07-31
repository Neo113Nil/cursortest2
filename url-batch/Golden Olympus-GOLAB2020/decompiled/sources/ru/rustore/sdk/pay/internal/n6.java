package ru.rustore.sdk.pay.internal;

import f2.AbstractC2420c;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class n6 {
    @NotNull
    public static final u7 a(@NotNull HttpsURLConnection httpsURLConnection, @NotNull o6 logger) {
        InputStreamReader inputStreamReader;
        Intrinsics.checkNotNullParameter(httpsURLConnection, "<this>");
        Intrinsics.checkNotNullParameter(logger, "logger");
        if (httpsURLConnection.getResponseCode() >= 400) {
            InputStream errorStream = httpsURLConnection.getErrorStream();
            try {
                inputStreamReader = new InputStreamReader(errorStream);
                try {
                    String f4 = f2.p.f(inputStreamReader);
                    AbstractC2420c.a(inputStreamReader, null);
                    logger.a(httpsURLConnection, f4);
                    URL url = httpsURLConnection.getURL();
                    Intrinsics.checkNotNullExpressionValue(url, "url");
                    u7 u7Var = new u7(url, httpsURLConnection.getResponseCode(), f4);
                    AbstractC2420c.a(errorStream, null);
                    return u7Var;
                } finally {
                }
            } finally {
            }
        } else {
            InputStream inputStream = httpsURLConnection.getInputStream();
            try {
                inputStreamReader = new InputStreamReader(inputStream);
                try {
                    String f5 = f2.p.f(inputStreamReader);
                    AbstractC2420c.a(inputStreamReader, null);
                    logger.a(httpsURLConnection, f5);
                    URL url2 = httpsURLConnection.getURL();
                    Intrinsics.checkNotNullExpressionValue(url2, "url");
                    u7 u7Var2 = new u7(url2, httpsURLConnection.getResponseCode(), f5);
                    AbstractC2420c.a(inputStream, null);
                    return u7Var2;
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            } finally {
            }
        }
    }
}
