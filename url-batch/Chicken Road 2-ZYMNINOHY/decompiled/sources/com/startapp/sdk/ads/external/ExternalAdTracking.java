package com.startapp.sdk.ads.external;

import android.graphics.Point;
import com.startapp.sdk.ads.external.config.ExternalAdConfig;
import com.startapp.sdk.ads.external.config.ExternalConfig;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.AbstractC0366g;
import kotlin.jvm.internal.i;
import w3.AbstractC1510g;
import w3.o;
import x.AbstractC1514c;

/* loaded from: classes.dex */
public final class ExternalAdTracking extends TrackingParams {
    private static final long serialVersionUID = 8119468204117511007L;
    private final String dparam;
    private final String mappedPrice;
    private final String newAdType;
    private final AdPreferences.Placement placement;
    private final String requestTimeStamp;
    private final String sessionId;
    private final String sioPrice;
    private final Point size;
    private final String video;
    private final Boolean videoMode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalAdTracking(String sessionId, String str, String str2, String str3, AdPreferences.Placement placement, String str4, Boolean bool, String str5, Point point, String str6) {
        super(str);
        ExternalAdConfig googleads;
        i.e(sessionId, "sessionId");
        this.sessionId = sessionId;
        this.sioPrice = str2;
        this.mappedPrice = str3;
        this.placement = placement;
        this.requestTimeStamp = str4;
        this.videoMode = bool;
        this.video = str5;
        this.size = point;
        this.newAdType = str6;
        ExternalConfig u4 = MetaData.E().u();
        this.dparam = (u4 == null || (googleads = u4.getGoogleads()) == null) ? null : googleads.getDparam();
    }

    @Override // com.startapp.sdk.adsbase.commontracking.TrackingParams
    public final String e() {
        String e4 = super.e();
        i.d(e4, "getQueryString(...)");
        if (!AbstractC1510g.c0(e4, "?") || !o.a0(e4, "?", false)) {
            if (AbstractC1510g.c0(e4, "&") && o.a0(e4, "&", false)) {
                e4 = e4.substring(1);
                i.d(e4, "substring(...)");
            }
            e4 = "?".concat(e4);
        }
        String str = e4 + "&sessionId=" + this.sessionId + '&' + AbstractC0366g.f6958b + '=' + AbstractC0366g.a();
        String str2 = this.dparam;
        if (str2 != null) {
            str = AbstractC1514c.b(str, "&d=", str2);
        }
        String str3 = this.sioPrice;
        if (str3 != null) {
            str = AbstractC1514c.b(AbstractC1514c.b(str, "&supplyBidFloor=", str3), "&bidPrice=", str3);
        }
        String str4 = this.mappedPrice;
        if (str4 != null) {
            str = AbstractC1514c.b(AbstractC1514c.b(AbstractC1514c.b(str, "&originalPrice=", str4), "&price=", str4), "&cpmPred=", str4);
        }
        AdPreferences.Placement placement = this.placement;
        if (placement != null) {
            str = str + "&placement=" + placement.name();
        }
        String str5 = this.requestTimeStamp;
        if (str5 != null) {
            str = AbstractC1514c.b(str, "&requestTs=", str5);
        }
        Boolean bool = this.videoMode;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("&videoMode=");
            sb.append(booleanValue ? "REWARDED" : "INTERSTITIAL");
            str = sb.toString();
        }
        String str6 = this.video;
        if (str6 != null) {
            str = AbstractC1514c.b(str, "&video=", str6);
        }
        Point point = this.size;
        if (point != null) {
            str = str + "&formatWidth=" + point.x + "&formatHeight=" + point.y;
        }
        String str7 = this.newAdType;
        return str7 != null ? AbstractC1514c.b(str, "&newAdType=", str7) : str;
    }
}
