package ru.rustore.sdk.pay.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.o4;

/* loaded from: classes3.dex */
public final /* synthetic */ class i9 extends kotlin.jvm.internal.p implements Function1<a9, u8> {
    public i9(Object obj) {
        super(1, obj, g9.class, "mapToModel", "mapToModel(Lru/rustore/sdk/pay/internal/payment/extras/data/PaymentExtrasDtoDeprecated;)Lru/rustore/sdk/pay/internal/payment/extras/domain/PaymentExtras;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        b5 b5Var;
        z4 z4Var;
        a9 dto = (a9) obj;
        Intrinsics.checkNotNullParameter(dto, "p0");
        g9 g9Var = (g9) this.receiver;
        g9Var.getClass();
        Intrinsics.checkNotNullParameter(dto, "dto");
        List<v9> list = dto.f43799a;
        x9 x9Var = g9Var.f44165b;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (v9 v9Var : list) {
            x9Var.getClass();
            arrayList.add(x9.a(v9Var));
        }
        s9 s9Var = null;
        if (arrayList.isEmpty()) {
            IllegalStateException throwable = new IllegalStateException("Empty payment methods");
            y7 y7Var = g9Var.f44166c;
            y7Var.getClass();
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            u3.e.i(y7Var.f45263a, throwable, null, 2, null);
            throw throwable;
        }
        List<e3> list2 = dto.f43800b;
        s3 s3Var = g9Var.f44164a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(s3Var.a((e3) it.next()));
        }
        if (arrayList2.isEmpty()) {
            z4Var = null;
        } else {
            xj xjVar = dto.f43801c;
            int size = arrayList2.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayList2.get(i4);
                i4++;
                if (Intrinsics.areEqual(((b3) obj2).f43845a, xjVar != null ? xjVar.f45233a : null)) {
                    break;
                }
            }
            b3 b3Var = (b3) obj2;
            o4 cVar = (b3Var == null || xjVar == null) ? new o4.c(arrayList2) : new o4.a(arrayList2, CollectionsKt.listOf(new wj(b3Var.f43845a)));
            if (xjVar != null) {
                long j4 = xjVar.f45234b;
                long j5 = xjVar.f45235c;
                long j6 = xjVar.f45236d;
                b5Var = new b5(j4, j5, j6, j6);
            } else {
                b5Var = new b5(0L, 0L, 0L, 0L);
            }
            z4Var = new z4(cVar, b5Var);
        }
        v9 v9Var2 = dto.f43802d;
        if (v9Var2 != null) {
            g9Var.f44165b.getClass();
            s9Var = x9.a(v9Var2);
        }
        return new u8(arrayList, s9Var, z4Var);
    }
}
