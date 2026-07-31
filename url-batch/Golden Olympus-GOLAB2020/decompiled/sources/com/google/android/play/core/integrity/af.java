package com.google.android.play.core.integrity;

import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class af extends com.google.android.play.integrity.internal.t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f13482a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Long f13483b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f13484c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ IntegrityTokenRequest f13485d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ aj f13486e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    af(aj ajVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l4, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f13486e = ajVar;
        this.f13482a = bArr;
        this.f13483b = l4;
        this.f13484c = taskCompletionSource2;
        this.f13485d = integrityTokenRequest;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void a(Exception exc) {
        if (exc instanceof com.google.android.play.integrity.internal.af) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
        com.google.android.play.integrity.internal.s sVar;
        try {
            ((com.google.android.play.integrity.internal.n) this.f13486e.f13496a.e()).d(aj.a(this.f13486e, this.f13482a, this.f13483b, null), new ai(this.f13486e, this.f13484c));
        } catch (RemoteException e4) {
            aj ajVar = this.f13486e;
            IntegrityTokenRequest integrityTokenRequest = this.f13485d;
            sVar = ajVar.f13497b;
            sVar.c(e4, "requestIntegrityToken(%s)", integrityTokenRequest);
            this.f13484c.trySetException(new IntegrityServiceException(-100, e4));
        }
    }
}
