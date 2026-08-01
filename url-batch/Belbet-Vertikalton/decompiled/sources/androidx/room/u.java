package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import com.winpower.neonfit.data.AppDatabase;
import f0.ExecutorC0120d;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import o.C0318a;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2133a;
    public ExecutorC0120d e;

    /* renamed from: f, reason: collision with root package name */
    public ExecutorC0120d f2137f;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2134b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2135c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2136d = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final int f2138g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2139h = true;
    public final long i = -1;
    public final C1.d j = new C1.d(22);

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f2140k = new LinkedHashSet();

    public u(Context context) {
        this.f2133a = context;
    }

    public final w a() {
        String str;
        ExecutorC0120d executorC0120d = this.e;
        if (executorC0120d == null && this.f2137f == null) {
            ExecutorC0120d executorC0120d2 = C0318a.f3764d;
            this.f2137f = executorC0120d2;
            this.e = executorC0120d2;
        } else if (executorC0120d != null && this.f2137f == null) {
            this.f2137f = executorC0120d;
        } else if (executorC0120d == null) {
            this.e = this.f2137f;
        }
        N0.e eVar = new N0.e(28);
        if (this.i > 0) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ArrayList arrayList = this.f2134b;
        int i = this.f2138g;
        if (i == 0) {
            throw null;
        }
        Context context = this.f2133a;
        if (i == 1) {
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            i = (activityManager == null || activityManager.isLowRamDevice()) ? 2 : 3;
        }
        int i2 = i;
        ExecutorC0120d executorC0120d3 = this.e;
        if (executorC0120d3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ExecutorC0120d executorC0120d4 = this.f2137f;
        if (executorC0120d4 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        j jVar = new j(context, eVar, this.j, arrayList, i2, executorC0120d3, executorC0120d4, this.f2139h, this.f2140k, this.f2135c, this.f2136d);
        Package r3 = AppDatabase.class.getPackage();
        j1.h.b(r3);
        String name = r3.getName();
        String canonicalName = AppDatabase.class.getCanonicalName();
        j1.h.b(canonicalName);
        j1.h.d(name, "fullPackage");
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            j1.h.d(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String replace = canonicalName.replace('.', '_');
        j1.h.d(replace, "replace(...)");
        String concat = replace.concat("_Impl");
        try {
            if (name.length() == 0) {
                str = concat;
            } else {
                str = name + '.' + concat;
            }
            Class<?> cls = Class.forName(str, true, AppDatabase.class.getClassLoader());
            j1.h.c(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            w wVar = (w) cls.getDeclaredConstructor(null).newInstance(null);
            wVar.init(jVar);
            return wVar;
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + AppDatabase.class.getCanonicalName() + ". " + concat + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + AppDatabase.class.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + AppDatabase.class.getCanonicalName());
        }
    }
}
