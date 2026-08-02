package io.appmetrica.analytics.remotepermissions.impl;

import d3.i;
import d3.k;
import d3.s;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import w3.AbstractC1504a;

/* loaded from: classes.dex */
public final class c implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final f fromModel(a aVar) {
        f fVar = new f();
        Set set = aVar.f13389a;
        ArrayList arrayList = new ArrayList(k.Y(set));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((String) it.next()).getBytes(AbstractC1504a.f15936a));
        }
        Object[] array = arrayList.toArray(new byte[0][]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        fVar.f13397a = (byte[][]) array;
        return fVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a toModel(f fVar) {
        Set set;
        byte[][] bArr = fVar.f13397a;
        if (bArr != null) {
            ArrayList arrayList = new ArrayList(bArr.length);
            for (byte[] bArr2 : bArr) {
                arrayList.add(new String(bArr2, AbstractC1504a.f15936a));
            }
            set = i.p0(arrayList);
        } else {
            set = s.f8335a;
        }
        return new a(set);
    }
}
