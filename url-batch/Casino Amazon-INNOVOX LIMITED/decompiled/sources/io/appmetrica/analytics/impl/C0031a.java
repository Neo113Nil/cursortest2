package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0031a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1152a;

    public C0031a(Context context) {
        this.f1152a = context;
    }

    public final byte[] a() {
        try {
            return AbstractC0232hj.a(new StringBuilder(this.f1152a.getPackageName()).reverse().toString());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }

    public final byte[] b() {
        try {
            return AbstractC0232hj.a(this.f1152a.getPackageName());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }
}
