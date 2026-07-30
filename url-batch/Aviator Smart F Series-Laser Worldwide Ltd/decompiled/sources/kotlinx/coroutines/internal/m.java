package kotlinx.coroutines.internal;

import cn.hutool.core.util.g1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes5.dex */
public final class m {
    public static final m INSTANCE = new m();
    private static final String PREFIX = "META-INF/services/";

    private m() {
    }

    private final v createInstanceOf(Class<v> cls, String str) {
        try {
            return cls.cast(Class.forName(str, true, cls.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private final <S> S getProviderInstance(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    private final <S> List<S> load(Class<S> cls, ClassLoader classLoader) {
        try {
            return loadProviders$kotlinx_coroutines_core(cls, classLoader);
        } catch (Throwable unused) {
            return CollectionsKt___CollectionsKt.toList(ServiceLoader.load(cls, classLoader));
        }
    }

    private final List<String> parse(URL url) {
        BufferedReader bufferedReader;
        String substringAfter$default;
        String substringBefore$default;
        String substringAfter$default2;
        String url2 = url.toString();
        if (!kotlin.text.t.startsWith$default(url2, g1.URL_PROTOCOL_JAR, false, 2, null)) {
            bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List<String> parseFile = INSTANCE.parseFile(bufferedReader);
                kotlin.io.b.closeFinally(bufferedReader, null);
                return parseFile;
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        }
        substringAfter$default = StringsKt__StringsKt.substringAfter$default(url2, "jar:file:", (String) null, 2, (Object) null);
        substringBefore$default = StringsKt__StringsKt.substringBefore$default(substringAfter$default, '!', (String) null, 2, (Object) null);
        substringAfter$default2 = StringsKt__StringsKt.substringAfter$default(url2, g1.JAR_URL_SEPARATOR, (String) null, 2, (Object) null);
        JarFile jarFile = new JarFile(substringBefore$default, false);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(substringAfter$default2)), cn.hutool.core.util.l.UTF_8));
            try {
                List<String> parseFile2 = INSTANCE.parseFile(bufferedReader);
                kotlin.io.b.closeFinally(bufferedReader, null);
                jarFile.close();
                return parseFile2;
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
                    y5.b.addSuppressed(th2, th4);
                    throw th2;
                }
            }
        }
    }

    private final List<String> parseFile(BufferedReader bufferedReader) {
        String substringBefore$default;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return CollectionsKt___CollectionsKt.toList(linkedHashSet);
            }
            substringBefore$default = StringsKt__StringsKt.substringBefore$default(readLine, "#", (String) null, 2, (Object) null);
            String obj = StringsKt__StringsKt.trim((CharSequence) substringBefore$default).toString();
            for (int i8 = 0; i8 < obj.length(); i8++) {
                char charAt = obj.charAt(i8);
                if (charAt != '.' && !Character.isJavaIdentifierPart(charAt)) {
                    throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
                }
            }
            if (obj.length() > 0) {
                linkedHashSet.add(obj);
            }
        }
    }

    private final <R> R use(JarFile jarFile, f6.l lVar) {
        try {
            R r8 = (R) lVar.invoke(jarFile);
            kotlin.jvm.internal.r.finallyStart(1);
            jarFile.close();
            kotlin.jvm.internal.r.finallyEnd(1);
            return r8;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                kotlin.jvm.internal.r.finallyStart(1);
                try {
                    jarFile.close();
                    kotlin.jvm.internal.r.finallyEnd(1);
                    throw th2;
                } catch (Throwable th3) {
                    y5.b.addSuppressed(th, th3);
                    throw th;
                }
            }
        }
    }

    public final List<v> loadMainDispatcherFactory$kotlinx_coroutines_core() {
        v vVar;
        if (!n.getANDROID_DETECTED()) {
            return load(v.class, v.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            v vVar2 = null;
            try {
                vVar = (v) v.class.cast(Class.forName("kotlinx.coroutines.android.a", true, v.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                vVar = null;
            }
            if (vVar != null) {
                arrayList.add(vVar);
            }
            try {
                vVar2 = (v) v.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, v.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (vVar2 == null) {
                return arrayList;
            }
            arrayList.add(vVar2);
            return arrayList;
        } catch (Throwable unused3) {
            return load(v.class, v.class.getClassLoader());
        }
    }

    public final <S> List<S> loadProviders$kotlinx_coroutines_core(Class<S> cls, ClassLoader classLoader) {
        Set set;
        ArrayList list = Collections.list(classLoader.getResources(PREFIX + cls.getName()));
        kotlin.jvm.internal.s.checkNotNullExpressionValue(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kotlin.collections.v.addAll(arrayList, INSTANCE.parse((URL) it.next()));
        }
        set = CollectionsKt___CollectionsKt.toSet(arrayList);
        if (!(!set.isEmpty())) {
            throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.r.collectionSizeOrDefault(set, 10));
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList2.add(INSTANCE.getProviderInstance((String) it2.next(), classLoader, cls));
        }
        return arrayList2;
    }
}
