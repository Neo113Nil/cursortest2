package ru.rustore.sdk.pay.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.o4;

/* loaded from: classes3.dex */
public final class e4 extends kotlin.jvm.internal.s implements Function1<d3, z4> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f4 f44000a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(f4 f4Var) {
        super(1);
        this.f44000a = f4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        d3 dto = (d3) obj;
        Intrinsics.checkNotNullParameter(dto, "cancelSelectionResultDto");
        c4 c4Var = this.f44000a.f44055b;
        c4Var.getClass();
        Intrinsics.checkNotNullParameter(dto, "dto");
        List<e3> list = dto.f43953a;
        s3 s3Var = c4Var.f43899a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(s3Var.a((e3) it.next()));
        }
        o4.c cVar = new o4.c(arrayList);
        long j4 = dto.f43954b;
        return new z4(cVar, new b5(j4, j4, 0L, 0L));
    }
}
