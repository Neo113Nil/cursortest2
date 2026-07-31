package ru.rustore.sdk.pay.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.ha;
import ru.rustore.sdk.pay.internal.qm;
import ru.rustore.sdk.pay.internal.s9;
import ru.rustore.sdk.pay.model.AmountLabel;
import ru.rustore.sdk.reactive.subject.MutableStateSubject;

/* loaded from: classes3.dex */
public final /* synthetic */ class da extends kotlin.jvm.internal.p implements Function1<s9, Unit> {
    public da(ka kaVar) {
        super(1, kaVar, ka.class, "selectPaymentMethod", "selectPaymentMethod(Lru/rustore/sdk/pay/internal/payment/method/domain/PaymentMethod;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s9 activeMethod = (s9) obj;
        Intrinsics.checkNotNullParameter(activeMethod, "p0");
        ka kaVar = (ka) this.receiver;
        kaVar.getClass();
        Intrinsics.checkNotNullParameter(activeMethod, "paymentMethod");
        ha value = kaVar.f44436c.getValue();
        ha.a aVar = value instanceof ha.a ? (ha.a) value : null;
        if (aVar != null) {
            List<qm> list = aVar.f44225a;
            ArrayList paymentMethods = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (qm qmVar : list) {
                if (qmVar instanceof qm.a) {
                    qm.a aVar2 = (qm.a) qmVar;
                    boolean areEqual = Intrinsics.areEqual(aVar2.f44855a, activeMethod);
                    s9 method = aVar2.f44855a;
                    Intrinsics.checkNotNullParameter(method, "method");
                    qmVar = new qm.a(method, areEqual);
                } else if (!(qmVar instanceof qm.b)) {
                    throw new W1.m();
                }
                paymentMethods.add(qmVar);
            }
            aa params = kaVar.f44438e;
            if (params != null) {
                z9 z9Var = (z9) kaVar.f44434a.f45600y2.getValue();
                z9Var.getClass();
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(activeMethod, "paymentMethod");
                Map createMapBuilder = MapsKt.createMapBuilder();
                createMapBuilder.putAll(z9Var.f45322a.a());
                createMapBuilder.put("rustore_payment", params.f43803a.f44406a);
                createMapBuilder.put("invoiceId", params.f43805c.getValue());
                createMapBuilder.put("purchaseId", params.f43804b.getValue());
                createMapBuilder.put("method_type", j.a(activeMethod));
                z9Var.f45323b.a("PaySheetPaymentMethodSelect", MapsKt.build(createMapBuilder));
            }
            if (!(activeMethod instanceof s9.f)) {
                f7 f7Var = (f7) kaVar.f44434a.f45427N1.getValue();
                f7Var.f44057a = activeMethod;
                f7Var.f44058b.emit(activeMethod);
            }
            MutableStateSubject<ha> mutableStateSubject = kaVar.f44436c;
            AmountLabel amountLabel = aVar.f44227c;
            ml mlVar = aVar.f44228d;
            Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
            Intrinsics.checkNotNullParameter(activeMethod, "activeMethod");
            Intrinsics.checkNotNullParameter(amountLabel, "amountLabel");
            mutableStateSubject.setValue(new ha.a(paymentMethods, activeMethod, amountLabel, mlVar));
        }
        return Unit.f41027a;
    }
}
