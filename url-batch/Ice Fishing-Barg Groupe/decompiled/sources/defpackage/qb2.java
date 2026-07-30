package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class qb2 {
    public static final pb2 Companion = new pb2();
    public final int PxuCJdSBwIXG;

    public qb2(int i) {
        this.PxuCJdSBwIXG = i;
    }

    public static void PxuCJdSBwIXG(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = cs0.gPXPFXrUH4XX(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    public abstract void TSizfFm2Yiuu(pd0 pd0Var, int i, int i2);

    public abstract void Y1f8riQaR6yg(pd0 pd0Var);

    public abstract void e9gEMXR7LXtO(pd0 pd0Var, int i, int i2);

    public abstract void lS5Rgt96tfkO(pd0 pd0Var);
}
