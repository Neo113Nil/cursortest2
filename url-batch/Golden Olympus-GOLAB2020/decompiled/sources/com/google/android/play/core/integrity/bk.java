package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class bk extends bi {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f13553c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f13554d;

    /* renamed from: e, reason: collision with root package name */
    private final long f13555e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bk(bn bnVar, TaskCompletionSource taskCompletionSource, long j4) {
        super(bnVar, taskCompletionSource);
        this.f13553c = bnVar;
        this.f13554d = new com.google.android.play.integrity.internal.s("OnRequestIntegrityTokenCallback");
        this.f13555e = j4;
    }

    @Override // com.google.android.play.core.integrity.bi, com.google.android.play.integrity.internal.k
    public final void c(Bundle bundle) {
        k kVar;
        String str;
        super.c(bundle);
        this.f13554d.d("onRequestExpressIntegrityToken", new Object[0]);
        kVar = this.f13553c.f13564f;
        ApiException a4 = kVar.a(bundle);
        if (a4 != null) {
            this.f13550a.trySetException(a4);
            return;
        }
        long j4 = bundle.getLong("request.token.sid");
        str = this.f13553c.f13561c;
        bj bjVar = new bj(this, str, j4);
        TaskCompletionSource taskCompletionSource = this.f13550a;
        b bVar = new b();
        bVar.b(bundle.getString("token"));
        bVar.a(bjVar);
        taskCompletionSource.trySetResult(bVar.c());
    }
}
