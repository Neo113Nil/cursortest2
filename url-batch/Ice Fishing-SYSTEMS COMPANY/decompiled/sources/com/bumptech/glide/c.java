package com.bumptech.glide;

import D.y;
import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.internal.ads.C3112dq;
import g1.C4523c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import t2.w;
import v1.C5122f;
import v1.InterfaceC5117a;
import w1.C5150c;
import w1.C5151d;
import x1.ThreadFactoryC5205a;
import x1.ThreadFactoryC5206b;

/* loaded from: classes.dex */
public final class c implements ComponentCallbacks2 {

    /* renamed from: A, reason: collision with root package name */
    public static volatile c f23528A;

    /* renamed from: B, reason: collision with root package name */
    public static volatile boolean f23529B;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC5117a f23530n;

    /* renamed from: u, reason: collision with root package name */
    public final C5150c f23531u;

    /* renamed from: v, reason: collision with root package name */
    public final i f23532v;

    /* renamed from: w, reason: collision with root package name */
    public final C3112dq f23533w;

    /* renamed from: x, reason: collision with root package name */
    public final com.bumptech.glide.manager.k f23534x;

    /* renamed from: y, reason: collision with root package name */
    public final W3.e f23535y;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f23536z = new ArrayList();

    public c(Context context, u1.k kVar, C5150c c5150c, InterfaceC5117a interfaceC5117a, C3112dq c3112dq, com.bumptech.glide.manager.k kVar2, W3.e eVar, W3.e eVar2, s.b bVar, List list, ArrayList arrayList, p8.g gVar, C4523c c4523c) {
        new N1.h(new F3.l(5, this));
        this.f23530n = interfaceC5117a;
        this.f23533w = c3112dq;
        this.f23531u = c5150c;
        this.f23534x = kVar2;
        this.f23535y = eVar;
        if (((Map) c4523c.f37856u).get(f.class) != null) {
            throw new ClassCastException();
        }
        this.f23532v = new i(context, c3112dq, new com.bumptech.glide.manager.o(this, arrayList, gVar), new W3.e(5), eVar2, bVar, list, kVar, c4523c);
    }

