package com.anythink.basead.l;

import com.google.android.gms.internal.ads.CL;

/* loaded from: classes.dex */
public final class b extends Exception {

    /* renamed from: a, reason: collision with root package name */
    protected static final int f9325a = -1;

    /* renamed from: b, reason: collision with root package name */
    protected static final int f9326b = -2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f9327c = -3;

    /* renamed from: d, reason: collision with root package name */
    private String f9328d;

    private b(String str) {
        this.f9328d = "-1: ".concat(String.valueOf(str));
    }

    private void a(String str) {
        this.f9328d = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f9328d;
    }

    public b(String str, String str2) {
        this.f9328d = CL.k(str, ": ", str2);
    }
}
