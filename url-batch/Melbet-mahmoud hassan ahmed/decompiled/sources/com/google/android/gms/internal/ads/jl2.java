package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.List;

/* loaded from: classes.dex */
public final class jl2 {

    /* renamed from: a, reason: collision with root package name */
    private final vi0 f7173a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7174b;

    public jl2(vi0 vi0Var, int i7) {
        this.f7173a = vi0Var;
        this.f7174b = i7;
    }

    public final int a() {
        return this.f7174b;
    }

    public final PackageInfo b() {
        return this.f7173a.f13406k;
    }

    public final String c() {
        return this.f7173a.f13404i;
    }

    public final String d() {
        return this.f7173a.f13401f.getString("ms");
    }

    public final String e() {
        return this.f7173a.f13408m;
    }

    public final List<String> f() {
        return this.f7173a.f13405j;
    }

    final boolean g() {
        return this.f7173a.f13401f.getBoolean("is_gbid");
    }
}
