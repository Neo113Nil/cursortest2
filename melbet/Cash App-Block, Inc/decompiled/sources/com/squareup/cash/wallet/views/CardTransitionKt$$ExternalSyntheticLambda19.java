package com.squareup.cash.wallet.views;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final /* synthetic */ class CardTransitionKt$$ExternalSyntheticLambda19 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CardRegistry f$0;
    public final /* synthetic */ Function0 f$1;

    public /* synthetic */ CardTransitionKt$$ExternalSyntheticLambda19(CardRegistry cardRegistry, Function0 function0, int i) {
        this.$r8$classId = i;
        this.f$0 = cardRegistry;
        this.f$1 = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Function0 function0 = this.f$1;
        CardRegistry cardRegistry = this.f$0;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                th.getClass();
                Timber.Forest forest = Timber.Forest;
                forest.tag("sceneCache");
                forest.e("Engine render error", new Object[0], th);
                cardRegistry.sharedSceneError$delegate.setValue(Boolean.TRUE);
                function0.invoke();
                break;
            default:
                th.getClass();
                Timber.Forest forest2 = Timber.Forest;
                forest2.tag("tagEngineCache");
                forest2.e("Tag engine render error", new Object[0], th);
                cardRegistry.tagEngineError$delegate.setValue(Boolean.TRUE);
                function0.invoke();
                break;
        }
        return Unit.INSTANCE;
    }
}
