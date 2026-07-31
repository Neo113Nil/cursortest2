package gbcorp.c312.merkmarker.info.ui.state;

import gbcorp.c312.merkmarker.info.data.model.GTSLYUrlState;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GTSLYPrepState.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003JC\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lgbcorp/c312/merkmarker/info/ui/state/GTSLYPrepState;", "", "urlState", "Lgbcorp/c312/merkmarker/info/data/model/GTSLYUrlState;", "appsFlyerConversionData", "", "", "fcmToken", "installReferrer", "<init>", "(Lgbcorp/c312/merkmarker/info/data/model/GTSLYUrlState;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "getUrlState", "()Lgbcorp/c312/merkmarker/info/data/model/GTSLYUrlState;", "getAppsFlyerConversionData", "()Ljava/util/Map;", "getFcmToken", "()Ljava/lang/String;", "getInstallReferrer", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GTSLYPrepState {
    public static final int $stable = 8;
    private final Map<String, Object> appsFlyerConversionData;
    private final String fcmToken;
    private final String installReferrer;
    private final GTSLYUrlState urlState;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GTSLYPrepState copy$default(GTSLYPrepState gTSLYPrepState, GTSLYUrlState gTSLYUrlState, Map map, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            gTSLYUrlState = gTSLYPrepState.urlState;
        }
        if ((i & 2) != 0) {
            map = gTSLYPrepState.appsFlyerConversionData;
        }
        if ((i & 4) != 0) {
            str = gTSLYPrepState.fcmToken;
        }
        if ((i & 8) != 0) {
            str2 = gTSLYPrepState.installReferrer;
        }
        return gTSLYPrepState.copy(gTSLYUrlState, map, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final GTSLYUrlState getUrlState() {
        return this.urlState;
    }

    public final Map<String, Object> component2() {
        return this.appsFlyerConversionData;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFcmToken() {
        return this.fcmToken;
    }

    /* renamed from: component4, reason: from getter */
    public final String getInstallReferrer() {
        return this.installReferrer;
    }

    public final GTSLYPrepState copy(GTSLYUrlState urlState, Map<String, ? extends Object> appsFlyerConversionData, String fcmToken, String installReferrer) {
        Intrinsics.checkNotNullParameter(urlState, "urlState");
        return new GTSLYPrepState(urlState, appsFlyerConversionData, fcmToken, installReferrer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GTSLYPrepState)) {
            return false;
        }
        GTSLYPrepState gTSLYPrepState = (GTSLYPrepState) other;
        return Intrinsics.areEqual(this.urlState, gTSLYPrepState.urlState) && Intrinsics.areEqual(this.appsFlyerConversionData, gTSLYPrepState.appsFlyerConversionData) && Intrinsics.areEqual(this.fcmToken, gTSLYPrepState.fcmToken) && Intrinsics.areEqual(this.installReferrer, gTSLYPrepState.installReferrer);
    }

    public int hashCode() {
        int hashCode = this.urlState.hashCode() * 31;
        Map<String, Object> map = this.appsFlyerConversionData;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.fcmToken;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.installReferrer;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "GTSLYPrepState(urlState=" + this.urlState + ", appsFlyerConversionData=" + this.appsFlyerConversionData + ", fcmToken=" + this.fcmToken + ", installReferrer=" + this.installReferrer + ")";
    }

    public GTSLYPrepState(GTSLYUrlState urlState, Map<String, ? extends Object> map, String str, String str2) {
        Intrinsics.checkNotNullParameter(urlState, "urlState");
        this.urlState = urlState;
        this.appsFlyerConversionData = map;
        this.fcmToken = str;
        this.installReferrer = str2;
    }

    public final GTSLYUrlState getUrlState() {
        return this.urlState;
    }

    public final Map<String, Object> getAppsFlyerConversionData() {
        return this.appsFlyerConversionData;
    }

    public final String getFcmToken() {
        return this.fcmToken;
    }

    public final String getInstallReferrer() {
        return this.installReferrer;
    }
}
