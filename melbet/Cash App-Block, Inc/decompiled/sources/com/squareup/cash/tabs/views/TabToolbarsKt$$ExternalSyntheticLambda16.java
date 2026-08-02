package com.squareup.cash.tabs.views;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.RemeasureImpl;
import androidx.compose.animation.ScaleToBoundsImpl;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.grid.LazyGridItemScopeImpl;
import androidx.compose.foundation.pager.PagerScopeImpl;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import app.cash.local.viewmodels.sheet.EducationalSheetModel;
import app.cash.local.viewmodels.sheet.EducationalSheetModelList;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.sheet.LoyaltySheetKt;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.play.core.splitinstall.internal.zzat;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.views.homesection.v3.AfterpayCardKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.HapticsKt;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.input.InputFieldKt;
import com.squareup.cash.arcade.components.internal.InputState;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.blockers.viewmodels.ReferralCodeViewModel;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda12;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionRowViewModel;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda14;
import com.squareup.cash.nearby.views.PulsingState$$ExternalSyntheticLambda0;
import com.squareup.cash.paymentpad.views.HomeViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel;
import com.squareup.cash.payments.viewmodels.RecurringDisabledInstrument;
import com.squareup.cash.payments.views.UtilKt$$ExternalSyntheticLambda0;
import com.squareup.cash.payments.views.WarningDialogViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.payments.views.composer.ErrorKt;
import com.squareup.cash.payments.views.composer.SelectRecipientKt;
import com.squareup.cash.score.views.CalloutKt;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda1;
import com.squareup.cash.score.views.ScoreDisplayContent;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda10;
import com.squareup.cash.sheet.PinnedKt$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.tabs.views.TabToolbarsKt;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda0;
import com.squareup.cash.work.applets.views.WorkApplet$applet$1;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.cash.Countries;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.ViewShowRenderingKt;
import com.stripe.android.uicore.image.StripeImageState;
import com.withpersona.sdk2.camera.CameraPreview;
import com.withpersona.sdk2.camera.GovernmentIdFeed;
import com.withpersona.sdk2.camera.SelfieDirectionFeed;
import com.withpersona.sdk2.inquiry.advancedCustomizations.AdvancedCustomizations;
import com.withpersona.sdk2.inquiry.advancedCustomizations.ViewControllerVersion;
import com.withpersona.sdk2.inquiry.featureflag.FeatureFlagManager;
import com.withpersona.sdk2.inquiry.featureflag.TipsFeatureFlag;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.cameraScreen.BasicGovIdCaptureViewController;
import com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner;
import com.withpersona.sdk2.inquiry.governmentid.cameraScreen.GovernmentIdCameraScreenViewFactory$1$viewController$1;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.cameraScreen.BasicSelfieCaptureViewController;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2SelfieCameraBinding;
import com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import dagger.Lazy;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.http2.Http2Connection$$ExternalSyntheticLambda3;
import operations.array.Map$evaluateLogic$1;

