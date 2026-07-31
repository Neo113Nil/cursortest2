package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.p4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2875p4 {

    /* renamed from: a, reason: collision with root package name */
    public final Bm f39602a;

    /* renamed from: b, reason: collision with root package name */
    public final T f39603b;

    public C2875p4(Bm bm, T t4) {
        this.f39602a = bm;
        this.f39603b = t4;
    }

    public final C2849o4 a(HashMap hashMap) {
        AdvertisingIdsHolder a4;
        C2633fm e4 = this.f39602a.e();
        T t4 = this.f39603b;
        synchronized (t4) {
            a4 = t4.a(new C2807me());
        }
        return new C2849o4(C2849o4.a(e4.f38982d), C2849o4.a(e4.f38979a), C2849o4.a(e4.f38980b), C2849o4.a(e4.f38988j), C2849o4.a(e4.f38987i), C2849o4.a(Bb.a(Gm.a(e4.f38989k))), C2849o4.a(Bb.a(hashMap)), new IdentifiersResult(a4.getGoogle().mAdTrackingInfo == null ? null : a4.getGoogle().mAdTrackingInfo.advId, a4.getGoogle().mStatus, a4.getGoogle().mErrorExplanation), new IdentifiersResult(a4.getHuawei().mAdTrackingInfo == null ? null : a4.getHuawei().mAdTrackingInfo.advId, a4.getHuawei().mStatus, a4.getHuawei().mErrorExplanation), new IdentifiersResult(a4.getYandex().mAdTrackingInfo == null ? null : a4.getYandex().mAdTrackingInfo.advId, a4.getYandex().mStatus, a4.getYandex().mErrorExplanation), C2849o4.a(Bb.a(e4.f38986h)), Fn.a(), e4.f38993o + e4.f38976A.f37383a, C2849o4.a(e4.f38992n.f37563f), new Bundle());
    }
}
