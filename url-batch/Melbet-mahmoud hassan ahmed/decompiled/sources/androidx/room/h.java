package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import w.c;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    protected volatile w.b f1301a;

    /* renamed from: b, reason: collision with root package name */
    private Executor f1302b;

    /* renamed from: c, reason: collision with root package name */
    private Executor f1303c;

    /* renamed from: d, reason: collision with root package name */
    private w.c f1304d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1306f;

    /* renamed from: g, reason: collision with root package name */
    boolean f1307g;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    protected List<b> f1308h;

    /* renamed from: i, reason: collision with root package name */
    private final ReentrantReadWriteLock f1309i = new ReentrantReadWriteLock();

    /* renamed from: j, reason: collision with root package name */
    private final ThreadLocal<Integer> f1310j = new ThreadLocal<>();

    /* renamed from: k, reason: collision with root package name */
    private final Map<String, Object> f1311k = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private final e f1305e = e();

    public static class a<T extends h> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<T> f1312a;

        /* renamed from: b, reason: collision with root package name */
        private final String f1313b;

        /* renamed from: c, reason: collision with root package name */
        private final Context f1314c;

        /* renamed from: d, reason: collision with root package name */
        private ArrayList<b> f1315d;

        /* renamed from: e, reason: collision with root package name */
        private Executor f1316e;

        /* renamed from: f, reason: collision with root package name */
        private Executor f1317f;

        /* renamed from: g, reason: collision with root package name */
        private c.InterfaceC0147c f1318g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f1319h;

        /* renamed from: j, reason: collision with root package name */
        private boolean f1321j;

        /* renamed from: l, reason: collision with root package name */
        private boolean f1323l;

        /* renamed from: n, reason: collision with root package name */
        private Set<Integer> f1325n;

        /* renamed from: o, reason: collision with root package name */
        private Set<Integer> f1326o;

        /* renamed from: p, reason: collision with root package name */
        private String f1327p;

        /* renamed from: q, reason: collision with root package name */
        private File f1328q;

        /* renamed from: i, reason: collision with root package name */
        private c f1320i = c.AUTOMATIC;

        /* renamed from: k, reason: collision with root package name */
        private boolean f1322k = true;

        /* renamed from: m, reason: collision with root package name */
        private final d f1324m = new d();

        a(Context context, Class<T> cls, String str) {
            this.f1314c = context;
            this.f1312a = cls;
            this.f1313b = str;
        }

        public a<T> a(b bVar) {
            if (this.f1315d == null) {
                this.f1315d = new ArrayList<>();
            }
            this.f1315d.add(bVar);
            return this;
        }

        public a<T> b(u.a... aVarArr) {
            if (this.f1326o == null) {
                this.f1326o = new HashSet();
            }
            for (u.a aVar : aVarArr) {
                this.f1326o.add(Integer.valueOf(aVar.f22383a));
                this.f1326o.add(Integer.valueOf(aVar.f22384b));
            }
            this.f1324m.b(aVarArr);
            return this;
        }

        public a<T> c() {
            this.f1319h = true;
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:51:0x0028, code lost:
        
            if (r1 != null) goto L11;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
        @SuppressLint({"RestrictedApi"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public T d() {
            Executor executor;
            Set<Integer> set;
            String str;
            if (this.f1314c == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            }
            if (this.f1312a == null) {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
            Executor executor2 = this.f1316e;
            if (executor2 != null || this.f1317f != null) {
                if (executor2 != null && this.f1317f == null) {
                    this.f1317f = executor2;
                } else if (executor2 == null) {
                    executor = this.f1317f;
                }
                set = this.f1326o;
                if (set != null && this.f1325n != null) {
                    for (Integer num : set) {
                        if (this.f1325n.contains(num)) {
                            throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + num);
                        }
                    }
                }
                if (this.f1318g == null) {
                    this.f1318g = new x.c();
                }
                str = this.f1327p;
                if (str == null || this.f1328q != null) {
                    if (this.f1313b != null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                    if (str != null && this.f1328q != null) {
                        throw new IllegalArgumentException("Both createFromAsset() and createFromFile() was called on this Builder but the database can only be created using one of the two configurations.");
                    }
                    this.f1318g = new k(str, this.f1328q, this.f1318g);
                }
                Context context = this.f1314c;
                androidx.room.a aVar = new androidx.room.a(context, this.f1313b, this.f1318g, this.f1324m, this.f1315d, this.f1319h, this.f1320i.d(context), this.f1316e, this.f1317f, this.f1321j, this.f1322k, this.f1323l, this.f1325n, this.f1327p, this.f1328q);
                T t6 = (T) g.b(this.f1312a, "_Impl");
                t6.l(aVar);
                return t6;
            }
            executor = c.a.d();
            this.f1317f = executor;
            this.f1316e = executor;
            set = this.f1326o;
            if (set != null) {
                while (r1.hasNext()) {
                }
            }
            if (this.f1318g == null) {
            }
            str = this.f1327p;
            if (str == null) {
            }
            if (this.f1313b != null) {
            }
        }

        public a<T> e() {
            this.f1322k = false;
            this.f1323l = true;
            return this;
        }

        public a<T> f(c.InterfaceC0147c interfaceC0147c) {
            this.f1318g = interfaceC0147c;
            return this;
        }

        public a<T> g(Executor executor) {
            this.f1316e = executor;
            return this;
        }
    }

    public static abstract class b {
        public void a(w.b bVar) {
        }

        public void b(w.b bVar) {
        }

        public void c(w.b bVar) {
        }
    }

    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private static boolean b(ActivityManager activityManager) {
            if (Build.VERSION.SDK_INT >= 19) {
                return activityManager.isLowRamDevice();
            }
            return false;
        }

        @SuppressLint({"NewApi"})
        c d(Context context) {
            ActivityManager activityManager;
            return this != AUTOMATIC ? this : (Build.VERSION.SDK_INT < 16 || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || b(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private HashMap<Integer, TreeMap<Integer, u.a>> f1333a = new HashMap<>();

        private void a(u.a aVar) {
            int i7 = aVar.f22383a;
            int i8 = aVar.f22384b;
            TreeMap<Integer, u.a> treeMap = this.f1333a.get(Integer.valueOf(i7));
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                this.f1333a.put(Integer.valueOf(i7), treeMap);
            }
            u.a aVar2 = treeMap.get(Integer.valueOf(i8));
            if (aVar2 != null) {
                Log.w("ROOM", "Overriding migration " + aVar2 + " with " + aVar);
            }
            treeMap.put(Integer.valueOf(i8), aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:5:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private List<u.a> d(List<u.a> list, boolean z6, int i7, int i8) {
            TreeMap<Integer, u.a> treeMap;
            boolean z7;
            do {
                if (z6) {
                    if (i7 >= i8) {
                        return list;
                    }
                    treeMap = this.f1333a.get(Integer.valueOf(i7));
                    if (treeMap == null) {
                        Iterator<Integer> it = (z6 ? treeMap.descendingKeySet() : treeMap.keySet()).iterator();
                        while (true) {
                            z7 = true;
                            boolean z8 = false;
                            if (!it.hasNext()) {
                                z7 = false;
                                break;
                            }
                            int intValue = it.next().intValue();
                            if (!z6 ? !(intValue < i8 || intValue >= i7) : !(intValue > i8 || intValue <= i7)) {
                                z8 = true;
                            }
                            if (z8) {
                                list.add(treeMap.get(Integer.valueOf(intValue)));
                                i7 = intValue;
                                break;
                            }
                        }
                    } else {
                        return null;
                    }
                } else {
                    if (i7 <= i8) {
                        return list;
                    }
                    treeMap = this.f1333a.get(Integer.valueOf(i7));
                    if (treeMap == null) {
                    }
                }
            } while (z7);
            return null;
        }

        public void b(u.a... aVarArr) {
            for (u.a aVar : aVarArr) {
                a(aVar);
            }
        }

        public List<u.a> c(int i7, int i8) {
            if (i7 == i8) {
                return Collections.emptyList();
            }
            return d(new ArrayList(), i8 > i7, i7, i8);
        }
    }

    private static boolean n() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public void a() {
        if (!this.f1306f && n()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void b() {
        if (!k() && this.f1310j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public void c() {
        a();
        w.b I = this.f1304d.I();
        this.f1305e.m(I);
        I.g();
    }

    public w.f d(String str) {
        a();
        b();
        return this.f1304d.I().n(str);
    }

    protected abstract e e();

    protected abstract w.c f(androidx.room.a aVar);

    @Deprecated
    public void g() {
        this.f1304d.I().d();
        if (k()) {
            return;
        }
        this.f1305e.f();
    }

    Lock h() {
        return this.f1309i.readLock();
    }

    public w.c i() {
        return this.f1304d;
    }

    public Executor j() {
        return this.f1302b;
    }

    public boolean k() {
        return this.f1304d.I().s();
    }

    public void l(androidx.room.a aVar) {
        w.c f7 = f(aVar);
        this.f1304d = f7;
        if (f7 instanceof j) {
            ((j) f7).f(aVar);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            r2 = aVar.f1243g == c.WRITE_AHEAD_LOGGING;
            this.f1304d.setWriteAheadLoggingEnabled(r2);
        }
        this.f1308h = aVar.f1241e;
        this.f1302b = aVar.f1244h;
        this.f1303c = new l(aVar.f1245i);
        this.f1306f = aVar.f1242f;
        this.f1307g = r2;
        if (aVar.f1246j) {
            this.f1305e.i(aVar.f1238b, aVar.f1239c);
        }
    }

    protected void m(w.b bVar) {
        this.f1305e.d(bVar);
    }

    public boolean o() {
        w.b bVar = this.f1301a;
        return bVar != null && bVar.isOpen();
    }

    public Cursor p(w.e eVar) {
        return q(eVar, null);
    }

    public Cursor q(w.e eVar, CancellationSignal cancellationSignal) {
        a();
        b();
        return (cancellationSignal == null || Build.VERSION.SDK_INT < 16) ? this.f1304d.I().t(eVar) : this.f1304d.I().N(eVar, cancellationSignal);
    }

    @Deprecated
    public void r() {
        this.f1304d.I().A();
    }
}
