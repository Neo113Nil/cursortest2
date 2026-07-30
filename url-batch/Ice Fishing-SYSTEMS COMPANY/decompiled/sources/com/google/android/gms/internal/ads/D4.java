package com.google.android.gms.internal.ads;

import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class D4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f24334a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24335b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24336c;

    /* renamed from: d, reason: collision with root package name */
    public int f24337d;

    /* renamed from: e, reason: collision with root package name */
    public String f24338e;

    public D4(int i, int i4, int i9) {
        this.f24334a = i != Integer.MIN_VALUE ? AbstractC5051n.e(i, "/", new StringBuilder(String.valueOf(i).length() + 1)) : "";
        this.f24335b = i4;
        this.f24336c = i9;
        this.f24337d = Integer.MIN_VALUE;
        this.f24338e = "";
    }

    public final void a() {
        int i = this.f24337d;
        int i4 = i == Integer.MIN_VALUE ? this.f24335b : i + this.f24336c;
        this.f24337d = i4;
        int length = String.valueOf(i4).length();
        String str = this.f24334a;
        this.f24338e = D.y.j(i4, str, new StringBuilder(str.length() + length));
    }

    public final void b() {
        if (this.f24337d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }
}
