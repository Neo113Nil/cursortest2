package com.yandex.div.core.view2.divs;

import O1.C0892k0;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class DivActionBinder$MenuWrapperListener$onMenuCreated$1$1 extends s implements Function0<Unit> {
    final /* synthetic */ D $actionsHandled;
    final /* synthetic */ Div2View $divView;
    final /* synthetic */ ExpressionResolver $expressionResolver;
    final /* synthetic */ C0892k0.c $itemData;
    final /* synthetic */ int $itemPosition;
    final /* synthetic */ DivActionBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivActionBinder$MenuWrapperListener$onMenuCreated$1$1(C0892k0.c cVar, ExpressionResolver expressionResolver, D d4, DivActionBinder divActionBinder, Div2View div2View, int i4) {
        super(0);
        this.$itemData = cVar;
        this.$expressionResolver = expressionResolver;
        this.$actionsHandled = d4;
        this.this$0 = divActionBinder;
        this.$divView = div2View;
        this.$itemPosition = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m63invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m63invoke() {
        List<C0892k0> onlyEnabled;
        Div2Logger div2Logger;
        DivActionBeaconSender divActionBeaconSender;
        List list = this.$itemData.f6768b;
        List list2 = list;
        List list3 = null;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        if (list == null) {
            C0892k0 c0892k0 = this.$itemData.f6767a;
            if (c0892k0 != null) {
                list3 = CollectionsKt.listOf(c0892k0);
            }
        } else {
            list3 = list;
        }
        List list4 = list3;
        if (list4 == null || list4.isEmpty()) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Menu item does not have any action");
                return;
            }
            return;
        }
        onlyEnabled = DivActionBinderKt.onlyEnabled(list3, this.$expressionResolver);
        DivActionBinder divActionBinder = this.this$0;
        Div2View div2View = this.$divView;
        ExpressionResolver expressionResolver = this.$expressionResolver;
        int i4 = this.$itemPosition;
        C0892k0.c cVar = this.$itemData;
        for (C0892k0 c0892k02 : onlyEnabled) {
            ExpressionResolver expressionResolver2 = expressionResolver;
            Div2View div2View2 = div2View;
            div2Logger = divActionBinder.logger;
            div2Logger.logPopupMenuItemClick(div2View2, expressionResolver2, i4, (String) cVar.f6769c.evaluate(expressionResolver2), c0892k02);
            divActionBeaconSender = divActionBinder.divActionBeaconSender;
            divActionBeaconSender.sendTapActionBeacon(c0892k02, expressionResolver2);
            div2View = div2View2;
            expressionResolver = expressionResolver2;
            DivActionBinder.handleActionWithoutEnableCheck$div_release$default(divActionBinder, div2View, expressionResolver, c0892k02, "menu", null, null, 48, null);
            i4 = i4;
        }
        this.$actionsHandled.f41129b = true;
    }
}
