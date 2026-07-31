package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class ru3 extends vu3 implements p7 {

    /* renamed from: n, reason: collision with root package name */
    q7 f11424n;

    /* renamed from: o, reason: collision with root package name */
    protected final String f11425o = "moov";

    public ru3(String str) {
    }

    @Override // com.google.android.gms.internal.ads.p7
    public final void b(q7 q7Var) {
        this.f11424n = q7Var;
    }

    @Override // com.google.android.gms.internal.ads.p7
    public final void f(wu3 wu3Var, ByteBuffer byteBuffer, long j7, m7 m7Var) {
        wu3Var.a();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.f13504g = wu3Var;
        this.f13506i = wu3Var.a();
        wu3Var.e(wu3Var.a() + j7);
        this.f13507j = wu3Var.a();
        this.f13503f = m7Var;
    }

    @Override // com.google.android.gms.internal.ads.p7
    public final String zza() {
        return this.f11425o;
    }
}
