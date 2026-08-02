package com.squareup.cash.support.chat.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import coil3.RealImageLoader;
import com.squareup.cash.shopping.views.ProductSearchView;
import com.squareup.cash.support.chat.viewmodels.ChatImageDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class ChatImageDetailView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ ChatImageDetailViewModel f$0;
    public final /* synthetic */ ProductSearchView f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ ChatImageDetailView$$ExternalSyntheticLambda0(ProductSearchView productSearchView, ChatImageDetailViewModel chatImageDetailViewModel, Function1 function1, int i) {
        this.f$1 = productSearchView;
        this.f$0 = chatImageDetailViewModel;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$2;
        ChatImageDetailViewModel chatImageDetailViewModel = this.f$0;
        ProductSearchView productSearchView = this.f$1;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ChatExitPromptViewKt.ImageDetailView(chatImageDetailViewModel, (RealImageLoader) productSearchView.imageLoader, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                productSearchView.Content(chatImageDetailViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ChatImageDetailView$$ExternalSyntheticLambda0(ChatImageDetailViewModel chatImageDetailViewModel, ProductSearchView productSearchView, Function1 function1) {
        this.f$0 = chatImageDetailViewModel;
        this.f$1 = productSearchView;
        this.f$2 = function1;
    }
}
