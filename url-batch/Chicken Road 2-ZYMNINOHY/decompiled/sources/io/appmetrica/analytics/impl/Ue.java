package io.appmetrica.analytics.impl;

import E.AbstractC0005f;
import android.content.Context;

/* loaded from: classes.dex */
public final class Ue implements Rc {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11049a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11050b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11051c;

    public Ue(Context context, String str, String str2) {
        this.f11049a = context;
        this.f11050b = str;
        this.f11051c = str2;
    }

    public final Ue a(Context context, String str, String str2) {
        return new Ue(context, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ue)) {
            return false;
        }
        Ue ue = (Ue) obj;
        return kotlin.jvm.internal.i.a(this.f11049a, ue.f11049a) && kotlin.jvm.internal.i.a(this.f11050b, ue.f11050b) && kotlin.jvm.internal.i.a(this.f11051c, ue.f11051c);
    }

    public final int hashCode() {
        return this.f11051c.hashCode() + AbstractC0005f.f(this.f11049a.hashCode() * 31, 31, this.f11050b);
    }

    public final String toString() {
        return "PreferencesBasedModuleEntryPoint(context=" + this.f11049a + ", prefName=" + this.f11050b + ", prefValueName=" + this.f11051c + ')';
    }

    public static Ue a(Ue ue, Context context, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            context = ue.f11049a;
        }
        if ((i4 & 2) != 0) {
            str = ue.f11050b;
        }
        if ((i4 & 4) != 0) {
            str2 = ue.f11051c;
        }
        ue.getClass();
        return new Ue(context, str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Rc
    public final String a() {
        String string = this.f11049a.getSharedPreferences(this.f11050b, 0).getString(this.f11051c, "");
        return string == null ? "" : string;
    }
}
