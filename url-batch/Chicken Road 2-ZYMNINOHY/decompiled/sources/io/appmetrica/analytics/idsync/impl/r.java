package io.appmetrica.analytics.idsync.impl;

import android.net.Uri;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.idsync.impl.r;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class r implements s {

    /* renamed from: a, reason: collision with root package name */
    public final ServiceContext f9958a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9959b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9960c = CommonUrlParts.ADV_ID;

    /* renamed from: d, reason: collision with root package name */
    public final String f9961d = CommonUrlParts.HUAWEI_OAID;

    /* renamed from: e, reason: collision with root package name */
    public final String f9962e = CommonUrlParts.YANDEX_ADV_ID;

    /* renamed from: f, reason: collision with root package name */
    public final String f9963f = CommonUrlParts.UUID;

    /* renamed from: g, reason: collision with root package name */
    public final String f9964g = CommonUrlParts.DEVICE_ID;

    /* renamed from: h, reason: collision with root package name */
    public final String f9965h = CommonUrlParts.APP_SET_ID;

    /* renamed from: i, reason: collision with root package name */
    public final long f9966i = TimeUnit.SECONDS.toMillis(60);

    /* renamed from: j, reason: collision with root package name */
    public final long f9967j = 1000;

    /* renamed from: k, reason: collision with root package name */
    public final SystemTimeProvider f9968k = new SystemTimeProvider();

    /* renamed from: l, reason: collision with root package name */
    public final u f9969l;

    public r(ServiceContext serviceContext, String str) {
        this.f9958a = serviceContext;
        this.f9959b = str;
        this.f9969l = new u(serviceContext);
    }

    @Override // io.appmetrica.analytics.idsync.impl.s
    public final void a(final String str, SdkIdentifiers sdkIdentifiers) {
        PlatformIdentifiers platformIdentifiers = this.f9958a.getPlatformIdentifiers();
        AdvertisingIdsHolder identifiers = platformIdentifiers.getAdvIdentifiersProvider().getIdentifiers(this.f9958a.getContext());
        Uri.Builder buildUpon = Uri.parse(this.f9959b).buildUpon();
        AdTrackingInfo adTrackingInfo = identifiers.getGoogle().mAdTrackingInfo;
        if (adTrackingInfo != null) {
            buildUpon.appendQueryParameter(this.f9960c, adTrackingInfo.advId);
        }
        AdTrackingInfo adTrackingInfo2 = identifiers.getHuawei().mAdTrackingInfo;
        if (adTrackingInfo2 != null) {
            buildUpon.appendQueryParameter(this.f9961d, adTrackingInfo2.advId);
        }
        AdTrackingInfo adTrackingInfo3 = identifiers.getYandex().mAdTrackingInfo;
        if (adTrackingInfo3 != null) {
            buildUpon.appendQueryParameter(this.f9962e, adTrackingInfo3.advId);
        }
        buildUpon.appendQueryParameter(this.f9963f, sdkIdentifiers.getUuid());
        buildUpon.appendQueryParameter(this.f9964g, sdkIdentifiers.getDeviceId());
        String id = platformIdentifiers.getAppSetIdProvider().getAppSetId().getId();
        if (id != null) {
            buildUpon.appendQueryParameter(this.f9965h, id);
        }
        final String uri = buildUpon.build().toString();
        final IHandlerExecutor supportIOExecutor = this.f9958a.getExecutorProvider().getSupportIOExecutor();
        final long currentTimeMillis = this.f9968k.currentTimeMillis();
        supportIOExecutor.execute(new Runnable() { // from class: V2.a
            @Override // java.lang.Runnable
            public final void run() {
                r.a(r.this, uri, str, supportIOExecutor, currentTimeMillis);
            }
        });
    }

    public static final void a(r rVar, String str, String str2, IHandlerExecutor iHandlerExecutor, long j4) {
        long j5 = rVar.f9967j;
        if (rVar.f9969l.a(str, str2)) {
            return;
        }
        rVar.a(str, str2, iHandlerExecutor, j4, 0, j5);
    }

    public static final void a(r rVar, String str, String str2, IHandlerExecutor iHandlerExecutor, long j4, int i4, long j5) {
        int i5 = i4 + 1;
        if (rVar.f9969l.a(str, str2)) {
            return;
        }
        rVar.a(str, str2, iHandlerExecutor, j4, i5, j5);
    }

    public final void a(final String str, final String str2, final IHandlerExecutor iHandlerExecutor, final long j4, final int i4, long j5) {
        final long j6 = j5 * 2;
        if ((this.f9968k.currentTimeMillis() - j4) + j6 <= this.f9966i) {
            iHandlerExecutor.executeDelayed(new Runnable() { // from class: V2.b
                @Override // java.lang.Runnable
                public final void run() {
                    r.a(r.this, str, str2, iHandlerExecutor, j4, i4, j6);
                }
            }, j5);
        }
    }
}
