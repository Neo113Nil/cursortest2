package u4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteCursor;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import e5.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m5.j;
import m5.k;
import m5.r;

/* loaded from: classes.dex */
public class c implements e5.a, k.c {

    /* renamed from: n, reason: collision with root package name */
    static String f22497n;

    /* renamed from: p, reason: collision with root package name */
    private static HandlerThread f22499p;

    /* renamed from: q, reason: collision with root package name */
    private static Handler f22500q;

    /* renamed from: f, reason: collision with root package name */
    private Context f22502f;

    /* renamed from: g, reason: collision with root package name */
    private k f22503g;

    /* renamed from: h, reason: collision with root package name */
    static final Map<String, Integer> f22491h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private static boolean f22492i = false;

    /* renamed from: j, reason: collision with root package name */
    private static int f22493j = 0;

    /* renamed from: k, reason: collision with root package name */
    static int f22494k = 0;

    /* renamed from: l, reason: collision with root package name */
    private static final Object f22495l = new Object();

    /* renamed from: m, reason: collision with root package name */
    private static final Object f22496m = new Object();

    /* renamed from: o, reason: collision with root package name */
    private static int f22498o = 0;

    /* renamed from: r, reason: collision with root package name */
    @SuppressLint({"UseSparseArrays"})
    static final Map<Integer, u4.a> f22501r = new HashMap();

    class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ j f22504f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ k.d f22505g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ u4.a f22506h;

