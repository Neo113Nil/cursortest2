package com.startapp.sdk.internal;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.json.JsonParser;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.List;

/* loaded from: classes.dex */
public final class i8 extends w7 {

    /* renamed from: f, reason: collision with root package name */
    public final ij f7085f;

    /* renamed from: g, reason: collision with root package name */
    public final ib f7086g;

    /* renamed from: h, reason: collision with root package name */
    public final ib f7087h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(Context context, ij videoEnabledAd, AdEventListener adEventListener, ib webViewFactory, ib networkApiExecutor, ib eventTracer, ib webViewCacheLoader, String adm, ib httpClient) {
        super(context, videoEnabledAd, adEventListener, networkApiExecutor, eventTracer, webViewCacheLoader, adm);
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(videoEnabledAd, "videoEnabledAd");
        kotlin.jvm.internal.i.e(webViewFactory, "webViewFactory");
        kotlin.jvm.internal.i.e(networkApiExecutor, "networkApiExecutor");
        kotlin.jvm.internal.i.e(eventTracer, "eventTracer");
        kotlin.jvm.internal.i.e(webViewCacheLoader, "webViewCacheLoader");
        kotlin.jvm.internal.i.e(adm, "adm");
        kotlin.jvm.internal.i.e(httpClient, "httpClient");
        this.f7085f = videoEnabledAd;
        this.f7086g = webViewFactory;
        this.f7087h = httpClient;
    }

    public static final void a(i8 this$0, List errorTrackersUrls, VASTErrorCodes errorCode) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(errorTrackersUrls, "errorTrackersUrls");
        kotlin.jvm.internal.i.e(errorCode, "errorCode");
        j8.a(this$0.f6410c, this$0.f7085f.f7113r, errorTrackersUrls, errorCode);
    }

    @Override // com.startapp.sdk.internal.w7, com.startapp.sdk.adsbase.d
    public final Object a(String adm) {
        Object obj;
        vi viVar;
        kotlin.jvm.internal.i.e(adm, "adm");
        try {
            VideoConfig F4 = AdsCommonMetaData.k().F();
            kotlin.jvm.internal.i.d(F4, "getVideoConfig(...)");
            MetaData E4 = MetaData.E();
            kotlin.jvm.internal.i.d(E4, "getInstance(...)");
            xi xiVar = (xi) JsonParser.fromJson(adm, xi.class);
            if (xiVar != null) {
                String vastTag = xiVar.getVastTag();
                if (vastTag != null) {
                    String d02 = E4.d0();
                    if (!xiVar.isRecordHops() || TextUtils.isEmpty(d02)) {
                        viVar = null;
                    } else {
                        ib ibVar = this.f7087h;
                        kotlin.jvm.internal.i.b(d02);
                        viVar = new vi(ibVar, d02, xiVar.getPartnerResponse(), xiVar.getPartnerName(), xiVar.isSkipFailed());
                    }
                    aj ajVar = new aj(this.f6410c, ((rk) this.f7086g.a()).a());
                    ajVar.f6685f = F4.f();
                    ajVar.f6682c = new D0.a(25, this);
                    ui a3 = ajVar.a(vastTag, viVar, xiVar.getEndCard(), xiVar.getMaxEndCards());
                    if (a3 != null) {
                        Ad ad = this.f6408a;
                        dj djVar = (ad != null ? ad.getType() : null) != Ad.AdType.REWARDED_VIDEO ? new dj(xiVar.getSkipafter(), xiVar.getSkipmin()) : null;
                        Ad ad2 = this.f6408a;
                        ij ijVar = ad2 instanceof ij ? (ij) ad2 : null;
                        if (ijVar != null) {
                            ijVar.a(a3, F4, djVar);
                            String ttlSec = xiVar.getTtlSec();
                            if (ttlSec != null) {
                                ijVar.c(ttlSec);
                            }
                        }
                        String admTag = xiVar.getAdmTag();
                        obj = admTag != null ? super.a(admTag) : null;
                        if (obj != null) {
                        }
                    }
                    throw new RuntimeException("Vast config error");
                }
                obj = null;
                if (obj != null) {
                    return obj;
                }
            }
            return super.a(adm);
        } catch (Throwable th) {
            Ad ad3 = this.f6408a;
            ij ijVar2 = ad3 instanceof ij ? (ij) ad3 : null;
            if (ijVar2 != null) {
                ijVar2.setErrorMessage(th.getMessage());
            }
            return null;
        }
    }
}
