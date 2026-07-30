package K0;

import G0.s;
import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final String f1420b = s.f("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f1421a;

    public a(Context context) {
        this.f1421a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
