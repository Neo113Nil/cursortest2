package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
/* loaded from: classes2.dex */
final class be extends com.google.android.play.integrity.internal.t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f35a;
    final /* synthetic */ bn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    be(bn bnVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.b = bnVar;
        this.f35a = context;
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
        TaskCompletionSource taskCompletionSource;
        Context context = this.f35a;
        taskCompletionSource = this.b.d;
        taskCompletionSource.trySetResult(Integer.valueOf(com.google.android.play.integrity.internal.ai.a(context)));
    }
}
