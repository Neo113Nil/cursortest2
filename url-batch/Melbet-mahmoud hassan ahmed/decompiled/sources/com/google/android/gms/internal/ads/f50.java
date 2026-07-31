package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class f50 implements u2.f {

    /* renamed from: a, reason: collision with root package name */
    private final e50 f4999a;

    /* renamed from: b, reason: collision with root package name */
    private final u2.b f5000b;

    /* renamed from: c, reason: collision with root package name */
    private final r2.w f5001c = new r2.w();

    public f50(e50 e50Var) {
        Context context;
        this.f4999a = e50Var;
        u2.b bVar = null;
        try {
            context = (Context) x3.b.O0(e50Var.e());
        } catch (RemoteException | NullPointerException e7) {
            io0.e("", e7);
            context = null;
        }
        if (context != null) {
            u2.b bVar2 = new u2.b(context);
            try {
                if (true == this.f4999a.N0(x3.b.B3(bVar2))) {
                    bVar = bVar2;
                }
            } catch (RemoteException e8) {
                io0.e("", e8);
            }
        }
        this.f5000b = bVar;
    }

    @Override // u2.f
    public final String a() {
        try {
            return this.f4999a.f();
        } catch (RemoteException e7) {
            io0.e("", e7);
            return null;
        }
    }

    public final e50 b() {
        return this.f4999a;
    }
}
