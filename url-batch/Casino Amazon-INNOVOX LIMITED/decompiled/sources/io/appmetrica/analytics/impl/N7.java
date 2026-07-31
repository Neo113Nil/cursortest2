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
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class N7 {

    /* renamed from: a, reason: collision with root package name */
    public final U f966a;
    public final C0060b2 b;

    public N7(U u, C0060b2 c0060b2) {
        this.f966a = u;
        this.b = c0060b2;
    }

    public final String a() {
        AdvertisingIdsHolder advertisingIdsHolder;
        byte[] bArr;
        U u = this.f966a;
        Kn kn = new Kn(5, 500);
        synchronized (u) {
            try {
                u.a((Hi) kn, true).get();
            } catch (InterruptedException | ExecutionException unused) {
            }
            advertisingIdsHolder = u.k;
        }
        AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
        if (!yandex.isValid()) {
            String id = this.b.getAppSetId().getId();
            if (id != null && id.length() != 0) {
                try {
                    UUID.fromString(id);
                    if (!Intrinsics.areEqual(id, "00000000-0000-0000-0000-000000000000")) {
                        return StringsKt.replace$default(id, TokenBuilder.TOKEN_DELIMITER, "", false, 4, (Object) null);
                    }
                } catch (Throwable unused2) {
                }
            }
            return StringsKt.replace$default(UUID.randomUUID().toString(), TokenBuilder.TOKEN_DELIMITER, "", false, 4, (Object) null).toLowerCase(Locale.US);
        }
        AdTrackingInfo adTrackingInfo = yandex.mAdTrackingInfo;
        Intrinsics.checkNotNull(adTrackingInfo);
        String str = adTrackingInfo.advId;
        Intrinsics.checkNotNull(str);
        try {
            bArr = MessageDigest.getInstance("MD5").digest(str.getBytes(Charsets.UTF_8));
        } catch (NoSuchAlgorithmException unused3) {
            bArr = new byte[0];
        }
        return StringUtils.toHexString(bArr);
    }

    public N7() {
        this(C0401oa.k().c(), C0401oa.k().d());
    }
}
