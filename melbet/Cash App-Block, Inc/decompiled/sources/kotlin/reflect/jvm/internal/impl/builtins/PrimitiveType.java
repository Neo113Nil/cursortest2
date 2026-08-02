package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes3.dex */
public enum PrimitiveType {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");

    public static final Companion Companion;
    public static final Set<PrimitiveType> NUMBER_TYPES;
    public final Lazy arrayTypeFqName$delegate;
    public final Name arrayTypeName;
    public final Lazy typeFqName$delegate;
    public final Name typeName;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        PrimitiveType primitiveType = CHAR;
        PrimitiveType primitiveType2 = BYTE;
        PrimitiveType primitiveType3 = SHORT;
        PrimitiveType primitiveType4 = INT;
        PrimitiveType primitiveType5 = FLOAT;
        PrimitiveType primitiveType6 = LONG;
        PrimitiveType primitiveType7 = DOUBLE;
        Companion = new Companion(null);
        NUMBER_TYPES = ArraysKt___ArraysKt.toSet(new PrimitiveType[]{primitiveType, primitiveType2, primitiveType3, primitiveType4, primitiveType5, primitiveType6, primitiveType7});
    }

    PrimitiveType(String str) {
        Name identifier = Name.identifier(str);
        identifier.getClass();
        this.typeName = identifier;
        Name identifier2 = Name.identifier(str.concat("Array"));
        identifier2.getClass();
        this.arrayTypeName = identifier2;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        final int i = 0;
        this.typeFqName$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType$$Lambda$0
            public final PrimitiveType arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PrimitiveType primitiveType = this.arg$0;
                switch (i2) {
                    case 0:
                        PrimitiveType.Companion companion = PrimitiveType.Companion;
                        return StandardNames.BUILT_INS_PACKAGE_FQ_NAME.child(primitiveType.typeName);
                    default:
                        PrimitiveType.Companion companion2 = PrimitiveType.Companion;
                        return StandardNames.BUILT_INS_PACKAGE_FQ_NAME.child(primitiveType.arrayTypeName);
                }
            }
        });
        final int i2 = 1;
        this.arrayTypeFqName$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType$$Lambda$0
            public final PrimitiveType arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PrimitiveType primitiveType = this.arg$0;
                switch (i22) {
                    case 0:
                        PrimitiveType.Companion companion = PrimitiveType.Companion;
                        return StandardNames.BUILT_INS_PACKAGE_FQ_NAME.child(primitiveType.typeName);
                    default:
                        PrimitiveType.Companion companion2 = PrimitiveType.Companion;
                        return StandardNames.BUILT_INS_PACKAGE_FQ_NAME.child(primitiveType.arrayTypeName);
                }
            }
        });
    }

    public final FqName getArrayTypeFqName() {
        return (FqName) this.arrayTypeFqName$delegate.getValue();
    }

    public final Name getArrayTypeName() {
        return this.arrayTypeName;
    }

    public final FqName getTypeFqName() {
        return (FqName) this.typeFqName$delegate.getValue();
    }

    public final Name getTypeName() {
        return this.typeName;
    }
}
