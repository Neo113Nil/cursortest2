package kotlin.reflect.jvm.internal.impl.km;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;
import kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class Visibility {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ Visibility[] $VALUES;
    public static final Visibility INTERNAL;
    public static final Visibility LOCAL;
    public static final Visibility PRIVATE;
    public static final Visibility PRIVATE_TO_THIS;
    public static final Visibility PROTECTED;
    public static final Visibility PUBLIC;
    public final FlagImpl flag;

    static {
        Visibility visibility = new Visibility("INTERNAL", 0, 0);
        INTERNAL = visibility;
        Visibility visibility2 = new Visibility("PRIVATE", 1, 1);
        PRIVATE = visibility2;
        Visibility visibility3 = new Visibility("PROTECTED", 2, 2);
        PROTECTED = visibility3;
        Visibility visibility4 = new Visibility("PUBLIC", 3, 3);
        PUBLIC = visibility4;
        Visibility visibility5 = new Visibility("PRIVATE_TO_THIS", 4, 4);
        PRIVATE_TO_THIS = visibility5;
        Visibility visibility6 = new Visibility("LOCAL", 5, 5);
        LOCAL = visibility6;
        Visibility[] visibilityArr = {visibility, visibility2, visibility3, visibility4, visibility5, visibility6};
        $VALUES = visibilityArr;
        $ENTRIES = new EnumEntriesList(visibilityArr);
    }

    public Visibility(String str, int i, int i2) {
        Flags.FlagField<ProtoBuf.Visibility> flagField = Flags.VISIBILITY;
        flagField.getClass();
        this.flag = new FlagImpl(flagField, i2);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static Visibility valueOf(String str) {
        return (Visibility) Enum.valueOf(Visibility.class, str);
    }

    public static Visibility[] values() {
        return (Visibility[]) $VALUES.clone();
    }

    public final FlagImpl getFlag$kotlin_metadata() {
        return this.flag;
    }
}
