package com.onesignal.core.internal.features;

import com.onesignal.core.BuildConfig;
import java.util.Set;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FeatureFlag.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/onesignal/core/internal/features/FeatureFlag;", "", "key", "", "activationMode", "Lcom/onesignal/core/internal/features/FeatureActivationMode;", "(Ljava/lang/String;ILjava/lang/String;Lcom/onesignal/core/internal/features/FeatureActivationMode;)V", "getActivationMode", "()Lcom/onesignal/core/internal/features/FeatureActivationMode;", "getKey", "()Ljava/lang/String;", "isEnabledIn", "", "enabledKeys", "", "SDK_IDENTITY_VERIFICATION", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FeatureFlag {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FeatureFlag[] $VALUES;
    public static final FeatureFlag SDK_IDENTITY_VERIFICATION = new FeatureFlag("SDK_IDENTITY_VERIFICATION", 0, "sdk_identity_verification", FeatureActivationMode.IMMEDIATE);
    private final FeatureActivationMode activationMode;
    private final String key;

    private static final /* synthetic */ FeatureFlag[] $values() {
        return new FeatureFlag[]{SDK_IDENTITY_VERIFICATION};
    }

    public static EnumEntries<FeatureFlag> getEntries() {
        return $ENTRIES;
    }

    public static FeatureFlag valueOf(String str) {
        return (FeatureFlag) Enum.valueOf(FeatureFlag.class, str);
    }

    public static FeatureFlag[] values() {
        return (FeatureFlag[]) $VALUES.clone();
    }

    private FeatureFlag(String str, int i, String str2, FeatureActivationMode featureActivationMode) {
        this.key = str2;
        this.activationMode = featureActivationMode;
    }

    public final String getKey() {
        return this.key;
    }

    public final FeatureActivationMode getActivationMode() {
        return this.activationMode;
    }

    static {
        FeatureFlag[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public final boolean isEnabledIn(Set<String> enabledKeys) {
        Intrinsics.checkNotNullParameter(enabledKeys, "enabledKeys");
        return enabledKeys.contains(this.key);
    }
}
