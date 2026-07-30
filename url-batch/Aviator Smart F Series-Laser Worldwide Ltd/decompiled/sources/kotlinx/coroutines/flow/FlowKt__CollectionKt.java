package kotlinx.coroutines.flow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
abstract /* synthetic */ class FlowKt__CollectionKt {

    static final class a implements f {
        final /* synthetic */ Collection<Object> $destination;

        a(Collection<Object> collection) {
            this.$destination = collection;
        }

        @Override // kotlinx.coroutines.flow.f
        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
            this.$destination.add(obj);
            return y5.w.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T, C extends Collection<? super T>> Object toCollection(e eVar, C c8, kotlin.coroutines.c cVar) {
        FlowKt__CollectionKt$toCollection$1 flowKt__CollectionKt$toCollection$1;
        Object coroutine_suspended;
        int i8;
        if (cVar instanceof FlowKt__CollectionKt$toCollection$1) {
            flowKt__CollectionKt$toCollection$1 = (FlowKt__CollectionKt$toCollection$1) cVar;
            int i9 = flowKt__CollectionKt$toCollection$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                flowKt__CollectionKt$toCollection$1.label = i9 - Integer.MIN_VALUE;
                Object obj = flowKt__CollectionKt$toCollection$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = flowKt__CollectionKt$toCollection$1.label;
                if (i8 == 0) {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Collection collection = (Collection) flowKt__CollectionKt$toCollection$1.L$0;
                    y5.g.throwOnFailure(obj);
                    return collection;
                }
                y5.g.throwOnFailure(obj);
                f aVar = new a(c8);
                flowKt__CollectionKt$toCollection$1.L$0 = c8;
                flowKt__CollectionKt$toCollection$1.label = 1;
                return eVar.collect(aVar, flowKt__CollectionKt$toCollection$1) == coroutine_suspended ? coroutine_suspended : c8;
            }
        }
        flowKt__CollectionKt$toCollection$1 = new FlowKt__CollectionKt$toCollection$1(cVar);
        Object obj2 = flowKt__CollectionKt$toCollection$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = flowKt__CollectionKt$toCollection$1.label;
        if (i8 == 0) {
        }
    }

    public static final <T> Object toList(e eVar, List<T> list, kotlin.coroutines.c cVar) {
        return g.toCollection(eVar, list, cVar);
    }

    public static /* synthetic */ Object toList$default(e eVar, List list, kotlin.coroutines.c cVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            list = new ArrayList();
        }
        return g.toList(eVar, list, cVar);
    }

    public static final <T> Object toSet(e eVar, Set<T> set, kotlin.coroutines.c cVar) {
        return g.toCollection(eVar, set, cVar);
    }

    public static /* synthetic */ Object toSet$default(e eVar, Set set, kotlin.coroutines.c cVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            set = new LinkedHashSet();
        }
        return g.toSet(eVar, set, cVar);
    }
}
