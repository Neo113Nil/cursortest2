package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class ai extends com.google.android.play.integrity.internal.o {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aj f13493a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f13494b = new com.google.android.play.integrity.internal.s("OnRequestIntegrityTokenCallback");

    /* renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f13495c;

    ai(aj ajVar, TaskCompletionSource taskCompletionSource) {
        this.f13493a = ajVar;
        this.f13495c = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.p
    public final void b(Bundle bundle) {
        k kVar;
        String str;
        this.f13493a.f13496a.v(this.f13495c);
        this.f13494b.d("onRequestIntegrityToken", new Object[0]);
        kVar = this.f13493a.f13500e;
        ApiException a4 = kVar.a(bundle);
        if (a4 != null) {
            this.f13495c.trySetException(a4);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f13495c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        long j4 = bundle.getLong("request.token.sid");
        str = this.f13493a.f13498c;
        ah ahVar = new ah(this, str, j4);
        TaskCompletionSource taskCompletionSource = this.f13495c;
        a aVar = new a();
        aVar.b(string);
        aVar.a(ahVar);
        taskCompletionSource.trySetResult(aVar.c());
    }
}
