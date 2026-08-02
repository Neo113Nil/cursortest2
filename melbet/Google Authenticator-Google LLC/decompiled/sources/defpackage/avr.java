package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class avr {
    public final ComponentName a;
    public final boolean b;

    static {
        asq.b("SystemJobInfoConverter");
    }

    public avr(Context context, boolean z) {
        this.a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.b = z;
    }
}
