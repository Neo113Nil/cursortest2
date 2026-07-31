package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.Preference;

@RestrictTo
/* loaded from: classes8.dex */
public class PreferenceUtils {
    private final WorkDatabase mWorkDatabase;

    public PreferenceUtils(WorkDatabase workDatabase) {
        this.mWorkDatabase = workDatabase;
    }

    public long getLastCancelAllTimeMillis() {
        Long longValue = this.mWorkDatabase.preferenceDao().getLongValue("last_cancel_all_time_ms");
        if (longValue != null) {
            return longValue.longValue();
        }
        return 0L;
    }

    /* renamed from: androidx.work.impl.utils.PreferenceUtils$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass1 implements Function<Long, Long> {
        @Override // androidx.arch.core.util.Function
        public Long apply(Long l) {
            return Long.valueOf(l != null ? l.longValue() : 0L);
        }
    }

    public void setLastCancelAllTimeMillis(long j) {
        this.mWorkDatabase.preferenceDao().insertPreference(new Preference("last_cancel_all_time_ms", Long.valueOf(j)));
    }

    public boolean getNeedsReschedule() {
        Long longValue = this.mWorkDatabase.preferenceDao().getLongValue("reschedule_needed");
        return longValue != null && longValue.longValue() == 1;
    }

    public void setNeedsReschedule(boolean z) {
        this.mWorkDatabase.preferenceDao().insertPreference(new Preference("reschedule_needed", z));
    }

    public void setLastForceStopEventMillis(long j) {
        this.mWorkDatabase.preferenceDao().insertPreference(new Preference("last_force_stop_ms", Long.valueOf(j)));
    }

    public long getLastForceStopEventMillis() {
        Long longValue = this.mWorkDatabase.preferenceDao().getLongValue("last_force_stop_ms");
        if (longValue != null) {
            return longValue.longValue();
        }
        return 0L;
    }

    public static void migrateLegacyPreferences(Context context, SupportSQLiteDatabase supportSQLiteDatabase) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            supportSQLiteDatabase.beginTransaction();
            try {
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j2)});
                sharedPreferences.edit().clear().apply();
                supportSQLiteDatabase.setTransactionSuccessful();
            } finally {
                supportSQLiteDatabase.endTransaction();
            }
        }
    }
}
