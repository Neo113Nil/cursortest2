package com.stripe.android.financialconnections.features.common;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.payments.views.ToViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.profile.devicemanager.views.DeviceManagerListViewKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsColors;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* loaded from: classes7.dex */
public final /* synthetic */ class ListItemKt$$ExternalSyntheticLambda2 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Modifier f$0;

    public /* synthetic */ ListItemKt$$ExternalSyntheticLambda2(Modifier modifier, int i) {
        this.$r8$classId = i;
        this.f$0 = modifier;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        int i2 = 4;
        Modifier modifier = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((BoxWithConstraintsScopeImpl) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    ListItemKt.LoadingShimmerEffect(Expect_jvmKt.rememberComposableLambda(-1295716665, new ListItemKt$$ExternalSyntheticLambda2(modifier, i2), gapComposer), gapComposer, 6);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Function0 function0 = (Function0) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                function0.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changedInstance(function0) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    boolean z = (intValue2 & 14) == 4;
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (z || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new ToViewKt$$ExternalSyntheticLambda2(21, function0);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    DeviceManagerListViewKt.DeviceMapError(0, gapComposer2, modifier, (Function0) rememberedValue);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((BoxWithConstraintsScopeImpl) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(1 & intValue3, (intValue3 & 17) != 16)) {
                    ListItemKt.InstitutionPlaceholder(modifier, gapComposer3, 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((BoxWithConstraintsScopeImpl) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(1 & intValue4, (intValue4 & 17) != 16)) {
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(modifier, ((FinancialConnectionsColors) gapComposer4.consume(ThemeKt.LocalColors)).backgroundSecondary, ColorKt.RectangleShape), gapComposer4, 0);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Brush brush = (Brush) obj;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                brush.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((GapComposer) composer5).changed(brush) ? 4 : 2;
                }
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 19) != 18)) {
                    SpacerKt.Spacer(gapComposer5, ImageKt.background$default(ClipKt.clip(modifier, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f)), brush, null, 6));
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Brush brush2 = (Brush) obj;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                brush2.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((GapComposer) composer6).changed(brush2) ? 4 : 2;
                }
                GapComposer gapComposer6 = (GapComposer) composer6;
                boolean shouldExecute = gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 19) != 18);
                Applier applier = gapComposer6.applier;
                if (shouldExecute) {
                    BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
                    Modifier fillMaxSize = SizeKt.fillMaxSize(modifier, 1.0f);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical, gapComposer6, 48);
                    int hashCode = Long.hashCode(gapComposer6.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer6.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer6, fillMaxSize);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer6.startReusableNode();
                    if (gapComposer6.inserting) {
                        gapComposer6.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer6.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer6, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer6, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m574initimpl(gapComposer6, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer6, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer6, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    BoxKt.Box(ImageKt.background$default(ClipKt.clip(SizeKt.m285size3ABfNKs(companion, 56.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(6.0f)), brush2, null, 6), gapComposer6, 0);
                    SpacerKt.Spacer(gapComposer6, SizeKt.m285size3ABfNKs(companion, 8.0f));
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer6, 0);
                    int hashCode2 = Long.hashCode(gapComposer6.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer6.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer6, companion);
                    gapComposer6.startReusableNode();
                    if (gapComposer6.inserting) {
                        gapComposer6.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer6.useNode();
                    }
                    Updater.m576setimpl(gapComposer6, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer6, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    SVG$Unit$EnumUnboxingLocalUtility.m(hashCode2, gapComposer6, composeUiNode$Companion$SetModifier$13, gapComposer6, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer6, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    BoxKt.Box(ImageKt.background$default(ClipKt.clip(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 0.75f), 16.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(6.0f)), brush2, null, 6), gapComposer6, 0);
                    SpacerKt.Spacer(gapComposer6, SizeKt.m285size3ABfNKs(companion, 8.0f));
                    BoxKt.Box(ImageKt.background$default(ClipKt.clip(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 0.5f), 16.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(6.0f)), brush2, null, 6), gapComposer6, 0);
                    gapComposer6.end(true);
                    gapComposer6.end(true);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