    public static c a(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f23528A == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e6);
            } catch (InstantiationException e9) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e9);
            } catch (NoSuchMethodException e10) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e11);
            }
            synchronized (c.class) {
                if (f23528A == null) {
                    if (f23529B) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    f23529B = true;
                    try {
                        b(context, generatedAppGlideModule);
                        f23529B = false;
                    } catch (Throwable th) {
                        f23529B = false;
                        throw th;
                    }
                }
            }
        }
        return f23528A;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0320  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        Iterator it;
        W3.e eVar;
        Iterator it2;
        ApplicationInfo applicationInfo;
        s.b bVar = new s.b();
        I0.j jVar = new I0.j(20);
        W3.e eVar2 = new W3.e(14);
        Context applicationContext = context.getApplicationContext();
        List list = Collections.EMPTY_LIST;
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e6) {
            if (Log.isLoggable("ManifestParser", 6)) {
                Log.e("ManifestParser", "Failed to parse glide modules", e6);
            }
        }
        if (applicationInfo != null && applicationInfo.metaData != null) {
            if (Log.isLoggable("ManifestParser", 2)) {
                Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
            }
            for (String str : applicationInfo.metaData.keySet()) {
                if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                    w8.a.h(str);
                    throw null;
                }
            }
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Finished loading Glide modules");
            }
            if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
                new HashSet();
                it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    throw y.h(it2);
                }
            }
            if (Log.isLoggable("Glide", 3)) {
                Iterator it3 = arrayList.iterator();
                if (it3.hasNext()) {
                    throw y.h(it3);
                }
            }
            it = arrayList.iterator();
            if (!it.hasNext()) {
                throw y.h(it);
            }
            ThreadFactoryC5205a threadFactoryC5205a = new ThreadFactoryC5205a();
            if (x1.d.f41782v == 0) {
                x1.d.f41782v = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i = x1.d.f41782v;
            if (TextUtils.isEmpty("source")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
            }
            ThreadFactoryC5206b threadFactoryC5206b = new ThreadFactoryC5206b(threadFactoryC5205a, "source", false);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            x1.d dVar = new x1.d(new ThreadPoolExecutor(i, i, 0L, timeUnit, new PriorityBlockingQueue(), threadFactoryC5206b));
            ThreadFactoryC5205a threadFactoryC5205a2 = new ThreadFactoryC5205a();
            if (TextUtils.isEmpty("disk-cache")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
            }
            x1.d dVar2 = new x1.d(new ThreadPoolExecutor(1, 1, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC5206b(threadFactoryC5205a2, "disk-cache", true)));
            if (x1.d.f41782v == 0) {
                x1.d.f41782v = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i4 = x1.d.f41782v >= 4 ? 2 : 1;
            ThreadFactoryC5205a threadFactoryC5205a3 = new ThreadFactoryC5205a();
            if (TextUtils.isEmpty("animation")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
            }
            x1.d dVar3 = new x1.d(new ThreadPoolExecutor(i4, i4, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC5206b(threadFactoryC5205a3, "animation", true)));
            C5151d c5151d = new C5151d(applicationContext);
            W2.b bVar2 = new W2.b();
            Context context2 = c5151d.f41588a;
            ActivityManager activityManager = c5151d.f41589b;
            int i9 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
            bVar2.f3425c = i9;
            int round = Math.round(activityManager.getMemoryClass() * com.anythink.basead.exoplayer.h.o.f7899d * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
            DisplayMetrics displayMetrics = (DisplayMetrics) c5151d.f41590c.f41190n;
            float f6 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
            float f9 = c5151d.f41591d;
            int round2 = Math.round(f6 * f9);
            int round3 = Math.round(f6 * 2.0f);
            int i10 = round - i9;
            int i11 = round3 + round2;
            if (i11 <= i10) {
                bVar2.f3424b = round3;
                bVar2.f3423a = round2;
            } else {
                float f10 = i10 / (f9 + 2.0f);
                bVar2.f3424b = Math.round(2.0f * f10);
                bVar2.f3423a = Math.round(f10 * f9);
            }
            if (Log.isLoggable("MemorySizeCalculator", 3)) {
                StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
                eVar = eVar2;
                sb.append(Formatter.formatFileSize(context2, bVar2.f3424b));
                sb.append(", pool size: ");
                sb.append(Formatter.formatFileSize(context2, bVar2.f3423a));
                sb.append(", byte array size: ");
                sb.append(Formatter.formatFileSize(context2, i9));
                sb.append(", memory class limited? ");
                sb.append(i11 > round);
                sb.append(", max size: ");
                sb.append(Formatter.formatFileSize(context2, round));
                sb.append(", memoryClass: ");
                sb.append(activityManager.getMemoryClass());
                sb.append(", isLowMemoryDevice: ");
                sb.append(activityManager.isLowRamDevice());
                Log.d("MemorySizeCalculator", sb.toString());
            } else {
                eVar = eVar2;
            }
            W3.e eVar3 = new W3.e(15);
            int i12 = bVar2.f3423a;
            InterfaceC5117a c5122f = i12 > 0 ? new C5122f(i12) : new W3.e(28);
            C3112dq c3112dq = new C3112dq(bVar2.f3425c);
            C5150c c5150c = new C5150c(bVar2.f3424b, 0);
            c cVar = new c(applicationContext, new u1.k(c5150c, new w(applicationContext), dVar2, dVar, new x1.d(new ThreadPoolExecutor(0, Integer.MAX_VALUE, x1.d.f41781u, timeUnit, new SynchronousQueue(), new ThreadFactoryC5206b(new ThreadFactoryC5205a(), "source-unlimited", false))), dVar3), c5150c, c5122f, c3112dq, new com.bumptech.glide.manager.k(), eVar3, eVar, bVar, Collections.EMPTY_LIST, arrayList, generatedAppGlideModule, new C4523c(jVar));
            applicationContext.registerComponentCallbacks(cVar);
            f23528A = cVar;
            return;
        }
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Got null app info metadata");
        }
        if (generatedAppGlideModule != null) {
            new HashSet();
            it2 = arrayList.iterator();
            if (it2.hasNext()) {
            }
        }
        if (Log.isLoggable("Glide", 3)) {
        }
        it = arrayList.iterator();
        if (!it.hasNext()) {
        }
    }

    public static p c(Context context) {
        N1.g.c(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return a(context).f23534x.b(context);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        N1.p.a();
        this.f23531u.g(0L);
        this.f23530n.s();
        C3112dq c3112dq = this.f23533w;
        synchronized (c3112dq) {
            c3112dq.c(0);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        long j9;
        N1.p.a();
        synchronized (this.f23536z) {
            try {
                Iterator it = this.f23536z.iterator();
                while (it.hasNext()) {
                    ((p) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C5150c c5150c = this.f23531u;
        c5150c.getClass();
        if (i >= 40) {
            c5150c.g(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (c5150c) {
                j9 = c5150c.f1968n;
            }
            c5150c.g(j9 / 2);
        }
        this.f23530n.p(i);
        C3112dq c3112dq = this.f23533w;
        synchronized (c3112dq) {
            if (i >= 40) {
                synchronized (c3112dq) {
                    c3112dq.c(0);
                }
            } else if (i >= 20 || i == 15) {
                c3112dq.c(c3112dq.f30232n / 2);
            }
        }
    }
}
