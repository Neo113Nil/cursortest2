package androidx.work.impl.foreground;

import A.a;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.AbstractServiceC0256x;
import java.util.UUID;
import l0.q;
import m0.o;
import t0.C0650b;
import v0.b;

/* loaded from: classes.dex */
public class SystemForegroundService extends AbstractServiceC0256x {

    /* renamed from: k, reason: collision with root package name */
    public static final String f3588k = q.f("SystemFgService");

    /* renamed from: g, reason: collision with root package name */
    public Handler f3589g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3590h;

    /* renamed from: i, reason: collision with root package name */
    public C0650b f3591i;

    /* renamed from: j, reason: collision with root package name */
    public NotificationManager f3592j;

    public final void a() {
        this.f3589g = new Handler(Looper.getMainLooper());
        this.f3592j = (NotificationManager) getApplicationContext().getSystemService("notification");
        C0650b c0650b = new C0650b(getApplicationContext());
        this.f3591i = c0650b;
        if (c0650b.f5953n != null) {
            q.d().b(C0650b.f5944o, "A callback already exists.");
        } else {
            c0650b.f5953n = this;
        }
    }

    @Override // androidx.lifecycle.AbstractServiceC0256x, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.AbstractServiceC0256x, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f3591i.g();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i8) {
        super.onStartCommand(intent, i7, i8);
        boolean z5 = this.f3590h;
        String str = f3588k;
        if (z5) {
            q.d().e(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f3591i.g();
            a();
            this.f3590h = false;
        }
        if (intent == null) {
            return 3;
        }
        C0650b c0650b = this.f3591i;
        c0650b.getClass();
        String str2 = C0650b.f5944o;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            q.d().e(str2, "Started foreground service " + intent);
            c0650b.f5946g.a(new a(c0650b, intent.getStringExtra("KEY_WORKSPEC_ID"), 26, false));
            c0650b.e(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            c0650b.e(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            q.d().e(str2, "Stopping foreground service");
            SystemForegroundService systemForegroundService = c0650b.f5953n;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.f3590h = true;
            q.d().a(str, "All commands completed.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
            return 3;
        }
        q.d().e(str2, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        o oVar = c0650b.f5945f;
        UUID fromString = UUID.fromString(stringExtra);
        oVar.getClass();
        oVar.f5376d.a(new b(oVar, fromString, 0));
        return 3;
    }
}
