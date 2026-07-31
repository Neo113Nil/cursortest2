package com.ironsource;

import android.text.TextUtils;
import com.ironsource.da;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC1451e {

    /* renamed from: a, reason: collision with root package name */
    private final String f15938a = "eventId";

    /* renamed from: b, reason: collision with root package name */
    private final String f15939b = da.a.f15878d;

    /* renamed from: c, reason: collision with root package name */
    private final String f15940c = "InterstitialEvents";

    /* renamed from: d, reason: collision with root package name */
    private final String f15941d = "events";

    /* renamed from: e, reason: collision with root package name */
    private final String f15942e = "events";

    /* renamed from: f, reason: collision with root package name */
    JSONObject f15943f;

    /* renamed from: g, reason: collision with root package name */
    int f15944g;

    /* renamed from: h, reason: collision with root package name */
    private String f15945h;

    AbstractC1451e() {
    }

    private String a(int i4) {
        return i4 != 2 ? "events" : "InterstitialEvents";
    }

    protected abstract String a();

    public abstract String a(ArrayList<zb> arrayList, JSONObject jSONObject);

    String b() {
        return TextUtils.isEmpty(this.f15945h) ? a() : this.f15945h;
    }

    public abstract String c();

    String a(JSONArray jSONArray) {
        try {
            if (this.f15943f == null) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(this.f15943f.toString());
            jSONObject.put(da.a.f15878d, IronSourceUtils.getTimestamp());
            jSONObject.put(a(this.f15944g), jSONArray);
            return jSONObject.toString();
        } catch (Exception e4) {
            o9.d().a(e4);
            return "";
        }
    }

    JSONObject a(zb zbVar) {
        try {
            String a4 = zbVar.a();
            JSONObject jSONObject = !TextUtils.isEmpty(a4) ? new JSONObject(a4) : new JSONObject();
            jSONObject.put("eventId", zbVar.c());
            jSONObject.put(da.a.f15878d, zbVar.d());
            return jSONObject;
        } catch (JSONException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            return null;
        }
    }

    void a(String str) {
        this.f15945h = str;
    }
}
