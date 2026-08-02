package com.squareup.cash.tax.views;

import android.graphics.Bitmap;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt$asPresenter$1$start$2;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.activity.views.ActivityItemViewKt;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.common.composeui.DensityUtilsKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ArcadeModal2Kt;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.localization.LanguageDisclosureSetupTeardown;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.applets.common.presenters.PromotedAppletTilePresenter$Factory$Impl;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda3;
import com.squareup.cash.shopping.views.ShopErrorKt$$ExternalSyntheticLambda0;
import com.squareup.cash.support.backend.api.SupportActivityItemLoader;
import com.squareup.cash.support.backend.api.articles.Article;
import com.squareup.cash.support.backend.api.articles.Link;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel;
import com.squareup.cash.support.chat.views.transcript.message.compose.MessageFileKt;
import com.squareup.cash.support.chat.views.transcript.viewholder.MessageSystemMessageComposeView;
import com.squareup.cash.support.chat.views.transcript.viewholder.MessageTextComposeView;
import com.squareup.cash.support.chat.views.transcript.viewholder.MessageUnknownComposeView;
import com.squareup.cash.support.viewmodels.ArticleViewModel;
import com.squareup.cash.support.viewmodels.ContactSupportEmailInputViewModel$Loaded;
import com.squareup.cash.support.viewmodels.ContactSupportEmailMessageViewModel$Editing;
import com.squareup.cash.support.viewmodels.PhoneVerificationViewModel;
import com.squareup.cash.support.viewmodels.ScreenshotReviewViewModel;
import com.squareup.cash.support.viewmodels.SupportFlowCheckConnectionViewModel;
import com.squareup.cash.support.viewmodels.SupportFullScreenActivityPickerViewModel;
import com.squareup.cash.support.viewmodels.SupportIncidentDetailsViewModel;
import com.squareup.cash.support.viewmodels.SupportPhoneStatusViewModel;
import com.squareup.cash.support.viewmodels.SupportSearchViewModel;
import com.squareup.cash.support.views.ContactSupportEmailMessageView;
import com.squareup.cash.support.views.ScreenshotReviewViewKt;
import com.squareup.cash.support.views.ScreenshotReviewViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.support.views.SupportFlowCheckConnectionView;
import com.squareup.cash.support.views.SupportIncidentDetailsView;
import com.squareup.cash.support.views.SupportPhoneStatusView;
import com.squareup.cash.support.views.SupportPhoneVerificationView;
import com.squareup.cash.support.views.article.ArticleViewKt;
import com.squareup.cash.support.views.search.SupportSearchView;
import com.squareup.cash.support.views.search.SupportSearchViewKt;
import com.squareup.cash.taptopay.viewmodels.ErrorDialogAction$Action;
import com.squareup.cash.taptopay.viewmodels.TapToPayErrorDialogViewEvent;
import com.squareup.cash.taptopay.viewmodels.TapToPayErrorDialogViewModel;
import com.squareup.cash.taptopay.views.TapToPayErrorDialogKt$$ExternalSyntheticLambda2;
import com.squareup.cash.tax.applet.views.TaxesAppletTile;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.tax.applets.presenters.TaxesAppletTilePresenter$Factory$Impl;
import com.squareup.cash.tax.applets.presenters.TaxesAppletTileRepository;
import com.squareup.cash.tax.viewmodels.TaxTooltipViewModel;
import com.squareup.cash.tax.viewmodels.TaxesAppletTileModel;
import com.squareup.cash.transactionpicker.viewmodels.TransactionViewModel;
import com.squareup.cash.transactionpicker.views.ArcadeTransactionPickerViewKt;
import com.squareup.cash.transfers.viewmodels.BalanceBasedAutoReloadConfirmationViewModel;
import com.squareup.cash.transfers.views.AddMoneyViewKt;
import com.squareup.cash.transfers.views.BalanceBasedAutoReloadConfirmationView;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda28;
import com.squareup.cash.work.webview.views.WorkWebViewKt$$ExternalSyntheticLambda14;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public final /* synthetic */ class TaxTooltipView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ TaxTooltipView$$ExternalSyntheticLambda0(MutableState mutableState, Function1 function1) {
        this.$r8$classId = 17;
        this.f$1 = function1;
        this.f$0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        NavigationType navigationType;
        int i = this.$r8$classId;
        int i2 = 6;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i3 = 3;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        final int i4 = 1;
        switch (i) {
            case 0:
                TaxTooltipViewModel taxTooltipViewModel = (TaxTooltipViewModel) obj4;
                Function1 function1 = (Function1) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i5 = TaxTooltipView.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    int roundToInt = MathKt__MathJVMKt.roundToInt((taxTooltipViewModel.anchorWidth * 0.125f) + taxTooltipViewModel.anchorLeft);
                    int roundToInt2 = MathKt__MathJVMKt.roundToInt(DensityUtilsKt.m3477toPx8Feqmps(4.0f, gapComposer) + taxTooltipViewModel.anchorBottom);
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    Unit unit = Unit.INSTANCE;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new TaxTooltipView$Content$1$1$1(r11 ? 1 : 0, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(fillMaxSize, unit, (PointerInputEventHandler) rememberedValue);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, pointerInput);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    TaxReturnsViewKt.m3768DesktopToolTipmKWK414(taxTooltipViewModel, BundleKt.m1091DpSizeYgX7TsA(24.0f, 16.0f), (roundToInt << 32) | (roundToInt2 & BodyPartID.bodyIdMax), function1, gapComposer, 390);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                ChatContentViewModel.MessageViewModel messageViewModel = (ChatContentViewModel.MessageViewModel) obj4;
                MessageSystemMessageComposeView messageSystemMessageComposeView = (MessageSystemMessageComposeView) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i6 = MessageSystemMessageComposeView.$r8$clinit;
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    MessageFileKt.MessageTextSystem(messageViewModel, messageSystemMessageComposeView.onUrlClick, null, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                ChatContentViewModel.MessageViewModel messageViewModel2 = (ChatContentViewModel.MessageViewModel) obj4;
                MessageTextComposeView messageTextComposeView = (MessageTextComposeView) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i7 = MessageTextComposeView.$r8$clinit;
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    int ordinal = messageViewModel2.sender.ordinal();
                    if (ordinal == 0) {
                        gapComposer3.startReplaceGroup(2145595302);
                        MessageFileKt.MessageTextCustomer(messageViewModel2, null, messageTextComposeView.onResendMessage, messageTextComposeView.onDeleteMessage, gapComposer3, 0);
                        gapComposer3.end(false);
                    } else if (ordinal == 1) {
                        gapComposer3.startReplaceGroup(2145844356);
                        MessageFileKt.MessageTextAdvocate(messageViewModel2, messageTextComposeView.onUrlClick, null, gapComposer3, 0);
                        gapComposer3.end(false);
                    } else if (ordinal == 2) {
                        gapComposer3.startReplaceGroup(2145997961);
                        MessageFileKt.MessageTextBot(messageViewModel2, messageTextComposeView.onUrlClick, null, gapComposer3, 0);
                        gapComposer3.end(false);
                    } else {
                        if (ordinal != 3) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, 484852246, false);
                        }
                        gapComposer3.startReplaceGroup(2146149830);
                        MessageFileKt.MessageTextSystem(messageViewModel2, messageTextComposeView.onUrlClick, null, gapComposer3, 0);
                        gapComposer3.end(false);
                    }
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                ChatContentViewModel.MessageViewModel messageViewModel3 = (ChatContentViewModel.MessageViewModel) obj4;
                MessageUnknownComposeView messageUnknownComposeView = (MessageUnknownComposeView) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                int i8 = MessageUnknownComposeView.$r8$clinit;
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    MessageFileKt.MessageUnknown(messageViewModel3, messageUnknownComposeView.onUpdateCashAppClick, null, gapComposer4, 0);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                Room.ScreenshotEffectOverlay((Bitmap) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                ContactSupportEmailInputViewModel$Loaded contactSupportEmailInputViewModel$Loaded = (ContactSupportEmailInputViewModel$Loaded) obj4;
                MutableState mutableState = (MutableState) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (contactSupportEmailInputViewModel$Loaded.isEmailModified) {
                        gapComposer5.startReplaceGroup(1409591252);
                        gapComposer5.end(false);
                        str = (String) mutableState.getValue();
                    } else {
                        gapComposer5.startReplaceGroup(1409664443);
                        str = contactSupportEmailInputViewModel$Loaded.email;
                        if (str == null) {
                            str = re$$ExternalSyntheticOutline0.m(gapComposer5, 599662840, R.string.contact_support_email_input_hint, gapComposer5, false);
                        } else {
                            gapComposer5.startReplaceGroup(599662375);
                            gapComposer5.end(false);
                        }
                        gapComposer5.end(false);
                    }
                    String str2 = str;
                    TextStyle textStyle = ((Typography) gapComposer5.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                    Colors colors = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                    } else {
                        gapComposer5.startReplaceGroup(-1762997739);
                        gapComposer5.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors.semantic.text.standard, (Composer) gapComposer5, SizeKt.fillMaxWidth(companion, 1.0f), textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                ContactSupportEmailMessageViewModel$Editing contactSupportEmailMessageViewModel$Editing = (ContactSupportEmailMessageViewModel$Editing) obj4;
                Function1 function12 = (Function1) obj3;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                int i9 = ContactSupportEmailMessageView.$r8$clinit;
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (!gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    gapComposer6.skipToGroupEnd();
                } else {
                    if (contactSupportEmailMessageViewModel$Editing == null) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer6, -1845287207, false);
                    }
                    gapComposer6.startReplaceGroup(-1845286068);
                    ScreenshotReviewViewKt.EditingMessage(contactSupportEmailMessageViewModel$Editing, function12, gapComposer6, 0);
                    gapComposer6.end(false);
                }
                return Unit.INSTANCE;
            case 7:
                ScreenshotReviewViewModel.Screenshot screenshot = (ScreenshotReviewViewModel.Screenshot) obj4;
                Function1 function13 = (Function1) obj3;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    ScreenshotReviewViewKt.Thumbnail(screenshot.uri.toString(), function13, gapComposer7, 0);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                SupportFlowCheckConnectionViewModel supportFlowCheckConnectionViewModel = (SupportFlowCheckConnectionViewModel) obj4;
                Function1 function14 = (Function1) obj3;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                int i10 = SupportFlowCheckConnectionView.$r8$clinit;
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    boolean changed2 = gapComposer8.changed(function14);
                    Object rememberedValue2 = gapComposer8.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda0(20, function14);
                        gapComposer8.updateRememberedValue(rememberedValue2);
                    }
                    Function0 function0 = (Function0) rememberedValue2;
                    boolean changed3 = gapComposer8.changed(function14);
                    Object rememberedValue3 = gapComposer8.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda0(21, function14);
                        gapComposer8.updateRememberedValue(rememberedValue3);
                    }
                    ArcadeModal2Kt.Modal(null, supportFlowCheckConnectionViewModel, function0, (Function0) rememberedValue3, false, false, Expect_jvmKt.rememberComposableLambda(1187230144, new WorkWebViewKt$$ExternalSyntheticLambda14(8, function14), gapComposer8), gapComposer8, 1572864, 49);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                SupportFullScreenActivityPickerViewModel supportFullScreenActivityPickerViewModel = (SupportFullScreenActivityPickerViewModel) obj4;
                Function1 function15 = (Function1) obj3;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, gapComposer9);
                    Colors colors2 = (Colors) gapComposer9.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer9, -1762997026, gapComposer9, false);
                    } else {
                        gapComposer9.startReplaceGroup(-1762997739);
                        gapComposer9.end(false);
                    }
                    Modifier m = BalanceFeedKt$$ExternalSyntheticOutline0.m(companion, colors2.semantic.background.f1047app, ColorKt.RectangleShape, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer9, 0);
                    int hashCode2 = Long.hashCode(gapComposer9.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer9.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer9, m);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer9.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer9.startReusableNode();
                    if (gapComposer9.inserting) {
                        gapComposer9.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer9.useNode();
                    }
                    Updater.m576setimpl(gapComposer9, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer9, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer9, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer9, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer9, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    SupportFullScreenActivityPickerViewModel.Loaded loaded = (SupportFullScreenActivityPickerViewModel.Loaded) supportFullScreenActivityPickerViewModel;
                    String str3 = loaded.fullScreenViewModel.title;
                    int ordinal2 = loaded.toolbarNavigationIconType.ordinal();
                    if (ordinal2 == 0) {
                        navigationType = NavigationType.CLOSE;
                    } else {
                        if (ordinal2 != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        navigationType = NavigationType.BACK;
                    }
                    NavigationType navigationType2 = navigationType;
                    boolean changed4 = gapComposer9.changed(function15);
                    Object rememberedValue4 = gapComposer9.rememberedValue();
                    if (changed4 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda0(23, function15);
                        gapComposer9.updateRememberedValue(rememberedValue4);
                    }
                    DBUtil.TitleBarSub(str3, navigationType2, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue4, (Modifier) null, (Function3) null, gapComposer9, 0, 108);
                    AvatarsKt.ActivityScrollableEmbeddedView(loaded.fullScreenViewModel.activityEmbeddedViewModel, (Modifier) null, rememberLazyListState, (PaddingValues) null, Expect_jvmKt.rememberComposableLambda(-1274605847, new TaxReturnsViewKt$$ExternalSyntheticLambda5(supportFullScreenActivityPickerViewModel, i2), gapComposer9), (Function2) null, (Function3) null, gapComposer9, 24576, 490);
                    gapComposer9.end(true);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                SupportIncidentDetailsViewModel supportIncidentDetailsViewModel = (SupportIncidentDetailsViewModel) obj4;
                Function1 function16 = (Function1) obj3;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                int i11 = SupportIncidentDetailsView.$r8$clinit;
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (!gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    gapComposer10.skipToGroupEnd();
                } else if (Intrinsics.areEqual(supportIncidentDetailsViewModel, SupportIncidentDetailsViewModel.Loading.INSTANCE)) {
                    gapComposer10.startReplaceGroup(1397699366);
                    ScreenshotReviewViewKt.SupportIncidentLoading(function16, gapComposer10, 0);
                    gapComposer10.end(false);
                } else if (supportIncidentDetailsViewModel instanceof SupportIncidentDetailsViewModel.Empty) {
                    gapComposer10.startReplaceGroup(1397701031);
                    ScreenshotReviewViewKt.SupportIncidentNotFound(function16, gapComposer10, 0);
                    gapComposer10.end(false);
                } else {
                    if (!(supportIncidentDetailsViewModel instanceof SupportIncidentDetailsViewModel.Loaded)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer10, 1397698433, false);
                    }
                    gapComposer10.startReplaceGroup(1397702765);
                    ScreenshotReviewViewKt.SupportIncidentDetails((SupportIncidentDetailsViewModel.Loaded) supportIncidentDetailsViewModel, function16, gapComposer10, 0, 0);
                    gapComposer10.end(false);
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                ScreenshotReviewViewKt.SubscriptionButton((SupportIncidentDetailsViewModel.ButtonViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 12:
                SupportIncidentDetailsViewModel.Loaded loaded2 = (SupportIncidentDetailsViewModel.Loaded) obj4;
                Function1 function17 = (Function1) obj3;
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    SupportIncidentDetailsViewModel.ButtonViewModel buttonViewModel = loaded2.button;
                    if (buttonViewModel == null) {
                        gapComposer11.startReplaceGroup(-1638837692);
                    } else {
                        gapComposer11.startReplaceGroup(-1638837691);
                        ScreenshotReviewViewKt.SubscriptionButton(buttonViewModel, function17, gapComposer11, 0);
                    }
                    gapComposer11.end(false);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                State state = (State) obj4;
                String str4 = (String) obj3;
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    AnimatedContentKt.AnimatedVisibility(ColumnScopeInstance.INSTANCE, ((Boolean) state.getValue()).booleanValue(), null, EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), null, Expect_jvmKt.rememberComposableLambda(1278218031, new ShopErrorKt$$ExternalSyntheticLambda0(str4, i3), gapComposer12), gapComposer12, 1600512, 18);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                SupportPhoneStatusViewModel supportPhoneStatusViewModel = (SupportPhoneStatusViewModel) obj4;
                Function1 function18 = (Function1) obj3;
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                int i12 = SupportPhoneStatusView.$r8$clinit;
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    ScreenshotReviewViewKt.SupportPhoneStatus(supportPhoneStatusViewModel, function18, gapComposer13, 0, 0);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                PhoneVerificationViewModel phoneVerificationViewModel = (PhoneVerificationViewModel) obj4;
                Function1 function19 = (Function1) obj3;
                Composer composer14 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                int i13 = SupportPhoneVerificationView.$r8$clinit;
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (!gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    gapComposer14.skipToGroupEnd();
                } else if (phoneVerificationViewModel instanceof PhoneVerificationViewModel.Loading) {
                    gapComposer14.startReplaceGroup(1605197385);
                    ScreenshotReviewViewKt.Loading(function19, gapComposer14, 0);
                    gapComposer14.end(false);
                } else {
                    if (!(phoneVerificationViewModel instanceof PhoneVerificationViewModel.Loaded)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer14, 1605196290, false);
                    }
                    gapComposer14.startReplaceGroup(1605198607);
                    ScreenshotReviewViewKt.Loaded((PhoneVerificationViewModel.Loaded) phoneVerificationViewModel, function19, gapComposer14, 0);
                    gapComposer14.end(false);
                }
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                ScreenshotReviewViewKt.Loaded((PhoneVerificationViewModel.Loaded) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 17:
                Function1 function110 = (Function1) obj3;
                State state2 = (State) obj4;
                Composer composer15 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    SupportActivityItemLoader.State state3 = (SupportActivityItemLoader.State) state2.getValue();
                    if (Intrinsics.areEqual(state3, SupportActivityItemLoader.State.Failure.INSTANCE)) {
                        gapComposer15.startReplaceGroup(-1041052176);
                        gapComposer15.end(false);
                    } else if (Intrinsics.areEqual(state3, SupportActivityItemLoader.State.Failure.INSTANCE$1)) {
                        gapComposer15.startReplaceGroup(-1834695517);
                        ScreenshotReviewViewKt.ShimmerSupportTransactionRowView(gapComposer15, 0);
                        gapComposer15.end(false);
                    } else {
                        if (!(state3 instanceof SupportActivityItemLoader.State.Success)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer15, -1834698722, false);
                        }
                        gapComposer15.startReplaceGroup(-1834693117);
                        SupportActivityItemLoader.State.Success success = (SupportActivityItemLoader.State.Success) state3;
                        ActivityItemViewModel activityItemViewModel = success.activityItemViewModel;
                        boolean changedInstance = gapComposer15.changedInstance(state3) | gapComposer15.changed(function110);
                        Object rememberedValue5 = gapComposer15.rememberedValue();
                        if (changedInstance || rememberedValue5 == neverEqualPolicy) {
                            rememberedValue5 = new BottomSheet$$ExternalSyntheticLambda3(16, function110, success);
                            gapComposer15.updateRememberedValue(rememberedValue5);
                        }
                        ActivityItemViewKt.m2972ActivityItemViewww6aTOc(activityItemViewModel, (Function1) rememberedValue5, SizeKt.fillMaxWidth(companion, 1.0f), 0L, gapComposer15, MLKEMEngine.KyberPolyBytes, 8);
                        gapComposer15.end(false);
                    }
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                Article.Icon icon = (Article.Icon) obj4;
                Icons icons = (Icons) obj3;
                Composer composer16 = (Composer) obj;
                int intValue16 = ((Integer) obj2).intValue();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2)) {
                    AvatarSize avatarSize = AvatarSize.Size64;
                    String name = icon.glyph.name();
                    Colors colors3 = (Colors) gapComposer16.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer16, -1762997026, gapComposer16, false);
                    } else {
                        gapComposer16.startReplaceGroup(-1762997739);
                        gapComposer16.end(false);
                    }
                    TextViewKt.m3613AvatarB_rZmmc(avatarSize, name, colors3.semantic.icon.standard, (String) null, (Modifier) null, (AvatarImage) new AvatarImage.LocalIcon(icons, 0L, 6), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer16, 3078, 0, 2000);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                State state4 = (State) obj4;
                MutableState mutableState2 = (MutableState) obj3;
                Composer composer17 = (Composer) obj;
                int intValue17 = ((Integer) obj2).intValue();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 3) != 2)) {
                    AnimatedContentKt.AnimatedVisibility(ColumnScopeInstance.INSTANCE, ((Boolean) state4.getValue()).booleanValue(), null, EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), null, Expect_jvmKt.rememberComposableLambda(-1630771931, new HeroCardViewKt$$ExternalSyntheticLambda28(i2, mutableState2), gapComposer17), gapComposer17, 1600512, 18);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                ArticleViewKt.ContactOption((ArticleViewModel.ContactOption) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 21:
                Article.Appearance appearance = (Article.Appearance) obj4;
                Link link = (Link) obj3;
                Composer composer18 = (Composer) obj;
                int intValue18 = ((Integer) obj2).intValue();
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (!gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 3) != 2)) {
                    gapComposer18.skipToGroupEnd();
                } else if (appearance != Article.Appearance.ISSUE || link.previewText == null) {
                    gapComposer18.startReplaceGroup(-881847524);
                    gapComposer18.end(false);
                } else {
                    gapComposer18.startReplaceGroup(-882021465);
                    String str5 = link.previewText;
                    str5.getClass();
                    TextStyle textStyle2 = ((Typography) gapComposer18.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                    Colors colors4 = (Colors) gapComposer18.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer18, -1762997026, gapComposer18, false);
                    } else {
                        gapComposer18.startReplaceGroup(-1762997739);
                        gapComposer18.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors4.semantic.text.subtle, (Composer) gapComposer18, (Modifier) null, textStyle2, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                    gapComposer18.end(false);
                }
                return Unit.INSTANCE;
            case 22:
                SupportSearchViewModel supportSearchViewModel = (SupportSearchViewModel) obj4;
                Function1 function111 = (Function1) obj3;
                Composer composer19 = (Composer) obj;
                int intValue19 = ((Integer) obj2).intValue();
                int i14 = SupportSearchView.$r8$clinit;
                GapComposer gapComposer19 = (GapComposer) composer19;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 3) != 2)) {
                    SupportSearchViewKt.SupportSearch(supportSearchViewModel, function111, gapComposer19, 0);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                SupportSearchViewKt.ContactOption((SupportSearchViewModel.SearchResultViewModel.ContactOption) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 24:
                final TapToPayErrorDialogViewModel tapToPayErrorDialogViewModel = (TapToPayErrorDialogViewModel) obj4;
                final Function1 function112 = (Function1) obj3;
                Composer composer20 = (Composer) obj;
                int intValue20 = ((Integer) obj2).intValue();
                GapComposer gapComposer20 = (GapComposer) composer20;
                if (gapComposer20.shouldExecute(intValue20 & 1, (intValue20 & 3) != 2)) {
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-41092556, new TapToPayErrorDialogKt$$ExternalSyntheticLambda2(tapToPayErrorDialogViewModel, r11 ? 1 : 0), gapComposer20);
                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-2046583435, new TapToPayErrorDialogKt$$ExternalSyntheticLambda2(tapToPayErrorDialogViewModel, i4), gapComposer20);
                    final int i15 = r11 ? 1 : 0;
                    ModalKt.Modal(Modifier.Companion.$$INSTANCE, rememberComposableLambda, rememberComposableLambda2, Expect_jvmKt.rememberComposableLambda(-752552887, new Function3() { // from class: com.squareup.cash.taptopay.views.TapToPayErrorDialogKt$$ExternalSyntheticLambda4
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            int i16 = i15;
                            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                            final TapToPayErrorDialogViewModel tapToPayErrorDialogViewModel2 = tapToPayErrorDialogViewModel;
                            final Function1 function113 = function112;
                            Object[] objArr = 0;
                            char c = 1;
                            switch (i16) {
                                case 0:
                                    ModalButtonScope modalButtonScope = (ModalButtonScope) obj5;
                                    Composer composer21 = (Composer) obj6;
                                    int intValue21 = ((Integer) obj7).intValue();
                                    modalButtonScope.getClass();
                                    if ((intValue21 & 6) == 0) {
                                        intValue21 |= ((GapComposer) composer21).changed(modalButtonScope) ? 4 : 2;
                                    }
                                    GapComposer gapComposer21 = (GapComposer) composer21;
                                    if (gapComposer21.shouldExecute(intValue21 & 1, (intValue21 & 19) != 18)) {
                                        boolean changed5 = gapComposer21.changed(function113) | gapComposer21.changed(tapToPayErrorDialogViewModel2.ordinal());
                                        Object rememberedValue6 = gapComposer21.rememberedValue();
                                        if (changed5 || rememberedValue6 == neverEqualPolicy2) {
                                            final Object[] objArr2 = objArr == true ? 1 : 0;
                                            rememberedValue6 = new Function0() { // from class: com.squareup.cash.taptopay.views.TapToPayErrorDialogKt$$ExternalSyntheticLambda6
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i17 = objArr2;
                                                    TapToPayErrorDialogViewModel tapToPayErrorDialogViewModel3 = tapToPayErrorDialogViewModel2;
                                                    Function1 function114 = function113;
                                                    switch (i17) {
                                                        case 0:
                                                            function114.invoke(new TapToPayErrorDialogViewEvent(tapToPayErrorDialogViewModel3.primaryButtonAction));
                                                            break;
                                                        default:
                                                            tapToPayErrorDialogViewModel3.getClass();
                                                            function114.invoke(new TapToPayErrorDialogViewEvent(ErrorDialogAction$Action.CLOSE));
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            gapComposer21.updateRememberedValue(rememberedValue6);
                                        }
                                        modalButtonScope.PrimaryModalButton((Function0) rememberedValue6, null, false, Expect_jvmKt.rememberComposableLambda(305268244, new TapToPayErrorDialogKt$$ExternalSyntheticLambda2(tapToPayErrorDialogViewModel2, 2), gapComposer21), gapComposer21, (57344 & (intValue21 << 12)) | 3072, 6);
                                    } else {
                                        gapComposer21.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj5;
                                    Composer composer22 = (Composer) obj6;
                                    int intValue22 = ((Integer) obj7).intValue();
                                    modalButtonScope2.getClass();
                                    if ((intValue22 & 6) == 0) {
                                        intValue22 |= ((GapComposer) composer22).changed(modalButtonScope2) ? 4 : 2;
                                    }
                                    GapComposer gapComposer22 = (GapComposer) composer22;
                                    if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 19) != 18)) {
                                        boolean changed6 = gapComposer22.changed(function113) | gapComposer22.changed(tapToPayErrorDialogViewModel2.ordinal());
                                        Object rememberedValue7 = gapComposer22.rememberedValue();
                                        if (changed6 || rememberedValue7 == neverEqualPolicy2) {
                                            final char c2 = c == true ? 1 : 0;
                                            rememberedValue7 = new Function0() { // from class: com.squareup.cash.taptopay.views.TapToPayErrorDialogKt$$ExternalSyntheticLambda6
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i17 = c2;
                                                    TapToPayErrorDialogViewModel tapToPayErrorDialogViewModel3 = tapToPayErrorDialogViewModel2;
                                                    Function1 function114 = function113;
                                                    switch (i17) {
                                                        case 0:
                                                            function114.invoke(new TapToPayErrorDialogViewEvent(tapToPayErrorDialogViewModel3.primaryButtonAction));
                                                            break;
                                                        default:
                                                            tapToPayErrorDialogViewModel3.getClass();
                                                            function114.invoke(new TapToPayErrorDialogViewEvent(ErrorDialogAction$Action.CLOSE));
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            gapComposer22.updateRememberedValue(rememberedValue7);
                                        }
                                        modalButtonScope2.SecondaryModalButton((Function0) rememberedValue7, null, false, Expect_jvmKt.rememberComposableLambda(261132039, new TapToPayErrorDialogKt$$ExternalSyntheticLambda2(tapToPayErrorDialogViewModel2, 3), gapComposer22), gapComposer22, ((intValue22 << 12) & 57344) | 3072, 6);
                                    } else {
                                        gapComposer22.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer20), Expect_jvmKt.rememberComposableLambda(1536923530, new Function3() { // from class: com.squareup.cash.taptopay.views.TapToPayErrorDialogKt$$ExternalSyntheticLambda4
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            int i16 = i4;
                            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                            final TapToPayErrorDialogViewModel tapToPayErrorDialogViewModel2 = tapToPayErrorDialogViewModel;
                            final Function1 function113 = function112;
                            Object[] objArr = 0;
                            char c = 1;
                            switch (i16) {
                                case 0:
                                    ModalButtonScope modalButtonScope = (ModalButtonScope) obj5;
                                    Composer composer21 = (Composer) obj6;
                                    int intValue21 = ((Integer) obj7).intValue();
                                    modalButtonScope.getClass();
                                    if ((intValue21 & 6) == 0) {
                                        intValue21 |= ((GapComposer) composer21).changed(modalButtonScope) ? 4 : 2;
                                    }
                                    GapComposer gapComposer21 = (GapComposer) composer21;
                                    if (gapComposer21.shouldExecute(intValue21 & 1, (intValue21 & 19) != 18)) {
                                        boolean changed5 = gapComposer21.changed(function113) | gapComposer21.changed(tapToPayErrorDialogViewModel2.ordinal());
                                        Object rememberedValue6 = gapComposer21.rememberedValue();
                                        if (changed5 || rememberedValue6 == neverEqualPolicy2) {
                                            final int objArr2 = objArr == true ? 1 : 0;
                                            rememberedValue6 = new Function0() { // from class: com.squareup.cash.taptopay.views.TapToPayErrorDialogKt$$ExternalSyntheticLambda6
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i17 = objArr2;
                                                    TapToPayErrorDialogViewModel tapToPayErrorDialogViewModel3 = tapToPayErrorDialogViewModel2;
                                                    Function1 function114 = function113;
                                                    switch (i17) {
                                                        case 0:
                                                            function114.invoke(new TapToPayErrorDialogViewEvent(tapToPayErrorDialogViewModel3.primaryButtonAction));
                                                            break;
                                                        default:
                                                            tapToPayErrorDialogViewModel3.getClass();
                                                            function114.invoke(new TapToPayErrorDialogViewEvent(ErrorDialogAction$Action.CLOSE));
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            gapComposer21.updateRememberedValue(rememberedValue6);
                                        }
                                        modalButtonScope.PrimaryModalButton((Function0) rememberedValue6, null, false, Expect_jvmKt.rememberComposableLambda(305268244, new TapToPayErrorDialogKt$$ExternalSyntheticLambda2(tapToPayErrorDialogViewModel2, 2), gapComposer21), gapComposer21, (57344 & (intValue21 << 12)) | 3072, 6);
                                    } else {
                                        gapComposer21.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj5;
                                    Composer composer22 = (Composer) obj6;
                                    int intValue22 = ((Integer) obj7).intValue();
                                    modalButtonScope2.getClass();
                                    if ((intValue22 & 6) == 0) {
                                        intValue22 |= ((GapComposer) composer22).changed(modalButtonScope2) ? 4 : 2;
                                    }
                                    GapComposer gapComposer22 = (GapComposer) composer22;
                                    if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 19) != 18)) {
                                        boolean changed6 = gapComposer22.changed(function113) | gapComposer22.changed(tapToPayErrorDialogViewModel2.ordinal());
                                        Object rememberedValue7 = gapComposer22.rememberedValue();
                                        if (changed6 || rememberedValue7 == neverEqualPolicy2) {
                                            final int c2 = c == true ? 1 : 0;
                                            rememberedValue7 = new Function0() { // from class: com.squareup.cash.taptopay.views.TapToPayErrorDialogKt$$ExternalSyntheticLambda6
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i17 = c2;
                                                    TapToPayErrorDialogViewModel tapToPayErrorDialogViewModel3 = tapToPayErrorDialogViewModel2;
                                                    Function1 function114 = function113;
                                                    switch (i17) {
                                                        case 0:
                                                            function114.invoke(new TapToPayErrorDialogViewEvent(tapToPayErrorDialogViewModel3.primaryButtonAction));
                                                            break;
                                                        default:
                                                            tapToPayErrorDialogViewModel3.getClass();
                                                            function114.invoke(new TapToPayErrorDialogViewEvent(ErrorDialogAction$Action.CLOSE));
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            gapComposer22.updateRememberedValue(rememberedValue7);
                                        }
                                        modalButtonScope2.SecondaryModalButton((Function0) rememberedValue7, null, false, Expect_jvmKt.rememberComposableLambda(261132039, new TapToPayErrorDialogKt$$ExternalSyntheticLambda2(tapToPayErrorDialogViewModel2, 3), gapComposer22), gapComposer22, ((intValue22 << 12) & 57344) | 3072, 6);
                                    } else {
                                        gapComposer22.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer20), (Function3) null, gapComposer20, 28080, 32);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                ((TaxesAppletTile) obj4).UninstalledUI((TaxesAppletTileModel.Uninstalled) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 26:
                Navigator navigator = (Navigator) obj;
                CoroutineScope coroutineScope = (CoroutineScope) obj2;
                navigator.getClass();
                coroutineScope.getClass();
                LanguageDisclosureSetupTeardown.MetroFactory metroFactory = ((TaxesAppletTilePresenter$Factory$Impl) obj4).delegateFactory;
                TaxesAppletTileRepository taxesAppletTileRepository = (TaxesAppletTileRepository) metroFactory.appService.invoke();
                RealMoneyNavigatorHelper realMoneyNavigatorHelper = (RealMoneyNavigatorHelper) metroFactory.cashAppLiteGate.invoke();
                Analytics analytics = (Analytics) metroFactory.database.invoke();
                MoneyAnalyticsService moneyAnalyticsService = (MoneyAnalyticsService) metroFactory.initialScreenPreludeNavigator.invoke();
                FeatureFlagManager featureFlagManager = (FeatureFlagManager) metroFactory.isLanguageDisclosureAcceptancePending.invoke();
                PromotedAppletTilePresenter$Factory$Impl promotedAppletTilePresenter$Factory$Impl = (PromotedAppletTilePresenter$Factory$Impl) metroFactory.localeManager.invoke();
                RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) metroFactory.sessionManager.invoke();
                taxesAppletTileRepository.getClass();
                realMoneyNavigatorHelper.getClass();
                analytics.getClass();
                moneyAnalyticsService.getClass();
                featureFlagManager.getClass();
                promotedAppletTilePresenter$Factory$Impl.getClass();
                realRouter$Factory$Impl.getClass();
                Presenter.Binding start$default = Presenter.start$default(MoleculePresenterKt.asPresenter$default(new ShareSheetPresenter(taxesAppletTileRepository, realMoneyNavigatorHelper, analytics, moneyAnalyticsService, featureFlagManager, promotedAppletTilePresenter$Factory$Impl, navigator, realRouter$Factory$Impl)), coroutineScope, (LifecycleOwner) obj3);
                return new TaxesAppletTile(((MoleculePresenterKt$asPresenter$1$start$2) start$default).getModels(), new TaxesAppletViewsModule$$ExternalSyntheticLambda1(start$default, 0));
            case 27:
                ((Integer) obj2).getClass();
                ArcadeTransactionPickerViewKt.Transaction((TransactionViewModel) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 28:
                BalanceBasedAutoReloadConfirmationViewModel balanceBasedAutoReloadConfirmationViewModel = (BalanceBasedAutoReloadConfirmationViewModel) obj4;
                Function1 function113 = (Function1) obj3;
                Composer composer21 = (Composer) obj;
                int intValue21 = ((Integer) obj2).intValue();
                int i16 = BalanceBasedAutoReloadConfirmationView.$r8$clinit;
                GapComposer gapComposer21 = (GapComposer) composer21;
                if (gapComposer21.shouldExecute(intValue21 & 1, (intValue21 & 3) != 2)) {
                    AddMoneyViewKt.ArcadeAutoReloadConfirm((BalanceBasedAutoReloadConfirmationViewModel.Content) balanceBasedAutoReloadConfirmationViewModel, function113, gapComposer21, 0);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                AddMoneyViewKt.ArcadeAutoReloadConfirm((BalanceBasedAutoReloadConfirmationViewModel.Content) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ TaxTooltipView$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    public /* synthetic */ TaxTooltipView$$ExternalSyntheticLambda0(TapToPayErrorDialogViewModel tapToPayErrorDialogViewModel, Function1 function1) {
        this.$r8$classId = 24;
        this.f$0 = tapToPayErrorDialogViewModel;
        this.f$1 = function1;
    }

    public /* synthetic */ TaxTooltipView$$ExternalSyntheticLambda0(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
