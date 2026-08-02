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
    public final Context f3746a;

    /* renamed from: b, reason: collision with root package name */
    public final n3 f3747b;

    /* renamed from: c, reason: collision with root package name */
    public RscMetadata f3748c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f3749d;

    /* renamed from: e, reason: collision with root package name */
    public LinkedList f3750e;
    public final WeakHashMap f = new WeakHashMap();

    public ef(Context context, n3 n3Var) {
        this.f3746a = context;
        this.f3747b = n3Var;
    }

    public static JSONArray a(gf gfVar) {
        z2 z2Var = gfVar.f3868a;
        String[] strArr = z2Var.f4852c;
        Object[] objArr = z2Var.f4854e;
        if (strArr.length == objArr.length) {
            int length = strArr.length;
            if (length == 0) {
                return null;
            }
            try {
                JSONArray jSONArray = new JSONArray();
                for (int i3 = 0; i3 < length; i3++) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(strArr[i3], objArr[i3]);
                    jSONArray.put(jSONObject);
                }
                return jSONArray;
            } catch (JSONException e3) {
                if (gfVar.a(32)) {
                    d9.a(e3);
                }
            }
        } else if (gfVar.a(512)) {
            d9 d9Var = new d9(e9.f3725e);
            d9Var.f3680d = "c690e4ef5365d88b";
            d9Var.f3681e = Arrays.toString(strArr) + ", " + Arrays.toString(objArr);
            d9Var.a();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x020d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01bd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List a() {
        ArrayList<hf> arrayList;
        z2 z2Var;
        Object hfVar;
        this.f3747b.getClass();
        RscMetadata S2 = MetaData.E().S();
        z2 z2Var2 = null;
        RscMetadata rscMetadata = (S2 == null || !S2.d()) ? null : S2;
        if (rscMetadata == null) {
            return a(null, null, null);
        }
        synchronized (this) {
            try {
                if (rscMetadata.equals(this.f3748c)) {
                    return this.f3750e;
                }
                String c3 = rscMetadata.c();
                int i3 = 4;
                int i4 = 2;
                int i5 = 8;
                int i6 = 0;
                if (c3 != null && c3.length() >= 1) {
                    try {
                        try {
                            ArrayList a3 = gb.a(new JsonReader(new StringReader(new String(si.a(AbstractC0288g.a(Base64.decode(c3, 8)))))));
                            arrayList = new ArrayList();
                            Iterator it = a3.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                if (!(next instanceof Map)) {
                                    hfVar = new hf();
                                } else {
                                    Map map = (Map) next;
                                    Object obj = map.get("type");
                                    Object obj2 = map.get("params");
                                    if (obj instanceof Number) {
                                        int intValue = ((Number) obj).intValue();
                                        if (intValue != 1) {
                                            if (intValue != 2) {
                                                if (intValue != 3) {
                                                    if (intValue == 4 && (obj2 instanceof List)) {
                                                        List list = (List) obj2;
                                                        if (list.size() > 0) {
                                                            e9 e9Var = (e9) e9.f3723c.get(String.valueOf(list.get(0)));
                                                            if (e9Var != null) {
                                                                hfVar = new af(e9Var, list.size() > 1 ? String.valueOf(list.get(1)) : null);
                                                            }
                                                        }
                                                    }
                                                } else if (obj2 instanceof Map) {
                                                    Map map2 = (Map) obj2;
                                                    Object obj3 = map2.get("action");
                                                    if (obj3 instanceof String) {
                                                        Object obj4 = map2.get("extras");
                                                        HashMap hashMap = new HashMap();
                                                        if (obj4 instanceof Map) {
                                                            for (Map.Entry entry : ((Map) obj4).entrySet()) {
                                                                Object key = entry.getKey();
                                                                if (key instanceof String) {
                                                                    hashMap.put((String) key, String.valueOf(entry.getValue()));
                                                                }
                                                            }
                                                        }
                                                        hfVar = new ze((String) obj3, hashMap);
                                                    }
                                                }
                                            } else if (obj2 instanceof List) {
                                                LinkedList linkedList = new LinkedList();
                                                for (Object obj5 : (List) obj2) {
                                                    if (obj5 instanceof String) {
                                                        e9 e9Var2 = (e9) e9.f3723c.get((String) obj5);
                                                        if (e9Var2 != null) {
                                                            linkedList.add(e9Var2);
                                                        }
                                                    }
                                                }
                                                if (linkedList.size() > 0) {
                                                    hfVar = new bf(linkedList);
                                                }
                                            }
                                        } else if (obj2 instanceof Number) {
                                            hfVar = new xe(((Number) obj2).intValue());
                                        }
                                    }
                                    hfVar = new hf();
                                }
                                arrayList.add(hfVar);
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
                        List<RscMetadataItem> b3 = rscMetadata.b();
                        if (b3 != null && b3.size() >= 1) {
                            LinkedList linkedList2 = new LinkedList();
                            for (RscMetadataItem rscMetadataItem : b3) {
                                if (rscMetadataItem != null) {
                                    String a4 = rscMetadataItem.a();
                                    if (a4 != null && a4.length() >= 1) {
                                        try {
                                            try {
                                                z2Var = a3.a(new String(si.a(AbstractC0288g.a(Base64.decode(a4, i5)))));
                                            } catch (Throwable th3) {
                                                if ((rscMetadata.a(rscMetadataItem) & i3) != 0) {
                                                    d9.a(th3);
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            if ((rscMetadata.a(rscMetadataItem) & i4) != 0) {
                                                d9.a(th4);
                                            }
                                        }
                                        if (z2Var == null) {
                                            int h3 = rscMetadataItem.h();
                                            int d3 = rscMetadataItem.d();
                                            ArrayList arrayList2 = new ArrayList(Math.min(arrayList.size(), Integer.bitCount(h3)));
                                            int i7 = i6;
                                            for (hf hfVar2 : arrayList) {
                                                int i8 = 1 << i7;
                                                if ((h3 & i8) != 0) {
                                                    arrayList2.add(new Pair(hfVar2, Boolean.valueOf((d3 & i8) != 0 ? 1 : i6)));
                                                }
                                                i7++;
                                                i6 = 0;
                                            }
                                            if (arrayList2.size() >= 1) {
                                                linkedList2.add(new gf(z2Var, arrayList2, rscMetadataItem.i() != null ? rscMetadataItem.i().intValue() : 300, rscMetadataItem.g(), rscMetadataItem.c(), rscMetadataItem.f(), rscMetadataItem.e() != null ? rscMetadataItem.e().intValue() : 0, rscMetadata.a(rscMetadataItem)));
                                            }
                                            z2Var2 = null;
                                            i3 = 4;
                                            i4 = 2;
                                            i5 = 8;
                                            i6 = 0;
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
            ArrayList arrayList2 = this.f3749d;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    try {
                        ((hf) it.next()).a(this.f3746a);
                    } catch (Throwable th) {
                        RscMetadata rscMetadata2 = this.f3748c;
                        if (rscMetadata2 != null && (rscMetadata2.a() & 64) != 0) {
                            d9.a(th);
                        }
                    }
                }
            }
            this.f3748c = rscMetadata;
            this.f3749d = arrayList;
            this.f3750e = linkedList;
            if (arrayList != null) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    try {
                        ((hf) it2.next()).a(this.f3746a, this);
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

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a2, code lost:
    
        if ((r13 + (r0 * io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT)) < android.os.SystemClock.elapsedRealtime()) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0152 A[Catch: JSONException -> 0x014a, TryCatch #3 {JSONException -> 0x014a, blocks: (B:96:0x013b, B:98:0x0140, B:99:0x014c, B:101:0x0152, B:102:0x015b, B:104:0x0161, B:105:0x0166), top: B:95:0x013b }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0161 A[Catch: JSONException -> 0x014a, TryCatch #3 {JSONException -> 0x014a, blocks: (B:96:0x013b, B:98:0x0140, B:99:0x014c, B:101:0x0152, B:102:0x015b, B:104:0x0161, B:105:0x0166), top: B:95:0x013b }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0140 A[Catch: JSONException -> 0x014a, TryCatch #3 {JSONException -> 0x014a, blocks: (B:96:0x013b, B:98:0x0140, B:99:0x014c, B:101:0x0152, B:102:0x015b, B:104:0x0161, B:105:0x0166), top: B:95:0x013b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(Object obj) {
        int i3;
        Iterator it;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONArray a3;
        Integer num;
        Pair pair;
        Iterator it2;
        List a4 = a();
        if (a4 == null) {
            return null;
        }
        JSONObject jSONObject = null;
        for (Iterator it3 = a4.iterator(); it3.hasNext(); it3 = it) {
            gf gfVar = (gf) it3.next();
            try {
                it2 = gfVar.f3869b.iterator();
            } catch (Throwable th) {
                th = th;
            }
            while (it2.hasNext()) {
                Pair pair2 = (Pair) it2.next();
                try {
                } catch (Throwable th2) {
                    th = th2;
                    if (gfVar.a(256)) {
                        d9.a(th);
                    }
                    i3 = 0;
                    if ((i3 & 1) == 0) {
                    }
                }
                if (((hf) pair2.first).a(obj)) {
                    i3 = (((Boolean) pair2.second).booleanValue() ? 2 : 0) | 1;
                    if ((i3 & 1) == 0) {
                        it = it3;
                    } else {
                        z2 z2Var = gfVar.f3868a;
                        if ((i3 & 2) == 0) {
                            int i4 = gfVar.f3870c;
                            synchronized (this) {
                                pair = (Pair) this.f.get(z2Var);
                            }
                            if (pair != null && (r12 = (JSONObject) ((SoftReference) pair.second).get()) != null) {
                                long longValue = ((Long) pair.first).longValue();
                                it = it3;
                                jSONArray = null;
                            }
                        }
                        it = it3;
                        jSONArray = null;
                        JSONObject jSONObject2 = jSONArray;
                        if (jSONObject2 == null) {
                            try {
                                jSONArray2 = z2Var.a(this.f3746a, gfVar.f3871d, gfVar.f3872e);
                            } catch (Throwable th3) {
                                if (gfVar.a(8)) {
                                    d9.a(th3);
                                }
                                jSONArray2 = jSONArray;
                            }
                            if (jSONArray2 != null && (num = gfVar.f) != null) {
                                try {
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                                if ((num.intValue() == 1 ? new ff() : jSONArray) != null) {
                                    JSONArray jSONArray3 = new JSONArray();
                                    ArrayList arrayList = new ArrayList(jSONArray2.length());
                                    int length = jSONArray2.length();
                                    for (int i5 = 0; i5 < length; i5++) {
                                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i5);
                                        if (jSONObject3 != null) {
                                            try {
                                                arrayList.add(jSONObject3.getString(ff.f3798a));
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
                                        }
                                    }
                                    jSONArray3.put(new BloomFilterCreator().fromKeys(arrayList));
                                    jSONArray2 = jSONArray3;
                                    if (jSONArray2 != null && jSONArray2.length() > 0) {
                                        jSONObject2 = new JSONObject();
                                        try {
                                            if ((gfVar.f3873g & 1) != 0) {
                                                jSONObject2.put("currentTimeMillis", System.currentTimeMillis());
                                            }
                                            if ((gfVar.f3873g & 2) != 0) {
                                                jSONObject2.put("bootTimeMillis", SystemClock.elapsedRealtime());
                                            }
                                            a3 = a(gfVar);
                                            if (a3 != null) {
                                                jSONObject2.put("params", a3);
                                            }
                                            jSONObject2.put("items", jSONArray2);
                                        } catch (JSONException e3) {
                                            if (gfVar.a(32)) {
                                                d9.a(e3);
                                            }
                                        }
                                        a(z2Var, jSONObject2);
                                    }
                                }
                            }
                            if (jSONArray2 != null) {
                                jSONObject2 = new JSONObject();
                                if ((gfVar.f3873g & 1) != 0) {
                                }
                                if ((gfVar.f3873g & 2) != 0) {
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
                                JSONObject optJSONObject = jSONObject.optJSONObject(z2Var.f4850a);
                                if (optJSONObject == null) {
                                    optJSONObject = new JSONObject();
                                    jSONObject.put(z2Var.f4850a, optJSONObject);
                                }
                                JSONArray optJSONArray = optJSONObject.optJSONArray(z2Var.f4851b);
                                if (optJSONArray == null) {
                                    optJSONArray = new JSONArray();
                                    optJSONObject.put(z2Var.f4851b, optJSONArray);
                                }
                                optJSONArray.put(jSONObject2);
                            } catch (JSONException e4) {
                                if (gfVar.a(32)) {
                                    d9.a(e4);
                                }
                            }
                        }
                    }
                }
            }
            i3 = 0;
            if ((i3 & 1) == 0) {
            }
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            return si.b(jSONObject.toString());
        } catch (Throwable th6) {
            this.f3747b.getClass();
            RscMetadata S2 = MetaData.E().S();
            if (S2 == null || !S2.d()) {
                S2 = null;
            }
            if (S2 != null && (S2.a() & 16) != 0) {
                d9.a(th6);
            }
            return null;
        }
    }

    public final synchronized void a(z2 z2Var, JSONObject jSONObject) {
        this.f.put(z2Var, new Pair(Long.valueOf(SystemClock.elapsedRealtime()), new SoftReference(jSONObject)));
    }
}
