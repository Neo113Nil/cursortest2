package com.startapp.sdk.internal;

import android.content.Context;
import android.os.SystemClock;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Pair;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.RscMetadata;
import com.startapp.sdk.adsbase.remoteconfig.RscMetadataItem;
import com.startapp.simple.bloomfilter.api.BloomFilterCreator;
import java.io.StringReader;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ef {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6859a;

    /* renamed from: b, reason: collision with root package name */
    public final n3 f6860b;

    /* renamed from: c, reason: collision with root package name */
    public RscMetadata f6861c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f6862d;

    /* renamed from: e, reason: collision with root package name */
    public LinkedList f6863e;

    /* renamed from: f, reason: collision with root package name */
    public final WeakHashMap f6864f = new WeakHashMap();

    public ef(Context context, n3 n3Var) {
        this.f6859a = context;
        this.f6860b = n3Var;
    }

    public static JSONArray a(gf gfVar) {
        z2 z2Var = gfVar.f6989a;
        String[] strArr = z2Var.f8001c;
        Object[] objArr = z2Var.f8003e;
        if (strArr.length == objArr.length) {
            int length = strArr.length;
            if (length == 0) {
                return null;
            }
            try {
                JSONArray jSONArray = new JSONArray();
                for (int i4 = 0; i4 < length; i4++) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(strArr[i4], objArr[i4]);
                    jSONArray.put(jSONObject);
                }
                return jSONArray;
            } catch (JSONException e4) {
                if (gfVar.a(32)) {
                    d9.a(e4);
                }
            }
        } else if (gfVar.a(512)) {
            d9 d9Var = new d9(e9.f6839e);
            d9Var.f6792d = "c690e4ef5365d88b";
            d9Var.f6793e = Arrays.toString(strArr) + ", " + Arrays.toString(objArr);
            d9Var.a();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0245 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List a() {
        ArrayList arrayList;
        z2 z2Var;
        int i4;
        int i5;
        Object hfVar;
        this.f6860b.getClass();
        RscMetadata S4 = MetaData.E().S();
        z2 z2Var2 = null;
        RscMetadata rscMetadata = (S4 == null || !S4.d()) ? null : S4;
        if (rscMetadata == null) {
            return a(null, null, null);
        }
        synchronized (this) {
            try {
                if (rscMetadata.equals(this.f6861c)) {
                    return this.f6863e;
                }
                String c4 = rscMetadata.c();
                int i6 = 4;
                int i7 = 2;
                int i8 = 8;
                int i9 = 0;
                if (c4 != null && c4.length() >= 1) {
                    try {
                        try {
                            ArrayList a3 = gb.a(new JsonReader(new StringReader(new String(si.a(AbstractC0366g.a(Base64.decode(c4, 8)))))));
                            arrayList = new ArrayList();
                            int size = a3.size();
                            int i10 = 0;
                            while (i10 < size) {
                                Object obj = a3.get(i10);
                                i10++;
                                if (!(obj instanceof Map)) {
                                    hfVar = new hf();
                                    i4 = i6;
                                    i5 = i7;
                                } else {
                                    Map map = (Map) obj;
                                    Object obj2 = map.get("type");
                                    Object obj3 = map.get("params");
                                    if (obj2 instanceof Number) {
                                        int intValue = ((Number) obj2).intValue();
                                        if (intValue == 1) {
                                            i4 = i6;
                                            i5 = i7;
                                            if (obj3 instanceof Number) {
                                                hfVar = new xe(((Number) obj3).intValue());
                                            }
                                            hfVar = new hf();
                                        } else if (intValue == i7) {
                                            i4 = i6;
                                            i5 = i7;
                                            if (obj3 instanceof List) {
                                                LinkedList linkedList = new LinkedList();
                                                for (Object obj4 : (List) obj3) {
                                                    if (obj4 instanceof String) {
                                                        e9 e9Var = (e9) e9.f6837c.get((String) obj4);
                                                        if (e9Var != null) {
                                                            linkedList.add(e9Var);
                                                        }
                                                    }
                                                }
                                                if (linkedList.size() > 0) {
                                                    hfVar = new bf(linkedList);
                                                }
                                            }
                                            hfVar = new hf();
                                        } else {
                                            if (intValue != 3) {
                                                if (intValue == i6 && (obj3 instanceof List)) {
                                                    List list = (List) obj3;
                                                    if (list.size() > 0) {
                                                        e9 e9Var2 = (e9) e9.f6837c.get(String.valueOf(list.get(0)));
                                                        if (e9Var2 != null) {
                                                            i4 = i6;
                                                            i5 = i7;
                                                            hfVar = new af(e9Var2, list.size() > 1 ? String.valueOf(list.get(1)) : null);
                                                        }
                                                    }
                                                }
                                            } else if (obj3 instanceof Map) {
                                                Map map2 = (Map) obj3;
                                                Object obj5 = map2.get("action");
                                                if (obj5 instanceof String) {
                                                    Object obj6 = map2.get("extras");
                                                    HashMap hashMap = new HashMap();
                                                    if (obj6 instanceof Map) {
                                                        for (Map.Entry entry : ((Map) obj6).entrySet()) {
                                                            int i11 = i6;
                                                            Object key = entry.getKey();
                                                            int i12 = i7;
                                                            if (key instanceof String) {
                                                                hashMap.put((String) key, String.valueOf(entry.getValue()));
                                                            }
                                                            i6 = i11;
                                                            i7 = i12;
                                                        }
                                                    }
                                                    i4 = i6;
                                                    i5 = i7;
                                                    hfVar = new ze((String) obj5, hashMap);
                                                }
                                            }
                                            hfVar = new hf();
                                        }
                                    }
                                    i4 = i6;
                                    i5 = i7;
                                    hfVar = new hf();
                                }
                                arrayList.add(hfVar);
                                i6 = i4;
                                i7 = i5;
                            }
                        } catch (Throwable th) {
                            if ((rscMetadata.a() & 1) != 0) {
                                d9.a(th);
                            }
                        }
                    } catch (Throwable th2) {
                        if ((rscMetadata.a() & 1) != 0) {
                            d9.a(th2);
                        }
                    }
                    if (arrayList == null && arrayList.size() >= 1) {
                        List<RscMetadataItem> b4 = rscMetadata.b();
                        if (b4 != null && b4.size() >= 1) {
                            LinkedList linkedList2 = new LinkedList();
                            for (RscMetadataItem rscMetadataItem : b4) {
                                if (rscMetadataItem != null) {
                                    String a4 = rscMetadataItem.a();
                                    if (a4 != null && a4.length() >= 1) {
                                        try {
                                            try {
                                                z2Var = a3.a(new String(si.a(AbstractC0366g.a(Base64.decode(a4, i8)))));
                                            } catch (Throwable th3) {
                                                if ((rscMetadata.a(rscMetadataItem) & 4) != 0) {
                                                    d9.a(th3);
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            if ((rscMetadata.a(rscMetadataItem) & 2) != 0) {
                                                d9.a(th4);
                                            }
                                        }
                                        if (z2Var == null) {
                                            int h2 = rscMetadataItem.h();
                                            int d4 = rscMetadataItem.d();
                                            ArrayList arrayList2 = new ArrayList(Math.min(arrayList.size(), Integer.bitCount(h2)));
                                            int size2 = arrayList.size();
                                            int i13 = i9;
                                            int i14 = i13;
                                            while (i14 < size2) {
                                                Object obj7 = arrayList.get(i14);
                                                i14++;
                                                hf hfVar2 = (hf) obj7;
                                                int i15 = 1 << i13;
                                                if ((h2 & i15) != 0) {
                                                    arrayList2.add(new Pair(hfVar2, Boolean.valueOf((d4 & i15) != 0 ? 1 : i9)));
                                                }
                                                i13++;
                                                i9 = 0;
                                            }
                                            if (arrayList2.size() >= 1) {
                                                linkedList2.add(new gf(z2Var, arrayList2, rscMetadataItem.i() != null ? rscMetadataItem.i().intValue() : 300, rscMetadataItem.g(), rscMetadataItem.c(), rscMetadataItem.f(), rscMetadataItem.e() != null ? rscMetadataItem.e().intValue() : 0, rscMetadata.a(rscMetadataItem)));
                                            }
                                            z2Var2 = null;
                                            i8 = 8;
                                            i9 = 0;
                                        }
                                    }
                                    z2Var = z2Var2;
                                    if (z2Var == null) {
                                    }
                                }
                            }
                            return a(rscMetadata, arrayList, linkedList2);
                        }
                        return a(rscMetadata, null, null);
                    }
                    return a(rscMetadata, null, null);
                }
                arrayList = null;
                if (arrayList == null) {
                }
                return a(rscMetadata, null, null);
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    public final synchronized List a(RscMetadata rscMetadata, ArrayList arrayList, LinkedList linkedList) {
        try {
            ArrayList arrayList2 = this.f6862d;
            int i4 = 0;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList2.get(i5);
                    i5++;
                    try {
                        ((hf) obj).a(this.f6859a);
                    } catch (Throwable th) {
                        RscMetadata rscMetadata2 = this.f6861c;
                        if (rscMetadata2 != null && (rscMetadata2.a() & 64) != 0) {
                            d9.a(th);
                        }
                    }
                }
            }
            this.f6861c = rscMetadata;
            this.f6862d = arrayList;
            this.f6863e = linkedList;
            if (arrayList != null) {
                int size2 = arrayList.size();
                while (i4 < size2) {
                    Object obj2 = arrayList.get(i4);
                    i4++;
                    try {
                        ((hf) obj2).a(this.f6859a, this);
                    } catch (Throwable th2) {
                        if (rscMetadata != null && (rscMetadata.a() & 128) != 0) {
                            d9.a(th2);
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return linkedList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009f, code lost:
    
        if ((r14 + (r0 * io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT)) < android.os.SystemClock.elapsedRealtime()) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x015d A[Catch: JSONException -> 0x0155, TryCatch #4 {JSONException -> 0x0155, blocks: (B:97:0x0145, B:99:0x014b, B:100:0x0157, B:102:0x015d, B:103:0x0166, B:105:0x016c, B:106:0x0171), top: B:96:0x0145 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x016c A[Catch: JSONException -> 0x0155, TryCatch #4 {JSONException -> 0x0155, blocks: (B:97:0x0145, B:99:0x014b, B:100:0x0157, B:102:0x015d, B:103:0x0166, B:105:0x016c, B:106:0x0171), top: B:96:0x0145 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014b A[Catch: JSONException -> 0x0155, TryCatch #4 {JSONException -> 0x0155, blocks: (B:97:0x0145, B:99:0x014b, B:100:0x0157, B:102:0x015d, B:103:0x0166, B:105:0x016c, B:106:0x0171), top: B:96:0x0145 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(Object obj) {
        int i4;
        Iterator it;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONArray a3;
        Integer num;
        boolean z;
        Pair pair;
        ArrayList arrayList;
        int size;
        int i5;
        List a4 = a();
        if (a4 == null) {
            return null;
        }
        JSONObject jSONObject = null;
        for (Iterator it2 = a4.iterator(); it2.hasNext(); it2 = it) {
            gf gfVar = (gf) it2.next();
            int i6 = 0;
            boolean z4 = true;
            try {
                arrayList = gfVar.f6990b;
                size = arrayList.size();
                i5 = 0;
            } catch (Throwable th) {
                th = th;
            }
            while (i5 < size) {
                Object obj2 = arrayList.get(i5);
                i5++;
                Pair pair2 = (Pair) obj2;
                try {
                } catch (Throwable th2) {
                    th = th2;
                    if (gfVar.a(256)) {
                        d9.a(th);
                    }
                    i4 = 0;
                    if ((i4 & 1) == 0) {
                    }
                }
                if (((hf) pair2.first).a(obj)) {
                    i4 = (((Boolean) pair2.second).booleanValue() ? 2 : 0) | 1;
                    if ((i4 & 1) == 0) {
                        it = it2;
                    } else {
                        z2 z2Var = gfVar.f6989a;
                        if ((i4 & 2) == 0) {
                            int i7 = gfVar.f6991c;
                            synchronized (this) {
                                pair = (Pair) this.f6864f.get(z2Var);
                            }
                            if (pair != null && (r11 = (JSONObject) ((SoftReference) pair.second).get()) != null) {
                                long longValue = ((Long) pair.first).longValue();
                                it = it2;
                                jSONArray = null;
                            }
                        }
                        it = it2;
                        jSONArray = null;
                        JSONObject jSONObject2 = jSONArray;
                        if (jSONObject2 == null) {
                            try {
                                jSONArray2 = z2Var.a(this.f6859a, gfVar.f6992d, gfVar.f6993e);
                            } catch (Throwable th3) {
                                if (gfVar.a(8)) {
                                    d9.a(th3);
                                }
                                jSONArray2 = jSONArray;
                            }
                            if (jSONArray2 != null && (num = gfVar.f6994f) != null) {
                                try {
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                                if ((num.intValue() == 1 ? new ff() : jSONArray) != null) {
                                    JSONArray jSONArray3 = new JSONArray();
                                    ArrayList arrayList2 = new ArrayList(jSONArray2.length());
                                    int length = jSONArray2.length();
                                    while (i6 < length) {
                                        try {
                                            JSONObject jSONObject3 = jSONArray2.getJSONObject(i6);
                                            if (jSONObject3 != null) {
                                                z = z4;
                                                try {
                                                    arrayList2.add(jSONObject3.getString(ff.f6916a));
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    if (gfVar.a(2048)) {
                                                        d9.a(th);
                                                    }
                                                    if (jSONArray2 != null) {
                                                    }
                                                    if (jSONObject2 != null) {
                                                    }
                                                }
                                            } else {
                                                z = z4;
                                            }
                                            i6++;
                                            z4 = z;
                                        } catch (Throwable th6) {
                                            th = th6;
                                        }
                                    }
                                    jSONArray3.put(new BloomFilterCreator().fromKeys(arrayList2));
                                    jSONArray2 = jSONArray3;
                                    if (jSONArray2 != null && jSONArray2.length() > 0) {
                                        jSONObject2 = new JSONObject();
                                        try {
                                            if ((gfVar.f6995g & 1) != 0) {
                                                jSONObject2.put("currentTimeMillis", System.currentTimeMillis());
                                            }
                                            if ((gfVar.f6995g & 2) != 0) {
                                                jSONObject2.put("bootTimeMillis", SystemClock.elapsedRealtime());
                                            }
                                            a3 = a(gfVar);
                                            if (a3 != null) {
                                                jSONObject2.put("params", a3);
                                            }
                                            jSONObject2.put("items", jSONArray2);
                                        } catch (JSONException e4) {
                                            if (gfVar.a(32)) {
                                                d9.a(e4);
                                            }
                                        }
                                        a(z2Var, jSONObject2);
                                    }
                                }
                            }
                            if (jSONArray2 != null) {
                                jSONObject2 = new JSONObject();
                                if ((gfVar.f6995g & 1) != 0) {
                                }
                                if ((gfVar.f6995g & 2) != 0) {
                                }
                                a3 = a(gfVar);
                                if (a3 != null) {
                                }
                                jSONObject2.put("items", jSONArray2);
                                a(z2Var, jSONObject2);
                            }
                        }
                        if (jSONObject2 != null) {
                            if (jSONObject == null) {
                                jSONObject = new JSONObject();
                            }
                            try {
                                JSONObject optJSONObject = jSONObject.optJSONObject(z2Var.f7999a);
                                if (optJSONObject == null) {
                                    optJSONObject = new JSONObject();
                                    jSONObject.put(z2Var.f7999a, optJSONObject);
                                }
                                JSONArray optJSONArray = optJSONObject.optJSONArray(z2Var.f8000b);
                                if (optJSONArray == null) {
                                    optJSONArray = new JSONArray();
                                    optJSONObject.put(z2Var.f8000b, optJSONArray);
                                }
                                optJSONArray.put(jSONObject2);
                            } catch (JSONException e5) {
                                if (gfVar.a(32)) {
                                    d9.a(e5);
                                }
                            }
                        }
                    }
                }
            }
            i4 = 0;
            if ((i4 & 1) == 0) {
            }
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            return si.b(jSONObject.toString());
        } catch (Throwable th7) {
            this.f6860b.getClass();
            RscMetadata S4 = MetaData.E().S();
            if (S4 == null || !S4.d()) {
                S4 = null;
            }
            if (S4 != null && (S4.a() & 16) != 0) {
                d9.a(th7);
            }
            return null;
        }
    }

    public final synchronized void a(z2 z2Var, JSONObject jSONObject) {
        this.f6864f.put(z2Var, new Pair(Long.valueOf(SystemClock.elapsedRealtime()), new SoftReference(jSONObject)));
    }
}
