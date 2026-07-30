package com.chicken.road.cerman.fixs.ui.screens;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import com.chicken.road.cerman.fixs.data.Chicken;
import com.chicken.road.cerman.fixs.ui.ChickenPickerKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EggSalesScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class EggSalesScreenKt$AddEggDialog$3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ List<Chicken> $chickens;
    final /* synthetic */ MutableState<String> $count$delegate;
    final /* synthetic */ MutableState<Long> $pickedId$delegate;

    EggSalesScreenKt$AddEggDialog$3(List<Chicken> list, MutableState<Long> mutableState, MutableState<String> mutableState2) {
        this.$chickens = list;
        this.$pickedId$delegate = mutableState;
        this.$count$delegate = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        Long AddEggDialog$lambda$25;
        String AddEggDialog$lambda$22;
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(601007772, i, -1, "com.chicken.road.cerman.fixs.ui.screens.AddEggDialog.<anonymous> (EggSalesScreen.kt:169)");
            }
            Arrangement.HorizontalOrVertical m561spacedBy0680j_4 = Arrangement.INSTANCE.m561spacedBy0680j_4(Dp.m6299constructorimpl(10));
            List<Chicken> list = this.$chickens;
            final MutableState<Long> mutableState = this.$pickedId$delegate;
            final MutableState<String> mutableState2 = this.$count$delegate;
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
            AddEggDialog$lambda$25 = EggSalesScreenKt.AddEggDialog$lambda$25(mutableState);
            composer.startReplaceGroup(607328200);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.EggSalesScreenKt$AddEggDialog$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$5$lambda$1$lambda$0;
                        invoke$lambda$5$lambda$1$lambda$0 = EggSalesScreenKt$AddEggDialog$3.invoke$lambda$5$lambda$1$lambda$0(MutableState.this, (Long) obj);
                        return invoke$lambda$5$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            ChickenPickerKt.ChickenPicker(list, AddEggDialog$lambda$25, (Function1) rememberedValue, false, null, composer, 384, 24);
            AddEggDialog$lambda$22 = EggSalesScreenKt.AddEggDialog$lambda$22(mutableState2);
            composer.startReplaceGroup(607330915);
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.EggSalesScreenKt$AddEggDialog$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$5$lambda$4$lambda$3;
                        invoke$lambda$5$lambda$4$lambda$3 = EggSalesScreenKt$AddEggDialog$3.invoke$lambda$5$lambda$4$lambda$3(MutableState.this, (String) obj);
                        return invoke$lambda$5$lambda$4$lambda$3;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceGroup();
            OutlinedTextFieldKt.OutlinedTextField(AddEggDialog$lambda$22, (Function1<? super String, Unit>) rememberedValue2, (Modifier) null, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$EggSalesScreenKt.INSTANCE.m6707getLambda9$app_release(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer, 1572912, 12582912, 0, 8257468);
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
    public static final Unit invoke$lambda$5$lambda$1$lambda$0(MutableState mutableState, Long l) {
        mutableState.setValue(l);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4$lambda$3(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String str = it;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        mutableState.setValue(sb2);
        return Unit.INSTANCE;
    }
}
