package com.squareup.cash.work.views.pay;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusOwnerImplKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import com.fillr.browsersdk.model.FillrWidget;
import com.google.android.gms.internal.mlkit_vision_common.zzb;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.overlays.RealOverlayLayer$show$3;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.wallet.views.HeroTagViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.wallet.views.WalletHomeViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewModel;
import com.squareup.cash.work.viewmodels.PayCellViewModel;
import com.squareup.cash.work.viewmodels.PayHistoryListViewModel;
import com.squareup.cash.work.viewmodels.PayHomeViewModel;
import com.squareup.cash.work.viewmodels.ScheduleCalendarViewModel;
import com.squareup.cash.work.viewmodels.ShiftListViewModel;
import com.squareup.cash.work.viewmodels.TakeBreakBottomSheetViewModel;
import com.squareup.cash.work.viewmodels.TaxFormsListViewModel;
import com.squareup.cash.work.views.SellerCardKt;
import com.squareup.cash.work.views.SellerCardShape;
import com.squareup.cash.work.views.SellerCardSize;
import com.squareup.cash.work.views.clockin.ClockInOverlayState;
import com.squareup.cash.work.views.clockin.ClockInOverlayTransitionsKt;
import com.squareup.cash.work.views.clockin.DisclaimerTextKt;
import com.squareup.cash.work.views.shift.ShiftListViewKt;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda4;
import com.squareup.scannerview.ScannerView;
import com.squareup.util.Strings;
import com.squareup.util.compose.ListsKt$$ExternalSyntheticLambda0;
import com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda5;
import com.stripe.android.financialconnections.exception.AccountNumberRetrievalError;
import com.stripe.android.financialconnections.features.common.IconSize;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupState;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationScreenKt;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationState;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.features.success.SuccessContentKt;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.ui.components.TextKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import defpackage.FinancialConnectionsGenericInfoScreen;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel$$ExternalSyntheticLambda4;
import okhttp3.internal.ws.RealWebSocket$connect$1;

