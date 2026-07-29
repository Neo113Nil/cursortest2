package com.ironsource.sdk.data;

import java.util.Map;

/* compiled from: DemandSource.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private String f7146a;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f7148c;
    private com.ironsource.sdk.e.a f;

    /* renamed from: b, reason: collision with root package name */
    private int f7147b = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f7149d = 0;
    private boolean e = false;

    public b(String str, Map<String, String> map, com.ironsource.sdk.e.a aVar) {
        this.f7146a = str;
        this.f7148c = map;
        this.f = aVar;
    }

    public String a() {
        return this.f7146a;
    }

    public int b() {
        return this.f7149d;
    }

    public boolean c() {
        return this.e;
    }

    public void a(boolean z) {
        this.e = z;
    }

    public Map<String, String> d() {
        return this.f7148c;
    }

    public synchronized void a(int i) {
        this.f7149d = i;
    }

    public com.ironsource.sdk.e.a e() {
        return this.f;
    }

    public void b(int i) {
        this.f7147b = i;
    }

    public int f() {
        return this.f7147b;
    }

    public boolean c(int i) {
        return this.f7147b == i;
    }
}
