package com.stripe.android.financialconnections.features.common;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.stripe.android.financialconnections.features.partnerauth.SharedPartnerAuthState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes8.dex */
public final /* synthetic */ class SharedPartnerAuthKt$$ExternalSyntheticLambda20 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ SharedPartnerAuthState f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ Function1 f$2;
    public final /* synthetic */ Function0 f$3;
    public final /* synthetic */ Function0 f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ SharedPartnerAuthKt$$ExternalSyntheticLambda20(SharedPartnerAuthState sharedPartnerAuthState, boolean z, Function0 function0, Function0 function02, Function1 function1, int i) {
        this.f$0 = sharedPartnerAuthState;
        this.f$1 = z;
        this.f$3 = function0;
        this.f$4 = function02;
        this.f$2 = function1;
        this.f$5 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                ListItemKt.SharedPartnerAuthContent(Updater.updateChangedFlags(this.f$5 | 1), (Composer) obj, this.f$0, this.f$3, this.f$4, this.f$2, this.f$1);
                break;
            default:
                ((Integer) obj2).getClass();
                ListItemKt.SharedPartnerAuthBody(Updater.updateChangedFlags(this.f$5 | 1), (Composer) obj, this.f$0, this.f$3, this.f$4, this.f$2, this.f$1);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SharedPartnerAuthKt$$ExternalSyntheticLambda20(SharedPartnerAuthState sharedPartnerAuthState, boolean z, Function1 function1, Function0 function0, Function0 function02, int i) {
        this.f$0 = sharedPartnerAuthState;
        this.f$1 = z;
        this.f$2 = function1;
        this.f$3 = function0;
        this.f$4 = function02;
        this.f$5 = i;
    }
}
