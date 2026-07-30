package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class dd0 implements na1, zs, z41, ak {
    public final /* synthetic */ int d;

    public /* synthetic */ dd0(int i) {
        this.d = i;
    }

    public static /* synthetic */ void c() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void d(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void e(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void g(String str, int i, Object obj) {
        throw new IllegalArgumentException((str + i + obj).toString());
    }

    public static /* synthetic */ void h(String str, Object obj, Object obj2) {
        throw new ij(str + obj + obj2);
    }

    public static /* synthetic */ void i(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void j(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    @Override // defpackage.na1
    public boolean a() {
        return false;
    }

    @Override // defpackage.z41
    public Object apply(Object obj) {
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                i8 a = cc.a();
                a.r(rawQuery.getString(1));
                a.h = ez0.b(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                a.g = string == null ? null : Base64.decode(string, 0);
                arrayList.add(a.b());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    @Override // defpackage.ak
    public Object f(mc mcVar) {
        gj1 lambda$getComponents$0;
        gj1 lambda$getComponents$1;
        gj1 lambda$getComponents$2;
        switch (this.d) {
            case 14:
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(mcVar);
                return lambda$getComponents$0;
            case 15:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(mcVar);
                return lambda$getComponents$1;
            default:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(mcVar);
                return lambda$getComponents$2;
        }
    }

    @Override // defpackage.zs
    public double b(double d) {
        return d;
    }
}
