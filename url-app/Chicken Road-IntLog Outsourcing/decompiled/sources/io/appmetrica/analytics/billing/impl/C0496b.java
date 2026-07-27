package io.appmetrica.analytics.billing.impl;

import g4.AbstractC0467l;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.billing.impl.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0496b implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final i f5954a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0496b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final d fromModel(C0495a c0495a) {
        d dVar = new d();
        List list = c0495a.f5952a;
        ArrayList arrayList = new ArrayList(AbstractC0467l.D0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f5954a.fromModel((BillingInfo) it.next()));
        }
        Object[] array = arrayList.toArray(new c[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        dVar.f5965a = (c[]) array;
        dVar.f5966b = c0495a.f5953b;
        return dVar;
    }

    public C0496b(i iVar) {
        this.f5954a = iVar;
    }

    public /* synthetic */ C0496b(i iVar, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? new i() : iVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0495a toModel(d dVar) {
        c[] cVarArr = dVar.f5965a;
        ArrayList arrayList = new ArrayList(cVarArr.length);
        for (c cVar : cVarArr) {
            arrayList.add(this.f5954a.toModel(cVar));
        }
        return new C0495a(arrayList, dVar.f5966b);
    }
}
