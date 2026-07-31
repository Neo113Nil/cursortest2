package com.bytedance.sdk.openadsdk.fb.zmn.zmn;

/* loaded from: classes5.dex */
public final class btk {
    private static final byte[] zmn = {105, -42, 73, -118, 67, -35, 89, -76, 122, -9, 45, 88, 34, 76, 10, 55};
    private static byte[] fs = null;

    public static byte[] zmn() {
        if (fs == null) {
            byte[] bArr = new byte[zmn.length];
            int i = 0;
            while (true) {
                byte[] bArr2 = zmn;
                if (i >= bArr2.length) {
                    break;
                }
                bArr[i] = (byte) (bArr2[i] ^ 20);
                i++;
            }
            fs = bArr;
        }
        return fs;
    }
}
