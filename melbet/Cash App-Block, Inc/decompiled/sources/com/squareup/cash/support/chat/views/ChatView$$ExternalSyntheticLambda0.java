package com.squareup.cash.support.chat.views;

import androidx.camera.video.internal.utils.StorageUtil;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.media3.common.MediaItem;
import androidx.room.util.DBUtil;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda6;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes7.dex */
public final /* synthetic */ class ChatView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ChatView f$0;
    public final /* synthetic */ AndroidStringManager f$1;

    public /* synthetic */ ChatView$$ExternalSyntheticLambda0(AndroidStringManager androidStringManager, ChatView chatView, int i) {
        this.$r8$classId = i;
        this.f$1 = androidStringManager;
        this.f$0 = chatView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        AndroidStringManager androidStringManager = this.f$1;
        ChatView chatView = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1806254394, new ChatView$$ExternalSyntheticLambda0(chatView, androidStringManager, 7), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1954297942, new ChatView$$ExternalSyntheticLambda0(androidStringManager, chatView, 6), gapComposer2), gapComposer2, 3072, 7);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1568653851, new ChatView$$ExternalSyntheticLambda0(androidStringManager, chatView, 5), gapComposer3), gapComposer3, 3072, 7);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 3:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1185209126, new ChatView$$ExternalSyntheticLambda0(chatView, androidStringManager, 4), gapComposer4), gapComposer4, 3072, 7);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            case 4:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    boolean changedInstance = gapComposer5.changedInstance(chatView);
                    Object rememberedValue = gapComposer5.rememberedValue();
                    if (changedInstance || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new ChatView$$ExternalSyntheticLambda1(chatView, 10);
                        gapComposer5.updateRememberedValue(rememberedValue);
                    }
                    MediaItem.DrmConfiguration.ScrollToBottomButton(0, gapComposer5, androidStringManager.get(R.string.support_chat_scroll_to_bottom_button_description), (Function0) rememberedValue);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
            case 5:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(1 & intValue6, (intValue6 & 3) != 2)) {
                    Icons icons = Icons.Send24;
                    String str = androidStringManager.get(R.string.support_chat_send_button_content_description);
                    boolean booleanValue = ((Boolean) chatView.sendButtonEnabled$delegate.getValue()).booleanValue();
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 56.0f);
                    Colors colors = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                    } else {
                        gapComposer6.startReplaceGroup(-1762997739);
                        gapComposer6.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(m285size3ABfNKs, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    boolean changedInstance2 = gapComposer6.changedInstance(chatView);
                    Object rememberedValue2 = gapComposer6.rememberedValue();
                    if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new ChatView$$ExternalSyntheticLambda1(chatView, 8);
                        gapComposer6.updateRememberedValue(rememberedValue2);
                    }
                    StorageUtil.ButtonIcon(icons, str, (Function0) rememberedValue2, m177backgroundbw27NRU, booleanValue, null, gapComposer6, 6, 32);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                break;
            case 6:
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(1 & intValue7, (intValue7 & 3) != 2)) {
                    Icons icons2 = Icons.Add24;
                    String str2 = androidStringManager.get(R.string.support_chat_attach_file_button_content_description);
                    boolean booleanValue2 = ((Boolean) chatView.attachmentButtonEnabled$delegate.getValue()).booleanValue();
                    Modifier m285size3ABfNKs2 = SizeKt.m285size3ABfNKs(companion, 56.0f);
                    Colors colors2 = (Colors) gapComposer7.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer7, -1762997026, gapComposer7, false);
                    } else {
                        gapComposer7.startReplaceGroup(-1762997739);
                        gapComposer7.end(false);
                    }
                    Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(m285size3ABfNKs2, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    boolean changedInstance3 = gapComposer7.changedInstance(chatView);
                    Object rememberedValue3 = gapComposer7.rememberedValue();
                    if (changedInstance3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new ChatView$$ExternalSyntheticLambda1(chatView, 9);
                        gapComposer7.updateRememberedValue(rememberedValue3);
                    }
                    StorageUtil.ButtonIcon(icons2, str2, (Function0) rememberedValue3, m177backgroundbw27NRU2, booleanValue2, null, gapComposer7, 6, 32);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                break;
            default:
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-13565556, new SheetKt$$ExternalSyntheticLambda6(androidStringManager, 17), gapComposer8);
                    NavigationType navigationType = NavigationType.CLOSE;
                    boolean changedInstance4 = gapComposer8.changedInstance(chatView);
                    Object rememberedValue4 = gapComposer8.rememberedValue();
                    if (changedInstance4 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new ChatView$$ExternalSyntheticLambda1(chatView, 11);
                        gapComposer8.updateRememberedValue(rememberedValue4);
                    }
                    DBUtil.TitleBarSub(rememberComposableLambda, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue4, (Modifier) null, (Function3) null, gapComposer8, 54, 108);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ChatView$$ExternalSyntheticLambda0(ChatView chatView, AndroidStringManager androidStringManager, int i) {
        this.$r8$classId = i;
        this.f$0 = chatView;
        this.f$1 = androidStringManager;
    }
}
