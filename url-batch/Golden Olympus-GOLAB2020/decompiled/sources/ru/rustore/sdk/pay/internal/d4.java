package ru.rustore.sdk.pay.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.o4;

/* loaded from: classes3.dex */
public final class d4 extends kotlin.jvm.internal.s implements Function1<g4, z4> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f4 f43955a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(f4 f4Var) {
        super(1);
        this.f43955a = f4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        g4 dto = (g4) obj;
        Intrinsics.checkNotNullParameter(dto, "selectionResultDto");
        c4 c4Var = this.f43955a.f44055b;
        c4Var.getClass();
        Intrinsics.checkNotNullParameter(dto, "dto");
        List<e3> list = dto.f44155a;
        s3 s3Var = c4Var.f43899a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(s3Var.a((e3) it.next()));
        }
        b3 b3Var = (b3) CollectionsKt.firstOrNull((List) arrayList);
        o4 aVar = b3Var != null ? new o4.a(arrayList, CollectionsKt.listOf(new wj(b3Var.f43845a))) : new o4.c(arrayList);
        long j4 = dto.f44156b;
        long j5 = dto.f44157c;
        long j6 = dto.f44158d;
        return new z4(aVar, new b5(j4, j5, j6, j6));
    }
}
