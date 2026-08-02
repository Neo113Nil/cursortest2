package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class T3 {

    /* renamed from: a, reason: collision with root package name */
    public final Am f10974a;

    /* renamed from: b, reason: collision with root package name */
    public final U f10975b;

    public T3(Am am, U u4) {
        this.f10974a = am;
        this.f10975b = u4;
    }

    public final S3 a(HashMap hashMap) {
        AdvertisingIdsHolder a3;
        C0622fm e4 = this.f10974a.e();
        U u4 = this.f10975b;
        synchronized (u4) {
            a3 = u4.a(new Xd());
        }
        return new S3(S3.a(e4.f11863d), S3.a(e4.f11860a), S3.a(e4.f11861b), S3.a(e4.f11869j), S3.a(e4.f11868i), S3.a(AbstractC0637gb.a(Fm.a(e4.f11870k))), S3.a(AbstractC0637gb.a(hashMap)), new IdentifiersResult(a3.getGoogle().mAdTrackingInfo == null ? null : a3.getGoogle().mAdTrackingInfo.advId, a3.getGoogle().mStatus, a3.getGoogle().mErrorExplanation), new IdentifiersResult(a3.getHuawei().mAdTrackingInfo == null ? null : a3.getHuawei().mAdTrackingInfo.advId, a3.getHuawei().mStatus, a3.getHuawei().mErrorExplanation), new IdentifiersResult(a3.getYandex().mAdTrackingInfo == null ? null : a3.getYandex().mAdTrackingInfo.advId, a3.getYandex().mStatus, a3.getYandex().mErrorExplanation), S3.a(AbstractC0637gb.a(e4.f11867h)), In.a(), e4.o + e4.z.f10172a, S3.a(e4.n.f12264f), new Bundle());
    }
}
