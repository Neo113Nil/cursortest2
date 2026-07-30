package cn.hutool.core.util;

import cn.hutool.core.exceptions.UtilException;
import cn.hutool.core.io.IORuntimeException;
import cn.hutool.core.net.URLDecoder;
import com.just.agentweb.DefaultWebClient;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.JarURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.jar.JarFile;

/* loaded from: classes.dex */
public class g1 extends cn.hutool.core.net.l {
    public static final String CLASSPATH_URL_PREFIX = "classpath:";
    public static final String FILE_URL_PREFIX = "file:";
    public static final String JAR_URL_PREFIX = "jar:";
    public static final String JAR_URL_SEPARATOR = "!/";
    public static final String URL_PROTOCOL_FILE = "file";
    public static final String URL_PROTOCOL_JAR = "jar";
    public static final String URL_PROTOCOL_VFS = "vfs";
    public static final String URL_PROTOCOL_VFSFILE = "vfsfile";
    public static final String URL_PROTOCOL_VFSZIP = "vfszip";
    public static final String URL_PROTOCOL_WSJAR = "wsjar";
    public static final String URL_PROTOCOL_ZIP = "zip";
    public static final String WAR_URL_PREFIX = "war:";
    public static final String WAR_URL_SEPARATOR = "*/";

    public static String buildQuery(Map<String, ?> map, Charset charset) {
        return s.b.of(map).build(charset);
    }

    public static String completeUrl(String str, String str2) {
        String normalize = normalize(str, false);
        if (cn.hutool.core.text.l.isBlank(normalize)) {
            return null;
        }
        try {
            return new URL(new URL(normalize), str2).toString();
        } catch (MalformedURLException e8) {
            throw new UtilException(e8);
        }
    }

    public static String decode(String str) {
        return decode(str, l.UTF_8);
    }

