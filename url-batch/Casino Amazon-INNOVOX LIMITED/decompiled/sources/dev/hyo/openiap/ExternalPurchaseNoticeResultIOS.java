package dev.hyo.openiap;

import com.google.firebase.messaging.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, d2 = {"Ldev/hyo/openiap/ExternalPurchaseNoticeResultIOS;", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "externalPurchaseToken", "result", "Ldev/hyo/openiap/ExternalPurchaseNoticeAction;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ldev/hyo/openiap/ExternalPurchaseNoticeAction;)V", "getError", "()Ljava/lang/String;", "getExternalPurchaseToken", "getResult", "()Ldev/hyo/openiap/ExternalPurchaseNoticeAction;", "toJson", "", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ExternalPurchaseNoticeResultIOS {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String error;
    private final String externalPurchaseToken;
    private final ExternalPurchaseNoticeAction result;

    public static /* synthetic */ ExternalPurchaseNoticeResultIOS copy$default(ExternalPurchaseNoticeResultIOS externalPurchaseNoticeResultIOS, String str, String str2, ExternalPurchaseNoticeAction externalPurchaseNoticeAction, int i, Object obj) {
        if ((i & 1) != 0) {
            str = externalPurchaseNoticeResultIOS.error;
        }
        if ((i & 2) != 0) {
            str2 = externalPurchaseNoticeResultIOS.externalPurchaseToken;
        }
        if ((i & 4) != 0) {
            externalPurchaseNoticeAction = externalPurchaseNoticeResultIOS.result;
        }
        return externalPurchaseNoticeResultIOS.copy(str, str2, externalPurchaseNoticeAction);
    }

    /* renamed from: component1, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component2, reason: from getter */
    public final String getExternalPurchaseToken() {
        return this.externalPurchaseToken;
    }

    /* renamed from: component3, reason: from getter */
    public final ExternalPurchaseNoticeAction getResult() {
        return this.result;
    }

    public final ExternalPurchaseNoticeResultIOS copy(String error, String externalPurchaseToken, ExternalPurchaseNoticeAction result) {
        Intrinsics.checkNotNullParameter(result, "result");
        return new ExternalPurchaseNoticeResultIOS(error, externalPurchaseToken, result);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalPurchaseNoticeResultIOS)) {
            return false;
        }
        ExternalPurchaseNoticeResultIOS externalPurchaseNoticeResultIOS = (ExternalPurchaseNoticeResultIOS) other;
        return Intrinsics.areEqual(this.error, externalPurchaseNoticeResultIOS.error) && Intrinsics.areEqual(this.externalPurchaseToken, externalPurchaseNoticeResultIOS.externalPurchaseToken) && this.result == externalPurchaseNoticeResultIOS.result;
    }

    public int hashCode() {
        String str = this.error;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.externalPurchaseToken;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.result.hashCode();
    }

    public String toString() {
        return "ExternalPurchaseNoticeResultIOS(error=" + this.error + ", externalPurchaseToken=" + this.externalPurchaseToken + ", result=" + this.result + ")";
    }

    public ExternalPurchaseNoticeResultIOS(String str, String str2, ExternalPurchaseNoticeAction result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.error = str;
        this.externalPurchaseToken = str2;
        this.result = result;
    }

    public /* synthetic */ ExternalPurchaseNoticeResultIOS(String str, String str2, ExternalPurchaseNoticeAction externalPurchaseNoticeAction, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, externalPurchaseNoticeAction);
    }

    public final String getError() {
        return this.error;
    }

    public final String getExternalPurchaseToken() {
        return this.externalPurchaseToken;
    }

    public final ExternalPurchaseNoticeAction getResult() {
        return this.result;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/ExternalPurchaseNoticeResultIOS$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/ExternalPurchaseNoticeResultIOS;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ExternalPurchaseNoticeResultIOS fromJson(Map<String, ? extends Object> json) {
            ExternalPurchaseNoticeAction externalPurchaseNoticeAction;
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            String str = obj instanceof String ? (String) obj : null;
            Object obj2 = json.get("externalPurchaseToken");
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            Object obj3 = json.get("result");
            String str3 = obj3 instanceof String ? (String) obj3 : null;
            if (str3 == null || (externalPurchaseNoticeAction = ExternalPurchaseNoticeAction.INSTANCE.fromJson(str3)) == null) {
                externalPurchaseNoticeAction = ExternalPurchaseNoticeAction.Continue;
            }
            return new ExternalPurchaseNoticeResultIOS(str, str2, externalPurchaseNoticeAction);
        }
    }

    public final Map<String, Object> toJson() {
        return MapsKt.mapOf(TuplesKt.to("__typename", "ExternalPurchaseNoticeResultIOS"), TuplesKt.to(Constants.IPC_BUNDLE_KEY_SEND_ERROR, this.error), TuplesKt.to("externalPurchaseToken", this.externalPurchaseToken), TuplesKt.to("result", this.result.toJson()));
    }
}
