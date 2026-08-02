package com.stripe.android.payments;

import javax.inject.Provider;
import kotlin.jvm.functions.Function0;

/* loaded from: classes8.dex */
public final /* synthetic */ class SetupIntentFlowResultProcessor$$ExternalSyntheticLambda0 implements Provider {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;

    public /* synthetic */ SetupIntentFlowResultProcessor$$ExternalSyntheticLambda0(int i, Function0 function0) {
        this.$r8$classId = i;
        this.f$0 = function0;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.$r8$classId;
        Function0 function0 = this.f$0;
        switch (i) {
        }
        return (String) function0.invoke();
    }
}
