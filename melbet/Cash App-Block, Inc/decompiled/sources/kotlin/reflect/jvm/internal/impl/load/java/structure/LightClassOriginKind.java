package kotlin.reflect.jvm.internal.impl.load.java.structure;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class LightClassOriginKind {
    public static final /* synthetic */ LightClassOriginKind[] $VALUES;
    public static final LightClassOriginKind BINARY;
    public static final LightClassOriginKind SOURCE;

    static {
        LightClassOriginKind lightClassOriginKind = new LightClassOriginKind("SOURCE", 0);
        SOURCE = lightClassOriginKind;
        LightClassOriginKind lightClassOriginKind2 = new LightClassOriginKind("BINARY", 1);
        BINARY = lightClassOriginKind2;
        $VALUES = new LightClassOriginKind[]{lightClassOriginKind, lightClassOriginKind2};
    }

    public static LightClassOriginKind valueOf(String str) {
        return (LightClassOriginKind) Enum.valueOf(LightClassOriginKind.class, str);
    }

    public static LightClassOriginKind[] values() {
        return (LightClassOriginKind[]) $VALUES.clone();
    }
}
