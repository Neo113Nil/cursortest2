package S0;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final NotificationManager f3275a;

    static {
        new HashSet();
    }

    public d(Context context) {
        this.f3275a = (NotificationManager) context.getSystemService("notification");
    }
}
