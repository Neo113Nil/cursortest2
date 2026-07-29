package com.ironsource.b.e;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ProviderSettings.java */
/* loaded from: classes2.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private String f6823a;

    /* renamed from: b, reason: collision with root package name */
    private String f6824b;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f6825c;

    /* renamed from: d, reason: collision with root package name */
    private JSONObject f6826d;
    private JSONObject e;
    private JSONObject f;
    private String g;
    private boolean h;
    private String i;
    private int j;
    private int k;
    private int l;

    public o(String str) {
        this.f6823a = str;
        this.i = str;
        this.f6824b = str;
        this.f6826d = new JSONObject();
        this.e = new JSONObject();
        this.f = new JSONObject();
        this.f6825c = new JSONObject();
        this.j = -1;
        this.k = -1;
        this.l = -1;
    }

    public o(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.f6823a = str;
        this.i = str;
        this.f6824b = str2;
        this.f6826d = jSONObject2;
        this.e = jSONObject3;
        this.f = jSONObject4;
        this.f6825c = jSONObject;
        this.j = -1;
        this.k = -1;
        this.l = -1;
    }

    public o(o oVar) {
        this.f6823a = oVar.a();
        this.i = oVar.a();
        this.f6824b = oVar.c();
        this.f6826d = oVar.b();
        this.e = oVar.d();
        this.f = oVar.e();
        this.f6825c = oVar.i();
        this.j = oVar.l();
        this.k = oVar.k();
        this.l = oVar.j();
    }

    public String a() {
        return this.f6823a;
    }

    public JSONObject b() {
        return this.f6826d;
    }

    public String c() {
        return this.f6824b;
    }

    public void a(JSONObject jSONObject) {
        this.f6826d = jSONObject;
    }

    public void a(String str, Object obj) {
        try {
            this.f6826d.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public JSONObject d() {
        return this.e;
    }

    public void b(JSONObject jSONObject) {
        this.e = jSONObject;
    }

    public void b(String str, Object obj) {
        try {
            this.e.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public JSONObject e() {
        return this.f;
    }

    public void c(JSONObject jSONObject) {
        this.f = jSONObject;
    }

    public void a(String str) {
        this.g = str;
    }

    public String f() {
        return this.g;
    }

    public void a(boolean z) {
        this.h = z;
    }

    public boolean g() {
        return this.h;
    }

    public String h() {
        return this.i;
    }

    public JSONObject i() {
        return this.f6825c;
    }

    public void a(int i) {
        this.l = i;
    }

    public void b(int i) {
        this.k = i;
    }

    public void c(int i) {
        this.j = i;
    }

    public int j() {
        return this.l;
    }

    public int k() {
        return this.k;
    }

    public int l() {
        return this.j;
    }
}
