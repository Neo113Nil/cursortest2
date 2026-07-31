package I4;

import X5.w;
import X5.y;
import java.io.IOException;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f1203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f1204b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f1205c;

    public c(w wVar, y yVar) {
        this.f1204b = wVar;
        this.f1205c = yVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final byte[] a() {
        if (this.f1203a == null) {
            y yVar = this.f1205c;
            long a7 = yVar.a();
            if (a7 > 2147483647L) {
                throw new IOException("Cannot buffer entire body for content length: " + a7);
            }
            n6.h e4 = yVar.e();
            byte[] th = null;
            try {
                byte[] q6 = e4.q();
                try {
                    e4.close();
                } catch (Throwable th2) {
                    th = th2;
                }
                th = th;
                th = q6;
            } catch (Throwable th3) {
                th = th3;
                if (e4 != null) {
                    try {
                        e4.close();
                    } catch (Throwable th4) {
                        i6.g.a(th, th4);
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
            this.f1203a = th;
        }
        return this.f1203a;
    }
}
