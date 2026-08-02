package com.squareup.cash.ui;

import com.squareup.cash.tabs.presenters.TabToolbarPresenter$Factory$Impl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class MainContainerDelegate$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MainContainerDelegate f$0;

    public /* synthetic */ MainContainerDelegate$$ExternalSyntheticLambda1(MainContainerDelegate mainContainerDelegate, int i) {
        this.$r8$classId = i;
        this.f$0 = mainContainerDelegate;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        MainContainerDelegate mainContainerDelegate = this.f$0;
        switch (i) {
            case 0:
                mainContainerDelegate.cashNavigator.onBack();
                return Unit.INSTANCE;
            default:
                TabToolbarPresenter$Factory$Impl tabToolbarPresenter$Factory$Impl = mainContainerDelegate.tabToolbarTransformerFactory;
                MainActivity$$ExternalSyntheticLambda6 mainActivity$$ExternalSyntheticLambda6 = mainContainerDelegate.navigator;
                mainActivity$$ExternalSyntheticLambda6.getClass();
                return tabToolbarPresenter$Factory$Impl.create(mainActivity$$ExternalSyntheticLambda6, null);
        }
    }
}
