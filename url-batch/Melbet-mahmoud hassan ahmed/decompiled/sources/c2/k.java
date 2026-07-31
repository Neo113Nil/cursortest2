package c2;

import r0.s1;

/* loaded from: classes.dex */
public interface k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f1872a = new a();

    class a implements k {
        a() {
        }

        @Override // c2.k
        public boolean b(s1 s1Var) {
            String str = s1Var.f20956q;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str);
        }

        @Override // c2.k
        public i c(s1 s1Var) {
            String str = s1Var.f20956q;
            if (str != null) {
                switch (str) {
                    case "application/dvbsubs":
                        return new e2.a(s1Var.f20958s);
                    case "application/pgs":
                        return new f2.a();
                    case "application/x-mp4-vtt":
                        return new l2.a();
                    case "text/vtt":
                        return new l2.h();
                    case "application/x-quicktime-tx3g":
                        return new k2.a(s1Var.f20958s);
                    case "text/x-ssa":
                        return new h2.a(s1Var.f20958s);
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new d2.a(str, s1Var.I, 16000L);
                    case "text/x-exoplayer-cues":
                        return new f();
                    case "application/cea-708":
                        return new d2.c(s1Var.I, s1Var.f20958s);
                    case "application/x-subrip":
                        return new i2.a();
                    case "application/ttml+xml":
                        return new j2.c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean b(s1 s1Var);

    i c(s1 s1Var);
}
