package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Trace;
import com.google.android.gms.internal.measurement.ra;
import com.google.android.gms.internal.measurement.se;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements OnCompleteListener, w7.a, l8.e, s6.b, r6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3132e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3133i;

    public /* synthetic */ f(int i3, Object obj, Object obj2) {
        this.f3131d = i3;
        this.f3132e = obj;
        this.f3133i = obj2;
    }

    @Override // s6.b
    public Object a() {
        switch (this.f3131d) {
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                q6.i iVar = (q6.i) this.f3132e;
                Iterable iterable = (Iterable) this.f3133i;
                r6.g gVar = (r6.g) iVar.f8053c;
                gVar.getClass();
                if (iterable.iterator().hasNext()) {
                    gVar.a().compileStatement("DELETE FROM events WHERE _id in ".concat(r6.g.o(iterable))).execute();
                    break;
                }
                break;
            default:
                q6.i iVar2 = (q6.i) this.f3132e;
                Iterator it = ((HashMap) this.f3133i).entrySet().iterator();
                while (it.hasNext()) {
                    ((r6.g) iVar2.f8055e).j(((Integer) r2.getValue()).intValue(), n6.c.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                break;
        }
        return null;
    }

    @Override // r6.e
    public Object apply(Object obj) {
        r6.g gVar = (r6.g) this.f3132e;
        k6.i iVar = (k6.i) this.f3133i;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        r6.a aVar = gVar.f8200r;
        ArrayList i3 = gVar.i(sQLiteDatabase, iVar, aVar.f8183b);
        for (h6.d dVar : h6.d.values()) {
            if (dVar != iVar.f5466c) {
                int size = aVar.f8183b - i3.size();
                if (size <= 0) {
                    break;
                }
                a1.n a9 = k6.i.a();
                a9.G(iVar.f5464a);
                if (dVar == null) {
                    a2.r.j("Null priority");
                    return null;
                }
                a9.f42r = dVar;
                a9.f41i = iVar.f5465b;
                i3.addAll(gVar.i(sQLiteDatabase, a9.k(), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < i3.size(); i10++) {
            sb2.append(((r6.b) i3.get(i10)).f8187a);
            if (i10 < i3.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j), set);
                }
                set.add(new r6.f(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = i3.listIterator();
        while (listIterator.hasNext()) {
            r6.b bVar = (r6.b) listIterator.next();
            long j3 = bVar.f8187a;
            if (hashMap.containsKey(Long.valueOf(j3))) {
                ra c10 = bVar.f8189c.c();
                for (r6.f fVar : (Set) hashMap.get(Long.valueOf(j3))) {
                    c10.a(fVar.f8194a, fVar.f8195b);
                }
                listIterator.set(new r6.b(j3, bVar.f8188b, c10.c()));
            }
        }
        return i3;
    }

    @Override // l8.e
    public Object b(se seVar) {
        String valueOf;
        switch (this.f3131d) {
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                String str = (String) this.f3132e;
                a2.r rVar = (a2.r) this.f3133i;
                Context context = (Context) seVar.a(Context.class);
                switch (rVar.f143d) {
                    case 19:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                        valueOf = "";
                        break;
                    case 20:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null) {
                            valueOf = String.valueOf(applicationInfo2.minSdkVersion);
                            break;
                        }
                        valueOf = "";
                        break;
                    case 21:
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                    if (Build.VERSION.SDK_INT >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
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
                return new d9.a(str, valueOf);
            default:
                String str2 = (String) this.f3132e;
                l8.b bVar = (l8.b) this.f3133i;
                try {
                    Trace.beginSection(str2);
                    return bVar.f5903f.b(seVar);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // w7.a
    public Object f(Task task) {
        switch (this.f3131d) {
            case 1:
                se seVar = (se) this.f3132e;
                ExecutorService executorService = (ExecutorService) this.f3133i;
                seVar.getClass();
                if (!task.isSuccessful()) {
                    return z4.w.p(task.getException() != null ? task.getException() : new ExecutionException(new RuntimeException("Unexpected Error")));
                }
                String str = (String) task.getResult();
                return ((x8.c) ((x8.d) seVar.f2800i)).d().g(Executors.newSingleThreadExecutor(new h7.a("Firebase-Messaging-Network-Io")), new f(2, seVar, str)).f(executorService, new b1.h(1, str));
            case 2:
                se seVar2 = (se) this.f3132e;
                String str2 = (String) this.f3133i;
                g8.g gVar = (g8.g) seVar2.f2799e;
                if (!task.isSuccessful()) {
                    return z4.w.p(task.getException() != null ? task.getException() : new ExecutionException(new RuntimeException("Unexpected Error")));
                }
                String str3 = ((x8.a) task.getResult()).f10541a;
                gVar.a();
                g8.i iVar = gVar.f4302c;
                String str4 = iVar.f4313a;
                gVar.a();
                y6.b bVar = new y6.b(b1.m.c(gVar), iVar.f4314b, str4, str2, str3);
                n7.e eVar = (n7.e) seVar2.f2798d;
                eVar.getClass();
                a8.l b10 = a8.l.b();
                b10.f359d = new z6.d[]{y6.g.f10642a};
                b10.f358c = new c6.c(9, eVar, bVar);
                b10.f357b = 39001;
                return eVar.b(0, b10.a());
            default:
                j jVar = (j) this.f3132e;
                String str5 = (String) this.f3133i;
                synchronized (jVar) {
                    ((s.e) jVar.f3151b).remove(str5);
                }
                return task;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((g) this.f3132e).a((Intent) this.f3133i);
    }
}
