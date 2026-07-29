package com.facebook.ads.internal.m;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.ads.internal.p.a.n;
import com.facebook.ads.internal.p.a.p;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5189a = "b";

    /* renamed from: b, reason: collision with root package name */
    private static final String f5190b = com.facebook.ads.internal.o.d.b();

    /* renamed from: c, reason: collision with root package name */
    private final a f5191c;
    private final ConnectivityManager e;
    private final com.facebook.ads.internal.p.a.a f;
    private final long h;
    private final long i;
    private volatile boolean k;
    private int l;
    private long m;
    private final Runnable j = new Runnable() { // from class: com.facebook.ads.internal.m.b.1
        /* JADX WARN: Type inference failed for: r0v5, types: [com.facebook.ads.internal.m.b$1$1] */
        @Override // java.lang.Runnable
        public void run() {
            b.this.k = false;
            if (b.this.f5192d.getQueue().isEmpty()) {
                new AsyncTask<Void, Void, Void>() { // from class: com.facebook.ads.internal.m.b.1.1
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // android.os.AsyncTask
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public Void doInBackground(Void... voidArr) {
                        b.b(b.this);
                        if (b.this.m > 0) {
                            try {
                                Thread.sleep(b.this.m);
                            } catch (InterruptedException unused) {
                            }
                        }
                        b.this.d();
                        return null;
                    }
                }.executeOnExecutor(b.this.f5192d, new Void[0]);
            }
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private final ThreadPoolExecutor f5192d = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    private final Handler g = new Handler(Looper.getMainLooper());

    interface a {
        JSONObject a();

        boolean a(JSONArray jSONArray);

        void b();

        void b(JSONArray jSONArray);

        boolean c();
    }

    b(Context context, a aVar) {
        this.f5191c = aVar;
        this.e = (ConnectivityManager) context.getSystemService("connectivity");
        this.f = com.facebook.ads.internal.q.c.d.b(context);
        this.h = com.facebook.ads.internal.l.a.h(context);
        this.i = com.facebook.ads.internal.l.a.i(context);
    }

    private void a(long j) {
        this.g.postDelayed(this.j, j);
    }

    static /* synthetic */ int b(b bVar) {
        int i = bVar.l + 1;
        bVar.l = i;
        return i;
    }

    private void c() {
        if (this.l >= 5) {
            e();
            b();
        } else {
            this.m = this.l == 1 ? 2000L : this.m * 2;
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        a aVar;
        JSONArray jSONArray;
        try {
            NetworkInfo activeNetworkInfo = this.e.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
                JSONObject a2 = this.f5191c.a();
                if (a2 == null) {
                    e();
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("attempt", String.valueOf(this.l));
                a2.put("data", jSONObject);
                p pVar = new p();
                pVar.put("payload", a2.toString());
                n b2 = this.f.b(f5190b, pVar);
                String e = b2 != null ? b2.e() : null;
                if (TextUtils.isEmpty(e)) {
                    if (a2.has("events")) {
                        aVar = this.f5191c;
                        jSONArray = a2.getJSONArray("events");
                        aVar.b(jSONArray);
                    }
                    c();
                    return;
                }
                if (b2.a() != 200) {
                    if (a2.has("events")) {
                        aVar = this.f5191c;
                        jSONArray = a2.getJSONArray("events");
                        aVar.b(jSONArray);
                    }
                } else if (this.f5191c.a(new JSONArray(e)) && !this.f5191c.c()) {
                    e();
                    return;
                }
                c();
                return;
            }
            a(this.i);
        } catch (Exception unused) {
            c();
        }
    }

    private void e() {
        this.l = 0;
        this.m = 0L;
        if (this.f5192d.getQueue().size() == 0) {
            this.f5191c.b();
        }
    }

    void a() {
        this.k = true;
        this.g.removeCallbacks(this.j);
        a(this.h);
    }

    void b() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.g.removeCallbacks(this.j);
        a(this.i);
    }
}
