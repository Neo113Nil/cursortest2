package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;

/* loaded from: classes9.dex */
public final class AbstractTypeConstructor$$Lambda$2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final AbstractTypeConstructor arg$0;

    public /* synthetic */ AbstractTypeConstructor$$Lambda$2(AbstractTypeConstructor abstractTypeConstructor, int i) {
        this.$r8$classId = i;
        this.arg$0 = abstractTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        AbstractTypeConstructor abstractTypeConstructor = this.arg$0;
        switch (i) {
            case 0:
                AbstractTypeConstructor.Supertypes supertypes = (AbstractTypeConstructor.Supertypes) obj;
                supertypes.getClass();
                Collection findLoopsInSupertypesAndDisconnect = abstractTypeConstructor.getSupertypeLoopChecker().findLoopsInSupertypesAndDisconnect(abstractTypeConstructor, supertypes.allSupertypes, new AbstractTypeConstructor$$Lambda$1(abstractTypeConstructor), new AbstractTypeConstructor$$Lambda$2(abstractTypeConstructor, 1));
                if (findLoopsInSupertypesAndDisconnect.isEmpty()) {
                    KotlinType defaultSupertypeIfEmpty = abstractTypeConstructor.defaultSupertypeIfEmpty();
                    Collection listOf = defaultSupertypeIfEmpty != null ? CollectionsKt__CollectionsJVMKt.listOf(defaultSupertypeIfEmpty) : null;
                    if (listOf == null) {
                        listOf = EmptyList.INSTANCE;
                    }
                    findLoopsInSupertypesAndDisconnect = listOf;
                }
                List list = findLoopsInSupertypesAndDisconnect instanceof List ? (List) findLoopsInSupertypesAndDisconnect : null;
                if (list == null) {
                    list = CollectionsKt.toList(findLoopsInSupertypesAndDisconnect);
                }
                List processSupertypesWithoutCycles = abstractTypeConstructor.processSupertypesWithoutCycles(list);
                processSupertypesWithoutCycles.getClass();
                supertypes.supertypesWithoutCycles = processSupertypesWithoutCycles;
                break;
            default:
                KotlinType kotlinType = (KotlinType) obj;
                kotlinType.getClass();
                abstractTypeConstructor.reportSupertypeLoopError(kotlinType);
                break;
        }
        return Unit.INSTANCE;
    }
}
