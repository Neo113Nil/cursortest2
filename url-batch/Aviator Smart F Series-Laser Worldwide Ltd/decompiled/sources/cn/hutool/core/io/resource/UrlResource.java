package cn.hutool.core.io.resource;

import cn.hutool.core.io.l;
import cn.hutool.core.util.e0;
import cn.hutool.core.util.g1;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public class UrlResource implements d, Serializable {
    private static final long serialVersionUID = 1;
    private long lastModified;
    protected String name;
    protected URL url;

    public UrlResource(URI uri) {
        this(g1.url(uri), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$new$0(URL url) {
        if (url != null) {
            return l.getName(url.getPath());
        }
        return null;
    }

    public File getFile() {
        return l.file(this.url);
    }

    @Override // cn.hutool.core.io.resource.d
    public String getName() {
        return this.name;
    }

    @Override // cn.hutool.core.io.resource.d
    public /* bridge */ /* synthetic */ BufferedReader getReader(Charset charset) {
        return c.a(this, charset);
    }

    @Override // cn.hutool.core.io.resource.d
    public InputStream getStream() {
        URL url = this.url;
        if (url != null) {
            return g1.getStream(url);
        }
        throw new NoResourceException("Resource URL is null!");
    }

    @Override // cn.hutool.core.io.resource.d
    public URL getUrl() {
        return this.url;
    }

    @Override // cn.hutool.core.io.resource.d
    public boolean isModified() {
        long j8 = this.lastModified;
        return (0 == j8 || j8 == getFile().lastModified()) ? false : true;
    }

    @Override // cn.hutool.core.io.resource.d
    public /* bridge */ /* synthetic */ byte[] readBytes() {
        return c.c(this);
    }

    @Override // cn.hutool.core.io.resource.d
    public /* bridge */ /* synthetic */ String readStr(Charset charset) {
        return c.d(this, charset);
    }

    @Override // cn.hutool.core.io.resource.d
    public /* bridge */ /* synthetic */ String readUtf8Str() {
        return c.e(this);
    }

    public long size() {
        return g1.size(this.url);
    }

    public String toString() {
        URL url = this.url;
        return url == null ? "null" : url.toString();
    }

    @Override // cn.hutool.core.io.resource.d
    public /* bridge */ /* synthetic */ void writeTo(OutputStream outputStream) {
        c.f(this, outputStream);
    }

    public UrlResource(URL url) {
        this(url, null);
    }

    public UrlResource(final URL url, String str) {
        this.lastModified = 0L;
        this.url = url;
        if (url != null && g1.URL_PROTOCOL_FILE.equals(url.getProtocol())) {
            this.lastModified = l.file(url).lastModified();
        }
        this.name = (String) e0.defaultIfNull(str, (Supplier<? extends String>) new Supplier() { // from class: cn.hutool.core.io.resource.g
            @Override // java.util.function.Supplier
            public final Object get() {
                String lambda$new$0;
                lambda$new$0 = UrlResource.lambda$new$0(url);
                return lambda$new$0;
            }
        });
    }

    @Deprecated
    public UrlResource(File file) {
        this.lastModified = 0L;
        this.url = g1.getURL(file);
    }
}
