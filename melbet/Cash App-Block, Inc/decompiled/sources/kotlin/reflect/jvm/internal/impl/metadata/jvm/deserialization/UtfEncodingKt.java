package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

/* loaded from: classes9.dex */
public final class UtfEncodingKt {
    public static final byte[] stringsToBytes(String[] strArr) {
        strArr.getClass();
        int i = 0;
        for (String str : strArr) {
            i += str.length();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (String str2 : strArr) {
            int length = str2.length();
            int i3 = 0;
            while (i3 < length) {
                bArr[i2] = (byte) str2.charAt(i3);
                i3++;
                i2++;
            }
        }
        return bArr;
    }
}
