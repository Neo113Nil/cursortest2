package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.PreloadInfo;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.uf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1003uf {

    /* renamed from: a, reason: collision with root package name */
    public final C0900qf f12829a;

    public C1003uf(PreloadInfo preloadInfo, PublicLogger publicLogger, boolean z) {
        if (preloadInfo != null) {
            if (TextUtils.isEmpty(preloadInfo.getTrackingId())) {
                publicLogger.error("Required field \"PreloadInfo.trackingId\" is empty!\nThis preload info will be skipped.", new Object[0]);
            } else {
                this.f12829a = new C0900qf(preloadInfo.getTrackingId(), new JSONObject(preloadInfo.getAdditionalParams()), true, z, S7.f10933c);
            }
        }
    }
}
