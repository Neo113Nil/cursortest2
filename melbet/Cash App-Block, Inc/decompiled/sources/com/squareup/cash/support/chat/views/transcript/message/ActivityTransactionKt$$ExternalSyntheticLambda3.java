package com.squareup.cash.support.chat.views.transcript.message;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.MutableSharedFlow;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final /* synthetic */ class ActivityTransactionKt$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableSharedFlow f$0;

    public /* synthetic */ ActivityTransactionKt$$ExternalSyntheticLambda3(MutableSharedFlow mutableSharedFlow, int i) {
        this.$r8$classId = i;
        this.f$0 = mutableSharedFlow;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                Unit unit = Unit.INSTANCE;
                if (!this.f$0.tryEmit(unit)) {
                    Timber.Forest.e("Failed to reload transactions.", new Object[0]);
                }
                return unit;
            default:
                Unit unit2 = Unit.INSTANCE;
                if (!this.f$0.tryEmit(unit2)) {
                    Timber.Forest.e("Failed to reload activity.", new Object[0]);
                }
                return unit2;
        }
    }
}
