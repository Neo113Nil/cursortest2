package com.stripe.android.financialconnections.features.common;

import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.style.TextAlign;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.stripe.android.financialconnections.model.Cta;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.model.OauthPrepane;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivityKt;
import com.stripe.android.uicore.image.DefaultStripeImageLoader;
import com.stripe.android.uicore.image.StripeImageKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* loaded from: classes8.dex */
public final /* synthetic */ class SharedPartnerAuthKt$$ExternalSyntheticLambda6 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ OauthPrepane f$0;

    public /* synthetic */ SharedPartnerAuthKt$$ExternalSyntheticLambda6(OauthPrepane oauthPrepane, int i) {
        this.$r8$classId = i;
        this.f$0 = oauthPrepane;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        OauthPrepane oauthPrepane = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    ListItemKt.PrepaneHeader(oauthPrepane, SpacerKt.m300paddingVpY3zN4$default(companion, 24.0f, RecyclerView.DECELERATION_RATE, 2), gapComposer, 48);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Cta cta = oauthPrepane.cta;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer2, 48);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer2.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m574initimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    TextKt.m509Text4IGK_g(cta.text, null, 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, null, gapComposer2, 0, 0, 130558);
                    Image image = cta.icon;
                    String str = image != null ? image.f809default : null;
                    if (str == null) {
                        gapComposer2.startReplaceGroup(-1416888561);
                    } else {
                        gapComposer2.startReplaceGroup(-1416888560);
                        SpacerKt.Spacer(gapComposer2, SizeKt.m285size3ABfNKs(companion, 12.0f));
                        StripeImageKt.StripeImage(str, (DefaultStripeImageLoader) gapComposer2.consume(FinancialConnectionsSheetNativeActivityKt.LocalImageLoader), null, SizeKt.m285size3ABfNKs(companion, 16.0f), null, null, null, null, ListItemKt.f799lambda$1709284826, null, gapComposer2, 805309824, 0, 1520);
                    }
                    gapComposer2.end(false);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
