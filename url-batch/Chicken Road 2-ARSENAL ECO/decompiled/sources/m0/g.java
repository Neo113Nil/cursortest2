package m0;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class g extends R.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5355c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Context f5356d;

    public g(Context context, int i7, int i8) {
        super(i7, i8);
        this.f5356d = context;
    }

    @Override // R.a
    public final void a(V.c cVar) {
        switch (this.f5355c) {
            case 0:
                if (this.f2050b >= 10) {
                    cVar.m(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    this.f5356d.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                cVar.h("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                Context context = this.f5356d;
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j4 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j7 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    cVar.a();
                    try {
                        cVar.m(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j4)});
                        cVar.m(new Object[]{"reschedule_needed", Long.valueOf(j7)});
                        sharedPreferences.edit().clear().apply();
                        cVar.G();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i7 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i8 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    cVar.a();
                    try {
                        cVar.m(new Object[]{"next_job_scheduler_id", Integer.valueOf(i7)});
                        cVar.m(new Object[]{"next_alarm_manager_id", Integer.valueOf(i8)});
                        sharedPreferences2.edit().clear().apply();
                        cVar.G();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public g(Context context) {
        super(9, 10);
        this.f5356d = context;
    }
}
