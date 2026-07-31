package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class pb0 implements fa0, ob0 {

    /* renamed from: f, reason: collision with root package name */
    private final ob0 f10161f;

    /* renamed from: g, reason: collision with root package name */
    private final HashSet<AbstractMap.SimpleEntry<String, t70<? super ob0>>> f10162g = new HashSet<>();

    public pb0(ob0 ob0Var) {
        this.f10161f = ob0Var;
    }

    @Override // com.google.android.gms.internal.ads.ob0
    public final void U0(String str, t70<? super ob0> t70Var) {
        this.f10161f.U0(str, t70Var);
        this.f10162g.remove(new AbstractMap.SimpleEntry(str, t70Var));
    }

    @Override // com.google.android.gms.internal.ads.ob0
    public final void X(String str, t70<? super ob0> t70Var) {
        this.f10161f.X(str, t70Var);
        this.f10162g.add(new AbstractMap.SimpleEntry<>(str, t70Var));
    }

    @Override // com.google.android.gms.internal.ads.fa0, com.google.android.gms.internal.ads.qa0
    public final /* synthetic */ void a(String str, String str2) {
        ea0.c(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.fa0, com.google.android.gms.internal.ads.qa0
    public final void b(String str) {
        this.f10161f.b(str);
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final /* synthetic */ void b1(String str, JSONObject jSONObject) {
        ea0.d(this, str, jSONObject);
    }

    public final void c() {
        Iterator<AbstractMap.SimpleEntry<String, t70<? super ob0>>> it = this.f10162g.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry<String, t70<? super ob0>> next = it.next();
            String valueOf = String.valueOf(next.getValue().toString());
            a3.r1.k(valueOf.length() != 0 ? "Unregistering eventhandler: ".concat(valueOf) : new String("Unregistering eventhandler: "));
            this.f10161f.U0(next.getKey(), next.getValue());
        }
        this.f10162g.clear();
    }

    @Override // com.google.android.gms.internal.ads.fa0, com.google.android.gms.internal.ads.da0
    public final /* synthetic */ void s(String str, JSONObject jSONObject) {
        ea0.b(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final /* synthetic */ void t(String str, Map map) {
        ea0.a(this, str, map);
    }
}
