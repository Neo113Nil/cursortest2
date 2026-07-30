package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class zg {
    public static ah PxuCJdSBwIXG(String str) {
        if (str.length() % 2 != 0) {
            u9.e9gEMXR7LXtO("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (hq0.x50lh2ztY7Y5(str.charAt(i2 + 1)) + (hq0.x50lh2ztY7Y5(str.charAt(i2)) << 4));
        }
        return new ah(bArr);
    }

    public static ah TSizfFm2Yiuu(zg zgVar, byte[] bArr) {
        int length = bArr.length;
        zgVar.getClass();
        cs0.cpQdD2nAriOS(bArr.length, 0L, length);
        return new ah(na.uVlwi32qvXeJ(bArr, 0, length));
    }

    public static ah lS5Rgt96tfkO(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(pj.PxuCJdSBwIXG);
        bytes.getClass();
        ah ahVar = new ah(bytes);
        ahVar.wdg6QnbFHrFF = str;
        return ahVar;
    }
}
