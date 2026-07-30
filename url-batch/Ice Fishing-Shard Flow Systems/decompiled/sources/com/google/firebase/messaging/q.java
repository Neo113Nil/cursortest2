package com.google.firebase.messaging;

import I.C0108d;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import f2.C0396c;
import f2.InterfaceC0397d;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p1.C0820c;
import y1.ThreadFactoryC1023a;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements K1.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f4519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f4520e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ A f4521i;

    public /* synthetic */ q(FirebaseMessaging firebaseMessaging, String str, A a7) {
        this.f4519d = firebaseMessaging;
        this.f4520e = str;
        this.f4521i = a7;
    }

    public Task a() {
        Task v7;
        Task f7;
        int i2;
        FirebaseMessaging firebaseMessaging = this.f4519d;
        String str = this.f4520e;
        A a7 = this.f4521i;
        D6.y yVar = firebaseMessaging.f4441d;
        boolean c7 = yVar.c();
        if (!c7 || ((C0108d) yVar.f637m).g() < 261200000) {
            D6.z zVar = (D6.z) yVar.f636l;
            String f8 = C0108d.f((P1.g) zVar.f640c);
            Bundle bundle = new Bundle();
            try {
                zVar.q(f8, bundle, c7);
                C0820c c0820c = (C0820c) zVar.f641d;
                K1.n nVar = K1.n.f1442e;
                K6.B b7 = c0820c.f7164c;
                if (b7.c() < 12000000) {
                    v7 = b7.b() != 0 ? c0820c.b(bundle).g(nVar, new P0.l(c0820c, 8, bundle)) : AbstractC1053a.v(new IOException("MISSING_INSTANCEID_SERVICE"));
                } else {
                    p1.l b8 = p1.l.b(c0820c.f7163b);
                    synchronized (b8) {
                        i2 = b8.f7191a;
                        b8.f7191a = i2 + 1;
                    }
                    v7 = b8.c(new p1.k(i2, 1, bundle, 1)).f(nVar, q1.h.f7333m);
                }
            } catch (InterruptedException | ExecutionException e7) {
                v7 = AbstractC1053a.v(e7);
            }
            f7 = v7.f(new e0.c(0), new A4.b(5, zVar));
        } else {
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC1023a("Firebase-Messaging-Network-Io"));
            f7 = ((C0396c) ((InterfaceC0397d) yVar.f635i)).c().g(newSingleThreadExecutor, new C0318h(yVar, 1, newSingleThreadExecutor));
        }
        return f7.k(firebaseMessaging.f4445h, new q(firebaseMessaging, str, a7));
    }

    @Override // K1.g
    public K1.p f(Object obj) {
        FirebaseMessaging firebaseMessaging = this.f4519d;
        String str = this.f4520e;
        A a7 = this.f4521i;
        String str2 = (String) obj;
        B.f c7 = FirebaseMessaging.c(firebaseMessaging.f4439b);
        P1.g gVar = firebaseMessaging.f4438a;
        gVar.a();
        String g7 = "[DEFAULT]".equals(gVar.f2271b) ? "" : gVar.g();
        String e7 = firebaseMessaging.f4446i.e();
        synchronized (c7) {
            String a8 = A.a(str2, e7, System.currentTimeMillis());
            if (a8 != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) c7.f152e).edit();
                edit.putString(g7 + "|T|" + str + "|*", a8);
                edit.commit();
            }
        }
        if (firebaseMessaging.f4441d.c() || a7 == null || !str2.equals(a7.f4412a)) {
            P1.g gVar2 = firebaseMessaging.f4438a;
            gVar2.a();
            String str3 = gVar2.f2271b;
            if ("[DEFAULT]".equals(str3)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                    gVar2.a();
                    sb.append(str3);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                boolean c8 = firebaseMessaging.f4441d.c();
                Intent intent = new Intent();
                intent.putExtra("token", str2);
                if (c8) {
                    intent.setAction("com.google.firebase.messaging.FCM_REGISTERED");
                } else {
                    intent.setAction("com.google.firebase.messaging.NEW_TOKEN");
                }
                new C0322l(firebaseMessaging.f4439b).b(intent);
            }
        }
        return AbstractC1053a.w(str2);
    }
}
