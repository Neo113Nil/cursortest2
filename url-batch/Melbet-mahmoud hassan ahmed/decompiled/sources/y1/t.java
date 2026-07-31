package y1;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o2.a0;
import o2.i0;
import r0.n2;
import r0.s1;
import w0.b0;
import w0.e0;

/* loaded from: classes.dex */
public final class t implements w0.l {

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f23374g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f23375h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a, reason: collision with root package name */
    private final String f23376a;

    /* renamed from: b, reason: collision with root package name */
    private final i0 f23377b;

    /* renamed from: d, reason: collision with root package name */
    private w0.n f23379d;

    /* renamed from: f, reason: collision with root package name */
    private int f23381f;

    /* renamed from: c, reason: collision with root package name */
    private final a0 f23378c = new a0();

    /* renamed from: e, reason: collision with root package name */
    private byte[] f23380e = new byte[1024];

    public t(String str, i0 i0Var) {
        this.f23376a = str;
        this.f23377b = i0Var;
    }

    private e0 c(long j7) {
        e0 d7 = this.f23379d.d(0, 3);
        d7.e(new s1.b().e0("text/vtt").V(this.f23376a).i0(j7).E());
        this.f23379d.j();
        return d7;
    }

    private void f() {
        a0 a0Var = new a0(this.f23380e);
        l2.i.e(a0Var);
        long j7 = 0;
        long j8 = 0;
        for (String o7 = a0Var.o(); !TextUtils.isEmpty(o7); o7 = a0Var.o()) {
            if (o7.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f23374g.matcher(o7);
                if (!matcher.find()) {
                    throw n2.a("X-TIMESTAMP-MAP doesn't contain local timestamp: " + o7, null);
                }
                Matcher matcher2 = f23375h.matcher(o7);
                if (!matcher2.find()) {
                    throw n2.a("X-TIMESTAMP-MAP doesn't contain media timestamp: " + o7, null);
                }
                j8 = l2.i.d((String) o2.a.e(matcher.group(1)));
                j7 = i0.f(Long.parseLong((String) o2.a.e(matcher2.group(1))));
            }
        }
        Matcher a7 = l2.i.a(a0Var);
        if (a7 == null) {
            c(0L);
            return;
        }
        long d7 = l2.i.d((String) o2.a.e(a7.group(1)));
        long b7 = this.f23377b.b(i0.j((j7 + d7) - j8));
        e0 c7 = c(b7 - d7);
        this.f23378c.M(this.f23380e, this.f23381f);
        c7.d(this.f23378c, this.f23381f);
        c7.b(b7, 1, this.f23381f, 0, null);
    }

    @Override // w0.l
    public void a() {
    }

    @Override // w0.l
    public void b(long j7, long j8) {
        throw new IllegalStateException();
    }

    @Override // w0.l
    public void d(w0.n nVar) {
        this.f23379d = nVar;
        nVar.i(new b0.b(-9223372036854775807L));
    }

    @Override // w0.l
    public int e(w0.m mVar, w0.a0 a0Var) {
        o2.a.e(this.f23379d);
        int a7 = (int) mVar.a();
        int i7 = this.f23381f;
        byte[] bArr = this.f23380e;
        if (i7 == bArr.length) {
            this.f23380e = Arrays.copyOf(bArr, ((a7 != -1 ? a7 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f23380e;
        int i8 = this.f23381f;
        int read = mVar.read(bArr2, i8, bArr2.length - i8);
        if (read != -1) {
            int i9 = this.f23381f + read;
            this.f23381f = i9;
            if (a7 == -1 || i9 != a7) {
                return 0;
            }
        }
        f();
        return -1;
    }

    @Override // w0.l
    public boolean h(w0.m mVar) {
        mVar.l(this.f23380e, 0, 6, false);
        this.f23378c.M(this.f23380e, 6);
        if (l2.i.b(this.f23378c)) {
            return true;
        }
        mVar.l(this.f23380e, 6, 3, false);
        this.f23378c.M(this.f23380e, 9);
        return l2.i.b(this.f23378c);
    }
}
