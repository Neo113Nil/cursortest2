package com.baidu.mapsdkplatform.comapi.util;

import android.content.Context;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.android.exoplayer2.C;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final ExecutorService f8249a = Executors.newSingleThreadExecutor();

    /* renamed from: b, reason: collision with root package name */
    private static int f8250b = -1;

    /* renamed from: c, reason: collision with root package name */
    private static int f8251c = -1;

    /* renamed from: d, reason: collision with root package name */
    private final List<com.baidu.mapsdkplatform.comapi.util.c> f8252d;

    /* renamed from: e, reason: collision with root package name */
    private int f8253e;

    /* renamed from: f, reason: collision with root package name */
    private int f8254f;

    /* renamed from: g, reason: collision with root package name */
    private Context f8255g;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8256a;

        a(String str) {
            this.f8256a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            int unused = d.f8250b = d.this.f8255g.getSharedPreferences("ad_auth", 0).getInt(this.f8256a, 0);
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8258a;

        b(String str) {
            this.f8258a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            int unused = d.f8251c = d.this.f8255g.getSharedPreferences("ad_auth", 0).getInt(this.f8258a, 0);
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8260a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8261b;

        c(String str, int i8) {
            this.f8260a = str;
            this.f8261b = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f8255g.getSharedPreferences("ad_auth", 0).edit().putInt(this.f8260a, this.f8261b).apply();
        }
    }

    /* renamed from: com.baidu.mapsdkplatform.comapi.util.d$d, reason: collision with other inner class name */
    class RunnableC0081d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8263a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8264b;

        RunnableC0081d(String str, int i8) {
            this.f8263a = str;
            this.f8264b = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f8255g.getSharedPreferences("ad_auth", 0).edit().putInt(this.f8263a, this.f8264b).apply();
        }
    }

    private static class e {

        /* renamed from: a, reason: collision with root package name */
        private static final d f8266a = new d(null);
    }

    /* synthetic */ d(a aVar) {
        this();
    }

    private void k() {
        synchronized (this.f8252d) {
            for (int i8 = 0; i8 < this.f8252d.size(); i8++) {
                try {
                    this.f8252d.get(i8).onAdvPermissionUpdate(this.f8253e);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public int a() {
        return this.f8253e;
    }

    public boolean c() {
        int i8 = this.f8253e;
        return i8 >= 0 && (i8 & 33554432) == 33554432;
    }

    public boolean d() {
        int i8 = this.f8253e;
        return i8 >= 0 && (i8 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) == 67108864;
    }

    public boolean e() {
        int i8 = this.f8253e;
        return i8 >= 0 && (i8 & C.BUFFER_FLAG_FIRST_SAMPLE) == 134217728;
    }

    public boolean f() {
        int i8 = this.f8253e;
        return i8 >= 0 && (i8 & 65536) == 65536;
    }

    public boolean g() {
        int i8 = this.f8253e;
        return i8 >= 0 && (i8 & 1073741824) == 1073741824;
    }

    public boolean h() {
        int i8 = this.f8253e;
        return i8 >= 0 && (i8 & 1) == 1;
    }

    public boolean i() {
        int i8 = this.f8254f;
        return i8 >= 0 && (i8 & 268435456) == 268435456;
    }

    public boolean j() {
        int i8 = this.f8253e;
        return i8 >= 0 && (i8 & 1024) == 1024;
    }

    private d() {
        this.f8252d = new CopyOnWriteArrayList();
        this.f8253e = -1;
    }

    public static d b() {
        return e.f8266a;
    }

    public void c(int i8) {
        if (i8 == -1 && (i8 = a("ad_key")) == -101) {
            return;
        }
        this.f8253e = i8;
        a("ad_key", i8);
        k();
    }

    public void d(int i8) {
        if (i8 == -1 && (i8 = b("ad_key_user")) == -101) {
            return;
        }
        this.f8254f = i8;
        b("ad_key_user", i8);
    }

    public void a(Context context) {
        this.f8255g = context;
    }

    public void b(com.baidu.mapsdkplatform.comapi.util.c cVar) {
        synchronized (this.f8252d) {
            this.f8252d.remove(cVar);
        }
    }

    public void a(com.baidu.mapsdkplatform.comapi.util.c cVar) {
        synchronized (this.f8252d) {
            try {
                if (!this.f8252d.contains(cVar)) {
                    this.f8252d.add(cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private int b(String str) {
        if (this.f8255g == null) {
            return -101;
        }
        if (f8251c == -1) {
            f8249a.execute(new b(str));
        }
        return f8251c;
    }

    private void b(String str, int i8) {
        if (this.f8255g == null) {
            return;
        }
        f8251c = i8;
        f8249a.execute(new RunnableC0081d(str, i8));
    }

    private int a(String str) {
        if (this.f8255g == null) {
            return -101;
        }
        if (f8250b == -1) {
            f8249a.execute(new a(str));
        }
        return f8250b;
    }

    private void a(String str, int i8) {
        if (this.f8255g == null) {
            return;
        }
        f8250b = i8;
        f8249a.execute(new c(str, i8));
    }
}
