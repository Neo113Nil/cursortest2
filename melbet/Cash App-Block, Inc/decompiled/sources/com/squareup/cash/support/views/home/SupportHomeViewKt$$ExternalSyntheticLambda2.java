package com.squareup.cash.support.views.home;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.State;
import com.squareup.cash.fidesmo.views.ScanningShapePulseKt;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.uicore.elements.FormLabelKt;
import com.stripe.android.uicore.elements.PhoneNumberController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes8.dex */
public final /* synthetic */ class SupportHomeViewKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ State f$1;

    public /* synthetic */ SupportHomeViewKt$$ExternalSyntheticLambda2(PhoneNumberController phoneNumberController, State state) {
        this.$r8$classId = 1;
        this.f$1 = state;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        State state = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    AnimatedContentKt.AnimatedVisibility(ColumnScopeInstance.INSTANCE, ((Boolean) state.getValue()).booleanValue(), null, EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), null, SupportHomeViewKt.f710lambda$1957065437, gapComposer, 1600512, 18);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                    gapComposer2.startReplaceGroup(1571681373);
                    String resolve = ScanningShapePulseKt.resolve((ResolvableString) state.getValue(), gapComposer2);
                    gapComposer2.end(false);
                    FormLabelKt.FormLabel(0, 2, gapComposer2, null, resolve);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    TextKt.m509Text4IGK_g((String) state.getValue(), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, gapComposer3, 0, 0, 131070);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SupportHomeViewKt$$ExternalSyntheticLambda2(State state, int i) {
        this.$r8$classId = i;
        this.f$1 = state;
    }
}
