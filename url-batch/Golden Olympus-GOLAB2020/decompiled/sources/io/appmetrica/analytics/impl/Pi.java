package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public abstract class Pi {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    protected final Context f38136a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38137b;

    /* renamed from: c, reason: collision with root package name */
    public final String f38138c;

    public Pi(Context context, String str, String str2) {
        this.f38136a = context;
        this.f38137b = str;
        this.f38138c = str2;
    }

    public final Object a() {
        int identifier = this.f38136a.getResources().getIdentifier(this.f38137b, this.f38138c, this.f38136a.getPackageName());
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
