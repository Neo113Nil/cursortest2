package x;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f17321a;

    public l(Context context) {
        this.f17321a = context.getSharedPreferences("artillery_man_help", 0);
    }

    public long a(String str, long j8) {
        return this.f17321a.getLong(str, j8);
    }

    public Boolean b(String str, long j8) {
        SharedPreferences.Editor edit = this.f17321a.edit();
        edit.putLong(str, j8);
        return Boolean.valueOf(edit.commit());
    }
}