/* loaded from: classes6.dex */
public final /* synthetic */ class TabToolbarsKt$$ExternalSyntheticLambda16 implements Function4 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ TabToolbarsKt$$ExternalSyntheticLambda16(FocusRequester focusRequester, DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, Function1 function1, MutableState mutableState) {
        this.$r8$classId = 3;
        this.f$0 = focusRequester;
        this.f$1 = delegatingSoftwareKeyboardController;
        this.f$3 = function1;
        this.f$2 = mutableState;
    }

    private final Object invoke$com$squareup$cash$payments$views$PaymentConfigurationViewKt$$ExternalSyntheticLambda10(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        List list;
        Function1 function1 = (Function1) this.f$3;
        Context context = (Context) this.f$0;
        View view = (View) this.f$1;
        FocusRequester focusRequester = (FocusRequester) this.f$2;
        PaymentConfigurationViewModel paymentConfigurationViewModel = (PaymentConfigurationViewModel) obj2;
        Composer composer = (Composer) obj3;
        int intValue = ((Integer) obj4).intValue();
        ((AnimatedContentScopeImpl) obj).getClass();
        paymentConfigurationViewModel.getClass();
        boolean z2 = paymentConfigurationViewModel instanceof PaymentConfigurationViewModel.Loading;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (z2) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(-1909060282);
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new HomeViewKt$$ExternalSyntheticLambda8(29, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            boolean changed2 = gapComposer.changed(function1);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new WarningDialogViewKt$$ExternalSyntheticLambda5(6, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            ErrorKt.Loading(null, function0, (Function0) rememberedValue2, ((PaymentConfigurationViewModel.Loading) paymentConfigurationViewModel).status, gapComposer, 0);
            gapComposer.end(false);
        } else {
            boolean z3 = paymentConfigurationViewModel instanceof PaymentConfigurationViewModel.InputNote;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (z3) {
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(-1908708246);
                PaymentConfigurationViewModel.InputNote inputNote = (PaymentConfigurationViewModel.InputNote) paymentConfigurationViewModel;
                String str = inputNote.note;
                boolean z4 = inputNote.enableNext;
                String str2 = inputNote.buttonLabel;
                boolean changedInstance = gapComposer2.changedInstance(context) | gapComposer2.changedInstance(view) | gapComposer2.changed(function1);
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new BasicShieetScope$$ExternalSyntheticLambda10(context, view, function1, false, 9);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                Function0 function02 = (Function0) rememberedValue3;
                boolean changed3 = gapComposer2.changed(function1);
                Object rememberedValue4 = gapComposer2.rememberedValue();
                if (changed3 || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new UtilKt$$ExternalSyntheticLambda0(22, function1);
                    gapComposer2.updateRememberedValue(rememberedValue4);
                }
                ErrorKt.NoteInput(function02, z4, companion, (Function1) rememberedValue4, str, false, false, null, focusRequester, str2, gapComposer2, 102236544, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
                gapComposer2.end(false);
            } else if (paymentConfigurationViewModel instanceof PaymentConfigurationViewModel.InputAmount) {
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(1878118095);
                PaymentConfigurationViewModel.InputAmount inputAmount = (PaymentConfigurationViewModel.InputAmount) paymentConfigurationViewModel;
                boolean changed4 = gapComposer3.changed(function1);
                Object rememberedValue5 = gapComposer3.rememberedValue();
                if (changed4 || rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = new UtilKt$$ExternalSyntheticLambda0(23, function1);
                    gapComposer3.updateRememberedValue(rememberedValue5);
                }
                Function1 function12 = (Function1) rememberedValue5;
                boolean changed5 = gapComposer3.changed(function1);
                Object rememberedValue6 = gapComposer3.rememberedValue();
                if (changed5 || rememberedValue6 == neverEqualPolicy) {
                    rememberedValue6 = new WarningDialogViewKt$$ExternalSyntheticLambda5(11, function1);
                    gapComposer3.updateRememberedValue(rememberedValue6);
                }
                ErrorKt.InputAmount(inputAmount, function12, (Function0) rememberedValue6, gapComposer3, (intValue >> 3) & 14);
                gapComposer3.end(false);
            } else if (paymentConfigurationViewModel instanceof PaymentConfigurationViewModel.RequestShareOption) {
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startReplaceGroup(1878129984);
                PaymentConfigurationViewModel.RequestShareOption requestShareOption = (PaymentConfigurationViewModel.RequestShareOption) paymentConfigurationViewModel;
                boolean z5 = requestShareOption.createLinkInProgress;
                boolean z6 = requestShareOption.createLinkErrored;
                boolean changed6 = gapComposer4.changed(function1);
                Object rememberedValue7 = gapComposer4.rememberedValue();
                if (changed6 || rememberedValue7 == neverEqualPolicy) {
                    rememberedValue7 = new WarningDialogViewKt$$ExternalSyntheticLambda5(12, function1);
                    gapComposer4.updateRememberedValue(rememberedValue7);
                }
                Function0 function03 = (Function0) rememberedValue7;
                boolean changed7 = gapComposer4.changed(function1);
                Object rememberedValue8 = gapComposer4.rememberedValue();
                if (changed7 || rememberedValue8 == neverEqualPolicy) {
                    rememberedValue8 = new WarningDialogViewKt$$ExternalSyntheticLambda5(13, function1);
                    gapComposer4.updateRememberedValue(rememberedValue8);
                }
                ErrorKt.ShareRequest(z5, z6, function03, (Function0) rememberedValue8, requestShareOption.addRecipientAsPrimaryCtaEnabled, null, gapComposer4, 0);
                gapComposer4.end(false);
            } else if (paymentConfigurationViewModel instanceof PaymentConfigurationViewModel.ReviewPayment) {
                GapComposer gapComposer5 = (GapComposer) composer;
                gapComposer5.startReplaceGroup(-1906966821);
                PaymentConfigurationViewModel.ReviewPayment reviewPayment = (PaymentConfigurationViewModel.ReviewPayment) paymentConfigurationViewModel;
                InstrumentSelectionRowViewModel instrumentSelectionRowViewModel = reviewPayment.instrumentModel;
                boolean z7 = reviewPayment.showPersonalization;
                boolean z8 = reviewPayment.showScheduleButton;
                boolean z9 = reviewPayment.scheduleSelected;
                boolean z10 = reviewPayment.recurringDisabled;
                RecurringDisabledInstrument recurringDisabledInstrument = reviewPayment.recurringDisabledToast;
                Image image = reviewPayment.backgroundImage;
                Color color = reviewPayment.backgroundColor;
                List list2 = reviewPayment.backgroundEffects;
                String str3 = reviewPayment.previewAmount;
                Color color2 = reviewPayment.previewTextColor;
                List list3 = reviewPayment.previewStickers;
                String str4 = reviewPayment.buttonLabel;
                String str5 = reviewPayment.disclaimerText;
                List list4 = reviewPayment.transactionDetails;
                boolean changed8 = gapComposer5.changed(function1);
                Object rememberedValue9 = gapComposer5.rememberedValue();
                if (changed8 || rememberedValue9 == neverEqualPolicy) {
                    list = list4;
                    rememberedValue9 = new WarningDialogViewKt$$ExternalSyntheticLambda5(14, function1);
                    gapComposer5.updateRememberedValue(rememberedValue9);
                } else {
                    list = list4;
                }
                Function0 function04 = (Function0) rememberedValue9;
                boolean changed9 = gapComposer5.changed(function1);
                Object rememberedValue10 = gapComposer5.rememberedValue();
                if (changed9 || rememberedValue10 == neverEqualPolicy) {
                    rememberedValue10 = new UtilKt$$ExternalSyntheticLambda0(24, function1);
                    gapComposer5.updateRememberedValue(rememberedValue10);
                }
                Function1 function13 = (Function1) rememberedValue10;
                boolean changed10 = gapComposer5.changed(function1);
                Object rememberedValue11 = gapComposer5.rememberedValue();
                if (changed10 || rememberedValue11 == neverEqualPolicy) {
                    rememberedValue11 = new WarningDialogViewKt$$ExternalSyntheticLambda5(1, function1);
                    gapComposer5.updateRememberedValue(rememberedValue11);
                }
                Function0 function05 = (Function0) rememberedValue11;
                boolean changed11 = gapComposer5.changed(function1);
                Object rememberedValue12 = gapComposer5.rememberedValue();
                if (changed11 || rememberedValue12 == neverEqualPolicy) {
                    rememberedValue12 = new WarningDialogViewKt$$ExternalSyntheticLambda5(2, function1);
                    gapComposer5.updateRememberedValue(rememberedValue12);
                }
                Function0 function06 = (Function0) rememberedValue12;
                boolean changed12 = gapComposer5.changed(function1);
                Object rememberedValue13 = gapComposer5.rememberedValue();
                if (changed12 || rememberedValue13 == neverEqualPolicy) {
                    rememberedValue13 = new WarningDialogViewKt$$ExternalSyntheticLambda5(3, function1);
                    gapComposer5.updateRememberedValue(rememberedValue13);
                }
                Function0 function07 = (Function0) rememberedValue13;
                boolean changed13 = gapComposer5.changed(function1);
                Object rememberedValue14 = gapComposer5.rememberedValue();
                if (changed13 || rememberedValue14 == neverEqualPolicy) {
                    rememberedValue14 = new WarningDialogViewKt$$ExternalSyntheticLambda5(4, function1);
                    gapComposer5.updateRememberedValue(rememberedValue14);
                }
                Function0 function08 = (Function0) rememberedValue14;
                boolean changed14 = gapComposer5.changed(function1);
                Object rememberedValue15 = gapComposer5.rememberedValue();
                if (changed14 || rememberedValue15 == neverEqualPolicy) {
                    rememberedValue15 = new UtilKt$$ExternalSyntheticLambda0(16, function1);
                    gapComposer5.updateRememberedValue(rememberedValue15);
                }
                ErrorKt.ReviewPayment(null, function04, function13, function05, function06, function07, function08, (Function1) rememberedValue15, instrumentSelectionRowViewModel, z7, z8, z9, z10, recurringDisabledInstrument, image, color, list2, str3, color2, list3, str4, str5, list, gapComposer5, 0, 0, 1);
                gapComposer5.end(false);
            } else if (paymentConfigurationViewModel instanceof PaymentConfigurationViewModel.SelectStablecoinWithdrawalOption) {
                GapComposer gapComposer6 = (GapComposer) composer;
                gapComposer6.startReplaceGroup(1878207090);
                PaymentConfigurationViewModel.SelectStablecoinWithdrawalOption selectStablecoinWithdrawalOption = (PaymentConfigurationViewModel.SelectStablecoinWithdrawalOption) paymentConfigurationViewModel;
                boolean changed15 = gapComposer6.changed(function1);
                Object rememberedValue16 = gapComposer6.rememberedValue();
                if (changed15 || rememberedValue16 == neverEqualPolicy) {
                    rememberedValue16 = new UtilKt$$ExternalSyntheticLambda0(17, function1);
                    gapComposer6.updateRememberedValue(rememberedValue16);
                }
                ErrorKt.SelectStablecoinWithdrawalOption(selectStablecoinWithdrawalOption, (Function1) rememberedValue16, gapComposer6, (intValue >> 3) & 14);
                gapComposer6.end(false);
            } else {
                if (!(paymentConfigurationViewModel instanceof PaymentConfigurationViewModel.SelectRecipientMenu)) {
                    throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer, 1878083463, false);
                }
                GapComposer gapComposer7 = (GapComposer) composer;
                gapComposer7.startReplaceGroup(-1904773726);
                PaymentConfigurationViewModel.SelectRecipientMenu selectRecipientMenu = (PaymentConfigurationViewModel.SelectRecipientMenu) paymentConfigurationViewModel;
                List list5 = selectRecipientMenu.sections;
                String str6 = selectRecipientMenu.recipientSearchQuery;
                boolean z11 = selectRecipientMenu.loading;
                boolean z12 = selectRecipientMenu.showContactPermissionPrompt;
                boolean z13 = selectRecipientMenu.showSyncContactsRow;
                boolean z14 = selectRecipientMenu.showNoContactsFoundCard;
                boolean z15 = selectRecipientMenu.showQrCodeButton;
                boolean z16 = selectRecipientMenu.showSearchTooltip;
                boolean changed16 = gapComposer7.changed(function1);
                Object rememberedValue17 = gapComposer7.rememberedValue();
                if (changed16 || rememberedValue17 == neverEqualPolicy) {
                    rememberedValue17 = new UtilKt$$ExternalSyntheticLambda0(18, function1);
                    gapComposer7.updateRememberedValue(rememberedValue17);
                }
                Function1 function14 = (Function1) rememberedValue17;
                boolean changed17 = gapComposer7.changed(function1);
                Object rememberedValue18 = gapComposer7.rememberedValue();
                if (changed17 || rememberedValue18 == neverEqualPolicy) {
                    rememberedValue18 = new UtilKt$$ExternalSyntheticLambda0(19, function1);
                    gapComposer7.updateRememberedValue(rememberedValue18);
                }
                Function1 function15 = (Function1) rememberedValue18;
                boolean changed18 = gapComposer7.changed(function1);
                Object rememberedValue19 = gapComposer7.rememberedValue();
                if (changed18 || rememberedValue19 == neverEqualPolicy) {
                    rememberedValue19 = new UtilKt$$ExternalSyntheticLambda0(20, function1);
                    gapComposer7.updateRememberedValue(rememberedValue19);
                }
                Function1 function16 = (Function1) rememberedValue19;
                boolean changed19 = gapComposer7.changed(function1);
                Object rememberedValue20 = gapComposer7.rememberedValue();
                if (changed19 || rememberedValue20 == neverEqualPolicy) {
                    rememberedValue20 = new WarningDialogViewKt$$ExternalSyntheticLambda5(5, function1);
                    gapComposer7.updateRememberedValue(rememberedValue20);
                }
                Function0 function09 = (Function0) rememberedValue20;
                boolean changed20 = gapComposer7.changed(function1);
                Object rememberedValue21 = gapComposer7.rememberedValue();
                if (changed20 || rememberedValue21 == neverEqualPolicy) {
                    rememberedValue21 = new WarningDialogViewKt$$ExternalSyntheticLambda5(7, function1);
                    gapComposer7.updateRememberedValue(rememberedValue21);
                }
                Function0 function010 = (Function0) rememberedValue21;
                boolean changed21 = gapComposer7.changed(function1);
                Object rememberedValue22 = gapComposer7.rememberedValue();
                if (changed21 || rememberedValue22 == neverEqualPolicy) {
                    z = z16;
                    rememberedValue22 = new WarningDialogViewKt$$ExternalSyntheticLambda5(8, function1);
                    gapComposer7.updateRememberedValue(rememberedValue22);
                } else {
                    z = z16;
                }
                Function0 function011 = (Function0) rememberedValue22;
                boolean changed22 = gapComposer7.changed(function1);
                Object rememberedValue23 = gapComposer7.rememberedValue();
                if (changed22 || rememberedValue23 == neverEqualPolicy) {
                    rememberedValue23 = new UtilKt$$ExternalSyntheticLambda0(21, function1);
                    gapComposer7.updateRememberedValue(rememberedValue23);
                }
                Function1 function17 = (Function1) rememberedValue23;
                boolean changed23 = gapComposer7.changed(function1);
                Object rememberedValue24 = gapComposer7.rememberedValue();
                if (changed23 || rememberedValue24 == neverEqualPolicy) {
                    rememberedValue24 = new WarningDialogViewKt$$ExternalSyntheticLambda5(9, function1);
                    gapComposer7.updateRememberedValue(rememberedValue24);
                }
                SelectRecipientKt.SelectRecipient(companion, focusRequester, function14, function15, function16, function09, function010, function011, function17, (Function0) rememberedValue24, list5, str6, z11, z12, z13, z14, z15, z, gapComposer7, 54);
                gapComposer7.end(false);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        SharedToolbarSwipeScope sharedToolbarSwipeScope;
        Modifier modifier;
        float f;
        boolean z2;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        boolean z3;
        long j;
        Modifier.Companion companion;
        int i;
        Composer composer;
        RealSheetState realSheetState;
        Function1 function1;
        RealSheetState realSheetState2;
        int i2;
        int i3;
        int i4 = this.$r8$classId;
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i5 = 3;
        Object obj5 = this.f$3;
        Object obj6 = this.f$2;
        Object obj7 = this.f$1;
        Object obj8 = this.f$0;
        switch (i4) {
            case 0:
                TabToolbarInternalViewModel.TextButton textButton = (TabToolbarInternalViewModel.TextButton) obj8;
                SharedToolbarSwipeScope sharedToolbarSwipeScope2 = (SharedToolbarSwipeScope) obj7;
                MoneybotToolbarSharedElementConfig moneybotToolbarSharedElementConfig = (MoneybotToolbarSharedElementConfig) obj6;
                Function1 function12 = (Function1) obj5;
                Modifier modifier2 = (Modifier) obj;
                SwipeControlStyle swipeControlStyle = (SwipeControlStyle) obj2;
                Composer composer2 = (Composer) obj3;
                int intValue = ((Integer) obj4).intValue();
                modifier2.getClass();
                int i6 = (intValue & 6) == 0 ? (((GapComposer) composer2).changed(modifier2) ? 4 : 2) | intValue : intValue;
                if ((intValue & 48) == 0) {
                    i6 |= ((GapComposer) composer2).changed(swipeControlStyle) ? 32 : 16;
                }
                GapComposer gapComposer = (GapComposer) composer2;
                boolean shouldExecute = gapComposer.shouldExecute(i6 & 1, (i6 & 147) != 146);
                Applier applier = gapComposer.applier;
                if (shouldExecute) {
                    BiasAlignment biasAlignment = Alignment.Companion.Center;
                    Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(modifier2, 52.0f, RecyclerView.DECELERATION_RATE, 2);
                    textButton.getClass();
                    TabToolbarInternalViewModel.ToolbarButton.Id id = TabToolbarInternalViewModel.ToolbarButton.Id.Moneybot;
                    ToolbarTuckTargets toolbarTuckTargets = sharedToolbarSwipeScope2 != null ? sharedToolbarSwipeScope2.tuckTargets : null;
                    Modifier modifier3 = Modifier.Companion.$$INSTANCE;
                    Modifier then = m279heightInVpY3zN4$default.then(TabToolbarsKt.reportTuckCorner(modifier3, toolbarTuckTargets, true));
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        z = false;
                        rememberedValue = new TabToolbarsKt$$ExternalSyntheticLambda28(0);
                        gapComposer.updateRememberedValue(rememberedValue);
                    } else {
                        z = false;
                    }
                    Modifier semantics = SemanticsModifierKt.semantics(then, true, (Function1) rememberedValue);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    gapComposer.startReplaceGroup(-899242773);
                    gapComposer.startReplaceGroup(-899249477);
                    gapComposer.startReplaceGroup(-899270218);
                    if (moneybotToolbarSharedElementConfig != null) {
                        gapComposer.startReplaceGroup(-899266078);
                        SharedTransitionScope sharedTransitionScope = moneybotToolbarSharedElementConfig.sharedTransitionScope;
                        f = 9999.0f;
                        sharedToolbarSwipeScope = sharedToolbarSwipeScope2;
                        SharedTransitionScope.SharedContentState rememberSharedContentState = sharedTransitionScope.rememberSharedContentState(moneybotToolbarSharedElementConfig.leadingButtonKey, gapComposer, 0);
                        AnimatedVisibilityScope animatedVisibilityScope = moneybotToolbarSharedElementConfig.animatedVisibilityScope;
                        ScaleToBoundsImpl scaleToBounds$default = RemeasureImpl.scaleToBounds$default(SharedTransitionScope.ResizeMode.Companion, ContentScale.Companion.None);
                        ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        Object obj9 = DefaultSizes.border.entries;
                        modifier3 = SharedTransitionScope.sharedBounds$default(sharedTransitionScope, modifier3, rememberSharedContentState, animatedVisibilityScope, null, null, null, scaleToBounds$default, sharedTransitionScope.OverlayClip(RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f)), 476);
                        modifier = modifier3;
                        z2 = false;
                        gapComposer.end(false);
                    } else {
                        sharedToolbarSwipeScope = sharedToolbarSwipeScope2;
                        modifier = modifier3;
                        f = 9999.0f;
                        z2 = false;
                    }
                    gapComposer.end(z2);
                    Modifier modifier4 = modifier;
                    Modifier then2 = modifier3.then(TabToolbarsKt.swipeToolbarEntryPoint(modifier, sharedToolbarSwipeScope, null, gapComposer, 6, 2));
                    gapComposer.end(z2);
                    Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(then2, 44.0f);
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    Object obj10 = DefaultSizes.border.entries;
                    Modifier clip = ClipKt.clip(m277height3ABfNKs, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(f));
                    TabToolbarInternalViewModel.ButtonBackgroundType buttonBackgroundType = TabToolbarInternalViewModel.ButtonBackgroundType.NONE;
                    TabToolbarInternalViewModel.ButtonBackgroundType buttonBackgroundType2 = TabToolbarInternalViewModel.ButtonBackgroundType.NONE;
                    if (TabToolbarsKt.WhenMappings.$EnumSwitchMapping$1[2] == 1) {
                        gapComposer.startReplaceGroup(-774140459);
                        androidx.compose.ui.graphics.Color color = swipeControlStyle != null ? new androidx.compose.ui.graphics.Color(swipeControlStyle.scrimColor) : null;
                        if (color == null) {
                            gapComposer.startReplaceGroup(2053239228);
                            j = androidx.compose.ui.graphics.Color.m675copywmQWz5c$default(0.08f, ((androidx.compose.ui.graphics.Color) gapComposer.consume(ArcadeThemeKt.LocalIconColor)).value, 14);
                            z3 = false;
                            gapComposer.end(false);
                        } else {
                            z3 = false;
                            gapComposer.startReplaceGroup(2053237709);
                            gapComposer.end(false);
                            j = color.value;
                        }
                        gapComposer.end(z3);
                        layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                    } else {
                        gapComposer.startReplaceGroup(-774045351);
                        layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                        androidx.compose.ui.graphics.Color color2 = swipeControlStyle != null ? new androidx.compose.ui.graphics.Color(swipeControlStyle.solidColor) : null;
                        if (color2 == null) {
                            gapComposer.startReplaceGroup(2053241583);
                            j = TabToolbarsKt.toolbarActionBackground(id, gapComposer);
                            z3 = false;
                            gapComposer.end(false);
                        } else {
                            z3 = false;
                            gapComposer.startReplaceGroup(2053240777);
                            gapComposer.end(false);
                            j = color2.value;
                        }
                        gapComposer.end(z3);
                    }
                    Modifier then3 = clip.then(ImageKt.m177backgroundbw27NRU(modifier4, j, ColorKt.RectangleShape));
                    gapComposer.end(z3);
                    boolean changed = gapComposer.changed(function12) | gapComposer.changedInstance(textButton);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new TaxWebAppBridge$$ExternalSyntheticLambda0(16, function12, textButton);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Function0 withHaptics = PlatformKt.withHaptics((Function0) rememberedValue2, ((Haptics) gapComposer.consume(HapticsKt.LocalHaptics)).input.standard, gapComposer, 0, 0);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                    }
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(ImageKt.m182clickableO2vRcR0$default(then3, (MutableInteractionSourceImpl) rememberedValue3, RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer, 0, 15), false, null, new Role(0), withHaptics, 12), 16.0f, 4.0f);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, ((androidx.compose.ui.graphics.Color) gapComposer.consume(ArcadeThemeKt.LocalIconColor)).value, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, textButton.text, (Map) null, (Function1) null, false);
                    gapComposer.end(true);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                RealSheetState realSheetState3 = (RealSheetState) obj7;
                Function1 function13 = (Function1) obj5;
                int intValue2 = ((Integer) obj2).intValue();
                Composer composer3 = (Composer) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                ((PagerScopeImpl) obj).getClass();
                EducationalSheetModel educationalSheetModel = (EducationalSheetModel) ((EducationalSheetModelList) obj8).sheets.get(intValue2);
                ScrollState rememberScrollState = ImageKt.rememberScrollState(composer3);
                ((MutableState) obj6).setValue(Boolean.valueOf(rememberScrollState.getCanScrollForward()));
                float expandProgress = realSheetState3.getExpandProgress() < 0.75f ? RecyclerView.DECELERATION_RATE : (realSheetState3.getExpandProgress() - 0.75f) * 4.0f;
                Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
                Modifier fillMaxSize = SizeKt.fillMaxSize(companion3, 1.0f);
                if (educationalSheetModel.closeButtonAction != null) {
                    companion = companion3;
                    fillMaxSize = fillMaxSize.then(SpacerKt.m302paddingqDBjuR0$default(companion3, RecyclerView.DECELERATION_RATE, (1.0f - expandProgress) * 44.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13));
                } else {
                    companion = companion3;
                }
                Modifier verticalScroll$default = ImageKt.verticalScroll$default(fillMaxSize, rememberScrollState, false, 14);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer3, 0);
                GapComposer gapComposer2 = (GapComposer) composer3;
                int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(composer3, verticalScroll$default);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer3.startReusableNode();
                if (gapComposer3.inserting) {
                    gapComposer3.createNode(layoutNode$Companion$Constructor$13);
                } else {
                    gapComposer3.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(composer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$15);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(composer3, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$16);
                Integer valueOf2 = Integer.valueOf(hashCode3);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(composer3, valueOf2, composeUiNode$Companion$SetModifier$17);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(composer3, ownerSnapshotObserver$onCommitAffectingLayout$12);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(composer3, materializeModifier3, composeUiNode$Companion$SetModifier$18);
                if (educationalSheetModel.closeButtonAction != null) {
                    gapComposer3.startReplaceGroup(-1273530878);
                    boolean changed2 = gapComposer3.changed(expandProgress);
                    Object rememberedValue4 = gapComposer3.rememberedValue();
                    if (changed2 || rememberedValue4 == neverEqualPolicy) {
                        realSheetState = realSheetState3;
                        rememberedValue4 = new PulsingState$$ExternalSyntheticLambda0(expandProgress, 2);
                        gapComposer3.updateRememberedValue(rememberedValue4);
                    } else {
                        realSheetState = realSheetState3;
                    }
                    Modifier clip2 = ClipKt.clip(SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(Request$Priority$EnumUnboxingLocalUtility.m(Alignment.Companion.End, ColorKt.graphicsLayer(companion, (Function1) rememberedValue4)), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12.0f, 7), 32.0f), RoundedCornerShapeKt.CircleShape);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                    Colors colors = (Colors) gapComposer3.consume(staticProvidableCompositionLocal);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(clip2, colors.semantic.background.subtle, ColorKt.RectangleShape);
                    boolean changed3 = gapComposer3.changed(function13) | ((((intValue3 & 112) ^ 48) > 32 && gapComposer3.changed(intValue2)) || (intValue3 & 48) == 32) | gapComposer3.changedInstance(educationalSheetModel);
                    Object rememberedValue5 = gapComposer3.rememberedValue();
                    if (changed3 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new Http2Connection$$ExternalSyntheticLambda3(function13, intValue2, educationalSheetModel, 2);
                        gapComposer3.updateRememberedValue(rememberedValue5);
                    }
                    Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(m177backgroundbw27NRU, false, null, null, (Function0) rememberedValue5, 15);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode4 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(composer3, m183clickableoSLSa3U$default);
                    gapComposer3.startReusableNode();
                    i = intValue2;
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(composer3, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$15);
                    Updater.m576setimpl(composer3, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$16);
                    Request$Priority$EnumUnboxingLocalUtility.m(hashCode4, composer3, composeUiNode$Companion$SetModifier$17, composer3, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    Updater.m576setimpl(composer3, materializeModifier4, composeUiNode$Companion$SetModifier$18);
                    Modifier align = boxScopeInstance.align(SizeKt.m285size3ABfNKs(companion, 12.0f), Alignment.Companion.Center);
                    Painter painter = Icons.NavigationClose.painter(composer3);
                    Colors colors2 = (Colors) gapComposer3.consume(staticProvidableCompositionLocal);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    long j2 = colors2.semantic.icon.standard;
                    ImageKt.Image(painter, null, align, null, ContentScale.Companion.Fit, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j2, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j2), ColorKt.m693toAndroidBlendModes9anfk8(5))), composer3, Painter.$stable | 24624, 40);
                    composer = composer3;
                    gapComposer3.end(true);
                    gapComposer3.end(false);
                } else {
                    i = intValue2;
                    composer = composer3;
                    realSheetState = realSheetState3;
                    gapComposer3.startReplaceGroup(-1272700574);
                    gapComposer3.end(false);
                }
                gapComposer3.startReplaceGroup(1344420237);
                ArrayList arrayList = educationalSheetModel.visibleContents;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    EducationalSheetModel.Content content = (EducationalSheetModel.Content) arrayList.get(i7);
                    if (content instanceof EducationalSheetModel.Image.HeroImage) {
                        gapComposer3.startReplaceGroup(1906056914);
                        LoyaltySheetKt.EducationalHeroImage(null, (EducationalSheetModel.Image.HeroImage) content, composer, 6);
                        gapComposer3.end(false);
                    } else if (content instanceof EducationalSheetModel.Image.TiledHeroImage) {
                        gapComposer3.startReplaceGroup(1906060004);
                        LoyaltySheetKt.EducationalTiledHeroImage(null, (EducationalSheetModel.Image.TiledHeroImage) content, i, function13, composer, (intValue3 << 3) & 896, 1);
                        gapComposer3.end(false);
                    } else {
                        Function1 function14 = function13;
                        int i8 = i;
                        if (content instanceof EducationalSheetModel.Image.MiniCard) {
                            gapComposer3.startReplaceGroup(1906065879);
                            LoyaltySheetKt.EducationalMiniCard(null, ((EducationalSheetModel.Image.MiniCard) content).model, composer, 0);
                            gapComposer3.end(false);
                            i = i8;
                            function13 = function14;
                        } else if (content instanceof EducationalSheetModel.Text) {
                            gapComposer3.startReplaceGroup(1906068729);
                            LoyaltySheetKt.EducationalText(null, (EducationalSheetModel.Text) content, i8, function14, composer, 6 | ((intValue3 << 6) & 7168), 1);
                            i = i8;
                            function13 = function14;
                            gapComposer3.end(false);
                        } else {
                            i = i8;
                            function13 = function14;
                            if (!(content instanceof EducationalSheetModel.NumberedList)) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, 1906055935, false);
                            }
                            gapComposer3.startReplaceGroup(1906072973);
                            ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                            DefaultSizes.spacing.getClass();
                            LocalMapKt.LocalNumberedList(0, composer, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 32.0f, 7), ((EducationalSheetModel.NumberedList) content).items);
                            gapComposer3.end(false);
                        }
                    }
                }
                gapComposer3.end(false);
                gapComposer3.startReplaceGroup(1344446665);
                ArrayList arrayList2 = educationalSheetModel.collapsedContents;
                int size2 = arrayList2.size();
                int i9 = 0;
                while (i9 < size2) {
                    EducationalSheetModel.Content content2 = (EducationalSheetModel.Content) arrayList2.get(i9);
                    if (content2 instanceof EducationalSheetModel.Image.HeroImage) {
                        gapComposer3.startReplaceGroup(-845685685);
                        LoyaltySheetKt.EducationalHeroImage(null, (EducationalSheetModel.Image.HeroImage) content2, composer, 6);
                        gapComposer3.end(false);
                        function1 = function13;
                        realSheetState2 = realSheetState;
                        i3 = i5;
                        i2 = i;
                    } else {
                        if (content2 instanceof EducationalSheetModel.Image.TiledHeroImage) {
                            gapComposer3.startReplaceGroup(-845682442);
                            realSheetState2 = realSheetState;
                            boolean changed4 = gapComposer3.changed(realSheetState2);
                            Object rememberedValue6 = gapComposer3.rememberedValue();
                            if (changed4 || rememberedValue6 == neverEqualPolicy) {
                                rememberedValue6 = new PinnedKt$$ExternalSyntheticLambda0(realSheetState2, 1);
                                gapComposer3.updateRememberedValue(rememberedValue6);
                            }
                            function1 = function13;
                            i2 = i;
                            LoyaltySheetKt.EducationalTiledHeroImage(ColorKt.graphicsLayer(companion, (Function1) rememberedValue6), (EducationalSheetModel.Image.TiledHeroImage) content2, i2, function1, composer, (intValue3 << 3) & 896, 0);
                            gapComposer3.end(false);
                        } else {
                            function1 = function13;
                            realSheetState2 = realSheetState;
                            i2 = i;
                            if (content2 instanceof EducationalSheetModel.Image.MiniCard) {
                                gapComposer3.startReplaceGroup(-845673744);
                                LoyaltySheetKt.EducationalMiniCard(null, ((EducationalSheetModel.Image.MiniCard) content2).model, composer, 0);
                                gapComposer3.end(false);
                            } else {
                                if (content2 instanceof EducationalSheetModel.Text) {
                                    gapComposer3.startReplaceGroup(-845670676);
                                    boolean changed5 = gapComposer3.changed(realSheetState2);
                                    Object rememberedValue7 = gapComposer3.rememberedValue();
                                    if (changed5 || rememberedValue7 == neverEqualPolicy) {
                                        rememberedValue7 = new PinnedKt$$ExternalSyntheticLambda0(realSheetState2, 2);
                                        gapComposer3.updateRememberedValue(rememberedValue7);
                                    }
                                    LoyaltySheetKt.EducationalText(ColorKt.graphicsLayer(companion, (Function1) rememberedValue7), (EducationalSheetModel.Text) content2, i2, function1, composer, 6 | ((intValue3 << 6) & 7168), 0);
                                    gapComposer3.end(false);
                                    i3 = i5;
                                } else {
                                    if (!(content2 instanceof EducationalSheetModel.NumberedList)) {
                                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, -845686384, false);
                                    }
                                    gapComposer3.startReplaceGroup(-845661503);
                                    boolean changed6 = gapComposer3.changed(realSheetState2);
                                    Object rememberedValue8 = gapComposer3.rememberedValue();
                                    if (changed6 || rememberedValue8 == neverEqualPolicy) {
                                        i3 = i5;
                                        rememberedValue8 = new PinnedKt$$ExternalSyntheticLambda0(realSheetState2, i3);
                                        gapComposer3.updateRememberedValue(rememberedValue8);
                                    } else {
                                        i3 = i5;
                                    }
                                    Modifier graphicsLayer = ColorKt.graphicsLayer(companion, (Function1) rememberedValue8);
                                    ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                    DefaultSizes.spacing.getClass();
                                    LocalMapKt.LocalNumberedList(0, composer, SpacerKt.m302paddingqDBjuR0$default(graphicsLayer, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 32.0f, 7), ((EducationalSheetModel.NumberedList) content2).items);
                                    gapComposer3.end(false);
                                }
                                i9++;
                                i5 = i3;
                                realSheetState = realSheetState2;
                                i = i2;
                                function13 = function1;
                            }
                        }
                        i3 = i5;
                    }
                    i9++;
                    i5 = i3;
                    realSheetState = realSheetState2;
                    i = i2;
                    function13 = function1;
                }
                gapComposer3.end(false);
                gapComposer3.end(true);
                return Unit.INSTANCE;
            case 2:
                List list = (List) obj8;
                PagerState pagerState = (PagerState) obj7;
                CoroutineScope coroutineScope = (CoroutineScope) obj6;
                Function1 function15 = (Function1) obj5;
                int intValue4 = ((Integer) obj2).intValue();
                Composer composer4 = (Composer) obj3;
                int intValue5 = ((Integer) obj4).intValue();
                ((PagerScopeImpl) obj).getClass();
                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.CarouselTile carouselTile = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.CarouselTile) list.get(intValue4 % list.size());
                float abs = Math.abs(((ParcelableSnapshotMutableFloatState) pagerState.scrollPosition.fieldSortOrder).getFloatValue() + (((ParcelableSnapshotMutableIntState) pagerState.scrollPosition.elementTypes).getIntValue() - intValue4));
                float f2 = abs > 2.0f ? 2.0f : abs;
                float lerp = f2 <= 1.0f ? TransactorKt.lerp(1.0f, 0.8f, f2) : TransactorKt.lerp(0.8f, 0.6f, f2 - 1.0f);
                float lerp2 = f2 <= 0.7f ? TransactorKt.lerp(1.0f, 0.7f, f2 / 0.7f) : 1.0f;
                if (!pagerState.scrollableState.isScrollInProgress()) {
                    lerp2 = 1.0f;
                }
                AfterpayCardKt.TileCarouselCard(null, carouselTile, Math.min(lerp2, abs <= 2.0f ? 1.0f : abs >= 2.6f ? RecyclerView.DECELERATION_RATE : TransactorKt.lerp(1.0f, 0.7f, (abs - 2.0f) / 0.5999999f)), lerp, abs <= 2.6f, abs < 0.01f, intValue4, pagerState, coroutineScope, 10.0f - abs, function15, composer4, (intValue5 << 15) & 3670016);
                return Unit.INSTANCE;
            case 3:
                FocusRequester focusRequester = (FocusRequester) obj8;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj7;
                Function1 function16 = (Function1) obj5;
                MutableState mutableState = (MutableState) obj6;
                ReferralCodeViewModel referralCodeViewModel = (ReferralCodeViewModel) obj2;
                Composer composer5 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                referralCodeViewModel.getClass();
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer5, 0);
                GapComposer gapComposer4 = (GapComposer) composer5;
                int hashCode5 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer4.currentCompositionLocalScope();
                Modifier materializeModifier5 = PlatformKt.materializeModifier(composer5, companion2);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer5.startReusableNode();
                if (gapComposer5.inserting) {
                    gapComposer5.createNode(layoutNode$Companion$Constructor$14);
                } else {
                    gapComposer5.useNode();
                }
                Updater.m576setimpl(composer5, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer5, currentCompositionLocalScope5, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer5, Integer.valueOf(hashCode5), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer5, materializeModifier5, ComposeUiNode.Companion.SetModifier);
                DBUtil.TitleBarSub((String) null, NavigationType.NONE, (Modifier) null, (DynamicColorConfiguration) null, (Function0) null, (Modifier) null, (Function3) null, composer5, 54, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                DBUtil.SpacerWithinSectionMedium(0, 1, composer5, null);
                String str = referralCodeViewModel.header.title;
                if (str == null) {
                    str = "";
                }
                Countries.PageHeader(str, (Modifier) null, Expect_jvmKt.rememberComposableLambda(1231433138, new CashtagViewKt$$ExternalSyntheticLambda10(referralCodeViewModel, 28), composer5), (String) null, composer5, 3456, 2);
                DBUtil.SpacerBetweenSectionLarge(0, 1, composer5, null);
                Modifier focusRequester2 = FocusTraversalKt.focusRequester(SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2), focusRequester);
                String str2 = (String) mutableState.getValue();
                InputState inputState = referralCodeViewModel.allowCodeInput ? InputState.DEFAULT : InputState.DISABLED;
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 0, 7, (Boolean) null, 119);
                boolean changed7 = gapComposer5.changed(delegatingSoftwareKeyboardController) | gapComposer5.changed(function16) | gapComposer5.changed(mutableState);
                Object rememberedValue9 = gapComposer5.rememberedValue();
                if (changed7 || rememberedValue9 == neverEqualPolicy) {
                    rememberedValue9 = new CaptureCheckFaceKt$$ExternalSyntheticLambda11(delegatingSoftwareKeyboardController, function16, mutableState, 8);
                    gapComposer5.updateRememberedValue(rememberedValue9);
                }
                KeyboardActions keyboardActions = new KeyboardActions((Function1) rememberedValue9, null, null, 62);
                boolean changed8 = gapComposer5.changed(mutableState) | gapComposer5.changed(function16);
                Object rememberedValue10 = gapComposer5.rememberedValue();
                if (changed8 || rememberedValue10 == neverEqualPolicy) {
                    rememberedValue10 = new CashMapViewKt$$ExternalSyntheticLambda3(function16, mutableState, 7);
                    gapComposer5.updateRememberedValue(rememberedValue10);
                }
                InputFieldKt.InputField(str2, (Function1) rememberedValue10, focusRequester2, inputState, (Function2) null, (Function2) null, (Function2) null, (Function3) null, (String) null, keyboardOptions, keyboardActions, (VisualTransformation) null, composer5, 805306368, 0, 2544);
                SpacerKt.Spacer(composer5, new LayoutWeightElement(1.0f, true));
                DimensionKt.ButtonCtaGroup(SpacerKt.imePadding(companion2), false, null, null, Expect_jvmKt.rememberComposableLambda(124037481, new ComposeDialogKt$$ExternalSyntheticLambda12(referralCodeViewModel, delegatingSoftwareKeyboardController, function16, mutableState, 19), composer5), composer5, 24576, 14);
                gapComposer5.end(true);
                return Unit.INSTANCE;
            case 4:
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj8;
                List list2 = (List) obj7;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj6;
                LazyGridItemScopeImpl lazyGridItemScopeImpl = (LazyGridItemScopeImpl) obj5;
                int intValue6 = ((Integer) obj2).intValue();
                Composer composer6 = (Composer) obj3;
                int intValue7 = ((Integer) obj4).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                if ((intValue7 & 48) == 0) {
                    intValue7 |= ((GapComposer) composer6).changed(intValue6) ? 32 : 16;
                }
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue7 & 1, (intValue7 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer6, 0);
                    int hashCode6 = Long.hashCode(gapComposer6.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer6.currentCompositionLocalScope();
                    Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer6, companion2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$15 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer6.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer6.startReusableNode();
                    if (gapComposer6.inserting) {
                        gapComposer6.createNode(layoutNode$Companion$Constructor$15);
                    } else {
                        gapComposer6.useNode();
                    }
                    Updater.m576setimpl(gapComposer6, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer6, currentCompositionLocalScope6, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer6, Integer.valueOf(hashCode6), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer6, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer6, materializeModifier6, ComposeUiNode.Companion.SetModifier);
                    gapComposer6.startReplaceGroup(-1160615290);
                    int i10 = ref$IntRef.element;
                    for (int i11 = 0; i11 < i10; i11++) {
                        int i12 = (ref$IntRef.element * intValue6) + i11;
                        if (i12 < list2.size()) {
                            composableLambdaImpl.invoke((Object) lazyGridItemScopeImpl, (Object) Integer.valueOf(i12), (Object) Integer.valueOf(ref$IntRef.element), list2.get(i12), (Object) gapComposer6, (Object) 0);
                        } else {
                            gapComposer6.end(false);
                            gapComposer6.end(true);
                        }
                    }
                    gapComposer6.end(false);
                    gapComposer6.end(true);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                return invoke$com$squareup$cash$payments$views$PaymentConfigurationViewKt$$ExternalSyntheticLambda10(obj, obj2, obj3, obj4);
            case 6:
                CashCreditScoreHomeData.ScoreSummary scoreSummary = (CashCreditScoreHomeData.ScoreSummary) obj8;
                Function1 function17 = (Function1) obj5;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj7;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) obj6;
                ScoreDisplayContent scoreDisplayContent = (ScoreDisplayContent) obj2;
                Composer composer7 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                scoreDisplayContent.getClass();
                if (scoreDisplayContent instanceof ScoreDisplayContent.Score) {
                    GapComposer gapComposer7 = (GapComposer) composer7;
                    gapComposer7.startReplaceGroup(946617315);
                    int intValue8 = parcelableSnapshotMutableIntState.getIntValue();
                    Object rememberedValue11 = gapComposer7.rememberedValue();
                    if (rememberedValue11 == neverEqualPolicy) {
                        rememberedValue11 = new MoneyTabUIKt$$ExternalSyntheticLambda14(25, parcelableSnapshotMutableIntState2);
                        gapComposer7.updateRememberedValue(rememberedValue11);
                    }
                    CalloutKt.ScoreTextInfo(scoreSummary, intValue8, function17, RulerKt.onSizeChanged(companion2, (Function1) rememberedValue11), gapComposer7, 3072, 0);
                    gapComposer7.end(false);
                } else if (scoreDisplayContent instanceof ScoreDisplayContent.Celebration) {
                    GapComposer gapComposer8 = (GapComposer) composer7;
                    gapComposer8.startReplaceGroup(946631046);
                    BiasAlignment biasAlignment2 = Alignment.Companion.Center;
                    MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment2, false);
                    int hashCode7 = Long.hashCode(gapComposer8.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope7 = gapComposer8.currentCompositionLocalScope();
                    Modifier materializeModifier7 = PlatformKt.materializeModifier(gapComposer8, companion2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$16 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer8.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer8.startReusableNode();
                    if (gapComposer8.inserting) {
                        gapComposer8.createNode(layoutNode$Companion$Constructor$16);
                    } else {
                        gapComposer8.useNode();
                    }
                    Updater.m576setimpl(gapComposer8, maybeCachedBoxMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer8, currentCompositionLocalScope7, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer8, Integer.valueOf(hashCode7), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer8, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer8, materializeModifier7, ComposeUiNode.Companion.SetModifier);
                    Modifier align2 = boxScopeInstance.align(companion2, biasAlignment2);
                    Object rememberedValue12 = gapComposer8.rememberedValue();
                    if (rememberedValue12 == neverEqualPolicy) {
                        rememberedValue12 = new CalloutKt$$ExternalSyntheticLambda1(6);
                        gapComposer8.updateRememberedValue(rememberedValue12);
                    }
                    Modifier semantics2 = SemanticsModifierKt.semantics(align2, false, (Function1) rememberedValue12);
                    String str3 = ((ScoreDisplayContent.Celebration) scoreDisplayContent).text;
                    TextStyle textStyle = ((Typography) gapComposer8.consume(ArcadeThemeKt.LocalTypography)).headlineLarge;
                    Colors colors3 = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                    } else {
                        gapComposer8.startReplaceGroup(-1762997739);
                        gapComposer8.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, colors3.semantic.text.standard, (Composer) gapComposer8, semantics2, textStyle, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                    gapComposer8.end(true);
                    gapComposer8.end(false);
                } else {
                    if (!(scoreDisplayContent instanceof ScoreDisplayContent.AfterCelebrationScore)) {
                        throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer7, 946615739, false);
                    }
                    GapComposer gapComposer9 = (GapComposer) composer7;
                    gapComposer9.startReplaceGroup(946646760);
                    CalloutKt.ScoreTextInfo(scoreSummary, parcelableSnapshotMutableIntState.getIntValue(), function17, null, gapComposer9, 0, 8);
                    gapComposer9.end(false);
                }
                return Unit.INSTANCE;
            case 7:
                Modifier modifier5 = (Modifier) obj8;
                String str4 = (String) obj7;
                BiasAlignment biasAlignment3 = Alignment.Companion.Center;
                ContentScale contentScale = (ContentScale) obj6;
                ColorFilter colorFilter = (ColorFilter) obj5;
                Painter painter2 = (Painter) obj2;
                Composer composer8 = (Composer) obj3;
                int intValue9 = ((Integer) obj4).intValue();
                ((BoxWithConstraintsScopeImpl) obj).getClass();
                painter2.getClass();
                if ((intValue9 & 48) == 0) {
                    intValue9 |= (intValue9 & 64) == 0 ? ((GapComposer) composer8).changed(painter2) : ((GapComposer) composer8).changedInstance(painter2) ? 32 : 16;
                }
                GapComposer gapComposer10 = (GapComposer) composer8;
                if (gapComposer10.shouldExecute(intValue9 & 1, (intValue9 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                    ImageKt.Image(painter2, str4, TestTagKt.testTag(modifier5, "StripeImageFromUrl"), biasAlignment3, contentScale, RecyclerView.DECELERATION_RATE, colorFilter, gapComposer10, Painter.$stable | ((intValue9 >> 3) & 14), 32);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                Function3 function3 = (Function3) obj8;
                BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj7;
                Function3 function32 = (Function3) obj6;
                ComposableLambdaImpl composableLambdaImpl2 = (ComposableLambdaImpl) obj5;
                StripeImageState stripeImageState = (StripeImageState) obj2;
                Composer composer9 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                stripeImageState.getClass();
                if (stripeImageState.equals(StripeImageState.Error.INSTANCE)) {
                    GapComposer gapComposer11 = (GapComposer) composer9;
                    gapComposer11.startReplaceGroup(138772751);
                    function3.invoke(boxWithConstraintsScopeImpl, gapComposer11, 0);
                    gapComposer11.end(false);
                } else if (stripeImageState.equals(StripeImageState.Error.INSTANCE$1)) {
                    GapComposer gapComposer12 = (GapComposer) composer9;
                    gapComposer12.startReplaceGroup(138774097);
                    function32.invoke(boxWithConstraintsScopeImpl, gapComposer12, 0);
                    gapComposer12.end(false);
                } else {
                    if (!(stripeImageState instanceof StripeImageState.Success)) {
                        throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer9, 138771717, false);
                    }
                    GapComposer gapComposer13 = (GapComposer) composer9;
                    gapComposer13.startReplaceGroup(138775609);
                    composableLambdaImpl2.invoke(boxWithConstraintsScopeImpl, ((StripeImageState.Success) stripeImageState).painter, gapComposer13, Integer.valueOf(Painter.$stable << 3));
                    gapComposer13.end(false);
                }
                return Unit.INSTANCE;
            case 9:
                GovernmentIdFeed governmentIdFeed = (GovernmentIdFeed) obj8;
                CameraPreview cameraPreview = (CameraPreview) obj7;
                FeatureFlagManager featureFlagManager = (FeatureFlagManager) obj6;
                TrackingEventsLogger trackingEventsLogger = (TrackingEventsLogger) obj5;
                Screen.CameraScreen cameraScreen = (Screen.CameraScreen) obj;
                ViewEnvironment viewEnvironment = (ViewEnvironment) obj2;
                Context context = (Context) obj3;
                ViewGroup viewGroup = (ViewGroup) obj4;
                cameraScreen.getClass();
                viewEnvironment.getClass();
                context.getClass();
                int i13 = AdvancedCustomizations.$r8$clinit;
                GovernmentIdCameraScreenViewFactory$1$viewController$1 governmentIdCameraScreenViewFactory$1$viewController$1 = new GovernmentIdCameraScreenViewFactory$1$viewController$1();
                int ordinal = cameraScreen.designVersion.ordinal();
                if (ordinal == 0) {
                    ViewControllerVersion[] viewControllerVersionArr = ViewControllerVersion.$VALUES;
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ViewControllerVersion[] viewControllerVersionArr2 = ViewControllerVersion.$VALUES;
                }
                BasicGovIdCaptureViewController newViewController = governmentIdCameraScreenViewFactory$1$viewController$1.newViewController(governmentIdFeed, cameraPreview, featureFlagManager, cameraScreen, context, viewGroup);
                FrameLayout root = newViewController.getRoot();
                Context context2 = newViewController.getRoot().getContext();
                context2.getClass();
                ViewShowRenderingKt.bindShowRendering(root, cameraScreen, viewEnvironment, new WorkApplet$applet$1(2, new CameraScreenRunner(context2, newViewController, newViewController.cameraController, governmentIdFeed, trackingEventsLogger), CameraScreenRunner.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$CameraScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0, 27));
                return newViewController.getRoot();
            default:
                CameraPreview cameraPreview2 = (CameraPreview) obj8;
                Lazy lazy = (Lazy) obj7;
                TrackingEventsLogger trackingEventsLogger2 = (TrackingEventsLogger) obj6;
                FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) obj5;
                SelfieWorkflow.Screen.CameraScreen cameraScreen2 = (SelfieWorkflow.Screen.CameraScreen) obj;
                ViewEnvironment viewEnvironment2 = (ViewEnvironment) obj2;
                Context context3 = (Context) obj3;
                ViewGroup viewGroup2 = (ViewGroup) obj4;
                cameraScreen2.getClass();
                viewEnvironment2.getClass();
                context3.getClass();
                int i14 = AdvancedCustomizations.$r8$clinit;
                SelfieStepFragment$$ExternalSyntheticLambda0 selfieStepFragment$$ExternalSyntheticLambda0 = new SelfieStepFragment$$ExternalSyntheticLambda0(1);
                int ordinal2 = cameraScreen2.designVersion.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        ViewControllerVersion[] viewControllerVersionArr3 = ViewControllerVersion.$VALUES;
                    } else if (ordinal2 == 2) {
                        ViewControllerVersion[] viewControllerVersionArr4 = ViewControllerVersion.$VALUES;
                    } else {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                    }
                    BasicSelfieCaptureViewController newViewController2 = selfieStepFragment$$ExternalSyntheticLambda0.newViewController(context3, viewGroup2);
                    Pi2SelfieCameraBinding pi2SelfieCameraBinding = newViewController2.binding;
                    zzat.updateSystemUiColor(viewEnvironment2, context3, context3.getColor(R.color.pi2_camera_preview_mask_color));
                    ConstraintLayout constraintLayout = pi2SelfieCameraBinding.rootView_;
                    constraintLayout.getClass();
                    Object obj11 = lazy.get();
                    obj11.getClass();
                    SelfieDirectionFeed selfieDirectionFeed = (SelfieDirectionFeed) obj11;
                    TipsFeatureFlag tipsFeatureFlag = TipsFeatureFlag.INSTANCE$6;
                    featureFlagManager2.getClass();
                    ViewShowRenderingKt.bindShowRendering(constraintLayout, cameraScreen2, viewEnvironment2, new Map$evaluateLogic$1(2, new com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner(context3, newViewController2, cameraPreview2, selfieDirectionFeed, trackingEventsLogger2, featureFlagManager2.getValue(tipsFeatureFlag)), com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0, 2));
                    ConstraintLayout constraintLayout2 = pi2SelfieCameraBinding.rootView_;
                    constraintLayout2.getClass();
                    return constraintLayout2;
                }
                a$$ExternalSyntheticBUOutline0.m$1("Invalid design version.");
                return null;
        }
    }

    public /* synthetic */ TabToolbarsKt$$ExternalSyntheticLambda16(CashCreditScoreHomeData.ScoreSummary scoreSummary, Function1 function1, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2) {
        this.$r8$classId = 6;
        this.f$0 = scoreSummary;
        this.f$3 = function1;
        this.f$1 = parcelableSnapshotMutableIntState;
        this.f$2 = parcelableSnapshotMutableIntState2;
    }

    public /* synthetic */ TabToolbarsKt$$ExternalSyntheticLambda16(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    public /* synthetic */ TabToolbarsKt$$ExternalSyntheticLambda16(Function1 function1, Context context, View view, FocusRequester focusRequester) {
        this.$r8$classId = 5;
        this.f$3 = function1;
        this.f$0 = context;
        this.f$1 = view;
        this.f$2 = focusRequester;
    }
}
