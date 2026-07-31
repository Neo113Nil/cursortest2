package com.ironsource;

import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class tv {

    /* renamed from: b, reason: collision with root package name */
    private int f19839b = 4;

    /* renamed from: c, reason: collision with root package name */
    private int f19840c = 4;

    /* renamed from: a, reason: collision with root package name */
    private HashMap<String, Boolean> f19838a = new a();

    class a extends HashMap<String, Boolean> {
        a() {
            put(vg.f20043k, Boolean.valueOf(tv.this.f19839b == 0));
            put(vg.f20044l, Boolean.valueOf(tv.this.f19840c == 0));
            Boolean bool = Boolean.FALSE;
            put(vg.f20045m, bool);
            put(vg.f20046n, bool);
        }
    }

    tv() {
    }

    public JSONObject a() {
        return new JSONObject(this.f19838a);
    }

    void a(String str, int i4, boolean z4) {
        boolean z5 = false;
        if (this.f19838a.containsKey(str)) {
            this.f19838a.put(str, Boolean.valueOf(i4 == 0));
        }
        this.f19838a.put(vg.f20045m, Boolean.valueOf(z4));
        if ((this.f19838a.get(vg.f20044l).booleanValue() || this.f19838a.get(vg.f20043k).booleanValue()) && this.f19838a.get(vg.f20045m).booleanValue()) {
            z5 = true;
        }
        this.f19838a.put(vg.f20046n, Boolean.valueOf(z5));
    }
}
