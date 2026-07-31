package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
public class e {

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f1256m = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: b, reason: collision with root package name */
    final String[] f1258b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Set<String>> f1259c;

    /* renamed from: d, reason: collision with root package name */
    final h f1260d;

    /* renamed from: g, reason: collision with root package name */
    volatile w.f f1263g;

    /* renamed from: h, reason: collision with root package name */
    private b f1264h;

    /* renamed from: i, reason: collision with root package name */
    private final androidx.room.d f1265i;

    /* renamed from: k, reason: collision with root package name */
    private f f1267k;

    /* renamed from: e, reason: collision with root package name */
    AtomicBoolean f1261e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f1262f = false;

    /* renamed from: j, reason: collision with root package name */
    @SuppressLint({"RestrictedApi"})
    final d.b<c, d> f1266j = new d.b<>();

    /* renamed from: l, reason: collision with root package name */
    Runnable f1268l = new a();

    /* renamed from: a, reason: collision with root package name */
    final HashMap<String, Integer> f1257a = new HashMap<>();

    class a implements Runnable {
        a() {
        }

        private Set<Integer> a() {
            HashSet hashSet = new HashSet();
            Cursor p7 = e.this.f1260d.p(new w.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (p7.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(p7.getInt(0)));
                } catch (Throwable th) {
                    p7.close();
                    throw th;
                }
            }
            p7.close();
            if (!hashSet.isEmpty()) {
                e.this.f1263g.m();
            }
            return hashSet;
        }

