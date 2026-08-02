package radiography;

import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.fillr.core.analytics.FillrAnalyticsServiceBuilder;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacg;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.SearchBarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.db.contacts.RecipientUtil;
import com.squareup.cash.shopping.views.ShopErrorKt$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.wallet.views.WalletHomeViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.work.viewmodels.SellerCardViewModel;
import com.squareup.cash.work.viewmodels.ShiftDetailViewModel;
import com.squareup.cash.work.viewmodels.ShiftListDayViewModel;
import com.squareup.cash.work.viewmodels.ShiftListScheduleViewModel;
import com.squareup.cash.work.viewmodels.ShiftListTimecardViewModel;
import com.squareup.cash.work.viewmodels.ShiftNotStartedDialogViewModel;
import com.squareup.cash.work.viewmodels.ShiftNoteViewModel;
import com.squareup.cash.work.viewmodels.TaxFormDownloaderViewModel;
import com.squareup.cash.work.viewmodels.TaxFormsListViewModel;
import com.squareup.cash.work.viewmodels.TimecardDetailViewModel;
import com.squareup.cash.work.viewmodels.ToastState;
import com.squareup.cash.work.viewmodels.WorkYouViewModel;
import com.squareup.cash.work.views.WorkTitleBarViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.work.views.pay.PayCellViewKt;
import com.squareup.cash.work.views.pay.PayHomeViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.work.views.pay.TaxFormDownloaderDialogViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.work.views.shift.LoadingAction;
import com.squareup.cash.work.views.shift.ShiftDetailViewKt;
import com.squareup.cash.work.views.shift.ShiftListViewKt;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.work.views.shift.ShiftSectionView2Kt;
import com.squareup.cash.work.views.timecard.TimecardDetailViewKt;
import com.squareup.cash.work.views.you.WorkYouViewKt;
import com.squareup.cash.work.webview.views.WorkWebViewKt$$ExternalSyntheticLambda14;
import com.squareup.scannerview.ScannerView;
import com.squareup.util.Strings;
import com.squareup.util.compose.ListsKt$$ExternalSyntheticLambda0;
import com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda5;
import com.squareup.workflow1.internal.WorkflowNode$tick$1$1;
import com.stripe.android.financialconnections.FinancialConnectionsSheetActivity;
import com.stripe.android.financialconnections.FinancialConnectionsSheetActivity$$ExternalSyntheticLambda3;
import com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupState;
import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationScreenKt;
import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationState;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetNativeActivityArgs;
import com.stripe.android.financialconnections.model.AddNewAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.OauthPrepane;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetNavigator;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivityKt;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton$Type$Primary;
import com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton$Type$Secondary;
import com.stripe.android.financialconnections.ui.components.TextKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsColors;
import com.stripe.android.financialconnections.ui.theme.Theme;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState;
import com.withpersona.sdk2.inquiry.steps.ui.components.ESignatureComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner;
import com.withpersona.sdk2.inquiry.ui.databinding.Pi2InquiryUiBinding;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.reflect.KFunction;
import kotlin.sequences.SequencesKt___SequencesKt;

