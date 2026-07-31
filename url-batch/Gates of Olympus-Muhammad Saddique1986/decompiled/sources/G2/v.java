package G2;

import T2.C0231f;
import T2.InterfaceC0233h;
import T2.z;
import java.io.Closeable;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import n2.AbstractC0721a;
import n2.AbstractC0737q;

/* loaded from: classes.dex */
public final class v implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2307d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2308e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2309f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0233h f2310g;

    public /* synthetic */ v(Object obj, long j3, InterfaceC0233h interfaceC0233h, int i3) {
        this.f2307d = i3;
        this.f2309f = obj;
        this.f2308e = j3;
        this.f2310g = interfaceC0233h;
    }

    public final long a() {
        switch (this.f2307d) {
        }
        return this.f2308e;
    }

    public final InterfaceC0233h b() {
        switch (this.f2307d) {
            case 0:
                return (C0231f) this.f2310g;
            default:
                return (z) this.f2310g;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        H2.b.c(b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r4 == null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String d() {
        p pVar;
        Charset charset;
        String str;
        Object obj = this.f2309f;
        InterfaceC0233h b3 = b();
        try {
            switch (this.f2307d) {
                case 0:
                    pVar = (p) obj;
                    break;
                default:
                    String str2 = (String) obj;
                    if (str2 != null) {
                        Pattern pattern = p.f2224c;
                        try {
                            pVar = O2.d.N(str2);
                            break;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    pVar = null;
                    break;
            }
            if (pVar != null) {
                charset = AbstractC0721a.f7347a;
                String[] strArr = pVar.f2227b;
                int i3 = 0;
                int e02 = O2.l.e0(0, strArr.length - 1, 2);
                if (e02 >= 0) {
                    while (!AbstractC0737q.s(strArr[i3], "charset", true)) {
                        if (i3 != e02) {
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
            charset = AbstractC0721a.f7347a;
            String B3 = b3.B(H2.b.r(b3, charset));
            O2.d.t(b3, null);
            return B3;
        } finally {
        }
    }
}
