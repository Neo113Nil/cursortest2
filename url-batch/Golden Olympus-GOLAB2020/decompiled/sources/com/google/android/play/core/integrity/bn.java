package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class bn {

    /* renamed from: a, reason: collision with root package name */
    final com.google.android.play.integrity.internal.ae f13559a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f13560b;

    /* renamed from: c, reason: collision with root package name */
    private final String f13561c;

    /* renamed from: d, reason: collision with root package name */
    private final TaskCompletionSource f13562d;

    /* renamed from: e, reason: collision with root package name */
    private final at f13563e;

    /* renamed from: f, reason: collision with root package name */
    private final k f13564f;

    bn(Context context, com.google.android.play.integrity.internal.s sVar, at atVar, k kVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f13562d = taskCompletionSource;
        this.f13561c = context.getPackageName();
        this.f13560b = sVar;
        this.f13563e = atVar;
        this.f13564f = kVar;
        com.google.android.play.integrity.internal.ae aeVar = new com.google.android.play.integrity.internal.ae(context, sVar, "ExpressIntegrityService", bo.f13565a, new com.google.android.play.integrity.internal.z() { // from class: com.google.android.play.core.integrity.bd
            @Override // com.google.android.play.integrity.internal.z
            public final Object a(IBinder iBinder) {
                return com.google.android.play.integrity.internal.h.b(iBinder);
            }
        }, null);
        this.f13559a = aeVar;
        aeVar.c().post(new be(this, taskCompletionSource, context));
    }

    static /* bridge */ /* synthetic */ Bundle a(bn bnVar, String str, long j4, long j5, int i4) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f13561c);
        bundle.putLong("cloud.prj", j4);
        bundle.putString("nonce", str);
        bundle.putLong("warm.up.sid", j5);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        com.google.android.play.integrity.internal.d.b(5, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(com.google.android.play.integrity.internal.d.a(arrayList)));
        return bundle;
    }

    static /* bridge */ /* synthetic */ Bundle b(bn bnVar, long j4, int i4) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f13561c);
        bundle.putLong("cloud.prj", j4);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        com.google.android.play.integrity.internal.d.b(4, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(com.google.android.play.integrity.internal.d.a(arrayList)));
        return bundle;
    }

    static /* bridge */ /* synthetic */ boolean k(bn bnVar) {
        return bnVar.f13562d.getTask().isSuccessful() && ((Integer) bnVar.f13562d.getTask().getResult()).intValue() == 0;
    }

    final Task c(Activity activity, Bundle bundle) {
        int i4 = bundle.getInt("dialog.intent.type");
        this.f13560b.d("requestAndShowDialog(%s)", Integer.valueOf(i4));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f13559a.t(new bh(this, taskCompletionSource, bundle, activity, taskCompletionSource, i4), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task d(String str, long j4, long j5, int i4) {
        this.f13560b.d("requestExpressIntegrityToken(%s)", Long.valueOf(j5));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f13559a.t(new bg(this, taskCompletionSource, 0, str, j4, j5, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task e(long j4, int i4) {
        this.f13560b.d("warmUpIntegrityToken(%s)", Long.valueOf(j4));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f13559a.t(new bf(this, taskCompletionSource, 0, j4, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
