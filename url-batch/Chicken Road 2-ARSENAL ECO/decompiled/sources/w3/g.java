package w3;

import a.AbstractC0219a;
import r5.InterfaceC0620a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {
    private static final /* synthetic */ InterfaceC0620a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g EMAIL = new g("EMAIL", 0);
    public static final g SMS = new g("SMS", 1);
    public static final g PUSH = new g("PUSH", 2);

    private static final /* synthetic */ g[] $values() {
        return new g[]{EMAIL, SMS, PUSH};
    }

    static {
        g[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC0219a.n($values);
    }

    private g(String str, int i7) {
    }

    public static InterfaceC0620a getEntries() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
