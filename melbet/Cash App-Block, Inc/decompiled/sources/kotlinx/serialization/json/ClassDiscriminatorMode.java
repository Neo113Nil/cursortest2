package kotlinx.serialization.json;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ClassDiscriminatorMode {
    public static final /* synthetic */ ClassDiscriminatorMode[] $VALUES;
    public static final ClassDiscriminatorMode ALL_JSON_OBJECTS;
    public static final ClassDiscriminatorMode NONE;
    public static final ClassDiscriminatorMode POLYMORPHIC;

    static {
        ClassDiscriminatorMode classDiscriminatorMode = new ClassDiscriminatorMode("NONE", 0);
        NONE = classDiscriminatorMode;
        ClassDiscriminatorMode classDiscriminatorMode2 = new ClassDiscriminatorMode("ALL_JSON_OBJECTS", 1);
        ALL_JSON_OBJECTS = classDiscriminatorMode2;
        ClassDiscriminatorMode classDiscriminatorMode3 = new ClassDiscriminatorMode("POLYMORPHIC", 2);
        POLYMORPHIC = classDiscriminatorMode3;
        $VALUES = new ClassDiscriminatorMode[]{classDiscriminatorMode, classDiscriminatorMode2, classDiscriminatorMode3};
    }

    public static ClassDiscriminatorMode valueOf(String str) {
        return (ClassDiscriminatorMode) Enum.valueOf(ClassDiscriminatorMode.class, str);
    }

    public static ClassDiscriminatorMode[] values() {
        return (ClassDiscriminatorMode[]) $VALUES.clone();
    }
}
