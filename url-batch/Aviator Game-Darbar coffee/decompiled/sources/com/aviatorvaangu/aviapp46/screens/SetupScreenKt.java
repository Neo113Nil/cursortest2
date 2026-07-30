package com.aviatorvaangu.aviapp46.screens;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.aviatorvaangu.aviapp46.components.AppColorsKt;
import com.aviatorvaangu.aviapp46.components.AppScaffoldKt;
import com.aviatorvaangu.aviapp46.components.ButtonsKt;
import com.aviatorvaangu.aviapp46.components.CardsKt;
import com.aviatorvaangu.aviapp46.components.PromoCardKt;
import com.aviatorvaangu.aviapp46.data.GuideContentKt;
import com.aviatorvaangu.aviapp46.data.SetupQuestion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: SetupScreen.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b²\u0006\n\u0010\t\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010\u000b\u001a\u00020\nX\u008a\u008e\u0002"}, d2 = {"SetupScreen", "", "step", "", "onAdClick", "Lkotlin/Function0;", "onContinue", "(ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app", "selected", "", "input"}, k = 2, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final class SetupScreenKt {
    static final Unit SetupScreen$lambda$22(int i, Function0 function0, Function0 function02, int i2, Composer composer, int i3) {
        SetupScreen(i, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void SetupScreen(final int i, final Function0<Unit> onAdClick, final Function0<Unit> onContinue, Composer composer, final int i2) {
        int i3;
        final MutableState mutableState;
        Intrinsics.checkNotNullParameter(onAdClick, "onAdClick");
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Composer startRestartGroup = composer.startRestartGroup(526789408);
        ComposerKt.sourceInformation(startRestartGroup, "C(SetupScreen)N(step,onAdClick,onContinue)39@1880L22,39@1857L45,40@1943L22,40@1920L45,43@2090L2633,43@2078L2645:SetupScreen.kt#5vyur7");
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(onAdClick) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(onContinue) ? 256 : 128;
        }
        final boolean z = false;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(526789408, i3, -1, "com.aviatorvaangu.aviapp46.screens.SetupScreen (SetupScreen.kt:37)");
            }
            final SetupQuestion setupQuestion = GuideContentKt.getSetupQuestions().get(i);
            Object[] objArr = {Integer.valueOf(i)};
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -561514346, "CC(remember):SetupScreen.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.aviatorvaangu.aviapp46.screens.SetupScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState mutableStateOf$default;
                        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                        return mutableStateOf$default;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            MutableState mutableState2 = (MutableState) RememberSaveableKt.rememberSaveable(objArr, (Function0) rememberedValue, startRestartGroup, 48);
            Object[] objArr2 = {Integer.valueOf(i)};
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -561512330, "CC(remember):SetupScreen.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: com.aviatorvaangu.aviapp46.screens.SetupScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState mutableStateOf$default;
                        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                        return mutableStateOf$default;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final MutableState mutableState3 = (MutableState) RememberSaveableKt.rememberSaveable(objArr2, (Function0) rememberedValue2, startRestartGroup, 48);
            if (setupQuestion.getInputPlaceholder() != null ? StringsKt.isBlank(SetupScreen$lambda$6(mutableState3)) : StringsKt.isBlank(SetupScreen$lambda$2(mutableState2))) {
                mutableState = mutableState2;
            } else {
                mutableState = mutableState2;
                z = true;
            }
            AppScaffoldKt.AppScaffold(ComposableLambdaKt.rememberComposableLambda(-1302276308, true, new Function2() { // from class: com.aviatorvaangu.aviapp46.screens.SetupScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SetupScreenKt.SetupScreen$lambda$21(Function0.this, setupQuestion, mutableState3, mutableState, onContinue, z, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.aviatorvaangu.aviapp46.screens.SetupScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SetupScreenKt.SetupScreen$lambda$22(i, onAdClick, onContinue, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final String SetupScreen$lambda$2(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String SetupScreen$lambda$6(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    static final Unit SetupScreen$lambda$21(final Function0 function0, final SetupQuestion setupQuestion, final MutableState mutableState, final MutableState mutableState2, Function0 function02, boolean z, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C44@2100L2617:SetupScreen.kt#5vyur7");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1302276308, i, -1, "com.aviatorvaangu.aviapp46.screens.SetupScreen.<anonymous> (SetupScreen.kt:44)");
            }
            Modifier m820padding3ABfNKs = PaddingKt.m820padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7522constructorimpl(22.0f));
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m820padding3ABfNKs);
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
            ComposerKt.sourceInformationMarkerStart(composer, 1535896254, "C53@2432L2071,49@2228L2275,92@4516L191:SetupScreen.kt#5vyur7");
            Modifier weight$default = ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
            PaddingValues m817PaddingValuesa9UjIt4$default = PaddingKt.m817PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m7522constructorimpl(18.0f), 7, null);
            Arrangement.HorizontalOrVertical m690spacedBy0680j_4 = Arrangement.INSTANCE.m690spacedBy0680j_4(Dp.m7522constructorimpl(10.0f));
            ComposerKt.sourceInformationMarkerStart(composer, 742287821, "CC(remember):SetupScreen.kt#9igjgp");
            boolean changed = composer.changed(function0) | composer.changedInstance(setupQuestion) | composer.changed(mutableState) | composer.changed(mutableState2);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: com.aviatorvaangu.aviapp46.screens.SetupScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SetupScreenKt.SetupScreen$lambda$21$lambda$20$lambda$19$lambda$18(SetupQuestion.this, function0, mutableState, mutableState2, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            LazyDslKt.LazyColumn(weight$default, null, m817PaddingValuesa9UjIt4$default, false, m690spacedBy0680j_4, null, null, false, null, (Function1) rememberedValue, composer, 24960, 490);
            ButtonsKt.PrimaryButton("CONTINUE", function02, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), z, composer, 390, 0);
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

    static final Unit SetupScreen$lambda$21$lambda$20$lambda$19$lambda$18(final SetupQuestion setupQuestion, final Function0 function0, final MutableState mutableState, final MutableState mutableState2, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1852898303, true, new Function3() { // from class: com.aviatorvaangu.aviapp46.screens.SetupScreenKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SetupScreenKt.SetupScreen$lambda$21$lambda$20$lambda$19$lambda$18$lambda$8(Function0.this, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$SetupScreenKt.INSTANCE.m7958getLambda$662804118$app(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(682950089, true, new Function3() { // from class: com.aviatorvaangu.aviapp46.screens.SetupScreenKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SetupScreenKt.SetupScreen$lambda$21$lambda$20$lambda$19$lambda$18$lambda$9(SetupQuestion.this, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        if (setupQuestion.getInputPlaceholder() != null) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-559293242, true, new Function3() { // from class: com.aviatorvaangu.aviapp46.screens.SetupScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SetupScreenKt.SetupScreen$lambda$21$lambda$20$lambda$19$lambda$18$lambda$13(MutableState.this, setupQuestion, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        } else {
            for (final String str : setupQuestion.getOptions()) {
                LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(239011119, true, new Function3() { // from class: com.aviatorvaangu.aviapp46.screens.SetupScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return SetupScreenKt.SetupScreen$lambda$21$lambda$20$lambda$19$lambda$18$lambda$17$lambda$16(str, mutableState2, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }), 3, null);
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit SetupScreen$lambda$21$lambda$20$lambda$19$lambda$18$lambda$8(Function0 function0, LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation(composer, "C54@2457L33:SetupScreen.kt#5vyur7");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1852898303, i, -1, "com.aviatorvaangu.aviapp46.screens.SetupScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SetupScreen.kt:54)");
            }
            PromoCardKt.PromoCard(null, function0, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    static final Unit SetupScreen$lambda$21$lambda$20$lambda$19$lambda$18$lambda$9(SetupQuestion setupQuestion, LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation(composer, "C57@2592L85,58@2698L29,59@2748L79,60@2848L30:SetupScreen.kt#5vyur7");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(682950089, i, -1, "com.aviatorvaangu.aviapp46.screens.SetupScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SetupScreen.kt:57)");
            }
            TextKt.m2714TextNvy7gAk(setupQuestion.getQuestion(), null, AppColorsKt.getInk(), null, TextUnitKt.getSp(29), null, FontWeight.INSTANCE.getBlack(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1597824, 0, 262058);
            SpacerKt.Spacer(SizeKt.m852height3ABfNKs(Modifier.INSTANCE, Dp.m7522constructorimpl(8.0f)), composer, 6);
            TextKt.m2714TextNvy7gAk(setupQuestion.getSubtitle(), null, AppColorsKt.getSoftGrey(), null, TextUnitKt.getSp(15), null, null, null, 0L, null, null, TextUnitKt.getSp(21), 0, false, 0, 0, null, null, composer, 24960, 48, 260074);
            SpacerKt.Spacer(SizeKt.m852height3ABfNKs(Modifier.INSTANCE, Dp.m7522constructorimpl(10.0f)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit SetupScreen$lambda$21$lambda$20$lambda$19$lambda$18$lambda$13(final MutableState mutableState, final SetupQuestion setupQuestion, LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation(composer, "C71@3481L599,66@3111L14,67@3169L35,64@3005L1165:SetupScreen.kt#5vyur7");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-559293242, i, -1, "com.aviatorvaangu.aviapp46.screens.SetupScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SetupScreen.kt:64)");
            }
            String SetupScreen$lambda$6 = SetupScreen$lambda$6(mutableState);
            KeyboardOptions keyboardOptions = new KeyboardOptions(KeyboardCapitalization.INSTANCE.m7187getWordsIUNYP9k(), (Boolean) null, 0, 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 126, (DefaultConstructorMarker) null);
            RoundedCornerShape m1128RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1128RoundedCornerShape0680j_4(Dp.m7522constructorimpl(14.0f));
            TextFieldColors m2694colors0hiis_0 = TextFieldDefaults.INSTANCE.m2694colors0hiis_0(AppColorsKt.getInk(), AppColorsKt.getInk(), 0L, 0L, AppColorsKt.getPanelBlack(), AppColorsKt.getPanelBlack(), 0L, 0L, 0L, 0L, null, AppColorsKt.getSkyBlue(), AppColorsKt.getCardBorder(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, AppColorsKt.getSoftGrey(), AppColorsKt.getSoftGrey(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 221238, 432, 113246208, 0, 3072, 1744824268, 4095);
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(composer, -609889324, "CC(remember):SetupScreen.kt#9igjgp");
            boolean changed = composer.changed(mutableState);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: com.aviatorvaangu.aviapp46.screens.SetupScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SetupScreenKt.SetupScreen$lambda$21$lambda$20$lambda$19$lambda$18$lambda$13$lambda$11$lambda$10(MutableState.this, (String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            OutlinedTextFieldKt.OutlinedTextField(SetupScreen$lambda$6, (Function1<? super String, Unit>) rememberedValue, fillMaxWidth$default, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(964161133, true, new Function2() { // from class: com.aviatorvaangu.aviapp46.screens.SetupScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SetupScreenKt.SetupScreen$lambda$21$lambda$20$lambda$19$lambda$18$lambda$13$lambda$12(SetupQuestion.this, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, keyboardOptions, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) m1128RoundedCornerShape0680j_4, m2694colors0hiis_0, composer, 12583296, 12779520, 0, 1933176);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit SetupScreen$lambda$21$lambda$20$lambda$19$lambda$18$lambda$13$lambda$11$lambda$10(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    static final Unit SetupScreen$lambda$21$lambda$20$lambda$19$lambda$18$lambda$13$lambda$12(SetupQuestion setupQuestion, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C67@3171L31:SetupScreen.kt#5vyur7");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(964161133, i, -1, "com.aviatorvaangu.aviapp46.screens.SetupScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SetupScreen.kt:67)");
            }
            TextKt.m2714TextNvy7gAk(setupQuestion.getInputPlaceholder(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    static final Unit SetupScreen$lambda$21$lambda$20$lambda$19$lambda$18$lambda$17$lambda$16(final String str, final MutableState mutableState, LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation(composer, "C87@4401L21,87@4334L89:SetupScreen.kt#5vyur7");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(239011119, i, -1, "com.aviatorvaangu.aviapp46.screens.SetupScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SetupScreen.kt:87)");
            }
            boolean areEqual = Intrinsics.areEqual(SetupScreen$lambda$2(mutableState), str);
            ComposerKt.sourceInformationMarkerStart(composer, 2056421796, "CC(remember):SetupScreen.kt#9igjgp");
            boolean changed = composer.changed(mutableState) | composer.changed(str);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.aviatorvaangu.aviapp46.screens.SetupScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SetupScreenKt.SetupScreen$lambda$21$lambda$20$lambda$19$lambda$18$lambda$17$lambda$16$lambda$15$lambda$14(str, mutableState);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            CardsKt.OptionCard(str, areEqual, (Function0) rememberedValue, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit SetupScreen$lambda$21$lambda$20$lambda$19$lambda$18$lambda$17$lambda$16$lambda$15$lambda$14(String str, MutableState mutableState) {
        mutableState.setValue(str);
        return Unit.INSTANCE;
    }
}
