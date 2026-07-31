package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class oc0<I, O> implements xa3<I, O> {

    /* renamed from: a, reason: collision with root package name */
    private final tb0<O> f9602a;

    /* renamed from: b, reason: collision with root package name */
    private final vb0<I> f9603b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9604c = "google.afma.activeView.handleUpdate";

    /* renamed from: d, reason: collision with root package name */
    private final cc3<ob0> f9605d;

    oc0(cc3<ob0> cc3Var, String str, vb0<I> vb0Var, tb0<O> tb0Var) {
        this.f9605d = cc3Var;
        this.f9603b = vb0Var;
        this.f9602a = tb0Var;
    }

    public final cc3<O> a(final I i7) {
        return rb3.n(this.f9605d, new xa3() { // from class: com.google.android.gms.internal.ads.mc0
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return oc0.this.b(i7, (ob0) obj);
            }
        }, wo0.f13899f);
    }

    final /* synthetic */ cc3 b(Object obj, ob0 ob0Var) {
        bp0 bp0Var = new bp0();
        y2.t.q();
        String uuid = UUID.randomUUID().toString();
        s70.f11707o.c(uuid, new nc0(this, bp0Var));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", uuid);
        jSONObject.put("args", (JSONObject) obj);
        ob0Var.b1(this.f9604c, jSONObject);
        return bp0Var;
    }

    @Override // com.google.android.gms.internal.ads.xa3
    public final cc3<O> c(I i7) {
        return a(i7);
    }
}
