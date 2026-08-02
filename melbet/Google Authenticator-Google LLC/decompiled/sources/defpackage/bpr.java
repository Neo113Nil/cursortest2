package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bpr {
    public static final hkh a = hkh.l("com/google/android/apps/authenticator2/db/OtpLocalDatabaseImpl");
    public final hvl b;
    public final hvl c;
    public final cbe d;
    public final bst e;
    private final bpx f;

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, koe] */
    public bpr(ikm ikmVar, bpx bpxVar, cbe cbeVar, hvl hvlVar, hvl hvlVar2) {
        fdp fdpVar = new fdp();
        fdpVar.a("CREATE TABLE otp_table(ordering INTEGER PRIMARY KEY, unique_id TEXT UNIQUE NOT NULL, name TEXT NOT NULL, issuer TEXT, secret TEXT, otp_type TEXT, counter INTEGER, timestamp INTEGER, is_deleted INTEGER, algorithm_deleted TEXT NOT NULL, digits_deleted INTEGER)");
        iwq b = fdpVar.b();
        gpk gpkVar = new gpk(1, 2);
        Object obj = ikmVar.a;
        hoq.x(true ^ "otp_database".contains(File.separator));
        cap capVar = new cap(ikmVar, gpkVar, 10);
        iyi iyiVar = (iyi) obj;
        Context b2 = ((jrk) iyiVar.c).b();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) iyiVar.a.b();
        scheduledExecutorService.getClass();
        bst bstVar = (bst) iyiVar.b.b();
        bstVar.getClass();
        this.e = new bst(new fdl(b2, scheduledExecutorService, bstVar, capVar, b));
        this.f = bpxVar;
        this.d = cbeVar;
        this.c = hvlVar2;
        this.b = hvlVar;
    }

    public static final int i(fwm fwmVar, String str, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("is_deleted", (Boolean) true);
        contentValues.put("timestamp", Long.valueOf(j));
        return fwmVar.j(contentValues, str);
    }

    public final bpc a(Cursor cursor) {
        try {
            String string = cursor.getString(cursor.getColumnIndexOrThrow("otp_type"));
            bpt.a(string);
            bpb bpbVar = new bpb();
            bpbVar.e(cursor.getString(cursor.getColumnIndexOrThrow("name")));
            bpbVar.a = cursor.getString(cursor.getColumnIndexOrThrow("issuer"));
            bpbVar.g(this.f.a(cursor.getString(cursor.getColumnIndexOrThrow("secret"))));
            bpbVar.f(string);
            bpbVar.b = string.equals("totp") ? null : Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow("counter")));
            bpbVar.h(cursor.getLong(cursor.getColumnIndexOrThrow("timestamp")));
            boolean z = true;
            if (cursor.getInt(cursor.getColumnIndexOrThrow("is_deleted")) != 1) {
                z = false;
            }
            bpbVar.d(z);
            bpbVar.b(bpa.a(cursor.getString(cursor.getColumnIndexOrThrow("algorithm_deleted"))).d);
            bpbVar.c(cursor.getInt(cursor.getColumnIndexOrThrow("digits_deleted")));
            bpbVar.i(cursor.getString(cursor.getColumnIndexOrThrow("unique_id")));
            bpbVar.c = null;
            return bpbVar.a();
        } catch (boz | bps | bpv | IllegalArgumentException e) {
            throw new bpd(e);
        }
    }

    public final hvi b(bpc bpcVar) {
        gwu g = gwu.g(this.d.a());
        bpg bpgVar = new bpg(this, bpcVar, 7, null);
        hvl hvlVar = this.b;
        return g.i(bpgVar, hvlVar).h(new bpf(bpcVar, 4), hvlVar);
    }

    public final hvi c(List list) {
        gwu g = gwu.g(this.d.a());
        bpg bpgVar = new bpg(this, list, 5);
        hvl hvlVar = this.b;
        return g.i(bpgVar, hvlVar).h(new bpf(list, 3), hvlVar);
    }

    public final hvi d(String str) {
        return this.e.p(new bpi(str, 2));
    }

    public final hvi e(String str, long j) {
        return hoq.au(this.d.a(), new bpm(this, str, j, 1), this.b);
    }

    public final hvi f(bpc bpcVar) {
        return hoq.au(this.d.a(), new bpg(this, bpcVar, 1, null), this.b);
    }

    public final hvi g(final String str, final int i) {
        return this.e.p(new fds() { // from class: bpq
            @Override // defpackage.fds
            public final Object a(fwm fwmVar) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("ordering", Integer.valueOf(i));
                if (fwmVar.j(contentValues, str) > 0) {
                    return null;
                }
                throw new bpd("Could not update the reordering id of an otp in the local database.");
            }
        });
    }

    public final void h(fwm fwmVar, bpc bpcVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("unique_id", bpcVar.g);
        contentValues.put("name", bpcVar.b);
        contentValues.put("issuer", bpcVar.c);
        contentValues.put("otp_type", bpcVar.e);
        contentValues.put("secret", this.f.b(bpcVar.d));
        contentValues.put("counter", bpcVar.f);
        contentValues.put("timestamp", Long.valueOf(bpcVar.j));
        contentValues.put("is_deleted", Boolean.valueOf(bpcVar.k));
        contentValues.put("algorithm_deleted", bpcVar.h);
        contentValues.put("digits_deleted", Integer.valueOf(bpcVar.i));
        fwm.i();
        gty aC = hoq.aC(71, "INSERT WITH ON CONFLICT otp_table");
        try {
            ((SQLiteDatabase) fwmVar.b).insertWithOnConflict("otp_table", null, contentValues, 5);
            aC.close();
        } catch (Throwable th) {
            try {
                aC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
