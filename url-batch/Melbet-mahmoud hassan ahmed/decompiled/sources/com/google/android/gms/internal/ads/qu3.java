package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class qu3 implements p7 {

    /* renamed from: o, reason: collision with root package name */
    private static final cv3 f10834o = cv3.b(qu3.class);

    /* renamed from: f, reason: collision with root package name */
    protected final String f10835f;

    /* renamed from: g, reason: collision with root package name */
    private q7 f10836g;

    /* renamed from: j, reason: collision with root package name */
    private ByteBuffer f10839j;

    /* renamed from: k, reason: collision with root package name */
    long f10840k;

    /* renamed from: m, reason: collision with root package name */
    wu3 f10842m;

    /* renamed from: l, reason: collision with root package name */
    long f10841l = -1;

    /* renamed from: n, reason: collision with root package name */
    private ByteBuffer f10843n = null;

    /* renamed from: i, reason: collision with root package name */
    boolean f10838i = true;

    /* renamed from: h, reason: collision with root package name */
    boolean f10837h = true;

    protected qu3(String str) {
        this.f10835f = str;
    }

    private final synchronized void a() {
        if (this.f10838i) {
            return;
        }
        try {
            cv3 cv3Var = f10834o;
            String str = this.f10835f;
            cv3Var.a(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
            this.f10839j = this.f10842m.J(this.f10840k, this.f10841l);
            this.f10838i = true;
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.p7
    public final void b(q7 q7Var) {
        this.f10836g = q7Var;
    }

    protected abstract void c(ByteBuffer byteBuffer);

    public final synchronized void d() {
        a();
        cv3 cv3Var = f10834o;
        String str = this.f10835f;
        cv3Var.a(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
        ByteBuffer byteBuffer = this.f10839j;
        if (byteBuffer != null) {
            this.f10837h = true;
            byteBuffer.rewind();
            c(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.f10843n = byteBuffer.slice();
            }
            this.f10839j = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.p7
    public final void f(wu3 wu3Var, ByteBuffer byteBuffer, long j7, m7 m7Var) {
        this.f10840k = wu3Var.a();
        byteBuffer.remaining();
        this.f10841l = j7;
        this.f10842m = wu3Var;
        wu3Var.e(wu3Var.a() + j7);
        this.f10838i = false;
        this.f10837h = false;
        d();
    }

    @Override // com.google.android.gms.internal.ads.p7
    public final String zza() {
        return this.f10835f;
    }
}
