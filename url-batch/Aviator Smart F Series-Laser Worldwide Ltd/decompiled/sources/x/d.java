package x;

/* loaded from: classes.dex */
public abstract class d {
    public static boolean a(byte[] bArr, int i8, byte b8) {
        try {
            bArr[i8] = b8;
            return true;
        } catch (Exception e8) {
            e8.printStackTrace();
            return false;
        }
    }

    public static byte a(byte[] bArr, int i8) {
        try {
            return bArr[i8];
        } catch (Exception e8) {
            e8.printStackTrace();
            return (byte) -1;
        }
    }

    public static boolean a(byte[] bArr, int i8, int i9) {
        try {
            bArr[i8] = (byte) (i9 >> 24);
            bArr[i8 + 1] = (byte) (i9 >> 16);
            bArr[i8 + 2] = (byte) (i9 >> 8);
            bArr[i8 + 3] = (byte) i9;
            return true;
        } catch (Exception e8) {
            e8.printStackTrace();
            return false;
        }
    }
}
