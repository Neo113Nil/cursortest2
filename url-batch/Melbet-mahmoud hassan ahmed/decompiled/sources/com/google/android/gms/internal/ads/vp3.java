package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.mp3;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
abstract class vp3<T extends mp3> {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f13471a = Logger.getLogger(hp3.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final String f13472b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    vp3() {
    }

    static <T extends mp3> T b(Class<T> cls) {
        String format;
        ClassLoader classLoader = vp3.class.getClassLoader();
        if (cls.equals(mp3.class)) {
            format = f13472b;
        } else {
            if (!cls.getPackage().equals(vp3.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            format = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    try {
                        return cls.cast(((vp3) Class.forName(format, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).a());
                    } catch (IllegalAccessException e7) {
                        throw new IllegalStateException(e7);
                    }
                } catch (InvocationTargetException e8) {
                    throw new IllegalStateException(e8);
                }
            } catch (InstantiationException e9) {
                throw new IllegalStateException(e9);
            } catch (NoSuchMethodException e10) {
                throw new IllegalStateException(e10);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(vp3.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((vp3) it.next()).a()));
                } catch (ServiceConfigurationError e11) {
                    Logger logger = f13471a;
                    Level level = Level.SEVERE;
                    String simpleName = cls.getSimpleName();
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", simpleName.length() != 0 ? "Unable to load ".concat(simpleName) : new String("Unable to load "), (Throwable) e11);
                }
            }
            if (arrayList.size() == 1) {
                return (T) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (T) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e12) {
                throw new IllegalStateException(e12);
            } catch (NoSuchMethodException e13) {
                throw new IllegalStateException(e13);
            } catch (InvocationTargetException e14) {
                throw new IllegalStateException(e14);
            }
        }
    }

    protected abstract T a();
}
