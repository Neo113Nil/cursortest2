package com.yandex.div.core.view2.divs;

import O1.C0892k0;
import android.view.View;
import com.ironsource.c9;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.Assert;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class DivActionBinder$handleBulkActions$1 extends s implements Function0<Unit> {
    final /* synthetic */ String $actionLogType;
    final /* synthetic */ List<C0892k0> $actions;
    final /* synthetic */ Div2View $divView;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ View $target;
    final /* synthetic */ DivActionBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivActionBinder$handleBulkActions$1(List<C0892k0> list, ExpressionResolver expressionResolver, String str, DivActionBinder divActionBinder, Div2View div2View, View view) {
        super(0);
        this.$actions = list;
        this.$resolver = expressionResolver;
        this.$actionLogType = str;
        this.this$0 = divActionBinder;
        this.$divView = div2View;
        this.$target = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m72invoke();
        return Unit.f41027a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: invoke, reason: collision with other method in class */
    public final void m72invoke() {
        List<C0892k0> onlyEnabled;
        Div2Logger div2Logger;
        C0892k0 c0892k0;
        Div2Logger div2Logger2;
        Div2Logger div2Logger3;
        Div2Logger div2Logger4;
        Div2Logger div2Logger5;
        Div2Logger div2Logger6;
        Div2Logger div2Logger7;
        Div2Logger div2Logger8;
        Div2Logger div2Logger9;
        DivActionBeaconSender divActionBeaconSender;
        String divActionReason;
        Div2Logger div2Logger10;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        onlyEnabled = DivActionBinderKt.onlyEnabled(this.$actions, this.$resolver);
        String str = this.$actionLogType;
        DivActionBinder divActionBinder = this.this$0;
        Div2View div2View = this.$divView;
        ExpressionResolver expressionResolver = this.$resolver;
        View view = this.$target;
        for (C0892k0 c0892k02 : onlyEnabled) {
            switch (str.hashCode()) {
                case -338877947:
                    if (str.equals("long_click")) {
                        div2Logger = divActionBinder.logger;
                        c0892k0 = c0892k02;
                        div2Logger.logLongClick(div2View, expressionResolver, view, c0892k0, uuid);
                        break;
                    }
                    Assert.fail("Please, add new logType");
                    c0892k0 = c0892k02;
                    break;
                case -287575485:
                    if (str.equals("unhover")) {
                        div2Logger2 = divActionBinder.logger;
                        div2Logger2.logHoverChanged(div2View, expressionResolver, view, c0892k02, false);
                        c0892k0 = c0892k02;
                        break;
                    }
                    Assert.fail("Please, add new logType");
                    c0892k0 = c0892k02;
                case 3027047:
                    if (str.equals("blur")) {
                        div2Logger3 = divActionBinder.logger;
                        div2Logger3.logFocusChanged(div2View, expressionResolver, view, c0892k02, false);
                        c0892k0 = c0892k02;
                        break;
                    }
                    Assert.fail("Please, add new logType");
                    c0892k0 = c0892k02;
                case 94750088:
                    c0892k0 = c0892k02;
                    if (str.equals(c9.f15700d)) {
                        div2Logger4 = divActionBinder.logger;
                        div2Logger4.logClick(div2View, expressionResolver, view, c0892k0, uuid);
                        break;
                    }
                    c0892k02 = c0892k0;
                    Assert.fail("Please, add new logType");
                    c0892k0 = c0892k02;
                    break;
                case 96667352:
                    c0892k0 = c0892k02;
                    if (str.equals("enter")) {
                        div2Logger5 = divActionBinder.logger;
                        div2Logger5.logImeEnter(div2View, expressionResolver, view, c0892k0);
                        break;
                    }
                    c0892k02 = c0892k0;
                    Assert.fail("Please, add new logType");
                    c0892k0 = c0892k02;
                    break;
                case 97604824:
                    if (str.equals("focus")) {
                        div2Logger6 = divActionBinder.logger;
                        div2Logger6.logFocusChanged(div2View, expressionResolver, view, c0892k02, true);
                        c0892k0 = c0892k02;
                        break;
                    }
                    Assert.fail("Please, add new logType");
                    c0892k0 = c0892k02;
                case 99469628:
                    if (str.equals("hover")) {
                        div2Logger7 = divActionBinder.logger;
                        div2Logger7.logHoverChanged(div2View, expressionResolver, view, c0892k02, true);
                        c0892k0 = c0892k02;
                        break;
                    }
                    Assert.fail("Please, add new logType");
                    c0892k0 = c0892k02;
                case 106931267:
                    if (str.equals("press")) {
                        div2Logger8 = divActionBinder.logger;
                        div2Logger8.logPressChanged(div2View, expressionResolver, view, c0892k02, true);
                        c0892k0 = c0892k02;
                        break;
                    }
                    Assert.fail("Please, add new logType");
                    c0892k0 = c0892k02;
                case 1090594823:
                    if (str.equals("release")) {
                        div2Logger9 = divActionBinder.logger;
                        div2Logger9.logPressChanged(div2View, expressionResolver, view, c0892k02, false);
                        c0892k0 = c0892k02;
                        break;
                    }
                    Assert.fail("Please, add new logType");
                    c0892k0 = c0892k02;
                case 1374143386:
                    if (str.equals("double_click")) {
                        div2Logger10 = divActionBinder.logger;
                        c0892k0 = c0892k02;
                        div2Logger10.logDoubleClick(div2View, expressionResolver, view, c0892k0, uuid);
                        break;
                    }
                    Assert.fail("Please, add new logType");
                    c0892k0 = c0892k02;
                    break;
                default:
                    Assert.fail("Please, add new logType");
                    c0892k0 = c0892k02;
                    break;
            }
            divActionBeaconSender = divActionBinder.divActionBeaconSender;
            divActionBeaconSender.sendTapActionBeacon(c0892k0, expressionResolver);
            C0892k0 c0892k03 = c0892k0;
            divActionReason = divActionBinder.toDivActionReason(str);
            DivActionBinder divActionBinder2 = divActionBinder;
            DivActionBinder.handleActionWithoutEnableCheck$div_release$default(divActionBinder2, div2View, expressionResolver, c0892k03, divActionReason, uuid, null, 32, null);
            divActionBinder = divActionBinder2;
        }
    }
}
