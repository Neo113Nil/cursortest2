package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: classes.dex */
public final class qc0 extends oo0 {

    /* renamed from: b, reason: collision with root package name */
    private final pc0 f10644b;

    public qc0(pc0 pc0Var, String str) {
        super(str);
        this.f10644b = pc0Var;
    }

    @Override // com.google.android.gms.internal.ads.oo0, com.google.android.gms.internal.ads.ao0
    public final void b(String str) {
        String valueOf = String.valueOf(str);
        io0.b(valueOf.length() != 0 ? "LeibnizHttpUrlPinger pinging URL: ".concat(valueOf) : new String("LeibnizHttpUrlPinger pinging URL: "));
        if ("oda".equals(Uri.parse(str).getScheme())) {
            return;
        }
        io0.b("URL does not match oda:// scheme, falling back on HttpUrlPinger");
        super.b(str);
    }
}
