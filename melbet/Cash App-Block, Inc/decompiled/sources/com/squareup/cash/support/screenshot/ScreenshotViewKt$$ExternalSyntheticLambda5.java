package com.squareup.cash.support.screenshot;

import android.view.View;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.text.BasicTextKt$$ExternalSyntheticLambda1;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.core.navigationcontainer.UiContainer;
import com.squareup.cash.core.navigationcontainer.UiContainer$$ExternalSyntheticLambda33;
import com.squareup.cash.core.navigationcontainer.UiContainerKt;
import com.squareup.cash.core.navigationcontainer.models.NavigationModel;
import com.squareup.util.android.AndroidToaster;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class ScreenshotViewKt$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;

    public /* synthetic */ ScreenshotViewKt$$ExternalSyntheticLambda5(View view, RealScreenshotManager realScreenshotManager, ScreenshotEventReceiver screenshotEventReceiver, AndroidToaster androidToaster, OverlayState overlayState, int i) {
        this.$r8$classId = 0;
        this.f$0 = view;
        this.f$1 = realScreenshotManager;
        this.f$2 = screenshotEventReceiver;
        this.f$3 = androidToaster;
        this.f$4 = overlayState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = 0;
        Object obj3 = this.f$4;
        Object obj4 = this.f$3;
        Object obj5 = this.f$2;
        Object obj6 = this.f$1;
        Object obj7 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                Room.ScreenshotOverlay((View) obj7, (RealScreenshotManager) obj6, (ScreenshotEventReceiver) obj5, (AndroidToaster) obj4, (OverlayState) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                Modifier modifier = (Modifier) obj7;
                MutableState mutableState = (MutableState) obj6;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj5;
                BasicTextContextMenuProvider basicTextContextMenuProvider = (BasicTextContextMenuProvider) obj4;
                Function0 function0 = (Function0) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new BasicTextKt$$ExternalSyntheticLambda1(1, mutableState);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Modifier onGloballyPositioned = ValueInsets.onGloballyPositioned(modifier, (Function1) rememberedValue);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, true);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, onGloballyPositioned);
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
                    composableLambdaImpl.invoke((Object) gapComposer, (Object) 0);
                    basicTextContextMenuProvider.ContextMenu(function0, gapComposer, 6);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                UiContainer uiContainer = (UiContainer) obj7;
                NavigationModel.Ready.OverlayLocation overlayLocation = (NavigationModel.Ready.OverlayLocation) obj6;
                AnimatedContentScopeImpl animatedContentScopeImpl = (AnimatedContentScopeImpl) obj5;
                SharedTransitionScope sharedTransitionScope = (SharedTransitionScope) obj4;
                SaveableStateHolder saveableStateHolder = (SaveableStateHolder) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    UiContainerKt.ScreenContent(uiContainer.broadway, overlayLocation, animatedContentScopeImpl, sharedTransitionScope, saveableStateHolder, false, uiContainer.overlayBackPressedDispatcher, uiContainer.onLocationReceived, uiContainer.onLocationRemoved, uiContainer.containerErrorReporter, uiContainer.leakDetector, uiContainer.overlayBackListener, uiContainer.eventListeners, uiContainer.parentLifecycle, false, Expect_jvmKt.rememberComposableLambda(-834297862, new UiContainer$$ExternalSyntheticLambda33(i2, overlayLocation, uiContainer), gapComposer2), gapComposer2, 0, 196608, 16384);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ScreenshotViewKt$$ExternalSyntheticLambda5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
    }
}
