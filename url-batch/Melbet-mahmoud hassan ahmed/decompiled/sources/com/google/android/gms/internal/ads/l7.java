package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class l7 implements m7 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f7849b = Logger.getLogger(l7.class.getName());

    /* renamed from: a, reason: collision with root package name */
    final ThreadLocal<ByteBuffer> f7850a = new k7(this);

    @Override // com.google.android.gms.internal.ads.m7
    public final p7 a(wu3 wu3Var, q7 q7Var) {
        int G;
        long c7;
        long a7 = wu3Var.a();
        this.f7850a.get().rewind().limit(8);
        do {
            G = wu3Var.G(this.f7850a.get());
            if (G == 8) {
                this.f7850a.get().rewind();
                long e7 = o7.e(this.f7850a.get());
                byte[] bArr = null;
                if (e7 < 8 && e7 > 1) {
                    Logger logger = f7849b;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(e7);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                this.f7850a.get().get(bArr2);
                try {
                    String str = new String(bArr2, "ISO-8859-1");
                    if (e7 == 1) {
                        this.f7850a.get().limit(16);
                        wu3Var.G(this.f7850a.get());
                        this.f7850a.get().position(8);
                        c7 = o7.f(this.f7850a.get()) - 16;
                    } else {
                        c7 = e7 == 0 ? wu3Var.c() - wu3Var.a() : e7 - 8;
                    }
                    if ("uuid".equals(str)) {
                        this.f7850a.get().limit(this.f7850a.get().limit() + 16);
                        wu3Var.G(this.f7850a.get());
                        bArr = new byte[16];
                        for (int position = this.f7850a.get().position() - 16; position < this.f7850a.get().position(); position++) {
                            bArr[position - (this.f7850a.get().position() - 16)] = this.f7850a.get().get(position);
                        }
                        c7 -= 16;
                    }
                    long j7 = c7;
                    p7 b7 = b(str, bArr, q7Var instanceof p7 ? ((p7) q7Var).zza() : "");
                    b7.b(q7Var);
                    this.f7850a.get().rewind();
                    b7.f(wu3Var, this.f7850a.get(), j7, this);
                    return b7;
                } catch (UnsupportedEncodingException e8) {
                    throw new RuntimeException(e8);
                }
            }
        } while (G >= 0);
        wu3Var.e(a7);
        throw new EOFException();
    }

    public abstract p7 b(String str, byte[] bArr, String str2);
}
