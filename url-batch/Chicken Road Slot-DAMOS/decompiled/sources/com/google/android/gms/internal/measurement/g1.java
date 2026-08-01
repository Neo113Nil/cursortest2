package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.SystemClock;
import android.os.Trace;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class g1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a7.d f2311a = new a7.d("Phenotype.API", new aa(0), new a7.c());

    public static int a(int i3) {
        if (i3 == 0) {
            return 1;
        }
        if (i3 == 1) {
            return 2;
        }
        if (i3 == 2) {
            return 3;
        }
        if (i3 != 3) {
            return i3 != 4 ? 0 : 5;
        }
        return 4;
    }

    public static File b(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return filesDir;
        }
        SystemClock.sleep(100L);
        File filesDir2 = context.getFilesDir();
        if (filesDir2 != null) {
            return filesDir2;
        }
        kotlin.collections.i0.l("getFilesDir returned null twice.");
        return null;
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        a2.r.j(str.concat(" must not be null"));
    }

    public static c1 d() {
        ClassLoader classLoader = g1.class.getClassLoader();
        if (c1.class.equals(c1.class)) {
            try {
                try {
                    if (Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(null).newInstance(null) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ReflectiveOperationException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        try {
            Iterator it = Arrays.asList(new g1[0]).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ServiceConfigurationError e9) {
                    Logger.getLogger(b1.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(c1.class.getSimpleName()), (Throwable) e9);
                }
            }
            if (arrayList.size() == 1) {
                return (c1) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (c1) c1.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (ReflectiveOperationException e10) {
                throw new IllegalStateException(e10);
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static void e(bg bgVar) {
        ff ffVar;
        if (g(bgVar) || (ffVar = ((ff) bgVar).f2295d) == null) {
            Trace.beginSection(((ff) bgVar).f2297i);
            h(bgVar);
        } else {
            e(ffVar);
            h(bgVar);
        }
    }

    public static void f(bg bgVar) {
        if (!g(bgVar)) {
            ff ffVar = (ff) bgVar;
            if (ffVar.f2295d != null) {
                Trace.endSection();
                f(ffVar.f2295d);
                return;
            }
        }
        Trace.endSection();
        Trace.endSection();
    }

    public static boolean g(bg bgVar) {
        return ((ff) bgVar).f2299s != Thread.currentThread();
    }

    public static void h(bg bgVar) {
        String str = ((ff) bgVar).f2298r;
        AtomicReference atomicReference = mf.f2542a;
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }
}
