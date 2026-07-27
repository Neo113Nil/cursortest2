package m3;

import java.io.Closeable;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import z3.C1448f;
import z3.InterfaceC1450h;

/* loaded from: classes.dex */
public final class x implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8486d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final long f8487e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f8488i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC1450h f8489j;

    public x(String str, long j4, z3.z source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f8488i = str;
        this.f8487e = j4;
        this.f8489j = source;
    }

    public final long a() {
        switch (this.f8486d) {
        }
        return this.f8487e;
    }

    public final InterfaceC1450h b() {
        switch (this.f8486d) {
            case 0:
                return (C1448f) this.f8489j;
            default:
                return (z3.z) this.f8489j;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        n3.b.c(b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r4 == null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String d() {
        p pVar;
        Charset charset;
        String str;
        Object obj = this.f8488i;
        InterfaceC1450h b4 = b();
        try {
            switch (this.f8486d) {
                case 0:
                    pVar = (p) obj;
                    break;
                default:
                    String str2 = (String) obj;
                    if (str2 != null) {
                        Pattern pattern = p.f8402c;
                        Intrinsics.checkNotNullParameter(str2, "<this>");
                        try {
                            pVar = o.p(str2);
                            break;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    pVar = null;
                    break;
            }
            if (pVar != null) {
                charset = Charsets.UTF_8;
                Intrinsics.checkNotNullParameter("charset", "name");
                String[] strArr = pVar.f8405b;
                int i2 = 0;
                int a4 = G2.b.a(0, strArr.length - 1, 2);
                if (a4 >= 0) {
                    while (!kotlin.text.u.i(true, strArr[i2], "charset")) {
                        if (i2 != a4) {
                            i2 += 2;
                        }
                    }
                    str = strArr[i2 + 1];
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
            charset = Charsets.UTF_8;
            String o4 = b4.o(n3.b.r(b4, charset));
            J2.q.a(b4, null);
            return o4;
        } finally {
        }
    }

    public x(p pVar, long j4, C1448f c1448f) {
        this.f8488i = pVar;
        this.f8487e = j4;
        this.f8489j = c1448f;
    }
}
