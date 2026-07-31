package com.yandex.mobile.ads.impl;

import O1.C1039s4;
import android.view.View;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class m10 implements DivCustomContainerViewAdapter {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final DivCustomContainerViewAdapter[] f28827a;

    public m10(@NotNull DivCustomContainerViewAdapter... divCustomViewAdapters) {
        Intrinsics.checkNotNullParameter(divCustomViewAdapters, "divCustomViewAdapters");
        this.f28827a = divCustomViewAdapters;
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final void bindView(@NotNull View view, @NotNull C1039s4 div, @NotNull Div2View divView, @NotNull ExpressionResolver expressionResolver, @NotNull DivStatePath path) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(divView, "divView");
        Intrinsics.checkNotNullParameter(expressionResolver, "expressionResolver");
        Intrinsics.checkNotNullParameter(path, "path");
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    @NotNull
    public final View createView(@NotNull C1039s4 div, @NotNull Div2View divView, @NotNull ExpressionResolver expressionResolver, @NotNull DivStatePath path) {
        DivCustomContainerViewAdapter divCustomContainerViewAdapter;
        View createView;
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(divView, "divView");
        Intrinsics.checkNotNullParameter(expressionResolver, "expressionResolver");
        Intrinsics.checkNotNullParameter(path, "path");
        DivCustomContainerViewAdapter[] divCustomContainerViewAdapterArr = this.f28827a;
        int length = divCustomContainerViewAdapterArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                divCustomContainerViewAdapter = null;
                break;
            }
            divCustomContainerViewAdapter = divCustomContainerViewAdapterArr[i4];
            if (divCustomContainerViewAdapter.isCustomTypeSupported(div.f7834j)) {
                break;
            }
            i4++;
        }
        return (divCustomContainerViewAdapter == null || (createView = divCustomContainerViewAdapter.createView(div, divView, expressionResolver, path)) == null) ? new View(divView.getContext()) : createView;
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final boolean isCustomTypeSupported(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        for (DivCustomContainerViewAdapter divCustomContainerViewAdapter : this.f28827a) {
            if (divCustomContainerViewAdapter.isCustomTypeSupported(type)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    @NotNull
    public /* bridge */ /* synthetic */ DivPreloader.PreloadReference preload(@NotNull C1039s4 c1039s4, @NotNull DivPreloader.Callback callback) {
        return super.preload(c1039s4, callback);
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final void release(@NotNull View view, @NotNull C1039s4 div) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(div, "div");
    }
}
