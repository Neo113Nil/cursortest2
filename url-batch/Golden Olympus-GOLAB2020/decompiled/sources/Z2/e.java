package Z2;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static String f9752a;

    static class a implements PrivilegedAction {
        a() {
        }

        @Override // java.security.PrivilegedAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String run() {
            return System.getProperty("line.separator");
        }
    }

    static {
        try {
            try {
                f9752a = (String) AccessController.doPrivileged(new a());
            } catch (Exception unused) {
                f9752a = String.format("%n", new Object[0]);
            }
        } catch (Exception unused2) {
            f9752a = "\n";
        }
    }

    public static char[] a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i4 = 0; i4 != length; i4++) {
            cArr[i4] = (char) (bArr[i4] & 255);
        }
        return cArr;
    }

    public static String b(byte[] bArr) {
        return new String(a(bArr));
    }

    public static String c(String str) {
        char[] charArray = str.toCharArray();
        boolean z4 = false;
        for (int i4 = 0; i4 != charArray.length; i4++) {
            char c4 = charArray[i4];
            if ('A' <= c4 && 'Z' >= c4) {
                charArray[i4] = (char) (c4 + ' ');
                z4 = true;
            }
        }
        return z4 ? new String(charArray) : str;
    }

    public static String d(String str) {
        char[] charArray = str.toCharArray();
        boolean z4 = false;
        for (int i4 = 0; i4 != charArray.length; i4++) {
            char c4 = charArray[i4];
            if ('a' <= c4 && 'z' >= c4) {
                charArray[i4] = (char) (c4 - ' ');
                z4 = true;
            }
        }
        return z4 ? new String(charArray) : str;
    }
}
