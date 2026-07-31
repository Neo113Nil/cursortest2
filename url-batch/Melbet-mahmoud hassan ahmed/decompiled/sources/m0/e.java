package m0;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final WorkDatabase f18841a;

    public e(WorkDatabase workDatabase) {
        this.f18841a = workDatabase;
    }

    public static void b(Context context, w.b bVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j7 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j8 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            bVar.g();
            try {
                bVar.B("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j7)});
                bVar.B("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j8)});
                sharedPreferences.edit().clear().apply();
                bVar.A();
            } finally {
                bVar.d();
            }
        }
    }

    public boolean a() {
        Long b7 = this.f18841a.x().b("reschedule_needed");
        return b7 != null && b7.longValue() == 1;
    }

    public void c(boolean z6) {
        this.f18841a.x().a(new l0.d("reschedule_needed", z6));
    }
}
