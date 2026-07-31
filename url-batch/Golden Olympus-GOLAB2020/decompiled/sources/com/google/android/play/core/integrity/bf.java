package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class bf extends bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f13537a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f13538b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f13539c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bf(bn bnVar, TaskCompletionSource taskCompletionSource, int i4, long j4, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f13539c = bnVar;
        this.f13537a = j4;
        this.f13538b = taskCompletionSource2;
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
        com.google.android.play.integrity.internal.s sVar;
        if (bn.k(this.f13539c)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f13539c;
            ((com.google.android.play.integrity.internal.i) bnVar.f13559a.e()).e(bn.b(bnVar, this.f13537a, 0), new bl(this.f13539c, this.f13538b));
        } catch (RemoteException e4) {
            bn bnVar2 = this.f13539c;
            long j4 = this.f13537a;
            sVar = bnVar2.f13560b;
            sVar.c(e4, "warmUpIntegrityToken(%s)", Long.valueOf(j4));
            this.f13538b.trySetException(new StandardIntegrityException(-100, e4));
        }
    }
}
