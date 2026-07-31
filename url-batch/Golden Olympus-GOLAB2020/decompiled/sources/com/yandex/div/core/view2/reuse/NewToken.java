package com.yandex.div.core.view2.reuse;

import O1.Bc;
import O1.Z;
import W1.m;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class NewToken extends Token {

    @Nullable
    private ExistingToken lastExistingParent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewToken(@NotNull DivItemBuilderResult item, int i4, @Nullable ExistingToken existingToken) {
        super(item, i4);
        Intrinsics.checkNotNullParameter(item, "item");
        this.lastExistingParent = existingToken;
    }

    private final List<NewToken> itemsToNewTokenList(List<DivItemBuilderResult> list) {
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        for (Object obj : list) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(new NewToken((DivItemBuilderResult) obj, i4, this.lastExistingParent));
            i4 = i5;
        }
        return arrayList;
    }

    @NotNull
    public final List<NewToken> getChildrenTokens() {
        Z z4;
        ExpressionResolver expressionResolver = getItem().getExpressionResolver();
        Z div = getItem().getDiv();
        if (div instanceof Z.r) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof Z.h) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof Z.f) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof Z.m) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof Z.i) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof Z.n) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof Z.j) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof Z.l) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof Z.s) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof Z.p) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof Z.c) {
            return itemsToNewTokenList(DivCollectionExtensionsKt.buildItems(((Z.c) div).c(), (DivViewFacade) null, expressionResolver));
        }
        if (div instanceof Z.d) {
            return itemsToNewTokenList(DivCollectionExtensionsKt.toDivItemBuilderResult(DivCollectionExtensionsKt.getNonNullItems(((Z.d) div).c()), expressionResolver));
        }
        if (div instanceof Z.g) {
            return itemsToNewTokenList(DivCollectionExtensionsKt.itemsToDivItemBuilderResult(((Z.g) div).c(), expressionResolver));
        }
        if (div instanceof Z.e) {
            return itemsToNewTokenList(DivCollectionExtensionsKt.buildItems(((Z.e) div).c(), (DivViewFacade) null, expressionResolver));
        }
        if (div instanceof Z.k) {
            return itemsToNewTokenList(DivCollectionExtensionsKt.buildItems(((Z.k) div).c(), (DivViewFacade) null, expressionResolver));
        }
        if (div instanceof Z.q) {
            return itemsToNewTokenList(DivCollectionExtensionsKt.itemsToDivItemBuilderResult(((Z.q) div).c(), expressionResolver));
        }
        if (!(div instanceof Z.o)) {
            throw new m();
        }
        Bc.c defaultState = DivUtilKt.getDefaultState(((Z.o) div).c(), expressionResolver);
        return (defaultState == null || (z4 = defaultState.f1536c) == null) ? CollectionsKt.emptyList() : itemsToNewTokenList(CollectionsKt.listOf(DivCollectionExtensionsKt.toItemBuilderResult(z4, expressionResolver)));
    }

    @Nullable
    public final ExistingToken getLastExistingParent() {
        return this.lastExistingParent;
    }

    public final void setLastExistingParent(@Nullable ExistingToken existingToken) {
        this.lastExistingParent = existingToken;
    }
}
