package kotlin.reflect.jvm.internal.impl.km;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;
import kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class MemberKind {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ MemberKind[] $VALUES;
    public static final MemberKind DECLARATION;
    public static final MemberKind DELEGATION;
    public static final MemberKind FAKE_OVERRIDE;
    public static final MemberKind SYNTHESIZED;
    public final FlagImpl flag;

    static {
        MemberKind memberKind = new MemberKind("DECLARATION", 0, 0);
        DECLARATION = memberKind;
        MemberKind memberKind2 = new MemberKind("FAKE_OVERRIDE", 1, 1);
        FAKE_OVERRIDE = memberKind2;
        MemberKind memberKind3 = new MemberKind("DELEGATION", 2, 2);
        DELEGATION = memberKind3;
        MemberKind memberKind4 = new MemberKind("SYNTHESIZED", 3, 3);
        SYNTHESIZED = memberKind4;
        MemberKind[] memberKindArr = {memberKind, memberKind2, memberKind3, memberKind4};
        $VALUES = memberKindArr;
        $ENTRIES = new EnumEntriesList(memberKindArr);
    }

    public MemberKind(String str, int i, int i2) {
        Flags.FlagField<ProtoBuf.MemberKind> flagField = Flags.MEMBER_KIND;
        flagField.getClass();
        this.flag = new FlagImpl(flagField, i2);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static MemberKind valueOf(String str) {
        return (MemberKind) Enum.valueOf(MemberKind.class, str);
    }

    public static MemberKind[] values() {
        return (MemberKind[]) $VALUES.clone();
    }

    public final FlagImpl getFlag$kotlin_metadata() {
        return this.flag;
    }
}
