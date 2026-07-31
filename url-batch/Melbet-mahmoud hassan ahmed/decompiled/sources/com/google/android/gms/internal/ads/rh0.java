package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class rh0 {

    /* renamed from: d, reason: collision with root package name */
    private static bn0 f11158d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f11159a;

    /* renamed from: b, reason: collision with root package name */
    private final r2.b f11160b;

    /* renamed from: c, reason: collision with root package name */
    private final kz f11161c;

    public rh0(Context context, r2.b bVar, kz kzVar) {
        this.f11159a = context;
        this.f11160b = bVar;
        this.f11161c = kzVar;
    }

    public static bn0 a(Context context) {
        bn0 bn0Var;
        synchronized (rh0.class) {
            if (f11158d == null) {
                f11158d = qw.a().l(context, new ad0());
            }
            bn0Var = f11158d;
        }
        return bn0Var;
    }

    public final void b(h3.c cVar) {
        String str;
        bn0 a7 = a(this.f11159a);
        if (a7 == null) {
            str = "Internal Error, query info generator is null.";
        } else {
            x3.a B3 = x3.b.B3(this.f11159a);
            kz kzVar = this.f11161c;
            try {
                a7.b4(B3, new fn0(null, this.f11160b.name(), null, kzVar == null ? new lv().a() : ov.f9836a.a(this.f11159a, kzVar)), new qh0(this, cVar));
                return;
            } catch (RemoteException unused) {
                str = "Internal Error.";
            }
        }
        cVar.a(str);
    }
}
