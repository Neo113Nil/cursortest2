package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class esk {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    private final esa f;
    private final esc g;
    private final esg h;

    public esk(Context context, String str, gzp gzpVar, gzp gzpVar2, gzp gzpVar3, gzp gzpVar4, gzp gzpVar5) {
        String packageName = context.getPackageName();
        esa esaVar = (esa) gzpVar.d(esa.a);
        esc escVar = (esc) gzpVar2.d(esc.a);
        esg esgVar = (esg) gzpVar3.d(esg.a);
        boolean booleanValue = ((Boolean) gzpVar4.d(false)).booleanValue();
        boolean booleanValue2 = ((Boolean) gzpVar5.d(false)).booleanValue();
        this.c = str;
        this.f = esaVar;
        this.g = escVar;
        this.h = esgVar;
        this.d = booleanValue;
        this.e = booleanValue2;
        this.a = "com.google.android.libraries.performance.primes#".concat(String.valueOf(packageName));
        this.b = "com.google.android.client_error_logging#".concat(String.valueOf(packageName));
    }

    public final hvi a() {
        hvi a = this.f.a();
        hvi a2 = this.g.a();
        hvi a3 = this.h.a();
        return hnu.aW(a, a2, a3).a(new fuh(this, a, a2, a3, 1), huf.a);
    }
}
