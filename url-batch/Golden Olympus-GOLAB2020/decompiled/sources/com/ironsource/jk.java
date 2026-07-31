package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ironsource.b9;
import com.ironsource.da;
import com.ironsource.fh;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class jk {

    /* renamed from: b, reason: collision with root package name */
    private static final String f16853b = "jk";

    /* renamed from: c, reason: collision with root package name */
    private static final String f16854c = "supersonic_shared_preferen";

    /* renamed from: d, reason: collision with root package name */
    private static final String f16855d = "version";

    /* renamed from: e, reason: collision with root package name */
    private static final String f16856e = "back_button_state";

    /* renamed from: f, reason: collision with root package name */
    private static final String f16857f = "search_keys";

    /* renamed from: g, reason: collision with root package name */
    private static final String f16858g = "^\\d+_\\d+$";

    /* renamed from: h, reason: collision with root package name */
    private static jk f16859h;

    /* renamed from: a, reason: collision with root package name */
    private SharedPreferences f16860a;

    private jk(Context context) {
        this.f16860a = context.getSharedPreferences("supersonic_shared_preferen", 0);
    }

    public static synchronized jk a(Context context) {
        jk jkVar;
        synchronized (jk.class) {
            try {
                if (f16859h == null) {
                    f16859h = new jk(context);
                }
                jkVar = f16859h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jkVar;
    }

    public static synchronized jk e() {
        jk jkVar;
        synchronized (jk.class) {
            jkVar = f16859h;
        }
        return jkVar;
    }

    public fh.a b() {
        int parseInt = Integer.parseInt(this.f16860a.getString(f16856e, "2"));
        return parseInt == 0 ? fh.a.None : parseInt == 1 ? fh.a.Device : parseInt == 2 ? fh.a.Controller : fh.a.Controller;
    }

    public String c() {
        return this.f16860a.getString("version", "-1");
    }

    public List<String> d() {
        String string = this.f16860a.getString(f16857f, null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            gr grVar = new gr(string);
            if (grVar.a(b9.h.f15458R)) {
                try {
                    arrayList.addAll(grVar.a((JSONArray) grVar.b(b9.h.f15458R)));
                    return arrayList;
                } catch (JSONException e4) {
                    o9.d().a(e4);
                    IronLog.INTERNAL.error(e4.toString());
                }
            }
        }
        return arrayList;
    }

    private boolean b(String str) {
        return str.matches(f16858g);
    }

    public String a(String str) {
        String string = this.f16860a.getString(str, null);
        return string != null ? string : "{}";
    }

    public void c(String str) {
        SharedPreferences.Editor edit = this.f16860a.edit();
        edit.putString(f16856e, str);
        edit.apply();
    }

    public void d(String str) {
        if (c().equalsIgnoreCase(str)) {
            return;
        }
        SharedPreferences.Editor edit = this.f16860a.edit();
        edit.putString("version", str);
        edit.apply();
    }

    public void e(String str) {
        SharedPreferences.Editor edit = this.f16860a.edit();
        edit.putString(f16857f, str);
        edit.apply();
    }

    public ArrayList<String> a() {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] strArr = (String[]) this.f16860a.getAll().keySet().toArray(new String[0]);
        SharedPreferences.Editor edit = this.f16860a.edit();
        for (String str : strArr) {
            if (b(str)) {
                arrayList.add(str);
                edit.remove(str);
            }
        }
        edit.apply();
        return arrayList;
    }

    public void a(String str, String str2) {
        SharedPreferences.Editor edit = this.f16860a.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public boolean a(String str, String str2, String str3) {
        String string = this.f16860a.getString("ssaUserData", null);
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.isNull(str2)) {
                return false;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(str2);
            if (jSONObject2.isNull(str3)) {
                return false;
            }
            jSONObject2.getJSONObject(str3).put(da.a.f15878d, str);
            SharedPreferences.Editor edit = this.f16860a.edit();
            edit.putString("ssaUserData", jSONObject.toString());
            edit.apply();
            return true;
        } catch (JSONException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            return false;
        }
    }
}
