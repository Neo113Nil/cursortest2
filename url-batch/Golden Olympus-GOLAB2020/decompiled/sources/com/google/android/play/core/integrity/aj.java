package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class aj {

    /* renamed from: a, reason: collision with root package name */
    final com.google.android.play.integrity.internal.ae f13496a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f13497b;

    /* renamed from: c, reason: collision with root package name */
    private final String f13498c;

    /* renamed from: d, reason: collision with root package name */
    private final at f13499d;

    /* renamed from: e, reason: collision with root package name */
    private final k f13500e;

    aj(Context context, com.google.android.play.integrity.internal.s sVar, at atVar, k kVar) {
        this.f13498c = context.getPackageName();
        this.f13497b = sVar;
        this.f13499d = atVar;
        this.f13500e = kVar;
        if (com.google.android.play.integrity.internal.ai.b(context)) {
            this.f13496a = new com.google.android.play.integrity.internal.ae(context, sVar, "IntegrityService", ak.f13501a, new com.google.android.play.integrity.internal.z() { // from class: com.google.android.play.core.integrity.ae
                @Override // com.google.android.play.integrity.internal.z
                public final Object a(IBinder iBinder) {
                    return com.google.android.play.integrity.internal.m.b(iBinder);
                }
            }, null);
        } else {
            sVar.b("Phonesky is not installed.", new Object[0]);
            this.f13496a = null;
        }
    }

    static /* bridge */ /* synthetic */ Bundle a(aj ajVar, byte[] bArr, Long l4, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", ajVar.f13498c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l4 != null) {
            bundle.putLong("cloud.prj", l4.longValue());
        }
        ArrayList arrayList = new ArrayList();
        com.google.android.play.integrity.internal.d.b(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(com.google.android.play.integrity.internal.d.a(arrayList)));
        return bundle;
    }

    final Task b(Activity activity, Bundle bundle) {
        if (this.f13496a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i4 = bundle.getInt("dialog.intent.type");
        this.f13497b.d("requestAndShowDialog(%s, %s)", this.f13498c, Integer.valueOf(i4));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f13496a.t(new ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i4), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f13496a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] decode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long cloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            if (integrityTokenRequest instanceof ao) {
            }
            this.f13497b.d("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f13496a.t(new af(this, taskCompletionSource, decode, cloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e4) {
            return Tasks.forException(new IntegrityServiceException(-13, e4));
        }
    }
}
