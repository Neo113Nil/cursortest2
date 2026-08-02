package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c implements JsonParser {

    /* renamed from: a, reason: collision with root package name */
    public final e f5625a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5626b = "id_sync";

    /* renamed from: c, reason: collision with root package name */
    public final String f5627c = "id_sync";

    /* renamed from: d, reason: collision with root package name */
    public final String f5628d = "launch_delay_seconds";

    /* renamed from: e, reason: collision with root package name */
    public final String f5629e = "requests";
    public final String f = "type";

    /* renamed from: g, reason: collision with root package name */
    public final String f5630g = "url";

    /* renamed from: h, reason: collision with root package name */
    public final String f5631h = "headers";

    /* renamed from: i, reason: collision with root package name */
    public final String f5632i = "resend_interval_for_valid_response";

    /* renamed from: j, reason: collision with root package name */
    public final String f5633j = "resend_interval_for_invalid_response";

    /* renamed from: k, reason: collision with root package name */
    public final String f5634k = "valid_response_codes";

    /* renamed from: l, reason: collision with root package name */
    public final String f5635l = "preconditions";

    /* renamed from: m, reason: collision with root package name */
    public final String f5636m = "network";

    /* renamed from: n, reason: collision with root package name */
    public final String f5637n = "cell";

    public c(e eVar) {
        this.f5625a = eVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IdSyncConfig parse(JSONObject jSONObject) {
        m[] mVarArr;
        JSONArray jSONArray;
        k[] kVarArr;
        JSONArray jSONArray2;
        byte[][] bArr;
        int[] iArr;
        int[] iArr2;
        int i3;
        JSONObject optJSONObject = jSONObject.optJSONObject(this.f5627c);
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        o oVar = new o();
        oVar.f5668a = RemoteConfigJsonUtils.extractFeature(jSONObject, this.f5626b, oVar.f5668a);
        n nVar = new n();
        nVar.f5663a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject, this.f5628d, nVar.f5663a);
        JSONArray optJSONArray = optJSONObject.optJSONArray(this.f5629e);
        int i4 = 0;
        if (optJSONArray == null) {
            mVarArr = new m[0];
        } else {
            int length = optJSONArray.length();
            m[] mVarArr2 = new m[length];
            int i5 = 0;
            while (i5 < length) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i5);
                m mVar = new m();
                if (optJSONObject2 == null) {
                    jSONArray = optJSONArray;
                    i3 = i4;
                } else {
                    String optString = optJSONObject2.optString(this.f);
                    Charset charset = s2.a.f10316a;
                    mVar.f5656a = optString.getBytes(charset);
                    JSONObject optJSONObject3 = optJSONObject2.optJSONObject(this.f5635l);
                    l lVar = new l();
                    if (optJSONObject3 != null && kotlin.jvm.internal.j.a(optJSONObject3.optString(this.f5636m), this.f5637n)) {
                        lVar.f5654a = 1;
                    }
                    mVar.f5657b = lVar;
                    mVar.f5658c = optJSONObject2.optString(this.f5630g).getBytes(charset);
                    JSONObject optJSONObject4 = optJSONObject2.optJSONObject(this.f5631h);
                    if (optJSONObject4 == null) {
                        kVarArr = new k[i4];
                        jSONArray = optJSONArray;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        Iterator<String> keys = optJSONObject4.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            k kVar = new k();
                            kVar.f5651a = next.getBytes(s2.a.f10316a);
                            JSONArray optJSONArray2 = optJSONObject4.optJSONArray(next);
                            if (optJSONArray2 == null) {
                                bArr = new byte[i4][];
                                jSONArray2 = optJSONArray;
                            } else {
                                int length2 = optJSONArray2.length();
                                byte[][] bArr2 = new byte[length2][];
                                jSONArray2 = optJSONArray;
                                int i6 = 0;
                                while (i6 < length2) {
                                    byte[][] bArr3 = bArr2;
                                    int i7 = i6;
                                    bArr3[i7] = optJSONArray2.optString(i6).getBytes(s2.a.f10316a);
                                    i6 = i7 + 1;
                                    bArr2 = bArr3;
                                }
                                bArr = bArr2;
                            }
                            kVar.f5652b = bArr;
                            arrayList.add(kVar);
                            optJSONArray = jSONArray2;
                            i4 = 0;
                        }
                        jSONArray = optJSONArray;
                        Object[] array = arrayList.toArray(new k[i4]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                        kVarArr = (k[]) array;
                    }
                    mVar.f5659d = kVarArr;
                    mVar.f5660e = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject2, this.f5632i, mVar.f5660e);
                    mVar.f = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject2, this.f5633j, mVar.f);
                    JSONArray optJSONArray3 = optJSONObject2.optJSONArray(this.f5634k);
                    if (optJSONArray3 == null) {
                        iArr = new int[0];
                    } else {
                        int length3 = optJSONArray3.length();
                        int[] iArr3 = new int[length3];
                        for (int i8 = 0; i8 < length3; i8++) {
                            iArr3[i8] = optJSONArray3.optInt(i8);
                        }
                        iArr = iArr3;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (int i9 : iArr) {
                        if (i9 != 0) {
                            arrayList2.add(Integer.valueOf(i9));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        arrayList2 = null;
                    }
                    if (arrayList2 != null) {
                        iArr2 = c2.e.X(arrayList2);
                        i3 = 0;
                    } else {
                        i3 = 0;
                        iArr2 = new int[]{200};
                    }
                    mVar.f5661g = iArr2;
                }
                mVarArr2[i5] = mVar;
                i5++;
                i4 = i3;
                optJSONArray = jSONArray;
            }
            mVarArr = mVarArr2;
        }
        nVar.f5664b = mVarArr;
        oVar.f5669b = nVar;
        return this.f5625a.toModel(oVar);
    }

    public final IdSyncConfig b(JSONObject jSONObject) {
        return (IdSyncConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (IdSyncConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
