package kotlin.reflect;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class KVisibility {
    public static final /* synthetic */ KVisibility[] $VALUES;
    public static final KVisibility INTERNAL;
    public static final KVisibility PRIVATE;
    public static final KVisibility PROTECTED;
    public static final KVisibility PUBLIC;

    static {
        KVisibility kVisibility = new KVisibility("PUBLIC", 0);
        PUBLIC = kVisibility;
        KVisibility kVisibility2 = new KVisibility("PROTECTED", 1);
        PROTECTED = kVisibility2;
        KVisibility kVisibility3 = new KVisibility("INTERNAL", 2);
        INTERNAL = kVisibility3;
        KVisibility kVisibility4 = new KVisibility("PRIVATE", 3);
        PRIVATE = kVisibility4;
        $VALUES = new KVisibility[]{kVisibility, kVisibility2, kVisibility3, kVisibility4};
    }

    public static KVisibility valueOf(String str) {
        return (KVisibility) Enum.valueOf(KVisibility.class, str);
    }

    public static KVisibility[] values() {
        return (KVisibility[]) $VALUES.clone();
    }
}
