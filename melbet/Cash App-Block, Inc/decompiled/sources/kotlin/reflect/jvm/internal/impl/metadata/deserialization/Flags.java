package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;

/* loaded from: classes9.dex */
public class Flags {
    public static final FlagField<ProtoBuf.Class.Kind> CLASS_KIND;
    public static final BooleanFlagField DECLARES_DEFAULT_VALUE;
    public static final BooleanFlagField DEFINITELY_NOT_NULL_TYPE;
    public static final BooleanFlagField HAS_ANNOTATIONS;
    public static final BooleanFlagField HAS_CONSTANT;
    public static final BooleanFlagField HAS_ENUM_ENTRIES;
    public static final BooleanFlagField HAS_GETTER;
    public static final BooleanFlagField HAS_SETTER;
    public static final BooleanFlagField IS_CONST;
    public static final BooleanFlagField IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES;
    public static final BooleanFlagField IS_CROSSINLINE;
    public static final BooleanFlagField IS_DATA;
    public static final BooleanFlagField IS_DELEGATED;
    public static final BooleanFlagField IS_EXPECT_CLASS;
    public static final BooleanFlagField IS_EXPECT_FUNCTION;
    public static final BooleanFlagField IS_EXPECT_PROPERTY;
    public static final BooleanFlagField IS_EXTERNAL_ACCESSOR;
    public static final BooleanFlagField IS_EXTERNAL_CLASS;
    public static final BooleanFlagField IS_EXTERNAL_FUNCTION;
    public static final BooleanFlagField IS_EXTERNAL_PROPERTY;
    public static final BooleanFlagField IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES;
    public static final BooleanFlagField IS_FUN_INTERFACE;
    public static final BooleanFlagField IS_INFIX;
    public static final BooleanFlagField IS_INLINE;
    public static final BooleanFlagField IS_INLINE_ACCESSOR;
    public static final BooleanFlagField IS_INNER;
    public static final BooleanFlagField IS_LATEINIT;
    public static final BooleanFlagField IS_NEGATED;
    public static final BooleanFlagField IS_NOINLINE;
    public static final BooleanFlagField IS_NOT_DEFAULT;
    public static final BooleanFlagField IS_NULL_CHECK_PREDICATE;
    public static final BooleanFlagField IS_OPERATOR;
    public static final BooleanFlagField IS_SECONDARY;
    public static final BooleanFlagField IS_SUSPEND;
    public static final BooleanFlagField IS_TAILREC;
    public static final BooleanFlagField IS_UNSIGNED;
    public static final BooleanFlagField IS_VALUE_CLASS;
    public static final BooleanFlagField IS_VAR;
    public static final FlagField<ProtoBuf.MemberKind> MEMBER_KIND;
    public static final FlagField<ProtoBuf.Modality> MODALITY;
    public static final FlagField<ProtoBuf.ReturnValueStatus> RETURN_VALUE_STATUS_CTOR;
    public static final FlagField<ProtoBuf.ReturnValueStatus> RETURN_VALUE_STATUS_FUNCTION;
    public static final FlagField<ProtoBuf.ReturnValueStatus> RETURN_VALUE_STATUS_PROPERTY;
    public static final BooleanFlagField SUSPEND_TYPE;
    public static final FlagField<ProtoBuf.Visibility> VISIBILITY;

