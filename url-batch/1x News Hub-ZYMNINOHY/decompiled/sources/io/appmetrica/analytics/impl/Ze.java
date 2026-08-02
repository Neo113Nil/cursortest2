package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes.dex */
public final class Ze implements Yc {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6944a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6945b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6946c;

    public Ze(Context context, String str, String str2) {
        this.f6944a = context;
        this.f6945b = str;
        this.f6946c = str2;
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
        return kotlin.jvm.internal.j.a(this.f6944a, ze.f6944a) && kotlin.jvm.internal.j.a(this.f6945b, ze.f6945b) && kotlin.jvm.internal.j.a(this.f6946c, ze.f6946c);
    }

    public final int hashCode() {
        return this.f6946c.hashCode() + ((this.f6945b.hashCode() + (this.f6944a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PreferencesBasedModuleEntryPoint(context=" + this.f6944a + ", prefName=" + this.f6945b + ", prefValueName=" + this.f6946c + ')';
    }

    public static Ze a(Ze ze, Context context, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            context = ze.f6944a;
        }
        if ((i3 & 2) != 0) {
            str = ze.f6945b;
        }
        if ((i3 & 4) != 0) {
            str2 = ze.f6946c;
        }
        ze.getClass();
        return new Ze(context, str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Yc
    public final String a() {
        String string = this.f6944a.getSharedPreferences(this.f6945b, 0).getString(this.f6946c, "");
        return string == null ? "" : string;
    }
}
