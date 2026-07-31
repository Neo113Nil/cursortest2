package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class k4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f7374a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7375b;

    /* renamed from: c, reason: collision with root package name */
    private final int f7376c;

    /* renamed from: d, reason: collision with root package name */
    private int f7377d;

    /* renamed from: e, reason: collision with root package name */
    private String f7378e;

    public k4(int i7, int i8, int i9) {
        String str;
        if (i7 != Integer.MIN_VALUE) {
            StringBuilder sb = new StringBuilder(12);
            sb.append(i7);
            sb.append("/");
            str = sb.toString();
        } else {
            str = "";
        }
        this.f7374a = str;
        this.f7375b = i8;
        this.f7376c = i9;
        this.f7377d = Integer.MIN_VALUE;
        this.f7378e = "";
    }

    private final void d() {
        if (this.f7377d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final int a() {
        d();
        return this.f7377d;
    }

    public final String b() {
        d();
        return this.f7378e;
    }

    public final void c() {
        int i7 = this.f7377d;
        int i8 = i7 == Integer.MIN_VALUE ? this.f7375b : i7 + this.f7376c;
        this.f7377d = i8;
        String str = this.f7374a;
        StringBuilder sb = new StringBuilder(str.length() + 11);
        sb.append(str);
        sb.append(i8);
        this.f7378e = sb.toString();
    }
}
