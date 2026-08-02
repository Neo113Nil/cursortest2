package com.withpersona.sdk2.inquiry.permissions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class Feature {
    public static final /* synthetic */ Feature[] $VALUES;
    public static final Feature Camera;
    public static final Feature PreciseLocation;
    public static final Feature RecordAudio;
    public static final Feature RoughLocation;

    static {
        Feature feature = new Feature("Camera", 0);
        Camera = feature;
        Feature feature2 = new Feature("RecordAudio", 1);
        RecordAudio = feature2;
        Feature feature3 = new Feature("RoughLocation", 2);
        RoughLocation = feature3;
        Feature feature4 = new Feature("PreciseLocation", 3);
        PreciseLocation = feature4;
        $VALUES = new Feature[]{feature, feature2, feature3, feature4};
    }

    public static Feature valueOf(String str) {
        return (Feature) Enum.valueOf(Feature.class, str);
    }

    public static Feature[] values() {
        return (Feature[]) $VALUES.clone();
    }
}
