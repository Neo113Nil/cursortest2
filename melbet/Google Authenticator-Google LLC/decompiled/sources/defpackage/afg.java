package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.StrictMode;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afg {
    static void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }

    public static final Object b(aer aerVar, aek aekVar, krx krxVar, kqj kqjVar) {
        Object f;
        ael aelVar = ((bd) aerVar).ag;
        if (aekVar == aek.b) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        }
        if (aelVar.c == aek.a || (f = kvp.f(new afm(aelVar, aekVar, krxVar, null), kqjVar)) != kqp.a) {
            f = kow.a;
        }
        return f == kqp.a ? f : kow.a;
    }

    public static final int c(amh amhVar, String str) {
        int a = amhVar.a();
        for (int i = 0; i < a; i++) {
            if (ksp.b(str, amhVar.c(i))) {
                return i;
            }
        }
        return -1;
    }

    public static final int d(amh amhVar, String str) {
        int e = afn.e(amhVar, str);
        if (e >= 0) {
            return e;
        }
        int a = amhVar.a();
        ArrayList arrayList = new ArrayList(a);
        for (int i = 0; i < a; i++) {
            arrayList.add(amhVar.c(i));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + ixc.y(arrayList, null, null, null, null, 63) + ']');
    }

    public static final int e(ana anaVar) {
        amh a = anaVar.a("SELECT changes()");
        try {
            a.l();
            int b = (int) a.b(0);
            ixf.i(a, null);
            return b;
        } finally {
        }
    }

    public static void f(Context context, azj azjVar, bac bacVar, List list, bkr bkrVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bkt bktVar = (bkt) it.next();
            try {
                bktVar.c(context, azjVar, bacVar);
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(String.valueOf(bktVar.getClass().getName())), e);
            }
        }
        if (bkrVar != null) {
            bkrVar.c(context, azjVar, bacVar);
        }
    }

    public static final String g(Context context, int i, Object... objArr) {
        Locale locale = Locale.getDefault();
        String string = context.getResources().getString(i);
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            int i2 = k.d;
            StringBuilder sb = new StringBuilder(string.length());
            new k(string, locale).b(0, null, null, null, objArr, new kmg(sb), null);
            return sb.toString();
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static final void h(WorkDatabase workDatabase, int i) {
        workDatabase.x().b(new axa("next_job_scheduler_id", Long.valueOf(i)));
    }
}
