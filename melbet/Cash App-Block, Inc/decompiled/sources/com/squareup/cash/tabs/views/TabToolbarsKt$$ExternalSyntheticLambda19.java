package com.squareup.cash.tabs.views;

import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewEvent;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class TabToolbarsKt$$ExternalSyntheticLambda19 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ TabToolbarInternalViewModel.ProfileButton f$1;

    public /* synthetic */ TabToolbarsKt$$ExternalSyntheticLambda19(Function1 function1, TabToolbarInternalViewModel.ProfileButton profileButton, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = profileButton;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.invoke(new TabToolbarInternalViewEvent.ProfileClick(this.f$1.badgeCount));
                break;
            default:
                this.f$0.invoke(new TabToolbarInternalViewEvent.ProfileClick(this.f$1.badgeCount));
                break;
        }
        return Unit.INSTANCE;
    }
}
