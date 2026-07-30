package androidx.work.impl.foreground;

import F.a;
import G0.s;
import H0.p;
import O0.b;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.AbstractServiceC0259z;
import java.util.UUID;

/* loaded from: classes.dex */
public class SystemForegroundService extends AbstractServiceC0259z {

    /* renamed from: n, reason: collision with root package name */
    public static final String f4117n = s.f("SystemFgService");

    /* renamed from: e, reason: collision with root package name */
    public Handler f4118e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4119i;

    /* renamed from: l, reason: collision with root package name */
    public b f4120l;

    /* renamed from: m, reason: collision with root package name */
    public NotificationManager f4121m;

    public final void a() {
        this.f4118e = new Handler(Looper.getMainLooper());
        this.f4121m = (NotificationManager) getApplicationContext().getSystemService("notification");
        b bVar = new b(getApplicationContext());
        this.f4120l = bVar;
        if (bVar.f1912q != null) {
            s.d().b(b.f1903r, "A callback already exists.");
        } else {
            bVar.f1912q = this;
        }
    }

    @Override // androidx.lifecycle.AbstractServiceC0259z, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.AbstractServiceC0259z, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f4120l.g();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i2, int i5) {
        super.onStartCommand(intent, i2, i5);
        boolean z7 = this.f4119i;
        String str = f4117n;
        if (z7) {
            s.d().e(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f4120l.g();
            a();
            this.f4119i = false;
        }
        if (intent == null) {
            return 3;
        }
        b bVar = this.f4120l;
        bVar.getClass();
        String str2 = b.f1903r;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            s.d().e(str2, "Started foreground service " + intent);
            bVar.f1905e.r(new a(17, bVar, intent.getStringExtra("KEY_WORKSPEC_ID"), false));
            bVar.f(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            bVar.f(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            s.d().e(str2, "Stopping foreground service");
            SystemForegroundService systemForegroundService = bVar.f1912q;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.f4119i = true;
            s.d().a(str, "All commands completed.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
            return 3;
        }
        s.d().e(str2, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        p pVar = bVar.f1904d;
        UUID fromString = UUID.fromString(stringExtra);
        pVar.getClass();
        pVar.f921d.r(new Q0.b(pVar, fromString, 0));
        return 3;
    }
}
