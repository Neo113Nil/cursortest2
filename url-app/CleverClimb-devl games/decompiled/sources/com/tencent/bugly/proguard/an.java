package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public final class an extends k {
    private static byte[] i = {0};
    private static Map<String, String> j = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public byte f8720a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f8721b = 0;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f8722c = null;

    /* renamed from: d, reason: collision with root package name */
    public String f8723d = "";
    public long e = 0;
    private String h = "";
    public String f = "";
    public Map<String, String> g = null;

    @Override // com.tencent.bugly.proguard.k
    public final void a(j jVar) {
        jVar.a(this.f8720a, 0);
        jVar.a(this.f8721b, 1);
        if (this.f8722c != null) {
            jVar.a(this.f8722c, 2);
        }
        if (this.f8723d != null) {
            jVar.a(this.f8723d, 3);
        }
        jVar.a(this.e, 4);
        if (this.h != null) {
            jVar.a(this.h, 5);
        }
        if (this.f != null) {
            jVar.a(this.f, 6);
        }
        if (this.g != null) {
            jVar.a((Map) this.g, 7);
        }
    }

    static {
        j.put("", "");
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(i iVar) {
        this.f8720a = iVar.a(this.f8720a, 0, true);
        this.f8721b = iVar.a(this.f8721b, 1, true);
        byte[] bArr = i;
        this.f8722c = iVar.c(2, false);
        this.f8723d = iVar.b(3, false);
        this.e = iVar.a(this.e, 4, false);
        this.h = iVar.b(5, false);
        this.f = iVar.b(6, false);
        this.g = (Map) iVar.a((i) j, 7, false);
    }
}
