package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import com.yandex.mobile.ads.impl.nn2;
import com.yandex.mobile.ads.impl.rn2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class v62 implements nn2.a {

    /* renamed from: h, reason: collision with root package name */
    private static v62 f33525h = new v62();

    /* renamed from: i, reason: collision with root package name */
    private static Handler f33526i = new Handler(Looper.getMainLooper());

    /* renamed from: j, reason: collision with root package name */
    private static Handler f33527j = null;

    /* renamed from: k, reason: collision with root package name */
    private static final Runnable f33528k = new b();

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f33529l = new c();

    /* renamed from: b, reason: collision with root package name */
    private int f33531b;

    /* renamed from: g, reason: collision with root package name */
    private long f33536g;

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f33530a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f33532c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private rn2 f33534e = new rn2();

    /* renamed from: d, reason: collision with root package name */
    private xn2 f33533d = new xn2();

    /* renamed from: f, reason: collision with root package name */
    private ao2 f33535f = new ao2(new fo2());

    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            v62.this.f33535f.a();
        }
    }

    static class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            v62.b(v62.g());
        }
    }

    static class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (v62.f33527j != null) {
                v62.f33527j.post(v62.f33528k);
                v62.f33527j.postDelayed(v62.f33529l, 200L);
            }
        }
    }

    public interface d extends e {
        void a();
    }

    public interface e {
        void b();
    }

    v62() {
    }

    public static void c() {
        Handler handler = f33527j;
        if (handler != null) {
            handler.removeCallbacks(f33529l);
            f33527j = null;
        }
    }

    public static v62 g() {
        return f33525h;
    }

    public final void b() {
        c();
        this.f33530a.clear();
        f33526i.post(new a());
    }

    public static void a() {
        if (f33527j == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f33527j = handler;
            handler.post(f33528k);
            f33527j.postDelayed(f33529l, 200L);
        }
    }

    static void b(v62 v62Var) {
        v62 v62Var2;
        int i4 = 0;
        v62Var.f33531b = 0;
        v62Var.f33532c.clear();
        Iterator<ln2> it = mn2.a().c().iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
        v62Var.f33536g = System.nanoTime();
        v62Var.f33534e.c();
        long nanoTime = System.nanoTime();
        eo2 a4 = v62Var.f33533d.a();
        if (v62Var.f33534e.b().size() > 0) {
            Iterator<String> it2 = v62Var.f33534e.b().iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                JSONObject a5 = a4.a(null);
                View b4 = v62Var.f33534e.b(next);
                io2 b5 = v62Var.f33533d.b();
                String a6 = v62Var.f33534e.a(next);
                if (a6 != null) {
                    JSONObject a7 = b5.a(b4);
                    try {
                        a7.put("adSessionId", next);
                    } catch (JSONException e4) {
                        Log.e("OMIDLIB", "Error with setting ad session id", e4);
                    }
                    try {
                        a7.put("notVisibleReason", a6);
                    } catch (JSONException e5) {
                        Log.e("OMIDLIB", "Error with setting not visible reason", e5);
                    }
                    yn2.a(a5, a7);
                }
                yn2.a(a5);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                v62Var.f33535f.b(a5, hashSet, nanoTime);
            }
        }
        if (v62Var.f33534e.a().size() > 0) {
            JSONObject a8 = a4.a(null);
            v62Var2 = v62Var;
            a4.a(null, a8, v62Var2, true, false);
            yn2.a(a8);
            v62Var2.f33535f.a(a8, v62Var2.f33534e.a(), nanoTime);
        } else {
            v62Var2 = v62Var;
            v62Var2.f33535f.a();
        }
        v62Var2.f33534e.d();
        long nanoTime2 = System.nanoTime() - v62Var2.f33536g;
        if (v62Var2.f33530a.size() > 0) {
            ArrayList arrayList = v62Var2.f33530a;
            int size = arrayList.size();
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                e eVar = (e) obj;
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                eVar.b();
                if (eVar instanceof d) {
                    ((d) eVar).a();
                }
            }
        }
    }

    public final void a(View view, nn2 nn2Var, JSONObject jSONObject, boolean z4) {
        int c4;
        v62 v62Var;
        boolean z5;
        boolean z6;
        nn2 nn2Var2;
        View view2;
        if (qo2.c(view) != null || (c4 = this.f33534e.c(view)) == 3) {
            return;
        }
        JSONObject a4 = nn2Var.a(view);
        yn2.a(jSONObject, a4);
        String a5 = this.f33534e.a(view);
        if (a5 != null) {
            try {
                a4.put("adSessionId", a5);
            } catch (JSONException e4) {
                Log.e("OMIDLIB", "Error with setting ad session id", e4);
            }
            try {
                a4.put("hasWindowFocus", Boolean.valueOf(this.f33534e.d(view)));
            } catch (JSONException e5) {
                Log.e("OMIDLIB", "Error with setting not visible reason", e5);
            }
            this.f33534e.e();
            v62Var = this;
        } else {
            rn2.a b4 = this.f33534e.b(view);
            if (b4 != null) {
                do2 a6 = b4.a();
                JSONArray jSONArray = new JSONArray();
                ArrayList<String> b5 = b4.b();
                int size = b5.size();
                int i4 = 0;
                while (i4 < size) {
                    String str = b5.get(i4);
                    i4++;
                    jSONArray.put(str);
                }
                try {
                    a4.put("isFriendlyObstructionFor", jSONArray);
                    a4.put("friendlyObstructionClass", a6.b());
                    a4.put("friendlyObstructionPurpose", a6.c());
                    a4.put("friendlyObstructionReason", a6.d());
                } catch (JSONException e6) {
                    Log.e("OMIDLIB", "Error with setting friendly obstruction", e6);
                }
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z7 = z4 || z5;
            if (c4 == 1) {
                z6 = true;
                v62Var = this;
                view2 = view;
                nn2Var2 = nn2Var;
            } else {
                z6 = false;
                v62Var = this;
                nn2Var2 = nn2Var;
                view2 = view;
            }
            nn2Var2.a(view2, a4, v62Var, z6, z7);
        }
        v62Var.f33531b++;
    }
}
