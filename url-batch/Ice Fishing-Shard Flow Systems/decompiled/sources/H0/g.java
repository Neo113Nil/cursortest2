package H0;

import android.content.Context;
import android.content.SharedPreferences;
import i0.AbstractC0540a;
import kotlin.jvm.internal.Intrinsics;
import m0.C0684c;

/* loaded from: classes.dex */
public final class g extends AbstractC0540a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f899c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Context f900d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context mContext, int i2, int i5) {
        super(i2, i5);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.f900d = mContext;
    }

    @Override // i0.AbstractC0540a
    public final void a(C0684c db) {
        switch (this.f899c) {
            case 0:
                Intrinsics.checkNotNullParameter(db, "db");
                if (this.f5497b >= 10) {
                    db.s(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    this.f900d.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                Intrinsics.checkNotNullParameter(db, "db");
                db.j("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                Context context = this.f900d;
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j7 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    db.a();
                    try {
                        db.s(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                        db.s(new Object[]{"reschedule_needed", Long.valueOf(j7)});
                        sharedPreferences.edit().clear().apply();
                        db.G();
                    } finally {
                    }
                }
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(db, "sqLiteDatabase");
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i2 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i5 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    db.a();
                    try {
                        db.s(new Object[]{"next_job_scheduler_id", Integer.valueOf(i2)});
                        db.s(new Object[]{"next_alarm_manager_id", Integer.valueOf(i5)});
                        sharedPreferences2.edit().clear().apply();
                        db.G();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        super(9, 10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f900d = context;
    }
}
