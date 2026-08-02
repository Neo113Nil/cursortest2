package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cbe {
    public static final hkh a = hkh.l("com/google/android/apps/authenticator2/pretiktokdbmigration/PreTikTokDatabaseMigrationImpl");
    public final Context b;
    public final fug c;
    public final bov d;
    public final hvl e;
    public final bpx f;
    public final bry g;
    public final fde h;
    public final cbp i;
    public final bst j;
    private final gbc k;

    public cbe(Context context, bpx bpxVar, iyi iyiVar, fde fdeVar, fug fugVar, cbp cbpVar, bry bryVar, bov bovVar, hvl hvlVar) {
        this.b = context;
        this.f = bpxVar;
        this.h = fdeVar;
        this.c = fugVar;
        this.i = cbpVar;
        this.g = bryVar;
        this.d = bovVar;
        this.e = hvlVar;
        fdp fdpVar = new fdp();
        fdpVar.a("CREATE TABLE IF NOT EXISTS accounts(_id INTEGER PRIMARY KEY,email TEXT NOT NULL,secret TEXT NOT NULL,counter INTEGER DEFAULT 0,type INTEGER,provider INTEGER DEFAULT 0,issuer TEXT DEFAULT NULL,original_name TEXT DEFAULT NULL,isencrypted INTEGER DEFAULT 0,obfuscated_gaia_id TEXT NOT NULL,otp_timestamp INTEGER,is_deleted INTEGER DEFAULT 0,unique_id TEXT NOT NULL,algorithm TEXT DEFAULT 'SHA1',digits INTEGER DEFAULT 6)");
        this.j = iyiVar.B("databases", fdpVar.b());
        this.k = new gbc(new cbc(this, 0), hvlVar);
    }

    public final hvi a() {
        return this.k.c();
    }
}
