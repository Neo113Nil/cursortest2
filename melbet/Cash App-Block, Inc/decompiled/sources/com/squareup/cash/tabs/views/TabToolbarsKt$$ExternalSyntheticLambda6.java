package com.squareup.cash.tabs.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.media3.extractor.text.LegacySubtitleUtil;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SetNameViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.cdf.customersupport.FullTransactionPickerOrigin;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.profile.views.ProfileUiView;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.shopping.views.ProductSearchView;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda0;
import com.squareup.cash.support.backend.api.SupportActivityItemLoader;
import com.squareup.cash.support.backend.api.SupportPhoneStatus;
import com.squareup.cash.support.backend.api.articles.Article;
import com.squareup.cash.support.chat.screens.SupportChatScreens;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$ActionBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$TransactionBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatExitPromptSheetViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatFailedDeliveryViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatImageDetailViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatSurveyViewModel;
import com.squareup.cash.support.chat.views.ChatExitPromptSheetView;
import com.squareup.cash.support.chat.views.ChatExitPromptView;
import com.squareup.cash.support.chat.views.ChatExitPromptViewKt;
import com.squareup.cash.support.chat.views.ChatFailedDeliverySheetView;
import com.squareup.cash.support.chat.views.ChatLoadingView;
import com.squareup.cash.support.chat.views.survey.ChatSurveyUnavailableView;
import com.squareup.cash.support.chat.views.survey.ChatSurveyView;
import com.squareup.cash.support.chat.views.transcript.message.ActionBodyViewKt;
import com.squareup.cash.support.chat.views.transcript.message.ActivityTransactionKt$$ExternalSyntheticLambda3;
import com.squareup.cash.support.chat.views.transcript.message.compose.MessageFileKt;
import com.squareup.cash.support.presenters.ArticlePresenter;
import com.squareup.cash.support.presenters.ArticlePresenter$models$1$1;
import com.squareup.cash.support.presenters.SupportHomePresenter;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.viewmodels.ContactSupportEmailInputViewModel$Loaded;
import com.squareup.cash.support.viewmodels.ContactSupportEmailMessageViewModel$Editing;
import com.squareup.cash.support.viewmodels.PhoneVerificationViewModel;
import com.squareup.cash.support.viewmodels.ScreenshotConfirmViewModel;
import com.squareup.cash.support.viewmodels.SupportFlowCheckConnectionViewModel;
import com.squareup.cash.support.viewmodels.SupportFullScreenActivityPickerViewModel;
import com.squareup.cash.support.viewmodels.SupportHomeContactOptionsSheetViewModel;
import com.squareup.cash.support.viewmodels.SupportHomeViewModel;
import com.squareup.cash.support.viewmodels.SupportIncidentDetailsViewModel;
import com.squareup.cash.support.viewmodels.SupportPhoneStatusViewModel;
import com.squareup.cash.support.viewmodels.SupportSearchViewModel;
import com.squareup.cash.support.viewmodels.SupportTransactionConfirmationViewModel;
import com.squareup.cash.support.views.ContactSupportEmailInputView;
import com.squareup.cash.support.views.ContactSupportEmailMessageView;
import com.squareup.cash.support.views.ScreenshotConfirmView;
import com.squareup.cash.support.views.ScreenshotReviewViewKt;
import com.squareup.cash.support.views.SupportFlowCheckConnectionView;
import com.squareup.cash.support.views.SupportHomeContactOptionsSheet;
import com.squareup.cash.support.views.SupportIncidentDetailsView;
import com.squareup.cash.support.views.SupportLoadClientScenarioView;
import com.squareup.cash.support.views.SupportPhoneStatusView;
import com.squareup.cash.support.views.SupportPhoneVerificationView;
import com.squareup.cash.support.views.SupportTransactionConfirmationView;
import com.squareup.cash.support.views.home.SupportHomeView$$ExternalSyntheticLambda3;
import com.squareup.cash.support.views.search.SupportSearchView;
import com.squareup.cash.support.views.search.SupportSearchViewKt;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda0;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes7.dex */
public final /* synthetic */ class TabToolbarsKt$$ExternalSyntheticLambda6 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ TabToolbarsKt$$ExternalSyntheticLambda6(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v16 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ?? r12;
        boolean z;
        int i = this.$r8$classId;
        int i2 = 28;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Object obj3 = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj4 = this.f$2;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj6;
                SwipeControlPlacement swipeControlPlacement = (SwipeControlPlacement) obj5;
                SwipeControlStyle swipeControlStyle = (SwipeControlStyle) obj4;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) ValueInsets.onGloballyPositioned(companion, new RealSandboxer$$ExternalSyntheticLambda0(swipeControlPlacement, i2)), (Object) swipeControlStyle, (Object) gapComposer, (Object) 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                int i3 = ChatExitPromptSheetView.$r8$clinit;
                ((ChatExitPromptSheetView) obj6).Content((ChatExitPromptSheetViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                ChatExitPromptViewKt.ExitPromptContent((ChatExitPromptSheetViewModel.Prompt) obj6, (Function1) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(385));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                int i4 = ChatExitPromptView.$r8$clinit;
                ((ChatExitPromptView) obj6).Content((Unit) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                int i5 = ChatFailedDeliverySheetView.$r8$clinit;
                ((ChatFailedDeliverySheetView) obj6).Content((ChatFailedDeliveryViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                ChatExitPromptViewKt.ImageDetailView((ChatImageDetailViewModel) obj6, (RealImageLoader) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                int i6 = ChatLoadingView.$r8$clinit;
                ((ChatLoadingView) obj6).Content((Unit) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                int i7 = ChatSurveyUnavailableView.$r8$clinit;
                ((ChatSurveyUnavailableView) obj6).Content((Unit) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                int i8 = ChatSurveyView.$r8$clinit;
                ((ChatSurveyView) obj6).Content((ChatSurveyViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) obj6;
                Function1 function1 = (Function1) obj5;
                State state = (State) obj4;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    SupportActivityItemLoader.State state2 = (SupportActivityItemLoader.State) state.getValue();
                    if (Intrinsics.areEqual(state2, SupportActivityItemLoader.State.Failure.INSTANCE)) {
                        gapComposer2.startReplaceGroup(1791560131);
                        boolean changedInstance = gapComposer2.changedInstance(mutableSharedFlow);
                        Object rememberedValue = gapComposer2.rememberedValue();
                        if (changedInstance || rememberedValue == obj3) {
                            r12 = 0;
                            rememberedValue = new ActivityTransactionKt$$ExternalSyntheticLambda3(mutableSharedFlow, 0);
                            gapComposer2.updateRememberedValue(rememberedValue);
                        } else {
                            r12 = 0;
                        }
                        ActionBodyViewKt.FailedToLoadContent(r12, r12, gapComposer2, (Function0) rememberedValue);
                        gapComposer2.end(r12);
                    } else if (Intrinsics.areEqual(state2, SupportActivityItemLoader.State.Failure.INSTANCE$1)) {
                        gapComposer2.startReplaceGroup(1791564630);
                        ActionBodyViewKt.LoadingContent(gapComposer2, 0);
                        gapComposer2.end(false);
                    } else {
                        if (!(state2 instanceof SupportActivityItemLoader.State.Success)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, 1791557550, false);
                        }
                        gapComposer2.startReplaceGroup(1791567216);
                        SupportActivityItemLoader.State.Success success = (SupportActivityItemLoader.State.Success) state2;
                        ActivityItemViewModel activityItemViewModel = success.activityItemViewModel;
                        boolean changedInstance2 = gapComposer2.changedInstance(state2) | gapComposer2.changed(function1);
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (changedInstance2 || rememberedValue2 == obj3) {
                            rememberedValue2 = new ShareSheetViewKt$$ExternalSyntheticLambda5(i2, function1, success);
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        ActionBodyViewKt.LoadedContent(activityItemViewModel, (Function0) rememberedValue2, gapComposer2, 0);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                ActionBodyViewKt.TransactionBodyContent((BodyViewModel$TransactionBodyViewModel) obj6, (String) obj5, (String) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 11:
                ChatContentViewModel.MessageViewModel messageViewModel = (ChatContentViewModel.MessageViewModel) obj6;
                ChatContentViewModel.EntryViewModel.Sender sender = messageViewModel.sender;
                Function1 function12 = (Function1) obj5;
                BodyViewModel$ActionBodyViewModel bodyViewModel$ActionBodyViewModel = (BodyViewModel$ActionBodyViewModel) obj4;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                boolean shouldExecute = gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2);
                Applier applier = gapComposer3.applier;
                if (shouldExecute) {
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer3, 0);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, companion);
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
                    Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                    BiasAlignment.Vertical vertical = Alignment.Companion.Bottom;
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, vertical, gapComposer3, 54);
                    int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, companion);
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    boolean z2 = messageViewModel.showSender;
                    ChatContentViewModel.EntryViewModel.Sender sender2 = ChatContentViewModel.EntryViewModel.Sender.ADVOCATE;
                    if (sender == sender2 && z2) {
                        gapComposer3.startReplaceGroup(-620488601);
                        z = false;
                        MessageFileKt.MessageAvatarAdvocate(null, gapComposer3, 0);
                        gapComposer3.end(false);
                    } else {
                        z = false;
                        gapComposer3.startReplaceGroup(-620445356);
                        gapComposer3.end(false);
                    }
                    float f = (sender != sender2 || z2) ? RecyclerView.DECELERATION_RATE : 28.0f;
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    Modifier clip = ClipKt.clip(ImageKt.m178borderxT4_qwU(ImageKt.m177backgroundbw27NRU(SpacerKt.m302paddingqDBjuR0$default(rowScopeInstance.weight(1.0f, companion, z), f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), Strings.getColors(gapComposer3).semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), 1.0f, Strings.getColors(gapComposer3).semantic.border.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(32.0f)), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(32.0f));
                    boolean changed = gapComposer3.changed(function12) | gapComposer3.changedInstance(bodyViewModel$ActionBodyViewModel);
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (changed || rememberedValue3 == obj3) {
                        rememberedValue3 = new TaxWebAppBridge$$ExternalSyntheticLambda0(1, function12, bodyViewModel$ActionBodyViewModel);
                        gapComposer3.updateRememberedValue(rememberedValue3);
                    }
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m183clickableoSLSa3U$default(clip, false, null, null, (Function0) rememberedValue3, 15), 24.0f);
                    RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical, gapComposer3, 48);
                    int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, m298padding3ABfNKs);
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer3, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    Modifier weight = rowScopeInstance.weight(1.0f, companion, false);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer3, 0);
                    int hashCode4 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer3, weight);
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer3, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer3).semantic.text.standard, (Composer) gapComposer3, (Modifier) null, Strings.getTypography(gapComposer3).sectionTitle, (TextLineBalancing) null, bodyViewModel$ActionBodyViewModel.title, (Map) null, (Function1) null, false);
                    DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer3, null);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer3).semantic.text.standard, (Composer) gapComposer3, (Modifier) null, Strings.getTypography(gapComposer3).bodySmall, (TextLineBalancing) null, bodyViewModel$ActionBodyViewModel.subtitle, (Map) null, (Function1) null, false);
                    gapComposer3.end(true);
                    Trace.m1191Iconww6aTOc(Icons.SubtlePush16, (String) null, (Modifier) null, Strings.getColors(gapComposer3).semantic.icon.subtle, gapComposer3, 54, 4);
                    Boxes$$ExternalSyntheticOutline1.m(gapComposer3, true, true, true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                MessageFileKt.MessageUnknown((ChatContentViewModel.MessageViewModel) obj6, (Function0) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 13:
                ArticlePresenter articlePresenter = (ArticlePresenter) obj6;
                CoroutineScope coroutineScope = (CoroutineScope) obj5;
                MutableState mutableState = (MutableState) obj4;
                SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion transactionConfirmationQuestion = (SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion) obj;
                SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationResult transactionConfirmationResult = (SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationResult) obj2;
                transactionConfirmationQuestion.getClass();
                Continuation continuation = null;
                if (Intrinsics.areEqual(transactionConfirmationResult, SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationResult.Yes.INSTANCE)) {
                    BetterNavigator.ScreenNavigator screenNavigator = articlePresenter.navigator;
                    SupportScreens.FlowScreens.Data data = articlePresenter.args.data;
                    String str = transactionConfirmationQuestion.articleToken;
                    Article.ContactOption contactOption = transactionConfirmationQuestion.contactOption;
                    Article article = (Article) mutableState.getValue();
                    screenNavigator.goTo(new SupportScreens.FlowScreens.SupportActivityPickerFullScreen(SupportScreens.FlowScreens.Data.copy$default(data, str, null, null, null, contactOption, article != null ? Boolean.valueOf(article.includeIssueDescription) : null, 61), FullTransactionPickerOrigin.ARTICLE, null));
                } else if (Intrinsics.areEqual(transactionConfirmationResult, SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationResult.No.INSTANCE)) {
                    JobKt.launch$default(coroutineScope, null, null, new ArticlePresenter$models$1$1(12, mutableState, articlePresenter, transactionConfirmationQuestion, continuation), 3);
                } else if (transactionConfirmationResult != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return Unit.INSTANCE;
            case 14:
                SupportHomePresenter supportHomePresenter = (SupportHomePresenter) obj6;
                SupportScreens.FlowScreens.SupportHomeScreen supportHomeScreen = supportHomePresenter.args;
                Analytics analytics = supportHomePresenter.analytics;
                State state3 = (State) obj5;
                State state4 = (State) obj4;
                SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetResult supportHomeContactOptionsSheetResult = (SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetResult) obj2;
                ((SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetQuestion) obj).getClass();
                if (Intrinsics.areEqual(supportHomeContactOptionsSheetResult, SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetResult.Chat.INSTANCE)) {
                    LegacySubtitleUtil.logTapSupportChat(analytics, supportHomeScreen, Boolean.valueOf(SupportHomePresenter.models$lambda$8(state3)));
                    supportHomePresenter.goToChatLoading(SupportChatScreens.FlowScreen.ChatLoading.Source.OTHER);
                } else if (Intrinsics.areEqual(supportHomeContactOptionsSheetResult, SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetResult.Phone.INSTANCE)) {
                    LegacySubtitleUtil.logTapSupportPhone(analytics, (SupportPhoneStatus) state4.getValue(), supportHomeScreen);
                    supportHomePresenter.onPhoneButtonClicked((SupportPhoneStatus) state4.getValue());
                }
                return Unit.INSTANCE;
            case 15:
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj6;
                Function1 function13 = (Function1) obj5;
                ContactSupportEmailInputViewModel$Loaded contactSupportEmailInputViewModel$Loaded = (ContactSupportEmailInputViewModel$Loaded) obj4;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                int i9 = ContactSupportEmailInputView.$r8$clinit;
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                    } else {
                        gapComposer4.startReplaceGroup(-1762997739);
                        gapComposer4.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer4, 0);
                    int hashCode5 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer4, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer4.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope5, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode5), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer4, materializeModifier5, ComposeUiNode.Companion.SetModifier);
                    NavigationType navigationType = NavigationType.BACK;
                    boolean changed2 = gapComposer4.changed(delegatingSoftwareKeyboardController) | gapComposer4.changed(function13);
                    Object rememberedValue4 = gapComposer4.rememberedValue();
                    if (changed2 || rememberedValue4 == obj3) {
                        rememberedValue4 = new SetNameViewKt$$ExternalSyntheticLambda6(delegatingSoftwareKeyboardController, function13, 24);
                        gapComposer4.updateRememberedValue(rememberedValue4);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue4, (Modifier) null, (Function3) null, gapComposer4, 54, 108);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer4, null);
                    if (contactSupportEmailInputViewModel$Loaded == null) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer4, 2060459879, false);
                    }
                    gapComposer4.startReplaceGroup(2060461047);
                    ScreenshotReviewViewKt.Loaded(contactSupportEmailInputViewModel$Loaded, function13, gapComposer4, 0);
                    gapComposer4.end(false);
                    gapComposer4.end(true);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                int i10 = ContactSupportEmailInputView.$r8$clinit;
                ((ContactSupportEmailInputView) obj6).Content((ContactSupportEmailInputViewModel$Loaded) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                int i11 = ContactSupportEmailMessageView.$r8$clinit;
                ((ContactSupportEmailMessageView) obj6).Content((ContactSupportEmailMessageViewModel$Editing) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                int i12 = ScreenshotConfirmView.$r8$clinit;
                ((ScreenshotConfirmView) obj6).Content((ScreenshotConfirmViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                int i13 = SupportFlowCheckConnectionView.$r8$clinit;
                ((SupportFlowCheckConnectionView) obj6).Content((SupportFlowCheckConnectionViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                ((ProfileUiView) obj6).Content((SupportFullScreenActivityPickerViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                int i14 = SupportHomeContactOptionsSheet.$r8$clinit;
                ((SupportHomeContactOptionsSheet) obj6).Content((SupportHomeContactOptionsSheetViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                int i15 = SupportIncidentDetailsView.$r8$clinit;
                ((SupportIncidentDetailsView) obj6).Content((SupportIncidentDetailsViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                int i16 = SupportLoadClientScenarioView.$r8$clinit;
                ((SupportLoadClientScenarioView) obj6).Content((Unit) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                int i17 = SupportPhoneStatusView.$r8$clinit;
                ((SupportPhoneStatusView) obj6).Content((SupportPhoneStatusViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                int i18 = SupportPhoneVerificationView.$r8$clinit;
                ((SupportPhoneVerificationView) obj6).Content((PhoneVerificationViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                int i19 = SupportTransactionConfirmationView.$r8$clinit;
                ((SupportTransactionConfirmationView) obj6).Content((SupportTransactionConfirmationViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 27:
                ProductSearchView productSearchView = (ProductSearchView) obj6;
                SupportHomeViewModel supportHomeViewModel = (SupportHomeViewModel) obj5;
                Function1 function14 = (Function1) obj4;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime((RealImageLoader) productSearchView.imageLoader), Expect_jvmKt.rememberComposableLambda(177657343, new SupportHomeView$$ExternalSyntheticLambda3(supportHomeViewModel, function14), gapComposer5), gapComposer5, 56);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                int i20 = SupportSearchView.$r8$clinit;
                ((SupportSearchView) obj6).Content((SupportSearchViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                SupportSearchViewKt.Results((List) obj6, (Function1) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ TabToolbarsKt$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }
}
