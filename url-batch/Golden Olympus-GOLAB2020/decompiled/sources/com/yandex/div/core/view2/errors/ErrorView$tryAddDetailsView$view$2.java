package com.yandex.div.core.view2.errors;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class ErrorView$tryAddDetailsView$view$2 extends s implements Function0<Unit> {
    final /* synthetic */ ErrorView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ErrorView$tryAddDetailsView$view$2(ErrorView errorView) {
        super(0);
        this.this$0 = errorView;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m162invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m162invoke() {
        ErrorViewModel errorViewModel;
        ErrorModel errorModel;
        errorViewModel = this.this$0.viewModel;
        if (errorViewModel != null) {
            errorModel = this.this$0.errorModel;
            errorModel.copyReportToClipboard();
        }
    }
}
