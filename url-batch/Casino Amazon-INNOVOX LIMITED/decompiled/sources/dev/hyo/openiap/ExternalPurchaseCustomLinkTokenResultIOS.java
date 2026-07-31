package dev.hyo.openiap;

import com.google.firebase.messaging.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bJ\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, d2 = {"Ldev/hyo/openiap/ExternalPurchaseCustomLinkTokenResultIOS;", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "token", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "getToken", "toJson", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ExternalPurchaseCustomLinkTokenResultIOS {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String error;
    private final String token;

    /* JADX WARN: Multi-variable type inference failed */
    public ExternalPurchaseCustomLinkTokenResultIOS() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ExternalPurchaseCustomLinkTokenResultIOS copy$default(ExternalPurchaseCustomLinkTokenResultIOS externalPurchaseCustomLinkTokenResultIOS, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = externalPurchaseCustomLinkTokenResultIOS.error;
        }
        if ((i & 2) != 0) {
            str2 = externalPurchaseCustomLinkTokenResultIOS.token;
        }
        return externalPurchaseCustomLinkTokenResultIOS.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component2, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final ExternalPurchaseCustomLinkTokenResultIOS copy(String error, String token) {
        return new ExternalPurchaseCustomLinkTokenResultIOS(error, token);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalPurchaseCustomLinkTokenResultIOS)) {
            return false;
        }
        ExternalPurchaseCustomLinkTokenResultIOS externalPurchaseCustomLinkTokenResultIOS = (ExternalPurchaseCustomLinkTokenResultIOS) other;
        return Intrinsics.areEqual(this.error, externalPurchaseCustomLinkTokenResultIOS.error) && Intrinsics.areEqual(this.token, externalPurchaseCustomLinkTokenResultIOS.token);
    }

    public int hashCode() {
        String str = this.error;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.token;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ExternalPurchaseCustomLinkTokenResultIOS(error=" + this.error + ", token=" + this.token + ")";
    }

    public ExternalPurchaseCustomLinkTokenResultIOS(String str, String str2) {
        this.error = str;
        this.token = str2;
    }

    public /* synthetic */ ExternalPurchaseCustomLinkTokenResultIOS(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public final String getError() {
        return this.error;
    }

    public final String getToken() {
        return this.token;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/ExternalPurchaseCustomLinkTokenResultIOS$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/ExternalPurchaseCustomLinkTokenResultIOS;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ExternalPurchaseCustomLinkTokenResultIOS fromJson(Map<String, ? extends Object> json) {
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            String str = obj instanceof String ? (String) obj : null;
            Object obj2 = json.get("token");
            return new ExternalPurchaseCustomLinkTokenResultIOS(str, obj2 instanceof String ? (String) obj2 : null);
        }
    }

    public final Map<String, Object> toJson() {
        return MapsKt.mapOf(TuplesKt.to("__typename", "ExternalPurchaseCustomLinkTokenResultIOS"), TuplesKt.to(Constants.IPC_BUNDLE_KEY_SEND_ERROR, this.error), TuplesKt.to("token", this.token));
    }
}
