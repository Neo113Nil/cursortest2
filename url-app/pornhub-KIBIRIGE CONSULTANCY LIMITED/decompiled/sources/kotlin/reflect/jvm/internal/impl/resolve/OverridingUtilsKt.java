package kotlin.reflect.jvm.internal.impl.resolve;

import android.R;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

/* compiled from: overridingUtils.kt */
/* loaded from: classes2.dex */
public final class OverridingUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <H> Collection<H> selectMostSpecificInEachOverridableGroup(Collection<? extends H> collection, Function1<? super H, ? extends CallableDescriptor> descriptorByHandle) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(descriptorByHandle, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        SmartSet create = SmartSet.Companion.create();
        while (true) {
            LinkedList linkedList2 = linkedList;
            if (!linkedList2.isEmpty()) {
                Object first = CollectionsKt.first((List<? extends Object>) linkedList);
                final SmartSet create2 = SmartSet.Companion.create();
                Collection<R.anim> extractMembersOverridableInBothWays = OverridingUtil.extractMembersOverridableInBothWays(first, linkedList2, descriptorByHandle, new Function1(create2) { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt$$Lambda$1
                    private final SmartSet arg$0;

                    {
                        this.arg$0 = create2;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public Object invoke(Object obj) {
                        Unit selectMostSpecificInEachOverridableGroup$lambda$2;
                        selectMostSpecificInEachOverridableGroup$lambda$2 = OverridingUtilsKt.selectMostSpecificInEachOverridableGroup$lambda$2(this.arg$0, obj);
                        return selectMostSpecificInEachOverridableGroup$lambda$2;
                    }
                });
                Intrinsics.checkNotNullExpressionValue(extractMembersOverridableInBothWays, "extractMembersOverridableInBothWays(...)");
                if (extractMembersOverridableInBothWays.size() == 1 && create2.isEmpty()) {
                    Object single = CollectionsKt.single(extractMembersOverridableInBothWays);
                    Intrinsics.checkNotNullExpressionValue(single, "single(...)");
                    create.add(single);
                } else {
                    R.animator animatorVar = (Object) OverridingUtil.selectMostSpecificMember(extractMembersOverridableInBothWays, descriptorByHandle);
                    CallableDescriptor invoke = descriptorByHandle.invoke(animatorVar);
                    for (R.anim animVar : extractMembersOverridableInBothWays) {
                        Intrinsics.checkNotNull(animVar);
                        if (!OverridingUtil.isMoreSpecific(invoke, descriptorByHandle.invoke(animVar))) {
                            create2.add(animVar);
                        }
                    }
                    SmartSet smartSet = create2;
                    if (!smartSet.isEmpty()) {
                        create.addAll(smartSet);
                    }
                    create.add(animatorVar);
                }
            } else {
                return create;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectMostSpecificInEachOverridableGroup$lambda$2(SmartSet smartSet, Object obj) {
        Intrinsics.checkNotNull(obj);
        smartSet.add(obj);
        return Unit.INSTANCE;
    }
}
