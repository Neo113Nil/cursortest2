package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Looper;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class mi2 implements y53 {
    public static Object d(jt2 jt2Var) {
        ll3.u("Must not be called on the main application thread");
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            lh.g("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        ll3.w(jt2Var, "Task must not be null");
        if (jt2Var.l()) {
            return s(jt2Var);
        }
        ob3 ob3Var = new ob3();
        Executor executor = lt2.b;
        jt2Var.e(executor, ob3Var);
        jt2Var.d(executor, ob3Var);
        jt2Var.a(executor, ob3Var);
        ob3Var.m.await();
        return s(jt2Var);
    }

    public static Object e(jt2 jt2Var, long j, TimeUnit timeUnit) {
        ll3.u("Must not be called on the main application thread");
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            lh.g("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        ll3.w(jt2Var, "Task must not be null");
        ll3.w(timeUnit, "TimeUnit must not be null");
        if (jt2Var.l()) {
            return s(jt2Var);
        }
        ob3 ob3Var = new ob3();
        Executor executor = lt2.b;
        jt2Var.e(executor, ob3Var);
        jt2Var.d(executor, ob3Var);
        jt2Var.a(executor, ob3Var);
        if (ob3Var.m.await(j, timeUnit)) {
            return s(jt2Var);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static ys3 f(Callable callable, Executor executor) {
        ll3.w(executor, "Executor must not be null");
        ys3 ys3Var = new ys3();
        executor.execute(new pn3(7, ys3Var, callable, false));
        return ys3Var;
    }

    public static final int g(CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final int h(CharSequence charSequence, int i) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    public static ys3 i(Exception exc) {
        ys3 ys3Var = new ys3();
        ys3Var.p(exc);
        return ys3Var;
    }

    public static ys3 j(Object obj) {
        ys3 ys3Var = new ys3();
        ys3Var.q(obj);
        return ys3Var;
    }

    public static final long k(double d) {
        return n(4294967296L, (float) d);
    }

    public static final long l(int i) {
        return n(4294967296L, i);
    }

    public static final bw2 m(sh2 sh2Var) {
        Function1 function1;
        ArrayList arrayList = new ArrayList();
        Object g = sh2Var.m.g(rh2.a);
        if (g == null) {
            g = null;
        }
        r1 r1Var = (r1) g;
        if (r1Var == null || (function1 = (Function1) r1Var.b) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (bw2) arrayList.get(0);
    }

    public static final long n(long j, float f) {
        long floatToRawIntBits = j | (Float.floatToRawIntBits(f) & 4294967295L);
        tw2[] tw2VarArr = sw2.b;
        return floatToRawIntBits;
    }

    public static final void o(ec ecVar, int i) {
        Object obj;
        Iterator<T> it = ecVar.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((i91) ((Map.Entry) obj).getKey()).n == i) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null || entry.getValue() == null) {
            return;
        }
        b71.o();
    }

    public static final Object p(we2 we2Var, we2 we2Var2, Function2 function2) {
        Object gxVar;
        Object V;
        try {
            s03.f(2, function2);
            gxVar = function2.invoke(we2Var2, we2Var);
        } catch (Throwable th) {
            gxVar = new gx(th, false);
        }
        b50 b50Var = b50.m;
        if (gxVar == b50Var || (V = we2Var.V(gxVar)) == j8.h) {
            return b50Var;
        }
        if (V instanceof gx) {
            throw ((gx) V).a;
        }
        return j8.Y(V);
    }

    public static final String q(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static int r(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    public static Object s(jt2 jt2Var) {
        if (jt2Var.m()) {
            return jt2Var.i();
        }
        if (jt2Var.k()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(jt2Var.h());
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r0 == false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:14:0x0044, B:17:0x0074, B:19:0x0082, B:21:0x008a, B:23:0x008d, B:24:0x00b6, B:28:0x00bc, B:30:0x00bf, B:32:0x00c7, B:34:0x00ce, B:37:0x00d1, B:39:0x00d7, B:44:0x00e6, B:45:0x00ea, B:16:0x006d), top: B:13:0x0044, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc A[Catch: SQLiteException -> 0x00b7, LOOP:1: B:28:0x00bc->B:34:0x00ce, LOOP_START, PHI: r1
      0x00bc: PHI (r1v5 int) = (r1v4 int), (r1v6 int) binds: [B:27:0x00ba, B:34:0x00ce] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:14:0x0044, B:17:0x0074, B:19:0x0082, B:21:0x008a, B:23:0x008d, B:24:0x00b6, B:28:0x00bc, B:30:0x00bf, B:32:0x00c7, B:34:0x00ce, B:37:0x00d1, B:39:0x00d7, B:44:0x00e6, B:45:0x00ea, B:16:0x006d), top: B:13:0x0044, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:14:0x0044, B:17:0x0074, B:19:0x0082, B:21:0x008a, B:23:0x008d, B:24:0x00b6, B:28:0x00bc, B:30:0x00bf, B:32:0x00c7, B:34:0x00ce, B:37:0x00d1, B:39:0x00d7, B:44:0x00e6, B:45:0x00ea, B:16:0x006d), top: B:13:0x0044, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void t(vh3 vh3Var, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        SQLiteDatabase sQLiteDatabase2;
        Throwable th;
        Cursor cursor;
        HashSet hashSet;
        Cursor rawQuery;
        if (vh3Var == null) {
            lh.e("Monitor must not be null");
            return;
        }
        Cursor cursor2 = null;
        try {
            try {
                sQLiteDatabase2 = sQLiteDatabase;
            } catch (Throwable th2) {
                th = th2;
                if (cursor2 != null) {
                }
            }
        } catch (SQLiteException e) {
            e = e;
            sQLiteDatabase2 = sQLiteDatabase;
        }
        try {
            cursor = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
            try {
                try {
                    boolean moveToFirst = cursor.moveToFirst();
                    cursor.close();
                } catch (SQLiteException e2) {
                    e = e2;
                    vh3Var.u.d(str, e, "Error querying for table");
                    if (cursor != null) {
                        cursor.close();
                    }
                    sQLiteDatabase2.execSQL(str2);
                    try {
                        hashSet = new HashSet();
                        StringBuilder sb = new StringBuilder(str.length() + 22);
                        sb.append("SELECT * FROM ");
                        sb.append(str);
                        sb.append(" LIMIT 0");
                        rawQuery = sQLiteDatabase2.rawQuery(sb.toString(), null);
                        try {
                            Collections.addAll(hashSet, rawQuery.getColumnNames());
                            rawQuery.close();
                            for (String str4 : str3.split(",")) {
                                if (!hashSet.remove(str4)) {
                                    StringBuilder sb2 = new StringBuilder(str.length() + 35 + String.valueOf(str4).length());
                                    sb2.append("Table ");
                                    sb2.append(str);
                                    sb2.append(" is missing required column: ");
                                    sb2.append(str4);
                                    throw new SQLiteException(sb2.toString());
                                }
                            }
                            if (strArr != null) {
                                for (int i = 0; i < strArr.length; i += 2) {
                                    if (!hashSet.remove(strArr[i])) {
                                        sQLiteDatabase2.execSQL(strArr[i + 1]);
                                    }
                                }
                            }
                            if (hashSet.isEmpty()) {
                                vh3Var.u.d(str, TextUtils.join(", ", hashSet), "Table has extra columns. table, columns");
                            }
                        } catch (Throwable th3) {
                            rawQuery.close();
                            throw th3;
                        }
                    } catch (SQLiteException e3) {
                        vh3Var.r.c(str, "Failed to verify columns on table that was just created");
                        throw e3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                cursor2 = cursor;
                if (cursor2 != null) {
                    throw th;
                }
                cursor2.close();
                throw th;
            }
        } catch (SQLiteException e4) {
            e = e4;
            cursor = null;
            vh3Var.u.d(str, e, "Error querying for table");
            if (cursor != null) {
            }
            sQLiteDatabase2.execSQL(str2);
            hashSet = new HashSet();
            StringBuilder sb3 = new StringBuilder(str.length() + 22);
            sb3.append("SELECT * FROM ");
            sb3.append(str);
            sb3.append(" LIMIT 0");
            rawQuery = sQLiteDatabase2.rawQuery(sb3.toString(), null);
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            rawQuery.close();
            while (r3 < r0) {
            }
            if (strArr != null) {
            }
            if (hashSet.isEmpty()) {
            }
        }
    }

    public static void u(vh3 vh3Var, SQLiteDatabase sQLiteDatabase) {
        if (vh3Var == null) {
            lh.e("Monitor must not be null");
            return;
        }
        g10 g10Var = vh3Var.u;
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            g10Var.b("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            g10Var.b("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            g10Var.b("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        g10Var.b("Failed to turn on database write permission for owner");
    }

    @Override // defpackage.y53
    public void b() {
    }

    @Override // defpackage.y53
    public void c() {
    }
}
