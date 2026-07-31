package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2476a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f38651a;

    public C2476a(Context context) {
        this.f38651a = context;
    }

    public final byte[] a() {
        try {
            return AbstractC2993tj.a(new StringBuilder(this.f38651a.getPackageName()).reverse().toString());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }

    public final byte[] b() {
        try {
            return AbstractC2993tj.a(this.f38651a.getPackageName());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }
}
