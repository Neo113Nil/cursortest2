package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import com.clutchquizarena.app.db.AppDatabase;
import d0.ExecutorC0090d;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import m.C0255a;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1678a;

    /* renamed from: e, reason: collision with root package name */
    public ExecutorC0090d f1681e;

    /* renamed from: f, reason: collision with root package name */
    public ExecutorC0090d f1682f;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1679b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1680c = new ArrayList();
    public final ArrayList d = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final int f1683g = 1;
    public final boolean h = true;
    public final long i = -1;

    /* renamed from: j, reason: collision with root package name */
    public final A0.h f1684j = new A0.h(19);

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f1685k = new LinkedHashSet();

    public r(Context context) {
        this.f1678a = context;
    }

    public final t a() {
        String str;
        ExecutorC0090d executorC0090d = this.f1681e;
        if (executorC0090d == null && this.f1682f == null) {
            ExecutorC0090d executorC0090d2 = C0255a.i;
            this.f1682f = executorC0090d2;
            this.f1681e = executorC0090d2;
        } else if (executorC0090d != null && this.f1682f == null) {
            this.f1682f = executorC0090d;
        } else if (executorC0090d == null) {
            this.f1681e = this.f1682f;
        }
        O0.e eVar = new O0.e(27);
        if (this.i > 0) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ArrayList arrayList = this.f1679b;
        int i = this.f1683g;
        if (i == 0) {
            throw null;
        }
        Context context = this.f1678a;
        if (i == 1) {
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            i = (activityManager == null || activityManager.isLowRamDevice()) ? 2 : 3;
        }
        int i2 = i;
        ExecutorC0090d executorC0090d3 = this.f1681e;
        if (executorC0090d3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ExecutorC0090d executorC0090d4 = this.f1682f;
        if (executorC0090d4 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        g gVar = new g(context, eVar, this.f1684j, arrayList, i2, executorC0090d3, executorC0090d4, this.h, this.f1685k, this.f1680c, this.d);
        Package r3 = AppDatabase.class.getPackage();
        g1.f.b(r3);
        String name = r3.getName();
        String canonicalName = AppDatabase.class.getCanonicalName();
        g1.f.b(canonicalName);
        g1.f.d(name, "fullPackage");
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            g1.f.d(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String replace = canonicalName.replace('.', '_');
        g1.f.d(replace, "replace(...)");
        String concat = replace.concat("_Impl");
        try {
            if (name.length() == 0) {
                str = concat;
            } else {
                str = name + '.' + concat;
            }
            Class<?> cls = Class.forName(str, true, AppDatabase.class.getClassLoader());
            g1.f.c(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            t tVar = (t) cls.getDeclaredConstructor(null).newInstance(null);
            tVar.init(gVar);
            return tVar;
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + AppDatabase.class.getCanonicalName() + ". " + concat + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + AppDatabase.class.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + AppDatabase.class.getCanonicalName());
        }
    }
}
