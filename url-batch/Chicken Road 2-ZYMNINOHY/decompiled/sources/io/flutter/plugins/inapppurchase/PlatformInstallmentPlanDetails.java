package io.flutter.plugins.inapppurchase;

import E.AbstractC0005f;
import d3.j;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class PlatformInstallmentPlanDetails {
    public static final Companion Companion = new Companion(null);
    private final long commitmentPaymentsCount;
    private final long subsequentCommitmentPaymentsCount;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final PlatformInstallmentPlanDetails fromList(List<? extends Object> list) {
            long longValue = ((Long) AbstractC0005f.h(list, "pigeonVar_list", 0, "null cannot be cast to non-null type kotlin.Long")).longValue();
            Object obj = list.get(1);
            i.c(obj, "null cannot be cast to non-null type kotlin.Long");
            return new PlatformInstallmentPlanDetails(longValue, ((Long) obj).longValue());
        }

        private Companion() {
        }
    }

    public PlatformInstallmentPlanDetails(long j4, long j5) {
        this.commitmentPaymentsCount = j4;
        this.subsequentCommitmentPaymentsCount = j5;
    }

    public static /* synthetic */ PlatformInstallmentPlanDetails copy$default(PlatformInstallmentPlanDetails platformInstallmentPlanDetails, long j4, long j5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = platformInstallmentPlanDetails.commitmentPaymentsCount;
        }
        if ((i4 & 2) != 0) {
            j5 = platformInstallmentPlanDetails.subsequentCommitmentPaymentsCount;
        }
        return platformInstallmentPlanDetails.copy(j4, j5);
    }

    public final long component1() {
        return this.commitmentPaymentsCount;
    }

    public final long component2() {
        return this.subsequentCommitmentPaymentsCount;
    }

    public final PlatformInstallmentPlanDetails copy(long j4, long j5) {
        return new PlatformInstallmentPlanDetails(j4, j5);
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass().equals(PlatformInstallmentPlanDetails.class)) {
            if (this == obj) {
                return true;
            }
            PlatformInstallmentPlanDetails platformInstallmentPlanDetails = (PlatformInstallmentPlanDetails) obj;
            MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
            if (messagesPigeonUtils.deepEquals(Long.valueOf(this.commitmentPaymentsCount), Long.valueOf(platformInstallmentPlanDetails.commitmentPaymentsCount)) && messagesPigeonUtils.deepEquals(Long.valueOf(this.subsequentCommitmentPaymentsCount), Long.valueOf(platformInstallmentPlanDetails.subsequentCommitmentPaymentsCount))) {
                return true;
            }
        }
        return false;
    }

    public final long getCommitmentPaymentsCount() {
        return this.commitmentPaymentsCount;
    }

    public final long getSubsequentCommitmentPaymentsCount() {
        return this.subsequentCommitmentPaymentsCount;
    }

    public int hashCode() {
        int hashCode = PlatformInstallmentPlanDetails.class.hashCode() * 31;
        MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
        return ((hashCode + messagesPigeonUtils.deepHash(Long.valueOf(this.commitmentPaymentsCount))) * 31) + messagesPigeonUtils.deepHash(Long.valueOf(this.subsequentCommitmentPaymentsCount));
    }

    public final List<Object> toList() {
        return j.W(Long.valueOf(this.commitmentPaymentsCount), Long.valueOf(this.subsequentCommitmentPaymentsCount));
    }

    public String toString() {
        long j4 = this.commitmentPaymentsCount;
        long j5 = this.subsequentCommitmentPaymentsCount;
        StringBuilder sb = new StringBuilder("PlatformInstallmentPlanDetails(commitmentPaymentsCount=");
        sb.append(j4);
        sb.append(", subsequentCommitmentPaymentsCount=");
        return AbstractC0005f.p(sb, j5, ")");
    }
}
