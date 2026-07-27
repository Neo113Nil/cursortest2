package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes.dex */
public final class Ze implements Yc {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7784a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7785b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7786c;

    public Ze(Context context, String str, String str2) {
        this.f7784a = context;
        this.f7785b = str;
        this.f7786c = str2;
    }

    public final Ze a(Context context, String str, String str2) {
        return new Ze(context, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ze)) {
            return false;
        }
        Ze ze = (Ze) obj;
        return kotlin.jvm.internal.i.a(this.f7784a, ze.f7784a) && kotlin.jvm.internal.i.a(this.f7785b, ze.f7785b) && kotlin.jvm.internal.i.a(this.f7786c, ze.f7786c);
    }

    public final int hashCode() {
        return this.f7786c.hashCode() + B0.o.f(this.f7785b, this.f7784a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreferencesBasedModuleEntryPoint(context=");
        sb.append(this.f7784a);
        sb.append(", prefName=");
        sb.append(this.f7785b);
        sb.append(", prefValueName=");
        return B0.o.l(sb, this.f7786c, ')');
    }

    public static Ze a(Ze ze, Context context, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            context = ze.f7784a;
        }
        if ((i2 & 2) != 0) {
            str = ze.f7785b;
        }
        if ((i2 & 4) != 0) {
            str2 = ze.f7786c;
        }
        ze.getClass();
        return new Ze(context, str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Yc
    public final String a() {
        String string = this.f7784a.getSharedPreferences(this.f7785b, 0).getString(this.f7786c, "");
        return string == null ? "" : string;
    }
}
