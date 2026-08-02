package com.squareup.cash.support.chat.views.transcript.message;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AbstractComposeView;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda6;
import com.squareup.cash.support.chat.viewmodels.ChatRowViewModel;

/* loaded from: classes7.dex */
public final class EnhancedSuggestedRepliesView extends AbstractComposeView {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ParcelableSnapshotMutableState rowModel$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnhancedSuggestedRepliesView(Context context) {
        super(context, null, 6, 0);
        context.getClass();
        this.rowModel$delegate = Updater.mutableStateOf$default(null);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1216894339);
        int i2 = (gapComposer.changed(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ChatRowViewModel.SuggestedRepliesRowViewModel suggestedRepliesRowViewModel = (ChatRowViewModel.SuggestedRepliesRowViewModel) this.rowModel$delegate.getValue();
            if (suggestedRepliesRowViewModel == null) {
                gapComposer.startReplaceGroup(1319727666);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1319727667);
                ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-552957294, new SuggestedRepliesViewKt$$ExternalSyntheticLambda1(suggestedRepliesRowViewModel), gapComposer), gapComposer, 3072, 7);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SheetKt$$ExternalSyntheticLambda6(this, i, 19);
        }
    }

    public final void setViewModel(ChatRowViewModel.SuggestedRepliesRowViewModel suggestedRepliesRowViewModel) {
        suggestedRepliesRowViewModel.getClass();
        this.rowModel$delegate.setValue(suggestedRepliesRowViewModel);
    }
}
