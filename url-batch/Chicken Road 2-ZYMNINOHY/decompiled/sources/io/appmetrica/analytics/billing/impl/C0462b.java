package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.billing.impl.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0462b implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final i f9445a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0462b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final d fromModel(C0461a c0461a) {
        d dVar = new d();
        List list = c0461a.f9443a;
        ArrayList arrayList = new ArrayList(d3.k.Y(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f9445a.fromModel((BillingInfo) it.next()));
        }
        Object[] array = arrayList.toArray(new c[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        dVar.f9456a = (c[]) array;
        dVar.f9457b = c0461a.f9444b;
        return dVar;
    }

    public C0462b(i iVar) {
        this.f9445a = iVar;
    }

    public /* synthetic */ C0462b(i iVar, int i4, kotlin.jvm.internal.e eVar) {
        this((i4 & 1) != 0 ? new i() : iVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0461a toModel(d dVar) {
        c[] cVarArr = dVar.f9456a;
        ArrayList arrayList = new ArrayList(cVarArr.length);
        for (c cVar : cVarArr) {
            arrayList.add(this.f9445a.toModel(cVar));
        }
        return new C0461a(arrayList, dVar.f9457b);
    }
}
