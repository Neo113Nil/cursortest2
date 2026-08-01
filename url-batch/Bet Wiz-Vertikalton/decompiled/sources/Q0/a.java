package Q0;

import android.content.Context;
import android.content.SharedPreferences;
import e1.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f727a;

    public a(Context context) {
        d.e(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("win_node_progress", 0);
        d.d(sharedPreferences, "getSharedPreferences(...)");
        this.f727a = sharedPreferences;
    }
}
