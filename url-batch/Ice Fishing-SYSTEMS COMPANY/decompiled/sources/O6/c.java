package O6;

import e8.w;
import e8.y;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f2529a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f2530b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f2531c;

    public c(w wVar, y yVar) {
        this.f2530b = wVar;
        this.f2531c = yVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final byte[] a() {
        if (this.f2529a == null) {
            y yVar = this.f2531c;
            long b9 = yVar.b();
            if (b9 > 2147483647L) {
                throw new IOException("Cannot buffer entire body for content length: " + b9);
            }
            u8.g z8 = yVar.z();
            byte[] th = null;
            try {
                byte[] P8 = z8.P();
                try {
                    z8.close();
                } catch (Throwable th2) {
                    th = th2;
                }
                th = th;
                th = P8;
            } catch (Throwable th3) {
                th = th3;
                if (z8 != null) {
                    try {
                        z8.close();
                    } catch (Throwable th4) {
                        com.bumptech.glide.d.b(th, th4);
                    }
                }
            }
            if (th != 0) {
                throw th;
            }
            int length = th.length;
            if (b9 != -1 && b9 != length) {
                throw new IOException("Content-Length (" + b9 + ") and stream length (" + length + ") disagree");
            }
            this.f2529a = th;
        }
        return this.f2529a;
    }
}
