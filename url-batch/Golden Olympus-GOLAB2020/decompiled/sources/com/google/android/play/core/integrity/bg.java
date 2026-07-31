package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class bg extends bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f13540a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f13541b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f13542c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f13543d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f13544e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bg(bn bnVar, TaskCompletionSource taskCompletionSource, int i4, String str, long j4, long j5, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f13544e = bnVar;
        this.f13540a = str;
        this.f13541b = j4;
        this.f13542c = j5;
        this.f13543d = taskCompletionSource2;
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
        com.google.android.play.integrity.internal.s sVar;
        if (bn.k(this.f13544e)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f13544e;
            ((com.google.android.play.integrity.internal.i) bnVar.f13559a.e()).d(bn.a(bnVar, this.f13540a, this.f13541b, this.f13542c, 0), new bk(this.f13544e, this.f13543d, this.f13541b));
        } catch (RemoteException e4) {
            bn bnVar2 = this.f13544e;
            String str = this.f13540a;
            sVar = bnVar2.f13560b;
            sVar.c(e4, "requestExpressIntegrityToken(%s, %s)", str, Long.valueOf(this.f13541b));
            this.f13543d.trySetException(new StandardIntegrityException(-100, e4));
        }
    }
}
