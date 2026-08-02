package io.appmetrica.analytics.coreutils.internal.io;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final class InputStreamUtils {
    public static final InputStreamUtils INSTANCE = new InputStreamUtils();

    private InputStreamUtils() {
    }

    public final byte[] readSafelyApprox(int i4, InterfaceC1328a interfaceC1328a) {
        try {
            InputStream inputStream = (InputStream) interfaceC1328a.invoke();
            if (inputStream != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[8192];
                        int i5 = 0;
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (-1 == read || i5 > i4) {
                                break;
                            }
                            if (read > 0) {
                                byteArrayOutputStream.write(bArr, 0, read);
                                i5 += read;
                            }
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        inputStream.close();
                        return byteArray;
                    } catch (Throwable unused) {
                        byteArrayOutputStream.close();
                        inputStream.close();
                    }
                } finally {
                }
            }
        } catch (Throwable unused2) {
        }
        return new byte[0];
    }
}
