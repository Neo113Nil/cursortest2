package cn.hutool.core.io.resource;

import cn.hutool.core.io.l;
import cn.hutool.core.lang.q;
import cn.hutool.core.util.e0;
import cn.hutool.core.util.g1;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public class FileResource implements d, Serializable {
    private static final long serialVersionUID = 1;
    private final File file;
    private final long lastModified;
    private final String name;

    public FileResource(String str) {
        this(l.file(str));
    }

    public File getFile() {
        return this.file;
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
        return l.getInputStream(this.file);
    }

    @Override // cn.hutool.core.io.resource.d
    public URL getUrl() {
        return g1.getURL(this.file);
    }

    @Override // cn.hutool.core.io.resource.d
    public boolean isModified() {
        return this.lastModified != this.file.lastModified();
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

    public String toString() {
        return this.file.toString();
    }

    @Override // cn.hutool.core.io.resource.d
    public /* bridge */ /* synthetic */ void writeTo(OutputStream outputStream) {
        c.f(this, outputStream);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FileResource(Path path) {
        this(r1);
        File file;
        file = path.toFile();
    }

    public FileResource(File file) {
        this(file, null);
    }

    public FileResource(final File file, String str) {
        q.notNull(file, "File must be not null !", new Object[0]);
        this.file = file;
        this.lastModified = file.lastModified();
        this.name = (String) e0.defaultIfNull(str, (Supplier<? extends String>) new Supplier() { // from class: cn.hutool.core.io.resource.b
            @Override // java.util.function.Supplier
            public final Object get() {
                return file.getName();
            }
        });
    }
}
