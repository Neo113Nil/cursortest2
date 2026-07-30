package com.realsil.sdk.dfu.t;

import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.core.utility.ByteArrayConverter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import y5.u;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public int f16310a;

    /* renamed from: b, reason: collision with root package name */
    public String f16311b;

    public b(int i8, String str) {
        this.f16310a = i8;
        this.f16311b = str;
    }

    public static b a(byte[] bArr) {
        String str;
        if (bArr == null || bArr.length < 2) {
            return null;
        }
        int i8 = ByteArrayConverter.toShort(bArr, 0, 0) & u.MAX_VALUE;
        int length = bArr.length;
        if (length - 2 > 0) {
            byte[] b8 = b(Arrays.copyOfRange(bArr, 2, length));
            try {
                str = new String(b8, 0, b8.length, "ascii");
            } catch (UnsupportedEncodingException e8) {
                ZLogger.w(e8.toString());
            }
            return new b(i8, str);
        }
        str = "";
        return new b(i8, str);
    }

    public static byte[] b(byte[] bArr) {
        int i8 = 0;
        for (byte b8 : bArr) {
            if (b8 == 0 || b8 == -1) {
                break;
            }
            i8++;
        }
        byte[] bArr2 = new byte[i8];
        System.arraycopy(bArr, 0, bArr2, 0, i8);
        return bArr2;
    }
}
