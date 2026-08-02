package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.AbstractNullabilityChecker;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.model.TypeCheckerProviderContext$$Util;

/* loaded from: classes9.dex */
public final class NullabilityChecker {
    public static final NullabilityChecker INSTANCE = new NullabilityChecker();

    public final boolean isSubtypeOfAny(UnwrappedType unwrappedType) {
        unwrappedType.getClass();
        return AbstractNullabilityChecker.INSTANCE.hasNotNullSupertype(TypeCheckerProviderContext$$Util.newTypeCheckerState$default(SimpleClassicTypeSystemContext.INSTANCE, false, true, false, 4, null), FlexibleTypesKt.lowerIfFlexible(unwrappedType), TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE);
    }
}
