package io.flutter.plugins.inapppurchase;

import E.AbstractC0005f;
import d3.j;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class PlatformAlternativeBillingOnlyReportingDetailsResponse {
    public static final Companion Companion = new Companion(null);
    private final PlatformBillingResult billingResult;
    private final String externalTransactionToken;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final PlatformAlternativeBillingOnlyReportingDetailsResponse fromList(List<? extends Object> list) {
            PlatformBillingResult platformBillingResult = (PlatformBillingResult) AbstractC0005f.h(list, "pigeonVar_list", 0, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingResult");
            Object obj = list.get(1);
            i.c(obj, "null cannot be cast to non-null type kotlin.String");
            return new PlatformAlternativeBillingOnlyReportingDetailsResponse(platformBillingResult, (String) obj);
        }

        private Companion() {
        }
    }

    public PlatformAlternativeBillingOnlyReportingDetailsResponse(PlatformBillingResult billingResult, String externalTransactionToken) {
        i.e(billingResult, "billingResult");
        i.e(externalTransactionToken, "externalTransactionToken");
        this.billingResult = billingResult;
        this.externalTransactionToken = externalTransactionToken;
    }

    public static /* synthetic */ PlatformAlternativeBillingOnlyReportingDetailsResponse copy$default(PlatformAlternativeBillingOnlyReportingDetailsResponse platformAlternativeBillingOnlyReportingDetailsResponse, PlatformBillingResult platformBillingResult, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            platformBillingResult = platformAlternativeBillingOnlyReportingDetailsResponse.billingResult;
        }
        if ((i4 & 2) != 0) {
            str = platformAlternativeBillingOnlyReportingDetailsResponse.externalTransactionToken;
        }
        return platformAlternativeBillingOnlyReportingDetailsResponse.copy(platformBillingResult, str);
    }

    public final PlatformBillingResult component1() {
        return this.billingResult;
    }

    public final String component2() {
        return this.externalTransactionToken;
    }

    public final PlatformAlternativeBillingOnlyReportingDetailsResponse copy(PlatformBillingResult billingResult, String externalTransactionToken) {
        i.e(billingResult, "billingResult");
        i.e(externalTransactionToken, "externalTransactionToken");
        return new PlatformAlternativeBillingOnlyReportingDetailsResponse(billingResult, externalTransactionToken);
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass().equals(PlatformAlternativeBillingOnlyReportingDetailsResponse.class)) {
            if (this == obj) {
                return true;
            }
            PlatformAlternativeBillingOnlyReportingDetailsResponse platformAlternativeBillingOnlyReportingDetailsResponse = (PlatformAlternativeBillingOnlyReportingDetailsResponse) obj;
            MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
            if (messagesPigeonUtils.deepEquals(this.billingResult, platformAlternativeBillingOnlyReportingDetailsResponse.billingResult) && messagesPigeonUtils.deepEquals(this.externalTransactionToken, platformAlternativeBillingOnlyReportingDetailsResponse.externalTransactionToken)) {
                return true;
            }
        }
        return false;
    }

    public final PlatformBillingResult getBillingResult() {
        return this.billingResult;
    }

    public final String getExternalTransactionToken() {
        return this.externalTransactionToken;
    }

    public int hashCode() {
        int hashCode = PlatformAlternativeBillingOnlyReportingDetailsResponse.class.hashCode() * 31;
        MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
        return ((hashCode + messagesPigeonUtils.deepHash(this.billingResult)) * 31) + messagesPigeonUtils.deepHash(this.externalTransactionToken);
    }

    public final List<Object> toList() {
        return j.W(this.billingResult, this.externalTransactionToken);
    }

    public String toString() {
        return "PlatformAlternativeBillingOnlyReportingDetailsResponse(billingResult=" + this.billingResult + ", externalTransactionToken=" + this.externalTransactionToken + ")";
    }
}
