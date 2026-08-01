package expo.modules.updates;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UpdatesConfiguration.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/updates/UpdatesConfigurationValidationResult;", "", "<init>", "(Ljava/lang/String;I)V", "VALID", "INVALID_NOT_ENABLED", "INVALID_MISSING_URL", "INVALID_MISSING_RUNTIME_VERSION", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UpdatesConfigurationValidationResult {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UpdatesConfigurationValidationResult[] $VALUES;
    public static final UpdatesConfigurationValidationResult VALID = new UpdatesConfigurationValidationResult("VALID", 0);
    public static final UpdatesConfigurationValidationResult INVALID_NOT_ENABLED = new UpdatesConfigurationValidationResult("INVALID_NOT_ENABLED", 1);
    public static final UpdatesConfigurationValidationResult INVALID_MISSING_URL = new UpdatesConfigurationValidationResult("INVALID_MISSING_URL", 2);
    public static final UpdatesConfigurationValidationResult INVALID_MISSING_RUNTIME_VERSION = new UpdatesConfigurationValidationResult("INVALID_MISSING_RUNTIME_VERSION", 3);

    private static final /* synthetic */ UpdatesConfigurationValidationResult[] $values() {
        return new UpdatesConfigurationValidationResult[]{VALID, INVALID_NOT_ENABLED, INVALID_MISSING_URL, INVALID_MISSING_RUNTIME_VERSION};
    }

    public static EnumEntries<UpdatesConfigurationValidationResult> getEntries() {
        return $ENTRIES;
    }

    private UpdatesConfigurationValidationResult(String str, int i) {
    }

    static {
        UpdatesConfigurationValidationResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static UpdatesConfigurationValidationResult valueOf(String str) {
        return (UpdatesConfigurationValidationResult) Enum.valueOf(UpdatesConfigurationValidationResult.class, str);
    }

    public static UpdatesConfigurationValidationResult[] values() {
        return (UpdatesConfigurationValidationResult[]) $VALUES.clone();
    }
}
