package com.squareup.cash.transfers.views;

import android.content.Context;
import android.view.ContextThemeWrapper;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.support.backend.api.SupportActivityItemLoader;
import com.squareup.cash.support.viewmodels.ArticleViewModel;
import com.squareup.cash.support.views.article.ArticleView$$ExternalSyntheticLambda0;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewModel;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.webview.android.WebViewProvider;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final class AddMoneyView extends ComposeUiView {
    public final /* synthetic */ int $r8$classId = 0;
    public final RealImageLoader imageLoader;
    public final Object moneyFormatterFactory;
    public final Object vibrator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddMoneyView(Context context, LocalizedMoneyFormatter.Factory factory, RealImageLoader realImageLoader, RealCashVibrator realCashVibrator) {
        super(context);
        context.getClass();
        this.moneyFormatterFactory = factory;
        this.imageLoader = realImageLoader;
        this.vibrator = realCashVibrator;
    }

    public void Content(ArticleViewModel articleViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(990995391);
        int i3 = (gapComposer.changedInstance(articleViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (articleViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new ArticleView$$ExternalSyntheticLambda0(this, articleViewModel, function1, i, 0);
                    return;
                }
                return;
            }
            i2 = i;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1340389814, new ArticleView$$ExternalSyntheticLambda0(articleViewModel, this, function1), gapComposer), gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new ArticleView$$ExternalSyntheticLambda0(this, articleViewModel, function1, i2, 2);
        }
    }

    public AddMoneyView(ContextThemeWrapper contextThemeWrapper, RealImageLoader realImageLoader, WebViewProvider webViewProvider, SupportActivityItemLoader supportActivityItemLoader) {
        super(contextThemeWrapper);
        this.imageLoader = realImageLoader;
        this.moneyFormatterFactory = webViewProvider;
        this.vibrator = supportActivityItemLoader;
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        switch (this.$r8$classId) {
            case 0:
                Content((AddMoneyViewModel) obj, function1, gapComposer, 0);
                break;
            default:
                Content((ArticleViewModel) obj, function1, gapComposer, 0);
                break;
        }
    }

    public void Content(AddMoneyViewModel addMoneyViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1857897627);
        int i2 = (gapComposer.changedInstance(addMoneyViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (addMoneyViewModel != null) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1950718480, new AddMoneyView$$ExternalSyntheticLambda0(this, function1, addMoneyViewModel), gapComposer), gapComposer, 3072, 7);
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
            return;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AddMoneyView$$ExternalSyntheticLambda0(this, addMoneyViewModel, function1, i);
        }
    }
}
