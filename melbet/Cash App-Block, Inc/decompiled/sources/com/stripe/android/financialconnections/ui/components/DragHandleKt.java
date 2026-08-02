package com.stripe.android.financialconnections.ui.components;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.core.os.BundleKt;
import app.cash.molecule.PlatformKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsColors;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;

/* loaded from: classes8.dex */
public abstract class DragHandleKt {
    public static final long DragHandleSize = BundleKt.m1091DpSizeYgX7TsA(32.0f, 4.0f);
    public static final float DragHandleCornerRadius = 40.0f;

    public static final void DragHandle(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(981530032);
        if (gapComposer.shouldExecute(i & 1, (i & 3) != 2)) {
            BiasAlignment biasAlignment = Alignment.Companion.Center;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.m286size6HolHcs(DragHandleSize, Modifier.Companion.$$INSTANCE), ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).spinnerNeutral, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(DragHandleCornerRadius)), gapComposer, 0);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DragHandleKt$$ExternalSyntheticLambda0(modifier, i, 0);
        }
    }
}
