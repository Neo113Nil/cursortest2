package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.GeneratedAppGlideModule;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azj implements ComponentCallbacks2 {
    private static volatile azj g;
    private static volatile boolean h;
    public final bdj a;
    public final bed b;
    public final azu c;
    public final List d = new ArrayList();
    public final bek e;
    public final a f;
    private final bkj i;
    private final bev j;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public azj(Context context, bdj bdjVar, bev bevVar, bed bedVar, bek bekVar, bkj bkjVar, a aVar, Map map, List list, List list2, bkr bkrVar, brn brnVar) {
        this.a = bdjVar;
        this.b = bedVar;
        this.e = bekVar;
        this.j = bevVar;
        this.i = bkjVar;
        this.f = aVar;
        if (((azo) ((azv) brnVar.a.get(azo.class))) != null) {
            throw null;
        }
        this.c = new azu(context, bekVar, new bad(this, list2, bkrVar), new a(), map, list, bdjVar, brnVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        if (r12.b().isEmpty() != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0091, code lost:
    
        r0 = r12.b();
        r5 = r11.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009d, code lost:
    
        if (r5.hasNext() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ad, code lost:
    
        if (r0.contains(((defpackage.bkt) r5.next()).getClass()) == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00af, code lost:
    
        r5.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static azj b(Context context) {
        a aVar;
        bed beeVar;
        if (g == null) {
            GeneratedAppGlideModule g2 = g(context.getApplicationContext());
            synchronized (azj.class) {
                if (g == null) {
                    if (h) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    h = true;
                    try {
                        qi qiVar = new qi();
                        brn brnVar = new brn((byte[]) null, (int[]) null);
                        Context applicationContext = context.getApplicationContext();
                        List list = Collections.EMPTY_LIST;
                        ArrayList arrayList = new ArrayList();
                        try {
                            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                            if (applicationInfo != null && applicationInfo.metaData != null) {
                                for (String str : applicationInfo.metaData.keySet()) {
                                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                                        arrayList.add(bkv.c(str));
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            if (Log.isLoggable("ManifestParser", 6)) {
                                Log.e("ManifestParser", "Failed to parse glide modules", e);
                            }
                        }
                        bki a = g2 != null ? g2.a() : null;
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((bkt) it.next()).d(applicationContext);
                        }
                        if (g2 != null) {
                            g2.d(applicationContext);
                        }
                        long j = bfc.a;
                        bez bezVar = new bez(false);
                        bezVar.b(bfc.a());
                        bezVar.a = "source";
                        bfc a2 = bezVar.a();
                        bez bezVar2 = new bez(true);
                        bezVar2.b(1);
                        bezVar2.a = "disk-cache";
                        bfc a3 = bezVar2.a();
                        int i = bfc.a() >= 4 ? 2 : 1;
                        bez bezVar3 = new bez(true);
                        bezVar3.b(i);
                        bezVar3.a = "animation";
                        bfc a4 = bezVar3.a();
                        bew bewVar = new bew(applicationContext);
                        int i2 = true != bewVar.a.isLowRamDevice() ? 4194304 : 2097152;
                        int round = Math.round(r7.getMemoryClass() * 1048576 * (true != bewVar.a.isLowRamDevice() ? 0.4f : 0.33f));
                        float f = ((DisplayMetrics) bewVar.c.a).widthPixels * ((DisplayMetrics) bewVar.c.a).heightPixels * 4;
                        int round2 = Math.round(bewVar.b * f);
                        int round3 = Math.round(f + f);
                        int i3 = round - i2;
                        if (round3 + round2 > i3) {
                            float f2 = i3 / (bewVar.b + 2.0f);
                            round3 = Math.round(f2 + f2);
                            round2 = Math.round(f2 * bewVar.b);
                        }
                        a aVar2 = new a();
                        if (round2 > 0) {
                            aVar = aVar2;
                            beeVar = new bel(round2);
                        } else {
                            aVar = aVar2;
                            beeVar = new bee();
                        }
                        bek bekVar = new bek(i2);
                        bev bevVar = new bev(round3);
                        brn brnVar2 = new brn(applicationContext);
                        new ThreadPoolExecutor(0, Integer.MAX_VALUE, bfc.a, TimeUnit.MILLISECONDS, new SynchronousQueue(), new bfb("source-unlimited", false));
                        azj azjVar = new azj(applicationContext, new bdj(bevVar, brnVar2, a3, a2, a4), bevVar, beeVar, bekVar, new bkj(a), aVar, qiVar, Collections.EMPTY_LIST, arrayList, g2, new brn(brnVar));
                        applicationContext.registerComponentCallbacks(azjVar);
                        g = azjVar;
                    } finally {
                        h = false;
                    }
                }
            }
        }
        return g;
    }

    public static bah c(Context context) {
        return d(context).a(context);
    }

    public static bkj d(Context context) {
        a.v(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return b(context).i;
    }

    private static GeneratedAppGlideModule g(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                return null;
            }
            return null;
        } catch (IllegalAccessException e) {
            h(e);
            return null;
        } catch (InstantiationException e2) {
            h(e2);
            return null;
        } catch (NoSuchMethodException e3) {
            h(e3);
            return null;
        } catch (InvocationTargetException e4) {
            h(e4);
            return null;
        }
    }

    private static void h(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public final Context a() {
        return this.c.getBaseContext();
    }

    public final void e() {
        bmi.f();
        this.j.i(0L);
        this.b.c();
        this.e.b();
    }

    public final void f(int i) {
        bmi.f();
        List<bah> list = this.d;
        synchronized (list) {
            for (bah bahVar : list) {
            }
        }
        bev bevVar = this.j;
        if (i >= 40) {
            bevVar.i(0L);
        } else if (i >= 20 || i == 15) {
            bevVar.i(bevVar.e() / 2);
        }
        this.b.e(i);
        this.e.d(i);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        e();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        f(i);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
