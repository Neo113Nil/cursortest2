package wa;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k {
    private static final /* synthetic */ od.a $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final a Companion;
    private final String text;
    public static final k IN_APP_WEBVIEW = new k("IN_APP_WEBVIEW", 0, "webview");
    public static final k BROWSER = new k("BROWSER", 1, "browser");
    public static final k REPLACE_CONTENT = new k("REPLACE_CONTENT", 2, "replacement");

    private static final /* synthetic */ k[] $values() {
        return new k[]{IN_APP_WEBVIEW, BROWSER, REPLACE_CONTENT};
    }

    static {
        k[] $values = $values();
        $VALUES = $values;
        $ENTRIES = i7.a.J($values);
        Companion = new a(null);
    }

    private k(String str, int i3, String str2) {
        this.text = str2;
    }

    public static od.a getEntries() {
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

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k fromString(String str) {
            for (k kVar : k.values()) {
                if (o.f(kVar.text, str, true)) {
                    return kVar;
                }
            }
            return null;
        }

        private a() {
        }
    }
}
