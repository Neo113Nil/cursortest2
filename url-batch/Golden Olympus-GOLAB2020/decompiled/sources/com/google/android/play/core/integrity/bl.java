package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class bl extends bi {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f13556c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f13557d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bl(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(bnVar, taskCompletionSource);
        this.f13556c = bnVar;
        this.f13557d = new com.google.android.play.integrity.internal.s("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.bi, com.google.android.play.integrity.internal.k
    public final void e(Bundle bundle) {
        k kVar;
        super.e(bundle);
        this.f13557d.d("onWarmUpExpressIntegrityToken", new Object[0]);
        kVar = this.f13556c.f13564f;
        ApiException a4 = kVar.a(bundle);
        if (a4 != null) {
            this.f13550a.trySetException(a4);
        } else {
            this.f13550a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
