package com.baidu.lbsapi.auth;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    private Context f4314a;

    /* renamed from: b, reason: collision with root package name */
    private HashMap<String, String> f4315b = null;

    /* renamed from: c, reason: collision with root package name */
    private b<String> f4316c = null;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4317a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f4318b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f4319c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f4320d;

        a(String str, int i8, String str2, String str3) {
            this.f4317a = str;
            this.f4318b = i8;
            this.f4319c = str2;
            this.f4320d = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.baidu.lbsapi.auth.b.a("postWithHttps start Thread id = " + String.valueOf(Thread.currentThread().getId()));
            e.this.a(new g(e.this.f4314a).a(e.this.f4315b, this.f4317a, this.f4318b, this.f4319c, this.f4320d));
        }
    }

    interface b<Result> {
        void a(Result result);
    }

    protected e(Context context) {
        this.f4314a = context;
    }

    private HashMap<String, String> a(HashMap<String, String> hashMap) {
        HashMap<String, String> hashMap2 = new HashMap<>();
        Iterator<String> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            String str = it.next().toString();
            hashMap2.put(str, hashMap.get(str));
        }
        return hashMap2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
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
        b<String> bVar = this.f4316c;
        if (bVar != null) {
            bVar.a(jSONObject.toString());
        }
    }

    protected void a(HashMap<String, String> hashMap, String str, int i8, String str2, String str3, b<String> bVar) {
        this.f4315b = a(hashMap);
        this.f4316c = bVar;
        new Thread(new a(str, i8, str2, str3)).start();
    }
}
