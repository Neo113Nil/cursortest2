package com.aviatorvaangu.aviapp46;

import android.content.Context;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import com.aviatorvaangu.aviapp46.AppScreen;
import com.aviatorvaangu.aviapp46.components.AdDisclosureOverlayKt;
import com.aviatorvaangu.aviapp46.data.GuideContentKt;
import com.aviatorvaangu.aviapp46.data.GuideTopic;
import com.aviatorvaangu.aviapp46.screens.GuideDetailScreenKt;
import com.aviatorvaangu.aviapp46.screens.GuideHomeScreenKt;
import com.aviatorvaangu.aviapp46.screens.OnboardingScreenKt;
import com.aviatorvaangu.aviapp46.screens.SetupScreenKt;
import com.aviatorvaangu.aviapp46.screens.SplashScreenKt;
import com.aviatorvaangu.aviapp46.screens.StartScreenKt;
import com.aviatorvaangu.aviapp46.screens.TopicListScreenKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AviatorFlyingGuideApp.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002¨\u0006\u0003²\u0006\n\u0010\u0004\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\u0012\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007X\u008a\u008e\u0002"}, d2 = {"AviatorFlyingGuideApp", "", "(Landroidx/compose/runtime/Composer;I)V", "app", "screen", "Lcom/aviatorvaangu/aviapp46/AppScreen;", "pendingAdAction", "Lkotlin/Function0;"}, k = 2, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final class AviatorFlyingGuideAppKt {
    static final Unit AviatorFlyingGuideApp$lambda$45(int i, Composer composer, int i2) {
        AviatorFlyingGuideApp(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AviatorFlyingGuideApp(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-782871184);
        ComposerKt.sourceInformation(startRestartGroup, "C(AviatorFlyingGuideApp)38@1602L7,39@1628L56,40@1705L44,41@1777L48,74@2568L163,74@2536L195,82@2783L37,82@2737L83,86@2861L2108:AviatorFlyingGuideApp.kt#ev6w7u");
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-782871184, i, -1, "com.aviatorvaangu.aviapp46.AviatorFlyingGuideApp (AviatorFlyingGuideApp.kt:37)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Context context = (Context) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -719927800, "CC(remember):AviatorFlyingGuideApp.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AppScreen.Splash.INSTANCE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -719925348, "CC(remember):AviatorFlyingGuideApp.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt.mutableStateListOf();
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -719923040, "CC(remember):AviatorFlyingGuideApp.kt#9igjgp");
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final MutableState mutableState2 = (MutableState) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Function0<Unit> AviatorFlyingGuideApp$lambda$5 = AviatorFlyingGuideApp$lambda$5(mutableState2);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -719897613, "CC(remember):AviatorFlyingGuideApp.kt#9igjgp");
            boolean changedInstance = startRestartGroup.changedInstance(context);
            AviatorFlyingGuideAppKt$AviatorFlyingGuideApp$1$1 rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new AviatorFlyingGuideAppKt$AviatorFlyingGuideApp$1$1(context, mutableState2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.LaunchedEffect(AviatorFlyingGuideApp$lambda$5, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, 0);
            boolean z = !snapshotStateList.isEmpty();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -719890859, "CC(remember):AviatorFlyingGuideApp.kt#9igjgp");
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new Function0() { // from class: com.aviatorvaangu.aviapp46.AviatorFlyingGuideAppKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AviatorFlyingGuideAppKt.AviatorFlyingGuideApp$lambda$12$lambda$11(SnapshotStateList.this, mutableState, mutableState2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            BackHandlerKt.BackHandler(z, (Function0) rememberedValue5, startRestartGroup, 48, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4009constructorimpl = Updater.m4009constructorimpl(startRestartGroup);
            Updater.m4017setimpl(m4009constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4017setimpl(m4009constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4013initimpl(m4009constructorimpl, Integer.valueOf(hashCode), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4015reconcileimpl(m4009constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4017setimpl(m4009constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1980516175, "C87@2931L1949,87@2875L2005:AviatorFlyingGuideApp.kt#ev6w7u");
            AnimatedContentKt.AnimatedContent(AviatorFlyingGuideApp$lambda$1(mutableState), null, null, null, "screen", null, ComposableLambdaKt.rememberComposableLambda(1510677794, true, new Function4() { // from class: com.aviatorvaangu.aviapp46.AviatorFlyingGuideAppKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return AviatorFlyingGuideAppKt.AviatorFlyingGuideApp$lambda$44$lambda$43(SnapshotStateList.this, mutableState, mutableState2, (AnimatedContentScope) obj, (AppScreen) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 1597440, 46);
            if (AviatorFlyingGuideApp$lambda$5(mutableState2) == null) {
                startRestartGroup.startReplaceGroup(-1983433896);
            } else {
                startRestartGroup.startReplaceGroup(-1978552853);
                ComposerKt.sourceInformation(startRestartGroup, "140@4932L21");
                AdDisclosureOverlayKt.AdDisclosureOverlay(startRestartGroup, 0);
            }
            startRestartGroup.endReplaceGroup();
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
            endRestartGroup.updateScope(new Function2() { // from class: com.aviatorvaangu.aviapp46.AviatorFlyingGuideAppKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AviatorFlyingGuideAppKt.AviatorFlyingGuideApp$lambda$45(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final AppScreen AviatorFlyingGuideApp$lambda$1(MutableState<AppScreen> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function0<Unit> AviatorFlyingGuideApp$lambda$5(MutableState<Function0<Unit>> mutableState) {
        return mutableState.getValue();
    }

    static /* synthetic */ void AviatorFlyingGuideApp$showAd$default(MutableState mutableState, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: com.aviatorvaangu.aviapp46.AviatorFlyingGuideAppKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            };
        }
        AviatorFlyingGuideApp$lambda$6(mutableState, function0);
    }

    static /* synthetic */ void AviatorFlyingGuideApp$navigate$default(SnapshotStateList snapshotStateList, MutableState mutableState, MutableState mutableState2, AppScreen appScreen, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            z = true;
        }
        AviatorFlyingGuideApp$navigate(snapshotStateList, mutableState, mutableState2, appScreen, z);
    }

    private static final void AviatorFlyingGuideApp$navigate(final SnapshotStateList<AppScreen> snapshotStateList, final MutableState<AppScreen> mutableState, MutableState<Function0<Unit>> mutableState2, final AppScreen appScreen, boolean z) {
        Function0 function0 = new Function0() { // from class: com.aviatorvaangu.aviapp46.AviatorFlyingGuideAppKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AviatorFlyingGuideAppKt.AviatorFlyingGuideApp$navigate$lambda$8(SnapshotStateList.this, appScreen, mutableState);
            }
        };
        if (z) {
            AviatorFlyingGuideApp$lambda$6(mutableState2, function0);
        } else {
            function0.invoke();
        }
    }

    static final Unit AviatorFlyingGuideApp$navigate$lambda$8(SnapshotStateList snapshotStateList, AppScreen appScreen, MutableState mutableState) {
        if (!Intrinsics.areEqual(AviatorFlyingGuideApp$lambda$1(mutableState), AppScreen.Splash.INSTANCE)) {
            snapshotStateList.add(AviatorFlyingGuideApp$lambda$1(mutableState));
        }
        mutableState.setValue(appScreen);
        return Unit.INSTANCE;
    }

    static /* synthetic */ void AviatorFlyingGuideApp$goBack$default(SnapshotStateList snapshotStateList, MutableState mutableState, MutableState mutableState2, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        AviatorFlyingGuideApp$goBack(snapshotStateList, mutableState, mutableState2, z);
    }

    private static final void AviatorFlyingGuideApp$goBack(final SnapshotStateList<AppScreen> snapshotStateList, final MutableState<AppScreen> mutableState, MutableState<Function0<Unit>> mutableState2, boolean z) {
        Function0 function0 = new Function0() { // from class: com.aviatorvaangu.aviapp46.AviatorFlyingGuideAppKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AviatorFlyingGuideAppKt.AviatorFlyingGuideApp$goBack$lambda$9(SnapshotStateList.this, mutableState);
            }
        };
        if (z) {
            AviatorFlyingGuideApp$lambda$6(mutableState2, function0);
        } else {
            function0.invoke();
        }
    }

    static final Unit AviatorFlyingGuideApp$goBack$lambda$9(SnapshotStateList snapshotStateList, MutableState mutableState) {
        if (!snapshotStateList.isEmpty()) {
            mutableState.setValue((AppScreen) snapshotStateList.remove(CollectionsKt.getLastIndex(snapshotStateList)));
        }
        return Unit.INSTANCE;
    }

    static final Unit AviatorFlyingGuideApp$lambda$12$lambda$11(SnapshotStateList snapshotStateList, MutableState mutableState, MutableState mutableState2) {
        AviatorFlyingGuideApp$goBack(snapshotStateList, mutableState, mutableState2, true);
        return Unit.INSTANCE;
    }

    static final Unit AviatorFlyingGuideApp$lambda$44$lambda$43(final SnapshotStateList snapshotStateList, final MutableState mutableState, final MutableState mutableState2, AnimatedContentScope AnimatedContent, final AppScreen current, Composer composer, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        Intrinsics.checkNotNullParameter(current, "current");
        ComposerKt.sourceInformation(composer, "CN(current):AviatorFlyingGuideApp.kt#ev6w7u");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1510677794, i, -1, "com.aviatorvaangu.aviapp46.AviatorFlyingGuideApp.<anonymous>.<anonymous> (AviatorFlyingGuideApp.kt:88)");
        }
        if (!Intrinsics.areEqual(current, AppScreen.Splash.INSTANCE)) {
            if (current instanceof AppScreen.Onboarding) {
                composer.startReplaceGroup(62421612);
                ComposerKt.sourceInformation(composer, "95@3246L12,96@3289L29,97@3349L246,93@3155L458");
                int page = ((AppScreen.Onboarding) current).getPage();
                ComposerKt.sourceInformationMarkerStart(composer, 62424078, "CC(remember):AviatorFlyingGuideApp.kt#9igjgp");
                Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: com.aviatorvaangu.aviapp46.AviatorFlyingGuideAppKt$$ExternalSyntheticLambda18
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AviatorFlyingGuideAppKt.AviatorFlyingGuideApp$lambda$44$lambda$43$lambda$16$lambda$15(MutableState.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                Function0 function0 = (Function0) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerStart(composer, 62425471, "CC(remember):AviatorFlyingGuideApp.kt#9igjgp");
                Object rememberedValue2 = composer.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function0() { // from class: com.aviatorvaangu.aviapp46.AviatorFlyingGuideAppKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AviatorFlyingGuideAppKt.AviatorFlyingGuideApp$lambda$44$lambda$43$lambda$18$lambda$17(SnapshotStateList.this, mutableState, mutableState2);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                Function0 function02 = (Function0) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerStart(composer, 62427608, "CC(remember):AviatorFlyingGuideApp.kt#9igjgp");
                z = (((i & 112) ^ 48) > 32 && composer.changedInstance(current)) || (i & 48) == 32;
                Object rememberedValue3 = composer.rememberedValue();
                if (z || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function0() { // from class: com.aviatorvaangu.aviapp46.AviatorFlyingGuideAppKt$$ExternalSyntheticLambda20
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AviatorFlyingGuideAppKt.AviatorFlyingGuideApp$lambda$44$lambda$43$lambda$20$lambda$19(AppScreen.this, snapshotStateList, mutableState, mutableState2);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue3);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                OnboardingScreenKt.OnboardingScreen(page, function0, function02, (Function0) rememberedValue3, composer, 432);
                composer.endReplaceGroup();
            } else if (Intrinsics.areEqual(current, AppScreen.Start.INSTANCE)) {
                composer.startReplaceGroup(62437133);
                ComposerKt.sourceInformation(composer, "106@3695L12,107@3739L32,105@3650L139");
                ComposerKt.sourceInformationMarkerStart(composer, 62438446, "CC(remember):AviatorFlyingGuideApp.kt#9igjgp");
                Object rememberedValue4 = composer.rememberedValue();
                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new Function0() { // from class: com.aviatorvaangu.aviapp46.AviatorFlyingGuideAppKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AviatorFlyingGuideAppKt.AviatorFlyingGuideApp$lambda$44$lambda$43$lambda$22$lambda$21(MutableState.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue4);
                }
                Function0 function03 = (Function0) rememberedValue4;
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerStart(composer, 62439874, "CC(remember):AviatorFlyingGuideApp.kt#9igjgp");
                Object rememberedValue5 = composer.rememberedValue();
                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new Function0() { // from class: com.aviatorvaangu.aviapp46.AviatorFlyingGuideAppKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AviatorFlyingGuideAppKt.AviatorFlyingGuideApp$lambda$44$lambda$43$lambda$24$lambda$23(SnapshotStateList.this, mutableState, mutableState2);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue5);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                StartScreenKt.StartScreen(function03, (Function0) rememberedValue5, composer, 54);
                composer.endReplaceGroup();
            } else if (current instanceof AppScreen.Setup) {
                composer.startReplaceGroup(62443112);
                ComposerKt.sourceInformation(composer, "112@3915L12,113@3962L239,110@3829L390");
                int step = ((AppScreen.Setup) current).getStep();
                ComposerKt.sourceInformationMarkerStart(composer, 62445486, "CC(remember):AviatorFlyingGuideApp.kt#9igjgp");
                Object rememberedValue6 = composer.rememberedValue();
                if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new Function0() { // from class: com.aviatorvaangu.aviapp46.AviatorFlyingGuideAppKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AviatorFlyingGuideAppKt.AviatorFlyingGuideApp$lambda$44$lambda$43$lambda$26$lambda$25(MutableState.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue6);
                }
                Function0 function04 = (Function0) rememberedValue6;
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerStart(composer, 62447217, "CC(remember):AviatorFlyingGuideApp.kt#9igjgp");
                z = (((i & 112) ^ 48) > 32 && composer.changedInstance(current)) || (i & 48) == 32;
                Object rememberedValue7 = composer.rememberedValue();
                if (z || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new Function0() { // from class: com.aviatorvaangu.aviapp46.AviatorFlyingGuideAppKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AviatorFlyingGuideAppKt.AviatorFlyingGuideApp$lambda$44$lambda$43$lambda$28$lambda$27(AppScreen.this, snapshotStateList, mutableState, mutableState2);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue7);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                SetupScreenKt.SetupScreen(step, function04, (Function0) rememberedValue7, composer, 48);
                composer.endReplaceGroup();
            } else if (Intrinsics.areEqual(current, AppScreen.Home.INSTANCE)) {
                composer.startReplaceGroup(62456495);
                ComposerKt.sourceInformation(composer, "122@4304L12,123@4348L30,121@4255L141");
                ComposerKt.sourceInformationMarkerStart(composer, 62457934, "CC(remember):AviatorFlyingGuideApp.kt#9igjgp");
                Object rememberedValue8 = composer.rememberedValue();
                if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = new Function0() { // from class: com.aviatorvaangu.aviapp46.AviatorFlyingGuideAppKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AviatorFlyingGuideAppKt.AviatorFlyingGuideApp$lambda$44$lambda$43$lambda$30$lambda$29(MutableState.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue8);
                }
                Function0 function05 = (Function0) rememberedValue8;
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerStart(composer, 62459360, "CC(remember):AviatorFlyingGuideApp.kt#9igjgp");
                Object rememberedValue9 = composer.rememberedValue();
                if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue9 = new Function0() { // from class: com.aviatorvaangu.aviapp46.AviatorFlyingGuideAppKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AviatorFlyingGuideAppKt.AviatorFlyingGuideApp$lambda$44$lambda$43$lambda$32$lambda$31(SnapshotStateList.this, mutableState, mutableState2);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue9);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                GuideHomeScreenKt.GuideHomeScreen(function05, (Function0) rememberedValue9, composer, 54);
                composer.endReplaceGroup();
            } else if (Intrinsics.areEqual(current, AppScreen.Topics.INSTANCE)) {
                composer.startReplaceGroup(62462283);
                ComposerKt.sourceInformation(composer, "127@4483L12,128@4526L25,129@4583L34,126@4434L201");
                ComposerKt.sourceInformationMarkerStart(composer, 62463662, "CC(remember):AviatorFlyingGuideApp.kt#9igjgp");
                Object rememberedValue10 = composer.rememberedValue();
                if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue10 = new Function0() { // from class: com.aviatorvaangu.aviapp46.AviatorFlyingGuideAppKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AviatorFlyingGuideAppKt.AviatorFlyingGuideApp$lambda$44$lambda$43$lambda$34$lambda$33(MutableState.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue10);
                }
                Function0 function06 = (Function0) rememberedValue10;
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerStart(composer, 62465051, "CC(remember):AviatorFlyingGuideApp.kt#9igjgp");
                Object rememberedValue11 = composer.rememberedValue();
                if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue11 = new Function0() { // from class: com.aviatorvaangu.aviapp46.AviatorFlyingGuideAppKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AviatorFlyingGuideAppKt.AviatorFlyingGuideApp$lambda$44$lambda$43$lambda$36$lambda$35(SnapshotStateList.this, mutableState, mutableState2);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue11);
                }
                Function0 function07 = (Function0) rememberedValue11;
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerStart(composer, 62466884, "CC(remember):AviatorFlyingGuideApp.kt#9igjgp");
                Object rememberedValue12 = composer.rememberedValue();
                if (rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue12 = new Function1() { // from class: com.aviatorvaangu.aviapp46.AviatorFlyingGuideAppKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AviatorFlyingGuideAppKt.AviatorFlyingGuideApp$lambda$44$lambda$43$lambda$38$lambda$37(SnapshotStateList.this, mutableState, mutableState2, (GuideTopic) obj);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue12);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                TopicListScreenKt.TopicListScreen(function06, function07, (Function1) rememberedValue12, composer, 438);
                composer.endReplaceGroup();
            } else {
                if (!(current instanceof AppScreen.Detail)) {
                    composer.startReplaceGroup(62416700);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(62470006);
                ComposerKt.sourceInformation(composer, "134@4770L12,135@4813L25,132@4676L180");
                GuideTopic topic = ((AppScreen.Detail) current).getTopic();
                ComposerKt.sourceInformationMarkerStart(composer, 62472846, "CC(remember):AviatorFlyingGuideApp.kt#9igjgp");
                Object rememberedValue13 = composer.rememberedValue();
                if (rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue13 = new Function0() { // from class: com.aviatorvaangu.aviapp46.AviatorFlyingGuideAppKt$$ExternalSyntheticLambda16
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AviatorFlyingGuideAppKt.AviatorFlyingGuideApp$lambda$44$lambda$43$lambda$40$lambda$39(MutableState.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue13);
                }
                Function0 function08 = (Function0) rememberedValue13;
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerStart(composer, 62474235, "CC(remember):AviatorFlyingGuideApp.kt#9igjgp");
                Object rememberedValue14 = composer.rememberedValue();
                if (rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue14 = new Function0() { // from class: com.aviatorvaangu.aviapp46.AviatorFlyingGuideAppKt$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AviatorFlyingGuideAppKt.AviatorFlyingGuideApp$lambda$44$lambda$43$lambda$42$lambda$41(SnapshotStateList.this, mutableState, mutableState2);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue14);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                GuideDetailScreenKt.GuideDetailScreen(topic, function08, (Function0) rememberedValue14, composer, 432);
                composer.endReplaceGroup();
            }
        } else {
            composer.startReplaceGroup(62416583);
            ComposerKt.sourceInformation(composer, "89@3022L88,89@3009L101");
            ComposerKt.sourceInformationMarkerStart(composer, 62416986, "CC(remember):AviatorFlyingGuideApp.kt#9igjgp");
            Object rememberedValue15 = composer.rememberedValue();
            if (rememberedValue15 == Composer.INSTANCE.getEmpty()) {
                rememberedValue15 = new Function0() { // from class: com.aviatorvaangu.aviapp46.AviatorFlyingGuideAppKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AviatorFlyingGuideAppKt.AviatorFlyingGuideApp$lambda$44$lambda$43$lambda$14$lambda$13(SnapshotStateList.this, mutableState, mutableState2);
                    }
                };
                composer.updateRememberedValue(rememberedValue15);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            SplashScreenKt.SplashScreen((Function0) rememberedValue15, composer, 6);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    static final Unit AviatorFlyingGuideApp$lambda$44$lambda$43$lambda$14$lambda$13(SnapshotStateList snapshotStateList, MutableState mutableState, MutableState mutableState2) {
        AviatorFlyingGuideApp$navigate(snapshotStateList, mutableState, mutableState2, new AppScreen.Onboarding(0), true);
        return Unit.INSTANCE;
    }

    static final Unit AviatorFlyingGuideApp$lambda$44$lambda$43$lambda$16$lambda$15(MutableState mutableState) {
        AviatorFlyingGuideApp$showAd$default(mutableState, null, 2, null);
        return Unit.INSTANCE;
    }

    static final Unit AviatorFlyingGuideApp$lambda$44$lambda$43$lambda$18$lambda$17(SnapshotStateList snapshotStateList, MutableState mutableState, MutableState mutableState2) {
        AviatorFlyingGuideApp$navigate$default(snapshotStateList, mutableState, mutableState2, AppScreen.Start.INSTANCE, false, 16, null);
        return Unit.INSTANCE;
    }

    static final Unit AviatorFlyingGuideApp$lambda$44$lambda$43$lambda$20$lambda$19(AppScreen appScreen, SnapshotStateList snapshotStateList, MutableState mutableState, MutableState mutableState2) {
        AppScreen.Onboarding onboarding = (AppScreen.Onboarding) appScreen;
        AviatorFlyingGuideApp$navigate$default(snapshotStateList, mutableState, mutableState2, onboarding.getPage() == CollectionsKt.getLastIndex(GuideContentKt.getOnboardingPages()) ? AppScreen.Start.INSTANCE : new AppScreen.Onboarding(onboarding.getPage() + 1), false, 16, null);
        return Unit.INSTANCE;
    }

    static final Unit AviatorFlyingGuideApp$lambda$44$lambda$43$lambda$22$lambda$21(MutableState mutableState) {
        AviatorFlyingGuideApp$showAd$default(mutableState, null, 2, null);
        return Unit.INSTANCE;
    }

    static final Unit AviatorFlyingGuideApp$lambda$44$lambda$43$lambda$24$lambda$23(SnapshotStateList snapshotStateList, MutableState mutableState, MutableState mutableState2) {
        AviatorFlyingGuideApp$navigate$default(snapshotStateList, mutableState, mutableState2, new AppScreen.Setup(0), false, 16, null);
        return Unit.INSTANCE;
    }

    static final Unit AviatorFlyingGuideApp$lambda$44$lambda$43$lambda$26$lambda$25(MutableState mutableState) {
        AviatorFlyingGuideApp$showAd$default(mutableState, null, 2, null);
        return Unit.INSTANCE;
    }

    static final Unit AviatorFlyingGuideApp$lambda$44$lambda$43$lambda$28$lambda$27(AppScreen appScreen, SnapshotStateList snapshotStateList, MutableState mutableState, MutableState mutableState2) {
        AppScreen.Setup setup = (AppScreen.Setup) appScreen;
        AviatorFlyingGuideApp$navigate$default(snapshotStateList, mutableState, mutableState2, setup.getStep() == CollectionsKt.getLastIndex(GuideContentKt.getSetupQuestions()) ? AppScreen.Home.INSTANCE : new AppScreen.Setup(setup.getStep() + 1), false, 16, null);
        return Unit.INSTANCE;
    }

    static final Unit AviatorFlyingGuideApp$lambda$44$lambda$43$lambda$30$lambda$29(MutableState mutableState) {
        AviatorFlyingGuideApp$showAd$default(mutableState, null, 2, null);
        return Unit.INSTANCE;
    }

    static final Unit AviatorFlyingGuideApp$lambda$44$lambda$43$lambda$32$lambda$31(SnapshotStateList snapshotStateList, MutableState mutableState, MutableState mutableState2) {
        AviatorFlyingGuideApp$navigate$default(snapshotStateList, mutableState, mutableState2, AppScreen.Topics.INSTANCE, false, 16, null);
        return Unit.INSTANCE;
    }

    static final Unit AviatorFlyingGuideApp$lambda$44$lambda$43$lambda$34$lambda$33(MutableState mutableState) {
        AviatorFlyingGuideApp$showAd$default(mutableState, null, 2, null);
        return Unit.INSTANCE;
    }

    static final Unit AviatorFlyingGuideApp$lambda$44$lambda$43$lambda$36$lambda$35(SnapshotStateList snapshotStateList, MutableState mutableState, MutableState mutableState2) {
        AviatorFlyingGuideApp$goBack(snapshotStateList, mutableState, mutableState2, true);
        return Unit.INSTANCE;
    }

    static final Unit AviatorFlyingGuideApp$lambda$44$lambda$43$lambda$38$lambda$37(SnapshotStateList snapshotStateList, MutableState mutableState, MutableState mutableState2, GuideTopic it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AviatorFlyingGuideApp$navigate$default(snapshotStateList, mutableState, mutableState2, new AppScreen.Detail(it), false, 16, null);
        return Unit.INSTANCE;
    }

    static final Unit AviatorFlyingGuideApp$lambda$44$lambda$43$lambda$40$lambda$39(MutableState mutableState) {
        AviatorFlyingGuideApp$showAd$default(mutableState, null, 2, null);
        return Unit.INSTANCE;
    }

    static final Unit AviatorFlyingGuideApp$lambda$44$lambda$43$lambda$42$lambda$41(SnapshotStateList snapshotStateList, MutableState mutableState, MutableState mutableState2) {
        AviatorFlyingGuideApp$goBack(snapshotStateList, mutableState, mutableState2, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AviatorFlyingGuideApp$lambda$6(MutableState<Function0<Unit>> mutableState, Function0<Unit> function0) {
        mutableState.setValue(function0);
    }
}
