package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public interface f32 {

    /* renamed from: a, reason: collision with root package name */
    public static final f32 f25604a = new a();

    final class a implements f32 {
        a() {
        }

        public final d32 a(yb0 yb0Var) {
            String str = yb0Var.f34991m;
            if (str != null) {
                switch (str) {
                    case "application/dvbsubs":
                        return new j40(yb0Var.f34993o);
                    case "application/pgs":
                        return new og1();
                    case "application/x-mp4-vtt":
                        return new p11();
                    case "text/vtt":
                        return new tj2();
                    case "application/x-quicktime-tx3g":
                        return new m72(yb0Var.f34993o);
                    case "text/x-ssa":
                        return new u12(yb0Var.f34993o);
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new in(str, yb0Var.f34977E);
                    case "text/x-exoplayer-cues":
                        return new z60();
                    case "application/cea-708":
                        return new jn(yb0Var.f34977E, yb0Var.f34993o);
                    case "application/x-subrip":
                        return new a32();
                    case "application/ttml+xml":
                        return new g72();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }

        public final boolean b(yb0 yb0Var) {
            String str = yb0Var.f34991m;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str);
        }
    }
}
