package A2;

import N2.C0150f;
import N2.InterfaceC0152h;
import h2.AbstractC0439a;
import h2.AbstractC0454p;
import java.io.Closeable;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class z implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f223d;

    /* renamed from: e, reason: collision with root package name */
    public final long f224e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f225f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0152h f226g;

    public /* synthetic */ z(Object obj, long j3, InterfaceC0152h interfaceC0152h, int i3) {
        this.f223d = i3;
        this.f225f = obj;
        this.f224e = j3;
        this.f226g = interfaceC0152h;
    }

    public final long a() {
        switch (this.f223d) {
        }
        return this.f224e;
    }

    public final InterfaceC0152h b() {
        switch (this.f223d) {
            case 0:
                return (C0150f) this.f226g;
            default:
                return (N2.z) this.f226g;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        B2.c.c(b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r4 == null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String e() {
        s sVar;
        Charset charset;
        String str;
        Object obj = this.f225f;
        InterfaceC0152h b2 = b();
        try {
            switch (this.f223d) {
                case 0:
                    sVar = (s) obj;
                    break;
                default:
                    String str2 = (String) obj;
                    if (str2 != null) {
                        Pattern pattern = s.f138c;
                        try {
                            sVar = I2.l.z(str2);
                            break;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    sVar = null;
                    break;
            }
            if (sVar != null) {
                charset = AbstractC0439a.f5056a;
                String[] strArr = sVar.f141b;
                int i3 = 0;
                int D = I2.l.D(0, strArr.length - 1, 2);
                if (D >= 0) {
                    while (!AbstractC0454p.d0(strArr[i3], "charset", true)) {
                        if (i3 != D) {
                            i3 += 2;
                        }
                    }
                    str = strArr[i3 + 1];
                    if (str != null) {
                        try {
                            charset = Charset.forName(str);
                        } catch (IllegalArgumentException unused2) {
                        }
                    }
                }
                str = null;
                if (str != null) {
                }
            }
            charset = AbstractC0439a.f5056a;
            String N3 = b2.N(B2.c.r(b2, charset));
            I2.d.u(b2, null);
            return N3;
        } finally {
        }
    }
}
