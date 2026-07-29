package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public final class aq extends k {
    private static Map<String, String> i = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public long f8730a = 0;

    /* renamed from: b, reason: collision with root package name */
    public byte f8731b = 0;

    /* renamed from: c, reason: collision with root package name */
    public String f8732c = "";

    /* renamed from: d, reason: collision with root package name */
    public String f8733d = "";
    public String e = "";
    public Map<String, String> f = null;
    public String g = "";
    public boolean h = true;

    @Override // com.tencent.bugly.proguard.k
    public final void a(j jVar) {
        jVar.a(this.f8730a, 0);
        jVar.a(this.f8731b, 1);
        if (this.f8732c != null) {
            jVar.a(this.f8732c, 2);
        }
        if (this.f8733d != null) {
            jVar.a(this.f8733d, 3);
        }
        if (this.e != null) {
            jVar.a(this.e, 4);
        }
        if (this.f != null) {
            jVar.a((Map) this.f, 5);
        }
        if (this.g != null) {
            jVar.a(this.g, 6);
        }
        jVar.a(this.h, 7);
    }

    static {
        i.put("", "");
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(i iVar) {
        this.f8730a = iVar.a(this.f8730a, 0, true);
        this.f8731b = iVar.a(this.f8731b, 1, true);
        this.f8732c = iVar.b(2, false);
        this.f8733d = iVar.b(3, false);
        this.e = iVar.b(4, false);
        this.f = (Map) iVar.a((i) i, 5, false);
        this.g = iVar.b(6, false);
        boolean z = this.h;
        this.h = iVar.a(7, false);
    }
}
