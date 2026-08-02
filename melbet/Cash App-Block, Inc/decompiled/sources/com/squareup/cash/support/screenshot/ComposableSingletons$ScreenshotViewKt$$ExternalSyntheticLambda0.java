package com.squareup.cash.support.screenshot;

import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.RealSubcomposeAsyncImageScope;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.cell.RealCellActivityAccessoryScope;
import com.squareup.cash.arcade.components.cell.RealCellActivityAvatarScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.support.views.ScreenshotReviewViewKt;
import com.squareup.workflow1.Snapshots;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes7.dex */
public final /* synthetic */ class ComposableSingletons$ScreenshotViewKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TextStyle m994copyp1EtxEg$default;
        TextStyle m994copyp1EtxEg$default2;
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    Trace.m1191Iconww6aTOc(Icons.CameraFill24, (String) null, (Modifier) null, 0L, gapComposer, 54, 12);
                    TextStyle textStyle = (TextStyle) gapComposer.consume(ArcadeThemeKt.LocalTextStyle);
                    if (textStyle == null) {
                        gapComposer.startReplaceGroup(-1100573765);
                        textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                    } else {
                        gapComposer.startReplaceGroup(-1100574912);
                    }
                    gapComposer.end(false);
                    m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(textStyle, 0L, Snapshots.getNotScaledUp(textStyle.spanStyle.fontSize, gapComposer), null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777213);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, m994copyp1EtxEg$default, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.support_screenshot_take_screenshot), (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    String stringResource = Room.stringResource(gapComposer2, R.string.support_chat_unknown_body_button_text);
                    TextStyle textStyle2 = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).button;
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, colors.semantic.text.standard, (Composer) gapComposer2, (Modifier) null, textStyle2, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    Trace.m1191Iconww6aTOc(Icons.SendArrow24, (String) null, (Modifier) null, 0L, gapComposer3, 54, 12);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer3, R.string.support_chat_failed_delivery_resend), (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 3:
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    Trace.m1191Iconww6aTOc(Icons.Clear24, (String) null, (Modifier) null, 0L, gapComposer4, 54, 12);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer4, R.string.support_chat_failed_delivery_delete), (Map) null, (Function1) null, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            case 4:
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    String stringResource2 = Room.stringResource(gapComposer5, R.string.support_chat_failed_delivery_delete);
                    Colors colors2 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                    } else {
                        gapComposer5.startReplaceGroup(-1762997739);
                        gapComposer5.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, colors2.semantic.text.warning, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, stringResource2, (Map) null, (Function1) null, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
            case 5:
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer6, R.string.support_chat_failed_delivery_resend), (Map) null, (Function1) null, false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                break;
            case 6:
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    TextStyle textStyle3 = (TextStyle) gapComposer7.consume(ArcadeThemeKt.LocalTextStyle);
                    if (textStyle3 == null) {
                        gapComposer7.startReplaceGroup(-1100573765);
                        textStyle3 = ((Typography) gapComposer7.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                    } else {
                        gapComposer7.startReplaceGroup(-1100574912);
                    }
                    gapComposer7.end(false);
                    m994copyp1EtxEg$default2 = TextStyle.m994copyp1EtxEg$default(textStyle3, 0L, Snapshots.getNotScaledUp(textStyle3.spanStyle.fontSize, gapComposer7), null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777213);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer7, (Modifier) null, m994copyp1EtxEg$default2, (TextLineBalancing) null, Room.stringResource(gapComposer7, R.string.support_screenshot_done), (Map) null, (Function1) null, false);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                break;
            case 7:
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer8, R.string.contact_support_input_edit), (Map) null, (Function1) null, false);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                break;
            case 8:
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer9, R.string.contact_support_message_continue), (Map) null, (Function1) null, false);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                break;
            case 9:
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer10, R.string.support_screenshot_confirm_title), (Map) null, (Function1) null, false);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                break;
            case 10:
                Composer composer11 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer11, R.string.support_screenshot_confirm_content), (Map) null, (Function1) null, false);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                break;
            case 11:
                Composer composer12 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer12, R.string.support_screenshot_confirm_button_got_it), (Map) null, (Function1) null, false);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                break;
            case 12:
                Composer composer13 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer13, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer13, R.string.support_screenshot_review_quit_confirmation_button_quit), (Map) null, (Function1) null, false);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                break;
            case 13:
                Composer composer14 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer14, R.string.support_screenshot_review_button_take_more_screenshots), (Map) null, (Function1) null, false);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                break;
            case 14:
                Composer composer15 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer15, R.string.support_screenshot_review_button_send_screenshots), (Map) null, (Function1) null, false);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                break;
            case 15:
                Composer composer16 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer16, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer16, R.string.support_screenshot_review_button_take_more_screenshots), (Map) null, (Function1) null, false);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                break;
            case 16:
                RealSubcomposeAsyncImageScope realSubcomposeAsyncImageScope = (RealSubcomposeAsyncImageScope) obj;
                Composer composer17 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                realSubcomposeAsyncImageScope.getClass();
                if ((intValue17 & 6) == 0) {
                    intValue17 |= ((GapComposer) composer17).changed(realSubcomposeAsyncImageScope) ? 4 : 2;
                }
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 19) != 18)) {
                    ImageKt.Image(realSubcomposeAsyncImageScope.painter, null, SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f), 32.0f), null, ContentScale.Companion.Fit, RecyclerView.DECELERATION_RATE, null, gapComposer17, 25008, 104);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                break;
            case 17:
                Composer composer18 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer18, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer18, R.string.support_screenshot_review_button_cancel), (Map) null, (Function1) null, false);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                break;
            case 18:
                Composer composer19 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer19 = (GapComposer) composer19;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer19, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer19, R.string.support_screenshot_review_button_send_screenshots), (Map) null, (Function1) null, false);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                break;
            case 19:
                Composer composer20 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer20 = (GapComposer) composer20;
                if (gapComposer20.shouldExecute(intValue20 & 1, (intValue20 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer20, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer20, R.string.support_screenshot_review_send_failed_dialog_button_close), (Map) null, (Function1) null, false);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                break;
            case 20:
                Composer composer21 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer21 = (GapComposer) composer21;
                if (gapComposer21.shouldExecute(intValue21 & 1, (intValue21 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer21, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer21, R.string.support_screenshot_review_button_take_more_screenshots), (Map) null, (Function1) null, false);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                break;
            case 21:
                Composer composer22 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer22 = (GapComposer) composer22;
                if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer22, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer22, R.string.support_screenshot_review_button_remove), (Map) null, (Function1) null, false);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                break;
            case 22:
                Composer composer23 = (Composer) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                ((RealCellActivityAvatarScope) obj).getClass();
                GapComposer gapComposer23 = (GapComposer) composer23;
                if (gapComposer23.shouldExecute(intValue23 & 1, (intValue23 & 17) != 16)) {
                    AvatarSize avatarSize = AvatarSize.Size48;
                    Colors colors3 = (Colors) gapComposer23.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer23, -1762997026, gapComposer23, false);
                    } else {
                        gapComposer23.startReplaceGroup(-1762997739);
                        gapComposer23.end(false);
                    }
                    TextViewKt.m3613AvatarB_rZmmc(avatarSize, "", colors3.semantic.background.subtle, (String) null, (Modifier) null, (AvatarImage) null, (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer23, 3126, 0, 2032);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                break;
            case 23:
                RealCellActivityAccessoryScope realCellActivityAccessoryScope = (RealCellActivityAccessoryScope) obj;
                Composer composer24 = (Composer) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                realCellActivityAccessoryScope.getClass();
                if ((intValue24 & 6) == 0) {
                    intValue24 |= ((GapComposer) composer24).changed(realCellActivityAccessoryScope) ? 4 : 2;
                }
                GapComposer gapComposer24 = (GapComposer) composer24;
                if (gapComposer24.shouldExecute(intValue24 & 1, (intValue24 & 19) != 18)) {
                    realCellActivityAccessoryScope.amount(ScreenshotReviewViewKt.f701lambda$465933591);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                break;
            case 24:
                Composer composer25 = (Composer) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer25 = (GapComposer) composer25;
                if (gapComposer25.shouldExecute(intValue25 & 1, (intValue25 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer25, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer25, R.string.support_article_incident_notifications_close), (Map) null, (Function1) null, false);
                } else {
                    gapComposer25.skipToGroupEnd();
                }
                break;
            case 25:
                Composer composer26 = (Composer) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer26 = (GapComposer) composer26;
                if (gapComposer26.shouldExecute(intValue26 & 1, (intValue26 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer26, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer26, R.string.support_dispute_tracker_confirmation_button), (Map) null, (Function1) null, false);
                } else {
                    gapComposer26.skipToGroupEnd();
                }
                break;
            case 26:
                Composer composer27 = (Composer) obj2;
                int intValue27 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer27 = (GapComposer) composer27;
                if (gapComposer27.shouldExecute(intValue27 & 1, (intValue27 & 17) != 16)) {
                    ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer27, R.string.support_dispute_tracker_title), (Modifier) null, (String) null, (Function0) null, Room.stringResource(gapComposer27, R.string.support_dispute_tracker_subtitle), gapComposer27, 0, 14);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer27, null);
                } else {
                    gapComposer27.skipToGroupEnd();
                }
                break;
            case 27:
                Composer composer28 = (Composer) obj2;
                int intValue28 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer28 = (GapComposer) composer28;
                if (gapComposer28.shouldExecute(intValue28 & 1, (intValue28 & 17) != 16)) {
                    ScreenshotReviewViewKt.LoadMoreProgress(gapComposer28, 0);
                } else {
                    gapComposer28.skipToGroupEnd();
                }
                break;
            case 28:
                Composer composer29 = (Composer) obj2;
                int intValue29 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer29 = (GapComposer) composer29;
                if (gapComposer29.shouldExecute(intValue29 & 1, (intValue29 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer29, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer29, R.string.blockers_retrofit_error_negative), (Map) null, (Function1) null, false);
                } else {
                    gapComposer29.skipToGroupEnd();
                }
                break;
            default:
                Composer composer30 = (Composer) obj2;
                int intValue30 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer30 = (GapComposer) composer30;
                if (gapComposer30.shouldExecute(intValue30 & 1, (intValue30 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer30, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer30, R.string.support_home_contact_options_sheet_contact_hours_cta), (Map) null, (Function1) null, false);
                } else {
                    gapComposer30.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
