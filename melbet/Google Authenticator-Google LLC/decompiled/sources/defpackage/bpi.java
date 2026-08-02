package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bpi implements fds {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ bpi(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v18, types: [fdt, java.lang.Object] */
    @Override // defpackage.fds
    public final Object a(fwm fwmVar) {
        Cursor p;
        int i = this.b;
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = new ArrayList();
            sb.append("SELECT * FROM otp_table");
            fwm q = exf.q(sb, arrayList);
            heg hegVar = new heg(4);
            p = fwmVar.p(q);
            Object obj = this.a;
            while (p.moveToNext()) {
                try {
                    try {
                        hegVar.h(((bpr) obj).a(p));
                    } catch (bpd e) {
                        ((hkf) ((hkf) ((hkf) bpr.a.g()).h(e)).i("com/google/android/apps/authenticator2/db/OtpLocalDatabaseImpl", "getAll", 191, "OtpLocalDatabaseImpl.java")).s("Could not obtain one OTP from the local database while getting all.");
                    }
                } finally {
                    if (p != null) {
                        try {
                            p.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                    }
                }
            }
            hel g = hegVar.g();
            if (p != null) {
                p.close();
            }
            return g;
        }
        if (i == 1) {
            ContentValues contentValues = new ContentValues();
            Object obj2 = this.a;
            bpc bpcVar = (bpc) obj2;
            contentValues.put("name", bpcVar.b);
            contentValues.put("timestamp", Long.valueOf(bpcVar.j));
            if (bpcVar.e.equals("hotp")) {
                contentValues.put("counter", bpcVar.f);
            }
            if (fwmVar.j(contentValues, bpcVar.g) > 0) {
                return obj2;
            }
            throw new bpd("Could not update an otp in the local database.");
        }
        if (i == 2) {
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            sb2.append("SELECT ordering FROM otp_table WHERE unique_id = ?");
            arrayList2.add(this.a);
            Cursor p2 = fwmVar.p(exf.q(sb2, arrayList2));
            try {
                if (!p2.moveToFirst()) {
                    if (p2 != null) {
                        p2.close();
                    }
                    throw new bpe("Otp not found in the database during a reordering");
                }
                Integer valueOf = Integer.valueOf(p2.getInt(p2.getColumnIndexOrThrow("ordering")));
                if (p2 != null) {
                    p2.close();
                }
                return valueOf;
            } finally {
            }
        }
        if (i == 3) {
            String[] strArr = {(String) this.a};
            fwm.i();
            gty aC = hoq.aC(69, "DELETE FROM otp_table WHERE unique_id = ? ");
            try {
                ((SQLiteDatabase) fwmVar.b).delete("otp_table", "unique_id = ? ", strArr);
                aC.close();
                return null;
            } catch (Throwable th2) {
                try {
                    aC.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (i != 4) {
            this.a.a(fwmVar);
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        ArrayList arrayList3 = new ArrayList();
        sb3.append("SELECT * FROM otp_table WHERE is_deleted = ?");
        arrayList3.add(0L);
        fwm q2 = exf.q(sb3, arrayList3);
        heg hegVar2 = new heg(4);
        p = fwmVar.p(q2);
        Object obj3 = this.a;
        while (p.moveToNext()) {
            try {
                try {
                    hegVar2.h(((bpr) obj3).a(p));
                } catch (bpd e2) {
                    ((hkf) ((hkf) ((hkf) bpr.a.g()).h(e2)).i("com/google/android/apps/authenticator2/db/OtpLocalDatabaseImpl", "getAllNotDeleted", 251, "OtpLocalDatabaseImpl.java")).s("Could not obtain one OTP from the local database while getting all not deleted.");
                }
            } finally {
            }
        }
        hel g2 = hegVar2.g();
        if (p != null) {
            p.close();
        }
        return g2;
    }
}
