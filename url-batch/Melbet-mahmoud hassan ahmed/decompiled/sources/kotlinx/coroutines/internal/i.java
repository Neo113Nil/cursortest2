package kotlinx.coroutines.internal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f18351a = new i();

    private i() {
    }

    private final <S> S a(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    private final <S> List<S> b(Class<S> cls, ClassLoader classLoader) {
        List<S> q7;
        try {
            return d(cls, classLoader);
        } catch (Throwable unused) {
            q7 = w5.q.q(ServiceLoader.load(cls, classLoader));
            return q7;
        }
    }

    private final List<String> e(URL url) {
        boolean o7;
        BufferedReader bufferedReader;
        String T;
        String Y;
        String T2;
        String url2 = url.toString();
        o7 = l6.m.o(url2, "jar", false, 2, null);
        if (!o7) {
            bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List<String> f7 = f18351a.f(bufferedReader);
                d6.a.a(bufferedReader, null);
                return f7;
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        }
        T = l6.n.T(url2, "jar:file:", null, 2, null);
        Y = l6.n.Y(T, '!', null, 2, null);
        T2 = l6.n.T(url2, "!/", null, 2, null);
        JarFile jarFile = new JarFile(Y, false);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(T2)), "UTF-8"));
            try {
                List<String> f8 = f18351a.f(bufferedReader);
                d6.a.a(bufferedReader, null);
                jarFile.close();
                return f8;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    jarFile.close();
                    throw th3;
                } catch (Throwable th4) {
                    v5.b.a(th2, th4);
                    throw th2;
                }
            }
        }
    }

    private final List<String> f(BufferedReader bufferedReader) {
        List<String> q7;
        String Z;
        CharSequence a02;
        boolean z6;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                q7 = w5.q.q(linkedHashSet);
                return q7;
            }
            Z = l6.n.Z(readLine, "#", null, 2, null);
            Objects.requireNonNull(Z, "null cannot be cast to non-null type kotlin.CharSequence");
            a02 = l6.n.a0(Z);
            String obj = a02.toString();
            int i7 = 0;
            while (true) {
                if (i7 >= obj.length()) {
                    z6 = true;
                    break;
                }
                char charAt = obj.charAt(i7);
                if (!(charAt == '.' || Character.isJavaIdentifierPart(charAt))) {
                    z6 = false;
                    break;
                }
                i7++;
            }
            if (!z6) {
                throw new IllegalArgumentException(kotlin.jvm.internal.i.i("Illegal service provider class name: ", obj).toString());
            }
            if (obj.length() > 0) {
                linkedHashSet.add(obj);
            }
        }
    }

    public final List<MainDispatcherFactory> c() {
        MainDispatcherFactory mainDispatcherFactory;
        if (!j.a()) {
            return b(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            MainDispatcherFactory mainDispatcherFactory2 = null;
            try {
                mainDispatcherFactory = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                mainDispatcherFactory = null;
            }
            if (mainDispatcherFactory != null) {
                arrayList.add(mainDispatcherFactory);
            }
            try {
                mainDispatcherFactory2 = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (mainDispatcherFactory2 == null) {
                return arrayList;
            }
            arrayList.add(mainDispatcherFactory2);
            return arrayList;
        } catch (Throwable unused3) {
            return b(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
    }

    public final <S> List<S> d(Class<S> cls, ClassLoader classLoader) {
        Set t6;
        int g7;
        ArrayList list = Collections.list(classLoader.getResources(kotlin.jvm.internal.i.i("META-INF/services/", cls.getName())));
        kotlin.jvm.internal.i.c(list, "java.util.Collections.list(this)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w5.n.h(arrayList, f18351a.e((URL) it.next()));
        }
        t6 = w5.q.t(arrayList);
        if (!(!t6.isEmpty())) {
            throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
        }
        g7 = w5.j.g(t6, 10);
        ArrayList arrayList2 = new ArrayList(g7);
        Iterator it2 = t6.iterator();
        while (it2.hasNext()) {
            arrayList2.add(f18351a.a((String) it2.next(), classLoader, cls));
        }
        return arrayList2;
    }
}
