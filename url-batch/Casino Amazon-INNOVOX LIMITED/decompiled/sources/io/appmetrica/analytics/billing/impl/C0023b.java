package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.appmetrica.analytics.billing.impl.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0023b implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final i f573a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0023b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final d fromModel(C0022a c0022a) {
        d dVar = new d();
        List list = c0022a.f572a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f573a.fromModel((BillingInfo) it.next()));
        }
        Object[] array = arrayList.toArray(new c[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        dVar.f575a = (c[]) array;
        dVar.b = c0022a.b;
        return dVar;
    }

    public C0023b(i iVar) {
        this.f573a = iVar;
    }

    public /* synthetic */ C0023b(i iVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new i() : iVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0022a toModel(d dVar) {
        c[] cVarArr = dVar.f575a;
        ArrayList arrayList = new ArrayList(cVarArr.length);
        for (c cVar : cVarArr) {
            arrayList.add(this.f573a.toModel(cVar));
        }
        return new C0022a(arrayList, dVar.b);
    }
}
