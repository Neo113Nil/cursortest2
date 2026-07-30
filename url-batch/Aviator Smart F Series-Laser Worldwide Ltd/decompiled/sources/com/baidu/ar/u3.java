package com.baidu.ar;

import android.content.Context;
import android.util.Pair;
import com.baidu.ar.z9;
import com.google.android.exoplayer2.upstream.CmcdConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public class u3 implements z9.a {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<Context> f3376a;

    /* renamed from: c, reason: collision with root package name */
    public x3 f3378c;

    /* renamed from: d, reason: collision with root package name */
    public String f3379d;

    /* renamed from: e, reason: collision with root package name */
    public String f3380e;

    /* renamed from: f, reason: collision with root package name */
    public String[][] f3381f;

    /* renamed from: g, reason: collision with root package name */
    public Map<String, String> f3382g;

    /* renamed from: j, reason: collision with root package name */
    public z9 f3385j;

    /* renamed from: b, reason: collision with root package name */
    public Map<String, t3> f3377b = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public long f3383h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f3384i = 0;

    public u3(Context context, x3 x3Var, String[][] strArr, Map<String, String> map, z9 z9Var) {
        this.f3376a = new WeakReference<>(context);
        this.f3378c = x3Var;
        this.f3381f = strArr;
        this.f3382g = map == null ? new HashMap<>() : map;
        this.f3385j = z9Var;
        z9Var.a(this);
    }

    public final Pair<Long, Long> a(long j8, long j9) {
        long j10;
        long j11;
        long j12 = this.f3383h;
        if (j12 <= 0 || j8 > j12) {
            j10 = j9 - j8;
            j11 = 0;
        } else {
            long j13 = this.f3384i;
            if (j13 <= 0 || j9 < j13) {
                j10 = j12 - j8;
                j11 = j9 - j12;
            } else {
                j10 = (j12 - j8) + (j13 - j9);
                j11 = j13 - j12;
            }
        }
        if (j10 < 0) {
            j10 = 0;
        }
        return new Pair<>(Long.valueOf(j10), Long.valueOf(j11 >= 0 ? j11 : 0L));
    }

    public final String b() {
        if (this.f3379d == null) {
            Context context = this.f3376a.get();
            if (context == null) {
                return "";
            }
            UUID a8 = new h3(context).a();
            this.f3379d = a8 != null ? a8.toString() : "";
        }
        return this.f3379d;
    }

    public void c() {
        if (this.f3376a.get() == null) {
            return;
        }
        this.f3380e = k8.a(b() + String.valueOf(System.currentTimeMillis()));
    }

    public final void d(long j8) {
        long j9 = this.f3383h;
        if (j8 < j9) {
            j8 = j9;
        }
        this.f3384i = j8;
    }

    public void e(t3 t3Var) {
        String b8 = t3Var.b();
        t3 t3Var2 = this.f3377b.get(b8);
        boolean equals = "1".equals(t3Var.c("__stt"));
        if (t3Var2 == null) {
            if (equals) {
                this.f3377b.put(b8, t3Var);
                t3 clone = t3Var.clone();
                clone.h(b8);
                clone.g("__stt");
                clone.g("__falseev");
                a(clone);
                return;
            }
            return;
        }
        if (equals) {
            return;
        }
        String e8 = t3Var.e("__falseev");
        if (e8 != null && !e8.isEmpty()) {
            t3 clone2 = t3Var.clone();
            clone2.h(e8);
            clone2.g("__stt");
            clone2.g("__falseev");
            a(clone2);
        }
        this.f3377b.remove(b8);
        t3.a(t3Var2);
    }

    public void f(t3 t3Var) {
        boolean b8;
        h(t3Var);
        synchronized (this.f3385j) {
            b8 = this.f3385j.b(t3Var);
        }
        if (b8) {
            return;
        }
        t3.a(t3Var);
    }

    public final void g(t3 t3Var) {
        h(t3Var);
        if (t3Var.a("event_label") || !this.f3382g.containsKey(t3Var.b())) {
            return;
        }
        t3Var.a("event_label", this.f3382g.get(t3Var.b()));
    }

    public final void h(t3 t3Var) {
        t3Var.a("request_id", this.f3380e);
    }

    public final ArrayList<String> a(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        String[][] strArr = this.f3381f;
        if (strArr != null && strArr.length > 0) {
            for (String[] strArr2 : strArr) {
                if (strArr2 != null && strArr2.length >= 2 && str.equals(strArr2[0])) {
                    for (int i8 = 1; i8 < strArr2.length; i8++) {
                        arrayList.add(strArr2[i8]);
                    }
                }
            }
        }
        return arrayList;
    }

    public final String b(String str) {
        String[][] strArr = this.f3381f;
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        for (String[] strArr2 : strArr) {
            if (strArr2 != null && strArr2.length >= 2) {
                for (int i8 = 1; i8 < strArr2.length; i8++) {
                    if (str.equals(strArr2[i8])) {
                        return strArr2[0];
                    }
                }
            }
        }
        return null;
    }

    public final void c(long j8) {
        this.f3383h = j8;
    }

    public void d(t3 t3Var) {
        String b8 = t3Var.b();
        ArrayList<String> a8 = a(b8);
        if (a8.isEmpty()) {
            return;
        }
        a(t3Var.clone());
        Iterator<String> it = a8.iterator();
        while (it.hasNext()) {
            String next = it.next();
            this.f3377b.put(b8 + ":" + next, t3Var);
        }
    }

    public void a() {
        this.f3385j.a();
    }

    public void b(long j8) {
        d(j8);
    }

    public void c(t3 t3Var) {
        String b8 = t3Var.b();
        String b9 = b(b8);
        if (b9 == null || b9.isEmpty()) {
            return;
        }
        String str = b9 + ":" + b8;
        t3 t3Var2 = this.f3377b.get(str);
        if (t3Var2 != null) {
            Pair<Long, Long> a8 = a(t3Var2.c(), t3Var.c());
            t3Var.a(CmcdConfiguration.KEY_STREAM_TYPE, String.valueOf(t3Var2.c()));
            t3Var.a("duration", String.valueOf(((Long) a8.first).longValue()));
            t3Var.a("_pausedt", String.valueOf(((Long) a8.second).longValue()));
            a(t3Var);
            this.f3377b.remove(str);
            t3.a(t3Var2);
        }
    }

    @Override // com.baidu.ar.z9.a
    public void a(int i8) {
        if (i8 > 0) {
            synchronized (this.f3378c) {
                this.f3378c.notifyAll();
            }
        }
    }

    public void b(t3 t3Var) {
        g(t3Var);
        synchronized (this.f3378c) {
            try {
                this.f3378c.a();
                String b8 = t3Var.b();
                long longValue = ((Number) t3Var.c("_db_period")).longValue();
                ArrayList arrayList = new ArrayList();
                int size = this.f3378c.size();
                for (int i8 = 0; i8 < size; i8++) {
                    t3 t3Var2 = this.f3378c.get(i8);
                    if (b8.equals(t3Var2.b()) && longValue == t3Var2.d("_db_period") && t3Var.c() - t3Var2.c() < longValue) {
                        arrayList.add(Integer.valueOf(i8));
                    }
                }
                if (!arrayList.isEmpty()) {
                    for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        int intValue = ((Integer) arrayList.get(size2)).intValue();
                        t3 t3Var3 = this.f3378c.get(intValue);
                        this.f3378c.remove(intValue);
                        t3.a(t3Var3);
                    }
                }
                this.f3378c.a(t3Var);
                this.f3378c.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(long j8) {
        c(j8);
        synchronized (this.f3378c) {
            this.f3378c.b();
        }
        a();
    }

    public void a(t3 t3Var) {
        g(t3Var);
        a(t3Var);
    }

    public void a(List<String> list) {
        this.f3385j.a(list);
    }

    public final void a(t3... t3VarArr) {
        synchronized (this.f3378c) {
            try {
                this.f3378c.a();
                for (t3 t3Var : t3VarArr) {
                    this.f3378c.a(t3Var);
                }
                this.f3378c.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
