package com.squareup.cash.work.views.timecard;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.tooling.PreviewActivity$$ExternalSyntheticLambda1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.work.viewmodels.TimecardDetailViewModel;
import com.squareup.cash.work.views.pay.PastPaySectionKt$$ExternalSyntheticLambda1;
import com.squareup.kotterknife.KotterKnifeKt$$ExternalSyntheticLambda0;
import com.squareup.kotterknife.KotterKnifeKt$$ExternalSyntheticLambda1;
import com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda4;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import radiography.Radiography$$ExternalSyntheticLambda1;

/* loaded from: classes7.dex */
public abstract class TimecardDetailViewKt {
    public static final ComposableLambdaImpl lambda$707552036 = new ComposableLambdaImpl(new KotterKnifeKt$$ExternalSyntheticLambda0(1), false, 707552036);
    public static final ComposableLambdaImpl lambda$943721859 = new ComposableLambdaImpl(new KotterKnifeKt$$ExternalSyntheticLambda0(2), false, 943721859);
    public static final ComposableLambdaImpl lambda$797371149 = new ComposableLambdaImpl(new KotterKnifeKt$$ExternalSyntheticLambda0(3), false, 797371149);
    public static final ComposableLambdaImpl lambda$123304364 = new ComposableLambdaImpl(new KotterKnifeKt$$ExternalSyntheticLambda0(4), false, 123304364);
    public static final ComposableLambdaImpl lambda$491736620 = new ComposableLambdaImpl(new KotterKnifeKt$$ExternalSyntheticLambda0(5), false, 491736620);

    /* renamed from: lambda$-182330165, reason: not valid java name */
    public static final ComposableLambdaImpl f790lambda$182330165 = new ComposableLambdaImpl(new KotterKnifeKt$$ExternalSyntheticLambda0(6), false, -182330165);
    public static final ComposableLambdaImpl lambda$186102091 = new ComposableLambdaImpl(new KotterKnifeKt$$ExternalSyntheticLambda0(7), false, 186102091);

    /* renamed from: lambda$-487964694, reason: not valid java name */
    public static final ComposableLambdaImpl f791lambda$487964694 = new ComposableLambdaImpl(new KotterKnifeKt$$ExternalSyntheticLambda0(8), false, -487964694);

    /* renamed from: lambda$-119532438, reason: not valid java name */
    public static final ComposableLambdaImpl f789lambda$119532438 = new ComposableLambdaImpl(new KotterKnifeKt$$ExternalSyntheticLambda0(9), false, -119532438);

    /* renamed from: lambda$-793599223, reason: not valid java name */
    public static final ComposableLambdaImpl f792lambda$793599223 = new ComposableLambdaImpl(new KotterKnifeKt$$ExternalSyntheticLambda0(10), false, -793599223);

    public static final void DetailsSection(TimecardDetailViewModel.Details details, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1264143736);
        int i2 = i | (gapComposer.changedInstance(details) ? 4 : 2);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(lambda$707552036, lambda$943721859, null, null, false, false, Expect_jvmKt.rememberComposableLambda(-1934226499, new KotterKnifeKt$$ExternalSyntheticLambda0(details, 12), gapComposer), null, null, 0L, gapComposer, 12582966, 3964);
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(lambda$797371149, lambda$123304364, null, null, false, false, Expect_jvmKt.rememberComposableLambda(373870950, new KotterKnifeKt$$ExternalSyntheticLambda0(details, 13), gapComposer), null, null, 0L, gapComposer, 12582966, 3964);
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(lambda$491736620, f790lambda$182330165, null, null, false, false, Expect_jvmKt.rememberComposableLambda(68236421, new KotterKnifeKt$$ExternalSyntheticLambda0(details, 14), gapComposer), null, null, 0L, gapComposer, 12582966, 3964);
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(lambda$186102091, f791lambda$487964694, null, null, false, false, Expect_jvmKt.rememberComposableLambda(-237398108, new KotterKnifeKt$$ExternalSyntheticLambda0(details, 15), gapComposer), null, null, 0L, gapComposer, 12582966, 3964);
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(f789lambda$119532438, f792lambda$793599223, null, null, false, false, Expect_jvmKt.rememberComposableLambda(-543032637, new KotterKnifeKt$$ExternalSyntheticLambda0(details, 16), gapComposer), null, null, 0L, gapComposer, 12582966, 3964);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FieldBinding$$ExternalSyntheticLambda4(details, i, 29);
        }
    }

    public static final void SummaryRow(String str, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        ComposableLambdaImpl composableLambdaImpl2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(598048371);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.Top, gapComposer, 6);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 14, 0, 4082, colors.semantic.text.standard, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            composableLambdaImpl2 = composableLambdaImpl;
            Recorder$$ExternalSyntheticOutline2.m(6, composableLambdaImpl2, gapComposer, true);
        } else {
            composableLambdaImpl2 = composableLambdaImpl;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TimecardDetailViewKt$$ExternalSyntheticLambda12(str, composableLambdaImpl2, i, 0);
        }
    }

    public static final void SummaryTable(TimecardDetailViewModel.SummaryTable summaryTable, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1222749769);
        int i2 = (gapComposer.changedInstance(summaryTable) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(32.0f, m300paddingVpY3zN4$default, colors.semantic.background.subtle, 24.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(17.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            SummaryRow(Room.stringResource(gapComposer, R.string.work_views_timecard_detail_scheduled_shift), Expect_jvmKt.rememberComposableLambda(1510424719, new KotterKnifeKt$$ExternalSyntheticLambda0(summaryTable, 11), gapComposer), gapComposer, 48);
            SummaryRow(Room.stringResource(gapComposer, R.string.work_views_timecard_detail_regular_hours), "7 hours 30 min", gapComposer, 0);
            SummaryRow(Room.stringResource(gapComposer, R.string.work_views_timecard_detail_overtime_hours), "0 min", gapComposer, 0);
            SummaryRow(Room.stringResource(gapComposer, R.string.work_views_timecard_detail_unpaid_breaks), "30 min", gapComposer, 0);
            SummaryRow(Room.stringResource(gapComposer, R.string.work_views_timecard_detail_paid_breaks), "0 min", gapComposer, 0);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FieldBinding$$ExternalSyntheticLambda4(summaryTable, i, 28);
        }
    }

    public static final void TimecardDetailView(TimecardDetailViewModel timecardDetailViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        timecardDetailViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-511252359);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(timecardDetailViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1098128178, new Radiography$$ExternalSyntheticLambda1(12, function1, timecardDetailViewModel), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new KotterKnifeKt$$ExternalSyntheticLambda1(timecardDetailViewModel, function1, i, 15);
        }
    }

    public static final void SummaryRow(String str, String str2, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1864684221);
        int i2 = (gapComposer.changed(str) ? 4 : 2) | i | (gapComposer.changed(str2) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            SummaryRow(str, Expect_jvmKt.rememberComposableLambda(1228935201, new PastPaySectionKt$$ExternalSyntheticLambda1(str2, 11), gapComposer), gapComposer, (i2 & 14) | 48);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PreviewActivity$$ExternalSyntheticLambda1(str, i, 6, str2);
        }
    }
}
