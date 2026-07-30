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
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class HealthScreenKt$AddVaccineDialog$3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ List<Chicken> $chickens;
    final /* synthetic */ MutableState<Integer> $dueDays$delegate;
    final /* synthetic */ List<Pair<Integer, String>> $duePresets;
    final /* synthetic */ MutableState<String> $name$delegate;
    final /* synthetic */ MutableState<String> $notes$delegate;
    final /* synthetic */ MutableState<Long> $pickedId$delegate;
    final /* synthetic */ List<String> $presets;

    HealthScreenKt$AddVaccineDialog$3(List<Chicken> list, MutableState<Long> mutableState, List<String> list2, MutableState<String> mutableState2, List<Pair<Integer, String>> list3, MutableState<Integer> mutableState3, MutableState<String> mutableState4) {
        this.$chickens = list;
        this.$pickedId$delegate = mutableState;
        this.$presets = list2;
        this.$name$delegate = mutableState2;
        this.$duePresets = list3;
        this.$dueDays$delegate = mutableState3;
        this.$notes$delegate = mutableState4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        Long AddVaccineDialog$lambda$33;
        Integer AddVaccineDialog$lambda$36;
        final MutableState<Integer> mutableState;
        String AddVaccineDialog$lambda$30;
        Integer AddVaccineDialog$lambda$362;
        final MutableState<Integer> mutableState2;
        String AddVaccineDialog$lambda$27;
        final MutableState<String> mutableState3;
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-401928905, i, -1, "com.chicken.road.cerman.fixs.ui.screens.AddVaccineDialog.<anonymous> (HealthScreen.kt:239)");
            }
            Arrangement.HorizontalOrVertical m561spacedBy0680j_4 = Arrangement.INSTANCE.m561spacedBy0680j_4(Dp.m6299constructorimpl(10));
            List<Chicken> list = this.$chickens;
            final MutableState<Long> mutableState4 = this.$pickedId$delegate;
            List<String> list2 = this.$presets;
            MutableState<String> mutableState5 = this.$name$delegate;
            List<Pair<Integer, String>> list3 = this.$duePresets;
            MutableState<Integer> mutableState6 = this.$dueDays$delegate;
            final MutableState<String> mutableState7 = this.$notes$delegate;
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
            AddVaccineDialog$lambda$33 = HealthScreenKt.AddVaccineDialog$lambda$33(mutableState4);
            composer.startReplaceGroup(571308280);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$AddVaccineDialog$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$14$lambda$1$lambda$0;
                        invoke$lambda$14$lambda$1$lambda$0 = HealthScreenKt$AddVaccineDialog$3.invoke$lambda$14$lambda$1$lambda$0(MutableState.this, (Long) obj);
                        return invoke$lambda$14$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            ChickenPickerKt.ChickenPicker(list, AddVaccineDialog$lambda$33, (Function1) rememberedValue, false, null, composer, 384, 24);
            MutableState<String> mutableState8 = mutableState5;
            TextKt.m2373Text4IGK_g("Type", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3078, 0, 131058);
            boolean z = true;
            Composer composer2 = composer;
            Modifier horizontalScroll$default = ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
            float f = 6;
            Arrangement.HorizontalOrVertical m561spacedBy0680j_42 = Arrangement.INSTANCE.m561spacedBy0680j_4(Dp.m6299constructorimpl(f));
            String str = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m561spacedBy0680j_42, Alignment.INSTANCE.getTop(), composer2, 6);
            String str2 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str2);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, horizontalScroll$default);
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
            composer2.startReplaceGroup(1342828016);
            for (final String str5 : list2) {
                AddVaccineDialog$lambda$27 = HealthScreenKt.AddVaccineDialog$lambda$27(mutableState8);
                boolean areEqual = Intrinsics.areEqual(AddVaccineDialog$lambda$27, str5);
                composer2.startReplaceGroup(638058673);
                boolean changed = composer2.changed(str5);
                Object rememberedValue2 = composer.rememberedValue();
                if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    mutableState3 = mutableState8;
                    rememberedValue2 = new Function0() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$AddVaccineDialog$3$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$14$lambda$5$lambda$4$lambda$3$lambda$2;
                            invoke$lambda$14$lambda$5$lambda$4$lambda$3$lambda$2 = HealthScreenKt$AddVaccineDialog$3.invoke$lambda$14$lambda$5$lambda$4$lambda$3$lambda$2(str5, mutableState3);
                            return invoke$lambda$14$lambda$5$lambda$4$lambda$3$lambda$2;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue2);
                } else {
                    mutableState3 = mutableState8;
                }
                composer.endReplaceGroup();
                ChipKt.FilterChip(areEqual, (Function0) rememberedValue2, ComposableLambdaKt.rememberComposableLambda(848558976, z, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$AddVaccineDialog$3$1$2$1$2
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
                            ComposerKt.traceEventStart(848558976, i2, -1, "com.chicken.road.cerman.fixs.ui.screens.AddVaccineDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HealthScreen.kt:244)");
                        }
                        TextKt.m2373Text4IGK_g(str5, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), null, false, null, null, null, null, null, null, null, composer, 384, 0, 4088);
                composer2 = composer;
                f = f;
                mutableState8 = mutableState3;
                str2 = str2;
                str = str;
                str4 = str4;
                str3 = str3;
                z = true;
            }
            String str6 = str4;
            composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            TextKt.m2373Text4IGK_g("Reminder", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3078, 0, 131058);
            Modifier horizontalScroll$default2 = ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            Arrangement.HorizontalOrVertical m561spacedBy0680j_43 = Arrangement.INSTANCE.m561spacedBy0680j_4(Dp.m6299constructorimpl(f));
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, str);
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m561spacedBy0680j_43, Alignment.INSTANCE.getTop(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str2);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, horizontalScroll$default2);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, str3);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
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
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, str6);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            AddVaccineDialog$lambda$36 = HealthScreenKt.AddVaccineDialog$lambda$36(mutableState6);
            boolean z2 = AddVaccineDialog$lambda$36 == null;
            composer.startReplaceGroup(1342843224);
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                mutableState = mutableState6;
                rememberedValue3 = new Function0() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$AddVaccineDialog$3$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$14$lambda$11$lambda$7$lambda$6;
                        invoke$lambda$14$lambda$11$lambda$7$lambda$6 = HealthScreenKt$AddVaccineDialog$3.invoke$lambda$14$lambda$11$lambda$7$lambda$6(MutableState.this);
                        return invoke$lambda$14$lambda$11$lambda$7$lambda$6;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            } else {
                mutableState = mutableState6;
            }
            composer.endReplaceGroup();
            MutableState<Integer> mutableState9 = mutableState;
            ChipKt.FilterChip(z2, (Function0) rememberedValue3, ComposableSingletons$HealthScreenKt.INSTANCE.m6727getLambda11$app_release(), null, false, null, null, null, null, null, null, null, composer, 432, 0, 4088);
            Composer composer3 = composer;
            composer3.startReplaceGroup(1342845827);
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                final int intValue = ((Number) pair.component1()).intValue();
                final String str7 = (String) pair.component2();
                AddVaccineDialog$lambda$362 = HealthScreenKt.AddVaccineDialog$lambda$36(mutableState9);
                boolean z3 = AddVaccineDialog$lambda$362 != null && AddVaccineDialog$lambda$362.intValue() == intValue;
                composer3.startReplaceGroup(638076852);
                boolean changed2 = composer3.changed(intValue);
                Object rememberedValue4 = composer.rememberedValue();
                if (changed2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    mutableState2 = mutableState9;
                    rememberedValue4 = new Function0() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$AddVaccineDialog$3$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$14$lambda$11$lambda$10$lambda$9$lambda$8;
                            invoke$lambda$14$lambda$11$lambda$10$lambda$9$lambda$8 = HealthScreenKt$AddVaccineDialog$3.invoke$lambda$14$lambda$11$lambda$10$lambda$9$lambda$8(intValue, mutableState2);
                            return invoke$lambda$14$lambda$11$lambda$10$lambda$9$lambda$8;
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue4);
                } else {
                    mutableState2 = mutableState9;
                }
                composer.endReplaceGroup();
                ChipKt.FilterChip(z3, (Function0) rememberedValue4, ComposableLambdaKt.rememberComposableLambda(-480398208, true, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$AddVaccineDialog$3$1$3$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                        invoke(composer4, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer4, int i2) {
                        if ((i2 & 3) == 2 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-480398208, i2, -1, "com.chicken.road.cerman.fixs.ui.screens.AddVaccineDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HealthScreen.kt:251)");
                        }
                        TextKt.m2373Text4IGK_g(str7, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer3, 54), null, false, null, null, null, null, null, null, null, composer, 384, 0, 4088);
                composer3 = composer;
                mutableState9 = mutableState2;
            }
            composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            AddVaccineDialog$lambda$30 = HealthScreenKt.AddVaccineDialog$lambda$30(mutableState7);
            composer.startReplaceGroup(571343253);
            Object rememberedValue5 = composer.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$AddVaccineDialog$3$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$14$lambda$13$lambda$12;
                        invoke$lambda$14$lambda$13$lambda$12 = HealthScreenKt$AddVaccineDialog$3.invoke$lambda$14$lambda$13$lambda$12(MutableState.this, (String) obj);
                        return invoke$lambda$14$lambda$13$lambda$12;
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            composer.endReplaceGroup();
            OutlinedTextFieldKt.OutlinedTextField(AddVaccineDialog$lambda$30, (Function1<? super String, Unit>) rememberedValue5, (Modifier) null, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$HealthScreenKt.INSTANCE.m6728getLambda12$app_release(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer, 1572912, 0, 0, 8388540);
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
    public static final Unit invoke$lambda$14$lambda$1$lambda$0(MutableState mutableState, Long l) {
        mutableState.setValue(l);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$5$lambda$4$lambda$3$lambda$2(String str, MutableState mutableState) {
        mutableState.setValue(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$11$lambda$7$lambda$6(MutableState mutableState) {
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$11$lambda$10$lambda$9$lambda$8(int i, MutableState mutableState) {
        mutableState.setValue(Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$13$lambda$12(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }
}
