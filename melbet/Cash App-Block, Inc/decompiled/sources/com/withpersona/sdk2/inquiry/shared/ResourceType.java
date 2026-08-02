package com.withpersona.sdk2.inquiry.shared;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class ResourceType {
    public static final /* synthetic */ ResourceType[] $VALUES;
    public static final ResourceType Drawable;
    public static final ResourceType Font;
    public static final ResourceType Raw;

    static {
        ResourceType resourceType = new ResourceType("Font", 0);
        Font = resourceType;
        ResourceType resourceType2 = new ResourceType("Drawable", 1);
        Drawable = resourceType2;
        ResourceType resourceType3 = new ResourceType("Raw", 2);
        Raw = resourceType3;
        $VALUES = new ResourceType[]{resourceType, resourceType2, resourceType3};
    }

    public static ResourceType valueOf(String str) {
        return (ResourceType) Enum.valueOf(ResourceType.class, str);
    }

    public static ResourceType[] values() {
        return (ResourceType[]) $VALUES.clone();
    }
}
