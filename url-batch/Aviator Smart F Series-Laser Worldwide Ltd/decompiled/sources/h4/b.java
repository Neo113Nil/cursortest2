package h4;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16678a = ":";

    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < bArr.length; i8++) {
            String hexString = Integer.toHexString(bArr[i8] & 255);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            sb.append(hexString.toUpperCase());
            if (bArr.length - 1 != i8) {
                sb.append(":");
            }
        }
        return sb.toString();
    }

    public static String b(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int length = bArr.length - 1; length >= 0; length--) {
            String hexString = Integer.toHexString(bArr[length] & 255);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            sb.append(hexString.toUpperCase());
            if (length != 0) {
                sb.append(":");
            }
        }
        return sb.toString();
    }
}
