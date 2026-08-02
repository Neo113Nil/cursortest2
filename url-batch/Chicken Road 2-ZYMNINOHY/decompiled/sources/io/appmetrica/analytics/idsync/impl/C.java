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
import w3.AbstractC1504a;

/* loaded from: classes.dex */
public final class C implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final k fromModel(RequestConfig requestConfig) {
        k kVar = new k();
        String type = requestConfig.getType();
        Charset charset = AbstractC1504a.f15936a;
        kVar.f9928a = type.getBytes(charset);
        j jVar = new j();
        jVar.f9926a = B.f9877a[requestConfig.getPreconditions().getNetworkType().ordinal()] != 1 ? 0 : 1;
        kVar.f9929b = jVar;
        kVar.f9930c = requestConfig.getUrl().getBytes(charset);
        Map<String, List<String>> headers = requestConfig.getHeaders();
        ArrayList arrayList = new ArrayList(headers.size());
        for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            i iVar = new i();
            iVar.f9923a = key.getBytes(AbstractC1504a.f15936a);
            int size = value.size();
            byte[][] bArr = new byte[size][];
            for (int i4 = 0; i4 < size; i4++) {
                bArr[i4] = value.get(i4).getBytes(AbstractC1504a.f15936a);
            }
            iVar.f9924b = bArr;
            arrayList.add(iVar);
        }
        Object[] array = arrayList.toArray(new i[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        kVar.f9931d = (i[]) array;
        kVar.f9932e = requestConfig.getResendIntervalForValidResponse();
        kVar.f9933f = requestConfig.getResendIntervalForInvalidResponse();
        kVar.f9934g = d3.i.m0(requestConfig.getValidResponseCodes());
        kVar.f9935h = requestConfig.getReportEventEnabled();
        String reportUrl = requestConfig.getReportUrl();
        if (reportUrl == null) {
            reportUrl = "";
        }
        kVar.f9936i = reportUrl;
        return kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r4 == null) goto L9;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RequestConfig toModel(k kVar) {
        NetworkType networkType;
        byte[] bArr = kVar.f9928a;
        Charset charset = AbstractC1504a.f15936a;
        String str = new String(bArr, charset);
        j jVar = kVar.f9929b;
        if (jVar != null) {
            if (jVar.f9926a == 1) {
                networkType = NetworkType.CELL;
            } else {
                networkType = NetworkType.ANY;
            }
        }
        networkType = NetworkType.ANY;
        Preconditions preconditions = new Preconditions(networkType);
        String str2 = new String(kVar.f9930c, charset);
        i[] iVarArr = kVar.f9931d;
        int z = d3.u.z(iVarArr.length);
        if (z < 16) {
            z = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(z);
        for (i iVar : iVarArr) {
            String str3 = new String(iVar.f9923a, AbstractC1504a.f15936a);
            byte[][] bArr2 = iVar.f9924b;
            ArrayList arrayList = new ArrayList(bArr2.length);
            for (byte[] bArr3 : bArr2) {
                arrayList.add(new String(bArr3, AbstractC1504a.f15936a));
            }
            linkedHashMap.put(str3, arrayList);
        }
        long j4 = kVar.f9932e;
        long j5 = kVar.f9933f;
        List X4 = d3.g.X(kVar.f9934g);
        boolean z4 = kVar.f9935h;
        String str4 = kVar.f9936i;
        if (str4.length() <= 0) {
            str4 = null;
        }
        return new RequestConfig(str, str2, preconditions, linkedHashMap, j4, j5, X4, z4, str4);
    }
}
