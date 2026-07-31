package ru.rustore.sdk.pay.internal;

import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.p3;

/* loaded from: classes3.dex */
public final /* synthetic */ class n3 extends kotlin.jvm.internal.p implements Function1<i3, Unit> {
    public n3(r3 r3Var) {
        super(1, r3Var, r3.class, "selectCoupon", "selectCoupon-jsjmkQI(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        String couponId = ((i3) obj).f44298a;
        Intrinsics.checkNotNullParameter(couponId, "p0");
        r3 r3Var = (r3) this.receiver;
        r3Var.getClass();
        Intrinsics.checkNotNullParameter(couponId, "couponId");
        l3 params = r3Var.f44883g;
        p3 value = r3Var.f44878b.getValue();
        if ((value instanceof p3.b) && params != null) {
            p3.b bVar = (p3.b) value;
            Iterator<T> it = bVar.f44771a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((m4) obj2).f44636f) {
                    break;
                }
            }
            m4 m4Var = (m4) obj2;
            String str = m4Var != null ? m4Var.f44631a : null;
            if (!(str == null ? false : Intrinsics.areEqual(str, couponId))) {
                k3 k3Var = (k3) r3Var.f44877a.f45380B2.getValue();
                k3Var.getClass();
                Intrinsics.checkNotNullParameter(couponId, "couponId");
                Intrinsics.checkNotNullParameter(params, "params");
                Map createMapBuilder = MapsKt.createMapBuilder();
                createMapBuilder.putAll(k3Var.f44413a.a());
                createMapBuilder.put("id_coupon", couponId);
                createMapBuilder.put("rustore_payment", params.f44501a.f44406a);
                createMapBuilder.put("invoiceId", params.f44502b.getValue());
                k3Var.f44414b.a("paySheetCouponSheet.select", MapsKt.build(createMapBuilder));
                r3Var.f44878b.setValue(p3.d.f44774a);
                r3Var.a(couponId, bVar.f44772b, bVar.f44771a);
            }
        }
        return Unit.f41027a;
    }
}
