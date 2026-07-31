package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class xi2 implements ij2<yi2> {

    /* renamed from: a, reason: collision with root package name */
    private final dc3 f14223a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f14224b;

    /* renamed from: c, reason: collision with root package name */
    private final po0 f14225c;

    public xi2(dc3 dc3Var, Context context, po0 po0Var) {
        this.f14223a = dc3Var;
        this.f14224b = context;
        this.f14225c = po0Var;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<yi2> a() {
        return this.f14223a.E(new Callable() { // from class: com.google.android.gms.internal.ads.wi2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return xi2.this.b();
            }
        });
    }

    final /* synthetic */ yi2 b() {
        boolean g7 = w3.c.a(this.f14224b).g();
        y2.t.q();
        boolean i7 = a3.g2.i(this.f14224b);
        String str = this.f14225c.f10301f;
        y2.t.r();
        boolean s7 = a3.f.s();
        y2.t.q();
        ApplicationInfo applicationInfo = this.f14224b.getApplicationInfo();
        return new yi2(g7, i7, str, s7, applicationInfo == null ? 0 : applicationInfo.targetSdkVersion, DynamiteModule.c(this.f14224b, ModuleDescriptor.MODULE_ID), DynamiteModule.a(this.f14224b, ModuleDescriptor.MODULE_ID));
    }
}
