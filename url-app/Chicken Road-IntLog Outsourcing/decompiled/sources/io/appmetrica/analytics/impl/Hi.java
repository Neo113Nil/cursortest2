package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class Hi {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f6882a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6883b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6884c;

    public Hi(Context context, String str, String str2) {
        this.f6882a = context;
        this.f6883b = str;
        this.f6884c = str2;
    }

    public final Object a() {
        int identifier = this.f6882a.getResources().getIdentifier(this.f6883b, this.f6884c, this.f6882a.getPackageName());
        if (identifier == 0) {
            return null;
        }
        try {
            return a(identifier);
        } catch (Throwable unused) {
            return null;
        }
    }

    public abstract Object a(int i2);
}
