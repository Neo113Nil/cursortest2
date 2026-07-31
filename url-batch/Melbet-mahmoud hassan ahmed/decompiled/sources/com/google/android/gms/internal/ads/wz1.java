package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* loaded from: classes.dex */
public final class wz1 implements kv3<PackageInfo> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f13972a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<ApplicationInfo> f13973b;

    public wz1(yv3<Context> yv3Var, yv3<ApplicationInfo> yv3Var2) {
        this.f13972a = yv3Var;
        this.f13973b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        try {
            return w3.c.a(this.f13972a.a()).f(((rz1) this.f13973b).a().packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
