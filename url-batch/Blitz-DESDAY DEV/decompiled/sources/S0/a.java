package S0;

import android.content.Context;
import android.content.SharedPreferences;
import g1.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f800a;

    public a(Context context) {
        d.e(context, "context");
        this.f800a = context.getSharedPreferences("win_four_progress", 0);
    }
}
