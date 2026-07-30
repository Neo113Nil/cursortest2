package J3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ Y5.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final a Companion;
    public static final c IAM = new c("IAM", 0, "iam");
    public static final c NOTIFICATION = new c("NOTIFICATION", 1, "notification");
    private final String nameValue;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c fromString(String str) {
            c cVar;
            if (str != null) {
                c[] values = c.values();
                int length = values.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i2 = length - 1;
                        cVar = values[length];
                        if (cVar.equalsName(str)) {
                            break;
                        }
                        if (i2 < 0) {
                            break;
                        }
                        length = i2;
                    }
                }
                cVar = null;
                if (cVar != null) {
                    return cVar;
                }
            }
            return c.NOTIFICATION;
        }

        private a() {
        }
    }

    private static final /* synthetic */ c[] $values() {
        return new c[]{IAM, NOTIFICATION};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = d4.c.o($values);
        Companion = new a(null);
    }

    private c(String str, int i2, String str2) {
        this.nameValue = str2;
    }

    public static final c fromString(String str) {
        return Companion.fromString(str);
    }

    public static Y5.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final boolean equalsName(String otherName) {
        Intrinsics.checkNotNullParameter(otherName, "otherName");
        return Intrinsics.a(this.nameValue, otherName);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.nameValue;
    }
}
