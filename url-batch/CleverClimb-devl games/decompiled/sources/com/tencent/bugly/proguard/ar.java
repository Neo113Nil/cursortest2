package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public final class ar extends k implements Cloneable {
    private static ArrayList<aq> f;
    private static Map<String, String> g;

    /* renamed from: a, reason: collision with root package name */
    public byte f8734a = 0;

    /* renamed from: b, reason: collision with root package name */
    public String f8735b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f8736c = "";

    /* renamed from: d, reason: collision with root package name */
    public ArrayList<aq> f8737d = null;
    public Map<String, String> e = null;

    @Override // com.tencent.bugly.proguard.k
    public final void a(StringBuilder sb, int i) {
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(j jVar) {
        jVar.a(this.f8734a, 0);
        if (this.f8735b != null) {
            jVar.a(this.f8735b, 1);
        }
        if (this.f8736c != null) {
            jVar.a(this.f8736c, 2);
        }
        if (this.f8737d != null) {
            jVar.a((Collection) this.f8737d, 3);
        }
        if (this.e != null) {
            jVar.a((Map) this.e, 4);
        }
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(i iVar) {
        this.f8734a = iVar.a(this.f8734a, 0, true);
        this.f8735b = iVar.b(1, false);
        this.f8736c = iVar.b(2, false);
        if (f == null) {
            f = new ArrayList<>();
            f.add(new aq());
        }
        this.f8737d = (ArrayList) iVar.a((i) f, 3, false);
        if (g == null) {
            g = new HashMap();
            g.put("", "");
        }
        this.e = (Map) iVar.a((i) g, 4, false);
    }
}
