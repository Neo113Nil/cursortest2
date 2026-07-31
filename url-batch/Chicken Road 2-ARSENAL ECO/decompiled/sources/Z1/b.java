package Z1;

import a.AbstractC0219a;
import java.util.Set;
import kotlin.jvm.internal.i;
import r5.InterfaceC0620a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ InterfaceC0620a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b SDK_IDENTITY_VERIFICATION = new b("SDK_IDENTITY_VERIFICATION", 0, "sdk_identity_verification", a.IMMEDIATE);
    private final a activationMode;
    private final String key;

    private static final /* synthetic */ b[] $values() {
        return new b[]{SDK_IDENTITY_VERIFICATION};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC0219a.n($values);
    }

    private b(String str, int i7, String str2, a aVar) {
        this.key = str2;
        this.activationMode = aVar;
    }

    public static InterfaceC0620a getEntries() {
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
        i.e(enabledKeys, "enabledKeys");
        return enabledKeys.contains(this.key);
    }
}
