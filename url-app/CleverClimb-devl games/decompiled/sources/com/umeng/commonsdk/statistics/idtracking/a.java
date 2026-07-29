package com.umeng.commonsdk.statistics.idtracking;

import android.support.v4.os.EnvironmentCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: AbstractIdTracker.java */
/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private final int f9154a = 10;

    /* renamed from: b, reason: collision with root package name */
    private final int f9155b = 20;

    /* renamed from: c, reason: collision with root package name */
    private final String f9156c;

    /* renamed from: d, reason: collision with root package name */
    private List<com.umeng.commonsdk.statistics.proto.a> f9157d;
    private com.umeng.commonsdk.statistics.proto.b e;

    public abstract String f();

    public a(String str) {
        this.f9156c = str;
    }

    public boolean a() {
        return g();
    }

    public String b() {
        return this.f9156c;
    }

    public boolean c() {
        return this.e == null || this.e.h() <= 20;
    }

    private boolean g() {
        com.umeng.commonsdk.statistics.proto.b bVar = this.e;
        String b2 = bVar == null ? null : bVar.b();
        int h = bVar == null ? 0 : bVar.h();
        String a2 = a(f());
        if (a2 == null || a2.equals(b2)) {
            return false;
        }
        if (bVar == null) {
            bVar = new com.umeng.commonsdk.statistics.proto.b();
        }
        bVar.a(a2);
        bVar.a(System.currentTimeMillis());
        bVar.a(h + 1);
        com.umeng.commonsdk.statistics.proto.a aVar = new com.umeng.commonsdk.statistics.proto.a();
        aVar.a(this.f9156c);
        aVar.c(a2);
        aVar.b(b2);
        aVar.a(bVar.e());
        if (this.f9157d == null) {
            this.f9157d = new ArrayList(2);
        }
        this.f9157d.add(aVar);
        if (this.f9157d.size() > 10) {
            this.f9157d.remove(0);
        }
        this.e = bVar;
        return true;
    }

    public com.umeng.commonsdk.statistics.proto.b d() {
        return this.e;
    }

    public void a(com.umeng.commonsdk.statistics.proto.b bVar) {
        this.e = bVar;
    }

    public List<com.umeng.commonsdk.statistics.proto.a> e() {
        return this.f9157d;
    }

    public void a(List<com.umeng.commonsdk.statistics.proto.a> list) {
        this.f9157d = list;
    }

    public String a(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.length() == 0 || "0".equals(trim) || EnvironmentCompat.MEDIA_UNKNOWN.equals(trim.toLowerCase(Locale.US))) {
            return null;
        }
        return trim;
    }

    public void a(com.umeng.commonsdk.statistics.proto.c cVar) {
        this.e = cVar.c().get(this.f9156c);
        List<com.umeng.commonsdk.statistics.proto.a> h = cVar.h();
        if (h == null || h.size() <= 0) {
            return;
        }
        if (this.f9157d == null) {
            this.f9157d = new ArrayList();
        }
        for (com.umeng.commonsdk.statistics.proto.a aVar : h) {
            if (this.f9156c.equals(aVar.f9216a)) {
                this.f9157d.add(aVar);
            }
        }
    }
}
