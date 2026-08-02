package com.squareup.cash.support.chat.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.ui.compose.ComposeUiView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.profile.views.ProfileCropView;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.sheet.SheetStateKt;
import com.squareup.cash.support.chat.viewmodels.ChatExitPromptSheetViewModel;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda6;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final class ChatExitPromptSheetView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatExitPromptSheetView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(ChatExitPromptSheetViewModel chatExitPromptSheetViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(800903230);
        int i2 = i | (gapComposer2.changedInstance(chatExitPromptSheetViewModel) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16);
        if (!gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        } else {
            if (chatExitPromptSheetViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return;
            }
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer2);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue;
            Continuation continuation = null;
            RealSheetState rememberSheetState = SheetStateKt.rememberSheetState(null, gapComposer2, 0, 1);
            boolean changed = gapComposer2.changed(rememberSheetState) | gapComposer2.changedInstance(chatExitPromptSheetViewModel);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ProfileCropView.AnonymousClass3(rememberSheetState, chatExitPromptSheetViewModel, continuation, 29);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer2, chatExitPromptSheetViewModel, (Function2) rememberedValue2);
            boolean changedInstance = gapComposer2.changedInstance(chatExitPromptSheetViewModel) | ((i2 & 112) == 32);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new ShareSheetViewKt$$ExternalSyntheticLambda5(26, (Object) chatExitPromptSheetViewModel, function1);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(2067180307, new CashMapViewKt$$ExternalSyntheticLambda15((Function0) rememberedValue3, rememberSheetState, chatExitPromptSheetViewModel, function1, parcelableSnapshotMutableIntState), gapComposer2);
            gapComposer = gapComposer2;
            ArcadeThemeKt.ArcadeTheme(null, null, null, rememberComposableLambda, gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabToolbarsKt$$ExternalSyntheticLambda6(this, chatExitPromptSheetViewModel, function1, i, 1);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((ChatExitPromptSheetViewModel) obj, function1, gapComposer, 0);
    }
}
