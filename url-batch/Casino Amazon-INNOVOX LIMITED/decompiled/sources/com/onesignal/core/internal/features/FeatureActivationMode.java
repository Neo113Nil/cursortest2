package com.onesignal.core.internal.features;

import com.onesignal.core.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FeatureFlag.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/onesignal/core/internal/features/FeatureActivationMode;", "", "(Ljava/lang/String;I)V", "IMMEDIATE", "APP_STARTUP", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FeatureActivationMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FeatureActivationMode[] $VALUES;
    public static final FeatureActivationMode IMMEDIATE = new FeatureActivationMode("IMMEDIATE", 0);
    public static final FeatureActivationMode APP_STARTUP = new FeatureActivationMode("APP_STARTUP", 1);

    private static final /* synthetic */ FeatureActivationMode[] $values() {
        return new FeatureActivationMode[]{IMMEDIATE, APP_STARTUP};
    }

    public static EnumEntries<FeatureActivationMode> getEntries() {
        return $ENTRIES;
    }

    public static FeatureActivationMode valueOf(String str) {
        return (FeatureActivationMode) Enum.valueOf(FeatureActivationMode.class, str);
    }

    public static FeatureActivationMode[] values() {
        return (FeatureActivationMode[]) $VALUES.clone();
    }

    private FeatureActivationMode(String str, int i) {
    }

    static {
        FeatureActivationMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