    public static class BooleanFlagField extends FlagField<Boolean> {
        public BooleanFlagField(int i) {
            super(i, 1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        public Boolean get(int i) {
            return Boolean.valueOf(((1 << this.offset) & i) != 0);
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        public int toFlags(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.offset;
            }
            return 0;
        }
    }

    public final class EnumLiteFlagField extends FlagField {
        public final Internal.EnumLite[] values;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public EnumLiteFlagField(int i, Internal.EnumLite[] enumLiteArr) {
            super(i, r2);
            if (enumLiteArr == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
                throw null;
            }
            int i2 = 1;
            int length = enumLiteArr.length - 1;
            if (length != 0) {
                for (int i3 = 31; i3 >= 0; i3--) {
                    if (((1 << i3) & length) != 0) {
                        i2 = 1 + i3;
                    }
                }
                a$$ExternalSyntheticBUOutline0.m$2(enumLiteArr.getClass(), "Empty enum: ");
                throw null;
            }
            this.values = enumLiteArr;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        public final Object get(int i) {
            int i2 = (1 << this.bitWidth) - 1;
            int i3 = this.offset;
            int i4 = (i & (i2 << i3)) >> i3;
            for (Internal.EnumLite enumLite : this.values) {
                if (enumLite.getNumber() == i4) {
                    return enumLite;
                }
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        public final int toFlags(Object obj) {
            return ((Internal.EnumLite) obj).getNumber() << this.offset;
        }
    }

    public static abstract class FlagField<E> {
        public final int bitWidth;
        public final int offset;

        public FlagField(int i, int i2) {
            this.offset = i;
            this.bitWidth = i2;
        }

        /* JADX WARN: Incorrect types in method signature: <E::Lkotlin/reflect/jvm/internal/impl/protobuf/Internal$EnumLite;>(Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$FlagField<*>;[TE;)Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$FlagField<TE;>; */
        public static FlagField after(FlagField flagField, Internal.EnumLite[] enumLiteArr) {
            return new EnumLiteFlagField(flagField.offset + flagField.bitWidth, enumLiteArr);
        }

        public static BooleanFlagField booleanAfter(FlagField<?> flagField) {
            return new BooleanFlagField(flagField.offset + flagField.bitWidth);
        }

        public static BooleanFlagField booleanFirst() {
            return new BooleanFlagField(0);
        }

        public abstract E get(int i);

        public abstract int toFlags(E e);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            if (i == 2) {
                objArr[0] = "kind";
            } else if (i != 5) {
                if (i != 6) {
                    if (i != 8) {
                        if (i != 9) {
                            if (i != 11) {
                                objArr[0] = "visibility";
                            }
                        }
                    }
                }
                objArr[0] = "memberKind";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
            switch (i) {
                case 3:
                    objArr[2] = "getConstructorFlags";
                    break;
                case 4:
                case 5:
                case 6:
                    objArr[2] = "getFunctionFlags";
                    break;
                case 7:
                case 8:
                case 9:
                    objArr[2] = "getPropertyFlags";
                    break;
                case 10:
                case 11:
                    objArr[2] = "getAccessorFlags";
                    break;
                default:
                    objArr[2] = "getClassFlags";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
        objArr[0] = "modality";
        objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
        switch (i) {
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    static {
        BooleanFlagField booleanFirst = FlagField.booleanFirst();
        SUSPEND_TYPE = booleanFirst;
        DEFINITELY_NOT_NULL_TYPE = FlagField.booleanAfter(booleanFirst);
        BooleanFlagField booleanFirst2 = FlagField.booleanFirst();
        HAS_ANNOTATIONS = booleanFirst2;
        FlagField<ProtoBuf.Visibility> after = FlagField.after(booleanFirst2, ProtoBuf.Visibility.values());
        VISIBILITY = after;
        FlagField<ProtoBuf.Modality> after2 = FlagField.after(after, ProtoBuf.Modality.values());
        MODALITY = after2;
        FlagField<ProtoBuf.Class.Kind> after3 = FlagField.after(after2, ProtoBuf.Class.Kind.values());
        CLASS_KIND = after3;
        BooleanFlagField booleanAfter = FlagField.booleanAfter(after3);
        IS_INNER = booleanAfter;
        BooleanFlagField booleanAfter2 = FlagField.booleanAfter(booleanAfter);
        IS_DATA = booleanAfter2;
        BooleanFlagField booleanAfter3 = FlagField.booleanAfter(booleanAfter2);
        IS_EXTERNAL_CLASS = booleanAfter3;
        BooleanFlagField booleanAfter4 = FlagField.booleanAfter(booleanAfter3);
        IS_EXPECT_CLASS = booleanAfter4;
        BooleanFlagField booleanAfter5 = FlagField.booleanAfter(booleanAfter4);
        IS_VALUE_CLASS = booleanAfter5;
        BooleanFlagField booleanAfter6 = FlagField.booleanAfter(booleanAfter5);
        IS_FUN_INTERFACE = booleanAfter6;
        HAS_ENUM_ENTRIES = FlagField.booleanAfter(booleanAfter6);
        BooleanFlagField booleanAfter7 = FlagField.booleanAfter(after);
        IS_SECONDARY = booleanAfter7;
        BooleanFlagField booleanAfter8 = FlagField.booleanAfter(booleanAfter7);
        IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES = booleanAfter8;
        RETURN_VALUE_STATUS_CTOR = FlagField.after(booleanAfter8, ProtoBuf.ReturnValueStatus.values());
        FlagField<ProtoBuf.MemberKind> after4 = FlagField.after(after2, ProtoBuf.MemberKind.values());
        MEMBER_KIND = after4;
        BooleanFlagField booleanAfter9 = FlagField.booleanAfter(after4);
        IS_OPERATOR = booleanAfter9;
        BooleanFlagField booleanAfter10 = FlagField.booleanAfter(booleanAfter9);
        IS_INFIX = booleanAfter10;
        BooleanFlagField booleanAfter11 = FlagField.booleanAfter(booleanAfter10);
        IS_INLINE = booleanAfter11;
        BooleanFlagField booleanAfter12 = FlagField.booleanAfter(booleanAfter11);
        IS_TAILREC = booleanAfter12;
        BooleanFlagField booleanAfter13 = FlagField.booleanAfter(booleanAfter12);
        IS_EXTERNAL_FUNCTION = booleanAfter13;
        BooleanFlagField booleanAfter14 = FlagField.booleanAfter(booleanAfter13);
        IS_SUSPEND = booleanAfter14;
        BooleanFlagField booleanAfter15 = FlagField.booleanAfter(booleanAfter14);
        IS_EXPECT_FUNCTION = booleanAfter15;
        BooleanFlagField booleanAfter16 = FlagField.booleanAfter(booleanAfter15);
        IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES = booleanAfter16;
        RETURN_VALUE_STATUS_FUNCTION = FlagField.after(booleanAfter16, ProtoBuf.ReturnValueStatus.values());
        BooleanFlagField booleanAfter17 = FlagField.booleanAfter(after4);
        IS_VAR = booleanAfter17;
        BooleanFlagField booleanAfter18 = FlagField.booleanAfter(booleanAfter17);
        HAS_GETTER = booleanAfter18;
        BooleanFlagField booleanAfter19 = FlagField.booleanAfter(booleanAfter18);
        HAS_SETTER = booleanAfter19;
        BooleanFlagField booleanAfter20 = FlagField.booleanAfter(booleanAfter19);
        IS_CONST = booleanAfter20;
        BooleanFlagField booleanAfter21 = FlagField.booleanAfter(booleanAfter20);
        IS_LATEINIT = booleanAfter21;
        BooleanFlagField booleanAfter22 = FlagField.booleanAfter(booleanAfter21);
        HAS_CONSTANT = booleanAfter22;
        BooleanFlagField booleanAfter23 = FlagField.booleanAfter(booleanAfter22);
        IS_EXTERNAL_PROPERTY = booleanAfter23;
        BooleanFlagField booleanAfter24 = FlagField.booleanAfter(booleanAfter23);
        IS_DELEGATED = booleanAfter24;
        BooleanFlagField booleanAfter25 = FlagField.booleanAfter(booleanAfter24);
        IS_EXPECT_PROPERTY = booleanAfter25;
        RETURN_VALUE_STATUS_PROPERTY = FlagField.after(booleanAfter25, ProtoBuf.ReturnValueStatus.values());
        BooleanFlagField booleanAfter26 = FlagField.booleanAfter(booleanFirst2);
        DECLARES_DEFAULT_VALUE = booleanAfter26;
        BooleanFlagField booleanAfter27 = FlagField.booleanAfter(booleanAfter26);
        IS_CROSSINLINE = booleanAfter27;
        IS_NOINLINE = FlagField.booleanAfter(booleanAfter27);
        BooleanFlagField booleanAfter28 = FlagField.booleanAfter(after2);
        IS_NOT_DEFAULT = booleanAfter28;
        BooleanFlagField booleanAfter29 = FlagField.booleanAfter(booleanAfter28);
        IS_EXTERNAL_ACCESSOR = booleanAfter29;
        IS_INLINE_ACCESSOR = FlagField.booleanAfter(booleanAfter29);
        BooleanFlagField booleanFirst3 = FlagField.booleanFirst();
        IS_NEGATED = booleanFirst3;
        IS_NULL_CHECK_PREDICATE = FlagField.booleanAfter(booleanFirst3);
        IS_UNSIGNED = FlagField.booleanFirst();
    }

    public static int getAccessorFlags(boolean z, ProtoBuf.Visibility visibility, ProtoBuf.Modality modality, boolean z2, boolean z3, boolean z4) {
        if (visibility == null) {
            $$$reportNull$$$0(10);
            throw null;
        }
        if (modality != null) {
            return HAS_ANNOTATIONS.toFlags(Boolean.valueOf(z)) | MODALITY.toFlags(modality) | VISIBILITY.toFlags(visibility) | IS_NOT_DEFAULT.toFlags(Boolean.valueOf(z2)) | IS_EXTERNAL_ACCESSOR.toFlags(Boolean.valueOf(z3)) | IS_INLINE_ACCESSOR.toFlags(Boolean.valueOf(z4));
        }
        $$$reportNull$$$0(11);
        throw null;
    }
}
