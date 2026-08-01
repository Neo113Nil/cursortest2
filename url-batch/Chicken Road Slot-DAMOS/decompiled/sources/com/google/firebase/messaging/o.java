package com.google.firebase.messaging;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.measurement.ra;
import com.google.android.gms.internal.measurement.se;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import n0.c1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements w7.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f3159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f3160e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w f3161i;

    public /* synthetic */ o(FirebaseMessaging firebaseMessaging, String str, w wVar) {
        this.f3159d = firebaseMessaging;
        this.f3160e = str;
        this.f3161i = wVar;
    }

    public Task a() {
        Task p4;
        Task f3;
        int i3;
        FirebaseMessaging firebaseMessaging = this.f3159d;
        String str = this.f3160e;
        w wVar = this.f3161i;
        se seVar = firebaseMessaging.f3081d;
        boolean o6 = seVar.o();
        if (!o6 || ((b1.m) seVar.f2802s).d() < 261200000) {
            ra raVar = (ra) seVar.f2801r;
            String c10 = b1.m.c((g8.g) raVar.f2737a);
            Bundle bundle = new Bundle();
            try {
                raVar.g(c10, bundle, o6);
                y6.c cVar = (y6.c) raVar.f2739c;
                d6.n nVar = d6.n.f3648i;
                c1 c1Var = cVar.f10636c;
                if (c1Var.p() < 12000000) {
                    p4 = c1Var.o() != 0 ? cVar.b(bundle).g(nVar, new c6.c(15, cVar, bundle)) : z4.w.p(new IOException("MISSING_INSTANCEID_SERVICE"));
                } else {
                    y6.l k10 = y6.l.k(cVar.f10635b);
                    synchronized (k10) {
                        i3 = k10.f10659d;
                        k10.f10659d = i3 + 1;
                    }
                    p4 = k10.l(new y6.k(i3, 1, bundle, 1)).f(nVar, y6.d.f10640d);
                }
            } catch (InterruptedException | ExecutionException e2) {
                p4 = z4.w.p(e2);
            }
            f3 = p4.f(new n.a(1), new b1.h(2, raVar));
        } else {
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new h7.a("Firebase-Messaging-Network-Io"));
            f3 = ((x8.c) ((x8.d) seVar.f2800i)).c().g(newSingleThreadExecutor, new f(1, seVar, newSingleThreadExecutor));
        }
        return f3.k(firebaseMessaging.f3084h, new o(firebaseMessaging, str, wVar));
    }

    @Override // w7.f
    public w7.n d(Object obj) {
        FirebaseMessaging firebaseMessaging = this.f3159d;
        String str = this.f3160e;
        w wVar = this.f3161i;
        String str2 = (String) obj;
        d9.c c10 = FirebaseMessaging.c(firebaseMessaging.f3079b);
        g8.g gVar = firebaseMessaging.f3078a;
        gVar.a();
        String d10 = "[DEFAULT]".equals(gVar.f4301b) ? "" : gVar.d();
        String b10 = firebaseMessaging.f3085i.b();
        synchronized (c10) {
            String a9 = w.a(str2, b10, System.currentTimeMillis());
            if (a9 != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) c10.f3701e).edit();
                edit.putString(d10 + "|T|" + str + "|*", a9);
                edit.commit();
            }
        }
        if (firebaseMessaging.f3081d.o() || wVar == null || !str2.equals(wVar.f3179a)) {
            g8.g gVar2 = firebaseMessaging.f3078a;
            gVar2.a();
            String str3 = gVar2.f4301b;
            if ("[DEFAULT]".equals(str3)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                    gVar2.a();
                    sb2.append(str3);
                    Log.d("FirebaseMessaging", sb2.toString());
                }
                boolean o6 = firebaseMessaging.f3081d.o();
                Intent intent = new Intent();
                intent.putExtra("token", str2);
                if (o6) {
                    intent.setAction("com.google.firebase.messaging.FCM_REGISTERED");
                } else {
                    intent.setAction("com.google.firebase.messaging.NEW_TOKEN");
                }
                new j(firebaseMessaging.f3079b).b(intent);
            }
        }
        return z4.w.q(str2);
    }
}
