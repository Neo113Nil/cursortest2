package ru.rustore.sdk.pay.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.model.PackageName;
import ru.rustore.sdk.pay.model.Url;

/* loaded from: classes3.dex */
public final class z1 extends kotlin.jvm.internal.s implements Function1<List<? extends k1>, List<? extends h1>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a2 f45308a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(a2 a2Var) {
        super(1);
        this.f45308a = a2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<k1> list = (List) obj;
        Intrinsics.checkNotNullParameter(list, "list");
        a2 a2Var = this.f45308a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (k1 dto : list) {
            l1 l1Var = a2Var.f43794b;
            Intrinsics.checkNotNullParameter(dto, "dto");
            arrayList.add(new h1(new v(dto.f44408a), new Url(dto.f44409b), new PackageName(dto.f44410c), new j2(dto.f44411d)));
        }
        return arrayList;
    }
}
