package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class er1 {
    public static fr1 PxuCJdSBwIXG(String str) {
        if (str.equals("http/1.0")) {
            return fr1.OPXfSBeufaJ8;
        }
        if (str.equals("http/1.1")) {
            return fr1.wdg6QnbFHrFF;
        }
        if (str.equals("h2_prior_knowledge")) {
            return fr1.cpQdD2nAriOS;
        }
        if (str.equals("h2")) {
            return fr1.x50lh2ztY7Y5;
        }
        if (str.equals("spdy/3.1")) {
            return fr1.dgRBjINgWbAK;
        }
        if (str.equals("quic")) {
            return fr1.r3s1LDPKFs1S;
        }
        if (pa2.yQRudnv4La6p(str, "h3", false)) {
            return fr1.QrzZRwfaDlRX;
        }
        u9.S9EYkSpbGuxq("Unexpected protocol: ".concat(str));
        return null;
    }
}
