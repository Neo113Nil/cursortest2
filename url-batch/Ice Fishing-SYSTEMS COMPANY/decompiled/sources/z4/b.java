package z4;

import java.util.Set;
import kotlin.jvm.internal.h;
import y7.InterfaceC5255a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {
    private static final /* synthetic */ InterfaceC5255a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b SDK_BACKGROUND_THREADING = new b("SDK_BACKGROUND_THREADING", 0, "sdk_background_threading", EnumC5278a.APP_STARTUP);
    public static final b SDK_IDENTITY_VERIFICATION = new b("SDK_IDENTITY_VERIFICATION", 1, "sdk_identity_verification", EnumC5278a.IMMEDIATE);
    private final EnumC5278a activationMode;
    private final String key;

    private static final /* synthetic */ b[] $values() {
        return new b[]{SDK_BACKGROUND_THREADING, SDK_IDENTITY_VERIFICATION};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = W2.e.d($values);
    }

    private b(String str, int i, String str2, EnumC5278a enumC5278a) {
        this.key = str2;
        this.activationMode = enumC5278a;
    }

    public static InterfaceC5255a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final EnumC5278a getActivationMode() {
        return this.activationMode;
    }

    public final String getKey() {
        return this.key;
    }

    public final boolean isEnabledIn(Set<String> enabledKeys) {
        h.e(enabledKeys, "enabledKeys");
        return enabledKeys.contains(this.key);
    }
}
