package j1;

import r0.s1;

/* loaded from: classes.dex */
public interface d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f18074a = new a();

    class a implements d {
        a() {
        }

        @Override // j1.d
        public boolean b(s1 s1Var) {
            String str = s1Var.f20956q;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // j1.d
        public c c(s1 s1Var) {
            String str = s1Var.f20956q;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new k1.b();
                    case "application/x-icy":
                        return new n1.a();
                    case "application/id3":
                        return new o1.h();
                    case "application/x-emsg":
                        return new l1.b();
                    case "application/x-scte35":
                        return new q1.c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean b(s1 s1Var);

    c c(s1 s1Var);
}
