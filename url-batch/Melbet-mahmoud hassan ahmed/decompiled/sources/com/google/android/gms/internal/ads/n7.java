package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class n7 extends vu3 {

    /* renamed from: n, reason: collision with root package name */
    private static final cv3 f8967n = cv3.b(n7.class);

    public n7(wu3 wu3Var, m7 m7Var) {
        q(wu3Var, wu3Var.c(), m7Var);
    }

    @Override // com.google.android.gms.internal.ads.vu3, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.vu3
    public final String toString() {
        String obj = this.f13504g.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
