package com.yandex.div.core.view2.errors;

import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.data.Variable;
import com.yandex.div.data.VariableMutationException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class VariableMonitor {

    @NotNull
    private Map<String, ? extends VariableController> controllerMap;

    @NotNull
    private final Function1<Throwable, Unit> errorHandler;

    @NotNull
    private final Map<Pair<String, String>, Variable> variables;

    @Nullable
    private Function1<? super List<? extends Pair<String, ? extends Variable>>, Unit> variablesUpdatedCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public VariableMonitor(@NotNull Function1<? super Throwable, Unit> errorHandler) {
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        this.errorHandler = errorHandler;
        this.variables = new LinkedHashMap();
        this.controllerMap = MapsKt.emptyMap();
    }

    private final Function1<Variable, Unit> createCallback(String str) {
        return new VariableMonitor$createCallback$1(this, str);
    }

    private final Pair<String, Variable> entriesToVariables(Map.Entry<Pair<String, String>, ? extends Variable> entry) {
        Pair<String, String> key = entry.getKey();
        return TuplesKt.to(key.getFirst(), entry.getValue());
    }

    private final List<String> getAllNames(VariableController variableController) {
        List<Variable> captureAll = variableController.captureAll();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(captureAll, 10));
        Iterator<T> it = captureAll.iterator();
        while (it.hasNext()) {
            arrayList.add(((Variable) it.next()).getName());
        }
        return arrayList;
    }

    private final <K, V> boolean hasAllPairs(Map<K, ? extends V> map, Map<K, ? extends V> map2) {
        if (map2.isEmpty()) {
            return true;
        }
        for (Map.Entry<K, ? extends V> entry : map2.entrySet()) {
            K key = entry.getKey();
            if (!Intrinsics.areEqual(map.get(key), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyOnChange() {
        List<Pair<String, Variable>> variablesList = variablesList();
        Function1<? super List<? extends Pair<String, ? extends Variable>>, Unit> function1 = this.variablesUpdatedCallback;
        if (function1 != null) {
            function1.invoke(variablesList);
        }
    }

    private final void onControllersChange(Set<? extends VariableController> set) {
        Map<String, ? extends VariableController> map = this.controllerMap;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends VariableController> entry : map.entrySet()) {
            if (!set.contains(entry.getValue())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            VariableController variableController = (VariableController) entry2.getValue();
            VariableController.subscribeToVariablesChange$default(variableController, getAllNames(variableController), false, createCallback(str), 2, null);
        }
        this.variables.clear();
        for (Map.Entry<String, ? extends VariableController> entry3 : this.controllerMap.entrySet()) {
            String key = entry3.getKey();
            Iterator<T> it = entry3.getValue().captureAll().iterator();
            while (it.hasNext()) {
                saveVariable((Variable) it.next(), key);
            }
        }
        notifyOnChange();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveVariable(Variable variable, String str) {
        this.variables.put(TuplesKt.to(str, variable.getName()), variable);
    }

    private final List<Pair<String, Variable>> variablesList() {
        Map<Pair<String, String>, Variable> map = this.variables;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<Pair<String, String>, Variable>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(entriesToVariables(it.next()));
        }
        return CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.yandex.div.core.view2.errors.VariableMonitor$variablesList$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t4, T t5) {
                Pair pair = (Pair) t4;
                Pair pair2 = (Pair) t5;
                return Z1.a.d(((String) pair.component1()) + ((Variable) pair.component2()).getName(), ((String) pair2.component1()) + ((Variable) pair2.component2()).getName());
            }
        });
    }

    public final void mutateVariable(@NotNull String name, @NotNull String path, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(value, "value");
        Variable variable = this.variables.get(TuplesKt.to(path, name));
        if (Intrinsics.areEqual(String.valueOf(variable != null ? variable.getValue() : null), value) || variable == null) {
            return;
        }
        try {
            variable.set(value);
        } catch (Exception unused) {
            this.errorHandler.invoke(new VariableMutationException("Unable to set '" + value + "' value to variable '" + name + "'.", null, 2, null));
        }
    }

    public final void setControllerMap(@NotNull Map<String, ? extends VariableController> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (hasAllPairs(this.controllerMap, value)) {
            return;
        }
        Set<? extends VariableController> set = CollectionsKt.toSet(this.controllerMap.values());
        this.controllerMap = value;
        onControllersChange(set);
    }

    public final void setVariablesUpdatedCallback(@NotNull Function1<? super List<? extends Pair<String, ? extends Variable>>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.variablesUpdatedCallback = callback;
        notifyOnChange();
    }
}
