package com.android.volley;

import com.mopub.volley.DefaultRetryPolicy;

/* compiled from: DefaultRetryPolicy.java */
/* loaded from: classes.dex */
public class d implements p {

    /* renamed from: a, reason: collision with root package name */
    private int f2269a;

    /* renamed from: b, reason: collision with root package name */
    private int f2270b;

    /* renamed from: c, reason: collision with root package name */
    private final int f2271c;

    /* renamed from: d, reason: collision with root package name */
    private final float f2272d;

    public d() {
        this(DefaultRetryPolicy.DEFAULT_TIMEOUT_MS, 1, 1.0f);
    }

    public d(int i, int i2, float f) {
        this.f2269a = i;
        this.f2271c = i2;
        this.f2272d = f;
    }

    @Override // com.android.volley.p
    public int a() {
        return this.f2269a;
    }

    @Override // com.android.volley.p
    public int b() {
        return this.f2270b;
    }

    @Override // com.android.volley.p
    public void a(s sVar) throws s {
        this.f2270b++;
        this.f2269a = (int) (this.f2269a + (this.f2269a * this.f2272d));
        if (!c()) {
            throw sVar;
        }
    }

    protected boolean c() {
        return this.f2270b <= this.f2271c;
    }
}
