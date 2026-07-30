package com.baidu.lbsapi.auth;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    private Context f4322a;

    /* renamed from: b, reason: collision with root package name */
    private List<HashMap<String, String>> f4323b = null;

    /* renamed from: c, reason: collision with root package name */
    private b<String> f4324c = null;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4325a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f4326b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f4327c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f4328d;

        a(String str, int i8, String str2, String str3) {
            this.f4325a = str;
            this.f4326b = i8;
            this.f4327c = str2;
            this.f4328d = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.a(fVar.f4323b, this.f4325a, this.f4326b, this.f4327c, this.f4328d);
        }
    }

    interface b<Result> {
        void a(Result result);
    }

    protected f(Context context) {
        this.f4322a = context;
    }

    private List<HashMap<String, String>> a(HashMap<String, String> hashMap, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        if (strArr == null || strArr.length <= 0) {
            HashMap hashMap2 = new HashMap();
            Iterator<String> it = hashMap.keySet().iterator();
            while (it.hasNext()) {
                String str = it.next().toString();
                hashMap2.put(str, hashMap.get(str));
            }
            arrayList.add(hashMap2);
        } else {
            for (String str2 : strArr) {
                HashMap hashMap3 = new HashMap();
                Iterator<String> it2 = hashMap.keySet().iterator();
                while (it2.hasNext()) {
                    String str3 = it2.next().toString();
                    hashMap3.put(str3, hashMap.get(str3));
                }
                hashMap3.put("mcode", str2);
                arrayList.add(hashMap3);
            }
        }
        return arrayList;
    }

    private void a(String str) {
        JSONObject jSONObject;
        if (str == null) {
            str = "";
        }
        try {
            jSONObject = new JSONObject(str);
            if (!jSONObject.has("status")) {
                jSONObject.put("status", -1);
            }
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("status", -1);
            } catch (JSONException e8) {
                e8.printStackTrace();
            }
        }
        b<String> bVar = this.f4324c;
        if (bVar != null) {
            bVar.a(jSONObject.toString());
        }
    }

    protected void a(HashMap<String, String> hashMap, String[] strArr, String str, int i8, String str2, String str3, b<String> bVar) {
        this.f4323b = a(hashMap, strArr);
        this.f4324c = bVar;
        new Thread(new a(str, i8, str2, str3)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<HashMap<String, String>> list, String str, int i8, String str2, String str3) {
        int i9;
        com.baidu.lbsapi.auth.b.a("syncConnect start Thread id = " + String.valueOf(Thread.currentThread().getId()));
        if (list == null || list.size() == 0) {
            com.baidu.lbsapi.auth.b.b("syncConnect failed,params list is null or size is 0");
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < list.size()) {
            com.baidu.lbsapi.auth.b.a("syncConnect resuest " + i10 + "  start!!!");
            HashMap<String, String> hashMap = list.get(i10);
            g gVar = new g(this.f4322a);
            if (gVar.a()) {
                String a8 = gVar.a(hashMap, str, i8, str2, str3);
                if (a8 == null) {
                    a8 = "";
                }
                com.baidu.lbsapi.auth.b.a("syncConnect resuest " + i10 + "  result:" + a8);
                arrayList.add(a8);
                try {
                    JSONObject jSONObject = new JSONObject(a8);
                    if (jSONObject.has("status") && jSONObject.getInt("status") == 0) {
                        com.baidu.lbsapi.auth.b.a("auth end and break");
                        a(a8);
                        return;
                    }
                } catch (JSONException unused) {
                    com.baidu.lbsapi.auth.b.a("continue-------------------------------");
                }
            } else {
                com.baidu.lbsapi.auth.b.a("Current network is not available.");
                arrayList.add(ErrorMessage.a("Current network is not available."));
            }
            com.baidu.lbsapi.auth.b.a("syncConnect end");
            i10++;
        }
        com.baidu.lbsapi.auth.b.a("--iiiiii:" + i10 + "<><>paramList.size():" + list.size() + "<><>authResults.size():" + arrayList.size());
        if (list.size() <= 0 || i10 != list.size() || arrayList.size() <= 0 || i10 != arrayList.size() || i10 - 1 <= 0) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject((String) arrayList.get(i9));
            if (!jSONObject2.has("status") || jSONObject2.getInt("status") == 0) {
                return;
            }
            com.baidu.lbsapi.auth.b.a("i-1 result is not 0,return first result");
            a((String) arrayList.get(0));
        } catch (JSONException e8) {
            a(ErrorMessage.a("JSONException:" + e8.getMessage()));
        }
    }
}
