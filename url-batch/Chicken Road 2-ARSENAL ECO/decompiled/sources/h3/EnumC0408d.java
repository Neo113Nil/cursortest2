package h3;

import F5.q;
import a.AbstractC0219a;
import kotlin.jvm.internal.e;
import r5.InterfaceC0620a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: h3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0408d {
    private static final /* synthetic */ InterfaceC0620a $ENTRIES;
    private static final /* synthetic */ EnumC0408d[] $VALUES;
    public static final a Companion;
    public static final EnumC0408d DIRECT = new EnumC0408d("DIRECT", 0);
    public static final EnumC0408d INDIRECT = new EnumC0408d("INDIRECT", 1);
    public static final EnumC0408d UNATTRIBUTED = new EnumC0408d("UNATTRIBUTED", 2);
    public static final EnumC0408d DISABLED = new EnumC0408d("DISABLED", 3);

    /* renamed from: h3.d$a */
    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public final EnumC0408d fromString(String str) {
            EnumC0408d enumC0408d;
            if (str != null) {
                EnumC0408d[] values = EnumC0408d.values();
                int length = values.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i7 = length - 1;
                        enumC0408d = values[length];
                        if (q.C(enumC0408d.name(), str)) {
                            break;
                        }
                        if (i7 < 0) {
                            break;
                        }
                        length = i7;
                    }
                }
                enumC0408d = null;
                if (enumC0408d != null) {
                    return enumC0408d;
                }
            }
            return EnumC0408d.UNATTRIBUTED;
        }

        private a() {
        }
    }

    private static final /* synthetic */ EnumC0408d[] $values() {
        return new EnumC0408d[]{DIRECT, INDIRECT, UNATTRIBUTED, DISABLED};
    }

    static {
        EnumC0408d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC0219a.n($values);
        Companion = new a(null);
    }

    private EnumC0408d(String str, int i7) {
    }

    public static final EnumC0408d fromString(String str) {
        return Companion.fromString(str);
    }

    public static InterfaceC0620a getEntries() {
        return $ENTRIES;
    }

    public static EnumC0408d valueOf(String str) {
        return (EnumC0408d) Enum.valueOf(EnumC0408d.class, str);
    }

    public static EnumC0408d[] values() {
        return (EnumC0408d[]) $VALUES.clone();
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
