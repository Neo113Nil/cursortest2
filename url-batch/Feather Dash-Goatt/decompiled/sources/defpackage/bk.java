package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Trace;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.internal.l;
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

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class bk implements ak, OnCompleteListener, na1, en, z41, bg1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ bk(yw ywVar, String str) {
        this.d = 4;
        this.g = ywVar;
        this.e = str;
    }

    @Override // defpackage.na1
    public boolean a() {
        ty0 ty0Var = (ty0) this.e;
        hc hcVar = (hc) this.g;
        if (!ty0Var.u) {
            ty0Var.j();
            hcVar.a = hc.a(ty0Var.s, hcVar.a);
            ty0Var.u = !ty0Var.i(ty0Var.r, r1 + hcVar.b);
        }
        return ty0Var.u;
    }

    @Override // defpackage.z41
    public Object apply(Object obj) {
        b51 b51Var = (b51) this.e;
        cc ccVar = (cc) this.g;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        lb lbVar = b51Var.h;
        ArrayList d = b51Var.d(sQLiteDatabase, ccVar, lbVar.b);
        for (dz0 dz0Var : dz0.values()) {
            if (dz0Var != ccVar.c) {
                int size = lbVar.b - d.size();
                if (size <= 0) {
                    break;
                }
                i8 a = cc.a();
                a.r(ccVar.a);
                if (dz0Var == null) {
                    l.b("Null priority");
                    return null;
                }
                a.h = dz0Var;
                a.g = ccVar.b;
                d.addAll(b51Var.d(sQLiteDatabase, a.b(), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < d.size(); i++) {
            sb.append(((ub) d.get(i)).a);
            if (i < d.size() - 1) {
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
                set.add(new a51(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = d.listIterator();
        while (listIterator.hasNext()) {
            ub ubVar = (ub) listIterator.next();
            long j2 = ubVar.a;
            if (hashMap.containsKey(Long.valueOf(j2))) {
                jb c = ubVar.c.c();
                for (a51 a51Var : (Set) hashMap.get(Long.valueOf(j2))) {
                    c.f(a51Var.a, a51Var.b);
                }
                listIterator.set(new ub(j2, ubVar.b, c.g()));
            }
        }
        return d;
    }

    @Override // defpackage.bg1
    public Object b() {
        int i = this.d;
        Object obj = this.g;
        ne0 ne0Var = (ne0) this.e;
        switch (i) {
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                Iterable iterable = (Iterable) obj;
                b51 b51Var = (b51) ne0Var.c;
                b51Var.getClass();
                if (iterable.iterator().hasNext()) {
                    b51Var.a().compileStatement("DELETE FROM events WHERE _id in ".concat(b51.g(iterable))).execute();
                    break;
                }
                break;
            default:
                Iterator it = ((HashMap) obj).entrySet().iterator();
                while (it.hasNext()) {
                    ((b51) ne0Var.i).e(((Integer) r2.getValue()).intValue(), ui0.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                break;
        }
        return null;
    }

    @Override // defpackage.ak
    public Object f(mc mcVar) {
        int i = this.d;
        Object obj = this.g;
        String str = (String) this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                mj mjVar = (mj) obj;
                try {
                    Trace.beginSection(str);
                    return mjVar.f.f(mcVar);
                } finally {
                    Trace.endSection();
                }
            default:
                Context context = (Context) mcVar.a(Context.class);
                int i2 = ((af) obj).d;
                String str2 = "";
                switch (i2) {
                    case 21:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            str2 = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                        break;
                    case 22:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null) {
                            str2 = String.valueOf(applicationInfo2.minSdkVersion);
                            break;
                        }
                        break;
                    case 23:
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                    if (context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                        str2 = "embedded";
                                        break;
                                    }
                                } else {
                                    str2 = "auto";
                                    break;
                                }
                            } else {
                                str2 = "watch";
                                break;
                            }
                        } else {
                            str2 = "tv";
                            break;
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            str2 = FirebaseCommonRegistrar.a(installerPackageName);
                            break;
                        }
                        break;
                }
                return new pb(str, str2);
        }
    }

    @Override // defpackage.en
    public Object n(Task task) {
        yw ywVar = (yw) this.g;
        String str = (String) this.e;
        synchronized (ywVar) {
            ((s9) ywVar.g).remove(str);
        }
        return task;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((xv) this.e).a((Intent) this.g);
    }

    public /* synthetic */ bk(Object obj, int i, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }
}
