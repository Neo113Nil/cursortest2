package kotlinx.coroutines.channels;

import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import app.cash.local.views.brand.checkout.CurbsidePickupCarSheetKt$$ExternalSyntheticLambda7;
import app.cash.molecule.PlatformKt;
import coil3.RealImageLoader;
import coil3.size.DimensionKt;
import coil3.size.SizeKt;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.tax.views.TaxTooltipView$Content$1$1$1;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.CardAppletTile$$ExternalSyntheticLambda1;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda32;
import com.squareup.cash.wallet.views.UtilsKt;
import com.squareup.cash.work.viewmodels.DeclareCashTipBottomSheetViewModel;
import com.squareup.cash.work.viewmodels.SellerCardViewModel;
import com.squareup.cash.work.viewmodels.ShiftDetailViewModel;
import com.squareup.cash.work.viewmodels.ShiftFilterViewModel;
import com.squareup.cash.work.viewmodels.ShiftListViewModel;
import com.squareup.cash.work.viewmodels.TakeBreakBottomSheetViewModel;
import com.squareup.cash.work.viewmodels.WorkHomeTitleBarViewModel;
import com.squareup.cash.work.views.WorkTitleBarViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.work.views.clockin.DisclaimerTextKt;
import com.squareup.cash.work.views.pay.PayHomeViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.work.views.shift.ShiftListViewKt;
import com.squareup.cash.work.webview.views.WorkWebViewKt$$ExternalSyntheticLambda14;
import com.squareup.util.compose.ListsKt$$ExternalSyntheticLambda0;
import com.squareup.workflow1.internal.SubtreeManager;
import com.stripe.android.StripePaymentController$$ExternalSyntheticLambda1;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerState;
import com.stripe.android.financialconnections.model.AddNewAccount;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.ui.components.TextKt;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsCollectionRequirement;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.UiStepButtonType;
import com.withpersona.sdk2.inquiry.ui.MdocHelperKt;
import com.withpersona.sdk2.inquiry.ui.UiState;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda9;
import com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.SelectInstance;
import okhttp3.internal.ws.RealWebSocket$connect$1;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import xyz.block.genie.state.StateBindingsKt$$ExternalSyntheticLambda0;

