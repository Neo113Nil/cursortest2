package com.startapp.sdk.ads.external;

import E1.AbstractC0033i;
import android.graphics.Point;
import com.startapp.sdk.ads.external.config.ExternalAdConfig;
import com.startapp.sdk.ads.external.config.ExternalConfig;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.AbstractC0288g;
import kotlin.jvm.internal.j;
import s2.n;

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
        j.e(sessionId, "sessionId");
        this.sessionId = sessionId;
        this.sioPrice = str2;
        this.mappedPrice = str3;
        this.placement = placement;
        this.requestTimeStamp = str4;
        this.videoMode = bool;
        this.video = str5;
        this.size = point;
        this.newAdType = str6;
        ExternalConfig u3 = MetaData.E().u();
        this.dparam = (u3 == null || (googleads = u3.getGoogleads()) == null) ? null : googleads.getDparam();
    }

    @Override // com.startapp.sdk.adsbase.commontracking.TrackingParams
    public final String e() {
        String e3 = super.e();
        j.d(e3, "getQueryString(...)");
        if (!n.R(e3, "?") || !n.X(e3, "?")) {
            if (n.R(e3, "&") && n.X(e3, "&")) {
                e3 = e3.substring(1);
                j.d(e3, "substring(...)");
            }
            e3 = "?".concat(e3);
        }
        String str = e3 + "&sessionId=" + this.sessionId + '&' + AbstractC0288g.f3840b + '=' + AbstractC0288g.a();
        String str2 = this.dparam;
        if (str2 != null) {
            str = AbstractC0033i.k(str, "&d=", str2);
        }
        String str3 = this.sioPrice;
        if (str3 != null) {
            str = AbstractC0033i.k(AbstractC0033i.k(str, "&supplyBidFloor=", str3), "&bidPrice=", str3);
        }
        String str4 = this.mappedPrice;
        if (str4 != null) {
            str = AbstractC0033i.k(AbstractC0033i.k(AbstractC0033i.k(str, "&originalPrice=", str4), "&price=", str4), "&cpmPred=", str4);
        }
        AdPreferences.Placement placement = this.placement;
        if (placement != null) {
            str = str + "&placement=" + placement.name();
        }
        String str5 = this.requestTimeStamp;
        if (str5 != null) {
            str = AbstractC0033i.k(str, "&requestTs=", str5);
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
            str = AbstractC0033i.k(str, "&video=", str6);
        }
        Point point = this.size;
        if (point != null) {
            str = str + "&formatWidth=" + point.x + "&formatHeight=" + point.y;
        }
        String str7 = this.newAdType;
        return str7 != null ? AbstractC0033i.k(str, "&newAdType=", str7) : str;
    }
}
