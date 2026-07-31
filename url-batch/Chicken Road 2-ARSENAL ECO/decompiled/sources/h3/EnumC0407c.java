package h3;

import a.AbstractC0219a;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import r5.InterfaceC0620a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: h3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0407c {
    private static final /* synthetic */ InterfaceC0620a $ENTRIES;
    private static final /* synthetic */ EnumC0407c[] $VALUES;
    public static final a Companion;
    public static final EnumC0407c IAM = new EnumC0407c("IAM", 0, "iam");
    public static final EnumC0407c NOTIFICATION = new EnumC0407c("NOTIFICATION", 1, "notification");
    private final String nameValue;

    /* renamed from: h3.c$a */
    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public final EnumC0407c fromString(String str) {
            EnumC0407c enumC0407c;
            if (str != null) {
                EnumC0407c[] values = EnumC0407c.values();
                int length = values.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i7 = length - 1;
                        enumC0407c = values[length];
                        if (enumC0407c.equalsName(str)) {
                            break;
                        }
                        if (i7 < 0) {
                            break;
                        }
                        length = i7;
                    }
                }
                enumC0407c = null;
                if (enumC0407c != null) {
                    return enumC0407c;
                }
            }
            return EnumC0407c.NOTIFICATION;
        }

        private a() {
        }
    }

    private static final /* synthetic */ EnumC0407c[] $values() {
        return new EnumC0407c[]{IAM, NOTIFICATION};
    }

    static {
        EnumC0407c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC0219a.n($values);
        Companion = new a(null);
    }

    private EnumC0407c(String str, int i7, String str2) {
        this.nameValue = str2;
    }

    public static final EnumC0407c fromString(String str) {
        return Companion.fromString(str);
    }

    public static InterfaceC0620a getEntries() {
        return $ENTRIES;
    }

    public static EnumC0407c valueOf(String str) {
        return (EnumC0407c) Enum.valueOf(EnumC0407c.class, str);
    }

    public static EnumC0407c[] values() {
        return (EnumC0407c[]) $VALUES.clone();
    }

    public final boolean equalsName(String otherName) {
        i.e(otherName, "otherName");
        return i.a(this.nameValue, otherName);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.nameValue;
    }
}
