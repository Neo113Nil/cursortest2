package defpackage;

import java.net.ProtocolException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class v92 {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static w92 PxuCJdSBwIXG(String str) {
        int i;
        int i2;
        String str2;
        boolean yQRudnv4La6p = pa2.yQRudnv4La6p(str, "HTTP/1.", false);
        fr1 fr1Var = fr1.OPXfSBeufaJ8;
        fr1 fr1Var2 = fr1.wdg6QnbFHrFF;
        if (yQRudnv4La6p) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                fr1Var = fr1Var2;
            }
            i2 = i + 3;
            if (str.length() < i2) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            Integer KUoIVIumpKat = pa2.KUoIVIumpKat(str.substring(i, i2));
            if (KUoIVIumpKat == null) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int intValue = KUoIVIumpKat.intValue();
            if (str.length() <= i2) {
                str2 = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                str2 = str.substring(i + 4);
            }
            return new w92(fr1Var, intValue, str2);
        }
        if (pa2.yQRudnv4La6p(str, "ICY ", false)) {
            i = 4;
            i2 = i + 3;
            if (str.length() < i2) {
            }
        } else {
            if (!pa2.yQRudnv4La6p(str, "SOURCETABLE ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 12;
            fr1Var = fr1Var2;
            i2 = i + 3;
            if (str.length() < i2) {
            }
        }
    }
}
