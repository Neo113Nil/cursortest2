package com.aviatorvaangu.aviapp46.screens;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.aviatorvaangu.aviapp46.components.AppColorsKt;
import com.aviatorvaangu.aviapp46.components.CardsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StartScreen.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final class ComposableSingletons$StartScreenKt {
    public static final ComposableSingletons$StartScreenKt INSTANCE = new ComposableSingletons$StartScreenKt();

    /* renamed from: lambda$-119945612, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f130lambda$119945612 = ComposableLambdaKt.composableLambdaInstance(-119945612, false, new Function3() { // from class: com.aviatorvaangu.aviapp46.screens.ComposableSingletons$StartScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$StartScreenKt.lambda__119945612$lambda$0((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1862142565, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f131lambda$1862142565 = ComposableLambdaKt.composableLambdaInstance(-1862142565, false, new Function3() { // from class: com.aviatorvaangu.aviapp46.screens.ComposableSingletons$StartScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$StartScreenKt.lambda__1862142565$lambda$2((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: getLambda$-119945612$app, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m7959getLambda$119945612$app() {
        return f130lambda$119945612;
    }

    /* renamed from: getLambda$-1862142565$app, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m7960getLambda$1862142565$app() {
        return f131lambda$1862142565;
    }

    static final Unit lambda__119945612$lambda$0(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation(composer, "C32@1348L82,33@1447L29,34@1493L266:StartScreen.kt#5vyur7");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-119945612, i, -1, "com.aviatorvaangu.aviapp46.screens.ComposableSingletons$StartScreenKt.lambda$-119945612.<anonymous> (StartScreen.kt:32)");
            }
            TextKt.m2714TextNvy7gAk("Aviator Tips", null, AppColorsKt.getInk(), null, TextUnitKt.getSp(29), null, FontWeight.INSTANCE.getBlack(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1597830, 0, 262058);
            SpacerKt.Spacer(SizeKt.m852height3ABfNKs(Modifier.INSTANCE, Dp.m7522constructorimpl(8.0f)), composer, 6);
            TextKt.m2714TextNvy7gAk("A simple guide to Aviator gameplay, multipliers, cash-out timing, risk control, and beginner strategies.", null, AppColorsKt.getSoftGrey(), null, TextUnitKt.getSp(15), null, null, null, 0L, null, null, TextUnitKt.getSp(22), 0, false, 0, 0, null, null, composer, 24966, 48, 260074);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__1862142565$lambda$2(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation(composer, "C46@2024L323:StartScreen.kt#5vyur7");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1862142565, i, -1, "com.aviatorvaangu.aviapp46.screens.ComposableSingletons$StartScreenKt.lambda$-1862142565.<anonymous> (StartScreen.kt:46)");
            }
            Arrangement.HorizontalOrVertical m690spacedBy0680j_4 = Arrangement.INSTANCE.m690spacedBy0680j_4(Dp.m7522constructorimpl(10.0f));
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m690spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
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
            ComposerKt.sourceInformationMarkerStart(composer, -238430162, "C47@2139L48,48@2208L53,49@2282L47:StartScreen.kt#5vyur7");
            CardsKt.MiniActionCard("Share App", RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer, 6, 0);
            CardsKt.MiniActionCard("Privacy Policy", RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer, 6, 0);
            CardsKt.MiniActionCard("Rate App", RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer, 6, 0);
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
