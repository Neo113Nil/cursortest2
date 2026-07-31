package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class ag extends com.google.android.play.integrity.internal.t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f13487a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f13488b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f13489c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f13490d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ aj f13491e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(aj ajVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i4) {
        super(taskCompletionSource);
        this.f13491e = ajVar;
        this.f13487a = bundle;
        this.f13488b = activity;
        this.f13489c = taskCompletionSource2;
        this.f13490d = i4;
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
        com.google.android.play.integrity.internal.s sVar;
        at atVar;
        try {
            com.google.android.play.integrity.internal.n nVar = (com.google.android.play.integrity.internal.n) this.f13491e.f13496a.e();
            Bundle bundle = this.f13487a;
            aj ajVar = this.f13491e;
            atVar = ajVar.f13499d;
            nVar.c(bundle, atVar.a(this.f13488b, this.f13489c, ajVar.f13496a));
        } catch (RemoteException e4) {
            aj ajVar2 = this.f13491e;
            int i4 = this.f13490d;
            sVar = ajVar2.f13497b;
            sVar.c(e4, "requestAndShowDialog(%s)", Integer.valueOf(i4));
            this.f13489c.trySetException(new IntegrityServiceException(-100, e4));
        }
    }
}
