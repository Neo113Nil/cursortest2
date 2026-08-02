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
import com.squareup.cash.support.chat.viewmodels.ChatRowViewModel;

/* loaded from: classes7.dex */
public final class SuggestedRepliesView extends AbstractComposeView {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ParcelableSnapshotMutableState state$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestedRepliesView(Context context) {
        super(context, null, 6, 0);
        context.getClass();
        this.state$delegate = Updater.mutableStateOf$default(null);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(537749673);
        int i2 = (gapComposer.changed(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1732087860, new SuggestedRepliesView$$ExternalSyntheticLambda0(this), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SuggestedRepliesView$$ExternalSyntheticLambda0(this, i);
        }
    }

    public final void setViewModel(ChatRowViewModel.SuggestedRepliesRowViewModel suggestedRepliesRowViewModel) {
        suggestedRepliesRowViewModel.getClass();
        this.state$delegate.setValue(suggestedRepliesRowViewModel);
    }
}
