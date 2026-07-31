package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: classes.dex */
final class bt {

    /* renamed from: a, reason: collision with root package name */
    private final bn f13575a;

    bt(bn bnVar) {
        this.f13575a = bnVar;
    }

    final /* synthetic */ Task a(long j4, long j5, int i4, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
        return this.f13575a.d(standardIntegrityTokenRequest.a(), j4, j5, 0);
    }
}
