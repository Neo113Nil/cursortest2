package N2;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {
    private static final /* synthetic */ Y5.a $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final a Companion;
    private final String text;
    public static final k IN_APP_WEBVIEW = new k("IN_APP_WEBVIEW", 0, "webview");
    public static final k BROWSER = new k("BROWSER", 1, "browser");
    public static final k REPLACE_CONTENT = new k("REPLACE_CONTENT", 2, "replacement");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k fromString(String str) {
            for (k kVar : k.values()) {
                if (p.g(kVar.text, str)) {
                    return kVar;
                }
            }
            return null;
        }

        private a() {
        }
    }

    private static final /* synthetic */ k[] $values() {
        return new k[]{IN_APP_WEBVIEW, BROWSER, REPLACE_CONTENT};
    }

    static {
        k[] $values = $values();
        $VALUES = $values;
        $ENTRIES = d4.c.o($values);
        Companion = new a(null);
    }

    private k(String str, int i2, String str2) {
        this.text = str2;
    }

    public static Y5.a getEntries() {
        return $ENTRIES;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.text;
    }
}