/* loaded from: classes7.dex */
public final /* synthetic */ class Radiography$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ Radiography$$ExternalSyntheticLambda1(ShiftNotStartedDialogViewModel shiftNotStartedDialogViewModel, Function1 function1) {
        this.$r8$classId = 1;
        this.f$0 = shiftNotStartedDialogViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        boolean z;
        boolean z2;
        TextFieldState m382rememberTextFieldStateLepunE;
        GapComposer gapComposer;
        State state;
        Applier applier;
        Object obj3;
        TextFieldState textFieldState;
        boolean z3;
        MutableState mutableState;
        Object obj4;
        MutableState mutableState2;
        Object obj5;
        boolean z4;
        Theme theme;
        int i2 = this.$r8$classId;
        int i3 = 13;
        int i4 = 19;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i5 = 14;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i6 = 1;
        Object obj6 = this.f$1;
        Object obj7 = this.f$0;
        switch (i2) {
            case 0:
                ViewFilters$$ExternalSyntheticLambda0 viewFilters$$ExternalSyntheticLambda0 = (ViewFilters$$ExternalSyntheticLambda0) obj6;
                StringBuilder sb = (StringBuilder) obj;
                ScannableView scannableView = (ScannableView) obj2;
                sb.getClass();
                scannableView.getClass();
                sb.append(scannableView.getDisplayName());
                sb.append(" { ");
                int length = sb.length();
                AttributeAppendable attributeAppendable = new AttributeAppendable(sb);
                Iterator it = ((List) obj7).iterator();
                while (it.hasNext()) {
                    ((ViewStateRenderer) it.next()).render(attributeAppendable, scannableView);
                }
                if (sb.length() == length) {
                    sb.delete(length - 3, sb.length());
                } else {
                    sb.append(" }");
                }
                return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.filter(scannableView.getChildren(), new Radiography$renderScannableViewTree$1$2(1, viewFilters$$ExternalSyntheticLambda0, ViewFilters$$ExternalSyntheticLambda0.class, "matches", "matches(Lradiography/ScannableView;)Z", 0, 0)));
            case 1:
                boolean z5 = false;
                ShiftNotStartedDialogViewModel shiftNotStartedDialogViewModel = (ShiftNotStartedDialogViewModel) obj7;
                Function1 function1 = (Function1) obj6;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z5 = true;
                }
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, z5)) {
                    ModalKt.Modal(Modifier.Companion.$$INSTANCE, Room.stringResource(gapComposer2, R.string.work_shift_not_started_title), shiftNotStartedDialogViewModel.bodyText, Expect_jvmKt.rememberComposableLambda(1719859623, new WorkWebViewKt$$ExternalSyntheticLambda14(15, function1), gapComposer2), (Function3) null, (Function3) null, gapComposer2, 3072, 48);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                TaxFormDownloaderViewModel taxFormDownloaderViewModel = (TaxFormDownloaderViewModel) obj7;
                Function1 function12 = (Function1) obj6;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ModalKt.Modal(Modifier.Companion.$$INSTANCE, PayCellViewKt.f777lambda$2117054285, Expect_jvmKt.rememberComposableLambda(-1994150348, new TaxFormDownloaderDialogViewKt$$ExternalSyntheticLambda2(taxFormDownloaderViewModel, 0), gapComposer3), Expect_jvmKt.rememberComposableLambda(-404061688, new WorkTitleBarViewKt$$ExternalSyntheticLambda4(14, function12, taxFormDownloaderViewModel), gapComposer3), (Function3) null, PayCellViewKt.f775lambda$1625438537, gapComposer3, 200112, 16);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Function1 function13 = (Function1) obj7;
                TaxFormsListViewModel taxFormsListViewModel = (TaxFormsListViewModel) obj6;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer3;
                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        i = 0;
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                    } else {
                        i = 0;
                        gapComposer4.startReplaceGroup(-1762997739);
                        gapComposer4.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer4, i);
                    int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer4.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer4, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    String stringResource = Room.stringResource(gapComposer4, R.string.work_tax_forms_title);
                    NavigationType navigationType = NavigationType.BACK;
                    boolean changed = gapComposer4.changed(function13);
                    Object rememberedValue = gapComposer4.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new PayHomeViewKt$$ExternalSyntheticLambda2(24, function13);
                        gapComposer4.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.TitleBarSub(stringResource, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer4, 48, 108);
                    boolean z6 = taxFormsListViewModel instanceof TaxFormsListViewModel.Loading;
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    if (z6) {
                        gapComposer4.startReplaceGroup(-1480229254);
                        z = true;
                        PayCellViewKt.TaxFormsListLoading(columnScopeInstance.weight(1.0f, companion, true), gapComposer4, 0);
                        gapComposer4.end(false);
                    } else {
                        z = true;
                        if (taxFormsListViewModel instanceof TaxFormsListViewModel.Loaded) {
                            gapComposer4.startReplaceGroup(-1480225878);
                            PayCellViewKt.TaxFormsListContent((TaxFormsListViewModel.Loaded) taxFormsListViewModel, function13, columnScopeInstance.weight(1.0f, companion, true), gapComposer4, 0);
                            gapComposer4.end(false);
                        } else if (taxFormsListViewModel instanceof TaxFormsListViewModel.Empty) {
                            gapComposer4.startReplaceGroup(-1480222369);
                            PayCellViewKt.TaxFormsListEmpty((TaxFormsListViewModel.Empty) taxFormsListViewModel, columnScopeInstance.weight(1.0f, companion, true), gapComposer4, 0);
                            gapComposer4.end(false);
                        } else {
                            if (!(taxFormsListViewModel instanceof TaxFormsListViewModel.Error)) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer4, -1480230657, false);
                            }
                            gapComposer4.startReplaceGroup(-1480218792);
                            Modifier weight = columnScopeInstance.weight(1.0f, companion, true);
                            boolean changed2 = gapComposer4.changed(function13);
                            Object rememberedValue2 = gapComposer4.rememberedValue();
                            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                                rememberedValue2 = new PayHomeViewKt$$ExternalSyntheticLambda2(25, function13);
                                gapComposer4.updateRememberedValue(rememberedValue2);
                            }
                            PayCellViewKt.TaxFormsListError(0, gapComposer4, weight, (Function0) rememberedValue2);
                            gapComposer4.end(false);
                            z2 = true;
                            gapComposer4.end(z2);
                        }
                    }
                    z2 = z;
                    gapComposer4.end(z2);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                PayCellViewKt.TaxFormsListEmpty((TaxFormsListViewModel.Empty) obj7, (Modifier) obj6, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                ShiftDetailViewKt.LoadedShiftDetailView((ShiftDetailViewModel.Loaded) obj7, (Function1) obj6, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                ShiftListViewKt.ShiftListDaySection((ShiftListDayViewModel) obj7, (Function1) obj6, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                ShiftListTimecardViewModel shiftListTimecardViewModel = (ShiftListTimecardViewModel) obj7;
                ShiftListDayViewModel shiftListDayViewModel = (ShiftListDayViewModel) obj6;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer4;
                if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    ShiftListViewKt.SellerCardWithOptionalCheck(shiftListTimecardViewModel.sellerCard, shiftListDayViewModel.isPast, gapComposer5, 0);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                ShiftListScheduleViewModel shiftListScheduleViewModel = (ShiftListScheduleViewModel) obj7;
                ShiftListDayViewModel shiftListDayViewModel2 = (ShiftListDayViewModel) obj6;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer5;
                if (gapComposer6.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    ShiftListViewKt.SellerCardWithOptionalCheck(shiftListScheduleViewModel.sellerCard, shiftListDayViewModel2.isPast, gapComposer6, 0);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                ShiftNoteViewModel shiftNoteViewModel = (ShiftNoteViewModel) obj7;
                Function1 function14 = (Function1) obj6;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer6;
                boolean shouldExecute = gapComposer7.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2);
                Applier applier2 = gapComposer7.applier;
                if (shouldExecute) {
                    ShiftNoteViewModel.InputSection inputSection = shiftNoteViewModel.inputSection;
                    ToastState toastState = shiftNoteViewModel.toastState;
                    if (inputSection == null) {
                        gapComposer7.startReplaceGroup(1360985376);
                        gapComposer7.end(false);
                        gapComposer = gapComposer7;
                        m382rememberTextFieldStateLepunE = null;
                    } else {
                        String str = inputSection.initialNote;
                        gapComposer7.startReplaceGroup(1360985377);
                        gapComposer7.startMovableGroup(-1055895952, str);
                        m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE(str, 0L, gapComposer7, 0, 2);
                        GapComposer gapComposer8 = gapComposer7;
                        gapComposer8.end(false);
                        gapComposer8.end(false);
                        gapComposer = gapComposer8;
                    }
                    boolean changed3 = gapComposer.changed(m382rememberTextFieldStateLepunE);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    int i7 = 20;
                    Object obj8 = rememberedValue3;
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        DerivedSnapshotState derivedStateOf = Updater.derivedStateOf(new SearchBarKt$$ExternalSyntheticLambda1(i7, m382rememberTextFieldStateLepunE));
                        gapComposer.updateRememberedValue(derivedStateOf);
                        obj8 = derivedStateOf;
                    }
                    State state2 = (State) obj8;
                    boolean changed4 = gapComposer.changed(m382rememberTextFieldStateLepunE) | gapComposer.changed(inputSection != null ? inputSection.initialNote : null);
                    Object rememberedValue4 = gapComposer.rememberedValue();
                    Object obj9 = rememberedValue4;
                    if (changed4 || rememberedValue4 == neverEqualPolicy) {
                        DerivedSnapshotState derivedStateOf2 = Updater.derivedStateOf(new ListsKt$$ExternalSyntheticLambda0(i7, m382rememberTextFieldStateLepunE, shiftNoteViewModel));
                        gapComposer.updateRememberedValue(derivedStateOf2);
                        obj9 = derivedStateOf2;
                    }
                    State state3 = (State) obj9;
                    Object rememberedValue5 = gapComposer.rememberedValue();
                    Object obj10 = rememberedValue5;
                    if (rememberedValue5 == neverEqualPolicy) {
                        ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(null);
                        gapComposer.updateRememberedValue(mutableStateOf$default);
                        obj10 = mutableStateOf$default;
                    }
                    MutableState mutableState3 = (MutableState) obj10;
                    Object rememberedValue6 = gapComposer.rememberedValue();
                    Object obj11 = rememberedValue6;
                    if (rememberedValue6 == neverEqualPolicy) {
                        ParcelableSnapshotMutableState mutableStateOf$default2 = Updater.mutableStateOf$default(Boolean.FALSE);
                        gapComposer.updateRememberedValue(mutableStateOf$default2);
                        obj11 = mutableStateOf$default2;
                    }
                    MutableState mutableState4 = (MutableState) obj11;
                    Object obj12 = toastState != null ? toastState.key : null;
                    boolean changedInstance = gapComposer.changedInstance(shiftNoteViewModel);
                    Object rememberedValue7 = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue7 == neverEqualPolicy) {
                        state = state3;
                        applier = applier2;
                        WorkflowNode$tick$1$1 workflowNode$tick$1$1 = new WorkflowNode$tick$1$1(shiftNoteViewModel, mutableState3, null, 24);
                        gapComposer.updateRememberedValue(workflowNode$tick$1$1);
                        obj3 = workflowNode$tick$1$1;
                    } else {
                        state = state3;
                        applier = applier2;
                        obj3 = rememberedValue7;
                    }
                    Updater.LaunchedEffect(gapComposer, obj12, (Function2) obj3);
                    Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(companion, 1.0f), Strings.getColors(gapComposer).semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU2);
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
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    TextFieldState textFieldState2 = m382rememberTextFieldStateLepunE;
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                    int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, fillMaxSize2);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    String str2 = shiftNoteViewModel.title;
                    NavigationType navigationType2 = NavigationType.BACK;
                    boolean changed5 = gapComposer.changed(function14);
                    Object rememberedValue8 = gapComposer.rememberedValue();
                    Object obj13 = rememberedValue8;
                    if (changed5 || rememberedValue8 == neverEqualPolicy) {
                        ShiftListViewKt$$ExternalSyntheticLambda4 shiftListViewKt$$ExternalSyntheticLambda4 = new ShiftListViewKt$$ExternalSyntheticLambda4(4, function14);
                        gapComposer.updateRememberedValue(shiftListViewKt$$ExternalSyntheticLambda4);
                        obj13 = shiftListViewKt$$ExternalSyntheticLambda4;
                    }
                    DBUtil.TitleBarSub(str2, navigationType2, (Modifier) null, (DynamicColorConfiguration) null, (Function0) obj13, (Modifier) null, (Function3) null, gapComposer, 48, 108);
                    Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxWidth(companion, 1.0f), ImageKt.rememberScrollState(gapComposer), false, 14);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                    int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                    ShiftNoteViewModel.ShiftNoteSection shiftNoteSection = shiftNoteViewModel.shiftNoteSection;
                    if (shiftNoteSection == null) {
                        gapComposer.startReplaceGroup(-1707740403);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-1707740402);
                        ShiftListViewKt.ShiftNoteCell(shiftNoteSection, gapComposer, 0);
                        Strings.getSizes(gapComposer).getClass();
                        DefaultSizes.spacing.getClass();
                        Strings.getSizes(gapComposer).getClass();
                        ModalKt.HorizontalDivider(0, 0, gapComposer, SpacerKt.m299paddingVpY3zN4(companion, 16.0f, 16.0f));
                        gapComposer.end(false);
                    }
                    if (inputSection == null || textFieldState2 == null) {
                        textFieldState = textFieldState2;
                        z3 = false;
                        gapComposer.startReplaceGroup(-1707122169);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-1707308603);
                        Strings.getSizes(gapComposer).getClass();
                        DefaultSizes.spacing.getClass();
                        Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                        textFieldState = textFieldState2;
                        z3 = false;
                        ShiftListViewKt.NoteInputSection(textFieldState, m300paddingVpY3zN4$default, gapComposer, 0);
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                    if (inputSection == null) {
                        gapComposer.startReplaceGroup(-813894063);
                        gapComposer.end(z3);
                        mutableState2 = mutableState4;
                        mutableState = mutableState3;
                    } else {
                        gapComposer.startReplaceGroup(-813894062);
                        boolean z7 = inputSection.isEditMode;
                        boolean z8 = ((Boolean) state2.getValue()).booleanValue() && (!inputSection.isEditMode || ((Boolean) state.getValue()).booleanValue());
                        LoadingAction loadingAction = (LoadingAction) mutableState3.getValue();
                        boolean changed6 = gapComposer.changed(function14) | gapComposer.changed(textFieldState);
                        Object rememberedValue9 = gapComposer.rememberedValue();
                        if (changed6 || rememberedValue9 == neverEqualPolicy) {
                            mutableState = mutableState3;
                            HeroCardViewKt$$ExternalSyntheticLambda9 heroCardViewKt$$ExternalSyntheticLambda9 = new HeroCardViewKt$$ExternalSyntheticLambda9(12, function14, textFieldState, mutableState);
                            gapComposer.updateRememberedValue(heroCardViewKt$$ExternalSyntheticLambda9);
                            obj4 = heroCardViewKt$$ExternalSyntheticLambda9;
                        } else {
                            mutableState = mutableState3;
                            obj4 = rememberedValue9;
                        }
                        Function0 function0 = (Function0) obj4;
                        Object rememberedValue10 = gapComposer.rememberedValue();
                        if (rememberedValue10 == neverEqualPolicy) {
                            mutableState2 = mutableState4;
                            WalletHomeViewKt$$ExternalSyntheticLambda6 walletHomeViewKt$$ExternalSyntheticLambda6 = new WalletHomeViewKt$$ExternalSyntheticLambda6(18, mutableState2);
                            gapComposer.updateRememberedValue(walletHomeViewKt$$ExternalSyntheticLambda6);
                            obj5 = walletHomeViewKt$$ExternalSyntheticLambda6;
                        } else {
                            mutableState2 = mutableState4;
                            obj5 = rememberedValue10;
                        }
                        ShiftListViewKt.NoteButtonSection(z7, z8, loadingAction, function0, (Function0) obj5, gapComposer, 24576);
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                    if (((Boolean) mutableState2.getValue()).booleanValue()) {
                        gapComposer.startReplaceGroup(824910089);
                        boolean changed7 = gapComposer.changed(function14);
                        Object rememberedValue11 = gapComposer.rememberedValue();
                        Object obj14 = rememberedValue11;
                        if (changed7 || rememberedValue11 == neverEqualPolicy) {
                            HeroCardViewKt$$ExternalSyntheticLambda9 heroCardViewKt$$ExternalSyntheticLambda92 = new HeroCardViewKt$$ExternalSyntheticLambda9(function14, mutableState2, mutableState, 13);
                            gapComposer.updateRememberedValue(heroCardViewKt$$ExternalSyntheticLambda92);
                            obj14 = heroCardViewKt$$ExternalSyntheticLambda92;
                        }
                        Function0 function02 = (Function0) obj14;
                        Object rememberedValue12 = gapComposer.rememberedValue();
                        Object obj15 = rememberedValue12;
                        if (rememberedValue12 == neverEqualPolicy) {
                            WalletHomeViewKt$$ExternalSyntheticLambda6 walletHomeViewKt$$ExternalSyntheticLambda62 = new WalletHomeViewKt$$ExternalSyntheticLambda6(19, mutableState2);
                            gapComposer.updateRememberedValue(walletHomeViewKt$$ExternalSyntheticLambda62);
                            obj15 = walletHomeViewKt$$ExternalSyntheticLambda62;
                        }
                        ShiftListViewKt.DeleteConfirmationDialog(function02, (Function0) obj15, gapComposer, 48);
                        z4 = false;
                        gapComposer.end(false);
                    } else {
                        z4 = false;
                        gapComposer.startReplaceGroup(825196467);
                        gapComposer.end(false);
                    }
                    if (toastState == null) {
                        gapComposer.startReplaceGroup(825251739);
                        gapComposer.end(z4);
                    } else {
                        gapComposer.startReplaceGroup(825251740);
                        Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.BottomCenter));
                        Strings.getSizes(gapComposer).getClass();
                        DefaultSizes.spacing.getClass();
                        ModalKt.m3381ToastBAHpl2s(SpacerKt.m298padding3ABfNKs(navigationBarsPadding, 16.0f), toastState.key, toastState.message, null, null, null, null, gapComposer, 0, 504);
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                ShiftListViewKt.NoteInputSection((TextFieldState) obj7, (Modifier) obj6, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                ShiftSectionView2Kt.MerchantHeader((SellerCardViewModel) obj7, (String) obj6, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 12:
                Function1 function15 = (Function1) obj7;
                TimecardDetailViewModel timecardDetailViewModel = (TimecardDetailViewModel) obj6;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer7;
                boolean shouldExecute2 = gapComposer9.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2);
                Applier applier3 = gapComposer9.applier;
                if (shouldExecute2) {
                    Modifier fillMaxSize3 = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors2 = (Colors) gapComposer9.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer9, -1762997026, gapComposer9, false);
                    } else {
                        gapComposer9.startReplaceGroup(-1762997739);
                        gapComposer9.end(false);
                    }
                    Modifier m177backgroundbw27NRU3 = ImageKt.m177backgroundbw27NRU(fillMaxSize3, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    Arrangement$Top$1 arrangement$Top$12 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal2, gapComposer9, 0);
                    int hashCode5 = Long.hashCode(gapComposer9.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer9.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer9, m177backgroundbw27NRU3);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (applier3 == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer9.startReusableNode();
                    if (gapComposer9.inserting) {
                        gapComposer9.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer9.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer9, columnMeasurePolicy4, composeUiNode$Companion$SetModifier$15);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer9, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$16);
                    Integer valueOf2 = Integer.valueOf(hashCode5);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer9, valueOf2, composeUiNode$Companion$SetModifier$17);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer9, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer9, materializeModifier5, composeUiNode$Companion$SetModifier$18);
                    NavigationType navigationType3 = NavigationType.BACK;
                    boolean changed8 = gapComposer9.changed(function15);
                    Object rememberedValue13 = gapComposer9.rememberedValue();
                    if (changed8 || rememberedValue13 == neverEqualPolicy) {
                        rememberedValue13 = new ShiftListViewKt$$ExternalSyntheticLambda4(7, function15);
                        gapComposer9.updateRememberedValue(rememberedValue13);
                    }
                    DBUtil.TitleBarSub("", navigationType3, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue13, (Modifier) null, (Function3) null, gapComposer9, 54, 108);
                    Modifier verticalScroll$default2 = ImageKt.verticalScroll$default(SizeKt.fillMaxWidth(companion, 1.0f), ImageKt.rememberScrollState(gapComposer9), false, 14);
                    ColumnMeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal2, gapComposer9, 0);
                    int hashCode6 = Long.hashCode(gapComposer9.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer9.currentCompositionLocalScope();
                    Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer9, verticalScroll$default2);
                    gapComposer9.startReusableNode();
                    if (gapComposer9.inserting) {
                        gapComposer9.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer9.useNode();
                    }
                    Updater.m576setimpl(gapComposer9, columnMeasurePolicy5, composeUiNode$Companion$SetModifier$15);
                    Updater.m576setimpl(gapComposer9, currentCompositionLocalScope6, composeUiNode$Companion$SetModifier$16);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode6, gapComposer9, composeUiNode$Companion$SetModifier$17, gapComposer9, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    Updater.m576setimpl(gapComposer9, materializeModifier6, composeUiNode$Companion$SetModifier$18);
                    TimecardDetailViewModel.HeroHeader heroHeader = timecardDetailViewModel.heroHeader;
                    zzacg.m2010HeroNumericsHeadertv5qRRQ("8 hours", (Modifier) null, 0, (String) null, (String) null, "Worked on Dec 3, 2025", (String) null, gapComposer9, 0, 94);
                    SpacerKt.Spacer(gapComposer9, SizeKt.m277height3ABfNKs(companion, 144.0f));
                    TimecardDetailViewKt.SummaryTable(timecardDetailViewModel.summaryTable, gapComposer9, 0);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer9, null);
                    String stringResource2 = Room.stringResource(gapComposer9, R.string.work_views_timecard_detail_section_details);
                    String stringResource3 = Room.stringResource(gapComposer9, R.string.work_views_timecard_detail_action_edit);
                    boolean changed9 = gapComposer9.changed(function15);
                    Object rememberedValue14 = gapComposer9.rememberedValue();
                    if (changed9 || rememberedValue14 == neverEqualPolicy) {
                        rememberedValue14 = new ShiftListViewKt$$ExternalSyntheticLambda4(8, function15);
                        gapComposer9.updateRememberedValue(rememberedValue14);
                    }
                    ViewfinderDefaults.SectionHeader(stringResource2, (Modifier) null, stringResource3, (Function0) rememberedValue14, (String) null, gapComposer9, 0, 18);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer9, null);
                    TimecardDetailViewKt.DetailsSection(timecardDetailViewModel.details, gapComposer9, 0);
                    gapComposer9.end(true);
                    gapComposer9.end(true);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                WorkYouViewKt.WorkYouView((WorkYouViewModel) obj7, (Modifier) obj6, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 14:
                StripeBottomSheetState stripeBottomSheetState = (StripeBottomSheetState) obj7;
                FinancialConnectionsSheetActivity financialConnectionsSheetActivity = (FinancialConnectionsSheetActivity) obj6;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                int i8 = FinancialConnectionsSheetActivity.$r8$clinit;
                GapComposer gapComposer10 = (GapComposer) composer8;
                if (gapComposer10.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    FinancialConnectionsSheetViewModel viewModel = financialConnectionsSheetActivity.getViewModel();
                    boolean changedInstance2 = gapComposer10.changedInstance(viewModel);
                    Object rememberedValue15 = gapComposer10.rememberedValue();
                    if (changedInstance2 || rememberedValue15 == neverEqualPolicy) {
                        ScannerView.AnonymousClass1 anonymousClass1 = new ScannerView.AnonymousClass1(0, viewModel, FinancialConnectionsSheetViewModel.class, "onDismissed", "onDismissed()V", 0, 6);
                        gapComposer10.updateRememberedValue(anonymousClass1);
                        rememberedValue15 = anonymousClass1;
                    }
                    TextKt.FinancialConnectionsBottomSheetLayout(stripeBottomSheetState, null, (Function0) ((KFunction) rememberedValue15), Expect_jvmKt.rememberComposableLambda(-627568770, new FinancialConnectionsSheetActivity$$ExternalSyntheticLambda3(financialConnectionsSheetActivity, i6, false ? 1 : 0), gapComposer10), gapComposer10, 3080);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Pair pair = (Pair) obj7;
                Pair pair2 = (Pair) obj6;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer9;
                if (gapComposer11.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    ColumnMeasurePolicy columnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer11, 6);
                    int hashCode7 = Long.hashCode(gapComposer11.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope7 = gapComposer11.currentCompositionLocalScope();
                    Modifier materializeModifier7 = PlatformKt.materializeModifier(gapComposer11, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer11.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer11.startReusableNode();
                    if (gapComposer11.inserting) {
                        gapComposer11.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer11.useNode();
                    }
                    Updater.m576setimpl(gapComposer11, columnMeasurePolicy6, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer11, currentCompositionLocalScope7, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m574initimpl(gapComposer11, Integer.valueOf(hashCode7), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer11, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer11, materializeModifier7, ComposeUiNode.Companion.SetModifier);
                    if (pair == null) {
                        gapComposer11.startReplaceGroup(-1850522225);
                    } else {
                        gapComposer11.startReplaceGroup(-1850522224);
                        TextKt.FinancialConnectionsButton((Function0) pair.second, SizeKt.fillMaxWidth(companion, 1.0f), FinancialConnectionsButton$Type$Secondary.INSTANCE, null, false, false, Expect_jvmKt.rememberComposableLambda(-2095261279, new ShopErrorKt$$ExternalSyntheticLambda0((String) pair.first, i3), gapComposer11), gapComposer11, 1573296, 56);
                    }
                    gapComposer11.end(false);
                    if (pair2 == null) {
                        gapComposer11.startReplaceGroup(-1850113583);
                    } else {
                        gapComposer11.startReplaceGroup(-1850113582);
                        TextKt.FinancialConnectionsButton((Function0) pair2.second, SizeKt.fillMaxWidth(companion, 1.0f), FinancialConnectionsButton$Type$Primary.INSTANCE, null, false, false, Expect_jvmKt.rememberComposableLambda(-648515254, new ShopErrorKt$$ExternalSyntheticLambda0((String) pair2.first, i5), gapComposer11), gapComposer11, 1573296, 56);
                    }
                    gapComposer11.end(false);
                    gapComposer11.end(true);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                ListItemKt.Title((TextResource.Text) obj7, (Function1) obj6, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                ListItemKt.Subtitle((TextResource) obj7, (Function1) obj6, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                ListItemKt.PrepaneHeader((OauthPrepane) obj7, (Modifier) obj6, (Composer) obj, Updater.updateChangedFlags(49));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                InstitutionPickerScreenKt.ClearSearchButton((Function1) obj7, (FinancialConnectionsColors) obj6, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                LinkAccountPickerScreenKt.SelectNewAccount((Function0) obj7, (AddNewAccount) obj6, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                FillrAnalyticsServiceBuilder.PhoneNumberSection((NetworkingLinkSignupState.Payload) obj7, (FocusRequester) obj6, (Composer) obj, Updater.updateChangedFlags(49));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                NetworkingLinkVerificationScreenKt.NetworkingLinkVerificationContent((NetworkingLinkVerificationState) obj7, (Function1) obj6, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                RecipientUtil.ResetContent((Async) obj7, (Function1) obj6, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 24:
                Destination destination = (Destination) obj7;
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj6;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer10;
                if (gapComposer12.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    destination.Composable(navBackStackEntry, gapComposer12, 0);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj7;
                ColumnScope columnScope = (ColumnScope) obj6;
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer11;
                if (gapComposer13.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    NavDestination navDestination = navBackStackEntry2.destination;
                    navDestination.getClass();
                    ((BottomSheetNavigator.Destination) navDestination).content.invoke((Object) columnScope, (Object) navBackStackEntry2, (Object) gapComposer13, (Object) 0);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                FinancialConnectionsSheetNativeActivityArgs financialConnectionsSheetNativeActivityArgs = (FinancialConnectionsSheetNativeActivityArgs) obj7;
                FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity = (FinancialConnectionsSheetNativeActivity) obj6;
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                int i9 = FinancialConnectionsSheetNativeActivity.$r8$clinit;
                GapComposer gapComposer14 = (GapComposer) composer12;
                if (gapComposer14.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = FinancialConnectionsSheetNativeActivityKt.LocalNavHostController;
                    FinancialConnectionsSessionManifest.Theme theme2 = financialConnectionsSheetNativeActivityArgs.initialSyncResponse.manifest.theme;
                    if (theme2 != null) {
                        theme = FinancialConnectionsSheetNativeActivityKt.toLocalTheme(theme2);
                    } else {
                        Theme.Companion.getClass();
                        theme = Theme.f825default;
                    }
                    ThemeKt.FinancialConnectionsTheme(theme, Expect_jvmKt.rememberComposableLambda(1887094632, new FieldBinding$$ExternalSyntheticLambda5(financialConnectionsSheetNativeActivity, i4), gapComposer14), gapComposer14, 48);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                TextKt.FinancialConnectionsModalBottomSheetLayout((BottomSheetNavigator) obj7, (ComposableLambdaImpl) obj6, (Composer) obj, Updater.updateChangedFlags(49));
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                ThemeKt.FinancialConnectionsTheme((Theme) obj7, (ComposableLambdaImpl) obj6, (Composer) obj, Updater.updateChangedFlags(49));
                return Unit.INSTANCE;
            default:
                UiComponent uiComponent = (UiComponent) obj6;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Bitmap bitmap = (Bitmap) obj2;
                Pi2InquiryUiBinding pi2InquiryUiBinding = ((UiScreenRunner) obj7).binding;
                ((ImageView) pi2InquiryUiBinding.navigationBar.binding.navBarBackButton).setEnabled(true);
                pi2InquiryUiBinding.navigationBar.setImportantForAccessibility(1);
                pi2InquiryUiBinding.uiStepContainer.setImportantForAccessibility(1);
                if (!booleanValue) {
                    ((ESignatureComponent) uiComponent).bitmapController._bitmapValue.setValue(bitmap);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ Radiography$$ExternalSyntheticLambda1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    public /* synthetic */ Radiography$$ExternalSyntheticLambda1(TaxFormDownloaderViewModel taxFormDownloaderViewModel, Function1 function1) {
        this.$r8$classId = 2;
        this.f$0 = taxFormDownloaderViewModel;
        this.f$1 = function1;
    }

    public /* synthetic */ Radiography$$ExternalSyntheticLambda1(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
