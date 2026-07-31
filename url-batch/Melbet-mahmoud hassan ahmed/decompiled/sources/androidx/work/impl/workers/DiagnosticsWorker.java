package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import d0.j;
import e0.i;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l0.g;
import l0.h;
import l0.k;
import l0.p;
import l0.q;
import l0.t;

/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* renamed from: l, reason: collision with root package name */
    private static final String f1593l = j.f("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private static String a(p pVar, String str, Integer num, String str2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", pVar.f18477a, pVar.f18479c, num, pVar.f18478b.name(), str, str2);
    }

    private static String b(k kVar, t tVar, h hVar, List<p> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id"));
        for (p pVar : list) {
            Integer num = null;
            g b7 = hVar.b(pVar.f18477a);
            if (b7 != null) {
                num = Integer.valueOf(b7.f18455b);
            }
            sb.append(a(pVar, TextUtils.join(",", kVar.b(pVar.f18477a)), num, TextUtils.join(",", tVar.b(pVar.f18477a))));
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public ListenableWorker.a doWork() {
        WorkDatabase o7 = i.k(getApplicationContext()).o();
        q B = o7.B();
        k z6 = o7.z();
        t C = o7.C();
        h y6 = o7.y();
        List<p> g7 = B.g(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List<p> b7 = B.b();
        List<p> s7 = B.s(200);
        if (g7 != null && !g7.isEmpty()) {
            j c7 = j.c();
            String str = f1593l;
            c7.d(str, "Recently completed work:\n\n", new Throwable[0]);
            j.c().d(str, b(z6, C, y6, g7), new Throwable[0]);
        }
        if (b7 != null && !b7.isEmpty()) {
            j c8 = j.c();
            String str2 = f1593l;
            c8.d(str2, "Running work:\n\n", new Throwable[0]);
            j.c().d(str2, b(z6, C, y6, b7), new Throwable[0]);
        }
        if (s7 != null && !s7.isEmpty()) {
            j c9 = j.c();
            String str3 = f1593l;
            c9.d(str3, "Enqueued work:\n\n", new Throwable[0]);
            j.c().d(str3, b(z6, C, y6, s7), new Throwable[0]);
        }
        return ListenableWorker.a.c();
    }
}
