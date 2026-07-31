package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes.dex */
final class gz0 implements up2 {

    /* renamed from: a, reason: collision with root package name */
    private final b01 f5970a;

    /* renamed from: b, reason: collision with root package name */
    private Context f5971b;

    /* renamed from: c, reason: collision with root package name */
    private String f5972c;

    /* renamed from: d, reason: collision with root package name */
    private pv f5973d;

    /* synthetic */ gz0(b01 b01Var, fz0 fz0Var) {
        this.f5970a = b01Var;
    }

    @Override // com.google.android.gms.internal.ads.up2
    public final /* synthetic */ up2 a(Context context) {
        Objects.requireNonNull(context);
        this.f5971b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.up2
    public final /* synthetic */ up2 b(pv pvVar) {
        Objects.requireNonNull(pvVar);
        this.f5973d = pvVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.up2
    public final vp2 g() {
        sv3.c(this.f5971b, Context.class);
        sv3.c(this.f5972c, String.class);
        sv3.c(this.f5973d, pv.class);
        return new iz0(this.f5970a, this.f5971b, this.f5972c, this.f5973d, null);
    }

    @Override // com.google.android.gms.internal.ads.up2
    public final /* synthetic */ up2 s(String str) {
        Objects.requireNonNull(str);
        this.f5972c = str;
        return this;
    }
}
