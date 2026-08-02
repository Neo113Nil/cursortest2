package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$2;

/* loaded from: classes9.dex */
public final class OverridingUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <H> Collection<H> selectMostSpecificInEachOverridableGroup(Collection<? extends H> collection, Function1<? super H, ? extends CallableDescriptor> function1) {
        collection.getClass();
        function1.getClass();
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        SmartSet create = SmartSet.Companion.create();
        while (!linkedList.isEmpty()) {
            Object first = CollectionsKt.first((List) linkedList);
            SmartSet create2 = SmartSet.Companion.create();
            Collection extractMembersOverridableInBothWays = OverridingUtil.extractMembersOverridableInBothWays(first, linkedList, function1, new TasksKt$awaitImpl$2$2(create2, 16));
            extractMembersOverridableInBothWays.getClass();
            if (extractMembersOverridableInBothWays.size() == 1 && create2.isEmpty()) {
                Object single = CollectionsKt.single(extractMembersOverridableInBothWays);
                single.getClass();
                create.add(single);
            } else {
                Object selectMostSpecificMember = OverridingUtil.selectMostSpecificMember(extractMembersOverridableInBothWays, function1);
                selectMostSpecificMember.getClass();
                CallableDescriptor callableDescriptor = (CallableDescriptor) function1.invoke(selectMostSpecificMember);
                for (Object obj : extractMembersOverridableInBothWays) {
                    obj.getClass();
                    if (!OverridingUtil.isMoreSpecific(callableDescriptor, (CallableDescriptor) function1.invoke(obj))) {
                        create2.add(obj);
                    }
                }
                if (!create2.isEmpty()) {
                    create.addAll(create2);
                }
                create.add(selectMostSpecificMember);
            }
        }
        return create;
    }
}
