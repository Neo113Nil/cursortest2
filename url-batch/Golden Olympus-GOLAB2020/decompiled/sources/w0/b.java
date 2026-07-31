package w0;

import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import u0.C3455b;

/* loaded from: classes.dex */
public abstract class b {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                Log.e("Utils", "Exception when closing the 'Closeable'.");
            }
        }
    }

    public static void b(Reader reader, Writer writer) {
        c(reader, writer, new char[Base64Utils.IO_BUFFER_SIZE]);
    }

    public static void c(Reader reader, Writer writer, char[] cArr) {
        while (true) {
            int read = reader.read(cArr);
            if (-1 == read) {
                return;
            } else {
                writer.write(cArr, 0, read);
            }
        }
    }

    public static Map d(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put(e((String) entry.getKey()), entry.getValue());
        }
        return hashMap;
    }

    public static String e(String str) {
        int i4 = 0;
        if (str.length() > 0) {
            while (str.charAt(i4) == '/') {
                i4++;
            }
        }
        return "/" + str.substring(i4);
    }

    public static C3455b f(String str, String str2) {
        if (str == null) {
            if (str2 != null) {
                if (str2.contains("connect-drcn")) {
                    return C3455b.f46376c;
                }
                if (str2.contains("connect-dre")) {
                    return C3455b.f46377d;
                }
                if (str2.contains("connect-drru")) {
                    return C3455b.f46378e;
                }
                if (str2.contains("connect-dra")) {
                    return C3455b.f46379f;
                }
            }
            return C3455b.f46375b;
        }
        switch (str) {
            case "CN":
                return C3455b.f46376c;
            case "DE":
                return C3455b.f46377d;
            case "RU":
                return C3455b.f46378e;
            case "SG":
                return C3455b.f46379f;
            default:
                return C3455b.f46375b;
        }
    }

    public static String g(InputStream inputStream, String str) {
        StringWriter stringWriter = new StringWriter();
        b(new InputStreamReader(inputStream, str), stringWriter);
        return stringWriter.toString();
    }
}
