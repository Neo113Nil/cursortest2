package com.stripe.android.financialconnections.features.common;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.stripe.android.financialconnections.model.OauthPrepane;
import com.stripe.android.financialconnections.presentation.Async;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes8.dex */
public final /* synthetic */ class SharedPartnerAuthKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ Function0 f$1;
    public final /* synthetic */ Async f$2;
    public final /* synthetic */ OauthPrepane f$3;
    public final /* synthetic */ boolean f$4;
    public final /* synthetic */ boolean f$5;

    public /* synthetic */ SharedPartnerAuthKt$$ExternalSyntheticLambda3(Function0 function0, Function0 function02, Async async, OauthPrepane oauthPrepane, boolean z, boolean z2) {
        this.f$0 = function0;
        this.f$1 = function02;
        this.f$2 = async;
        this.f$3 = oauthPrepane;
        this.f$4 = z;
        this.f$5 = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ListItemKt.PrepaneFooter(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ListItemKt.PrepaneFooter(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SharedPartnerAuthKt$$ExternalSyntheticLambda3(Function0 function0, Function0 function02, Async async, OauthPrepane oauthPrepane, boolean z, boolean z2, int i) {
        this.f$0 = function0;
        this.f$1 = function02;
        this.f$2 = async;
        this.f$3 = oauthPrepane;
        this.f$4 = z;
        this.f$5 = z2;
    }
}
