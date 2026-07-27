package v0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import s0.s;

/* renamed from: v0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1489d extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12061a = s.f("ConstraintProxy");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        s.d().a(f12061a, "onReceive : " + intent);
        String str = C1488c.f12056e;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}
