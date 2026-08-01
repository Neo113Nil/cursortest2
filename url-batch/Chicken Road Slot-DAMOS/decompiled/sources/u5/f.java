package u5;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f extends c5.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9633c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Context f9634d;

    public f(Context context) {
        super(9, 10);
        this.f9634d = context;
    }

    @Override // c5.a
    public final void a(k5.d dVar) {
        int i3 = this.f9633c;
        dVar.getClass();
        switch (i3) {
            case 0:
                if (this.f1804b >= 10) {
                    dVar.m(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    this.f9634d.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                dVar.j("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                Context context = this.f9634d;
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j3 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    dVar.a();
                    try {
                        dVar.m(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                        dVar.m(new Object[]{"reschedule_needed", Long.valueOf(j3)});
                        sharedPreferences.edit().clear().apply();
                        dVar.p();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i10 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i11 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    dVar.a();
                    try {
                        dVar.m(new Object[]{"next_job_scheduler_id", Integer.valueOf(i10)});
                        dVar.m(new Object[]{"next_alarm_manager_id", Integer.valueOf(i11)});
                        sharedPreferences2.edit().clear().apply();
                        dVar.p();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public f(Context context, int i3, int i10) {
        super(i3, i10);
        this.f9634d = context;
    }
}
