package com.startapp.sdk.internal;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class nh implements Runnable, a7 {

    /* renamed from: a, reason: collision with root package name */
    public final pa f353a;
    public final pa b;
    public final String c;
    public final b7 d;
    public c8 e;
    public Throwable f;

    public nh(pa paVar, pa paVar2, String str, b7 b7Var) {
        this.f353a = paVar;
        this.b = paVar2;
        this.c = str;
        this.d = b7Var;
    }

    @Override // com.startapp.sdk.internal.a7
    public final Object a(Object obj) {
        this.f = (Throwable) obj;
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            me meVar = (me) this.f353a.a();
            z7 z7Var = (z7) this.b.a();
            String str = this.c;
            oh ohVar = new oh();
            ohVar.J = meVar.a(ohVar);
            y7 y7Var = new y7(z7Var, ohVar.a(str));
            y7Var.e = this;
            y7Var.d = z7Var.a(ohVar.Z);
            c8 a2 = y7Var.a();
            this.e = a2;
            b7 b7Var = this.d;
            if (b7Var != null) {
                b7Var.a(this.c, a2, this.f);
            }
        } catch (Throwable th) {
            try {
                this.f = th;
                n8.a(th);
            } finally {
                b7 b7Var2 = this.d;
                if (b7Var2 != null) {
                    b7Var2.a(this.c, this.e, this.f);
                }
            }
        }
    }

    public static boolean a(Context context, String str, b7 b7Var) {
        try {
            com.startapp.sdk.components.a a2 = com.startapp.sdk.components.a.a(context);
            ((Executor) a2.A.a()).execute(new nh(a2.h, a2.m, str, b7Var));
            return true;
        } catch (Throwable th) {
            n8.a(th);
            if (b7Var == null) {
                return false;
            }
            b7Var.a(str, null, th);
            return false;
        }
    }
}
