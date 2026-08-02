package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0348a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6964a;

    public C0348a(Context context) {
        this.f6964a = context;
    }

    public final byte[] a() {
        try {
            return AbstractC0652lj.a(new StringBuilder(this.f6964a.getPackageName()).reverse().toString());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }

    public final byte[] b() {
        try {
            return AbstractC0652lj.a(this.f6964a.getPackageName());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }
}
