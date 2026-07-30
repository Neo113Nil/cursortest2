package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.q5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3776q5 {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f33644b = Logger.getLogger(AbstractC3776q5.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final H7.b f33645a = new H7.b(2);

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC3883s5 a(C2587Hg c2587Hg, AbstractC3632nN abstractC3632nN) {
        int a9;
        ByteBuffer byteBuffer;
        long limit;
        InterfaceC3883s5 c4099w5;
        InterfaceC3883s5 interfaceC3883s5;
        long b9 = c2587Hg.b();
        H7.b bVar = this.f33645a;
        ((ByteBuffer) bVar.get()).rewind().limit(8);
        do {
            a9 = c2587Hg.a((ByteBuffer) bVar.get());
            byteBuffer = c2587Hg.f25379n;
            if (a9 == 8) {
                ((ByteBuffer) bVar.get()).rewind();
                long g9 = PA.g((ByteBuffer) bVar.get());
                if (g9 < 8 && g9 > 1) {
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(g9);
                    sb.append("). Stop parsing!");
                    f33644b.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr = new byte[4];
                ((ByteBuffer) bVar.get()).get(bArr);
                try {
                    String str = new String(bArr, "ISO-8859-1");
                    if (g9 == 1) {
                        ((ByteBuffer) bVar.get()).limit(16);
                        c2587Hg.a((ByteBuffer) bVar.get());
                        ((ByteBuffer) bVar.get()).position(8);
                        limit = PA.D((ByteBuffer) bVar.get()) - 16;
                    } else {
                        limit = g9 == 0 ? byteBuffer.limit() - c2587Hg.b() : g9 - 8;
                    }
                    if ("uuid".equals(str)) {
                        ((ByteBuffer) bVar.get()).limit(((ByteBuffer) bVar.get()).limit() + 16);
                        c2587Hg.a((ByteBuffer) bVar.get());
                        byte[] bArr2 = new byte[16];
                        for (int position = ((ByteBuffer) bVar.get()).position() - 16; position < ((ByteBuffer) bVar.get()).position(); position++) {
                            bArr2[position - (((ByteBuffer) bVar.get()).position() - 16)] = ((ByteBuffer) bVar.get()).get(position);
                        }
                        limit -= 16;
                    }
                    long j9 = limit;
                    if (abstractC3632nN instanceof InterfaceC3883s5) {
                    }
                    if ("moov".equals(str)) {
                        c4099w5 = new C3937t5();
                    } else {
                        if ("mvhd".equals(str)) {
                            C3991u5 c3991u5 = new C3991u5("mvhd");
                            c3991u5.f34539G = 1.0d;
                            c3991u5.f34540H = 1.0f;
                            c3991u5.f34541I = C3847rN.f34010j;
                            interfaceC3883s5 = c3991u5;
                            ((ByteBuffer) bVar.get()).rewind();
                            interfaceC3883s5.a(c2587Hg, (ByteBuffer) bVar.get(), j9, this);
                            return interfaceC3883s5;
                        }
                        c4099w5 = new C4099w5(str, 0);
                    }
                    interfaceC3883s5 = c4099w5;
                    ((ByteBuffer) bVar.get()).rewind();
                    interfaceC3883s5.a(c2587Hg, (ByteBuffer) bVar.get(), j9, this);
                    return interfaceC3883s5;
                } catch (UnsupportedEncodingException e6) {
                    throw new RuntimeException(e6);
                }
            }
        } while (a9 >= 0);
        byteBuffer.position((int) b9);
        throw new EOFException();
    }
}
