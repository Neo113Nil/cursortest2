package com.squareup.cash.support.views.article;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.support.backend.api.SupportActivityItemLoader;
import com.squareup.cash.support.viewmodels.ArticleViewModel;
import com.squareup.cash.transfers.views.AddMoneyView;
import com.squareup.cash.webview.android.WebViewProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class ArticleView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AddMoneyView f$0;
    public final /* synthetic */ ArticleViewModel f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ ArticleView$$ExternalSyntheticLambda0(ArticleViewModel articleViewModel, AddMoneyView addMoneyView, Function1 function1) {
        this.$r8$classId = 1;
        this.f$1 = articleViewModel;
        this.f$0 = addMoneyView;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$2;
        ArticleViewModel articleViewModel = this.f$1;
        AddMoneyView addMoneyView = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                addMoneyView.Content(articleViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
            case 1:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArticleViewKt.Article(this.f$1, addMoneyView.imageLoader, this.f$2, (WebViewProvider) addMoneyView.moneyFormatterFactory, (SupportActivityItemLoader) addMoneyView.vibrator, gapComposer, 0, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                addMoneyView.Content(articleViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ArticleView$$ExternalSyntheticLambda0(AddMoneyView addMoneyView, ArticleViewModel articleViewModel, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = addMoneyView;
        this.f$1 = articleViewModel;
        this.f$2 = function1;
    }
}
