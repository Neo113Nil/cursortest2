package com.yandex.div.core.expression.variables;

import com.yandex.div.core.Disposable;
import com.yandex.div.core.ObserverList;
import com.yandex.div.core.expression.variables.VariableControllerImpl;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.Variable;
import com.yandex.div.data.VariableDeclarationException;
import com.yandex.div.internal.Assert;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class VariableControllerImpl implements VariableController {

    @NotNull
    private final VariableControllerImpl$declarationObserver$1 declarationObserver;

    @Nullable
    private final VariableController delegate;

    @NotNull
    private final List<VariableSource> extraVariablesSources;

    @NotNull
    private final Function1<Variable, Unit> notifyVariableChangedCallback;

    @NotNull
    private final Map<ExpressionResolver, Function1<Variable, Unit>> onAnyVariableChangeObservers;

    @NotNull
    private final Map<String, ObserverList<Function1<Variable, Unit>>> onChangeObservers;

    @NotNull
    private final Map<String, ObserverList<Function1<Variable, Unit>>> onRemoveObservers;

    @NotNull
    private final Map<String, Variable> variables;

    /* JADX WARN: Type inference failed for: r1v7, types: [com.yandex.div.core.expression.variables.VariableControllerImpl$declarationObserver$1] */
    public VariableControllerImpl(@Nullable VariableController variableController) {
        this.delegate = variableController;
        this.variables = new LinkedHashMap();
        this.extraVariablesSources = new ArrayList();
        this.onChangeObservers = new LinkedHashMap();
        this.onRemoveObservers = new LinkedHashMap();
        this.onAnyVariableChangeObservers = new LinkedHashMap();
        this.notifyVariableChangedCallback = new VariableControllerImpl$notifyVariableChangedCallback$1(this);
        this.declarationObserver = new DeclarationObserver() { // from class: com.yandex.div.core.expression.variables.VariableControllerImpl$declarationObserver$1
        };
    }

    private void addObserver(String str, Function1<? super Variable, Unit> function1) {
        Map<String, ObserverList<Function1<Variable, Unit>>> map = this.onChangeObservers;
        ObserverList<Function1<Variable, Unit>> observerList = map.get(str);
        if (observerList == null) {
            observerList = new ObserverList<>();
            map.put(str, observerList);
        }
        observerList.addObserver(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyVariableChanged(Variable variable) {
        Assert.assertMainThread();
        Iterator it = CollectionsKt.toList(this.onAnyVariableChangeObservers.values()).iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(variable);
        }
        ObserverList<Function1<Variable, Unit>> observerList = this.onChangeObservers.get(variable.getName());
        if (observerList != null) {
            Iterator<Function1<Variable, Unit>> it2 = observerList.iterator();
            while (it2.hasNext()) {
                it2.next().invoke(variable);
            }
        }
    }

    private void onVariableDeclared(Variable variable) {
        variable.addObserver(this.notifyVariableChangedCallback);
        notifyVariableChanged(variable);
    }

    private void removeChangeObserver(String str, Function1<? super Variable, Unit> function1) {
        ObserverList<Function1<Variable, Unit>> observerList = this.onChangeObservers.get(str);
        if (observerList != null) {
            observerList.removeObserver(function1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToVariableChange$lambda$6(VariableControllerImpl this$0, String name, Function1 observer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(name, "$name");
        Intrinsics.checkNotNullParameter(observer, "$observer");
        this$0.removeChangeObserver(name, observer);
    }

    private void subscribeToVariableChangeImpl(String str, ErrorCollector errorCollector, boolean z4, Function1<? super Variable, Unit> function1) {
        Variable mutableVariable = getMutableVariable(str);
        if (mutableVariable == null) {
            if (errorCollector != null) {
                errorCollector.logError(ParsingExceptionKt.missingVariable$default(str, null, 2, null));
            }
            addObserver(str, function1);
        } else {
            if (z4) {
                Assert.assertMainThread();
                function1.invoke(mutableVariable);
            }
            addObserver(str, function1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToVariablesChange$lambda$5(List names, List disposables, VariableControllerImpl this$0, Function1 observer) {
        Intrinsics.checkNotNullParameter(names, "$names");
        Intrinsics.checkNotNullParameter(disposables, "$disposables");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(observer, "$observer");
        Iterator it = names.iterator();
        while (it.hasNext()) {
            this$0.removeChangeObserver((String) it.next(), observer);
        }
        Iterator it2 = disposables.iterator();
        while (it2.hasNext()) {
            ((Disposable) it2.next()).close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToVariablesUndeclared$lambda$10(List names, VariableControllerImpl this$0, Function1 observer) {
        Intrinsics.checkNotNullParameter(names, "$names");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(observer, "$observer");
        Iterator it = names.iterator();
        while (it.hasNext()) {
            ObserverList<Function1<Variable, Unit>> observerList = this$0.onRemoveObservers.get((String) it.next());
            if (observerList != null) {
                observerList.removeObserver(observer);
            }
        }
    }

    public void addSource(@NotNull VariableSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        source.observeVariables(this.notifyVariableChangedCallback);
        source.observeDeclaration(this.declarationObserver);
        this.extraVariablesSources.add(source);
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    @NotNull
    public List<Variable> captureAll() {
        return CollectionsKt.toList(this.variables.values());
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void cleanupSubscriptions() {
        for (VariableSource variableSource : this.extraVariablesSources) {
            variableSource.removeVariablesObserver(this.notifyVariableChangedCallback);
            variableSource.removeDeclarationObserver(this.declarationObserver);
        }
        this.onAnyVariableChangeObservers.clear();
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void declare(@NotNull Variable variable) {
        Intrinsics.checkNotNullParameter(variable, "variable");
        Variable put = this.variables.put(variable.getName(), variable);
        if (put == null) {
            onVariableDeclared(variable);
            return;
        }
        this.variables.put(variable.getName(), put);
        throw new VariableDeclarationException("Variable '" + variable.getName() + "' already declared!", null, 2, null);
    }

    @Override // com.yandex.div.evaluable.VariableProvider
    @Nullable
    public Object get(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Variable mutableVariable = getMutableVariable(name);
        Object wrapVariableValue = VariableControllerKt.wrapVariableValue(mutableVariable != null ? mutableVariable.getValue() : null);
        if (wrapVariableValue != null) {
            return wrapVariableValue;
        }
        VariableController variableController = this.delegate;
        if (variableController != null) {
            return variableController.get(name);
        }
        return null;
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    @Nullable
    public Variable getMutableVariable(@NotNull String name) {
        Variable mutableVariable;
        Intrinsics.checkNotNullParameter(name, "name");
        Variable variable = this.variables.get(name);
        if (variable != null) {
            return variable;
        }
        VariableController variableController = this.delegate;
        if (variableController != null && (mutableVariable = variableController.getMutableVariable(name)) != null) {
            return mutableVariable;
        }
        Iterator<T> it = this.extraVariablesSources.iterator();
        while (it.hasNext()) {
            Variable mutableVariable2 = ((VariableSource) it.next()).getMutableVariable(name);
            if (mutableVariable2 != null) {
                return mutableVariable2;
            }
        }
        return null;
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void restoreSubscriptions() {
        for (VariableSource variableSource : this.extraVariablesSources) {
            variableSource.observeVariables(this.notifyVariableChangedCallback);
            variableSource.receiveVariablesUpdates(this.notifyVariableChangedCallback);
            variableSource.observeDeclaration(this.declarationObserver);
        }
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void setOnAnyVariableChangeCallback(@NotNull ExpressionResolver owner, @NotNull Function1<? super Variable, Unit> callback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.onAnyVariableChangeObservers.put(owner, callback);
        VariableController variableController = this.delegate;
        if (variableController != null) {
            variableController.setOnAnyVariableChangeCallback(owner, new VariableControllerImpl$setOnAnyVariableChangeCallback$1(this, callback));
        }
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    @NotNull
    public Disposable subscribeToVariableChange(@NotNull final String name, @Nullable ErrorCollector errorCollector, boolean z4, @NotNull final Function1<? super Variable, Unit> observer) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (!this.variables.containsKey(name)) {
            VariableController variableController = this.delegate;
            if ((variableController != null ? variableController.getMutableVariable(name) : null) != null) {
                return this.delegate.subscribeToVariableChange(name, errorCollector, z4, observer);
            }
        }
        subscribeToVariableChangeImpl(name, errorCollector, z4, observer);
        return new Disposable() { // from class: q1.a
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                VariableControllerImpl.subscribeToVariableChange$lambda$6(VariableControllerImpl.this, name, observer);
            }
        };
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    @NotNull
    public Disposable subscribeToVariablesChange(@NotNull final List<String> names, boolean z4, @NotNull final Function1<? super Variable, Unit> observer) {
        Intrinsics.checkNotNullParameter(names, "names");
        Intrinsics.checkNotNullParameter(observer, "observer");
        final ArrayList arrayList = new ArrayList();
        for (String str : names) {
            if (!this.variables.containsKey(str)) {
                VariableController variableController = this.delegate;
                if ((variableController != null ? variableController.getMutableVariable(str) : null) != null) {
                    arrayList.add(this.delegate.subscribeToVariableChange(str, null, z4, observer));
                }
            }
            subscribeToVariableChangeImpl(str, null, z4, observer);
        }
        return new Disposable() { // from class: q1.c
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                VariableControllerImpl.subscribeToVariablesChange$lambda$5(names, arrayList, this, observer);
            }
        };
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    @NotNull
    public Disposable subscribeToVariablesUndeclared(@NotNull final List<String> names, @NotNull final Function1<? super Variable, Unit> observer) {
        Intrinsics.checkNotNullParameter(names, "names");
        Intrinsics.checkNotNullParameter(observer, "observer");
        for (String str : names) {
            Map<String, ObserverList<Function1<Variable, Unit>>> map = this.onRemoveObservers;
            ObserverList<Function1<Variable, Unit>> observerList = map.get(str);
            if (observerList == null) {
                observerList = new ObserverList<>();
                map.put(str, observerList);
            }
            observerList.addObserver(observer);
        }
        return new Disposable() { // from class: q1.b
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                VariableControllerImpl.subscribeToVariablesUndeclared$lambda$10(names, this, observer);
            }
        };
    }

    public /* synthetic */ VariableControllerImpl(VariableController variableController, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : variableController);
    }
}
