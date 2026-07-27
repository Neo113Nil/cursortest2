package com.onesignal.core.internal.features;

import n4.InterfaceC1344a;
import u1.AbstractC1477a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class FeatureActivationMode {
    private static final /* synthetic */ InterfaceC1344a $ENTRIES;
    private static final /* synthetic */ FeatureActivationMode[] $VALUES;
    public static final FeatureActivationMode IMMEDIATE = new FeatureActivationMode("IMMEDIATE", 0);
    public static final FeatureActivationMode APP_STARTUP = new FeatureActivationMode("APP_STARTUP", 1);

    private static final /* synthetic */ FeatureActivationMode[] $values() {
        return new FeatureActivationMode[]{IMMEDIATE, APP_STARTUP};
    }

    static {
        FeatureActivationMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC1477a.n($values);
    }

    private FeatureActivationMode(String str, int i2) {
    }

    public static InterfaceC1344a getEntries() {
        return $ENTRIES;
    }

    public static FeatureActivationMode valueOf(String str) {
        return (FeatureActivationMode) Enum.valueOf(FeatureActivationMode.class, str);
    }

    public static FeatureActivationMode[] values() {
        return (FeatureActivationMode[]) $VALUES.clone();
    }
}
