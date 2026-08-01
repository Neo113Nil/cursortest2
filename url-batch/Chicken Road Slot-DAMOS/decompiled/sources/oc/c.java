package oc;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ od.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final a Companion;
    public static final c IAM = new c("IAM", 0, "iam");
    public static final c NOTIFICATION = new c("NOTIFICATION", 1, "notification");
    private final String nameValue;

    private static final /* synthetic */ c[] $values() {
        return new c[]{IAM, NOTIFICATION};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = i7.a.J($values);
        Companion = new a(null);
    }

    private c(String str, int i3, String str2) {
        this.nameValue = str2;
    }

    public static final c fromString(String str) {
        return Companion.fromString(str);
    }

    public static od.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final boolean equalsName(String str) {
        str.getClass();
        return Intrinsics.a(this.nameValue, str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.nameValue;
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
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
                        int i3 = length - 1;
                        cVar = values[length];
                        if (cVar.equalsName(str)) {
                            break;
                        }
                        if (i3 < 0) {
                            break;
                        }
                        length = i3;
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
}
