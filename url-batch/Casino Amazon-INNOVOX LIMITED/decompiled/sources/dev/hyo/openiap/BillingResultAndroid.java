package dev.hyo.openiap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Ldev/hyo/openiap/BillingResultAndroid;", "", "debugMessage", "", "responseCode", "", "subResponseCode", "Ldev/hyo/openiap/SubResponseCodeAndroid;", "<init>", "(Ljava/lang/String;ILdev/hyo/openiap/SubResponseCodeAndroid;)V", "getDebugMessage", "()Ljava/lang/String;", "getResponseCode", "()I", "getSubResponseCode", "()Ldev/hyo/openiap/SubResponseCodeAndroid;", "toJson", "", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BillingResultAndroid {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String debugMessage;
    private final int responseCode;
    private final SubResponseCodeAndroid subResponseCode;

    public static /* synthetic */ BillingResultAndroid copy$default(BillingResultAndroid billingResultAndroid, String str, int i, SubResponseCodeAndroid subResponseCodeAndroid, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = billingResultAndroid.debugMessage;
        }
        if ((i2 & 2) != 0) {
            i = billingResultAndroid.responseCode;
        }
        if ((i2 & 4) != 0) {
            subResponseCodeAndroid = billingResultAndroid.subResponseCode;
        }
        return billingResultAndroid.copy(str, i, subResponseCodeAndroid);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDebugMessage() {
        return this.debugMessage;
    }

    /* renamed from: component2, reason: from getter */
    public final int getResponseCode() {
        return this.responseCode;
    }

    /* renamed from: component3, reason: from getter */
    public final SubResponseCodeAndroid getSubResponseCode() {
        return this.subResponseCode;
    }

    public final BillingResultAndroid copy(String debugMessage, int responseCode, SubResponseCodeAndroid subResponseCode) {
        return new BillingResultAndroid(debugMessage, responseCode, subResponseCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BillingResultAndroid)) {
            return false;
        }
        BillingResultAndroid billingResultAndroid = (BillingResultAndroid) other;
        return Intrinsics.areEqual(this.debugMessage, billingResultAndroid.debugMessage) && this.responseCode == billingResultAndroid.responseCode && this.subResponseCode == billingResultAndroid.subResponseCode;
    }

    public int hashCode() {
        String str = this.debugMessage;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.responseCode)) * 31;
        SubResponseCodeAndroid subResponseCodeAndroid = this.subResponseCode;
        return hashCode + (subResponseCodeAndroid != null ? subResponseCodeAndroid.hashCode() : 0);
    }

    public String toString() {
        return "BillingResultAndroid(debugMessage=" + this.debugMessage + ", responseCode=" + this.responseCode + ", subResponseCode=" + this.subResponseCode + ")";
    }

    public BillingResultAndroid(String str, int i, SubResponseCodeAndroid subResponseCodeAndroid) {
        this.debugMessage = str;
        this.responseCode = i;
        this.subResponseCode = subResponseCodeAndroid;
    }

    public /* synthetic */ BillingResultAndroid(String str, int i, SubResponseCodeAndroid subResponseCodeAndroid, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, i, (i2 & 4) != 0 ? null : subResponseCodeAndroid);
    }

    public final String getDebugMessage() {
        return this.debugMessage;
    }

    public final int getResponseCode() {
        return this.responseCode;
    }

    public final SubResponseCodeAndroid getSubResponseCode() {
        return this.subResponseCode;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/BillingResultAndroid$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/BillingResultAndroid;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BillingResultAndroid fromJson(Map<String, ? extends Object> json) {
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("debugMessage");
            String str = obj instanceof String ? (String) obj : null;
            Object obj2 = json.get("responseCode");
            Number number = obj2 instanceof Number ? (Number) obj2 : null;
            int intValue = number != null ? number.intValue() : 0;
            Object obj3 = json.get("subResponseCode");
            String str2 = obj3 instanceof String ? (String) obj3 : null;
            return new BillingResultAndroid(str, intValue, str2 != null ? SubResponseCodeAndroid.INSTANCE.fromJson(str2) : null);
        }
    }

    public final Map<String, Object> toJson() {
        Pair[] pairArr = new Pair[4];
        pairArr[0] = TuplesKt.to("__typename", "BillingResultAndroid");
        pairArr[1] = TuplesKt.to("debugMessage", this.debugMessage);
        pairArr[2] = TuplesKt.to("responseCode", Integer.valueOf(this.responseCode));
        SubResponseCodeAndroid subResponseCodeAndroid = this.subResponseCode;
        pairArr[3] = TuplesKt.to("subResponseCode", subResponseCodeAndroid != null ? subResponseCodeAndroid.toJson() : null);
        return MapsKt.mapOf(pairArr);
    }
}
