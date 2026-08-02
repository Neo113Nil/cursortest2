package com.squareup.cash.support.chat.views;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.media3.common.MediaItem;
import androidx.room.Room;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.SizeKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes7.dex */
public final /* synthetic */ class ChatView$$ExternalSyntheticLambda57 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ ChatView f$1;

    public /* synthetic */ ChatView$$ExternalSyntheticLambda57(boolean z, ChatView chatView, int i) {
        this.$r8$classId = i;
        this.f$0 = z;
        this.f$1 = chatView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        final ChatView chatView = this.f$1;
        boolean z = this.f$0;
        Object[] objArr = 0;
        final int i2 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1630992105, new ChatView$$ExternalSyntheticLambda57(z, chatView, i2), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (!gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    gapComposer2.skipToGroupEnd();
                } else if (z) {
                    gapComposer2.startReplaceGroup(79261414);
                    boolean changedInstance = gapComposer2.changedInstance(chatView);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new ChatView$$ExternalSyntheticLambda1(chatView, 12);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    final Object[] objArr2 = objArr == true ? 1 : 0;
                    SizeKt.ButtonCta((Function0) rememberedValue, null, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-1128887081, new Function3() { // from class: com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda66
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            int i3 = objArr2;
                            ChatView chatView2 = chatView;
                            switch (i3) {
                                case 0:
                                    Composer composer3 = (Composer) obj4;
                                    int intValue3 = ((Integer) obj5).intValue();
                                    ((RowScope) obj3).getClass();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        String str = (String) chatView2.unreadMessageText$delegate.getValue();
                                        TextStyle textStyle = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).button;
                                        Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                        if (colors == null) {
                                            colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                        } else {
                                            gapComposer3.startReplaceGroup(-1762997739);
                                            gapComposer3.end(false);
                                        }
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.inverse, (Composer) gapComposer3, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj4;
                                    int intValue4 = ((Integer) obj5).intValue();
                                    ((RowScope) obj3).getClass();
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                        String str2 = (String) chatView2.unreadMessageText$delegate.getValue();
                                        TextStyle textStyle2 = ((Typography) gapComposer4.consume(ArcadeThemeKt.LocalTypography)).button;
                                        Colors colors2 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                                        if (colors2 == null) {
                                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                        } else {
                                            gapComposer4.startReplaceGroup(-1762997739);
                                            gapComposer4.end(false);
                                        }
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors2.semantic.text.inverse, (Composer) gapComposer4, (Modifier) null, textStyle2, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer2), gapComposer2, 1573248, 58);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(79619123);
                    MediaItem.DrmConfiguration.m1139SimpleChatButtoncf5BqRc(chatView.onClickUnreadMessagesButton, null, 0L, Expect_jvmKt.rememberComposableLambda(-1161904257, new Function3() { // from class: com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda66
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            int i3 = i2;
                            ChatView chatView2 = chatView;
                            switch (i3) {
                                case 0:
                                    Composer composer3 = (Composer) obj4;
                                    int intValue3 = ((Integer) obj5).intValue();
                                    ((RowScope) obj3).getClass();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        String str = (String) chatView2.unreadMessageText$delegate.getValue();
                                        TextStyle textStyle = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).button;
                                        Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                        if (colors == null) {
                                            colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                        } else {
                                            gapComposer3.startReplaceGroup(-1762997739);
                                            gapComposer3.end(false);
                                        }
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.inverse, (Composer) gapComposer3, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj4;
                                    int intValue4 = ((Integer) obj5).intValue();
                                    ((RowScope) obj3).getClass();
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                        String str2 = (String) chatView2.unreadMessageText$delegate.getValue();
                                        TextStyle textStyle2 = ((Typography) gapComposer4.consume(ArcadeThemeKt.LocalTypography)).button;
                                        Colors colors2 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                                        if (colors2 == null) {
                                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                        } else {
                                            gapComposer4.startReplaceGroup(-1762997739);
                                            gapComposer4.end(false);
                                        }
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors2.semantic.text.inverse, (Composer) gapComposer4, (Modifier) null, textStyle2, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer2), gapComposer2, 3072);
                    gapComposer2.end(false);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
