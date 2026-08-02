package com.stripe.android.financialconnections.features.networkinglinksignup;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.fillr.core.analytics.FillrAnalyticsServiceBuilder;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes8.dex */
public final /* synthetic */ class NetworkingLinkSignupScreenKt$$ExternalSyntheticLambda16 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ NetworkingLinkSignupState.Payload f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ Function0 f$4;
    public final /* synthetic */ Function0 f$5;

    public /* synthetic */ NetworkingLinkSignupScreenKt$$ExternalSyntheticLambda16(NetworkingLinkSignupState.Payload payload, Function1 function1, boolean z, boolean z2, Function0 function0, Function0 function02) {
        this.f$0 = payload;
        this.f$1 = function1;
        this.f$2 = z;
        this.f$3 = z2;
        this.f$4 = function0;
        this.f$5 = function02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    FillrAnalyticsServiceBuilder.NetworkingLinkSignupFooter(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                FillrAnalyticsServiceBuilder.NetworkingLinkSignupFooter(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ NetworkingLinkSignupScreenKt$$ExternalSyntheticLambda16(NetworkingLinkSignupState.Payload payload, Function1 function1, boolean z, boolean z2, Function0 function0, Function0 function02, int i) {
        this.f$0 = payload;
        this.f$1 = function1;
        this.f$2 = z;
        this.f$3 = z2;
        this.f$4 = function0;
        this.f$5 = function02;
    }
}
