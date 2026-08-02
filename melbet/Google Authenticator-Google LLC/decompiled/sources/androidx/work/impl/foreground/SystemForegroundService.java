package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import defpackage.aei;
import defpackage.aeu;
import defpackage.asq;
import defpackage.avl;
import defpackage.awu;
import defpackage.awv;
import defpackage.aww;
import java.util.Objects;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SystemForegroundService extends aeu implements awu {
    public static final String a = asq.b("SystemFgService");
    awv b;
    NotificationManager c;
    private boolean d;

    private final void e() {
        this.c = (NotificationManager) getApplicationContext().getSystemService("notification");
        awv awvVar = new awv(getApplicationContext());
        this.b = awvVar;
        if (awvVar.h != null) {
            asq.a().c(awv.a, "A callback already exists.");
        } else {
            awvVar.h = this;
        }
    }

    @Override // defpackage.awu
    public final void a(int i) {
        this.c.cancel(i);
    }

    @Override // defpackage.awu
    public final void b(int i, Notification notification) {
        this.c.notify(i, notification);
    }

    @Override // defpackage.awu
    public final void c(int i, int i2, Notification notification) {
        if (Build.VERSION.SDK_INT >= 31) {
            aww.a(this, i, notification, i2);
        } else if (Build.VERSION.SDK_INT >= 29) {
            startForeground(i, notification, i2);
        } else {
            startForeground(i, notification);
        }
    }

    @Override // defpackage.awu
    public final void d(int i) {
        this.d = true;
        asq.a();
        stopForeground(true);
        stopSelf(i);
    }

    @Override // defpackage.aeu, android.app.Service
    public final void onCreate() {
        super.onCreate();
        e();
    }

    @Override // defpackage.aeu, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.b.c();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.d) {
            asq.a();
            this.b.c();
            e();
            this.d = false;
        }
        if (intent == null) {
            return 3;
        }
        awv awvVar = this.b;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            asq.a();
            Objects.toString(intent);
            intent.toString();
            awvVar.i.r(new avl(awvVar, intent.getStringExtra("KEY_WORKSPEC_ID"), 4));
            awvVar.b(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            awvVar.b(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            asq.a();
            awu awuVar = awvVar.h;
            if (awuVar == null) {
                return 3;
            }
            awuVar.d(i2);
            return 3;
        }
        asq.a();
        Objects.toString(intent);
        intent.toString();
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        aei.g(UUID.fromString(stringExtra), awvVar.b);
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.b.d(i, 2048);
    }

    public final void onTimeout(int i, int i2) {
        this.b.d(i, i2);
    }
}
