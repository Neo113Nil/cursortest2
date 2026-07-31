package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* loaded from: classes.dex */
abstract class y {

    /* renamed from: b, reason: collision with root package name */
    private final String f13604b;

    /* renamed from: c, reason: collision with root package name */
    private final long f13605c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f13607e;

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f13603a = new com.google.android.play.integrity.internal.s("IntegrityDialogWrapper");

    /* renamed from: d, reason: collision with root package name */
    private final Object f13606d = new Object();

    y(String str, long j4) {
        this.f13604b = str;
        this.f13605c = j4;
    }

    public final Task a(Activity activity, int i4) {
        synchronized (this.f13606d) {
            try {
                if (this.f13607e) {
                    return Tasks.forResult(0);
                }
                this.f13607e = true;
                this.f13603a.a("checkAndShowDialog(%s)", Integer.valueOf(i4));
                Bundle bundle = new Bundle();
                bundle.putInt("dialog.intent.type", i4);
                bundle.putString("package.name", this.f13604b);
                bundle.putInt("playcore.integrity.version.major", 1);
                bundle.putInt("playcore.integrity.version.minor", 3);
                bundle.putInt("playcore.integrity.version.patch", 0);
                bundle.putLong("request.token.sid", this.f13605c);
                return b(activity, bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    abstract Task b(Activity activity, Bundle bundle);
}
