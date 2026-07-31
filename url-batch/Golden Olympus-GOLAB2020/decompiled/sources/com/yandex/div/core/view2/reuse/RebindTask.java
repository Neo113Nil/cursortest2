package com.yandex.div.core.view2.reuse;

import O1.C1165z4;
import O1.Z;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.animations.DivComparator;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.reuse.util.RebindTokenUtilsKt;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class RebindTask {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final List<ExistingToken> aloneExisting;

    @NotNull
    private final Map<String, ExistingToken> aloneIds;

    @NotNull
    private final List<NewToken> aloneNew;

    @NotNull
    private final Set<ExistingToken> bindingPoints;

    @NotNull
    private final Div2View div2View;

    @NotNull
    private final DivBinder divBinder;

    @NotNull
    private final List<ExistingToken> idsToBind;

    @NotNull
    private final ExpressionResolver newResolver;

    @NotNull
    private final ExpressionResolver oldResolver;
    private boolean rebindInProgress;

    @NotNull
    private final ComplexRebindReporter reporter;

    @NotNull
    private final ReusableTokenList reusableList;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata
    public static final class UnsupportedElementException extends IllegalArgumentException {

        @NotNull
        private final String message;

        public UnsupportedElementException(@NotNull Class<?> type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.message = type + " is unsupported by complex rebind";
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }
    }

    public RebindTask(@NotNull Div2View div2View, @NotNull DivBinder divBinder, @NotNull ExpressionResolver oldResolver, @NotNull ExpressionResolver newResolver, @NotNull ComplexRebindReporter reporter) {
        Intrinsics.checkNotNullParameter(div2View, "div2View");
        Intrinsics.checkNotNullParameter(divBinder, "divBinder");
        Intrinsics.checkNotNullParameter(oldResolver, "oldResolver");
        Intrinsics.checkNotNullParameter(newResolver, "newResolver");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.div2View = div2View;
        this.divBinder = divBinder;
        this.oldResolver = oldResolver;
        this.newResolver = newResolver;
        this.reporter = reporter;
        this.bindingPoints = new LinkedHashSet();
        this.idsToBind = new ArrayList();
        this.aloneExisting = new ArrayList();
        this.aloneNew = new ArrayList();
        this.aloneIds = new LinkedHashMap();
        this.reusableList = new ReusableTokenList();
    }

    private final boolean calculateDiff(C1165z4 c1165z4, C1165z4 c1165z42, ViewGroup viewGroup) {
        Z z4;
        Z z5;
        C1165z4.c stateToBind = this.div2View.stateToBind(c1165z4);
        if (stateToBind == null || (z4 = stateToBind.f8721a) == null) {
            this.reporter.onComplexRebindNoDivInState();
            return false;
        }
        ExistingToken existingToken = new ExistingToken(DivCollectionExtensionsKt.toItemBuilderResult(z4, this.oldResolver), 0, viewGroup, null);
        C1165z4.c stateToBind2 = this.div2View.stateToBind(c1165z42);
        if (stateToBind2 == null || (z5 = stateToBind2.f8721a) == null) {
            this.reporter.onComplexRebindNoDivInState();
            return false;
        }
        NewToken newToken = new NewToken(DivCollectionExtensionsKt.toItemBuilderResult(z5, this.newResolver), 0, null);
        if (existingToken.isCombinable(newToken)) {
            doNodeInSameMode(existingToken, newToken);
        } else {
            doNodeInExistingMode(existingToken);
            doNodeInNewMode(newToken);
        }
        Iterator<T> it = this.aloneNew.iterator();
        while (it.hasNext()) {
            ExistingToken lastExistingParent = ((NewToken) it.next()).getLastExistingParent();
            if (lastExistingParent == null) {
                this.reporter.onComplexRebindNoExistingParent();
                return false;
            }
            this.reusableList.remove(lastExistingParent);
            this.bindingPoints.add(lastExistingParent);
        }
        return true;
    }

    private final void doNodeInExistingMode(ExistingToken existingToken) {
        String id = existingToken.getDiv().b().getId();
        if (id != null) {
            this.aloneIds.put(id, existingToken);
        } else {
            this.aloneExisting.add(existingToken);
        }
        Iterator it = ExistingToken.getChildrenTokens$default(existingToken, null, 1, null).iterator();
        while (it.hasNext()) {
            doNodeInExistingMode((ExistingToken) it.next());
        }
    }

    private final void doNodeInNewMode(NewToken newToken) {
        Object obj;
        Iterator<T> it = this.aloneExisting.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((ExistingToken) obj).isCombinable(newToken)) {
                    break;
                }
            }
        }
        ExistingToken existingToken = (ExistingToken) obj;
        if (existingToken != null) {
            this.aloneExisting.remove(existingToken);
            doNodeInSameMode(existingToken, newToken);
            return;
        }
        String id = newToken.getDiv().b().getId();
        ExistingToken existingToken2 = id != null ? this.aloneIds.get(id) : null;
        if (id == null || existingToken2 == null || !Intrinsics.areEqual(existingToken2.getDiv().getClass(), newToken.getDiv().getClass()) || !DivComparator.areValuesReplaceable$default(DivComparator.INSTANCE, existingToken2.getDiv().b(), newToken.getDiv().b(), this.oldResolver, this.newResolver, null, 16, null)) {
            this.aloneNew.add(newToken);
        } else {
            this.aloneIds.remove(id);
            this.idsToBind.add(RebindTokenUtilsKt.combineTokens(existingToken2, newToken));
        }
        Iterator<T> it2 = newToken.getChildrenTokens().iterator();
        while (it2.hasNext()) {
            doNodeInNewMode((NewToken) it2.next());
        }
    }

    private final void doNodeInSameMode(ExistingToken existingToken, NewToken newToken) {
        Object obj;
        ExistingToken combineTokens = RebindTokenUtilsKt.combineTokens(existingToken, newToken);
        newToken.setLastExistingParent(combineTokens);
        List mutableList = CollectionsKt.toMutableList((Collection) newToken.getChildrenTokens());
        ArrayList arrayList = new ArrayList();
        for (ExistingToken existingToken2 : existingToken.getChildrenTokens(combineTokens)) {
            Iterator it = mutableList.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((NewToken) obj).isCombinable(existingToken2)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            NewToken newToken2 = (NewToken) obj;
            if (newToken2 != null) {
                doNodeInSameMode(existingToken2, newToken2);
                mutableList.remove(newToken2);
            } else {
                arrayList.add(existingToken2);
            }
        }
        if (mutableList.size() != arrayList.size()) {
            this.bindingPoints.add(combineTokens);
        } else {
            this.reusableList.add(combineTokens);
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            doNodeInExistingMode((ExistingToken) obj2);
        }
        Iterator it2 = mutableList.iterator();
        while (it2.hasNext()) {
            doNodeInNewMode((NewToken) it2.next());
        }
    }

    private final boolean rebind(DivStatePath divStatePath) {
        if (this.bindingPoints.isEmpty() && this.reusableList.isEmpty()) {
            this.reporter.onComplexRebindNothingToBind();
            return false;
        }
        for (ExistingToken existingToken : this.aloneExisting) {
            releaseIfNecessary(existingToken.getDiv(), existingToken.getView());
            this.div2View.unbindViewFromDiv$div_release(existingToken.getView());
        }
        for (ExistingToken existingToken2 : this.aloneIds.values()) {
            releaseIfNecessary(existingToken2.getDiv(), existingToken2.getView());
            this.div2View.unbindViewFromDiv$div_release(existingToken2.getView());
        }
        for (ExistingToken existingToken3 : this.bindingPoints) {
            if (!CollectionsKt.contains(this.bindingPoints, existingToken3.getParentToken())) {
                BindingContext bindingContext = BaseDivViewExtensionsKt.getBindingContext(existingToken3.getView());
                if (bindingContext == null) {
                    bindingContext = this.div2View.getBindingContext$div_release();
                }
                this.divBinder.bind(bindingContext, existingToken3.getView(), existingToken3.getItem().getDiv(), divStatePath);
            }
        }
        for (ExistingToken existingToken4 : this.idsToBind) {
            if (!CollectionsKt.contains(this.bindingPoints, existingToken4.getParentToken())) {
                BindingContext bindingContext2 = BaseDivViewExtensionsKt.getBindingContext(existingToken4.getView());
                if (bindingContext2 == null) {
                    bindingContext2 = this.div2View.getBindingContext$div_release();
                }
                this.divBinder.bind(bindingContext2, existingToken4.getView(), existingToken4.getItem().getDiv(), divStatePath);
            }
        }
        clear();
        this.reporter.onComplexRebindSuccess();
        return true;
    }

    private final void releaseIfNecessary(Z z4, View view) {
        if (z4 instanceof Z.d ? true : z4 instanceof Z.s) {
            this.div2View.getReleaseViewVisitor$div_release().visit(view);
        }
    }

    public final void clear() {
        this.rebindInProgress = false;
        this.reusableList.clear();
        this.bindingPoints.clear();
        this.aloneExisting.clear();
        this.aloneNew.clear();
    }

    public final boolean getRebindInProgress() {
        return this.rebindInProgress;
    }

    @NotNull
    public final ReusableTokenList getReusableList() {
        return this.reusableList;
    }

    public final boolean prepareAndRebind(@NotNull C1165z4 oldDivData, @NotNull C1165z4 newDivData, @NotNull ViewGroup rootView, @NotNull DivStatePath path) {
        boolean z4;
        Intrinsics.checkNotNullParameter(oldDivData, "oldDivData");
        Intrinsics.checkNotNullParameter(newDivData, "newDivData");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(path, "path");
        clear();
        this.rebindInProgress = true;
        try {
            z4 = calculateDiff(oldDivData, newDivData, rootView);
        } catch (UnsupportedElementException e4) {
            this.reporter.onComplexRebindUnsupportedElementException(e4);
            z4 = false;
        }
        if (z4) {
            return rebind(path);
        }
        return false;
    }
}
