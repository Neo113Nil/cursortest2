package O0;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f604a;

    public a(Context context) {
        Z0.d.e(context, "context");
        this.f604a = context.getSharedPreferences("fortune_eye_app", 0);
    }
}
