package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class gi implements Runnable, g7 {

    /* renamed from: a, reason: collision with root package name */
    public final ib f7018a;

    /* renamed from: b, reason: collision with root package name */
    public final ib f7019b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7020c;

    /* renamed from: d, reason: collision with root package name */
    public final b9 f7021d;

    /* renamed from: e, reason: collision with root package name */
    public r8 f7022e;

    /* renamed from: f, reason: collision with root package name */
    public Throwable f7023f;

    public gi(ib ibVar, ib ibVar2, String str, b9 b9Var) {
        this.f7018a = ibVar;
        this.f7019b = ibVar2;
        this.f7020c = str;
        this.f7021d = b9Var;
    }

    @Override // com.startapp.sdk.internal.g7
    public final Object a(Object obj) {
        this.f7023f = (Throwable) obj;
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ef efVar = (ef) this.f7018a.a();
            o8 o8Var = (o8) this.f7019b.a();
            String str = this.f7020c;
            hi hiVar = new hi();
            hiVar.f7895J = efVar.a(hiVar);
            n8 n8Var = new n8(o8Var, hiVar.a(str));
            n8Var.f7329e = this;
            n8Var.f7328d = ((HttpClientConfig) o8Var.f7374f.a()).a(hiVar.f7910Z);
            r8 a3 = n8Var.a();
            this.f7022e = a3;
            b9 b9Var = this.f7021d;
            if (b9Var != null) {
                b9Var.a(this.f7020c, a3, this.f7023f);
            }
        } catch (Throwable th) {
            try {
                this.f7023f = th;
                d9.a(th);
            } finally {
                b9 b9Var2 = this.f7021d;
                if (b9Var2 != null) {
                    b9Var2.a(this.f7020c, this.f7022e, this.f7023f);
                }
            }
        }
    }

    public static boolean a(Context context, String str, b9 b9Var) {
        try {
            com.startapp.sdk.components.a a3 = com.startapp.sdk.components.a.a(context);
            ((Executor) a3.f6541A.a()).execute(new gi(a3.f6568i, a3.n, str, b9Var));
            return true;
        } catch (Throwable th) {
            d9.a(th);
            if (b9Var == null) {
                return false;
            }
            b9Var.a(str, (Object) null, th);
            return false;
        }
    }
}
