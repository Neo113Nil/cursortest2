package cn.hutool.core.lang;

import cn.hutool.core.exceptions.UtilException;
import cn.hutool.core.util.g1;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class c0 extends URLClassLoader {
    public c0() {
        this(new URL[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isJarFile(File file) {
        if (cn.hutool.core.io.l.isFile(file)) {
            return file.getPath().toLowerCase().endsWith(".jar");
        }
        return false;
    }

    public static c0 load(File file) {
        c0 c0Var = new c0();
        c0Var.addJar(file);
        c0Var.addURL(file);
        return c0Var;
    }

    public static c0 loadJar(File file) {
        c0 c0Var = new c0();
        c0Var.addJar(file);
        return c0Var;
    }

    public static URLClassLoader loadJarToSystemClassLoader(File file) {
        URLClassLoader uRLClassLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
        loadJar(uRLClassLoader, file);
        return uRLClassLoader;
    }

    private static List<File> loopJar(File file) {
        return cn.hutool.core.io.l.loopFiles(file, new FileFilter() { // from class: cn.hutool.core.lang.b0
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                boolean isJarFile;
                isJarFile = c0.isJarFile(file2);
                return isJarFile;
            }
        });
    }

    public c0 addJar(File file) {
        if (isJarFile(file)) {
            return addURL(file);
        }
        Iterator<File> it = loopJar(file).iterator();
        while (it.hasNext()) {
            addURL(it.next());
        }
        return this;
    }

    @Override // java.net.URLClassLoader
    public void addURL(URL url) {
        super.addURL(url);
    }

    public c0(URL[] urlArr) {
        super(urlArr, cn.hutool.core.util.p.getClassLoader());
    }

    public c0 addURL(File file) {
        super.addURL(g1.getURL(file));
        return this;
    }

    public c0(URL[] urlArr, ClassLoader classLoader) {
        super(urlArr, classLoader);
    }

    public static void loadJar(URLClassLoader uRLClassLoader, File file) {
        try {
            Method declaredMethod = cn.hutool.core.util.p.getDeclaredMethod(URLClassLoader.class, "addURL", URL.class);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                Iterator<File> it = loopJar(file).iterator();
                while (it.hasNext()) {
                    cn.hutool.core.util.y0.invoke(uRLClassLoader, declaredMethod, it.next().toURI().toURL());
                }
            }
        } catch (IOException e8) {
            throw new UtilException(e8);
        }
    }
}
