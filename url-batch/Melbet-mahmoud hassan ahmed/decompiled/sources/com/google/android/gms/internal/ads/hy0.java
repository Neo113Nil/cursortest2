package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes.dex */
final class hy0 implements yn2 {

    /* renamed from: a, reason: collision with root package name */
    private final b01 f6451a;

    /* renamed from: b, reason: collision with root package name */
    private Context f6452b;

    /* renamed from: c, reason: collision with root package name */
    private String f6453c;

    /* renamed from: d, reason: collision with root package name */
    private pv f6454d;

    /* synthetic */ hy0(b01 b01Var, gy0 gy0Var) {
        this.f6451a = b01Var;
    }

    @Override // com.google.android.gms.internal.ads.yn2
    public final /* synthetic */ yn2 a(Context context) {
        Objects.requireNonNull(context);
        this.f6452b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.yn2
    public final /* synthetic */ yn2 b(pv pvVar) {
        Objects.requireNonNull(pvVar);
        this.f6454d = pvVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.yn2
    public final bo2 g() {
        sv3.c(this.f6452b, Context.class);
        sv3.c(this.f6453c, String.class);
        sv3.c(this.f6454d, pv.class);
        return new jy0(this.f6451a, this.f6452b, this.f6453c, this.f6454d, null);
    }

    @Override // com.google.android.gms.internal.ads.yn2
    public final /* synthetic */ yn2 s(String str) {
        Objects.requireNonNull(str);
        this.f6453c = str;
        return this;
    }
}
