package com.cmplay.gppay.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    Map<String, j> f4092a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    Map<String, g> f4093b = new HashMap();

    d() {
    }

    public j a(String str) {
        return this.f4092a.get(str);
    }

    public void a(g gVar) {
        this.f4093b.put(gVar.d(), gVar);
    }

    public void a(j jVar) {
        this.f4092a.put(jVar.a(), jVar);
    }

    public g b(String str) {
        return this.f4093b.get(str);
    }

    public List<String> c(String str) {
        ArrayList arrayList = new ArrayList();
        for (g gVar : this.f4093b.values()) {
            if (gVar.a().equals(str)) {
                arrayList.add(gVar.d());
            }
        }
        return arrayList;
    }
}
