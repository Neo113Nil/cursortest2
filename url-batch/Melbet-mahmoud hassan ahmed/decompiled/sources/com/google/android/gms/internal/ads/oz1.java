package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class oz1 implements kv3<cc3<String>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<gb> f9953a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Context> f9954b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<dc3> f9955c;

    public oz1(yv3<gb> yv3Var, yv3<Context> yv3Var2, yv3<dc3> yv3Var3) {
        this.f9953a = yv3Var;
        this.f9954b = yv3Var2;
        this.f9955c = yv3Var3;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        final gb a7 = this.f9953a.a();
        final Context b7 = ((nt2) this.f9954b).b();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        cc3 E = dc3Var.E(new Callable() { // from class: com.google.android.gms.internal.ads.nz1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                gb gbVar = gb.this;
                return gbVar.c().d(b7);
            }
        });
        sv3.b(E);
        return E;
    }
}
