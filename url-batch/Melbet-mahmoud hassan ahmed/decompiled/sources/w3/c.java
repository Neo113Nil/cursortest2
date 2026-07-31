package w3;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private static c f23017b = new c();

    /* renamed from: a, reason: collision with root package name */
    private b f23018a = null;

    @RecentlyNonNull
    public static b a(@RecentlyNonNull Context context) {
        return f23017b.b(context);
    }

    @RecentlyNonNull
    public final synchronized b b(@RecentlyNonNull Context context) {
        if (this.f23018a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f23018a = new b(context);
        }
        return this.f23018a;
    }
}
