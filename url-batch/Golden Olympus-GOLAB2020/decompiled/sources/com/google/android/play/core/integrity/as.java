package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* loaded from: classes.dex */
final class as extends com.google.android.play.integrity.internal.q {

    /* renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f13514a;

    /* renamed from: b, reason: collision with root package name */
    final com.google.android.play.integrity.internal.ae f13515b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f13516c = new com.google.android.play.integrity.internal.s("RequestDialogCallbackImpl");

    /* renamed from: d, reason: collision with root package name */
    private final String f13517d;

    /* renamed from: e, reason: collision with root package name */
    private final k f13518e;

    /* renamed from: f, reason: collision with root package name */
    private final Activity f13519f;

    as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, com.google.android.play.integrity.internal.ae aeVar) {
        this.f13517d = context.getPackageName();
        this.f13518e = kVar;
        this.f13514a = taskCompletionSource;
        this.f13519f = activity;
        this.f13515b = aeVar;
    }

    @Override // com.google.android.play.integrity.internal.r
    public final void b(Bundle bundle) {
        this.f13515b.v(this.f13514a);
        this.f13516c.d("onRequestDialog(%s)", this.f13517d);
        ApiException a4 = this.f13518e.a(bundle);
        if (a4 != null) {
            this.f13514a.trySetException(a4);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            this.f13516c.b("onRequestDialog(%s): got null dialog intent", this.f13517d);
            this.f13514a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f13519f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new ar(this, this.f13515b.c()));
        this.f13516c.a("Starting dialog intent...", new Object[0]);
        this.f13519f.startActivityForResult(intent, 0);
    }
}
