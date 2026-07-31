package H1;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Trace;
import com.google.firebase.FirebaseCommonRegistrar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import p1.C0576a;
import q.C0582b;

/* renamed from: H1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0133g implements k1.c, k1.a, L0.b, p1.c, K0.f {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f955f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f956g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f957h;

    public /* synthetic */ C0133g(Object obj, int i7, Object obj2) {
        this.f955f = i7;
        this.f956g = obj;
        this.f957h = obj2;
    }

    @Override // k1.a
    public Object a(k1.n nVar) {
        C0138l c0138l = (C0138l) this.f956g;
        String str = (String) this.f957h;
        synchronized (c0138l) {
            ((C0582b) c0138l.f975b).remove(str);
        }
        return nVar;
    }

    @Override // K0.f
    public Object apply(Object obj) {
        K0.h hVar = (K0.h) this.f956g;
        D0.j jVar = (D0.j) this.f957h;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        K0.a aVar = hVar.f1360i;
        ArrayList g7 = hVar.g(sQLiteDatabase, jVar, aVar.f1345b);
        for (A0.d dVar : A0.d.values()) {
            if (dVar != jVar.f344c) {
                int size = aVar.f1345b - g7.size();
                if (size <= 0) {
                    break;
                }
                B0.c a7 = D0.j.a();
                a7.A(jVar.f342a);
                if (dVar == null) {
                    throw new NullPointerException("Null priority");
                }
                a7.f73i = dVar;
                a7.f72h = jVar.f343b;
                g7.addAll(hVar.g(sQLiteDatabase, a7.e(), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i7 = 0; i7 < g7.size(); i7++) {
            sb.append(((K0.b) g7.get(i7)).f1349a);
            if (i7 < g7.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j4 = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j4));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j4), set);
                }
                set.add(new K0.g(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = g7.listIterator();
        while (listIterator.hasNext()) {
            K0.b bVar = (K0.b) listIterator.next();
            long j7 = bVar.f1349a;
            if (hashMap.containsKey(Long.valueOf(j7))) {
                D0.h c7 = bVar.f1351c.c();
                for (K0.g gVar : (Set) hashMap.get(Long.valueOf(j7))) {
                    c7.a(gVar.f1354a, gVar.f1355b);
                }
                listIterator.set(new K0.b(j7, bVar.f1350b, c7.c()));
            }
        }
        return g7;
    }

    @Override // p1.c
    public Object b(A.e eVar) {
        String valueOf;
        switch (this.f955f) {
            case 4:
                String str = (String) this.f956g;
                B1.g gVar = (B1.g) this.f957h;
                Context context = (Context) eVar.a(Context.class);
                switch (gVar.f104f) {
                    case 21:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                        valueOf = "";
                        break;
                    case 22:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null) {
                            valueOf = String.valueOf(applicationInfo2.minSdkVersion);
                            break;
                        }
                        valueOf = "";
                        break;
                    case 23:
                        int i7 = Build.VERSION.SDK_INT;
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                    if (i7 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
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
                return new J1.a(str, valueOf);
            default:
                String str2 = (String) this.f956g;
                C0576a c0576a = (C0576a) this.f957h;
                try {
                    Trace.beginSection(str2);
                    return c0576a.f5665f.b(eVar);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // L0.b
    public Object c() {
        switch (this.f955f) {
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                J0.k kVar = (J0.k) this.f956g;
                Iterable iterable = (Iterable) this.f957h;
                K0.h hVar = (K0.h) kVar.f1271c;
                hVar.getClass();
                if (iterable.iterator().hasNext()) {
                    hVar.a().compileStatement("DELETE FROM events WHERE _id in " + K0.h.n(iterable)).execute();
                    break;
                }
                break;
            default:
                J0.k kVar2 = (J0.k) this.f956g;
                for (Map.Entry entry : ((HashMap) this.f957h).entrySet()) {
                    ((K0.h) kVar2.f1277i).h(((Integer) entry.getValue()).intValue(), G0.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // k1.c
    public void h(k1.n nVar) {
        ((AbstractServiceC0135i) this.f956g).a((Intent) this.f957h);
    }
}
