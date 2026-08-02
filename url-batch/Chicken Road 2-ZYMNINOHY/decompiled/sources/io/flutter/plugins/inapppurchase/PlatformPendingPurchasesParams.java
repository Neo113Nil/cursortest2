package io.flutter.plugins.inapppurchase;

import E.AbstractC0005f;
import a.AbstractC0124a;
import java.util.List;

/* loaded from: classes.dex */
public final class PlatformPendingPurchasesParams {
    public static final Companion Companion = new Companion(null);
    private final boolean enablePrepaidPlans;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final PlatformPendingPurchasesParams fromList(List<? extends Object> list) {
            return new PlatformPendingPurchasesParams(((Boolean) AbstractC0005f.h(list, "pigeonVar_list", 0, "null cannot be cast to non-null type kotlin.Boolean")).booleanValue());
        }

        private Companion() {
        }
    }

    public PlatformPendingPurchasesParams(boolean z) {
        this.enablePrepaidPlans = z;
    }

    public static /* synthetic */ PlatformPendingPurchasesParams copy$default(PlatformPendingPurchasesParams platformPendingPurchasesParams, boolean z, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = platformPendingPurchasesParams.enablePrepaidPlans;
        }
        return platformPendingPurchasesParams.copy(z);
    }

    public final boolean component1() {
        return this.enablePrepaidPlans;
    }

    public final PlatformPendingPurchasesParams copy(boolean z) {
        return new PlatformPendingPurchasesParams(z);
    }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(PlatformPendingPurchasesParams.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return MessagesPigeonUtils.INSTANCE.deepEquals(Boolean.valueOf(this.enablePrepaidPlans), Boolean.valueOf(((PlatformPendingPurchasesParams) obj).enablePrepaidPlans));
    }

    public final boolean getEnablePrepaidPlans() {
        return this.enablePrepaidPlans;
    }

    public int hashCode() {
        return (PlatformPendingPurchasesParams.class.hashCode() * 31) + MessagesPigeonUtils.INSTANCE.deepHash(Boolean.valueOf(this.enablePrepaidPlans));
    }

    public final List<Object> toList() {
        return AbstractC0124a.H(Boolean.valueOf(this.enablePrepaidPlans));
    }

    public String toString() {
        return "PlatformPendingPurchasesParams(enablePrepaidPlans=" + this.enablePrepaidPlans + ")";
    }
}
