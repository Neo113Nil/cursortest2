package m0;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final WorkDatabase f18839a;

    public c(WorkDatabase workDatabase) {
        this.f18839a = workDatabase;
    }

    public static void a(Context context, w.b bVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i7 = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i8 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            bVar.g();
            try {
                bVar.B("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i7)});
                bVar.B("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i8)});
                sharedPreferences.edit().clear().apply();
                bVar.A();
            } finally {
                bVar.d();
            }
        }
    }

    private int c(String str) {
        this.f18839a.c();
        try {
            Long b7 = this.f18839a.x().b(str);
            int i7 = 0;
            int intValue = b7 != null ? b7.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i7 = intValue + 1;
            }
            e(str, i7);
            this.f18839a.r();
            return intValue;
        } finally {
            this.f18839a.g();
        }
    }

    private void e(String str, int i7) {
        this.f18839a.x().a(new l0.d(str, i7));
    }

    public int b() {
        int c7;
        synchronized (c.class) {
            c7 = c("next_alarm_manager_id");
        }
        return c7;
    }

    public int d(int i7, int i8) {
        synchronized (c.class) {
            int c7 = c("next_job_scheduler_id");
            if (c7 >= i7 && c7 <= i8) {
                i7 = c7;
            }
            e("next_job_scheduler_id", i7 + 1);
        }
        return i7;
    }
}
