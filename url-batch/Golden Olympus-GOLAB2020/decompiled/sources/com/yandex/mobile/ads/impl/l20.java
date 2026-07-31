package com.yandex.mobile.ads.impl;

import O1.InterfaceC0752c3;
import android.content.Context;
import android.view.View;
import com.yandex.div.core.extension.DivExtensionHandler;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class l20 implements DivExtensionHandler {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final k20 f28391a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final n20 f28392b;

    private static final class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final k20 f28393a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final m20 f28394b;

        public a(@NotNull k20 clickHandler, @NotNull m20 clickData) {
            Intrinsics.checkNotNullParameter(clickHandler, "clickHandler");
            Intrinsics.checkNotNullParameter(clickData, "clickData");
            this.f28393a = clickHandler;
            this.f28394b = clickData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@Nullable View view) {
            if (view != null) {
                this.f28393a.a(this.f28394b.a(), view);
            }
        }
    }

    public /* synthetic */ l20(k20 k20Var) {
        this(k20Var, new n20(0));
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public /* bridge */ /* synthetic */ void beforeBindView(@NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver, @NotNull View view, @NotNull InterfaceC0752c3 interfaceC0752c3) {
        super.beforeBindView(div2View, expressionResolver, view, interfaceC0752c3);
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final void bindView(@NotNull Div2View divView, @NotNull ExpressionResolver expressionResolver, @NotNull View view, @NotNull InterfaceC0752c3 div) {
        Intrinsics.checkNotNullParameter(divView, "divView");
        Intrinsics.checkNotNullParameter(expressionResolver, "expressionResolver");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(div, "div");
        Context context = view.getContext();
        m20 a4 = this.f28392b.a(div);
        if (a4 != null) {
            a aVar = new a(this.f28391a, a4);
            Intrinsics.checkNotNull(context);
            co coVar = new co(context, aVar);
            view.setOnTouchListener(coVar);
            view.setOnClickListener(coVar);
        }
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final boolean matches(@NotNull InterfaceC0752c3 div) {
        Intrinsics.checkNotNullParameter(div, "div");
        return this.f28392b.a(div) != null;
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public /* bridge */ /* synthetic */ void preprocess(@NotNull InterfaceC0752c3 interfaceC0752c3, @NotNull ExpressionResolver expressionResolver) {
        super.preprocess(interfaceC0752c3, expressionResolver);
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final void unbindView(@NotNull Div2View divView, @NotNull ExpressionResolver expressionResolver, @NotNull View view, @NotNull InterfaceC0752c3 div) {
        Intrinsics.checkNotNullParameter(divView, "divView");
        Intrinsics.checkNotNullParameter(expressionResolver, "expressionResolver");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(div, "div");
        view.setOnTouchListener(null);
        view.setOnClickListener(null);
    }

    public l20(@NotNull k20 clickHandler, @NotNull n20 clickExtensionParser) {
        Intrinsics.checkNotNullParameter(clickHandler, "clickHandler");
        Intrinsics.checkNotNullParameter(clickExtensionParser, "clickExtensionParser");
        this.f28391a = clickHandler;
        this.f28392b = clickExtensionParser;
    }
}
