package com.yandex.mobile.ads.impl;

import O1.C0892k0;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class px1 extends DivActionHandler {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final eo f30613a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private z10 f30614b;

    public px1() {
        this(0);
    }

    @NotNull
    public final Cdo a(int i4) {
        Cdo cdo = (Cdo) this.f30613a.a().get(Integer.valueOf(i4));
        if (cdo != null) {
            return cdo;
        }
        Cdo cdo2 = new Cdo();
        this.f30613a.a(i4, cdo2);
        return cdo2;
    }

    @Override // com.yandex.div.core.DivActionHandler
    public final boolean handleAction(@NotNull C0892k0 action, @NotNull DivViewFacade view, @NotNull ExpressionResolver expressionResolver) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(expressionResolver, "expressionResolver");
        if (super.handleAction(action, view, expressionResolver)) {
            return true;
        }
        z10 z10Var = this.f30614b;
        return z10Var != null && z10Var.handleAction(action, view, expressionResolver);
    }

    public /* synthetic */ px1(int i4) {
        this(new eo());
    }

    public final void a(@Nullable z10 z10Var) {
        z10 z10Var2 = this.f30614b;
        if (z10Var2 != null) {
            z10Var2.a(null);
        }
        if (z10Var != null) {
            z10Var.a(this.f30613a);
        }
        this.f30614b = z10Var;
    }

    public px1(@NotNull eo clickConnectorAggregator) {
        Intrinsics.checkNotNullParameter(clickConnectorAggregator, "clickConnectorAggregator");
        this.f30613a = clickConnectorAggregator;
    }

    @Override // com.yandex.div.core.DivActionHandler
    public final boolean handleAction(@NotNull O1.Xb action, @NotNull DivViewFacade view, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        if (super.handleAction(action, view, resolver)) {
            return true;
        }
        z10 z10Var = this.f30614b;
        return z10Var != null && z10Var.handleAction(action, view, resolver);
    }
}