    public static String encodeBlank(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = charSequence.charAt(i8);
            if (k.isBlankChar(charAt)) {
                sb.append("%20");
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public static long getContentLength(URL url) {
        long contentLengthLong;
        if (url == null) {
            return -1L;
        }
        URLConnection uRLConnection = null;
        try {
            try {
                uRLConnection = url.openConnection();
                contentLengthLong = uRLConnection.getContentLengthLong();
                return contentLengthLong;
            } catch (IOException e8) {
                throw new IORuntimeException(e8);
            }
        } finally {
            if (uRLConnection instanceof HttpURLConnection) {
                ((HttpURLConnection) uRLConnection).disconnect();
            }
        }
    }

    public static String getDataUri(String str, String str2, String str3) {
        return getDataUri(str, null, str2, str3);
    }

    public static String getDataUriBase64(String str, String str2) {
        return getDataUri(str, null, "base64", str2);
    }

    public static String getDecodedPath(URL url) {
        String str = null;
        if (url == null) {
            return null;
        }
        try {
            str = toURI(url).getPath();
        } catch (UtilException unused) {
        }
        return str != null ? str : url.getPath();
    }

    public static URI getHost(URL url) {
        if (url == null) {
            return null;
        }
        try {
            return new URI(url.getProtocol(), url.getHost(), null, null);
        } catch (URISyntaxException e8) {
            throw new UtilException(e8);
        }
    }

    public static JarFile getJarFile(URL url) {
        try {
            return ((JarURLConnection) url.openConnection()).getJarFile();
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static String getPath(String str) {
        return toURI(str).getPath();
    }

    public static BufferedReader getReader(URL url, Charset charset) {
        return cn.hutool.core.io.n.getReader(getStream(url), charset);
    }

    public static InputStream getStream(URL url) {
        cn.hutool.core.lang.q.notNull(url, "URL must be not null", new Object[0]);
        try {
            return url.openStream();
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static URI getStringURI(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return URI.create(cn.hutool.core.text.l.addPrefixIfNot(charSequence, "string:///"));
    }

    public static URL getURL(String str) {
        return cn.hutool.core.io.resource.f.getResource(str);
    }

    public static URL[] getURLs(File... fileArr) {
        URL[] urlArr = new URL[fileArr.length];
        for (int i8 = 0; i8 < fileArr.length; i8++) {
            try {
                urlArr[i8] = fileArr[i8].toURI().toURL();
            } catch (MalformedURLException e8) {
                throw new UtilException(e8, "Error occured when get URL!", new Object[0]);
            }
        }
        return urlArr;
    }

    public static boolean isFileURL(URL url) {
        cn.hutool.core.lang.q.notNull(url, "URL must be not null", new Object[0]);
        String protocol = url.getProtocol();
        return URL_PROTOCOL_FILE.equals(protocol) || URL_PROTOCOL_VFSFILE.equals(protocol) || URL_PROTOCOL_VFS.equals(protocol);
    }

    public static boolean isJarFileURL(URL url) {
        cn.hutool.core.lang.q.notNull(url, "URL must be not null", new Object[0]);
        return URL_PROTOCOL_FILE.equals(url.getProtocol()) && url.getPath().toLowerCase().endsWith(".jar");
    }

    public static boolean isJarURL(URL url) {
        cn.hutool.core.lang.q.notNull(url, "URL must be not null", new Object[0]);
        String protocol = url.getProtocol();
        return URL_PROTOCOL_JAR.equals(protocol) || URL_PROTOCOL_ZIP.equals(protocol) || URL_PROTOCOL_VFSZIP.equals(protocol) || URL_PROTOCOL_WSJAR.equals(protocol);
    }

    public static String normalize(String str) {
        return normalize(str, false);
    }

    public static long size(URL url) {
        long contentLengthLong;
        if (isFileURL(url)) {
            File file = cn.hutool.core.io.l.file(url);
            long length = file.length();
            if (length != 0 || file.exists()) {
                return length;
            }
            throw new IORuntimeException("File not exist or size is zero!");
        }
        try {
            URLConnection openConnection = url.openConnection();
            useCachesIfNecessary(openConnection);
            if (openConnection instanceof HttpURLConnection) {
                ((HttpURLConnection) openConnection).setRequestMethod("HEAD");
            }
            contentLengthLong = openConnection.getContentLengthLong();
            return contentLengthLong;
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static URI toURI(URL url) {
        return toURI(url, false);
    }

    public static URL toUrlForHttp(String str) {
        return toUrlForHttp(str, null);
    }

    public static URL url(URI uri) {
        if (uri == null) {
            return null;
        }
        try {
            return uri.toURL();
        } catch (MalformedURLException e8) {
            throw new UtilException(e8);
        }
    }

    public static void useCachesIfNecessary(URLConnection uRLConnection) {
        uRLConnection.setUseCaches(uRLConnection.getClass().getSimpleName().startsWith("JNLP"));
    }

    public static String decode(String str, Charset charset) {
        return URLDecoder.decode(str, charset);
    }

    public static String getDataUri(String str, Charset charset, String str2, String str3) {
        StringBuilder builder = cn.hutool.core.text.l.builder("data:");
        if (cn.hutool.core.text.l.isNotBlank(str)) {
            builder.append(str);
        }
        if (charset != null) {
            builder.append(";charset=");
            builder.append(charset.name());
        }
        if (cn.hutool.core.text.l.isNotBlank(str2)) {
            builder.append(';');
            builder.append(str2);
        }
        builder.append(',');
        builder.append(str3);
        return builder.toString();
    }

    public static URL getURL(String str, Class<?> cls) {
        return cn.hutool.core.io.resource.f.getResource(str, cls);
    }

    public static String normalize(String str, boolean z7) {
        return normalize(str, z7, false);
    }

    public static URI toURI(URL url, boolean z7) {
        if (url == null) {
            return null;
        }
        return toURI(url.toString(), z7);
    }

    public static URL toUrlForHttp(String str, URLStreamHandler uRLStreamHandler) {
        cn.hutool.core.lang.q.notBlank(str, "Url is blank !", new Object[0]);
        try {
            return new URL((URL) null, encodeBlank(str), uRLStreamHandler);
        } catch (MalformedURLException e8) {
            throw new UtilException(e8);
        }
    }

    public static String decode(String str, Charset charset, boolean z7) {
        return URLDecoder.decode(str, charset, z7);
    }

    public static URL getURL(File file) {
        cn.hutool.core.lang.q.notNull(file, "File is null !", new Object[0]);
        try {
            return file.toURI().toURL();
        } catch (MalformedURLException e8) {
            throw new UtilException(e8, "Error occured when get URL!", new Object[0]);
        }
    }

    public static String normalize(String str, boolean z7, boolean z8) {
        String str2;
        String str3;
        if (cn.hutool.core.text.l.isBlank(str)) {
            return str;
        }
        int indexOf = str.indexOf("://");
        if (indexOf > 0) {
            int i8 = indexOf + 3;
            str2 = cn.hutool.core.text.l.subPre(str, i8);
            str = cn.hutool.core.text.l.subSuf(str, i8);
        } else {
            str2 = DefaultWebClient.HTTP_SCHEME;
        }
        int indexOf2 = cn.hutool.core.text.l.indexOf(str, '?');
        String str4 = null;
        if (indexOf2 > 0) {
            str3 = cn.hutool.core.text.l.subSuf(str, indexOf2);
            str = cn.hutool.core.text.l.subPre(str, indexOf2);
        } else {
            str3 = null;
        }
        if (cn.hutool.core.text.l.isNotEmpty(str)) {
            str = str.replaceAll("^[\\\\/]+", "").replace("\\", "/");
            if (z8) {
                str = str.replaceAll("//+", "/");
            }
        }
        int indexOf3 = cn.hutool.core.text.l.indexOf(str, cn.hutool.core.io.file.c.UNIX_SEPARATOR);
        if (indexOf3 > 0) {
            String subPre = cn.hutool.core.text.l.subPre(str, indexOf3);
            str4 = cn.hutool.core.text.l.subSuf(str, indexOf3);
            str = subPre;
        }
        if (z7) {
            str4 = cn.hutool.core.net.l.encode(str4);
        }
        return str2 + str + cn.hutool.core.text.l.nullToEmpty(str4) + cn.hutool.core.text.l.nullToEmpty(str3);
    }

    public static URI toURI(String str) {
        return toURI(str, false);
    }

    public static URL url(String str) {
        return url(str, null);
    }

    public static String decode(String str, String str2) {
        return decode(str, cn.hutool.core.text.l.isEmpty(str2) ? null : l.charset(str2));
    }

    public static URI toURI(String str, boolean z7) {
        if (z7) {
            str = cn.hutool.core.net.l.encode(str);
        }
        try {
            return new URI(cn.hutool.core.text.l.trim(str));
        } catch (URISyntaxException e8) {
            throw new UtilException(e8);
        }
    }

    public static URL url(String str, URLStreamHandler uRLStreamHandler) {
        if (str == null) {
            return null;
        }
        if (str.startsWith(CLASSPATH_URL_PREFIX)) {
            return o.getClassLoader().getResource(str.substring(10));
        }
        try {
            return new URL((URL) null, str, uRLStreamHandler);
        } catch (MalformedURLException e8) {
            try {
                return new File(str).toURI().toURL();
            } catch (MalformedURLException unused) {
                throw new UtilException(e8);
            }
        }
    }
}
