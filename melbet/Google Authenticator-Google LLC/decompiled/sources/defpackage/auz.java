package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auz extends alk {
    private final Context c;

    public auz(Context context) {
        super(9, 10);
        this.c = context;
    }

    @Override // defpackage.alk
    public final void a(amj amjVar) {
        amjVar.e("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        SharedPreferences sharedPreferences = this.c.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j2 = true == sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            amjVar.b();
            try {
                amjVar.j(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                amjVar.j(new Object[]{"reschedule_needed", Long.valueOf(j2)});
                sharedPreferences.edit().clear().apply();
                amjVar.f();
            } finally {
            }
        }
        SharedPreferences sharedPreferences2 = this.c.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
            int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
            int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
            amjVar.b();
            try {
                amjVar.j(new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                amjVar.j(new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                sharedPreferences2.edit().clear().apply();
                amjVar.f();
            } finally {
            }
        }
    }
}
