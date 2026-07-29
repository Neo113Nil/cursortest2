package com.facebook.ads.internal.h;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public String f5132a;

    /* renamed from: b, reason: collision with root package name */
    public String f5133b;

    /* renamed from: c, reason: collision with root package name */
    public String f5134c;

    /* renamed from: d, reason: collision with root package name */
    public Date f5135d;
    public boolean e;

    public b(String str, String str2, String str3, Date date) {
        this.f5132a = str;
        this.f5133b = str2;
        this.f5134c = str3;
        this.f5135d = date;
        this.e = (str2 == null || str3 == null) ? false : true;
    }

    public b(JSONObject jSONObject) {
        this(jSONObject.optString("url"), jSONObject.optString("key"), jSONObject.optString("value"), new Date(jSONObject.optLong("expiration") * 1000));
    }

    public static List<b> a(String str) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        if (str == null) {
            return null;
        }
        try {
            jSONArray = new JSONArray(str);
        } catch (JSONException unused) {
            jSONArray = null;
        }
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                jSONObject = jSONArray.getJSONObject(i);
            } catch (JSONException unused2) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                arrayList.add(new b(jSONObject));
            }
        }
        return arrayList;
    }

    public String a() {
        Date date = this.f5135d;
        if (date == null) {
            date = new Date();
            date.setTime(date.getTime() + 3600000);
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd-MMM-yyyy HH:mm:ss zzz");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(date);
    }

    public boolean b() {
        return (this.f5133b == null || this.f5134c == null || this.f5132a == null) ? false : true;
    }
}
