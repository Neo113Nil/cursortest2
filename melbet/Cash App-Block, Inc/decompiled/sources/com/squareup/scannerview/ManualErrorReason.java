package com.squareup.scannerview;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class ManualErrorReason {
    public static final /* synthetic */ ManualErrorReason[] $VALUES;
    public static final ManualErrorReason NO_FACE_DETECTED;

    static {
        ManualErrorReason manualErrorReason = new ManualErrorReason("NO_FACE_DETECTED", 0);
        NO_FACE_DETECTED = manualErrorReason;
        $VALUES = new ManualErrorReason[]{manualErrorReason};
    }

    public static ManualErrorReason valueOf(String str) {
        return (ManualErrorReason) Enum.valueOf(ManualErrorReason.class, str);
    }

    public static ManualErrorReason[] values() {
        return (ManualErrorReason[]) $VALUES.clone();
    }
}
