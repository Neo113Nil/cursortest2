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
public final class d20 extends DivActionHandler {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mr f24405a;

    public d20(@NotNull b10 contentCloseListener) {
        Intrinsics.checkNotNullParameter(contentCloseListener, "contentCloseListener");
        this.f24405a = contentCloseListener;
    }

    @Override // com.yandex.div.core.DivActionHandler
    public final boolean handleAction(@NotNull C0892k0 action, @NotNull DivViewFacade view, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Expression expression = action.f6762k;
        if (expression != null) {
            Uri uri = (Uri) expression.evaluate(resolver);
            if (Intrinsics.areEqual(uri.getScheme(), "mobileads") && Intrinsics.areEqual(uri.getHost(), "closeDialog")) {
                this.f24405a.f();
                return true;
            }
        }
        return super.handleAction(action, view, resolver);
    }
}
