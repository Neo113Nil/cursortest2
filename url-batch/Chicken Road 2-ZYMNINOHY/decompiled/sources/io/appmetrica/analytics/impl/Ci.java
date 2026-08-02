package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class Ci {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f10164a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10165b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10166c;

    public Ci(Context context, String str, String str2) {
        this.f10164a = context;
        this.f10165b = str;
        this.f10166c = str2;
    }

    public final Object a() {
        int identifier = this.f10164a.getResources().getIdentifier(this.f10165b, this.f10166c, this.f10164a.getPackageName());
        if (identifier == 0) {
            return null;
        }
        try {
            return a(identifier);
        } catch (Throwable unused) {
            return null;
        }
    }

    public abstract Object a(int i4);
}
