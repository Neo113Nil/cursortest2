package com.squareup.cash.work.views.shift;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.wallet.views.HeroCardNullStateKt$$ExternalSyntheticLambda8;
import com.squareup.cash.work.viewmodels.SellerCardViewModel;
import com.squareup.cash.work.viewmodels.ShiftDetailViewModel;
import com.squareup.cash.work.views.SellerCardKt;
import com.squareup.cash.work.views.SellerCardShape;
import com.squareup.cash.work.views.SellerCardSize;
import com.squareup.cash.work.views.WorkViewFactory$$ExternalSyntheticLambda10;
import com.squareup.cash.work.views.pay.PayHomeViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.work.webview.views.WorkWebViewKt$$ExternalSyntheticLambda14;
import com.squareup.util.Strings;
import com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda4;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.channels.BufferedChannel$$ExternalSyntheticLambda4;
import radiography.Radiography$$ExternalSyntheticLambda1;

/* loaded from: classes7.dex */
public abstract class ShiftDetailViewKt {
    static {
        new SellerCardViewModel("JB", null, null, 510);
    }

    public static final void AssigneeCell(ShiftDetailViewModel.Loaded.Assignee assignee, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-219463277);
        int i2 = (gapComposer.changedInstance(assignee) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(Expect_jvmKt.rememberComposableLambda(-526115275, new ShiftDetailViewKt$$ExternalSyntheticLambda14(assignee, 0, (byte) 0), gapComposer), Expect_jvmKt.rememberComposableLambda(1865391926, new ShiftDetailViewKt$$ExternalSyntheticLambda14(assignee, 1, (byte) 0), gapComposer), null, null, null, false, false, Expect_jvmKt.rememberComposableLambda(-965434052, new ShiftDetailViewKt$$ExternalSyntheticLambda14(assignee, 2, (byte) 0), gapComposer), null, null, 0L, null, gapComposer, 12582966, 0, 3964);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftDetailViewKt$$ExternalSyntheticLambda14(assignee, i);
        }
    }

    public static final void DetailRow(Icons icons, String str, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(90479723);
        int i2 = i | (gapComposer.changed(str) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(fillMaxWidth, 16.0f, 8.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
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
            Trace.m1191Iconww6aTOc(icons, (String) null, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), Strings.getColors(gapComposer).semantic.icon.standard, gapComposer, 438, 0);
            Room.m1165Text25TpFw(0, 0, 0, 0, ((i2 >> 3) & 14) | 48, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, 12.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftDetailViewKt$$ExternalSyntheticLambda19(i, 0, icons, str);
        }
    }

    public static final void DetailsSection(ShiftDetailViewModel.Loaded.Details details, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1890577670);
        int i2 = (gapComposer.changedInstance(details) ? 4 : 2) | i;
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
            String str = details.location;
            if (str == null) {
                gapComposer.startReplaceGroup(-1987066728);
            } else {
                gapComposer.startReplaceGroup(-1987066727);
                DetailRow(Icons.LocationFill16, str, gapComposer, 6);
            }
            gapComposer.end(false);
            String str2 = details.job;
            if (str2 == null) {
                gapComposer.startReplaceGroup(-1986992452);
            } else {
                gapComposer.startReplaceGroup(-1986992451);
                DetailRow(Icons.Business16, str2, gapComposer, 6);
            }
            gapComposer.end(false);
            gapComposer.startReplaceGroup(-1986919168);
            gapComposer.end(false);
            String str3 = details.passcode;
            if (str3 == null) {
                gapComposer.startReplaceGroup(-1986847496);
            } else {
                gapComposer.startReplaceGroup(-1986847495);
                DetailRow(Icons.PasscodeFill16, str3, gapComposer, 6);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FieldBinding$$ExternalSyntheticLambda4(details, i, 24);
        }
    }

    public static final void ErrorShiftDetailView(Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1600149098);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(function1) ? 4 : 2);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(companion, 1.0f), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            NavigationType navigationType = NavigationType.BACK;
            boolean z = (i2 & 14) == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new PayHomeViewKt$$ExternalSyntheticLambda2(28, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub("", navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 54, 108);
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer, 54);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.work_views_something_went_wrong), (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HeroCardNullStateKt$$ExternalSyntheticLambda8(i, 20, function1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    public static final void LoadedShiftDetailView(ShiftDetailViewModel.Loaded loaded, Function1 function1, Composer composer, int i) {
        Function1 function12;
        GapComposer gapComposer;
        Modifier modifier;
        int i2;
        ?? r2;
        ?? r1;
        GapComposer gapComposer2;
        ShiftDetailViewModel.Loaded loaded2 = loaded;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(415029456);
        Applier applier = gapComposer3.applier;
        int i3 = i | (gapComposer3.changedInstance(loaded2) ? 4 : 2) | (gapComposer3.changedInstance(function1) ? 32 : 16);
        if (gapComposer3.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(companion, 1.0f), Strings.getColors(gapComposer3).semantic.background.f1047app, ColorKt.RectangleShape);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer3, 0);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$14);
            NavigationType navigationType = NavigationType.BACK;
            boolean z = (i3 & 112) == 32;
            Object rememberedValue = gapComposer3.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new PayHomeViewKt$$ExternalSyntheticLambda2(27, function1);
                gapComposer3.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub("", navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, Expect_jvmKt.rememberComposableLambda(1250135291, new WorkWebViewKt$$ExternalSyntheticLambda14(17, function1), gapComposer3), gapComposer3, 1572918, 44);
            GapComposer gapComposer4 = gapComposer3;
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SizeKt.fillMaxWidth(companion, 1.0f), true), ImageKt.rememberScrollState(gapComposer4), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer4, 0);
            int hashCode2 = Long.hashCode(gapComposer4.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer4.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer4, verticalScroll$default);
            gapComposer4.startReusableNode();
            if (gapComposer4.inserting) {
                gapComposer4.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer4.useNode();
            }
            Updater.m576setimpl(gapComposer4, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer4, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer4, composeUiNode$Companion$SetModifier$13, gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer4, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            loaded2 = loaded;
            ShiftHeroHeader(loaded2.header, gapComposer4, 0);
            ShiftDetailViewModel.Loaded.Assignee assignee = loaded2.assignee;
            if (assignee != null) {
                gapComposer4.startReplaceGroup(1544072593);
                modifier = null;
                i2 = 1;
                DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer4, null);
                AssigneeCell(assignee, gapComposer4, 0);
                gapComposer4.end(false);
            } else {
                modifier = null;
                i2 = 1;
                gapComposer4.startReplaceGroup(1544146590);
                gapComposer4.end(false);
            }
            DBUtil.SpacerBetweenSectionXLargeBelowCell(0, i2, gapComposer4, modifier);
            ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer4, R.string.work_views_timecard_detail_section_details), (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer4, 0, 30);
            DBUtil.SpacerWithinSectionMedium(0, i2, gapComposer4, modifier);
            DetailsSection(loaded2.details, gapComposer4, 0);
            DBUtil.SpacerBetweenSectionXLargeBelowCell(0, i2, gapComposer4, modifier);
            ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer4, R.string.work_views_shift_detail_notes_section), (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer4, 0, 30);
            DBUtil.SpacerWithinSectionMedium(0, i2, gapComposer4, modifier);
            ShiftDetailViewModel.Loaded.Note note = loaded2.note;
            if (note != null) {
                gapComposer4.startReplaceGroup(1544582078);
                NoteCard(note, gapComposer4, 0);
                gapComposer4.end(false);
                r1 = 0;
                r2 = i2;
                gapComposer2 = gapComposer4;
            } else {
                gapComposer4.startReplaceGroup(1544637661);
                String stringResource = Room.stringResource(gapComposer4, R.string.work_views_shift_detail_no_notes);
                TextStyle textStyle = Strings.getTypography(gapComposer4).bodyMedium;
                long j = Strings.getColors(gapComposer4).semantic.text.subtle;
                Strings.getSizes(gapComposer4).getClass();
                DefaultSizes.spacing.getClass();
                r2 = i2;
                r1 = 0;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j, (Composer) gapComposer4, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                GapComposer gapComposer5 = gapComposer4;
                gapComposer5.end(false);
                modifier = null;
                gapComposer2 = gapComposer5;
            }
            DBUtil.SpacerBetweenSectionXLarge(r1, r2, gapComposer2, modifier);
            gapComposer2.end(r2);
            if (loaded2.showClockInButton) {
                gapComposer2.startReplaceGroup(399565097);
                function12 = function1;
                DimensionKt.ButtonCtaGroup(null, true, null, null, Expect_jvmKt.rememberComposableLambda(-1233101219, new BufferedChannel$$ExternalSyntheticLambda4(6, loaded2, function12, Room.stringResource(gapComposer2, R.string.work_shift_not_started_title)), gapComposer2), gapComposer2, 24624, 13);
                gapComposer2.end(r1);
            } else {
                function12 = function1;
                gapComposer2.startReplaceGroup(400855720);
                gapComposer2.end(r1);
            }
            gapComposer2.end(r2);
            gapComposer = gapComposer2;
        } else {
            function12 = function1;
            gapComposer3.skipToGroupEnd();
            gapComposer = gapComposer3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Radiography$$ExternalSyntheticLambda1(loaded2, function12, i, 5);
        }
    }

    public static final void NoteCard(ShiftDetailViewModel.Loaded.Note note, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1650220923);
        int i2 = (gapComposer.changedInstance(note) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(24.0f, SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, 16.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f), Strings.getColors(gapComposer).semantic.background.subtle, 24.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, note.text, (Map) null, (Function1) null, false);
            gapComposer.startReplaceGroup(26730313);
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FieldBinding$$ExternalSyntheticLambda4(note, i, 25);
        }
    }

    public static final void ShiftDetailView(ShiftDetailViewModel shiftDetailViewModel, Function1 function1, Composer composer, int i) {
        shiftDetailViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1696310647);
        int i2 = (gapComposer.changedInstance(shiftDetailViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-182404788, new WorkViewFactory$$ExternalSyntheticLambda10(shiftDetailViewModel, function1, 1, (byte) 0), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new WorkViewFactory$$ExternalSyntheticLambda10(shiftDetailViewModel, function1, i);
        }
    }

    public static final void ShiftHeroHeader(ShiftDetailViewModel.Loaded.Header header, Composer composer, int i) {
        ShiftDetailViewModel.Loaded.Header header2 = header;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2022430539);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(header2) ? 4 : 2);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).sectionTitle, (TextLineBalancing) null, header2.dayLabel, (Map) null, (Function1) null, false);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).hero, (TextLineBalancing) null, header.shiftTimeText, (Map) null, (Function1) null, false);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            SellerCardKt.SellerCard(header.sellerCardViewModel, null, SellerCardSize.XSmall, SellerCardShape.Circle, gapComposer, 3456, 2);
            Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, header.merchantName, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            gapComposer.end(true);
            header2 = header;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FieldBinding$$ExternalSyntheticLambda4(header2, i, 23);
        }
    }
}
