package com.yandex.div.core.expression.variables;

import android.os.Handler;
import android.os.Looper;
import com.yandex.div.data.Variable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
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
public final class DivVariableController {

    @NotNull
    private final ConcurrentLinkedQueue<DeclarationObserver> declarationObservers;

    @NotNull
    private final Set<String> declaredVariableNames;

    @NotNull
    private final ConcurrentLinkedQueue<Function1<String, Unit>> externalVariableRequestObservers;

    @Nullable
    private final DivVariableController internalVariableController;

    @NotNull
    private final Handler mainHandler;

    @NotNull
    private final Set<String> pendingDeclaration;

    @NotNull
    private final Function1<String, Unit> requestsObserver;

    @NotNull
    private final Map<String, String> undeclaredVariables;

    @NotNull
    private final MultiVariableSource variableSource;

    @NotNull
    private final ConcurrentHashMap<String, Variable> variables;

    /* JADX WARN: Multi-variable type inference failed */
    public DivVariableController() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final boolean isDeclaredLocal(String str) {
        boolean contains;
        synchronized (this.declaredVariableNames) {
            contains = this.declaredVariableNames.contains(str);
        }
        return contains;
    }

    public final void addDeclarationObserver$div_release(@NotNull DeclarationObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.declarationObservers.add(observer);
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            divVariableController.addDeclarationObserver$div_release(observer);
        }
    }

    public final void addVariableObserver$div_release(@NotNull Function1<? super Variable, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        Collection<Variable> values = this.variables.values();
        Intrinsics.checkNotNullExpressionValue(values, "variables.values");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            ((Variable) it.next()).addObserver(observer);
        }
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            divVariableController.addVariableObserver$div_release(observer);
        }
    }

    @NotNull
    public final List<Variable> captureAllVariables() {
        List<Variable> emptyList;
        Collection<Variable> values = this.variables.values();
        Intrinsics.checkNotNullExpressionValue(values, "variables.values");
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController == null || (emptyList = divVariableController.captureAllVariables()) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        return CollectionsKt.plus((Collection) values, (Iterable) emptyList);
    }

    @Nullable
    public final Variable get(@NotNull String variableName) {
        Intrinsics.checkNotNullParameter(variableName, "variableName");
        if (isDeclaredLocal(variableName)) {
            return this.variables.get(variableName);
        }
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            return divVariableController.get(variableName);
        }
        return null;
    }

    @NotNull
    public final MultiVariableSource getVariableSource$div_release() {
        return this.variableSource;
    }

    public final void receiveVariablesUpdates$div_release(@NotNull Function1<? super Variable, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        Collection<Variable> values = this.variables.values();
        Intrinsics.checkNotNullExpressionValue(values, "variables.values");
        for (Variable it : values) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            observer.invoke(it);
        }
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            divVariableController.receiveVariablesUpdates$div_release(observer);
        }
    }

    public final void removeDeclarationObserver$div_release(@NotNull DeclarationObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.declarationObservers.remove(observer);
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            divVariableController.removeDeclarationObserver$div_release(observer);
        }
    }

    public final void removeVariablesObserver$div_release(@NotNull Function1<? super Variable, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        Collection<Variable> values = this.variables.values();
        Intrinsics.checkNotNullExpressionValue(values, "variables.values");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            ((Variable) it.next()).removeObserver(observer);
        }
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            divVariableController.removeVariablesObserver$div_release(observer);
        }
    }

    public DivVariableController(@Nullable DivVariableController divVariableController) {
        this.internalVariableController = divVariableController;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.variables = new ConcurrentHashMap<>();
        this.declarationObservers = new ConcurrentLinkedQueue<>();
        this.undeclaredVariables = new LinkedHashMap();
        this.declaredVariableNames = new LinkedHashSet();
        this.pendingDeclaration = new LinkedHashSet();
        this.externalVariableRequestObservers = new ConcurrentLinkedQueue<>();
        DivVariableController$requestsObserver$1 divVariableController$requestsObserver$1 = new DivVariableController$requestsObserver$1(this);
        this.requestsObserver = divVariableController$requestsObserver$1;
        this.variableSource = new MultiVariableSource(this, divVariableController$requestsObserver$1);
    }

    public /* synthetic */ DivVariableController(DivVariableController divVariableController, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : divVariableController);
    }
}
