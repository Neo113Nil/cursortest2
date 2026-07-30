package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.mN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3578mN implements InterfaceC3883s5 {

    /* renamed from: A, reason: collision with root package name */
    public static final C3686oN f32683A = C3686oN.j(AbstractC3578mN.class);

    /* renamed from: n, reason: collision with root package name */
    public final String f32684n;

    /* renamed from: w, reason: collision with root package name */
    public ByteBuffer f32687w;

    /* renamed from: x, reason: collision with root package name */
    public long f32688x;

    /* renamed from: z, reason: collision with root package name */
    public C2587Hg f32690z;

    /* renamed from: y, reason: collision with root package name */
    public long f32689y = -1;

    /* renamed from: v, reason: collision with root package name */
    public boolean f32686v = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f32685u = true;

    public AbstractC3578mN(String str) {
        this.f32684n = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3883s5
    public final void a(C2587Hg c2587Hg, ByteBuffer byteBuffer, long j9, AbstractC3776q5 abstractC3776q5) {
        this.f32688x = c2587Hg.b();
        byteBuffer.remaining();
        this.f32689y = j9;
        this.f32690z = c2587Hg;
        c2587Hg.f25379n.position((int) (c2587Hg.b() + j9));
        this.f32686v = false;
        this.f32685u = false;
        d();
    }

    public final synchronized void b() {
        try {
            if (this.f32686v) {
                return;
            }
            try {
                C3686oN c3686oN = f32683A;
                String str = this.f32684n;
                c3686oN.d(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                C2587Hg c2587Hg = this.f32690z;
                long j9 = this.f32688x;
                long j10 = this.f32689y;
                ByteBuffer byteBuffer = c2587Hg.f25379n;
                int position = byteBuffer.position();
                byteBuffer.position((int) j9);
                ByteBuffer slice = byteBuffer.slice();
                slice.limit((int) j10);
                byteBuffer.position(position);
                this.f32687w = slice;
                this.f32686v = true;
            } catch (IOException e6) {
                throw new RuntimeException(e6);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract void c(ByteBuffer byteBuffer);

    public final synchronized void d() {
        try {
            b();
            C3686oN c3686oN = f32683A;
            String str = this.f32684n;
            c3686oN.d(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.f32687w;
            if (byteBuffer != null) {
                this.f32685u = true;
                byteBuffer.rewind();
                c(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.f32687w = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
