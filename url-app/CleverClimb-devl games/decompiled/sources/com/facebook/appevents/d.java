package com.facebook.appevents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.appevents.f;
import com.facebook.internal.ab;
import com.facebook.internal.t;
import com.facebook.q;
import com.facebook.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AppEventQueue.java */
/* loaded from: classes.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5956a = "com.facebook.appevents.d";

    /* renamed from: d, reason: collision with root package name */
    private static ScheduledFuture f5959d;

    /* renamed from: b, reason: collision with root package name */
    private static volatile c f5957b = new c();

    /* renamed from: c, reason: collision with root package name */
    private static final ScheduledExecutorService f5958c = Executors.newSingleThreadScheduledExecutor();
    private static final Runnable e = new Runnable() { // from class: com.facebook.appevents.d.1
        @Override // java.lang.Runnable
        public void run() {
            ScheduledFuture unused = d.f5959d = null;
            if (f.a() != f.a.EXPLICIT_ONLY) {
                d.b(h.TIMER);
            }
        }
    };

    d() {
    }

    public static void a(final h hVar) {
        f5958c.execute(new Runnable() { // from class: com.facebook.appevents.d.2
            @Override // java.lang.Runnable
            public void run() {
                d.b(h.this);
            }
        });
    }

    public static void a(final a aVar, final b bVar) {
        f5958c.execute(new Runnable() { // from class: com.facebook.appevents.d.3
            @Override // java.lang.Runnable
            public void run() {
                d.f5957b.a(a.this, bVar);
                if (f.a() == f.a.EXPLICIT_ONLY || d.f5957b.b() <= 100) {
                    if (d.f5959d == null) {
                        ScheduledFuture unused = d.f5959d = d.f5958c.schedule(d.e, 15L, TimeUnit.SECONDS);
                        return;
                    }
                    return;
                }
                d.b(h.EVENT_THRESHOLD);
            }
        });
    }

    public static Set<a> a() {
        return f5957b.a();
    }

    static void b(h hVar) {
        f5957b.a(e.a());
        try {
            j a2 = a(hVar, f5957b);
            if (a2 != null) {
                Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", a2.f6002a);
                intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", a2.f6003b);
                LocalBroadcastManager.getInstance(f.d()).sendBroadcast(intent);
            }
        } catch (Exception e2) {
            Log.w(f5956a, "Caught unexpected exception while flushing app events: ", e2);
        }
    }

    private static j a(h hVar, c cVar) {
        j jVar = new j();
        boolean b2 = com.facebook.l.b(f.d());
        ArrayList arrayList = new ArrayList();
        for (a aVar : cVar.a()) {
            GraphRequest a2 = a(aVar, cVar.a(aVar), b2, jVar);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        t.a(u.APP_EVENTS, f5956a, "Flushing %d events due to %s.", Integer.valueOf(jVar.f6002a), hVar.toString());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((GraphRequest) it.next()).i();
        }
        return jVar;
    }

    private static GraphRequest a(final a aVar, final l lVar, boolean z, final j jVar) {
        int a2;
        String b2 = aVar.b();
        ab.b a3 = ab.a(b2, false);
        final GraphRequest a4 = GraphRequest.a((AccessToken) null, String.format("%s/activities", b2), (JSONObject) null, (GraphRequest.b) null);
        Bundle e2 = a4.e();
        if (e2 == null) {
            e2 = new Bundle();
        }
        e2.putString("access_token", aVar.a());
        String c2 = f.c();
        if (c2 != null) {
            e2.putString("device_token", c2);
        }
        a4.a(e2);
        if (a3 == null || (a2 = lVar.a(a4, f.d(), a3.a(), z)) == 0) {
            return null;
        }
        jVar.f6002a += a2;
        a4.a(new GraphRequest.b() { // from class: com.facebook.appevents.d.4
            @Override // com.facebook.GraphRequest.b
            public void a(q qVar) {
                d.b(a.this, a4, qVar, lVar, jVar);
            }
        });
        return a4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final a aVar, GraphRequest graphRequest, q qVar, final l lVar, j jVar) {
        String str;
        FacebookRequestError a2 = qVar.a();
        String str2 = "Success";
        i iVar = i.SUCCESS;
        if (a2 != null) {
            if (a2.getErrorCode() == -1) {
                str2 = "Failed: No Connectivity";
                iVar = i.NO_CONNECTIVITY;
            } else {
                str2 = String.format("Failed:\n  Response: %s\n  Error %s", qVar.toString(), a2.toString());
                iVar = i.SERVER_ERROR;
            }
        }
        if (com.facebook.l.a(u.APP_EVENTS)) {
            try {
                str = new JSONArray((String) graphRequest.h()).toString(2);
            } catch (JSONException unused) {
                str = "<Can't encode events for debug logging>";
            }
            t.a(u.APP_EVENTS, f5956a, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", graphRequest.a().toString(), str2, str);
        }
        lVar.a(a2 != null);
        if (iVar == i.NO_CONNECTIVITY) {
            com.facebook.l.d().execute(new Runnable() { // from class: com.facebook.appevents.d.5
                @Override // java.lang.Runnable
                public void run() {
                    e.a(a.this, lVar);
                }
            });
        }
        if (iVar == i.SUCCESS || jVar.f6003b == i.NO_CONNECTIVITY) {
            return;
        }
        jVar.f6003b = iVar;
    }
}
