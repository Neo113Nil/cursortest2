package p5;

import D6.C;
import D6.E;
import R5.C0164d;
import T6.h;
import java.io.IOException;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f7198a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f7199b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ E f7200c;

    public b(C c7, E e7) {
        this.f7199b = c7;
        this.f7200c = e7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final byte[] a() {
        if (this.f7198a == null) {
            E e7 = this.f7200c;
            long a7 = e7.a();
            if (a7 > 2147483647L) {
                throw new IOException("Cannot buffer entire body for content length: " + a7);
            }
            h g7 = e7.g();
            byte[] th = null;
            try {
                byte[] n7 = g7.n();
                try {
                    g7.close();
                } catch (Throwable th2) {
                    th = th2;
                }
                th = th;
                th = n7;
            } catch (Throwable th3) {
                th = th3;
                if (g7 != null) {
                    try {
                        g7.close();
                    } catch (Throwable th4) {
                        C0164d.a(th, th4);
                    }
                }
            }
            if (th != 0) {
                throw th;
            }
            int length = th.length;
            if (a7 != -1 && a7 != length) {
                throw new IOException("Content-Length (" + a7 + ") and stream length (" + length + ") disagree");
            }
            this.f7198a = th;
        }
        return this.f7198a;
    }
}
