package io.appmetrica.analytics.idsync.impl;

import g4.AbstractC0464i;
import g4.AbstractC0465j;
import g4.AbstractC0476u;
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
        Charset charset = B4.a.f287a;
        mVar.f6425a = type.getBytes(charset);
        l lVar = new l();
        lVar.f6423a = w.f6451a[requestConfig.getPreconditions().getNetworkType().ordinal()] != 1 ? 0 : 1;
        mVar.f6426b = lVar;
        mVar.f6427c = requestConfig.getUrl().getBytes(charset);
        Map<String, List<String>> headers = requestConfig.getHeaders();
        ArrayList arrayList = new ArrayList(headers.size());
        for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            k kVar = new k();
            kVar.f6420a = key.getBytes(B4.a.f287a);
            int size = value.size();
            byte[][] bArr = new byte[size][];
            for (int i2 = 0; i2 < size; i2++) {
                bArr[i2] = value.get(i2).getBytes(B4.a.f287a);
            }
            kVar.f6421b = bArr;
            arrayList.add(kVar);
        }
        Object[] array = arrayList.toArray(new k[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        mVar.f6428d = (k[]) array;
        mVar.f6429e = requestConfig.getResendIntervalForValidResponse();
        mVar.f6430f = requestConfig.getResendIntervalForInvalidResponse();
        mVar.f6431g = AbstractC0465j.R0(requestConfig.getValidResponseCodes());
        return mVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r2 == null) goto L9;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RequestConfig toModel(m mVar) {
        NetworkType networkType;
        byte[] bArr = mVar.f6425a;
        Charset charset = B4.a.f287a;
        String str = new String(bArr, charset);
        l lVar = mVar.f6426b;
        if (lVar != null) {
            if (lVar.f6423a == 1) {
                networkType = NetworkType.CELL;
            } else {
                networkType = NetworkType.ANY;
            }
        }
        networkType = NetworkType.ANY;
        Preconditions preconditions = new Preconditions(networkType);
        String str2 = new String(mVar.f6427c, charset);
        k[] kVarArr = mVar.f6428d;
        int W5 = AbstractC0476u.W(kVarArr.length);
        if (W5 < 16) {
            W5 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(W5);
        for (k kVar : kVarArr) {
            String str3 = new String(kVar.f6420a, B4.a.f287a);
            byte[][] bArr2 = kVar.f6421b;
            ArrayList arrayList = new ArrayList(bArr2.length);
            for (byte[] bArr3 : bArr2) {
                arrayList.add(new String(bArr3, B4.a.f287a));
            }
            linkedHashMap.put(str3, arrayList);
        }
        return new RequestConfig(str, str2, preconditions, linkedHashMap, mVar.f6429e, mVar.f6430f, AbstractC0464i.Z(mVar.f6431g));
    }
}
