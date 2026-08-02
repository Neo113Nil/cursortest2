package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class Hi {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f6087a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6088b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6089c;

    public Hi(Context context, String str, String str2) {
        this.f6087a = context;
        this.f6088b = str;
        this.f6089c = str2;
    }

    public final Object a() {
        int identifier = this.f6087a.getResources().getIdentifier(this.f6088b, this.f6089c, this.f6087a.getPackageName());
        if (identifier == 0) {
            return null;
        }
        try {
            return a(identifier);
        } catch (Throwable unused) {
            return null;
        }
    }

    public abstract Object a(int i3);
}
