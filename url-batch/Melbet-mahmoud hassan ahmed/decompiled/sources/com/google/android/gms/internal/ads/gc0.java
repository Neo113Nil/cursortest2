package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class gc0<I, O> implements rb0<I, O> {

    /* renamed from: a, reason: collision with root package name */
    private final tb0<O> f5553a;

    /* renamed from: b, reason: collision with root package name */
    private final vb0<I> f5554b;

    /* renamed from: c, reason: collision with root package name */
    private final nb0 f5555c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5556d;

    gc0(nb0 nb0Var, String str, vb0<I> vb0Var, tb0<O> tb0Var) {
        this.f5555c = nb0Var;
        this.f5556d = str;
        this.f5554b = vb0Var;
        this.f5553a = tb0Var;
    }

    static /* bridge */ /* synthetic */ void d(gc0 gc0Var, hb0 hb0Var, ob0 ob0Var, Object obj, bp0 bp0Var) {
        try {
            y2.t.q();
            String uuid = UUID.randomUUID().toString();
            s70.f11707o.c(uuid, new fc0(gc0Var, hb0Var, bp0Var));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", gc0Var.f5554b.a(obj));
            ob0Var.b1(gc0Var.f5556d, jSONObject);
        } catch (Exception e7) {
            try {
                bp0Var.f(e7);
                io0.e("Unable to invokeJavascript", e7);
            } finally {
                hb0Var.g();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.rb0
    public final cc3<O> a(I i7) {
        bp0 bp0Var = new bp0();
        hb0 b7 = this.f5555c.b(null);
        b7.e(new dc0(this, b7, i7, bp0Var), new ec0(this, bp0Var, b7));
        return bp0Var;
    }

    @Override // com.google.android.gms.internal.ads.xa3
    public final cc3<O> c(I i7) {
        return a(i7);
    }
}
