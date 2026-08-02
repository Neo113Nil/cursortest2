package com.squareup.cash.work.views.shift;

import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.local.views.marketingmessages.MarketingMessageKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class ShiftDetailViewKt$$ExternalSyntheticLambda19 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Icons f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ ShiftDetailViewKt$$ExternalSyntheticLambda19(int i, int i2, Icons icons, String str) {
        this.$r8$classId = i2;
        this.f$0 = icons;
        this.f$1 = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        String str = this.f$1;
        Icons icons = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ShiftDetailViewKt.DetailRow(icons, str, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                MarketingMessageKt.InfoItem(icons, str, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 2:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 16.0f);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Trace.m1191Iconww6aTOc(this.f$0, (String) null, m285size3ABfNKs, colors.semantic.icon.standard, gapComposer, 432, 0);
                    SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 12.0f));
                    Room.m1165Text25TpFw(0, 0, 0, 1, 0, 0, 3834, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, this.f$1, (Map) null, (Function1) null, false);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(this.f$0, this.f$1, (Modifier) null, 0L, gapComposer2, 0, 12);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ShiftDetailViewKt$$ExternalSyntheticLambda19(int i, Icons icons, String str) {
        this.$r8$classId = i;
        this.f$0 = icons;
        this.f$1 = str;
    }
}
