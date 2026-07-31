package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class xl0 implements zn {

    /* renamed from: f, reason: collision with root package name */
    private final Context f14239f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f14240g;

    /* renamed from: h, reason: collision with root package name */
    private final String f14241h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f14242i;

    public xl0(Context context, String str) {
        this.f14239f = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f14241h = str;
        this.f14242i = false;
        this.f14240g = new Object();
    }

    public final String a() {
        return this.f14241h;
    }

    public final void b(boolean z6) {
        if (y2.t.o().z(this.f14239f)) {
            synchronized (this.f14240g) {
                if (this.f14242i == z6) {
                    return;
                }
                this.f14242i = z6;
                if (TextUtils.isEmpty(this.f14241h)) {
                    return;
                }
                if (this.f14242i) {
                    y2.t.o().m(this.f14239f, this.f14241h);
                } else {
                    y2.t.o().n(this.f14239f, this.f14241h);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zn
    public final void o0(xn xnVar) {
        b(xnVar.f14258j);
    }
}
