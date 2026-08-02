package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class gi implements Runnable, g7 {

    /* renamed from: a, reason: collision with root package name */
    public final ib f3896a;

    /* renamed from: b, reason: collision with root package name */
    public final ib f3897b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3898c;

    /* renamed from: d, reason: collision with root package name */
    public final b9 f3899d;

    /* renamed from: e, reason: collision with root package name */
    public r8 f3900e;
    public Throwable f;

    public gi(ib ibVar, ib ibVar2, String str, b9 b9Var) {
        this.f3896a = ibVar;
        this.f3897b = ibVar2;
        this.f3898c = str;
        this.f3899d = b9Var;
    }

    @Override // com.startapp.sdk.internal.g7
    public final Object a(Object obj) {
        this.f = (Throwable) obj;
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ef efVar = (ef) this.f3896a.a();
            o8 o8Var = (o8) this.f3897b.a();
            String str = this.f3898c;
            hi hiVar = new hi();
            hiVar.f4749J = efVar.a(hiVar);
            n8 n8Var = new n8(o8Var, hiVar.a(str));
            n8Var.f4196e = this;
            n8Var.f4195d = ((HttpClientConfig) o8Var.f.a()).a(hiVar.f4764Z);
            r8 a3 = n8Var.a();
            this.f3900e = a3;
            b9 b9Var = this.f3899d;
            if (b9Var != null) {
                b9Var.a(this.f3898c, a3, this.f);
            }
        } catch (Throwable th) {
            try {
                this.f = th;
                d9.a(th);
            } finally {
                b9 b9Var2 = this.f3899d;
                if (b9Var2 != null) {
                    b9Var2.a(this.f3898c, this.f3900e, this.f);
                }
            }
        }
    }

    public static boolean a(Context context, String str, b9 b9Var) {
        try {
            com.startapp.sdk.components.a a3 = com.startapp.sdk.components.a.a(context);
            ((Executor) a3.f3443A.a()).execute(new gi(a3.f3469i, a3.f3474n, str, b9Var));
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
