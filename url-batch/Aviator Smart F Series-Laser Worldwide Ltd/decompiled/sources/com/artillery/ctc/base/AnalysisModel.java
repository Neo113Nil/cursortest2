package com.artillery.ctc.base;

import androidx.annotation.Keep;
import com.artillery.ctc.uitls.TimeUtils;
import com.baidu.ar.constants.HttpConstants;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import y.a;

@Keep
/* loaded from: classes.dex */
public final class AnalysisModel {
    private final String appversion;
    private final String date;
    private final String deviceId;
    private final String extra;
    private final String mac;
    private final String packName;
    private final String params;
    private final String patform;
    private final String reqUrl;

    public AnalysisModel(String deviceId, String mac, String reqUrl, String packName, String params, String extra, String appversion, String patform, String date) {
        s.checkNotNullParameter(deviceId, "deviceId");
        s.checkNotNullParameter(mac, "mac");
        s.checkNotNullParameter(reqUrl, "reqUrl");
        s.checkNotNullParameter(packName, "packName");
        s.checkNotNullParameter(params, "params");
        s.checkNotNullParameter(extra, "extra");
        s.checkNotNullParameter(appversion, "appversion");
        s.checkNotNullParameter(patform, "patform");
        s.checkNotNullParameter(date, "date");
        this.deviceId = deviceId;
        this.mac = mac;
        this.reqUrl = reqUrl;
        this.packName = packName;
        this.params = params;
        this.extra = extra;
        this.appversion = appversion;
        this.patform = patform;
        this.date = date;
    }

    public final String component1() {
        return this.deviceId;
    }

    public final String component2() {
        return this.mac;
    }

    public final String component3() {
        return this.reqUrl;
    }

    public final String component4() {
        return this.packName;
    }

    public final String component5() {
        return this.params;
    }

    public final String component6() {
        return this.extra;
    }

    public final String component7() {
        return this.appversion;
    }

    public final String component8() {
        return this.patform;
    }

    public final String component9() {
        return this.date;
    }

    public final AnalysisModel copy(String deviceId, String mac, String reqUrl, String packName, String params, String extra, String appversion, String patform, String date) {
        s.checkNotNullParameter(deviceId, "deviceId");
        s.checkNotNullParameter(mac, "mac");
        s.checkNotNullParameter(reqUrl, "reqUrl");
        s.checkNotNullParameter(packName, "packName");
        s.checkNotNullParameter(params, "params");
        s.checkNotNullParameter(extra, "extra");
        s.checkNotNullParameter(appversion, "appversion");
        s.checkNotNullParameter(patform, "patform");
        s.checkNotNullParameter(date, "date");
        return new AnalysisModel(deviceId, mac, reqUrl, packName, params, extra, appversion, patform, date);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnalysisModel)) {
            return false;
        }
        AnalysisModel analysisModel = (AnalysisModel) obj;
        return s.areEqual(this.deviceId, analysisModel.deviceId) && s.areEqual(this.mac, analysisModel.mac) && s.areEqual(this.reqUrl, analysisModel.reqUrl) && s.areEqual(this.packName, analysisModel.packName) && s.areEqual(this.params, analysisModel.params) && s.areEqual(this.extra, analysisModel.extra) && s.areEqual(this.appversion, analysisModel.appversion) && s.areEqual(this.patform, analysisModel.patform) && s.areEqual(this.date, analysisModel.date);
    }

    public final String getAppversion() {
        return this.appversion;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final String getMac() {
        return this.mac;
    }

    public final String getPackName() {
        return this.packName;
    }

    public final String getParams() {
        return this.params;
    }

    public final String getPatform() {
        return this.patform;
    }

    public final String getReqUrl() {
        return this.reqUrl;
    }

    public int hashCode() {
        return (((((((((((((((this.deviceId.hashCode() * 31) + this.mac.hashCode()) * 31) + this.reqUrl.hashCode()) * 31) + this.packName.hashCode()) * 31) + this.params.hashCode()) * 31) + this.extra.hashCode()) * 31) + this.appversion.hashCode()) * 31) + this.patform.hashCode()) * 31) + this.date.hashCode();
    }

    public String toString() {
        return "AnalysisModel(deviceId=" + this.deviceId + ", mac=" + this.mac + ", reqUrl=" + this.reqUrl + ", packName=" + this.packName + ", params=" + this.params + ", extra=" + this.extra + ", appversion=" + this.appversion + ", patform=" + this.patform + ", date=" + this.date + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AnalysisModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i8, o oVar) {
        this(str, str2, str3, r7, r8, r9, r10, r11, r12);
        String str10;
        String str11;
        if ((i8 & 8) != 0) {
            String a8 = a.a();
            s.checkNotNullExpressionValue(a8, "getAppPackageName()");
            str10 = a8;
        } else {
            str10 = str4;
        }
        String str12 = (i8 & 16) != 0 ? "" : str5;
        String str13 = (i8 & 32) != 0 ? "" : str6;
        String str14 = (i8 & 64) != 0 ? "overseas_2.0.013" : str7;
        String str15 = (i8 & 128) != 0 ? HttpConstants.OS_TYPE_VALUE : str8;
        if ((i8 & 256) != 0) {
            String nowString = TimeUtils.getNowString();
            s.checkNotNullExpressionValue(nowString, "getNowString()");
            str11 = nowString;
        } else {
            str11 = str9;
        }
    }
}
