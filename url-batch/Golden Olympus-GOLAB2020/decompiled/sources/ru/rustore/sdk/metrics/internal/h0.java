package ru.rustore.sdk.metrics.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class h0 extends kotlin.jvm.internal.s implements Function0<String> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<j0> f43709a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(List list) {
        super(0);
        this.f43709a = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List<j0> list = this.f43709a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new u(((j0) it.next()).f43716a));
        }
        return "Getting first 10 from storage: " + arrayList;
    }
}
