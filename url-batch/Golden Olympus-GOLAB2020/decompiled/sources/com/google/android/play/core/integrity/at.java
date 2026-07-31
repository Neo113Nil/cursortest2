package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class at {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f13520a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f13521b;

    at(com.google.android.play.integrity.internal.an anVar, com.google.android.play.integrity.internal.an anVar2) {
        this.f13520a = anVar;
        this.f13521b = anVar2;
    }

    final as a(Activity activity, TaskCompletionSource taskCompletionSource, com.google.android.play.integrity.internal.ae aeVar) {
        Object a4 = this.f13520a.a();
        a4.getClass();
        k kVar = (k) this.f13521b.a();
        kVar.getClass();
        activity.getClass();
        aeVar.getClass();
        return new as((Context) a4, kVar, activity, taskCompletionSource, aeVar);
    }
}
