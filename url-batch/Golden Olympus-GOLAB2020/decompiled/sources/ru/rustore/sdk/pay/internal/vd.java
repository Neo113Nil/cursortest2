package ru.rustore.sdk.pay.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.h4;
import ru.rustore.sdk.pay.internal.j4;
import ru.rustore.sdk.pay.internal.kd;
import ru.rustore.sdk.pay.internal.o4;
import ru.rustore.sdk.pay.internal.ze;
import ru.rustore.sdk.pay.model.AmountLabel;
import ru.rustore.sdk.pay.model.Description;
import ru.rustore.sdk.pay.model.Price;
import ru.rustore.sdk.pay.model.ProductPurchaseStatus;
import ru.rustore.sdk.pay.model.Quantity;
import ru.rustore.sdk.pay.model.Title;
import ru.rustore.sdk.pay.model.Url;
import ru.rustore.sdk.reactive.subject.MutableStateSubject;

/* loaded from: classes3.dex */
public final class vd extends kotlin.jvm.internal.s implements Function1<z4, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ld f45133a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd(ld ldVar) {
        super(1);
        this.f45133a = ldVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Pair pair;
        Object obj2;
        String str;
        String str2;
        z4 z4Var = (z4) obj;
        if (z4Var != null) {
            ld ldVar = this.f45133a;
            o4 o4Var = z4Var.f45311a;
            if (o4Var instanceof o4.c) {
                pair = TuplesKt.to(null, ((o4.c) o4Var).f44723a);
            } else if (o4Var instanceof o4.a) {
                o4.a aVar = (o4.a) o4Var;
                ArrayList arrayList = aVar.f44721a;
                int size = arrayList.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        obj2 = null;
                        break;
                    }
                    obj2 = arrayList.get(i4);
                    i4++;
                    if (((b3) obj2).f43849e instanceof j4.c) {
                        break;
                    }
                }
                pair = TuplesKt.to(obj2, aVar.f44721a);
            } else if (o4Var instanceof o4.d) {
                pair = TuplesKt.to(null, null);
            } else {
                if (!(o4Var instanceof o4.b)) {
                    throw new W1.m();
                }
                if (((wj) CollectionsKt.firstOrNull((List) null)) != null) {
                    throw null;
                }
                pair = TuplesKt.to(null, null);
            }
            b3 b3Var = (b3) pair.component1();
            List list = (List) pair.component2();
            kd value = ldVar.f44516c.getValue();
            if (value instanceof kd.a) {
                kd.a aVar2 = (kd.a) value;
                h4 dVar = b3Var != null ? new h4.d(b3Var) : new h4.b(list.size());
                MutableStateSubject<kd> mutableStateSubject = ldVar.f44516c;
                cb cbVar = aVar2.f44448c;
                if (b3Var != null) {
                    StringBuilder sb = new StringBuilder("-");
                    u4 u4Var = (u4) ldVar.f44514a.f45529k1.getValue();
                    long j4 = z4Var.f45312b.f43855c;
                    u4Var.getClass();
                    sb.append(u4.a(j4));
                    str2 = sb.toString();
                } else {
                    str2 = null;
                }
                u4 u4Var2 = (u4) ldVar.f44514a.f45529k1.getValue();
                long j5 = z4Var.f45312b.f43854b;
                u4Var2.getClass();
                mutableStateSubject.setValue(kd.a.a(aVar2, null, dVar, cb.a(cbVar, str2, u4.a(j5), false, 9), null, false, 249));
                if (b3Var != null) {
                    Price totalPrice = new Price((int) z4Var.f45312b.f43854b);
                    ym ymVar = (ym) ldVar.f44514a.f45485b2.getValue();
                    ymVar.getClass();
                    Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
                    f0 f0Var = ymVar.f45302a.f44715b.f44719a;
                    if (f0Var != null) {
                        e0 e0Var = f0Var.f44051e;
                        Url icon = e0Var.f43982a;
                        Description description = e0Var.f43983b;
                        AmountLabel amountLabel = e0Var.f43984c;
                        Price originalPrice = e0Var.f43985d;
                        Intrinsics.checkNotNullParameter(icon, "icon");
                        Intrinsics.checkNotNullParameter(description, "description");
                        Intrinsics.checkNotNullParameter(amountLabel, "amountLabel");
                        Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
                        Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
                        f0 applicationPurchase = f0.a(f0Var, null, new e0(icon, description, amountLabel, originalPrice, totalPrice), 15);
                        o0 o0Var = ymVar.f45302a;
                        o0Var.getClass();
                        Intrinsics.checkNotNullParameter(applicationPurchase, "applicationPurchase");
                        o2 o2Var = o0Var.f44715b;
                        o2Var.getClass();
                        Intrinsics.checkNotNullParameter(applicationPurchase, "applicationPurchase");
                        o2Var.f44719a = applicationPurchase;
                    }
                }
                ldVar.c();
            } else if (value instanceof kd.b) {
                kd.b bVar = (kd.b) value;
                h4 dVar2 = b3Var != null ? new h4.d(b3Var) : new h4.b(list.size());
                MutableStateSubject<kd> mutableStateSubject2 = ldVar.f44516c;
                cb cbVar2 = bVar.f44456c;
                if (b3Var != null) {
                    StringBuilder sb2 = new StringBuilder("-");
                    u4 u4Var3 = (u4) ldVar.f44514a.f45529k1.getValue();
                    long j6 = b3Var.f43846b;
                    u4Var3.getClass();
                    sb2.append(u4.a(j6));
                    str = sb2.toString();
                } else {
                    str = null;
                }
                u4 u4Var4 = (u4) ldVar.f44514a.f45529k1.getValue();
                long j7 = z4Var.f45312b.f43854b;
                u4Var4.getClass();
                mutableStateSubject2.setValue(kd.b.a(bVar, null, dVar2, cb.a(cbVar2, str, u4.a(j7), false, 9), null, false, false, 2041));
                if (b3Var != null) {
                    Price totalPrice2 = new Price((int) z4Var.f45312b.f43854b);
                    bn bnVar = (bn) ldVar.f44514a.f45490c2.getValue();
                    bnVar.getClass();
                    Intrinsics.checkNotNullParameter(totalPrice2, "totalPrice");
                    qb qbVar = bnVar.f43891a.f43860b.f44876a;
                    if (qbVar != null) {
                        ze zeVar = qbVar.f44822g;
                        ze.a aVar3 = zeVar instanceof ze.a ? (ze.a) zeVar : null;
                        if (aVar3 != null) {
                            Url icon2 = aVar3.f45338a;
                            Title title = aVar3.f45339b;
                            AmountLabel amountLabel2 = aVar3.f45340c;
                            ProductPurchaseStatus status = aVar3.f45341d;
                            Quantity quantity = aVar3.f45342e;
                            Price originalPrice2 = aVar3.f45343f;
                            Intrinsics.checkNotNullParameter(icon2, "icon");
                            Intrinsics.checkNotNullParameter(title, "title");
                            Intrinsics.checkNotNullParameter(amountLabel2, "amountLabel");
                            Intrinsics.checkNotNullParameter(status, "status");
                            Intrinsics.checkNotNullParameter(quantity, "quantity");
                            Intrinsics.checkNotNullParameter(originalPrice2, "originalPrice");
                            Intrinsics.checkNotNullParameter(totalPrice2, "totalPrice");
                            qb productPurchase = qb.a(qbVar, null, new ze.a(icon2, title, amountLabel2, status, quantity, originalPrice2, totalPrice2), 191);
                            bc bcVar = bnVar.f43891a;
                            bcVar.getClass();
                            Intrinsics.checkNotNullParameter(productPurchase, "productPurchase");
                            r2 r2Var = bcVar.f43860b;
                            r2Var.getClass();
                            Intrinsics.checkNotNullParameter(productPurchase, "productPurchase");
                            r2Var.f44876a = productPurchase;
                        }
                    }
                }
                ldVar.c();
            }
        }
        return Unit.f41027a;
    }
}
