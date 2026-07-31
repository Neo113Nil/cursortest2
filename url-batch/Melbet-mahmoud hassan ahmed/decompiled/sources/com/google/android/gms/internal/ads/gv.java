package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class gv {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5772a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5773b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5774c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5775d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5776e;

    protected gv(gv gvVar) {
        this.f5772a = gvVar.f5772a;
        this.f5773b = gvVar.f5773b;
        this.f5774c = gvVar.f5774c;
        this.f5775d = gvVar.f5775d;
        this.f5776e = gvVar.f5776e;
    }

    public gv(Object obj, int i7, int i8, long j7) {
        this(obj, i7, i8, j7, -1);
    }

    private gv(Object obj, int i7, int i8, long j7, int i9) {
        this.f5772a = obj;
        this.f5773b = i7;
        this.f5774c = i8;
        this.f5775d = j7;
        this.f5776e = i9;
    }

    public gv(Object obj, long j7) {
        this(obj, -1, -1, -1L, -1);
    }

    public gv(Object obj, long j7, int i7) {
        this(obj, -1, -1, j7, i7);
    }

    public final gv a(Object obj) {
        return this.f5772a.equals(obj) ? this : new gv(obj, this.f5773b, this.f5774c, this.f5775d, this.f5776e);
    }

    public final boolean b() {
        return this.f5773b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gv)) {
            return false;
        }
        gv gvVar = (gv) obj;
        return this.f5772a.equals(gvVar.f5772a) && this.f5773b == gvVar.f5773b && this.f5774c == gvVar.f5774c && this.f5775d == gvVar.f5775d && this.f5776e == gvVar.f5776e;
    }

    public final int hashCode() {
        return ((((((((this.f5772a.hashCode() + 527) * 31) + this.f5773b) * 31) + this.f5774c) * 31) + ((int) this.f5775d)) * 31) + this.f5776e;
    }
}
