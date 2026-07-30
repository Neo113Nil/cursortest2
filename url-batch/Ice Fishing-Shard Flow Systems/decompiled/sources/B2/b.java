package B2;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ Y5.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b SDK_BACKGROUND_THREADING = new b("SDK_BACKGROUND_THREADING", 0, "sdk_background_threading", a.APP_STARTUP);
    public static final b SDK_IDENTITY_VERIFICATION = new b("SDK_IDENTITY_VERIFICATION", 1, "sdk_identity_verification", a.IMMEDIATE);
    private final a activationMode;
    private final String key;

    private static final /* synthetic */ b[] $values() {
        return new b[]{SDK_BACKGROUND_THREADING, SDK_IDENTITY_VERIFICATION};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = d4.c.o($values);
    }

    private b(String str, int i2, String str2, a aVar) {
        this.key = str2;
        this.activationMode = aVar;
    }

    public static Y5.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final a getActivationMode() {
        return this.activationMode;
    }

    public final String getKey() {
        return this.key;
    }

    public final boolean isEnabledIn(Set<String> enabledKeys) {
        Intrinsics.checkNotNullParameter(enabledKeys, "enabledKeys");
        return enabledKeys.contains(this.key);
    }
}
