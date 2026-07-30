package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class Iw {

    /* renamed from: a, reason: collision with root package name */
    public final Context f25663a;

    /* renamed from: b, reason: collision with root package name */
    public final Looper f25664b;

    public Iw(Context context, Looper looper) {
        this.f25663a = context;
        this.f25664b = looper;
    }

    public final void a(String str) {
        Mw A8 = Nw.A();
        Context context = this.f25663a;
        String packageName = context.getPackageName();
        A8.h();
        ((Nw) A8.f30000u).B(packageName);
        A8.h();
        ((Nw) A8.f30000u).D(2);
        Kw A9 = Lw.A();
        A9.h();
        ((Lw) A9.f30000u).B(str);
        A9.h();
        ((Lw) A9.f30000u).C(2);
        A8.h();
        ((Nw) A8.f30000u).C((Lw) A9.j());
        C4088vv c4088vv = new C4088vv(context, this.f25664b, (Nw) A8.j());
        synchronized (c4088vv.f34901x) {
            try {
                if (!c4088vv.f34897n) {
                    c4088vv.f34897n = true;
                    ((Rw) c4088vv.f34899v).o();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
