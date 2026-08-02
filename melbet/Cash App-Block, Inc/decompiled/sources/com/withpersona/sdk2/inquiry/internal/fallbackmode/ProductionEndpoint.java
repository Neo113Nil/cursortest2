package com.withpersona.sdk2.inquiry.internal.fallbackmode;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class ProductionEndpoint {
    public static final /* synthetic */ ProductionEndpoint[] $VALUES;
    public static final ProductionEndpoint Transition;
    public static final ProductionEndpoint TransitionBack;

    static {
        ProductionEndpoint productionEndpoint = new ProductionEndpoint("Transition", 0);
        Transition = productionEndpoint;
        ProductionEndpoint productionEndpoint2 = new ProductionEndpoint("TransitionBack", 1);
        TransitionBack = productionEndpoint2;
        $VALUES = new ProductionEndpoint[]{productionEndpoint, productionEndpoint2, new ProductionEndpoint("DocumentFilesPost", 2), new ProductionEndpoint("DocumentFilesDelete", 3)};
    }

    public static ProductionEndpoint valueOf(String str) {
        return (ProductionEndpoint) Enum.valueOf(ProductionEndpoint.class, str);
    }

    public static ProductionEndpoint[] values() {
        return (ProductionEndpoint[]) $VALUES.clone();
    }
}
