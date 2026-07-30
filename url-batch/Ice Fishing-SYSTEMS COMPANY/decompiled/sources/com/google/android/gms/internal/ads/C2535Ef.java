package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.Ef, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2535Ef implements InterfaceC3725p8 {

    /* renamed from: n, reason: collision with root package name */
    public final Context f24777n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f24778u;

    /* renamed from: v, reason: collision with root package name */
    public final String f24779v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f24780w;

    public C2535Ef(Context context, String str) {
        this.f24777n = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f24779v = str;
        this.f24780w = false;
        this.f24778u = new Object();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3725p8
    public final void A(C3671o8 c3671o8) {
        a(c3671o8.f33111j);
    }

    public final void a(boolean z8) {
        p2.j jVar = p2.j.f39798C;
        C2569Gf c2569Gf = jVar.f39824y;
        Context context = this.f24777n;
        if (c2569Gf.a(context)) {
            synchronized (this.f24778u) {
                try {
                    if (this.f24780w == z8) {
                        return;
                    }
                    this.f24780w = z8;
                    String str = this.f24779v;
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    if (this.f24780w) {
                        C2569Gf c2569Gf2 = jVar.f39824y;
                        if (c2569Gf2.a(context)) {
                            c2569Gf2.j(context, str, "beginAdUnitExposure");
                        }
                    } else {
                        C2569Gf c2569Gf3 = jVar.f39824y;
                        if (c2569Gf3.a(context)) {
                            c2569Gf3.j(context, str, "endAdUnitExposure");
                        }
                    }
                } finally {
                }
            }
        }
    }
}
