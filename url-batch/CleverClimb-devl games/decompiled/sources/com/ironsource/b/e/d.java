package com.ironsource.b.e;

import java.util.ArrayList;

/* compiled from: BannerConfigurations.java */
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private b f6784a;

    /* renamed from: b, reason: collision with root package name */
    private int f6785b;

    /* renamed from: c, reason: collision with root package name */
    private long f6786c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList<e> f6787d;
    private e e;
    private int f;

    public d() {
        this.f6784a = new b();
        this.f6787d = new ArrayList<>();
    }

    public d(int i, long j, b bVar, int i2) {
        this.f6787d = new ArrayList<>();
        this.f6785b = i;
        this.f6786c = j;
        this.f6784a = bVar;
        this.f = i2;
    }

    public int a() {
        return this.f6785b;
    }

    public long b() {
        return this.f6786c;
    }

    public b c() {
        return this.f6784a;
    }

    public void a(e eVar) {
        if (eVar != null) {
            this.f6787d.add(eVar);
            if (eVar.a() == 0) {
                this.e = eVar;
            }
        }
    }

    public int d() {
        return this.f;
    }
}
