package ru.rustore.sdk.pay.internal;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.R;
import ru.rustore.sdk.pay.internal.h3;

/* loaded from: classes3.dex */
public final class hd extends kotlin.jvm.internal.s implements Function1<h3, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fd f44235a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd(fd fdVar) {
        super(1);
        this.f44235a = fdVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        fd fdVar;
        View view;
        h3 event = (h3) obj;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof h3.b) {
            fd fdVar2 = this.f44235a;
            View view2 = fdVar2.f44114t;
            if (view2 != null) {
                String string = fdVar2.getString(R.string.sdk_pay_coupon_unselect_error);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.sdk_pay_coupon_unselect_error)");
                nn.a(view2, string);
            }
        } else if (event instanceof h3.c) {
            fd fdVar3 = this.f44235a;
            View view3 = fdVar3.f44114t;
            if (view3 != null) {
                String string2 = fdVar3.getString(R.string.sdk_pay_coupon_unselect_locked_message);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.sdk_p…_unselect_locked_message)");
                nn.a(view3, string2);
            }
        } else if ((event instanceof h3.a) && (view = (fdVar = this.f44235a).f44114t) != null) {
            String string3 = fdVar.getString(R.string.sdk_pay_coupon_select_locked_message);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.sdk_p…on_select_locked_message)");
            nn.a(view, string3);
        }
        return Unit.f41027a;
    }
}
