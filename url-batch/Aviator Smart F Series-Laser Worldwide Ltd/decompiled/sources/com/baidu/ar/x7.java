package com.baidu.ar;

import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;

/* loaded from: classes.dex */
public class x7 {
    public static String a(InputStream inputStream) {
        return a(inputStream, (String) null);
    }

    public static String a(InputStream inputStream, String str) {
        if (inputStream == null) {
            throw new IllegalArgumentException("stream may not be null.");
        }
        if (TextUtils.isEmpty(str)) {
            str = System.getProperty("file.encoding", "utf-8");
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, str);
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[4096];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read <= 0) {
                break;
            }
            stringWriter.write(cArr, 0, read);
        }
        String stringWriter2 = stringWriter.toString();
        inputStreamReader.close();
        stringWriter.close();
        return ("utf-8".equalsIgnoreCase(str) && stringWriter2.startsWith("\ufeff")) ? stringWriter2.substring(1) : stringWriter2;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e8) {
                e8.printStackTrace();
            }
        }
    }

    public static void a(InputStream inputStream, File file) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = j4.j(file);
            try {
                a(inputStream, fileOutputStream);
                a(fileOutputStream);
            } catch (Throwable th) {
                th = th;
                a(fileOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
    }

    public static void a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }
}
