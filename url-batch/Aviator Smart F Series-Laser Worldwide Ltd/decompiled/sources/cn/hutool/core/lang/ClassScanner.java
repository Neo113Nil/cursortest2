package cn.hutool.core.lang;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.collection.EnumerationIter;
import cn.hutool.core.io.IORuntimeException;
import cn.hutool.core.util.g1;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/* loaded from: classes.dex */
public class ClassScanner implements Serializable {
    private static final long serialVersionUID = 1;
    private final Charset charset;
    private final a0 classFilter;
    private ClassLoader classLoader;
    private final Set<Class<?>> classes;
    private final Set<String> classesOfLoadError;
    private boolean ignoreLoadError;
    private boolean initialize;
    private final String packageDirName;
    private final String packageName;
    private final String packageNameWithDot;
    private final String packagePath;

    public ClassScanner() {
        this(null);
    }

    private void addIfAccept(String str) {
        if (cn.hutool.core.text.l.isBlank(str)) {
            return;
        }
        int length = str.length();
        int length2 = this.packageName.length();
        if (length == length2) {
            if (str.equals(this.packageName)) {
                addIfAccept(loadClass(str));
            }
        } else if (length > length2) {
            if (".".equals(this.packageNameWithDot) || str.startsWith(this.packageNameWithDot)) {
                addIfAccept(loadClass(str));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$scanAllPackageByAnnotation$0(Class cls, Class cls2) {
        return cls2.isAnnotationPresent(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$scanAllPackageBySuper$2(Class cls, Class cls2) {
        return cls.isAssignableFrom(cls2) && !cls.equals(cls2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$scanPackageByAnnotation$1(Class cls, Class cls2) {
        return cls2.isAnnotationPresent(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$scanPackageBySuper$3(Class cls, Class cls2) {
        return cls.isAssignableFrom(cls2) && !cls.equals(cls2);
    }

    public static Set<Class<?>> scanAllPackage() {
        return scanAllPackage("", null);
    }

    public static Set<Class<?>> scanAllPackageByAnnotation(String str, final Class<? extends Annotation> cls) {
        return scanAllPackage(str, new a0() { // from class: cn.hutool.core.lang.u
            @Override // cn.hutool.core.lang.a0
            public final boolean accept(Object obj) {
                boolean lambda$scanAllPackageByAnnotation$0;
                lambda$scanAllPackageByAnnotation$0 = ClassScanner.lambda$scanAllPackageByAnnotation$0(cls, (Class) obj);
                return lambda$scanAllPackageByAnnotation$0;
            }
        });
    }

    public static Set<Class<?>> scanAllPackageBySuper(String str, final Class<?> cls) {
        return scanAllPackage(str, new a0() { // from class: cn.hutool.core.lang.v
            @Override // cn.hutool.core.lang.a0
            public final boolean accept(Object obj) {
                boolean lambda$scanAllPackageBySuper$2;
                lambda$scanAllPackageBySuper$2 = ClassScanner.lambda$scanAllPackageBySuper$2(cls, (Class) obj);
                return lambda$scanAllPackageBySuper$2;
            }
        });
    }

    private void scanFile(File file, String str) {
        File[] listFiles;
        if (!file.isFile()) {
            if (!file.isDirectory() || (listFiles = file.listFiles()) == null) {
                return;
            }
            for (File file2 : listFiles) {
                scanFile(file2, str == null ? subPathBeforePackage(file) : str);
            }
            return;
        }
        String absolutePath = file.getAbsolutePath();
        if (absolutePath.endsWith(".class")) {
            addIfAccept(absolutePath.substring(str.length(), absolutePath.length() - 6).replace(File.separatorChar, '.'));
        } else if (absolutePath.endsWith(".jar")) {
            try {
                scanJar(new JarFile(file));
            } catch (IOException e8) {
                throw new IORuntimeException(e8);
            }
        }
    }

    private void scanJar(JarFile jarFile) {
        Iterator it = new EnumerationIter(jarFile.entries()).iterator();
        while (it.hasNext()) {
            JarEntry jarEntry = (JarEntry) it.next();
            String removePrefix = cn.hutool.core.text.l.removePrefix(jarEntry.getName(), "/");
            if (cn.hutool.core.text.l.isEmpty(this.packagePath) || removePrefix.startsWith(this.packagePath)) {
                if (removePrefix.endsWith(".class") && !jarEntry.isDirectory()) {
                    addIfAccept(loadClass(removePrefix.substring(0, removePrefix.length() - 6).replace(cn.hutool.core.io.file.c.UNIX_SEPARATOR, '.')));
                }
            }
        }
    }

    private void scanJavaClassPaths() {
        for (String str : cn.hutool.core.util.p.getJavaClassPaths()) {
            scanFile(new File(g1.decode(str, cn.hutool.core.util.l.systemCharsetName())), null);
        }
    }

    public static Set<Class<?>> scanPackage() {
        return scanPackage("", null);
    }

    public static Set<Class<?>> scanPackageByAnnotation(String str, final Class<? extends Annotation> cls) {
        return scanPackage(str, new a0() { // from class: cn.hutool.core.lang.t
            @Override // cn.hutool.core.lang.a0
            public final boolean accept(Object obj) {
                boolean lambda$scanPackageByAnnotation$1;
                lambda$scanPackageByAnnotation$1 = ClassScanner.lambda$scanPackageByAnnotation$1(cls, (Class) obj);
                return lambda$scanPackageByAnnotation$1;
            }
        });
    }

    public static Set<Class<?>> scanPackageBySuper(String str, final Class<?> cls) {
        return scanPackage(str, new a0() { // from class: cn.hutool.core.lang.s
            @Override // cn.hutool.core.lang.a0
            public final boolean accept(Object obj) {
                boolean lambda$scanPackageBySuper$3;
                lambda$scanPackageBySuper$3 = ClassScanner.lambda$scanPackageBySuper$3(cls, (Class) obj);
                return lambda$scanPackageBySuper$3;
            }
        });
    }

    private String subPathBeforePackage(File file) {
        String absolutePath = file.getAbsolutePath();
        if (cn.hutool.core.text.l.isNotEmpty(this.packageDirName)) {
            absolutePath = cn.hutool.core.text.l.subBefore((CharSequence) absolutePath, (CharSequence) this.packageDirName, true);
        }
        return cn.hutool.core.text.l.addSuffixIfNot(absolutePath, File.separator);
    }

    protected Object clone() {
        return super.clone();
    }

    public Set<String> getClassesOfLoadError() {
        return Collections.unmodifiableSet(this.classesOfLoadError);
    }

    protected Class<?> loadClass(String str) {
        ClassLoader classLoader = this.classLoader;
        if (classLoader == null) {
            classLoader = cn.hutool.core.util.o.getClassLoader();
            this.classLoader = classLoader;
        }
        try {
            return Class.forName(str, this.initialize, classLoader);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            this.classesOfLoadError.add(str);
            return null;
        } catch (UnsupportedClassVersionError unused2) {
            this.classesOfLoadError.add(str);
            return null;
        } catch (Throwable th) {
            if (!this.ignoreLoadError) {
                throw i.b.wrapRuntime(th);
            }
            this.classesOfLoadError.add(str);
            return null;
        }
    }

    public Set<Class<?>> scan() {
        return scan(false);
    }

    public void setClassLoader(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    public ClassScanner setIgnoreLoadError(boolean z7) {
        this.ignoreLoadError = z7;
        return this;
    }

    public void setInitialize(boolean z7) {
        this.initialize = z7;
    }

    public ClassScanner(String str) {
        this(str, null);
    }

    public static Set<Class<?>> scanAllPackage(String str, a0 a0Var) {
        return new ClassScanner(str, a0Var).scan(true);
    }

    public static Set<Class<?>> scanPackage(String str) {
        return scanPackage(str, null);
    }

    public Set<Class<?>> scan(boolean z7) {
        this.classes.clear();
        this.classesOfLoadError.clear();
        Iterator it = cn.hutool.core.io.resource.f.getResourceIter(this.packagePath, this.classLoader).iterator();
        while (it.hasNext()) {
            URL url = (URL) it.next();
            String protocol = url.getProtocol();
            protocol.hashCode();
            if (protocol.equals(g1.URL_PROTOCOL_JAR)) {
                scanJar(g1.getJarFile(url));
            } else if (protocol.equals(g1.URL_PROTOCOL_FILE)) {
                scanFile(new File(g1.decode(url.getFile(), this.charset.name())), null);
            }
        }
        if (z7 || CollUtil.isEmpty((Collection<?>) this.classes)) {
            scanJavaClassPaths();
        }
        return Collections.unmodifiableSet(this.classes);
    }

    public ClassScanner(String str, a0 a0Var) {
        this(str, a0Var, cn.hutool.core.util.l.CHARSET_UTF_8);
    }

    public static Set<Class<?>> scanPackage(String str, a0 a0Var) {
        return new ClassScanner(str, a0Var).scan();
    }

    public ClassScanner(String str, a0 a0Var, Charset charset) {
        this.classes = new HashSet();
        this.ignoreLoadError = false;
        this.classesOfLoadError = new HashSet();
        String nullToEmpty = cn.hutool.core.text.l.nullToEmpty(str);
        this.packageName = nullToEmpty;
        this.packageNameWithDot = cn.hutool.core.text.l.addSuffixIfNot(nullToEmpty, ".");
        this.packageDirName = nullToEmpty.replace('.', File.separatorChar);
        this.packagePath = nullToEmpty.replace('.', cn.hutool.core.io.file.c.UNIX_SEPARATOR);
        this.classFilter = a0Var;
        this.charset = charset;
    }

    private void addIfAccept(Class<?> cls) {
        if (cls != null) {
            a0 a0Var = this.classFilter;
            if (a0Var == null || a0Var.accept(cls)) {
                this.classes.add(cls);
            }
        }
    }
}
