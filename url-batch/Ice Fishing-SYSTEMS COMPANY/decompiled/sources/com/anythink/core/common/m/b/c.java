package com.anythink.core.common.m.b;

import android.text.TextUtils;
import com.anythink.core.api.ATSDK;
import com.anythink.core.common.n.a.i;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private int f14657a;

    /* renamed from: b, reason: collision with root package name */
    private a f14658b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int[] f14659a;

        /* renamed from: b, reason: collision with root package name */
        private final long f14660b;

        /* renamed from: c, reason: collision with root package name */
        private final b[] f14661c;

        public a(int[] iArr, long j9, b[] bVarArr) {
            this.f14659a = iArr;
            this.f14660b = j9;
            this.f14661c = bVarArr;
        }

        private long c() {
            return this.f14660b;
        }

        public final int[] a() {
            return this.f14659a;
        }

        public final b[] b() {
            return this.f14661c;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f14662a;

        /* renamed from: b, reason: collision with root package name */
        private final int f14663b;

        /* renamed from: c, reason: collision with root package name */
        private final long f14664c;

        public b(String str, int i, long j9) {
            this.f14662a = str;
            this.f14663b = i;
            this.f14664c = j9;
        }

        public final String a() {
            return this.f14662a;
        }

        public final int b() {
            return this.f14663b;
        }

        public final long c() {
            return this.f14664c;
        }
    }

    private c() {
    }

    public static c a(JSONObject jSONObject) {
        int[] iArr = null;
        if (jSONObject == null) {
            return null;
        }
        c cVar = new c();
        cVar.f14657a = jSONObject.optInt("net_type", 1);
        JSONObject optJSONObject = jSONObject.optJSONObject("net_d");
        if (optJSONObject != null) {
            long optLong = optJSONObject.optLong("s_timeout", 500L);
            JSONArray optJSONArray = optJSONObject.optJSONArray("s_i");
            JSONArray optJSONArray2 = optJSONObject.optJSONArray("srv");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                iArr = new int[optJSONArray.length()];
                for (int i = 0; i < optJSONArray.length(); i++) {
                    iArr[i] = optJSONArray.optInt(i);
                }
            }
            ArrayList arrayList = new ArrayList();
            if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                for (int i4 = 0; i4 < optJSONArray2.length(); i4++) {
                    JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i4);
                    if (optJSONObject2 != null) {
                        String optString = optJSONObject2.optString("ip");
                        if (!TextUtils.isEmpty(optString)) {
                            arrayList.add(new b(optString, optJSONObject2.optInt("port", 57), optJSONObject2.optLong("timeout", 500L)));
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                cVar.f14658b = new a(iArr, optLong, (b[]) arrayList.toArray(new b[0]));
            }
        }
        return cVar;
    }

    public final int b() {
        return this.f14657a;
    }

    public final boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        a aVar = this.f14658b;
        boolean z8 = (aVar == null || aVar.b() == null || this.f14658b.b().length <= 0 || this.f14658b.a() == null || this.f14658b.a().length <= 0 || ATSDK.isCnSDK()) ? false : true;
        if (!z8) {
            return z8;
        }
        int[] a9 = this.f14658b.a();
        try {
            int a10 = g.a(str);
            for (int i : a9) {
                if (a10 == i) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public final i[] a() {
        a aVar = this.f14658b;
        i[] iVarArr = null;
        b[] b9 = aVar != null ? aVar.b() : null;
        if (b9 != null && b9.length != 0) {
            iVarArr = new i[b9.length];
            for (int i = 0; i < b9.length; i++) {
                b bVar = b9[i];
                if (bVar != null) {
                    iVarArr[i] = new com.anythink.core.common.n.a.g(bVar.a(), bVar.b(), bVar.c());
                }
            }
        }
        return iVarArr;
    }

    private void a(int i) {
        this.f14657a = i;
    }

    private void a(a aVar) {
        this.f14658b = aVar;
    }
}
