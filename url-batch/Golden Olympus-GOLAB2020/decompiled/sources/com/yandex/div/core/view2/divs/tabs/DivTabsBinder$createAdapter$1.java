package com.yandex.div.core.view2.divs.tabs;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class DivTabsBinder$createAdapter$1 extends s implements Function0<Unit> {
    final /* synthetic */ int $currentTab;
    final /* synthetic */ DivTabsEventManager $eventManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivTabsBinder$createAdapter$1(DivTabsEventManager divTabsEventManager, int i4) {
        super(0);
        this.$eventManager = divTabsEventManager;
        this.$currentTab = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m154invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m154invoke() {
        this.$eventManager.onPageDisplayed(this.$currentTab);
    }
}
