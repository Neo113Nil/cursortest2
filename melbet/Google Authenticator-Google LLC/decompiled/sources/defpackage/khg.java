package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import org.chromium.net.BidirectionalStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class khg extends kel {
    private static final jyq B;
    public static final jzw n;
    public final /* synthetic */ kef A;
    public kbq o;
    public kaa p;
    public Charset q;
    public boolean r;
    public final Object s;
    public final Collection t;
    public boolean u;
    public boolean v;
    public int w;
    public kbq x;
    public boolean y;
    public boolean z;

    static {
        khf khfVar = new khf(0);
        B = khfVar;
        n = jyr.a(":status", khfVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public khg(kef kefVar, int i, kmm kmmVar, Object obj, kmt kmtVar) {
        super(i, kmmVar, kmtVar);
        this.A = kefVar;
        this.q = StandardCharsets.UTF_8;
        this.t = new ArrayList();
        this.v = false;
        this.s = obj;
    }

    public static Charset g(kaa kaaVar) {
        String str = (String) kaaVar.c(khd.h);
        if (str != null) {
            try {
                return Charset.forName(str.split("charset=", 2)[r2.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return StandardCharsets.UTF_8;
    }

    public static void h(kaa kaaVar) {
        kaaVar.f(n);
        kaaVar.f(jyt.b);
        kaaVar.f(jyt.a);
    }

    public static final kbq i(kaa kaaVar) {
        char charAt;
        Integer num = (Integer) kaaVar.c(n);
        if (num == null) {
            return kbq.k.e("Missing HTTP status code");
        }
        String str = (String) kaaVar.c(khd.h);
        if (str != null && str.length() >= 16) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (charAt = lowerCase.charAt(16)) == '+' || charAt == ';')) {
                return null;
            }
        }
        kbq a = khd.a(num.intValue());
        return str == null ? a.a("missing content-type in response headers") : a.a("invalid content-type: ".concat(str));
    }

    @Override // defpackage.kjc
    public final void j(int i) {
        kef kefVar = this.A;
        BidirectionalStream bidirectionalStream = kefVar.l;
        bidirectionalStream.getClass();
        int i2 = this.w - i;
        this.w = i2;
        if (i2 != 0 || this.y) {
            return;
        }
        bidirectionalStream.read(ByteBuffer.allocateDirect(kefVar.p));
    }

    @Override // defpackage.kjc
    public final void k(Throwable th) {
        l(kbq.c(th), true, new kaa());
    }

    public final void l(kbq kbqVar, boolean z, kaa kaaVar) {
        BidirectionalStream bidirectionalStream = this.A.l;
        bidirectionalStream.getClass();
        bidirectionalStream.cancel();
        f(kbqVar, z, kaaVar);
    }

    public final void m() {
        hoq.H(this.i != null);
        synchronized (this.a) {
            hoq.I(!this.e, "Already allocated");
            this.e = true;
        }
        super.b();
    }
}
