package com.yandex.div.core.util;

import android.view.View;
import androidx.collection.h;
import com.yandex.div.R$id;
import com.yandex.div.core.view2.Releasable;
import com.yandex.div.internal.core.ExpressionSubscriber;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class ReleasablesKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final ExpressionSubscriber getExpressionSubscriber(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view instanceof ExpressionSubscriber) {
            return (ExpressionSubscriber) view;
        }
        Object tag = view.getTag(R$id.div_releasable_list);
        h hVar = tag instanceof h ? (h) tag : null;
        if (hVar == null) {
            hVar = new h();
            view.setTag(R$id.div_releasable_list, hVar);
        }
        Object j4 = hVar.j(0);
        ExpressionSubscriber expressionSubscriber = j4 instanceof ExpressionSubscriber ? (ExpressionSubscriber) j4 : null;
        if (expressionSubscriber != null) {
            return expressionSubscriber;
        }
        ExpressionSubscriberImpl expressionSubscriberImpl = new ExpressionSubscriberImpl();
        hVar.n(0, expressionSubscriberImpl);
        return expressionSubscriberImpl;
    }

    @Nullable
    public static final Iterable<Releasable> getReleasableList(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag = view.getTag(R$id.div_releasable_list);
        h hVar = tag instanceof h ? (h) tag : null;
        if (hVar != null) {
            return SparseArraysKt.toIterable(hVar);
        }
        return null;
    }
}
