package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.TimeoutConfig;

/* loaded from: classes.dex */
public final class n8 {

    /* renamed from: f, reason: collision with root package name */
    public static final q8 f7324f = new q8(new byte[0], "text/plain", null);

    /* renamed from: a, reason: collision with root package name */
    public final o8 f7325a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7326b;

    /* renamed from: c, reason: collision with root package name */
    public q8 f7327c = f7324f;

    /* renamed from: d, reason: collision with root package name */
    public TimeoutConfig f7328d;

    /* renamed from: e, reason: collision with root package name */
    public g7 f7329e;

    public n8(o8 o8Var, String str) {
        this.f7325a = o8Var;
        this.f7326b = str;
    }

    public final r8 a() {
        o8 o8Var = this.f7325a;
        try {
            return o8Var.a(this);
        } catch (Throwable th) {
            if (!o8Var.a(1)) {
                return null;
            }
            d9.a(th);
            return null;
        }
    }

    public final r8 b() {
        o8 o8Var = this.f7325a;
        try {
            return o8Var.b(this);
        } catch (Throwable th) {
            if (!o8Var.a(4)) {
                return null;
            }
            d9.a(th);
            return null;
        }
    }
}
