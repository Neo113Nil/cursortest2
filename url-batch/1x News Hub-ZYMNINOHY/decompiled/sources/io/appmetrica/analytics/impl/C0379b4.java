package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.b4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0379b4 {

    /* renamed from: a, reason: collision with root package name */
    public final Em f7060a;

    /* renamed from: b, reason: collision with root package name */
    public final U f7061b;

    public C0379b4(Em em, U u3) {
        this.f7060a = em;
        this.f7061b = u3;
    }

    public final C0353a4 a(HashMap hashMap) {
        AdvertisingIdsHolder a3;
        C0603jm e3 = this.f7060a.e();
        U u3 = this.f7061b;
        synchronized (u3) {
            a3 = u3.a(new C0466ee());
        }
        return new C0353a4(C0353a4.a(e3.f7666d), C0353a4.a(e3.f7663a), C0353a4.a(e3.f7664b), C0353a4.a(e3.f7671j), C0353a4.a(e3.f7670i), C0353a4.a(AbstractC0696nb.a(Jm.a(e3.f7672k))), C0353a4.a(AbstractC0696nb.a(hashMap)), new IdentifiersResult(a3.getGoogle().mAdTrackingInfo == null ? null : a3.getGoogle().mAdTrackingInfo.advId, a3.getGoogle().mStatus, a3.getGoogle().mErrorExplanation), new IdentifiersResult(a3.getHuawei().mAdTrackingInfo == null ? null : a3.getHuawei().mAdTrackingInfo.advId, a3.getHuawei().mStatus, a3.getHuawei().mErrorExplanation), new IdentifiersResult(a3.getYandex().mAdTrackingInfo == null ? null : a3.getYandex().mAdTrackingInfo.advId, a3.getYandex().mStatus, a3.getYandex().mErrorExplanation), C0353a4.a(AbstractC0696nb.a(e3.f7669h)), Kn.a(), e3.o + e3.z.f6054a, C0353a4.a(e3.f7675n.f), new Bundle());
    }
}
