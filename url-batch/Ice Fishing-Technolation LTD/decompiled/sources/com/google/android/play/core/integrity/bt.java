package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
/* loaded from: classes2.dex */
final class bt {

    /* renamed from: a, reason: collision with root package name */
    private final bn f46a;

    bt(bn bnVar) {
        this.f46a = bnVar;
    }

    final /* synthetic */ Task a(long j, long j2, int i, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
        return this.f46a.d(standardIntegrityTokenRequest.a(), j, j2, 0);
    }
}
