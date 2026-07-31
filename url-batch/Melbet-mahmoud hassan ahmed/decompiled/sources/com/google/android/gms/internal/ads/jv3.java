package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class jv3<T> implements yv3, ev3 {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f7259c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile yv3<T> f7260a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f7261b = f7259c;

    private jv3(yv3<T> yv3Var) {
        this.f7260a = yv3Var;
    }

    public static <P extends yv3<T>, T> ev3<T> b(P p7) {
        if (p7 instanceof ev3) {
            return (ev3) p7;
        }
        Objects.requireNonNull(p7);
        return new jv3(p7);
    }

    public static <P extends yv3<T>, T> yv3<T> c(P p7) {
        Objects.requireNonNull(p7);
        return p7 instanceof jv3 ? p7 : new jv3(p7);
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final T a() {
        T t6 = (T) this.f7261b;
        Object obj = f7259c;
        if (t6 == obj) {
            synchronized (this) {
                t6 = (T) this.f7261b;
                if (t6 == obj) {
                    t6 = this.f7260a.a();
                    Object obj2 = this.f7261b;
                    if (obj2 != obj && obj2 != t6) {
                        String valueOf = String.valueOf(obj2);
                        String valueOf2 = String.valueOf(t6);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 118 + valueOf2.length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(valueOf);
                        sb.append(" & ");
                        sb.append(valueOf2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.f7261b = t6;
                    this.f7260a = null;
                }
            }
        }
        return t6;
    }
}
