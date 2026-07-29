package com.tapjoy.internal;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.tapjoy.internal.di;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class dw implements di.a {
    private int e;
    private double i;

    /* renamed from: c, reason: collision with root package name */
    private static dw f7965c = new dw();

    /* renamed from: a, reason: collision with root package name */
    public static Handler f7964a = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    private static Handler f7966d = null;
    private static final Runnable j = new Runnable() { // from class: com.tapjoy.internal.dw.2
        @Override // java.lang.Runnable
        public final void run() {
            dw.b(dw.a());
        }
    };
    private static final Runnable k = new Runnable() { // from class: com.tapjoy.internal.dw.3
        @Override // java.lang.Runnable
        public final void run() {
            if (dw.f7966d != null) {
                dw.f7966d.post(dw.j);
                dw.f7966d.postDelayed(dw.k, 200L);
            }
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public List f7967b = new ArrayList();
    private dx g = new dx();
    private dj f = new dj();
    private ee h = new ee(new ea());

    dw() {
    }

    public static dw a() {
        return f7965c;
    }

    private void a(View view, di diVar, JSONObject jSONObject, int i) {
        diVar.a(view, jSONObject, this, i == ef.f7987a);
    }

    private void g() {
        if (this.f7967b.size() > 0) {
            Iterator it = this.f7967b.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public static void b() {
        if (f7966d == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f7966d = handler;
            handler.post(j);
            f7966d.postDelayed(k, 200L);
        }
    }

    public static void c() {
        if (f7966d != null) {
            f7966d.removeCallbacks(k);
            f7966d = null;
        }
    }

    @Override // com.tapjoy.internal.di.a
    public final void a(View view, di diVar, JSONObject jSONObject) {
        String str;
        boolean z;
        if (dq.c(view)) {
            dx dxVar = this.g;
            int i = dxVar.f7971c.contains(view) ? ef.f7987a : dxVar.f ? ef.f7988b : ef.f7989c;
            if (i == ef.f7989c) {
                return;
            }
            JSONObject a2 = diVar.a(view);
            dm.a(jSONObject, a2);
            dx dxVar2 = this.g;
            ArrayList arrayList = null;
            if (dxVar2.f7969a.size() == 0) {
                str = null;
            } else {
                str = (String) dxVar2.f7969a.get(view);
                if (str != null) {
                    dxVar2.f7969a.remove(view);
                }
            }
            if (str != null) {
                dm.a(a2, str);
                this.g.f = true;
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                dx dxVar3 = this.g;
                if (dxVar3.f7970b.size() != 0 && (arrayList = (ArrayList) dxVar3.f7970b.get(view)) != null) {
                    dxVar3.f7970b.remove(view);
                    Collections.sort(arrayList);
                }
                if (arrayList != null) {
                    dm.a(a2, arrayList);
                }
                a(view, diVar, a2, i);
            }
            this.e++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ void b(dw dwVar) {
        boolean z;
        dwVar.e = 0;
        dwVar.i = Cdo.a();
        dx dxVar = dwVar.g;
        dd a2 = dd.a();
        if (a2 != null) {
            for (cz czVar : Collections.unmodifiableCollection(a2.f7930b)) {
                View c2 = czVar.c();
                if (czVar.d()) {
                    if (c2 != null) {
                        if (c2.hasWindowFocus()) {
                            HashSet hashSet = new HashSet();
                            View view = c2;
                            while (view != null) {
                                if (dq.c(view)) {
                                    hashSet.add(view);
                                    Object parent = view.getParent();
                                    view = parent instanceof View ? (View) parent : null;
                                }
                            }
                            dxVar.f7971c.addAll(hashSet);
                            z = true;
                            if (!z) {
                                dxVar.f7972d.add(czVar.f);
                                dxVar.f7969a.put(c2, czVar.f);
                                dxVar.a(czVar);
                            }
                        }
                        z = false;
                        if (!z) {
                        }
                    }
                    dxVar.e.add(czVar.f);
                }
            }
        }
        double a3 = Cdo.a();
        dk dkVar = dwVar.f.f7946a;
        if (dwVar.g.e.size() > 0) {
            JSONObject a4 = dkVar.a(null);
            ee eeVar = dwVar.h;
            eeVar.f7985a.a(new ec(eeVar, dwVar.g.e, a4, a3));
        }
        if (dwVar.g.f7972d.size() > 0) {
            JSONObject a5 = dkVar.a(null);
            dwVar.a(null, dkVar, a5, ef.f7987a);
            dm.a(a5);
            ee eeVar2 = dwVar.h;
            eeVar2.f7985a.a(new ed(eeVar2, dwVar.g.f7972d, a5, a3));
        } else {
            dwVar.h.b();
        }
        dx dxVar2 = dwVar.g;
        dxVar2.f7969a.clear();
        dxVar2.f7970b.clear();
        dxVar2.f7971c.clear();
        dxVar2.f7972d.clear();
        dxVar2.e.clear();
        dxVar2.f = false;
        Cdo.a();
        dwVar.g();
    }
}
