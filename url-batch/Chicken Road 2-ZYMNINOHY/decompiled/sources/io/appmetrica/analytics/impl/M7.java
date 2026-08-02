package io.appmetrica.analytics.impl;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import w3.AbstractC1504a;

/* loaded from: classes.dex */
public final class M7 {

    /* renamed from: a, reason: collision with root package name */
    public final U f10632a;

    /* renamed from: b, reason: collision with root package name */
    public final C0473a2 f10633b;

    public M7(U u4, C0473a2 c0473a2) {
        this.f10632a = u4;
        this.f10633b = c0473a2;
    }

    public final String a() {
        AdvertisingIdsHolder advertisingIdsHolder;
        byte[] bArr;
        U u4 = this.f10632a;
        Jn jn = new Jn(5, 500);
        synchronized (u4) {
            try {
                u4.a((Gi) jn, true).get();
            } catch (InterruptedException | ExecutionException unused) {
            }
            advertisingIdsHolder = u4.f11027k;
        }
        AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
        if (!yandex.isValid()) {
            String id = this.f10633b.getAppSetId().getId();
            if (id != null && id.length() != 0) {
                try {
                    UUID.fromString(id);
                    if (!id.equals("00000000-0000-0000-0000-000000000000")) {
                        return w3.o.Y(id, TokenBuilder.TOKEN_DELIMITER, "");
                    }
                } catch (Throwable unused2) {
                }
            }
            return w3.o.Y(UUID.randomUUID().toString(), TokenBuilder.TOKEN_DELIMITER, "").toLowerCase(Locale.US);
        }
        AdTrackingInfo adTrackingInfo = yandex.mAdTrackingInfo;
        kotlin.jvm.internal.i.b(adTrackingInfo);
        String str = adTrackingInfo.advId;
        kotlin.jvm.internal.i.b(str);
        try {
            bArr = MessageDigest.getInstance("MD5").digest(str.getBytes(AbstractC1504a.f15936a));
        } catch (NoSuchAlgorithmException unused3) {
            bArr = new byte[0];
        }
        return StringUtils.toHexString(bArr);
    }

    public M7() {
        this(C0817na.k().c(), C0817na.k().d());
    }
}
