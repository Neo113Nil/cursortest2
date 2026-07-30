package cn.hutool.core.io.resource;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public interface d {
    String getName();

    BufferedReader getReader(Charset charset);

    InputStream getStream();

    URL getUrl();

    boolean isModified();

    byte[] readBytes();

    String readStr(Charset charset);

    String readUtf8Str();

    void writeTo(OutputStream outputStream);
}
