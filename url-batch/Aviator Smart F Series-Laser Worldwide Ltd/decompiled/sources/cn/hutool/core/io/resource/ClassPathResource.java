package cn.hutool.core.io.resource;

import cn.hutool.core.lang.q;
import cn.hutool.core.text.l;
import cn.hutool.core.util.e0;
import cn.hutool.core.util.g1;
import cn.hutool.core.util.p;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public class ClassPathResource extends UrlResource {
    private static final long serialVersionUID = 1;
    private final ClassLoader classLoader;
    private final Class<?> clazz;
    private final String path;

    public ClassPathResource(String str) {
        this(str, null, null);
    }

    private void initUrl() {
        Class<?> cls = this.clazz;
        if (cls != null) {
            this.url = cls.getResource(this.path);
        } else {
            ClassLoader classLoader = this.classLoader;
            if (classLoader != null) {
                this.url = classLoader.getResource(this.path);
            } else {
                this.url = ClassLoader.getSystemResource(this.path);
            }
        }
        if (this.url == null) {
            throw new NoResourceException("Resource of path [{}] not exist!", this.path);
        }
    }

    private String normalizePath(String str) {
        String removePrefix = l.removePrefix(cn.hutool.core.io.l.normalize(str), "/");
        q.isFalse(cn.hutool.core.io.l.isAbsolutePath(removePrefix), "Path [{}] must be a relative path !", removePrefix);
        return removePrefix;
    }

    public final String getAbsolutePath() {
        return cn.hutool.core.io.l.isAbsolutePath(this.path) ? this.path : cn.hutool.core.io.l.normalize(g1.getDecodedPath(this.url));
    }

    public final ClassLoader getClassLoader() {
        return this.classLoader;
    }

    public final String getPath() {
        return this.path;
    }

    @Override // cn.hutool.core.io.resource.UrlResource, cn.hutool.core.io.resource.d
    public /* bridge */ /* synthetic */ BufferedReader getReader(Charset charset) {
        return c.a(this, charset);
    }

    @Override // cn.hutool.core.io.resource.UrlResource, cn.hutool.core.io.resource.d
    public /* bridge */ /* synthetic */ byte[] readBytes() {
        return c.c(this);
    }

    @Override // cn.hutool.core.io.resource.UrlResource, cn.hutool.core.io.resource.d
    public /* bridge */ /* synthetic */ String readStr(Charset charset) {
        return c.d(this, charset);
    }

    @Override // cn.hutool.core.io.resource.UrlResource, cn.hutool.core.io.resource.d
    public /* bridge */ /* synthetic */ String readUtf8Str() {
        return c.e(this);
    }

    @Override // cn.hutool.core.io.resource.UrlResource
    public String toString() {
        if (this.path == null) {
            return super.toString();
        }
        return g1.CLASSPATH_URL_PREFIX + this.path;
    }

    @Override // cn.hutool.core.io.resource.UrlResource, cn.hutool.core.io.resource.d
    public /* bridge */ /* synthetic */ void writeTo(OutputStream outputStream) {
        c.f(this, outputStream);
    }

    public ClassPathResource(String str, ClassLoader classLoader) {
        this(str, classLoader, null);
    }

    public ClassPathResource(String str, Class<?> cls) {
        this(str, null, cls);
    }

    public ClassPathResource(String str, ClassLoader classLoader, Class<?> cls) {
        super((URL) null);
        q.notNull(str, "Path must not be null", new Object[0]);
        String normalizePath = normalizePath(str);
        this.path = normalizePath;
        this.name = l.isBlank(normalizePath) ? null : cn.hutool.core.io.l.getName(normalizePath);
        this.classLoader = (ClassLoader) e0.defaultIfNull(classLoader, (Supplier<? extends ClassLoader>) new Supplier() { // from class: cn.hutool.core.io.resource.a
            @Override // java.util.function.Supplier
            public final Object get() {
                return p.getClassLoader();
            }
        });
        this.clazz = cls;
        initUrl();
    }
}
