package com.yandex.div.core.timer;

import O1.C1165z4;
import O1.Ne;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivTimerEventDispatcherProvider {
    private final Map<String, DivTimerEventDispatcher> controllers;

    @NotNull
    private final DivActionBinder divActionBinder;

    @NotNull
    private final ErrorCollectors errorCollectors;

    public DivTimerEventDispatcherProvider(@NotNull DivActionBinder divActionBinder, @NotNull ErrorCollectors errorCollectors) {
        Intrinsics.checkNotNullParameter(divActionBinder, "divActionBinder");
        Intrinsics.checkNotNullParameter(errorCollectors, "errorCollectors");
        this.divActionBinder = divActionBinder;
        this.errorCollectors = errorCollectors;
        this.controllers = Collections.synchronizedMap(new LinkedHashMap());
    }

    private final void invalidateTimersSet(DivTimerEventDispatcher divTimerEventDispatcher, List<Ne> list, ErrorCollector errorCollector, ExpressionResolver expressionResolver) {
        List<Ne> list2 = list;
        for (Ne ne : list2) {
            if (divTimerEventDispatcher.getTimerController(ne.f4167c) == null) {
                divTimerEventDispatcher.addTimerController(toTimerController(ne, errorCollector, expressionResolver));
            }
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Ne) it.next()).f4167c);
        }
        divTimerEventDispatcher.setActiveTimerIds(arrayList);
    }

    private final TimerController toTimerController(Ne ne, ErrorCollector errorCollector, ExpressionResolver expressionResolver) {
        return new TimerController(ne, this.divActionBinder, errorCollector, expressionResolver);
    }

    @Nullable
    public final DivTimerEventDispatcher getOrCreate$div_release(@NotNull DivDataTag dataTag, @NotNull C1165z4 data, @NotNull ExpressionResolver expressionResolver) {
        Intrinsics.checkNotNullParameter(dataTag, "dataTag");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(expressionResolver, "expressionResolver");
        List<Ne> list = data.f8712d;
        if (list == null) {
            return null;
        }
        ErrorCollector orCreate = this.errorCollectors.getOrCreate(dataTag, data);
        Map<String, DivTimerEventDispatcher> controllers = this.controllers;
        Intrinsics.checkNotNullExpressionValue(controllers, "controllers");
        String id = dataTag.getId();
        DivTimerEventDispatcher divTimerEventDispatcher = controllers.get(id);
        if (divTimerEventDispatcher == null) {
            divTimerEventDispatcher = new DivTimerEventDispatcher(orCreate);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                divTimerEventDispatcher.addTimerController(toTimerController((Ne) it.next(), orCreate, expressionResolver));
            }
            controllers.put(id, divTimerEventDispatcher);
        }
        DivTimerEventDispatcher divTimerEventDispatcher2 = divTimerEventDispatcher;
        invalidateTimersSet(divTimerEventDispatcher2, list, orCreate, expressionResolver);
        return divTimerEventDispatcher2;
    }
}
