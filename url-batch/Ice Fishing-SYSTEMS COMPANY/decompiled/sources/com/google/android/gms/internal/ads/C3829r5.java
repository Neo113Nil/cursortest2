package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.r5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3829r5 extends AbstractC3632nN {
    static {
        C3686oN.j(C3829r5.class);
    }

    public C3829r5(C2587Hg c2587Hg, C2604Ig c2604Ig) {
        ByteBuffer byteBuffer = c2587Hg.f25379n;
        long limit = byteBuffer.limit();
        this.f32854u = c2587Hg;
        this.f32856w = c2587Hg.b();
        byteBuffer.position((int) (c2587Hg.b() + limit));
        this.f32857x = c2587Hg.b();
        this.f32853n = c2604Ig;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3632nN, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3632nN
    public final String toString() {
        String obj = this.f32854u.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
