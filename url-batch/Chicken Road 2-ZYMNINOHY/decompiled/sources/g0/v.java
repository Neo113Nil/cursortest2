package g0;

import E.AbstractC0005f;
import T.C0096n;
import W.G;
import W.J;
import android.text.TextUtils;
import e1.AbstractC0405i;
import e1.AbstractC0407k;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import y0.F;

/* loaded from: classes.dex */
public final class v implements y0.n {

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f8988i = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f8989j = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a, reason: collision with root package name */
    public final String f8990a;

    /* renamed from: b, reason: collision with root package name */
    public final G f8991b;

    /* renamed from: d, reason: collision with root package name */
    public final V0.j f8993d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8994e;

    /* renamed from: f, reason: collision with root package name */
    public y0.p f8995f;

    /* renamed from: h, reason: collision with root package name */
    public int f8997h;

    /* renamed from: c, reason: collision with root package name */
    public final W.u f8992c = new W.u();

    /* renamed from: g, reason: collision with root package name */
    public byte[] f8996g = new byte[1024];

    public v(String str, G g4, V0.j jVar, boolean z) {
        this.f8990a = str;
        this.f8991b = g4;
        this.f8993d = jVar;
        this.f8994e = z;
    }

    @Override // y0.n
    public final void a(long j4, long j5) {
        throw new IllegalStateException();
    }

    @Override // y0.n
    public final boolean b(y0.o oVar) {
        y0.k kVar = (y0.k) oVar;
        kVar.l(this.f8996g, 0, 6, false);
        byte[] bArr = this.f8996g;
        W.u uVar = this.f8992c;
        uVar.K(6, bArr);
        if (AbstractC0407k.a(uVar)) {
            return true;
        }
        kVar.l(this.f8996g, 6, 3, false);
        uVar.K(9, this.f8996g);
        return AbstractC0407k.a(uVar);
    }

    @Override // y0.n
    public final int c(y0.o oVar, T.r rVar) {
        String n;
        this.f8995f.getClass();
        int length = (int) oVar.getLength();
        int i4 = this.f8997h;
        byte[] bArr = this.f8996g;
        if (i4 == bArr.length) {
            this.f8996g = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f8996g;
        int i5 = this.f8997h;
        int read = oVar.read(bArr2, i5, bArr2.length - i5);
        if (read != -1) {
            int i6 = this.f8997h + read;
            this.f8997h = i6;
            if (length == -1 || i6 != length) {
                return 0;
            }
        }
        W.u uVar = new W.u(this.f8996g);
        AbstractC0407k.d(uVar);
        String n4 = uVar.n(StandardCharsets.UTF_8);
        long j4 = 0;
        long j5 = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(n4)) {
                while (true) {
                    String n5 = uVar.n(StandardCharsets.UTF_8);
                    if (n5 == null) {
                        break;
                    }
                    if (AbstractC0407k.f8466a.matcher(n5).matches()) {
                        do {
                            n = uVar.n(StandardCharsets.UTF_8);
                            if (n != null) {
                            }
                        } while (!n.isEmpty());
                    } else {
                        Matcher matcher2 = AbstractC0405i.f8460a.matcher(n5);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    f(0L);
                    return -1;
                }
                String group = matcher.group(1);
                group.getClass();
                long c4 = AbstractC0407k.c(group);
                String str = J.f3263a;
                long b4 = this.f8991b.b(J.U((j4 + c4) - j5, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                F f4 = f(b4 - c4);
                byte[] bArr3 = this.f8996g;
                int i7 = this.f8997h;
                W.u uVar2 = this.f8992c;
                uVar2.K(i7, bArr3);
                f4.a(this.f8997h, uVar2);
                f4.e(b4, 1, this.f8997h, 0, null);
                return -1;
            }
            if (n4.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = f8988i.matcher(n4);
                if (!matcher3.find()) {
                    throw T.G.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(n4));
                }
                Matcher matcher4 = f8989j.matcher(n4);
                if (!matcher4.find()) {
                    throw T.G.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(n4));
                }
                String group2 = matcher3.group(1);
                group2.getClass();
                j5 = AbstractC0407k.c(group2);
                String group3 = matcher4.group(1);
                group3.getClass();
                long parseLong = Long.parseLong(group3);
                String str2 = J.f3263a;
                j4 = J.U(parseLong, 1000000L, 90000L, RoundingMode.DOWN);
            }
            n4 = uVar.n(StandardCharsets.UTF_8);
        }
    }

    @Override // y0.n
    public final void e(y0.p pVar) {
        if (this.f8994e) {
            pVar = new U.b(pVar, this.f8993d);
        }
        this.f8995f = pVar;
        pVar.x(new A0.b(-9223372036854775807L));
    }

    public final F f(long j4) {
        F z = this.f8995f.z(0, 3);
        C0096n c0096n = new C0096n();
        c0096n.f2831m = T.F.n("text/vtt");
        c0096n.f2822d = this.f8990a;
        c0096n.f2834r = j4;
        AbstractC0005f.w(c0096n, z);
        this.f8995f.r();
        return z;
    }

    @Override // y0.n
    public final void release() {
    }
}