/* loaded from: classes7.dex */
public final /* synthetic */ class BufferedChannel$$ExternalSyntheticLambda4 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ BufferedChannel$$ExternalSyntheticLambda4(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i2 = 16;
        final int i3 = 0;
        Object obj4 = this.f$2;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        char c = 1;
        switch (i) {
            case 0:
                BufferedChannel bufferedChannel = (BufferedChannel) obj5;
                SelectInstance selectInstance = (SelectInstance) obj4;
                if (obj6 != BufferedChannelKt.CHANNEL_CLOSED) {
                    OnUndeliveredElementKt.callUndeliveredElement(bufferedChannel.onUndeliveredElement, obj6, ((SelectImplementation) selectInstance).context);
                }
                return Unit.INSTANCE;
            case 1:
                CardSchemeViewModel cardSchemeViewModel = (CardSchemeViewModel) obj6;
                Function1 function1 = (Function1) obj5;
                RealImageLoader realImageLoader = (RealImageLoader) obj4;
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    UtilsKt.WalletScheme(SpacerKt.m302paddingqDBjuR0$default(SpacerKt.padding(ImageKt.verticalScroll$default(companion, ImageKt.rememberScrollState(gapComposer), false, 14), paddingValues), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7), ((CardSchemeViewModel.Content) cardSchemeViewModel).overflowModules, function1, realImageLoader, UtilsKt.lambda$1213729391, gapComposer, 24576);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                String str = (String) obj6;
                Function1 function12 = (Function1) obj5;
                WorkHomeTitleBarViewModel workHomeTitleBarViewModel = (WorkHomeTitleBarViewModel) obj4;
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                titleBarActionScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(titleBarActionScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    Icons icons = Icons.Date24;
                    boolean changed = gapComposer2.changed(function12);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new PayHomeViewKt$$ExternalSyntheticLambda2(7, function12);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    int i4 = 14 & intValue2;
                    TransactorKt.IconAction(titleBarActionScope, icons, str, (Function0) rememberedValue, null, null, null, null, null, null, false, gapComposer2, i4 | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                    SellerCardViewModel sellerCardViewModel = workHomeTitleBarViewModel.sellerCardViewModel;
                    if (sellerCardViewModel == null) {
                        gapComposer2.startReplaceGroup(-1161489525);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-1161489524);
                        TransactorKt.CustomAction(titleBarActionScope, null, null, Expect_jvmKt.rememberComposableLambda(1376081385, new WorkTitleBarViewKt$$ExternalSyntheticLambda4(i3, function12, sellerCardViewModel), gapComposer2), gapComposer2, i4 | 3072, 3);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                String str2 = (String) obj6;
                String str3 = (String) obj5;
                Function0 function0 = (Function0) obj4;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    DisclaimerTextKt.DisclaimerText(str2, str3, str3 != null ? function0 : null, gapComposer3, 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Function1 function13 = (Function1) obj6;
                TextFieldState textFieldState = (TextFieldState) obj5;
                DeclareCashTipBottomSheetViewModel declareCashTipBottomSheetViewModel = (DeclareCashTipBottomSheetViewModel) obj4;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    boolean changed2 = gapComposer4.changed(function13) | gapComposer4.changed(textFieldState);
                    Object rememberedValue2 = gapComposer4.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new CurbsidePickupCarSheetKt$$ExternalSyntheticLambda7(3, textFieldState, function13);
                        gapComposer4.updateRememberedValue(rememberedValue2);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue2, null, null, false, (StringsKt.isBlank(textFieldState.getValue$foundation().text) || declareCashTipBottomSheetViewModel.isLoading) ? false : true, null, Expect_jvmKt.rememberComposableLambda(663327334, new CardAppletTile$$ExternalSyntheticLambda1(declareCashTipBottomSheetViewModel, 11), gapComposer4), gapComposer4, 1572864, 46);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                TakeBreakBottomSheetViewModel takeBreakBottomSheetViewModel = (TakeBreakBottomSheetViewModel) obj6;
                MutableState mutableState = (MutableState) obj5;
                Function1 function14 = (Function1) obj4;
                PaddingValues paddingValues2 = (PaddingValues) obj;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                paddingValues2.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((GapComposer) composer5).changed(paddingValues2) ? 4 : 2;
                }
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 19) != 18)) {
                    Modifier verticalScroll$default = ImageKt.verticalScroll$default(SpacerKt.padding(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), paddingValues2), ImageKt.rememberScrollState(gapComposer5), false, 14);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer5, 0);
                    int hashCode = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer5, verticalScroll$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer5.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(gapComposer5, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer5, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    ViewfinderDefaults.SectionHeader(takeBreakBottomSheetViewModel.title, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer5, 0, 30);
                    gapComposer5.startReplaceGroup(157629181);
                    for (final TakeBreakBottomSheetViewModel.BreakItem breakItem : takeBreakBottomSheetViewModel.breaks) {
                        boolean areEqual = Intrinsics.areEqual((String) mutableState.getValue(), breakItem.token);
                        ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(48854096, new Function2() { // from class: com.squareup.cash.work.views.clockin.TakeBreakBottomSheetViewKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj7, Object obj8) {
                                int i5 = i3;
                                TakeBreakBottomSheetViewModel.BreakItem breakItem2 = breakItem;
                                switch (i5) {
                                    case 0:
                                        Composer composer6 = (Composer) obj7;
                                        int intValue6 = ((Integer) obj8).intValue();
                                        GapComposer gapComposer6 = (GapComposer) composer6;
                                        if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, breakItem2.name, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer6.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer7 = (Composer) obj7;
                                        int intValue7 = ((Integer) obj8).intValue();
                                        GapComposer gapComposer7 = (GapComposer) composer7;
                                        if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer7, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, breakItem2.durationText, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer7.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer5);
                        final char c2 = c == true ? 1 : 0;
                        CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda, null, null, false, false, Expect_jvmKt.rememberComposableLambda(-1720174890, new Function2() { // from class: com.squareup.cash.work.views.clockin.TakeBreakBottomSheetViewKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj7, Object obj8) {
                                int i5 = c2;
                                TakeBreakBottomSheetViewModel.BreakItem breakItem2 = breakItem;
                                switch (i5) {
                                    case 0:
                                        Composer composer6 = (Composer) obj7;
                                        int intValue6 = ((Integer) obj8).intValue();
                                        GapComposer gapComposer6 = (GapComposer) composer6;
                                        if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, breakItem2.name, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer6.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer7 = (Composer) obj7;
                                        int intValue7 = ((Integer) obj8).intValue();
                                        GapComposer gapComposer7 = (GapComposer) composer7;
                                        if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer7, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, breakItem2.durationText, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer7.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer5), null, 0L, new CellDefaultAccessory.Label(Expect_jvmKt.rememberComposableLambda(333851636, new HeroCardViewKt$$ExternalSyntheticLambda32(breakItem, function14, mutableState, areEqual), gapComposer5), 1), null, gapComposer5, 1572870, 1470);
                    }
                    gapComposer5.end(false);
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(1967743383, new WorkWebViewKt$$ExternalSyntheticLambda14(i2, function14), gapComposer5), gapComposer5, 24576, 15);
                    gapComposer5.end(true);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                ShiftDetailViewModel.Loaded loaded = (ShiftDetailViewModel.Loaded) obj6;
                Function1 function15 = (Function1) obj5;
                String str4 = (String) obj4;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode2 = Long.hashCode(gapComposer6.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer6.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer6, fillMaxWidth);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer6.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer6.startReusableNode();
                    if (gapComposer6.inserting) {
                        gapComposer6.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer6.useNode();
                    }
                    Updater.m576setimpl(gapComposer6, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer6, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer6, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer6, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer6, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    gapComposer6.startReplaceGroup(-1782236937);
                    Modifier fillMaxWidth2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    if (loaded.isClockInEnabled) {
                        gapComposer6.startReplaceGroup(-1454430416);
                        gapComposer6.end(false);
                    } else {
                        gapComposer6.startReplaceGroup(-2137771149);
                        boolean changed3 = gapComposer6.changed(str4);
                        Object rememberedValue3 = gapComposer6.rememberedValue();
                        if (changed3 || rememberedValue3 == neverEqualPolicy) {
                            rememberedValue3 = new StateBindingsKt$$ExternalSyntheticLambda0(str4, 13);
                            gapComposer6.updateRememberedValue(rememberedValue3);
                        }
                        fillMaxWidth2 = SemanticsModifierKt.semantics(fillMaxWidth2, false, (Function1) rememberedValue3);
                        gapComposer6.end(false);
                    }
                    Modifier modifier = fillMaxWidth2;
                    gapComposer6.end(false);
                    boolean z = loaded.isClockInEnabled;
                    boolean changed4 = gapComposer6.changed(function15);
                    Object rememberedValue4 = gapComposer6.rememberedValue();
                    if (changed4 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new PayHomeViewKt$$ExternalSyntheticLambda2(26, function15);
                        gapComposer6.updateRememberedValue(rememberedValue4);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue4, modifier, buttonProminence, false, z, null, ShiftListViewKt.lambda$1193818120, gapComposer6, 1573248, 40);
                    if (loaded.isClockInEnabled) {
                        gapComposer6.startReplaceGroup(586164639);
                        gapComposer6.end(false);
                    } else {
                        gapComposer6.startReplaceGroup(585850392);
                        Modifier matchParentSize = BoxScopeInstance.INSTANCE.matchParentSize();
                        Object rememberedValue5 = gapComposer6.rememberedValue();
                        if (rememberedValue5 == neverEqualPolicy) {
                            rememberedValue5 = new StripePaymentController$$ExternalSyntheticLambda1(19);
                            gapComposer6.updateRememberedValue(rememberedValue5);
                        }
                        Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(matchParentSize, (Function1) rememberedValue5);
                        Unit unit = Unit.INSTANCE;
                        boolean changed5 = gapComposer6.changed(function15);
                        Object rememberedValue6 = gapComposer6.rememberedValue();
                        if (changed5 || rememberedValue6 == neverEqualPolicy) {
                            rememberedValue6 = new TaxTooltipView$Content$1$1$1(3, function15);
                            gapComposer6.updateRememberedValue(rememberedValue6);
                        }
                        BoxKt.Box(SuspendingPointerInputFilterKt.pointerInput(clearAndSetSemantics, unit, (PointerInputEventHandler) rememberedValue6), gapComposer6, 0);
                        gapComposer6.end(false);
                    }
                    gapComposer6.end(true);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                ShiftListViewModel shiftListViewModel = (ShiftListViewModel) obj6;
                Function1 function16 = (Function1) obj5;
                MutableState mutableState2 = (MutableState) obj4;
                PaddingValues paddingValues3 = (PaddingValues) obj;
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                paddingValues3.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((GapComposer) composer7).changed(paddingValues3) ? 4 : 2;
                }
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 19) != 18)) {
                    ShiftFilterViewModel shiftFilterViewModel = ((ShiftListViewModel.Loaded) shiftListViewModel).filter;
                    boolean changed6 = gapComposer7.changed(function16);
                    Object rememberedValue7 = gapComposer7.rememberedValue();
                    if (changed6 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new CashMapViewKt$$ExternalSyntheticLambda3(function16, mutableState2, 17);
                        gapComposer7.updateRememberedValue(rememberedValue7);
                    }
                    ShiftListViewKt.ShiftListFilterSheet(shiftFilterViewModel, (Function1) rememberedValue7, SpacerKt.padding(companion, paddingValues3), gapComposer7, 0);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                LinkAccountPickerState.Payload payload = (LinkAccountPickerState.Payload) obj6;
                Async async = (Async) obj5;
                Function0 function02 = (Function0) obj4;
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    AddNewAccount addNewAccount = payload.addNewAccount;
                    boolean changed7 = gapComposer8.changed(async) | gapComposer8.changed(function02);
                    Object rememberedValue8 = gapComposer8.rememberedValue();
                    if (changed7 || rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new ListsKt$$ExternalSyntheticLambda0(28, async, function02);
                        gapComposer8.updateRememberedValue(rememberedValue8);
                    }
                    LinkAccountPickerScreenKt.SelectNewAccount((Function0) rememberedValue8, addNewAccount, gapComposer8, 0);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                CoroutineScope coroutineScope = (CoroutineScope) obj6;
                RealWebSocket$connect$1 realWebSocket$connect$1 = (RealWebSocket$connect$1) obj5;
                Function0 function03 = (Function0) obj4;
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    TextKt.CloseButton(coroutineScope, realWebSocket$connect$1, function03, gapComposer9, 0);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                UiStepStateManager uiStepStateManager = (UiStepStateManager) obj6;
                UiState uiState = (UiState) obj5;
                UiWorkflow.Input input = (UiWorkflow.Input) obj4;
                UiComponent uiComponent = (UiComponent) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                Map map = (Map) obj3;
                uiComponent.getClass();
                map.getClass();
                UiStepButtonType buttonType = MdocHelperKt.toButtonType(uiComponent);
                if (buttonType != null) {
                    TrackingEventsLogger.DefaultImpls.logUiStepButtonEvent$default(uiStepStateManager.trackingEventsLogger, buttonType, uiComponent.getName(), ((UiState.Displaying) uiState).stepName, false, 8, null);
                }
                UiState.Displaying displaying = (UiState.Displaying) uiState;
                UiStepStateManager.recurse(displaying.components, new UiWorkflow$$ExternalSyntheticLambda9(booleanValue, uiComponent, 1));
                if (input.inquirySessionConfig.gpsCollectionRequirement == GpsCollectionRequirement.NONE || displaying.hasRequestedGpsPermissions) {
                    WorkflowState state = ((SubtreeManager) uiStepStateManager.lastChild).getState();
                    UiState.Displaying displaying2 = state instanceof UiState.Displaying ? (UiState.Displaying) state : null;
                    if (displaying2 == null) {
                        return Unit.INSTANCE;
                    }
                    UiState.Displaying copy$default = UiState.Displaying.copy$default(displaying2, null, null, null, null, null, null, false, map, uiComponent, null, false, null, 0, 62463);
                    uiStepStateManager.updateState(copy$default);
                    uiStepStateManager.outputSubmit(copy$default);
                } else {
                    uiStepStateManager.updateState(UiState.Displaying.copy$default(displaying, null, null, null, null, null, null, true, map, uiComponent, null, false, null, 0, 61951));
                }
                return Unit.INSTANCE;
        }
    }
}
