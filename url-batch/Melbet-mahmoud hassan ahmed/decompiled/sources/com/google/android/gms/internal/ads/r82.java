package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class r82 {

    /* renamed from: a, reason: collision with root package name */
    private final v3.d f11052a;

    /* renamed from: b, reason: collision with root package name */
    private final s82 f11053b;

    /* renamed from: c, reason: collision with root package name */
    private final cy2 f11054c;

    /* renamed from: d, reason: collision with root package name */
    private final List<String> f11055d = Collections.synchronizedList(new ArrayList());

    /* renamed from: e, reason: collision with root package name */
    private final boolean f11056e = ((Boolean) sw.c().b(m10.f8238k5)).booleanValue();

    /* renamed from: f, reason: collision with root package name */
    private final f52 f11057f;

    public r82(v3.d dVar, s82 s82Var, f52 f52Var, cy2 cy2Var) {
        this.f11052a = dVar;
        this.f11053b = s82Var;
        this.f11057f = f52Var;
        this.f11054c = cy2Var;
    }

    static /* bridge */ /* synthetic */ void g(r82 r82Var, String str, int i7, long j7, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 33);
        sb.append(str);
        sb.append(".");
        sb.append(i7);
        sb.append(".");
        sb.append(j7);
        String sb2 = sb.toString();
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb3 = new StringBuilder(sb2.length() + 1 + String.valueOf(str2).length());
            sb3.append(sb2);
            sb3.append(".");
            sb3.append(str2);
            sb2 = sb3.toString();
        }
        r82Var.f11055d.add(sb2);
    }

    final <T> cc3<T> e(ds2 ds2Var, rr2 rr2Var, cc3<T> cc3Var, zx2 zx2Var) {
        ur2 ur2Var = ds2Var.f4313b.f3934b;
        long a7 = this.f11052a.a();
        String str = rr2Var.f11401x;
        if (str != null) {
            rb3.r(cc3Var, new q82(this, a7, str, rr2Var, ur2Var, zx2Var, ds2Var), wo0.f13899f);
        }
        return cc3Var;
    }

    public final String f() {
        return TextUtils.join("_", this.f11055d);
    }
}
