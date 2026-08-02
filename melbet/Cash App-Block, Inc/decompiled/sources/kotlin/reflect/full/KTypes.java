package kotlin.reflect.full;

import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.SystemPropertiesKt;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.types.AbstractKType;
import kotlin.reflect.jvm.internal.types.DescriptorKType;
import kotlin.reflect.jvm.internal.types.ReflectTypeSystemContext;

/* loaded from: classes9.dex */
public abstract class KTypes {
    public static final boolean isSubtypeOf(KType kType, KType kType2) {
        kType.getClass();
        kType2.getClass();
        if (SystemPropertiesKt.useK1Implementation) {
            return TypeUtilsKt.isSubtypeOf(((DescriptorKType) kType).f1540type, ((DescriptorKType) kType2).f1540type);
        }
        return AbstractTypeChecker.isSubtypeOf$default(AbstractTypeChecker.INSTANCE, new TypeCheckerState(false, false, false, false, ReflectTypeSystemContext.INSTANCE, AbstractTypePreparator.Default.INSTANCE, AbstractTypeRefiner.Default.INSTANCE), (AbstractKType) kType, (AbstractKType) kType2, false, 8, null);
    }
}
