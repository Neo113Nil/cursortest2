package com.aviatorvaangu.aviapp46.screens;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.aviatorvaangu.aviapp46.components.AppColorsKt;
import com.aviatorvaangu.aviapp46.components.AppScaffoldKt;
import com.aviatorvaangu.aviapp46.components.AviationArtworkKt;
import com.aviatorvaangu.aviapp46.components.ButtonsKt;
import com.aviatorvaangu.aviapp46.components.IndicatorsKt;
import com.aviatorvaangu.aviapp46.components.PromoCardKt;
import com.aviatorvaangu.aviapp46.data.GuideContentKt;
import com.aviatorvaangu.aviapp46.data.OnboardingPage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OnboardingScreen.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"OnboardingScreen", "", "page", "", "onAdClick", "Lkotlin/Function0;", "onSkip", "onNext", "(ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app"}, k = 2, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final class OnboardingScreenKt {
    static final Unit OnboardingScreen$lambda$4(int i, Function0 function0, Function0 function02, Function0 function03, int i2, Composer composer, int i3) {
        OnboardingScreen(i, function0, function02, function03, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void OnboardingScreen(final int i, final Function0<Unit> onAdClick, final Function0<Unit> onSkip, final Function0<Unit> onNext, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(onAdClick, "onAdClick");
        Intrinsics.checkNotNullParameter(onSkip, "onSkip");
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        Composer startRestartGroup = composer.startRestartGroup(-1695814248);
        ComposerKt.sourceInformation(startRestartGroup, "C(OnboardingScreen)N(page,onAdClick,onSkip,onNext)34@1578L1633,34@1566L1645:OnboardingScreen.kt#5vyur7");
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(onAdClick) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(onSkip) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(onNext) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1695814248, i3, -1, "com.aviatorvaangu.aviapp46.screens.OnboardingScreen (OnboardingScreen.kt:32)");
            }
            final OnboardingPage onboardingPage = GuideContentKt.getOnboardingPages().get(i);
            AppScaffoldKt.AppScaffold(ComposableLambdaKt.rememberComposableLambda(1225005988, true, new Function2() { // from class: com.aviatorvaangu.aviapp46.screens.OnboardingScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OnboardingScreenKt.OnboardingScreen$lambda$3(i, onboardingPage, onAdClick, onSkip, onNext, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.aviatorvaangu.aviapp46.screens.OnboardingScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OnboardingScreenKt.OnboardingScreen$lambda$4(i, onAdClick, onSkip, onNext, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final Unit OnboardingScreen$lambda$3(int i, OnboardingPage onboardingPage, Function0 function0, Function0 function02, Function0 function03, Composer composer, int i2) {
        ComposerKt.sourceInformation(composer, "C35@1588L1617:OnboardingScreen.kt#5vyur7");
        if (!composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1225005988, i2, -1, "com.aviatorvaangu.aviapp46.screens.OnboardingScreen.<anonymous> (OnboardingScreen.kt:35)");
            }
            Modifier m821paddingVpY3zN4 = PaddingKt.m821paddingVpY3zN4(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7522constructorimpl(22.0f), Dp.m7522constructorimpl(18.0f));
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m821paddingVpY3zN4);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m4009constructorimpl = Updater.m4009constructorimpl(composer);
            Updater.m4017setimpl(m4009constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4017setimpl(m4009constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4013initimpl(m4009constructorimpl, Integer.valueOf(hashCode), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4015reconcileimpl(m4009constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4017setimpl(m4009constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -849799220, "C44@1922L21,41@1810L869,57@2692L60,58@2765L30,59@2808L387:OnboardingScreen.kt#5vyur7");
            Modifier verticalScroll$default = ScrollKt.verticalScroll$default(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, composer, 48);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, verticalScroll$default);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer m4009constructorimpl2 = Updater.m4009constructorimpl(composer);
            Updater.m4017setimpl(m4009constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4017setimpl(m4009constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4013initimpl(m4009constructorimpl2, Integer.valueOf(hashCode2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4015reconcileimpl(m4009constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4017setimpl(m4009constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1504345185, "C47@2045L29,48@2091L86,49@2194L30,50@2241L108,51@2366L30,52@2413L108,53@2538L30,54@2585L33,55@2635L30:OnboardingScreen.kt#5vyur7");
            SpacerKt.Spacer(SizeKt.m852height3ABfNKs(Modifier.INSTANCE, Dp.m7522constructorimpl(8.0f)), composer, 6);
            AviationArtworkKt.AviationHero(onboardingPage.getImageMode(), SizeKt.m852height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7522constructorimpl(190.0f)), composer, 48, 0);
            SpacerKt.Spacer(SizeKt.m852height3ABfNKs(Modifier.INSTANCE, Dp.m7522constructorimpl(18.0f)), composer, 6);
            TextKt.m2714TextNvy7gAk(onboardingPage.getTitle(), null, AppColorsKt.getInk(), null, TextUnitKt.getSp(28), null, FontWeight.INSTANCE.getBlack(), null, 0L, null, TextAlign.m7393boximpl(TextAlign.INSTANCE.m7400getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, composer, 1597824, 0, 261034);
            SpacerKt.Spacer(SizeKt.m852height3ABfNKs(Modifier.INSTANCE, Dp.m7522constructorimpl(10.0f)), composer, 6);
            TextKt.m2714TextNvy7gAk(onboardingPage.getDescription(), null, AppColorsKt.getSoftGrey(), null, TextUnitKt.getSp(15), null, null, null, 0L, null, TextAlign.m7393boximpl(TextAlign.INSTANCE.m7400getCentere0LSkKk()), TextUnitKt.getSp(22), 0, false, 0, 0, null, null, composer, 24960, 48, 259050);
            SpacerKt.Spacer(SizeKt.m852height3ABfNKs(Modifier.INSTANCE, Dp.m7522constructorimpl(18.0f)), composer, 6);
            PromoCardKt.PromoCard(null, function0, composer, 0, 1);
            SpacerKt.Spacer(SizeKt.m852height3ABfNKs(Modifier.INSTANCE, Dp.m7522constructorimpl(18.0f)), composer, 6);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            IndicatorsKt.DotIndicators(GuideContentKt.getOnboardingPages().size(), i, composer, 0);
            SpacerKt.Spacer(SizeKt.m852height3ABfNKs(Modifier.INSTANCE, Dp.m7522constructorimpl(18.0f)), composer, 6);
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer m4009constructorimpl3 = Updater.m4009constructorimpl(composer);
            Updater.m4017setimpl(m4009constructorimpl3, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4017setimpl(m4009constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4013initimpl(m4009constructorimpl3, Integer.valueOf(hashCode3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4015reconcileimpl(m4009constructorimpl3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4017setimpl(m4009constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 331450517, "C60@2953L130,63@3100L81:OnboardingScreen.kt#5vyur7");
            ButtonKt.TextButton(function02, null, false, null, null, null, null, null, null, ComposableSingletons$OnboardingScreenKt.INSTANCE.m7957getLambda$2110299283$app(), composer, 805306368, 510);
            ButtonsKt.PrimaryButton("NEXT", function03, SizeKt.m871width3ABfNKs(Modifier.INSTANCE, Dp.m7522constructorimpl(170.0f)), false, composer, 390, 8);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
