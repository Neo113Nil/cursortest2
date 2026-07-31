package com.yandex.mobile.ads.impl;

import O1.C0892k0;
import android.net.Uri;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class pp extends DivActionHandler {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final rp f30515a;

    public pp(@NotNull op closeVerificationListener) {
        Intrinsics.checkNotNullParameter(closeVerificationListener, "closeVerificationListener");
        this.f30515a = closeVerificationListener;
    }

    @Override // com.yandex.div.core.DivActionHandler
    public final boolean handleAction(@NotNull C0892k0 action, @NotNull DivViewFacade view, @NotNull ExpressionResolver expressionResolver) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(expressionResolver, "expressionResolver");
        Expression expression = action.f6762k;
        boolean z4 = false;
        if (expression != null) {
            String uri = ((Uri) expression.evaluate(expressionResolver)).toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            if (Intrinsics.areEqual(uri, "close_ad")) {
                this.f30515a.a();
            } else if (Intrinsics.areEqual(uri, "close_dialog")) {
                this.f30515a.b();
            }
            z4 = true;
        }
        return z4 ? z4 : super.handleAction(action, view, expressionResolver);
    }
}
