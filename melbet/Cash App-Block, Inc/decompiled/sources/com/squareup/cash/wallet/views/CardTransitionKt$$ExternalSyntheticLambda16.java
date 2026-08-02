package com.squareup.cash.wallet.views;

import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.material3.SwipeToDismissBoxValue;
import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final /* synthetic */ class CardTransitionKt$$ExternalSyntheticLambda16 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;

    public /* synthetic */ CardTransitionKt$$ExternalSyntheticLambda16(int i, Function0 function0) {
        this.$r8$classId = i;
        this.f$0 = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Function0 function0 = this.f$0;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                Timber.Forest forest = Timber.Forest;
                forest.tag("sceneCache");
                forest.e("Fallback engine render error", new Object[0], th);
                function0.invoke();
                break;
            case 1:
                ActivityItemViewEvent activityItemViewEvent = (ActivityItemViewEvent) obj;
                activityItemViewEvent.getClass();
                if (Intrinsics.areEqual(activityItemViewEvent, ActivityItemViewEvent.AvatarClicked.INSTANCE) || Intrinsics.areEqual(activityItemViewEvent, ActivityItemViewEvent.ItemClicked.INSTANCE)) {
                    function0.invoke();
                }
                break;
            case 2:
                ((KeyboardActionScope) obj).getClass();
                function0.invoke();
                break;
            case 3:
                function0.invoke();
                break;
            case 4:
                function0.invoke();
                break;
            case 5:
                ((SwipeToDismissBoxValue) obj).getClass();
                function0.invoke();
                break;
            case 6:
                function0.invoke();
                break;
            default:
                ((String) obj).getClass();
                function0.invoke();
                break;
        }
        return Unit.INSTANCE;
    }
}
