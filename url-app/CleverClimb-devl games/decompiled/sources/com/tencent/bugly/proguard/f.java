package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public final class f extends k {
    public byte[] e;
    private Map<String, String> i;
    private Map<String, String> j;
    private static /* synthetic */ boolean m = !f.class.desiredAssertionStatus();
    private static byte[] k = null;
    private static Map<String, String> l = null;

    /* renamed from: a, reason: collision with root package name */
    public short f8740a = 0;
    private byte f = 0;
    private int g = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f8741b = 0;

    /* renamed from: c, reason: collision with root package name */
    public String f8742c = null;

    /* renamed from: d, reason: collision with root package name */
    public String f8743d = null;
    private int h = 0;

    public final boolean equals(Object obj) {
        f fVar = (f) obj;
        return l.a(1, (int) fVar.f8740a) && l.a(1, (int) fVar.f) && l.a(1, fVar.g) && l.a(1, fVar.f8741b) && l.a((Object) 1, (Object) fVar.f8742c) && l.a((Object) 1, (Object) fVar.f8743d) && l.a((Object) 1, (Object) fVar.e) && l.a(1, fVar.h) && l.a((Object) 1, (Object) fVar.i) && l.a((Object) 1, (Object) fVar.j);
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (m) {
                return null;
            }
            throw new AssertionError();
        }
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(j jVar) {
        jVar.a(this.f8740a, 1);
        jVar.a(this.f, 2);
        jVar.a(this.g, 3);
        jVar.a(this.f8741b, 4);
        jVar.a(this.f8742c, 5);
        jVar.a(this.f8743d, 6);
        jVar.a(this.e, 7);
        jVar.a(this.h, 8);
        jVar.a((Map) this.i, 9);
        jVar.a((Map) this.j, 10);
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(i iVar) {
        try {
            this.f8740a = iVar.a(this.f8740a, 1, true);
            this.f = iVar.a(this.f, 2, true);
            this.g = iVar.a(this.g, 3, true);
            this.f8741b = iVar.a(this.f8741b, 4, true);
            this.f8742c = iVar.b(5, true);
            this.f8743d = iVar.b(6, true);
            if (k == null) {
                k = new byte[]{0};
            }
            byte[] bArr = k;
            this.e = iVar.c(7, true);
            this.h = iVar.a(this.h, 8, true);
            if (l == null) {
                HashMap hashMap = new HashMap();
                l = hashMap;
                hashMap.put("", "");
            }
            this.i = (Map) iVar.a((i) l, 9, true);
            if (l == null) {
                HashMap hashMap2 = new HashMap();
                l = hashMap2;
                hashMap2.put("", "");
            }
            this.j = (Map) iVar.a((i) l, 10, true);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("RequestPacket decode error " + e.a(this.e));
            throw new RuntimeException(e);
        }
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(StringBuilder sb, int i) {
        h hVar = new h(sb, i);
        hVar.a(this.f8740a, "iVersion");
        hVar.a(this.f, "cPacketType");
        hVar.a(this.g, "iMessageType");
        hVar.a(this.f8741b, "iRequestId");
        hVar.a(this.f8742c, "sServantName");
        hVar.a(this.f8743d, "sFuncName");
        hVar.a(this.e, "sBuffer");
        hVar.a(this.h, "iTimeout");
        hVar.a((Map) this.i, com.umeng.analytics.pro.b.M);
        hVar.a((Map) this.j, "status");
    }
}
