package com.my.lib;

import androidx.exifinterface.media.ExifInterface;
import com.my.lib.F;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* loaded from: classes4.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    public static final y5.f f15344a;

    static {
        y5.f lazy;
        lazy = kotlin.b.lazy(new f6.a() { // from class: i5.l
            @Override // f6.a
            public final Object invoke() {
                return F.a();
            }
        });
        f15344a = lazy;
    }

    public static final Request.Builder a(Request.Builder builder, String deviceId, String identifier, String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(builder, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(deviceId, "deviceId");
        kotlin.jvm.internal.s.checkNotNullParameter(identifier, "identifier");
        Request.Builder addHeader = builder.addHeader("tFgqGktmjLbza", deviceId).addHeader("BoRwL", identifier);
        if (str == null) {
            str = "";
        }
        return addHeader.addHeader("MsVAvNFVm", str).addHeader("wpiruX", ExifInterface.GPS_MEASUREMENT_3D).addHeader("vsNwFXw", "716170bbda67bd99").addHeader("Content-type", com.yanzhenjie.kalle.i.VALUE_APPLICATION_JSON);
    }

    public static final OkHttpClient a() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return builder.connectTimeout(60L, timeUnit).readTimeout(60L, timeUnit).writeTimeout(60L, timeUnit).retryOnConnectionFailure(true).build();
    }
}