        @Override // java.lang.Runnable
        public void run() {
            Lock h7 = e.this.f1260d.h();
            Set<Integer> set = null;
            try {
                try {
                    h7.lock();
                } finally {
                    h7.unlock();
                }
            } catch (SQLiteException | IllegalStateException e7) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e7);
            }
            if (e.this.c()) {
                if (e.this.f1261e.compareAndSet(true, false)) {
                    if (e.this.f1260d.k()) {
                        return;
                    }
                    h hVar = e.this.f1260d;
                    if (hVar.f1307g) {
                        w.b I = hVar.i().I();
                        I.g();
                        try {
                            set = a();
                            I.A();
                            I.d();
                        } catch (Throwable th) {
                            I.d();
                            throw th;
                        }
                    } else {
                        set = a();
                    }
                    if (set == null || set.isEmpty()) {
                        return;
                    }
                    synchronized (e.this.f1266j) {
                        Iterator<Map.Entry<c, d>> it = e.this.f1266j.iterator();
                        while (it.hasNext()) {
                            it.next().getValue().a(set);
                        }
                    }
                }
            }
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        final long[] f1270a;

        /* renamed from: b, reason: collision with root package name */
        final boolean[] f1271b;

        /* renamed from: c, reason: collision with root package name */
        final int[] f1272c;

        /* renamed from: d, reason: collision with root package name */
        boolean f1273d;

        /* renamed from: e, reason: collision with root package name */
        boolean f1274e;

        b(int i7) {
            long[] jArr = new long[i7];
            this.f1270a = jArr;
            boolean[] zArr = new boolean[i7];
            this.f1271b = zArr;
            this.f1272c = new int[i7];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        int[] a() {
            synchronized (this) {
                if (this.f1273d && !this.f1274e) {
                    int length = this.f1270a.length;
                    int i7 = 0;
                    while (true) {
                        int i8 = 1;
                        if (i7 >= length) {
                            this.f1274e = true;
                            this.f1273d = false;
                            return this.f1272c;
                        }
                        boolean z6 = this.f1270a[i7] > 0;
                        boolean[] zArr = this.f1271b;
                        if (z6 != zArr[i7]) {
                            int[] iArr = this.f1272c;
                            if (!z6) {
                                i8 = 2;
                            }
                            iArr[i7] = i8;
                        } else {
                            this.f1272c[i7] = 0;
                        }
                        zArr[i7] = z6;
                        i7++;
                    }
                }
                return null;
            }
        }

        boolean b(int... iArr) {
            boolean z6;
            synchronized (this) {
                z6 = false;
                for (int i7 : iArr) {
                    long[] jArr = this.f1270a;
                    long j7 = jArr[i7];
                    jArr[i7] = 1 + j7;
                    if (j7 == 0) {
                        this.f1273d = true;
                        z6 = true;
                    }
                }
            }
            return z6;
        }

        boolean c(int... iArr) {
            boolean z6;
            synchronized (this) {
                z6 = false;
                for (int i7 : iArr) {
                    long[] jArr = this.f1270a;
                    long j7 = jArr[i7];
                    jArr[i7] = j7 - 1;
                    if (j7 == 1) {
                        this.f1273d = true;
                        z6 = true;
                    }
                }
            }
            return z6;
        }

        void d() {
            synchronized (this) {
                this.f1274e = false;
            }
        }
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final String[] f1275a;

        public c(String[] strArr) {
            this.f1275a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        boolean a() {
            return false;
        }

        public abstract void b(Set<String> set);
    }

    static class d {

        /* renamed from: a, reason: collision with root package name */
        final int[] f1276a;

        /* renamed from: b, reason: collision with root package name */
        private final String[] f1277b;

        /* renamed from: c, reason: collision with root package name */
        final c f1278c;

        /* renamed from: d, reason: collision with root package name */
        private final Set<String> f1279d;

        d(c cVar, int[] iArr, String[] strArr) {
            Set<String> set;
            this.f1278c = cVar;
            this.f1276a = iArr;
            this.f1277b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(strArr[0]);
                set = Collections.unmodifiableSet(hashSet);
            } else {
                set = null;
            }
            this.f1279d = set;
        }

        void a(Set<Integer> set) {
            int length = this.f1276a.length;
            Set<String> set2 = null;
            for (int i7 = 0; i7 < length; i7++) {
                if (set.contains(Integer.valueOf(this.f1276a[i7]))) {
                    if (length == 1) {
                        set2 = this.f1279d;
                    } else {
                        if (set2 == null) {
                            set2 = new HashSet<>(length);
                        }
                        set2.add(this.f1277b[i7]);
                    }
                }
            }
            if (set2 != null) {
                this.f1278c.b(set2);
            }
        }

        void b(String[] strArr) {
            Set<String> set = null;
            if (this.f1277b.length == 1) {
                int length = strArr.length;
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        break;
                    }
                    if (strArr[i7].equalsIgnoreCase(this.f1277b[0])) {
                        set = this.f1279d;
                        break;
                    }
                    i7++;
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f1277b;
                    int length2 = strArr2.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 < length2) {
                            String str2 = strArr2[i8];
                            if (str2.equalsIgnoreCase(str)) {
                                hashSet.add(str2);
                                break;
                            }
                            i8++;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f1278c.b(set);
            }
        }
    }

    public e(h hVar, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f1260d = hVar;
        this.f1264h = new b(strArr.length);
        this.f1259c = map2;
        this.f1265i = new androidx.room.d(hVar);
        int length = strArr.length;
        this.f1258b = new String[length];
        for (int i7 = 0; i7 < length; i7++) {
            String str = strArr[i7];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f1257a.put(lowerCase, Integer.valueOf(i7));
            String str2 = map.get(strArr[i7]);
            if (str2 != null) {
                this.f1258b[i7] = str2.toLowerCase(locale);
            } else {
                this.f1258b[i7] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = value.toLowerCase(locale2);
            if (this.f1257a.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                HashMap<String, Integer> hashMap = this.f1257a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    private static void b(StringBuilder sb, String str, String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }

    private String[] h(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f1259c.containsKey(lowerCase)) {
                hashSet.addAll(this.f1259c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private void j(w.b bVar, int i7) {
        bVar.k("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i7 + ", 0)");
        String str = this.f1258b[i7];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f1256m) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            b(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i7);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            bVar.k(sb.toString());
        }
    }

    private void k(w.b bVar, int i7) {
        String str = this.f1258b[i7];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f1256m) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            b(sb, str, str2);
            bVar.k(sb.toString());
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void a(c cVar) {
        d n7;
        String[] h7 = h(cVar.f1275a);
        int[] iArr = new int[h7.length];
        int length = h7.length;
        for (int i7 = 0; i7 < length; i7++) {
            Integer num = this.f1257a.get(h7[i7].toLowerCase(Locale.US));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + h7[i7]);
            }
            iArr[i7] = num.intValue();
        }
        d dVar = new d(cVar, iArr, h7);
        synchronized (this.f1266j) {
            n7 = this.f1266j.n(cVar, dVar);
        }
        if (n7 == null && this.f1264h.b(iArr)) {
            l();
        }
    }

    boolean c() {
        if (!this.f1260d.o()) {
            return false;
        }
        if (!this.f1262f) {
            this.f1260d.i().I();
        }
        if (this.f1262f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    void d(w.b bVar) {
        synchronized (this) {
            if (this.f1262f) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            bVar.k("PRAGMA temp_store = MEMORY;");
            bVar.k("PRAGMA recursive_triggers='ON';");
            bVar.k("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            m(bVar);
            this.f1263g = bVar.n("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.f1262f = true;
        }
    }

    public void e(String... strArr) {
        synchronized (this.f1266j) {
            Iterator<Map.Entry<c, d>> it = this.f1266j.iterator();
            while (it.hasNext()) {
                Map.Entry<c, d> next = it.next();
                if (!next.getKey().a()) {
                    next.getValue().b(strArr);
                }
            }
        }
    }

    public void f() {
        if (this.f1261e.compareAndSet(false, true)) {
            this.f1260d.j().execute(this.f1268l);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void g(c cVar) {
        d o7;
        synchronized (this.f1266j) {
            o7 = this.f1266j.o(cVar);
        }
        if (o7 == null || !this.f1264h.c(o7.f1276a)) {
            return;
        }
        l();
    }

    void i(Context context, String str) {
        this.f1267k = new f(context, str, this, this.f1260d.j());
    }

    void l() {
        if (this.f1260d.o()) {
            m(this.f1260d.i().I());
        }
    }

    void m(w.b bVar) {
        if (bVar.s()) {
            return;
        }
        while (true) {
            try {
                Lock h7 = this.f1260d.h();
                h7.lock();
                try {
                    int[] a7 = this.f1264h.a();
                    if (a7 == null) {
                        return;
                    }
                    int length = a7.length;
                    bVar.g();
                    for (int i7 = 0; i7 < length; i7++) {
                        try {
                            int i8 = a7[i7];
                            if (i8 == 1) {
                                j(bVar, i7);
                            } else if (i8 == 2) {
                                k(bVar, i7);
                            }
                        } finally {
                        }
                    }
                    bVar.A();
                    bVar.d();
                    this.f1264h.d();
                } finally {
                    h7.unlock();
                }
            } catch (SQLiteException | IllegalStateException e7) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e7);
                return;
            }
        }
    }
}
