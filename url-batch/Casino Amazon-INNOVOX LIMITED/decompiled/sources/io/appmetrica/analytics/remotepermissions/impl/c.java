package io.appmetrica.analytics.remotepermissions.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.text.Charsets;

/* loaded from: classes3.dex */
public final class c implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final f fromModel(a aVar) {
        f fVar = new f();
        Set set = aVar.f1694a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((String) it.next()).getBytes(Charsets.UTF_8));
        }
        Object[] array = arrayList.toArray(new byte[0][]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        fVar.f1698a = (byte[][]) array;
        return fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r7 == null) goto L9;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a toModel(f fVar) {
        Set emptySet;
        byte[][] bArr = fVar.f1698a;
        if (bArr != null) {
            ArrayList arrayList = new ArrayList(bArr.length);
            for (byte[] bArr2 : bArr) {
                arrayList.add(new String(bArr2, Charsets.UTF_8));
            }
            emptySet = CollectionsKt.toSet(arrayList);
        }
        emptySet = SetsKt.emptySet();
        return new a(emptySet);
    }
}
