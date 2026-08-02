package com.stripe.android.financialconnections;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.room.util.DBUtil;
import com.datadog.trace.core.util.GlobPattern;
import com.google.android.datatransport.cct.StringMerger;
import com.squareup.util.coroutines.TakeUntil$collectSafely$2;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetFlowType;
import com.stripe.android.financialconnections.ui.theme.Theme;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetStateKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import radiography.Radiography$$ExternalSyntheticLambda1;

/* loaded from: classes8.dex */
public final /* synthetic */ class FinancialConnectionsSheetActivity$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FinancialConnectionsSheetActivity f$0;

    public /* synthetic */ FinancialConnectionsSheetActivity$$ExternalSyntheticLambda3(FinancialConnectionsSheetActivity financialConnectionsSheetActivity, int i) {
        this.$r8$classId = 2;
        this.f$0 = financialConnectionsSheetActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        FinancialConnectionsSheetActivity financialConnectionsSheetActivity = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                int i2 = FinancialConnectionsSheetActivity.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    StripeBottomSheetState rememberStripeBottomSheetState = StripeBottomSheetStateKt.rememberStripeBottomSheetState(gapComposer, 0, 3);
                    MutableState collectAsState = StateFlowsComposeKt.collectAsState(financialConnectionsSheetActivity.getViewModel().stateFlow, gapComposer);
                    GlobPattern globPattern = ((FinancialConnectionsSheetState) collectAsState.getValue()).viewEffect;
                    boolean changed = gapComposer.changed(collectAsState) | gapComposer.changedInstance(financialConnectionsSheetActivity) | gapComposer.changedInstance(rememberStripeBottomSheetState);
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new TakeUntil$collectSafely$2(collectAsState, financialConnectionsSheetActivity, rememberStripeBottomSheetState, (Continuation) null);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Updater.LaunchedEffect(gapComposer, globPattern, (Function2) rememberedValue);
                    boolean changedInstance = gapComposer.changedInstance(financialConnectionsSheetActivity);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new HCaptcha$$ExternalSyntheticLambda0(financialConnectionsSheetActivity, 15);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    DBUtil.BackHandler(false, (Function0) rememberedValue2, gapComposer, 0, 1);
                    ThemeKt.FinancialConnectionsTheme(StringMerger.getFlowType(((FinancialConnectionsSheetState) collectAsState.getValue()).initialArgs) == FinancialConnectionsSheetFlowType.ForInstantDebits ? Theme.LinkLight : Theme.DefaultLight, Expect_jvmKt.rememberComposableLambda(2096424442, new Radiography$$ExternalSyntheticLambda1(14, rememberStripeBottomSheetState, financialConnectionsSheetActivity), gapComposer), gapComposer, 48);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                int intValue2 = num.intValue();
                int i3 = FinancialConnectionsSheetActivity.$r8$clinit;
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    financialConnectionsSheetActivity.Loading(gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                int i4 = FinancialConnectionsSheetActivity.$r8$clinit;
                financialConnectionsSheetActivity.Loading(composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ FinancialConnectionsSheetActivity$$ExternalSyntheticLambda3(FinancialConnectionsSheetActivity financialConnectionsSheetActivity, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = financialConnectionsSheetActivity;
    }
}
