package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
abstract class ma3<I, O, F, T> extends hb3<O> implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f8472o = 0;

    /* renamed from: m, reason: collision with root package name */
    cc3<? extends I> f8473m;

    /* renamed from: n, reason: collision with root package name */
    F f8474n;

    ma3(cc3<? extends I> cc3Var, F f7) {
        Objects.requireNonNull(cc3Var);
        this.f8473m = cc3Var;
        Objects.requireNonNull(f7);
        this.f8474n = f7;
    }

    abstract T F(F f7, I i7);

    abstract void G(T t6);

    @Override // com.google.android.gms.internal.ads.ga3
    protected final String i() {
        String str;
        cc3<? extends I> cc3Var = this.f8473m;
        F f7 = this.f8474n;
        String i7 = super.i();
        if (cc3Var != null) {
            String obj = cc3Var.toString();
            StringBuilder sb = new StringBuilder(obj.length() + 16);
            sb.append("inputFuture=[");
            sb.append(obj);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (f7 == null) {
            if (i7 != null) {
                return i7.length() != 0 ? str.concat(i7) : new String(str);
            }
            return null;
        }
        String obj2 = f7.toString();
        StringBuilder sb2 = new StringBuilder(str.length() + 11 + obj2.length());
        sb2.append(str);
        sb2.append("function=[");
        sb2.append(obj2);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.ga3
    protected final void j() {
        u(this.f8473m);
        this.f8473m = null;
        this.f8474n = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        cc3<? extends I> cc3Var = this.f8473m;
        F f7 = this.f8474n;
        if ((isCancelled() | (cc3Var == null)) || (f7 == null)) {
            return;
        }
        this.f8473m = null;
        if (cc3Var.isCancelled()) {
            y(cc3Var);
            return;
        }
        try {
            try {
                Object F = F(f7, rb3.p(cc3Var));
                this.f8474n = null;
                G(F);
            } catch (Throwable th) {
                try {
                    x(th);
                } finally {
                    this.f8474n = null;
                }
            }
        } catch (Error e7) {
            x(e7);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e8) {
            x(e8);
        } catch (ExecutionException e9) {
            x(e9.getCause());
        }
    }
}
