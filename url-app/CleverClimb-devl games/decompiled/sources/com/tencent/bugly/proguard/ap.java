package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public final class ap extends k implements Cloneable {
    private static /* synthetic */ boolean o = !ap.class.desiredAssertionStatus();
    private static ao m = new ao();
    private static Map<String, String> n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public boolean f8726a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8727b = true;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8728c = true;

    /* renamed from: d, reason: collision with root package name */
    public String f8729d = "";
    public String e = "";
    public ao f = null;
    public Map<String, String> g = null;
    public long h = 0;
    private String j = "";
    private String k = "";
    private int l = 0;
    public int i = 0;

    static {
        n.put("", "");
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        ap apVar = (ap) obj;
        return l.a(this.f8726a, apVar.f8726a) && l.a(this.f8727b, apVar.f8727b) && l.a(this.f8728c, apVar.f8728c) && l.a(this.f8729d, apVar.f8729d) && l.a(this.e, apVar.e) && l.a(this.f, apVar.f) && l.a(this.g, apVar.g) && l.a(this.h, apVar.h) && l.a(this.j, apVar.j) && l.a(this.k, apVar.k) && l.a(this.l, apVar.l) && l.a(this.i, apVar.i);
    }

    public final int hashCode() {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (o) {
                return null;
            }
            throw new AssertionError();
        }
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(j jVar) {
        jVar.a(this.f8726a, 0);
        jVar.a(this.f8727b, 1);
        jVar.a(this.f8728c, 2);
        if (this.f8729d != null) {
            jVar.a(this.f8729d, 3);
        }
        if (this.e != null) {
            jVar.a(this.e, 4);
        }
        if (this.f != null) {
            jVar.a((k) this.f, 5);
        }
        if (this.g != null) {
            jVar.a((Map) this.g, 6);
        }
        jVar.a(this.h, 7);
        if (this.j != null) {
            jVar.a(this.j, 8);
        }
        if (this.k != null) {
            jVar.a(this.k, 9);
        }
        jVar.a(this.l, 10);
        jVar.a(this.i, 11);
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(i iVar) {
        boolean z = this.f8726a;
        this.f8726a = iVar.a(0, true);
        boolean z2 = this.f8727b;
        this.f8727b = iVar.a(1, true);
        boolean z3 = this.f8728c;
        this.f8728c = iVar.a(2, true);
        this.f8729d = iVar.b(3, false);
        this.e = iVar.b(4, false);
        this.f = (ao) iVar.a((k) m, 5, false);
        this.g = (Map) iVar.a((i) n, 6, false);
        this.h = iVar.a(this.h, 7, false);
        this.j = iVar.b(8, false);
        this.k = iVar.b(9, false);
        this.l = iVar.a(this.l, 10, false);
        this.i = iVar.a(this.i, 11, false);
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(StringBuilder sb, int i) {
        h hVar = new h(sb, i);
        hVar.a(this.f8726a, "enable");
        hVar.a(this.f8727b, "enableUserInfo");
        hVar.a(this.f8728c, "enableQuery");
        hVar.a(this.f8729d, "url");
        hVar.a(this.e, "expUrl");
        hVar.a((k) this.f, "security");
        hVar.a((Map) this.g, "valueMap");
        hVar.a(this.h, "strategylastUpdateTime");
        hVar.a(this.j, "httpsUrl");
        hVar.a(this.k, "httpsExpUrl");
        hVar.a(this.l, "eventRecordCount");
        hVar.a(this.i, "eventTimeInterval");
    }
}
