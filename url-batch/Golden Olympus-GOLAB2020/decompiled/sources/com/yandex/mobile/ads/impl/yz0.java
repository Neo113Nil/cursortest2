package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public interface yz0 {

    /* renamed from: a, reason: collision with root package name */
    public static final yz0 f35406a = new a();

    final class a implements yz0 {
        a() {
        }

        @Override // com.yandex.mobile.ads.impl.yz0
        public final boolean a(yb0 yb0Var) {
            String str = yb0Var.f34991m;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // com.yandex.mobile.ads.impl.yz0
        public final hy1 b(yb0 yb0Var) {
            String str = yb0Var.f34991m;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new C1973he();
                    case "application/x-icy":
                        return new vh0();
                    case "application/id3":
                        return new yh0(null);
                    case "application/x-emsg":
                        return new p50();
                    case "application/x-scte35":
                        return new h12();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean a(yb0 yb0Var);

    hy1 b(yb0 yb0Var);
}
