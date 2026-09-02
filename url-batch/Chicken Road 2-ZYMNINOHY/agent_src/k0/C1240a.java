package k0;

import E.AbstractC0005f;
import M0.h;
import O0.c;
import T.C0097o;
import i2.AbstractC0457a;

/* renamed from: k0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1240a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1240a f14137a = new C1240a();

    public final AbstractC0457a a(C0097o c0097o) {
        String str = c0097o.n;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new I0.b(0);
                case "application/x-icy":
                    return new L0.a();
                case "application/id3":
                    return new h(null);
                case "application/x-emsg":
                    return new I0.b(1);
                case "application/x-scte35":
                    return new c();
            }
        }
        throw new IllegalArgumentException(AbstractC0005f.n("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(C0097o c0097o) {
        String str = c0097o.n;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
