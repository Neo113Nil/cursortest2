package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.x;
import b6.a;
import d6.b;
import f8.j0;
import java.util.UUID;
import t5.o;
import u5.m;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class SystemForegroundService extends x {

    /* renamed from: t, reason: collision with root package name */
    public static final String f783t = o.f("SystemFgService");

    /* renamed from: e, reason: collision with root package name */
    public Handler f784e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f785i;

    /* renamed from: r, reason: collision with root package name */
    public a f786r;

    /* renamed from: s, reason: collision with root package name */
    public NotificationManager f787s;

    public final void c() {
        this.f784e = new Handler(Looper.getMainLooper());
        this.f787s = (NotificationManager) getApplicationContext().getSystemService("notification");
        a aVar = new a(getApplicationContext());
        this.f786r = aVar;
        if (aVar.f1224w != null) {
            o.d().b(a.f1215x, "A callback already exists.");
        } else {
            aVar.f1224w = this;
        }
    }

    @Override // androidx.lifecycle.x, android.app.Service
    public final void onCreate() {
        super.onCreate();
        c();
    }

    @Override // androidx.lifecycle.x, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f786r.g();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i3, int i10) {
        super.onStartCommand(intent, i3, i10);
        boolean z10 = this.f785i;
        String str = f783t;
        if (z10) {
            o.d().e(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f786r.g();
            c();
            this.f785i = false;
        }
        if (intent == null) {
            return 3;
        }
        a aVar = this.f786r;
        aVar.getClass();
        String str2 = a.f1215x;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            o.d().e(str2, "Started foreground service " + intent);
            aVar.f1217e.a(new j0(1, aVar, intent.getStringExtra("KEY_WORKSPEC_ID"), false));
            aVar.e(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            aVar.e(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            o.d().e(str2, "Stopping foreground service");
            SystemForegroundService systemForegroundService = aVar.f1224w;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.f785i = true;
            o.d().a(str, "All commands completed.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
            return 3;
        }
        o.d().e(str2, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        m mVar = aVar.f1216d;
        UUID fromString = UUID.fromString(stringExtra);
        mVar.getClass();
        mVar.f9652d.a(new b(mVar, fromString, 0));
        return 3;
    }
}
