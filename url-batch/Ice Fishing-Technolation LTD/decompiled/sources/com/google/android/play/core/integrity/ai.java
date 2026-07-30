package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
/* loaded from: classes2.dex */
final class ai extends com.google.android.play.integrity.internal.o {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aj f17a;
    private final com.google.android.play.integrity.internal.s b = new com.google.android.play.integrity.internal.s("OnRequestIntegrityTokenCallback");
    private final TaskCompletionSource c;

    ai(aj ajVar, TaskCompletionSource taskCompletionSource) {
        this.f17a = ajVar;
        this.c = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.p
    public final void b(Bundle bundle) {
        k kVar;
        String str;
        this.f17a.f18a.v(this.c);
        this.b.d("onRequestIntegrityToken", new Object[0]);
        kVar = this.f17a.e;
        ApiException a2 = kVar.a(bundle);
        if (a2 != null) {
            this.c.trySetException(a2);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        long j = bundle.getLong("request.token.sid");
        str = this.f17a.c;
        ah ahVar = new ah(this, str, j);
        TaskCompletionSource taskCompletionSource = this.c;
        a aVar = new a();
        aVar.b(string);
        aVar.a(ahVar);
        taskCompletionSource.trySetResult(aVar.c());
    }
}
