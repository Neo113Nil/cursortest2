package com.squareup.cash.work.webview.views;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.support.viewmodels.ScreenshotReviewViewModel;
import com.squareup.cash.support.viewmodels.SupportFlowCheckConnectionViewModel;
import com.squareup.cash.support.views.ScreenshotReviewViewKt;
import com.squareup.cash.support.views.ScreenshotReviewViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.support.views.SupportFlowCheckConnectionView;
import com.squareup.cash.support.views.search.SupportSearchViewKt;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda8;
import com.squareup.cash.taptopay.views.TapToPayKt;
import com.squareup.cash.tax.views.TaxReturnsView$$ExternalSyntheticLambda0;
import com.squareup.cash.transfers.views.AddMoneyViewKt;
import com.squareup.cash.work.views.SellerCardKt;
import com.squareup.cash.work.views.clockin.DisclaimerTextKt;
import com.squareup.cash.work.views.pay.PayHomeViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes7.dex */
public final /* synthetic */ class WorkWebViewKt$$ExternalSyntheticLambda14 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ WorkWebViewKt$$ExternalSyntheticLambda14(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        int i2 = 5;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                modalButtonScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(modalButtonScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new ShiftListViewKt$$ExternalSyntheticLambda4(11, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    modalButtonScope.SecondaryModalButton((Function0) rememberedValue, null, false, WorkWebViewKt.f793lambda$867270804, gapComposer, ((intValue << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed2 = gapComposer2.changed(function1);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda0(7, function1);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, fillMaxWidth, buttonProminence, false, false, null, ScreenshotReviewViewKt.lambda$686376222, gapComposer2, 1573296, 56);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((ScreenshotReviewViewModel.UploadFailed) obj).getClass();
                ModalKt.Modal((Modifier) null, Room.stringResource(composer3, R.string.support_screenshot_review_send_failed_dialog_title), Room.stringResource(composer3, R.string.support_screenshot_review_send_failed_dialog_content), Expect_jvmKt.rememberComposableLambda(-2894851, new WorkWebViewKt$$ExternalSyntheticLambda14(r14, function1), composer3), (Function3) null, (Function3) null, composer3, 3072, 49);
                break;
            case 3:
                Composer composer4 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer4;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    String stringResource = Room.stringResource(gapComposer3, R.string.support_screenshot_review_title);
                    NavigationType navigationType = NavigationType.CLOSE;
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed3 = gapComposer3.changed(function1);
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda0(14, function1);
                        gapComposer3.updateRememberedValue(rememberedValue3);
                    }
                    DBUtil.TitleBarSub(stringResource, navigationType, fillMaxWidth2, (DynamicColorConfiguration) null, (Function0) rememberedValue3, (Modifier) null, (Function3) null, gapComposer3, 432, 104);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 4:
                ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj;
                Composer composer5 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                modalButtonScope2.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((GapComposer) composer5).changed(modalButtonScope2) ? 4 : 2;
                }
                GapComposer gapComposer4 = (GapComposer) composer5;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 19) != 18)) {
                    boolean changed4 = gapComposer4.changed(function1);
                    Object rememberedValue4 = gapComposer4.rememberedValue();
                    if (changed4 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda0(12, function1);
                        gapComposer4.updateRememberedValue(rememberedValue4);
                    }
                    modalButtonScope2.PrimaryModalButton((Function0) rememberedValue4, null, false, ScreenshotReviewViewKt.f695lambda$1734210168, gapComposer4, ((intValue4 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            case 5:
                ModalButtonScope modalButtonScope3 = (ModalButtonScope) obj;
                Composer composer6 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                modalButtonScope3.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((GapComposer) composer6).changed(modalButtonScope3) ? 4 : 2;
                }
                GapComposer gapComposer5 = (GapComposer) composer6;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 19) != 18)) {
                    boolean changed5 = gapComposer5.changed(function1);
                    Object rememberedValue5 = gapComposer5.rememberedValue();
                    if (changed5 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda0(13, function1);
                        gapComposer5.updateRememberedValue(rememberedValue5);
                    }
                    modalButtonScope3.PrimaryModalButton((Function0) rememberedValue5, null, false, ScreenshotReviewViewKt.lambda$1799708778, gapComposer5, ((intValue5 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
            case 6:
                ModalButtonScope modalButtonScope4 = (ModalButtonScope) obj;
                Composer composer7 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                modalButtonScope4.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((GapComposer) composer7).changed(modalButtonScope4) ? 4 : 2;
                }
                GapComposer gapComposer6 = (GapComposer) composer7;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 19) != 18)) {
                    boolean changed6 = gapComposer6.changed(function1);
                    Object rememberedValue6 = gapComposer6.rememberedValue();
                    if (changed6 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda0(15, function1);
                        gapComposer6.updateRememberedValue(rememberedValue6);
                    }
                    modalButtonScope4.SecondaryModalButton((Function0) rememberedValue6, null, false, ScreenshotReviewViewKt.lambda$1589843485, gapComposer6, ((intValue6 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                break;
            case 7:
                Composer composer8 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((ScreenshotReviewViewModel.Loaded) obj).getClass();
                ModalKt.Modal((Modifier) null, "", Room.stringResource(composer8, R.string.support_screenshot_review_quit_confirmation_content), Expect_jvmKt.rememberComposableLambda(-1536463905, new WorkWebViewKt$$ExternalSyntheticLambda14(i2, function1), composer8), Expect_jvmKt.rememberComposableLambda(1796878176, new WorkWebViewKt$$ExternalSyntheticLambda14(6, function1), composer8), (Function3) null, composer8, 27696, 33);
                break;
            case 8:
                SupportFlowCheckConnectionViewModel supportFlowCheckConnectionViewModel = (SupportFlowCheckConnectionViewModel) obj;
                Composer composer9 = (Composer) obj2;
                ((Integer) obj3).getClass();
                int i3 = SupportFlowCheckConnectionView.$r8$clinit;
                supportFlowCheckConnectionViewModel.getClass();
                String str = supportFlowCheckConnectionViewModel.title;
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                String str3 = supportFlowCheckConnectionViewModel.message;
                if (str3 == null) {
                    GapComposer gapComposer7 = (GapComposer) composer9;
                    str3 = re$$ExternalSyntheticOutline0.m(gapComposer7, -1533128808, R.string.blockers_retrofit_error_message, gapComposer7, false);
                } else {
                    GapComposer gapComposer8 = (GapComposer) composer9;
                    gapComposer8.startReplaceGroup(-1533129459);
                    gapComposer8.end(false);
                }
                ModalKt.Modal((Modifier) null, str2, str3, Expect_jvmKt.rememberComposableLambda(1476791324, new WorkWebViewKt$$ExternalSyntheticLambda14(9, function1), composer9), (Function3) null, (Function3) null, composer9, 3072, 49);
                break;
            case 9:
                ModalButtonScope modalButtonScope5 = (ModalButtonScope) obj;
                Composer composer10 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                int i4 = SupportFlowCheckConnectionView.$r8$clinit;
                modalButtonScope5.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((GapComposer) composer10).changed(modalButtonScope5) ? 4 : 2;
                }
                GapComposer gapComposer9 = (GapComposer) composer10;
                if (gapComposer9.shouldExecute(intValue7 & 1, (intValue7 & 19) != 18)) {
                    boolean changed7 = gapComposer9.changed(function1);
                    Object rememberedValue7 = gapComposer9.rememberedValue();
                    if (changed7 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda0(22, function1);
                        gapComposer9.updateRememberedValue(rememberedValue7);
                    }
                    modalButtonScope5.PrimaryModalButton((Function0) rememberedValue7, null, false, ScreenshotReviewViewKt.f691lambda$1434795663, gapComposer9, ((intValue7 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                break;
            case 10:
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                NavigationType navigationType2 = NavigationType.BACK;
                Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                GapComposer gapComposer10 = (GapComposer) ((Composer) obj2);
                boolean changed8 = gapComposer10.changed(function1);
                Object rememberedValue8 = gapComposer10.rememberedValue();
                if (changed8 || rememberedValue8 == neverEqualPolicy) {
                    rememberedValue8 = new TabToolbarsKt$$ExternalSyntheticLambda8(15, function1);
                    gapComposer10.updateRememberedValue(rememberedValue8);
                }
                DBUtil.TitleBarSub(SupportSearchViewKt.f715lambda$1496683404, navigationType2, fillMaxWidth3, (DynamicColorConfiguration) null, (Function0) rememberedValue8, (Modifier) null, (Function3) null, gapComposer10, 438, 104);
                break;
            case 11:
                Composer composer11 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    ButtonProminence buttonProminence2 = ButtonProminence.STANDARD;
                    Modifier fillMaxWidth4 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed9 = gapComposer11.changed(function1);
                    Object rememberedValue9 = gapComposer11.rememberedValue();
                    if (changed9 || rememberedValue9 == neverEqualPolicy) {
                        rememberedValue9 = new TabToolbarsKt$$ExternalSyntheticLambda8(22, function1);
                        gapComposer11.updateRememberedValue(rememberedValue9);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue9, fillMaxWidth4, buttonProminence2, false, false, null, TapToPayKt.f727lambda$731478733, gapComposer11, 1573296, 56);
                    ButtonProminence buttonProminence3 = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth5 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed10 = gapComposer11.changed(function1);
                    Object rememberedValue10 = gapComposer11.rememberedValue();
                    if (changed10 || rememberedValue10 == neverEqualPolicy) {
                        rememberedValue10 = new TabToolbarsKt$$ExternalSyntheticLambda8(23, function1);
                        gapComposer11.updateRememberedValue(rememberedValue10);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue10, fillMaxWidth5, buttonProminence3, false, false, null, TapToPayKt.lambda$1203116202, gapComposer11, 1573296, 56);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                break;
            case 12:
                Composer composer12 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    ButtonProminence buttonProminence4 = ButtonProminence.STANDARD;
                    Modifier fillMaxWidth6 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed11 = gapComposer12.changed(function1);
                    Object rememberedValue11 = gapComposer12.rememberedValue();
                    if (changed11 || rememberedValue11 == neverEqualPolicy) {
                        rememberedValue11 = new TabToolbarsKt$$ExternalSyntheticLambda8(27, function1);
                        gapComposer12.updateRememberedValue(rememberedValue11);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue11, fillMaxWidth6, buttonProminence4, false, false, null, TapToPayKt.f716lambda$1019311384, gapComposer12, 1573296, 56);
                    ButtonProminence buttonProminence5 = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth7 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed12 = gapComposer12.changed(function1);
                    Object rememberedValue12 = gapComposer12.rememberedValue();
                    if (changed12 || rememberedValue12 == neverEqualPolicy) {
                        rememberedValue12 = new TabToolbarsKt$$ExternalSyntheticLambda8(28, function1);
                        gapComposer12.updateRememberedValue(rememberedValue12);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue12, fillMaxWidth7, buttonProminence5, false, false, null, TapToPayKt.lambda$1701690065, gapComposer12, 1573296, 56);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                break;
            case 13:
                Composer composer13 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    ButtonProminence buttonProminence6 = ButtonProminence.PROMINENT;
                    boolean changed13 = gapComposer13.changed(function1);
                    Object rememberedValue13 = gapComposer13.rememberedValue();
                    if (changed13 || rememberedValue13 == neverEqualPolicy) {
                        rememberedValue13 = new TaxReturnsView$$ExternalSyntheticLambda0(20, function1);
                        gapComposer13.updateRememberedValue(rememberedValue13);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue13, null, buttonProminence6, false, false, null, AddMoneyViewKt.lambda$731418900, gapComposer13, 1573248, 58);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                break;
            case 14:
                Composer composer14 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    boolean changed14 = gapComposer14.changed(function1);
                    Object rememberedValue14 = gapComposer14.rememberedValue();
                    if (changed14 || rememberedValue14 == neverEqualPolicy) {
                        rememberedValue14 = new PayHomeViewKt$$ExternalSyntheticLambda2(5, function1);
                        gapComposer14.updateRememberedValue(rememberedValue14);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue14, null, ButtonProminence.PROMINENT, false, false, null, SellerCardKt.f752lambda$231248476, gapComposer14, 1573248, 58);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                break;
            case 15:
                ModalButtonScope modalButtonScope6 = (ModalButtonScope) obj;
                Composer composer15 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                modalButtonScope6.getClass();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((GapComposer) composer15).changed(modalButtonScope6) ? 4 : 2;
                }
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue12 & 1, (intValue12 & 19) != 18)) {
                    boolean changed15 = gapComposer15.changed(function1);
                    Object rememberedValue15 = gapComposer15.rememberedValue();
                    if (changed15 || rememberedValue15 == neverEqualPolicy) {
                        rememberedValue15 = new PayHomeViewKt$$ExternalSyntheticLambda2(13, function1);
                        gapComposer15.updateRememberedValue(rememberedValue15);
                    }
                    modalButtonScope6.PrimaryModalButton((Function0) rememberedValue15, null, false, DisclaimerTextKt.lambda$1122586290, gapComposer15, ((intValue12 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                break;
            case 16:
                Composer composer16 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    boolean changed16 = gapComposer16.changed(function1);
                    Object rememberedValue16 = gapComposer16.rememberedValue();
                    if (changed16 || rememberedValue16 == neverEqualPolicy) {
                        rememberedValue16 = new PayHomeViewKt$$ExternalSyntheticLambda2(14, function1);
                        gapComposer16.updateRememberedValue(rememberedValue16);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue16, null, null, false, false, null, DisclaimerTextKt.f769lambda$806405636, gapComposer16, 1572864, 62);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                break;
            default:
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                Composer composer17 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                titleBarActionScope.getClass();
                if ((intValue14 & 6) == 0) {
                    intValue14 |= ((GapComposer) composer17).changed(titleBarActionScope) ? 4 : 2;
                }
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue14 & 1, (intValue14 & 19) != 18)) {
                    Icons icons = Icons.NavigationMore;
                    String stringResource2 = Room.stringResource(gapComposer17, R.string.work_views_shift_detail_more_actions);
                    boolean changed17 = gapComposer17.changed(function1);
                    Object rememberedValue17 = gapComposer17.rememberedValue();
                    if (changed17 || rememberedValue17 == neverEqualPolicy) {
                        rememberedValue17 = new PayHomeViewKt$$ExternalSyntheticLambda2(29, function1);
                        gapComposer17.updateRememberedValue(rememberedValue17);
                    }
                    TransactorKt.IconAction(titleBarActionScope, icons, stringResource2, (Function0) rememberedValue17, null, null, null, null, null, null, false, gapComposer17, (intValue14 & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
