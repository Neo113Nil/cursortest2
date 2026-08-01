package oc;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d {
    private static final /* synthetic */ od.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final a Companion;
    public static final d DIRECT = new d("DIRECT", 0);
    public static final d INDIRECT = new d("INDIRECT", 1);
    public static final d UNATTRIBUTED = new d("UNATTRIBUTED", 2);
    public static final d DISABLED = new d("DISABLED", 3);

    private static final /* synthetic */ d[] $values() {
        return new d[]{DIRECT, INDIRECT, UNATTRIBUTED, DISABLED};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = i7.a.J($values);
        Companion = new a(null);
    }

    private d(String str, int i3) {
    }

    public static final d fromString(String str) {
        return Companion.fromString(str);
    }

    public static od.a getEntries() {
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

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
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
                        int i3 = length - 1;
                        dVar = values[length];
                        if (o.f(dVar.name(), str, true)) {
                            break;
                        }
                        if (i3 < 0) {
                            break;
                        }
                        length = i3;
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
}
