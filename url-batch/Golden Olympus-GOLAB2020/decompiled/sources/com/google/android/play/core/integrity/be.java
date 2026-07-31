package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class be extends com.google.android.play.integrity.internal.t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f13535a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f13536b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    be(bn bnVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f13536b = bnVar;
        this.f13535a = context;
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
        TaskCompletionSource taskCompletionSource;
        Context context = this.f13535a;
        taskCompletionSource = this.f13536b.f13562d;
        taskCompletionSource.trySetResult(Integer.valueOf(com.google.android.play.integrity.internal.ai.a(context)));
    }
}
