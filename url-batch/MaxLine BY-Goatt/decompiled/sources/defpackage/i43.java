package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.encoders.json.BuildConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class i43 {
    public long a;
    public final Object b;
    public final Object c;

    public i43(tc3 tc3Var, String str, long j) {
        this.c = tc3Var;
        ll3.s(str);
        this.b = str;
        this.a = tc3Var.h0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j)}, -1L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public List a() {
        ArrayList arrayList;
        tc3 tc3Var = (tc3) this.c;
        ArrayList arrayList2 = new ArrayList();
        String str = (String) this.b;
        Cursor cursor = null;
        try {
            try {
                cursor = tc3Var.l0().query("raw_events", new String[]{"rowid", "name", SDKConstants.PARAM_DEBUG_MESSAGE_TIMESTAMP, "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{str, String.valueOf(this.a)}, null, null, "rowid", "1000");
                if (cursor.moveToFirst()) {
                    do {
                        long j = cursor.getLong(0);
                        long j2 = cursor.getLong(3);
                        boolean z = cursor.getLong(5) == 1;
                        byte[] blob = cursor.getBlob(4);
                        if (j > this.a) {
                            this.a = j;
                        }
                        try {
                            bj3 bj3Var = (bj3) bi3.j0(cj3.z(), blob);
                            String string = cursor.getString(1);
                            if (string == null) {
                                string = BuildConfig.FLAVOR;
                            }
                            bj3Var.b();
                            ((cj3) bj3Var.n).F(string);
                            long j3 = cursor.getLong(2);
                            bj3Var.b();
                            ((cj3) bj3Var.n).G(j3);
                            arrayList2.add(new oc3(j, j2, z, (cj3) bj3Var.d()));
                        } catch (IOException e) {
                            vh3 vh3Var = ((pj3) tc3Var.m).r;
                            pj3.m(vh3Var);
                            vh3Var.r.d(vh3.E(str), e, "Data loss. Failed to merge raw event. appId");
                        }
                    } while (cursor.moveToNext());
                } else {
                    arrayList = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e2) {
                vh3 vh3Var2 = ((pj3) tc3Var.m).r;
                pj3.m(vh3Var2);
                vh3Var2.r.d(vh3.E(str), e2, "Data loss. Error querying raw events batch. appId");
                arrayList = arrayList2;
            }
            return arrayList;
        } finally {
            if (0 != 0) {
                cursor.close();
            }
        }
    }

    public i43(tc3 tc3Var, String str) {
        this.c = tc3Var;
        ll3.s(str);
        this.b = str;
        this.a = -1L;
    }

    public i43() {
        g43 g43Var = g43.m;
        this.b = new h43();
        this.c = new h43();
    }
}
