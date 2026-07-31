package gbcorp.c312.merkmarker.info.ui.composable.screen.onboarding;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.rounded.AgricultureKt;
import androidx.compose.material.icons.rounded.EcoKt;
import androidx.compose.material.icons.rounded.LocalFloristKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import coil3.compose.SingletonAsyncImageKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import gbcorp.c312.merkmarker.info.R;
import gbcorp.c312.merkmarker.info.ui.theme.ColorKt;
import gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMROnboardingVM;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.koin.compose.KoinApplicationKt;
import org.koin.viewmodel.CreationExtrasExtKt;
import org.koin.viewmodel.GetViewModelKt;

/* compiled from: MRKMROnboardingScreen.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\u001a/\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0007¢\u0006\u0002\u0010\u000b\u001a\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002H\u0003¢\u0006\u0002\u0010\u000e\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002"}, d2 = {"onboardingPagesContent", "", "Lgbcorp/c312/merkmarker/info/ui/composable/screen/onboarding/OnboardingContent;", "OnboardingScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lgbcorp/c312/merkmarker/info/ui/viewmodel/MRKMROnboardingVM;", "onNavigateToHomeScreen", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lgbcorp/c312/merkmarker/info/ui/viewmodel/MRKMROnboardingVM;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "OnboardingPage", FirebaseAnalytics.Param.CONTENT, "(Lgbcorp/c312/merkmarker/info/ui/composable/screen/onboarding/OnboardingContent;Landroidx/compose/runtime/Composer;I)V", "app_release", "onboardingSetState", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MRKMROnboardingScreenKt {
    private static final List<OnboardingContent> onboardingPagesContent = CollectionsKt.listOf((Object[]) new OnboardingContent[]{new OnboardingContent(R.string.page_1_title, R.string.page_1_description, "https://img.odcdn.com.br/wp-content/uploads/2024/07/agricultura-1-1920x1080.jpg", AgricultureKt.getAgriculture(Icons.Rounded.INSTANCE)), new OnboardingContent(R.string.page_2_title, R.string.page_2_description, "https://cms.equiterre.org/uploads/Axes/_2000xAUTO_crop_center-center_none/Alimentationagriculture-hors_campagne-l%C3%A9gumes_caisse_bois.jpg", EcoKt.getEco(Icons.Rounded.INSTANCE)), new OnboardingContent(R.string.page_3_title, R.string.page_3_description, "https://wallpapers.com/images/hd/grocery-items-tomatoes-onions-s1zmh8rxelor7ecr.jpg", LocalFloristKt.getLocalFlorist(Icons.Rounded.INSTANCE))});

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OnboardingPage$lambda$1(OnboardingContent onboardingContent, int i, Composer composer, int i2) {
        OnboardingPage(onboardingContent, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OnboardingScreen$lambda$4(Modifier modifier, MRKMROnboardingVM mRKMROnboardingVM, Function0 function0, int i, int i2, Composer composer, int i3) {
        OnboardingScreen(modifier, mRKMROnboardingVM, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x05e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OnboardingScreen(Modifier modifier, MRKMROnboardingVM mRKMROnboardingVM, final Function0<Unit> onNavigateToHomeScreen, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        MRKMROnboardingVM mRKMROnboardingVM2;
        final Modifier modifier3;
        final MRKMROnboardingVM mRKMROnboardingVM3;
        Modifier.Companion companion;
        MRKMROnboardingVM mRKMROnboardingVM4;
        boolean changed;
        MRKMROnboardingScreenKt$OnboardingScreen$1$1 rememberedValue;
        Object rememberedValue2;
        final PagerState rememberPagerState;
        Object rememberedValue3;
        int size;
        int i4;
        boolean changedInstance;
        Object rememberedValue4;
        boolean changed2;
        Object rememberedValue5;
        int i5;
        Intrinsics.checkNotNullParameter(onNavigateToHomeScreen, "onNavigateToHomeScreen");
        Composer startRestartGroup = composer.startRestartGroup(1768811074);
        ComposerKt.sourceInformation(startRestartGroup, "C(OnboardingScreen)N(modifier,viewModel,onNavigateToHomeScreen)89@3870L16,91@3927L88,91@3892L123,97@4069L31,97@4038L63,98@4118L24,100@4148L2844:MRKMROnboardingScreen.kt#ioy939");
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
                mRKMROnboardingVM2 = mRKMROnboardingVM;
                if (startRestartGroup.changedInstance(mRKMROnboardingVM2)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                mRKMROnboardingVM2 = mRKMROnboardingVM;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            mRKMROnboardingVM2 = mRKMROnboardingVM;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(onNavigateToHomeScreen) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.startDefaults();
            ComposerKt.sourceInformation(startRestartGroup, "86@3750L15");
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
                    ViewModel resolveViewModel = GetViewModelKt.resolveViewModel(Reflection.getOrCreateKotlinClass(MRKMROnboardingVM.class), current.getViewModelStore(), null, CreationExtrasExtKt.defaultExtras(current), null, KoinApplicationKt.currentKoinScope(startRestartGroup, 0), null);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    i3 &= -113;
                    mRKMROnboardingVM4 = (MRKMROnboardingVM) resolveViewModel;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1768811074, i3, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.onboarding.OnboardingScreen (MRKMROnboardingScreen.kt:88)");
                    }
                    State collectAsState = SnapshotStateKt.collectAsState(mRKMROnboardingVM4.getOnboardingSetState(), null, startRestartGroup, 0, 1);
                    Boolean valueOf = Boolean.valueOf(OnboardingScreen$lambda$0(collectAsState));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -979598406, "CC(remember):MRKMROnboardingScreen.kt#9igjgp");
                    changed = ((i3 & 896) != 256) | startRestartGroup.changed(collectAsState);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new MRKMROnboardingScreenKt$OnboardingScreen$1$1(onNavigateToHomeScreen, collectAsState, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -979593919, "CC(remember):MRKMROnboardingScreen.kt#9igjgp");
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function0() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.onboarding.MRKMROnboardingScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int OnboardingScreen$lambda$2$0;
                                OnboardingScreen$lambda$2$0 = MRKMROnboardingScreenKt.OnboardingScreen$lambda$2$0();
                                return Integer.valueOf(OnboardingScreen$lambda$2$0);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    rememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) rememberedValue2, startRestartGroup, 384, 3);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)600@27430L68:Effects.kt#9igjgp");
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683736516, "CC(remember):Effects.kt#9igjgp");
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue3;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier m300backgroundbw27NRU$default = BackgroundKt.m300backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ColorKt.getSageLight(), null, 2, null);
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m300backgroundbw27NRU$default);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    final MRKMROnboardingVM mRKMROnboardingVM5 = mRKMROnboardingVM4;
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
                    Updater.m4651setimpl(m4643constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4651setimpl(m4643constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m4647initimpl(m4643constructorimpl, Integer.valueOf(hashCode), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m4649reconcileimpl(m4643constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m4651setimpl(m4643constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1070552912, "C106@4323L238,116@4608L682,133@5300L1686:MRKMROnboardingScreen.kt#ioy939");
                    Modifier modifier4 = companion;
                    PagerKt.m1222HorizontalPager8jOkeI(rememberPagerState, ColumnScope.weight$default(columnScopeInstance, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableSingletons$MRKMROnboardingScreenKt.INSTANCE.m9558getLambda$926694037$app_release(), startRestartGroup, 0, 24576, 16380);
                    Modifier m931paddingVpY3zN4$default = PaddingKt.m931paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m8227constructorimpl(20), 1, null);
                    Arrangement.HorizontalOrVertical m784spacedBy0680j_4 = Arrangement.INSTANCE.m784spacedBy0680j_4(Dp.m8227constructorimpl(6));
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m784spacedBy0680j_4, centerVertically, startRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                    int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m931paddingVpY3zN4$default);
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
                    Updater.m4651setimpl(m4643constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4651setimpl(m4643constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m4647initimpl(m4643constructorimpl2, Integer.valueOf(hashCode2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m4649reconcileimpl(m4643constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m4651setimpl(m4643constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 765890767, "C:MRKMROnboardingScreen.kt#ioy939");
                    startRestartGroup.startReplaceGroup(-1776409164);
                    ComposerKt.sourceInformation(startRestartGroup, "*123@4948L318");
                    size = onboardingPagesContent.size();
                    i4 = 0;
                    while (i4 < size) {
                        boolean z = rememberPagerState.getCurrentPage() == i4;
                        float f = 8;
                        Modifier m963height3ABfNKs = SizeKt.m963height3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(f));
                        if (z) {
                            f = 28;
                        }
                        BoxKt.Box(BackgroundKt.m300backgroundbw27NRU$default(ClipKt.clip(SizeKt.m982width3ABfNKs(m963height3ABfNKs, Dp.m8227constructorimpl(f)), RoundedCornerShapeKt.RoundedCornerShape(50)), z ? ColorKt.getForestGreen() : Color.m5392copywmQWz5c$default(ColorKt.getSlateGreen(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), startRestartGroup, 0);
                        i4++;
                    }
                    startRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier m933paddingqDBjuR0$default = PaddingKt.m933paddingqDBjuR0$default(PaddingKt.m931paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8227constructorimpl(24), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, Dp.m8227constructorimpl(36), 7, null);
                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween, centerVertically2, startRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                    int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m933paddingqDBjuR0$default);
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
                    Updater.m4651setimpl(m4643constructorimpl3, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4651setimpl(m4643constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m4647initimpl(m4643constructorimpl3, Integer.valueOf(hashCode3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m4649reconcileimpl(m4643constructorimpl3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m4651setimpl(m4643constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1534487668, "C142@5640L28,141@5602L300,163@6439L127,153@6037L309,168@6633L343,152@6003L973:MRKMROnboardingScreen.kt#ioy939");
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1019330797, "CC(remember):MRKMROnboardingScreen.kt#9igjgp");
                    changedInstance = startRestartGroup.changedInstance(mRKMROnboardingVM5);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changedInstance || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new Function0() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.onboarding.MRKMROnboardingScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit OnboardingScreen$lambda$3$1$0$0;
                                OnboardingScreen$lambda$3$1$0$0 = MRKMROnboardingScreenKt.OnboardingScreen$lambda$3$1$0$0(MRKMROnboardingVM.this);
                                return OnboardingScreen$lambda$3$1$0$0;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ButtonKt.TextButton((Function0) rememberedValue4, null, false, null, null, null, null, null, null, ComposableSingletons$MRKMROnboardingScreenKt.INSTANCE.getLambda$2028476724$app_release(), startRestartGroup, 805306368, TypedValues.PositionType.TYPE_POSITION_TYPE);
                    boolean z2 = rememberPagerState.getCurrentPage() != onboardingPagesContent.size() + (-1);
                    RoundedCornerShape m1284RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1284RoundedCornerShape0680j_4(Dp.m8227constructorimpl(16));
                    final boolean z3 = z2;
                    ButtonColors m2064buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m2064buttonColorsro_MJ88(ColorKt.getForestGreen(), ColorKt.getPureWhite(), 0L, 0L, startRestartGroup, (ButtonDefaults.$stable << 12) | 54, 12);
                    startRestartGroup = startRestartGroup;
                    Modifier m963height3ABfNKs2 = SizeKt.m963height3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(50));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1019343782, "CC(remember):MRKMROnboardingScreen.kt#9igjgp");
                    changed2 = startRestartGroup.changed(z3) | startRestartGroup.changedInstance(mRKMROnboardingVM5) | startRestartGroup.changedInstance(coroutineScope) | startRestartGroup.changed(rememberPagerState);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (!changed2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new Function0() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.onboarding.MRKMROnboardingScreenKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit OnboardingScreen$lambda$3$1$1$0;
                                OnboardingScreen$lambda$3$1$1$0 = MRKMROnboardingScreenKt.OnboardingScreen$lambda$3$1$1$0(z3, mRKMROnboardingVM5, coroutineScope, rememberPagerState);
                                return OnboardingScreen$lambda$3$1$1$0;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ButtonKt.Button((Function0) rememberedValue5, m963height3ABfNKs2, false, m1284RoundedCornerShape0680j_4, m2064buttonColorsro_MJ88, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(511214753, true, new Function3() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.onboarding.MRKMROnboardingScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            Unit OnboardingScreen$lambda$3$1$2;
                            OnboardingScreen$lambda$3$1$2 = MRKMROnboardingScreenKt.OnboardingScreen$lambda$3$1$2(z3, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                            return OnboardingScreen$lambda$3$1$2;
                        }
                    }, startRestartGroup, 54), startRestartGroup, 805306416, 484);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mRKMROnboardingVM3 = mRKMROnboardingVM5;
                    modifier3 = modifier4;
                }
            }
            mRKMROnboardingVM4 = mRKMROnboardingVM2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            State collectAsState2 = SnapshotStateKt.collectAsState(mRKMROnboardingVM4.getOnboardingSetState(), null, startRestartGroup, 0, 1);
            Boolean valueOf2 = Boolean.valueOf(OnboardingScreen$lambda$0(collectAsState2));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -979598406, "CC(remember):MRKMROnboardingScreen.kt#9igjgp");
            changed = ((i3 & 896) != 256) | startRestartGroup.changed(collectAsState2);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new MRKMROnboardingScreenKt$OnboardingScreen$1$1(onNavigateToHomeScreen, collectAsState2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.LaunchedEffect(valueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -979593919, "CC(remember):MRKMROnboardingScreen.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            rememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) rememberedValue2, startRestartGroup, 384, 3);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)600@27430L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683736516, "CC(remember):Effects.kt#9igjgp");
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            }
            final CoroutineScope coroutineScope2 = (CoroutineScope) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier m300backgroundbw27NRU$default2 = BackgroundKt.m300backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ColorKt.getSageLight(), null, 2, null);
            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, m300backgroundbw27NRU$default2);
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            final MRKMROnboardingVM mRKMROnboardingVM52 = mRKMROnboardingVM4;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            Composer m4643constructorimpl4 = Updater.m4643constructorimpl(startRestartGroup);
            Updater.m4651setimpl(m4643constructorimpl4, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4651setimpl(m4643constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4647initimpl(m4643constructorimpl4, Integer.valueOf(hashCode4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4649reconcileimpl(m4643constructorimpl4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4651setimpl(m4643constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1070552912, "C106@4323L238,116@4608L682,133@5300L1686:MRKMROnboardingScreen.kt#ioy939");
            Modifier modifier42 = companion;
            PagerKt.m1222HorizontalPager8jOkeI(rememberPagerState, ColumnScope.weight$default(columnScopeInstance2, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableSingletons$MRKMROnboardingScreenKt.INSTANCE.m9558getLambda$926694037$app_release(), startRestartGroup, 0, 24576, 16380);
            Modifier m931paddingVpY3zN4$default2 = PaddingKt.m931paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m8227constructorimpl(20), 1, null);
            Arrangement.HorizontalOrVertical m784spacedBy0680j_42 = Arrangement.INSTANCE.m784spacedBy0680j_4(Dp.m8227constructorimpl(6));
            Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(m784spacedBy0680j_42, centerVertically3, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode22 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m931paddingVpY3zN4$default2);
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            Composer m4643constructorimpl22 = Updater.m4643constructorimpl(startRestartGroup);
            Updater.m4651setimpl(m4643constructorimpl22, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4651setimpl(m4643constructorimpl22, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4647initimpl(m4643constructorimpl22, Integer.valueOf(hashCode22), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4649reconcileimpl(m4643constructorimpl22, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4651setimpl(m4643constructorimpl22, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 765890767, "C:MRKMROnboardingScreen.kt#ioy939");
            startRestartGroup.startReplaceGroup(-1776409164);
            ComposerKt.sourceInformation(startRestartGroup, "*123@4948L318");
            size = onboardingPagesContent.size();
            i4 = 0;
            while (i4 < size) {
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier m933paddingqDBjuR0$default2 = PaddingKt.m933paddingqDBjuR0$default(PaddingKt.m931paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8227constructorimpl(24), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, Dp.m8227constructorimpl(36), 7, null);
            Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically22, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode32 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, m933paddingqDBjuR0$default2);
            Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            Composer m4643constructorimpl32 = Updater.m4643constructorimpl(startRestartGroup);
            Updater.m4651setimpl(m4643constructorimpl32, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4651setimpl(m4643constructorimpl32, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4647initimpl(m4643constructorimpl32, Integer.valueOf(hashCode32), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4649reconcileimpl(m4643constructorimpl32, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4651setimpl(m4643constructorimpl32, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1534487668, "C142@5640L28,141@5602L300,163@6439L127,153@6037L309,168@6633L343,152@6003L973:MRKMROnboardingScreen.kt#ioy939");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1019330797, "CC(remember):MRKMROnboardingScreen.kt#9igjgp");
            changedInstance = startRestartGroup.changedInstance(mRKMROnboardingVM52);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue4 = new Function0() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.onboarding.MRKMROnboardingScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit OnboardingScreen$lambda$3$1$0$0;
                    OnboardingScreen$lambda$3$1$0$0 = MRKMROnboardingScreenKt.OnboardingScreen$lambda$3$1$0$0(MRKMROnboardingVM.this);
                    return OnboardingScreen$lambda$3$1$0$0;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue4);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ButtonKt.TextButton((Function0) rememberedValue4, null, false, null, null, null, null, null, null, ComposableSingletons$MRKMROnboardingScreenKt.INSTANCE.getLambda$2028476724$app_release(), startRestartGroup, 805306368, TypedValues.PositionType.TYPE_POSITION_TYPE);
            if (rememberPagerState.getCurrentPage() != onboardingPagesContent.size() + (-1)) {
            }
            RoundedCornerShape m1284RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1284RoundedCornerShape0680j_4(Dp.m8227constructorimpl(16));
            final boolean z32 = z2;
            ButtonColors m2064buttonColorsro_MJ882 = ButtonDefaults.INSTANCE.m2064buttonColorsro_MJ88(ColorKt.getForestGreen(), ColorKt.getPureWhite(), 0L, 0L, startRestartGroup, (ButtonDefaults.$stable << 12) | 54, 12);
            startRestartGroup = startRestartGroup;
            Modifier m963height3ABfNKs22 = SizeKt.m963height3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(50));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1019343782, "CC(remember):MRKMROnboardingScreen.kt#9igjgp");
            changed2 = startRestartGroup.changed(z32) | startRestartGroup.changedInstance(mRKMROnboardingVM52) | startRestartGroup.changedInstance(coroutineScope2) | startRestartGroup.changed(rememberPagerState);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue5 = new Function0() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.onboarding.MRKMROnboardingScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit OnboardingScreen$lambda$3$1$1$0;
                    OnboardingScreen$lambda$3$1$1$0 = MRKMROnboardingScreenKt.OnboardingScreen$lambda$3$1$1$0(z32, mRKMROnboardingVM52, coroutineScope2, rememberPagerState);
                    return OnboardingScreen$lambda$3$1$1$0;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue5);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ButtonKt.Button((Function0) rememberedValue5, m963height3ABfNKs22, false, m1284RoundedCornerShape0680j_42, m2064buttonColorsro_MJ882, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(511214753, true, new Function3() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.onboarding.MRKMROnboardingScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit OnboardingScreen$lambda$3$1$2;
                    OnboardingScreen$lambda$3$1$2 = MRKMROnboardingScreenKt.OnboardingScreen$lambda$3$1$2(z32, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return OnboardingScreen$lambda$3$1$2;
                }
            }, startRestartGroup, 54), startRestartGroup, 805306416, 484);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            mRKMROnboardingVM3 = mRKMROnboardingVM52;
            modifier3 = modifier42;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            mRKMROnboardingVM3 = mRKMROnboardingVM2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.onboarding.MRKMROnboardingScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit OnboardingScreen$lambda$4;
                    OnboardingScreen$lambda$4 = MRKMROnboardingScreenKt.OnboardingScreen$lambda$4(Modifier.this, mRKMROnboardingVM3, onNavigateToHomeScreen, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return OnboardingScreen$lambda$4;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int OnboardingScreen$lambda$2$0() {
        return onboardingPagesContent.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OnboardingScreen$lambda$3$1$0$0(MRKMROnboardingVM mRKMROnboardingVM) {
        mRKMROnboardingVM.setOnboarded();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OnboardingScreen$lambda$3$1$1$0(boolean z, MRKMROnboardingVM mRKMROnboardingVM, CoroutineScope coroutineScope, PagerState pagerState) {
        if (!z) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MRKMROnboardingScreenKt$OnboardingScreen$2$2$2$1$1(pagerState, null), 3, null);
        } else {
            mRKMROnboardingVM.setOnboarded();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OnboardingScreen$lambda$3$1$2(boolean z, RowScope Button, Composer composer, int i) {
        String stringResource;
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation(composer, "C169@6651L311:MRKMROnboardingScreen.kt#ioy939");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(511214753, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.onboarding.OnboardingScreen.<anonymous>.<anonymous>.<anonymous> (MRKMROnboardingScreen.kt:169)");
            }
            if (z) {
                composer.startReplaceGroup(1651108076);
                ComposerKt.sourceInformation(composer, "170@6700L43");
                stringResource = StringResources_androidKt.stringResource(R.string.start_button_title, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1651110283);
                ComposerKt.sourceInformation(composer, "171@6769L42");
                stringResource = StringResources_androidKt.stringResource(R.string.next_button_title, composer, 0);
                composer.endReplaceGroup();
            }
            TextKt.m3259TextNvy7gAk(stringResource, null, 0L, null, TextUnitKt.getSp(15), null, FontWeight.INSTANCE.getBold(), null, TextUnitKt.getSp(1.5d), null, null, 0L, 0, false, 0, 0, null, null, composer, 102260736, 0, 261806);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OnboardingPage(final OnboardingContent onboardingContent, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(479423291);
        ComposerKt.sourceInformation(startRestartGroup, "C(OnboardingPage)N(content)183@7069L2030:MRKMROnboardingScreen.kt#ioy939");
        if ((i & 6) == 0) {
            i2 = i | (startRestartGroup.changed(onboardingContent) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(479423291, i2, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.onboarding.OnboardingPage (MRKMROnboardingScreen.kt:182)");
            }
            float f = 24;
            Modifier m931paddingVpY3zN4$default = PaddingKt.m931paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8227constructorimpl(f), 0.0f, 2, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m931paddingVpY3zN4$default);
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
            Composer m4643constructorimpl = Updater.m4643constructorimpl(startRestartGroup);
            Updater.m4651setimpl(m4643constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4651setimpl(m4643constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4647initimpl(m4643constructorimpl, Integer.valueOf(hashCode), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4649reconcileimpl(m4643constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4651setimpl(m4643constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -635914721, "C189@7250L41,191@7301L1045,222@8356L41,225@8432L32,226@8500L11,224@8407L294,232@8710L41,234@8785L38,235@8859L11,233@8760L333:MRKMROnboardingScreen.kt#ioy939");
            SpacerKt.Spacer(SizeKt.m963height3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(f)), startRestartGroup, 6);
            Modifier clip = ClipKt.clip(SizeKt.m963height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8227constructorimpl(300)), RoundedCornerShapeKt.m1284RoundedCornerShape0680j_4(Dp.m8227constructorimpl(28)));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, clip);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4643constructorimpl2 = Updater.m4643constructorimpl(startRestartGroup);
            Updater.m4651setimpl(m4643constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4651setimpl(m4643constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4647initimpl(m4643constructorimpl2, Integer.valueOf(hashCode2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4649reconcileimpl(m4643constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4651setimpl(m4643constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1687211344, "C197@7476L211,208@7901L11,203@7700L636:MRKMROnboardingScreen.kt#ioy939");
            SingletonAsyncImageKt.m9152AsyncImage10Xjiaw(onboardingContent.getImageUrl(), null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, startRestartGroup, 1573296, 0, 1976);
            Modifier m929padding3ABfNKs = PaddingKt.m929padding3ABfNKs(BackgroundKt.m299backgroundbw27NRU(PaddingKt.m929padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd()), Dp.m8227constructorimpl(14)), MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getPrimaryContainer(), RoundedCornerShapeKt.RoundedCornerShape(50)), Dp.m8227constructorimpl(10));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m929padding3ABfNKs);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -694396046, "C216@8220L11,213@8078L244:MRKMROnboardingScreen.kt#ioy939");
            IconKt.m2553Iconww6aTOc(onboardingContent.getIcon(), (String) null, SizeKt.m977size3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(f)), MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnPrimaryContainer(), startRestartGroup, 432, 0);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            SpacerKt.Spacer(SizeKt.m963height3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(36)), startRestartGroup, 6);
            TextKt.m3259TextNvy7gAk(StringResources_androidKt.stringResource(onboardingContent.getTitleRes(), startRestartGroup, 0), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnBackground(), null, TextUnitKt.getSp(28), null, FontWeight.INSTANCE.getExtraBold(), null, 0L, null, TextAlign.m8098boximpl(TextAlign.INSTANCE.m8110getStarte0LSkKk()), 0L, 0, false, 0, 0, null, null, startRestartGroup, 1597488, 0, 261032);
            SpacerKt.Spacer(SizeKt.m963height3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(12)), startRestartGroup, 6);
            TextKt.m3259TextNvy7gAk(StringResources_androidKt.stringResource(onboardingContent.getDescriptionRes(), startRestartGroup, 0), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), null, TextUnitKt.getSp(14), null, FontWeight.INSTANCE.getNormal(), null, 0L, null, TextAlign.m8098boximpl(TextAlign.INSTANCE.m8110getStarte0LSkKk()), TextUnitKt.getSp(22), 0, false, 0, 0, null, null, startRestartGroup, 1597488, 48, 258984);
            startRestartGroup = startRestartGroup;
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
            endRestartGroup.updateScope(new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.onboarding.MRKMROnboardingScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit OnboardingPage$lambda$1;
                    OnboardingPage$lambda$1 = MRKMROnboardingScreenKt.OnboardingPage$lambda$1(OnboardingContent.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return OnboardingPage$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean OnboardingScreen$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
