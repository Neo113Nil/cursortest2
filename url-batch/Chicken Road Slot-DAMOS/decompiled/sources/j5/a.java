package j5;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.o;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f5030a;

    public a(int i3) {
        this.f5030a = i3;
    }

    public static void a(String str) {
        if (o.f(str, ":memory:", true)) {
            return;
        }
        int length = str.length() - 1;
        int i3 = 0;
        boolean z10 = false;
        while (i3 <= length) {
            boolean z11 = Intrinsics.b(str.charAt(!z10 ? i3 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                } else {
                    length--;
                }
            } else if (z11) {
                i3++;
            } else {
                z10 = true;
            }
        }
        if (str.subSequence(i3, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e2) {
            Log.w("SupportSQLite", "delete failed: ", e2);
        }
    }

    public abstract void c(k5.d dVar);

    public abstract void d(k5.d dVar, int i3, int i10);

    public abstract void e(k5.d dVar);

    public abstract void f(k5.d dVar, int i3, int i10);

    public void b(k5.d dVar) {
    }
}
