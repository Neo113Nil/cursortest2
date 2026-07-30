package cn.hutool.core.io.resource;

import cn.hutool.core.collection.EnumerationIter;
import cn.hutool.core.collection.k0;
import cn.hutool.core.io.IORuntimeException;
import cn.hutool.core.lang.a0;
import cn.hutool.core.text.l;
import cn.hutool.core.util.e0;
import cn.hutool.core.util.o;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes.dex */
public class f {
    public static BufferedReader getReader(String str, Charset charset) {
        return getResourceObj(str).getReader(charset);
    }

    public static URL getResource(String str) {
        return getResource(str, null);
    }

    public static EnumerationIter<URL> getResourceIter(String str) {
        return getResourceIter(str, null);
    }

    public static d getResourceObj(String str) {
        return (l.isNotBlank(str) && (str.startsWith("file:") || cn.hutool.core.io.l.isAbsolutePath(str))) ? new FileResource(str) : new ClassPathResource(str);
    }

    public static List<URL> getResources(String str) {
        return getResources(str, null);
    }

    public static InputStream getStream(String str) {
        return getResourceObj(str).getStream();
    }

    public static InputStream getStreamSafe(String str) {
        try {
            return getResourceObj(str).getStream();
        } catch (NoResourceException unused) {
            return null;
        }
    }

    public static BufferedReader getUtf8Reader(String str) {
        return getReader(str, cn.hutool.core.util.l.CHARSET_UTF_8);
    }

    public static byte[] readBytes(String str) {
        return getResourceObj(str).readBytes();
    }

    public static String readStr(String str, Charset charset) {
        return getResourceObj(str).readStr(charset);
    }

    public static String readUtf8Str(String str) {
        return getResourceObj(str).readUtf8Str();
    }

    public static URL getResource(String str, Class<?> cls) {
        String nullToEmpty = l.nullToEmpty(str);
        return cls != null ? cls.getResource(nullToEmpty) : o.getClassLoader().getResource(nullToEmpty);
    }

    public static EnumerationIter<URL> getResourceIter(String str, ClassLoader classLoader) {
        try {
            return new EnumerationIter<>(((ClassLoader) e0.defaultIfNull(classLoader, new e())).getResources(str));
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static List<URL> getResources(String str, a0 a0Var) {
        return k0.filterToList(getResourceIter(str), a0Var);
    }
}
