package io.flutter.plugins.inapppurchase;

import E.AbstractC0005f;
import d3.j;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class PlatformBillingConfigResponse {
    public static final Companion Companion = new Companion(null);
    private final PlatformBillingResult billingResult;
    private final String countryCode;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final PlatformBillingConfigResponse fromList(List<? extends Object> list) {
            PlatformBillingResult platformBillingResult = (PlatformBillingResult) AbstractC0005f.h(list, "pigeonVar_list", 0, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingResult");
            Object obj = list.get(1);
            i.c(obj, "null cannot be cast to non-null type kotlin.String");
            return new PlatformBillingConfigResponse(platformBillingResult, (String) obj);
        }

        private Companion() {
        }
    }

    public PlatformBillingConfigResponse(PlatformBillingResult billingResult, String countryCode) {
        i.e(billingResult, "billingResult");
        i.e(countryCode, "countryCode");
        this.billingResult = billingResult;
        this.countryCode = countryCode;
    }

    public static /* synthetic */ PlatformBillingConfigResponse copy$default(PlatformBillingConfigResponse platformBillingConfigResponse, PlatformBillingResult platformBillingResult, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            platformBillingResult = platformBillingConfigResponse.billingResult;
        }
        if ((i4 & 2) != 0) {
            str = platformBillingConfigResponse.countryCode;
        }
        return platformBillingConfigResponse.copy(platformBillingResult, str);
    }

    public final PlatformBillingResult component1() {
        return this.billingResult;
    }

    public final String component2() {
        return this.countryCode;
    }

    public final PlatformBillingConfigResponse copy(PlatformBillingResult billingResult, String countryCode) {
        i.e(billingResult, "billingResult");
        i.e(countryCode, "countryCode");
        return new PlatformBillingConfigResponse(billingResult, countryCode);
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass().equals(PlatformBillingConfigResponse.class)) {
            if (this == obj) {
                return true;
            }
            PlatformBillingConfigResponse platformBillingConfigResponse = (PlatformBillingConfigResponse) obj;
            MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
            if (messagesPigeonUtils.deepEquals(this.billingResult, platformBillingConfigResponse.billingResult) && messagesPigeonUtils.deepEquals(this.countryCode, platformBillingConfigResponse.countryCode)) {
                return true;
            }
        }
        return false;
    }

    public final PlatformBillingResult getBillingResult() {
        return this.billingResult;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public int hashCode() {
        int hashCode = PlatformBillingConfigResponse.class.hashCode() * 31;
        MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
        return ((hashCode + messagesPigeonUtils.deepHash(this.billingResult)) * 31) + messagesPigeonUtils.deepHash(this.countryCode);
    }

    public final List<Object> toList() {
        return j.W(this.billingResult, this.countryCode);
    }

    public String toString() {
        return "PlatformBillingConfigResponse(billingResult=" + this.billingResult + ", countryCode=" + this.countryCode + ")";
    }
}
