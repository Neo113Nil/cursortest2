package kotlin.reflect.jvm.internal;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.types.SimpleKType;

/* loaded from: classes9.dex */
public abstract class StandardKTypes {
    public static final SimpleKType UNIT_RETURN_TYPE;
    public static final KType ANY = Reflection.typeOf(Object.class);
    public static final KType NULLABLE_ANY = Reflection.nullableTypeOf(Object.class);
    public static final KType CLONEABLE = Reflection.typeOf(Cloneable.class);
    public static final KType SERIALIZABLE = Reflection.typeOf(Serializable.class);

    static {
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Unit.class);
        EmptyList emptyList = EmptyList.INSTANCE;
        UNIT_RETURN_TYPE = new SimpleKType(orCreateKotlinClass, emptyList, false, emptyList, null, false, false, false, null, StandardKTypes$$Lambda$0.INSTANCE);
    }

    public static KType getANY() {
        return ANY;
    }

    public static KType getCLONEABLE() {
        return CLONEABLE;
    }

    public static KType getSERIALIZABLE() {
        return SERIALIZABLE;
    }
}
