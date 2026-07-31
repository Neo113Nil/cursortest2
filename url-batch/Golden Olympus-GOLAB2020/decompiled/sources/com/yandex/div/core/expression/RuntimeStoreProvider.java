package com.yandex.div.core.expression;

import O1.AbstractC1176zf;
import O1.C1015qf;
import O1.C1165z4;
import W1.m;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.expression.local.ExpressionsRuntimeProvider;
import com.yandex.div.core.expression.local.RuntimeStore;
import com.yandex.div.core.expression.triggers.TriggersController;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.expression.variables.VariableControllerKt;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.data.Variable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public class RuntimeStoreProvider {

    @NotNull
    private final WeakHashMap<Div2View, Set<String>> divDataTags;

    @NotNull
    private final ErrorCollectors errorCollectors;

    @NotNull
    private final ExpressionsRuntimeProvider runtimeProvider;
    private final Map<String, RuntimeStore> runtimeStores;

    public RuntimeStoreProvider(@NotNull ExpressionsRuntimeProvider runtimeProvider, @NotNull ErrorCollectors errorCollectors) {
        Intrinsics.checkNotNullParameter(runtimeProvider, "runtimeProvider");
        Intrinsics.checkNotNullParameter(errorCollectors, "errorCollectors");
        this.runtimeProvider = runtimeProvider;
        this.errorCollectors = errorCollectors;
        this.runtimeStores = Collections.synchronizedMap(new LinkedHashMap());
        this.divDataTags = new WeakHashMap<>();
    }

    private void ensureVariablesSynced(ExpressionResolverImpl expressionResolverImpl, C1165z4 c1165z4, ErrorCollector errorCollector) {
        boolean z4;
        VariableController variableController = expressionResolverImpl.getVariableController();
        List<AbstractC1176zf> list = c1165z4.f8715g;
        if (list != null) {
            for (AbstractC1176zf abstractC1176zf : list) {
                Variable mutableVariable = variableController.getMutableVariable(RuntimeStoreProviderKt.getName(abstractC1176zf));
                if (mutableVariable == null) {
                    VariableControllerKt.declare(variableController, abstractC1176zf, expressionResolverImpl, errorCollector);
                } else {
                    if (abstractC1176zf instanceof AbstractC1176zf.b) {
                        z4 = mutableVariable instanceof Variable.BooleanVariable;
                    } else if (abstractC1176zf instanceof AbstractC1176zf.g) {
                        z4 = mutableVariable instanceof Variable.IntegerVariable;
                    } else if (abstractC1176zf instanceof AbstractC1176zf.h) {
                        z4 = mutableVariable instanceof Variable.DoubleVariable;
                    } else if (abstractC1176zf instanceof AbstractC1176zf.i) {
                        z4 = mutableVariable instanceof Variable.StringVariable;
                    } else if (abstractC1176zf instanceof AbstractC1176zf.c) {
                        z4 = mutableVariable instanceof Variable.ColorVariable;
                    } else if (abstractC1176zf instanceof AbstractC1176zf.j) {
                        z4 = mutableVariable instanceof Variable.UrlVariable;
                    } else if (abstractC1176zf instanceof AbstractC1176zf.f) {
                        z4 = mutableVariable instanceof Variable.DictVariable;
                    } else {
                        if (!(abstractC1176zf instanceof AbstractC1176zf.a)) {
                            throw new m();
                        }
                        z4 = mutableVariable instanceof Variable.ArrayVariable;
                    }
                    if (!z4) {
                        errorCollector.logError(new IllegalArgumentException(StringsKt.f("\n                           Variable inconsistency detected!\n                           at DivData: " + RuntimeStoreProviderKt.getName(abstractC1176zf) + " (" + abstractC1176zf + ")\n                           at VariableController: " + variableController.getMutableVariable(RuntimeStoreProviderKt.getName(abstractC1176zf)) + "\n                        ")));
                    }
                }
            }
        }
    }

    public void cleanupRuntime$div_release(@NotNull Div2View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Set<String> set = this.divDataTags.get(view);
        if (set != null) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                RuntimeStore runtimeStore = this.runtimeStores.get((String) it.next());
                if (runtimeStore != null) {
                    runtimeStore.cleanup$div_release(view);
                }
            }
        }
        this.divDataTags.remove(view);
    }

    @NotNull
    public RuntimeStore getOrCreate$div_release(@NotNull DivDataTag tag, @NotNull C1165z4 data, @NotNull Div2View div2View) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(div2View, "div2View");
        WeakHashMap<Div2View, Set<String>> weakHashMap = this.divDataTags;
        Set<String> set = weakHashMap.get(div2View);
        if (set == null) {
            set = new LinkedHashSet<>();
            weakHashMap.put(div2View, set);
        }
        String id = tag.getId();
        Intrinsics.checkNotNullExpressionValue(id, "tag.id");
        set.add(id);
        RuntimeStore runtimeStore = this.runtimeStores.get(tag.getId());
        if (runtimeStore == null) {
            RuntimeStore runtimeStore2 = new RuntimeStore(data, this.runtimeProvider, this.errorCollectors.getOrCreate(tag, data));
            Map<String, RuntimeStore> runtimeStores = this.runtimeStores;
            Intrinsics.checkNotNullExpressionValue(runtimeStores, "runtimeStores");
            runtimeStores.put(tag.getId(), runtimeStore2);
            return runtimeStore2;
        }
        ensureVariablesSynced(runtimeStore.getRootRuntime().getExpressionResolver(), data, this.errorCollectors.getOrCreate(tag, data));
        TriggersController triggersController = runtimeStore.getRootRuntime().getTriggersController();
        if (triggersController != null) {
            List<C1015qf> list = data.f8714f;
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            triggersController.ensureTriggersSynced(list);
        }
        return runtimeStore;
    }

    public void reset(@NotNull List<? extends DivDataTag> tags) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        if (tags.isEmpty()) {
            this.runtimeStores.clear();
            return;
        }
        Iterator<T> it = tags.iterator();
        while (it.hasNext()) {
            this.runtimeStores.remove(((DivDataTag) it.next()).getId());
        }
    }
}
