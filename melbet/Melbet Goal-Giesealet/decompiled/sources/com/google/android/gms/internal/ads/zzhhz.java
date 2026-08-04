package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public abstract class zzhhz {
    static zzhhr zzb(Class cls) {
        String format;
        ClassLoader classLoader = zzhhz.class.getClassLoader();
        if (cls.equals(zzhhr.class)) {
            format = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!cls.getPackage().equals(zzhhz.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            format = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    return (zzhhr) cls.cast(((zzhhz) Class.forName(format, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).zza());
                } catch (NoSuchMethodException e) {
                    throw new IllegalStateException(e);
                } catch (InvocationTargetException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (IllegalAccessException e3) {
                throw new IllegalStateException(e3);
            } catch (InstantiationException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(zzhhz.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((zzhhr) cls.cast(((zzhhz) it.next()).zza()));
                } catch (ServiceConfigurationError e5) {
                    Logger logger = Logger.getLogger(zzhhm.class.getName());
                    Level level = Level.SEVERE;
                    String simpleName = cls.getSimpleName();
                    String.valueOf(simpleName);
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(String.valueOf(simpleName)), (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (zzhhr) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzhhr) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(e6);
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    protected abstract zzhhr zza();
}
