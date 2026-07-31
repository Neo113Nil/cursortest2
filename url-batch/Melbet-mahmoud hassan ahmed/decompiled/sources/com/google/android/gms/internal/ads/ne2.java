package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class ne2 implements hj2<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    private final vv f9060a;

    /* renamed from: b, reason: collision with root package name */
    private final po0 f9061b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f9062c;

    public ne2(vv vvVar, po0 po0Var, boolean z6) {
        this.f9060a = vvVar;
        this.f9061b = po0Var;
        this.f9062c = z6;
    }

    @Override // com.google.android.gms.internal.ads.hj2
    public final /* bridge */ /* synthetic */ void c(Bundle bundle) {
        String str;
        Bundle bundle2 = bundle;
        if (this.f9061b.f10303h >= ((Integer) sw.c().b(m10.J3)).intValue()) {
            bundle2.putString("app_open_version", "2");
        }
        if (((Boolean) sw.c().b(m10.K3)).booleanValue()) {
            bundle2.putBoolean("app_switched", this.f9062c);
        }
        vv vvVar = this.f9060a;
        if (vvVar != null) {
            int i7 = vvVar.f13509f;
            if (i7 == 1) {
                str = "p";
            } else if (i7 != 2) {
                return;
            } else {
                str = "l";
            }
            bundle2.putString("avo", str);
        }
    }
}
