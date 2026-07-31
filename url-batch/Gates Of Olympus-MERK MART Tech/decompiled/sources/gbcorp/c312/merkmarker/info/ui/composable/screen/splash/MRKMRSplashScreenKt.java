package gbcorp.c312.merkmarker.info.ui.composable.screen.splash;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import coil3.compose.SingletonAsyncImageKt;
import gbcorp.c312.merkmarker.info.R;
import gbcorp.c312.merkmarker.info.ui.theme.ColorKt;
import gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMRSplashVM;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import org.koin.compose.KoinApplicationKt;
import org.koin.viewmodel.CreationExtrasExtKt;
import org.koin.viewmodel.GetViewModelKt;

/* compiled from: MRKMRSplashScreen.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\u001a=\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\t¨\u0006\n²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002"}, d2 = {"SplashScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lgbcorp/c312/merkmarker/info/ui/viewmodel/MRKMRSplashVM;", "onNavigateToHomeScreen", "Lkotlin/Function0;", "onNavigateToOnboarding", "(Landroidx/compose/ui/Modifier;Lgbcorp/c312/merkmarker/info/ui/viewmodel/MRKMRSplashVM;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "app_release", "onboardedState", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MRKMRSplashScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SplashScreen$lambda$6(Modifier modifier, MRKMRSplashVM mRKMRSplashVM, Function0 function0, Function0 function02, int i, int i2, Composer composer, int i3) {
        SplashScreen(modifier, mRKMRSplashVM, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SplashScreen(Modifier modifier, MRKMRSplashVM mRKMRSplashVM, final Function0<Unit> onNavigateToHomeScreen, final Function0<Unit> onNavigateToOnboarding, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        MRKMRSplashVM mRKMRSplashVM2;
        Composer composer2;
        final Modifier.Companion companion;
        final MRKMRSplashVM mRKMRSplashVM3;
        MRKMRSplashVM mRKMRSplashVM4;
        int i4;
        Object rememberedValue;
        Object rememberedValue2;
        boolean changedInstance;
        MRKMRSplashScreenKt$SplashScreen$1$1 rememberedValue3;
        boolean changed;
        MRKMRSplashScreenKt$SplashScreen$2$1 rememberedValue4;
        int i5;
        Intrinsics.checkNotNullParameter(onNavigateToHomeScreen, "onNavigateToHomeScreen");
        Intrinsics.checkNotNullParameter(onNavigateToOnboarding, "onNavigateToOnboarding");
        Composer startRestartGroup = composer.startRestartGroup(1967462518);
        ComposerKt.sourceInformation(startRestartGroup, "C(SplashScreen)N(modifier,viewModel,onNavigateToHomeScreen,onNavigateToOnboarding)43@1807L29,45@1854L27,46@1898L29,48@1954L119,48@1933L140,53@2110L158,53@2079L189,62@2274L1598:MRKMRSplashScreen.kt#8mcbm9");
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                mRKMRSplashVM2 = mRKMRSplashVM;
                if (startRestartGroup.changedInstance(mRKMRSplashVM2)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                mRKMRSplashVM2 = mRKMRSplashVM;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            mRKMRSplashVM2 = mRKMRSplashVM;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(onNavigateToHomeScreen) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(onNavigateToOnboarding) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.startDefaults();
            ComposerKt.sourceInformation(startRestartGroup, "39@1655L15");
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                companion = modifier2;
            } else {
                companion = i6 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1614864554, "CC(koinViewModel)N(qualifier,viewModelStoreOwner,key,extras,scope,parameters)43@1516L7,46@1711L18:ViewModel.kt#m7on9k");
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    ViewModel resolveViewModel = GetViewModelKt.resolveViewModel(Reflection.getOrCreateKotlinClass(MRKMRSplashVM.class), current.getViewModelStore(), null, CreationExtrasExtKt.defaultExtras(current), null, KoinApplicationKt.currentKoinScope(startRestartGroup, 0), null);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    mRKMRSplashVM4 = (MRKMRSplashVM) resolveViewModel;
                    i4 = i3 & (-113);
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1967462518, i4, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.splash.SplashScreen (MRKMRSplashScreen.kt:42)");
                    }
                    int i7 = i4;
                    State collectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(mRKMRSplashVM4.getOnboardedState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, startRestartGroup, 0, 7);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 945878641, "CC(remember):MRKMRSplashScreen.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    Animatable animatable = (Animatable) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 945880051, "CC(remember):MRKMRSplashScreen.kt#9igjgp");
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = AnimatableKt.Animatable$default(0.7f, 0.0f, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    Animatable animatable2 = (Animatable) rememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Unit unit = Unit.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 945881933, "CC(remember):MRKMRSplashScreen.kt#9igjgp");
                    changedInstance = startRestartGroup.changedInstance(animatable) | startRestartGroup.changedInstance(animatable2);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new MRKMRSplashScreenKt$SplashScreen$1$1(animatable, animatable2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 6);
                    Boolean valueOf = Boolean.valueOf(SplashScreen$lambda$0(collectAsStateWithLifecycle));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 945886964, "CC(remember):MRKMRSplashScreen.kt#9igjgp");
                    changed = startRestartGroup.changed(collectAsStateWithLifecycle) | ((i7 & 896) != 256) | ((i7 & 7168) != 2048);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new MRKMRSplashScreenKt$SplashScreen$2$1(onNavigateToHomeScreen, onNavigateToOnboarding, collectAsStateWithLifecycle, null);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, 0);
                    Modifier m300backgroundbw27NRU$default = BackgroundKt.m300backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ColorKt.getSageLight(), null, 2, null);
                    Alignment center = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m300backgroundbw27NRU$default);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor);
                    } else {
                        startRestartGroup.useNode();
                    }
                    Composer m4643constructorimpl = Updater.m4643constructorimpl(startRestartGroup);
                    Updater.m4651setimpl(m4643constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4651setimpl(m4643constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m4647initimpl(m4643constructorimpl, Integer.valueOf(hashCode), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m4649reconcileimpl(m4643constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m4651setimpl(m4643constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 103656792, "C68@2431L1435:MRKMRSplashScreen.kt#8mcbm9");
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Modifier scale = ScaleKt.scale(AlphaKt.alpha(Modifier.INSTANCE, ((Number) animatable.getValue()).floatValue()), ((Number) animatable2.getValue()).floatValue());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                    int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, scale);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor2);
                    } else {
                        startRestartGroup.useNode();
                    }
                    Composer m4643constructorimpl2 = Updater.m4643constructorimpl(startRestartGroup);
                    Updater.m4651setimpl(m4643constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4651setimpl(m4643constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m4647initimpl(m4643constructorimpl2, Integer.valueOf(hashCode2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m4649reconcileimpl(m4643constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m4651setimpl(m4643constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1597088160, "C74@2631L603,91@3247L41,93@3330L33,92@3301L237,99@3551L40,100@3604L252:MRKMRSplashScreen.kt#8mcbm9");
                    Modifier m299backgroundbw27NRU = BackgroundKt.m299backgroundbw27NRU(SizeKt.m977size3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(120)), ColorKt.getForestGreen(), RoundedCornerShapeKt.m1284RoundedCornerShape0680j_4(Dp.m8227constructorimpl(32)));
                    Alignment center2 = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                    int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m299backgroundbw27NRU);
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor3);
                    } else {
                        startRestartGroup.useNode();
                    }
                    Composer m4643constructorimpl3 = Updater.m4643constructorimpl(startRestartGroup);
                    Updater.m4651setimpl(m4643constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4651setimpl(m4643constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m4647initimpl(m4643constructorimpl3, Integer.valueOf(hashCode3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m4649reconcileimpl(m4643constructorimpl3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m4651setimpl(m4643constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 430134690, "C83@2951L269:MRKMRSplashScreen.kt#8mcbm9");
                    SingletonAsyncImageKt.m9152AsyncImage10Xjiaw(Integer.valueOf(R.drawable.app_icon_big), "App Icon", ClipKt.clip(SizeKt.m977size3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(90)), RoundedCornerShapeKt.m1284RoundedCornerShape0680j_4(Dp.m8227constructorimpl(24))), null, null, null, null, 0.0f, null, 0, false, startRestartGroup, 48, 0, 2040);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    SpacerKt.Spacer(SizeKt.m963height3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(28)), startRestartGroup, 6);
                    composer2 = startRestartGroup;
                    TextKt.m3259TextNvy7gAk(StringResources_androidKt.stringResource(R.string.app_name, startRestartGroup, 0), null, ColorKt.getForestGreen(), null, TextUnitKt.getSp(40), null, FontWeight.INSTANCE.getExtraBold(), null, TextUnitKt.getSp(2), null, null, 0L, 0, false, 0, 0, null, null, composer2, 102261120, 0, 261802);
                    SpacerKt.Spacer(SizeKt.m963height3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(8)), composer2, 6);
                    TextKt.m3259TextNvy7gAk("Rare Produce, Expertly Sourced", null, Color.m5392copywmQWz5c$default(ColorKt.getDarkForest(), 0.75f, 0.0f, 0.0f, 0.0f, 14, null), null, TextUnitKt.getSp(14), null, FontWeight.INSTANCE.getMedium(), null, TextUnitKt.getSp(1), null, null, 0L, 0, false, 0, 0, null, null, composer2, 102261126, 0, 261802);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mRKMRSplashVM3 = mRKMRSplashVM4;
                }
            }
            i4 = i3;
            mRKMRSplashVM4 = mRKMRSplashVM2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i72 = i4;
            State collectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(mRKMRSplashVM4.getOnboardedState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, startRestartGroup, 0, 7);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 945878641, "CC(remember):MRKMRSplashScreen.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            Animatable animatable3 = (Animatable) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 945880051, "CC(remember):MRKMRSplashScreen.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            Animatable animatable22 = (Animatable) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Unit unit2 = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 945881933, "CC(remember):MRKMRSplashScreen.kt#9igjgp");
            changedInstance = startRestartGroup.changedInstance(animatable3) | startRestartGroup.changedInstance(animatable22);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue3 = new MRKMRSplashScreenKt$SplashScreen$1$1(animatable3, animatable22, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 6);
            Boolean valueOf2 = Boolean.valueOf(SplashScreen$lambda$0(collectAsStateWithLifecycle2));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 945886964, "CC(remember):MRKMRSplashScreen.kt#9igjgp");
            changed = startRestartGroup.changed(collectAsStateWithLifecycle2) | ((i72 & 896) != 256) | ((i72 & 7168) != 2048);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue4 = new MRKMRSplashScreenKt$SplashScreen$2$1(onNavigateToHomeScreen, onNavigateToOnboarding, collectAsStateWithLifecycle2, null);
            startRestartGroup.updateRememberedValue(rememberedValue4);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.LaunchedEffect(valueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, 0);
            Modifier m300backgroundbw27NRU$default2 = BackgroundKt.m300backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ColorKt.getSageLight(), null, 2, null);
            Alignment center3 = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(center3, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, m300backgroundbw27NRU$default2);
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            Composer m4643constructorimpl4 = Updater.m4643constructorimpl(startRestartGroup);
            Updater.m4651setimpl(m4643constructorimpl4, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4651setimpl(m4643constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4647initimpl(m4643constructorimpl4, Integer.valueOf(hashCode4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4649reconcileimpl(m4643constructorimpl4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4651setimpl(m4643constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 103656792, "C68@2431L1435:MRKMRSplashScreen.kt#8mcbm9");
            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
            Modifier scale2 = ScaleKt.scale(AlphaKt.alpha(Modifier.INSTANCE, ((Number) animatable3.getValue()).floatValue()), ((Number) animatable22.getValue()).floatValue());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode22 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, scale2);
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            Composer m4643constructorimpl22 = Updater.m4643constructorimpl(startRestartGroup);
            Updater.m4651setimpl(m4643constructorimpl22, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4651setimpl(m4643constructorimpl22, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4647initimpl(m4643constructorimpl22, Integer.valueOf(hashCode22), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4649reconcileimpl(m4643constructorimpl22, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4651setimpl(m4643constructorimpl22, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1597088160, "C74@2631L603,91@3247L41,93@3330L33,92@3301L237,99@3551L40,100@3604L252:MRKMRSplashScreen.kt#8mcbm9");
            Modifier m299backgroundbw27NRU2 = BackgroundKt.m299backgroundbw27NRU(SizeKt.m977size3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(120)), ColorKt.getForestGreen(), RoundedCornerShapeKt.m1284RoundedCornerShape0680j_4(Dp.m8227constructorimpl(32)));
            Alignment center22 = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(center22, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode32 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, m299backgroundbw27NRU2);
            Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            Composer m4643constructorimpl32 = Updater.m4643constructorimpl(startRestartGroup);
            Updater.m4651setimpl(m4643constructorimpl32, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4651setimpl(m4643constructorimpl32, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4647initimpl(m4643constructorimpl32, Integer.valueOf(hashCode32), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4649reconcileimpl(m4643constructorimpl32, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4651setimpl(m4643constructorimpl32, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 430134690, "C83@2951L269:MRKMRSplashScreen.kt#8mcbm9");
            SingletonAsyncImageKt.m9152AsyncImage10Xjiaw(Integer.valueOf(R.drawable.app_icon_big), "App Icon", ClipKt.clip(SizeKt.m977size3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(90)), RoundedCornerShapeKt.m1284RoundedCornerShape0680j_4(Dp.m8227constructorimpl(24))), null, null, null, null, 0.0f, null, 0, false, startRestartGroup, 48, 0, 2040);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            SpacerKt.Spacer(SizeKt.m963height3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(28)), startRestartGroup, 6);
            composer2 = startRestartGroup;
            TextKt.m3259TextNvy7gAk(StringResources_androidKt.stringResource(R.string.app_name, startRestartGroup, 0), null, ColorKt.getForestGreen(), null, TextUnitKt.getSp(40), null, FontWeight.INSTANCE.getExtraBold(), null, TextUnitKt.getSp(2), null, null, 0L, 0, false, 0, 0, null, null, composer2, 102261120, 0, 261802);
            SpacerKt.Spacer(SizeKt.m963height3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(8)), composer2, 6);
            TextKt.m3259TextNvy7gAk("Rare Produce, Expertly Sourced", null, Color.m5392copywmQWz5c$default(ColorKt.getDarkForest(), 0.75f, 0.0f, 0.0f, 0.0f, 14, null), null, TextUnitKt.getSp(14), null, FontWeight.INSTANCE.getMedium(), null, TextUnitKt.getSp(1), null, null, 0L, 0, false, 0, 0, null, null, composer2, 102261126, 0, 261802);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            mRKMRSplashVM3 = mRKMRSplashVM4;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            companion = modifier2;
            mRKMRSplashVM3 = mRKMRSplashVM2;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.splash.MRKMRSplashScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SplashScreen$lambda$6;
                    SplashScreen$lambda$6 = MRKMRSplashScreenKt.SplashScreen$lambda$6(Modifier.this, mRKMRSplashVM3, onNavigateToHomeScreen, onNavigateToOnboarding, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return SplashScreen$lambda$6;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SplashScreen$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
