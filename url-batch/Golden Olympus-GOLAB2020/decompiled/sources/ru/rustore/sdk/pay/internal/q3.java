package ru.rustore.sdk.pay.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.j4;
import ru.rustore.sdk.pay.internal.o4;
import ru.rustore.sdk.pay.internal.p3;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.reactive.subject.MutableStateSubject;

/* loaded from: classes3.dex */
public final class q3 extends kotlin.jvm.internal.s implements Function1<z4, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r3 f44810a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(r3 r3Var) {
        super(1);
        this.f44810a = r3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        z4 z4Var = (z4) obj;
        if (z4Var != null) {
            r3 r3Var = this.f44810a;
            p3 value = r3Var.f44878b.getValue();
            String str = null;
            p3.b bVar = value instanceof p3.b ? (p3.b) value : null;
            if (bVar != null) {
                o4 o4Var = z4Var.f45311a;
                if (o4Var instanceof o4.a) {
                    ArrayList arrayList = ((o4.a) o4Var).f44721a;
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
                    b3 b3Var = (b3) obj2;
                    if (b3Var != null) {
                        str = b3Var.f43845a;
                    }
                } else if (!(o4Var instanceof o4.b)) {
                    if (!(o4Var instanceof o4.d ? true : o4Var instanceof o4.c)) {
                        throw new W1.m();
                    }
                } else if (((wj) CollectionsKt.firstOrNull((List) null)) != null) {
                    throw null;
                }
                List<m4> list = bVar.f44771a;
                ArrayList coupons = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (m4 m4Var : list) {
                    boolean areEqual = str == null ? false : Intrinsics.areEqual(m4Var.f44631a, str);
                    String id = m4Var.f44631a;
                    String nominal = m4Var.f44632b;
                    String description = m4Var.f44633c;
                    String timeInterval = m4Var.f44634d;
                    u3 segment = m4Var.f44635e;
                    Intrinsics.checkNotNullParameter(id, "id");
                    Intrinsics.checkNotNullParameter(nominal, "nominal");
                    Intrinsics.checkNotNullParameter(description, "description");
                    Intrinsics.checkNotNullParameter(timeInterval, "timeInterval");
                    Intrinsics.checkNotNullParameter(segment, "segment");
                    coupons.add(new m4(id, nominal, description, timeInterval, segment, areEqual));
                }
                MutableStateSubject<p3> mutableStateSubject = r3Var.f44878b;
                PurchaseId purchaseId = bVar.f44772b;
                Intrinsics.checkNotNullParameter(coupons, "coupons");
                Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                mutableStateSubject.setValue(new p3.b(coupons, purchaseId));
            }
        }
        return Unit.f41027a;
    }
}
