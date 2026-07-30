package com.aviatorvaangu.aviapp46.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.CanvasKt;
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
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PromoCard.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"PromoCard", "", "modifier", "Landroidx/compose/ui/Modifier;", "onCtaClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "app"}, k = 2, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final class PromoCardKt {
    static final Unit PromoCard$lambda$9(Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        PromoCard(modifier, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PromoCard(Modifier modifier, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Function0<Unit> function02;
        final Function0<Unit> function03;
        ScopeUpdateScope endRestartGroup;
        Function0<Unit> function04;
        Composer startRestartGroup = composer.startRestartGroup(82677223);
        ComposerKt.sourceInformation(startRestartGroup, "C(PromoCard)N(modifier,onCtaClick)36@1586L2,40@1719L37,41@1791L38,42@1836L2513,37@1596L2753:PromoCard.kt#xqf9wq");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function02 = function0;
            i3 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                function03 = function02;
            } else {
                Modifier.Companion companion = i4 != 0 ? Modifier.INSTANCE : modifier2;
                if (i5 != 0) {
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2143402601, "CC(remember):PromoCard.kt#9igjgp");
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: com.aviatorvaangu.aviapp46.components.PromoCardKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit unit;
                                unit = Unit.INSTANCE;
                                return unit;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    function04 = (Function0) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                } else {
                    function04 = function02;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(82677223, i3, -1, "com.aviatorvaangu.aviapp46.components.PromoCard (PromoCard.kt:36)");
                }
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                RoundedCornerShape m1128RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1128RoundedCornerShape0680j_4(Dp.m7522constructorimpl(18.0f));
                Modifier modifier3 = companion;
                function03 = function04;
                CardColors m1785cardColorsro_MJ88 = CardDefaults.INSTANCE.m1785cardColorsro_MJ88(AppColorsKt.getPanelRed(), 0L, 0L, 0L, startRestartGroup, (CardDefaults.$stable << 12) | 6, 14);
                CardElevation m1786cardElevationaqJV_2Y = CardDefaults.INSTANCE.m1786cardElevationaqJV_2Y(Dp.m7522constructorimpl(0.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, (CardDefaults.$stable << 18) | 6, 62);
                startRestartGroup = startRestartGroup;
                CardKt.Card(fillMaxWidth$default, m1128RoundedCornerShape0680j_4, m1785cardColorsro_MJ88, m1786cardElevationaqJV_2Y, null, ComposableLambdaKt.rememberComposableLambda(1951944537, true, new Function3() { // from class: com.aviatorvaangu.aviapp46.components.PromoCardKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return PromoCardKt.PromoCard$lambda$8(Function0.this, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: com.aviatorvaangu.aviapp46.components.PromoCardKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PromoCardKt.PromoCard$lambda$9(Modifier.this, function03, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        function02 = function0;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    static final Unit PromoCard$lambda$8(Function0 function0, ColumnScope Card, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation(composer, "C43@1846L2497:PromoCard.kt#xqf9wq");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1951944537, i, -1, "com.aviatorvaangu.aviapp46.components.PromoCard.<anonymous> (PromoCard.kt:43)");
            }
            Modifier m820padding3ABfNKs = PaddingKt.m820padding3ABfNKs(BorderKt.m277borderxT4_qwU(BackgroundKt.background$default(Modifier.INSTANCE, Brush.Companion.m4688linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m4729boximpl(ColorKt.Color(4280944391L)), Color.m4729boximpl(ColorKt.Color(4279437577L))}), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null), Dp.m7522constructorimpl(1.0f), Color.m4738copywmQWz5c$default(ColorKt.Color(4294916923L), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1128RoundedCornerShape0680j_4(Dp.m7522constructorimpl(18.0f))), Dp.m7522constructorimpl(12.0f));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
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
            Updater.m4017setimpl(m4009constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4017setimpl(m4009constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4013initimpl(m4009constructorimpl, Integer.valueOf(hashCode), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4015reconcileimpl(m4009constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4017setimpl(m4009constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 729911752, "C50@2191L956,71@3160L29,72@3202L716,83@4017L66,81@3931L402:PromoCard.kt#xqf9wq");
            Modifier background$default = BackgroundKt.background$default(ClipKt.clip(SizeKt.m866size3ABfNKs(Modifier.INSTANCE, Dp.m7522constructorimpl(72.0f)), RoundedCornerShapeKt.m1128RoundedCornerShape0680j_4(Dp.m7522constructorimpl(16.0f))), Brush.Companion.m4690radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m4729boximpl(ColorKt.Color(4294959267L)), Color.m4729boximpl(ColorKt.Color(4294914096L)), Color.m4729boximpl(AppColorsKt.getDeepBlue())}), 0L, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, background$default);
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
            Updater.m4017setimpl(m4009constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4017setimpl(m4009constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4013initimpl(m4009constructorimpl2, Integer.valueOf(hashCode2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4015reconcileimpl(m4009constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4017setimpl(m4009constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1133906892, "C57@2544L143,57@2513L174,60@2704L429:PromoCard.kt#xqf9wq");
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(composer, 794706866, "CC(remember):PromoCard.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: com.aviatorvaangu.aviapp46.components.PromoCardKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PromoCardKt.PromoCard$lambda$8$lambda$7$lambda$5$lambda$3$lambda$2((DrawScope) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            CanvasKt.Canvas(fillMaxSize$default, (Function1) rememberedValue, composer, 54);
            Modifier m266backgroundbw27NRU$default = BackgroundKt.m266backgroundbw27NRU$default(ClipKt.clip(SizeKt.m866size3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd()), Dp.m7522constructorimpl(20.0f)), RoundedCornerShapeKt.getCircleShape()), ColorKt.Color(4294955366L), null, 2, null);
            Alignment center2 = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, m266backgroundbw27NRU$default);
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
            Updater.m4017setimpl(m4009constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4017setimpl(m4009constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4013initimpl(m4009constructorimpl3, Integer.valueOf(hashCode3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4015reconcileimpl(m4009constructorimpl3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4017setimpl(m4009constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -85706587, "C68@3030L85:PromoCard.kt#xqf9wq");
            TextKt.m2714TextNvy7gAk("!", null, ColorKt.Color(4284153856L), null, TextUnitKt.getSp(13), null, FontWeight.INSTANCE.getBlack(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1597830, 0, 262058);
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
            SpacerKt.Spacer(SizeKt.m871width3ABfNKs(Modifier.INSTANCE, Dp.m7522constructorimpl(12.0f)), composer, 6);
            Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer, weight$default);
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            Composer m4009constructorimpl4 = Updater.m4009constructorimpl(composer);
            Updater.m4017setimpl(m4009constructorimpl4, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4017setimpl(m4009constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4013initimpl(m4009constructorimpl4, Integer.valueOf(hashCode4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4015reconcileimpl(m4009constructorimpl4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4017setimpl(m4009constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 967115979, "C73@3259L106,74@3382L29,75@3428L130,76@3575L29,77@3621L105,78@3743L29,79@3789L115:PromoCard.kt#xqf9wq");
            TextKt.m2714TextNvy7gAk("SPONSORED", null, ColorKt.Color(4294955366L), null, TextUnitKt.getSp(9), null, FontWeight.INSTANCE.getBlack(), null, 0L, null, null, 0L, 0, false, 1, 0, null, null, composer, 1597830, 24576, 245674);
            SpacerKt.Spacer(SizeKt.m852height3ABfNKs(Modifier.INSTANCE, Dp.m7522constructorimpl(3.0f)), composer, 6);
            TextKt.m2714TextNvy7gAk("Win Jackpot?", null, AppColorsKt.getInk(), null, TextUnitKt.getSp(18), null, FontWeight.INSTANCE.getBlack(), null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7458getEllipsisgIe3tQ8(), false, 1, 0, null, null, composer, 1597830, 24960, 241578);
            SpacerKt.Spacer(SizeKt.m852height3ABfNKs(Modifier.INSTANCE, Dp.m7522constructorimpl(2.0f)), composer, 6);
            TextKt.m2714TextNvy7gAk("Learn odds, timing, and limits before you play.", null, AppColorsKt.getSoftGrey(), null, TextUnitKt.getSp(12), null, null, null, 0L, null, null, 0L, 0, false, 2, 0, null, null, composer, 24966, 24576, 245738);
            SpacerKt.Spacer(SizeKt.m852height3ABfNKs(Modifier.INSTANCE, Dp.m7522constructorimpl(5.0f)), composer, 6);
            TextKt.m2714TextNvy7gAk("No guaranteed wins", null, ColorKt.Color(4294955366L), null, TextUnitKt.getSp(10), null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 1, 0, null, null, composer, 1597830, 24576, 245674);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.Button(function0, null, false, RoundedCornerShapeKt.m1128RoundedCornerShape0680j_4(Dp.m7522constructorimpl(14.0f)), ButtonDefaults.INSTANCE.m1765buttonColorsro_MJ88(AppColorsKt.getSkyBlue(), Color.INSTANCE.m4776getWhite0d7_KjU(), 0L, 0L, composer, (ButtonDefaults.$stable << 12) | 54, 12), null, null, PaddingKt.m814PaddingValuesYgX7TsA(Dp.m7522constructorimpl(14.0f), Dp.m7522constructorimpl(10.0f)), null, ComposableSingletons$PromoCardKt.INSTANCE.m7956getLambda$1341740371$app(), composer, 817889280, 358);
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

    static final Unit PromoCard$lambda$8$lambda$7$lambda$5$lambda$3$lambda$2(DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float intBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo5313getSizeNHjbRc() >> 32)) * 0.52f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo5313getSizeNHjbRc() & 4294967295L)) * 0.52f;
        AviationArtworkKt.m7954drawPlaneicVWoeI(Canvas, Offset.m4486constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L)), 0.56f, Color.INSTANCE.m4776getWhite0d7_KjU());
        return Unit.INSTANCE;
    }
}
