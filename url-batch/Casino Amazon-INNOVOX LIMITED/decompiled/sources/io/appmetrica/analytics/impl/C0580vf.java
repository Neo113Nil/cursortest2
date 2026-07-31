package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.PreloadInfo;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.vf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0580vf {

    /* renamed from: a, reason: collision with root package name */
    public final C0480rf f1535a;

    public C0580vf(PreloadInfo preloadInfo, PublicLogger publicLogger, boolean z) {
        if (preloadInfo != null) {
            if (TextUtils.isEmpty(preloadInfo.getTrackingId())) {
                publicLogger.error("Required field \"PreloadInfo.trackingId\" is empty!\nThis preload info will be skipped.", new Object[0]);
            } else {
                this.f1535a = new C0480rf(preloadInfo.getTrackingId(), new JSONObject(preloadInfo.getAdditionalParams()), true, z, T7.c);
            }
        }
    }
}
