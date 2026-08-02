package com.squareup.cash.work.views.you;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.local.presenters.cart.LineSelectionInformationRenderer$ModifierInformation;
import app.cash.local.presenters.cart.LineSelectionInformationRenderer$TextModifierInformation;
import app.cash.local.presenters.internal.LocalsKt;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.primitives.math.LocalMoneysKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.work.viewmodels.WorkYouViewModel;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.slf4j.Marker;
import radiography.Radiography$$ExternalSyntheticLambda1;

/* loaded from: classes7.dex */
public abstract class WorkYouViewKt {
    public static final void InfoRow(int i, Composer composer, Modifier modifier, String str, String str2) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-295696290);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(str2) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
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
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 14, 0, 4082, Strings.getColors(gapComposer).semantic.text.prominent, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 16.0f));
            Room.m1165Text25TpFw(2, 0, 0, 6, ((i2 >> 3) & 14) | 196608, 0, 3792, Strings.getColors(gapComposer).semantic.text.prominent, (Composer) gapComposer, (Modifier) new LayoutWeightElement(1.0f, true), Strings.getTypography(gapComposer).labelSmall, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new WorkYouViewKt$$ExternalSyntheticLambda2(str, str2, modifier2, i, 0);
        }
    }

    public static final void WorkYouView(WorkYouViewModel workYouViewModel, Modifier modifier, Composer composer, int i) {
        WorkYouViewModel workYouViewModel2;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2108729255);
        int i2 = i | (gapComposer.changedInstance(workYouViewModel) ? 4 : 2) | 48;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Room.m1165Text25TpFw(0, 0, 0, 0, 6, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).header, (TextLineBalancing) null, "You", (Map) null, (Function1) null, false);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            workYouViewModel2 = workYouViewModel;
            YouInfoCard(workYouViewModel2, gapComposer, i2 & 14);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            workYouViewModel2 = workYouViewModel;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Radiography$$ExternalSyntheticLambda1(workYouViewModel2, modifier2, i, 13);
        }
    }

    public static final void YouInfoCard(WorkYouViewModel workYouViewModel, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-160159220);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(workYouViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier clip = ClipKt.clip(fillMaxWidth, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(40.0f));
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(clip, colors.semantic.background.subtle, ColorKt.RectangleShape), 24.0f);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
            InfoRow(0, gapComposer, null, Room.stringResource(gapComposer, R.string.work_views_you_square_pos_passcode_label), workYouViewModel.squarePosPasscode);
            InfoRow(0, gapComposer, null, Room.stringResource(gapComposer, R.string.work_views_job_label), CollectionsKt.joinToString$default(workYouViewModel.jobs, ", ", null, null, 0, null, null, 62));
            InfoRow(0, gapComposer, null, Room.stringResource(gapComposer, R.string.work_views_location_label), CollectionsKt.joinToString$default(workYouViewModel.locations, ", ", null, null, 0, null, null, 62));
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new WorkYouViewKt$$ExternalSyntheticLambda1(workYouViewModel, i, i3);
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewCashOfferInAppBrowser.deepLinkSpecs;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String renderSelectionInformation(String str, ArrayList arrayList, ArrayList arrayList2) {
        String str2;
        List list;
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        if (str != null && str.length() != 0) {
            createListBuilder.add(str);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LineSelectionInformationRenderer$ModifierInformation lineSelectionInformationRenderer$ModifierInformation = (LineSelectionInformationRenderer$ModifierInformation) it.next();
            StringBuilder sb = new StringBuilder();
            sb.append(lineSelectionInformationRenderer$ModifierInformation.name);
            Integer num = lineSelectionInformationRenderer$ModifierInformation.quantity;
            if (num == null || num.intValue() <= 1) {
                num = null;
            }
            LocalMoney localMoney = lineSelectionInformationRenderer$ModifierInformation.price;
            if (localMoney != null) {
                LocalMoney times = LocalMoneysKt.times(localMoney, num != null ? num.intValue() : 1);
                if (times.amount <= 0) {
                    times = null;
                }
                if (times != null) {
                    str2 = LocalsKt.prettyPrint$default(times, false, Marker.ANY_NON_NULL_MARKER, 5);
                    List filterNotNull = ArraysKt___ArraysKt.filterNotNull(new String[]{num == null ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m(num.intValue(), "×") : null, str2});
                    list = filterNotNull.isEmpty() ? filterNotNull : null;
                    if (list == null) {
                        sb.append(" ".concat(CollectionsKt.joinToString$default(list, ", ", "(", ")", 0, null, null, 56)));
                    }
                    createListBuilder.add(sb.toString());
                }
            }
            str2 = null;
            List filterNotNull2 = ArraysKt___ArraysKt.filterNotNull(new String[]{num == null ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m(num.intValue(), "×") : null, str2});
            if (filterNotNull2.isEmpty()) {
            }
            if (list == null) {
            }
            createListBuilder.add(sb.toString());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((LineSelectionInformationRenderer$TextModifierInformation) obj).input.length() > 0) {
                arrayList3.add(obj);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            LineSelectionInformationRenderer$TextModifierInformation lineSelectionInformationRenderer$TextModifierInformation = (LineSelectionInformationRenderer$TextModifierInformation) it2.next();
            createListBuilder.add(lineSelectionInformationRenderer$TextModifierInformation.name + ": " + lineSelectionInformationRenderer$TextModifierInformation.input);
        }
        String joinToString$default = CollectionsKt.joinToString$default(CollectionsKt__CollectionsJVMKt.build(createListBuilder), ", ", null, null, 0, null, null, 62);
        if (joinToString$default.length() > 0) {
            return joinToString$default;
        }
        return null;
    }
}
