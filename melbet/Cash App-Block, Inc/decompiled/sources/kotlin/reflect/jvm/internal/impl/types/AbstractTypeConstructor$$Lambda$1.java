package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* loaded from: classes9.dex */
public final class AbstractTypeConstructor$$Lambda$1 implements Function1 {
    public static final AbstractTypeConstructor$$Lambda$1 INSTANCE = new AbstractTypeConstructor$$Lambda$1(0);
    public static final AbstractTypeConstructor$$Lambda$1 INSTANCE$1 = new AbstractTypeConstructor$$Lambda$1(1);
    public final /* synthetic */ int $r8$classId;

    public AbstractTypeConstructor$$Lambda$1(AbstractTypeConstructor abstractTypeConstructor) {
        this.$r8$classId = 2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Collection<KotlinType> supertypes;
        switch (this.$r8$classId) {
            case 0:
                ((Boolean) obj).booleanValue();
                return new AbstractTypeConstructor.Supertypes(CollectionsKt__CollectionsJVMKt.listOf(ErrorUtils.INSTANCE.getErrorTypeForLoopInSupertypes()));
            case 1:
                KotlinType kotlinType = (KotlinType) obj;
                kotlinType.getClass();
                return kotlinType.toString();
            default:
                TypeConstructor typeConstructor = (TypeConstructor) obj;
                typeConstructor.getClass();
                AbstractTypeConstructor abstractTypeConstructor = typeConstructor instanceof AbstractTypeConstructor ? (AbstractTypeConstructor) typeConstructor : null;
                if (abstractTypeConstructor != null) {
                    supertypes = CollectionsKt.plus((Iterable) abstractTypeConstructor.getAdditionalNeighboursInSupertypeGraph(false), ((AbstractTypeConstructor.Supertypes) abstractTypeConstructor.supertypes.invoke()).allSupertypes);
                } else {
                    supertypes = typeConstructor.getSupertypes();
                    supertypes.getClass();
                }
                return supertypes;
        }
    }

    public /* synthetic */ AbstractTypeConstructor$$Lambda$1(int i) {
        this.$r8$classId = i;
    }
}
