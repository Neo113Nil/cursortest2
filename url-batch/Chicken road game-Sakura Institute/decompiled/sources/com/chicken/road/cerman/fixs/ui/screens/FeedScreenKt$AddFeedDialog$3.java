package com.chicken.road.cerman.fixs.ui.screens;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.chicken.road.cerman.fixs.data.Chicken;
import com.chicken.road.cerman.fixs.ui.ChickenPickerKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeedScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class FeedScreenKt$AddFeedDialog$3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ List<Chicken> $chickens;
    final /* synthetic */ MutableState<String> $feedType$delegate;
    final /* synthetic */ MutableState<Long> $pickedId$delegate;
    final /* synthetic */ List<String> $presets;
    final /* synthetic */ MutableState<String> $price$delegate;
    final /* synthetic */ MutableState<String> $qty$delegate;

    FeedScreenKt$AddFeedDialog$3(List<Chicken> list, MutableState<Long> mutableState, List<String> list2, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<String> mutableState4) {
        this.$chickens = list;
        this.$pickedId$delegate = mutableState;
        this.$presets = list2;
        this.$feedType$delegate = mutableState2;
        this.$qty$delegate = mutableState3;
        this.$price$delegate = mutableState4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        Long AddFeedDialog$lambda$23;
        String AddFeedDialog$lambda$17;
        String AddFeedDialog$lambda$20;
        String AddFeedDialog$lambda$14;
        final MutableState<String> mutableState;
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1995938080, i, -1, "com.chicken.road.cerman.fixs.ui.screens.AddFeedDialog.<anonymous> (FeedScreen.kt:137)");
            }
            Arrangement.HorizontalOrVertical m561spacedBy0680j_4 = Arrangement.INSTANCE.m561spacedBy0680j_4(Dp.m6299constructorimpl(10));
            List<Chicken> list = this.$chickens;
            final MutableState<Long> mutableState2 = this.$pickedId$delegate;
            List<String> list2 = this.$presets;
            MutableState<String> mutableState3 = this.$feedType$delegate;
            final MutableState<String> mutableState4 = this.$qty$delegate;
            final MutableState<String> mutableState5 = this.$price$delegate;
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m561spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m3333constructorimpl = Updater.m3333constructorimpl(composer);
            Updater.m3340setimpl(m3333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            AddFeedDialog$lambda$23 = FeedScreenKt.AddFeedDialog$lambda$23(mutableState2);
            composer.startReplaceGroup(-2089312375);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.FeedScreenKt$AddFeedDialog$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$12$lambda$1$lambda$0;
                        invoke$lambda$12$lambda$1$lambda$0 = FeedScreenKt$AddFeedDialog$3.invoke$lambda$12$lambda$1$lambda$0(MutableState.this, (Long) obj);
                        return invoke$lambda$12$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            ChickenPickerKt.ChickenPicker(list, AddFeedDialog$lambda$23, (Function1) rememberedValue, false, null, composer, 384, 24);
            MutableState<String> mutableState6 = mutableState3;
            TextKt.m2373Text4IGK_g("Feed type", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3078, 0, 131058);
            boolean z = true;
            Composer composer2 = composer;
            Modifier horizontalScroll$default = ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
            Arrangement.HorizontalOrVertical m561spacedBy0680j_42 = Arrangement.INSTANCE.m561spacedBy0680j_4(Dp.m6299constructorimpl(6));
            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m561spacedBy0680j_42, Alignment.INSTANCE.getTop(), composer2, 6);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, horizontalScroll$default);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer m3333constructorimpl2 = Updater.m3333constructorimpl(composer);
            Updater.m3340setimpl(m3333constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3340setimpl(m3333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3333constructorimpl2.getInserting() || !Intrinsics.areEqual(m3333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3340setimpl(m3333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer2.startReplaceGroup(524685609);
            for (final String str : list2) {
                AddFeedDialog$lambda$14 = FeedScreenKt.AddFeedDialog$lambda$14(mutableState6);
                boolean areEqual = Intrinsics.areEqual(AddFeedDialog$lambda$14, str);
                composer2.startReplaceGroup(1126453990);
                boolean changed = composer2.changed(str);
                Object rememberedValue2 = composer.rememberedValue();
                if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    mutableState = mutableState6;
                    rememberedValue2 = new Function0() { // from class: com.chicken.road.cerman.fixs.ui.screens.FeedScreenKt$AddFeedDialog$3$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$12$lambda$5$lambda$4$lambda$3$lambda$2;
                            invoke$lambda$12$lambda$5$lambda$4$lambda$3$lambda$2 = FeedScreenKt$AddFeedDialog$3.invoke$lambda$12$lambda$5$lambda$4$lambda$3$lambda$2(str, mutableState);
                            return invoke$lambda$12$lambda$5$lambda$4$lambda$3$lambda$2;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue2);
                } else {
                    mutableState = mutableState6;
                }
                composer.endReplaceGroup();
                ChipKt.FilterChip(areEqual, (Function0) rememberedValue2, ComposableLambdaKt.rememberComposableLambda(1503863095, z, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.FeedScreenKt$AddFeedDialog$3$1$2$1$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i2) {
                        if ((i2 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1503863095, i2, -1, "com.chicken.road.cerman.fixs.ui.screens.AddFeedDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FeedScreen.kt:147)");
                        }
                        TextKt.m2373Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), null, false, null, null, null, null, null, null, null, composer, 384, 0, 4088);
                composer2 = composer;
                mutableState6 = mutableState;
                z = z;
            }
            composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            AddFeedDialog$lambda$17 = FeedScreenKt.AddFeedDialog$lambda$17(mutableState4);
            composer.startReplaceGroup(-2089291953);
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.FeedScreenKt$AddFeedDialog$3$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$12$lambda$8$lambda$7;
                        invoke$lambda$12$lambda$8$lambda$7 = FeedScreenKt$AddFeedDialog$3.invoke$lambda$12$lambda$8$lambda$7(MutableState.this, (String) obj);
                        return invoke$lambda$12$lambda$8$lambda$7;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceGroup();
            OutlinedTextFieldKt.OutlinedTextField(AddFeedDialog$lambda$17, (Function1<? super String, Unit>) rememberedValue3, (Modifier) null, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$FeedScreenKt.INSTANCE.m6714getLambda7$app_release(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer, 1572912, 12582912, 0, 8257468);
            AddFeedDialog$lambda$20 = FeedScreenKt.AddFeedDialog$lambda$20(mutableState5);
            composer.startReplaceGroup(-2089286319);
            Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.FeedScreenKt$AddFeedDialog$3$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$12$lambda$11$lambda$10;
                        invoke$lambda$12$lambda$11$lambda$10 = FeedScreenKt$AddFeedDialog$3.invoke$lambda$12$lambda$11$lambda$10(MutableState.this, (String) obj);
                        return invoke$lambda$12$lambda$11$lambda$10;
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            composer.endReplaceGroup();
            OutlinedTextFieldKt.OutlinedTextField(AddFeedDialog$lambda$20, (Function1<? super String, Unit>) rememberedValue4, (Modifier) null, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$FeedScreenKt.INSTANCE.m6715getLambda8$app_release(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer, 1572912, 12582912, 0, 8257468);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$1$lambda$0(MutableState mutableState, Long l) {
        mutableState.setValue(l);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$5$lambda$4$lambda$3$lambda$2(String str, MutableState mutableState) {
        mutableState.setValue(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$8$lambda$7(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String str = it;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt) || charAt == '.') {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        mutableState.setValue(sb2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$11$lambda$10(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String str = it;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt) || charAt == '.') {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        mutableState.setValue(sb2);
        return Unit.INSTANCE;
    }
}
