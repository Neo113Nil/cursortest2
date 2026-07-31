package com.yandex.div.core.util;

import O1.Z;
import W1.m;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class DivTreeWalkKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<DivItemBuilderResult> getItems(Z z4, ExpressionResolver expressionResolver) {
        if (z4 instanceof Z.r) {
            return CollectionsKt.emptyList();
        }
        if (z4 instanceof Z.h) {
            return CollectionsKt.emptyList();
        }
        if (z4 instanceof Z.f) {
            return CollectionsKt.emptyList();
        }
        if (z4 instanceof Z.m) {
            return CollectionsKt.emptyList();
        }
        if (z4 instanceof Z.i) {
            return CollectionsKt.emptyList();
        }
        if (z4 instanceof Z.n) {
            return CollectionsKt.emptyList();
        }
        if (z4 instanceof Z.j) {
            return CollectionsKt.emptyList();
        }
        if (z4 instanceof Z.d) {
            return CollectionsKt.emptyList();
        }
        if (z4 instanceof Z.l) {
            return CollectionsKt.emptyList();
        }
        if (z4 instanceof Z.s) {
            return CollectionsKt.emptyList();
        }
        if (z4 instanceof Z.p) {
            return CollectionsKt.emptyList();
        }
        if (z4 instanceof Z.c) {
            return DivCollectionExtensionsKt.buildItems(((Z.c) z4).c(), (DivViewFacade) null, expressionResolver);
        }
        if (z4 instanceof Z.g) {
            return DivCollectionExtensionsKt.itemsToDivItemBuilderResult(((Z.g) z4).c(), expressionResolver);
        }
        if (z4 instanceof Z.e) {
            return DivCollectionExtensionsKt.buildItems(((Z.e) z4).c(), (DivViewFacade) null, expressionResolver);
        }
        if (z4 instanceof Z.k) {
            return DivCollectionExtensionsKt.buildItems(((Z.k) z4).c(), (DivViewFacade) null, expressionResolver);
        }
        if (z4 instanceof Z.q) {
            return DivCollectionExtensionsKt.itemsToDivItemBuilderResult(((Z.q) z4).c(), expressionResolver);
        }
        if (z4 instanceof Z.o) {
            return DivCollectionExtensionsKt.statesToDivItemBuilderResult(((Z.o) z4).c(), expressionResolver);
        }
        throw new m();
    }

    @NotNull
    public static final DivTreeWalk walk(@NotNull Z z4, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(z4, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return new DivTreeWalk(z4, resolver);
    }
}
