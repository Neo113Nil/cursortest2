package defpackage;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.facebook.appevents.codeless.CodelessManager;
import com.facebook.appevents.codeless.ViewIndexingTrigger;
import com.facebook.appevents.internal.FileDownloadTask;
import com.facebook.appevents.ml.Model;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.PlatformServiceClient;
import com.facebook.login.GetTokenLoginMethodHandler;
import com.facebook.login.LoginClient;
import com.google.firebase.messaging.EnhancedIntentService;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class lv implements ViewIndexingTrigger.OnShakeListener, uu1, PlatformServiceClient.CompletedListener, FileDownloadTask.Callback, rc2, cs2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public /* synthetic */ lv(int i, Object obj, Object obj2) {
        this.m = i;
        this.n = obj;
        this.o = obj2;
    }

    @Override // defpackage.rc2
    public Object apply(Object obj) {
        tc2 tc2Var = (tc2) this.n;
        gm gmVar = (gm) this.o;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        xl xlVar = tc2Var.p;
        ArrayList n = tc2Var.n(sQLiteDatabase, gmVar, xlVar.b);
        for (y42 y42Var : y42.values()) {
            if (y42Var != gmVar.c) {
                int size = xlVar.b - n.size();
                if (size <= 0) {
                    break;
                }
                mh a = gm.a();
                a.F(gmVar.a);
                if (y42Var == null) {
                    ch2.l("Null priority");
                    return null;
                }
                a.p = y42Var;
                a.o = gmVar.b;
                n.addAll(tc2Var.n(sQLiteDatabase, a.i(), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < n.size(); i++) {
            sb.append(((cm) n.get(i)).a);
            if (i < n.size() - 1) {
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
                set.add(new sc2(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = n.listIterator();
        while (listIterator.hasNext()) {
            cm cmVar = (cm) listIterator.next();
            long j2 = cmVar.a;
            if (hashMap.containsKey(Long.valueOf(j2))) {
                sf c = cmVar.c.c();
                for (sc2 sc2Var : (Set) hashMap.get(Long.valueOf(j2))) {
                    c.b(sc2Var.a, sc2Var.b);
                }
                listIterator.set(new cm(j2, cmVar.b, c.e()));
            }
        }
        return n;
    }

    @Override // defpackage.cs2
    public Object b() {
        int i = this.m;
        Object obj = this.o;
        f33 f33Var = (f33) this.n;
        switch (i) {
            case 5:
                Iterable iterable = (Iterable) obj;
                tc2 tc2Var = f33Var.c;
                tc2Var.getClass();
                if (iterable.iterator().hasNext()) {
                    tc2Var.b().compileStatement("DELETE FROM events WHERE _id in ".concat(tc2.q(iterable))).execute();
                    break;
                }
                break;
            default:
                Iterator it = ((HashMap) obj).entrySet().iterator();
                while (it.hasNext()) {
                    f33Var.i.o(((Integer) r2.getValue()).intValue(), cg1.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                break;
        }
        return null;
    }

    @Override // com.facebook.internal.PlatformServiceClient.CompletedListener
    public void completed(Bundle bundle) {
        GetTokenLoginMethodHandler.tryAuthorize$lambda$1((GetTokenLoginMethodHandler) this.n, (LoginClient.Request) this.o, bundle);
    }

    @Override // defpackage.uu1
    public void onComplete(jt2 jt2Var) {
        ((EnhancedIntentService) this.n).lambda$onStartCommand$1((Intent) this.o, jt2Var);
    }

    @Override // com.facebook.appevents.codeless.ViewIndexingTrigger.OnShakeListener
    public void onShake() {
        CodelessManager.onActivityResumed$lambda$0((FetchedAppSettings) this.n, (String) this.o);
    }

    @Override // com.facebook.appevents.internal.FileDownloadTask.Callback
    public void onComplete(File file) {
        ModelManager.TaskHandler.Companion.execute$lambda$1$lambda$0((ModelManager.TaskHandler) this.n, (Model) this.o, file);
    }
}
