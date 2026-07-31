package z;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import z.g;

/* loaded from: classes.dex */
abstract class f {

    /* renamed from: a, reason: collision with root package name */
    static final androidx.collection.e f46811a = new androidx.collection.e(16);

    /* renamed from: b, reason: collision with root package name */
    private static final ExecutorService f46812b = h.a("fonts-androidx", 10, 10000);

    /* renamed from: c, reason: collision with root package name */
    static final Object f46813c = new Object();

    /* renamed from: d, reason: collision with root package name */
    static final androidx.collection.g f46814d = new androidx.collection.g();

    class a implements Callable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f46815b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f46816c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ z.e f46817d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f46818e;

        a(String str, Context context, z.e eVar, int i4) {
            this.f46815b = str;
            this.f46816c = context;
            this.f46817d = eVar;
            this.f46818e = i4;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return f.c(this.f46815b, this.f46816c, this.f46817d, this.f46818e);
        }
    }

    class b implements A.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3539a f46819a;

        b(C3539a c3539a) {
            this.f46819a = c3539a;
        }

        @Override // A.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f46819a.b(eVar);
        }
    }

    class c implements Callable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f46820b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f46821c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ z.e f46822d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f46823e;

        c(String str, Context context, z.e eVar, int i4) {
            this.f46820b = str;
            this.f46821c = context;
            this.f46822d = eVar;
            this.f46823e = i4;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return f.c(this.f46820b, this.f46821c, this.f46822d, this.f46823e);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    class d implements A.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f46824a;

        d(String str) {
            this.f46824a = str;
        }

        @Override // A.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (f.f46813c) {
                try {
                    androidx.collection.g gVar = f.f46814d;
                    ArrayList arrayList = (ArrayList) gVar.get(this.f46824a);
                    if (arrayList == null) {
                        return;
                    }
                    gVar.remove(this.f46824a);
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        ((A.a) arrayList.get(i4)).accept(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static String a(z.e eVar, int i4) {
        return eVar.d() + "-" + i4;
    }

    private static int b(g.a aVar) {
        int i4 = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        g.b[] b4 = aVar.b();
        if (b4 != null && b4.length != 0) {
            i4 = 0;
            for (g.b bVar : b4) {
                int b5 = bVar.b();
                if (b5 != 0) {
                    if (b5 < 0) {
                        return -3;
                    }
                    return b5;
                }
            }
        }
        return i4;
    }

    static e c(String str, Context context, z.e eVar, int i4) {
        androidx.collection.e eVar2 = f46811a;
        Typeface typeface = (Typeface) eVar2.get(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            g.a e4 = z.d.e(context, eVar, null);
            int b4 = b(e4);
            if (b4 != 0) {
                return new e(b4);
            }
            Typeface b5 = androidx.core.graphics.c.b(context, null, e4.b(), i4);
            if (b5 == null) {
                return new e(-3);
            }
            eVar2.put(str, b5);
            return new e(b5);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    static Typeface d(Context context, z.e eVar, int i4, Executor executor, C3539a c3539a) {
        String a4 = a(eVar, i4);
        Typeface typeface = (Typeface) f46811a.get(a4);
        if (typeface != null) {
            c3539a.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(c3539a);
        synchronized (f46813c) {
            try {
                androidx.collection.g gVar = f46814d;
                ArrayList arrayList = (ArrayList) gVar.get(a4);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bVar);
                gVar.put(a4, arrayList2);
                c cVar = new c(a4, context, eVar, i4);
                if (executor == null) {
                    executor = f46812b;
                }
                h.b(executor, cVar, new d(a4));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static Typeface e(Context context, z.e eVar, C3539a c3539a, int i4, int i5) {
        String a4 = a(eVar, i4);
        Typeface typeface = (Typeface) f46811a.get(a4);
        if (typeface != null) {
            c3539a.b(new e(typeface));
            return typeface;
        }
        if (i5 == -1) {
            e c4 = c(a4, context, eVar, i4);
            c3539a.b(c4);
            return c4.f46825a;
        }
        try {
            e eVar2 = (e) h.c(f46812b, new a(a4, context, eVar, i4), i5);
            c3539a.b(eVar2);
            return eVar2.f46825a;
        } catch (InterruptedException unused) {
            c3539a.b(new e(-3));
            return null;
        }
    }

    static final class e {

        /* renamed from: a, reason: collision with root package name */
        final Typeface f46825a;

        /* renamed from: b, reason: collision with root package name */
        final int f46826b;

        e(int i4) {
            this.f46825a = null;
            this.f46826b = i4;
        }

        boolean a() {
            return this.f46826b == 0;
        }

        e(Typeface typeface) {
            this.f46825a = typeface;
            this.f46826b = 0;
        }
    }
}
