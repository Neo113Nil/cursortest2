package com.google.android.gms.internal.ads;

import java.lang.Throwable;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
abstract class s93<V, X extends Throwable, F, T> extends hb3<V> implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    cc3<? extends V> f11739m;

    /* renamed from: n, reason: collision with root package name */
    Class<X> f11740n;

    /* renamed from: o, reason: collision with root package name */
    F f11741o;

    s93(cc3<? extends V> cc3Var, Class<X> cls, F f7) {
        Objects.requireNonNull(cc3Var);
        this.f11739m = cc3Var;
        this.f11740n = cls;
        Objects.requireNonNull(f7);
        this.f11741o = f7;
    }

    abstract T F(F f7, X x6);

    abstract void G(T t6);

    @Override // com.google.android.gms.internal.ads.ga3
    protected final String i() {
        String str;
        cc3<? extends V> cc3Var = this.f11739m;
        Class<X> cls = this.f11740n;
        F f7 = this.f11741o;
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
        if (cls == null || f7 == null) {
            if (i7 != null) {
                return i7.length() != 0 ? str.concat(i7) : new String(str);
            }
            return null;
        }
        String obj2 = cls.toString();
        String obj3 = f7.toString();
        StringBuilder sb2 = new StringBuilder(str.length() + 29 + obj2.length() + obj3.length());
        sb2.append(str);
        sb2.append("exceptionType=[");
        sb2.append(obj2);
        sb2.append("], fallback=[");
        sb2.append(obj3);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.ga3
    protected final void j() {
        u(this.f11739m);
        this.f11739m = null;
        this.f11740n = null;
        this.f11741o = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARN: Type inference failed for: r3v4, types: [F, java.lang.Class<X extends java.lang.Throwable>] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        cc3<? extends V> cc3Var = this.f11739m;
        Class<X> cls = this.f11740n;
        F f7 = this.f11741o;
        if (((f7 == null) || ((cc3Var == null) | (cls == null))) || isCancelled()) {
            return;
        }
        ?? r32 = (Class<X>) null;
        this.f11739m = null;
        try {
            th = cc3Var instanceof uc3 ? ((uc3) cc3Var).a() : null;
        } catch (ExecutionException e7) {
            Throwable cause = e7.getCause();
            if (cause == null) {
                String valueOf = String.valueOf(cc3Var.getClass());
                String valueOf2 = String.valueOf(e7.getClass());
                StringBuilder sb = new StringBuilder(valueOf.length() + 35 + valueOf2.length());
                sb.append("Future type ");
                sb.append(valueOf);
                sb.append(" threw ");
                sb.append(valueOf2);
                sb.append(" without a cause");
                cause = new NullPointerException(sb.toString());
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            obj = rb3.p(cc3Var);
            if (th != null) {
                w(obj);
                return;
            }
            if (!cls.isInstance(th)) {
                y(cc3Var);
                return;
            }
            try {
                Object F = F(f7, th);
                this.f11740n = null;
                this.f11741o = null;
                G(F);
                return;
            } catch (Throwable th2) {
                try {
                    x(th2);
                    return;
                } finally {
                    this.f11740n = null;
                    this.f11741o = null;
                }
            }
        }
        obj = null;
        if (th != null) {
        }
    }
}
