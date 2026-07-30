package com.chicken.road.cerman.fixs.ui.screens;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
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
import com.chicken.road.cerman.fixs.data.ChickenStatus;
import com.chicken.road.cerman.fixs.data.ChickenType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FlockScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class FlockScreenKt$AddEditChickenDialog$4 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MutableState<String> $breed$delegate;
    final /* synthetic */ MutableState<String> $cost$delegate;
    final /* synthetic */ MutableState<String> $name$delegate;
    final /* synthetic */ MutableState<String> $notes$delegate;
    final /* synthetic */ MutableState<ChickenStatus> $status$delegate;
    final /* synthetic */ MutableState<ChickenType> $type$delegate;

    FlockScreenKt$AddEditChickenDialog$4(MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<ChickenType> mutableState3, MutableState<ChickenStatus> mutableState4, MutableState<String> mutableState5, MutableState<String> mutableState6) {
        this.$name$delegate = mutableState;
        this.$breed$delegate = mutableState2;
        this.$type$delegate = mutableState3;
        this.$status$delegate = mutableState4;
        this.$cost$delegate = mutableState5;
        this.$notes$delegate = mutableState6;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        String AddEditChickenDialog$lambda$14;
        String AddEditChickenDialog$lambda$17;
        float f;
        String AddEditChickenDialog$lambda$26;
        String AddEditChickenDialog$lambda$29;
        ChickenStatus AddEditChickenDialog$lambda$23;
        final MutableState<ChickenStatus> mutableState;
        ChickenType AddEditChickenDialog$lambda$20;
        final MutableState<ChickenType> mutableState2;
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2062186439, i, -1, "com.chicken.road.cerman.fixs.ui.screens.AddEditChickenDialog.<anonymous> (FlockScreen.kt:184)");
            }
            Arrangement.HorizontalOrVertical m561spacedBy0680j_4 = Arrangement.INSTANCE.m561spacedBy0680j_4(Dp.m6299constructorimpl(10));
            final MutableState<String> mutableState3 = this.$name$delegate;
            final MutableState<String> mutableState4 = this.$breed$delegate;
            MutableState<ChickenType> mutableState5 = this.$type$delegate;
            MutableState<ChickenStatus> mutableState6 = this.$status$delegate;
            final MutableState<String> mutableState7 = this.$cost$delegate;
            final MutableState<String> mutableState8 = this.$notes$delegate;
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
            AddEditChickenDialog$lambda$14 = FlockScreenKt.AddEditChickenDialog$lambda$14(mutableState3);
            composer.startReplaceGroup(-1427521494);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.FlockScreenKt$AddEditChickenDialog$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$17$lambda$1$lambda$0;
                        invoke$lambda$17$lambda$1$lambda$0 = FlockScreenKt$AddEditChickenDialog$4.invoke$lambda$17$lambda$1$lambda$0(MutableState.this, (String) obj);
                        return invoke$lambda$17$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            MutableState<ChickenStatus> mutableState9 = mutableState6;
            MutableState<ChickenType> mutableState10 = mutableState5;
            OutlinedTextFieldKt.OutlinedTextField(AddEditChickenDialog$lambda$14, (Function1<? super String, Unit>) rememberedValue, (Modifier) null, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$FlockScreenKt.INSTANCE.m6721getLambda6$app_release(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer, 1572912, 12582912, 0, 8257468);
            AddEditChickenDialog$lambda$17 = FlockScreenKt.AddEditChickenDialog$lambda$17(mutableState4);
            composer.startReplaceGroup(-1427517301);
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.FlockScreenKt$AddEditChickenDialog$4$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$17$lambda$3$lambda$2;
                        invoke$lambda$17$lambda$3$lambda$2 = FlockScreenKt$AddEditChickenDialog$4.invoke$lambda$17$lambda$3$lambda$2(MutableState.this, (String) obj);
                        return invoke$lambda$17$lambda$3$lambda$2;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceGroup();
            OutlinedTextFieldKt.OutlinedTextField(AddEditChickenDialog$lambda$17, (Function1<? super String, Unit>) rememberedValue2, (Modifier) null, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$FlockScreenKt.INSTANCE.m6722getLambda7$app_release(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer, 1572912, 12582912, 0, 8257468);
            TextKt.m2373Text4IGK_g("Type", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3078, 0, 131058);
            float f2 = 6;
            Arrangement.HorizontalOrVertical m561spacedBy0680j_42 = Arrangement.INSTANCE.m561spacedBy0680j_4(Dp.m6299constructorimpl(f2));
            String str = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
            Composer composer2 = composer;
            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m561spacedBy0680j_42, Alignment.INSTANCE.getTop(), composer2, 6);
            String str2 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str2);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            String str3 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str3);
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
            String str4 = "C101@5126L9:Row.kt#2w3rfo";
            ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer2.startReplaceGroup(-1582623733);
            ChickenType[] values = ChickenType.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                f = f2;
                if (i2 >= length) {
                    break;
                }
                final ChickenType chickenType = values[i2];
                AddEditChickenDialog$lambda$20 = FlockScreenKt.AddEditChickenDialog$lambda$20(mutableState10);
                boolean z = AddEditChickenDialog$lambda$20 == chickenType;
                composer2.startReplaceGroup(749696455);
                boolean changed = composer2.changed(chickenType);
                Object rememberedValue3 = composer.rememberedValue();
                if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    mutableState2 = mutableState10;
                    rememberedValue3 = new Function0() { // from class: com.chicken.road.cerman.fixs.ui.screens.FlockScreenKt$AddEditChickenDialog$4$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$17$lambda$7$lambda$6$lambda$5$lambda$4;
                            invoke$lambda$17$lambda$7$lambda$6$lambda$5$lambda$4 = FlockScreenKt$AddEditChickenDialog$4.invoke$lambda$17$lambda$7$lambda$6$lambda$5$lambda$4(ChickenType.this, mutableState2);
                            return invoke$lambda$17$lambda$7$lambda$6$lambda$5$lambda$4;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue3);
                } else {
                    mutableState2 = mutableState10;
                }
                composer.endReplaceGroup();
                ChipKt.FilterChip(z, (Function0) rememberedValue3, ComposableLambdaKt.rememberComposableLambda(-120351006, true, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.FlockScreenKt$AddEditChickenDialog$4$1$3$1$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i3) {
                        if ((i3 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-120351006, i3, -1, "com.chicken.road.cerman.fixs.ui.screens.AddEditChickenDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FlockScreen.kt:190)");
                        }
                        TextKt.m2373Text4IGK_g(ChickenType.this.name(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), null, false, null, null, null, null, null, null, null, composer, 384, 0, 4088);
                i2++;
                composer2 = composer;
                mutableState10 = mutableState2;
                f2 = f;
                length = length;
                values = values;
                str3 = str3;
                str2 = str2;
                str = str;
                str4 = str4;
            }
            String str5 = str4;
            composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            TextKt.m2373Text4IGK_g("Status", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3078, 0, 131058);
            Arrangement.HorizontalOrVertical m561spacedBy0680j_43 = Arrangement.INSTANCE.m561spacedBy0680j_4(Dp.m6299constructorimpl(f));
            Composer composer3 = composer;
            ComposerKt.sourceInformationMarkerStart(composer3, 693286680, str);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m561spacedBy0680j_43, Alignment.INSTANCE.getTop(), composer3, 6);
            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str2);
            boolean z2 = false;
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, companion3);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str3);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer3.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer m3333constructorimpl3 = Updater.m3333constructorimpl(composer);
            Updater.m3340setimpl(m3333constructorimpl3, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3340setimpl(m3333constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3333constructorimpl3.getInserting() || !Intrinsics.areEqual(m3333constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m3333constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m3333constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m3340setimpl(m3333constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer3, -407840262, str5);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            composer3.startReplaceGroup(-1582611569);
            ChickenStatus[] values2 = ChickenStatus.values();
            int length2 = values2.length;
            int i3 = 0;
            while (i3 < length2) {
                final ChickenStatus chickenStatus = values2[i3];
                AddEditChickenDialog$lambda$23 = FlockScreenKt.AddEditChickenDialog$lambda$23(mutableState9);
                boolean z3 = AddEditChickenDialog$lambda$23 == chickenStatus ? true : z2;
                composer3.startReplaceGroup(749708681);
                boolean changed2 = composer3.changed(chickenStatus);
                Object rememberedValue4 = composer.rememberedValue();
                if (changed2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    mutableState = mutableState9;
                    rememberedValue4 = new Function0() { // from class: com.chicken.road.cerman.fixs.ui.screens.FlockScreenKt$AddEditChickenDialog$4$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$17$lambda$11$lambda$10$lambda$9$lambda$8;
                            invoke$lambda$17$lambda$11$lambda$10$lambda$9$lambda$8 = FlockScreenKt$AddEditChickenDialog$4.invoke$lambda$17$lambda$11$lambda$10$lambda$9$lambda$8(ChickenStatus.this, mutableState);
                            return invoke$lambda$17$lambda$11$lambda$10$lambda$9$lambda$8;
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue4);
                } else {
                    mutableState = mutableState9;
                }
                composer.endReplaceGroup();
                ChipKt.FilterChip(z3, (Function0) rememberedValue4, ComposableLambdaKt.rememberComposableLambda(-1244995501, true, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.FlockScreenKt$AddEditChickenDialog$4$1$4$1$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                        invoke(composer4, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer4, int i4) {
                        if ((i4 & 3) == 2 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1244995501, i4, -1, "com.chicken.road.cerman.fixs.ui.screens.AddEditChickenDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FlockScreen.kt:196)");
                        }
                        TextKt.m2373Text4IGK_g(ChickenStatus.this.name(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer3, 54), null, false, null, null, null, null, null, null, null, composer, 384, 0, 4088);
                i3++;
                composer3 = composer;
                mutableState9 = mutableState;
                length2 = length2;
                values2 = values2;
                z2 = z2;
            }
            composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            AddEditChickenDialog$lambda$26 = FlockScreenKt.AddEditChickenDialog$lambda$26(mutableState7);
            composer.startReplaceGroup(-1427488395);
            Object rememberedValue5 = composer.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.FlockScreenKt$AddEditChickenDialog$4$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$17$lambda$14$lambda$13;
                        invoke$lambda$17$lambda$14$lambda$13 = FlockScreenKt$AddEditChickenDialog$4.invoke$lambda$17$lambda$14$lambda$13(MutableState.this, (String) obj);
                        return invoke$lambda$17$lambda$14$lambda$13;
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            composer.endReplaceGroup();
            OutlinedTextFieldKt.OutlinedTextField(AddEditChickenDialog$lambda$26, (Function1<? super String, Unit>) rememberedValue5, (Modifier) null, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$FlockScreenKt.INSTANCE.m6723getLambda8$app_release(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer, 1572912, 12582912, 0, 8257468);
            AddEditChickenDialog$lambda$29 = FlockScreenKt.AddEditChickenDialog$lambda$29(mutableState8);
            composer.startReplaceGroup(-1427482773);
            Object rememberedValue6 = composer.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.FlockScreenKt$AddEditChickenDialog$4$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$17$lambda$16$lambda$15;
                        invoke$lambda$17$lambda$16$lambda$15 = FlockScreenKt$AddEditChickenDialog$4.invoke$lambda$17$lambda$16$lambda$15(MutableState.this, (String) obj);
                        return invoke$lambda$17$lambda$16$lambda$15;
                    }
                };
                composer.updateRememberedValue(rememberedValue6);
            }
            composer.endReplaceGroup();
            OutlinedTextFieldKt.OutlinedTextField(AddEditChickenDialog$lambda$29, (Function1<? super String, Unit>) rememberedValue6, (Modifier) null, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$FlockScreenKt.INSTANCE.m6724getLambda9$app_release(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer, 1572912, 0, 0, 8388540);
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
    public static final Unit invoke$lambda$17$lambda$1$lambda$0(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$17$lambda$3$lambda$2(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$17$lambda$7$lambda$6$lambda$5$lambda$4(ChickenType chickenType, MutableState mutableState) {
        mutableState.setValue(chickenType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$17$lambda$11$lambda$10$lambda$9$lambda$8(ChickenStatus chickenStatus, MutableState mutableState) {
        mutableState.setValue(chickenStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$17$lambda$16$lambda$15(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$17$lambda$14$lambda$13(MutableState mutableState, String it) {
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
