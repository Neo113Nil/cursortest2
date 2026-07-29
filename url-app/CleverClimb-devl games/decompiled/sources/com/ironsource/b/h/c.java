package com.ironsource.b.h;

import android.content.Context;
import com.ironsource.b.d.c;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: DailyCappingManager.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    private String f6934d;
    private Context e;
    private b g;
    private Timer f = null;

    /* renamed from: a, reason: collision with root package name */
    private Map<String, Integer> f6931a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Integer> f6932b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f6933c = new HashMap();
    private com.ironsource.b.d.d h = com.ironsource.b.d.d.c();

    public c(String str, b bVar) {
        this.f6934d = str;
        this.g = bVar;
        b();
    }

    public void a(Context context) {
        this.e = context;
    }

    public void a(com.ironsource.b.c cVar) {
        synchronized (this) {
            try {
                if (cVar.r() != 99) {
                    this.f6931a.put(e(cVar), Integer.valueOf(cVar.r()));
                }
            } catch (Exception e) {
                this.h.a(c.a.INTERNAL, "addSmash", e);
            }
        }
    }

    public void b(com.ironsource.b.c cVar) {
        String e;
        synchronized (this) {
            try {
                e = e(cVar);
            } catch (Exception e2) {
                this.h.a(c.a.INTERNAL, "increaseShowCounter", e2);
            }
            if (this.f6931a.containsKey(e)) {
                a(e, a(e) + 1);
            }
        }
    }

    public boolean c(com.ironsource.b.c cVar) {
        synchronized (this) {
            try {
                try {
                    String e = e(cVar);
                    if (!this.f6931a.containsKey(e)) {
                        return false;
                    }
                    if (d().equalsIgnoreCase(b(e))) {
                        return false;
                    }
                    return this.f6931a.get(e).intValue() <= c(e);
                } catch (Exception e2) {
                    this.h.a(c.a.INTERNAL, "shouldSendCapReleasedEvent", e2);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean d(com.ironsource.b.c cVar) {
        synchronized (this) {
            try {
                try {
                    String e = e(cVar);
                    if (this.f6931a.containsKey(e)) {
                        return this.f6931a.get(e).intValue() <= a(e);
                    }
                    return false;
                } catch (Exception e2) {
                    this.h.a(c.a.INTERNAL, "isCapped", e2);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        synchronized (this) {
            try {
                Iterator<String> it = this.f6931a.keySet().iterator();
                while (it.hasNext()) {
                    d(it.next());
                }
                this.g.f();
                b();
            } catch (Exception e) {
                this.h.a(c.a.INTERNAL, "onTimerTick", e);
            }
        }
    }

    private void b() {
        if (this.f != null) {
            this.f.cancel();
        }
        this.f = new Timer();
        this.f.schedule(new TimerTask() { // from class: com.ironsource.b.h.c.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                c.this.a();
            }
        }, c());
    }

    private Date c() {
        Random random = new Random();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"), Locale.US);
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, random.nextInt(10));
        gregorianCalendar.set(13, random.nextInt(60));
        gregorianCalendar.set(14, random.nextInt(1000));
        gregorianCalendar.add(5, 1);
        return gregorianCalendar.getTime();
    }

    private int a(String str) {
        if (!d().equalsIgnoreCase(b(str))) {
            d(str);
        }
        return c(str);
    }

    private String b(String str) {
        if (this.f6933c.containsKey(str)) {
            return this.f6933c.get(str);
        }
        String f = g.f(this.e, f(str), d());
        this.f6933c.put(str, f);
        return f;
    }

    private int c(String str) {
        if (this.f6932b.containsKey(str)) {
            return this.f6932b.get(str).intValue();
        }
        int b2 = g.b(this.e, e(str), 0);
        this.f6932b.put(str, Integer.valueOf(b2));
        return b2;
    }

    private void a(String str, int i) {
        this.f6932b.put(str, Integer.valueOf(i));
        this.f6933c.put(str, d());
        g.a(this.e, e(str), i);
        g.e(this.e, f(str), d());
    }

    private void d(String str) {
        this.f6932b.put(str, 0);
        this.f6933c.put(str, d());
        g.a(this.e, e(str), 0);
        g.e(this.e, f(str), d());
    }

    private String e(com.ironsource.b.c cVar) {
        return this.f6934d + "_" + cVar.o() + "_" + cVar.n();
    }

    private String e(String str) {
        return str + "_counter";
    }

    private String f(String str) {
        return str + "_day";
    }

    private String d() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date());
    }
}
