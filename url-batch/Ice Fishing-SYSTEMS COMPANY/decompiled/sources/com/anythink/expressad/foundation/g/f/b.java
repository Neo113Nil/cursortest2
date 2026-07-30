package com.anythink.expressad.foundation.g.f;

/* loaded from: classes.dex */
public final class b implements m {

    /* renamed from: a, reason: collision with root package name */
    private int f19390a;

    /* renamed from: b, reason: collision with root package name */
    private int f19391b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19392c;

    /* renamed from: d, reason: collision with root package name */
    private int f19393d;

    /* renamed from: e, reason: collision with root package name */
    private int f19394e;

    /* renamed from: f, reason: collision with root package name */
    private int f19395f;

    /* renamed from: g, reason: collision with root package name */
    private int f19396g;

    /* renamed from: h, reason: collision with root package name */
    private int f19397h;

    public b() {
        this((byte) 0);
    }

    @Override // com.anythink.expressad.foundation.g.f.m
    public final int a() {
        return this.f19392c;
    }

    @Override // com.anythink.expressad.foundation.g.f.m
    public final int b() {
        return this.f19390a;
    }

    @Override // com.anythink.expressad.foundation.g.f.m
    public final int c() {
        return this.f19391b;
    }

    @Override // com.anythink.expressad.foundation.g.f.m
    public final boolean d() {
        int i = this.f19391b + 1;
        this.f19391b = i;
        return i <= this.f19392c;
    }

    @Override // com.anythink.expressad.foundation.g.f.m
    public final int e() {
        return this.f19394e;
    }

    @Override // com.anythink.expressad.foundation.g.f.m
    public final int f() {
        return this.f19395f;
    }

    @Override // com.anythink.expressad.foundation.g.f.m
    public final int g() {
        return this.f19396g;
    }

    @Override // com.anythink.expressad.foundation.g.f.m
    public final int h() {
        return this.f19397h;
    }

    @Override // com.anythink.expressad.foundation.g.f.m
    public final int i() {
        return this.f19393d;
    }

    private b(byte b9) {
        this.f19393d = 2;
        this.f19394e = 0;
        this.f19395f = 0;
        this.f19396g = 0;
        this.f19397h = 0;
        this.f19390a = 30000;
        this.f19392c = 0;
    }

    private b(int i, int i4, int i9, int i10, int i11, int i12) {
        this.f19393d = 2;
        this.f19394e = 0;
        this.f19395f = 0;
        this.f19396g = 0;
        this.f19397h = 0;
        this.f19394e = Math.max(i, 0);
        this.f19395f = Math.max(i4, 0);
        this.f19396g = Math.max(i9, 0);
        this.f19397h = Math.max(i10, 0);
        this.f19392c = Math.max(i11, 0);
        this.f19393d = i12;
    }

    public b(char c4) {
        this.f19393d = 2;
        this.f19394e = 0;
        this.f19395f = 0;
        this.f19396g = 0;
        this.f19397h = 0;
        this.f19394e = Math.max(5000, 0);
        this.f19395f = Math.max(5000, 0);
        this.f19396g = Math.max(5000, 0);
        this.f19397h = Math.max(6000, 0);
        this.f19392c = Math.max(0, 0);
    }
}
