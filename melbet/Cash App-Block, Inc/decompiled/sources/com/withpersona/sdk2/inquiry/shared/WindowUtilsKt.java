package com.withpersona.sdk2.inquiry.shared;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda34;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.memory.MemoryCacheService;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.genericelements.viewmodels.GenericComponentViewModel;
import com.squareup.cash.genericelements.viewmodels.GenericContainerViewModel;
import com.squareup.cash.money.booklet.MoneyTabBookletKt$$ExternalSyntheticLambda4;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.util.Strings;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes4.dex */
public abstract class WindowUtilsKt {
    public static final void CardContainerWidget(GenericContainerViewModel.CardContainerViewModel cardContainerViewModel, Modifier modifier, boolean z, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function12;
        Modifier modifier2;
        boolean z2;
        cardContainerViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1367348385);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(cardContainerViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        int i4 = i3;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            Pair pair = cardContainerViewModel.margins;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, ((GenericContainerViewModel.ContainerMargin) pair.first).value, RecyclerView.DECELERATION_RATE, ((GenericContainerViewModel.ContainerMargin) pair.second).value, RecyclerView.DECELERATION_RATE, 10);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            if (z) {
                gapComposer.startReplaceGroup(806725610);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j = colors.semantic.border.subtle;
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                Object obj = DefaultSizes.border.entries;
                Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxWidth(ImageKt.m178borderxT4_qwU(companion, 1.0f, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), 1.0f), 24.0f);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                gapComposer.startReplaceGroup(-1935438013);
                Iterator it = cardContainerViewModel.components.iterator();
                while (it.hasNext()) {
                    ContextUtilsKt.GenericComponentWidget((GenericComponentViewModel) it.next(), null, true, function1, gapComposer, (i4 & 7168) | MLKEMEngine.KyberPolyBytes);
                }
                function12 = function1;
                z2 = true;
                Boxes$$ExternalSyntheticOutline1.m(gapComposer, false, true, false);
                modifier2 = companion;
            } else {
                function12 = function1;
                z2 = true;
                gapComposer.startReplaceGroup(807198019);
                modifier2 = companion;
                KeypadKt.m3641CardIkByU14(null, null, 0L, false, null, null, null, Expect_jvmKt.rememberComposableLambda(393301627, new MoneyTabBookletKt$$ExternalSyntheticLambda4(6, (Object) cardContainerViewModel, function12), gapComposer), gapComposer, 100663296, 255);
                gapComposer.end(false);
            }
            gapComposer.end(z2);
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda34(cardContainerViewModel, modifier2, z, function12, i, 18);
        }
    }

    public static boolean isEditable(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static final void updateUiColor(Window window, int i) {
        int rgb = Color.rgb(Color.red(i), Color.green(i), Color.blue(i));
        double calculateContrast = ColorUtils.calculateContrast(-1, rgb);
        double calculateContrast2 = ColorUtils.calculateContrast(-16777216, rgb);
        View decorView = window.getDecorView();
        decorView.getClass();
        MemoryCacheService memoryCacheService = new MemoryCacheService(decorView);
        int i2 = Build.VERSION.SDK_INT;
        Strings impl35 = i2 >= 35 ? new WindowInsetsControllerCompat.Impl35(window, memoryCacheService) : i2 >= 30 ? new WindowInsetsControllerCompat.Impl30(window, memoryCacheService) : new WindowInsetsControllerCompat.Impl26(window, memoryCacheService);
        impl35.setAppearanceLightStatusBars(calculateContrast < calculateContrast2);
        impl35.setAppearanceLightNavigationBars(calculateContrast < calculateContrast2);
    }
}
