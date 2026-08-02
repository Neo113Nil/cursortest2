package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import w3.AbstractC1504a;

/* renamed from: io.appmetrica.analytics.idsync.impl.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0465c implements JsonParser {

    /* renamed from: a, reason: collision with root package name */
    public final C0467e f9897a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9898b = "id_sync";

    /* renamed from: c, reason: collision with root package name */
    public final String f9899c = "id_sync";

    /* renamed from: d, reason: collision with root package name */
    public final String f9900d = "launch_delay_seconds";

    /* renamed from: e, reason: collision with root package name */
    public final String f9901e = "requests";

    /* renamed from: f, reason: collision with root package name */
    public final String f9902f = "type";

    /* renamed from: g, reason: collision with root package name */
    public final String f9903g = "url";

    /* renamed from: h, reason: collision with root package name */
    public final String f9904h = "headers";

    /* renamed from: i, reason: collision with root package name */
    public final String f9905i = "resend_interval_for_valid_response";

    /* renamed from: j, reason: collision with root package name */
    public final String f9906j = "resend_interval_for_invalid_response";

    /* renamed from: k, reason: collision with root package name */
    public final String f9907k = "valid_response_codes";

    /* renamed from: l, reason: collision with root package name */
    public final String f9908l = "preconditions";

    /* renamed from: m, reason: collision with root package name */
    public final String f9909m = "network";
    public final String n = "cell";
    public final String o = "report_event_enabled";

    /* renamed from: p, reason: collision with root package name */
    public final String f9910p = "report_url";

    public C0465c(C0467e c0467e) {
        this.f9897a = c0467e;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IdSyncConfig parse(JSONObject jSONObject) {
        k[] kVarArr;
        JSONArray jSONArray;
        i[] iVarArr;
        JSONArray jSONArray2;
        byte[][] bArr;
        int[] iArr;
        int[] iArr2;
        int i4;
        JSONObject optJSONObject = jSONObject.optJSONObject(this.f9899c);
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        m mVar = new m();
        mVar.f9943a = RemoteConfigJsonUtils.extractFeature(jSONObject, this.f9898b, mVar.f9943a);
        l lVar = new l();
        lVar.f9938a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject, this.f9900d, lVar.f9938a);
        JSONArray optJSONArray = optJSONObject.optJSONArray(this.f9901e);
        int i5 = 0;
        if (optJSONArray == null) {
            kVarArr = new k[0];
        } else {
            int length = optJSONArray.length();
            k[] kVarArr2 = new k[length];
            int i6 = 0;
            while (i6 < length) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i6);
                k kVar = new k();
                if (optJSONObject2 == null) {
                    jSONArray = optJSONArray;
                    i4 = i5;
                } else {
                    String optString = optJSONObject2.optString(this.f9902f);
                    Charset charset = AbstractC1504a.f15936a;
                    kVar.f9928a = optString.getBytes(charset);
                    JSONObject optJSONObject3 = optJSONObject2.optJSONObject(this.f9908l);
                    j jVar = new j();
                    if (optJSONObject3 != null && kotlin.jvm.internal.i.a(optJSONObject3.optString(this.f9909m), this.n)) {
                        jVar.f9926a = 1;
                    }
                    kVar.f9929b = jVar;
                    kVar.f9930c = optJSONObject2.optString(this.f9903g).getBytes(charset);
                    JSONObject optJSONObject4 = optJSONObject2.optJSONObject(this.f9904h);
                    if (optJSONObject4 == null) {
                        iVarArr = new i[i5];
                        jSONArray = optJSONArray;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        Iterator<String> keys = optJSONObject4.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            i iVar = new i();
                            iVar.f9923a = next.getBytes(AbstractC1504a.f15936a);
                            JSONArray optJSONArray2 = optJSONObject4.optJSONArray(next);
                            if (optJSONArray2 == null) {
                                bArr = new byte[i5][];
                                jSONArray2 = optJSONArray;
                            } else {
                                int length2 = optJSONArray2.length();
                                byte[][] bArr2 = new byte[length2][];
                                jSONArray2 = optJSONArray;
                                int i7 = 0;
                                while (i7 < length2) {
                                    byte[][] bArr3 = bArr2;
                                    int i8 = i7;
                                    bArr3[i8] = optJSONArray2.optString(i7).getBytes(AbstractC1504a.f15936a);
                                    i7 = i8 + 1;
                                    bArr2 = bArr3;
                                }
                                bArr = bArr2;
                            }
                            iVar.f9924b = bArr;
                            arrayList.add(iVar);
                            optJSONArray = jSONArray2;
                            i5 = 0;
                        }
                        jSONArray = optJSONArray;
                        Object[] array = arrayList.toArray(new i[i5]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                        iVarArr = (i[]) array;
                    }
                    kVar.f9931d = iVarArr;
                    kVar.f9932e = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject2, this.f9905i, kVar.f9932e);
                    kVar.f9933f = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject2, this.f9906j, kVar.f9933f);
                    JSONArray optJSONArray3 = optJSONObject2.optJSONArray(this.f9907k);
                    if (optJSONArray3 == null) {
                        iArr = new int[0];
                    } else {
                        int length3 = optJSONArray3.length();
                        int[] iArr3 = new int[length3];
                        for (int i9 = 0; i9 < length3; i9++) {
                            iArr3[i9] = optJSONArray3.optInt(i9);
                        }
                        iArr = iArr3;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 : iArr) {
                        if (i10 != 0) {
                            arrayList2.add(Integer.valueOf(i10));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        arrayList2 = null;
                    }
                    if (arrayList2 != null) {
                        iArr2 = d3.i.m0(arrayList2);
                        i4 = 0;
                    } else {
                        i4 = 0;
                        iArr2 = new int[]{200};
                    }
                    kVar.f9934g = iArr2;
                    kVar.f9935h = optJSONObject2.optBoolean(this.o, kVar.f9935h);
                    kVar.f9936i = optJSONObject2.optString(this.f9910p);
                }
                kVarArr2[i6] = kVar;
                i6++;
                i5 = i4;
                optJSONArray = jSONArray;
            }
            kVarArr = kVarArr2;
        }
        lVar.f9939b = kVarArr;
        mVar.f9944b = lVar;
        return this.f9897a.toModel(mVar);
    }

    public final IdSyncConfig b(JSONObject jSONObject) {
        return (IdSyncConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (IdSyncConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