/* loaded from: classes7.dex */
public final /* synthetic */ class PayCellViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ PayCellViewKt$$ExternalSyntheticLambda0(String str, SellerCardSize sellerCardSize, Modifier modifier, int i) {
        this.$r8$classId = 1;
        SellerCardShape sellerCardShape = SellerCardShape.Circle;
        this.f$0 = str;
        this.f$1 = sellerCardSize;
        this.f$2 = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj3 = this.f$2;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                PayCellViewKt.PayCellView((PayCellViewModel.Loaded) obj5, (Function0) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                SellerCardShape sellerCardShape = SellerCardShape.Circle;
                ((Integer) obj2).getClass();
                SellerCardKt.OverflowCountCard((String) obj5, (SellerCardSize) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                SellerCardKt.ScheduleCalendar((ScheduleCalendarViewModel) obj5, (Function1) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                SellerCardKt.ScheduleCalendarMonthGrid((YearMonth) obj5, (ScheduleCalendarViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                DisclaimerTextKt.ClockInOverlayLoadingErrorContent((ClockInOverlayViewModel) obj5, (PaddingValuesImpl) obj3, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                ClockInOverlayTransitionsKt.AnimatedClockInOverlaySection((Transition) obj5, (Function0) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                Transition transition = (Transition) obj5;
                ClockInOverlayState clockInOverlayState = (ClockInOverlayState) obj4;
                ClockInOverlayViewModel.Loaded loaded = (ClockInOverlayViewModel.Loaded) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    boolean booleanValue = ((Boolean) clockInOverlayState.isClockingIn$delegate.getValue()).booleanValue();
                    boolean booleanValue2 = ((Boolean) clockInOverlayState.isEndingBreak$delegate.getValue()).booleanValue();
                    boolean changed = gapComposer.changed(clockInOverlayState);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        RealOverlayLayer$show$3 realOverlayLayer$show$3 = new RealOverlayLayer$show$3(0, clockInOverlayState, ClockInOverlayState.class, "onStartShiftClicked", "onStartShiftClicked()V", 0, 13);
                        gapComposer.updateRememberedValue(realOverlayLayer$show$3);
                        rememberedValue = realOverlayLayer$show$3;
                    }
                    Function0 function0 = (Function0) ((KFunction) rememberedValue);
                    boolean changed2 = gapComposer.changed(clockInOverlayState) | gapComposer.changedInstance(loaded);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new ListsKt$$ExternalSyntheticLambda0(12, clockInOverlayState, loaded);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Function0 function02 = (Function0) rememberedValue2;
                    boolean changed3 = gapComposer.changed(clockInOverlayState);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        RealOverlayLayer$show$3 realOverlayLayer$show$32 = new RealOverlayLayer$show$3(0, clockInOverlayState, ClockInOverlayState.class, "onOpenAppSettingsClicked", "onOpenAppSettingsClicked()V", 0, 14);
                        gapComposer.updateRememberedValue(realOverlayLayer$show$32);
                        rememberedValue3 = realOverlayLayer$show$32;
                    }
                    Function0 function03 = (Function0) ((KFunction) rememberedValue3);
                    boolean changed4 = gapComposer.changed(clockInOverlayState);
                    Object rememberedValue4 = gapComposer.rememberedValue();
                    if (changed4 || rememberedValue4 == neverEqualPolicy) {
                        RealOverlayLayer$show$3 realOverlayLayer$show$33 = new RealOverlayLayer$show$3(0, clockInOverlayState, ClockInOverlayState.class, "onTakeBreakClicked", "onTakeBreakClicked()V", 0, 15);
                        gapComposer.updateRememberedValue(realOverlayLayer$show$33);
                        rememberedValue4 = realOverlayLayer$show$33;
                    }
                    Function0 function04 = (Function0) ((KFunction) rememberedValue4);
                    boolean changed5 = gapComposer.changed(clockInOverlayState);
                    Object rememberedValue5 = gapComposer.rememberedValue();
                    if (changed5 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new RealOverlayLayer$show$3(0, clockInOverlayState, ClockInOverlayState.class, "onClockOutClicked", "onClockOutClicked()V", 0, 16);
                        gapComposer.updateRememberedValue(rememberedValue5);
                    }
                    Function0 function05 = (Function0) ((KFunction) rememberedValue5);
                    boolean changed6 = gapComposer.changed(clockInOverlayState);
                    Object rememberedValue6 = gapComposer.rememberedValue();
                    if (changed6 || rememberedValue6 == neverEqualPolicy) {
                        RealOverlayLayer$show$3 realOverlayLayer$show$34 = new RealOverlayLayer$show$3(0, clockInOverlayState, ClockInOverlayState.class, "onEndBreakClicked", "onEndBreakClicked()V", 0, 17);
                        gapComposer.updateRememberedValue(realOverlayLayer$show$34);
                        rememberedValue6 = realOverlayLayer$show$34;
                    }
                    Function0 function06 = (Function0) ((KFunction) rememberedValue6);
                    boolean changed7 = gapComposer.changed(clockInOverlayState);
                    Object rememberedValue7 = gapComposer.rememberedValue();
                    if (changed7 || rememberedValue7 == neverEqualPolicy) {
                        ScannerView.AnonymousClass3 anonymousClass3 = new ScannerView.AnonymousClass3(1, clockInOverlayState, ClockInOverlayState.class, "onDisabledEndBreakClicked", "onDisabledEndBreakClicked(J)V", 0, 18);
                        gapComposer.updateRememberedValue(anonymousClass3);
                        rememberedValue7 = anonymousClass3;
                    }
                    ClockInOverlayTransitionsKt.AnimatedClockInOverlayFooter(transition, booleanValue, booleanValue2, function0, function02, function03, function04, function05, function06, (Function1) ((KFunction) rememberedValue7), gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                DisclaimerTextKt.ClockOutSummarySection((String) obj5, (String) obj4, (String) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 8:
                Function1 function1 = (Function1) obj5;
                TakeBreakBottomSheetViewModel takeBreakBottomSheetViewModel = (TakeBreakBottomSheetViewModel) obj4;
                MutableState mutableState = (MutableState) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean changed8 = gapComposer2.changed(function1);
                    Object rememberedValue8 = gapComposer2.rememberedValue();
                    if (changed8 || rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new PayHomeViewKt$$ExternalSyntheticLambda2(15, function1);
                        gapComposer2.updateRememberedValue(rememberedValue8);
                    }
                    SheetKt.Sheet((Function0) rememberedValue8, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(-1162189809, new BufferedChannel$$ExternalSyntheticLambda4(5, takeBreakBottomSheetViewModel, mutableState, function1), gapComposer2), gapComposer2, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                PayCellViewKt.PayHistoryListContent((PayHistoryListViewModel.Loaded) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                PayCellViewKt.PayHomeContent((PayHomeViewModel.Loaded) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                PayCellViewKt.TaxFormsListContent((TaxFormsListViewModel.Loaded) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 12:
                ShiftListViewModel shiftListViewModel = (ShiftListViewModel) obj5;
                Function1 function12 = (Function1) obj4;
                MutableState mutableState2 = (MutableState) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                BiasAlignment biasAlignment = Alignment.Companion.Center;
                GapComposer gapComposer3 = (GapComposer) composer3;
                boolean shouldExecute = gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2);
                Applier applier = gapComposer3.applier;
                if (shouldExecute) {
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(companion, 1.0f), Strings.getColors(gapComposer3).semantic.background.f1047app, ColorKt.RectangleShape);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    if (Intrinsics.areEqual(shiftListViewModel, ShiftListViewModel.Loading.INSTANCE)) {
                        gapComposer3.startReplaceGroup(-1015281276);
                        boolean changed9 = gapComposer3.changed(function12);
                        Object rememberedValue9 = gapComposer3.rememberedValue();
                        if (changed9 || rememberedValue9 == neverEqualPolicy) {
                            rememberedValue9 = new ShiftListViewKt$$ExternalSyntheticLambda4(0, function12);
                            gapComposer3.updateRememberedValue(rememberedValue9);
                        }
                        ShiftListViewKt.MinimalTitleBar((Function0) rememberedValue9, gapComposer3, 0);
                        Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                        int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, fillMaxSize);
                        gapComposer3.startReusableNode();
                        if (gapComposer3.inserting) {
                            gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer3.useNode();
                        }
                        Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                        ProgressCircularKt.ProgressCircular(0, 1, gapComposer3, null);
                        gapComposer3.end(true);
                        gapComposer3.end(false);
                    } else if (Intrinsics.areEqual(shiftListViewModel, ShiftListViewModel.Error.INSTANCE)) {
                        gapComposer3.startReplaceGroup(-1015013064);
                        boolean changed10 = gapComposer3.changed(function12);
                        Object rememberedValue10 = gapComposer3.rememberedValue();
                        if (changed10 || rememberedValue10 == neverEqualPolicy) {
                            rememberedValue10 = new ShiftListViewKt$$ExternalSyntheticLambda4(3, function12);
                            gapComposer3.updateRememberedValue(rememberedValue10);
                        }
                        ShiftListViewKt.MinimalTitleBar((Function0) rememberedValue10, gapComposer3, 0);
                        Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                        int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
                        Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, fillMaxSize2);
                        gapComposer3.startReusableNode();
                        if (gapComposer3.inserting) {
                            gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer3.useNode();
                        }
                        Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer3, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer3).semantic.text.standard, (Composer) gapComposer3, (Modifier) null, Strings.getTypography(gapComposer3).labelMedium, (TextLineBalancing) null, Room.stringResource(gapComposer3, R.string.work_views_shift_list_load_error), (Map) null, (Function1) null, false);
                        gapComposer3.end(true);
                        gapComposer3.end(false);
                    } else {
                        if (!(shiftListViewModel instanceof ShiftListViewModel.Loaded)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, -1141130631, false);
                        }
                        gapComposer3.startReplaceGroup(-1141105870);
                        ShiftListViewModel.Loaded loaded2 = (ShiftListViewModel.Loaded) shiftListViewModel;
                        Object rememberedValue11 = gapComposer3.rememberedValue();
                        if (rememberedValue11 == neverEqualPolicy) {
                            rememberedValue11 = new WalletHomeViewKt$$ExternalSyntheticLambda6(17, mutableState2);
                            gapComposer3.updateRememberedValue(rememberedValue11);
                        }
                        ShiftListViewKt.ShiftListLoadedContent(loaded2, function12, (Function0) rememberedValue11, gapComposer3, 3078);
                        gapComposer3.end(false);
                    }
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                ShiftListViewKt.ShiftListLoadedContent((ShiftListViewModel.Loaded) obj5, (Function1) obj3, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(3079));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                com.datadog.trace.util.Strings.AccountUpdateRequiredModalContent((NoticeSheetState.NoticeSheetContent.UpdateRequired) obj5, (Function0) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                ListItemKt.AccountNumberRetrievalErrorContent((AccountNumberRetrievalError) obj5, (Function0) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                IconSize iconSize = (IconSize) obj5;
                Painter painter = (Painter) obj4;
                String str = (String) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    ListItemKt.LocalIcon(iconSize, painter, str, gapComposer4, Painter.$stable << 3);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                FillrWidget.WidgetType.AnonymousClass1.GenericHeader((FinancialConnectionsGenericInfoScreen.Header) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(385));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                FillrWidget.WidgetType.AnonymousClass1.GenericBody((FinancialConnectionsGenericInfoScreen.Body) obj5, (Modifier) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                InstitutionPickerScreenKt.NoResultsTile((Modifier) obj3, (Boolean) obj5, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 20:
                NetworkingLinkSignupState.Payload payload = (NetworkingLinkSignupState.Payload) obj5;
                FocusRequester focusRequester = (FocusRequester) obj4;
                MutableState mutableState3 = (MutableState) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Object rememberedValue12 = gapComposer5.rememberedValue();
                    int i2 = 16;
                    if (rememberedValue12 == neverEqualPolicy) {
                        rememberedValue12 = new HeroTagViewKt$$ExternalSyntheticLambda7(i2, mutableState3);
                        gapComposer5.updateRememberedValue(rememberedValue12);
                    }
                    zzb.m2024PhoneNumberCollectionSectionfhH9uAM(payload.phoneController, FocusOwnerImplKt.onFocusChanged(companion, (Function1) rememberedValue12), Expect_jvmKt.rememberComposableLambda(171475711, new FieldBinding$$ExternalSyntheticLambda5(payload, i2), gapComposer5), ((Boolean) mutableState3.getValue()).booleanValue(), focusRequester, 1, gapComposer5, 805309510);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                NetworkingSaveToLinkVerificationScreenKt.NetworkingSaveToLinkVerificationContent((NetworkingSaveToLinkVerificationState) obj5, (Function0) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(9));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                SuccessContentKt.SuccessBody((TextResource) obj5, (TextResource) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                SuccessContentKt.SuccessContent((Async) obj5, (Async) obj3, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                TextKt.CloseButton((CoroutineScope) obj5, (RealWebSocket$connect$1) obj3, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                UiComponent uiComponent = (UiComponent) obj;
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                uiComponent.getClass();
                ((UiWorkflow.Screen.EntryScreen) obj5).onClick.invoke(uiComponent, bool, ((UiScreenRunner) obj4).getComponentsParams((ArrayList) obj3));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ PayCellViewKt$$ExternalSyntheticLambda0(Modifier modifier, Boolean bool, Function0 function0, int i) {
        this.$r8$classId = 19;
        this.f$2 = modifier;
        this.f$0 = bool;
        this.f$1 = function0;
    }

    public /* synthetic */ PayCellViewKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ PayCellViewKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Function function, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = function;
    }

    public /* synthetic */ PayCellViewKt$$ExternalSyntheticLambda0(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }
}
