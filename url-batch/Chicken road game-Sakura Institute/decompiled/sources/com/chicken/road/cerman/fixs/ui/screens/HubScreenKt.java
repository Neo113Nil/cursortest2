package com.chicken.road.cerman.fixs.ui.screens;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavController;
import com.chicken.road.cerman.fixs.BroilerApp;
import com.chicken.road.cerman.fixs.data.Repository;
import com.chicken.road.cerman.fixs.ui.CommonKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HubScreen.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005²\u0006\f\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u008a\u0084\u0002"}, d2 = {"HubScreen", "", "nav", "Landroidx/navigation/NavController;", "(Landroidx/navigation/NavController;Landroidx/compose/runtime/Composer;I)V", "app_release", "summary", "Lcom/chicken/road/cerman/fixs/data/Repository$FarmSummary;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HubScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HubScreen$lambda$2(NavController navController, int i, Composer composer, int i2) {
        HubScreen(navController, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void HubScreen(final NavController nav, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(nav, "nav");
        Composer startRestartGroup = composer.startRestartGroup(-1466479764);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(nav) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1466479764, i2, -1, "com.chicken.road.cerman.fixs.ui.screens.HubScreen (HubScreen.kt:47)");
            }
            startRestartGroup.startReplaceGroup(-1868546753);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = BroilerApp.INSTANCE.getINSTANCE().getRepository();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            CommonKt.FarmScaffold("Broiler Temp House", null, null, null, ComposableLambdaKt.rememberComposableLambda(625879692, true, new HubScreenKt$HubScreen$1(SnapshotStateKt.collectAsState(((Repository) rememberedValue).getFarmSummary(), null, null, startRestartGroup, 48, 2), nav), startRestartGroup, 54), startRestartGroup, 24582, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.chicken.road.cerman.fixs.ui.screens.HubScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HubScreen$lambda$2;
                    HubScreen$lambda$2 = HubScreenKt.HubScreen$lambda$2(NavController.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return HubScreen$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Repository.FarmSummary HubScreen$lambda$1(State<Repository.FarmSummary> state) {
        return state.getValue();
    }
}
