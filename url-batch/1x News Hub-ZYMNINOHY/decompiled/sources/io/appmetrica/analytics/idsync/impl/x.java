package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.idsync.internal.model.NetworkType;
import io.appmetrica.analytics.idsync.internal.model.Preconditions;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class x implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final m fromModel(RequestConfig requestConfig) {
        m mVar = new m();
        String type = requestConfig.getType();
        Charset charset = s2.a.f10316a;
        mVar.f5656a = type.getBytes(charset);
        l lVar = new l();
        lVar.f5654a = w.f5680a[requestConfig.getPreconditions().getNetworkType().ordinal()] != 1 ? 0 : 1;
        mVar.f5657b = lVar;
        mVar.f5658c = requestConfig.getUrl().getBytes(charset);
        Map<String, List<String>> headers = requestConfig.getHeaders();
        ArrayList arrayList = new ArrayList(headers.size());
        for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            k kVar = new k();
            kVar.f5651a = key.getBytes(s2.a.f10316a);
            int size = value.size();
            byte[][] bArr = new byte[size][];
            for (int i3 = 0; i3 < size; i3++) {
                bArr[i3] = value.get(i3).getBytes(s2.a.f10316a);
            }
            kVar.f5652b = bArr;
            arrayList.add(kVar);
        }
        Object[] array = arrayList.toArray(new k[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        mVar.f5659d = (k[]) array;
        mVar.f5660e = requestConfig.getResendIntervalForValidResponse();
        mVar.f = requestConfig.getResendIntervalForInvalidResponse();
        mVar.f5661g = c2.e.X(requestConfig.getValidResponseCodes());
        return mVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r4 == null) goto L9;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RequestConfig toModel(m mVar) {
        NetworkType networkType;
        byte[] bArr = mVar.f5656a;
        Charset charset = s2.a.f10316a;
        String str = new String(bArr, charset);
        l lVar = mVar.f5657b;
        if (lVar != null) {
            if (lVar.f5654a == 1) {
                networkType = NetworkType.CELL;
            } else {
                networkType = NetworkType.ANY;
            }
        }
        networkType = NetworkType.ANY;
        Preconditions preconditions = new Preconditions(networkType);
        String str2 = new String(mVar.f5658c, charset);
        k[] kVarArr = mVar.f5659d;
        int Z2 = c2.q.Z(kVarArr.length);
        if (Z2 < 16) {
            Z2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(Z2);
        for (k kVar : kVarArr) {
            String str3 = new String(kVar.f5651a, s2.a.f10316a);
            byte[][] bArr2 = kVar.f5652b;
            ArrayList arrayList = new ArrayList(bArr2.length);
            for (byte[] bArr3 : bArr2) {
                arrayList.add(new String(bArr3, s2.a.f10316a));
            }
            linkedHashMap.put(str3, arrayList);
        }
        return new RequestConfig(str, str2, preconditions, linkedHashMap, mVar.f5660e, mVar.f, c2.c.W(mVar.f5661g));
    }
}
