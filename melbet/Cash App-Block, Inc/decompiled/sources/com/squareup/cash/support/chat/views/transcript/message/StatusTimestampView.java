package com.squareup.cash.support.chat.views.transcript.message;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.shopping.views.ActionPillKt$$ExternalSyntheticLambda1;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel$MessageViewModel$Status$Failed;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final class StatusTimestampView extends AbstractComposeView {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ParcelableSnapshotMutableState model$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusTimestampView(Context context) {
        super(context, null, 6, 0);
        context.getClass();
        this.model$delegate = Updater.mutableStateOf$default(new ChatContentViewModel.StatusTimestampViewModel(null, null, false, null, false));
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        RecomposeScopeImpl endRestartGroup;
        StatusTimestampView$$ExternalSyntheticLambda0 statusTimestampView$$ExternalSyntheticLambda0;
        String str;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1505641303);
        int i2 = 2;
        int i3 = (gapComposer.changed(this) ? 4 : 2) | i;
        int i4 = 0;
        boolean z = true;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            String str2 = getModel().statusText;
            if ((str2 == null || str2.length() == 0) && ((str = getModel().timestampText) == null || str.length() == 0 || !getModel().isTimestampVisible)) {
                z = false;
            }
            setVisibility(z ? 0 : 8);
            if (!z) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    statusTimestampView$$ExternalSyntheticLambda0 = new StatusTimestampView$$ExternalSyntheticLambda0(this, i, i4);
                    endRestartGroup.block = statusTimestampView$$ExternalSyntheticLambda0;
                }
                return;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1776044788, new StatusTimestampView$$ExternalSyntheticLambda0(this), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            statusTimestampView$$ExternalSyntheticLambda0 = new StatusTimestampView$$ExternalSyntheticLambda0(this, i, i2);
            endRestartGroup.block = statusTimestampView$$ExternalSyntheticLambda0;
        }
    }

    public final void StatusTimestampContent(ChatContentViewModel.StatusTimestampViewModel statusTimestampViewModel, Composer composer, int i) {
        boolean z;
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(796390817);
        int i2 = i | (gapComposer.changedInstance(statusTimestampViewModel) ? 4 : 2);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            String str = statusTimestampViewModel.statusText;
            if (str == null || str.length() == 0) {
                z = false;
                gapComposer.startReplaceGroup(-120066463);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-120354763);
                TextStyle textStyle = Strings.getTypography(gapComposer).bodyXSmall;
                if (statusTimestampViewModel.status instanceof ChatContentViewModel$MessageViewModel$Status$Failed) {
                    gapComposer.startReplaceGroup(827407847);
                    j = Strings.getColors(gapComposer).semantic.text.danger;
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(827409769);
                    j = Strings.getColors(gapComposer).semantic.text.disabled;
                    gapComposer.end(false);
                }
                z = false;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, j, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            String str2 = statusTimestampViewModel.timestampText;
            if (str2 == null || str2.length() == 0 || !statusTimestampViewModel.isTimestampVisible) {
                gapComposer.startReplaceGroup(-119716287);
                gapComposer.end(z);
            } else {
                gapComposer.startReplaceGroup(-119932512);
                if (str != null && str.length() != 0) {
                    str2 = " • ".concat(str2);
                }
                String str3 = str2;
                TextStyle textStyle2 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(z);
                }
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.disabled, (Composer) gapComposer, (Modifier) null, textStyle2, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                gapComposer.end(z);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ActionPillKt$$ExternalSyntheticLambda1(this, statusTimestampViewModel, i, 24);
        }
    }

    public final ChatContentViewModel.StatusTimestampViewModel getModel() {
        return (ChatContentViewModel.StatusTimestampViewModel) this.model$delegate.getValue();
    }

    public final void setTimestampText(String str) {
        this.model$delegate.setValue(ChatContentViewModel.StatusTimestampViewModel.copy$default(getModel(), null, null, false, str, false, 23));
    }
}