        a(j jVar, k.d dVar, u4.a aVar) {
            this.f22504f = jVar;
            this.f22505g = dVar;
            this.f22506h = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.P(this.f22506h, new w4.e(this.f22504f, this.f22505g));
        }
    }

    class b implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ j f22508f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ k.d f22509g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ u4.a f22510h;

        b(j jVar, k.d dVar, u4.a aVar) {
            this.f22508f = jVar;
            this.f22509g = dVar;
            this.f22510h = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            w4.c cVar;
            String l7;
            w4.e eVar = new w4.e(this.f22508f, this.f22509g);
            boolean e7 = eVar.e();
            boolean h7 = eVar.h();
            List list = (List) this.f22508f.a("operations");
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                cVar = new w4.c((Map) it.next(), e7);
                l7 = cVar.l();
                l7.hashCode();
                switch (l7) {
                    case "execute":
                        if (c.this.q(this.f22510h, cVar)) {
                            cVar.q(arrayList);
                        } else {
                            if (!h7) {
                                cVar.o(this.f22509g);
                                break;
                            }
                            cVar.p(arrayList);
                        }
                    case "insert":
                        if (c.this.y(this.f22510h, cVar)) {
                            cVar.q(arrayList);
                        } else {
                            if (!h7) {
                                cVar.o(this.f22509g);
                                break;
                            }
                            cVar.p(arrayList);
                        }
                    case "update":
                        if (c.this.R(this.f22510h, cVar)) {
                            cVar.q(arrayList);
                        } else {
                            if (!h7) {
                                cVar.o(this.f22509g);
                                break;
                            }
                            cVar.p(arrayList);
                        }
                    case "query":
                        if (c.this.P(this.f22510h, cVar)) {
                            cVar.q(arrayList);
                        } else {
                            if (!h7) {
                                cVar.o(this.f22509g);
                                break;
                            }
                            cVar.p(arrayList);
                        }
                    default:
                        this.f22509g.b("bad_param", "Batch method '" + l7 + "' not supported", null);
                        break;
                }
                return;
            }
            k.d dVar = this.f22509g;
            if (e7) {
                dVar.a(null);
            } else {
                dVar.a(arrayList);
            }
        }
    }

    /* renamed from: u4.c$c, reason: collision with other inner class name */
    class RunnableC0143c implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ j f22512f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ k.d f22513g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ u4.a f22514h;

        RunnableC0143c(j jVar, k.d dVar, u4.a aVar) {
            this.f22512f = jVar;
            this.f22513g = dVar;
            this.f22514h = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.y(this.f22514h, new w4.e(this.f22512f, this.f22513g));
        }
    }

    class d implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ u4.a f22516f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ j f22517g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ k.d f22518h;

        d(u4.a aVar, j jVar, k.d dVar) {
            this.f22516f = aVar;
            this.f22517g = jVar;
            this.f22518h = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.r(this.f22516f, this.f22517g, this.f22518h) == null) {
                return;
            }
            this.f22518h.a(null);
        }
    }

    class e implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ j f22520f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ k.d f22521g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ u4.a f22522h;

        e(j jVar, k.d dVar, u4.a aVar) {
            this.f22520f = jVar;
            this.f22521g = dVar;
            this.f22522h = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.R(this.f22522h, new w4.e(this.f22520f, this.f22521g));
        }
    }

    class f implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f22524f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f22525g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ k.d f22526h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Boolean f22527i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ u4.a f22528j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ j f22529k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f22530l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f22531m;

        f(boolean z6, String str, k.d dVar, Boolean bool, u4.a aVar, j jVar, boolean z7, int i7) {
            this.f22524f = z6;
            this.f22525g = str;
            this.f22526h = dVar;
            this.f22527i = bool;
            this.f22528j = aVar;
            this.f22529k = jVar;
            this.f22530l = z7;
            this.f22531m = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (c.f22496m) {
                if (!this.f22524f) {
                    File file = new File(new File(this.f22525g).getParent());
                    if (!file.exists() && !file.mkdirs() && !file.exists()) {
                        this.f22526h.b("sqlite_error", "open_failed " + this.f22525g, null);
                        return;
                    }
                }
                try {
                    if (Boolean.TRUE.equals(this.f22527i)) {
                        this.f22528j.h();
                    } else {
                        this.f22528j.g();
                    }
                    synchronized (c.f22495l) {
                        if (this.f22530l) {
                            c.f22491h.put(this.f22525g, Integer.valueOf(this.f22531m));
                        }
                        c.f22501r.put(Integer.valueOf(this.f22531m), this.f22528j);
                    }
                    if (u4.b.b(this.f22528j.f22487d)) {
                        Log.d("Sqflite", this.f22528j.d() + "opened " + this.f22531m + " " + this.f22525g);
                    }
                    this.f22526h.a(c.A(this.f22531m, false, false));
                } catch (Exception e7) {
                    c.this.x(e7, new w4.e(this.f22529k, this.f22526h), this.f22528j);
                }
            }
        }
    }

    class g implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ u4.a f22533f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ k.d f22534g;

        g(u4.a aVar, k.d dVar) {
            this.f22533f = aVar;
            this.f22534g = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (c.f22496m) {
                c.this.m(this.f22533f);
            }
            this.f22534g.a(null);
        }
    }

    class h implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ u4.a f22536f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f22537g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ k.d f22538h;

        h(u4.a aVar, String str, k.d dVar) {
            this.f22536f = aVar;
            this.f22537g = str;
            this.f22538h = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (c.f22496m) {
                u4.a aVar = this.f22536f;
                if (aVar != null) {
                    c.this.m(aVar);
                }
                try {
                    if (u4.b.c(c.f22494k)) {
                        Log.d("Sqflite", "delete database " + this.f22537g);
                    }
                    u4.a.b(this.f22537g);
                } catch (Exception e7) {
                    Log.e("Sqflite", "error " + e7 + " while closing database " + c.f22498o);
                }
            }
            this.f22538h.a(null);
        }
    }

    static Map A(int i7, boolean z6, boolean z7) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", Integer.valueOf(i7));
        if (z6) {
            hashMap.put("recovered", Boolean.TRUE);
        }
        if (z7) {
            hashMap.put("recoveredInTransaction", Boolean.TRUE);
        }
        return hashMap;
    }

    private void B(Context context, m5.c cVar) {
        this.f22502f = context;
        k kVar = new k(cVar, "com.tekartik.sqflite", r.f19262b, cVar.b());
        this.f22503g = kVar;
        kVar.e(this);
    }

    private void D(j jVar, k.d dVar) {
        u4.a v6 = v(jVar, dVar);
        if (v6 == null) {
            return;
        }
        f22500q.post(new b(jVar, dVar, v6));
    }

    private void E(j jVar, k.d dVar) {
        int intValue = ((Integer) jVar.a("id")).intValue();
        u4.a v6 = v(jVar, dVar);
        if (v6 == null) {
            return;
        }
        if (u4.b.b(v6.f22487d)) {
            Log.d("Sqflite", v6.d() + "closing " + intValue + " " + v6.f22485b);
        }
        String str = v6.f22485b;
        synchronized (f22495l) {
            f22501r.remove(Integer.valueOf(intValue));
            if (v6.f22484a) {
                f22491h.remove(str);
            }
        }
        f22500q.post(new g(v6, dVar));
    }

    private void F(j jVar, k.d dVar) {
        String str = (String) jVar.a("cmd");
        HashMap hashMap = new HashMap();
        if ("get".equals(str)) {
            int i7 = f22494k;
            if (i7 > 0) {
                hashMap.put("logLevel", Integer.valueOf(i7));
            }
            Map<Integer, u4.a> map = f22501r;
            if (!map.isEmpty()) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry<Integer, u4.a> entry : map.entrySet()) {
                    u4.a value = entry.getValue();
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("path", value.f22485b);
                    hashMap3.put("singleInstance", Boolean.valueOf(value.f22484a));
                    int i8 = value.f22487d;
                    if (i8 > 0) {
                        hashMap3.put("logLevel", Integer.valueOf(i8));
                    }
                    hashMap2.put(entry.getKey().toString(), hashMap3);
                }
                hashMap.put("databases", hashMap2);
            }
        }
        dVar.a(hashMap);
    }

    private void G(j jVar, k.d dVar) {
        v4.a.f22827a = Boolean.TRUE.equals(jVar.b());
        v4.a.f22829c = v4.a.f22828b && v4.a.f22827a;
        if (!v4.a.f22827a) {
            f22494k = 0;
        } else if (v4.a.f22829c) {
            f22494k = 2;
        } else if (v4.a.f22827a) {
            f22494k = 1;
        }
        dVar.a(null);
    }

    private void H(j jVar, k.d dVar) {
        u4.a aVar;
        Map<Integer, u4.a> map;
        String str = (String) jVar.a("path");
        synchronized (f22495l) {
            if (u4.b.c(f22494k)) {
                Log.d("Sqflite", "Look for " + str + " in " + f22491h.keySet());
            }
            Map<String, Integer> map2 = f22491h;
            Integer num = map2.get(str);
            if (num == null || (aVar = (map = f22501r).get(num)) == null || !aVar.f22488e.isOpen()) {
                aVar = null;
            } else {
                if (u4.b.c(f22494k)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(aVar.d());
                    sb.append("found single instance ");
                    sb.append(aVar.f22489f ? "(in transaction) " : "");
                    sb.append(num);
                    sb.append(" ");
                    sb.append(str);
                    Log.d("Sqflite", sb.toString());
                }
                map.remove(num);
                map2.remove(str);
            }
        }
        h hVar = new h(aVar, str, dVar);
        Handler handler = f22500q;
        if (handler != null) {
            handler.post(hVar);
        } else {
            hVar.run();
        }
    }

    private void I(j jVar, k.d dVar) {
        u4.a v6 = v(jVar, dVar);
        if (v6 == null) {
            return;
        }
        f22500q.post(new d(v6, jVar, dVar));
    }

    private void K(j jVar, k.d dVar) {
        u4.a v6 = v(jVar, dVar);
        if (v6 == null) {
            return;
        }
        f22500q.post(new RunnableC0143c(jVar, dVar, v6));
    }

    private void L(j jVar, k.d dVar) {
        int i7;
        u4.a aVar;
        String str = (String) jVar.a("path");
        Boolean bool = (Boolean) jVar.a("readOnly");
        boolean z6 = z(str);
        boolean z7 = (Boolean.FALSE.equals(jVar.a("singleInstance")) || z6) ? false : true;
        if (z7) {
            synchronized (f22495l) {
                if (u4.b.c(f22494k)) {
                    Log.d("Sqflite", "Look for " + str + " in " + f22491h.keySet());
                }
                Integer num = f22491h.get(str);
                if (num != null && (aVar = f22501r.get(num)) != null) {
                    if (aVar.f22488e.isOpen()) {
                        if (u4.b.c(f22494k)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(aVar.d());
                            sb.append("re-opened single instance ");
                            sb.append(aVar.f22489f ? "(in transaction) " : "");
                            sb.append(num);
                            sb.append(" ");
                            sb.append(str);
                            Log.d("Sqflite", sb.toString());
                        }
                        dVar.a(A(num.intValue(), true, aVar.f22489f));
                        return;
                    }
                    if (u4.b.c(f22494k)) {
                        Log.d("Sqflite", aVar.d() + "single instance database of " + str + " not opened");
                    }
                }
            }
        }
        Object obj = f22495l;
        synchronized (obj) {
            i7 = f22498o + 1;
            f22498o = i7;
        }
        u4.a aVar2 = new u4.a(str, i7, z7, f22494k);
        synchronized (obj) {
            if (f22500q == null) {
                HandlerThread handlerThread = new HandlerThread("Sqflite", f22493j);
                f22499p = handlerThread;
                handlerThread.start();
                f22500q = new Handler(f22499p.getLooper());
                if (u4.b.b(aVar2.f22487d)) {
                    Log.d("Sqflite", aVar2.d() + "starting thread" + f22499p + " priority " + f22493j);
                }
            }
            if (u4.b.b(aVar2.f22487d)) {
                Log.d("Sqflite", aVar2.d() + "opened " + i7 + " " + str);
            }
            f22500q.post(new f(z6, str, dVar, bool, aVar2, jVar, z7, i7));
        }
    }

    private void N(j jVar, k.d dVar) {
        u4.a v6 = v(jVar, dVar);
        if (v6 == null) {
            return;
        }
        f22500q.post(new a(jVar, dVar, v6));
    }

    private void O(j jVar, k.d dVar) {
        u4.a v6 = v(jVar, dVar);
        if (v6 == null) {
            return;
        }
        f22500q.post(new e(jVar, dVar, v6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean P(u4.a aVar, w4.f fVar) {
        u4.d d7 = fVar.d();
        ArrayList arrayList = new ArrayList();
        if (u4.b.b(aVar.f22487d)) {
            Log.d("Sqflite", aVar.d() + d7);
        }
        boolean z6 = f22492i;
        Cursor cursor = null;
        Object obj = null;
        cursor = null;
        try {
            try {
                u4.d i7 = d7.i();
                Cursor rawQuery = aVar.c().rawQuery(i7.e(), i7.b());
                ArrayList arrayList2 = null;
                int i8 = 0;
                while (rawQuery.moveToNext()) {
                    try {
                        if (z6) {
                            Map<String, Object> o7 = o(rawQuery);
                            if (u4.b.b(aVar.f22487d)) {
                                Log.d("Sqflite", aVar.d() + Q(o7));
                            }
                            arrayList.add(o7);
                        } else {
                            if (obj == null) {
                                ArrayList arrayList3 = new ArrayList();
                                HashMap hashMap = new HashMap();
                                i8 = rawQuery.getColumnCount();
                                hashMap.put("columns", Arrays.asList(rawQuery.getColumnNames()));
                                hashMap.put("rows", arrayList3);
                                arrayList2 = arrayList3;
                                obj = hashMap;
                            }
                            arrayList2.add(n(rawQuery, i8));
                        }
                    } catch (Exception e7) {
                        e = e7;
                        cursor = rawQuery;
                        x(e, fVar, aVar);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        cursor = rawQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (z6) {
                    fVar.a(arrayList);
                } else {
                    if (obj == null) {
                        obj = new HashMap();
                    }
                    fVar.a(obj);
                }
                rawQuery.close();
                return true;
            } catch (Exception e8) {
                e = e8;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static String Q(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof byte[])) {
            return obj instanceof Map ? t((Map) obj).toString() : obj.toString();
        }
        ArrayList arrayList = new ArrayList();
        for (byte b7 : (byte[]) obj) {
            arrayList.add(Integer.valueOf(b7));
        }
        return arrayList.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean R(u4.a aVar, w4.f fVar) {
        if (!s(aVar, fVar)) {
            return false;
        }
        Cursor cursor = null;
        if (fVar.e()) {
            fVar.a(null);
            return true;
        }
        try {
            try {
                Cursor rawQuery = aVar.f().rawQuery("SELECT changes()", null);
                if (rawQuery != null) {
                    try {
                        if (rawQuery.getCount() > 0 && rawQuery.moveToFirst()) {
                            int i7 = rawQuery.getInt(0);
                            if (u4.b.b(aVar.f22487d)) {
                                Log.d("Sqflite", aVar.d() + "changed " + i7);
                            }
                            fVar.a(Integer.valueOf(i7));
                            rawQuery.close();
                            return true;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        cursor = rawQuery;
                        x(e, fVar, aVar);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        cursor = rawQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                Log.e("Sqflite", aVar.d() + "fail to read changes for Update/Delete");
                fVar.a(null);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return true;
            } catch (Exception e8) {
                e = e8;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(u4.a aVar) {
        try {
            if (u4.b.b(aVar.f22487d)) {
                Log.d("Sqflite", aVar.d() + "closing database " + f22499p);
            }
            aVar.a();
        } catch (Exception e7) {
            Log.e("Sqflite", "error " + e7 + " while closing database " + f22498o);
        }
        synchronized (f22495l) {
            if (f22501r.isEmpty() && f22500q != null) {
                if (u4.b.b(aVar.f22487d)) {
                    Log.d("Sqflite", aVar.d() + "stopping thread" + f22499p);
                }
                f22499p.quit();
                f22499p = null;
                f22500q = null;
            }
        }
    }

    private static List<Object> n(Cursor cursor, int i7) {
        ArrayList arrayList = new ArrayList(i7);
        for (int i8 = 0; i8 < i7; i8++) {
            Object p7 = p(cursor, i8);
            if (v4.a.f22829c) {
                String name = p7 != null ? p7.getClass().isArray() ? "array(" + p7.getClass().getComponentType().getName() + ")" : p7.getClass().getName() : null;
                StringBuilder sb = new StringBuilder();
                sb.append("column ");
                sb.append(i8);
                sb.append(" ");
                sb.append(cursor.getType(i8));
                sb.append(": ");
                sb.append(p7);
                sb.append(name == null ? "" : " (" + name + ")");
                Log.d("Sqflite", sb.toString());
            }
            arrayList.add(p7);
        }
        return arrayList;
    }

    private static Map<String, Object> o(Cursor cursor) {
        String str;
        Object obj;
        HashMap hashMap = new HashMap();
        String[] columnNames = cursor.getColumnNames();
        int length = columnNames.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (v4.a.f22829c) {
                Log.d("Sqflite", "column " + i7 + " " + cursor.getType(i7));
            }
            int type = cursor.getType(i7);
            if (type == 0) {
                str = columnNames[i7];
                obj = null;
            } else if (type == 1) {
                str = columnNames[i7];
                obj = Long.valueOf(cursor.getLong(i7));
            } else if (type == 2) {
                str = columnNames[i7];
                obj = Double.valueOf(cursor.getDouble(i7));
            } else if (type != 3) {
                if (type == 4) {
                    hashMap.put(columnNames[i7], cursor.getBlob(i7));
                }
            } else {
                str = columnNames[i7];
                obj = cursor.getString(i7);
            }
            hashMap.put(str, obj);
        }
        return hashMap;
    }

    private static Object p(Cursor cursor, int i7) {
        int type = cursor.getType(i7);
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i7));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i7));
        }
        if (type == 3) {
            return cursor.getString(i7);
        }
        if (type != 4) {
            return null;
        }
        return cursor.getBlob(i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q(u4.a aVar, w4.f fVar) {
        if (!s(aVar, fVar)) {
            return false;
        }
        fVar.a(null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public u4.a r(u4.a aVar, j jVar, k.d dVar) {
        if (s(aVar, new w4.d(dVar, w(jVar), (Boolean) jVar.a("inTransaction")))) {
            return aVar;
        }
        return null;
    }

    private boolean s(u4.a aVar, w4.f fVar) {
        u4.d d7 = fVar.d();
        if (u4.b.b(aVar.f22487d)) {
            Log.d("Sqflite", aVar.d() + d7);
        }
        Boolean f7 = fVar.f();
        try {
            try {
                aVar.f().execSQL(d7.e(), d7.f());
                if (Boolean.TRUE.equals(f7)) {
                    aVar.f22489f = true;
                }
                if (Boolean.FALSE.equals(f7)) {
                    aVar.f22489f = false;
                }
                return true;
            } catch (Exception e7) {
                x(e7, fVar, aVar);
                if (Boolean.FALSE.equals(f7)) {
                    aVar.f22489f = false;
                }
                return false;
            }
        } catch (Throwable th) {
            if (Boolean.FALSE.equals(f7)) {
                aVar.f22489f = false;
            }
            throw th;
        }
    }

    private static Map<String, Object> t(Map<Object, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            hashMap.put(Q(entry.getKey()), value instanceof Map ? t((Map) value) : Q(value));
        }
        return hashMap;
    }

    private u4.a u(int i7) {
        return f22501r.get(Integer.valueOf(i7));
    }

    private u4.a v(j jVar, k.d dVar) {
        int intValue = ((Integer) jVar.a("id")).intValue();
        u4.a u6 = u(intValue);
        if (u6 != null) {
            return u6;
        }
        dVar.b("sqlite_error", "database_closed " + intValue, null);
        return null;
    }

    private u4.d w(j jVar) {
        return new u4.d((String) jVar.a("sql"), (List) jVar.a("arguments"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(Exception exc, w4.f fVar, u4.a aVar) {
        String message;
        Map<String, Object> a7;
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            message = "open_failed " + aVar.f22485b;
            a7 = null;
        } else {
            boolean z6 = exc instanceof SQLException;
            message = exc.getMessage();
            a7 = w4.h.a(fVar);
        }
        fVar.b("sqlite_error", message, a7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean y(u4.a aVar, w4.f fVar) {
        Exception e7;
        Cursor cursor;
        if (!s(aVar, fVar)) {
            return false;
        }
        SQLiteCursor sQLiteCursor = 0;
        if (fVar.e()) {
            fVar.a(null);
            return true;
        }
        try {
            try {
                cursor = aVar.f().rawQuery("SELECT changes(), last_insert_rowid()", null);
                if (cursor != null) {
                    try {
                        if (cursor.getCount() > 0 && cursor.moveToFirst()) {
                            if (cursor.getInt(0) == 0) {
                                if (u4.b.b(aVar.f22487d)) {
                                    Log.d("Sqflite", aVar.d() + "no changes (id was " + cursor.getLong(1) + ")");
                                }
                                fVar.a(null);
                                cursor.close();
                                return true;
                            }
                            long j7 = cursor.getLong(1);
                            if (u4.b.b(aVar.f22487d)) {
                                Log.d("Sqflite", aVar.d() + "inserted " + j7);
                            }
                            fVar.a(Long.valueOf(j7));
                            cursor.close();
                            return true;
                        }
                    } catch (Exception e8) {
                        e7 = e8;
                        x(e7, fVar, aVar);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    }
                }
                Log.e("Sqflite", aVar.d() + "fail to read changes for Insert");
                fVar.a(null);
                if (cursor != null) {
                    cursor.close();
                }
                return true;
            } catch (Throwable th) {
                th = th;
                sQLiteCursor = "SELECT changes(), last_insert_rowid()";
                if (sQLiteCursor != 0) {
                    sQLiteCursor.close();
                }
                throw th;
            }
        } catch (Exception e9) {
            e7 = e9;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (sQLiteCursor != 0) {
            }
            throw th;
        }
    }

    static boolean z(String str) {
        return str == null || str.equals(":memory:");
    }

    @Override // m5.k.c
    public void C(j jVar, k.d dVar) {
        String str = jVar.f19247a;
        str.hashCode();
        switch (str) {
            case "execute":
                I(jVar, dVar);
                break;
            case "closeDatabase":
                E(jVar, dVar);
                break;
            case "options":
                M(jVar, dVar);
                break;
            case "insert":
                K(jVar, dVar);
                break;
            case "update":
                O(jVar, dVar);
                break;
            case "deleteDatabase":
                H(jVar, dVar);
                break;
            case "debugMode":
                G(jVar, dVar);
                break;
            case "openDatabase":
                L(jVar, dVar);
                break;
            case "batch":
                D(jVar, dVar);
                break;
            case "debug":
                F(jVar, dVar);
                break;
            case "query":
                N(jVar, dVar);
                break;
            case "getPlatformVersion":
                dVar.a("Android " + Build.VERSION.RELEASE);
                break;
            case "getDatabasesPath":
                J(jVar, dVar);
                break;
            default:
                dVar.c();
                break;
        }
    }

    void J(j jVar, k.d dVar) {
        if (f22497n == null) {
            f22497n = this.f22502f.getDatabasePath("tekartik_sqflite.db").getParent();
        }
        dVar.a(f22497n);
    }

    void M(j jVar, k.d dVar) {
        Object a7 = jVar.a("queryAsMapList");
        if (a7 != null) {
            f22492i = Boolean.TRUE.equals(a7);
        }
        Object a8 = jVar.a("androidThreadPriority");
        if (a8 != null) {
            f22493j = ((Integer) a8).intValue();
        }
        Integer a9 = u4.b.a(jVar);
        if (a9 != null) {
            f22494k = a9.intValue();
        }
        dVar.a(null);
    }

    @Override // e5.a
    public void f(a.b bVar) {
        B(bVar.a(), bVar.b());
    }

    @Override // e5.a
    public void i(a.b bVar) {
        this.f22502f = null;
        this.f22503g.e(null);
        this.f22503g = null;
    }
}
