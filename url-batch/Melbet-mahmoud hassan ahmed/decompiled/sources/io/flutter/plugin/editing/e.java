package io.flutter.plugin.editing;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private CharSequence f17299a;

    /* renamed from: b, reason: collision with root package name */
    private CharSequence f17300b;

    /* renamed from: c, reason: collision with root package name */
    private int f17301c;

    /* renamed from: d, reason: collision with root package name */
    private int f17302d;

    /* renamed from: e, reason: collision with root package name */
    private int f17303e;

    /* renamed from: f, reason: collision with root package name */
    private int f17304f;

    /* renamed from: g, reason: collision with root package name */
    private int f17305g;

    /* renamed from: h, reason: collision with root package name */
    private int f17306h;

    public e(CharSequence charSequence, int i7, int i8, int i9, int i10) {
        this.f17303e = i7;
        this.f17304f = i8;
        this.f17305g = i9;
        this.f17306h = i10;
        a(charSequence, "", -1, -1);
    }

    public e(CharSequence charSequence, int i7, int i8, CharSequence charSequence2, int i9, int i10, int i11, int i12) {
        this.f17303e = i9;
        this.f17304f = i10;
        this.f17305g = i11;
        this.f17306h = i12;
        a(charSequence, charSequence2.toString(), i7, i8);
    }

    private void a(CharSequence charSequence, CharSequence charSequence2, int i7, int i8) {
        this.f17299a = charSequence;
        this.f17300b = charSequence2;
        this.f17301c = i7;
        this.f17302d = i8;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oldText", this.f17299a.toString());
            jSONObject.put("deltaText", this.f17300b.toString());
            jSONObject.put("deltaStart", this.f17301c);
            jSONObject.put("deltaEnd", this.f17302d);
            jSONObject.put("selectionBase", this.f17303e);
            jSONObject.put("selectionExtent", this.f17304f);
            jSONObject.put("composingBase", this.f17305g);
            jSONObject.put("composingExtent", this.f17306h);
        } catch (JSONException e7) {
            z4.b.b("TextEditingDelta", "unable to create JSONObject: " + e7);
        }
        return jSONObject;
    }
}
