package p0;

import android.content.Context;
import android.content.SharedPreferences;
import b1.d;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: p0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0268c {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f3420a;

    /* renamed from: b, reason: collision with root package name */
    public final SimpleDateFormat f3421b;

    public C0268c(Context context) {
        d.e(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("fortune_water", 0);
        d.d(sharedPreferences, "getSharedPreferences(...)");
        this.f3420a = sharedPreferences;
        this.f3421b = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    }

    public final void a() {
        SimpleDateFormat simpleDateFormat = this.f3421b;
        String format = simpleDateFormat.format(new Date());
        d.d(format, "format(...)");
        SharedPreferences sharedPreferences = this.f3420a;
        String string = sharedPreferences.getString("today_date", null);
        if (d.a(string, format)) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.add(6, -1);
        String format2 = simpleDateFormat.format(calendar.getTime());
        d.d(format2, "format(...)");
        int i = sharedPreferences.getInt("today_intake_ml", 0);
        int i2 = sharedPreferences.getInt("daily_goal_ml", 2000);
        int i3 = sharedPreferences.getInt("streak_days", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (d.a(string, format2) && i >= i2) {
            edit.putInt("streak_days", i3 + 1);
        } else if (string != null && !string.equals(format2)) {
            edit.putInt("streak_days", 0);
        }
        edit.putString("today_date", format);
        edit.putInt("today_intake_ml", 0);
        edit.putBoolean("goal_shown", false);
        edit.commit();
    }
}
