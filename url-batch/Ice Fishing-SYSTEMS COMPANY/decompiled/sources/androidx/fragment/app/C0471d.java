package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import g2.C4525a;
import g2.C4526b;
import h2.InterfaceC4565b;
import h3.InterfaceC4567a;
import h4.C4568a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import q2.C4903n;

/* renamed from: androidx.fragment.app.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0471d implements K.e, InterfaceC4565b, h3.c, InterfaceC4567a, g2.f, N3.e {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f5084n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f5085u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f5086v;

    public /* synthetic */ C0471d(int i, Object obj, Object obj2) {
        this.f5084n = i;
        this.f5085u = obj;
        this.f5086v = obj2;
    }

    @Override // K.e
    public void a() {
        a0 operation = (a0) this.f5086v;
        kotlin.jvm.internal.h.e(operation, "$operation");
        ((Animator) this.f5085u).end();
        if (N.E(2)) {
            Log.v("FragmentManager", "Animator from operation " + operation + " has been canceled.");
        }
    }

    @Override // g2.f
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        g2.h hVar = (g2.h) this.f5085u;
        C4525a c4525a = hVar.f37876w;
        int i = c4525a.f37861b;
        Z1.i iVar = (Z1.i) this.f5086v;
        ArrayList j9 = hVar.j(sQLiteDatabase, iVar, i);
        for (W1.d dVar : W1.d.values()) {
            if (dVar != iVar.f4227c) {
                int size = c4525a.f37861b - j9.size();
                if (size <= 0) {
                    break;
                }
                Y2.e a9 = Z1.i.a();
                a9.K(iVar.f4225a);
                if (dVar == null) {
                    throw new NullPointerException("Null priority");
                }
                a9.f3965w = dVar;
                a9.f3964v = iVar.f4226b;
                j9.addAll(hVar.j(sQLiteDatabase, a9.p(), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i4 = 0; i4 < j9.size(); i4++) {
            sb.append(((C4526b) j9.get(i4)).f37865a);
            if (i4 < j9.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j10 = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j10));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j10), set);
                }
                set.add(new g2.g(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = j9.listIterator();
        while (listIterator.hasNext()) {
            C4526b c4526b = (C4526b) listIterator.next();
            if (hashMap.containsKey(Long.valueOf(c4526b.f37865a))) {
                C4903n c4 = c4526b.f37867c.c();
                long j11 = c4526b.f37865a;
                for (g2.g gVar : (Set) hashMap.get(Long.valueOf(j11))) {
                    c4.a(gVar.f37870a, gVar.f37871b);
                }
                listIterator.set(new C4526b(j11, c4526b.f37866b, c4.c()));
            }
        }
        return j9;
    }

    @Override // N3.e
    public Object b(B2.N n9) {
        String str;
        switch (this.f5084n) {
            case 6:
                Context context = (Context) n9.a(Context.class);
                switch (((B1.w) this.f5086v).f126n) {
                    case 7:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo == null) {
                            str = "";
                            break;
                        } else {
                            str = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                    case 8:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 == null) {
                            str = "";
                            break;
                        } else {
                            str = String.valueOf(applicationInfo2.minSdkVersion);
                            break;
                        }
                    case 9:
                        int i = Build.VERSION.SDK_INT;
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                    if (i >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                        str = "embedded";
                                        break;
                                    } else {
                                        str = "";
                                        break;
                                    }
                                } else {
                                    str = "auto";
                                    break;
                                }
                            } else {
                                str = "watch";
                                break;
                            }
                        } else {
                            str = "tv";
                            break;
                        }
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName == null) {
                            str = "";
                            break;
                        } else {
                            str = FirebaseCommonRegistrar.a(installerPackageName);
                            break;
                        }
                }
                return new C4568a((String) this.f5085u, str);
            default:
                String str2 = (String) this.f5085u;
                N3.b bVar = (N3.b) this.f5086v;
                try {
                    Trace.beginSection(str2);
                    return bVar.f2159f.b(n9);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // h2.InterfaceC4565b
    public Object d() {
        switch (this.f5084n) {
            case 1:
                g2.h hVar = (g2.h) ((f2.i) this.f5085u).f37688c;
                hVar.getClass();
                Iterable iterable = (Iterable) this.f5086v;
                if (iterable.iterator().hasNext()) {
                    hVar.b().compileStatement("DELETE FROM events WHERE _id in " + g2.h.n(iterable)).execute();
                    break;
                }
                break;
            default:
                f2.i iVar = (f2.i) this.f5085u;
                iVar.getClass();
                Iterator it = ((HashMap) this.f5086v).entrySet().iterator();
                while (it.hasNext()) {
                    ((g2.h) iVar.i).k(((Integer) r2.getValue()).intValue(), c2.c.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                break;
        }
        return null;
    }

    @Override // h3.c
    public void o(h3.n nVar) {
        ((f4.f) this.f5085u).a((Intent) this.f5086v);
    }

    @Override // h3.InterfaceC4567a
    public Object s(h3.n nVar) {
        f4.h hVar = (f4.h) this.f5085u;
        String str = (String) this.f5086v;
        synchronized (hVar) {
            ((s.b) hVar.f37747b).remove(str);
        }
        return nVar;
    }
}
