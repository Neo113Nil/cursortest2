package com.baidu.platform.comapi.resource;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public class a {
    public static void a(InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        if (inputStream == null || outputStream == null || bArr == null) {
            throw new IOException("copyStream : outputStream or inputStream is null");
        }
        try {
            if (!(inputStream instanceof BufferedInputStream)) {
                inputStream = new BufferedInputStream(inputStream);
            }
            if (!(outputStream instanceof BufferedOutputStream)) {
                outputStream = new BufferedOutputStream(outputStream);
            }
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    outputStream.flush();
                    a(inputStream);
                    a(outputStream);
                    return;
                }
                outputStream.write(bArr, 0, read);
            }
        } catch (Throwable th) {
            a(inputStream);
            a(outputStream);
            throw th;
        }
    }

    public static void a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Exception unused) {
        }
    }
}
