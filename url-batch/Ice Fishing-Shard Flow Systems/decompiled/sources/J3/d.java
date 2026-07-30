package J3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {
    private static final /* synthetic */ Y5.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final a Companion;
    public static final d DIRECT = new d("DIRECT", 0);
    public static final d INDIRECT = new d("INDIRECT", 1);
    public static final d UNATTRIBUTED = new d("UNATTRIBUTED", 2);
    public static final d DISABLED = new d("DISABLED", 3);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d fromString(String str) {
            d dVar;
            if (str != null) {
                d[] values = d.values();
                int length = values.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i2 = length - 1;
                        dVar = values[length];
                        if (p.g(dVar.name(), str)) {
                            break;
                        }
                        if (i2 < 0) {
                            break;
                        }
                        length = i2;
                    }
                }
                dVar = null;
                if (dVar != null) {
                    return dVar;
                }
            }
            return d.UNATTRIBUTED;
        }

        private a() {
        }
    }

    private static final /* synthetic */ d[] $values() {
        return new d[]{DIRECT, INDIRECT, UNATTRIBUTED, DISABLED};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = d4.c.o($values);
        Companion = new a(null);
    }

    private d(String str, int i2) {
    }

    public static final d fromString(String str) {
        return Companion.fromString(str);
    }

    public static Y5.a getEntries() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final boolean isAttributed() {
        return isDirect() || isIndirect();
    }

    public final boolean isDirect() {
        return this == DIRECT;
    }

    public final boolean isDisabled() {
        return this == DISABLED;
    }

    public final boolean isIndirect() {
        return this == INDIRECT;
    }

    public final boolean isUnattributed() {
        return this == UNATTRIBUTED;
    }
}
