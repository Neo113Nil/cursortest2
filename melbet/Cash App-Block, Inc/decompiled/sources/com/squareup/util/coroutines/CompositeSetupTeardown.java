package com.squareup.util.coroutines;

import com.squareup.cash.task.RepeatTaskAggregator$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class CompositeSetupTeardown implements SetupTeardown {
    public final Function0 setupTeardowns;

    public CompositeSetupTeardown(Function0 function0) {
        function0.getClass();
        this.setupTeardowns = function0;
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        coroutineScope.getClass();
        Iterable iterable = (Iterable) this.setupTeardowns.invoke();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(StateFlowKt.setup((SetupTeardown) it.next(), coroutineScope, obj));
        }
        return new RepeatTaskAggregator$$ExternalSyntheticLambda0(CollectionsKt.reversed(CollectionsKt.toList(arrayList)), 1);
    }
}
