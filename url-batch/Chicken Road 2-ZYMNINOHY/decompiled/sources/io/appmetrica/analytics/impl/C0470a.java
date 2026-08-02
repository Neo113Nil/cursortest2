package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0470a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11404a;

    public C0470a(Context context) {
        this.f11404a = context;
    }

    public final byte[] a() {
        try {
            return AbstractC0645gj.a(new StringBuilder(this.f11404a.getPackageName()).reverse().toString());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }

    public final byte[] b() {
        try {
            return AbstractC0645gj.a(this.f11404a.getPackageName());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }
}
