package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class bh extends bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f13545a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f13546b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f13547c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f13548d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f13549e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bh(bn bnVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i4) {
        super(bnVar, taskCompletionSource);
        this.f13549e = bnVar;
        this.f13545a = bundle;
        this.f13546b = activity;
        this.f13547c = taskCompletionSource2;
        this.f13548d = i4;
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
        com.google.android.play.integrity.internal.s sVar;
        at atVar;
        if (bn.k(this.f13549e)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f13549e;
            com.google.android.play.integrity.internal.ae aeVar = bnVar.f13559a;
            com.google.android.play.integrity.internal.i iVar = (com.google.android.play.integrity.internal.i) aeVar.e();
            Bundle bundle = this.f13545a;
            atVar = bnVar.f13563e;
            iVar.c(bundle, atVar.a(this.f13546b, this.f13547c, aeVar));
        } catch (RemoteException e4) {
            bn bnVar2 = this.f13549e;
            int i4 = this.f13548d;
            sVar = bnVar2.f13560b;
            sVar.c(e4, "requestAndShowDialog(%s)", Integer.valueOf(i4));
            this.f13547c.trySetException(new StandardIntegrityException(-100, e4));
        }
    }
}
