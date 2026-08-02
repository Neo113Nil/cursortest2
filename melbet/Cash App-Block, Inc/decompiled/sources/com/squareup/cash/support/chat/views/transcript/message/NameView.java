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
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel;
import kotlin.text.StringsKt;

/* loaded from: classes7.dex */
public final class NameView extends AbstractComposeView {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ParcelableSnapshotMutableState model$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NameView(Context context) {
        super(context, null, 6, 0);
        context.getClass();
        this.model$delegate = Updater.mutableStateOf$default(new ChatContentViewModel.NameDisplayViewModel(null, ChatContentViewModel.NameDisplayViewModel.NameColorType.SUBTLE, null, false, ChatContentViewModel.NameDisplayViewModel.SpaceType.LARGE));
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        RecomposeScopeImpl endRestartGroup;
        NameView$$ExternalSyntheticLambda0 nameView$$ExternalSyntheticLambda0;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1913103779);
        int i2 = 2;
        int i3 = (gapComposer.changed(this) ? 4 : 2) | i;
        int i4 = 0;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            setVisibility(getModel().isVisible ? 0 : 8);
            if (!getModel().isVisible) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    nameView$$ExternalSyntheticLambda0 = new NameView$$ExternalSyntheticLambda0(this, i, i4);
                    endRestartGroup.block = nameView$$ExternalSyntheticLambda0;
                }
                return;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1904823576, new NameView$$ExternalSyntheticLambda0(this), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            nameView$$ExternalSyntheticLambda0 = new NameView$$ExternalSyntheticLambda0(this, i, i2);
            endRestartGroup.block = nameView$$ExternalSyntheticLambda0;
        }
    }

    public final ChatContentViewModel.NameDisplayViewModel getModel() {
        return (ChatContentViewModel.NameDisplayViewModel) this.model$delegate.getValue();
    }

    public final void updateContent(Integer num, String str) {
        ChatContentViewModel.NameDisplayViewModel.NameColorType nameColorType = ChatContentViewModel.NameDisplayViewModel.NameColorType.SUBTLE;
        ChatContentViewModel.NameDisplayViewModel.SpaceType spaceType = ChatContentViewModel.NameDisplayViewModel.SpaceType.LARGE;
        ChatContentViewModel.NameDisplayViewModel model = getModel();
        boolean z = str == null || StringsKt.isBlank(str);
        model.getClass();
        this.model$delegate.setValue(new ChatContentViewModel.NameDisplayViewModel(str, nameColorType, num, !z, spaceType));
    }
}
