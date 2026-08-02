package kotlin.reflect.jvm.internal.impl.km;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;
import kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class Modality {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ Modality[] $VALUES;
    public static final Modality ABSTRACT;
    public static final Modality FINAL;
    public static final Modality OPEN;
    public static final Modality SEALED;
    public final FlagImpl flag;

    static {
        Modality modality = new Modality("FINAL", 0, 0);
        FINAL = modality;
        Modality modality2 = new Modality("OPEN", 1, 1);
        OPEN = modality2;
        Modality modality3 = new Modality("ABSTRACT", 2, 2);
        ABSTRACT = modality3;
        Modality modality4 = new Modality("SEALED", 3, 3);
        SEALED = modality4;
        Modality[] modalityArr = {modality, modality2, modality3, modality4};
        $VALUES = modalityArr;
        $ENTRIES = new EnumEntriesList(modalityArr);
    }

    public Modality(String str, int i, int i2) {
        Flags.FlagField<ProtoBuf.Modality> flagField = Flags.MODALITY;
        flagField.getClass();
        this.flag = new FlagImpl(flagField, i2);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static Modality valueOf(String str) {
        return (Modality) Enum.valueOf(Modality.class, str);
    }

    public static Modality[] values() {
        return (Modality[]) $VALUES.clone();
    }

    public final FlagImpl getFlag$kotlin_metadata() {
        return this.flag;
    }
}
