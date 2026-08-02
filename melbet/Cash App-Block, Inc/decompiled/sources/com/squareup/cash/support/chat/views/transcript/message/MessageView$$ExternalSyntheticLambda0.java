package com.squareup.cash.support.chat.views.transcript.message;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.internal.utils.StorageUtil;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class MessageView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ComposeView f$0;
    public final /* synthetic */ MessageView f$1;

    public /* synthetic */ MessageView$$ExternalSyntheticLambda0(ComposeView composeView, MessageView messageView, int i) {
        this.$r8$classId = i;
        this.f$0 = composeView;
        this.f$1 = messageView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        MessageView messageView = this.f$1;
        ComposeView composeView = this.f$0;
        int i2 = 2;
        int i3 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(303632650, new MessageView$$ExternalSyntheticLambda0(composeView, messageView, i3), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                    DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ArcadeThemeKt.LocalIconColor;
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Updater.CompositionLocalProvider(Recorder$$ExternalSyntheticOutline2.m(colors.semantic.icon.danger, dynamicProvidableCompositionLocal), Expect_jvmKt.rememberComposableLambda(-535083958, new MessageView$$ExternalSyntheticLambda0(composeView, messageView, i2), gapComposer2), gapComposer2, 56);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Icons icons = Icons.AlertOutline24;
                    String string2 = composeView.getResources().getString(R.string.support_chat_failed_message_options_button);
                    string2.getClass();
                    boolean changedInstance = gapComposer3.changedInstance(messageView);
                    Object rememberedValue = gapComposer3.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new MessageView$$ExternalSyntheticLambda3(messageView, 1);
                        gapComposer3.updateRememberedValue(rememberedValue);
                    }
                    StorageUtil.ButtonIcon(icons, string2, (Function0) rememberedValue, SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 48.0f), false, null, gapComposer3, 3078, 48);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
