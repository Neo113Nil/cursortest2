package com.google.firebase.messaging;

import I.C0108d;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Trace;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import d1.EnumC0356c;
import f2.C0394a;
import f2.C0396c;
import f2.InterfaceC0397d;
import h1.C0468a;
import h1.C0469b;
import i1.InterfaceC0542b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import l2.C0660a;
import p1.AbstractC0824g;
import p1.C0819b;
import u.C0934e;
import y1.ThreadFactoryC1023a;
import z1.AbstractC1053a;

/* renamed from: com.google.firebase.messaging.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0318h implements OnCompleteListener, K1.a, InterfaceC0542b, h1.f, S1.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4502e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4503i;

    public /* synthetic */ C0318h(Object obj, int i2, Object obj2) {
        this.f4501d = i2;
        this.f4502e = obj;
        this.f4503i = obj2;
    }

    @Override // h1.f
    public Object apply(Object obj) {
        h1.h hVar = (h1.h) this.f4502e;
        a1.i iVar = (a1.i) this.f4503i;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        C0468a c0468a = hVar.f5139l;
        ArrayList h7 = hVar.h(sQLiteDatabase, iVar, c0468a.f5124b);
        for (X0.d dVar : X0.d.values()) {
            if (dVar != iVar.f3069c) {
                int size = c0468a.f5124b - h7.size();
                if (size <= 0) {
                    break;
                }
                D0.j a7 = a1.i.a();
                a7.b0(iVar.f3067a);
                if (dVar == null) {
                    throw new NullPointerException("Null priority");
                }
                a7.f332l = dVar;
                a7.f331i = iVar.f3068b;
                h7.addAll(hVar.h(sQLiteDatabase, a7.A(), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i2 = 0; i2 < h7.size(); i2++) {
            sb.append(((C0469b) h7.get(i2)).f5128a);
            if (i2 < h7.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j), set);
                }
                set.add(new h1.g(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = h7.listIterator();
        while (listIterator.hasNext()) {
            C0469b c0469b = (C0469b) listIterator.next();
            long j7 = c0469b.f5128a;
            if (hashMap.containsKey(Long.valueOf(j7))) {
                D6.z c7 = c0469b.f5130c.c();
                for (h1.g gVar : (Set) hashMap.get(Long.valueOf(j7))) {
                    c7.g(gVar.f5133a, gVar.f5134b);
                }
                listIterator.set(new C0469b(j7, c0469b.f5129b, c7.i()));
            }
        }
        return h7;
    }

    @Override // i1.InterfaceC0542b
    public Object b() {
        switch (this.f4501d) {
            case 4:
                g1.i iVar = (g1.i) this.f4502e;
                Iterable iterable = (Iterable) this.f4503i;
                h1.h hVar = (h1.h) iVar.f5000c;
                hVar.getClass();
                if (iterable.iterator().hasNext()) {
                    hVar.a().compileStatement("DELETE FROM events WHERE _id in " + h1.h.t(iterable)).execute();
                    break;
                }
                break;
            default:
                g1.i iVar2 = (g1.i) this.f4502e;
                for (Map.Entry entry : ((HashMap) this.f4503i).entrySet()) {
                    ((h1.h) iVar2.f5006i).j(((Integer) entry.getValue()).intValue(), EnumC0356c.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // S1.e
    public Object c(D6.z zVar) {
        String valueOf;
        switch (this.f4501d) {
            case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                String str = (String) this.f4502e;
                A4.c cVar = (A4.c) this.f4503i;
                Context context = (Context) zVar.a(Context.class);
                switch (cVar.f89d) {
                    case 10:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                        valueOf = "";
                        break;
                    case RequestError.STOP_TRACKING /* 11 */:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null) {
                            valueOf = String.valueOf(applicationInfo2.minSdkVersion);
                            break;
                        }
                        valueOf = "";
                        break;
                    case 12:
                        int i2 = Build.VERSION.SDK_INT;
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                    if (i2 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                        valueOf = "embedded";
                                        break;
                                    }
                                    valueOf = "";
                                    break;
                                } else {
                                    valueOf = "auto";
                                    break;
                                }
                            } else {
                                valueOf = "watch";
                                break;
                            }
                        } else {
                            valueOf = "tv";
                            break;
                        }
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            valueOf = FirebaseCommonRegistrar.a(installerPackageName);
                            break;
                        }
                        valueOf = "";
                        break;
                }
                return new C0660a(str, valueOf);
            default:
                String str2 = (String) this.f4502e;
                S1.b bVar = (S1.b) this.f4503i;
                try {
                    Trace.beginSection(str2);
                    return bVar.f2470f.c(zVar);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // K1.a
    public Object h(Task task) {
        switch (this.f4501d) {
            case 1:
                D6.y yVar = (D6.y) this.f4502e;
                ExecutorService executorService = (ExecutorService) this.f4503i;
                yVar.getClass();
                if (!task.isSuccessful()) {
                    return AbstractC1053a.v(task.getException() != null ? task.getException() : new ExecutionException(new RuntimeException("Unexpected Error")));
                }
                String str = (String) task.getResult();
                return ((C0396c) ((InterfaceC0397d) yVar.f635i)).d().g(Executors.newSingleThreadExecutor(new ThreadFactoryC1023a("Firebase-Messaging-Network-Io")), new C0318h(yVar, 2, str)).f(executorService, new A4.b(4, str));
            case 2:
                D6.y yVar2 = (D6.y) this.f4502e;
                String str2 = (String) this.f4503i;
                P1.g gVar = (P1.g) yVar2.f633d;
                if (!task.isSuccessful()) {
                    return AbstractC1053a.v(task.getException() != null ? task.getException() : new ExecutionException(new RuntimeException("Unexpected Error")));
                }
                String str3 = ((C0394a) task.getResult()).f4773a;
                gVar.a();
                P1.h hVar = gVar.f2272c;
                String str4 = hVar.f2279a;
                gVar.a();
                C0819b c0819b = new C0819b(C0108d.f(gVar), hVar.f2280b, str4, str2, str3);
                D1.f fVar = (D1.f) yVar2.f634e;
                fVar.getClass();
                h4.w wVar = new h4.w();
                wVar.f5278a = true;
                wVar.f5281d = new q1.d[]{AbstractC0824g.f7174a};
                wVar.f5280c = new P0.c(fVar, 1, c0819b);
                wVar.f5279b = 39001;
                return fVar.b(0, wVar.a());
            default:
                C0322l c0322l = (C0322l) this.f4502e;
                String str5 = (String) this.f4503i;
                synchronized (c0322l) {
                    ((C0934e) c0322l.f4512b).remove(str5);
                }
                return task;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((AbstractServiceC0319i) this.f4502e).a((Intent) this.f4503i);
    }
}
