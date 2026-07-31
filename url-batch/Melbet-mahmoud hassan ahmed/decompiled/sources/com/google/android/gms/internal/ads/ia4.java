package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ia4 implements he1 {

    /* renamed from: a, reason: collision with root package name */
    private final he1 f6583a;

    /* renamed from: b, reason: collision with root package name */
    private long f6584b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f6585c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, List<String>> f6586d;

    public ia4(he1 he1Var) {
        Objects.requireNonNull(he1Var);
        this.f6583a = he1Var;
        this.f6585c = Uri.EMPTY;
        this.f6586d = Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.fc1
    public final int a(byte[] bArr, int i7, int i8) {
        int a7 = this.f6583a.a(bArr, i7, i8);
        if (a7 != -1) {
            this.f6584b += a7;
        }
        return a7;
    }

    public final long c() {
        return this.f6584b;
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final Uri h() {
        return this.f6583a.h();
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final void i() {
        this.f6583a.i();
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final void j(vt1 vt1Var) {
        Objects.requireNonNull(vt1Var);
        this.f6583a.j(vt1Var);
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final long k(li1 li1Var) {
        this.f6585c = li1Var.f7985a;
        this.f6586d = Collections.emptyMap();
        long k7 = this.f6583a.k(li1Var);
        Uri h7 = h();
        Objects.requireNonNull(h7);
        this.f6585c = h7;
        this.f6586d = zza();
        return k7;
    }

    public final Uri o() {
        return this.f6585c;
    }

    public final Map<String, List<String>> p() {
        return this.f6586d;
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final Map<String, List<String>> zza() {
        return this.f6583a.zza();
    }
}
