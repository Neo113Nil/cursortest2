package com.squareup.cash.treehouse.android.configuration;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class EndpointType {
    public static final /* synthetic */ EndpointType[] $VALUES;
    public static final EndpointType FROM_SERVER;
    public static final EndpointType LOCAL_DEVELOPMENT;
    public static final EndpointType QR_CODE;

    static {
        EndpointType endpointType = new EndpointType("FROM_SERVER", 0);
        FROM_SERVER = endpointType;
        EndpointType endpointType2 = new EndpointType("LOCAL_DEVELOPMENT", 1);
        LOCAL_DEVELOPMENT = endpointType2;
        EndpointType endpointType3 = new EndpointType("QR_CODE", 2);
        QR_CODE = endpointType3;
        $VALUES = new EndpointType[]{endpointType, endpointType2, endpointType3};
    }

    public static EndpointType valueOf(String str) {
        return (EndpointType) Enum.valueOf(EndpointType.class, str);
    }

    public static EndpointType[] values() {
        return (EndpointType[]) $VALUES.clone();
    }
}
