package com.stripe.android.financialconnections.features.networkinglinkloginwarmup;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.fillr.browsersdk.model.FillrWidgetVersion;
import com.squareup.cash.R;
import com.stripe.android.financialconnections.presentation.Async;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes8.dex */
public final /* synthetic */ class NetworkingLinkLoginWarmupScreenKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ NetworkingLinkLoginWarmupState f$0;
    public final /* synthetic */ Function0 f$1;
    public final /* synthetic */ Function0 f$2;

    public /* synthetic */ NetworkingLinkLoginWarmupScreenKt$$ExternalSyntheticLambda1(NetworkingLinkLoginWarmupState networkingLinkLoginWarmupState, Function0 function0, Function0 function02) {
        this.f$0 = networkingLinkLoginWarmupState;
        this.f$1 = function0;
        this.f$2 = function02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        NetworkingLinkLoginWarmupState networkingLinkLoginWarmupState = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    FillrWidgetVersion.Footer(networkingLinkLoginWarmupState.continueAsync instanceof Async.Loading, networkingLinkLoginWarmupState.disableNetworkingAsync instanceof Async.Loading, networkingLinkLoginWarmupState.isInstantDebits ? R.string.stripe_networking_link_login_warmup_cta_cancel : R.string.stripe_networking_link_login_warmup_cta_skip, networkingLinkLoginWarmupState.linkBrand, this.f$1, this.f$2, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                FillrWidgetVersion.NetworkingLinkLoginWarmupContent(networkingLinkLoginWarmupState, this.f$1, this.f$2, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ NetworkingLinkLoginWarmupScreenKt$$ExternalSyntheticLambda1(NetworkingLinkLoginWarmupState networkingLinkLoginWarmupState, Function0 function0, Function0 function02, int i) {
        this.f$0 = networkingLinkLoginWarmupState;
        this.f$1 = function0;
        this.f$2 = function02;
    }
}
