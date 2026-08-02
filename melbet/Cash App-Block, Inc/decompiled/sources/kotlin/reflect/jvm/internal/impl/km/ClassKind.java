package kotlin.reflect.jvm.internal.impl.km;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;
import kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class ClassKind {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ ClassKind[] $VALUES;
    public static final ClassKind ANNOTATION_CLASS;
    public static final ClassKind CLASS;
    public static final ClassKind COMPANION_OBJECT;
    public static final ClassKind ENUM_CLASS;
    public static final ClassKind ENUM_ENTRY;
    public static final ClassKind INTERFACE;
    public static final ClassKind OBJECT;
    public final FlagImpl flag;

    static {
        ClassKind classKind = new ClassKind("CLASS", 0, 0);
        CLASS = classKind;
        ClassKind classKind2 = new ClassKind("INTERFACE", 1, 1);
        INTERFACE = classKind2;
        ClassKind classKind3 = new ClassKind("ENUM_CLASS", 2, 2);
        ENUM_CLASS = classKind3;
        ClassKind classKind4 = new ClassKind("ENUM_ENTRY", 3, 3);
        ENUM_ENTRY = classKind4;
        ClassKind classKind5 = new ClassKind("ANNOTATION_CLASS", 4, 4);
        ANNOTATION_CLASS = classKind5;
        ClassKind classKind6 = new ClassKind("OBJECT", 5, 5);
        OBJECT = classKind6;
        ClassKind classKind7 = new ClassKind("COMPANION_OBJECT", 6, 6);
        COMPANION_OBJECT = classKind7;
        ClassKind[] classKindArr = {classKind, classKind2, classKind3, classKind4, classKind5, classKind6, classKind7};
        $VALUES = classKindArr;
        $ENTRIES = new EnumEntriesList(classKindArr);
    }

    public ClassKind(String str, int i, int i2) {
        Flags.FlagField<ProtoBuf.Class.Kind> flagField = Flags.CLASS_KIND;
        flagField.getClass();
        this.flag = new FlagImpl(flagField, i2);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ClassKind valueOf(String str) {
        return (ClassKind) Enum.valueOf(ClassKind.class, str);
    }

    public static ClassKind[] values() {
        return (ClassKind[]) $VALUES.clone();
    }

    public final FlagImpl getFlag$kotlin_metadata() {
        return this.flag;
    }
}
