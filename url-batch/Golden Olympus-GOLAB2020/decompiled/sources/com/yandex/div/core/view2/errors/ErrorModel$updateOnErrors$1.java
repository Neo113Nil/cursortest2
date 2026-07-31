package com.yandex.div.core.view2.errors;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class ErrorModel$updateOnErrors$1 extends s implements Function2<List<? extends Throwable>, List<? extends Throwable>, Unit> {
    final /* synthetic */ ErrorModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ErrorModel$updateOnErrors$1(ErrorModel errorModel) {
        super(2);
        this.this$0 = errorModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((List<? extends Throwable>) obj, (List<? extends Throwable>) obj2);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull List<? extends Throwable> errors, @NotNull List<? extends Throwable> warnings) {
        boolean z4;
        List list;
        List list2;
        ErrorViewModel errorViewModel;
        List list3;
        List list4;
        String errorsToDetails;
        List list5;
        List list6;
        String warningsToDetails;
        Intrinsics.checkNotNullParameter(errors, "errors");
        Intrinsics.checkNotNullParameter(warnings, "warnings");
        z4 = this.this$0.visualErrorsEnabled;
        if (z4) {
            list = this.this$0.currentErrors;
            list.clear();
            list.addAll(CollectionsKt.reversed(errors));
            list2 = this.this$0.currentWarnings;
            list2.clear();
            list2.addAll(CollectionsKt.reversed(warnings));
            ErrorModel errorModel = this.this$0;
            errorViewModel = errorModel.state;
            list3 = this.this$0.currentErrors;
            int size = list3.size();
            ErrorModel errorModel2 = this.this$0;
            list4 = errorModel2.currentErrors;
            errorsToDetails = errorModel2.errorsToDetails(list4);
            list5 = this.this$0.currentWarnings;
            int size2 = list5.size();
            ErrorModel errorModel3 = this.this$0;
            list6 = errorModel3.currentWarnings;
            warningsToDetails = errorModel3.warningsToDetails(list6);
            errorModel.setState(ErrorViewModel.copy$default(errorViewModel, false, size, size2, errorsToDetails, warningsToDetails, 1, null));
        }
    }
}
