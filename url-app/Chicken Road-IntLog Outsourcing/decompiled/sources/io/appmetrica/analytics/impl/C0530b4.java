package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.b4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0530b4 {

    /* renamed from: a, reason: collision with root package name */
    public final Em f7910a;

    /* renamed from: b, reason: collision with root package name */
    public final U f7911b;

    public C0530b4(Em em, U u5) {
        this.f7910a = em;
        this.f7911b = u5;
    }

    public final C0504a4 a(HashMap hashMap) {
        AdvertisingIdsHolder a6;
        C0754jm e3 = this.f7910a.e();
        U u5 = this.f7911b;
        synchronized (u5) {
            a6 = u5.a(new C0617ee());
        }
        return new C0504a4(C0504a4.a(e3.f8562d), C0504a4.a(e3.f8559a), C0504a4.a(e3.f8560b), C0504a4.a(e3.f8568j), C0504a4.a(e3.f8567i), C0504a4.a(AbstractC0847nb.a(Jm.a(e3.f8569k))), C0504a4.a(AbstractC0847nb.a(hashMap)), new IdentifiersResult(a6.getGoogle().mAdTrackingInfo == null ? null : a6.getGoogle().mAdTrackingInfo.advId, a6.getGoogle().mStatus, a6.getGoogle().mErrorExplanation), new IdentifiersResult(a6.getHuawei().mAdTrackingInfo == null ? null : a6.getHuawei().mAdTrackingInfo.advId, a6.getHuawei().mStatus, a6.getHuawei().mErrorExplanation), new IdentifiersResult(a6.getYandex().mAdTrackingInfo == null ? null : a6.getYandex().mAdTrackingInfo.advId, a6.getYandex().mStatus, a6.getYandex().mErrorExplanation), C0504a4.a(AbstractC0847nb.a(e3.f8566h)), Kn.a(), e3.f8573o + e3.z.f6847a, C0504a4.a(e3.f8572n.f9233f), new Bundle());
    }
}
