package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
class bi extends com.google.android.play.integrity.internal.j {

    /* renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f13550a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f13551b;

    bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        this.f13551b = bnVar;
        this.f13550a = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.k
    public final void b(Bundle bundle) {
        this.f13551b.f13559a.v(this.f13550a);
    }

    @Override // com.google.android.play.integrity.internal.k
    public void c(Bundle bundle) {
        this.f13551b.f13559a.v(this.f13550a);
    }

    @Override // com.google.android.play.integrity.internal.k
    public final void d(Bundle bundle) {
        this.f13551b.f13559a.v(this.f13550a);
    }

    @Override // com.google.android.play.integrity.internal.k
    public void e(Bundle bundle) {
        this.f13551b.f13559a.v(this.f13550a);
    }
}
