package dev.hyo.openiap;

import com.google.firebase.messaging.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Ldev/hyo/openiap/ExternalPurchaseCustomLinkNoticeResultIOS;", "", "continued", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "<init>", "(ZLjava/lang/String;)V", "getContinued", "()Z", "getError", "()Ljava/lang/String;", "toJson", "", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ExternalPurchaseCustomLinkNoticeResultIOS {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean continued;
    private final String error;

    public static /* synthetic */ ExternalPurchaseCustomLinkNoticeResultIOS copy$default(ExternalPurchaseCustomLinkNoticeResultIOS externalPurchaseCustomLinkNoticeResultIOS, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = externalPurchaseCustomLinkNoticeResultIOS.continued;
        }
        if ((i & 2) != 0) {
            str = externalPurchaseCustomLinkNoticeResultIOS.error;
        }
        return externalPurchaseCustomLinkNoticeResultIOS.copy(z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getContinued() {
        return this.continued;
    }

    /* renamed from: component2, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final ExternalPurchaseCustomLinkNoticeResultIOS copy(boolean continued, String error) {
        return new ExternalPurchaseCustomLinkNoticeResultIOS(continued, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalPurchaseCustomLinkNoticeResultIOS)) {
            return false;
        }
        ExternalPurchaseCustomLinkNoticeResultIOS externalPurchaseCustomLinkNoticeResultIOS = (ExternalPurchaseCustomLinkNoticeResultIOS) other;
        return this.continued == externalPurchaseCustomLinkNoticeResultIOS.continued && Intrinsics.areEqual(this.error, externalPurchaseCustomLinkNoticeResultIOS.error);
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.continued) * 31;
        String str = this.error;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ExternalPurchaseCustomLinkNoticeResultIOS(continued=" + this.continued + ", error=" + this.error + ")";
    }

    public ExternalPurchaseCustomLinkNoticeResultIOS(boolean z, String str) {
        this.continued = z;
        this.error = str;
    }

    public /* synthetic */ ExternalPurchaseCustomLinkNoticeResultIOS(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : str);
    }

    public final boolean getContinued() {
        return this.continued;
    }

    public final String getError() {
        return this.error;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/ExternalPurchaseCustomLinkNoticeResultIOS$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/ExternalPurchaseCustomLinkNoticeResultIOS;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ExternalPurchaseCustomLinkNoticeResultIOS fromJson(Map<String, ? extends Object> json) {
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("continued");
            Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            Object obj2 = json.get(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            return new ExternalPurchaseCustomLinkNoticeResultIOS(booleanValue, obj2 instanceof String ? (String) obj2 : null);
        }
    }

    public final Map<String, Object> toJson() {
        return MapsKt.mapOf(TuplesKt.to("__typename", "ExternalPurchaseCustomLinkNoticeResultIOS"), TuplesKt.to("continued", Boolean.valueOf(this.continued)), TuplesKt.to(Constants.IPC_BUNDLE_KEY_SEND_ERROR, this.error));
    }
}
