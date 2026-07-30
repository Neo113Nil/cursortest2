package com.chicken.road.kedbags.ui.splash;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.Window;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SplashScreen.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\u001a#\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0007¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\f\u001a\u000f\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u000fH\u0082\u0010\u001a\r\u0010\u0010\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\f\u001a\u001b\u0010\u0011\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0003¢\u0006\u0002\u0010\u0013\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u0014²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u0084\u0002"}, d2 = {"SplashBlack", "Landroidx/compose/ui/graphics/Color;", "J", "SplashProgress", "SplashScreen", "", "controller", "Lcom/chicken/road/kedbags/ui/splash/SplashController;", "onReady", "Lkotlin/Function0;", "(Lcom/chicken/road/kedbags/ui/splash/SplashController;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "WhiteSystemBars", "(Landroidx/compose/runtime/Composer;I)V", "findActivity", "Landroid/app/Activity;", "Landroid/content/Context;", "SplashLoading", "SplashError", "onRetry", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app", "state", "Lcom/chicken/road/kedbags/ui/splash/SplashUiState;"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SplashScreenKt {
    private static final long SplashBlack = ColorKt.Color(4278190080L);
    private static final long SplashProgress = ColorKt.Color(3422552064L);

    static final Unit SplashError$lambda$26(Function0 function0, int i, Composer composer, int i2) {
        SplashError(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit SplashLoading$lambda$24(int i, Composer composer, int i2) {
        SplashLoading(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit SplashScreen$lambda$17(SplashController splashController, Function0 function0, int i, Composer composer, int i2) {
        SplashScreen(splashController, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit WhiteSystemBars$lambda$22(int i, Composer composer, int i2) {
        WhiteSystemBars(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void SplashScreen(final SplashController controller, final Function0<Unit> onReady, Composer composer, final int i) {
        int i2;
        Modifier.Companion companion;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(onReady, "onReady");
        Composer startRestartGroup = composer.startRestartGroup(-347384535);
        ComposerKt.sourceInformation(startRestartGroup, "C(SplashScreen)48@1958L7,49@2011L7,50@2053L29,52@2115L22,52@2088L49,54@2170L67,54@2143L94,58@2258L67,59@2357L74,59@2330L101,76@2953L30,76@2925L58,78@2989L17,80@3012L686:SplashScreen.kt#w4dag0");
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(controller) : startRestartGroup.changedInstance(controller) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(onReady) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-347384535, i3, -1, "com.chicken.road.kedbags.ui.splash.SplashScreen (SplashScreen.kt:47)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Context context = (Context) consume;
            ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localLifecycleOwner);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final LifecycleOwner lifecycleOwner = (LifecycleOwner) consume2;
            State collectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(controller.getState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, startRestartGroup, 0, 7);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1170919967, "CC(remember):SplashScreen.kt#9igjgp");
            int i4 = i3 & 14;
            boolean z = i4 == 4 || ((i3 & 8) != 0 && startRestartGroup.changedInstance(controller));
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function2) new SplashScreenKt$SplashScreen$1$1(controller, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.LaunchedEffect(controller, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, SplashController.$stable | i4);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1170921772, "CC(remember):SplashScreen.kt#9igjgp");
            boolean z2 = (i4 == 4 || ((i3 & 8) != 0 && startRestartGroup.changedInstance(controller))) | ((i3 & 112) == 32);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function2) new SplashScreenKt$SplashScreen$2$1(controller, onReady, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.LaunchedEffect(controller, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, SplashController.$stable | i4);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1170924588, "CC(remember):SplashScreen.kt#9igjgp");
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState = (MutableState) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1170927763, "CC(remember):SplashScreen.kt#9igjgp");
            boolean z3 = i4 == 4 || ((i3 & 8) != 0 && startRestartGroup.changedInstance(controller));
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = (Function2) new SplashScreenKt$SplashScreen$3$1(controller, mutableState, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.LaunchedEffect(controller, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, SplashController.$stable | i4);
            final String str = (String) mutableState.getValue();
            if (str != null) {
                startRestartGroup.startReplaceGroup(1939175799);
                ComposerKt.sourceInformation(startRestartGroup, "65@2558L355,65@2511L402");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1170934476, "CC(remember):SplashScreen.kt#9igjgp");
                boolean changedInstance = startRestartGroup.changedInstance(context) | startRestartGroup.changed(str) | startRestartGroup.changedInstance(lifecycleOwner);
                Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new Function1() { // from class: com.chicken.road.kedbags.ui.splash.SplashScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SplashScreenKt.SplashScreen$lambda$8$lambda$7(LifecycleOwner.this, context, str, (DisposableEffectScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                EffectsKt.DisposableEffect(lifecycleOwner, str, (Function1) rememberedValue5, startRestartGroup, 0);
            } else {
                startRestartGroup.startReplaceGroup(1936680857);
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1170946791, "CC(remember):SplashScreen.kt#9igjgp");
            boolean z4 = i4 == 4 || ((i3 & 8) != 0 && startRestartGroup.changedInstance(controller));
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (z4 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new Function0() { // from class: com.chicken.road.kedbags.ui.splash.SplashScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SplashScreenKt.SplashScreen$lambda$10$lambda$9(SplashController.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            BackHandlerKt.BackHandler(true, (Function0) rememberedValue6, startRestartGroup, 6, 0);
            WhiteSystemBars(startRestartGroup, 0);
            Modifier m228backgroundbw27NRU$default = BackgroundKt.m228backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m3860getWhite0d7_KjU(), null, 2, null);
            if (SplashScreen$lambda$0(collectAsStateWithLifecycle).getError()) {
                startRestartGroup.startReplaceGroup(1939824753);
                ComposerKt.sourceInformation(startRestartGroup, "87@3247L39,89@3353L22");
                Modifier.Companion companion2 = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1170956208, "CC(remember):SplashScreen.kt#9igjgp");
                Object rememberedValue7 = startRestartGroup.rememberedValue();
                if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = InteractionSourceKt.MutableInteractionSource();
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue7;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1170959583, "CC(remember):SplashScreen.kt#9igjgp");
                boolean z5 = i4 == 4 || ((i3 & 8) != 0 && startRestartGroup.changedInstance(controller));
                Object rememberedValue8 = startRestartGroup.rememberedValue();
                if (z5 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = new Function0() { // from class: com.chicken.road.kedbags.ui.splash.SplashScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SplashScreenKt.SplashScreen$lambda$13$lambda$12(SplashController.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                companion = ClickableKt.m259clickableO2vRcR0$default(companion2, mutableInteractionSource, null, false, null, null, (Function0) rememberedValue8, 28, null);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1940055145);
                startRestartGroup.endReplaceGroup();
                companion = Modifier.INSTANCE;
            }
            Modifier safeDrawingPadding = WindowInsetsPadding_androidKt.safeDrawingPadding(m228backgroundbw27NRU$default.then(companion));
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, safeDrawingPadding);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
            Updater.m3323setimpl(m3316constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3316constructorimpl.getInserting() || !Intrinsics.areEqual(m3316constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3323setimpl(m3316constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 6797754, "C:SplashScreen.kt#w4dag0");
            if (SplashScreen$lambda$0(collectAsStateWithLifecycle).getError()) {
                startRestartGroup.startReplaceGroup(-1385253040);
                ComposerKt.sourceInformation(startRestartGroup, "98@3614L22,98@3592L45");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1385252359, "CC(remember):SplashScreen.kt#9igjgp");
                boolean z6 = i4 == 4 || ((i3 & 8) != 0 && startRestartGroup.changedInstance(controller));
                Object rememberedValue9 = startRestartGroup.rememberedValue();
                if (z6 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue9 = new Function0() { // from class: com.chicken.road.kedbags.ui.splash.SplashScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SplashScreenKt.SplashScreen$lambda$16$lambda$15$lambda$14(SplashController.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                SplashError((Function0) rememberedValue9, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                if (SplashScreen$lambda$0(collectAsStateWithLifecycle).getLoading()) {
                    startRestartGroup.startReplaceGroup(-1385250670);
                    ComposerKt.sourceInformation(startRestartGroup, "99@3667L15");
                    SplashLoading(startRestartGroup, 0);
                } else {
                    startRestartGroup.startReplaceGroup(3263071);
                }
                startRestartGroup.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.chicken.road.kedbags.ui.splash.SplashScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SplashScreenKt.SplashScreen$lambda$17(SplashController.this, onReady, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final DisposableEffectResult SplashScreen$lambda$8$lambda$7(final LifecycleOwner lifecycleOwner, final Context context, final String str, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.chicken.road.kedbags.ui.splash.SplashScreenKt$$ExternalSyntheticLambda6
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                SplashScreenKt.SplashScreen$lambda$8$lambda$7$lambda$5(context, str, lifecycleOwner2, event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new DisposableEffectResult() { // from class: com.chicken.road.kedbags.ui.splash.SplashScreenKt$SplashScreen$lambda$8$lambda$7$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                LifecycleOwner.this.getLifecycle().removeObserver(lifecycleEventObserver);
            }
        };
    }

    static final void SplashScreen$lambda$8$lambda$7$lambda$5(Context context, String str, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.Event.ON_RESUME) {
            OfferTabKt.openOfferTab(context, str);
        }
    }

    static final Unit SplashScreen$lambda$10$lambda$9(SplashController splashController) {
        splashController.onBackPressed();
        return Unit.INSTANCE;
    }

    static final Unit SplashScreen$lambda$13$lambda$12(SplashController splashController) {
        splashController.retry();
        return Unit.INSTANCE;
    }

    static final Unit SplashScreen$lambda$16$lambda$15$lambda$14(SplashController splashController) {
        splashController.retry();
        return Unit.INSTANCE;
    }

    private static final void WhiteSystemBars(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-594621599);
        ComposerKt.sourceInformation(startRestartGroup, "C(WhiteSystemBars)111@4013L7,112@4048L1202,112@4025L1225:SplashScreen.kt#w4dag0");
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-594621599, i, -1, "com.chicken.road.kedbags.ui.splash.WhiteSystemBars (SplashScreen.kt:110)");
            }
            ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localView);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final View view = (View) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -200701741, "CC(remember):SplashScreen.kt#9igjgp");
            boolean changedInstance = startRestartGroup.changedInstance(view);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: com.chicken.road.kedbags.ui.splash.SplashScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SplashScreenKt.WhiteSystemBars$lambda$21$lambda$20(view, (DisposableEffectScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.DisposableEffect(view, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.chicken.road.kedbags.ui.splash.SplashScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SplashScreenKt.WhiteSystemBars$lambda$22(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final DisposableEffectResult WhiteSystemBars$lambda$21$lambda$20(View view, DisposableEffectScope DisposableEffect) {
        final Window window;
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Activity findActivity = findActivity(context);
        if (findActivity != null && (window = findActivity.getWindow()) != null) {
            final WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, view);
            Intrinsics.checkNotNullExpressionValue(insetsController, "getInsetsController(...)");
            final int statusBarColor = window.getStatusBarColor();
            final int navigationBarColor = window.getNavigationBarColor();
            final boolean isAppearanceLightStatusBars = insetsController.isAppearanceLightStatusBars();
            final boolean isAppearanceLightNavigationBars = insetsController.isAppearanceLightNavigationBars();
            window.setStatusBarColor(ColorKt.m3877toArgb8_81llA(Color.INSTANCE.m3860getWhite0d7_KjU()));
            window.setNavigationBarColor(ColorKt.m3877toArgb8_81llA(Color.INSTANCE.m3860getWhite0d7_KjU()));
            insetsController.setAppearanceLightStatusBars(true);
            insetsController.setAppearanceLightNavigationBars(true);
            return new DisposableEffectResult() { // from class: com.chicken.road.kedbags.ui.splash.SplashScreenKt$WhiteSystemBars$lambda$21$lambda$20$$inlined$onDispose$2
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    window.setStatusBarColor(statusBarColor);
                    window.setNavigationBarColor(navigationBarColor);
                    insetsController.setAppearanceLightStatusBars(isAppearanceLightStatusBars);
                    insetsController.setAppearanceLightNavigationBars(isAppearanceLightNavigationBars);
                }
            };
        }
        return new DisposableEffectResult() { // from class: com.chicken.road.kedbags.ui.splash.SplashScreenKt$WhiteSystemBars$lambda$21$lambda$20$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
            }
        };
    }

    private static final Activity findActivity(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(context, "getBaseContext(...)");
        }
        return (Activity) context;
    }

    private static final void SplashLoading(Composer composer, final int i) {
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1887569186);
        ComposerKt.sourceInformation(startRestartGroup, "C(SplashLoading)152@5466L284:SplashScreen.kt#w4dag0");
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1887569186, i, -1, "com.chicken.road.kedbags.ui.splash.SplashLoading (SplashScreen.kt:151)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.HorizontalOrVertical m553spacedBy0680j_4 = Arrangement.INSTANCE.m553spacedBy0680j_4(Dp.m6265constructorimpl(12.0f));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m553spacedBy0680j_4, centerHorizontally, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
            Updater.m3323setimpl(m3316constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3316constructorimpl.getInserting() || !Intrinsics.areEqual(m3316constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3323setimpl(m3316constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1184547272, "C156@5609L82,157@5700L44:SplashScreen.kt#w4dag0");
            ProgressIndicatorKt.m2031CircularProgressIndicatorLxG7B9w(SizeKt.m718size3ABfNKs(Modifier.INSTANCE, Dp.m6265constructorimpl(48.0f)), SplashProgress, 0.0f, 0L, 0, startRestartGroup, 54, 28);
            composer2 = startRestartGroup;
            TextKt.m2357Text4IGK_g("Loading…", (Modifier) null, SplashBlack, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 390, 0, 131066);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.chicken.road.kedbags.ui.splash.SplashScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SplashScreenKt.SplashLoading$lambda$24(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void SplashError(final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-795395460);
        ComposerKt.sourceInformation(startRestartGroup, "C(SplashError)163@5817L727:SplashScreen.kt#w4dag0");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-795395460, i2, -1, "com.chicken.road.kedbags.ui.splash.SplashError (SplashScreen.kt:162)");
            }
            Modifier m675paddingVpY3zN4$default = PaddingKt.m675paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6265constructorimpl(32.0f), 0.0f, 2, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.HorizontalOrVertical m553spacedBy0680j_4 = Arrangement.INSTANCE.m553spacedBy0680j_4(Dp.m6265constructorimpl(10.0f));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m553spacedBy0680j_4, centerHorizontally, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m675paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
            Updater.m3323setimpl(m3316constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3316constructorimpl.getInserting() || !Intrinsics.areEqual(m3316constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3323setimpl(m3316constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2011223980, "C168@6017L52,169@6078L189,176@6351L73,174@6276L262:SplashScreen.kt#w4dag0");
            long j = SplashBlack;
            composer2 = startRestartGroup;
            TextKt.m2357Text4IGK_g("Connection issue", (Modifier) null, j, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 390, 0, 131066);
            TextKt.m2357Text4IGK_g("Unable to reach the server. Check your connection and tap anywhere to retry.", (Modifier) null, j, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6147boximpl(TextAlign.INSTANCE.m6154getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 390, 0, 130554);
            ButtonKt.Button(function0, PaddingKt.m677paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6265constructorimpl(14.0f), 0.0f, 0.0f, 13, null), false, null, ButtonDefaults.INSTANCE.m1472buttonColorsro_MJ88(SplashProgress, Color.INSTANCE.m3860getWhite0d7_KjU(), 0L, 0L, composer2, (ButtonDefaults.$stable << 12) | 54, 12), null, null, null, null, ComposableSingletons$SplashScreenKt.INSTANCE.m6566getLambda$2028245546$app(), composer2, (i2 & 14) | 805306416, 492);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.chicken.road.kedbags.ui.splash.SplashScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SplashScreenKt.SplashError$lambda$26(Function0.this, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final SplashUiState SplashScreen$lambda$0(State<SplashUiState> state) {
        return state.getValue();
    }
}
