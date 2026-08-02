package com.stripe.android.financialconnections.features.error;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.fillr.analytics.util.HttpService;
import com.squareup.cash.data.profile.ProfilesKt;
import com.stripe.android.financialconnections.presentation.Async;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class ErrorScreenKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Async f$0;
    public final /* synthetic */ Function0 f$1;
    public final /* synthetic */ Function0 f$2;
    public final /* synthetic */ Function1 f$3;

    public /* synthetic */ ErrorScreenKt$$ExternalSyntheticLambda2(Async async, Function0 function0, Function0 function02, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = async;
        this.f$1 = function0;
        this.f$2 = function02;
        this.f$3 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(1);
                ProfilesKt.ErrorContent(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, updateChangedFlags);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(1);
                HttpService.AttachPaymentContent(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, updateChangedFlags2);
                break;
        }
        return Unit.INSTANCE;
    }
}
