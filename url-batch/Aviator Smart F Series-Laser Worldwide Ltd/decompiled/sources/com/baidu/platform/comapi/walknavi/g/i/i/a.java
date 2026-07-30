package com.baidu.platform.comapi.walknavi.g.i.i;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.baidu.ar.constants.ARConfigKey;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.platform.comapi.walknavi.g.i.j.d;
import com.baidu.platform.comapi.walknavi.g.i.k.b;
import com.baidu.platform.comapi.walknavi.g.i.k.e;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static a f10057a;

    /* renamed from: b, reason: collision with root package name */
    private d f10058b;

    /* renamed from: c, reason: collision with root package name */
    private com.baidu.platform.comapi.walknavi.g.i.e.a f10059c;

    /* renamed from: d, reason: collision with root package name */
    private String f10060d;

    /* renamed from: e, reason: collision with root package name */
    private Context f10061e;

    private a() {
    }

    public static a b() {
        if (f10057a == null) {
            synchronized (a.class) {
                try {
                    if (f10057a == null) {
                        f10057a = new a();
                    }
                } finally {
                }
            }
        }
        return f10057a;
    }

    public void a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("event_id", str);
        hashMap.put("request_id", this.f10060d);
        com.baidu.platform.comapi.walknavi.g.i.e.a aVar = this.f10059c;
        if (aVar != null) {
            hashMap.put("ar_type", String.valueOf(aVar.c()));
        }
        com.baidu.platform.comapi.walknavi.g.i.k.a.a("params is : " + hashMap.toString());
        Context context = this.f10061e;
        if (context != null) {
            a(context, hashMap);
        }
    }

    private void a(Context context, Map<String, String> map) {
        String str = com.baidu.platform.comapi.walknavi.g.i.k.d.f10071a + com.baidu.platform.comapi.walknavi.g.i.k.d.f10073c + "/count_ar";
        String uuid = new e(context).a().toString();
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            com.baidu.platform.comapi.walknavi.g.i.e.a aVar = this.f10059c;
            if (aVar != null) {
                if (!TextUtils.isEmpty(aVar.b())) {
                    jSONObject.put("ar_key", this.f10059c.b());
                }
                jSONObject.put(ARConfigKey.AR_ID, this.f10059c.a());
            }
            com.baidu.platform.comapi.walknavi.g.i.j.e.a(context, jSONObject);
            jSONObject.put("time", String.valueOf(Long.valueOf(System.currentTimeMillis())));
            jSONObject.put(HttpConstants.HTTP_OS_TYPE, HttpConstants.OS_TYPE_VALUE);
            jSONObject.put(HttpConstants.OS_VERSION, Build.MODEL);
            jSONObject.put(HttpConstants.DEVICE_TYPE, Build.BRAND);
            jSONObject.put("device_id", uuid);
            int i8 = Build.VERSION.SDK_INT;
            jSONObject.put(HttpConstants.OS_VERSION, i8);
            jSONObject.put(HttpConstants.APP_VERSION, b.a());
            jSONObject.put(HttpConstants.HTTP_ENGINE_VERSION, b.a());
            if (!TextUtils.isEmpty(b.a(context))) {
                jSONObject.put(HttpConstants.HTTP_APP_ID, b.a(context));
            }
            jSONObject.put(HttpConstants.HTTP_SYSTEM_VERSION, i8);
        } catch (Exception unused) {
        }
        d dVar = new d(str, null);
        this.f10058b = dVar;
        dVar.execute(jSONObject.toString());
    }

    public void a() {
        d dVar = this.f10058b;
        if (dVar != null && !dVar.isCancelled()) {
            this.f10058b.cancel(true);
            this.f10058b = null;
        }
        if (f10057a != null) {
            f10057a = null;
        }
        this.f10060d = null;
    }
}
