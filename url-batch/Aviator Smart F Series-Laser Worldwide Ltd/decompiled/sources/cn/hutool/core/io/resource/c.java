package cn.hutool.core.io.resource;

import cn.hutool.core.io.IORuntimeException;
import cn.hutool.core.io.n;
import cn.hutool.core.util.l;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static BufferedReader a(d dVar, Charset charset) {
        return n.getReader(dVar.getStream(), charset);
    }

    public static boolean b(d dVar) {
        return false;
    }

    public static byte[] c(d dVar) {
        return n.readBytes(dVar.getStream());
    }

    public static String d(d dVar, Charset charset) {
        return n.read(dVar.getReader(charset));
    }

    public static String e(d dVar) {
        return dVar.readStr(l.CHARSET_UTF_8);
    }

    public static void f(d dVar, OutputStream outputStream) {
        try {
            InputStream stream = dVar.getStream();
            try {
                n.copy(stream, outputStream);
                if (stream != null) {
                    stream.close();
                }
            } finally {
            }
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }
}
