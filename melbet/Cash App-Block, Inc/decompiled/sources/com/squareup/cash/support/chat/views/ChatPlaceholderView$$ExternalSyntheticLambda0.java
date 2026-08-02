package com.squareup.cash.support.chat.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.treehouse.RadioBinding$value$1;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class ChatPlaceholderView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ RadioBinding$value$1 f$0;

    public /* synthetic */ ChatPlaceholderView$$ExternalSyntheticLambda0(RadioBinding$value$1 radioBinding$value$1) {
        this.f$0 = radioBinding$value$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        RadioBinding$value$1 radioBinding$value$1 = this.f$0;
        switch (i) {
            case 0:
                AndroidStringManager androidStringManager = (AndroidStringManager) radioBinding$value$1.this$0;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxSize(companion, 1.0f), 24.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer, 54);
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
                    ImageKt.Image(Countries.painterResource(R.drawable.support_chat_placeholder, 0, gapComposer), null, null, null, null, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | 48, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                    String str = androidStringManager.get(R.string.support_chat_placeholder_title);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
                    Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3832, 0L, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 24.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).titleBarPageTitle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3834, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).bodyMedium, (TextLineBalancing) null, androidStringManager.get(R.string.support_chat_placeholder_subtitle), (Map) null, (Function1) null, false);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                radioBinding$value$1.Content((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ChatPlaceholderView$$ExternalSyntheticLambda0(RadioBinding$value$1 radioBinding$value$1, int i) {
        this.f$0 = radioBinding$value$1;
    }
}
