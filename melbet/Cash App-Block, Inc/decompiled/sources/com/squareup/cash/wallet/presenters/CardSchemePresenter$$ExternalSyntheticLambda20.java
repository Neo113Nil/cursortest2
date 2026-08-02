package com.squareup.cash.wallet.presenters;

import com.squareup.cash.blockers.presenters.ReferralCodePresenter$models$2$1$1;
import com.withpersona.sdk2.camera.CameraHelper$unbind$2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes7.dex */
public final /* synthetic */ class CardSchemePresenter$$ExternalSyntheticLambda20 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CoroutineScope f$0;
    public final /* synthetic */ MutableSharedFlow f$1;

    public /* synthetic */ CardSchemePresenter$$ExternalSyntheticLambda20(CoroutineScope coroutineScope, MutableSharedFlow mutableSharedFlow, int i) {
        this.$r8$classId = i;
        this.f$0 = coroutineScope;
        this.f$1 = mutableSharedFlow;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                JobKt.launch$default(this.f$0, null, null, new CameraHelper$unbind$2(this.f$1, null, 1), 3);
                break;
            case 1:
                JobKt.launch$default(this.f$0, null, null, new ReferralCodePresenter$models$2$1$1(this.f$1, null, 3), 3);
                break;
            default:
                JobKt.launch$default(this.f$0, null, null, new ReferralCodePresenter$models$2$1$1(this.f$1, null, 9), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
