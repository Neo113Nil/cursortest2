package defpackage;

import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class emw {
    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.HOURS;
    }

    public emw(Context context) {
        elh.b();
        Settings.Secure.getString(context.getContentResolver(), "android_id");
    }
}
