package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes3.dex */
public class zv0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f35792a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35793b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35794c;

    /* renamed from: d, reason: collision with root package name */
    public final long f35795d;

    /* renamed from: e, reason: collision with root package name */
    public final int f35796e;

    public zv0(int i4, long j4, Object obj) {
        this(obj, -1, -1, j4, i4);
    }

    public final zv0 a(Object obj) {
        return this.f35792a.equals(obj) ? this : new zv0(obj, this.f35793b, this.f35794c, this.f35795d, this.f35796e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv0)) {
            return false;
        }
        zv0 zv0Var = (zv0) obj;
        return this.f35792a.equals(zv0Var.f35792a) && this.f35793b == zv0Var.f35793b && this.f35794c == zv0Var.f35794c && this.f35795d == zv0Var.f35795d && this.f35796e == zv0Var.f35796e;
    }

    public final int hashCode() {
        return ((((((((this.f35792a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f35793b) * 31) + this.f35794c) * 31) + ((int) this.f35795d)) * 31) + this.f35796e;
    }

    protected zv0(zv0 zv0Var) {
        this.f35792a = zv0Var.f35792a;
        this.f35793b = zv0Var.f35793b;
        this.f35794c = zv0Var.f35794c;
        this.f35795d = zv0Var.f35795d;
        this.f35796e = zv0Var.f35796e;
    }

    public final boolean a() {
        return this.f35793b != -1;
    }

    public zv0(Object obj) {
        this(obj, -1L);
    }

    public zv0(Object obj, int i4, int i5, long j4) {
        this(obj, i4, i5, j4, -1);
    }

    private zv0(Object obj, int i4, int i5, long j4, int i6) {
        this.f35792a = obj;
        this.f35793b = i4;
        this.f35794c = i5;
        this.f35795d = j4;
        this.f35796e = i6;
    }

    public zv0(Object obj, long j4) {
        this(obj, -1, -1, j4, -1);
    }
}
