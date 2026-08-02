package com.squareup.cash.wallet.views;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import app.cash.molecule.PlatformKt;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.card.onboarding.CardPillThemesKt;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.wallet.viewmodels.CardAppletTileViewModel;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.viewmodels.WalletHomeViewModel$WalletScheme;
import com.squareup.cash.work.viewmodels.ClockInBottomSheetViewModel;
import com.squareup.cash.work.views.pay.PayHomeViewKt$$ExternalSyntheticLambda2;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.internal.SubtreeManager;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerState;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.CaptureConfig;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdKt;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt;
import com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdCaptureRenderer;
import dev.chrisbanes.haze.HazeState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import net.oneformapp.helper.matching.POPMatchingFactory;

/* loaded from: classes7.dex */
public final /* synthetic */ class WalletHomeViewKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;

    public /* synthetic */ WalletHomeViewKt$$ExternalSyntheticLambda2(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, ClockInBottomSheetViewModel clockInBottomSheetViewModel, Function0 function0, Function1 function1) {
        this.$r8$classId = 2;
        this.f$3 = function1;
        this.f$0 = clockInBottomSheetViewModel;
        this.f$5 = mutableState;
        this.f$1 = function0;
        this.f$2 = mutableState2;
        this.f$4 = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj3 = this.f$4;
        Object obj4 = this.f$3;
        Object obj5 = this.f$2;
        Object obj6 = this.f$1;
        Object obj7 = this.f$5;
        Object obj8 = this.f$0;
        switch (i) {
            case 0:
                RealImageLoader realImageLoader = (RealImageLoader) obj8;
                ScrollState scrollState = (ScrollState) obj6;
                WalletHomeViewModel$WalletScheme walletHomeViewModel$WalletScheme = (WalletHomeViewModel$WalletScheme) obj5;
                Function1 function1 = (Function1) obj4;
                ElementBoundsRegistry elementBoundsRegistry = (ElementBoundsRegistry) obj3;
                RealImageLoader realImageLoader2 = (RealImageLoader) obj7;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-54696425, new WalletHomeViewKt$$ExternalSyntheticLambda4(scrollState, walletHomeViewModel$WalletScheme, function1, elementBoundsRegistry, realImageLoader2, 0), gapComposer), gapComposer, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                State state = (State) obj8;
                State state2 = (State) obj7;
                State state3 = (State) obj6;
                HazeState hazeState = (HazeState) obj5;
                CardSchemeViewModel.Module.HeroCardDetails heroCardDetails = (CardSchemeViewModel.Module.HeroCardDetails) obj4;
                CardAppletTileViewModel.CardPillViewModel cardPillViewModel = (CardAppletTileViewModel.CardPillViewModel) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier matchParentSize = BoxScopeInstance.INSTANCE.matchParentSize();
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, matchParentSize);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer2.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(SizeKt.fillMaxHeight(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 0.90670556f), 0.8657408f), Alignment.Companion.TopStart, 2);
                    boolean changed = gapComposer2.changed(state) | gapComposer2.changed(state2) | gapComposer2.changed(state3);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new CardAppletTileKt$$ExternalSyntheticLambda5(state, state2, state3, 0);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    CardAppletTileKt.PillUi(ColorKt.graphicsLayer(wrapContentSize$default, (Function1) rememberedValue), hazeState, CardPillThemesKt.toCardPillTheme(heroCardDetails.cardTheme.id), cardPillViewModel, gapComposer2, 0);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Function1 function12 = (Function1) obj4;
                ClockInBottomSheetViewModel clockInBottomSheetViewModel = (ClockInBottomSheetViewModel) obj8;
                MutableState mutableState = (MutableState) obj7;
                Function0 function0 = (Function0) obj6;
                MutableState mutableState2 = (MutableState) obj5;
                MutableState mutableState3 = (MutableState) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                boolean z = (intValue3 & 3) != 2;
                int i2 = intValue3 & 1;
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(i2, z)) {
                    boolean changed2 = gapComposer3.changed(function12);
                    Object rememberedValue2 = gapComposer3.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new PayHomeViewKt$$ExternalSyntheticLambda2(11, function12);
                        gapComposer3.updateRememberedValue(rememberedValue2);
                    }
                    SheetKt.Sheet((Function0) rememberedValue2, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(931356874, new SubcomposeAsyncImageKt$$ExternalSyntheticLambda0(clockInBottomSheetViewModel, mutableState, function0, function12, mutableState2, mutableState3, 12), gapComposer3), gapComposer3, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                LinkAccountPickerScreenKt.LinkAccountPickerContent((LinkAccountPickerState) obj8, (Function1) obj4, (Function1) obj7, (Function0) obj6, (Function0) obj5, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                GovernmentIdState.WaitForAutocapture waitForAutocapture = (GovernmentIdState.WaitForAutocapture) obj8;
                CaptureConfig captureConfig = (CaptureConfig) obj7;
                CaptureRenderer captureRenderer = (CaptureRenderer) obj6;
                GovernmentIdWorkflow.Input input = (GovernmentIdWorkflow.Input) obj5;
                StatefulWorkflow.RenderContext renderContext = (StatefulWorkflow.RenderContext) obj4;
                POPMatchingFactory pOPMatchingFactory = (POPMatchingFactory) obj3;
                List list = (List) obj;
                CameraProperties cameraProperties = (CameraProperties) obj2;
                list.getClass();
                cameraProperties.getClass();
                List list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Frame((String) it.next()));
                }
                captureRenderer.onCaptureComplete(input, waitForAutocapture, renderContext, waitForAutocapture.captureConfig, pOPMatchingFactory, cameraProperties, new GovernmentId.GovernmentIdImage(arrayList, GovernmentIdWorkflowUtilsKt.toGovIdSide(waitForAutocapture.currentPart.side), GovernmentIdKt.getIdClassKey(captureConfig), GovernmentId.CaptureMethod.MANUAL, null, null));
                return Unit.INSTANCE;
            default:
                GovernmentIdState.WaitForAutocapture waitForAutocapture2 = (GovernmentIdState.WaitForAutocapture) obj8;
                CaptureConfig captureConfig2 = (CaptureConfig) obj7;
                GovIdCaptureRenderer govIdCaptureRenderer = (GovIdCaptureRenderer) obj6;
                GovernmentIdWorkflow.Input input2 = (GovernmentIdWorkflow.Input) obj5;
                SubtreeManager subtreeManager = (SubtreeManager) obj4;
                POPMatchingFactory pOPMatchingFactory2 = (POPMatchingFactory) obj3;
                List list3 = (List) obj;
                CameraProperties cameraProperties2 = (CameraProperties) obj2;
                list3.getClass();
                cameraProperties2.getClass();
                List list4 = list3;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new Frame((String) it2.next()));
                }
                govIdCaptureRenderer.onCaptureComplete(input2, waitForAutocapture2, subtreeManager, waitForAutocapture2.captureConfig, pOPMatchingFactory2, cameraProperties2, new GovernmentId.GovernmentIdImage(arrayList2, GovernmentIdWorkflowUtilsKt.toGovIdSide(waitForAutocapture2.currentPart.side), GovernmentIdKt.getIdClassKey(captureConfig2), GovernmentId.CaptureMethod.MANUAL, null, null));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ WalletHomeViewKt$$ExternalSyntheticLambda2(RealImageLoader realImageLoader, ScrollState scrollState, WalletHomeViewModel$WalletScheme walletHomeViewModel$WalletScheme, Function1 function1, ElementBoundsRegistry elementBoundsRegistry, RealImageLoader realImageLoader2) {
        this.$r8$classId = 0;
        this.f$0 = realImageLoader;
        this.f$1 = scrollState;
        this.f$2 = walletHomeViewModel$WalletScheme;
        this.f$3 = function1;
        this.f$4 = elementBoundsRegistry;
        this.f$5 = realImageLoader2;
    }

    public /* synthetic */ WalletHomeViewKt$$ExternalSyntheticLambda2(LinkAccountPickerState linkAccountPickerState, Function1 function1, Function1 function12, Function0 function0, Function0 function02, Function1 function13, int i) {
        this.$r8$classId = 3;
        this.f$0 = linkAccountPickerState;
        this.f$3 = function1;
        this.f$5 = function12;
        this.f$1 = function0;
        this.f$2 = function02;
        this.f$4 = function13;
    }

    public /* synthetic */ WalletHomeViewKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$5 = obj2;
        this.f$1 = obj3;
        this.f$2 = obj4;
        this.f$3 = obj5;
        this.f$4 = obj6;
    }
}
