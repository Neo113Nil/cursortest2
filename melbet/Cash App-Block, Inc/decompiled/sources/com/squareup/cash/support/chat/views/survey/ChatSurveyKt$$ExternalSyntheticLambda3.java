package com.squareup.cash.support.chat.views.survey;

import android.net.Uri;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.support.backend.api.disputesTracker.DisputeRow;
import com.squareup.cash.support.chat.views.transcript.message.ActionBodyViewKt;
import com.squareup.cash.support.chat.views.transcript.message.compose.MessageFileKt;
import com.squareup.cash.support.viewmodels.ScreenshotReviewViewModel;
import com.squareup.cash.support.views.ScreenshotReviewViewKt;
import com.squareup.cash.support.views.ScreenshotReviewViewKt$$ExternalSyntheticLambda4;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class ChatSurveyKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i2 = 2;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ChatSurveyKt.LoadingSurvey((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new ChatSurveyKt$$ExternalSyntheticLambda11(i2);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3836, 0L, (Composer) gapComposer2, SemanticsModifierKt.semantics(fillMaxWidth, false, (Function1) rememberedValue), (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer2, R.string.csat_survey_completed_title), (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3836, 0L, (Composer) gapComposer3, SizeKt.fillMaxWidth(companion, 1.0f), (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer3, R.string.csat_survey_completed_subtitle), (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                ActionBodyViewKt.LoadingContent((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    String stringResource = Room.stringResource(gapComposer4, R.string.support_chat_transaction_failed_to_load);
                    Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                    } else {
                        gapComposer4.startReplaceGroup(-1762997739);
                        gapComposer4.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, colors.semantic.text.placeholder, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    String stringResource2 = Room.stringResource(gapComposer5, R.string.support_chat_transaction_failed_to_load_retry);
                    Colors colors2 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                    } else {
                        gapComposer5.startReplaceGroup(-1762997739);
                        gapComposer5.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, colors2.semantic.text.subtle, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, stringResource2, (Map) null, (Function1) null, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                ActionBodyViewKt.ImagePlaceholderProgress((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                ActionBodyViewKt.ImagePlaceholderError((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    String stringResource3 = Room.stringResource(gapComposer6, R.string.support_chat_failed_delivery_resend);
                    TextStyle textStyle = ((Typography) gapComposer6.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                    Colors colors3 = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                    } else {
                        gapComposer6.startReplaceGroup(-1762997739);
                        gapComposer6.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors3.semantic.text.standard, (Composer) gapComposer6, (Modifier) null, textStyle, (TextLineBalancing) null, stringResource3, (Map) null, (Function1) null, false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.SendArrow24, (String) null, (Modifier) null, 0L, gapComposer7, 54, 12);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    String stringResource4 = Room.stringResource(gapComposer8, R.string.support_chat_failed_delivery_delete);
                    TextStyle textStyle2 = ((Typography) gapComposer8.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                    Colors colors4 = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                    } else {
                        gapComposer8.startReplaceGroup(-1762997739);
                        gapComposer8.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors4.semantic.text.standard, (Composer) gapComposer8, (Modifier) null, textStyle2, (TextLineBalancing) null, stringResource4, (Map) null, (Function1) null, false);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.Clear24, (String) null, (Modifier) null, 0L, gapComposer9, 54, 12);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    MessageFileKt.MessageTypingIndicator(null, gapComposer10, 0);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    Icons icons = Icons.CommEmail24;
                    Colors colors5 = (Colors) gapComposer11.consume(ArcadeThemeKt.LocalColors);
                    if (colors5 == null) {
                        colors5 = re$$ExternalSyntheticOutline0.m(gapComposer11, -1762997026, gapComposer11, false);
                    } else {
                        gapComposer11.startReplaceGroup(-1762997739);
                        gapComposer11.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, colors5.semantic.icon.standard, gapComposer11, 54, 4);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    Object rememberedValue2 = gapComposer12.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda4(10);
                        gapComposer12.updateRememberedValue(rememberedValue2);
                    }
                    ScreenshotReviewViewKt.ScreenshotConfirm((Function1) rememberedValue2, gapComposer12, 6);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(1 & intValue13, (intValue13 & 3) != 2)) {
                    ScreenshotReviewViewModel.Loaded loaded = new ScreenshotReviewViewModel.Loaded(EmptyList.INSTANCE, false);
                    Object rememberedValue3 = gapComposer13.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda4(11);
                        gapComposer13.updateRememberedValue(rememberedValue3);
                    }
                    ScreenshotReviewViewKt.ScreenshotReview(loaded, (Function1) rememberedValue3, gapComposer13, 48);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Composer composer14 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(1 & intValue14, (intValue14 & 3) != 2)) {
                    ScreenshotReviewViewModel.Loaded loaded2 = new ScreenshotReviewViewModel.Loaded(CollectionsKt__CollectionsKt.listOf((Object[]) new ScreenshotReviewViewModel.Screenshot[]{new ScreenshotReviewViewModel.Screenshot(Uri.parse("fake:///Money.png"), "Screenshot 1", null), new ScreenshotReviewViewModel.Screenshot(Uri.parse("fake:///BlueBottle.png"), "Screenshot 2", null), new ScreenshotReviewViewModel.Screenshot(Uri.parse("fake:///CurvyPaycheck.png"), "Screenshot 3", null)}), false);
                    Object rememberedValue4 = gapComposer14.rememberedValue();
                    if (rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda4(15);
                        gapComposer14.updateRememberedValue(rememberedValue4);
                    }
                    ScreenshotReviewViewKt.ScreenshotReview(loaded2, (Function1) rememberedValue4, gapComposer14, 48);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                Composer composer15 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    ScreenshotReviewViewModel.Loaded loaded3 = new ScreenshotReviewViewModel.Loaded(CollectionsKt__CollectionsKt.listOf((Object[]) new ScreenshotReviewViewModel.Screenshot[]{new ScreenshotReviewViewModel.Screenshot(Uri.parse("fake:///Money.png"), "Screenshot 1", null), new ScreenshotReviewViewModel.Screenshot(Uri.parse("fake:///BlueBottle.png"), "Screenshot 2", null), new ScreenshotReviewViewModel.Screenshot(Uri.parse("fake:///CurvyPaycheck.png"), "Screenshot 3", null)}), true);
                    Object rememberedValue5 = gapComposer15.rememberedValue();
                    if (rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda4(13);
                        gapComposer15.updateRememberedValue(rememberedValue5);
                    }
                    ScreenshotReviewViewKt.ScreenshotReview(loaded3, (Function1) rememberedValue5, gapComposer15, 48);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                Composer composer16 = (Composer) obj;
                int intValue16 = ((Integer) obj2).intValue();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2)) {
                    ScreenshotReviewViewModel.ViewingScreenshot viewingScreenshot = new ScreenshotReviewViewModel.ViewingScreenshot(CollectionsKt__CollectionsKt.listOf((Object[]) new ScreenshotReviewViewModel.Screenshot[]{new ScreenshotReviewViewModel.Screenshot(Uri.parse("fake:///Money.png"), "Screenshot 1", null), new ScreenshotReviewViewModel.Screenshot(Uri.parse("fake:///BlueBottle.png"), "Screenshot 2", null), new ScreenshotReviewViewModel.Screenshot(Uri.parse("fake:///CurvyPaycheck.png"), "Screenshot 3", null)}), "fake://profile.png");
                    Object rememberedValue6 = gapComposer16.rememberedValue();
                    if (rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda4(14);
                        gapComposer16.updateRememberedValue(rememberedValue6);
                    }
                    ScreenshotReviewViewKt.ScreenshotReview(viewingScreenshot, (Function1) rememberedValue6, gapComposer16, 48);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Composer composer17 = (Composer) obj;
                int intValue17 = ((Integer) obj2).intValue();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 3) != 2)) {
                    ScreenshotReviewViewModel.Screenshot screenshot = new ScreenshotReviewViewModel.Screenshot(Uri.parse("fake:///Money.png"), "Screenshot 1", ScreenshotReviewViewModel.UploadStatus.UPLOADED);
                    Uri parse = Uri.parse("fake:///BlueBottle.png");
                    ScreenshotReviewViewModel.UploadStatus uploadStatus = ScreenshotReviewViewModel.UploadStatus.UPLOADING;
                    ScreenshotReviewViewModel.Uploading uploading = new ScreenshotReviewViewModel.Uploading(1, 3, CollectionsKt__CollectionsKt.listOf((Object[]) new ScreenshotReviewViewModel.Screenshot[]{screenshot, new ScreenshotReviewViewModel.Screenshot(parse, "Screenshot 2", uploadStatus), new ScreenshotReviewViewModel.Screenshot(Uri.parse("fake:///CurvyPaycheck.png"), "Screenshot 3", uploadStatus)}));
                    Object rememberedValue7 = gapComposer17.rememberedValue();
                    if (rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda4(16);
                        gapComposer17.updateRememberedValue(rememberedValue7);
                    }
                    ScreenshotReviewViewKt.ScreenshotReview(uploading, (Function1) rememberedValue7, gapComposer17, 48);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                Composer composer18 = (Composer) obj;
                int intValue18 = ((Integer) obj2).intValue();
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 3) != 2)) {
                    Uri parse2 = Uri.parse("fake:///Money.png");
                    ScreenshotReviewViewModel.UploadStatus uploadStatus2 = ScreenshotReviewViewModel.UploadStatus.UPLOADED;
                    ScreenshotReviewViewModel.Uploaded uploaded = new ScreenshotReviewViewModel.Uploaded(CollectionsKt__CollectionsKt.listOf((Object[]) new ScreenshotReviewViewModel.Screenshot[]{new ScreenshotReviewViewModel.Screenshot(parse2, "Screenshot 1", uploadStatus2), new ScreenshotReviewViewModel.Screenshot(Uri.parse("fake:///BlueBottle.png"), "Screenshot 2", uploadStatus2), new ScreenshotReviewViewModel.Screenshot(Uri.parse("fake:///CurvyPaycheck.png"), "Screenshot 3", uploadStatus2)}), "Return to Chat");
                    Object rememberedValue8 = gapComposer18.rememberedValue();
                    if (rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda4(17);
                        gapComposer18.updateRememberedValue(rememberedValue8);
                    }
                    ScreenshotReviewViewKt.ScreenshotReview(uploaded, (Function1) rememberedValue8, gapComposer18, 48);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Composer composer19 = (Composer) obj;
                int intValue19 = ((Integer) obj2).intValue();
                GapComposer gapComposer19 = (GapComposer) composer19;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 3) != 2)) {
                    ScreenshotReviewViewModel.UploadFailed uploadFailed = new ScreenshotReviewViewModel.UploadFailed(CollectionsKt__CollectionsKt.listOf((Object[]) new ScreenshotReviewViewModel.Screenshot[]{new ScreenshotReviewViewModel.Screenshot(Uri.parse("fake:///Money.png"), "Screenshot 1", ScreenshotReviewViewModel.UploadStatus.UPLOADED), new ScreenshotReviewViewModel.Screenshot(Uri.parse("fake:///BlueBottle.png"), "Screenshot 2", ScreenshotReviewViewModel.UploadStatus.FAILED), new ScreenshotReviewViewModel.Screenshot(Uri.parse("fake:///CurvyPaycheck.png"), "Screenshot 3", null)}));
                    Object rememberedValue9 = gapComposer19.rememberedValue();
                    if (rememberedValue9 == neverEqualPolicy) {
                        rememberedValue9 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda4(12);
                        gapComposer19.updateRememberedValue(rememberedValue9);
                    }
                    ScreenshotReviewViewKt.ScreenshotReview(uploadFailed, (Function1) rememberedValue9, gapComposer19, 48);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                Composer composer20 = (Composer) obj;
                int intValue20 = ((Integer) obj2).intValue();
                GapComposer gapComposer20 = (GapComposer) composer20;
                if (gapComposer20.shouldExecute(intValue20 & 1, (intValue20 & 3) != 2)) {
                    ScreenshotReviewViewKt.m3752PlaceHolderBoxi1RSzL4(96.0f, 14.0f, gapComposer20, 54);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                Composer composer21 = (Composer) obj;
                int intValue21 = ((Integer) obj2).intValue();
                GapComposer gapComposer21 = (GapComposer) composer21;
                if (gapComposer21.shouldExecute(intValue21 & 1, (intValue21 & 3) != 2)) {
                    ScreenshotReviewViewKt.m3752PlaceHolderBoxi1RSzL4(48.0f, 14.0f, gapComposer21, 54);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                Composer composer22 = (Composer) obj;
                int intValue22 = ((Integer) obj2).intValue();
                GapComposer gapComposer22 = (GapComposer) composer22;
                if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 3) != 2)) {
                    ScreenshotReviewViewKt.m3752PlaceHolderBoxi1RSzL4(128.0f, 12.0f, gapComposer22, 54);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                Composer composer23 = (Composer) obj;
                int intValue23 = ((Integer) obj2).intValue();
                GapComposer gapComposer23 = (GapComposer) composer23;
                if (gapComposer23.shouldExecute(intValue23 & 1, (intValue23 & 3) != 2)) {
                    ScreenshotReviewViewKt.m3752PlaceHolderBoxi1RSzL4(64.0f, 12.0f, gapComposer23, 54);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                Composer composer24 = (Composer) obj;
                int intValue24 = ((Integer) obj2).intValue();
                GapComposer gapComposer24 = (GapComposer) composer24;
                if (gapComposer24.shouldExecute(intValue24 & 1, (intValue24 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer24, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer24, R.string.support_dispute_tracker_toolbar_title), (Map) null, (Function1) null, false);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                Composer composer25 = (Composer) obj;
                int intValue25 = ((Integer) obj2).intValue();
                GapComposer gapComposer25 = (GapComposer) composer25;
                if (gapComposer25.shouldExecute(intValue25 & 1, (intValue25 & 3) != 2)) {
                    AvatarSize avatarSize = AvatarSize.Size64;
                    Colors colors6 = (Colors) gapComposer25.consume(ArcadeThemeKt.LocalColors);
                    if (colors6 == null) {
                        colors6 = re$$ExternalSyntheticOutline0.m(gapComposer25, -1762997026, gapComposer25, false);
                    } else {
                        gapComposer25.startReplaceGroup(-1762997739);
                        gapComposer25.end(false);
                    }
                    TextViewKt.Avatar(avatarSize, new AvatarEntry("", colors6.semantic.background.extraProminent, null, new AvatarImage.LocalIcon(Icons.AlertFill32, 0L, 6), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer25, 6, 28);
                } else {
                    gapComposer25.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer26 = (Composer) obj;
                int intValue26 = ((Integer) obj2).intValue();
                GapComposer gapComposer26 = (GapComposer) composer26;
                if (gapComposer26.shouldExecute(intValue26 & 1, (intValue26 & 3) != 2)) {
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer26, 0);
                    int hashCode = Long.hashCode(gapComposer26.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer26.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer26, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer26.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer26.startReusableNode();
                    if (gapComposer26.inserting) {
                        gapComposer26.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer26.useNode();
                    }
                    Updater.m576setimpl(gapComposer26, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer26, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer26, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer26, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer26, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    DisputeRow disputeRow = new DisputeRow("id", "token", "Cash Card", "In Dispute", "$20", "29 Mar 2025", DisputeRow.TransactionType.CASH_CARD, "");
                    Object rememberedValue10 = gapComposer26.rememberedValue();
                    if (rememberedValue10 == neverEqualPolicy) {
                        rememberedValue10 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda4(20);
                        gapComposer26.updateRememberedValue(rememberedValue10);
                    }
                    ScreenshotReviewViewKt.Dispute(disputeRow, (Function1) rememberedValue10, gapComposer26, 54);
                    DisputeRow disputeRow2 = new DisputeRow("id", "token", "Unknown", "In Dispute", "$40.00", "29 Mar 2025", DisputeRow.TransactionType.UNKNOWN, "");
                    Object rememberedValue11 = gapComposer26.rememberedValue();
                    if (rememberedValue11 == neverEqualPolicy) {
                        rememberedValue11 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda4(21);
                        gapComposer26.updateRememberedValue(rememberedValue11);
                    }
                    ScreenshotReviewViewKt.Dispute(disputeRow2, (Function1) rememberedValue11, gapComposer26, 54);
                    DisputeRow disputeRow3 = new DisputeRow("id", "token", "Pay with Cash", "In Dispute", "$49.97", "29 Mar 2025", DisputeRow.TransactionType.PAY_WITH_CASH, null);
                    Object rememberedValue12 = gapComposer26.rememberedValue();
                    if (rememberedValue12 == neverEqualPolicy) {
                        rememberedValue12 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda4(22);
                        gapComposer26.updateRememberedValue(rememberedValue12);
                    }
                    ScreenshotReviewViewKt.Dispute(disputeRow3, (Function1) rememberedValue12, gapComposer26, 54);
                    DisputeRow disputeRow4 = new DisputeRow("id", "token", "Ach Transfer", "In Dispute", "$49.97", "29 Mar 2025", DisputeRow.TransactionType.ACH_TRANSFER, null);
                    Object rememberedValue13 = gapComposer26.rememberedValue();
                    if (rememberedValue13 == neverEqualPolicy) {
                        rememberedValue13 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda4(18);
                        gapComposer26.updateRememberedValue(rememberedValue13);
                    }
                    ScreenshotReviewViewKt.Dispute(disputeRow4, (Function1) rememberedValue13, gapComposer26, 54);
                    DisputeRow disputeRow5 = new DisputeRow("id", "token", "P2P Payment", "In Dispute", "$49.97", "29 Mar 2025", DisputeRow.TransactionType.P2P_PAYMENT, null);
                    Object rememberedValue14 = gapComposer26.rememberedValue();
                    if (rememberedValue14 == neverEqualPolicy) {
                        rememberedValue14 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda4(19);
                        gapComposer26.updateRememberedValue(rememberedValue14);
                    }
                    ScreenshotReviewViewKt.Dispute(disputeRow5, (Function1) rememberedValue14, gapComposer26, 54);
                    gapComposer26.end(true);
                } else {
                    gapComposer26.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
