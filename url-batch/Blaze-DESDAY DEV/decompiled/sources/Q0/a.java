package Q0;

import android.content.Context;
import android.content.SharedPreferences;
import g1.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f734a;

    public a(Context context) {
        d.e(context, "context");
        this.f734a = context.getSharedPreferences("win_worm_progress", 0);
    }
}
