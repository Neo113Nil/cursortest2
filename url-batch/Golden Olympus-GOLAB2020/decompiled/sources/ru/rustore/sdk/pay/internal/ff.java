package ru.rustore.sdk.pay.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.model.Purchase;

/* loaded from: classes3.dex */
public final class ff extends kotlin.jvm.internal.s implements Function1<List<? extends le>, List<? extends Purchase>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gf f44127a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff(gf gfVar) {
        super(1);
        this.f44127a = gfVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List listDto = (List) obj;
        Intrinsics.checkNotNullParameter(listDto, "listDto");
        bf bfVar = this.f44127a.f44177b;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listDto, 10));
        Iterator it = listDto.iterator();
        while (it.hasNext()) {
            arrayList.add(bfVar.a((le) it.next()));
        }
        return arrayList;
    }
}
